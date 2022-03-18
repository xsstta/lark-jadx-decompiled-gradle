package com.ss.android.photoeditor.ve.utils;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/photoeditor/ve/utils/AbsWeakListener;", "WeakObject", "", "weakObject", "(Ljava/lang/Object;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "getWeakReference", "()Ljava/lang/ref/WeakReference;", "setWeakReference", "(Ljava/lang/ref/WeakReference;)V", "getWeakObject", "()Ljava/lang/Object;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.a */
public abstract class AbsWeakListener<WeakObject> {

    /* renamed from: a */
    private WeakReference<WeakObject> f149195a;

    /* renamed from: a */
    public final WeakObject mo203978a() {
        WeakReference<WeakObject> weakReference = this.f149195a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public AbsWeakListener(WeakObject weakobject) {
        this.f149195a = new WeakReference<>(weakobject);
    }
}
