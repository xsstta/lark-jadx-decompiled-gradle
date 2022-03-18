package com.bytedance.ee.bear.sheet.toolbar2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.sheet.borderline.BorderLineData;
import com.bytedance.ee.bear.sheet.borderline.BorderLinePanelView;
import com.bytedance.ee.bear.sheet.borderline.C11061b;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.f */
public class C11342f extends AbstractC6207c implements AbstractC7666d, BorderLinePanelView.AbstractC11057a {

    /* renamed from: c */
    static final /* synthetic */ boolean f30478c = true;

    /* renamed from: d */
    private View f30479d;

    /* renamed from: e */
    private BorderLinePanelView f30480e;

    /* renamed from: f */
    private C11061b f30481f;

    /* renamed from: g */
    private AbstractC7665c f30482g;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return f30478c;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC7665c cVar = this.f30482g;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        Context context = getContext();
        if (f30478c || context != null) {
            CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) LayoutInflater.from(context).inflate(R.layout.sheet_block_select_border_fragment, (ViewGroup) null);
            commonActionPanelLayout.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.C11342f.C113431 */

                @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
                /* renamed from: d */
                public void mo18838d() {
                    C11342f.this.mo5513b();
                }
            });
            this.f30479d = commonActionPanelLayout.getTopBar();
            BorderLinePanelView borderLinePanelView = (BorderLinePanelView) commonActionPanelLayout.findViewById(R.id.border_line_panel_view);
            this.f30480e = borderLinePanelView;
            borderLinePanelView.setDelegate(this);
            this.f30481f.getBorderLineData().mo5923a(this, new AbstractC1178x(commonActionPanelLayout) {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$f$dnwX068Xhi86sSpJE3YhFOejw */
                public final /* synthetic */ CommonActionPanelLayout f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C11342f.this.m47092a((C11342f) this.f$1, (CommonActionPanelLayout) ((BorderLineData) obj));
                }
            });
            return C6218f.m25065a().mo25152a(commonActionPanelLayout, R.color.bg_body);
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        mo5510a(0, R.style.SelectColorDialogStyle);
        Dialog a = super.mo946a(bundle);
        Window window = a.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f30479d.measure(0, 0);
            attributes.height += this.f30479d.getMeasuredHeight();
            window.setWindowAnimations(R.style.RightInRightOutAnimationDialog);
            window.setAttributes(attributes);
        }
        return a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f30478c || activity != null) {
            this.f30481f = (C11061b) C4950k.m20474a(this, C11061b.class);
            AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
            this.f30482g = cVar;
            if (cVar != null) {
                cVar.mo30121a(this);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47092a(CommonActionPanelLayout commonActionPanelLayout, BorderLineData borderLineData) {
        commonActionPanelLayout.setTitle(borderLineData.getTitle());
        this.f30480e.setBorderLineData(borderLineData);
    }

    @Override // com.bytedance.ee.bear.sheet.borderline.BorderLinePanelView.AbstractC11057a
    /* renamed from: a */
    public void mo42137a(String str, String str2, String str3) {
        C11061b bVar = this.f30481f;
        if (bVar != null) {
            bVar.onBorderLineSelected(str, str2, str3);
        }
    }
}
