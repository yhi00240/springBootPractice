package study.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import study.model.Node;

@Controller
public class HelloController {

    Node node;

    @Autowired
    public void setNode(Node node) {
        this.node = node;
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("node", node.getId());
        node.setId("ph-1");
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("node", node.getId());
        return "hello2";
    }
}