package com.example.AlticeLabs.labsequencexercise.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class LabService {

    @Cacheable("labSeq")
    public long calculateLabSeq(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 0;
        if (n == 3) return 1;

        return calculateLabSeq(n - 4) + calculateLabSeq(n - 3);
    }
}

