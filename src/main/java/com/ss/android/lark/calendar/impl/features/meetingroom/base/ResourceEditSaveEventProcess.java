package com.ss.android.lark.calendar.impl.features.meetingroom.base;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ApprovalTipDialogData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceApprovalDataHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceApprovalDialog;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.mediapicker.utils.C44763p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JV\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J,\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditSaveEventProcess;", "", "()V", "approvalMeetingRoomReason", "", "judgeToShowMeetingRoomApprovalDialog", "", "context", "Landroid/content/Context;", "eventMeetingRoomList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "editStartTime", "", "editEndTime", "eventRRule", "eventOriginalTime", "originalEventData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;", "nextAction", "Lkotlin/Function0;", "showMeetingRoomApprovalDialog", "meetingRoomApprovals", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.b */
public final class ResourceEditSaveEventProcess {

    /* renamed from: a */
    public String f81954a = "";

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.b$a */
    public static final class RunnableC32051a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ResourceEditSaveEventProcess f81955a;

        /* renamed from: b */
        final /* synthetic */ Context f81956b;

        /* renamed from: c */
        final /* synthetic */ Function1 f81957c;

        /* renamed from: d */
        final /* synthetic */ Function1 f81958d;

        /* renamed from: e */
        final /* synthetic */ List f81959e;

        RunnableC32051a(ResourceEditSaveEventProcess bVar, Context context, Function1 function1, Function1 function12, List list) {
            this.f81955a = bVar;
            this.f81956b = context;
            this.f81957c = function1;
            this.f81958d = function12;
            this.f81959e = list;
        }

        public final void run() {
            ResourceApprovalDialog.f81930a.mo116991a(this.f81956b, false, this.f81957c, this.f81958d, this.f81959e, this.f81955a.f81954a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reason", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.b$b */
    public static final class C32052b extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ ResourceEditSaveEventProcess this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32052b(ResourceEditSaveEventProcess bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reason");
            this.this$0.f81954a = str;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reason", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.b$c */
    public static final class C32053c extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Function0 $nextAction;
        final /* synthetic */ ResourceEditSaveEventProcess this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32053c(ResourceEditSaveEventProcess bVar, Function0 function0) {
            super(1);
            this.this$0 = bVar;
            this.$nextAction = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reason");
            this.this$0.f81954a = str;
            this.$nextAction.invoke();
        }
    }

    /* renamed from: a */
    private final void m121926a(Context context, List<? extends CalendarEventAttendee> list, Function0<Unit> function0) {
        C44763p.m177517a(new RunnableC32051a(this, context, new C32053c(this, function0), new C32052b(this), list));
    }

    /* renamed from: a */
    public final void mo117000a(Context context, List<? extends CalendarEventAttendee> list, long j, long j2, String str, long j3, OriginalEventData bVar, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "eventMeetingRoomList");
        Intrinsics.checkParameterIsNotNull(function0, "nextAction");
        ApprovalTipDialogData a = ResourceApprovalDataHelper.f81975a.mo117028a(ResourceApprovalDataHelper.f81975a.mo117029a(list), j, j2, str, j3, bVar);
        if (a == null) {
            function0.invoke();
        } else {
            m121926a(context, a.mo117015c(), function0);
        }
    }
}
