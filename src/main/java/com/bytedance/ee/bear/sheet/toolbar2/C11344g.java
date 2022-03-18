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
import com.bytedance.ee.bear.sheet.selectcolor.C11304b;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.g */
public class C11344g extends AbstractC6207c implements AbstractC7666d, CommonColorSchemeView.AbstractC11827a {

    /* renamed from: c */
    static final /* synthetic */ boolean f30484c = true;

    /* renamed from: d */
    private View f30485d;

    /* renamed from: e */
    private CommonColorSchemeView f30486e;

    /* renamed from: f */
    private C11304b f30487f;

    /* renamed from: g */
    private AbstractC7665c f30488g;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return f30484c;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC7665c cVar = this.f30488g;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        Context context = getContext();
        if (f30484c || context != null) {
            CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) LayoutInflater.from(context).inflate(R.layout.sheet_block_select_color_fragment, (ViewGroup) null);
            commonActionPanelLayout.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.C11344g.C113451 */

                @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
                /* renamed from: d */
                public void mo18838d() {
                    C11344g.this.mo5513b();
                }
            });
            this.f30485d = commonActionPanelLayout.getTopBar();
            CommonColorSchemeView commonColorSchemeView = (CommonColorSchemeView) commonActionPanelLayout.findViewById(R.id.color_scheme_view);
            this.f30486e = commonColorSchemeView;
            commonColorSchemeView.setDelegate(this);
            this.f30487f.getSelectColorData().mo5923a(this, new AbstractC1178x(commonActionPanelLayout) {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$g$bodZMZMuKetzJ4UDfqBWXllxL8 */
                public final /* synthetic */ CommonActionPanelLayout f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C11344g.this.m47097a((C11344g) this.f$1, (CommonActionPanelLayout) ((SheetSelectColorData) obj));
                }
            });
            return C6218f.m25065a().mo25152a(commonActionPanelLayout, R.color.space_kit_white);
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
    /* renamed from: a */
    public void mo18274a(String str) {
        this.f30487f.onTopicColorSelected(str);
    }

    @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
    /* renamed from: b */
    public void mo18275b(String str) {
        this.f30487f.onSpecificColorSelected(str);
    }

    /* renamed from: a */
    private CommonColorSchemeView.ColorScheme[] m47098a(SheetSelectColorData.ColorScheme[] colorSchemeArr) {
        if (colorSchemeArr == null) {
            return null;
        }
        CommonColorSchemeView.ColorScheme[] colorSchemeArr2 = new CommonColorSchemeView.ColorScheme[colorSchemeArr.length];
        for (int i = 0; i < colorSchemeArr.length; i++) {
            colorSchemeArr2[i] = new CommonColorSchemeView.ColorScheme(colorSchemeArr[i].getTopicColor(), colorSchemeArr[i].getDefaultColor(), colorSchemeArr[i].getColorList());
        }
        return colorSchemeArr2;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f30484c || activity != null) {
            this.f30487f = (C11304b) C4950k.m20474a(this, C11304b.class);
            AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
            this.f30488g = cVar;
            if (cVar != null) {
                cVar.mo30121a(this);
                return;
            }
            return;
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
            this.f30485d.measure(0, 0);
            attributes.height += this.f30485d.getMeasuredHeight();
            window.setWindowAnimations(R.style.RightInRightOutAnimationDialog);
            window.setAttributes(attributes);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47097a(CommonActionPanelLayout commonActionPanelLayout, SheetSelectColorData sheetSelectColorData) {
        if (sheetSelectColorData != null) {
            commonActionPanelLayout.setTitle(sheetSelectColorData.getTitle());
            this.f30486e.mo45320a(m47098a(sheetSelectColorData.getColorSchemeList()), sheetSelectColorData.getSelectedColor());
        }
    }
}
