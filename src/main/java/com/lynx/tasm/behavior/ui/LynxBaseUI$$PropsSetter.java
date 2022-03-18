package com.lynx.tasm.behavior.ui;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.utils.LynxUISetter;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;

public class LynxBaseUI$$PropsSetter implements LynxUISetter<LynxBaseUI> {
    @Override // com.lynx.tasm.behavior.utils.LynxUISetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        char c;
        try {
            switch (str.hashCode()) {
                case -2114666131:
                    if (str.equals("overflow-x")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -2114666130:
                    if (str.equals("overflow-y")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -1988632153:
                    if (str.equals("scroll-monitor-tag")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case -1970593579:
                    if (str.equals("lynx-test-tag")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -1820411228:
                    if (str.equals("border-bottom-right-radius")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1779213470:
                    if (str.equals("box-shadow")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1586082113:
                    if (str.equals("font-size")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1332194002:
                    if (str.equals("background")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1138223116:
                    if (str.equals("image-config")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1124782267:
                    if (str.equals("react-ref")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1032412580:
                    if (str.equals("border-top-right-radius")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -992853731:
                    if (str.equals("ignore-focus")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case -962590849:
                    if (str.equals(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -585734562:
                    if (str.equals("border-left-color")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -570796884:
                    if (str.equals("border-left-style")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -567450431:
                    if (str.equals("border-left-width")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -91694673:
                    if (str.equals("clip-radius")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -20727064:
                    if (str.equals("background-position")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3373707:
                    if (str.equals("name")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case 143851658:
                    if (str.equals("border-top-color")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 158789336:
                    if (str.equals("border-top-style")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 162135789:
                    if (str.equals("border-top-width")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 307025104:
                    if (str.equals("border-style")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 310371557:
                    if (str.equals("border-width")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 315007413:
                    if (str.equals("accessibility-label")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 419144785:
                    if (str.equals("border-right-color")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 431395352:
                    if (str.equals("outline-color")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 434082463:
                    if (str.equals("border-right-style")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 437428916:
                    if (str.equals("border-right-width")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 446333030:
                    if (str.equals("outline-style")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case 449679483:
                    if (str.equals("outline-width")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case 605322756:
                    if (str.equals("background-color")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 609634231:
                    if (str.equals("border-bottom-left-radius")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 610793468:
                    if (str.equals("background-image")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 738316676:
                    if (str.equals("user-interaction-enabled")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case 881039699:
                    if (str.equals("border-radius")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 956705090:
                    if (str.equals("border-bottom-color")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 971642768:
                    if (str.equals("border-bottom-style")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 974989221:
                    if (str.equals("border-bottom-width")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1266449551:
                    if (str.equals("background-clip")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1266923840:
                    if (str.equals("background-size")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1455741924:
                    if (str.equals("enable-scroll-monitor")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 1466337535:
                    if (str.equals("border-top-left-radius")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 1629011506:
                    if (str.equals("focusable")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 1740315162:
                    if (str.equals("idSelector")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 1901673625:
                    if (str.equals("caret-color")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1931359397:
                    if (str.equals("background-origin")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2005447450:
                    if (str.equals("background-repeat")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            switch (c) {
                case 0:
                    lynxBaseUI.setAccessibilityLabel(sVar.mo94778c(str));
                    return;
                case 1:
                    lynxBaseUI.setBackGround(sVar.mo94778c(str));
                    return;
                case 2:
                    lynxBaseUI.setBackgroundClip(sVar.mo94779d(str));
                    return;
                case 3:
                    lynxBaseUI.setBackgroundColor(sVar.mo94774a(str, 0));
                    return;
                case 4:
                    lynxBaseUI.setBackgroundImage(sVar.mo94778c(str));
                    return;
                case 5:
                    lynxBaseUI.setBackgroundOrigin(sVar.mo94779d(str));
                    return;
                case 6:
                    lynxBaseUI.setBackgroundPosition(sVar.mo94779d(str));
                    return;
                case 7:
                    lynxBaseUI.setBackgroundRepeat(sVar.mo94779d(str));
                    return;
                case '\b':
                    lynxBaseUI.setBackgroundSize(sVar.mo94779d(str));
                    return;
                case '\t':
                    if (!sVar.mo94777b(str)) {
                        num = Integer.valueOf(sVar.mo94774a(str, 0));
                    }
                    lynxBaseUI.setBorderColor(3, num);
                    return;
                case '\n':
                    lynxBaseUI.setBorderRadius(4, sVar.mo94778c(str));
                    return;
                case 11:
                    lynxBaseUI.setBorderRadius(3, sVar.mo94778c(str));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    lynxBaseUI.setBorderStyle(4, sVar.mo94774a(str, -1));
                    return;
                case '\r':
                    lynxBaseUI.setBorderWidth(4, sVar.mo94774a(str, 0));
                    return;
                case 14:
                    if (!sVar.mo94777b(str)) {
                        num4 = Integer.valueOf(sVar.mo94774a(str, 0));
                    }
                    lynxBaseUI.setBorderColor(0, num4);
                    return;
                case 15:
                    lynxBaseUI.setBorderStyle(1, sVar.mo94774a(str, -1));
                    return;
                case 16:
                    lynxBaseUI.setBorderWidth(1, sVar.mo94774a(str, 0));
                    return;
                case 17:
                    lynxBaseUI.setBorderRadius(0, sVar.mo94778c(str));
                    return;
                case 18:
                    if (!sVar.mo94777b(str)) {
                        num3 = Integer.valueOf(sVar.mo94774a(str, 0));
                    }
                    lynxBaseUI.setBorderColor(1, num3);
                    return;
                case 19:
                    lynxBaseUI.setBorderStyle(2, sVar.mo94774a(str, -1));
                    return;
                case 20:
                    lynxBaseUI.setBorderWidth(2, sVar.mo94774a(str, 0));
                    return;
                case 21:
                    lynxBaseUI.setBorderStyle(0, sVar.mo94774a(str, -1));
                    return;
                case 22:
                    if (!sVar.mo94777b(str)) {
                        num2 = Integer.valueOf(sVar.mo94774a(str, 0));
                    }
                    lynxBaseUI.setBorderColor(2, num2);
                    return;
                case 23:
                    lynxBaseUI.setBorderRadius(1, sVar.mo94778c(str));
                    return;
                case 24:
                    lynxBaseUI.setBorderRadius(2, sVar.mo94778c(str));
                    return;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    lynxBaseUI.setBorderStyle(3, sVar.mo94774a(str, -1));
                    return;
                case 26:
                    lynxBaseUI.setBorderWidth(3, sVar.mo94774a(str, 0));
                    return;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    lynxBaseUI.setBorderWidth(0, sVar.mo94774a(str, 0));
                    return;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    lynxBaseUI.setBoxShadow(sVar.mo94779d(str));
                    return;
                case 29:
                    lynxBaseUI.setCaretColor(sVar.mo94778c(str));
                    return;
                case 30:
                    lynxBaseUI.setClipToRadius(sVar.mo94778c(str));
                    return;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    lynxBaseUI.setLynxDirection(sVar.mo94774a(str, 0));
                    return;
                case ' ':
                    lynxBaseUI.setEnableScrollMonitor(sVar.mo94776a(str, false));
                    return;
                case '!':
                    if (!sVar.mo94777b(str)) {
                        bool2 = Boolean.valueOf(sVar.mo94776a(str, false));
                    }
                    lynxBaseUI.setFocusable(bool2);
                    return;
                case '\"':
                    lynxBaseUI.setFontSize(sVar.mo94773a(str, 1.0E21f));
                    return;
                case '#':
                    lynxBaseUI.setIdSelector(sVar.mo94778c(str));
                    return;
                case '$':
                    if (!sVar.mo94777b(str)) {
                        bool = Boolean.valueOf(sVar.mo94776a(str, false));
                    }
                    lynxBaseUI.setIgnoreFocus(bool);
                    return;
                case '%':
                    lynxBaseUI.setImageConfig(sVar.mo94778c(str));
                    return;
                case '&':
                    lynxBaseUI.setTestID(sVar.mo94778c(str));
                    return;
                case '\'':
                    lynxBaseUI.setName(sVar.mo94778c(str));
                    return;
                case '(':
                    lynxBaseUI.setOutlineColor(sVar.mo94774a(str, -16777216));
                    return;
                case ')':
                    lynxBaseUI.setOutlineStyle(sVar.mo94774a(str, -1));
                    return;
                case '*':
                    lynxBaseUI.setOutlineWidth(sVar.mo94773a(str, BitmapDescriptorFactory.HUE_RED));
                    return;
                case '+':
                    lynxBaseUI.setOverflow(sVar.mo94774a(str, 1));
                    return;
                case ',':
                    lynxBaseUI.setOverflowX(sVar.mo94774a(str, 1));
                    return;
                case '-':
                    lynxBaseUI.setOverflowY(sVar.mo94774a(str, 1));
                    return;
                case '.':
                    lynxBaseUI.setCSSPosition(sVar.mo94774a(str, 0));
                    return;
                case '/':
                    lynxBaseUI.setRefIdSelector(sVar.mo94778c(str));
                    return;
                case '0':
                    lynxBaseUI.setScrollMonitorTag(sVar.mo94778c(str));
                    return;
                case '1':
                    lynxBaseUI.setUserInteractionEnabled(sVar.mo94776a(str, true));
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
