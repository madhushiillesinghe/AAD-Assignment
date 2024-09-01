package lk.ijse.aad.gdse68.aadassignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("more-like")
@Like
public class ChikenRole implements Food{
    @Override
    public void chooseFood() {
        System.out.println("Kashul choose  Chiken role");
    }
}
