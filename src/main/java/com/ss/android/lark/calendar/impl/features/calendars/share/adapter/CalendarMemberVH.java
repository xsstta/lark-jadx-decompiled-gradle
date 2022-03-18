package com.ss.android.lark.calendar.impl.features.calendars.share.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarMemberVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter$MemberListener;", "isOwnerOrSelf", "", "memberId", "", "ownerId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.a */
public final class CalendarMemberVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f76216a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.a$a */
    public static final class View$OnClickListenerC30453a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC30453a f76217a = new View$OnClickListenerC30453a();

        View$OnClickListenerC30453a() {
        }

        public final void onClick(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.a$d */
    public static final class View$OnClickListenerC30456d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC30456d f76222a = new View$OnClickListenerC30456d();

        View$OnClickListenerC30456d() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    public final View mo109895a() {
        return this.f76216a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.a$b */
    public static final class View$OnClickListenerC30454b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareMemberAdapter.MemberListener f76218a;

        /* renamed from: b */
        final /* synthetic */ CalendarMember f76219b;

        View$OnClickListenerC30454b(CalendarShareMemberAdapter.MemberListener bVar, CalendarMember calendarMember) {
            this.f76218a = bVar;
            this.f76219b = calendarMember;
        }

        public final void onClick(View view) {
            CalendarShareMemberAdapter.MemberListener bVar = this.f76218a;
            if (bVar != null) {
                bVar.mo109904a(this.f76219b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarMemberVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f76216a = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.a$c */
    public static final class View$OnClickListenerC30455c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberVH f76220a;

        /* renamed from: b */
        final /* synthetic */ CalendarMember f76221b;

        View$OnClickListenerC30455c(CalendarMemberVH aVar, CalendarMember calendarMember) {
            this.f76220a = aVar;
            this.f76221b = calendarMember;
        }

        public final void onClick(View view) {
            C30022a.f74882a.oldModuleDependency().mo108285a(this.f76220a.mo109895a().getContext(), this.f76221b.user_id, (String) null, (String) null);
        }
    }

    /* renamed from: a */
    private final boolean m113203a(String str, String str2) {
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String a = loginDependency.mo108269a();
        if (a == null) {
            a = "";
        }
        if (Intrinsics.areEqual(a, str) || Intrinsics.areEqual(str, str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        if (r1 != null) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109896a(com.bytedance.lark.pb.calendar.v1.CalendarMember r11, com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter.MemberListener r12) {
        /*
        // Method dump skipped, instructions count: 415
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarMemberVH.mo109896a(com.bytedance.lark.pb.calendar.v1.CalendarMember, com.ss.android.lark.calendar.impl.features.calendars.share.a.b$b):void");
    }
}
