package study.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import study.model.Node;

@RestController
public class restController {
    private final static Logger logger = Logger.getGlobal();

    Node node;

    @Autowired
    public void setNode(Node node) {
        this.node = node;
    }

    @RequestMapping(value="/api/hello", method= RequestMethod.POST)
    @ResponseBody
    public String addList(Model model, @RequestBody String params) {
        model.addAttribute("node", node.getId());
        logger.info("params : " + params);
        logger.info("node : " + node.getId());
        return "goods";
    }
}
