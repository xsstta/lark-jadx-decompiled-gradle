package com.ss.android.lark.desktopmode.base;

import android.content.Intent;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StandAloneParam implements Serializable {
    private final boolean clipChildren;
    private final Intent intent;
    private final int launchMode;
    private final int requestCode;
    private final int[] targetCoordination;
    private final int targetWindowHeight;
    private final int targetWindowWidth;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {
    }

    public Intent getIntent() {
        return this.intent;
    }

    public int getLaunchMode() {
        return this.launchMode;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public int[] getTargetCoordination() {
        return this.targetCoordination;
    }

    public int getTargetWindowHeight() {
        return this.targetWindowHeight;
    }

    public int getTargetWindowWidth() {
        return this.targetWindowWidth;
    }

    public boolean isClipChildren() {
        return this.clipChildren;
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.StandAloneParam$a */
    public static class C36572a {

        /* renamed from: a */
        private Intent f94130a;

        /* renamed from: b */
        private int f94131b;

        /* renamed from: c */
        private int f94132c;

        /* renamed from: d */
        private int f94133d;

        /* renamed from: e */
        private int[] f94134e;

        /* renamed from: f */
        private boolean f94135f;

        /* renamed from: g */
        private int f94136g;

        /* renamed from: a */
        public StandAloneParam mo134967a() {
            return new StandAloneParam(this.f94130a, this.f94136g, this.f94134e, this.f94131b, this.f94132c, this.f94133d, this.f94135f);
        }

        /* renamed from: a */
        public C36572a mo134966a(int i) {
            this.f94131b = i;
            return this;
        }

        /* renamed from: b */
        public C36572a mo134968b(int i) {
            this.f94132c = i;
            return this;
        }

        /* renamed from: c */
        public C36572a mo134969c(int i) {
            this.f94133d = i;
            return this;
        }

        public C36572a(Intent intent) {
            this.f94131b = 366;
            this.f94132c = 670;
            this.f94133d = -1;
            int[] iArr = new int[2];
            this.f94134e = iArr;
            this.f94130a = intent;
            iArr[0] = -1;
            iArr[1] = -1;
        }

        public C36572a(Intent intent, int i) {
            this(intent);
            this.f94136g = i;
        }

        public C36572a(Intent intent, DesktopConstants.UIType uIType) {
            this(intent, 0, uIType);
        }

        public C36572a(Intent intent, int i, DesktopConstants.UIType uIType) {
            this(intent, i);
            int i2 = C365711.f94129a[uIType.ordinal()];
            if (i2 == 1) {
                this.f94131b = 366;
                this.f94132c = 670;
            } else if (i2 == 2) {
                this.f94131b = 566;
                this.f94132c = 670;
            } else if (i2 == 3) {
                this.f94131b = 650;
                this.f94132c = 450;
            }
        }
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.StandAloneParam$1 */
    static /* synthetic */ class C365711 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94129a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType[] r0 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.desktopmode.base.StandAloneParam.C365711.f94129a = r0
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.WINDOW_NORMAL_D1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.desktopmode.base.StandAloneParam.C365711.f94129a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.WINDOW_WIDE_D2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.desktopmode.base.StandAloneParam.C365711.f94129a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.WINDOW_CENTER_D3     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.desktopmode.base.StandAloneParam.C365711.<clinit>():void");
        }
    }

    public StandAloneParam(Intent intent2, int i, int[] iArr, int i2, int i3, int i4, boolean z) {
        this.intent = intent2;
        this.launchMode = i;
        this.targetCoordination = iArr;
        this.targetWindowWidth = i2;
        this.targetWindowHeight = i3;
        this.requestCode = i4;
        this.clipChildren = z;
    }
}
