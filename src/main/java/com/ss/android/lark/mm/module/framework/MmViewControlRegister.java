package com.ss.android.lark.mm.module.framework;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0014\u001a\u00020\u000f\"\b\b\u0000\u0010\u0015*\u00020\u00062\u0006\u0010\u0016\u001a\u0002H\u0015¢\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f\"\b\b\u0000\u0010\u0015*\u00020\t2\u0006\u0010\u0019\u001a\u0002H\u0015¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u000fJ%\u0010\u001c\u001a\u0004\u0018\u0001H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001e¢\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u0004\u0018\u0001H\u0015\"\b\b\u0000\u0010\u0015*\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001e¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\u00020\u000f\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001eJ\u001e\u0010#\u001a\u00020\u000f\"\b\b\u0000\u0010\u0015*\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001eR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t`\u0007X\u0004¢\u0006\u0002\n\u0000R7\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "", "()V", "inquirerMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "Lkotlin/collections/HashMap;", "listenerMap", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "viewControlInquireFailedCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "clazzName", "", "getViewControlInquireFailedCallback", "()Lkotlin/jvm/functions/Function1;", "setViewControlInquireFailedCallback", "(Lkotlin/jvm/functions/Function1;)V", "addInquirer", "T", "inquirer", "(Lcom/ss/android/lark/mm/module/framework/IMmInquirer;)V", "addListener", "listener", "(Lcom/ss/android/lark/mm/module/framework/IMmListener;)V", "clear", "getInquirer", "className", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getListener", "(Ljava/lang/Class;)Lcom/ss/android/lark/mm/module/framework/IMmListener;", "removeInquirer", "removeListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.a.k */
public final class MmViewControlRegister {

    /* renamed from: a */
    private final HashMap<String, IMmListener> f115729a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, IMmInquirer> f115730b = new HashMap<>();

    /* renamed from: c */
    private Function1<? super String, Unit> f115731c;

    /* renamed from: a */
    public final void mo161260a() {
        this.f115729a.clear();
        this.f115730b.clear();
    }

    /* renamed from: a */
    public final void mo161263a(Function1<? super String, Unit> function1) {
        this.f115731c = function1;
    }

    /* renamed from: b */
    public final <T extends IMmInquirer> void mo161264b(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "className");
        this.f115730b.remove(cls.getName());
    }

    /* renamed from: c */
    public final <T extends IMmListener> void mo161265c(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "className");
        this.f115729a.remove(cls.getName());
    }

    /* renamed from: a */
    public final <T extends IMmInquirer> T mo161259a(Class<T> cls) {
        Function1<? super String, Unit> function1;
        Intrinsics.checkParameterIsNotNull(cls, "className");
        if (this.f115730b.get(cls.getName()) == null && (function1 = this.f115731c) != null) {
            String name = cls.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "className.name");
            function1.invoke(name);
        }
        T t = (T) this.f115730b.get(cls.getName());
        if (!(t instanceof IMmInquirer)) {
            return null;
        }
        return t;
    }

    /* renamed from: d */
    public final <T extends IMmListener> T mo161266d(Class<T> cls) {
        Function1<? super String, Unit> function1;
        Intrinsics.checkParameterIsNotNull(cls, "className");
        if (this.f115729a.get(cls.getName()) == null && (function1 = this.f115731c) != null) {
            String name = cls.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "className.name");
            function1.invoke(name);
        }
        T t = (T) this.f115729a.get(cls.getName());
        if (!(t instanceof IMmListener)) {
            return null;
        }
        return t;
    }

    /* renamed from: a */
    public final <T extends IMmInquirer> void mo161261a(T t) {
        Class<?> cls;
        Intrinsics.checkParameterIsNotNull(t, "inquirer");
        Class<?>[] interfaces = t.getClass().getInterfaces();
        Intrinsics.checkExpressionValueIsNotNull(interfaces, "inquirer::class.java.interfaces");
        int length = interfaces.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls = null;
                break;
            }
            cls = interfaces[i];
            if (IMmInquirer.class.isAssignableFrom(cls)) {
                break;
            }
            i++;
        }
        if (cls != null) {
            String name = cls.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
            this.f115730b.put(name, t);
        }
    }

    /* renamed from: a */
    public final <T extends IMmListener> void mo161262a(T t) {
        Class<?> cls;
        Intrinsics.checkParameterIsNotNull(t, "listener");
        Class<?>[] interfaces = t.getClass().getInterfaces();
        Intrinsics.checkExpressionValueIsNotNull(interfaces, "listener::class.java.interfaces");
        int length = interfaces.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls = null;
                break;
            }
            cls = interfaces[i];
            if (IMmListener.class.isAssignableFrom(cls)) {
                break;
            }
            i++;
        }
        if (cls != null) {
            String name = cls.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
            this.f115729a.put(name, t);
        }
    }
}
