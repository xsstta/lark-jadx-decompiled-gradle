package com.lynx.tasm.behavior.ui.text;

import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.text.FiberBaseTextUI;
import java.util.List;

public abstract class FiberAbsInlineImageUI extends LynxBaseUI {
    /* renamed from: d */
    public abstract AbstractC26821a mo53300d();

    @LynxProp(name = "mode")
    public abstract void setMode(String str);

    @LynxProp(name = "src")
    public abstract void setSource(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95421a(int i, int i2, List<FiberBaseTextUI.C26815b> list) {
        list.add(new FiberBaseTextUI.C26815b(i, i2, mo53300d()));
    }
}
