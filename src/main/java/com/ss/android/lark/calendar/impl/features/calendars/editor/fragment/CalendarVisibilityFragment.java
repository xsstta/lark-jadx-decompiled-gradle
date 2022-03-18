package com.ss.android.lark.calendar.impl.features.calendars.editor.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0006\u0010(\u001a\u00020\u0012J \u0010)\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;", "()V", "calendarServerId", "", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment$Delegate;", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment$Delegate;", "setDelegate", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment$Delegate;)V", "mDefaultAccessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "mIsPublic", "", "originDefaultAccessRole", "originIsPublic", "chooseVisibilityPrivate", "", "chooseVisibilityPublic", "chooseVisibilityShowState", "initData", "isPublic", "accessRole", "calendarId", "initListener", "initTitleBar", "initView", "onBackPressed", "onChoosePublic", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setData", "updateData", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.f */
public final class CalendarVisibilityFragment extends CalendarCreatorBaseFragment {

    /* renamed from: a */
    public String f75875a = "";

    /* renamed from: b */
    public boolean f75876b;

    /* renamed from: c */
    public Calendar.AccessRole f75877c;

    /* renamed from: d */
    private boolean f75878d;

    /* renamed from: e */
    private Calendar.AccessRole f75879e;

    /* renamed from: f */
    private Delegate f75880f;

    /* renamed from: g */
    private HashMap f75881g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment$Delegate;", "", "onBackPressed", "", "isEdited", "", "isPublic", "accessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.f$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109450a(boolean z, boolean z2, Calendar.AccessRole accessRole);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f75881g == null) {
            this.f75881g = new HashMap();
        }
        View view = (View) this.f75881g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75881g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f75881g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: b */
    public final void mo109442b() {
        mo109444d();
    }

    /* renamed from: f */
    public final void mo109446f() {
        this.f75876b = true;
        this.f75877c = Calendar.AccessRole.READER;
        m112574j();
        mo109409c();
    }

    public CalendarVisibilityFragment() {
        Calendar.AccessRole accessRole = Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
        this.f75879e = accessRole;
        this.f75876b = this.f75878d;
        this.f75877c = accessRole;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment
    /* renamed from: c */
    public void mo109409c() {
        boolean z;
        Delegate aVar = this.f75880f;
        if (aVar != null) {
            boolean z2 = this.f75876b;
            if (z2 == this.f75878d && this.f75877c == this.f75879e) {
                z = false;
            } else {
                z = true;
            }
            aVar.mo109450a(z, z2, this.f75877c);
        }
    }

    /* renamed from: j */
    private final void m112574j() {
        ImageView imageView = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "privateImage");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo109250a(R.id.showStateIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "showStateIv");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.publicIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "publicIv");
        imageView3.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo109444d() {
        ((CommonTitleBar) mo109250a(R.id.visibilityTitleBar)).setTitle(R.string.Calendar_Setting_Permissions);
        ((CommonTitleBar) mo109250a(R.id.visibilityTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.visibilityTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.visibilityTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) mo109250a(R.id.visibilityTitleBar)).setLeftClickListener(new View$OnClickListenerC30301e(this));
    }

    /* renamed from: e */
    public final void mo109445e() {
        ((RelativeLayout) mo109250a(R.id.privateGroup)).setOnClickListener(new View$OnClickListenerC30297b(this));
        ((RelativeLayout) mo109250a(R.id.showStateGroup)).setOnClickListener(new View$OnClickListenerC30298c(this));
        ((RelativeLayout) mo109250a(R.id.publicGroup)).setOnClickListener(new View$OnClickListenerC30299d(this));
    }

    /* renamed from: g */
    public final void mo109447g() {
        if (this.f75878d && this.f75879e == Calendar.AccessRole.FREE_BUSY_READER) {
            mo109449i();
        } else if (!this.f75878d || !(this.f75879e == Calendar.AccessRole.READER || this.f75879e == Calendar.AccessRole.WRITER || this.f75879e == Calendar.AccessRole.OWNER)) {
            mo109448h();
        } else {
            m112574j();
        }
    }

    /* renamed from: h */
    public final void mo109448h() {
        ImageView imageView = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "privateImage");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo109250a(R.id.showStateIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "showStateIv");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) mo109250a(R.id.publicIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "publicIv");
        imageView3.setVisibility(8);
    }

    /* renamed from: i */
    public final void mo109449i() {
        ImageView imageView = (ImageView) mo109250a(R.id.privateImage);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "privateImage");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo109250a(R.id.showStateIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "showStateIv");
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) mo109250a(R.id.publicIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "publicIv");
        imageView3.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo109440a(Delegate aVar) {
        this.f75880f = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.f$e */
    public static final class View$OnClickListenerC30301e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarVisibilityFragment f75886a;

        View$OnClickListenerC30301e(CalendarVisibilityFragment fVar) {
            this.f75886a = fVar;
        }

        public final void onClick(View view) {
            this.f75886a.mo109409c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.f$b */
    public static final class View$OnClickListenerC30297b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarVisibilityFragment f75882a;

        View$OnClickListenerC30297b(CalendarVisibilityFragment fVar) {
            this.f75882a = fVar;
        }

        public final void onClick(View view) {
            GeneralHitPoint.m124266p("private");
            this.f75882a.f75876b = false;
            this.f75882a.f75877c = Calendar.AccessRole.FREE_BUSY_READER;
            this.f75882a.mo109448h();
            this.f75882a.mo109409c();
            CalendarSettingHitPoint.m124369a(this.f75882a.f75875a, "edit_public_scale");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.f$c */
    public static final class View$OnClickListenerC30298c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarVisibilityFragment f75883a;

        View$OnClickListenerC30298c(CalendarVisibilityFragment fVar) {
            this.f75883a = fVar;
        }

        public final void onClick(View view) {
            GeneralHitPoint.m124266p("free_busy");
            this.f75883a.f75876b = true;
            this.f75883a.f75877c = Calendar.AccessRole.FREE_BUSY_READER;
            this.f75883a.mo109449i();
            this.f75883a.mo109409c();
            CalendarSettingHitPoint.m124369a(this.f75883a.f75875a, "edit_public_scale");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.f$d */
    public static final class View$OnClickListenerC30299d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarVisibilityFragment f75884a;

        View$OnClickListenerC30299d(CalendarVisibilityFragment fVar) {
            this.f75884a = fVar;
        }

        public final void onClick(View view) {
            GeneralHitPoint.m124266p("public");
            Context context = this.f75884a.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Setting_SetCalendarToPublicTitle)).message(R.string.Calendar_Setting_MobileSetCalendarToPublicDetail)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarVisibilityFragment.View$OnClickListenerC30299d.DialogInterface$OnClickListenerC303001 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC30299d f75885a;

                {
                    this.f75885a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f75885a.f75884a.mo109446f();
                }
            })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).titleLineCount(2)).messageTextColor(R.color.text_caption)).messageTextSize(14)).messageGravity(3)).show();
            CalendarSettingHitPoint.m124369a(this.f75884a.f75875a, "edit_public_scale");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        mo109442b();
        mo109445e();
        mo109447g();
    }

    /* renamed from: b */
    public final void mo109443b(boolean z, Calendar.AccessRole accessRole, String str) {
        Intrinsics.checkParameterIsNotNull(accessRole, "accessRole");
        mo109441a(z, accessRole, str);
        mo109447g();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_creator_range_fragment, (ViewGroup) null);
    }

    /* renamed from: a */
    public final void mo109441a(boolean z, Calendar.AccessRole accessRole, String str) {
        Intrinsics.checkParameterIsNotNull(accessRole, "accessRole");
        this.f75878d = z;
        this.f75879e = accessRole;
        this.f75876b = z;
        this.f75877c = accessRole;
        if (str == null) {
            str = "";
        }
        this.f75875a = str;
    }
}
