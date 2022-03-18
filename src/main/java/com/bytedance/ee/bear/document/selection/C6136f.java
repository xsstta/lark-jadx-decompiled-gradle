package com.bytedance.ee.bear.document.selection;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.selection.f */
public class C6136f extends AbstractView$OnTouchListenerC6130e<ViewGroup> {

    /* renamed from: t */
    static final /* synthetic */ boolean f17077t;

    /* renamed from: u */
    private DocBridgeWebViewV2.AbstractC5605c f17078u = new DocBridgeWebViewV2.AbstractC5605c() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$f$KwS45QOlPG6lU9nsrKNZvb4mpg */

        @Override // com.bytedance.ee.bear.document.DocBridgeWebViewV2.AbstractC5605c
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            C6136f.m269300lambda$KwS45QOlPG6lU9nsrKNZvb4mpg(C6136f.this, view, i, i2, i3, i4);
        }
    };

    /* renamed from: v */
    private Runnable f17079v = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.C6136f.RunnableC61371 */

        public void run() {
            if (C6136f.this.f17045c != null) {
                C6136f.this.f17045c.invalidateContentRect();
            }
        }
    };

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: o */
    public boolean mo24737o() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.document.selection.f$a */
    protected class C6139a extends ActionMode.Callback2 implements AbstractView$OnTouchListenerC6130e.AbstractC6134b {

        /* renamed from: b */
        private ActionMode.Callback f17084b;

        /* renamed from: c */
        private AbstractView$OnTouchListenerC6130e<ViewGroup>.C6133a f17085c;

        @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.AbstractC6134b
        /* renamed from: a */
        public boolean mo24753a() {
            return this.f17085c.mo24747a();
        }

        @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.AbstractC6134b
        /* renamed from: a */
        public void mo24752a(LinkedHashMap<String, String> linkedHashMap) {
            this.f17085c.mo24746a(linkedHashMap);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f17085c.mo24745a(actionMode);
        }

        protected C6139a() {
            C6136f.this = r2;
            this.f17085c = new AbstractView$OnTouchListenerC6130e.C6133a();
        }

        @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.AbstractC6134b
        /* renamed from: a */
        public ActionMode.Callback mo24751a(ActionMode.Callback callback) {
            C13479a.m54764b("SelectionNewVH", "proxyCallback " + this);
            if (callback != this) {
                this.f17084b = callback;
            }
            return this;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f17085c.mo24749a(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f17085c.mo24748a(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f17085c.mo24750b(actionMode, menu);
        }

        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            if (!C6136f.this.f17052j.isEmpty()) {
                rect.set(C6136f.this.f17052j);
                rect.offset(0, -C6136f.this.f17043a.getScrollY());
            } else {
                ActionMode.Callback callback = this.f17084b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                }
            }
            if (C6136f.this.f17056n) {
                rect.top = C13749l.m55738a(30);
                rect.bottom = rect.top + 50;
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: b */
    public void mo24722b() {
        super.mo24722b();
        this.f17043a.mo22339b(this.f17078u);
        C13742g.m55710c(this.f17079v);
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: p */
    public ActionMode mo24740p() {
        return this.f17043a.startActionMode(this.f17046d, 1);
    }

    /* renamed from: r */
    private void m24762r() {
        if (this.f17045c != null && this.f17045c.getType() == 1 && !this.f17052j.isEmpty()) {
            this.f17045c.hide(500);
            C13742g.m55710c(this.f17079v);
            C13742g.m55706a(this.f17079v, 300);
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: n */
    public void mo24736n() {
        for (ViewGroup viewGroup : this.f17059q) {
            View a = m24760a(viewGroup);
            if (a != null) {
                a.setOnTouchListener(null);
            }
        }
        this.f17059q.clear();
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: l */
    public void mo24734l() {
        for (ViewGroup viewGroup : this.f17059q) {
            viewGroup.getLocationOnScreen(this.f17058p);
            int f = (C13749l.m55762f(viewGroup.getContext()) - this.f17044b) - C13749l.m55738a(50);
            C13479a.m54764b("SelectionNewVH", "updateSelectionHandleVisible:" + f + "  " + this.f17058p[1]);
            if (this.f17044b <= 0 || this.f17058p[1] <= f) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(4);
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: m */
    public boolean mo24735m() {
        mo24736n();
        boolean z = f17077t;
        for (ViewGroup viewGroup : mo24755q()) {
            final View a = m24760a(viewGroup);
            if (a != null) {
                this.f17059q.add(viewGroup);
                a.setOnTouchListener(new AbstractView$OnTouchListenerC6130e.View$OnTouchListenerC6135c(z));
                a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.ee.bear.document.selection.C6136f.View$OnAttachStateChangeListenerC61382 */

                    public void onViewAttachedToWindow(View view) {
                    }

                    public void onViewDetachedFromWindow(View view) {
                        a.setOnTouchListener(null);
                        a.removeOnAttachStateChangeListener(this);
                    }
                });
                z ^= f17077t;
            }
        }
        if (this.f17059q.size() > 0) {
            return f17077t;
        }
        return false;
    }

    /* renamed from: q */
    public List<ViewGroup> mo24755q() {
        View a;
        float f;
        ArrayList arrayList = new ArrayList();
        try {
            WindowManager windowManager = (WindowManager) mo24731i().getSystemService("window");
            if (!f17077t) {
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
                C13479a.m54764b("SelectionNewVH", "rootViewNames == null");
                return arrayList;
            }
            for (String str : strArr) {
                C13479a.m54772d("SelectionNewVH", "viewName " + str);
                if (str.startsWith("PopupWindow")) {
                    View view = (View) method2.invoke(invoke, str);
                    if ((view instanceof ViewGroup) && (a = m24760a((ViewGroup) view)) != null) {
                        if (this.f17061s) {
                            f = 1.0f;
                        } else {
                            f = BitmapDescriptorFactory.HUE_RED;
                        }
                        a.setAlpha(f);
                        arrayList.add((ViewGroup) view);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C13479a.m54759a("SelectionNewVH", "SelectionNewVH tryFindPopupViews ", th);
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e
    /* renamed from: a */
    public void mo24719a(DocBridgeWebViewV2 docBridgeWebViewV2) {
        super.mo24719a(docBridgeWebViewV2);
        docBridgeWebViewV2.mo22327a(this.f17078u);
        this.f17046d = new C6139a();
    }

    C6136f(AbstractC5233x xVar) {
        super(xVar);
    }

    /* renamed from: a */
    private View m24760a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            C13479a.m54772d("SelectionNewVH", "tryFindPopupTouchHandler()... child name is " + childAt.getClass().getSimpleName());
            if ("PopupTouchHandleDrawable".equals(childAt.getClass().getSimpleName())) {
                C13479a.m54772d("SelectionNewVH", "tryFindPopupTouchHandler()... find PopupTouchHandleDrawable success");
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m24761a(View view, int i, int i2, int i3, int i4) {
        mo24715a();
        m24762r();
    }
}
