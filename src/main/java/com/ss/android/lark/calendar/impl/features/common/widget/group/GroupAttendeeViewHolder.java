package com.ss.android.lark.calendar.impl.features.common.widget.group;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.AttendeeHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeAdapter;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberUIData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "mAttendeeClickListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;)V", "getView", "()Landroid/view/View;", "bindHolder", "", "groupData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.c */
public final class GroupAttendeeViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final GroupAttendeeAdapter.GroupMemberDependency f78906a;

    /* renamed from: b */
    private final View f78907b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeViewHolder$bindHolder$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.c$a */
    public static final class C31212a extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeViewHolder f78908a;

        /* renamed from: b */
        final /* synthetic */ IAttendeeMemberData f78909b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f78908a.f78906a.mo113140a(this.f78909b.mo113146d());
        }

        C31212a(GroupAttendeeViewHolder cVar, IAttendeeMemberData cVar2) {
            this.f78908a = cVar;
            this.f78909b = cVar2;
        }
    }

    /* renamed from: a */
    public final void mo113164a(GroupMemberUIData groupMemberUIData) {
        Intrinsics.checkParameterIsNotNull(groupMemberUIData, "groupData");
        IAttendeeMemberData b = groupMemberUIData.mo113167b();
        if (b != null) {
            Context context = this.f78907b.getContext();
            int screenWidth = DeviceUtils.getScreenWidth(context) - UIUtils.dp2px(context, 78.0f);
            this.f78907b.setOnClickListener(new C31212a(this, b));
            TextView textView = (TextView) this.f78907b.findViewById(R.id.tv_attendee_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_attendee_name");
            textView.setText(b.mo113147e());
            C31256c.m117135a(context, (SelectableRoundedImageView) this.f78907b.findViewById(R.id.iv_group_member_avatar), 32, 32, b.mo113144b(), b.mo113146d(), b.mo113147e(), true, b.mo113145c());
            AttendeeHelper.f78609a.mo112727a(b.mo113148f(), (ImageView) this.f78907b.findViewById(R.id.iv_group_member_status));
            if (b.mo113143a()) {
                TextView textView2 = (TextView) this.f78907b.findViewById(R.id.tv_item_outer_user);
                if (textView2 != null) {
                    LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    fVar.mo90057f(context).mo90029a(true).mo90027e().mo90004a(textView2);
                    textView2.setVisibility(0);
                }
                screenWidth -= UIUtils.dp2px(context, 36.0f);
            } else {
                TextView textView3 = (TextView) this.f78907b.findViewById(R.id.tv_item_outer_user);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tv_item_outer_user");
                textView3.setVisibility(8);
            }
            TextView textView4 = (TextView) this.f78907b.findViewById(R.id.tv_attendee_name);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tv_attendee_name");
            textView4.setMaxWidth(screenWidth);
            new LinearLayout.LayoutParams(-1, C32634ae.m125185e(R.dimen.dp_56)).gravity = 16;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupAttendeeViewHolder(View view, GroupAttendeeAdapter.GroupMemberDependency aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "mAttendeeClickListener");
        this.f78907b = view;
        this.f78906a = aVar;
    }
}
