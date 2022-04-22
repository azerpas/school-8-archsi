package Calculette;


/**
* Calculette/MultiplicationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculette.idl
* Wednesday, April 13, 2022 6:39:29 PM CEST
*/

abstract public class MultiplicationHelper
{
  private static String  _id = "IDL:Calculette/Multiplication:1.0";

  public static void insert (org.omg.CORBA.Any a, Calculette.Multiplication that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Calculette.Multiplication extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Calculette.MultiplicationHelper.id (), "Multiplication");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Calculette.Multiplication read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MultiplicationStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Calculette.Multiplication value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Calculette.Multiplication narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Calculette.Multiplication)
      return (Calculette.Multiplication)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Calculette._MultiplicationStub stub = new Calculette._MultiplicationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Calculette.Multiplication unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Calculette.Multiplication)
      return (Calculette.Multiplication)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Calculette._MultiplicationStub stub = new Calculette._MultiplicationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}