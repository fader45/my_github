import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("当前JRE：" + System.getProperty("java.version"));   
		System.out.println("当前JVM的默认字符集：" + Charset.defaultCharset());
		
//		String str = new String("天安䶮".getBytes(),"GBK");
		String str ="天安䶮";
		
		System.out.println("初始值为："+ str);
		
		System.out.println("unicodeToUtf8:"+unicodeToUtf8(str));
		
		System.out.println("unicodeToiso:" + unicodeToiso(str));
		System.out.println("unicodeToUtf8:"+unicodeToUtf8(unicodeToiso(str)));
		
		System.out.println("CharTest.UTF8ToISO：" + CharTest.UTF8ToISO(str));
		
		System.out.println("CharTest.ISOToUTF8：" + CharTest.ISOToUTF8(str));
		
		
	}
	
	
	public static String unicodeToUtf8 (String s) {
		try {
			return new String( s.getBytes("utf-8") , "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static String unicodeToiso (String s) {
		try {
			return new String( s.getBytes("iso8859-1") , "iso8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s;
	}
	

	/**
	 * 返回结果集处理
	 * 
	 * @author llf
	 * @param obj
	 * @return
	 */
	public static String transformRs(Object obj) {
		if (null == obj || "null".equals(obj)) { // "null"字符串转成空字符串
			obj = "";
		} else if (obj instanceof String) {
			obj = ISOToUTF8(((String) obj).trim());
		}

		return obj.toString();
	}

	/**
	 * ISO-8859-1转UTF-8
	 * 
	 * @author llf
	 * @param str
	 * @return
	 */
	public static String ISOToUTF8(String str) {
		try {
			return new String(str.getBytes("iso8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			System.out.println(
					"Convert Encoding from ISO To UTF8 Error.OtsUtils.ISOToUTF8() failed. str="
							+ str);
			return str;
		}
	}

	/**
	 * UTF-8转ISO-8859-1
	 * 
	 * @author llf
	 * @param str
	 * @return
	 */
	public static String UTF8ToISO(String str) {
		try {
			return new String(str.getBytes("GBK"), "iso8859-1");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Convert Encoding from  UTF8 To ISO Error.OtsUtils.UTF8ToISO() fail. str="+str);
			return str;
		}
	}

}
