package com.bytedance.ee.android.file.picker.lib.mvp;

import com.bytedance.ee.android.file.picker.lib.mvp.IView.IViewDelegate;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\bJ\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;", "VD", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IView$IViewDelegate;", "Lcom/bytedance/ee/android/file/picker/lib/mvp/ILifecycle;", "setViewDelegate", "", "viewDelegate", "(Lcom/bytedance/ee/android/file/picker/lib/mvp/IView$IViewDelegate;)V", "IViewDelegate", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.d.f */
public interface IView<VD extends IViewDelegate> extends ILifecycle {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/mvp/IView$IViewDelegate;", "", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.d.f$a */
    public interface IViewDelegate {
    }

    /* renamed from: a */
    void mo15864a(VD vd);
}
