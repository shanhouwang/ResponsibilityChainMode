import java.io.IOException;

public class FirstInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(FirstInterceptor.class.getSimpleName());
        return chain.proceed(chain.request());
    }
}
