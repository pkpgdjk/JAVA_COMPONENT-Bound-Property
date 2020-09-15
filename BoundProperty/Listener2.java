package BoundProperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Listener2 implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: " + evt.getNewValue().toString());
    }
    
}