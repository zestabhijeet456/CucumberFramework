package misecellneous;

import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;

public class FilterRunner extends Filter{
	 private String[] testCaseNames;
	 public FilterRunner(String[] arr) {
		this.testCaseNames=arr;
	}
	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldRun(Description d) {
		String displayName = d.getDisplayName();
        // cut off the method name:
        String testName = displayName.substring(0, displayName.indexOf('('));
        if (testCaseNames == null) return true;

        for (int i = 0; i < testCaseNames.length; i++)
            if (testName.equals(testCaseNames[i]))
                return true;
        return false;
	}
}
