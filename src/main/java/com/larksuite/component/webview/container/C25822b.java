package com.larksuite.component.webview.container;

import com.bytedance.lark.webview.container.impl.WebContainerActivity;
import com.bytedance.lark.webview.container.impl.WebContainerMainProcessActivity;
import com.larksuite.component.webview.container.dto.AbstractC25831b;
import com.larksuite.component.webview.container.impl.inject.C25864c;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;

/* renamed from: com.larksuite.component.webview.container.b */
public class C25822b {
    /* renamed from: a */
    public static Class m93349a() {
        return m93350a(false);
    }

    /* renamed from: b */
    public static AbstractC25831b m93352b() {
        return C25864c.m93607a();
    }

    /* renamed from: a */
    public static void m93351a(AbstractC25820a aVar) {
        C25821b.m93348a(aVar);
    }

    /* renamed from: a */
    public static Class m93350a(boolean z) {
        if (z) {
            return WebContainerMainProcessActivity.class;
        }
        return WebContainerActivity.class;
    }
}
