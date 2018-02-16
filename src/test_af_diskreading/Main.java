package test_af_diskreading;

public class Main {

	public static void main(String[] args) {
		FilesFromDisc fs = new FilesFromDisc();
		
		fs.saveFiles();
		fs.retrieveData();
	}

}
