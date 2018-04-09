import java.io.IOException;

public class SecondInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(SecondInterceptor.class.getSimpleName() + " intercept begin");
        Response response = chain.proceed(chain.request());
        Util.println(SecondInterceptor.class.getSimpleName() + "intercept end");
        return response;
    }
}
