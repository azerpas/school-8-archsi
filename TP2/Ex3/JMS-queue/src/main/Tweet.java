package main;

public class Tweet {
	private String content;
	private int timestamp;
	
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		return "Tweet [content=" + content + ", timestamp=" + timestamp + "]";
	}
}
