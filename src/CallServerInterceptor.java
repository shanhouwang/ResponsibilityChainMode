import java.io.IOException;

/**
 * 这个是真正处理请求的类
 */
public class CallServerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(CallServerInterceptor.class.getSimpleName());
        return new Response(chain.request());
    }
}
