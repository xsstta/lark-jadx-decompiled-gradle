package com.tt.miniapp.view.webcore.p3351c;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.miniapp.view.webcore.c.b */
public class C67253b extends AbstractC67254c {
    public C67253b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.view.webcore.p3351c.AbstractC67254c
    /* renamed from: a */
    public int mo233850a(View view, Rect rect) {
        if (this.f169750b == 120) {
            this.f169750b += 720;
            AppBrandLogger.m52828d("VivoConcaveWebViewScroller", "rectHeight", Integer.valueOf(rect.bottom - rect.top));
            if (rect.bottom == 2208) {
                return super.mo233850a(view, rect);
            }
            mo233858c();
        }
        return super.mo233850a(view, rect);
    }
}
