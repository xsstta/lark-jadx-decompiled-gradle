package com.lynx.tasm.behavior.ui.scroll;

import android.view.ViewGroup;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;

public abstract class AbsLynxUIScroll<T extends ViewGroup> extends UISimpleView<T> {
    /* renamed from: a */
    public void mo95337a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    /* renamed from: a */
    public void mo95338a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i) {
    }

    /* renamed from: a */
    public abstract void mo95339a(boolean z);

    /* renamed from: b */
    public abstract void mo95340b(boolean z);

    @LynxProp(defaultBoolean = true, name = "enable-scroll")
    public void setEnableScroll(boolean z) {
    }

    @LynxProp(defaultInt = 0, name = "lower-threshold")
    public abstract void setLowerThreshole(int i);

    @LynxProp(defaultBoolean = false, name = "scroll-bar-enable")
    public abstract void setScrollBarEnable(boolean z);

    @LynxProp(defaultInt = 0, name = "scroll-left")
    public abstract void setScrollLeft(int i);

    @LynxProp(defaultBoolean = false, name = "scroll-tap")
    public abstract void setScrollTap(boolean z);

    @LynxProp(defaultInt = 0, name = "scroll-top")
    public abstract void setScrollTop(int i);

    @LynxProp(defaultInt = 0, name = "upper-threshold")
    public abstract void setUpperThreshole(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$1 */
    public static /* synthetic */ class C268041 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66509a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll.C268041.f66509a = r0
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll.C268041.f66509a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.lynx.react.bridge.ReadableType r1 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll.C268041.<clinit>():void");
        }
    }

    public AbsLynxUIScroll(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxProp(name = "scroll-x")
    public void setScrollX(AbstractC26517a aVar) {
        if (aVar == null) {
            mo95340b(false);
            return;
        }
        int i = C268041.f66509a[aVar.mo94071g().ordinal()];
        if (i == 1) {
            mo95340b(aVar.mo94066b());
        } else if (i == 2) {
            mo95340b("true".equals(aVar.mo94069e()));
        }
    }

    @LynxProp(name = "scroll-y")
    public void setScrollY(AbstractC26517a aVar) {
        if (aVar == null) {
            mo95339a(true);
            return;
        }
        int i = C268041.f66509a[aVar.mo94071g().ordinal()];
        if (i == 1) {
            mo95339a(aVar.mo94066b());
        } else if (i == 2) {
            mo95339a("true".equals(aVar.mo94069e()));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
        ReadableMap readableMap = sVar.f66083a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            char c = 65535;
            try {
                switch (nextKey.hashCode()) {
                    case -1571036001:
                        if (nextKey.equals("lower-threshold")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -402166408:
                        if (nextKey.equals("scroll-x")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -402166407:
                        if (nextKey.equals("scroll-y")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -169901481:
                        if (nextKey.equals("enable-scroll")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 65137827:
                        if (nextKey.equals("scroll-tap")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 65138261:
                        if (nextKey.equals("scroll-top")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 660290816:
                        if (nextKey.equals("upper-threshold")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1751260029:
                        if (nextKey.equals("scroll-bar-enable")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 2019037959:
                        if (nextKey.equals("scroll-left")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        setEnableScroll(readableMap.getBoolean(nextKey, true));
                        break;
                    case 1:
                        setLowerThreshole(readableMap.getInt(nextKey, 0));
                        break;
                    case 2:
                        setScrollBarEnable(readableMap.getBoolean(nextKey, false));
                        break;
                    case 3:
                        setScrollLeft(readableMap.getInt(nextKey, 0));
                        break;
                    case 4:
                        setScrollTap(readableMap.getBoolean(nextKey, false));
                        break;
                    case 5:
                        setScrollTop(readableMap.getInt(nextKey, 0));
                        break;
                    case 6:
                        setScrollX(readableMap.getDynamic(nextKey));
                        break;
                    case 7:
                        setScrollY(readableMap.getDynamic(nextKey));
                        break;
                    case '\b':
                        setUpperThreshole(readableMap.getInt(nextKey, 0));
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo53259a(sVar);
    }
}
