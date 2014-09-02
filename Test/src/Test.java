import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String ss = "http://10.1.213.238/mormhweb/zxdt/../zxdt_ggxx/201408/t20140828_2057.html";
		System.out.println("URL = " + ss);
		
		if(ss.indexOf("../")>0){
			
			int offset = ss.indexOf("../");
			System.out.println("offset = " + offset);
			
			int middle_start_offset = ss.substring(0,offset-1).lastIndexOf("/")+1;
			int middle_end_offset = offset + 3;
			
			String url = ss.substring(0, middle_start_offset) + ss.substring(middle_end_offset, ss.length());
			System.out.println("URL = " + url);
			
			
		}

		
		
		

	}

	public void testCostTime() {
		long starttime = new Date().getTime();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endtime = new Date().getTime();
		System.out.println("cost time is :" + (endtime - starttime));
	}

}
