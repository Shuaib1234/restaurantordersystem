/*
IRepository.java
Author
Date: 1 April 2022
 */

package za.ac.cput.repository;
//don't add any code here

public interface IRepository <T,ID>{
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
