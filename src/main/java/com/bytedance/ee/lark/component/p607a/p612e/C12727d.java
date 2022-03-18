package com.bytedance.ee.lark.component.p607a.p612e;

import android.text.TextUtils;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.p2413c.C48936b;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.lark.component.a.e.d */
public class C12727d implements AbstractC12726c {

    /* renamed from: a */
    private Map<String, Class> f34082a = new ConcurrentHashMap();

    /* renamed from: b */
    private List<C12729a> f34083b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Map<String, Constructor> f34084c = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ee.lark.component.a.e.d$a */
    private static class C12729a {

        /* renamed from: a */
        private int f34085a;

        /* renamed from: b */
        private Map<String, Class> f34086b;

        /* renamed from: a */
        public int mo48201a() {
            return this.f34085a;
        }

        /* renamed from: b */
        public Map<String, Class> mo48204b() {
            return this.f34086b;
        }

        private C12729a() {
            this.f34086b = new ConcurrentHashMap();
        }

        /* renamed from: a */
        public void mo48202a(int i) {
            this.f34085a = i;
        }

        /* renamed from: a */
        public void mo48203a(String str, Class cls) {
            Log.m165389i("NativeComponentTypeProviderImpl", "webView register component:" + cls.getCanonicalName());
            if (this.f34086b == null) {
                this.f34086b = new ConcurrentHashMap();
            }
            if (!this.f34086b.containsKey(str)) {
                this.f34086b.put(str, cls);
                return;
            }
            String str2 = "component: " + cls.getCanonicalName() + " already register";
            C48936b.m192783a(str2);
            Log.m165397w("NativeComponentTypeProviderImpl", str2);
        }
    }

    @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c
    /* renamed from: a */
    public <T extends AbstractNativeComponent> void mo48199a(Map<String, Class<T>> map) {
        for (String str : map.keySet()) {
            mo48200a(str, map.get(str));
        }
    }

    @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c
    /* renamed from: a */
    public <T extends AbstractNativeComponent> Class<T> mo48197a(String str) {
        if (this.f34082a.containsKey(str)) {
            return this.f34082a.get(str);
        }
        Log.m165383e("NativeComponentTypeProviderImpl", "getNativeComponentClass, find viewType without class, viewType = " + str);
        return null;
    }

    @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c
    /* renamed from: a */
    public <T extends AbstractNativeComponent> Class<T> mo48196a(LarkWebView larkWebView, String str) {
        for (C12729a aVar : this.f34083b) {
            if (aVar.mo48201a() == larkWebView.getId()) {
                Map<String, Class> b = aVar.mo48204b();
                if (b != null && b.containsKey(str)) {
                    return b.get(str);
                }
                Log.m165383e("NativeComponentTypeProviderImpl", "getComponentClassOnWebView, find viewType without class, viewType = " + str);
                return null;
            }
        }
        Log.m165383e("NativeComponentTypeProviderImpl", "getComponentClassOnWebView, find no viewType = " + str);
        return null;
    }

    /* renamed from: a */
    public <T extends AbstractNativeComponent> void mo48200a(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str) || cls == null) {
            Log.m165383e("NativeComponentTypeProviderImpl", "component is invalid");
            return;
        }
        Log.m165389i("NativeComponentTypeProviderImpl", "register component, viewType = " + str + " component:" + cls.getCanonicalName());
        if (!this.f34082a.containsKey(str)) {
            this.f34082a.put(str, cls);
            return;
        }
        String str2 = "component: " + cls.getCanonicalName() + " already register";
        C48936b.m192783a(str2);
        Log.m165397w("NativeComponentTypeProviderImpl", str2);
    }

    @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c
    /* renamed from: a */
    public <T extends AbstractNativeComponent> T mo48195a(C12717a aVar, String str, String str2) {
        Class cls;
        Constructor constructor;
        Log.m165379d("NativeComponentTypeProviderImpl", "create native component, id = " + str + " viewType = " + str2);
        Iterator<C12729a> it = this.f34083b.iterator();
        while (true) {
            if (!it.hasNext()) {
                cls = null;
                break;
            }
            Map<String, Class> b = it.next().mo48204b();
            if (b != null && b.containsKey(str2)) {
                cls = b.get(str2);
                break;
            }
        }
        if (cls == null) {
            if (!this.f34082a.containsKey(str2)) {
                Log.m165383e("NativeComponentTypeProviderImpl", "component has not registered, viewType = " + str2);
                return null;
            }
            cls = this.f34082a.get(str2);
        }
        try {
            if (this.f34084c.containsKey(str2)) {
                constructor = this.f34084c.get(str2);
            } else {
                constructor = cls.getDeclaredConstructor(C12717a.class, String.class, String.class);
                constructor.setAccessible(true);
                this.f34084c.put(str2, constructor);
            }
            return (T) ((AbstractNativeComponent) constructor.newInstance(aVar, str, str2));
        } catch (Exception e) {
            Log.m165384e("NativeComponentTypeProviderImpl", "create component failed, view Type = " + str2 + " err: ", e);
            return null;
        }
    }

    @Override // com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c
    /* renamed from: a */
    public <T extends AbstractNativeComponent> void mo48198a(LarkWebView larkWebView, String str, Class<T> cls) {
        boolean z;
        Log.m165389i("NativeComponentTypeProviderImpl", "register component on webView, viewType = " + str + " component:" + cls.getCanonicalName());
        Iterator<C12729a> it = this.f34083b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C12729a next = it.next();
            if (next.mo48201a() == larkWebView.getId()) {
                next.mo48203a(str, cls);
                z = true;
                break;
            }
        }
        if (!z) {
            C12729a aVar = new C12729a();
            aVar.mo48202a(larkWebView.getId());
            aVar.mo48203a(str, cls);
            this.f34083b.add(aVar);
        }
    }
}
