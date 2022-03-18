package com.ss.android.lark.todo.impl.features.detail.helper.time;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/helper/time/ReminderHelper;", "", "()V", "isNeedRemoveRemind", "", "reminderMinutes", "", "dueTimeMillis", "isAllDay", "showRemoveRemindDialog", "", "context", "Landroid/content/Context;", "listener", "Landroid/content/DialogInterface$OnClickListener;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.b.b.b */
public final class ReminderHelper {

    /* renamed from: a */
    public static final ReminderHelper f139700a = new ReminderHelper();

    private ReminderHelper() {
    }

    /* renamed from: a */
    public final void mo192310a(Context context, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        if (context != null) {
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(ResUtil.f139261a.mo191781c(R.string.Todo_Settings_SetTimePassedDialogueTitle))).message(ResUtil.f139261a.mo191781c(R.string.Todo_Settings_SetTimePassedDialogueDesc))).addActionButton(R.id.ud_dialog_btn_primary, ResUtil.f139261a.mo191781c(R.string.Todo_Settings_SetTimePassedDialogueButton), onClickListener)).show();
        }
    }

    /* renamed from: a */
    public final boolean mo192311a(long j, long j2, boolean z) {
        long j3;
        boolean z2;
        if (j2 == 0) {
            return false;
        }
        if (z) {
            j3 = new GregorianCalendar(TimeZone.getTimeZone("UTC")).getTimeInMillis();
        } else {
            j3 = System.currentTimeMillis();
        }
        if (j3 + (((long) 60) * j * ((long) 1000)) > j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j == -1 || !z2) {
            return false;
        }
        return true;
    }
}
