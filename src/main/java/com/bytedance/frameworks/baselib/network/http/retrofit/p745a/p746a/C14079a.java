package com.bytedance.frameworks.baselib.network.http.retrofit.p745a.p746a;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a */
public final class C14079a extends Converter.Factory {

    /* renamed from: a */
    private final Gson f37000a;

    /* renamed from: a */
    public static C14079a m57004a() {
        return m57005a(new Gson());
    }

    /* renamed from: a */
    public static C14079a m57005a(Gson gson) {
        return new C14079a(gson);
    }

    private C14079a(Gson gson) {
        Objects.requireNonNull(gson, "gson == null");
        this.f37000a = gson;
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<TypedInput, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new C14081c(this.f37000a, this.f37000a.getAdapter(TypeToken.get(type)));
    }

    @Override // com.bytedance.retrofit2.Converter.Factory
    public Converter<?, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new C14080b(this.f37000a, this.f37000a.getAdapter(TypeToken.get(type)));
    }
}
