package Calculette;


/**
* Calculette/AdditionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculette.idl
* Wednesday, April 13, 2022 6:39:29 PM CEST
*/

abstract public class AdditionHelper
{
  private static String  _id = "IDL:Calculette/Addition:1.0";

  public static void insert (org.omg.CORBA.Any a, Calculette.Addition that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Calculette.Addition extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Calculette.AdditionHelper.id (), "Addition");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Calculette.Addition read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AdditionStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Calculette.Addition value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Calculette.Addition narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Calculette.Addition)
      return (Calculette.Addition)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Calculette._AdditionStub stub = new Calculette._AdditionStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Calculette.Addition unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Calculette.Addition)
      return (Calculette.Addition)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Calculette._AdditionStub stub = new Calculette._AdditionStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
