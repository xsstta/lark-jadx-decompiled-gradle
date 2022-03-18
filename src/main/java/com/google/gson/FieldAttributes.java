package com.google.gson;

import com.google.gson.internal.C22954a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class FieldAttributes {
    private final Field field;

    public Class<?> getDeclaredClass() {
        return this.field.getType();
    }

    public Type getDeclaredType() {
        return this.field.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.field.getDeclaringClass();
    }

    public String getName() {
        return this.field.getName();
    }

    /* access modifiers changed from: package-private */
    public boolean isSynthetic() {
        return this.field.isSynthetic();
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.field.getAnnotations());
    }

    /* access modifiers changed from: package-private */
    public Object get(Object obj) throws IllegalAccessException {
        return this.field.get(obj);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.field.getAnnotation(cls);
    }

    public FieldAttributes(Field field2) {
        C22954a.m83316a(field2);
        this.field = field2;
    }

    public boolean hasModifier(int i) {
        if ((i & this.field.getModifiers()) != 0) {
            return true;
        }
        return false;
    }
}
