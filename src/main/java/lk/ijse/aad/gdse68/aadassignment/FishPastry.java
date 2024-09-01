package lk.ijse.aad.gdse68.aadassignment;

import org.springframework.stereotype.Component;

@Component
public class FishPastry implements Food{
    @Override
    public void chooseFood() {
        System.out.println(" Kashul  choosing fish pastry");
    }
}
