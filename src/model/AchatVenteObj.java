package model;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.omg.CORBA.ORB;

import ConnexOpenErp.AchatVentePOA;
import ConnexOpenErp.AchatVentePackage.Product;
import ConnexOpenErp.AchatVentePackage.Supplier;
import connexion.openerp.api.ConnexionOpenErp;

public class AchatVenteObj extends AchatVentePOA {

	private ORB orb;

	public void setORB(ORB orb_val) {
		orb = orb_val;
	}

	public Supplier[] listerSuppliers() {
		// ConnexionOpenErp.listerFournisseurs();
		return null;
	}

	public Product[] listerProducts() {
		try{
			Properties prop = new Properties();
	        InputStream in = getClass().getResourceAsStream("/connexion.properties");
	        //FileReader in = new FileReader("connexion.properties");
	        prop.load(in);
	        ConnexionOpenErp.host = prop.getProperty("host");
			ConnexionOpenErp.port = Integer.valueOf(prop.getProperty("port"));
			ConnexionOpenErp.db = prop.getProperty("db");
			ConnexionOpenErp.user = prop.getProperty("user");
			ConnexionOpenErp.pass = prop.getProperty("pass");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		ArrayList<connexion.openerp.api.model.Product> listeProduct1 = ConnexionOpenErp
				.listerProducts();

		ArrayList<Product> listeProduct2 = new ArrayList<Product>();
		for (connexion.openerp.api.model.Product p1 : listeProduct1) {
			Product p2 = new Product(p1.getId(), p1.getName(), p1.getQtyAvailable(), p1.getPrixVente());
			listeProduct2.add(p2);
		}
		return (Product[]) listeProduct2.toArray(new Product[0]);
	}
}