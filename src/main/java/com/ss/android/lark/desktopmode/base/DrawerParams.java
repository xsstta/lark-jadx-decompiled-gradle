package com.ss.android.lark.desktopmode.base;

import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FragmentParams;
import com.ss.android.lark.log.Log;

public class DrawerParams extends FragmentParams {
    private final boolean dimBehind;
    private final int drawerWidth;

    public int getDrawerWidth() {
        return this.drawerWidth;
    }

    public boolean isDimBehind() {
        return this.dimBehind;
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.DrawerParams$a */
    public static final class C36565a extends FragmentParams.AbstractC36568a<C36565a, DrawerParams> {

        /* renamed from: a */
        public boolean f94113a;

        /* renamed from: b */
        public int f94114b = 320;

        /* renamed from: a */
        public DrawerParams mo134930b() {
            return new DrawerParams(this);
        }

        public C36565a() {
            super(ContainerType.Drawer);
        }

        /* renamed from: a */
        public C36565a mo134928a(int i) {
            this.f94114b = i;
            return this;
        }

        public C36565a(DesktopConstants.UIType uIType) {
            super(ContainerType.Drawer);
            int i = C365641.f94112a[uIType.ordinal()];
            if (i == 1) {
                this.f94114b = 320;
                this.f94113a = false;
            } else if (i != 2) {
                Log.m165383e("DrawerParams", "ui type is undefined");
            } else {
                this.f94114b = -1;
                this.f94113a = false;
            }
        }
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.DrawerParams$1 */
    static /* synthetic */ class C365641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94112a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType[] r0 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.desktopmode.base.DrawerParams.C365641.f94112a = r0
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.DRAWER_NORMAL_C1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.desktopmode.base.DrawerParams.C365641.f94112a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.desktopmode.base.DesktopConstants$UIType r1 = com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.DRAWER_MAX_C2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.desktopmode.base.DrawerParams.C365641.<clinit>():void");
        }
    }

    public DrawerParams(C36565a aVar) {
        super(ContainerType.Drawer, aVar.f94126k);
        this.dimBehind = aVar.f94113a;
        this.drawerWidth = aVar.f94114b;
    }

    public DrawerParams(boolean z) {
        super(ContainerType.Drawer, false);
        this.dimBehind = z;
        this.drawerWidth = 320;
    }

    public DrawerParams(boolean z, int i) {
        super(ContainerType.Drawer, false);
        this.dimBehind = z;
        this.drawerWidth = i;
    }
}
