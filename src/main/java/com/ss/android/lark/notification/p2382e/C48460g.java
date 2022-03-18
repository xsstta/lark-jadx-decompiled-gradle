package com.ss.android.lark.notification.p2382e;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.C48499a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.notification.e.g */
public class C48460g {

    /* renamed from: a */
    private Map<Class<?>, AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<?>> f121939a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.e.g$a */
    public static class C48462a {

        /* renamed from: a */
        static C48460g f121940a = new C48460g();
    }

    /* renamed from: a */
    public static C48460g m191134a() {
        return C48462a.f121940a;
    }

    private C48460g() {
        this.f121939a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public <T extends C48499a> void mo169528a(AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<T> aVar) {
        Class<?> a = m191135a((Object) aVar);
        if (!this.f121939a.containsKey(a)) {
            this.f121939a.put(a, aVar);
        }
    }

    /* renamed from: a */
    private <T> Class<T> m191135a(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length <= 0) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }

    /* renamed from: a */
    public <T extends C48499a> void mo169529a(T t) {
        AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a<?> aVar = this.f121939a.get(t.getClass());
        if (aVar == null) {
            Log.m165382e("no notification display is suit!");
        } else {
            aVar.mo31149a(t);
        }
    }
}
