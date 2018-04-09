import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Request request = new Request();
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new FirstInterceptor());
        interceptors.add(new SecondInterceptor());
        interceptors.add(new ThirdInterceptor());
        interceptors.add(new FinallyInterceptor());
        RealChain chain = new RealChain(interceptors, request, 0);
        try {
            chain.proceed(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
