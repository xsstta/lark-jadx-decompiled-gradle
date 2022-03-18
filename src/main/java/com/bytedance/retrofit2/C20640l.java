package com.bytedance.retrofit2;

import android.text.TextUtils;
import com.bytedance.retrofit2.AbstractC20605h;
import com.bytedance.retrofit2.client.AbstractC20592a;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.DELETE;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HEAD;
import com.bytedance.retrofit2.http.HTTP;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.HeaderMap;
import com.bytedance.retrofit2.http.Headers;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Multipart;
import com.bytedance.retrofit2.http.OPTIONS;
import com.bytedance.retrofit2.http.PATCH;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PUT;
import com.bytedance.retrofit2.http.Part;
import com.bytedance.retrofit2.http.PartMap;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Priority;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.QueryName;
import com.bytedance.retrofit2.http.RequestPriority;
import com.bytedance.retrofit2.http.ServiceType;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Tag;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.http.ext.AbstractC20631a;
import com.bytedance.retrofit2.http.ext.QueryObject;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p893a.AbstractC20587a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.l */
public final class C20640l<T> {

    /* renamed from: a */
    static final Pattern f50297a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f50298b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: A */
    private C20639k f50299A;

    /* renamed from: c */
    final AbstractC20592a.AbstractC20593a f50300c;

    /* renamed from: d */
    final CallAdapter<?> f50301d;

    /* renamed from: e */
    final List<Interceptor> f50302e;

    /* renamed from: f */
    final Executor f50303f;

    /* renamed from: g */
    final int f50304g;

    /* renamed from: h */
    final int f50305h;

    /* renamed from: i */
    final String f50306i;

    /* renamed from: j */
    final boolean f50307j;

    /* renamed from: k */
    final int f50308k;

    /* renamed from: l */
    final boolean f50309l;

    /* renamed from: m */
    final Object f50310m;

    /* renamed from: n */
    final Method f50311n;

    /* renamed from: o */
    final AbstractC20587a f50312o;

    /* renamed from: p */
    private final AbstractC20595d f50313p;

    /* renamed from: q */
    private final Converter<TypedInput, T> f50314q;

    /* renamed from: r */
    private final String f50315r;

    /* renamed from: s */
    private final String f50316s;

    /* renamed from: t */
    private final boolean f50317t;

    /* renamed from: u */
    private final boolean f50318u;

    /* renamed from: v */
    private final boolean f50319v;

    /* renamed from: w */
    private final boolean f50320w;

    /* renamed from: x */
    private final AbstractC20605h<?>[] f50321x;

    /* renamed from: y */
    private List<Header> f50322y;

    /* renamed from: z */
    private String f50323z;

    /* renamed from: a */
    public C20639k mo69451a() {
        return this.f50299A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.l$a */
    public static final class C20641a<T> {

        /* renamed from: A */
        List<Header> f50324A;

        /* renamed from: B */
        String f50325B;

        /* renamed from: C */
        Set<String> f50326C;

        /* renamed from: D */
        String f50327D;

        /* renamed from: E */
        AbstractC20605h<?>[] f50328E;

        /* renamed from: F */
        Converter<TypedInput, T> f50329F;

        /* renamed from: G */
        CallAdapter<?> f50330G;

        /* renamed from: a */
        final Retrofit f50331a;

        /* renamed from: b */
        final Method f50332b;

        /* renamed from: c */
        final Annotation[] f50333c;

        /* renamed from: d */
        final Annotation[][] f50334d;

        /* renamed from: e */
        final Type[] f50335e;

        /* renamed from: f */
        int f50336f = 1;

        /* renamed from: g */
        String f50337g = "";

        /* renamed from: h */
        boolean f50338h;

        /* renamed from: i */
        int f50339i = -1;

        /* renamed from: j */
        boolean f50340j = true;

        /* renamed from: k */
        boolean f50341k;

        /* renamed from: l */
        Object f50342l;

        /* renamed from: m */
        int f50343m = 3;

        /* renamed from: n */
        Type f50344n;

        /* renamed from: o */
        boolean f50345o;

        /* renamed from: p */
        boolean f50346p;

        /* renamed from: q */
        boolean f50347q;

        /* renamed from: r */
        boolean f50348r;

        /* renamed from: s */
        boolean f50349s;

        /* renamed from: t */
        boolean f50350t;

        /* renamed from: u */
        boolean f50351u;

        /* renamed from: v */
        String f50352v;

        /* renamed from: w */
        boolean f50353w;

        /* renamed from: x */
        boolean f50354x;

        /* renamed from: y */
        boolean f50355y;

        /* renamed from: z */
        String f50356z;

        /* renamed from: a */
        public C20640l mo69454a() {
            CallAdapter<?> b = m75049b();
            this.f50330G = b;
            Type a = b.mo69251a();
            this.f50344n = a;
            if (a != Response.class) {
                this.f50329F = m75053c();
                Annotation[] annotationArr = this.f50333c;
                for (Annotation annotation : annotationArr) {
                    m75048a(annotation);
                    if (C20632i.m75007b()) {
                        m75052b(annotation);
                    }
                }
                if (this.f50352v != null) {
                    if (!this.f50353w && !this.f50341k) {
                        if (this.f50355y) {
                            throw m75041a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        } else if (this.f50354x) {
                            throw m75041a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = this.f50334d.length;
                    this.f50328E = new AbstractC20605h[length];
                    for (int i = 0; i < length; i++) {
                        Type type = this.f50335e[i];
                        if (!C20653o.m75112d(type)) {
                            Annotation[] annotationArr2 = this.f50334d[i];
                            if (annotationArr2 != null) {
                                this.f50328E[i] = m75034a(i, type, annotationArr2);
                            } else {
                                throw m75040a(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw m75040a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (this.f50356z != null || this.f50350t) {
                        boolean z = this.f50354x;
                        if (!z && !this.f50355y && !this.f50353w && !this.f50341k && this.f50347q) {
                            throw m75041a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                        } else if (z && !this.f50345o) {
                            throw m75041a("Form-encode method must contain at least one @Field.", new Object[0]);
                        } else if (!this.f50355y || this.f50346p) {
                            return new C20640l(this);
                        } else {
                            throw m75041a("Multipart method must contain at least one @Part.", new Object[0]);
                        }
                    } else {
                        throw m75041a("Missing either @%s URL or @Url parameter.", this.f50352v);
                    }
                } else {
                    throw m75041a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
            } else {
                throw m75041a("'" + C20653o.m75095a(this.f50344n).getName() + "' is not a valid response body type.", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m75048a(Annotation annotation) {
            if (annotation instanceof DELETE) {
                m75047a("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                m75047a("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                m75047a("HEAD", ((HEAD) annotation).value(), false);
                if (!Void.class.equals(this.f50344n)) {
                    throw m75041a("HEAD method must use Void as response type.", new Object[0]);
                }
            } else if (annotation instanceof PATCH) {
                m75047a("PATCH", ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                m75047a("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                m75047a("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                m75047a("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                m75047a(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof Headers) {
                String[] value = ((Headers) annotation).value();
                if (value.length != 0) {
                    this.f50324A = m75044a(value);
                    return;
                }
                throw m75041a("@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof Multipart) {
                if (!this.f50354x) {
                    this.f50355y = true;
                    return;
                }
                throw m75041a("Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof FormUrlEncoded) {
                if (!this.f50355y) {
                    this.f50354x = true;
                    return;
                }
                throw m75041a("Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof Streaming) {
                this.f50338h = true;
            } else if (annotation instanceof Priority) {
                this.f50336f = ((Priority) annotation).value();
            } else if (annotation instanceof ServiceType) {
                this.f50337g = ((ServiceType) annotation).value();
            } else if (annotation instanceof RequestPriority) {
                this.f50343m = ((RequestPriority) annotation).value();
            }
        }

        /* renamed from: a */
        private void m75047a(String str, String str2, boolean z) {
            String str3 = this.f50352v;
            if (str3 == null) {
                this.f50352v = str;
                if (str != null) {
                    this.f50327D = C20640l.m75029b(str);
                }
                if (this.f50327D != null) {
                    this.f50341k = true;
                }
                this.f50353w = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C20640l.f50297a.matcher(substring).find()) {
                            throw m75041a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f50356z = str2;
                    this.f50326C = C20640l.m75028a(str2);
                    return;
                }
                return;
            }
            throw m75041a("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: a */
        private List<Header> m75044a(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m75041a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.f50325B = trim;
                } else {
                    arrayList.add(new Header(substring, trim));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private okhttp3.Headers m75045a(String str, String str2) {
            return okhttp3.Headers.of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", str2);
        }

        /* renamed from: a */
        private void m75046a(int i, String str) {
            if (C20640l.f50298b.matcher(str).matches()) {
                String str2 = this.f50327D;
                if (str2 != null && !str2.equals(str)) {
                    throw m75040a(i, "Method \"%s\" does not contain \"{%s}\".", this.f50352v, str);
                }
                return;
            }
            throw m75040a(i, "@Method parameter name must match %s. Found: %s", C20640l.f50297a.pattern(), str);
        }

        /* renamed from: a */
        private RuntimeException m75043a(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f50332b.getDeclaringClass().getSimpleName() + "." + this.f50332b.getName(), th);
        }

        /* renamed from: c */
        private Converter<TypedInput, T> m75053c() {
            try {
                return this.f50331a.responseBodyConverter(this.f50344n, this.f50332b.getAnnotations());
            } catch (RuntimeException e) {
                throw m75043a(e, "Unable to create converter for %s", this.f50344n);
            }
        }

        /* renamed from: b */
        private CallAdapter<?> m75049b() {
            Type genericReturnType = this.f50332b.getGenericReturnType();
            if (C20653o.m75112d(genericReturnType)) {
                throw m75041a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f50331a.callAdapter(genericReturnType, this.f50332b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m75043a(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m75041a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: a */
        private AbstractC20605h<?> m75038a(Type type) {
            if (RequestBody.class.isAssignableFrom(C20653o.m75095a(type))) {
                return AbstractC20605h.C20610c.f50211a;
            }
            return null;
        }

        /* renamed from: b */
        private void m75052b(Annotation annotation) {
            if (annotation instanceof retrofit2.http.DELETE) {
                m75047a("DELETE", ((retrofit2.http.DELETE) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.GET) {
                m75047a("GET", ((retrofit2.http.GET) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.HEAD) {
                m75047a("HEAD", ((retrofit2.http.HEAD) annotation).value(), false);
                if (!Void.class.equals(this.f50344n)) {
                    throw m75041a("HEAD method must use Void as response type.", new Object[0]);
                }
            } else if (annotation instanceof retrofit2.http.PATCH) {
                m75047a("PATCH", ((retrofit2.http.PATCH) annotation).value(), true);
            } else if (annotation instanceof retrofit2.http.POST) {
                m75047a("POST", ((retrofit2.http.POST) annotation).value(), true);
            } else if (annotation instanceof retrofit2.http.PUT) {
                m75047a("PUT", ((retrofit2.http.PUT) annotation).value(), true);
            } else if (annotation instanceof retrofit2.http.OPTIONS) {
                m75047a("OPTIONS", ((retrofit2.http.OPTIONS) annotation).value(), false);
            } else if (annotation instanceof retrofit2.http.HTTP) {
                retrofit2.http.HTTP http = (retrofit2.http.HTTP) annotation;
                m75047a(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof retrofit2.http.Headers) {
                String[] value = ((retrofit2.http.Headers) annotation).value();
                if (value.length != 0) {
                    this.f50324A = m75044a(value);
                    return;
                }
                throw m75041a("@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Multipart) {
                if (!this.f50354x) {
                    this.f50355y = true;
                    return;
                }
                throw m75041a("Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.FormUrlEncoded) {
                if (!this.f50355y) {
                    this.f50354x = true;
                    return;
                }
                throw m75041a("Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Streaming) {
                this.f50338h = true;
            }
        }

        /* renamed from: a */
        private RuntimeException m75041a(String str, Object... objArr) {
            return m75043a((Throwable) null, str, objArr);
        }

        /* renamed from: a */
        private AbstractC20605h<?> m75037a(ParameterizedType parameterizedType, Annotation annotation) {
            if (RequestBody.class.isAssignableFrom(C20653o.m75095a(C20653o.m75098a(1, parameterizedType)))) {
                return new AbstractC20605h.C20612e(((PartMap) annotation).encoding());
            }
            return null;
        }

        public C20641a(Retrofit retrofit, Method method) {
            this.f50331a = retrofit;
            this.f50332b = method;
            this.f50333c = method.getAnnotations();
            this.f50335e = method.getGenericParameterTypes();
            this.f50334d = method.getParameterAnnotations();
        }

        /* renamed from: b */
        private void m75051b(int i, String str) {
            if (!C20640l.f50298b.matcher(str).matches()) {
                throw m75040a(i, "@Path parameter name must match %s. Found: %s", C20640l.f50297a.pattern(), str);
            } else if (!this.f50326C.contains(str)) {
                throw m75040a(i, "URL \"%s\" does not contain \"{%s}\".", this.f50356z, str);
            }
        }

        /* renamed from: a */
        private AbstractC20605h<?> m75034a(int i, Type type, Annotation[] annotationArr) {
            AbstractC20605h<?> hVar = null;
            for (Annotation annotation : annotationArr) {
                AbstractC20605h<?> a = m75035a(i, type, annotationArr, annotation);
                if (a == null && C20632i.m75007b()) {
                    a = m75050b(i, type, annotationArr, annotation);
                }
                if (a != null) {
                    if (hVar == null) {
                        hVar = a;
                    } else {
                        throw m75040a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (hVar != null) {
                return hVar;
            }
            throw m75040a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private AbstractC20605h<?> m75039a(Type type, String str, String str2) {
            Class<?> a = C20653o.m75095a(type);
            if (TextUtils.isEmpty(str)) {
                if (Iterable.class.isAssignableFrom(a)) {
                    if ((type instanceof ParameterizedType) && MultipartBody.Part.class.isAssignableFrom(C20653o.m75095a(C20653o.m75098a(0, (ParameterizedType) type)))) {
                        return AbstractC20605h.C20613f.f50214a.mo69397a();
                    }
                } else if (a.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(a.getComponentType())) {
                        return AbstractC20605h.C20613f.f50214a.mo69399b();
                    }
                } else if (MultipartBody.Part.class.isAssignableFrom(a)) {
                    return AbstractC20605h.C20613f.f50214a;
                }
            } else if (Iterable.class.isAssignableFrom(a)) {
                if ((type instanceof ParameterizedType) && RequestBody.class.isAssignableFrom(C20653o.m75095a(C20653o.m75098a(0, (ParameterizedType) type)))) {
                    return new AbstractC20605h.C20611d(m75045a(str, str2)).mo69397a();
                }
            } else if (a.isArray()) {
                if (RequestBody.class.isAssignableFrom(C20640l.m75027a(a.getComponentType()))) {
                    return new AbstractC20605h.C20611d(m75045a(str, str2)).mo69399b();
                }
            } else if (RequestBody.class.isAssignableFrom(a)) {
                return new AbstractC20605h.C20611d(m75045a(str, str2));
            }
            return null;
        }

        /* renamed from: a */
        private RuntimeException m75040a(int i, String str, Object... objArr) {
            return m75041a(str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: a */
        private AbstractC20605h<?> m75035a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                if (this.f50350t) {
                    throw m75040a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f50348r) {
                    throw m75040a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f50349s) {
                    throw m75040a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f50356z == null) {
                    this.f50350t = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC20605h.C20629v();
                    }
                    throw m75040a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m75040a(i, "@Url cannot be used with @%s URL", this.f50352v);
                }
            } else if (annotation instanceof Path) {
                if (this.f50349s) {
                    throw m75040a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f50350t) {
                    throw m75040a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f50356z != null) {
                    this.f50348r = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    m75051b(i, value);
                    return new AbstractC20605h.C20624q(value, this.f50331a.stringConverter(type, annotationArr), path.encode());
                } else {
                    throw m75040a(i, "@Path can only be used with relative url on @%s", this.f50352v);
                }
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                return m75036a(i, type, annotationArr, false, query.value(), query.encode());
            } else if (annotation instanceof QueryName) {
                return m75036a(i, type, annotationArr, true, null, ((QueryName) annotation).encoded());
            } else {
                if (annotation instanceof QueryMap) {
                    Class<?> a = C20653o.m75095a(type);
                    if (Map.class.isAssignableFrom(a)) {
                        Type b = C20653o.m75109b(type, a, Map.class);
                        if (b instanceof ParameterizedType) {
                            ParameterizedType parameterizedType = (ParameterizedType) b;
                            Type a2 = C20653o.m75098a(0, parameterizedType);
                            if (String.class == a2) {
                                return new AbstractC20605h.C20626s(this.f50331a.stringConverter(C20653o.m75098a(1, parameterizedType), annotationArr), ((QueryMap) annotation).encode());
                            }
                            throw m75040a(i, "@QueryMap keys must be of type String: " + a2, new Object[0]);
                        }
                        throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m75040a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                } else if (annotation instanceof com.bytedance.retrofit2.http.Header) {
                    String value2 = ((com.bytedance.retrofit2.http.Header) annotation).value();
                    Class<?> a3 = C20653o.m75095a(type);
                    if (Iterable.class.isAssignableFrom(a3)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC20605h.C20617j(value2, this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr)).mo69397a();
                        }
                        throw m75040a(i, a3.getSimpleName() + " must include generic type (e.g., " + a3.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a3.isArray()) {
                        return new AbstractC20605h.C20617j(value2, this.f50331a.stringConverter(type, annotationArr));
                    } else {
                        return new AbstractC20605h.C20617j(value2, this.f50331a.stringConverter(C20640l.m75027a(a3.getComponentType()), annotationArr)).mo69399b();
                    }
                } else if (annotation instanceof HeaderList) {
                    Class<?> a4 = C20653o.m75095a(type);
                    if (List.class.isAssignableFrom(a4)) {
                        Type b2 = C20653o.m75109b(type, a4, List.class);
                        if (b2 instanceof ParameterizedType) {
                            Type a5 = C20653o.m75098a(0, (ParameterizedType) b2);
                            if (Header.class == a5) {
                                return new AbstractC20605h.C20618k(this.f50331a.headerConverter(a5, annotationArr));
                            }
                            throw m75040a(i, "@HeaderList keys must be of type retrofit.client.Header: " + a5, new Object[0]);
                        }
                        throw m75040a(i, "List must include generic types (e.g., List<Header>)", new Object[0]);
                    }
                    throw m75040a(i, "@HeaderList parameter type must be List.", new Object[0]);
                } else if (annotation instanceof HeaderMap) {
                    Class<?> a6 = C20653o.m75095a(type);
                    if (Map.class.isAssignableFrom(a6)) {
                        Type b3 = C20653o.m75109b(type, a6, Map.class);
                        if (b3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) b3;
                            Type a7 = C20653o.m75098a(0, parameterizedType2);
                            if (String.class == a7) {
                                return new AbstractC20605h.C20619l(this.f50331a.stringConverter(C20653o.m75098a(1, parameterizedType2), annotationArr));
                            }
                            throw m75040a(i, "@HeaderMap keys must be of type String: " + a7, new Object[0]);
                        }
                        throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m75040a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
                } else if (annotation instanceof Field) {
                    if (this.f50354x) {
                        Field field = (Field) annotation;
                        String value3 = field.value();
                        boolean encode = field.encode();
                        this.f50345o = true;
                        Class<?> a8 = C20653o.m75095a(type);
                        if (Iterable.class.isAssignableFrom(a8)) {
                            if (type instanceof ParameterizedType) {
                                return new AbstractC20605h.C20615h(value3, this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr), encode).mo69397a();
                            }
                            throw m75040a(i, a8.getSimpleName() + " must include generic type (e.g., " + a8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!a8.isArray()) {
                            return new AbstractC20605h.C20615h(value3, this.f50331a.stringConverter(type, annotationArr), encode);
                        } else {
                            return new AbstractC20605h.C20615h(value3, this.f50331a.stringConverter(C20640l.m75027a(a8.getComponentType()), annotationArr), encode).mo69399b();
                        }
                    } else {
                        throw m75040a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                    }
                } else if (annotation instanceof FieldMap) {
                    if (this.f50354x) {
                        Class<?> a9 = C20653o.m75095a(type);
                        if (Map.class.isAssignableFrom(a9)) {
                            Type b4 = C20653o.m75109b(type, a9, Map.class);
                            if (b4 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType3 = (ParameterizedType) b4;
                                Type a10 = C20653o.m75098a(0, parameterizedType3);
                                if (String.class == a10) {
                                    Converter<T, String> stringConverter = this.f50331a.stringConverter(C20653o.m75098a(1, parameterizedType3), annotationArr);
                                    this.f50345o = true;
                                    return new AbstractC20605h.C20616i(stringConverter, ((FieldMap) annotation).encode());
                                }
                                throw m75040a(i, "@FieldMap keys must be of type String: " + a10, new Object[0]);
                            }
                            throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw m75040a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                    }
                    throw m75040a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                } else if (annotation instanceof Part) {
                    if (this.f50355y) {
                        Part part = (Part) annotation;
                        this.f50346p = true;
                        AbstractC20605h<?> a11 = m75039a(type, part.value(), part.encoding());
                        if (a11 != null) {
                            return a11;
                        }
                        return new AbstractC20605h.C20622o(part.value(), this.f50331a.requestBodyConverter(type, annotationArr, this.f50333c));
                    }
                    throw m75040a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                } else if (annotation instanceof PartMap) {
                    if (this.f50355y) {
                        this.f50346p = true;
                        Class<?> a12 = C20653o.m75095a(type);
                        if (Map.class.isAssignableFrom(a12)) {
                            Type b5 = C20653o.m75109b(type, a12, Map.class);
                            if (b5 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType4 = (ParameterizedType) b5;
                                Type a13 = C20653o.m75098a(0, parameterizedType4);
                                if (String.class == a13) {
                                    AbstractC20605h<?> a14 = m75037a(parameterizedType4, annotation);
                                    if (a14 != null) {
                                        return a14;
                                    }
                                    return new AbstractC20605h.C20623p(this.f50331a.requestBodyConverter(C20653o.m75098a(1, parameterizedType4), annotationArr, this.f50333c), ((PartMap) annotation).encoding());
                                }
                                throw m75040a(i, "@PartMap keys must be of type String: " + a13, new Object[0]);
                            }
                            throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw m75040a(i, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    throw m75040a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                } else if (annotation instanceof Body) {
                    if (this.f50354x || this.f50355y) {
                        throw m75040a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    } else if (!this.f50347q) {
                        AbstractC20605h<?> a15 = m75038a(type);
                        if (a15 != null) {
                            this.f50347q = true;
                            return a15;
                        }
                        try {
                            Converter<T, TypedOutput> requestBodyConverter = this.f50331a.requestBodyConverter(type, annotationArr, this.f50333c);
                            this.f50347q = true;
                            return new AbstractC20605h.C20609b(this.f50341k, requestBodyConverter);
                        } catch (RuntimeException e) {
                            throw m75042a(e, i, "Unable to create @Body converter for %s", type);
                        }
                    } else {
                        throw m75040a(i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                } else if (annotation instanceof com.bytedance.retrofit2.http.Method) {
                    if (!this.f50351u) {
                        this.f50351u = true;
                        String value4 = ((com.bytedance.retrofit2.http.Method) annotation).value();
                        m75046a(i, value4);
                        return new AbstractC20605h.C20621n(value4, this.f50331a.stringConverter(type, annotationArr));
                    }
                    throw m75040a(i, "Multiple @Method method annotations found.", new Object[0]);
                } else if (annotation instanceof MaxLength) {
                    try {
                        return new AbstractC20605h.C20620m(this.f50331a.stringConverter(type, annotationArr));
                    } catch (RuntimeException e2) {
                        throw m75042a(e2, i, "Unable to create @MaxLength converter for %s", type);
                    }
                } else if (annotation instanceof AddCommonParam) {
                    try {
                        return new AbstractC20605h.C20608a(this.f50331a.stringConverter(type, annotationArr));
                    } catch (RuntimeException e3) {
                        throw m75042a(e3, i, "Unable to create @AddCommonParam converter for %s", type);
                    }
                } else if (annotation instanceof ExtraInfo) {
                    try {
                        return new AbstractC20605h.C20614g(this.f50331a.objectConverter(type, annotationArr));
                    } catch (RuntimeException e4) {
                        throw m75042a(e4, i, "Unable to create @ExtraInfo converter for %s", type);
                    }
                } else if (annotation instanceof QueryObject) {
                    if (AbstractC20631a.class.isAssignableFrom(C20653o.m75095a(type))) {
                        return new AbstractC20605h.C20628u();
                    }
                    throw m75040a(i, "Unable to create @QueryObject for %s not QueryParamObject type", type);
                } else if (!(annotation instanceof Tag)) {
                    return null;
                } else {
                    Class<?> a16 = C20653o.m75095a(type);
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        AbstractC20605h<?> hVar = this.f50328E[i2];
                        if ((hVar instanceof AbstractC20605h.C20630w) && ((AbstractC20605h.C20630w) hVar).f50242a.equals(a16)) {
                            throw m75040a(i, "@Tag type " + a16.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                        }
                    }
                    return new AbstractC20605h.C20630w(a16);
                }
            }
        }

        /* renamed from: b */
        private AbstractC20605h<?> m75050b(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof retrofit2.http.Url) {
                if (this.f50350t) {
                    throw m75040a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f50348r) {
                    throw m75040a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f50349s) {
                    throw m75040a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f50356z == null) {
                    this.f50350t = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC20605h.C20629v();
                    }
                    throw m75040a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m75040a(i, "@Url cannot be used with @%s URL", this.f50352v);
                }
            } else if (annotation instanceof retrofit2.http.Path) {
                if (this.f50349s) {
                    throw m75040a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f50350t) {
                    throw m75040a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f50356z != null) {
                    this.f50348r = true;
                    retrofit2.http.Path path = (retrofit2.http.Path) annotation;
                    String value = path.value();
                    m75051b(i, value);
                    return new AbstractC20605h.C20624q(value, this.f50331a.stringConverter(type, annotationArr), !path.encoded());
                } else {
                    throw m75040a(i, "@Path can only be used with relative url on @%s", this.f50352v);
                }
            } else if (annotation instanceof retrofit2.http.Query) {
                retrofit2.http.Query query = (retrofit2.http.Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> a = C20653o.m75095a(type);
                this.f50349s = true;
                if (Iterable.class.isAssignableFrom(a)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC20605h.C20625r(value2, this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr), !encoded).mo69397a();
                    }
                    throw m75040a(i, a.getSimpleName() + " must include generic type (e.g., " + a.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a.isArray()) {
                    return new AbstractC20605h.C20625r(value2, this.f50331a.stringConverter(type, annotationArr), !encoded);
                } else {
                    return new AbstractC20605h.C20625r(value2, this.f50331a.stringConverter(C20640l.m75027a(a.getComponentType()), annotationArr), !encoded).mo69399b();
                }
            } else if (annotation instanceof retrofit2.http.QueryName) {
                boolean encoded2 = ((retrofit2.http.QueryName) annotation).encoded();
                Class<?> a2 = C20653o.m75095a(type);
                this.f50349s = true;
                if (Iterable.class.isAssignableFrom(a2)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC20605h.C20627t(this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr), encoded2).mo69397a();
                    }
                    throw m75040a(i, a2.getSimpleName() + " must include generic type (e.g., " + a2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a2.isArray()) {
                    return new AbstractC20605h.C20627t(this.f50331a.stringConverter(type, annotationArr), encoded2);
                } else {
                    return new AbstractC20605h.C20627t(this.f50331a.stringConverter(C20640l.m75027a(a2.getComponentType()), annotationArr), encoded2).mo69399b();
                }
            } else if (annotation instanceof retrofit2.http.QueryMap) {
                Class<?> a3 = C20653o.m75095a(type);
                if (Map.class.isAssignableFrom(a3)) {
                    Type b = C20653o.m75109b(type, a3, Map.class);
                    if (b instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) b;
                        Type a4 = C20653o.m75098a(0, parameterizedType);
                        if (String.class == a4) {
                            return new AbstractC20605h.C20626s(this.f50331a.stringConverter(C20653o.m75098a(1, parameterizedType), annotationArr), !((retrofit2.http.QueryMap) annotation).encoded());
                        }
                        throw m75040a(i, "@QueryMap keys must be of type String: " + a4, new Object[0]);
                    }
                    throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m75040a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Header) {
                String value3 = ((retrofit2.http.Header) annotation).value();
                Class<?> a5 = C20653o.m75095a(type);
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC20605h.C20617j(value3, this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr)).mo69397a();
                    }
                    throw m75040a(i, a5.getSimpleName() + " must include generic type (e.g., " + a5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a5.isArray()) {
                    return new AbstractC20605h.C20617j(value3, this.f50331a.stringConverter(type, annotationArr));
                } else {
                    return new AbstractC20605h.C20617j(value3, this.f50331a.stringConverter(C20640l.m75027a(a5.getComponentType()), annotationArr)).mo69399b();
                }
            } else if (annotation instanceof retrofit2.http.HeaderMap) {
                Class<?> a6 = C20653o.m75095a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type b2 = C20653o.m75109b(type, a6, Map.class);
                    if (b2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) b2;
                        Type a7 = C20653o.m75098a(0, parameterizedType2);
                        if (String.class == a7) {
                            return new AbstractC20605h.C20619l(this.f50331a.stringConverter(C20653o.m75098a(1, parameterizedType2), annotationArr));
                        }
                        throw m75040a(i, "@HeaderMap keys must be of type String: " + a7, new Object[0]);
                    }
                    throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m75040a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Field) {
                if (this.f50354x) {
                    retrofit2.http.Field field = (retrofit2.http.Field) annotation;
                    String value4 = field.value();
                    boolean encoded3 = field.encoded();
                    this.f50345o = true;
                    Class<?> a8 = C20653o.m75095a(type);
                    if (Iterable.class.isAssignableFrom(a8)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC20605h.C20615h(value4, this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr), !encoded3).mo69397a();
                        }
                        throw m75040a(i, a8.getSimpleName() + " must include generic type (e.g., " + a8.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a8.isArray()) {
                        return new AbstractC20605h.C20615h(value4, this.f50331a.stringConverter(type, annotationArr), !encoded3);
                    } else {
                        return new AbstractC20605h.C20615h(value4, this.f50331a.stringConverter(C20640l.m75027a(a8.getComponentType()), annotationArr), !encoded3).mo69399b();
                    }
                } else {
                    throw m75040a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof retrofit2.http.FieldMap) {
                if (this.f50354x) {
                    Class<?> a9 = C20653o.m75095a(type);
                    if (Map.class.isAssignableFrom(a9)) {
                        Type b3 = C20653o.m75109b(type, a9, Map.class);
                        if (b3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) b3;
                            Type a10 = C20653o.m75098a(0, parameterizedType3);
                            if (String.class == a10) {
                                Converter<T, String> stringConverter = this.f50331a.stringConverter(C20653o.m75098a(1, parameterizedType3), annotationArr);
                                this.f50345o = true;
                                return new AbstractC20605h.C20616i(stringConverter, !((retrofit2.http.FieldMap) annotation).encoded());
                            }
                            throw m75040a(i, "@FieldMap keys must be of type String: " + a10, new Object[0]);
                        }
                        throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m75040a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m75040a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Part) {
                if (this.f50355y) {
                    retrofit2.http.Part part = (retrofit2.http.Part) annotation;
                    this.f50346p = true;
                    AbstractC20605h<?> a11 = m75039a(type, part.value(), part.encoding());
                    if (a11 != null) {
                        return a11;
                    }
                    return new AbstractC20605h.C20622o(part.value(), this.f50331a.requestBodyConverter(type, annotationArr, this.f50333c));
                }
                throw m75040a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.PartMap) {
                if (this.f50355y) {
                    this.f50346p = true;
                    Class<?> a12 = C20653o.m75095a(type);
                    if (Map.class.isAssignableFrom(a12)) {
                        Type b4 = C20653o.m75109b(type, a12, Map.class);
                        if (b4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) b4;
                            Type a13 = C20653o.m75098a(0, parameterizedType4);
                            if (String.class == a13) {
                                AbstractC20605h<?> a14 = m75037a(parameterizedType4, annotation);
                                if (a14 != null) {
                                    return a14;
                                }
                                return new AbstractC20605h.C20623p(this.f50331a.requestBodyConverter(C20653o.m75098a(1, parameterizedType4), annotationArr, this.f50333c), ((retrofit2.http.PartMap) annotation).encoding());
                            }
                            throw m75040a(i, "@PartMap keys must be of type String: " + a13, new Object[0]);
                        }
                        throw m75040a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m75040a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m75040a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof retrofit2.http.Body)) {
                return null;
            } else {
                if (this.f50354x || this.f50355y) {
                    throw m75040a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f50347q) {
                    AbstractC20605h<?> a15 = m75038a(type);
                    if (a15 != null) {
                        this.f50347q = true;
                        return a15;
                    }
                    try {
                        Converter<T, TypedOutput> requestBodyConverter = this.f50331a.requestBodyConverter(type, annotationArr, this.f50333c);
                        this.f50347q = true;
                        return new AbstractC20605h.C20609b(this.f50341k, requestBodyConverter);
                    } catch (RuntimeException e) {
                        throw m75042a(e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m75040a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: a */
        private RuntimeException m75042a(Throwable th, int i, String str, Object... objArr) {
            return m75043a(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: a */
        private AbstractC20605h m75036a(int i, Type type, Annotation[] annotationArr, boolean z, String str, boolean z2) {
            Class<?> a = C20653o.m75095a(type);
            this.f50349s = true;
            if (Iterable.class.isAssignableFrom(a)) {
                if (type instanceof ParameterizedType) {
                    Converter<T, String> stringConverter = this.f50331a.stringConverter(C20653o.m75098a(0, (ParameterizedType) type), annotationArr);
                    if (z) {
                        return new AbstractC20605h.C20627t(stringConverter, z2).mo69397a();
                    }
                    return new AbstractC20605h.C20625r(str, stringConverter, z2).mo69397a();
                }
                throw m75040a(i, a.getSimpleName() + " must include generic type (e.g., " + a.getSimpleName() + "<String>)", new Object[0]);
            } else if (a.isArray()) {
                Converter<T, String> stringConverter2 = this.f50331a.stringConverter(C20640l.m75027a(a.getComponentType()), annotationArr);
                if (z) {
                    return new AbstractC20605h.C20627t(stringConverter2, z2).mo69399b();
                }
                return new AbstractC20605h.C20625r(str, stringConverter2, z2).mo69399b();
            } else {
                Converter<T, String> stringConverter3 = this.f50331a.stringConverter(type, annotationArr);
                if (z) {
                    return new AbstractC20605h.C20627t(stringConverter3, z2);
                }
                return new AbstractC20605h.C20625r(str, stringConverter3, z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public T mo69452a(TypedInput typedInput) throws IOException {
        return this.f50314q.mo51796b(typedInput);
    }

    /* renamed from: a */
    public void mo69453a(C20639k kVar) {
        this.f50299A = kVar;
    }

    /* renamed from: a */
    static Set<String> m75028a(String str) {
        Matcher matcher = f50297a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    static String m75029b(String str) {
        Matcher matcher = f50297a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    static Class<?> m75027a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    C20640l(C20641a<T> aVar) {
        this.f50300c = aVar.f50331a.clientProvider();
        this.f50301d = aVar.f50330G;
        this.f50302e = aVar.f50331a.interceptors();
        this.f50303f = aVar.f50331a.httpExecutor();
        this.f50313p = aVar.f50331a.server();
        this.f50314q = aVar.f50329F;
        this.f50315r = aVar.f50352v;
        this.f50316s = aVar.f50356z;
        this.f50318u = aVar.f50353w;
        this.f50319v = aVar.f50354x;
        this.f50320w = aVar.f50355y;
        this.f50321x = aVar.f50328E;
        this.f50322y = aVar.f50324A;
        this.f50323z = aVar.f50325B;
        this.f50304g = aVar.f50336f;
        this.f50305h = aVar.f50343m;
        this.f50306i = aVar.f50337g;
        this.f50307j = aVar.f50338h;
        this.f50308k = aVar.f50339i;
        this.f50309l = aVar.f50340j;
        this.f50317t = aVar.f50341k;
        this.f50310m = aVar.f50342l;
        this.f50311n = aVar.f50332b;
        this.f50312o = aVar.f50331a.cacheServer();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.retrofit2.RequestBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Request mo69450a(ExpandCallback expandCallback, Object... objArr) throws IOException {
        int i;
        RequestBuilder requestBuilder = new RequestBuilder(this.f50315r, this.f50313p, this.f50316s, this.f50322y, this.f50323z, this.f50304g, this.f50305h, this.f50307j, this.f50308k, this.f50309l, this.f50310m, this.f50318u, this.f50319v, this.f50320w, this.f50306i);
        AbstractC20605h<?>[] hVarArr = this.f50321x;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == hVarArr.length) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(objArr[i2]);
                hVarArr[i2].mo69398a(requestBuilder, objArr[i2]);
            }
            requestBuilder.addTag(C20604g.class, new C20604g(this.f50311n, arrayList));
            return requestBuilder.build(expandCallback);
        }
        throw new IllegalArgumentException("Argument count (" + i + ") doesn't match expected count (" + hVarArr.length + ")");
    }
}
