package com.appsflyer;

import android.os.Bundle;
import android.util.Base64;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFFacebookDeferredDeeplink {

    /* renamed from: ǃ */
    private byte[] f6716;

    /* renamed from: ɩ */
    String f6717;

    /* renamed from: Ι */
    String f6718;

    /* renamed from: ι */
    public String f6719;

    public interface AppLinkFetchEvents {
        void onAppLinkFetchFailed(String str);

        void onAppLinkFetchFinished(String str, String str2, String str3);
    }

    /* renamed from: com.appsflyer.AFFacebookDeferredDeeplink$2 */
    public static class C19792 implements InvocationHandler {

        /* renamed from: ı */
        private static String f6720;

        /* renamed from: ǃ */
        private static String f6721;

        /* renamed from: ɩ */
        private /* synthetic */ AppLinkFetchEvents f6722;

        /* renamed from: ι */
        private /* synthetic */ Class f6723;

        C19792() {
        }

        /* renamed from: ɩ */
        public static void m8721(String str) {
            if (f6720 == null) {
                m8722(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
            }
            String str2 = f6720;
            if (str2 != null && str.contains(str2)) {
                AFLogger.afInfoLog(str.replace(f6720, f6721));
            }
        }

        /* renamed from: ι */
        static void m8722(String str) {
            f6720 = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f6721 = sb.toString();
        }

        C19792(Class cls, AppLinkFetchEvents appLinkFetchEvents) {
            this.f6723 = cls;
            this.f6722 = appLinkFetchEvents;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String str;
            String str2;
            String str3;
            Bundle bundle;
            if (method.getName().equals("onDeferredAppLinkDataFetched")) {
                if (objArr[0] != null) {
                    Bundle bundle2 = (Bundle) Bundle.class.cast(this.f6723.getMethod("getArgumentBundle", new Class[0]).invoke(this.f6723.cast(objArr[0]), new Object[0]));
                    if (bundle2 != null) {
                        str = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                        str3 = bundle2.getString("target_url");
                        Bundle bundle3 = bundle2.getBundle("extras");
                        if (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) {
                            str2 = null;
                        } else {
                            str2 = bundle.getString("promo_code");
                        }
                    } else {
                        str2 = null;
                        str = null;
                        str3 = null;
                    }
                    AppLinkFetchEvents appLinkFetchEvents = this.f6722;
                    if (appLinkFetchEvents != null) {
                        appLinkFetchEvents.onAppLinkFetchFinished(str, str3, str2);
                    }
                } else {
                    AppLinkFetchEvents appLinkFetchEvents2 = this.f6722;
                    if (appLinkFetchEvents2 != null) {
                        appLinkFetchEvents2.onAppLinkFetchFinished(null, null, null);
                    }
                }
                return null;
            }
            AppLinkFetchEvents appLinkFetchEvents3 = this.f6722;
            if (appLinkFetchEvents3 != null) {
                appLinkFetchEvents3.onAppLinkFetchFailed("onDeferredAppLinkDataFetched invocation failed");
            }
            return null;
        }
    }

    AFFacebookDeferredDeeplink() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final byte[] mo9893() {
        return this.f6716;
    }

    public AFFacebookDeferredDeeplink(char[] cArr) {
        byte[] bArr;
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f6717 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f6718 = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.f6718);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                if (i > 4 || i2 >= 11) {
                    bArr = Base64.decode(trim, 2);
                } else {
                    bArr = trim.getBytes();
                }
                this.f6716 = bArr;
            }
        }
        scanner.close();
    }

    AFFacebookDeferredDeeplink(String str, byte[] bArr, String str2) {
        this.f6717 = str;
        this.f6716 = bArr;
        this.f6718 = str2;
    }
}
