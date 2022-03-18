package com.bytedance.ies.xelement.swiper;

import com.huawei.hms.android.HwBuildEx;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class XSwiperUI$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        XSwiperUI xSwiperUI = (XSwiperUI) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals("duration")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1596393144:
                    if (str.equals("indicator-dots")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1029251878:
                    if (str.equals("indicator-active-color")) {
                        c = 5;
                        break;
                    }
                    break;
                case -111166008:
                    if (str.equals("next-margin")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 24002884:
                    if (str.equals("previous-margin")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 364166425:
                    if (str.equals("touchable")) {
                        c = 14;
                        break;
                    }
                    break;
                case 570418373:
                    if (str.equals("interval")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1126940025:
                    if (str.equals("current")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1127093697:
                    if (str.equals("current-item-id")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1439562083:
                    if (str.equals("autoplay")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1599847372:
                    if (str.equals("smooth-scroll")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1665556140:
                    if (str.equals("page-margin")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2050488869:
                    if (str.equals("indicator-color")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    xSwiperUI.setAutoPlay(sVar.mo94776a(str, false));
                    return;
                case 1:
                    xSwiperUI.setCircular(sVar.mo94776a(str, false));
                    return;
                case 2:
                    xSwiperUI.setCurrentIndex(sVar.mo94774a(str, 0));
                    return;
                case 3:
                    xSwiperUI.setCurrentItemId(sVar.mo94778c(str));
                    return;
                case 4:
                    xSwiperUI.setDuration(sVar.mo94774a(str, ParticipantRepo.f117150c));
                    return;
                case 5:
                    xSwiperUI.setIndicatorActiveColor(sVar.mo94778c(str));
                    return;
                case 6:
                    xSwiperUI.setIndicatorColor(sVar.mo94778c(str));
                    return;
                case 7:
                    xSwiperUI.setIndicator(sVar.mo94776a(str, false));
                    return;
                case '\b':
                    xSwiperUI.setInterval(sVar.mo94774a(str, 5000));
                    return;
                case '\t':
                    xSwiperUI.setMode(sVar.mo94778c(str));
                    return;
                case '\n':
                    xSwiperUI.setNextMargin(sVar.mo94781f(str));
                    return;
                case 11:
                    xSwiperUI.setPageMargin(sVar.mo94781f(str));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    xSwiperUI.setPreviousMargin(sVar.mo94781f(str));
                    return;
                case '\r':
                    xSwiperUI.setSmoothScroll(sVar.mo94776a(str, true));
                    return;
                case 14:
                    xSwiperUI.setTouchable(sVar.mo94776a(str, false));
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
