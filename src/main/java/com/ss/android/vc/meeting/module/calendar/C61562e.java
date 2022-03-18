package com.ss.android.vc.meeting.module.calendar;

import android.content.Context;
import android.webkit.ValueCallback;
import com.bytedance.ee.bear.middleground.calendar.C8890a;
import com.bytedance.ee.bear.middleground.calendar.bean.C8918a;
import com.bytedance.ee.bear.middleground.calendar.p440a.C8891a;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60900o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.meeting.module.calendar.e */
public class C61562e {

    /* renamed from: a */
    private static final String f154450a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.calendar.e$a */
    public static class C61564a {

        /* renamed from: a */
        public static final C61562e f154451a = new C61562e();
    }

    private C61562e() {
    }

    /* renamed from: a */
    public static C61562e m240298a() {
        return C61564a.f154451a;
    }

    static {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("function injectCss({backgroundColor = 'transparent !important', color = '#fff !important', fontSize = '14px !important', liColor = '#fff !important',}) {var headerNode = document.getElementsByTagName('head');var cssNode = document.createElement('Style');cssNode.type='text/css';cssNode.innerText = `  #editor,  #main .innerdocbody {background-color: ${backgroundColor}; color: ${color}; font-size: ${fontSize};}  #main {background-color: ${backgroundColor}; color: ${color}; font-size: ${fontSize};}  #main a {color: #4E83FD; }  #main a:hover {color: #4E83FD; opacity: 0.5;}  #main p {word-break: keep-all;}  #editor li:before,  #main li .list-prefix {color: ${liColor};}`;  headerNode[0].appendChild(cssNode);}");
        Object[] objArr = new Object[3];
        if (UDUiModeUtils.m93319a(ar.m236694a())) {
            str = "#1F1F1F";
        } else {
            str = "#FFFFFF";
        }
        objArr[0] = str;
        String str3 = "#F0F0F0";
        if (UDUiModeUtils.m93319a(ar.m236694a())) {
            str2 = str3;
        } else {
            str2 = "#1F2329";
        }
        objArr[1] = str2;
        if (!UDUiModeUtils.m93319a(ar.m236694a())) {
            str3 = "#1F2329";
        }
        objArr[2] = str3;
        sb.append(String.format("injectCss({backgroundColor: '%s !important', color: '%s !important', liColor: '%s !important',})", objArr));
        f154450a = sb.toString();
    }

    /* renamed from: a */
    public void mo213349a(Context context) {
        try {
            AbstractC60900o dynamicDomainDependency = VideoChatModuleDependency.getDynamicDomainDependency();
            C8890a.m37285a(context, new C8918a(dynamicDomainDependency.getDocDomainPool(), dynamicDomainDependency.getDocSpaceApi(), dynamicDomainDependency.getDocSuiteDomain()));
        } catch (Exception e) {
            C60700b.m235864f("WebEditorManager", "[init]", "error");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo213350a(WebEditorWrapper webEditorWrapper) {
        if (webEditorWrapper != null) {
            C8891a calendarWebView = webEditorWrapper.getCalendarWebView();
            C60700b.m235851b("WebEditorManager", "[recovery]", "editorWebView = " + calendarWebView);
            if (calendarWebView != null) {
                calendarWebView.evaluateJavascript(f154450a, null);
            }
        }
    }

    /* renamed from: a */
    public WebEditorWrapper mo213348a(Context context, boolean z) {
        WebEditorWrapper a = C8890a.m37284a();
        if (a != null) {
            return a;
        }
        mo213349a(context);
        return C8890a.m37284a();
    }

    /* renamed from: a */
    public void mo213351a(WebEditorWrapper webEditorWrapper, ValueCallback<String> valueCallback) {
        C8891a calendarWebView;
        if (webEditorWrapper != null && (calendarWebView = webEditorWrapper.getCalendarWebView()) != null) {
            calendarWebView.evaluateJavascript(f154450a, valueCallback);
        }
    }
}
