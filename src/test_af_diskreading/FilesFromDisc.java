package test_af_diskreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FilesFromDisc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6295441317942624373L;

	private class Ingredient implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 8476886599587305987L;
		
		int id;
		String name;
		int amount;
		
		public Ingredient(int id, String name, int amount) {
			this.id = id;
			this.name = name;
			this.amount = amount;
		}
		
		public String toString() {
			return "\nIngredient: \n\t" + id + "; " + name + " - Amount: " + amount + "g\n";
		}
	}
	
	private ArrayList ingredients;
	
	public FilesFromDisc() {
		ingredients = new ArrayList();
		ingredients.add(new Ingredient(1, "smør", 200));
		ingredients.add(new Ingredient(2, "mel", 1000));
		ingredients.add(new Ingredient(3, "sukker", 500));
		ingredients.add(new Ingredient(4, "mælk", 1000));
	}

	public void saveFiles() {
		// Create some data objects for us to save.

		ArrayList ingredientList = ingredients;

		try { // Catch errors in I/O if necessary.
				// Open a file to write to, named SavedObj.sav.
			FileOutputStream saveFile = new FileOutputStream("SaveObjects.sav");

			// Create an ObjectOutputStream to put objects into save file.
			ObjectOutputStream save = new ObjectOutputStream(saveFile);

			// Now we do the save.
			save.writeObject(ingredientList);

			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (Exception exc) {
			exc.printStackTrace(); // If there was an error, print the info.
		}
	}

	public void retrieveData() {
		// Create the data objects for us to restore.
		
		ArrayList ingredientList = new ArrayList();

		// Wrap all in a try/catch block to trap I/O errors.
		try {
			// Open file to read from, named SavedObj.sav.
			FileInputStream saveFile = new FileInputStream("SaveObjects.sav");

			// Create an ObjectInputStream to get objects from save file.
			ObjectInputStream save = new ObjectInputStream(saveFile);

			// Now we do the restore.
			// readObject() returns a generic Object, we cast those back
			// into their original class type.
			// For primitive types, use the corresponding reference class.
			
			ingredientList = (ArrayList) save.readObject();

			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (Exception exc) {
			exc.printStackTrace(); // If there was an error, print the info.
		}

		// Print the values, to see that they've been recovered.
		System.out.println("Restored Object Values:");
		System.out.println("\tContents of stuff: ");
		System.out.println("\t\t" + ingredientList);
		System.out.println();

		// All done.
	}
}
