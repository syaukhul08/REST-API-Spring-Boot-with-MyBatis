package com.example.amde.eterno.mapper;

import com.example.amde.eterno.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

        @Select("SELECT * FROM Product")
        @Results({
                @Result(property = "categoryId", column = "category_id"),
                @Result(property = "category.id", column = "category_id"),
                @Result(property = "category.name", column = "category_name")
        })
        List<Product> findAll();

        @Select("SELECT * FROM Product WHERE id = #{id}")
        @Results({
                @Result(property = "categoryId", column = "category_id"),
                @Result(property = "category.id", column = "category_id"),
                @Result(property = "category.name", column = "category_name")
        })
        Product findById(@Param("id") int id);

        @Select("SELECT * FROM Product WHERE name = #{name}")
        @Results({
                @Result(property = "categoryId", column = "category_id"),
                @Result(property = "category.id", column = "category_id"),
                @Result(property = "category.name", column = "category_name")
        })
        Product findByName(@Param("name") String name);

        @Delete("DELETE FROM Product WHERE id = #{id}")
        int deleteById(@Param("id") int id);

        @Insert("INSERT INTO Product(id, name, category_id, stock) VALUES (#{id}, #{name}, #{categoryId}, #{stock})")
        int save(Product item);

        @Update("UPDATE Product SET name=#{name}, category_id=#{categoryId}, stock=#{stock} WHERE id=#{id}")
        int update(Product item);
}
