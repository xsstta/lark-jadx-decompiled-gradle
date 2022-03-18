package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionUtils {
    private static final String TAG = "ReflectionUtils";

    ReflectionUtils() {
    }

    public static Class<?> getClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!EmuiUtil.BUILDEX_VERSION.equals(str) && !EmuiUtil.IMMERSION_STYLE.equals(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Logger.m85375w(TAG, "ClassNotFoundException occur in method ReflectionUtils.getClass()");
            return null;
        }
    }

    private static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        String str2;
        Throwable e;
        if (cls == null || str == null) {
            Logger.m85375w(TAG, "targetClass is  null pr name is null:");
            return null;
        } else if (!EmuiUtil.GET_PRIMARY_COLOR.equals(str) && !EmuiUtil.GET_SUGGESTION_FOR_GROUND_COLOR_STYLE.equals(str)) {
            return null;
        } else {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (SecurityException e2) {
                e = e2;
                str2 = "SecurityException:";
                Logger.m85369e(TAG, str2, e);
                return null;
            } catch (NoSuchMethodException e3) {
                e = e3;
                str2 = "NoSuchMethodException:";
                Logger.m85369e(TAG, str2, e);
                return null;
            }
        }
    }

    public static Object getStaticFieldObj(String str, String str2) {
        String str3;
        Throwable e;
        Class<?> cls = getClass(str);
        if (cls == null || TextUtils.isEmpty(str2) || !EmuiUtil.BUILDEX_VERSION.equals(str) || !EmuiUtil.EMUI_SDK_INT.equals(str2)) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str2);
            AccessibleObject.setAccessible(new Field[]{declaredField}, true);
            return declaredField.get(cls);
        } catch (IllegalAccessException e2) {
            e = e2;
            str3 = "Exception in getFieldObj :: IllegalAccessException:";
        } catch (IllegalArgumentException e3) {
            e = e3;
            str3 = "Exception in getFieldObj :: IllegalArgumentException:";
        } catch (NoSuchFieldException e4) {
            e = e4;
            str3 = "Exception in getFieldObj :: NoSuchFieldException:";
        } catch (SecurityException e5) {
            e = e5;
            str3 = "not security int method getStaticFieldObj,SecurityException:";
        }
        Logger.m85369e(TAG, str3, e);
        return null;
    }

    private static Object invoke(Object obj, Method method, Object... objArr) {
        String str;
        Throwable e;
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (RuntimeException e2) {
            e = e2;
            str = "RuntimeException in invoke:";
            Logger.m85369e(TAG, str, e);
            return null;
        } catch (Exception e3) {
            e = e3;
            str = "Exception in invoke:";
            Logger.m85369e(TAG, str, e);
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Method method = getMethod(getClass(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return invoke(null, method, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) {
        Class[] clsArr;
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                setClassType(clsArr, objArr[i], i);
            }
        } else {
            clsArr = null;
        }
        Method method = getMethod(getClass(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return invoke(null, method, objArr);
    }

    private static void setClassType(Class<?>[] clsArr, Object obj, int i) {
        if (obj instanceof Integer) {
            clsArr[i] = Integer.TYPE;
        } else if (obj instanceof Long) {
            clsArr[i] = Long.TYPE;
        } else if (obj instanceof Double) {
            clsArr[i] = Double.TYPE;
        } else if (obj instanceof Float) {
            clsArr[i] = Float.TYPE;
        } else if (obj instanceof Boolean) {
            clsArr[i] = Boolean.TYPE;
        } else if (obj instanceof Character) {
            clsArr[i] = Character.TYPE;
        } else if (obj instanceof Byte) {
            clsArr[i] = Byte.TYPE;
        } else if (obj instanceof Void) {
            clsArr[i] = Void.TYPE;
        } else if (obj instanceof Short) {
            clsArr[i] = Short.TYPE;
        } else {
            clsArr[i] = obj.getClass();
        }
    }
}
