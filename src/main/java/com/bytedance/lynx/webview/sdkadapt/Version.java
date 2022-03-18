package com.bytedance.lynx.webview.sdkadapt;

import java.util.Locale;

public class Version {

    /* renamed from: a */
    public static final SdkType f48940a = SdkType.SdkRelease;

    /* renamed from: b */
    public static final String f48941b;

    /* renamed from: c */
    public static final String f48942c;

    /* renamed from: d */
    public static final String f48943d;

    /* renamed from: e */
    public static final String f48944e;

    /* renamed from: f */
    public static final String f48945f;

    /* renamed from: g */
    public static final String f48946g;

    public enum SdkType {
        SdkRelease(1),
        SdkReleaseUpdate(2),
        SdkGreyUpdate(3);
        
        private int sdkType;

        public int getSdkType() {
            return this.sdkType;
        }

        private SdkType(int i) {
            this.sdkType = i;
        }
    }

    static {
        String format = String.format(Locale.US, "%04d", 16);
        f48941b = format;
        String format2 = String.format(Locale.US, "%03d", 12);
        f48942c = format2;
        f48943d = "062113" + format;
        f48944e = "113" + format + format2;
        f48945f = "062113" + format + "001";
        f48946g = "062113" + format + "999";
    }
}
