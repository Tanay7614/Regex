package sample;

public class Mood {
	public static void main(String[] args)
	{
		
		MoodAnalyser moodAnalyser =new MoodAnalyser (null);
		String mood= moodAnalyser.analyseMood();
		System.out.println(mood);
		
	}

}
