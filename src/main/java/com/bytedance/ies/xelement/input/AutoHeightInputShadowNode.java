package com.bytedance.ies.xelement.input;

import com.lynx.tasm.behavior.shadow.C26704e;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/xelement/input/AutoHeightInputShadowNode;", "Lcom/lynx/tasm/behavior/shadow/text/TextShadowNode;", "()V", "measure", "", "node", "Lcom/lynx/tasm/behavior/shadow/LayoutNode;", "width", "", "widthMode", "Lcom/lynx/tasm/behavior/shadow/MeasureMode;", "height", "heightMode", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
public class AutoHeightInputShadowNode extends TextShadowNode {
    @Override // com.lynx.tasm.behavior.shadow.AbstractC26703d, com.lynx.tasm.behavior.shadow.text.TextShadowNode
    /* renamed from: a */
    public long mo53284a(LayoutNode layoutNode, float f, MeasureMode measureMode, float f2, MeasureMode measureMode2) {
        Intrinsics.checkParameterIsNotNull(layoutNode, "node");
        Intrinsics.checkParameterIsNotNull(measureMode, "widthMode");
        Intrinsics.checkParameterIsNotNull(measureMode2, "heightMode");
        LynxBaseUI a = mo94810m().mo94652a(mo94808k());
        if (!(a instanceof LynxTextAreaView)) {
            a = null;
        }
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) a;
        if (lynxTextAreaView != null) {
            return C26704e.m96792a(f, (float) lynxTextAreaView.mo53311o());
        }
        return C26704e.m96793a(0, 0);
    }
}
