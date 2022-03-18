package com.bytedance.frameworks.baselib.network.http.retrofit.p745a.p746a;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.b */
final class C14080b<T> implements Converter<T, TypedOutput> {

    /* renamed from: a */
    private static final Charset f37001a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final Gson f37002b;

    /* renamed from: c */
    private final TypeAdapter<T> f37003c;

    /* renamed from: a */
    public TypedOutput mo51796b(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        JsonWriter newJsonWriter = this.f37002b.newJsonWriter(new OutputStreamWriter(byteArrayOutputStream, f37001a));
        this.f37003c.write(newJsonWriter, t);
        newJsonWriter.close();
        return new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
    }

    C14080b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f37002b = gson;
        this.f37003c = typeAdapter;
    }
}
