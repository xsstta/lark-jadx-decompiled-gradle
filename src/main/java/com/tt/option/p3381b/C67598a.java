package com.tt.option.p3381b;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.util.C67043j;
import com.tt.option.AbstractC67593a;

/* renamed from: com.tt.option.b.a */
public class C67598a extends AbstractC67593a<AbstractC67599b> implements AbstractC67599b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67599b mo232057b() {
        return null;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void clearFocusWhenHideSoftKeyboard(IAppContext iAppContext) {
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void convertMouseEvent(WebView webView) {
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public String interceptRpx2Px(String str) {
        return str;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public byte[] interceptRpx2Px(byte[] bArr) {
        return bArr;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public boolean interceptSetTitleBarMargin(Context context, View view) {
        return false;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void interceptStatusBarToImmersed(View view, View view2, int i) {
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public boolean isDesktop() {
        return false;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public boolean shouldInterceptRpx2Px(String str) {
        return false;
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public void triggerSoftKeyBoardShowEvent(int i, int i2, IAppContext iAppContext) {
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public int getScreenWidthForDesktop(Context context, IAppContext iAppContext) {
        return (int) Math.ceil((double) (((float) C67043j.m261275b(context)) / C67043j.m261281e(context)));
    }

    @Override // com.tt.option.p3381b.AbstractC67599b
    public int getScreenHeightForDesktop(Context context, int i, IAppContext iAppContext) {
        return (i * C67043j.m261267a(context)) / C67043j.m261275b(context);
    }
}
