package com.ss.android.lark.desktopmode.base;

import com.ss.android.lark.desktopmode.base.FragmentParams;

public class MainWindowParams extends FragmentParams {
    private final String tabName;

    public String getTabName() {
        return this.tabName;
    }

    /* renamed from: com.ss.android.lark.desktopmode.base.MainWindowParams$a */
    public static class C36570a extends FragmentParams.AbstractC36568a<C36570a, MainWindowParams> {

        /* renamed from: b */
        protected String f94128b;

        /* renamed from: a */
        public MainWindowParams mo134930b() {
            return new MainWindowParams(this);
        }

        public C36570a(ContainerType containerType) {
            super(containerType);
        }

        /* renamed from: a */
        public C36570a mo134958a(String str) {
            this.f94128b = str;
            return this;
        }
    }

    public MainWindowParams(C36570a aVar) {
        super(aVar.f94125j, aVar.f94126k);
        this.tabName = aVar.f94128b;
    }

    public MainWindowParams(ContainerType containerType, String str) {
        super(containerType, false);
        this.tabName = str;
    }
}
