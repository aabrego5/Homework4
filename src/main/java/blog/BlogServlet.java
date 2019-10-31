package blog;

import javax.servlet.http.HttpServlet;

import com.googlecode.objectify.ObjectifyService;
import static com.googlecode.objectify.ObjectifyService.ofy;

public class BlogServlet extends HttpServlet {
	
	static {
		ObjectifyService.register(BlogPost.class);
	}
	
	

}
