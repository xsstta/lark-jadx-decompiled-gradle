package com.lynx.tasm.behavior.ui.image;

import com.huawei.hms.android.HwBuildEx;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

public class AbsUIImage$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        AbsUIImage absUIImage = (AbsUIImage) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1937917490:
                    if (str.equals("cap-insets-scale")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1249491252:
                    if (str.equals("cover-start")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        c = 11;
                        break;
                    }
                    break;
                case -629825370:
                    if (str.equals("loop-count")) {
                        c = 6;
                        break;
                    }
                    break;
                case -256430480:
                    if (str.equals("prefetch-width")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 114148:
                    if (str.equals("src")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3357091:
                    if (str.equals("mode")) {
                        c = 7;
                        break;
                    }
                    break;
                case 207594941:
                    if (str.equals("prefetch-height")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 516005201:
                    if (str.equals("cap-insets")) {
                        c = 1;
                        break;
                    }
                    break;
                case 598246771:
                    if (str.equals("placeholder")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 681292984:
                    if (str.equals("blur-radius")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1198809474:
                    if (str.equals("disable-default-placeholder")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1515751784:
                    if (str.equals("capInsets")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    absUIImage.setBlurRadius(sVar.mo94778c(str));
                    return;
                case 1:
                    absUIImage.setCapInsetsBackUp(sVar.mo94778c(str));
                    return;
                case 2:
                    absUIImage.setCapInsetsScale(sVar.mo94778c(str));
                    return;
                case 3:
                    absUIImage.setCapInsets(sVar.mo94778c(str));
                    return;
                case 4:
                    absUIImage.setCoverStart(sVar.mo94776a(str, false));
                    return;
                case 5:
                    absUIImage.setDisableDefaultPlaceholder(sVar.mo94776a(str, false));
                    return;
                case 6:
                    absUIImage.setLoopCount(sVar.mo94774a(str, 0));
                    return;
                case 7:
                    absUIImage.setObjectFit(sVar.mo94778c(str));
                    return;
                case '\b':
                    absUIImage.setPlaceholder(sVar.mo94778c(str));
                    return;
                case '\t':
                    absUIImage.setPreFetchHeight(sVar.mo94778c(str));
                    return;
                case '\n':
                    absUIImage.setPreFetchWidth(sVar.mo94778c(str));
                    return;
                case 11:
                    absUIImage.setRepeat(sVar.mo94776a(str, false));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    absUIImage.setSource(sVar.mo94778c(str));
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
