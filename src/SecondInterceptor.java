import java.io.IOException;

public class SecondInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(SecondInterceptor.class.getSimpleName());
        return chain.proceed(chain.request());
    }
}
