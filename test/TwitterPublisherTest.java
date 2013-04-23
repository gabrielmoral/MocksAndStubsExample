import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;


public class TwitterPublisherTest {

	@Test
	public void PublishTwitter() {
		
		Article article = new Article("text");
		TwitterPublisher twitterPublisher = mock(TwitterPublisher.class);
				
		when(twitterPublisher.PublishTweet(article)).thenReturn(true);
		
		boolean result = twitterPublisher.PublishTweet(article);
		
		assertEquals(true, result);
	}

}
