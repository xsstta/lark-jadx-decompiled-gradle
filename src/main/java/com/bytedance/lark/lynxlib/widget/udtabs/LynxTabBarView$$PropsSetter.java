package com.bytedance.lark.lynxlib.widget.udtabs;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

public class LynxTabBarView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxTabBarView lynxTabBarView = (LynxTabBarView) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -953347877:
                    if (str.equals("tab-mode")) {
                        c = 3;
                        break;
                    }
                    break;
                case -887638045:
                    if (str.equals("tab-layout-gravity")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1027794903:
                    if (str.equals("disable-attach-event")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1939577734:
                    if (str.equals("indicator-full-width")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                lynxTabBarView.setDisableAttachEvent(sVar.mo94776a(str, false));
            } else if (c == 1) {
                lynxTabBarView.setIndicatorFullWidth(sVar.mo94776a(str, false));
            } else if (c == 2) {
                lynxTabBarView.setTabLayoutGravity(sVar.mo94778c(str));
            } else if (c != 3) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                lynxTabBarView.setTabMode(sVar.mo94778c(str));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
