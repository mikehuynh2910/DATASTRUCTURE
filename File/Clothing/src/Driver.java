
public class Driver{

	public static void main(String[] args) {
		
        // Test pants class 
        Pants blackPants = new Pants(null, null); 
        blackPants.setColor("Black"); 
        blackPants.setSize("M"); 
        System.out.println("blackPants " + blackPants); //Be sure to print new Pants objects

		blackPants.wash(null);
		blackPants.hang();
		System.out.println();
		
        // Test Shirt class 

        DerivedClothingHuynh blueShirt = new Shirt("M", "blue","short"); // sets size to null since not S, M, L 
        Shirt pinkShirt = new Shirt("L", "pink","long"); // shirt class has one field called style  
        System.out.println("blueShirt " + blueShirt.toString());  
        System.out.println("pinkShirt " + pinkShirt.toString()); //Be sure to print new Shirt objects

        pinkShirt.wash(null);
        pinkShirt.hang();
        System.out.println(); 
	}
}
// Big-O = O(1)