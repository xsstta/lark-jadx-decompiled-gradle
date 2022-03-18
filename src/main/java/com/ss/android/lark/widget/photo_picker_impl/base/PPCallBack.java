package com.ss.android.lark.widget.photo_picker_impl.base;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH$J\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/base/PPCallBack;", "Data", "", "()V", "mIsCancel", "", "cancel", "", "doError", "throwable", "", "doSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "onError", "onSuccess", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.a.g */
public abstract class PPCallBack<Data> {

    /* renamed from: a */
    private boolean f145726a;

    /* renamed from: a */
    public final void mo199566a() {
        this.f145726a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo199569b(Data data);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo199570b(Throwable th);

    /* renamed from: a */
    public final void mo199567a(Data data) {
        if (!this.f145726a) {
            mo199569b((Object) data);
        }
    }

    /* renamed from: a */
    public final void mo199568a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (!this.f145726a) {
            mo199570b(th);
        }
    }
}
