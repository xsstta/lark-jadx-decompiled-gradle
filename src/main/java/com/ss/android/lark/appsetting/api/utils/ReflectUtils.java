package com.ss.android.lark.appsetting.api.utils;

import com.ss.android.lark.log.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/appsetting/api/utils/ReflectUtils;", "", "()V", "Companion", "appsetting-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.appsetting.api.b.b */
public final class ReflectUtils {

    /* renamed from: a */
    public static final Companion f73164a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/appsetting/api/utils/ReflectUtils$Companion;", "", "()V", "TAG", "", "invoke", "T", "obj", "clazz", "Ljava/lang/Class;", "parseMethod", "jsonStr", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "newInstance", "appsetting-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.appsetting.api.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Object mo103621a(Class<? extends Object> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            try {
                Constructor<? extends Object> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(new Class[0], 0));
                Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "clazz.getDeclaredConstructor(*params)");
                return declaredConstructor.newInstance(Arrays.copyOf(new Object[0], 0));
            } catch (InstantiationException e) {
                Log.m165383e("ReflectUtils", "failed to newInstance, e:" + e);
                return Unit.INSTANCE;
            } catch (IllegalAccessException e2) {
                Log.m165383e("ReflectUtils", "failed to newInstance, e:" + e2);
                return Unit.INSTANCE;
            } catch (InvocationTargetException e3) {
                Log.m165383e("ReflectUtils", "failed to newInstance, e:" + e3);
                return Unit.INSTANCE;
            } catch (NoSuchMethodException e4) {
                Log.m165383e("ReflectUtils", "failed to newInstance, e:" + e4);
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final <T> T mo103622a(Object obj, Class<? extends Object> cls, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(obj, "obj");
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            Intrinsics.checkParameterIsNotNull(str, "parseMethod");
            Intrinsics.checkParameterIsNotNull(str2, "jsonStr");
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, String.class);
                Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "clazz.getDeclaredMethod(…thod, String::class.java)");
                T t = (T) declaredMethod.invoke(obj, str2);
                return t == null ? obj : t;
            } catch (IllegalArgumentException e) {
                Log.m165383e("ReflectUtils", "failed to invoke, e:" + e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.m165383e("ReflectUtils", "failed to invoke, e:" + e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.m165383e("ReflectUtils", "failed to invoke, e:" + e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.m165383e("ReflectUtils", "failed to invoke, e:" + e4);
                return null;
            }
        }
    }
}
