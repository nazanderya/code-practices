package kim.eren.oca_8_certificate.oca_study_guide.chapter2;

public class Casting {

	short x = 10;
	short y = 3;
	byte xx = 1;
	byte yy = 2;

	int xxyy = xx + yy;
	long xxyyl = xx + yy;
	double xxyyd = xx + yy;

	byte bbxx = (byte) (xx + yy);
	// short z = x * y; // DOES NOT COMPILE

// test is primitive byte automatically to do not cast any of parent class?
//there is no compile error so you can not cast any of parent them
	int bbxxContainer = bbxx;

	/**
	 * that line of 6 doesn't compile why ? because if you multiplicate two smaller
	 * type that types promote to int so that result type will be int but we are
	 * declare as a short we should cast to smaller data
	 */
	int z = (x * y);
	/**
	 * that line doesn't compile
	 */
	// String message = 10>10? "Greater then x":false;

	long yT = 4;
	/**
	 * that line also doesn't compile because yT was long so declared value have to
	 * be long!
	 */
	// int xT = 5 * yT;

	byte yB = 50, xB = 40;
	/**
	 * that line doesn't compile
	 */
	// byte resB = (byte) yB + xB;

}
