package L01.InterfaceExtendsInterface;

interface IVehicle{
	boolean moveForward( int x );
	boolean moveBack( int x );
}

interface IAirplane extends IVehicle{
	boolean moveDown(int x);
	boolean moveUp(int x);
}

class Airplane implements IAirplane{

	@Override
	public boolean moveForward(int x) {
		System.out.println("Forward " + x + "km");
		return false;
	}

	@Override
	public boolean moveBack(int x) {
		System.out.println("Back " + x + "km");
		return false;
	}

	@Override
	public boolean moveDown(int x) {
		System.out.println("Down " + x + "km");
		return false;
	}

	@Override
	public boolean moveUp(int x) {
		System.out.println("Up " + x + "km");
		return false;
	}
	
}
public class TestVehicle {

	public static void main(String[] args) {
		Airplane a = new Airplane();
		a.moveUp(5000);
		a.moveForward(10000);
		a.moveDown(5000);
	}

}
