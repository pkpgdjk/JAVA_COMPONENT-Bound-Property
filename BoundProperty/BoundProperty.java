package BoundProperty;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class BoundProperty implements Serializable {
    public static final String RESULT_PROPERTY = "result";

    private String result = "";
    private PropertyChangeSupport propertyChangeSupport;

    public BoundProperty(){
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        String oldResult = this.result;
        this.result = result;
        propertyChangeSupport.firePropertyChange(RESULT_PROPERTY, oldResult, this.result);
    }

    public void addListenner(PropertyChangeListener propertyChangeListener){
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removeListener(PropertyChangeListener propertyChangeListener){
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }
    
}
