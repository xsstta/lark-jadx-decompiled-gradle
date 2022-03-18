package com.lynx.tasm.behavior.ui.list;

import android.view.ViewGroup;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.C26888f;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.AbstractC26757c;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.lark.mm.module.list.control.MmListControl;

public abstract class AbsLynxList<T extends ViewGroup> extends UISimpleView<T> {

    /* renamed from: a */
    private int[] f66413a = new int[2];

    /* renamed from: b */
    private int[] f66414b = new int[2];

    /* renamed from: c */
    private C26888f f66415c;

    /* renamed from: d */
    private LynxBaseUI f66416d;

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: c */
    public void mo95130c(LynxBaseUI lynxBaseUI, int i) {
    }

    @LynxProp(customType = "1", name = "cache-queue-ratio")
    public abstract void setCacheQueueRatio(AbstractC26517a aVar);

    @LynxProp(defaultInt = 1, name = "column-count")
    public abstract void setColumnCount(int i);

    @LynxProp(customType = "false", name = "paging-enabled")
    public abstract void setEnablePagerSnap(AbstractC26517a aVar);

    @LynxProp(name = "sticky")
    public abstract void setEnableSticky(AbstractC26517a aVar);

    @LynxProp(customType = "0", name = "initial-scroll-index")
    public abstract void setInitialScrollIndex(AbstractC26517a aVar);

    @LynxProp(customType = "single", name = "list-type")
    public abstract void setListType(String str);

    @LynxProp(defaultInt = MmListControl.f116813f, name = "lower-threshold")
    public abstract void setLowerThreshold(AbstractC26517a aVar);

    @LynxProp(defaultInt = 0, name = "lower-threshold-item-count")
    public void setLowerThresholdItemCount(AbstractC26517a aVar) {
    }

    @LynxProp(defaultBoolean = false, name = "needs-visible-cells")
    public abstract void setNeedVisibleCells(boolean z);

    @LynxProp(customType = "true", name = "enable-scroll")
    public abstract void setScrollEnable(AbstractC26517a aVar);

    @LynxProp(customType = "200", name = "scroll-event-throttle")
    public abstract void setScrollEventThrottle(AbstractC26517a aVar);

    @LynxProp(customType = "10", name = "scroll-state-change-event-throttle")
    public abstract void setScrollStateChangeEventThrottle(String str);

    @LynxProp(customType = "false", name = "scroll-x")
    public abstract void setScrollX(AbstractC26517a aVar);

    @LynxProp(customType = "true", name = "scroll-y")
    public abstract void setScrollY(AbstractC26517a aVar);

    @LynxProp(customType = "none", name = "update-animation")
    public abstract void setUpdateAnimation(String str);

    @LynxProp(defaultInt = MmListControl.f116813f, name = "upper-threshold")
    public abstract void setUpperThreshold(AbstractC26517a aVar);

    @LynxProp(defaultInt = 0, name = "upper-threshold-item-count")
    public void setUpperThresholdItemCount(AbstractC26517a aVar) {
    }

    /* renamed from: d */
    public final JavaOnlyMap mo53300d() {
        return this.f66415c.mo95681a(mo94576q());
    }

    /* renamed from: a */
    public final void mo95255a(LynxUI lynxUI) {
        this.f66415c.mo95682a(mo94576q(), lynxUI.mo94576q());
    }

    public AbsLynxList(AbstractC26684l lVar) {
        super(lVar);
        this.f66415c = lVar.mo94688j();
        this.f66416d = null;
    }

    @LynxProp(customType = "true", name = "over-scroll")
    public void setOverScroll(AbstractC26517a aVar) {
        boolean z;
        ReadableType g = aVar.mo94071g();
        if (g == ReadableType.String) {
            z = "true".equals(aVar.mo94069e());
        } else if (g == ReadableType.Boolean) {
            z = aVar.mo94066b();
        } else {
            z = true;
        }
        if (z) {
            ((ViewGroup) this.f66253Z).setOverScrollMode(0);
        } else {
            ((ViewGroup) this.f66253Z).setOverScrollMode(2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: b */
    public final void mo53262b(LynxBaseUI lynxBaseUI, int i) {
        mo33940a(lynxBaseUI, i);
    }

    /* renamed from: a */
    public final LynxUI mo95254a(int i, long j) {
        this.f66415c.mo95684a(mo94576q(), i, j);
        LynxUI lynxUI = (LynxUI) this.f66416d;
        this.f66416d = null;
        return lynxUI;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public final void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        this.f66416d = lynxBaseUI;
        lynxBaseUI.mo94956a((AbstractC26757c) this);
        this.f66242w.add(this.f66242w.size(), lynxBaseUI);
        mo95130c(lynxBaseUI, i);
    }

    /* renamed from: a */
    public final void mo95256a(LynxUI lynxUI, int i, long j) {
        this.f66415c.mo95683a(mo94576q(), lynxUI.mo94576q(), i, j);
    }
}
