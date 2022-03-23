import org.apache.commons.codec.binary.Base64;

public class PwdEncoding {
	public static void main(String[] args) {
		String str="paulininfanta";
		 //to encode base64(class) need,convert string to bytes, store in bytes
		byte[] encode=Base64.encodeBase64(str.getBytes());
		System.out.println("String before encoding:" +str);
		System.out.println("String after encoding:" +new String(encode));//here byte convert to string
	     byte[] decode=Base64.decodeBase64(encode);
	    System.out.println("String after decoding:" + new String(decode));
	}

}
