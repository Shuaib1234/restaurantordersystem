/*
IRepository.java
Author Demi Alexis Farquhar (220322104)
Date: 31 March 2022
 */

package za.ac.cput.repository;

public interface IRepository <T,ID>{
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
