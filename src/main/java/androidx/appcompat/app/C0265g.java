package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.g */
class C0265g {

    /* renamed from: a */
    private static Field f713a;

    /* renamed from: b */
    private static boolean f714b;

    /* renamed from: c */
    private static Class<?> f715c;

    /* renamed from: d */
    private static boolean f716d;

    /* renamed from: e */
    private static Field f717e;

    /* renamed from: f */
    private static boolean f718f;

    /* renamed from: g */
    private static Field f719g;

    /* renamed from: h */
    private static boolean f720h;

    /* renamed from: a */
    static void m967a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT >= 24) {
                m971d(resources);
            } else if (Build.VERSION.SDK_INT >= 23) {
                m970c(resources);
            } else if (Build.VERSION.SDK_INT >= 21) {
                m969b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m969b(Resources resources) {
        if (!f714b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f713a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f714b = true;
        }
        Field field = f713a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m970c(Resources resources) {
        if (!f714b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f713a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f714b = true;
        }
        Object obj = null;
        Field field = f713a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m968a(obj);
        }
    }

    /* renamed from: a */
    private static void m968a(Object obj) {
        if (!f716d) {
            try {
                f715c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f716d = true;
        }
        Class<?> cls = f715c;
        if (cls != null) {
            if (!f718f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f717e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f718f = true;
            }
            Field field = f717e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: d */
    private static void m971d(Resources resources) {
        Object obj;
        if (!f720h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f719g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f720h = true;
        }
        Field field = f719g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f714b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f713a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f714b = true;
                }
                Field field2 = f713a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m968a(obj2);
                }
            }
        }
    }
}
