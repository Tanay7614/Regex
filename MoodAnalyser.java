package sample;

public class MoodAnalyser {
    String msg;
	
    public MoodAnalyser(String msg)
    {
		this.msg=msg;
	}
	
	public String analyseMood() {
		
		if(msg.contains("sad")) 
		{
			return "sad";
		}
		else
		{
		return "Happy";
		}
		
		
		
	}

}
