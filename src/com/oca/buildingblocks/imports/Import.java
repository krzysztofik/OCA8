package com.oca.buildingblocks.imports;

//if you import concrete classes Date from both package code will not compile
import java.sql.*;
import java.util.Date;


public class Import {

    public static void main(String[] args) {

        //Concrete import takes precedence over wildcard import
        Date dateFromUtil = new Date();
	    System.out.println(dateFromUtil);

        // In case of using two classes with same name from different packages, one of them need to be referenced using full qualified name
        java.sql.Date dateFromSql = new java.sql.Date(666666666);
        System.out.println(dateFromSql);
    }
}
