package com.bytedance.ee.bear.sheet.borderline;

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
import com.bytedance.ee.bear.sheet.borderline.BorderLinePanelView;
import com.bytedance.ee.bear.sheet.common.SheetDragView;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.borderline.a */
public class C11060a extends C7667e implements BorderLinePanelView.AbstractC11057a {

    /* renamed from: a */
    private TextView f29722a;

    /* renamed from: b */
    private BorderLinePanelView f29723b;

    /* renamed from: c */
    private C11061b f29724c;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo30123c(R.anim.child_fragment_exit);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46013b(View view) {
        mo30123c(R.anim.child_fragment_exit);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46011a(BorderLineData borderLineData) {
        this.f29722a.setText(borderLineData.getTitle());
        this.f29723b.setBorderLineData(borderLineData);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46012a(Boolean bool) {
        BorderLinePanelView borderLinePanelView;
        if (Boolean.TRUE.equals(bool) && (borderLinePanelView = this.f29723b) != null) {
            borderLinePanelView.mo42133a();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11061b bVar = (C11061b) C4950k.m20474a(this, C11061b.class);
        this.f29724c = bVar;
        bVar.isClearBorderLinePanel().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.borderline.$$Lambda$a$56ojbLvxTK6hgkrWAOIRZeXQQgk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11060a.lambda$56ojbLvxTK6hgkrWAOIRZeXQQgk(C11060a.this, (Boolean) obj);
            }
        });
    }

    /* renamed from: a */
    private void m46010a(View view) {
        View findViewById = view.findViewById(R.id.title_bar_layout);
        findViewById.findViewById(R.id.back_icon).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.borderline.$$Lambda$a$K1aj3BkAWvu8UYeJ1rsOE_HWm0 */

            public final void onClick(View view) {
                C11060a.m269930lambda$K1aj3BkAWvu8UYeJ1rsOE_HWm0(C11060a.this, view);
            }
        });
        ((SheetDragView) view.getRootView().findViewById(R.id.fab_dragview)).setSlideView(findViewById);
        TextView textView = (TextView) findViewById.findViewById(R.id.title);
        this.f29722a = textView;
        textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        this.f29722a.getPaint().setStrokeWidth(1.0f);
        BorderLinePanelView borderLinePanelView = (BorderLinePanelView) view.findViewById(R.id.border_line_panel_view);
        this.f29723b = borderLinePanelView;
        borderLinePanelView.setDelegate(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m46010a(view);
        this.f29724c.getBorderLineData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.borderline.$$Lambda$a$iTnnd42XaV_k7obWodxQYWitU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11060a.m269931lambda$iTnnd42XaV_k7obWodxQYWitU(C11060a.this, (BorderLineData) obj);
            }
        });
        SheetPanelRouter.f29786a.mo42307a(this, getFragmentManager(), null);
    }

    @Override // com.bytedance.ee.bear.sheet.borderline.BorderLinePanelView.AbstractC11057a
    /* renamed from: a */
    public void mo42137a(String str, String str2, String str3) {
        C11061b bVar = this.f29724c;
        if (bVar != null) {
            bVar.onBorderLineSelected(str, str2, str3);
        }
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
        return layoutInflater.inflate(R.layout.sheet_border_fragment, viewGroup, false);
    }
}
