import java.io.IOException;
import java.util.List;

public class RealChain implements Interceptor.Chain {


    public final Request request;

    private final List<Interceptor> interceptors;

    private int index;

    public RealChain(List<Interceptor> interceptors, Request request, int index) {
        this.request = request;
        this.interceptors = interceptors;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) throws IOException {

        if (index >= interceptors.size()) {
            throw new AssertionError();
        }

        RealChain chain = new RealChain(interceptors, request, index + 1);
        Interceptor interceptor = interceptors.get(index);
        return interceptor.intercept(chain);
    }
}
