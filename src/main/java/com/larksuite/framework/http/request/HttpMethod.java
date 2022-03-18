package com.larksuite.framework.http.request;

public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    PATCH("PATCH"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");
    
    private final String value;

    public String toString() {
        return this.value;
    }

    /* renamed from: com.larksuite.framework.http.request.HttpMethod$1 */
    static /* synthetic */ class C260091 {

        /* renamed from: a */
        static final /* synthetic */ int[] f64368a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.larksuite.framework.http.request.HttpMethod[] r0 = com.larksuite.framework.http.request.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.framework.http.request.HttpMethod.C260091.f64368a = r0
                com.larksuite.framework.http.request.HttpMethod r1 = com.larksuite.framework.http.request.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.framework.http.request.HttpMethod.C260091.f64368a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.framework.http.request.HttpMethod r1 = com.larksuite.framework.http.request.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.http.request.HttpMethod.C260091.<clinit>():void");
        }
    }

    public boolean hasBody() {
        int i = C260091.f64368a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    private HttpMethod(String str) {
        this.value = str;
    }
}
