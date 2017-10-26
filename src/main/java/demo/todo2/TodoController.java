/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.todo2;

import demo.todo2.mapper.TodoMapper;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sihai
 */
@Controller
@RequestMapping(path = "todo")
public class TodoController {

    private static final Logger LOG = Logger.getLogger(TodoController.class.getName());

    @Autowired
    TodoMapper todoMapper;

    @RequestMapping(path = "list")
    public String list(Model model) {
        Objects.requireNonNull(todoMapper);
        List<Todo> todoList = todoMapper.list(1);//test 1
        model.addAttribute("todoList", todoList);
        model.addAttribute("msg", "你好");
        return "/todo/list";
    }

    @GetMapping(path = "edit")
    public String editGet(Model model, @RequestParam(name = "id", defaultValue = "0") int todoId) {
        Todo todo;
        if (todoId < 1) {
            todo = new Todo();
        } else {
            todo = todoMapper.get(todoId);
        }
        model.addAttribute("todo", todo);
        return "/todo/edit";
    }

    @PostMapping(path = "edit")
    @Transactional
    public String editPost(@ModelAttribute @Valid Todo todo, Errors errors) {
        LOG.info("todo" + todo.toString());
        if (todo.getId() > 0) {
            todoMapper.update(todo);
        } else {
            todo.setUserId(1);//test 1
            todoMapper.add(todo);
        }
        return "redirect:/todo/list";
    }

    @RequestMapping(path = "test")
    public ModelAndView test(HttpServletRequest req) {
        ModelAndView ret = new ModelAndView();
        ret.addObject("ip", req.getRemoteAddr());
        ret.setViewName("/WEB-INF/jsp/test.jsp");
        return ret;
    }

}
