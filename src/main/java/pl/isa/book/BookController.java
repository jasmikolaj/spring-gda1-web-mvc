package pl.isa.book;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	// localhost:8080/Author1/books?bookName=SomeBook
	@RequestMapping(value = "/booksCustom", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ModelAndView showBook(@RequestParam("bookName") String name,
									@RequestHeader("X-Book-Store-Name") String bookStoreName) {
		ModelAndView modelAndView = new ModelAndView("book.jsp");
		Book book = new Book(name, new Author("Some author"), 10.0);

		modelAndView.getModel().put("book", book);
		modelAndView.getModel().put("bookStoreName", bookStoreName);
		return modelAndView;
	}


	@RequestMapping("/book")
	public ModelAndView showRandomBook() {
		ModelAndView modelAndView = new ModelAndView("book.jsp");
		Book book = new Book("Book 1", new Author("Author 1"), 10.0);

		modelAndView.getModel().put("book", book);
		modelAndView.getModel().put("bookStoreName", "Some bookstore");
		return modelAndView;
	}



}
