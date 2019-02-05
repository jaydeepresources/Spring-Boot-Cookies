package app;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/")
	public Status login(HttpServletRequest request, HttpServletResponse response) {

		Cookie cookies[] = request.getCookies();
		Status status = null;

		System.out.println(cookies);

		if (cookies != null) {
			status = new Status("not set");
		}

		else {
			Cookie cookie = new Cookie("cookieName", "value");
			cookie.setMaxAge(36000);
			response.addCookie(cookie);
			status = new Status("set");
		}

		return status;
	}

}
