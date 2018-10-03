package study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;

import study.model.Node;

@Controller
public class ByeController {

    Node node;

    @Autowired
    public void setNode(Node node) {
        this.node = node;
    }

    @RequestMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("node", node.getId());
        return "bye";
    }
}