package com.example.library_system_springboot_mybatis.mappers;

import com.example.library_system_springboot_mybatis.model.Items;
import com.example.library_system_springboot_mybatis.model.Librarian;
import com.example.library_system_springboot_mybatis.model.Member;
import com.example.library_system_springboot_mybatis.model.Reservations;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LibrarianMapper {
    //LIBRARIAN
    final String selectAll="SELECT * FROM librarian";
    final String insertLibrarian="INSERT INTO librarian (AdminID, Password, FirstName, LastName, Address, PhoneNo) VALUES (#{adminID}, #{password}, #{firstName}, #{lastName}, #{address}, #{phoneNo})";
    final String deleteLibrarian="DELETE FROM librarian WHERE AdminID=#{adminID}";
    final String updateLibrarian="UPDATE librarian " +
            "SET Password=#{password}, FirstName=#{firstName}, LastName=#{lastName}, Address=#{address}, PhoneNo=#{phoneNo}" +
            "WHERE AdminID=#{adminID}";

    //ITEMS
    final String insertItem="INSERT INTO items (ISBN, AuthNo, Title, Edition, Category, Price) VALUES (#{ISBN}, #{authNo}, #{title}, #{edition}, #{category}, #{price})";
    final String deleteItem="DELETE FROM items WHERE ISBN=#{ISBN}";
    final String updateItem="UPDATE items " +
            "SET AuthNo=#{authNo}, Title=#{title}, Edition=#{edition}, Category=#{category}, Price=#{price}" +
            "WHERE ISBN=#{ISBN}";
    final String selectAllItems="SELECT * FROM items";

    //MEMBERS
    final String selectAllMembers="SELECT * FROM member";
    final String insertMember="INSERT INTO member (UserID, Password, Address, FirstName, LastName, PhoneNo, Profession) VALUES (#{userID}, #{password}, #{address}, #{firstName}, #{lastName}, #{phoneNo}, #{profession})";
    final String deleteMember="DELETE FROM member WHERE UserID=#{userID}";
    final String updateMember="UPDATE member " +
            "SET Password=#{password}, Address=#{address}, FirstName=#{firstName}, LastName=#{lastName}, PhoneNo=#{phoneNo}, Profession=#{profession}" +
            "WHERE UserID=#{userID}";

    //Reservations
    final String selectAllReservations="SELECT * FROM reservations";


    //Librarians
    @Select(selectAll)
    List<Librarian> findAllLibrarians();
    @Insert(insertLibrarian)
   // @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "adminID",before = false,resultType = Integer.class)
    void insertLibrarian(Librarian librarian);
    @Update(updateLibrarian)
    void updateLibrarian(Librarian librarian);
    @Delete(deleteLibrarian)
    void deleteLibrarian(Librarian librarian);

    //Items
    @Select(selectAllItems)
    List<Items> findAllItems();
    @Insert(insertItem)
    void insertItem(Items items);
    @Update(updateItem)
    void updateItem(Items items);
    @Delete(deleteItem)
    void deleteItem(Items items);

    //Members
    @Select(selectAllMembers)
    List<Member> findAllMembers();
    @Insert(insertMember)
    void insertMember(Member member);
    @Update(updateMember)
    void updateMember(Member member);
    @Delete(deleteMember)
    void deleteMember(Member member);

    //Reservations
    @Select(selectAllReservations)
    List<Reservations> findAllReservations();

}
