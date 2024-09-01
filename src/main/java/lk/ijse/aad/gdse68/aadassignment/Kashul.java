package lk.ijse.aad.gdse68.aadassignment;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Kashul {
    @Qualifier("more-like")
    @Like
    @Autowired
    private Food food;

    public Kashul(){}
    @PostConstruct
    public void init(){
        food.chooseFood();
    }
}
