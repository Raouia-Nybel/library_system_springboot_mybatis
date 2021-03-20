package com.example.library_system_springboot_mybatis;

import com.example.library_system_springboot_mybatis.mappers.ItemsMapper;
import com.example.library_system_springboot_mybatis.model.AuthentificationSystem;
import com.example.library_system_springboot_mybatis.model.Items;
import com.example.library_system_springboot_mybatis.model.Librarian;
import com.example.library_system_springboot_mybatis.resource.ItemsResource;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@MappedTypes({Items.class,Librarian.class})
@SpringBootApplication
@MapperScan("com.example.library_system_springboot_mybatis.mappers")
public class LibrarySystemSpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarySystemSpringbootMybatisApplication.class, args);

	}

}
