
public class DriverLinked {
	public static void main(String[] args) {
		System.out.println("ADD ELEMENT");

		CanHuynh SWPeaches = new CanHuynh("S&W", "Peaches", 12.0, 2.39);

		CanHuynh GreenGiantGreenBeans = new CanHuynh ("Green Giant", "Green Beans");

		CanHuynh DelMonteCreamedCorn = new CanHuynh("Del Monte", "Creamed Corn", 13.4, 2.49);

		GreenGiantGreenBeans.setSize(11.9); GreenGiantGreenBeans.setPrice(1.79);

		System.out.println("Can 1: " + SWPeaches.toString()); System.out.println("Can 2: " + GreenGiantGreenBeans.toString());

		System.out.println("Can 3: " + DelMonteCreamedCorn);

		System.out.println();

		SinglyLinkedList list = new SinglyLinkedList();

		list.add(GreenGiantGreenBeans);

		list.add(DelMonteCreamedCorn);

		list.add(SWPeaches);
		System.out.println("Show out list");


		list.display();
		System.out.println();
		System.out.println("Remove GreenGiantGreenBeans");
		list.remove(GreenGiantGreenBeans);
		list.display();
		System.out.println();
		System.out.println("Remove SWPeaches and GreenGiantGreenBeans");
		list.remove(SWPeaches);
		list.display();

		}

		}

