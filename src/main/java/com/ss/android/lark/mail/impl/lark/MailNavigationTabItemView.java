package com.ss.android.lark.mail.impl.lark;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.badge.C41832a;
import com.ss.android.lark.mail.impl.badge.p2163a.C41837a;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.entity.C42089c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.NavigationTabItemView;

public class MailNavigationTabItemView extends NavigationTabItemView {

    /* renamed from: a */
    private AbstractC1178x<C42089c> f108724a = new AbstractC1178x<C42089c>() {
        /* class com.ss.android.lark.mail.impl.lark.MailNavigationTabItemView.C427141 */

        /* renamed from: a */
        public void onChanged(C42089c cVar) {
            if (cVar != null) {
                int a = cVar.mo151826a();
                BadgeCountState b = cVar.mo151830b();
                Log.m165389i("MailNavigationTabItemView", "totalCount: " + a + ", badgeCountState:" + b);
                if (MailNavigationTabItemView.this.getRedDotView() instanceof C41837a) {
                    ((C41837a) MailNavigationTabItemView.this.getRedDotView()).mo150423a(b);
                }
                MailNavigationTabItemView.this.getRedDotView().mo31307a(Integer.valueOf(a));
            }
        }
    };

    /* renamed from: a */
    public void mo153395a() {
        C41832a.m166157a().mo150418d().mo5925a(this.f108724a);
    }

    /* renamed from: b */
    public void mo153396b() {
        C41832a.m166157a().mo150418d().mo5928b(this.f108724a);
    }

    public MailNavigationTabItemView(Context context) {
        super(context);
        m170321a(context);
    }

    /* renamed from: a */
    private void m170321a(Context context) {
        Drawable drawable = UIHelper.getDrawable(R.drawable.ud_icon_tab_mail_filled);
        drawable.setTint(UIHelper.getColor(R.color.ud_I500));
        setTabIcon(drawable);
        setTabTitle(getResources().getString(R.string.Mail_Normal_Email));
        C41837a aVar = new C41837a(getContext());
        C42089c b = C41832a.m166157a().mo150418d().mo5927b();
        if (b != null) {
            aVar.mo150423a(b.mo151831b(false));
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2815g = R.id.icon;
        layoutParams.f2813e = R.id.icon;
        layoutParams.f2816h = R.id.icon;
        mo201264a(aVar, layoutParams);
    }

    public MailNavigationTabItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m170321a(context);
    }

    public MailNavigationTabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m170321a(context);
    }
}
