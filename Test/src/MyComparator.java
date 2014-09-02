import java.util.Arrays;
import java.util.Comparator;


public class MyComparator implements Comparator<Train> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	@Override
	public int compare(Train o1, Train o2) {
		String tn1 = o1.getTrainno();
		String tn2 = o2.getTrainno();
		if(tn1!=null && tn1.length()>0){
			
		}
		
		Arrays.sort(new int[3]);
		return 0;
	}

}
