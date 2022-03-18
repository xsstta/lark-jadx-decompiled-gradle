package com.bytedance.ee.bear.browser.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.C26326z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecorateWebViewV2 extends NestedScrollWebViewV2 implements AbstractC4963a<WebView> {

    /* renamed from: b */
    private LayoutInflater f14548b;

    /* renamed from: c */
    private AbstractC4964b f14549c;

    /* renamed from: d */
    private List<AbstractC4964b> f14550d;

    /* renamed from: e */
    private Map<AbstractC4964b, View[]> f14551e;

    /* renamed from: f */
    private List<AbstractC4961a> f14552f;

    /* renamed from: g */
    private ActionMode f14553g;

    /* renamed from: h */
    private boolean f14554h;

    /* renamed from: i */
    private boolean f14555i = true;

    /* renamed from: com.bytedance.ee.bear.browser.view.DecorateWebViewV2$a */
    public interface AbstractC4961a {
        /* renamed from: a */
        ActionMode.Callback mo19632a(ActionMode.Callback callback);
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4963a
    public WebView getHostView() {
        return this;
    }

    public List<AbstractC4964b> getDecorateLayers() {
        return this.f14550d;
    }

    /* renamed from: a */
    public void mo19616a() {
        ActionMode actionMode = this.f14553g;
        if (actionMode != null) {
            actionMode.finish();
            this.f14553g = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC4964b c = mo22342c();
        if (c != null) {
            c.mo19638a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.webview.fps.FpsWebViewV2
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC4964b c = mo22342c();
        if (c != null) {
            c.mo19643b();
        }
        mo19616a();
    }

    /* renamed from: b */
    private void mo22336b() {
        this.f14548b = LayoutInflater.from(getContext());
        this.f14550d = new ArrayList();
        this.f14551e = new HashMap();
        this.f14552f = new ArrayList();
    }

    /* renamed from: c */
    private AbstractC4964b mo22342c() {
        if (this.f14550d.isEmpty()) {
            return null;
        }
        List<AbstractC4964b> list = this.f14550d;
        return list.get(list.size() - 1);
    }

    public void setEnableOverScrollBy(boolean z) {
        this.f14555i = z;
    }

    /* renamed from: b */
    public void mo19619b(AbstractC4961a aVar) {
        this.f14552f.remove(aVar);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return m20549a(callback, -1);
    }

    public DecorateWebViewV2(Context context) {
        super(context);
        mo22336b();
    }

    /* renamed from: a */
    public void mo19617a(AbstractC4961a aVar) {
        if (!this.f14552f.contains(aVar)) {
            this.f14552f.add(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.view.NestedScrollWebViewV2
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14554h = false;
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            this.f14554h = true;
            return true;
        }
        this.f14549c = null;
        return false;
    }

    /* renamed from: a */
    public void mo19618a(AbstractC4964b bVar) {
        if (!this.f14550d.contains(bVar)) {
            bVar.mo19640a(this);
            this.f14550d.add(bVar);
            View[] a = bVar.mo19642a(this.f14548b, this);
            this.f14551e.put(bVar, a);
            if (a != null) {
                for (View view : a) {
                    addView(view);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo19620b(AbstractC4964b bVar) {
        if (this.f14550d.remove(bVar)) {
            bVar.mo19644b(this);
            View[] remove = this.f14551e.remove(bVar);
            if (remove != null) {
                for (View view : remove) {
                    removeView(view);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.view.NestedScrollWebViewV2, com.bytedance.ee.bear.jsbridge.BridgeWebViewV2
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14554h) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f14549c != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
            return this.f14549c.mo19641a(motionEvent);
        }
        AbstractC4964b c = mo22342c();
        if (c != null && c.mo19641a(motionEvent)) {
            this.f14549c = c;
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private ActionMode m20550b(ActionMode.Callback callback, int i) {
        if (C26326z.m95340d()) {
            return super.startActionMode(callback, i);
        }
        return super.startActionMode(callback);
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return m20549a(callback, i);
    }

    public DecorateWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo22336b();
    }

    /* renamed from: a */
    private ActionMode m20549a(ActionMode.Callback callback, int i) {
        ActionMode.Callback callback2;
        if (!this.f14552f.isEmpty()) {
            List<AbstractC4961a> list = this.f14552f;
            callback2 = list.get(list.size() - 1).mo19632a(callback);
            C13479a.m54764b("DecorateWebViewV2", "delegate is not empty");
        } else {
            AbstractC4964b c = mo22342c();
            if (c != null) {
                callback2 = c.mo19637a(callback);
            } else {
                callback2 = null;
            }
        }
        C13479a.m54764b("DecorateWebViewV2", "start action mode actionModeCallback " + callback2);
        if (callback2 != null) {
            this.f14553g = m20550b(callback2, i);
        } else if (hasFocus()) {
            this.f14553g = m20550b(callback, i);
        } else {
            C13479a.m54775e("DecorateWebViewV2", "WebView has no focus, intercept system actionMode!");
            mo19616a();
        }
        return this.f14553g;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        AbstractC4964b c = mo22342c();
        if (c != null) {
            c.mo19639a(i, i2, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (!this.f14555i) {
            return true;
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
