package com.example.AlticeLabs.labsequencexercise.service;

import com.example.AlticeLabs.labsequencexercise.service.LabService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LabServiceTest {

    @Autowired
    private LabService labSeqService;

    @Test
    public void testCalculateLabSeq() {
        // Test cases for the LabSeq sequence
        assertEquals(0, labSeqService.calculateLabSeq(0));
        assertEquals(1, labSeqService.calculateLabSeq(1));
        assertEquals(0, labSeqService.calculateLabSeq(2));
        assertEquals(1, labSeqService.calculateLabSeq(3));
        assertEquals(1, labSeqService.calculateLabSeq(4));
        assertEquals(1, labSeqService.calculateLabSeq(5));
        assertEquals(1, labSeqService.calculateLabSeq(6));
        assertEquals(2, labSeqService.calculateLabSeq(7));
        // Add more test cases as needed
    }
}


