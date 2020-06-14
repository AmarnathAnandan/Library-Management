package com.library.management.libmgnt.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController; 

@RestController  
public class LibMgntController   
{  
@RequestMapping("/")  
public String index()   
{  
return "Hello Sample";  
}  
}  