package model;

import org.json.simple.*;

public class DataPackage {
	public static final int CHATMESSAGE = 1;
	
	private String type;
	private String content;
	private JSONObject jsnData = new JSONObject();
	
	public DataPackage(String type, String content) {
		this.type = type;
		this.content = content;
		
		jsnData.put("type", type);
		jsnData.put("content", content);
	}

	public String getType() {
		return (String) jsnData.get("type");
	}

	public void setType(String type) {
		this.type = type;
		jsnData.put(type, type);
	}

	public String getContent() {
		return (String) jsnData.get("content");
	}

	public void setContent(String content) {
		this.content = content;
		jsnData.put("content",content);
	}

	public JSONObject getJsnData() {
		return jsnData;
	}

	public void setJsnData(JSONObject jsnData) {
		this.jsnData = jsnData;
	}
}
