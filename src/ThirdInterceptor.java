import java.io.IOException;

public class ThirdInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(ThirdInterceptor.class.getSimpleName());
        return chain.proceed(chain.request());
    }
}
