package org.wecancodeit.librarydemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.librarydemo.repositories.AuthorRepository;
import org.wecancodeit.librarydemo.repositories.BookRepository;
import org.wecancodeit.librarydemo.repositories.CampusRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @MockBean
    private CampusRepository campusRepo;
    @MockBean
    private BookRepository bookRepo;
    @MockBean
    private AuthorRepository authorRepo;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void CampusesShouldBeOkAndReturnCampusesViewWithCampusesModelAttribute () throws Exception {
        mockMvc.perform(get("/campuses"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("campusesView"))
                .andExpect(model().attributeExists("campuses"));
    }
    @Test
    public void BooksShouldBeOkAndReturnBooksViewWithBooksModelAttribute () throws Exception {
        mockMvc.perform(get("/books"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("booksView"))
                .andExpect(model().attributeExists("books"));
    }
    @Test
    public void AuthorsShouldBeOkAndReturnAuthorsViewWithAuthorsModelAttribute () throws Exception {
        mockMvc.perform(get("/authors"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("authorsView"))
                .andExpect(model().attributeExists("authors"));
    }
}



