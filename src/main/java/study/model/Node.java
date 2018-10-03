package study.model;

import org.springframework.stereotype.Service;

@Service
public class Node {
    private String id;

    public Node(){
        id = "jihyunii";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
