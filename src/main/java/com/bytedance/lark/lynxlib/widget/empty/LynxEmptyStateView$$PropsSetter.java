package com.bytedance.lark.lynxlib.widget.empty;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

public class LynxEmptyStateView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxEmptyStateView lynxEmptyStateView = (LynxEmptyStateView) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2143207164:
                    if (str.equals("secondary-action-top-margin")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1488979661:
                    if (str.equals("image-size")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1216561690:
                    if (str.equals("secondary-text")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1160394216:
                    if (str.equals("primary-text")) {
                        c = 11;
                        break;
                    }
                    break;
                case -728523665:
                    if (str.equals("primary-action-enable")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -465387874:
                    if (str.equals("image-bottom-margin")) {
                        c = 2;
                        break;
                    }
                    break;
                case -129165806:
                    if (str.equals("primary-action-top-margin")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -64548767:
                    if (str.equals("secondary-action-enable")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3079825:
                    if (str.equals("desc")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        c = 16;
                        break;
                    }
                    break;
                case 214055131:
                    if (str.equals("title-bottom-margin")) {
                        c = 17;
                        break;
                    }
                    break;
                case 449325929:
                    if (str.equals("link-action")) {
                        c = 6;
                        break;
                    }
                    break;
                case 556428391:
                    if (str.equals("link-action-enable")) {
                        c = 7;
                        break;
                    }
                    break;
                case 682367301:
                    if (str.equals("primary-action-style")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1216883197:
                    if (str.equals("image-size-mode")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1293192686:
                    if (str.equals("desc-inline-hyperlink")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1673617171:
                    if (str.equals("secondary-action-style")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1837524118:
                    if (str.equals("img-res-id-str")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    lynxEmptyStateView.setDesc(sVar.mo94778c(str));
                    return;
                case 1:
                    lynxEmptyStateView.setHyperlink(sVar.mo94778c(str));
                    return;
                case 2:
                    lynxEmptyStateView.setImageBottomMargin(sVar.mo94774a(str, 0));
                    return;
                case 3:
                    lynxEmptyStateView.setImageSize(sVar.mo94773a(str, BitmapDescriptorFactory.HUE_RED));
                    return;
                case 4:
                    lynxEmptyStateView.setImageSizeMode(sVar.mo94778c(str));
                    return;
                case 5:
                    lynxEmptyStateView.setImageResId(sVar.mo94778c(str));
                    return;
                case 6:
                    lynxEmptyStateView.setLinkAction(sVar.mo94778c(str));
                    return;
                case 7:
                    lynxEmptyStateView.setLinkActionEnabled(sVar.mo94776a(str, false));
                    return;
                case '\b':
                    lynxEmptyStateView.setPrimaryActionEnabled(sVar.mo94776a(str, false));
                    return;
                case '\t':
                    lynxEmptyStateView.setPrimaryActionStyle(sVar.mo94778c(str));
                    return;
                case '\n':
                    lynxEmptyStateView.setPrimaryActionTopMargin(sVar.mo94774a(str, 0));
                    return;
                case 11:
                    lynxEmptyStateView.setPrimaryText(sVar.mo94778c(str));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    lynxEmptyStateView.setSecondaryActionEnabled(sVar.mo94776a(str, false));
                    return;
                case '\r':
                    lynxEmptyStateView.setSecondaryActionStyle(sVar.mo94778c(str));
                    return;
                case 14:
                    lynxEmptyStateView.setSecondaryActionTopMargin(sVar.mo94774a(str, 0));
                    return;
                case 15:
                    lynxEmptyStateView.setSecondaryText(sVar.mo94778c(str));
                    return;
                case 16:
                    lynxEmptyStateView.setTitle(sVar.mo94778c(str));
                    return;
                case 17:
                    lynxEmptyStateView.setTitleBottomMargin(sVar.mo94774a(str, 0));
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
