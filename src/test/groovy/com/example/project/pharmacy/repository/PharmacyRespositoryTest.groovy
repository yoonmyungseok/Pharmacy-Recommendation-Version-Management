package com.example.project.pharmacy.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class PharmacyRespositoryTest extends Specification {
    @Autowired
    private PharmacyRespository pharmacyRespository;

    def "test"(){

    }
}
