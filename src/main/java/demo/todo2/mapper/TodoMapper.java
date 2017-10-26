/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.todo2.mapper;

import demo.todo2.Todo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author sihai
 */
public interface TodoMapper {

    @Select("select * from todo where user_id = #{userId}")
    public List<Todo> list(int userId);

    @Insert("insert into todo (title,user_id,is_finish) values (#{title},#{userId},#{isFinish})")
    @Options(useGeneratedKeys = true)
    public void add(Todo todo);

    @Select("select * from todo where id=#{todoId}")
    public Todo get(int todoId);

    @Update("update todo set title=#{title} , is_finish=#{isFinish} where id = #{id}")
    public void update(Todo todo);
}
