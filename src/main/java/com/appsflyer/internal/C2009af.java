package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.af */
public final class C2009af {

    /* renamed from: ǃ */
    private AbstractC2012c f6856 = new AbstractC2012c() {
        /* class com.appsflyer.internal.C2009af.C20101 */

        @Override // com.appsflyer.internal.C2009af.AbstractC2012c
        /* renamed from: Ι */
        public final Class<?> mo10059(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.af$c */
    public interface AbstractC2012c {
        /* renamed from: Ι */
        Class<?> mo10059(String str) throws ClassNotFoundException;
    }

    /* renamed from: ɩ */
    public final String mo10058() {
        EnumC2011b[] values = EnumC2011b.values();
        for (EnumC2011b bVar : values) {
            if (m8863(bVar.f6866)) {
                return bVar.f6867;
            }
        }
        return EnumC2011b.DEFAULT.f6867;
    }

    /* renamed from: Ι */
    private boolean m8863(String str) {
        try {
            this.f6856.mo10059(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: com.appsflyer.internal.af$b */
    enum EnumC2011b {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
        

        /* renamed from: Ɩ */
        private String f6866;

        /* renamed from: І */
        private String f6867;

        private EnumC2011b(String str, String str2) {
            this.f6867 = str;
            this.f6866 = str2;
        }
    }
}
