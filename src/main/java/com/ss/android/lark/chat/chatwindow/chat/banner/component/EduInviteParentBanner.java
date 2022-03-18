package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.api.ConnectionResult;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class EduInviteParentBanner extends AbstractC33152a<C33180a> {

    /* renamed from: h */
    public C33180a f85369h;

    /* renamed from: i */
    private ViewHolder f85370i;

    /* renamed from: a */
    public void mo122361a(C33180a aVar) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a, com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return R.layout.invite_parent_banner;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return 64;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.EduInviteParentBanner$b */
    public static class C33181b extends AbstractC33152a.AbstractC33153a {
        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a.AbstractC33153a
        /* renamed from: a */
        public AbstractC33152a mo122358a() {
            return new EduInviteParentBanner(this);
        }
    }

    /* renamed from: k */
    public static C33181b m128192k() {
        return new C33181b();
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f85374a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.f85374a;
            if (viewHolder != null) {
                this.f85374a = null;
                viewHolder.tipsTV = null;
                viewHolder.inviteTV = null;
                viewHolder.closeIV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f85374a = viewHolder;
            viewHolder.tipsTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tips_tv, "field 'tipsTV'", TextView.class);
            viewHolder.inviteTV = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_tv, "field 'inviteTV'", TextView.class);
            viewHolder.closeIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.close_iv, "field 'closeIV'", ImageView.class);
        }
    }

    /* renamed from: j */
    public void mo122382j() {
        if (this.f85369h != null) {
            C57744a a = C57744a.m224104a();
            a.putBoolean("chat_invite_parent_" + this.f85369h.f85375a, true);
        }
        mo122354h().mo122339a();
    }

    public EduInviteParentBanner(C33181b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: package-private */
    public static class ViewHolder {
        @BindView(7448)
        ImageView closeIV;
        @BindView(7882)
        TextView inviteTV;
        @BindView(ConnectionResult.SIGN_IN_FAILED)
        TextView tipsTV;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.EduInviteParentBanner$a */
    public static class C33180a implements AbstractC33155c {

        /* renamed from: a */
        String f85375a;

        /* renamed from: b */
        int f85376b;

        public C33180a(String str, int i) {
            this.f85375a = str;
            this.f85376b = i;
        }
    }

    /* renamed from: a */
    public void mo122345a(final View view, C33180a aVar) {
        super.mo122345a(view, (AbstractC33155c) aVar);
        this.f85369h = aVar;
        ViewHolder viewHolder = new ViewHolder(view);
        this.f85370i = viewHolder;
        viewHolder.tipsTV.setText(UIHelper.getQuantityString(R.plurals.Lark_Education_ClassXParentsInactive, aVar.f85376b));
        this.f85370i.inviteTV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.EduInviteParentBanner.C331781 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C29990c.m110930b().ah().mo134646a(view.getContext(), EduInviteParentBanner.this.f85369h.f85375a, EduInviteParentBanner.this.f85369h.f85376b);
                ChatHitPoint.f135648a.mo187369f();
            }
        });
        this.f85370i.closeIV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.component.EduInviteParentBanner.C331792 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                EduInviteParentBanner.this.mo122382j();
            }
        });
    }
}
