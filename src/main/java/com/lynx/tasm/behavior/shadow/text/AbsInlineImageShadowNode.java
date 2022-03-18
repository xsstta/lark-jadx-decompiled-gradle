package com.lynx.tasm.behavior.shadow.text;

import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.ui.text.AbstractC26821a;
import java.util.List;

public abstract class AbsInlineImageShadowNode extends ShadowNode {
    /* renamed from: b */
    public abstract AbstractC26821a mo67400b();

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: g */
    public boolean mo94804g() {
        return true;
    }

    @LynxProp(name = "mode")
    public abstract void setMode(String str);

    @LynxProp(name = "src")
    public abstract void setSource(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo94825a(int i, int i2, List<BaseTextShadowNode.C26711b> list) {
        list.add(new BaseTextShadowNode.C26711b(i, i2, mo67400b()));
        list.add(new BaseTextShadowNode.C26711b(i, i2, new C26718e(mo94808k())));
    }
}
