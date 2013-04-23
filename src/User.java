
public class User {
	
	UserRepository userRepository;
	
	public boolean isPublisher()
	{
		return userRepository.isPublisher(this);
	}
	
	public void setUserRepository(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	
}
