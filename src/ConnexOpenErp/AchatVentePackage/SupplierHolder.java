package ConnexOpenErp.AchatVentePackage;

/**
* ConnexOpenErp/AchatVentePackage/SupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ConnexionOpenErp.idl
* mardi 16 d�cembre 2014 17 h 27 CET
*/

public final class SupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public ConnexOpenErp.AchatVentePackage.Supplier value = null;

  public SupplierHolder ()
  {
  }

  public SupplierHolder (ConnexOpenErp.AchatVentePackage.Supplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConnexOpenErp.AchatVentePackage.SupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConnexOpenErp.AchatVentePackage.SupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConnexOpenErp.AchatVentePackage.SupplierHelper.type ();
  }

}
