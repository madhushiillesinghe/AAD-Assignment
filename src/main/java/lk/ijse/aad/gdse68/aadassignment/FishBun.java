package lk.ijse.aad.gdse68.aadassignment;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food{
    @Override
    public void chooseFood() {
        System.out.println("choosing fishbun");

    }
}
