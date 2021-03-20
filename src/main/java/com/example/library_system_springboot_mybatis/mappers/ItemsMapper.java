package com.example.library_system_springboot_mybatis.mappers;

import com.example.library_system_springboot_mybatis.model.Items;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ItemsMapper {
    /*final String selectAll="SELECT * FROM items";
    final String insertItem="INSERT INTO items (ISBN, AuthNo, Title, Edition, Category, Price) VALUES (#{ISBN}, #{authNo}, #{title}, #{edition}, #{category}, #{price})";
    final String deleteItem="DELETE FROM items WHERE ISBN=#{ISBN}";
    final String updateItem="UPDATE items " +
            "SET AuthNo=#{authNo}, Title=#{title}, Edition=#{edition}, Category=#{category}, Price=#{price}" +
            "WHERE ISBN=#{ISBN}";


    @Select(selectAll)
    List<Items> findAll();
    @Insert(insertItem)
   // @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "ISBN",before = false,resultType = Integer.class)
    void insert(Items items);
    @Update(updateItem)
    void update(Items items);
    @Delete(deleteItem)
    void delete(Items items);*/
}
