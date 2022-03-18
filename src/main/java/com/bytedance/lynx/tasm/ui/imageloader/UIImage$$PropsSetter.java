package com.bytedance.lynx.tasm.ui.imageloader;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

public class UIImage$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        UIImage uIImage = (UIImage) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 114148) {
                if (hashCode != 3357091) {
                    if (hashCode == 303428509) {
                        if (str.equals("enable-detach-clear")) {
                            c = 0;
                        }
                    }
                } else if (str.equals("mode")) {
                    c = 1;
                }
            } else if (str.equals("src")) {
                c = 2;
            }
            if (c == 0) {
                uIImage.setEnableDetachedClear(sVar.mo94776a(str, false));
            } else if (c == 1) {
                uIImage.setObjectFit(sVar.mo94778c(str));
            } else if (c != 2) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                uIImage.setSource(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
