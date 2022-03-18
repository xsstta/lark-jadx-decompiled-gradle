package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.ext.AbstractC20631a;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.h */
public abstract class AbstractC20605h<T> {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo69398a(RequestBuilder requestBuilder, T t) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$c */
    public static final class C20610c extends AbstractC20605h<RequestBody> {

        /* renamed from: a */
        static final C20610c f50211a = new C20610c();

        C20610c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, RequestBody requestBody) {
            if (requestBody != null) {
                requestBuilder.setBody(requestBody);
                requestBuilder.useRequestBody();
                return;
            }
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$f */
    public static final class C20613f extends AbstractC20605h<MultipartBody.Part> {

        /* renamed from: a */
        static final C20613f f50214a = new C20613f();

        C20613f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, MultipartBody.Part part) throws IOException {
            if (part != null) {
                requestBuilder.addPart(part);
            }
            requestBuilder.useRequestBody();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$u */
    public static final class C20628u<T> extends AbstractC20605h<T> {
        C20628u() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                if (t instanceof AbstractC20631a) {
                    requestBuilder.setQueryObjectParams(t.mo69438a());
                    return;
                }
                throw new RuntimeException("wrong type:" + t.getClass() + ",not implement QueryParamObject");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$v */
    public static final class C20629v extends AbstractC20605h<Object> {
        C20629v() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, Object obj) {
            requestBuilder.setRelativeUrl(obj);
        }
    }

    AbstractC20605h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC20605h<Iterable<T>> mo69397a() {
        return new AbstractC20605h<Iterable<T>>() {
            /* class com.bytedance.retrofit2.AbstractC20605h.C206061 */

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.retrofit2.AbstractC20605h
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
                mo69400a(requestBuilder, (Iterable) ((Iterable) obj));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo69400a(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T t : iterable) {
                        AbstractC20605h.this.mo69398a(requestBuilder, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC20605h<Object> mo69399b() {
        return new AbstractC20605h<Object>() {
            /* class com.bytedance.retrofit2.AbstractC20605h.C206072 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.retrofit2.h */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.retrofit2.AbstractC20605h
            /* renamed from: a */
            public void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        AbstractC20605h.this.mo69398a(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$d */
    public static final class C20611d extends AbstractC20605h<RequestBody> {

        /* renamed from: a */
        private final Headers f50212a;

        C20611d(Headers headers) {
            this.f50212a = headers;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, RequestBody requestBody) {
            if (requestBody != null) {
                requestBuilder.addPart(this.f50212a, requestBody);
                requestBuilder.useRequestBody();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$e */
    public static final class C20612e extends AbstractC20605h<Map<String, RequestBody>> {

        /* renamed from: a */
        private final String f50213a;

        C20612e(String str) {
            this.f50213a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, Map<String, RequestBody> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, RequestBody> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        RequestBody value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f50213a), value);
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                requestBuilder.useRequestBody();
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$k */
    public static final class C20618k<T> extends AbstractC20605h<List<T>> {

        /* renamed from: a */
        private final Converter<T, Header> f50223a;

        C20618k(Converter<T, Header> converter) {
            this.f50223a = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
            mo69406a(requestBuilder, (List) ((List) obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69406a(RequestBuilder requestBuilder, List<T> list) throws IOException {
            if (list != null) {
                for (T t : list) {
                    Header b = this.f50223a.mo51796b(t);
                    requestBuilder.addHeader(b.getName(), b.getValue());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$l */
    public static final class C20619l<T> extends AbstractC20605h<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, String> f50224a;

        C20619l(Converter<T, String> converter) {
            this.f50224a = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
            mo69407a(requestBuilder, (Map) ((Map) obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69407a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(key, this.f50224a.mo51796b(value));
                        } else {
                            throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$w */
    public static final class C20630w<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        final Class<T> f50242a;

        C20630w(Class<T> cls) {
            this.f50242a = cls;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) {
            requestBuilder.addTag(this.f50242a, t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$a */
    public static final class C20608a<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final Converter<T, String> f50208a;

        C20608a(Converter<T, String> converter) {
            this.f50208a = (Converter) C20653o.m75097a((Object) converter, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.setAddCommonParam(Boolean.parseBoolean(this.f50208a.mo51796b(t)));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to AddCommonParam", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$g */
    public static final class C20614g<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final Converter<T, Object> f50215a;

        C20614g(Converter<T, Object> converter) {
            this.f50215a = (Converter) C20653o.m75097a((Object) converter, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.setExtraInfo(this.f50215a.mo51796b(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to ExtraInfo", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$m */
    public static final class C20620m<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final Converter<T, String> f50225a;

        C20620m(Converter<T, String> converter) {
            this.f50225a = (Converter) C20653o.m75097a((Object) converter, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.setMaxLength(Integer.parseInt(this.f50225a.mo51796b(t)));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to MaxLength", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$b */
    public static final class C20609b<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final boolean f50209a;

        /* renamed from: b */
        private final Converter<T, TypedOutput> f50210b;

        C20609b(boolean z, Converter<T, TypedOutput> converter) {
            this.f50209a = z;
            this.f50210b = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.f50210b.mo51796b(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to TypedOutput", e);
                }
            } else if (!this.f50209a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$i */
    public static final class C20616i<T> extends AbstractC20605h<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, String> f50219a;

        /* renamed from: b */
        private final boolean f50220b;

        C20616i(Converter<T, String> converter, boolean z) {
            this.f50219a = converter;
            this.f50220b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
            mo69405a(requestBuilder, (Map) ((Map) obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69405a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addFormField(key, this.f50219a.mo51796b(value), this.f50220b);
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$o */
    public static final class C20622o<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final String f50228a;

        /* renamed from: b */
        private final Converter<T, TypedOutput> f50229b;

        C20622o(String str, Converter<T, TypedOutput> converter) {
            this.f50228a = str;
            this.f50229b = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.addPart(this.f50228a, this.f50229b.mo51796b(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$p */
    public static final class C20623p<T> extends AbstractC20605h<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, TypedOutput> f50230a;

        /* renamed from: b */
        private final String f50231b;

        C20623p(Converter<T, TypedOutput> converter, String str) {
            this.f50230a = converter;
            this.f50231b = str;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
            mo69408a(requestBuilder, (Map) ((Map) obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69408a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addPart(key, this.f50231b, this.f50230a.mo51796b(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$s */
    public static final class C20626s<T> extends AbstractC20605h<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, String> f50238a;

        /* renamed from: b */
        private final boolean f50239b;

        C20626s(Converter<T, String> converter, boolean z) {
            this.f50238a = converter;
            this.f50239b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo69398a(RequestBuilder requestBuilder, Object obj) throws IOException {
            mo69409a(requestBuilder, (Map) ((Map) obj));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69409a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addQueryParam(key, this.f50238a.mo51796b(value), this.f50239b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$t */
    public static final class C20627t<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final Converter<T, String> f50240a;

        /* renamed from: b */
        private final boolean f50241b;

        C20627t(Converter<T, String> converter, boolean z) {
            this.f50240a = converter;
            this.f50241b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam(this.f50240a.mo51796b(t), null, this.f50241b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$j */
    public static final class C20617j<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final String f50221a;

        /* renamed from: b */
        private final Converter<T, String> f50222b;

        C20617j(String str, Converter<T, String> converter) {
            this.f50221a = (String) C20653o.m75097a((Object) str, "name == null");
            this.f50222b = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addHeader(this.f50221a, this.f50222b.mo51796b(t));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$n */
    public static final class C20621n<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final String f50226a;

        /* renamed from: b */
        private final Converter<T, String> f50227b;

        C20621n(String str, Converter<T, String> converter) {
            this.f50226a = (String) C20653o.m75097a((Object) str, "name == null");
            this.f50227b = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.setMethod(this.f50226a, this.f50227b.mo51796b(t));
                return;
            }
            throw new IllegalArgumentException("Method parameter \"" + this.f50226a + "\" value must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$h */
    public static final class C20615h<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final String f50216a;

        /* renamed from: b */
        private final Converter<T, String> f50217b;

        /* renamed from: c */
        private final boolean f50218c;

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addFormField(this.f50216a, this.f50217b.mo51796b(t), this.f50218c);
            }
        }

        C20615h(String str, Converter<T, String> converter, boolean z) {
            this.f50216a = (String) C20653o.m75097a((Object) str, "name == null");
            this.f50217b = converter;
            this.f50218c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$r */
    public static final class C20625r<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final String f50235a;

        /* renamed from: b */
        private final Converter<T, String> f50236b;

        /* renamed from: c */
        private final boolean f50237c;

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam(this.f50235a, this.f50236b.mo51796b(t), this.f50237c);
            }
        }

        C20625r(String str, Converter<T, String> converter, boolean z) {
            this.f50235a = (String) C20653o.m75097a((Object) str, "name == null");
            this.f50236b = converter;
            this.f50237c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$q */
    public static final class C20624q<T> extends AbstractC20605h<T> {

        /* renamed from: a */
        private final String f50232a;

        /* renamed from: b */
        private final Converter<T, String> f50233b;

        /* renamed from: c */
        private final boolean f50234c;

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC20605h
        /* renamed from: a */
        public void mo69398a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.f50232a, this.f50233b.mo51796b(t), this.f50234c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f50232a + "\" value must not be null.");
        }

        C20624q(String str, Converter<T, String> converter, boolean z) {
            this.f50232a = (String) C20653o.m75097a((Object) str, "name == null");
            this.f50233b = converter;
            this.f50234c = z;
        }
    }
}
