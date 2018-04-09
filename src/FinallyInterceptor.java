import java.io.IOException;

public class FinallyInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(FinallyInterceptor.class.getSimpleName());
        return new Response();
    }
}
