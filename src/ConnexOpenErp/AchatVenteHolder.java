package ConnexOpenErp;

/**
* ConnexOpenErp/AchatVenteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ConnexionOpenErp.idl
* mardi 16 d�cembre 2014 17 h 27 CET
*/

public final class AchatVenteHolder implements org.omg.CORBA.portable.Streamable
{
  public ConnexOpenErp.AchatVente value = null;

  public AchatVenteHolder ()
  {
  }

  public AchatVenteHolder (ConnexOpenErp.AchatVente initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConnexOpenErp.AchatVenteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConnexOpenErp.AchatVenteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConnexOpenErp.AchatVenteHelper.type ();
  }

}