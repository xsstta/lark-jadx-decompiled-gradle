package com.ss.android.lark.calendar.impl.features.meetingroom.base.widget;

import android.content.Context;
import android.content.DialogInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.ApprovalResourceAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.MeetingRoomApprovalDialog;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.mediapicker.utils.C44763p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJB\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/widget/ResourceApprovalDialog;", "", "()V", "showMeetingRoomApprovalDialog", "", "context", "Landroid/content/Context;", "isFromView", "", "confirmClickedAction", "Lkotlin/Function1;", "", "cancelAction", "meetingRoomApprovals", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "approvalReason", "showTimeChangeApprovalDialog", "title", "originalNeedApprovalList", "Lkotlin/Function0;", "cancelClickedAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.a */
public final class ResourceApprovalDialog {

    /* renamed from: a */
    public static final ResourceApprovalDialog f81930a = new ResourceApprovalDialog();

    private ResourceApprovalDialog() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.a$a */
    public static final class RunnableC32038a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f81931a;

        /* renamed from: b */
        final /* synthetic */ Function1 f81932b;

        /* renamed from: c */
        final /* synthetic */ Function1 f81933c;

        /* renamed from: d */
        final /* synthetic */ List f81934d;

        /* renamed from: e */
        final /* synthetic */ boolean f81935e;

        /* renamed from: f */
        final /* synthetic */ String f81936f;

        RunnableC32038a(Context context, Function1 function1, Function1 function12, List list, boolean z, String str) {
            this.f81931a = context;
            this.f81932b = function1;
            this.f81933c = function12;
            this.f81934d = list;
            this.f81935e = z;
            this.f81936f = str;
        }

        public final void run() {
            MeetingRoomApprovalDialog aVar = new MeetingRoomApprovalDialog(this.f81931a, new MeetingRoomApprovalDialog.MeetingRoomApprovalDelegate(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceApprovalDialog.RunnableC32038a.C320391 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32038a f81937a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81937a = r1;
                }

                @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.MeetingRoomApprovalDialog.MeetingRoomApprovalDelegate
                /* renamed from: a */
                public void mo116441a(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "reason");
                    this.f81937a.f81932b.invoke(str);
                }

                @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.MeetingRoomApprovalDialog.MeetingRoomApprovalDelegate
                /* renamed from: b */
                public void mo116442b(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "reason");
                    this.f81937a.f81933c.invoke(str);
                }
            });
            aVar.mo116437a(this.f81934d);
            aVar.mo116438a(this.f81935e);
            aVar.mo116435a();
            aVar.mo116436a(this.f81936f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/base/widget/ResourceApprovalDialog$showTimeChangeApprovalDialog$2", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "beforeCreate", "", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreated", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.a$b */
    public static final class C32040b implements UDBaseDialogBuilder.LifecycleCallback {

        /* renamed from: a */
        final /* synthetic */ List f81938a;

        /* renamed from: b */
        final /* synthetic */ Context f81939b;

        @Override // com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder.LifecycleCallback
        /* renamed from: a */
        public void mo89291a(UDDialog uDDialog) {
            Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        }

        @Override // com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder.LifecycleCallback
        /* renamed from: b */
        public void mo89292b(UDDialog uDDialog) {
            Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
            RecyclerView recyclerView = (RecyclerView) uDDialog.findViewById(R.id.approvalResourceRv);
            if (recyclerView != null) {
                recyclerView.setAdapter(new ApprovalResourceAdapter(this.f81938a));
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f81939b));
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }

        C32040b(List list, Context context) {
            this.f81938a = list;
            this.f81939b = context;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.a$c */
    public static final class DialogInterface$OnClickListenerC32041c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f81940a;

        DialogInterface$OnClickListenerC32041c(Function0 function0) {
            this.f81940a = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f81940a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.a$d */
    public static final class DialogInterface$OnClickListenerC32042d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f81941a;

        DialogInterface$OnClickListenerC32042d(Function0 function0) {
            this.f81941a = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f81941a.invoke();
        }
    }

    /* renamed from: a */
    public final void mo116990a(Context context, String str, List<? extends CalendarEventAttendee> list, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(list, "originalNeedApprovalList");
        Intrinsics.checkParameterIsNotNull(function0, "confirmClickedAction");
        Intrinsics.checkParameterIsNotNull(function02, "cancelClickedAction");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(str)).titleGravity(8388611)).titleLineCount(4)).contentLayoutRes(R.layout.calendar_no_approval_layout)).lifecycleCallback(new C32040b(list, context))).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC32041c(function0))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, new DialogInterface$OnClickListenerC32042d(function02))).cancelOnTouchOutside(false)).show();
    }

    /* renamed from: a */
    public final void mo116991a(Context context, boolean z, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, List<? extends CalendarEventAttendee> list, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(function1, "confirmClickedAction");
        Intrinsics.checkParameterIsNotNull(function12, "cancelAction");
        Intrinsics.checkParameterIsNotNull(list, "meetingRoomApprovals");
        Intrinsics.checkParameterIsNotNull(str, "approvalReason");
        C44763p.m177517a(new RunnableC32038a(context, function1, function12, list, z, str));
    }

    /* renamed from: a */
    public static /* synthetic */ void m121913a(ResourceApprovalDialog aVar, Context context, boolean z, Function1 function1, Function1 function12, List list, String str, int i, Object obj) {
        if ((i & 32) != 0) {
            str = "";
        }
        aVar.mo116991a(context, z, function1, function12, list, str);
    }
}
