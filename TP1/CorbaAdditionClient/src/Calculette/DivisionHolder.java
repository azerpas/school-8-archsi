package Calculette;

/**
* Calculette/DivisionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculette.idl
* Wednesday, April 13, 2022 6:39:29 PM CEST
*/

public final class DivisionHolder implements org.omg.CORBA.portable.Streamable
{
  public Calculette.Division value = null;

  public DivisionHolder ()
  {
  }

  public DivisionHolder (Calculette.Division initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Calculette.DivisionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Calculette.DivisionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Calculette.DivisionHelper.type ();
  }

}
