package com.cyy.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cyy.springboot.jpa.dao.PersonRepository;
import com.cyy.springboot.jpa.support.CustomRepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class JpaApplication {
	@Autowired
	PersonRepository personRepository;
	
	
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
        
    }
    
 
}
