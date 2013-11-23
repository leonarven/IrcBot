package IrcBot;

import java.util.HashMap;

public class Channel {
	public String channelName;
	public HashMap<String, Usermode> userMap = new HashMap<String, Usermode>();
	
	public Channel(String channelName) {
		this.channelName = channelName;
	}
	public boolean isChannel(String channelName) {
		return channelName.startsWith("#") || channelName.startsWith("&") || channelName.startsWith("!") || channelName.startsWith("+");
	}
	
	public void init(String userList) {
		String[] list = userList.split(" ");
		Usermode mode;
		for(String user : list) {
			mode = null;
			if (user.startsWith("@"))      mode = Usermode.o;
			else if (user.startsWith("+")) mode = Usermode.v;
			if (mode != null) user = user.substring(1);
			userMap.put(user, mode);
		}
	}
	
	public void userJoin(String user) {
		
	}
	
	public void userPart(String user) {
		
	}
}
