package com.bytedance.ee.bear.doc.translate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.MaxSizeLinearLayout;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.translate.d */
public class View$OnLayoutChangeListenerC5577d extends Fragment implements View.OnLayoutChangeListener, AbstractC7720n {

    /* renamed from: a */
    static final /* synthetic */ boolean f15819a = true;

    /* renamed from: b */
    private C5579f f15820b;

    /* renamed from: c */
    private TextView f15821c;

    /* renamed from: d */
    private AbstractC7719m f15822d;

    /* renamed from: e */
    private int[] f15823e = new int[2];

    /* renamed from: f */
    private Runnable f15824f = new Runnable() {
        /* class com.bytedance.ee.bear.doc.translate.$$Lambda$d$NQPQk2T9TL5ugQZh1fuTq2i4lU */

        public final void run() {
            View$OnLayoutChangeListenerC5577d.this.m22597b();
        }
    };

    /* renamed from: a */
    private void m22593a() {
        this.f15820b.setActiveOriginal(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (getView() != null) {
            getView().removeOnLayoutChangeListener(this);
        }
        AbstractC7719m mVar = this.f15822d;
        if (mVar != null) {
            mVar.mo30101b(this);
            this.f15822d = null;
        }
        C13742g.m55710c(this.f15824f);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m22597b() {
        View view = getView();
        if (view != null) {
            this.f15820b.onActiveOriginalPanelShown(view.getHeight());
            view.removeOnLayoutChangeListener(this);
            view.getLayoutParams().height = view.getMeasuredHeight();
            ((MaxSizeLinearLayout) view).setEnableMaxHeight(false);
            C7728a aVar = new C7728a(getContext(), view, C7728a.m30902a(), (float) view.getMeasuredHeight(), C7728a.m30905b());
            aVar.mo30252a(view.findViewById(R.id.originalTitle));
            aVar.mo30253a(new C7728a.AbstractC7730a() {
                /* class com.bytedance.ee.bear.doc.translate.$$Lambda$d$YJi6jdJAdnj1iAIN06Qr8jOpjbQ */

                @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
                public final void onHeightChange(int i) {
                    View$OnLayoutChangeListenerC5577d.this.m22594a((View$OnLayoutChangeListenerC5577d) i);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22594a(int i) {
        if (i == 0) {
            m22593a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f15819a || activity != null) {
            this.f15820b = (C5579f) C4950k.m20474a(this, C5579f.class);
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
    public boolean onTouchStartIntercept(MotionEvent motionEvent) {
        View view = getView();
        if (view == null) {
            return false;
        }
        view.getLocationInWindow(this.f15823e);
        if (motionEvent.getY() >= ((float) this.f15823e[1])) {
            return false;
        }
        m22593a();
        return f15819a;
    }

    /* renamed from: a */
    private void m22596a(Original original) {
        this.f15821c.setText(original.text);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22595a(View view, Original original) {
        if (original != null) {
            view.removeOnLayoutChangeListener(this);
            view.addOnLayoutChangeListener(this);
            m22596a(original);
            return;
        }
        this.f15820b.onActiveOriginalPanelDismissed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f15821c = (TextView) view.findViewById(R.id.original);
        this.f15820b.getActiveOriginal().mo5923a(this, new AbstractC1178x(view) {
            /* class com.bytedance.ee.bear.doc.translate.$$Lambda$d$uJ3b4W3Wqie5WS4NDbTgkidgTc */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnLayoutChangeListenerC5577d.this.m22595a(this.f$1, (Original) obj);
            }
        });
        AbstractC7719m mVar = (AbstractC7719m) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7719m.class);
        this.f15822d = mVar;
        if (mVar != null) {
            mVar.mo30100a(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.original_language_fragment, viewGroup, false);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C13742g.m55710c(this.f15824f);
        C13742g.m55706a(this.f15824f, 30);
    }
}
