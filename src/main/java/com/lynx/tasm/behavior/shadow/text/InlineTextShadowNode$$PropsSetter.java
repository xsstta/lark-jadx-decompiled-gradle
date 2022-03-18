package com.lynx.tasm.behavior.shadow.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.ShadowNode;

public class InlineTextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
        InlineTextShadowNode inlineTextShadowNode = (InlineTextShadowNode) shadowNode;
        char c = 65535;
        try {
            if (str.hashCode() == 605322756) {
                if (str.equals("background-color")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53285a(shadowNode, str, sVar);
            } else {
                inlineTextShadowNode.setBackgroundColor(sVar.mo94774a(str, 0));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
