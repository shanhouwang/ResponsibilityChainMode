import java.io.IOException;

/**
 * @author Devin
 */
public interface Interceptor {

    Response intercept(Chain chain) throws IOException;

    interface Chain {

        Request request();

        Response proceed(Request request) throws IOException;
    }
}
