import static org.junit.Assert.*;

import org.junit.Test;


public class ArticleTest {

	@Test
	public void ConvertToTweet() {
		
		Article article = new Article("text");
		
		Article articleTweet = article.convertToTweet();
		
		assertEquals("text_tweet", articleTweet.getText());
	}
}
