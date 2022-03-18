package com.bytedance.ee.webapp.menu;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.larksuite.component.webview.container.dto.C25838g;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.bytedance.ee.webapp.menu.c */
public class C13816c extends C25838g {

    /* renamed from: a */
    public static final int Lark_Core_CancelFloating = 2131828105;

    /* renamed from: b */
    public static final int Lark_Core_FloatingWindow = 2131828113;

    /* renamed from: c */
    private static final int f36081c = 2131234081;

    /* renamed from: d */
    private static final int f36082d = 2131234088;

    /* renamed from: e */
    private IAppContext f36083e;

    /* renamed from: f */
    private WebAppContainerDelegate.AbstractC13835a f36084f;

    /* renamed from: g */
    private String f36085g = UIHelper.getString(Lark_Core_FloatingWindow);

    /* renamed from: h */
    private String f36086h = UIHelper.getString(Lark_Core_CancelFloating);

    @Override // com.larksuite.component.webview.container.dto.C25838g
    /* renamed from: a */
    public int mo50898a() {
        MultitaskHelper a = this.f36084f.mo51032a();
        if (a == null) {
            return f36082d;
        }
        if (a.mo169049e()) {
            return f36082d;
        }
        return f36081c;
    }

    @Override // com.larksuite.component.webview.container.dto.C25838g
    /* renamed from: b */
    public String mo50899b() {
        MultitaskHelper a = this.f36084f.mo51032a();
        if (a == null) {
            return "";
        }
        if (a.mo169049e()) {
            return this.f36086h;
        }
        return this.f36085g;
    }

    public C13816c(IAppContext iAppContext, int i, String str, WebAppContainerDelegate.AbstractC13835a aVar) {
        super(i, str, null);
        this.f36083e = iAppContext;
        this.f36084f = aVar;
    }
}
