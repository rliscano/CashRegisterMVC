import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class CashRegisterModel {

	private PropertyChangeSupport observables;
	private ArrayList<Product> myProducts;
	
	CashRegisterModel (ArrayList<Product> products) {
		myProducts=products;
		observables = new PropertyChangeSupport(this);
	}

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
		// TODO Auto-generated constructor stub - complete

    }
    
   
    public void processUPC(int code) {
    // use UPC to look up product and price - complete
    	
    // Notify observers - complete 

    }
	

	public ArrayList<Product>	getProductList() {
		return this.myProducts;
	}
	
}
