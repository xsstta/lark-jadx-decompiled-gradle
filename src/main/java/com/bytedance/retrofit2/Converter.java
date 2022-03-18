package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public interface Converter<F, T> {

    public static abstract class Factory {
        public Converter<?, Header> headerConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        public Converter<?, Object> objectConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        public Converter<?, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        public Converter<TypedInput, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        public Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    /* renamed from: b */
    T mo51796b(F f) throws IOException;
}
