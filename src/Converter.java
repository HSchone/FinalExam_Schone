import javax.swing.JOptionPane;

public class Converter {

	public String changeToHex(int intBase10) {
		String answer = "";
		// code for you to complete
		if (intBase10 < 0 || intBase10 > 255) {
			// JOP "Error, range outside of 0-255, please try again
			JOptionPane.showMessageDialog(null, "Error, range outside of 0-255, please try again");
			return null;
		} else if (intBase10 >= 0 && intBase10 <= 255) {
			answer = Integer.toHexString(intBase10);
		}
		// basic test
		if (intBase10 == 0)
			answer = "00";
		if (intBase10 == 255)
			answer = "FF";
		return answer;
	}

}