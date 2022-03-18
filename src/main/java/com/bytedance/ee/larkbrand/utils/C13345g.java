package com.bytedance.ee.larkbrand.utils;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.component.nativeview.C65844b;
import com.tt.miniapp.component.nativeview.p3271c.C65854a;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.bytedance.ee.larkbrand.utils.g */
public class C13345g {
    /* renamed from: b */
    private static String m54341b() {
        return "'use strict';\n\n/**\n * 把鼠标事件转换为touch事件\n */\nfunction changeMouseToTouch(context = window) {\n    let target;\n    let overTarget;\n    context.addEventListener('mousedown', function(e) {\n        target = triggerTouch('touchstart', e, null);\n    }, true);\n\n    context.addEventListener('mouseup', function(e) {\n        target = null;\n        triggerTouch('touchend', e, null);\n    }, true);\n\n    context.addEventListener('mousemove', function(e) {\n        if (target) triggerTouch('touchmove', e, target);\n    }, true);\n\n    // 适配移动端滚动差异\n    context.addEventListener('mouseover', function(e) {\n        overTarget = e.target;\n    }, true);\n\n    context.addEventListener('scroll', function(e) {\n        if (overTarget) triggerTouch('touchmove', e, overTarget);\n    }, true);\n}\n\nfunction checkPrevent(target, e) {\n    const tagName = (target && target.tagName || '').toLowerCase();\n    const activeElement = document.activeElement;\n    const activeTagName = (activeElement && activeElement.tagName || '').toLowerCase();\n    // text组件\n    const textUserSelect = target && target.style && target.style.userSelect;\n    const textFlag = tagName === 'span' && textUserSelect;\n    // scroll-view组件\n    const scrollViewFlag = !!(e.type === 'scroll' && target.closest && target.closest('tt-scroll-view'));\n    return !(tagName === 'tt-input'\n    || tagName === 'input'\n    || tagName === 'tt-textarea'\n    || tagName === 'textarea'\n    || textFlag\n    || scrollViewFlag\n    || activeTagName === 'tt-input'\n    || activeTagName === 'input'\n    || activeTagName === 'tt-textarea'\n    || activeTagName === 'textarea'\n    || activeTagName === 'tt-custom-component');\n}\n\nfunction touchObject(e) {\n    const tagName = (e.target.tagName || '').toLowerCase();\n    let pageX = e.pageX;\n    let pageY = e.pageY;\n\n    if (tagName === 'tt-canvas') {\n        // 文档中说的 CanvasTouch 貌似并没有实现，为了获取坐标，canvas 上的鼠标事件中\n        // 将 pageX 替换为相对于 canvas 左上角的坐标\n        const rect = e.target.getBoundingClientRect();\n        pageX = e.clientX - rect.left;\n        pageY = e.clientY - rect.top;\n    }\n    const touch = new Touch({\n        pageX,\n        pageY,\n        identifier: 0,\n        target: e.target,\n        screenX: e.screenX,\n        screenY: e.screenY,\n        clientX: e.clientX,\n        clientY: e.clientY\n    });\n    return touch;\n}\n\nfunction triggerTouch(eventName, e, target) {\n    if (!target) {\n        let i = 0;\n        while (i < e.path.length) {\n            const ele = e.path[i];\n            if (ele.tagName !== 'SLOT' && ele.nodeType !== 11) {\n                target = ele;\n                break;\n            }\n            i++;\n        }\n        target || (target = e.target);\n    }\n\n    if (checkPrevent(target, e)) {\n        preventMouseEvents(e);\n    }\n\n    const touch = touchObject(e);\n\n    const touchs = [touch];\n    const targetTouchs = eventName === 'touchend' ? [] : touchs;\n    const touchInit = {\n        bubbles: true,\n        cancelable: true,\n        changedTouches: touchs,\n        touches: targetTouchs,\n        targetTouches: targetTouchs,\n        altKey: e.altKey,\n        ctrlKey: e.ctrlKey,\n        metaKey: e.metaKey,\n        shiftKey: e.shiftKey,\n        composed: true,\n    };\n    const touchEvent = new TouchEvent(eventName, touchInit);\n    target.dispatchEvent(touchEvent);\n    return target;\n}\n\nfunction preventMouseEvents(e) {\n    e.preventDefault();\n    e.stopPropagation();\n}\n\nfunction changeMouseToTouchWrapper() {\n    changeMouseToTouch();\n}\n\n/**\n * 给 Widget 引擎可以调用，这些事件监听应该挂载到每个 Widget 的 shadowRoot 上。\n */\nwindow.changeMouseToTouch = changeMouseToTouch;\nchangeMouseToTouch();\n\ndocument.documentElement.style.fontSize = 18 + 'px';\n";
    }

    /* renamed from: a */
    public static boolean m54339a(String str) {
        return "page-frame.js".equals(str) && m54336a();
    }

    /* renamed from: a */
    public static byte[] m54340a(byte[] bArr) {
        return (!m54336a() || bArr == null || bArr.length <= 0) ? bArr : m54342b(new String(bArr)).getBytes();
    }

    /* renamed from: a */
    public static boolean m54336a() {
        return LarkExtensionManager.getInstance().getExtension().mo49584h();
    }

    /* renamed from: b */
    public static String m54342b(String str) {
        if (!m54336a() || str == null || str.length() <= 0) {
            return str;
        }
        return str.replaceAll("window.screen.width", "window.innerWidth");
    }

    /* renamed from: a */
    public static void m54334a(WebView webView) {
        if (m54336a() && webView != null) {
            webView.evaluateJavascript(m54341b(), null);
        }
    }

    /* renamed from: a */
    public static void m54335a(IAppContext iAppContext) {
        if (m54336a()) {
            View currentFocus = iAppContext.getCurrentActivity().getCurrentFocus();
            if ((currentFocus instanceof C65844b) || (currentFocus instanceof C65854a)) {
                currentFocus.clearFocus();
            }
        }
    }

    /* renamed from: a */
    public static boolean m54338a(Context context, View view) {
        return m54336a();
    }

    /* renamed from: a */
    public static int m54331a(Context context, IAppContext iAppContext) {
        return (int) Math.ceil((double) (((float) iAppContext.getCurrentActivity().findViewById(16908290).getWidth()) / C67043j.m261281e(context)));
    }

    /* renamed from: a */
    public static boolean m54337a(Context context, Intent intent) {
        if (!m54336a() || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        if (LarkExtensionManager.getInstance().getExtension().mo49583a(context, intent)) {
            return true;
        }
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        makeBasic.setLaunchBounds(new Rect(0, 0, (int) C67590h.m263065a(context, 350.0f), (int) C67590h.m263065a(context, 730.0f)));
        context.startActivity(intent, makeBasic.toBundle());
        return true;
    }

    /* renamed from: a */
    public static int m54330a(Context context, int i, IAppContext iAppContext) {
        View findViewById = iAppContext.getCurrentActivity().findViewById(16908290);
        return (i * findViewById.getHeight()) / findViewById.getWidth();
    }

    /* renamed from: a */
    public static void m54332a(int i, int i2, IAppContext iAppContext) {
        if (m54336a()) {
            AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager().publish(i, "onKeyboardShow", new C67587d().mo234783a("inputId", Integer.valueOf(i2)).mo234784a().toString());
        }
    }

    /* renamed from: a */
    public static void m54333a(View view, View view2, int i) {
        if (m54336a() && view != null && view2 != null) {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
            view2.setVisibility(8);
        }
    }
}
