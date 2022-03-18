package com.bytedance.retrofit2.client;

import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.C20653o;
import com.bytedance.retrofit2.mime.C20648b;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.RequestBody;

public final class Request {
    public final boolean addCommonParam;
    public final TypedOutput body;
    public Object extraInfo;
    public final List<Header> headers;
    public final int maxLength;
    public final String method;
    public C20639k metrics;
    public final int priorityLevel;
    private int queryFilterPriority;
    public final RequestBody requestBody;
    public final int requestPriorityLevel;
    public final boolean responseStreaming;
    public String serviceType;
    public Map<Class<?>, Object> tags;
    public final String url;

    public Object getExtraInfo() {
        return this.extraInfo;
    }

    public List<Header> getHeaders() {
        return this.headers;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public String getMethod() {
        return this.method;
    }

    public C20639k getMetrics() {
        return this.metrics;
    }

    public int getPriorityLevel() {
        return this.priorityLevel;
    }

    public int getQueryFilterPriority() {
        return this.queryFilterPriority;
    }

    public RequestBody getRequestBody() {
        return this.requestBody;
    }

    public int getRequestPriorityLevel() {
        return this.requestPriorityLevel;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    /* renamed from: com.bytedance.retrofit2.client.Request$a */
    public static class C20591a {

        /* renamed from: a */
        String f50177a;

        /* renamed from: b */
        String f50178b;

        /* renamed from: c */
        List<Header> f50179c;

        /* renamed from: d */
        TypedOutput f50180d;

        /* renamed from: e */
        RequestBody f50181e;

        /* renamed from: f */
        int f50182f;

        /* renamed from: g */
        int f50183g;

        /* renamed from: h */
        boolean f50184h;

        /* renamed from: i */
        int f50185i;

        /* renamed from: j */
        boolean f50186j;

        /* renamed from: k */
        Object f50187k;

        /* renamed from: l */
        String f50188l;

        /* renamed from: m */
        C20639k f50189m;

        /* renamed from: n */
        Map<Class<?>, Object> f50190n;

        public C20591a() {
            this.f50177a = "GET";
        }

        /* renamed from: a */
        public C20591a mo69375a() {
            return mo69378a("GET", null);
        }

        /* renamed from: b */
        public Request mo69380b() {
            if (this.f50178b != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: a */
        public C20591a mo69376a(int i) {
            this.f50185i = i;
            return this;
        }

        /* renamed from: a */
        public C20591a mo69377a(String str) {
            Objects.requireNonNull(str, "url == null");
            this.f50178b = str;
            return this;
        }

        /* renamed from: a */
        public C20591a mo69379a(List<Header> list) {
            this.f50179c = list;
            return this;
        }

        C20591a(Request request) {
            this.f50177a = request.method;
            this.f50178b = request.url;
            LinkedList linkedList = new LinkedList();
            this.f50179c = linkedList;
            linkedList.addAll(request.headers);
            this.f50180d = request.body;
            this.f50181e = request.requestBody;
            this.f50182f = request.priorityLevel;
            this.f50183g = request.requestPriorityLevel;
            this.f50184h = request.responseStreaming;
            this.f50185i = request.maxLength;
            this.f50186j = request.addCommonParam;
            this.f50187k = request.extraInfo;
            this.f50188l = request.serviceType;
            this.f50189m = request.metrics;
            this.f50190n = request.tags;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0030 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.bytedance.retrofit2.mime.TypedOutput] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.bytedance.retrofit2.mime.TypedOutput] */
        /* JADX WARN: Type inference failed for: r4v3, types: [com.bytedance.retrofit2.mime.b] */
        /* renamed from: a */
        public C20591a mo69378a(String str, TypedOutput typedOutput) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (typedOutput == 0 || C20653o.m75110b(str)) {
                if (typedOutput == 0 && C20653o.m75104a(str)) {
                    typedOutput = new C20648b();
                    typedOutput.mo69480a("body", "null");
                }
                this.f50177a = str;
                this.f50180d = typedOutput;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
        }
    }

    public C20591a newBuilder() {
        return new C20591a(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public TypedOutput getBody() {
        RequestBody requestBody2 = this.requestBody;
        if (requestBody2 != null) {
            return C20653o.m75094a(requestBody2);
        }
        return this.body;
    }

    public String getHost() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getHost();
    }

    public String getPath() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getPath();
    }

    public void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public void setMetrics(C20639k kVar) {
        this.metrics = kVar;
    }

    public void setQueryFilterPriority(int i) {
        this.queryFilterPriority = i;
    }

    public <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }

    private static URI createUriWithOutQuery(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static URI safeCreateUri(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return createUriWithOutQuery(str);
            }
        }
    }

    public Header getFirstHeader(String str) {
        List<Header> list;
        if (!(str == null || (list = this.headers) == null)) {
            for (Header header : list) {
                if (str.equalsIgnoreCase(header.getName())) {
                    return header;
                }
            }
        }
        return null;
    }

    public List<Header> headers(String str) {
        List<Header> list;
        ArrayList arrayList = null;
        if (!(str == null || (list = this.headers) == null)) {
            for (Header header : list) {
                if (str.equalsIgnoreCase(header.getName())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(header);
                }
            }
        }
        return arrayList;
    }

    Request(C20591a aVar) {
        Objects.requireNonNull(aVar.f50178b, "URL must not be null.");
        this.url = aVar.f50178b;
        Objects.requireNonNull(aVar.f50177a, "Method must not be null.");
        this.method = aVar.f50177a;
        if (aVar.f50179c == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(aVar.f50179c));
        }
        this.body = aVar.f50180d;
        this.requestBody = aVar.f50181e;
        this.priorityLevel = aVar.f50182f;
        this.requestPriorityLevel = aVar.f50183g;
        this.responseStreaming = aVar.f50184h;
        this.maxLength = aVar.f50185i;
        this.addCommonParam = aVar.f50186j;
        this.extraInfo = aVar.f50187k;
        this.serviceType = aVar.f50188l;
        this.metrics = aVar.f50189m;
        this.tags = aVar.f50190n;
    }

    public Request(String str, String str2, List<Header> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, null, i, 3, z, i2, z2, obj, "", null);
    }

    public Request(String str, String str2, List<Header> list, TypedOutput typedOutput, RequestBody requestBody2, int i, int i2, boolean z, int i3, boolean z2, Object obj, String str3, Map<Class<?>, Object> map) {
        Objects.requireNonNull(str, "Method must not be null.");
        Objects.requireNonNull(str2, "URL must not be null.");
        this.method = str;
        this.url = str2;
        if (list == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(list));
        }
        this.body = typedOutput;
        this.requestBody = requestBody2;
        this.priorityLevel = i;
        this.requestPriorityLevel = i2;
        this.responseStreaming = z;
        this.maxLength = i3;
        this.addCommonParam = z2;
        this.extraInfo = obj;
        this.serviceType = str3;
        this.tags = map;
    }
}
