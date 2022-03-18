package com.bytedance.ee.larkbrand.p650e;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13345g;
import com.tt.option.p3381b.C67598a;

/* renamed from: com.bytedance.ee.larkbrand.e.f */
public class C12998f extends C67598a {
    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public boolean isDesktop() {
        return C13345g.m54336a();
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public void clearFocusWhenHideSoftKeyboard(IAppContext iAppContext) {
        C13345g.m54335a(iAppContext);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public void convertMouseEvent(WebView webView) {
        C13345g.m54334a(webView);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public String interceptRpx2Px(String str) {
        return C13345g.m54342b(str);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public boolean shouldInterceptRpx2Px(String str) {
        return C13345g.m54339a(str);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public byte[] interceptRpx2Px(byte[] bArr) {
        return C13345g.m54340a(bArr);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public int getScreenWidthForDesktop(Context context, IAppContext iAppContext) {
        return C13345g.m54331a(context, iAppContext);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public boolean interceptSetTitleBarMargin(Context context, View view) {
        return C13345g.m54338a(context, view);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public void interceptStatusBarToImmersed(View view, View view2, int i) {
        C13345g.m54333a(view, view2, i);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public void triggerSoftKeyBoardShowEvent(int i, int i2, IAppContext iAppContext) {
        C13345g.m54332a(i, i2, iAppContext);
    }

    @Override // com.tt.option.p3381b.AbstractC67599b, com.tt.option.p3381b.C67598a
    public int getScreenHeightForDesktop(Context context, int i, IAppContext iAppContext) {
        return C13345g.m54330a(context, i, iAppContext);
    }
}
