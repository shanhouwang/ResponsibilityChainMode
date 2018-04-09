import java.io.IOException;

public class CallServerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(CallServerInterceptor.class.getSimpleName());
        return new Response();
    }
}
