import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet("/hello")
public class MyServlet extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try (ServletOutputStream os = resp.getOutputStream()) {
//            os.print("Hello1");
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("был обработан GET");
        try (ServletOutputStream os = httpServletResponse.getOutputStream()) {
            os.print("вот тут мы обрабатываем GET");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("был обработан POST");
        try (ServletOutputStream os = httpServletResponse.getOutputStream()) {
            os.print("вот тут мы обрабатываем POST");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}