
public class Article {	
	
	private String text;
	
	public Article(String text)	{
		this.text = text;
	}
	
	 public Article convertToTweet(){		 
		Article articleTweet = new Article(text.concat("_tweet"));
		return articleTweet;
	}
	 
	 public String getText(){
		 return text;
	 }
	 
	
}
