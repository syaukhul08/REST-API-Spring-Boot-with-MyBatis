package com.example.amde.eterno.mapper;

import com.example.amde.eterno.model.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("SELECT * FROM Category")
    List<Category> findAll();

    @Select("SELECT * FROM Category WHERE id = #{id}")
    Category findById(@Param("id") int id);

    @Select("SELECT * FROM Category WHERE name = #{name}")
    Category findByName(@Param("name") String name);

    @Delete("DELETE FROM Category WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO Category(id, name, status) VALUES (#{id}, #{name}, #{status})")
    int save(Category item);

    @Update("UPDATE Category SET name=#{name}, status=#{status} WHERE id=#{id}")
    int update(Category item);
}
