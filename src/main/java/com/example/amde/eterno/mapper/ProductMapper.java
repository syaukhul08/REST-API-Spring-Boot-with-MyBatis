package com.example.amde.eterno.mapper;

import com.example.amde.eterno.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM Product")
    List<Product> findAll();

    @Select("SELECT * FROM Product WHERE id = #{id}")
    Product findById(@Param("id") int id);

    @Select("SELECT * FROM Product WHERE name = #{name}")
    Product findByName(@Param("name") String name);

    @Delete("DELETE FROM Product WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO Product(id, name, category, stock) VALUES (#{id}, #{name}, #{category}, #{stock})")
    int save(Product item);

    @Update("UPDATE Product SET name=#{name}, category=#{category}, stock=#{stock} WHERE id=#{id}")
    int update(Product item);
}
