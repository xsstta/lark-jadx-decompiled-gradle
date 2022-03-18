package com.ss.android.decompress;

import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\fH\u0007J;\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00052\u001a\u0010\u0016\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u001a\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/ss/android/decompress/NativeLibraryPathIncrementUtils;", "", "()V", "constructorArgs", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "constructorArgs1", "expandFieldArray", "", "instance", "fieldName", "", "extraElement", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", "expandFieldList", "findField", "Ljava/lang/reflect/Field;", "name", "getElementConstructor", "Ljava/lang/reflect/Constructor;", "element", "args", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "makeNativeLibraryElement", "dir", "Ljava/io/File;", "injectsopath_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.ss.android.a.e */
public final class NativeLibraryPathIncrementUtils {

    /* renamed from: a */
    public static final NativeLibraryPathIncrementUtils f67728a = new NativeLibraryPathIncrementUtils();

    /* renamed from: b */
    private static final Class<?>[] f67729b = {File.class};

    /* renamed from: c */
    private static final Class<?>[] f67730c = {File.class, Boolean.TYPE, File.class, DexFile.class};

    private NativeLibraryPathIncrementUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m98950a(File file) throws IOException {
        boolean z;
        Intrinsics.checkParameterIsNotNull(file, "dir");
        if (Build.VERSION.SDK_INT > 25 || (Build.VERSION.SDK_INT == 25 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("dalvik.system.DexPathList$NativeLibraryElement");
                Class<?>[] clsArr = f67729b;
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "constructor");
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(file);
                Intrinsics.checkExpressionValueIsNotNull(newInstance, "constructor.newInstance(dir)");
                return newInstance;
            } catch (Exception e) {
                throw new IOException("make nativeElement failed " + e.getMessage(), e);
            }
        } else if (!z) {
            try {
                Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
                Intrinsics.checkExpressionValueIsNotNull(cls2, "element");
                Class<?>[] clsArr2 = f67730c;
                Constructor<?> a = m98951a(cls2, (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                if (a != null) {
                    a.setAccessible(true);
                    Object newInstance2 = a.newInstance(file, true, null, null);
                    Intrinsics.checkExpressionValueIsNotNull(newInstance2, "constructor.newInstance(dir, true, null, null)");
                    return newInstance2;
                }
                throw new IOException("make nativeElement fail | error constructor");
            } catch (Exception e2) {
                throw new IOException("make nativeElement fail ", e2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @JvmStatic
    /* renamed from: a */
    private static final Constructor<?> m98951a(Class<?> cls, Class<?>... clsArr) {
        try {
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Throwable unused) {
            Log.e("KernalBundleImpl", "can not create element by args" + clsArr);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final Field m98952a(Object obj, String str) throws NoSuchFieldException {
        Intrinsics.checkParameterIsNotNull(obj, "instance");
        Intrinsics.checkParameterIsNotNull(str, "name");
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m98954b(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Intrinsics.checkParameterIsNotNull(obj, "instance");
        Intrinsics.checkParameterIsNotNull(str, "fieldName");
        Intrinsics.checkParameterIsNotNull(objArr, "extraElement");
        Field a = m98952a(obj, str);
        a.setAccessible(true);
        Object obj2 = a.get(obj);
        if (obj2 != null) {
            ArrayList arrayList = new ArrayList((List) obj2);
            for (Object obj3 : objArr) {
                arrayList.add(obj3);
            }
            a.set(obj, arrayList);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m98953a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, ClassCastException {
        Intrinsics.checkParameterIsNotNull(obj, "instance");
        Intrinsics.checkParameterIsNotNull(str, "fieldName");
        Intrinsics.checkParameterIsNotNull(objArr, "extraElement");
        Field a = m98952a(obj, str);
        Object obj2 = a.get(obj);
        if (obj2 != null) {
            Object[] objArr2 = (Object[]) obj2;
            Object newInstance = Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
            if (newInstance != null) {
                Object[] objArr3 = (Object[]) newInstance;
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    objArr3[i] = objArr[i];
                }
                System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
                a.set(obj, objArr3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
    }
}
