package com.example.AlticeLabs.labsequencexercise.controller;

import com.example.AlticeLabs.labsequencexercise.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labseq")
public class LabController {

    @Autowired
    private LabService labSeqService;

    /**
     * call the service to calculate the labSeq
     * @param n
     * @return labservice.calculateLabSeq
     */
    @GetMapping("/{n}")
    public long getLabSeqValue(@PathVariable int n) {
        return labSeqService.calculateLabSeq(n);
    }
}

