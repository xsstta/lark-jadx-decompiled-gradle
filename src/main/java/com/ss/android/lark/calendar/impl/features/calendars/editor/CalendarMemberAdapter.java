package com.ss.android.lark.calendar.impl.features.calendars.editor;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.helper.CalendarEditorHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u000e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendar", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "setCalendar", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)V", "calendarMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "getCalendarMembers", "()Ljava/util/List;", "setCalendarMembers", "(Ljava/util/List;)V", "mDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$Delegate;", "getMDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$Delegate;", "setMDelegate", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$Delegate;)V", "managerType", "", "getManagerType", "()Ljava/lang/String;", "setManagerType", "(Ljava/lang/String;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDelegate", "delegate", "Companion", "Delegate", "MemberItemViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.f */
public final class CalendarMemberAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final Companion f75967d = new Companion(null);

    /* renamed from: a */
    public Delegate f75968a;

    /* renamed from: b */
    public Calendar f75969b;

    /* renamed from: c */
    public String f75970c;

    /* renamed from: e */
    private List<CalendarMember> f75971e = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$Delegate;", "", "onClickMemberItem", "", "calendarMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.f$b */
    public interface Delegate {
        /* renamed from: a */
        void mo109573a(CalendarMember calendarMember);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$Companion;", "", "()V", "statusContainerMarginEnd", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final List<CalendarMember> mo109585c() {
        return this.f75971e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75971e.size();
    }

    /* renamed from: a */
    public final Delegate mo109579a() {
        Delegate bVar = this.f75968a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        return bVar;
    }

    /* renamed from: b */
    public final Calendar mo109584b() {
        Calendar calendar = this.f75969b;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendar");
        }
        return calendar;
    }

    /* renamed from: d */
    public final String mo109586d() {
        String str = this.f75970c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("managerType");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo109580a(Delegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f75968a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$MemberItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindItem", "", "calendarMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "position", "", "isMemberEqualsSelf", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isPrimaryCalendarOwner", "calendarType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.f$c */
    public final class MemberItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberAdapter f75972a;

        /* renamed from: b */
        private final View f75973b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.f$c$a */
        public static final class View$OnClickListenerC30338a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ MemberItemViewHolder f75974a;

            /* renamed from: b */
            final /* synthetic */ int f75975b;

            View$OnClickListenerC30338a(MemberItemViewHolder cVar, int i) {
                this.f75974a = cVar;
                this.f75975b = i;
            }

            public final void onClick(View view) {
                this.f75974a.f75972a.mo109579a().mo109573a(this.f75974a.f75972a.mo109585c().get(this.f75975b));
            }
        }

        /* renamed from: a */
        private final boolean m112745a(CalendarMember calendarMember) {
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            String a = loginDependency.mo108269a();
            if (TextUtils.isEmpty(a) || !Intrinsics.areEqual(a, calendarMember.getUserId())) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MemberItemViewHolder(CalendarMemberAdapter fVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f75972a = fVar;
            this.f75973b = view;
        }

        /* renamed from: a */
        private final boolean m112746a(CalendarMember calendarMember, Calendar.Type type) {
            boolean z;
            if (type == Calendar.Type.PRIMARY) {
                String userId = calendarMember.getUserId();
                if (userId == null || userId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !Intrinsics.areEqual(calendarMember.getUserId(), this.f75972a.mo109584b().getUserId())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo109587a(CalendarMember calendarMember, int i) {
            Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
            if (!TextUtils.isEmpty(calendarMember.getLocalizedName())) {
                TextView textView = (TextView) this.f75973b.findViewById(R.id.memberName);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.memberName");
                textView.setText(calendarMember.getLocalizedName());
            } else {
                TextView textView2 = (TextView) this.f75973b.findViewById(R.id.memberName);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "view.memberName");
                textView2.setText(calendarMember.getName());
            }
            TextView textView3 = (TextView) this.f75973b.findViewById(R.id.memberName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "view.memberName");
            textView3.setMaxWidth((int) (((double) DeviceUtils.getScreenWidth(this.f75973b.getContext())) * 0.4d));
            ((TextView) this.f75973b.findViewById(R.id.memberName)).requestLayout();
            if (calendarMember.getMemberType() == CalendarMember.CalendarMemberType.GROUP) {
                TextView textView4 = (TextView) this.f75973b.findViewById(R.id.capacityTv);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "view.capacityTv");
                textView4.setVisibility(0);
                TextView textView5 = (TextView) this.f75973b.findViewById(R.id.capacityTv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "view.capacityTv");
                textView5.setText("(" + calendarMember.getChatMemberCount() + ")");
            } else {
                TextView textView6 = (TextView) this.f75973b.findViewById(R.id.capacityTv);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "view.capacityTv");
                textView6.setVisibility(8);
            }
            SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) this.f75973b.findViewById(R.id.memberAvatar);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "view.memberAvatar");
            ViewGroup.LayoutParams layoutParams = selectableRoundedImageView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                float f = (float) 48;
                layoutParams2.width = UIHelper.dp2px(f);
                layoutParams2.height = UIHelper.dp2px(f);
                SelectableRoundedImageView selectableRoundedImageView2 = (SelectableRoundedImageView) this.f75973b.findViewById(R.id.memberAvatar);
                Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView2, "view.memberAvatar");
                selectableRoundedImageView2.setLayoutParams(layoutParams2);
                C30022a.f74882a.imageDependency().mo108246a(this.f75973b.getContext(), calendarMember.getAvatarKey(), CalendarEditorHelper.f75910a.mo109492a(calendarMember), (SelectableRoundedImageView) this.f75973b.findViewById(R.id.memberAvatar), 48, 48);
                TextView textView7 = (TextView) this.f75973b.findViewById(R.id.memberStatus);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "view.memberStatus");
                textView7.setVisibility(0);
                Calendar.AccessRole accessRole = calendarMember.getAccessRole();
                if (accessRole != null) {
                    int i2 = C30339g.f75976a[accessRole.ordinal()];
                    if (i2 == 1) {
                        TextView textView8 = (TextView) this.f75973b.findViewById(R.id.memberStatus);
                        Intrinsics.checkExpressionValueIsNotNull(textView8, "view.memberStatus");
                        textView8.setText(C32634ae.m125182b(R.string.Calendar_Setting_Owner));
                    } else if (i2 == 2) {
                        TextView textView9 = (TextView) this.f75973b.findViewById(R.id.memberStatus);
                        Intrinsics.checkExpressionValueIsNotNull(textView9, "view.memberStatus");
                        textView9.setText(C32634ae.m125182b(R.string.Calendar_Setting_Writer));
                    } else if (i2 == 3) {
                        TextView textView10 = (TextView) this.f75973b.findViewById(R.id.memberStatus);
                        Intrinsics.checkExpressionValueIsNotNull(textView10, "view.memberStatus");
                        textView10.setText(C32634ae.m125182b(R.string.Calendar_Setting_Reader));
                    } else if (i2 == 4) {
                        TextView textView11 = (TextView) this.f75973b.findViewById(R.id.memberStatus);
                        Intrinsics.checkExpressionValueIsNotNull(textView11, "view.memberStatus");
                        textView11.setText(C32634ae.m125182b(R.string.Calendar_Setting_FreebusyReader));
                    }
                }
                if ((!Intrinsics.areEqual(this.f75972a.mo109586d(), "new_calendar_type") || i != 0) && (!Intrinsics.areEqual(this.f75972a.mo109586d(), "manager_calendar_type") || (this.f75972a.mo109584b().getSelfAccessRole() == Calendar.AccessRole.OWNER && !m112746a(calendarMember, this.f75972a.mo109584b().getType()) && !m112745a(calendarMember)))) {
                    ImageView imageView = (ImageView) this.f75973b.findViewById(R.id.memberRightArrow);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "view.memberRightArrow");
                    imageView.setVisibility(0);
                    RelativeLayout relativeLayout = (RelativeLayout) this.f75973b.findViewById(R.id.memberStatusContainer);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.memberStatusContainer");
                    ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
                    if (layoutParams3 != null) {
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.setMarginEnd(0);
                        RelativeLayout relativeLayout2 = (RelativeLayout) this.f75973b.findViewById(R.id.memberStatusContainer);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.memberStatusContainer");
                        relativeLayout2.setLayoutParams(layoutParams4);
                        this.f75973b.setOnClickListener(new View$OnClickListenerC30338a(this, i));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                } else {
                    ImageView imageView2 = (ImageView) this.f75973b.findViewById(R.id.memberRightArrow);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.memberRightArrow");
                    imageView2.setVisibility(8);
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f75973b.findViewById(R.id.memberStatusContainer);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "view.memberStatusContainer");
                    ViewGroup.LayoutParams layoutParams5 = relativeLayout3.getLayoutParams();
                    if (layoutParams5 != null) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                        layoutParams6.setMarginEnd(UIHelper.dp2px(16.0f));
                        RelativeLayout relativeLayout4 = (RelativeLayout) this.f75973b.findViewById(R.id.memberStatusContainer);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "view.memberStatusContainer");
                        relativeLayout4.setLayoutParams(layoutParams6);
                        this.f75973b.setOnClickListener(null);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
                if (i == this.f75972a.mo109585c().size() - 1) {
                    View findViewById = this.f75973b.findViewById(R.id.memberDivider);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.memberDivider");
                    findViewById.setVisibility(4);
                    return;
                }
                View findViewById2 = this.f75973b.findViewById(R.id.memberDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.memberDivider");
                findViewById2.setVisibility(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    public final void mo109581a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "<set-?>");
        this.f75969b = calendar;
    }

    /* renamed from: a */
    public final void mo109582a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75970c = str;
    }

    /* renamed from: a */
    public final void mo109583a(List<CalendarMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f75971e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        ((MemberItemViewHolder) viewHolder).mo109587a(this.f75971e.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_creator_member_holder, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ator_member_holder, null)");
        return new MemberItemViewHolder(this, inflate);
    }
}
