import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;


public class TwitterPublisherTest {

	@Test
	public void PublishTwitter() {
		
		Article article = new Article("text");
		TwitterPublisher twitterPublisherStub = mock(TwitterPublisher.class);
				
		when(twitterPublisherStub.PublishTweet(article)).thenReturn(true);
		
		boolean result = twitterPublisherStub.PublishTweet(article);
		
		assertEquals(true, result);
	}

}
