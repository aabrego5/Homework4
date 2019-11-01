package blog;
import java.util.Date;

import com.google.appengine.api.users.User;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class BlogPost {
	@Id Long id;
	@Index User user;
	@Index String title;
	@Index String content;
	@Index Date date;
	
	
	private BlogPost() {}
	public BlogPost(User user, String title, String content) {
		this.user = user;
		this.title = title;
		this.content = content;
		this.date = new Date();
	}
	
	

}