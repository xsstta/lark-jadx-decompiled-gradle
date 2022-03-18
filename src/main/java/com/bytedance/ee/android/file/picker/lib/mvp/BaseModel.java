package com.bytedance.ee.android.file.picker.lib.mvp;

import com.bytedance.ee.android.file.picker.lib.p235a.C4038a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\tH\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/mvp/BaseModel;", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;", "()V", "<set-?>", "Lcom/bytedance/ee/android/file/picker/lib/callback/CallbackManager;", "callbackManager", "getCallbackManager", "()Lcom/bytedance/ee/android/file/picker/lib/callback/CallbackManager;", "create", "", "destroy", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.d.a */
public class BaseModel implements IModel {

    /* renamed from: a */
    private C4038a f12279a;

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    public void j_() {
        this.f12279a = new C4038a();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    /* renamed from: c */
    public void mo15856c() {
        C4038a aVar = this.f12279a;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        aVar.mo15811a();
        this.f12279a = null;
    }
}
