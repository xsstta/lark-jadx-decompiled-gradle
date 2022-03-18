package com.lynx.tasm.behavior.ui.scroll;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

public class AbsLynxUIScroll$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        AbsLynxUIScroll absLynxUIScroll = (AbsLynxUIScroll) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1571036001:
                    if (str.equals("lower-threshold")) {
                        c = 1;
                        break;
                    }
                    break;
                case -402166408:
                    if (str.equals("scroll-x")) {
                        c = 6;
                        break;
                    }
                    break;
                case -402166407:
                    if (str.equals("scroll-y")) {
                        c = 7;
                        break;
                    }
                    break;
                case -169901481:
                    if (str.equals("enable-scroll")) {
                        c = 0;
                        break;
                    }
                    break;
                case 65137827:
                    if (str.equals("scroll-tap")) {
                        c = 4;
                        break;
                    }
                    break;
                case 65138261:
                    if (str.equals("scroll-top")) {
                        c = 5;
                        break;
                    }
                    break;
                case 660290816:
                    if (str.equals("upper-threshold")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1751260029:
                    if (str.equals("scroll-bar-enable")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2019037959:
                    if (str.equals("scroll-left")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    absLynxUIScroll.setEnableScroll(sVar.mo94776a(str, true));
                    return;
                case 1:
                    absLynxUIScroll.setLowerThreshole(sVar.mo94774a(str, 0));
                    return;
                case 2:
                    absLynxUIScroll.setScrollBarEnable(sVar.mo94776a(str, false));
                    return;
                case 3:
                    absLynxUIScroll.setScrollLeft(sVar.mo94774a(str, 0));
                    return;
                case 4:
                    absLynxUIScroll.setScrollTap(sVar.mo94776a(str, false));
                    return;
                case 5:
                    absLynxUIScroll.setScrollTop(sVar.mo94774a(str, 0));
                    return;
                case 6:
                    absLynxUIScroll.setScrollX(sVar.mo94781f(str));
                    return;
                case 7:
                    absLynxUIScroll.setScrollY(sVar.mo94781f(str));
                    return;
                case '\b':
                    absLynxUIScroll.setUpperThreshole(sVar.mo94774a(str, 0));
                    return;
                default:
                    super.mo53254a(lynxBaseUI, str, sVar);
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
