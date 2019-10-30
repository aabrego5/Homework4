package blog;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

public class Blog {
	@Id Long id;
	@Index String title;
	@Index String content;
	
	private Blog() {}
	
	

}
