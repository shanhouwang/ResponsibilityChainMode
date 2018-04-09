import java.io.IOException;

public class FirstInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(FirstInterceptor.class.getSimpleName() + " intercept begin");
        Response response = chain.proceed(chain.request());
        Util.println(FirstInterceptor.class.getSimpleName() + "intercept end");
        return response;
    }
}
