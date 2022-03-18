package com.bytedance.lark.lynxlib.widget.udtabs;

import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

public class LynxViewPager$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxViewPager lynxViewPager = (LynxViewPager) lynxBaseUI;
        char c = 65535;
        try {
            if (str.hashCode() == 942654657) {
                if (str.equals("select-index")) {
                    c = 0;
                }
            }
            if (c != 0) {
                super.mo53254a(lynxBaseUI, str, sVar);
            } else {
                lynxViewPager.setSelect(sVar.mo94774a(str, 0));
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
