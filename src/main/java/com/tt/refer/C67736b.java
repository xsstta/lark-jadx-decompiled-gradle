package com.tt.refer;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.openplatform.core.plugin.ccm.C24618a;
import com.larksuite.component.openplatform.core.plugin.inner.C25009j;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.aysnc.C67308c;
import com.tt.miniapp.webbridge.sync.C67334aa;
import com.tt.miniapp.webbridge.sync.C67335ab;
import com.tt.miniapp.webbridge.sync.C67348c;
import com.tt.miniapp.webbridge.sync.C67349d;
import com.tt.miniapp.webbridge.sync.C67351e;
import com.tt.miniapp.webbridge.sync.C67354f;
import com.tt.miniapp.webbridge.sync.C67356g;
import com.tt.miniapp.webbridge.sync.C67361h;
import com.tt.miniapp.webbridge.sync.C67362i;
import com.tt.miniapp.webbridge.sync.C67365j;
import com.tt.miniapp.webbridge.sync.C67367k;
import com.tt.miniapp.webbridge.sync.C67369l;
import com.tt.miniapp.webbridge.sync.C67374m;
import com.tt.miniapp.webbridge.sync.C67377n;
import com.tt.miniapp.webbridge.sync.C67380o;
import com.tt.miniapp.webbridge.sync.C67383p;
import com.tt.miniapp.webbridge.sync.C67386q;
import com.tt.miniapp.webbridge.sync.C67388r;
import com.tt.miniapp.webbridge.sync.C67390s;
import com.tt.miniapp.webbridge.sync.C67391t;
import com.tt.miniapp.webbridge.sync.C67393v;
import com.tt.miniapp.webbridge.sync.C67396w;
import com.tt.miniapp.webbridge.sync.C67398x;
import com.tt.miniapp.webbridge.sync.C67400y;
import com.tt.miniapp.webbridge.sync.C67402z;
import com.tt.miniapp.webbridge.sync.ReportTimeLineHandler;
import com.tt.miniapp.webbridge.sync.p3355a.C67332c;
import com.tt.miniapp.webbridge.sync.p3356b.C67338a;
import com.tt.miniapp.webbridge.sync.p3356b.C67340b;
import com.tt.miniapp.webbridge.sync.p3356b.C67342c;
import com.tt.miniapp.webbridge.sync.p3356b.C67344d;
import com.tt.miniapp.webbridge.sync.p3356b.C67346e;
import com.tt.option.ext.AbstractC67628l;

/* renamed from: com.tt.refer.b */
public final class C67736b {
    /* renamed from: a */
    public static AbstractC67628l m263575a(String str, RenderViewManager.IRender iRender, String str2, int i) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2115586142:
                if (str.equals("updateAdHTMLWebView")) {
                    c = 0;
                    break;
                }
                break;
            case -2041798713:
                if (str.equals("removeAdHTMLWebView")) {
                    c = 1;
                    break;
                }
                break;
            case -1913642710:
                if (str.equals("showToast")) {
                    c = 2;
                    break;
                }
                break;
            case -1898640793:
                if (str.equals("showPopoverMenu")) {
                    c = 3;
                    break;
                }
                break;
            case -1538334289:
                if (str.equals("showMultiPickerView")) {
                    c = 4;
                    break;
                }
                break;
            case -1321203688:
                if (str.equals("removeVideoPlayer")) {
                    c = 5;
                    break;
                }
                break;
            case -1298100610:
                if (str.equals("showTextAreaKeyboard")) {
                    c = 6;
                    break;
                }
                break;
            case -885048637:
                if (str.equals("insertVideoPlayer")) {
                    c = 7;
                    break;
                }
                break;
            case -675127954:
                if (str.equals("launchApp")) {
                    c = '\b';
                    break;
                }
                break;
            case -593935231:
                if (str.equals("updateInput")) {
                    c = '\t';
                    break;
                }
                break;
            case -348232188:
                if (str.equals("showKeyboard")) {
                    c = '\n';
                    break;
                }
                break;
            case -190555469:
                if (str.equals("updateVideoPlayer")) {
                    c = 11;
                    break;
                }
                break;
            case -134025405:
                if (str.equals("updateTextArea")) {
                    c = '\f';
                    break;
                }
                break;
            case 119255651:
                if (str.equals("updateMultiPickerView")) {
                    c = '\r';
                    break;
                }
                break;
            case 172924720:
                if (str.equals("showPickerView")) {
                    c = 14;
                    break;
                }
                break;
            case 220520591:
                if (str.equals("videoRequestFullScreen")) {
                    c = 15;
                    break;
                }
                break;
            case 318933299:
                if (str.equals("insertTextArea")) {
                    c = 16;
                    break;
                }
                break;
            case 455154069:
                if (str.equals("reportTimeline")) {
                    c = 17;
                    break;
                }
                break;
            case 491377586:
                if (str.equals("insertAdHTMLWebView")) {
                    c = 18;
                    break;
                }
                break;
            case 717095000:
                if (str.equals("operateVideoContext")) {
                    c = 19;
                    break;
                }
                break;
            case 802039684:
                if (str.equals("showRegionPickerView")) {
                    c = 20;
                    break;
                }
                break;
            case 884348605:
                if (str.equals("disableScrollBounce")) {
                    c = 21;
                    break;
                }
                break;
            case 960671466:
                if (str.equals("removeHTMLWebView")) {
                    c = 22;
                    break;
                }
                break;
            case 993342978:
                if (str.equals("storePreRenderData")) {
                    c = 23;
                    break;
                }
                break;
            case 1065964361:
                if (str.equals("hideKeyboard")) {
                    c = 24;
                    break;
                }
                break;
            case 1094052229:
                if (str.equals("editorFilePathConvert")) {
                    c = 25;
                    break;
                }
                break;
            case 1129109141:
                if (str.equals("systemLog")) {
                    c = 26;
                    break;
                }
                break;
            case 1185615423:
                if (str.equals("snapshotReady")) {
                    c = 27;
                    break;
                }
                break;
            case 1216478251:
                if (str.equals("postErrors")) {
                    c = 28;
                    break;
                }
                break;
            case 1387646559:
                if (str.equals("protocolPathToAbsPath")) {
                    c = 29;
                    break;
                }
                break;
            case 1396826517:
                if (str.equals("insertHTMLWebView")) {
                    c = 30;
                    break;
                }
                break;
            case 1630368510:
                if (str.equals("showDatePickerView")) {
                    c = 31;
                    break;
                }
                break;
            case 1696318462:
                if (str.equals("removeTextArea")) {
                    c = ' ';
                    break;
                }
                break;
            case 1779503918:
                if (str.equals("monitorReport")) {
                    c = '!';
                    break;
                }
                break;
            case 2091319685:
                if (str.equals("updateHTMLWebView")) {
                    c = '\"';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C67393v(iRender, str2, i);
            case 1:
                return new C67362i(iRender, str2, i);
            case 2:
                return new C67388r(iRender, str2, i);
            case 3:
                return new C67332c(iRender, str2, i);
            case 4:
                return new C67377n(iRender, str2, i);
            case 5:
                return new C67344d(iRender, str2, i);
            case 6:
                return new C67386q(iRender, str2, i);
            case 7:
                return new C67340b(iRender, str2, i);
            case '\b':
                return new C67356g(iRender, str2, i);
            case '\t':
                return new C67398x(iRender, str2, i);
            case '\n':
                return new C67374m(iRender, str2, i);
            case 11:
                return new C67346e(iRender, str2, i);
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return new C67402z(iRender, str2, i);
            case '\r':
                return new C67400y(iRender, str2, i);
            case 14:
                return new C67380o(iRender, str2, i);
            case 15:
                return new C67338a(iRender, str2, i);
            case 16:
                return new C67335ab(iRender, str2, i);
            case 17:
                return new ReportTimeLineHandler(iRender, str2, i);
            case 18:
                return new C67351e(iRender, str2, i);
            case 19:
                return new C67342c(iRender, str2, i);
            case 20:
                return new C67383p(iRender, str2, i);
            case 21:
                return new C67334aa(iRender, str2, i);
            case 22:
                return new C67365j(iRender, str2, i);
            case 23:
                return new C25009j(iRender, str2, i);
            case 24:
                return new C67349d(iRender, str2, i);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                return new C24618a(iRender, str2, i);
            case 26:
                return new C67391t(iRender, str2, i);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                return new C67390s(iRender, str2, i);
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR:
                return new C67361h(iRender, str2, i);
            case 29:
                return new C67348c(iRender, str2, i);
            case 30:
                return new C67354f(iRender, str2, i);
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE:
                return new C67369l(iRender, str2, i);
            case ' ':
                return new C67367k(iRender, str2, i);
            case '!':
                return new C67308c(iRender, str2, i);
            case '\"':
                return new C67396w(iRender, str2, i);
            default:
                return null;
        }
    }
}
