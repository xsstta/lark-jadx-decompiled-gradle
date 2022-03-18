package com.bytedance.ies.xelement.banner;

import com.huawei.hms.android.HwBuildEx;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class LynxSwiperView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals("duration")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1597449863:
                    if (str.equals("start-margin")) {
                        c = 18;
                        break;
                    }
                    break;
                case -1596393144:
                    if (str.equals("indicator-dots")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1235498272:
                    if (str.equals("end-margin")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1029251878:
                    if (str.equals("indicator-active-color")) {
                        c = 7;
                        break;
                    }
                    break;
                case -111166008:
                    if (str.equals("next-margin")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 24002884:
                    if (str.equals("previous-margin")) {
                        c = 15;
                        break;
                    }
                    break;
                case 364166425:
                    if (str.equals("touchable")) {
                        c = 19;
                        break;
                    }
                    break;
                case 570418373:
                    if (str.equals("interval")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 914875020:
                    if (str.equals("item-width")) {
                        c = 11;
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
                case 1255595234:
                    if (str.equals("hideshadow")) {
                        c = 6;
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
                        c = 17;
                        break;
                    }
                    break;
                case 1616798838:
                    if (str.equals("shadow-color")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1665556140:
                    if (str.equals("page-margin")) {
                        c = 14;
                        break;
                    }
                    break;
                case 2050488869:
                    if (str.equals("indicator-color")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    lynxSwiperView.setAutoPlay(sVar.mo94776a(str, false));
                    return;
                case 1:
                    lynxSwiperView.setCircular(sVar.mo94776a(str, false));
                    return;
                case 2:
                    lynxSwiperView.setCurrentIndex(sVar.mo94774a(str, 0));
                    return;
                case 3:
                    lynxSwiperView.setCurrentItemId(sVar.mo94778c(str));
                    return;
                case 4:
                    lynxSwiperView.setDuration(sVar.mo94774a(str, ParticipantRepo.f117150c));
                    return;
                case 5:
                    lynxSwiperView.setEndMargin(sVar.mo94781f(str));
                    return;
                case 6:
                    lynxSwiperView.setHideShadow(sVar.mo94776a(str, true));
                    return;
                case 7:
                    lynxSwiperView.setIndicatorActiveColor(sVar.mo94778c(str));
                    return;
                case '\b':
                    lynxSwiperView.setIndicatorColor(sVar.mo94778c(str));
                    return;
                case '\t':
                    lynxSwiperView.setIndicator(sVar.mo94776a(str, false));
                    return;
                case '\n':
                    lynxSwiperView.setInterval(sVar.mo94774a(str, 5000));
                    return;
                case 11:
                    lynxSwiperView.setItemWidth(sVar.mo94781f(str));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    lynxSwiperView.setMode(sVar.mo94778c(str));
                    return;
                case '\r':
                    lynxSwiperView.setNextMargin(sVar.mo94781f(str));
                    return;
                case 14:
                    lynxSwiperView.setPageMargin(sVar.mo94781f(str));
                    return;
                case 15:
                    lynxSwiperView.setPreviousMargin(sVar.mo94781f(str));
                    return;
                case 16:
                    lynxSwiperView.setShadowColor(sVar.mo94778c(str));
                    return;
                case 17:
                    lynxSwiperView.setSmoothScroll(sVar.mo94776a(str, true));
                    return;
                case 18:
                    lynxSwiperView.setStartMargin(sVar.mo94781f(str));
                    return;
                case 19:
                    lynxSwiperView.setTouchable(sVar.mo94776a(str, false));
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
