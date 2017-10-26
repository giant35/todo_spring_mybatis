///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package demo.todo2;
//
//import java.util.logging.Logger;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
///**
// *
// * @author sihai
// */
//public class TestController implements Controller {
//
//    private static final Logger LOG = Logger.getLogger(TestController.class.getName());
//
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
//        LOG.info("testcontroller.handleRequest enter...");
//        ModelAndView ret = new ModelAndView();
//        ret.setViewName("/WEB-INF/jsp/test.jsp");
//        ret.addObject("ip", hsr.getRemoteAddr());
//        return ret;
//    }
//}
