package com.bytedance.retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface CallAdapter<T> {
    /* renamed from: a */
    <R> T mo69250a(Call<R> call);

    /* renamed from: a */
    Type mo69251a();

    public static abstract class Factory {
        public abstract CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit);

        protected static Class<?> getRawType(Type type) {
            return C20653o.m75095a(type);
        }

        protected static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return C20653o.m75098a(i, parameterizedType);
        }
    }
}
