package com.bytedance.lynx.tasm.ui.imageloader;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public class UIFilterImage$$PropsSetter extends UIImage$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.bytedance.lynx.tasm.ui.imageloader.UIImage$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        UIFilterImage uIFilterImage = (UIFilterImage) lynxBaseUI;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -992552514) {
                if (hashCode == 681292984) {
                    if (str.equals("blur-radius")) {
                        c = 0;
                    }
                }
            } else if (str.equals("drop-shadow")) {
                c = 1;
            }
            if (c == 0) {
                uIFilterImage.setBlurRadius(sVar.mo94778c(str));
            } else if (c != 1) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                uIFilterImage.setDropShadow(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
