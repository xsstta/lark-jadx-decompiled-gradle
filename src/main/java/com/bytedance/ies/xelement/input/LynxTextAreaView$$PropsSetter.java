package com.bytedance.ies.xelement.input;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

public class LynxTextAreaView$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1730062511:
                    if (str.equals("smart-scroll")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1586082113:
                    if (str.equals("font-size")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1550570986:
                    if (str.equals("richtype")) {
                        c = 19;
                        break;
                    }
                    break;
                case -525534091:
                    if (str.equals("fullscreen-mode")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -445272125:
                    if (str.equals("show-soft-input-onfocus")) {
                        c = 20;
                        break;
                    }
                    break;
                case -428786256:
                    if (str.equals("max-height")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -140393755:
                    if (str.equals("placeholder-font-size")) {
                        c = 17;
                        break;
                    }
                    break;
                case 3575610:
                    if (str.equals(ShareHitPoint.f121869d)) {
                        c = 23;
                        break;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 4;
                        break;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        c = 7;
                        break;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        c = 24;
                        break;
                    }
                    break;
                case 124732746:
                    if (str.equals("maxlength")) {
                        c = 11;
                        break;
                    }
                    break;
                case 270940796:
                    if (str.equals("disabled")) {
                        c = 6;
                        break;
                    }
                    break;
                case 419784731:
                    if (str.equals("maxlines")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 598246771:
                    if (str.equals("placeholder")) {
                        c = 15;
                        break;
                    }
                    break;
                case 746232421:
                    if (str.equals("text-align")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1101235489:
                    if (str.equals("adjust-mode")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1155760891:
                    if (str.equals("bottom-inset")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1216985755:
                    if (str.equals("password")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1437560563:
                    if (str.equals("auto-fit")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1901673625:
                    if (str.equals("caret-color")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2018420361:
                    if (str.equals("placeholder-color")) {
                        c = 16;
                        break;
                    }
                    break;
                case 2033358039:
                    if (str.equals("placeholder-style")) {
                        c = 18;
                        break;
                    }
                    break;
                case 2043213058:
                    if (str.equals("min-height")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 2051146279:
                    if (str.equals("confirm-type")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            Integer num = null;
            Boolean bool = null;
            switch (c) {
                case 0:
                    lynxTextAreaView.setAdjustMode(sVar.mo94778c(str));
                    return;
                case 1:
                    lynxTextAreaView.setAutoFit(sVar.mo94776a(str, false));
                    return;
                case 2:
                    lynxTextAreaView.setBottomInset(sVar.mo94778c(str));
                    return;
                case 3:
                    lynxTextAreaView.setCursorColor(sVar.mo94778c(str));
                    return;
                case 4:
                    lynxTextAreaView.setFontColor(sVar.mo94781f(str));
                    return;
                case 5:
                    lynxTextAreaView.setConfirmType(sVar.mo94778c(str));
                    return;
                case 6:
                    lynxTextAreaView.setDisable(sVar.mo94776a(str, false));
                    return;
                case 7:
                    lynxTextAreaView.setFocus(sVar.mo94776a(str, false));
                    return;
                case '\b':
                    lynxTextAreaView.setFontTextSize(sVar.mo94773a(str, BitmapDescriptorFactory.HUE_RED));
                    return;
                case '\t':
                    lynxTextAreaView.setKeyBoardFullscreenMode(sVar.mo94776a(str, false));
                    return;
                case '\n':
                    lynxTextAreaView.setMaxHeight(sVar.mo94778c(str));
                    return;
                case 11:
                    lynxTextAreaView.setMaxLength(sVar.mo94781f(str));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    if (!sVar.mo94777b(str)) {
                        num = Integer.valueOf(sVar.mo94774a(str, 0));
                    }
                    lynxTextAreaView.setMaxLines(num);
                    return;
                case '\r':
                    lynxTextAreaView.setMinHeight(sVar.mo94778c(str));
                    return;
                case 14:
                    lynxTextAreaView.setIsPassword(sVar.mo94776a(str, false));
                    return;
                case 15:
                    lynxTextAreaView.setPlaceholder(sVar.mo94778c(str));
                    return;
                case 16:
                    lynxTextAreaView.setPlaceholderColor(sVar.mo94781f(str));
                    return;
                case 17:
                    lynxTextAreaView.setPlaceholderTextSize(sVar.mo94781f(str));
                    return;
                case 18:
                    lynxTextAreaView.setPlaceHolderStyle(sVar.mo94780e(str));
                    return;
                case 19:
                    lynxTextAreaView.setRichType(sVar.mo94778c(str));
                    return;
                case 20:
                    if (!sVar.mo94777b(str)) {
                        bool = Boolean.valueOf(sVar.mo94776a(str, false));
                    }
                    lynxTextAreaView.setShowSoftInputOnFocus(bool);
                    return;
                case 21:
                    lynxTextAreaView.setSmartScroll(sVar.mo94776a(str, false));
                    return;
                case 22:
                    lynxTextAreaView.setTextAlign(sVar.mo94774a(str, 0));
                    return;
                case 23:
                    lynxTextAreaView.setInputType(sVar.mo94778c(str));
                    return;
                case 24:
                    lynxTextAreaView.setInputValue(sVar.mo94778c(str));
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
