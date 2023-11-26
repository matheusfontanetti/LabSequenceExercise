package com.example.AlticeLabs.labsequencexercise.controller;

import com.example.AlticeLabs.labsequencexercise.service.LabService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = LabController.class)
@AutoConfigureMockMvc
public class LabControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LabService labService;

    @Test
    public void testGetLabSeqValue() throws Exception {
        int input = 5;
        long expectedResult = 42; // Adjust the expected value as needed

        // Mocking the LabService to return a specific value for any input
        when(labService.calculateLabSeq(anyInt())).thenReturn(expectedResult);

        mockMvc.perform(MockMvcRequestBuilders.get("/labseq/{n}", input))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$").value(expectedResult));
    }
}
