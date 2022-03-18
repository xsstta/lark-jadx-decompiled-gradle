package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.C20648b;
import com.bytedance.retrofit2.mime.C20650d;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.AbstractC69698d;

public final class RequestBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private boolean addCommonParam;
    private String apiUrl;
    private TypedOutput body;
    private String contentTypeHeader;
    private Object extraInfo;
    private final C20648b formBody;
    private final boolean hasBody;
    private List<Header> headers;
    private int maxLength;
    private String method;
    private final C20650d multipartBody;
    private MultipartBody.Builder multipartBuilder;
    private int priorityLevel;
    private String queryObjectParams;
    private StringBuilder queryParams;
    private String relativeUrl;
    private RequestBody requestBody;
    private int requestPriorityLevel;
    private boolean responseStreaming;
    private final AbstractC20595d server;
    private String serviceType;
    private Map<Class<?>, Object> tags = new LinkedHashMap();
    private boolean useRequestBody;

    /* access modifiers changed from: package-private */
    public void useRequestBody() {
        this.useRequestBody = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.RequestBuilder$b */
    public static class C20574b implements TypedOutput {

        /* renamed from: a */
        private final TypedOutput f50144a;

        /* renamed from: b */
        private final String f50145b;

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String mimeType() {
            return this.f50145b;
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String fileName() {
            return this.f50144a.fileName();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public long length() {
            return this.f50144a.length();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String md5Stub() {
            return this.f50144a.md5Stub();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public void writeTo(OutputStream outputStream) throws IOException {
            this.f50144a.writeTo(outputStream);
        }

        C20574b(TypedOutput typedOutput, String str) {
            this.f50144a = typedOutput;
            this.f50145b = str;
        }
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public TypedOutput getBody() {
        return this.body;
    }

    public Object getExtraInfo() {
        return this.extraInfo;
    }

    public List<Header> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRelativeUrl() {
        return this.relativeUrl;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.RequestBuilder$a */
    public static class C20573a extends RequestBody {

        /* renamed from: a */
        private final RequestBody f50142a;

        /* renamed from: b */
        private final String f50143b;

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.f50142a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.parse(this.f50143b);
        }

        @Override // okhttp3.RequestBody
        public void writeTo(AbstractC69698d dVar) throws IOException {
            this.f50142a.writeTo(dVar);
        }

        C20573a(RequestBody requestBody, String str) {
            this.f50142a = requestBody;
            this.f50143b = str;
        }
    }

    public void setAddCommonParam(boolean z) {
        this.addCommonParam = z;
    }

    public void setApiUrl(String str) {
        this.apiUrl = str;
    }

    public void setBody(TypedOutput typedOutput) {
        this.body = typedOutput;
    }

    public void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public void setHeaders(List<Header> list) {
        this.headers = list;
    }

    public void setMaxLength(int i) {
        this.maxLength = i;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setPriorityLevel(int i) {
        this.priorityLevel = i;
    }

    /* access modifiers changed from: package-private */
    public void setQueryObjectParams(String str) {
        this.queryObjectParams = str;
    }

    public void setResponseStreaming(boolean z) {
        this.responseStreaming = z;
    }

    /* access modifiers changed from: package-private */
    public void setBody(RequestBody requestBody2) {
        this.requestBody = requestBody2;
    }

    /* access modifiers changed from: package-private */
    public void setRelativeUrl(Object obj) {
        Objects.requireNonNull(obj, "@Url parameter is null.");
        this.relativeUrl = obj.toString();
    }

    /* access modifiers changed from: package-private */
    public void addPart(MultipartBody.Part part) {
        this.multipartBuilder.addPart(part);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x017b */
    /* JADX DEBUG: Multi-variable search result rejected for r15v2, resolved type: com.bytedance.retrofit2.mime.b */
    /* JADX DEBUG: Multi-variable search result rejected for r15v3, resolved type: com.bytedance.retrofit2.mime.b */
    /* JADX DEBUG: Multi-variable search result rejected for r15v5, resolved type: com.bytedance.retrofit2.mime.b */
    /* JADX DEBUG: Multi-variable search result rejected for r15v12, resolved type: com.bytedance.retrofit2.mime.b */
    /* JADX DEBUG: Multi-variable search result rejected for r15v13, resolved type: com.bytedance.retrofit2.mime.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public Request build(ExpandCallback expandCallback) {
        StringBuilder sb;
        C20648b bVar;
        RequestBody requestBody2;
        List<Header> list;
        C20574b bVar2;
        String str;
        String str2;
        C20650d dVar = this.multipartBody;
        if (dVar == null || dVar.mo69482a() != 0 || this.useRequestBody) {
            String a = this.server.mo69392a();
            if (C20632i.m75007b()) {
                HttpUrl parse = HttpUrl.parse(a);
                if (parse == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + parse + ", Relative: " + this.relativeUrl);
                } else if (parse.encodedPath() == null || parse.encodedPath().length() <= 0 || !"/".equals(this.relativeUrl)) {
                    HttpUrl resolve = parse.resolve(this.relativeUrl);
                    if (resolve != null) {
                        sb = new StringBuilder(resolve.toString());
                    } else {
                        throw new IllegalArgumentException("Malformed URL. Base: " + parse + ", Relative: " + this.relativeUrl);
                    }
                } else {
                    sb = newUrlBuilder(a, this.relativeUrl);
                }
            } else {
                try {
                    URI create = URI.create(a);
                    if (create.getPath() == null || create.getPath().length() < 1 || !"/".equals(this.relativeUrl)) {
                        sb = new StringBuilder(create.resolve(this.relativeUrl).toString());
                    } else {
                        sb = newUrlBuilder(a, this.relativeUrl);
                    }
                } catch (Throwable unused) {
                    String str3 = this.relativeUrl;
                    if (str3 == null || (!str3.startsWith("http://") && !this.relativeUrl.startsWith("https://"))) {
                        sb = newUrlBuilder(a, this.relativeUrl);
                    } else {
                        sb = new StringBuilder(this.relativeUrl);
                    }
                }
            }
            StringBuilder sb2 = this.queryParams;
            if (sb2 != null) {
                if (!('?' != sb2.charAt(0) || (str2 = this.relativeUrl) == null || str2.indexOf(63) == -1)) {
                    sb2.setCharAt(0, '&');
                }
                sb.append((CharSequence) sb2);
            }
            String str4 = this.queryObjectParams;
            if (str4 != null) {
                sb.append(str4);
            }
            this.apiUrl = sb.toString();
            if (expandCallback instanceof ExpandCallback) {
                expandCallback.onAsyncPreRequest(this);
            }
            TypedOutput typedOutput = this.body;
            List<Header> list2 = this.headers;
            RequestBody requestBody3 = this.requestBody;
            C20573a aVar = null;
            if (this.useRequestBody) {
                if (requestBody3 == null) {
                    MultipartBody.Builder builder = this.multipartBuilder;
                    if (builder != null) {
                        requestBody3 = builder.build();
                    } else if (this.hasBody) {
                        requestBody3 = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
                if (requestBody3 == null || (str = this.contentTypeHeader) == null) {
                    list = list2;
                    requestBody2 = requestBody3;
                    bVar = typedOutput;
                    if (bVar == 0 && C20653o.m75104a(this.method) && !this.useRequestBody) {
                        bVar = new C20648b();
                        bVar.mo69480a("body", "null");
                    }
                    return new Request(this.method, this.apiUrl, list, bVar, requestBody2, this.priorityLevel, this.requestPriorityLevel, this.responseStreaming, this.maxLength, this.addCommonParam, this.extraInfo, this.serviceType, this.tags);
                }
                aVar = new C20573a(requestBody3, str);
            } else {
                String str5 = this.contentTypeHeader;
                if (str5 != null) {
                    if (typedOutput != null) {
                        list = list2;
                        bVar2 = new C20574b(typedOutput, str5);
                        requestBody2 = aVar;
                        bVar = bVar2;
                        bVar = new C20648b();
                        bVar.mo69480a("body", "null");
                        return new Request(this.method, this.apiUrl, list, bVar, requestBody2, this.priorityLevel, this.requestPriorityLevel, this.responseStreaming, this.maxLength, this.addCommonParam, this.extraInfo, this.serviceType, this.tags);
                    }
                    Header header = new Header("Content-Type", str5);
                    if (list2 == null) {
                        list2 = Collections.singletonList(header);
                    } else {
                        list2.add(header);
                    }
                }
            }
            list = list2;
            bVar2 = typedOutput;
            requestBody2 = aVar;
            bVar = bVar2;
            bVar = new C20648b();
            bVar.mo69480a("body", "null");
            return new Request(this.method, this.apiUrl, list, bVar, requestBody2, this.priorityLevel, this.requestPriorityLevel, this.responseStreaming, this.maxLength, this.addCommonParam, this.extraInfo, this.serviceType, this.tags);
        }
        throw new IllegalStateException("Multipart requests must contain at least one part.");
    }

    public void addPart(String str, TypedOutput typedOutput) {
        this.multipartBody.mo69483a(str, typedOutput);
    }

    public <T> void addTag(Class<? super T> cls, T t) {
        this.tags.put(cls, cls.cast(t));
    }

    private StringBuilder newUrlBuilder(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    /* access modifiers changed from: package-private */
    public void addPart(Headers headers2, RequestBody requestBody2) {
        this.multipartBuilder.addPart(headers2, requestBody2);
    }

    /* access modifiers changed from: package-private */
    public void addHeader(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            this.contentTypeHeader = str2;
        } else {
            List list = this.headers;
            if (list == null) {
                list = new ArrayList(2);
                this.headers = list;
            }
            list.add(new Header(str, str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void setMethod(String str, String str2) {
        String str3 = this.method;
        if (str3 != null) {
            this.method = str3.replace("{" + str + "}", str2);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void addFormField(String str, String str2, boolean z) {
        this.formBody.mo69481a(str, z, str2.toString(), z);
    }

    public void addPart(String str, String str2, TypedOutput typedOutput) {
        this.multipartBody.mo69484a(str, str2, typedOutput);
    }

    /* access modifiers changed from: package-private */
    public void addQueryParam(String str, String str2, boolean z) {
        char c;
        if (str != null) {
            try {
                StringBuilder sb = this.queryParams;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.queryParams = sb;
                }
                if (sb.length() > 0) {
                    c = '&';
                } else {
                    c = '?';
                }
                sb.append(c);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                }
                if (z) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 == null || str2.isEmpty()) {
                    sb.append(str);
                    return;
                }
                sb.append(str);
                sb.append('=');
                sb.append(str2);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e);
            }
        } else {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    public void addPathParam(String str, String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 == null) {
            throw new AssertionError();
        } else if (str == null) {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        } else if (str2 == null) {
            throw new IllegalArgumentException("Path replacement \"" + str + "\" value must not be null.");
        } else if (z) {
            try {
                String replace = URLEncoder.encode(String.valueOf(str2), "UTF-8").replace("+", "%20");
                String str4 = this.relativeUrl;
                this.relativeUrl = str4.replace("{" + str + "}", replace);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to convert path parameter \"" + str + "\" value to UTF-8:" + str2, e);
            }
        } else {
            this.relativeUrl = str3.replace("{" + str + "}", String.valueOf(str2));
        }
    }

    RequestBuilder(String str, AbstractC20595d dVar, String str2, List<Header> list, String str3, int i, int i2, boolean z, int i3, boolean z2, Object obj, boolean z3, boolean z4, boolean z5, String str4) {
        this.method = str;
        this.server = dVar;
        this.relativeUrl = str2;
        this.contentTypeHeader = str3;
        this.priorityLevel = i;
        this.requestPriorityLevel = i2;
        this.responseStreaming = z;
        this.maxLength = i3;
        this.addCommonParam = z2;
        this.extraInfo = obj;
        this.hasBody = z3;
        this.headers = list;
        this.serviceType = str4;
        if (z4) {
            C20648b bVar = new C20648b();
            this.formBody = bVar;
            this.multipartBody = null;
            this.body = bVar;
            this.multipartBuilder = null;
        } else if (z5) {
            this.formBody = null;
            C20650d dVar2 = new C20650d();
            this.multipartBody = dVar2;
            this.body = dVar2;
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.multipartBuilder = builder;
            builder.setType(MultipartBody.FORM);
        } else {
            this.formBody = null;
            this.multipartBody = null;
            this.multipartBuilder = null;
        }
    }
}
