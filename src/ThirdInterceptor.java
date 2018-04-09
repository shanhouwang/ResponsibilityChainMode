import java.io.IOException;

public class ThirdInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Util.println(ThirdInterceptor.class.getSimpleName() + " intercept begin");
        Response response = chain.proceed(chain.request());
        Util.println(ThirdInterceptor.class.getSimpleName() + "intercept end");
        return response;
    }
}
