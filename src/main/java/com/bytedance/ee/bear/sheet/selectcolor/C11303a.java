package com.bytedance.ee.bear.sheet.selectcolor;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.sheet.common.SheetDragView;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.selectcolor.a */
public class C11303a extends C7667e implements CommonColorSchemeView.AbstractC11827a {

    /* renamed from: a */
    private String f30401a;

    /* renamed from: b */
    private TextView f30402b;

    /* renamed from: c */
    private CommonColorSchemeView f30403c;

    /* renamed from: d */
    private C11304b f30404d;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo30123c(R.anim.child_fragment_exit);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46966b(View view) {
        mo30123c(R.anim.child_fragment_exit);
    }

    @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
    /* renamed from: a */
    public void mo18274a(String str) {
        this.f30404d.onTopicColorSelected(this.f30401a, str);
    }

    @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
    /* renamed from: b */
    public void mo18275b(String str) {
        this.f30404d.onSpecificColorSelected(this.f30401a, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46964a(SheetSelectColorData sheetSelectColorData) {
        if (sheetSelectColorData != null) {
            this.f30402b.setText(sheetSelectColorData.getTitle());
            this.f30403c.mo45320a(m46965a(sheetSelectColorData.getColorSchemeList()), sheetSelectColorData.getSelectedColor());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30401a = requireArguments().getString("id");
        this.f30404d = (C11304b) C4950k.m20474a(this, C11304b.class);
    }

    /* renamed from: a */
    private CommonColorSchemeView.ColorScheme[] m46965a(SheetSelectColorData.ColorScheme[] colorSchemeArr) {
        if (colorSchemeArr == null) {
            return null;
        }
        CommonColorSchemeView.ColorScheme[] colorSchemeArr2 = new CommonColorSchemeView.ColorScheme[colorSchemeArr.length];
        for (int i = 0; i < colorSchemeArr.length; i++) {
            colorSchemeArr2[i] = new CommonColorSchemeView.ColorScheme(colorSchemeArr[i].getTopicColor(), colorSchemeArr[i].getDefaultColor(), colorSchemeArr[i].getColorList());
        }
        return colorSchemeArr2;
    }

    /* renamed from: a */
    private void m46963a(View view) {
        View findViewById = view.findViewById(R.id.title_bar_layout);
        findViewById.findViewById(R.id.back_icon).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.selectcolor.$$Lambda$a$AT9RQ6wadkHNmyXPcTJfakAcXw */

            public final void onClick(View view) {
                C11303a.this.m46966b((C11303a) view);
            }
        });
        TextView textView = (TextView) findViewById.findViewById(R.id.title);
        this.f30402b = textView;
        textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        this.f30402b.getPaint().setStrokeWidth(1.0f);
        ((SheetDragView) view.getRootView().findViewById(R.id.fab_dragview)).setSlideView(findViewById);
        CommonColorSchemeView commonColorSchemeView = (CommonColorSchemeView) view.findViewById(R.id.color_scheme_view);
        this.f30403c = commonColorSchemeView;
        commonColorSchemeView.setDelegate(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m46963a(view);
        this.f30404d.getSelectColorData(this.f30401a).mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.selectcolor.$$Lambda$a$8QqV75s_oZjAIyojNXLQMrAVR0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11303a.this.m46964a((C11303a) ((SheetSelectColorData) obj));
            }
        });
        SheetPanelRouter.f29786a.mo42307a(this, getFragmentManager(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return AnimationUtils.loadAnimation(getContext(), R.anim.child_fragment_enter);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_select_color_fragment, viewGroup, false);
    }
}
