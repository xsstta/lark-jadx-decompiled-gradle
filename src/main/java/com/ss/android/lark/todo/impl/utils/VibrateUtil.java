package com.ss.android.lark.todo.impl.utils;

import android.os.Vibrator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/utils/VibrateUtil;", "", "()V", "vibrate", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.g */
public final class VibrateUtil {

    /* renamed from: a */
    public static final VibrateUtil f139263a = new VibrateUtil();

    private VibrateUtil() {
    }

    /* renamed from: a */
    public final void mo191785a() {
        try {
            Object systemService = TodoDependencyHolder.f139242a.mo191730a().settingDependency().mo145427a().getSystemService("vibrator");
            if (!(systemService instanceof Vibrator)) {
                systemService = null;
            }
            Vibrator vibrator = (Vibrator) systemService;
            if (vibrator != null) {
                vibrator.vibrate(80);
            }
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
