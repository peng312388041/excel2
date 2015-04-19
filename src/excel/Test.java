package excel;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Test {

	public static void main(String[] args) throws BiffException, IOException,
			RowsExceededException, WriteException {
		Set<String> set = new HashSet<>();
		set.add("01");
		// set.add("12");
		// set.add("13");
		// set.add("03");
		// set.add("14");
		// set.add("15");
		// set.add("04");
		// set.add("16");
		// set.add("05");

		String test[] = new String[] { "01", "12", "13", "03", "14", "04",
				"15", "05", "16", "06", "17", "07", "19", "09" };
		Arrays.sort(test);
		for (int i = 0; i < test.length; i++)
			System.out.println(test[i]);

	}
}
