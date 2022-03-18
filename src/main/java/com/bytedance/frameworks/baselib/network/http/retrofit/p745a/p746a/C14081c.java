package com.bytedance.frameworks.baselib.network.http.retrofit.p745a.p746a;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.C20649c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.c */
final class C14081c<T> implements Converter<TypedInput, T> {

    /* renamed from: a */
    private final Gson f37004a;

    /* renamed from: b */
    private final TypeAdapter<T> f37005b;

    /* renamed from: a */
    public T mo51796b(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = C20649c.m75080a(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            return this.f37005b.read(this.f37004a.newJsonReader(inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    C14081c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f37004a = gson;
        this.f37005b = typeAdapter;
    }
}
