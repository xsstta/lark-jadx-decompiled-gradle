package com.bytedance.ee.android.file.picker.lib.callback;

import com.bytedance.ee.android.file.picker.lib.callback.ICallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/callback/CancelableCallback;", "T", "Lcom/bytedance/ee/android/file/picker/lib/callback/ICallback;", "Lcom/bytedance/ee/android/file/picker/lib/callback/ICancelableCallback;", "callback", "(Lcom/bytedance/ee/android/file/picker/lib/callback/ICallback;)V", "getCallback", "()Lcom/bytedance/ee/android/file/picker/lib/callback/ICallback;", "setCallback", "Lcom/bytedance/ee/android/file/picker/lib/callback/ICallback;", "callbackIsCanceled", "", "cancel", "", "isCanceled", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.a.b */
public abstract class CancelableCallback<T extends ICallback> implements ICancelableCallback {

    /* renamed from: a */
    private T f12254a;

    /* renamed from: b */
    private boolean f12255b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo15815a() {
        return this.f12254a;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.callback.ICancelable
    /* renamed from: c */
    public boolean mo15817c() {
        return this.f12255b;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.callback.ICancelable
    /* renamed from: b */
    public void mo15816b() {
        this.f12255b = true;
        this.f12254a = (T) null;
    }

    public CancelableCallback(T t) {
        Intrinsics.checkParameterIsNotNull(t, "callback");
        this.f12254a = t;
    }
}
