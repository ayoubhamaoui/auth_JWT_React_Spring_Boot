package com.example.demo.controller;

import com.example.demo.entity.CubeInvoiceImpaye;
import com.example.demo.service.CIIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cii")
@CrossOrigin(origins = "http://localhost:3000")
public class CIIController {
    @Autowired
    CIIService ciiService;

    @RequestMapping(value = "/all", method = RequestMethod.POST)
    public List<CubeInvoiceImpaye> getAllCii() {
        return ciiService.getAllCii();
    }

    @RequestMapping(value = "/addcii", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public CubeInvoiceImpaye addNewCii(@RequestBody CubeInvoiceImpaye cii) {
        return this.ciiService.addCii(cii);
    }
}
