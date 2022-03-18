package com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/OwnerCalendarUnsubscribeDialog;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.b */
public final class OwnerCalendarUnsubscribeDialog {

    /* renamed from: a */
    public static final Companion f76772a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/OwnerCalendarUnsubscribeDialog$Companion;", "", "()V", "showDialog", "", "context", "Landroid/content/Context;", "onPositiveClickListener", "Landroid/content/DialogInterface$OnClickListener;", "onNegativeClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo110613a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_SubscribeCalendar_OwnerUnsubscribePopUpWindowTitle)).message(R.string.Calendar_Setting_OwnerUnsubscribePopUpWindow)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, onClickListener)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, onClickListener2)).messageTextColor(R.color.text_caption)).messageTextSize(14)).show();
        }

        /* renamed from: a */
        public static /* synthetic */ void m113936a(Companion aVar, Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, Object obj) {
            if ((i & 4) != 0) {
                onClickListener2 = null;
            }
            aVar.mo110613a(context, onClickListener, onClickListener2);
        }
    }
}
