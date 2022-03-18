package com.ss.android.lark.calendar.impl.utils.diskcache;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/ExtObjectInputStream;", "Ljava/io/ObjectInputStream;", "in", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "resolveClass", "Ljava/lang/Class;", "v", "Ljava/io/ObjectStreamClass;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.d */
public final class ExtObjectInputStream extends ObjectInputStream {

    /* renamed from: a */
    public static final Companion f83773a = new Companion(null);

    /* renamed from: b */
    private static ClassLoader f83774b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/ExtObjectInputStream$Companion;", "", "()V", "systemClassLoader", "Ljava/lang/ClassLoader;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExtObjectInputStream(InputStream inputStream) {
        super(inputStream);
    }

    /* access modifiers changed from: protected */
    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        Intrinsics.checkParameterIsNotNull(objectStreamClass, "v");
        try {
            Class<?> resolveClass = super.resolveClass(objectStreamClass);
            Intrinsics.checkExpressionValueIsNotNull(resolveClass, "super.resolveClass(v)");
            return resolveClass;
        } catch (ClassNotFoundException unused) {
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            ClassLoader contextClassLoader = currentThread.getContextClassLoader();
            if (contextClassLoader == null) {
                if (f83774b == null) {
                    f83774b = ClassLoader.getSystemClassLoader();
                }
                contextClassLoader = f83774b;
                if (contextClassLoader == null) {
                    throw new ClassNotFoundException(objectStreamClass.getName());
                }
            }
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, contextClassLoader);
            Intrinsics.checkExpressionValueIsNotNull(cls, "Class.forName(v.name, false, loader)");
            return cls;
        }
    }
}
