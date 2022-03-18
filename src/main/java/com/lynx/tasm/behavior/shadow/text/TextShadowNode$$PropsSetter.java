package com.lynx.tasm.behavior.shadow.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.ShadowNode;

public class TextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
        TextShadowNode textShadowNode = (TextShadowNode) shadowNode;
        char c = 65535;
        try {
            if (str.hashCode() == 375997564) {
                if (str.equals("word-break")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53285a(shadowNode, str, sVar);
            } else {
                textShadowNode.setWordBreakStrategy(sVar.mo94774a(str, 0));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
