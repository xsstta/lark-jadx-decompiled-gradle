package com.lynx.tasm.behavior.shadow.text;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

public class BaseTextShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
        BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) shadowNode;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -2137322088:
                    if (str.equals("include-font-padding")) {
                        c = 6;
                        break;
                    }
                    break;
                case -2125209152:
                    if (str.equals("text-shadow")) {
                        c = 15;
                        break;
                    }
                    break;
                case -2006495646:
                    if (str.equals("white-space")) {
                        c = 18;
                        break;
                    }
                    break;
                case -1988401764:
                    if (str.equals("letter-spacing")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1923578189:
                    if (str.equals("font-style")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1846328470:
                    if (str.equals("line-spacing")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1586082113:
                    if (str.equals("font-size")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1215680224:
                    if (str.equals("line-height")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -930515806:
                    if (str.equals("text-overflow")) {
                        c = 14;
                        break;
                    }
                    break;
                case -231573485:
                    if (str.equals("enable-font-scaling")) {
                        c = 1;
                        break;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 0;
                        break;
                    }
                    break;
                case 108532386:
                    if (str.equals("font-family")) {
                        c = 2;
                        break;
                    }
                    break;
                case 125536225:
                    if (str.equals("use-web-line-height")) {
                        c = 17;
                        break;
                    }
                    break;
                case 431477072:
                    if (str.equals("text-decoration")) {
                        c = 11;
                        break;
                    }
                    break;
                case 598800822:
                    if (str.equals("font-weight")) {
                        c = 5;
                        break;
                    }
                    break;
                case 746232421:
                    if (str.equals("text-align")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 856877710:
                    if (str.equals("text-vertical-align")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1629007544:
                    if (str.equals("text-maxline")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 2104465578:
                    if (str.equals("text-maxlength")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    baseTextShadowNode.setColor(sVar.mo94774a(str, -16777216));
                    return;
                case 1:
                    baseTextShadowNode.setEnableFontScaling(sVar.mo94778c(str));
                    return;
                case 2:
                    baseTextShadowNode.setFontFamily(sVar.mo94778c(str));
                    return;
                case 3:
                    baseTextShadowNode.setFontSize(sVar.mo94773a(str, 1.0E21f));
                    return;
                case 4:
                    baseTextShadowNode.setFontStyle(sVar.mo94774a(str, 0));
                    return;
                case 5:
                    baseTextShadowNode.setFontWeight(sVar.mo94774a(str, 0));
                    return;
                case 6:
                    baseTextShadowNode.setIncludeFontPadding(sVar.mo94776a(str, false));
                    return;
                case 7:
                    baseTextShadowNode.setLetterSpacing(sVar.mo94773a(str, 1.0E21f));
                    return;
                case '\b':
                    baseTextShadowNode.setLineHeight(sVar.mo94773a(str, 1.0E21f));
                    return;
                case '\t':
                    baseTextShadowNode.setLineSpacing(sVar.mo94773a(str, BitmapDescriptorFactory.HUE_RED));
                    return;
                case '\n':
                    baseTextShadowNode.setTextAlign(sVar.mo94774a(str, 0));
                    return;
                case 11:
                    baseTextShadowNode.setTextDecoration(sVar.mo94774a(str, 0));
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    baseTextShadowNode.setTextMaxLength(sVar.mo94778c(str));
                    return;
                case '\r':
                    baseTextShadowNode.setTextMaxLine(sVar.mo94778c(str));
                    return;
                case 14:
                    baseTextShadowNode.setTextOverflow(sVar.mo94774a(str, 0));
                    return;
                case 15:
                    baseTextShadowNode.setTextShadow(sVar.mo94779d(str));
                    return;
                case 16:
                    baseTextShadowNode.setTextVerticalAlign(sVar.mo94778c(str));
                    return;
                case 17:
                    baseTextShadowNode.setUseWebLineHeight(sVar.mo94776a(str, false));
                    return;
                case 18:
                    baseTextShadowNode.setWhiteSpace(sVar.mo94774a(str, 0));
                    return;
                default:
                    super.mo53285a(shadowNode, str, sVar);
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
