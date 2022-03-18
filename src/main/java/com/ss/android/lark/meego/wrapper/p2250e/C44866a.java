package com.ss.android.lark.meego.wrapper.p2250e;

import android.content.Context;
import android.os.SystemClock;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.flutter.container.api.ILKFlutter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import com.ss.android.lark.meego.wrapper.common.MeegoApm;
import com.ss.android.lark.meego.wrapper.manis.AbstractC44874a;
import com.ss.android.lark.meego.wrapper.manis.IMeegoProxy;
import com.ss.android.lark.mira.IPluginInstallCallback;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.mira.UIGetPluginCallback;
import ee.android.framework.manis.C68183b;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.ss.android.lark.meego.wrapper.e.a */
public class C44866a {

    /* renamed from: a */
    public static boolean f113645a;

    /* renamed from: a */
    public static boolean m177885a() {
        return f113645a;
    }

    /* renamed from: b */
    public static void m177886b() {
        if (MiraModule.m205163c("com.ss.android.lark.plugin.flutter_meego")) {
            f113645a = true;
            MiraModule.m205158a("com.ss.android.lark.plugin.flutter_meego");
            return;
        }
        m177883a((AbstractC44874a) null);
    }

    /* renamed from: c */
    public static String m177888c() {
        try {
            Class<?> cls = Class.forName("com.bytedance.mira.Mira");
            Object invoke = cls.getDeclaredMethod("getPlugin", String.class).invoke(cls, "com.ss.android.lark.plugin.flutter_meego");
            if (invoke == null) {
                return null;
            }
            Object obj = invoke.getClass().getDeclaredField("mVersionCode").get(invoke);
            if (obj instanceof Integer) {
                return String.valueOf(obj);
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.m165399w("MeegoPlugin", e);
        }
    }

    /* renamed from: a */
    public static void m177883a(final AbstractC44874a aVar) {
        MiraModule.m205159a("com.ss.android.lark.plugin.flutter_meego", new IPluginInstallCallback() {
            /* class com.ss.android.lark.meego.wrapper.p2250e.C44866a.C448671 */
        });
    }

    /* renamed from: a */
    public static void m177884a(final UIGetPluginCallback<ILKFlutter> dVar) {
        if (MiraModule.m205163c("com.ss.android.lark.plugin.flutter_meego")) {
            MiraModule.m205160a("com.ss.android.lark.plugin.flutter_meego", ILKFlutter.class, "com.ss.android.lark.flutter.container.LKFlutter", dVar);
            return;
        }
        MeegoApm.f113631a.mo158737a();
        final long uptimeMillis = SystemClock.uptimeMillis();
        m177887b(new AbstractC44874a() {
            /* class com.ss.android.lark.meego.wrapper.p2250e.C44866a.C448682 */

            @Override // com.ss.android.lark.meego.wrapper.manis.AbstractC44874a
            public void onInstallStart() {
                dVar.mo180986b();
            }

            @Override // com.ss.android.lark.meego.wrapper.manis.AbstractC44874a
            public void onInstallSuccess() {
                MeegoApm.f113631a.mo158739a(true, SystemClock.uptimeMillis() - uptimeMillis, null);
                if (MiraModule.m205163c("com.ss.android.lark.plugin.flutter_meego")) {
                    MiraModule.m205160a("com.ss.android.lark.plugin.flutter_meego", ILKFlutter.class, "com.ss.android.lark.flutter.container.LKFlutter", dVar);
                } else {
                    dVar.onError(new ErrorResult("plugin:com.ss.android.lark.plugin.flutter_meego not install"));
                }
            }

            @Override // com.ss.android.lark.meego.wrapper.manis.AbstractC44874a
            public void onInstallFailed(String str) {
                MeegoApm.f113631a.mo158739a(false, SystemClock.uptimeMillis() - uptimeMillis, str);
                dVar.onError(new ErrorResult(str));
            }
        });
    }

    /* renamed from: b */
    public static void m177887b(AbstractC44874a aVar) {
        Context context = MeegoModule.m177824d().getContext();
        if (context != null) {
            IMeegoProxy iMeegoProxy = (IMeegoProxy) C68183b.m264839a().mo237086a(context, IMeegoProxy.class);
            if (iMeegoProxy != null) {
                iMeegoProxy.installPlugin(aVar);
            } else if (aVar != null) {
                aVar.onInstallFailed("installPluginProxy proxy is null");
            }
        } else if (aVar != null) {
            aVar.onInstallFailed("installPluginProxy context is null");
        }
    }
}
