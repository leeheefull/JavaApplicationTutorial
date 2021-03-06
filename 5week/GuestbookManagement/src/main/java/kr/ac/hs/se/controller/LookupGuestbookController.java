package kr.ac.hs.se.controller;

import kr.ac.hs.se.container.Container;
import kr.ac.hs.se.dto.Guestbook;
import kr.ac.hs.se.service.GuestbookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/guestbook")
public class LookupGuestbookController extends HttpServlet {

    private final GuestbookService guestbookService = Container.guestbookService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Guestbook> list = guestbookService.getGuestbooks();
        request.setAttribute("guestbookList", list);

        request.getRequestDispatcher("/WEB-INF/view/guestbookView.jsp").forward(request, response);
    }
}
