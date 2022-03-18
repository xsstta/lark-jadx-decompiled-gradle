package com.bytedance.retrofit2;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.mime.C20649c;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.retrofit2.a */
public final class C20577a extends Converter.Factory {

    /* renamed from: com.bytedance.retrofit2.a$a */
    static final class C20578a implements Converter<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C20578a f50158a = new C20578a();

        C20578a() {
        }

        /* renamed from: a */
        public TypedInput mo51796b(TypedInput typedInput) throws IOException {
            if (typedInput == null || (typedInput instanceof TypedByteArray)) {
                return typedInput;
            }
            String mimeType = typedInput.mimeType();
            InputStream in = typedInput.in();
            try {
                return new TypedByteArray(mimeType, C20653o.m75107a(in), new String[0]);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$b */
    static final class C20579b implements Converter<Header, Header> {

        /* renamed from: a */
        static final C20579b f50159a = new C20579b();

        /* renamed from: a */
        public Header mo51796b(Header header) throws IOException {
            return header;
        }

        C20579b() {
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$c */
    static final class C20580c implements Converter<Object, Object> {

        /* renamed from: a */
        static final C20580c f50160a = new C20580c();

        @Override // com.bytedance.retrofit2.Converter
        /* renamed from: b */
        public Object mo51796b(Object obj) throws IOException {
            return obj;
        }

        C20580c() {
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$d */
    static final class C20581d implements Converter<TypedOutput, TypedOutput> {

        /* renamed from: a */
        static final C20581d f50161a = new C20581d();

        /* renamed from: a */
        public TypedOutput mo51796b(TypedOutput typedOutput) throws IOException {
            return typedOutput;
        }

        C20581d() {
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$e */
    static final class C20582e implements Converter<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C20582e f50162a = new C20582e();

        /* renamed from: a */
        public TypedInput mo51796b(TypedInput typedInput) throws IOException {
            return typedInput;
        }

        C20582e() {
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$f */
    static final class C20583f implements Converter<String, String> {

        /* renamed from: a */
        static final C20583f f50163a = new C20583f();

        /* renamed from: a */
        public String mo51796b(String str) throws IOException {
            return str;
        }

        C20583f() {
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$g */
    static final class C20584g implements Converter<TypedInput, String> {

        /* renamed from: a */
        static final C20584g f50164a = new C20584g();

        C20584g() {
        }

        /* renamed from: a */
        public String mo51796b(TypedInput typedInput) throws IOException {
            if (!(typedInput instanceof TypedByteArray)) {
                return null;
            }
            String str = "UTF-8";
            if (typedInput.mimeType() != null) {
                str = C20649c.m75080a(typedInput.mimeType(), str);
            }
            return new String(((TypedByteArray) typedInput).getBytes(), str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.a$h */
    public static final class C20585h implements Converter<Object, String> {

        /* renamed from: a */
        static final C20585h f50165a = new C20585h();

        C20585h() {
        }

        /* renamed from: a */
        public String mo51796b(Object obj) {
            return String.valueOf(obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$i */
    static final class C20586i implements Converter<TypedInput, Void> {

        /* renamed from: a */
        static final C20586i f50166a = new C20586i();

        C20586i() {
        }

        /* renamed from: a */
        public Void mo51796b(TypedInput typedInput) throws IOException {
            InputStream in = typedInput.in();
            if (in == null) {
                return null;
            }
            in.close();
            return null;
        }
    }

    C20577a() {
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<?, Header> headerConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == Header.class) {
            return C20579b.f50159a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<?, Object> objectConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == Object.class) {
            return C20580c.f50160a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return C20583f.f50163a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<TypedInput, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == TypedInput.class) {
            if (C20653o.m75106a(annotationArr, (Class<? extends Annotation>) Streaming.class)) {
                return C20582e.f50162a;
            }
            return C20578a.f50158a;
        } else if (type == String.class) {
            return C20584g.f50164a;
        } else {
            if (type == Void.class) {
                return C20586i.f50166a;
            }
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<?, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (TypedOutput.class.isAssignableFrom(C20653o.m75095a(type))) {
            return C20581d.f50161a;
        }
        return null;
    }
}
