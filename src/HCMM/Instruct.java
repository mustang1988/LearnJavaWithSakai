package HCMM;

import java.util.List;

public class Instruct {
	private String operator;
	private String[] params;
	private List<Member> members;

	public Instruct(String instrct) {
		// substring to get first word in input instruct
		this.operator = instrct.substring(0, instrct.indexOf(' '));
		String paramsString = instrct.substring(instrct.indexOf(' ') + 1);
		this.params = paramsString.split("; ");
	}

	public void operate() {
		if (this.operator.equals("add")) {
			// do add
		} else if (this.operator.equals("pass")) {
			// do pass
		} else if (this.operator.equals("query")) {
			// output report
			// new Report() -> outputReport()
		}
	}
}
