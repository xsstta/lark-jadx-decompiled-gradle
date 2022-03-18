package com.lynx.tasm.behavior.shadow.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

public class RawTextShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
        RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) shadowNode;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -979172930) {
                if (hashCode == 3556653) {
                    if (str.equals("text")) {
                        c = 1;
                    }
                }
            } else if (str.equals("pseudo")) {
                c = 0;
            }
            if (c == 0) {
                rawTextShadowNode.setPsuedo(sVar.mo94776a(str, false));
            } else if (c != 1) {
                super.mo53285a(shadowNode, str, sVar);
            } else {
                rawTextShadowNode.setText(sVar.mo94781f(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
