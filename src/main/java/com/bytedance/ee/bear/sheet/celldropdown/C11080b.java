package com.bytedance.ee.bear.sheet.celldropdown;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.sheet.celldropdown.C11076a;
import com.bytedance.ee.bear.sheet.celldropdown.C11082c;
import com.bytedance.ee.bear.sheet.celldropdown.DropdownData;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.celldropdown.b */
public class C11080b extends DialogInterface$OnCancelListenerC1021b implements AbstractC7666d {

    /* renamed from: c */
    public C11082c f29765c;

    /* renamed from: d */
    private C11076a f29766d;

    /* renamed from: e */
    private CommonActionPanelLayout f29767e;

    /* renamed from: f */
    private RecyclerView f29768f;

    /* renamed from: g */
    private AbstractC7665c f29769g;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        this.f29765c.cancelDropdown();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo42227f() {
        if (this.f29767e.getMeasuredHeight() == 0) {
            m46063g();
        }
        return this.f29767e.getMeasuredHeight();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29765c.setActive(false);
        this.f29765c.setPanelHeightDelegate(null);
        AbstractC7665c cVar = this.f29769g;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    /* renamed from: g */
    private void m46063g() {
        int i;
        if (2 == getResources().getConfiguration().orientation) {
            i = getResources().getDimensionPixelOffset(R.dimen.space_kit_len_172);
        } else {
            i = (int) (((float) C13749l.m55748b()) * 0.4f);
        }
        this.f29767e.measure(0, View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
        int min = Math.min(this.f29767e.getMeasuredHeight(), i);
        ViewGroup.LayoutParams layoutParams = this.f29767e.getLayoutParams();
        layoutParams.height = min;
        this.f29767e.setLayoutParams(layoutParams);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog v_ = v_();
        Window window = v_.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = BitmapDescriptorFactory.HUE_RED;
            attributes.gravity = 80;
            attributes.flags |= 8;
            attributes.y = C13746i.m55722a(getContext());
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        mo5512a(false);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(v_);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46058a(View view) {
        this.f29765c.cancelDropdown();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46061b(int i) {
        this.f29768f.scrollToPosition(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m46057a(configuration.orientation);
    }

    /* renamed from: a */
    private void m46057a(int i) {
        boolean z;
        if (isAdded()) {
            CommonActionPanelLayout commonActionPanelLayout = this.f29767e;
            if (2 != i) {
                z = true;
            } else {
                z = false;
            }
            commonActionPanelLayout.setTitleBarVisible(z);
            m46063g();
        }
    }

    /* renamed from: b */
    private void m46062b(DropdownData.C11072a[] aVarArr) {
        if (aVarArr != null) {
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                if (aVarArr[i].mo42210c()) {
                    this.f29768f.post(new Runnable(i) {
                        /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$b$utdB7nynti3dvl2jQIxWeJrcJsQ */
                        public final /* synthetic */ int f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C11080b.this.m46061b((C11080b) this.f$1);
                        }
                    });
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(2, 0);
        this.f29765c = (C11082c) C4950k.m20474a(this, C11082c.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m46060a(DropdownData.C11072a[] aVarArr) {
        C11076a aVar = this.f29766d;
        if (aVar != null) {
            aVar.mo42226a(aVarArr, this.f29765c.getTextColor());
        }
        m46062b(aVarArr);
        m46063g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C11076a aVar = new C11076a();
        this.f29766d = aVar;
        C11082c cVar = this.f29765c;
        cVar.getClass();
        aVar.mo42224a(new C11076a.AbstractC11077a() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$ll1JKhjMH8juM2xj3ElQBQNFPo */

            @Override // com.bytedance.ee.bear.sheet.celldropdown.C11076a.AbstractC11077a
            public final void onItemSelected(String str) {
                C11082c.this.selectOption(str);
            }
        });
        view.findViewById(R.id.rl_root).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$b$XhUpydYal33H7GtuektefN4i8qo */

            public final void onClick(View view) {
                C11080b.this.m46058a((C11080b) view);
            }
        });
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) view.findViewById(R.id.panel);
        this.f29767e = commonActionPanelLayout;
        commonActionPanelLayout.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.C11080b.C110811 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                C11080b.this.f29765c.cancelDropdown();
            }

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: e */
            public void mo42228e() {
                C11080b.this.f29765c.switchToKeyboard();
            }
        });
        this.f29768f = (RecyclerView) view.findViewById(R.id.rv_sheet_cell_dropdown);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        this.f29768f.setLayoutManager(linearLayoutManager);
        this.f29768f.setAdapter(this.f29766d);
        this.f29765c.getData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$b$AMSKpitSI0mq93fZ60f8_zoAqTI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11080b.this.m46060a((C11080b) ((DropdownData.C11072a[]) obj));
            }
        });
        this.f29765c.setPanelHeightDelegate(new C11082c.AbstractC11084b() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$DgdUeF1520ODGDpn4xXiqifyJlY */

            @Override // com.bytedance.ee.bear.sheet.celldropdown.C11082c.AbstractC11084b
            public final int getPanelHeight() {
                return C11080b.this.mo42227f();
            }
        });
        this.f29767e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$b$HvExhFUAV9JyT0FwJYs4zYcRkbI */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C11080b.this.m46059a(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        Window window = v_().getWindow();
        if (window != null) {
            window.getAttributes().windowAnimations = R.style.DropdownPopupWindowStyle;
        }
        m46057a(getResources().getConfiguration().orientation);
        this.f29765c.setActive(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
        this.f29769g = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
        return layoutInflater.inflate(R.layout.sheet_cell_dropdown_fragment, viewGroup, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46059a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 != i7) {
            this.f29768f.requestLayout();
        }
    }
}
