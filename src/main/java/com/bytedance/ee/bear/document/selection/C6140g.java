package com.bytedance.ee.bear.document.selection;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.selection.g */
public class C6140g extends AbstractView$OnTouchListenerC6130e<View> {

    /* renamed from: t */
    static final /* synthetic */ boolean f17086t = true;

    /* renamed from: u */
    private C6095s f17087u;

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: l */
    public void mo24734l() {
    }

    /* renamed from: com.bytedance.ee.bear.document.selection.g$a */
    protected class ActionMode$CallbackC6141a implements ActionMode.Callback, AbstractView$OnTouchListenerC6130e.AbstractC6134b {

        /* renamed from: b */
        private AbstractView$OnTouchListenerC6130e<View>.C6133a f17089b;

        @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.AbstractC6134b
        /* renamed from: a */
        public boolean mo24753a() {
            return this.f17089b.mo24747a();
        }

        @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.AbstractC6134b
        /* renamed from: a */
        public void mo24752a(LinkedHashMap<String, String> linkedHashMap) {
            this.f17089b.mo24746a(linkedHashMap);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f17089b.mo24745a(actionMode);
        }

        protected ActionMode$CallbackC6141a() {
            this.f17089b = new AbstractView$OnTouchListenerC6130e.C6133a();
        }

        @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.AbstractC6134b
        /* renamed from: a */
        public ActionMode.Callback mo24751a(ActionMode.Callback callback) {
            C13479a.m54764b("SelectionNewVL", "proxyCallback " + this);
            return this;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f17089b.mo24749a(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f17089b.mo24748a(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f17089b.mo24750b(actionMode, menu);
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: p */
    public ActionMode mo24740p() {
        return this.f17043a.startActionMode(this.f17046d);
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: n */
    public void mo24736n() {
        for (View view : this.f17059q) {
            view.setOnTouchListener(null);
        }
        this.f17059q.clear();
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: o */
    public boolean mo24737o() {
        for (View view : this.f17059q) {
            if (view.getVisibility() == 0) {
                return f17086t;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: m */
    public boolean mo24735m() {
        mo24736n();
        boolean z = f17086t;
        for (View view : mo24755q()) {
            this.f17059q.add(view);
            view.setOnTouchListener(new AbstractView$OnTouchListenerC6130e.View$OnTouchListenerC6135c(z));
            z ^= f17086t;
        }
        if (this.f17059q.size() > 0) {
            return f17086t;
        }
        return false;
    }

    /* renamed from: q */
    public List<View> mo24755q() {
        float f;
        ArrayList arrayList = new ArrayList();
        try {
            WindowManager windowManager = (WindowManager) mo24731i().getSystemService("window");
            if (!f17086t) {
                if (windowManager == null) {
                    throw new AssertionError();
                }
            }
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, null);
            Method method = cls.getMethod("getViewRootNames", new Class[0]);
            Method method2 = cls.getMethod("getRootView", String.class);
            String[] strArr = (String[]) method.invoke(invoke, null);
            if (strArr == null) {
                C13479a.m54764b("SelectionNewVL", "rootViewNames == null");
                return arrayList;
            }
            for (String str : strArr) {
                C13479a.m54772d("SelectionNewVL", "ViewName " + str);
                if (str.startsWith("PopupWindow")) {
                    View view = (View) method2.invoke(invoke, str);
                    if (view instanceof View) {
                        C13479a.m54772d("SelectionNewVL", "root view name " + view.getClass().getSimpleName());
                        if ("PopupTouchHandleDrawable".equals(view.getClass().getSimpleName())) {
                            C13479a.m54772d("SelectionNewVL", "PopupTouchHandleDrawable simpleName");
                            if (this.f17061s) {
                                f = 1.0f;
                            } else {
                                f = BitmapDescriptorFactory.HUE_RED;
                            }
                            view.setAlpha(f);
                            arrayList.add(view);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C13479a.m54759a("SelectionNewVL", "SelectionNewVL tryFindPopupViews ", th);
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: a */
    public void mo24719a(DocBridgeWebViewV2 docBridgeWebViewV2) {
        super.mo24719a(docBridgeWebViewV2);
        this.f17046d = new ActionMode$CallbackC6141a();
    }

    public C6140g(C6095s sVar, AbstractC5233x xVar) {
        super(xVar);
        this.f17087u = sVar;
    }
}
