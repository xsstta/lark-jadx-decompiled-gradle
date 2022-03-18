package com.lynx.tasm.behavior.ui;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.lynx.tasm.behavior.C26697s;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;

public class LynxUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        LynxUI lynxUI = (LynxUI) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2005042753:
                    if (str.equals("z-index")) {
                        c = ' ';
                        break;
                    }
                    break;
                case -1970593579:
                    if (str.equals("lynx-test-tag")) {
                        c = 23;
                        break;
                    }
                    break;
                case -1796753876:
                    if (str.equals("pause-transition-name")) {
                        c = 26;
                        break;
                    }
                    break;
                case -1613231517:
                    if (str.equals("resume-transition-name")) {
                        c = 27;
                        break;
                    }
                    break;
                case -1493494988:
                    if (str.equals("animation-name")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1297725862:
                    if (str.equals("layout-animation-create-property")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 24;
                        break;
                    }
                    break;
                case -1185691484:
                    if (str.equals("animation-fill-mode")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1091287993:
                    if (str.equals("overlap")) {
                        c = 25;
                        break;
                    }
                    break;
                case -1087342188:
                    if (str.equals("shared-element")) {
                        c = 28;
                        break;
                    }
                    break;
                case -1013209314:
                    if (str.equals("layout-animation-create-delay")) {
                        c = 11;
                        break;
                    }
                    break;
                case -986025866:
                    if (str.equals("animation-direction")) {
                        c = 2;
                        break;
                    }
                    break;
                case -607295043:
                    if (str.equals("animation-duration")) {
                        c = 3;
                        break;
                    }
                    break;
                case -412530555:
                    if (str.equals("layout-animation-delete-timing-function")) {
                        c = 18;
                        break;
                    }
                    break;
                case -316342365:
                    if (str.equals("layout-animation-update-timing-function")) {
                        c = 22;
                        break;
                    }
                    break;
                case -232004959:
                    if (str.equals("animation-play-state")) {
                        c = 7;
                        break;
                    }
                    break;
                case -49240502:
                    if (str.equals("layout-animation-delete-duration")) {
                        c = 16;
                        break;
                    }
                    break;
                case 315007413:
                    if (str.equals("accessibility-label")) {
                        c = 0;
                        break;
                    }
                    break;
                case 374052076:
                    if (str.equals("layout-animation-update-duration")) {
                        c = 20;
                        break;
                    }
                    break;
                case 633600340:
                    if (str.equals("exit-transition-name")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 805728555:
                    if (str.equals("layout-animation-update-delay")) {
                        c = 19;
                        break;
                    }
                    break;
                case 937178618:
                    if (str.equals("animation-delay")) {
                        c = 1;
                        break;
                    }
                    break;
                case 949630603:
                    if (str.equals("layout-animation-delete-property")) {
                        c = 17;
                        break;
                    }
                    break;
                case 985926797:
                    if (str.equals("layout-animation-delete-delay")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = 29;
                        break;
                    }
                    break;
                case 1352416423:
                    if (str.equals("transform-origin")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1372923181:
                    if (str.equals("layout-animation-update-property")) {
                        c = 21;
                        break;
                    }
                    break;
                case 1485345550:
                    if (str.equals("enter-transition-name")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1820478898:
                    if (str.equals("animation-timing-function")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1939639766:
                    if (str.equals("animation-iteration-count")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1998370329:
                    if (str.equals("layout-animation-create-duration")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 2022810070:
                    if (str.equals("layout-animation-create-timing-function")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    lynxUI.setAccessibilityLabel(sVar.mo94778c(str));
                    return;
                case 1:
                    lynxUI.setAnimationDelay(sVar.mo94772a(str, 0.0d));
                    return;
                case 2:
                    lynxUI.setAnimationDirection(sVar.mo94774a(str, 0));
                    return;
                case 3:
                    lynxUI.setAnimationDuration(sVar.mo94772a(str, 0.0d));
                    return;
                case 4:
                    lynxUI.setAnimationFillMode(sVar.mo94774a(str, 0));
                    return;
                case 5:
                    lynxUI.setAnimationIterationCount(sVar.mo94774a(str, 0));
                    return;
                case 6:
                    lynxUI.setAnimationName(sVar.mo94778c(str));
                    return;
                case 7:
                    lynxUI.setAnimationPlayState(sVar.mo94774a(str, 0));
                    return;
                case '\b':
                    lynxUI.setAnimationTimingFunction(sVar.mo94779d(str));
                    return;
                case '\t':
                    lynxUI.setEnterTransitionName(sVar.mo94779d(str));
                    return;
                case '\n':
                    lynxUI.setExitTransitionName(sVar.mo94779d(str));
                    return;
                case 11:
                    lynxUI.setLayoutAnimationCreateDelay(sVar.mo94772a(str, 0.0d));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    lynxUI.setLayoutAnimationCreateDuration(sVar.mo94772a(str, 0.0d));
                    return;
                case '\r':
                    lynxUI.setLayoutAnimationCreateProperty(sVar.mo94774a(str, 0));
                    return;
                case 14:
                    lynxUI.setLayoutAnimationCreateTimingFunc(sVar.mo94779d(str));
                    return;
                case 15:
                    lynxUI.setLayoutAnimationDeleteDelay(sVar.mo94772a(str, 0.0d));
                    return;
                case 16:
                    lynxUI.setLayoutAnimationDeleteDuration(sVar.mo94772a(str, 0.0d));
                    return;
                case 17:
                    lynxUI.setLayoutAnimationDeleteProperty(sVar.mo94774a(str, 0));
                    return;
                case 18:
                    lynxUI.setLayoutAnimationDeleteTimingFunc(sVar.mo94779d(str));
                    return;
                case 19:
                    lynxUI.setLayoutAnimationUpdateDelay(sVar.mo94778c(str));
                    return;
                case 20:
                    lynxUI.setLayoutAnimationUpdateDuration(sVar.mo94772a(str, 0.0d));
                    return;
                case 21:
                    lynxUI.setLayoutAnimationUpdateProperty(sVar.mo94774a(str, 0));
                    return;
                case 22:
                    lynxUI.setLayoutAnimationUpdateTimingFunc(sVar.mo94779d(str));
                    return;
                case 23:
                    lynxUI.setTestID(sVar.mo94778c(str));
                    return;
                case 24:
                    lynxUI.setAlpha(sVar.mo94773a(str, 1.0f));
                    return;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    lynxUI.setOverlap(sVar.mo94778c(str));
                    return;
                case 26:
                    lynxUI.setPauseTransitionName(sVar.mo94779d(str));
                    return;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    lynxUI.setResumeTransitionName(sVar.mo94779d(str));
                    return;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    lynxUI.setShareElement(sVar.mo94778c(str));
                    return;
                case 29:
                    lynxUI.setTransform(sVar.mo94779d(str));
                    return;
                case 30:
                    lynxUI.setTransformOrigin(sVar.mo94779d(str));
                    return;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    lynxUI.setVisibility(sVar.mo94774a(str, 1));
                    return;
                case ' ':
                    lynxUI.setZIndex(sVar.mo94774a(str, 0));
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
