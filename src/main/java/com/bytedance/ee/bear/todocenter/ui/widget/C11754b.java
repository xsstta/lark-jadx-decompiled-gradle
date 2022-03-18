package com.bytedance.ee.bear.todocenter.ui.widget;

import com.bytedance.ee.bear.todocenter.ui.entity.TodoUIEntity;
import com.larksuite.suite.R;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.b */
public class C11754b {

    /* renamed from: a */
    private static final long f31598a = TimeUnit.MILLISECONDS.convert(5, TimeUnit.DAYS);

    /* renamed from: a */
    public static String m48723a(TodoUIEntity todoUIEntity) {
        StringBuilder sb = new StringBuilder(todoUIEntity.todo_id);
        long[] jArr = todoUIEntity.reminder_time;
        if (jArr != null && jArr.length > 0) {
            sb = new StringBuilder();
            for (long j : jArr) {
                sb.append(m48722a(todoUIEntity.is_done, j * 1000));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m48722a(boolean z, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            return R.color.space_kit_n400;
        }
        long j2 = j - currentTimeMillis;
        long j3 = f31598a;
        if (j2 >= j3) {
            return R.color.space_kit_b500;
        }
        if (currentTimeMillis >= j || j2 >= j3) {
            return R.color.space_kit_r500;
        }
        return R.color.space_kit_o500;
    }
}
