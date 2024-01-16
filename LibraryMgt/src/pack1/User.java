package pack1;

public class User {
	private String uid;
	private String Name,password,Emailid,PhoneNum,Membership_dur,BookName,BookID,Author;
	
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookID() {
		return BookID;
	}
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getEmail() {
		return Emailid;
	}
	public void setEmail(String email) {
		this.Emailid = email;
	}
	public String getPhnno() {
		return PhoneNum;
	}
	public void setPhnno(String phnno) {
		this.PhoneNum = phnno;
	}
	public String getMembership_dur() {
		return Membership_dur;
	}
	public void setMembership_dur(String membership_dur) {
		this.Membership_dur = membership_dur;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", Name=" + Name + ", password=" + password + ", Emailid=" + Emailid + ", PhoneNum="
				+ PhoneNum + ", Membership_dur=" + Membership_dur + ", BookName=" + BookName + ", BookID=" + BookID
				+ ", Author=" + Author + "]";
	}

	
}
