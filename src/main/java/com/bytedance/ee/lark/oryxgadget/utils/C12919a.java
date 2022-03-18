package com.bytedance.ee.lark.oryxgadget.utils;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.oryxgadget.utils.OryxHostMonitorUtil;
import com.bytedance.ee.larkbrand.utils.C13336c;

/* renamed from: com.bytedance.ee.lark.oryxgadget.utils.a */
public class C12919a {
    /* renamed from: a */
    public static boolean m53268a(IAppContext iAppContext, ClassLoader classLoader, boolean z) {
        C13336c.C13340d dVar;
        boolean z2;
        C13336c.C13340d a = C13336c.m54306a(classLoader, "com.bytedance.ee.lark.oryxplugin");
        if (z) {
            dVar = C13336c.m54308b(classLoader, "com.bytedance.ee.lark.oryxplugin");
        } else {
            dVar = null;
        }
        if (!a.f35242a) {
            OryxHostMonitorUtil.monitorHookException(iAppContext, OryxHostMonitorUtil.HookPoint.SoHook, a.f35243b);
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVar != null && !dVar.f35242a) {
            OryxHostMonitorUtil.monitorHookException(iAppContext, OryxHostMonitorUtil.HookPoint.DexHook, dVar.f35243b);
            z2 = true;
        }
        if (z2) {
            OryxSpUtils.updateHookExStatus(iAppContext.getApplicationContext());
        }
        if (!a.f35242a) {
            return false;
        }
        if (dVar != null && !dVar.f35242a) {
            return false;
        }
        return true;
    }
}
