package lk.ijse.aad.gdse68.aadassignment;

import org.springframework.context.annotation.Primary;

public class FishPastry implements Food{
    @Override
    @Primary
    public void chooseFood() {
        System.out.println(" Kashul  choosing fish pastry");
    }
}
