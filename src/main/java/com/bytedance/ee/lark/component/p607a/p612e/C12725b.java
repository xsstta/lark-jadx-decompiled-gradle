package com.bytedance.ee.lark.component.p607a.p612e;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.component.AbstractC12716a;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.bytedance.ee.lark.component.p607a.p610c.C12722a;
import com.bytedance.ee.lark.component.p607a.p613f.C12730a;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.service.AbstractC13470e;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.lark.component.a.e.b */
public class C12725b {

    /* renamed from: a */
    private ArrayList<AbstractC12724a> f34078a = new ArrayList<>();

    /* renamed from: b */
    private HashMap<String, AbstractC12716a> f34079b = new HashMap<>();

    /* renamed from: c */
    private LarkWebView f34080c;

    /* renamed from: d */
    private C12717a f34081d;

    /* renamed from: a */
    public C12717a mo48187a() {
        return this.f34081d;
    }

    /* renamed from: b */
    public void mo48193b(AbstractC12716a aVar) {
        m52668d(aVar);
    }

    /* renamed from: a */
    public void mo48189a(AbstractC12724a aVar) {
        this.f34078a.add(aVar);
    }

    /* renamed from: b */
    public void mo48192b(AbstractC12724a aVar) {
        this.f34078a.remove(aVar);
    }

    /* renamed from: a */
    public AbstractC12716a mo48188a(String str) {
        return this.f34079b.get(str);
    }

    public C12725b(C12717a aVar) {
        this.f34081d = aVar;
        this.f34080c = aVar.mo48167b();
    }

    /* renamed from: c */
    private void m52667c(AbstractC12716a aVar) {
        Iterator<AbstractC12724a> it = this.f34078a.iterator();
        while (it.hasNext()) {
            it.next().mo48185b(aVar);
        }
    }

    /* renamed from: d */
    private void m52668d(AbstractC12716a aVar) {
        Iterator<AbstractC12724a> it = this.f34078a.iterator();
        while (it.hasNext()) {
            it.next().mo48186c(aVar);
        }
    }

    /* renamed from: e */
    private void m52669e(AbstractC12716a aVar) {
        Iterator<AbstractC12724a> it = this.f34078a.iterator();
        while (it.hasNext()) {
            it.next().mo48184a(aVar);
        }
    }

    /* renamed from: b */
    public void mo48194b(String str) {
        Log.m165379d("NativeComponentManager", "remove nativeBaseComponent, viewId = " + str);
        AbstractC12716a aVar = this.f34079b.get(str);
        if (aVar != null) {
            m52669e(aVar);
        }
        this.f34079b.remove(str);
        m52666a(this.f34080c, str);
    }

    /* renamed from: a */
    public void mo48190a(AbstractC12716a aVar) {
        String viewId = aVar.getViewId();
        Log.m165379d("NativeComponentManager", "add nativeBaseComponent, viewId = " + viewId);
        if (this.f34079b.containsKey(viewId)) {
            Log.m165383e("NativeComponentManager", "viewId already added, viewId = " + viewId);
            m52667c(aVar);
        } else {
            this.f34079b.put(viewId, aVar);
            m52667c(aVar);
        }
        mo48191a(this.f34080c, aVar.getViewId(), aVar.getContainer());
    }

    /* renamed from: a */
    private void m52666a(LarkWebView larkWebView, String str) {
        Log.m165389i("NativeComponentManager", "unRegisterPlatformView, viewId = " + str);
        if (larkWebView == null) {
            Log.m165383e("NativeComponentManager", "unRegisterPlatformView err, webView is null");
        } else if (TextUtils.isEmpty(str)) {
            Log.m165383e("NativeComponentManager", "unRegisterPlatformView err, viewId is empty");
        } else {
            AbstractC13470e eVar = (AbstractC13470e) larkWebView.getServiceManager().mo49931b(AbstractC13470e.class);
            if (eVar != null) {
                eVar.mo49908a(str);
            } else {
                Log.m165383e("NativeComponentManager", "unRegisterPlatformView err, renderInWebViewService is null");
            }
        }
    }

    /* renamed from: a */
    public void mo48191a(LarkWebView larkWebView, String str, View view) {
        Log.m165389i("NativeComponentManager", "registerPlatformView, viewId = " + str);
        if (larkWebView == null) {
            Log.m165383e("NativeComponentManager", "registerPlatformView err, webView is null");
        } else if (view == null || TextUtils.isEmpty(str)) {
            Log.m165383e("NativeComponentManager", "registerPlatformView err, view or viewId is null");
        } else if (!(view instanceof C12730a)) {
            Log.m165383e("NativeComponentManager", "registerPlatformView err, invalid view");
        } else {
            C12722a aVar = new C12722a(str, (C12730a) view);
            AbstractC13470e eVar = (AbstractC13470e) larkWebView.getServiceManager().mo49931b(AbstractC13470e.class);
            if (eVar != null) {
                eVar.mo49907a(aVar);
            } else {
                Log.m165383e("NativeComponentManager", "registerPlatformView err, renderInWebViewService is null");
            }
        }
    }
}
