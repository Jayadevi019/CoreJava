interface SocialFeedReader1 
{
	public Message pollForNewMessage();
}
class Message
{
	int mid;
	String msg_src;
	String msg_type;
	String message;
	String sender;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMsg_src() {
		return msg_src;
	}
	public void setMsg_src(String msg_src) {
		this.msg_src = msg_src;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	}
class TwitterFeedReader implements SocialFeedReader1
{
	public Message pollForNewMessage() {
	      Message m1=new Message();
	      m1.setMid(13);
	      m1.setMsg_src("Twitter");
	      m1.setMsg_type("String");
	      m1.setMessage("This is the Twitter Class");
	      m1.setSender("Mahe");
		return m1;
	}
	}
class FacebookFeedReader implements SocialFeedReader1
{
	public Message pollForNewMessage() {
	      Message m2=new Message();
	      m2.setMid(19);
	      m2.setMsg_src("Facebook");
	      m2.setMsg_type("String");
	      m2.setMessage("This is the Facebook Class");
	      m2.setSender("Jaya");
		return m2;
	}
	}
public class SocialFeedReader
{
	public static void main(String[] args)
	{
		TwitterFeedReader t=new TwitterFeedReader();
		Message m1=t.pollForNewMessage();
		System.out.println(m1.getMid());
		System.out.println(m1.getMsg_src());
		System.out.println(m1.getMsg_type());
		System.out.println(m1.getMessage());
		System.out.println(m1.getSender());
		FacebookFeedReader f=new FacebookFeedReader();
		Message m2=f.pollForNewMessage();
		System.out.println(m2.getMid());
		System.out.println(m2.getMsg_src());
		System.out.println(m2.getMsg_type());
		System.out.println(m2.getMessage());  
	}
}
