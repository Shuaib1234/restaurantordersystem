/*
TableFactoryTest.java
Author Demi Alexis Farquhar (220322104)
Date: 1 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Table;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TableFactoryTest {
    @Test
    void a_createTable(){
        Table table= TableFactory.createTable("01A",1,5,true);
        assertNotNull(table);
        System.out.println(table);
        System.out.println("Table Details added..");
        System.out.println();
    }
    @Test
    //create new table with missing values
    void b_createNewTable()  {
        Table table = new Table.Builder()
                .setTableId("02A")
                .setTableNo(5)
                .build();

        assertNotNull(table);
        Table table1=null;
        assertNull(table1);

        System.out.println("Table added...");
    }
    @Test
    void c_showTableDetails(){
        //Show Table details
        Table showTable = TableFactory.createTable("101A",1,5,true);
        System.out.println(showTable.toString());
        assertNotNull(showTable);
    }
    }

    