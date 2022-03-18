package com.ss.android.lark.calendar.impl.features.meetingroom.base.widget;

import android.content.Context;
import android.content.DialogInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.MeetingRoomText;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.MtRoomStrategyAdapter;
import com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction;
import com.ss.android.lark.mediapicker.utils.C44763p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/widget/ResourceStrategyDialog;", "", "()V", "showUnusableMtRoomDialog", "", "context", "Landroid/content/Context;", "unusableMtRoomList", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomText;", "confirmAction", "Lkotlin/Function0;", "cancelAction", "dialogDismissAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.b */
public final class ResourceStrategyDialog {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/base/widget/ResourceStrategyDialog$showUnusableMtRoomDialog$cancelClickListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebounceAction;", "doAction", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.b$b */
    public static final class C32048b extends DebounceAction {

        /* renamed from: a */
        final /* synthetic */ Function0 f81951a;

        @Override // com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction
        /* renamed from: a */
        public void mo115941a() {
            this.f81951a.invoke();
        }

        C32048b(Function0 function0) {
            this.f81951a = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/base/widget/ResourceStrategyDialog$showUnusableMtRoomDialog$confirmClickListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebounceAction;", "doAction", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.b$c */
    public static final class C32049c extends DebounceAction {

        /* renamed from: a */
        final /* synthetic */ Function0 f81952a;

        @Override // com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction
        /* renamed from: a */
        public void mo115941a() {
            this.f81952a.invoke();
        }

        C32049c(Function0 function0) {
            this.f81952a = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/base/widget/ResourceStrategyDialog$showUnusableMtRoomDialog$dismissListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebounceAction;", "doAction", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.b$d */
    public static final class C32050d extends DebounceAction {

        /* renamed from: a */
        final /* synthetic */ Function0 f81953a;

        @Override // com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction
        /* renamed from: a */
        public void mo115941a() {
            this.f81953a.invoke();
        }

        C32050d(Function0 function0) {
            this.f81953a = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a.b$a */
    public static final class RunnableC32043a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f81942a;

        /* renamed from: b */
        final /* synthetic */ List f81943b;

        /* renamed from: c */
        final /* synthetic */ C32049c f81944c;

        /* renamed from: d */
        final /* synthetic */ C32048b f81945d;

        /* renamed from: e */
        final /* synthetic */ C32050d f81946e;

        RunnableC32043a(Context context, List list, C32049c cVar, C32048b bVar, C32050d dVar) {
            this.f81942a = context;
            this.f81943b = list;
            this.f81944c = cVar;
            this.f81945d = bVar;
            this.f81946e = dVar;
        }

        public final void run() {
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f81942a).title(R.string.Calendar_Edit_ChangeReserveTimeTitle)).contentLayoutRes(R.layout.mt_strategy_dialog_content)).lifecycleCallback(new UDBaseDialogBuilder.LifecycleCallback(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceStrategyDialog.RunnableC32043a.C320441 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32043a f81947a;

                @Override // com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder.LifecycleCallback
                /* renamed from: a */
                public void mo89291a(UDDialog uDDialog) {
                    Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81947a = r1;
                }

                @Override // com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder.LifecycleCallback
                /* renamed from: b */
                public void mo89292b(UDDialog uDDialog) {
                    Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
                    RecyclerView recyclerView = (RecyclerView) uDDialog.findViewById(R.id.mtRoomRv);
                    if (recyclerView != null) {
                        recyclerView.setAdapter(new MtRoomStrategyAdapter(this.f81947a.f81943b));
                        recyclerView.setLayoutManager(new LinearLayoutManager(this.f81947a.f81942a));
                        RecyclerView.Adapter adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
            })).titleBold(true)).titleGravity(17)).titlePadding(20, 20, 20, 8)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Change, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceStrategyDialog.RunnableC32043a.DialogInterface$OnClickListenerC320452 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32043a f81948a;

                {
                    this.f81948a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f81948a.f81944c.mo120295b();
                }
            })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceStrategyDialog.RunnableC32043a.DialogInterface$OnClickListenerC320463 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32043a f81949a;

                {
                    this.f81949a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f81949a.f81945d.mo120295b();
                }
            })).onDismissListener(new DialogInterface.OnDismissListener(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceStrategyDialog.RunnableC32043a.DialogInterface$OnDismissListenerC320474 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32043a f81950a;

                {
                    this.f81950a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f81950a.f81946e.mo120295b();
                }
            })).maxHeight(0.8f)).show();
        }
    }

    /* renamed from: a */
    public final void mo116995a(Context context, List<MeetingRoomText> list, Function0<? extends Object> function0, Function0<? extends Object> function02, Function0<? extends Object> function03) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "unusableMtRoomList");
        Intrinsics.checkParameterIsNotNull(function0, "confirmAction");
        Intrinsics.checkParameterIsNotNull(function02, "cancelAction");
        Intrinsics.checkParameterIsNotNull(function03, "dialogDismissAction");
        C44763p.m177517a(new RunnableC32043a(context, list, new C32049c(function0), new C32048b(function02), new C32050d(function03)));
    }
}
