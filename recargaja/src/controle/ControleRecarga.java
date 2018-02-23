package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RecargaDao;
import entity.Recarga;

@WebServlet("/ControleRecarga")
public class ControleRecarga extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ControleRecarga() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "cadastrar":cadastrar(request, response);
		case "listar":listar(request, response);
			break;

		}
	}
	
	
	protected void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		try {
			
			String data = request.getParameter("data");
			String recarga = request.getParameter("recarga");
			String status = request.getParameter("status");
			
			Recarga r1 = new Recarga();
			r1.setData(data);
			r1.setRecarga(Integer.parseInt(recarga));
			r1.setStatus(status);
			
			RecargaDao rd = new RecargaDao();
			rd.gravarDados(r1);
			
			request.setAttribute("msg", "Dados gravados com sucesso!");
			
		}
		catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			e.printStackTrace();
		}
		finally {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
	
	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			RecargaDao rd = new RecargaDao();
			List<String>lista = rd.listar();
			request.setAttribute("lista", lista);
					
		}
		catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			e.printStackTrace();
		}
		finally {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}




