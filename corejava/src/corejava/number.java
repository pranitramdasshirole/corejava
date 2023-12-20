package corejava;


class number{
	 enum number2 {
		  small,
		  medium,
		  large
		}
	 public static void main(String[] args) {
		number2 my =number2.small;
		switch (my) {
		case small:
			System.out.println("very week in exam");
			break;
		case medium:
			System.out.println("medium in study");
			break;
		case large:
			System.out.println("large in study");
			break;
		default:
			break;
		}
	}
}
 
