package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.AttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/AttendeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "getView", "()Landroid/view/View;", "bindData", "", "viewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/AttendeeViewData;", "initListener", "showInvisibleGroupMember", "attendee", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "showName", "showOptionalLabel", "showOuterUserLabel", "showPartialGroup", "showSpreadButton", "showStatus", "updateGroupAttendee", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.c */
public final class AttendeeViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f79256a;

    /* renamed from: b */
    private final IDetailAttendeeVH f79257b;

    /* renamed from: b */
    public final IDetailAttendeeVH mo113734b() {
        return this.f79257b;
    }

    /* renamed from: a */
    public final Context mo113732a() {
        return this.f79256a.getContext();
    }

    /* renamed from: b */
    private final void m117652b(AttendeeViewData bVar) {
        this.f79256a.setOnClickListener(new View$OnClickListenerC31305a(this, bVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.c$b */
    public static final class View$OnClickListenerC31306b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeViewHolder f79260a;

        View$OnClickListenerC31306b(AttendeeViewHolder cVar) {
            this.f79260a = cVar;
        }

        public final void onClick(View view) {
            AttendeeHelper aVar = AttendeeHelper.f78609a;
            Context a = this.f79260a.mo113732a();
            Intrinsics.checkExpressionValueIsNotNull(a, "context");
            aVar.mo112726a(a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.c$a */
    public static final class View$OnClickListenerC31305a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeViewHolder f79258a;

        /* renamed from: b */
        final /* synthetic */ AttendeeViewData f79259b;

        View$OnClickListenerC31305a(AttendeeViewHolder cVar, AttendeeViewData bVar) {
            this.f79258a = cVar;
            this.f79259b = bVar;
        }

        public final void onClick(View view) {
            if (this.f79259b.mo113792b().mo113381g()) {
                this.f79258a.mo113734b().mo113742a(this.f79259b);
            } else {
                this.f79258a.mo113734b().mo113745b(this.f79259b.mo113792b());
            }
        }
    }

    /* renamed from: c */
    private final void m117655c(IBodyData.IAttendeeDetailData bVar) {
        int i;
        TextView textView = (TextView) this.f79256a.findViewById(R.id.tv_partial_group);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_partial_group");
        if (!bVar.mo113381g() || !bVar.mo113383i() || !bVar.mo113384j()) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* renamed from: f */
    private final void m117658f(IBodyData.IAttendeeDetailData bVar) {
        if (bVar.mo113389o()) {
            TextView textView = (TextView) this.f79256a.findViewById(R.id.tv_optional);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_optional");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) this.f79256a.findViewById(R.id.tv_optional);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_optional");
        textView2.setVisibility(8);
    }

    /* renamed from: g */
    private final void m117659g(IBodyData.IAttendeeDetailData bVar) {
        if (!bVar.mo113381g() || !bVar.mo113383i()) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f79256a.findViewById(R.id.rl_spread_group_members);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.rl_spread_group_members");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f79256a.findViewById(R.id.rl_spread_group_members);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.rl_spread_group_members");
        relativeLayout2.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo113733a(AttendeeViewData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewData");
        IBodyData.IAttendeeDetailData b = bVar.mo113792b();
        m117653b(b);
        m117655c(b);
        m117656d(b);
        m117657e(b);
        m117658f(b);
        m117659g(b);
        m117654c(bVar);
        m117651a(b);
        m117652b(bVar);
    }

    /* renamed from: a */
    private final void m117651a(IBodyData.IAttendeeDetailData bVar) {
        if (!bVar.mo113381g() || bVar.mo113383i()) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f79256a.findViewById(R.id.rl_invisible_group_members);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.rl_invisible_group_members");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f79256a.findViewById(R.id.rl_invisible_group_members);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.rl_invisible_group_members");
        relativeLayout2.setVisibility(0);
        ((RelativeLayout) this.f79256a.findViewById(R.id.rl_invisible_group_members)).setOnClickListener(new View$OnClickListenerC31306b(this));
    }

    /* renamed from: b */
    private final void m117653b(IBodyData.IAttendeeDetailData bVar) {
        if (bVar.mo113377c()) {
            TextView textView = (TextView) this.f79256a.findViewById(R.id.tv_attendee_name);
            if (textView != null) {
                textView.setText(bVar.mo113379e());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(bVar.mo113379e());
        if (bVar.mo113381g() && bVar.mo113383i()) {
            sb.append("  (");
            sb.append(bVar.mo113386l());
            sb.append(")");
        }
        TextView textView2 = (TextView) this.f79256a.findViewById(R.id.tv_attendee_name);
        if (textView2 != null) {
            textView2.setText(sb.toString());
        }
    }

    /* renamed from: d */
    private final void m117656d(IBodyData.IAttendeeDetailData bVar) {
        if (bVar.mo113377c()) {
            ((SelectableRoundedImageView) this.f79256a.findViewById(R.id.iv_avatar)).setImageBitmap(C31256c.m117133a(36.0f, bVar.mo113379e()));
        } else {
            C31256c.m117135a(this.f79256a.getContext(), (SelectableRoundedImageView) this.f79256a.findViewById(R.id.iv_avatar), 36, 36, bVar.mo113375a(), bVar.mo113378d(), bVar.mo113379e(), true, bVar.mo113376b());
        }
        AttendeeHelper.f78609a.mo112727a(bVar.mo113390p(), (ImageView) this.f79256a.findViewById(R.id.iv_status));
    }

    /* renamed from: e */
    private final void m117657e(IBodyData.IAttendeeDetailData bVar) {
        if (bVar.mo113385k()) {
            TextView textView = (TextView) this.f79256a.findViewById(R.id.tv_outer_user);
            LarkNameTag.Companion fVar = LarkNameTag.f62897a;
            Context context = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            LarkNameTag e = fVar.mo90057f(context).mo90029a(true).mo90027e();
            Intrinsics.checkExpressionValueIsNotNull(textView, "this");
            e.mo90004a(textView);
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) this.f79256a.findViewById(R.id.tv_outer_user);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tv_outer_user");
        textView2.setVisibility(8);
    }

    /* renamed from: c */
    private final void m117654c(AttendeeViewData bVar) {
        Drawable drawable;
        IBodyData.IAttendeeDetailData b = bVar.mo113792b();
        int i = 8;
        if (!b.mo113381g() || !b.mo113383i()) {
            ProgressBar progressBar = (ProgressBar) this.f79256a.findViewById(R.id.group_attendee_loading);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "view.group_attendee_loading");
            progressBar.setVisibility(8);
            ImageView imageView = (ImageView) this.f79256a.findViewById(R.id.iv_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.iv_arrow");
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) this.f79256a.findViewById(R.id.iv_arrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.iv_arrow");
        imageView2.setVisibility(0);
        ProgressBar progressBar2 = (ProgressBar) this.f79256a.findViewById(R.id.group_attendee_loading);
        Intrinsics.checkExpressionValueIsNotNull(progressBar2, "view.group_attendee_loading");
        if (bVar.mo113795c()) {
            i = 0;
        }
        progressBar2.setVisibility(i);
        ImageView imageView3 = (ImageView) this.f79256a.findViewById(R.id.iv_arrow);
        if (imageView3 != null) {
            if (bVar.mo113797e()) {
                drawable = C32634ae.m125184d(R.drawable.ud_icon_up_outlined);
                drawable.setTint(C32634ae.m125178a(R.color.icon_n3));
            } else {
                drawable = C32634ae.m125184d(R.drawable.ud_icon_down_outlined);
                drawable.setTint(C32634ae.m125178a(R.color.icon_n3));
            }
            imageView3.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeViewHolder(View view, IDetailAttendeeVH fVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f79256a = view;
        this.f79257b = fVar;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.btn_delete_attendee);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.btn_delete_attendee");
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.rl_breakup_group);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.rl_breakup_group");
        relativeLayout2.setVisibility(8);
    }
}
