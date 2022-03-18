package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.AttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/GroupMemberVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "getView", "()Landroid/view/View;", "bindData", "", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/AttendeeViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.e */
public final class GroupMemberVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f79263a;

    /* renamed from: b */
    private final IDetailAttendeeVH f79264b;

    /* renamed from: a */
    public final IDetailAttendeeVH mo113740a() {
        return this.f79264b;
    }

    /* renamed from: b */
    private final Context m117666b() {
        return this.f79263a.getContext();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/GroupMemberVH$bindData$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.e$a */
    public static final class C31308a extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ GroupMemberVH f79265a;

        /* renamed from: b */
        final /* synthetic */ IBodyData.IAttendeeDetailData f79266b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f79265a.mo113740a().mo113744a(this.f79266b.mo113378d());
        }

        C31308a(GroupMemberVH eVar, IBodyData.IAttendeeDetailData bVar) {
            this.f79265a = eVar;
            this.f79266b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo113741a(AttendeeViewData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "attendeeData");
        IBodyData.IAttendeeDetailData b = bVar.mo113792b();
        int screenWidth = DeviceUtils.getScreenWidth(m117666b()) - UIUtils.dp2px(m117666b(), 78.0f);
        this.f79263a.setOnClickListener(new C31308a(this, b));
        TextView textView = (TextView) this.f79263a.findViewById(R.id.tv_attendee_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_attendee_name");
        textView.setText(b.mo113379e());
        C31256c.m117135a(m117666b(), (SelectableRoundedImageView) this.f79263a.findViewById(R.id.iv_group_member_avatar), 32, 32, b.mo113375a(), b.mo113378d(), b.mo113379e(), true, b.mo113376b());
        AttendeeHelper.f78609a.mo112727a(b.mo113390p(), (ImageView) this.f79263a.findViewById(R.id.iv_group_member_status));
        if (b.mo113385k()) {
            TextView textView2 = (TextView) this.f79263a.findViewById(R.id.tv_item_outer_user);
            if (textView2 != null) {
                LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                Context context = textView2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                fVar.mo90057f(context).mo90029a(true).mo90027e().mo90004a(textView2);
                textView2.setVisibility(0);
            }
            screenWidth -= UIUtils.dp2px(m117666b(), 36.0f);
        } else {
            TextView textView3 = (TextView) this.f79263a.findViewById(R.id.tv_item_outer_user);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_item_outer_user");
            textView3.setVisibility(8);
        }
        TextView textView4 = (TextView) this.f79263a.findViewById(R.id.tv_attendee_name);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_attendee_name");
        textView4.setMaxWidth(screenWidth);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberVH(View view, IDetailAttendeeVH fVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f79263a = view;
        this.f79264b = fVar;
    }
}
