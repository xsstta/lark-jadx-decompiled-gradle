package com.lynx.tasm.behavior.shadow;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;

public class ShadowNode$$PropsSetter implements ShadowNodeSetter<ShadowNode> {
    @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
        char c = 65535;
        try {
            if (str.hashCode() == -1559879186) {
                if (str.equals("vertical-align")) {
                    c = 0;
                }
            }
            if (c == 0) {
                shadowNode.setVerticalAlign(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
