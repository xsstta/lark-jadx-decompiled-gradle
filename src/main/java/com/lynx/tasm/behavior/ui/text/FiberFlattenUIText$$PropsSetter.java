package com.lynx.tasm.behavior.ui.text;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter;

public class FiberFlattenUIText$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        FiberFlattenUIText fiberFlattenUIText = (FiberFlattenUIText) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2137322088:
                    if (str.equals("include-font-padding")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1370507312:
                    if (str.equals("text-gradient")) {
                        c = 1;
                        break;
                    }
                    break;
                case 125536225:
                    if (str.equals("use-web-line-height")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1629007544:
                    if (str.equals("text-maxline")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2104465578:
                    if (str.equals("text-maxlength")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                fiberFlattenUIText.setIncludeFontPadding(sVar.mo94776a(str, false));
            } else if (c == 1) {
                fiberFlattenUIText.setTextGradient(sVar.mo94778c(str));
            } else if (c == 2) {
                fiberFlattenUIText.setTextMaxLength(sVar.mo94778c(str));
            } else if (c == 3) {
                fiberFlattenUIText.setTextMaxLine(sVar.mo94778c(str));
            } else if (c != 4) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                fiberFlattenUIText.setUseWebLineHeight(sVar.mo94776a(str, false));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
