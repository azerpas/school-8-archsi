package ServerSide;

import Calculette.DivisionOperations;
import Calculette.DivisionParZero;

public class DivisionObjExo3 implements DivisionOperations {

	@Override
	public int div(int a, int b) throws DivisionParZero {
		// TODO Auto-generated method stub
		if (b==0)
			throw new DivisionParZero();
		return a/b;
	}

}
