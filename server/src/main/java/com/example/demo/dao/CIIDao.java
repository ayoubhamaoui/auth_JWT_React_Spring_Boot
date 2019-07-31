package com.example.demo.dao;

import com.example.demo.entity.CubeInvoiceImpaye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CIIDao extends JpaRepository<CubeInvoiceImpaye, Integer> {

}
