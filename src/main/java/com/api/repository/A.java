package com.api.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A extends RuntimeException{
    A(String msg){
        super(msg);
    }
}
class voting{
    public static void main(String[] args){
        int age =16;
        if(age<18){
            throw new A("not eligible");
        }
        else{
            System.out.println("vote success");
        }
    }
}
