package Calculette;


/**
* Calculette/DivisionParZero.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculette.idl
* Wednesday, April 13, 2022 6:39:29 PM CEST
*/

public final class DivisionParZero extends org.omg.CORBA.UserException
{

  public DivisionParZero ()
  {
    super(DivisionParZeroHelper.id());
  } // ctor


  public DivisionParZero (String $reason)
  {
    super(DivisionParZeroHelper.id() + "  " + $reason);
  } // ctor

} // class DivisionParZero
