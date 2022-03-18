package retrofit2;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient C70212b<?> response;

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public C70212b<?> response() {
        return this.response;
    }

    public HttpException(C70212b<?> bVar) {
        super(getMessage(bVar));
        this.code = bVar.mo247388a();
        this.message = bVar.mo247389b();
        this.response = bVar;
    }

    private static String getMessage(C70212b<?> bVar) {
        C70215d.m269046a(bVar, "response == null");
        return "HTTP " + bVar.mo247388a() + " " + bVar.mo247389b();
    }
}
