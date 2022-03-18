package com.ss.android.videoshop.api.stub;

import android.graphics.Rect;
import com.ss.android.videoshop.api.AbstractC64092a;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import com.ss.android.videoshop.p3199e.C64159a;

/* renamed from: com.ss.android.videoshop.api.stub.a */
public class C64109a implements AbstractC64092a {
    @Override // com.ss.android.videoshop.api.AbstractC64092a
    /* renamed from: a */
    public void mo163738a(SimpleMediaView simpleMediaView) {
    }

    @Override // com.ss.android.videoshop.api.AbstractC64092a
    /* renamed from: b */
    public void mo163740b(SimpleMediaView simpleMediaView) {
        if (!simpleMediaView.mo222425m()) {
            simpleMediaView.mo222424l();
            C64159a.m252080a("DefaultAttachListener", "detachCurrent release simpleMediaView:" + hashCode());
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64092a
    /* renamed from: a */
    public void mo163739a(SimpleMediaView simpleMediaView, boolean z) {
        C64159a.m252080a("DefaultAttachListener", "onScrollVisibilityChange visible:" + z + " simpleMediaView:" + hashCode());
        if (!z && !simpleMediaView.mo222425m()) {
            Rect rect = new Rect();
            simpleMediaView.getGlobalVisibleRect(rect);
            C64159a.m252083b("DefaultAttachListener", "onScrollVisibilityChange release simpleMediaView show:" + simpleMediaView.isShown() + " globalrect:" + rect.toShortString());
            simpleMediaView.mo222424l();
        }
    }
}
