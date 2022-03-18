package com.tt.miniapp.view.webcore.p3351c;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.component.nativeview.AbstractC65853c;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.view.webcore.c.c */
public abstract class AbstractC67254c {

    /* renamed from: a */
    protected Context f169749a;

    /* renamed from: b */
    protected int f169750b;

    /* renamed from: c */
    protected AbstractC67256e f169751c;

    /* renamed from: d */
    protected int f169752d;

    /* renamed from: e */
    protected int f169753e;

    /* renamed from: a */
    public int mo233851a() {
        int i = this.f169753e;
        this.f169753e = 0;
        return -i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo233857b() {
        AbstractC67256e eVar = this.f169751c;
        if (eVar != null) {
            eVar.mo233859c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo233858c() {
        AbstractC67256e eVar = this.f169751c;
        if (eVar != null) {
            eVar.onKeyboardHide();
        }
    }

    /* renamed from: a */
    public void mo233856a(AbstractC67256e eVar) {
        this.f169751c = eVar;
    }

    public AbstractC67254c(Context context) {
        this.f169749a = context;
    }

    /* renamed from: a */
    public void mo233855a(int i) {
        this.f169753e += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo233852a(View view, int i) {
        int i2;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = iArr[1];
        C67231a.C67234b bVar = (C67231a.C67234b) view.getLayoutParams();
        int i4 = bVar.height;
        if (i4 <= 0) {
            i4 = view.getMeasuredHeight();
        }
        if (view instanceof AbstractC65853c) {
            i4 = ((AbstractC65853c) view).getInputHeight();
        }
        int i5 = i - bVar.f169722b;
        AppBrandLogger.m52830i("WebViewScroller", "targetView:" + view + " containerVisibleHeight" + this.f169750b + " componentHeight:" + i4 + " layoutParams.y:" + bVar.f169722b);
        if (i5 >= 0 && i5 <= i4 && (i2 = i3 + i4) <= C67590h.m263091e(this.f169749a) && i2 >= i) {
            i4 = i5;
        }
        return (C67590h.m263091e(this.f169749a) - i3) - i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo233850a(View view, Rect rect) {
        int i;
        mo233857b();
        if (this.f169753e != 0) {
            return mo233854a(view, rect, 0);
        }
        int a = mo233852a(view, rect.bottom - rect.top);
        if (view instanceof AbstractC65853c) {
            i = ((AbstractC65853c) view).getCursorSpacingHeight();
        } else {
            i = 0;
        }
        AppBrandLogger.m52830i("WebViewScroller", "targetView:" + view + " containerVisibleHeight" + this.f169750b + " rangeToBottom:" + a + " cursorSpacing:" + i);
        int i2 = this.f169750b;
        if (a >= i2 + i) {
            return 0;
        }
        int i3 = a - (i2 + i);
        this.f169753e += i3;
        return i3;
    }

    /* renamed from: a */
    public int mo233853a(View view, int i, Rect rect) {
        this.f169750b = i;
        int a = mo233850a(view, rect);
        this.f169752d = this.f169750b;
        return a;
    }

    /* renamed from: a */
    public int mo233854a(View view, Rect rect, int i) {
        int i2;
        int i3 = 0;
        if (this.f169753e == 0) {
            return 0;
        }
        if (i == 0) {
            i3 = this.f169752d - this.f169750b;
        } else if (i == 1) {
            int a = mo233852a(view, rect.bottom - rect.top);
            if (view instanceof AbstractC65853c) {
                i2 = ((AbstractC65853c) view).getCursorSpacingHeight();
            } else {
                i2 = 0;
            }
            AppBrandLogger.m52830i("WebViewScroller", "targetView:" + view + " containerVisibleHeight" + this.f169750b + " rangeToBottom:" + a + " cursorSpacing:" + i2);
            i3 = a - (this.f169750b + i2);
        }
        this.f169753e += i3;
        return i3;
    }
}
