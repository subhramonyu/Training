package TestNGExample;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class IReport implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// XML ->List of the suits mentioned in TestNG.xml
		//suites->contains information of package,class and test methods
		//outPutDirectory->contains information of the output folder
		
	}

}
