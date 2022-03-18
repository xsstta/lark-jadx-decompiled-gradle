package com.lynx.tasm.behavior.ui.list;

import com.huawei.hms.android.HwBuildEx;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

public class AbsLynxList$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter
    /* renamed from: a */
    public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
        AbsLynxList absLynxList = (AbsLynxList) lynxBaseUI;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1571036001:
                    if (str.equals("lower-threshold")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1554128936:
                    if (str.equals("column-count")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1270238455:
                    if (str.equals("list-type")) {
                        c = 4;
                        break;
                    }
                    break;
                case -892259863:
                    if (str.equals("sticky")) {
                        c = 14;
                        break;
                    }
                    break;
                case -592430592:
                    if (str.equals("paging-enabled")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -505303290:
                    if (str.equals("needs-visible-cells")) {
                        c = 7;
                        break;
                    }
                    break;
                case -411446853:
                    if (str.equals("initial-scroll-index")) {
                        c = 3;
                        break;
                    }
                    break;
                case -402166408:
                    if (str.equals("scroll-x")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -402166407:
                    if (str.equals("scroll-y")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -169901481:
                    if (str.equals("enable-scroll")) {
                        c = 2;
                        break;
                    }
                    break;
                case -137292606:
                    if (str.equals("upper-threshold-item-count")) {
                        c = 17;
                        break;
                    }
                    break;
                case 10993126:
                    if (str.equals("over-scroll")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 660290816:
                    if (str.equals("upper-threshold")) {
                        c = 16;
                        break;
                    }
                    break;
                case 693516932:
                    if (str.equals("cache-queue-ratio")) {
                        c = 0;
                        break;
                    }
                    break;
                case 875338749:
                    if (str.equals("scroll-event-throttle")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1191691203:
                    if (str.equals("lower-threshold-item-count")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1861761406:
                    if (str.equals("scroll-state-change-event-throttle")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1883148160:
                    if (str.equals("update-animation")) {
                        c = 15;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    absLynxList.setCacheQueueRatio(sVar.mo94781f(str));
                    return;
                case 1:
                    absLynxList.setColumnCount(sVar.mo94774a(str, 1));
                    return;
                case 2:
                    absLynxList.setScrollEnable(sVar.mo94781f(str));
                    return;
                case 3:
                    absLynxList.setInitialScrollIndex(sVar.mo94781f(str));
                    return;
                case 4:
                    absLynxList.setListType(sVar.mo94778c(str));
                    return;
                case 5:
                    absLynxList.setLowerThreshold(sVar.mo94781f(str));
                    return;
                case 6:
                    absLynxList.setLowerThresholdItemCount(sVar.mo94781f(str));
                    return;
                case 7:
                    absLynxList.setNeedVisibleCells(sVar.mo94776a(str, false));
                    return;
                case '\b':
                    absLynxList.setOverScroll(sVar.mo94781f(str));
                    return;
                case '\t':
                    absLynxList.setEnablePagerSnap(sVar.mo94781f(str));
                    return;
                case '\n':
                    absLynxList.setScrollEventThrottle(sVar.mo94781f(str));
                    return;
                case 11:
                    absLynxList.setScrollStateChangeEventThrottle(sVar.mo94778c(str));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    absLynxList.setScrollX(sVar.mo94781f(str));
                    return;
                case '\r':
                    absLynxList.setScrollY(sVar.mo94781f(str));
                    return;
                case 14:
                    absLynxList.setEnableSticky(sVar.mo94781f(str));
                    return;
                case 15:
                    absLynxList.setUpdateAnimation(sVar.mo94778c(str));
                    return;
                case 16:
                    absLynxList.setUpperThreshold(sVar.mo94781f(str));
                    return;
                case 17:
                    absLynxList.setUpperThresholdItemCount(sVar.mo94781f(str));
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
