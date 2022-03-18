package com.ss.android.lark.desktopmode.base;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.desktopmode.base.MainWindowParams;

public class LeftWindowParams extends MainWindowParams {
    private final int tabWidth;

    public int getTabWidth() {
        return this.tabWidth;
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.LeftWindowParams$a */
    public static final class C36569a extends MainWindowParams.C36570a {

        /* renamed from: a */
        public int f94127a = LocationRequest.PRIORITY_INDOOR;

        @Override // com.ss.android.lark.desktopmode.base.MainWindowParams.C36570a
        /* renamed from: a */
        public MainWindowParams mo134930b() {
            return new LeftWindowParams(this);
        }

        public C36569a() {
            super(ContainerType.Left);
        }
    }

    public LeftWindowParams(C36569a aVar) {
        super(aVar);
        this.tabWidth = aVar.f94127a;
    }

    public LeftWindowParams(ContainerType containerType, String str, int i) {
        super(containerType, str);
        this.tabWidth = i;
    }
}
