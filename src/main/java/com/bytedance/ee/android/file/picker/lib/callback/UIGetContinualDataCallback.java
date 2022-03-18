package com.bytedance.ee.android.file.picker.lib.callback;

import com.bytedance.ee.android.file.picker.lib.utils.UIExecutor;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/callback/UIGetContinualDataCallback;", "Data", "Lcom/bytedance/ee/android/file/picker/lib/callback/CancelableCallback;", "Lcom/bytedance/ee/android/file/picker/lib/callback/IGetDataCallback;", "callback", "(Lcom/bytedance/ee/android/file/picker/lib/callback/IGetDataCallback;)V", "onError", "", "err", "Lcom/bytedance/ee/android/file/picker/lib/entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.a.g */
public final class UIGetContinualDataCallback<Data> extends CancelableCallback<IGetDataCallback<Data>> implements IGetDataCallback<Data> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Data", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.a.g$a */
    static final class RunnableC4040a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UIGetContinualDataCallback f12256a;

        /* renamed from: b */
        final /* synthetic */ Object f12257b;

        RunnableC4040a(UIGetContinualDataCallback gVar, Object obj) {
            this.f12256a = gVar;
            this.f12257b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.bytedance.ee.android.file.picker.lib.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            IGetDataCallback fVar = (IGetDataCallback) this.f12256a.mo15815a();
            if (fVar != 0) {
                fVar.mo15818a(this.f12257b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UIGetContinualDataCallback(IGetDataCallback<Data> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(fVar, "callback");
    }

    @Override // com.bytedance.ee.android.file.picker.lib.callback.IGetDataCallback
    /* renamed from: a */
    public void mo15818a(Data data) {
        UIExecutor.f12485a.mo16120a(new RunnableC4040a(this, data));
    }
}
