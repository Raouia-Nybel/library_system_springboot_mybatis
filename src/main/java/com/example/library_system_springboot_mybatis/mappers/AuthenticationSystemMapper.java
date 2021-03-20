package com.example.library_system_springboot_mybatis.mappers;

import com.example.library_system_springboot_mybatis.model.AuthentificationSystem;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface AuthenticationSystemMapper {
    final String selectAll="SELECT * FROM authentification_system";
    final String insertUser="INSERT INTO authentification_system (LoginID, Password) VALUES (#{loginID},#{password})";
    final String deleteUser="DELETE FROM authentification_system WHERE {LoginID}=#{loginID}";
    final String updateUser="UPDATE authentification_system " +
            "SET Password=#{password} " +
            "WHERE LoginID=#{loginID}";
    @Select(selectAll)
    List<AuthentificationSystem> findAll();
    @Insert(insertUser)
    void insertUser(AuthentificationSystem authentificationSystem);
    @Delete(deleteUser)
    void deleteUser(AuthentificationSystem authentificationSystem);
    @Update(updateUser)
    void updateUser(AuthentificationSystem authentificationSystem);
}
