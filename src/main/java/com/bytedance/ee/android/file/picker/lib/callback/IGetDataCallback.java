package com.bytedance.ee.android.file.picker.lib.callback;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/callback/IGetDataCallback;", "Data", "Lcom/bytedance/ee/android/file/picker/lib/callback/ICallback;", "onError", "", "err", "Lcom/bytedance/ee/android/file/picker/lib/entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.a.f */
public interface IGetDataCallback<Data> extends ICallback {
    /* renamed from: a */
    void mo15818a(Data data);
}
