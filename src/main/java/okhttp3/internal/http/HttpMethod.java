package okhttp3.internal.http;

public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean permitsRequestBody(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static boolean invalidatesCache(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean requiresRequestBody(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }
}
