/**
 *
 * @author MARIE ANGE
 */
import java.util.Properties;

import model.AchatVenteObj;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import ConnexOpenErp.AchatVente;
import ConnexOpenErp.AchatVenteHelper;

public class StartServer {

	public static void main(String args[]) {
		try {
			// create and initialize the ORB //// get reference to rootpoa &amp;
			// activate the POAManager
			Properties props = new Properties();
			props.put("org.omg.CORBA.ORBInitialPort", "1050");
			props.put("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
			ORB orb = ORB.init(args, null);
			POA rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			// create servant and register it with the ORB
			AchatVenteObj addobj = new AchatVenteObj();
			addobj.setORB(orb);

			// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(addobj);
			AchatVente href = AchatVenteHelper.narrow(ref);

			// org.omg.CORBA.Object objRef =
			// orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			NameComponent path[] = ncRef.to_name("AchatVente");
			ncRef.rebind(path, href);

			System.out.println("Addition Server ready and waiting ...");

			// wait for invocations from clients
			for (;;) {
				orb.run();
			}
		}

		catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}

		System.out.println("HelloServer Exiting ...");

	}
}