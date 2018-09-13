package thrds1;

import java.util.Arrays;
import java.util.List;

public class CollectionUtils {
	public static List<List<Emp>> populateData() 
	{ 
		List<Emp>l1=Arrays.asList(new Emp(1, "abc1", "rnd", 10000),new Emp(2, "abc2", "rnd", 20000),new Emp(3, "abc3", "rnd", 30000));
		List<Emp>l2=Arrays.asList(new Emp(4, "abc4", "hr", 40000),new Emp(5, "abc5", "hr", 50000),new Emp(6, "abc6", "hr", 60000));
		List<Emp>l3=Arrays.asList(new Emp(7, "abc7", "sales", 70000),new Emp(8, "abc8", "sales", 80000),new Emp(9, "abc9", "sales", 90000));
		
		return Arrays.asList(l1,l2,l3);
	}

}
