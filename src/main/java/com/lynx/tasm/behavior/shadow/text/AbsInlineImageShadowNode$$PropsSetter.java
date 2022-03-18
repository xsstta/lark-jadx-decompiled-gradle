package com.lynx.tasm.behavior.shadow.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

public class AbsInlineImageShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
        AbsInlineImageShadowNode absInlineImageShadowNode = (AbsInlineImageShadowNode) shadowNode;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 114148) {
                if (hashCode == 3357091) {
                    if (str.equals("mode")) {
                        c = 0;
                    }
                }
            } else if (str.equals("src")) {
                c = 1;
            }
            if (c == 0) {
                absInlineImageShadowNode.setMode(sVar.mo94778c(str));
            } else if (c != 1) {
                super.mo53285a(shadowNode, str, sVar);
            } else {
                absInlineImageShadowNode.setSource(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
