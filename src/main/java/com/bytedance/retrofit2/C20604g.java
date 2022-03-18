package com.bytedance.retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.g */
public final class C20604g {

    /* renamed from: a */
    private final Method f50204a;

    /* renamed from: b */
    private final List<?> f50205b;

    public String toString() {
        return String.format("%s.%s() %s", this.f50204a.getDeclaringClass().getName(), this.f50204a.getName(), this.f50205b);
    }

    C20604g(Method method, List<?> list) {
        this.f50204a = method;
        this.f50205b = Collections.unmodifiableList(list);
    }
}
