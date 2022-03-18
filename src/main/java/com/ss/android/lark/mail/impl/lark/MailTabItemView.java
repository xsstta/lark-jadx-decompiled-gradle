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
import com.ss.android.lark.widget.tab.MainTabItemView;

public class MailTabItemView extends MainTabItemView {

    /* renamed from: a */
    private AbstractC1178x<C42089c> f108726a;

    /* renamed from: c */
    public void mo137108c() {
        C41832a.m166157a().mo150418d().mo5925a(this.f108726a);
    }

    /* renamed from: d */
    public void mo153398d() {
        C41832a.m166157a().mo150418d().mo5928b(this.f108726a);
    }

    public MailTabItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m170325a(Context context) {
        setId(R.id.mail_tab);
        Drawable drawable = UIHelper.getDrawable(R.drawable.ud_icon_tab_mail_filled);
        drawable.setTint(UIHelper.getColor(R.color.ud_N500));
        mo201235a(drawable, new MainTabItemView.AbstractC59196a() {
            /* class com.ss.android.lark.mail.impl.lark.MailTabItemView.C427162 */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public Drawable getDrawable() {
                return UIHelper.getDrawable(R.drawable.ud_icon_tab_mail_colorful);
            }
        });
        setTabTitle(UIHelper.getString(R.string.Mail_Normal_Email));
        C41837a aVar = new C41837a(getContext());
        C42089c b = C41832a.m166157a().mo150418d().mo5927b();
        if (b != null) {
            aVar.mo150423a(b.mo151831b(false));
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2815g = R.id.icon;
        layoutParams.f2813e = R.id.icon;
        layoutParams.f2816h = R.id.icon;
        layoutParams.f2818j = R.id.icon;
        mo201236a(aVar, layoutParams);
    }

    public MailTabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MailTabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108726a = new AbstractC1178x<C42089c>() {
            /* class com.ss.android.lark.mail.impl.lark.MailTabItemView.C427151 */

            /* renamed from: a */
            public void onChanged(C42089c cVar) {
                if (cVar != null) {
                    int a = cVar.mo151826a();
                    BadgeCountState b = cVar.mo151830b();
                    Log.m165389i("MailTabItemView", "totalCount: " + a + ", badgeCountState:" + b);
                    if (MailTabItemView.this.getRedDotView() instanceof C41837a) {
                        ((C41837a) MailTabItemView.this.getRedDotView()).mo150423a(b);
                    }
                    MailTabItemView.this.getRedDotView().mo31307a(Integer.valueOf(a));
                }
            }
        };
        m170325a(context);
    }
}
