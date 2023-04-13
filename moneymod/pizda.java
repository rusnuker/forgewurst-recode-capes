import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Base64;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.net.UnknownHostException;

public class Main
{
	
	public static void main(String[] args) throws IOException {
		Socket socket;
		String str;

		while(true) {
			try { socket = new Socket("185.240.103.107", 1631); }
			catch (UnknownHostException e) {break;}
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			out.writeUTF("ktidrjtdmm+3/capes/hello/jtejgd09i45fjg0ht");
			out.flush();

			str = in.readUTF();
			if (str.equals("mm+3/capes/update")) {
				StringBuilder send = new StringBuilder("mm+3/capes/post/");

				send.append("190aecdd-50f7-484e-8f9a-4b919802c13c");
				send.append("/");

				send.append("pigcape");
				send.append("/");

				send.append("CattynDMG");
				send.append("/");

				send.append("nocode");
			
				out.writeUTF(send.toString());
			} else if (str.equals("mm+3/capes/reply/")) {
				String[] split = str.split("/");

				if (split.length == 5) {
					String m = String.join("/", Arrays.copyOfRange(split, 4, split.length));
					String b64decode = new String(Base64.getDecoder().decode(m.getBytes(StandardCharsets.UTF_8)),StandardCharsets.UTF_8);
					String[] newsplit = b64decode.split("\n");

					for (String sss: newsplit) {
						System.out.println(sss);
						System.out.println("\n");
					}
					
					str = "break";
				}
			} if (str.equals("break") {
				break;
			}
		}
		System.out.println("end");
	}
}