
public class Publisher {

	public ArticleRepository articleRepository;
	public UserRepository userRepository;
	public TwitterPublisher twitterPublisher;
	
	
	public boolean Publish(Article article, User user) {	
		if(userRepository.isPublisher(user)){		
			articleRepository.Publish(article);
			twitterPublisher.PublishTweet(article.ConvertTweet());
			
			return true;
		}
		
		return false;
	}
	
	public void setArticleRepository(ArticleRepository articleRepository){
		this.articleRepository= articleRepository;		
	}
	
	public void setUserRepository(UserRepository userRepository){
		this.userRepository= userRepository;		
	}
	
	public void setTwitterPublisher(TwitterPublisher twitterPublisher){
		this.twitterPublisher= twitterPublisher;		
	}
}
