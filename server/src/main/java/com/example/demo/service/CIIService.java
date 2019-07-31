package com.example.demo.service;

import com.example.demo.dao.CIIDao;
import com.example.demo.entity.CubeInvoiceImpaye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CIIService {
    @Autowired
    CIIDao ciiDao;

    @Secured("ROLE_ADMIN")
    public List<CubeInvoiceImpaye> getAllCii() {
        return this.ciiDao.findAll();
    }

    public CubeInvoiceImpaye addCii(CubeInvoiceImpaye cii) {
        return this.ciiDao.save(cii);
    }

    //other methods to add
}
