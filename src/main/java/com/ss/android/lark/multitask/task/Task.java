package com.ss.android.lark.multitask.task;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;

public interface Task extends LifecycleOwner {

    public interface IconFactory extends Parcelable {
        void createDrawableForTask(Context context, C48376q qVar, ImageView imageView);
    }

    /* renamed from: a */
    IconFactory mo23788a();

    /* renamed from: a */
    void mo169192a(long j);

    /* renamed from: a */
    void mo23789a(Bundle bundle);

    /* renamed from: b */
    CharSequence mo23790b();

    /* renamed from: b */
    void mo169193b(Bundle bundle);

    /* renamed from: c */
    String mo23791c();

    /* renamed from: d */
    String mo23792d();

    /* renamed from: e */
    long mo169194e();

    /* renamed from: com.ss.android.lark.multitask.task.Task$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$c(Task task) {
            return "undefined";
        }

        public static String $default$d(Task task) {
            return task.mo23790b().toString();
        }
    }
}
