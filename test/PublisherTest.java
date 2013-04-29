import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class PublisherTest {

	@Test
	public void PublishArticle() {
		
		Publisher publisher = new Publisher();
		
		ArticleRepository articleRepositoryMock = mock(ArticleRepository.class);
		UserRepository userRepositoryStub = mock(UserRepository.class);
		TwitterPublisher twitterPublisherStub = mock(TwitterPublisher.class);
		
		Article article = new Article("texto");		
		User user = new User();		
		
		when(userRepositoryStub.isPublisher(user)).thenReturn(true);
		
		publisher.setArticleRepository(articleRepositoryMock);
		publisher.setUserRepository(userRepositoryStub);
		publisher.setTwitterPublisher(twitterPublisherStub);
		
		publisher.Publish(article, user);		
	
		verify(articleRepositoryMock).Publish(article);	
	}
}
