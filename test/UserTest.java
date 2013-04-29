import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void canPublishValidUser() {
		
		UserRepository userRepositoryStub = mock(UserRepository.class);
		
		User user = new User();		
		user.setUserRepository(userRepositoryStub);
		
		when(user.isPublisher()).thenReturn(true);
		
		assertEquals(true, user.isPublisher());
	}
}
