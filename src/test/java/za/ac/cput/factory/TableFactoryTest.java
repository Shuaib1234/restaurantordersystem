/*
TableFactoryTest.java
Author Demi Alexis Farquhar (220322104)
Date: 1 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Restaurant;
import za.ac.cput.entity.Table;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class TableFactoryTest {
    @Test
    void a_CreateTable(){
        Table table= TableFactory.createTable("01A",1,5,true);
        assertNotNull(table);
        System.out.println(table);
        System.out.println("Table Details added..");
        System.out.println();
    }
    @Test
    //create new table with missing values and test fails
    void b_CreateNewTable()  {
        Table table = new Table.Builder()
                .setTableId("02A")
                .setTableNo(5)
                .build();
        assertNotNull(table);
        System.out.println(table);
        System.out.println("Table added...");
    }
    @Test
    void c_showTableDetails(){
        //Show Restaurant details
        Table table = TableFactory.createTable("101A",1,5,true);
        System.out.println(table);
        assertNotNull(table);
    }




}