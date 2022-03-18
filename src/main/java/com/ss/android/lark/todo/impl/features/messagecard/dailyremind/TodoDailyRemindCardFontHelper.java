package com.ss.android.lark.todo.impl.features.messagecard.dailyremind;

import android.view.View;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/dailyremind/TodoDailyRemindCardFontHelper;", "", "()V", "adaptFontZoomLevel", "", "itemView", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.b.b */
public final class TodoDailyRemindCardFontHelper {

    /* renamed from: a */
    public static final TodoDailyRemindCardFontHelper f140899a = new TodoDailyRemindCardFontHelper();

    private TodoDailyRemindCardFontHelper() {
    }

    /* renamed from: a */
    public final void mo193937a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.todo_daily_remind_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.todo_daily_remind_title");
        C25649b.m91856a(textView, 14);
        UDButton uDButton = (UDButton) view.findViewById(R.id.btn_enter_todo_tab);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "itemView.btn_enter_todo_tab");
        C25649b.m91856a((TextView) uDButton, 14);
    }
}
