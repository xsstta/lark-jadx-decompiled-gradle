package com.ss.android.lark.calendar.impl.features.calendars.editor.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.helper.CalendarEditorHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\u001a\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010(\u001a\u00020\u0015H\u0007J\u000e\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;", "viewData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment$Delegate;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment$Delegate;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment$Delegate;", "startAccessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "kotlin.jvm.PlatformType", "getStartAccessRole", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "setStartAccessRole", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;)V", "getViewData", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "setViewData", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;)V", "chooseEditorAccessRole", "", "chooseOwnerAccessRole", "chooseSubscriberAccessRole", "chooseVisitorAccessRole", "initListener", "initTitleBar", "initView", "initVisibility", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setData", "updateData", "calendarMember", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d */
public final class CalendarMemberFragment extends CalendarCreatorBaseFragment {

    /* renamed from: a */
    private Calendar.AccessRole f75864a;

    /* renamed from: b */
    private CalendarMember f75865b;

    /* renamed from: c */
    private final Delegate f75866c;

    /* renamed from: d */
    private HashMap f75867d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment$Delegate;", "", "onBackPressed", "", "isEdited", "", "onDeleteMember", "calendarMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109432a(CalendarMember calendarMember);

        /* renamed from: a */
        void mo109433a(boolean z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f75867d == null) {
            this.f75867d = new HashMap();
        }
        View view = (View) this.f75867d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75867d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f75867d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: k */
    public final CalendarMember mo109430k() {
        return this.f75865b;
    }

    /* renamed from: l */
    public final Delegate mo109431l() {
        return this.f75866c;
    }

    /* renamed from: b */
    public final void mo109422b() {
        mo109423d();
        m112557m();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment
    /* renamed from: c */
    public void mo109409c() {
        boolean z;
        Delegate aVar = this.f75866c;
        if (this.f75865b.getAccessRole() != this.f75864a) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo109433a(z);
    }

    /* renamed from: m */
    private final void m112557m() {
        if (this.f75865b.getMemberType() == CalendarMember.CalendarMemberType.GROUP) {
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.ownerGroup);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "ownerGroup");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.ownerGroup);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "ownerGroup");
        relativeLayout2.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo109423d() {
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setTitle(R.string.Calendar_Setting_SharingMembers);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.editTitleBar)).setLeftClickListener(new View$OnClickListenerC30295g(this));
    }

    /* renamed from: f */
    public final void mo109425f() {
        ((RelativeLayout) mo109250a(R.id.ownerGroup)).setOnClickListener(new View$OnClickListenerC30290b(this));
        ((RelativeLayout) mo109250a(R.id.editorGroup)).setOnClickListener(new View$OnClickListenerC30291c(this));
        ((RelativeLayout) mo109250a(R.id.subscriberGroup)).setOnClickListener(new View$OnClickListenerC30292d(this));
        ((RelativeLayout) mo109250a(R.id.visitorGroup)).setOnClickListener(new View$OnClickListenerC30293e(this));
        ((TextView) mo109250a(R.id.deleteMember)).setOnClickListener(new View$OnClickListenerC30294f(this));
    }

    /* renamed from: g */
    public final void mo109426g() {
        ImageView imageView = (ImageView) mo109250a(R.id.ownerImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ownerImage");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo109250a(R.id.editorImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "editorImage");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.subscriberImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "subscriberImage");
        imageView3.setVisibility(8);
        ImageView imageView4 = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "privateImage");
        imageView4.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo109427h() {
        ImageView imageView = (ImageView) mo109250a(R.id.ownerImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ownerImage");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo109250a(R.id.editorImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "editorImage");
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) mo109250a(R.id.subscriberImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "subscriberImage");
        imageView3.setVisibility(8);
        ImageView imageView4 = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "privateImage");
        imageView4.setVisibility(8);
    }

    /* renamed from: i */
    public final void mo109428i() {
        ImageView imageView = (ImageView) mo109250a(R.id.ownerImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ownerImage");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo109250a(R.id.editorImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "editorImage");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.subscriberImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "subscriberImage");
        imageView3.setVisibility(0);
        ImageView imageView4 = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "privateImage");
        imageView4.setVisibility(8);
    }

    /* renamed from: j */
    public final void mo109429j() {
        ImageView imageView = (ImageView) mo109250a(R.id.ownerImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ownerImage");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo109250a(R.id.editorImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "editorImage");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.subscriberImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "subscriberImage");
        imageView3.setVisibility(8);
        ImageView imageView4 = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "privateImage");
        imageView4.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo109424e() {
        C30022a.f74882a.imageDependency().mo108246a(getContext(), this.f75865b.getAvatarKey(), CalendarEditorHelper.f75910a.mo109492a(this.f75865b), (SelectableRoundedImageView) mo109250a(R.id.memberAvatar), 48, 48);
        if (!TextUtils.isEmpty(this.f75865b.getLocalizedName())) {
            TextView textView = (TextView) mo109250a(R.id.memberName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "memberName");
            textView.setText(this.f75865b.getLocalizedName());
        } else {
            TextView textView2 = (TextView) mo109250a(R.id.memberName);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "memberName");
            textView2.setText(this.f75865b.getName());
        }
        if (this.f75865b.getMemberType() == CalendarMember.CalendarMemberType.GROUP) {
            TextView textView3 = (TextView) mo109250a(R.id.capacityTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "capacityTv");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) mo109250a(R.id.capacityTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "capacityTv");
            textView4.setText("(" + this.f75865b.getChatMemberCount() + ")");
        } else {
            TextView textView5 = (TextView) mo109250a(R.id.capacityTv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "capacityTv");
            textView5.setVisibility(8);
        }
        Calendar.AccessRole accessRole = this.f75865b.getAccessRole();
        if (accessRole != null) {
            int i = C30296e.f75874a[accessRole.ordinal()];
            if (i == 1) {
                mo109426g();
            } else if (i == 2) {
                mo109427h();
            } else if (i == 3) {
                mo109428i();
            } else if (i == 4) {
                mo109429j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$g */
    public static final class View$OnClickListenerC30295g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f75873a;

        View$OnClickListenerC30295g(CalendarMemberFragment dVar) {
            this.f75873a = dVar;
        }

        public final void onClick(View view) {
            this.f75873a.mo109409c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$f */
    public static final class View$OnClickListenerC30294f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f75872a;

        View$OnClickListenerC30294f(CalendarMemberFragment dVar) {
            this.f75872a = dVar;
        }

        public final void onClick(View view) {
            this.f75872a.mo109430k().setStatus(Calendar.Status.REMOVED);
            this.f75872a.mo109431l().mo109432a(this.f75872a.mo109430k());
        }
    }

    /* renamed from: a */
    public final void mo109421a(CalendarMember calendarMember) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
        this.f75865b = calendarMember;
        this.f75864a = calendarMember.getAccessRole();
        m112557m();
        mo109424e();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$b */
    public static final class View$OnClickListenerC30290b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f75868a;

        View$OnClickListenerC30290b(CalendarMemberFragment dVar) {
            this.f75868a = dVar;
        }

        public final void onClick(View view) {
            CalendarMember.CalendarMemberType memberType = this.f75868a.mo109430k().getMemberType();
            Intrinsics.checkExpressionValueIsNotNull(memberType, "viewData.memberType");
            GeneralHitPoint.m124191a(memberType, "owner");
            this.f75868a.mo109426g();
            this.f75868a.mo109430k().setAccessRole(Calendar.AccessRole.OWNER);
            this.f75868a.mo109409c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$c */
    public static final class View$OnClickListenerC30291c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f75869a;

        View$OnClickListenerC30291c(CalendarMemberFragment dVar) {
            this.f75869a = dVar;
        }

        public final void onClick(View view) {
            CalendarMember.CalendarMemberType memberType = this.f75869a.mo109430k().getMemberType();
            Intrinsics.checkExpressionValueIsNotNull(memberType, "viewData.memberType");
            GeneralHitPoint.m124191a(memberType, "editor");
            this.f75869a.mo109427h();
            this.f75869a.mo109430k().setAccessRole(Calendar.AccessRole.WRITER);
            this.f75869a.mo109409c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$d */
    public static final class View$OnClickListenerC30292d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f75870a;

        View$OnClickListenerC30292d(CalendarMemberFragment dVar) {
            this.f75870a = dVar;
        }

        public final void onClick(View view) {
            CalendarMember.CalendarMemberType memberType = this.f75870a.mo109430k().getMemberType();
            Intrinsics.checkExpressionValueIsNotNull(memberType, "viewData.memberType");
            GeneralHitPoint.m124191a(memberType, "reader");
            this.f75870a.mo109428i();
            this.f75870a.mo109430k().setAccessRole(Calendar.AccessRole.READER);
            this.f75870a.mo109409c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.d$e */
    public static final class View$OnClickListenerC30293e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f75871a;

        View$OnClickListenerC30293e(CalendarMemberFragment dVar) {
            this.f75871a = dVar;
        }

        public final void onClick(View view) {
            CalendarMember.CalendarMemberType memberType = this.f75871a.mo109430k().getMemberType();
            Intrinsics.checkExpressionValueIsNotNull(memberType, "viewData.memberType");
            GeneralHitPoint.m124191a(memberType, "fb_reader");
            this.f75871a.mo109429j();
            this.f75871a.mo109430k().setAccessRole(Calendar.AccessRole.FREE_BUSY_READER);
            this.f75871a.mo109409c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        mo109422b();
        mo109425f();
        mo109424e();
    }

    public CalendarMemberFragment(CalendarMember calendarMember, Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "viewData");
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f75865b = calendarMember;
        this.f75866c = aVar;
        this.f75864a = calendarMember.getAccessRole();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_edit_member_fragment, (ViewGroup) null);
    }
}
