package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.IAttendeeViewData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/AttendeeTipTextVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;)V", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "getView", "()Landroid/view/View;", "bindData", "", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/IAttendeeViewData;", "showGroupMemberGuideTip", "attendee", "showHideForSafeTip", "showNoMoreIndividualTip", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.a */
public final class AttendeeTipTextVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f79251a;

    /* renamed from: b */
    private final IDetailAttendeeVH f79252b;

    /* renamed from: a */
    public final IDetailAttendeeVH mo113729a() {
        return this.f79252b;
    }

    /* renamed from: b */
    private final void m117646b() {
        TextView textView = (TextView) this.f79251a.findViewById(R.id.attendeeTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.attendeeTipTv");
        textView.setVisibility(0);
        TextView textView2 = (TextView) this.f79251a.findViewById(R.id.leftTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.leftTipTv");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) this.f79251a.findViewById(R.id.attendeeTipTv);
        textView3.setText(C32634ae.m125182b(R.string.Calendar_Detail_HideForSafe));
        textView3.setTextColor(C32634ae.m125178a(R.color.ud_N600));
        textView3.setClickable(true);
    }

    /* renamed from: c */
    private final void m117648c() {
        TextView textView = (TextView) this.f79251a.findViewById(R.id.attendeeTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.attendeeTipTv");
        textView.setVisibility(0);
        TextView textView2 = (TextView) this.f79251a.findViewById(R.id.leftTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.leftTipTv");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) this.f79251a.findViewById(R.id.attendeeTipTv);
        textView3.setText(C32634ae.m125182b(R.string.Calendar_Common_AllGuestsShown));
        textView3.setTextColor(C32634ae.m125178a(R.color.ud_N600));
        textView3.setClickable(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/AttendeeTipTextVH$showGroupMemberGuideTip$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.a$a */
    public static final class View$OnClickListenerC31303a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeTipTextVH f79253a;

        /* renamed from: b */
        final /* synthetic */ IAttendeeViewData f79254b;

        View$OnClickListenerC31303a(AttendeeTipTextVH aVar, IAttendeeViewData cVar) {
            this.f79253a = aVar;
            this.f79254b = cVar;
        }

        public final void onClick(View view) {
            this.f79253a.mo113729a().mo113743a(((AttendeeViewData) this.f79254b).mo113792b());
        }
    }

    /* renamed from: a */
    public final void mo113730a(IAttendeeViewData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "attendeeData");
        int i = C31304b.f79255a[cVar.mo113786a().ordinal()];
        if (i == 1) {
            m117646b();
        } else if (i == 2) {
            m117647b(cVar);
        } else if (i == 3) {
            m117648c();
        }
    }

    /* renamed from: b */
    private final void m117647b(IAttendeeViewData cVar) {
        TextView textView = (TextView) this.f79251a.findViewById(R.id.attendeeTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.attendeeTipTv");
        textView.setVisibility(8);
        TextView textView2 = (TextView) this.f79251a.findViewById(R.id.leftTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.leftTipTv");
        textView2.setVisibility(0);
        if (cVar instanceof AttendeeViewData) {
            TextView textView3 = (TextView) this.f79251a.findViewById(R.id.leftTipTv);
            textView3.setText(C32634ae.m125182b(R.string.Calendar_Edit_SeeMoreGuest));
            textView3.setTextColor(C32634ae.m125178a(R.color.lkui_B600));
            textView3.setClickable(true);
            textView3.setOnClickListener(new View$OnClickListenerC31303a(this, cVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeTipTextVH(View view, IDetailAttendeeVH fVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f79251a = view;
        this.f79252b = fVar;
    }
}
