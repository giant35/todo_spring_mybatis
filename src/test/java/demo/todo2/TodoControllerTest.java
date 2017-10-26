/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.todo2;

import demo.todo2.mapper.TodoMapper;
import java.util.List;
import java.util.Objects;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihai
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring-servlet.xml"})
public class TodoControllerTest {

    @Autowired
    TodoMapper todoMapper;

    public TodoControllerTest() {
    }

    @Test
    public void testList() {
        List<Todo> list = todoMapper.list(1);
        list.forEach(t -> System.out.println(t.toString()));
        assertFalse(list.isEmpty());
    }

    @Test
    @Transactional
    public void testAdd() {
        Todo todo = new Todo();
        todo.setTitle("放点啥放点啥放点啥");
        todo.setUserId(1);
        todoMapper.add(todo);
        assertTrue(todo.getId() > 0);
    }

    @Test
    public void testGet() {
        Todo todo = todoMapper.get(2);
        System.out.println(todo);
        Objects.requireNonNull(todo);
    }

}
