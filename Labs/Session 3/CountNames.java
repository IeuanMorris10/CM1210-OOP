public class CountNames {
	public static void main( String args[] ) {

    String[] names = new String[]{"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
        "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy",
        "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };

		int count = 0;

    for (int i = 0; i < names.length; i++) {
        if(names[i].toLowerCase().contains("jones"))
          count++;
        else
					System.out.println(names[i] + " doesn't have the surname Jones");
        }
    System.out.println("Number of people with the surname Jones: " + count);

	}
}
