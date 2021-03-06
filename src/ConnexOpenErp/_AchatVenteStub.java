package ConnexOpenErp;


/**
* ConnexOpenErp/_AchatVenteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ConnexionOpenErp.idl
* mardi 16 d�cembre 2014 17 h 27 CET
*/

public class _AchatVenteStub extends org.omg.CORBA.portable.ObjectImpl implements ConnexOpenErp.AchatVente
{

  public ConnexOpenErp.AchatVentePackage.Product[] listerProducts ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listerProducts", true);
                $in = _invoke ($out);
                ConnexOpenErp.AchatVentePackage.Product $result[] = ConnexOpenErp.AchatVentePackage.ListeProductHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listerProducts (        );
            } finally {
                _releaseReply ($in);
            }
  } // listerProducts

  public ConnexOpenErp.AchatVentePackage.Supplier[] listerSuppliers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listerSuppliers", true);
                $in = _invoke ($out);
                ConnexOpenErp.AchatVentePackage.Supplier $result[] = ConnexOpenErp.AchatVentePackage.ListeSupplierHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listerSuppliers (        );
            } finally {
                _releaseReply ($in);
            }
  } // listerSuppliers

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ConnexOpenErp/AchatVente:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AchatVenteStub
