package com.larksuite.component.safemode.utils;

import com.bytedance.crash.Npth;
import com.ss.android.lark.log.Log;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/safemode/utils/VirtualBoxUtil;", "", "()V", "getVirtualBoxInfo", "", "isSandBox", "", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.safemode.c.a */
public final class VirtualBoxUtil {

    /* renamed from: a */
    public static final VirtualBoxUtil f62349a = new VirtualBoxUtil();

    private VirtualBoxUtil() {
    }

    /* renamed from: b */
    public final boolean mo88894b() {
        if (Npth.isSandBox() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final CharSequence mo88893a() {
        int indexOf$default;
        try {
            Method declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "getServiceMethod");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "package");
            String name = invoke.getClass().getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "packageService.javaClass.name");
            if (StringsKt.startsWith$default(name, "android.os.BinderProxy", false, 2, (Object) null)) {
                return null;
            }
            Log.m165383e("SafeMode_Debug", "packageService is hooked " + invoke.getClass().getName());
            ClassLoader classLoader = invoke.getClass().getClassLoader();
            if (classLoader != null) {
                PathClassLoader pathClassLoader = (PathClassLoader) classLoader;
                Class<? super Object> superclass = pathClassLoader.getClass().getSuperclass();
                if (superclass == null) {
                    Intrinsics.throwNpe();
                }
                Field declaredField = superclass.getDeclaredField("pathList");
                Intrinsics.checkExpressionValueIsNotNull(declaredField, "dexPathListField");
                declaredField.setAccessible(true);
                Field declaredField2 = declaredField.get(pathClassLoader).getClass().getDeclaredField("nativeLibraryDirectories");
                Intrinsics.checkExpressionValueIsNotNull(declaredField2, "nativeLibraryDirectoriesField");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(declaredField.get(pathClassLoader));
                if (obj != null) {
                    for (File file : (List) obj) {
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "path");
                        if (StringsKt.startsWith$default(absolutePath, "/data/app/", false, 2, (Object) null) && (indexOf$default = StringsKt.indexOf$default((CharSequence) absolutePath, "-", 0, false, 6, (Object) null)) > 0) {
                            return absolutePath.subSequence(10, indexOf$default);
                        }
                    }
                    return invoke.getClass().getName();
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<java.io.File>");
            }
            throw new TypeCastException("null cannot be cast to non-null type dalvik.system.PathClassLoader");
        } catch (Throwable th) {
            Log.m165384e("SafeMode_Debug", "Check exception", th);
            return null;
        }
    }
}
