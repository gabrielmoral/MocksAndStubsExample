import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class PublisherTest {

	@Test
	public void PublishArticle() {
		
		Publisher publisher = new Publisher();
		
		ArticleRepository articleRepositoryMock = mock(ArticleRepository.class);
		UserRepository userRepositoryMock = mock(UserRepository.class);
		TwitterPublisher twitterPublisherMock = mock(TwitterPublisher.class);
		
		Article article = new Article("texto");		
		User user = new User();		
		
		when(userRepositoryMock.isPublisher(user)).thenReturn(true);
		when(articleRepositoryMock.Publish(article)).thenReturn(true);
		when(twitterPublisherMock.PublishTweet(article)).thenReturn(true);
		
		publisher.setArticleRepository(articleRepositoryMock);
		publisher.setUserRepository(userRepositoryMock);
		publisher.setTwitterPublisher(twitterPublisherMock);
		
		publisher.Publish(article, user);		
	
		verify(articleRepositoryMock).Publish(article);	
	}
}
