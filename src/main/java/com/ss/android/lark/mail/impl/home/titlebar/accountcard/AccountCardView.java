package com.ss.android.lark.mail.impl.home.titlebar.accountcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.p2165d.C42040a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemView", "Landroid/widget/RelativeLayout;", "viewHolder", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeAccountCardLayoutBinding;", "bindAccountCardViewHolder", "", "state", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardState;", "getItemView", "Landroid/view/View;", "initView", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.d.a.c */
public final class AccountCardView {

    /* renamed from: a */
    private C42040a f108148a;

    /* renamed from: b */
    private RelativeLayout f108149b;

    /* renamed from: c */
    private final Context f108150c;

    /* renamed from: b */
    public final View mo152832b() {
        return this.f108149b;
    }

    /* renamed from: a */
    public final void mo152830a() {
        C42040a a = C42040a.m167223a(LayoutInflater.from(this.f108150c), null, false);
        this.f108149b = a.mo151055a();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        RelativeLayout relativeLayout = this.f108149b;
        if (relativeLayout != null) {
            relativeLayout.setLayoutParams(layoutParams);
        }
        this.f108148a = a;
    }

    public AccountCardView(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f108150c = context;
    }

    /* renamed from: a */
    public final void mo152831a(AccountCardState bVar) {
        UDBadgeView uDBadgeView;
        UDBadgeView uDBadgeView2;
        UDBadgeView uDBadgeView3;
        UDBadgeView uDBadgeView4;
        UDBadgeView uDBadgeView5;
        UDBadgeView uDBadgeView6;
        UDBadgeView uDBadgeView7;
        TextView textView;
        TextView textView2;
        Intrinsics.checkParameterIsNotNull(bVar, "state");
        RelativeLayout relativeLayout = this.f108149b;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (bVar.mo152823a()) {
                relativeLayout.setVisibility(0);
                if (layoutParams != null) {
                    layoutParams.height = UIUtils.dp2px(this.f108150c, 40.0f);
                }
                if (TextUtils.isEmpty(bVar.mo152824b())) {
                    C42040a aVar = this.f108148a;
                    if (!(aVar == null || (textView2 = aVar.f106681c) == null)) {
                        textView2.setText(R.string.Mail_Mailbox_BusinessEmailDidntLink);
                    }
                } else {
                    C42040a aVar2 = this.f108148a;
                    if (!(aVar2 == null || (textView = aVar2.f106681c) == null)) {
                        textView.setText(bVar.mo152824b());
                    }
                }
                if (!bVar.mo152825c()) {
                    C42040a aVar3 = this.f108148a;
                    if (!(aVar3 == null || (uDBadgeView2 = aVar3.f106680b) == null)) {
                        uDBadgeView2.setVisibility(8);
                    }
                } else if (bVar.mo152826d() == BadgeCountState.RED.getValue()) {
                    C42040a aVar4 = this.f108148a;
                    if (!(aVar4 == null || (uDBadgeView7 = aVar4.f106680b) == null)) {
                        uDBadgeView7.setVisibility(0);
                    }
                    C42040a aVar5 = this.f108148a;
                    if (!(aVar5 == null || (uDBadgeView6 = aVar5.f106680b) == null)) {
                        uDBadgeView6.setBadgeColorRes(R.color.function_danger_500);
                    }
                } else if (bVar.mo152826d() == BadgeCountState.GRAY.getValue()) {
                    C42040a aVar6 = this.f108148a;
                    if (!(aVar6 == null || (uDBadgeView5 = aVar6.f106680b) == null)) {
                        uDBadgeView5.setVisibility(0);
                    }
                    C42040a aVar7 = this.f108148a;
                    if (!(aVar7 == null || (uDBadgeView4 = aVar7.f106680b) == null)) {
                        uDBadgeView4.setBadgeColorRes(R.color.icon_disable);
                    }
                } else {
                    C42040a aVar8 = this.f108148a;
                    if (!(aVar8 == null || (uDBadgeView3 = aVar8.f106680b) == null)) {
                        uDBadgeView3.setVisibility(8);
                    }
                }
                C42040a aVar9 = this.f108148a;
                if (!(aVar9 == null || (uDBadgeView = aVar9.f106680b) == null)) {
                    uDBadgeView.mo90238b();
                }
            } else {
                relativeLayout.setVisibility(8);
                if (layoutParams != null) {
                    layoutParams.height = 0;
                }
            }
            RelativeLayout relativeLayout2 = this.f108149b;
            if (relativeLayout2 == null) {
                Intrinsics.throwNpe();
            }
            relativeLayout2.requestLayout();
        }
    }
}
