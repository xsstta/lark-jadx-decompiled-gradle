package com.bytedance.ee.bear.lark.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.MainTabItemView;

public class DocTabView extends MainTabItemView {

    /* renamed from: a */
    public int f21704a;

    public int getRedDotCount() {
        return this.f21704a;
    }

    public DocTabView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m32426a(Context context) {
        setTabTitle(UIHelper.getString(R.string.Lark_Legacy_Docs));
        setId(R.id.doc_tab);
        mo201235a(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_tab_drive_filled, getResources().getColor(R.color.ud_N500)), new MainTabItemView.AbstractC59196a() {
            /* class com.bytedance.ee.bear.lark.tab.DocTabView.C81271 */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public Drawable getDrawable() {
                return DocTabView.this.getResources().getDrawable(R.drawable.ud_icon_tab_drive_colorful);
            }
        });
        C81282 r0 = new C59204a<LKUIBadgeView, Integer>(context) {
            /* class com.bytedance.ee.bear.lark.tab.DocTabView.C81282 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.widget.tab.C59204a
            /* renamed from: a */
            public void mo31305a(Context context) {
                super.mo31305a(context);
                this.f147019e = new LKUIBadgeView(context);
            }

            /* renamed from: a */
            public void mo31307a(Integer num) {
                super.mo31307a((Object) num);
                C13479a.m54764b("ContactTabView", "show()...count = " + num);
                DocTabView.this.f21704a = num.intValue();
                if (num.intValue() == 0) {
                    ((LKUIBadgeView) mo201282b()).setVisibility(8);
                    return;
                }
                ((LKUIBadgeView) mo201282b()).setVisibility(0);
                ((LKUIBadgeView) mo201282b()).mo89322b(R.drawable.doc_tab_badge).mo89320a();
            }
        };
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2815g = R.id.icon;
        layoutParams.f2813e = R.id.icon;
        layoutParams.f2816h = R.id.icon;
        layoutParams.f2818j = R.id.icon;
        mo201236a(r0, layoutParams);
    }

    public DocTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DocTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32426a(context);
    }
}
