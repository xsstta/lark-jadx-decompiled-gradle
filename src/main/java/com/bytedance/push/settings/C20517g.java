package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.push.settings.annotation.Settings;
import com.bytedance.push.settings.storage.AbstractC20537i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.settings.g */
public class C20517g {

    /* renamed from: a */
    private final ConcurrentHashMap<Class<? extends ILocalSettings>, ILocalSettings> f50060a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AbstractC20521k f50061b;

    C20517g(AbstractC20521k kVar) {
        this.f50061b = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T extends ILocalSettings> T mo69090a(Context context, Class<T> cls) {
        Object obj = (T) ((ILocalSettings) this.f50060a.get(cls));
        if (obj == null) {
            synchronized (this) {
                obj = (ILocalSettings) this.f50060a.get(cls);
                if (obj == null) {
                    ILocalSettings b = m74717b(context, cls);
                    this.f50060a.put(cls, b);
                    obj = (T) b;
                }
            }
        }
        return (T) obj;
    }

    /* renamed from: b */
    private <T extends ILocalSettings> T m74717b(Context context, Class<T> cls) {
        AbstractC20521k kVar = this.f50061b;
        T t = (T) ((ILocalSettings) C20519i.m74722a(cls, kVar));
        if (t != null) {
            return t;
        }
        try {
            Constructor<?> constructor = Class.forName(cls.getName() + "$$SettingImpl", true, cls.getClassLoader()).getConstructor(Context.class, AbstractC20537i.class);
            Settings settings = (Settings) cls.getAnnotation(Settings.class);
            if (settings != null) {
                String storageKey = settings.storageKey();
                return (T) ((ILocalSettings) constructor.newInstance(context, kVar.mo69092a(context, settings.supportMultiProcess(), storageKey)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        throw new IllegalStateException("获取settings实例失败，检查warning日志确认问题");
    }
}
