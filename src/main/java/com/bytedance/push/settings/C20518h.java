package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.push.settings.annotation.Settings;
import com.bytedance.push.settings.storage.AbstractC20537i;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.settings.h */
public final class C20518h {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<? extends ISettings>, ISettings> f50062a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<Class<? extends ISettings>, Object> f50063b = new ConcurrentHashMap<>();

    C20518h() {
    }

    /* renamed from: b */
    private static <T extends ISettings> T m74720b(Context context, Class<T> cls) {
        AbstractC20521k a = C20520j.m74723a();
        T t = (T) ((ISettings) C20519i.m74722a(cls, a));
        InvocationTargetException invocationTargetException = null;
        if (t != null) {
            t.updateSettings(context, null);
            return t;
        }
        try {
            Settings settings = (Settings) cls.getAnnotation(Settings.class);
            if (settings != null) {
                return (T) m74719a(context, cls, a.mo69092a(context, settings.supportMultiProcess(), settings.storageKey()));
            }
        } catch (ClassNotFoundException e) {
            ClassNotFoundException classNotFoundException = e;
            classNotFoundException.printStackTrace();
            invocationTargetException = classNotFoundException;
        } catch (NoSuchMethodException e2) {
            NoSuchMethodException noSuchMethodException = e2;
            noSuchMethodException.printStackTrace();
            invocationTargetException = noSuchMethodException;
        } catch (IllegalAccessException e3) {
            IllegalAccessException illegalAccessException = e3;
            illegalAccessException.printStackTrace();
            invocationTargetException = illegalAccessException;
        } catch (InstantiationException e4) {
            InstantiationException instantiationException = e4;
            instantiationException.printStackTrace();
            invocationTargetException = instantiationException;
        } catch (InvocationTargetException e5) {
            InvocationTargetException invocationTargetException2 = e5;
            invocationTargetException2.printStackTrace();
            invocationTargetException = invocationTargetException2;
        }
        if (invocationTargetException != null) {
            throw new IllegalStateException("获取settings实例失败，检查warning日志确认问题", invocationTargetException);
        }
        throw new IllegalStateException("获取settings实例失败，检查warning日志确认问题");
    }

    /* renamed from: a */
    public <T extends ISettings> T mo69091a(Context context, Class<T> cls) {
        T t;
        T t2 = (T) this.f50062a.get(cls);
        if (t2 == null) {
            Object obj = null;
            synchronized (this.f50063b) {
                if (this.f50063b.containsKey(cls)) {
                    obj = this.f50063b.get(cls);
                }
                if (obj == null) {
                    obj = new Object();
                    this.f50063b.put(cls, obj);
                }
            }
            synchronized (obj) {
                ISettings iSettings = this.f50062a.get(cls);
                if (iSettings == null) {
                    t = (T) m74720b(context, cls);
                    if (t != null) {
                        this.f50062a.put(cls, t);
                    }
                } else {
                    t = (T) iSettings;
                }
            }
            return t;
        } else if (!this.f50063b.containsKey(cls)) {
            return t2;
        } else {
            this.f50063b.remove(cls);
            return t2;
        }
    }

    /* renamed from: a */
    private static <T extends ISettings> ISettings m74719a(Context context, Class<T> cls, AbstractC20537i iVar) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ISettings iSettings = (ISettings) Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(AbstractC20537i.class).newInstance(iVar);
        iSettings.updateSettings(context, null);
        return iSettings;
    }
}
