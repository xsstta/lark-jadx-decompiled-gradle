package com.ss.android.lark.filedetail.impl.open.diver;

import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/filedetail/impl/open/diver/PreviewTask$buildOpenEntity$1", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BinderOpenLifecycle$Stub;", "onClose", "", "onOpenFinish", "code", "", "message", "", "onVisibleChange", "p0", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewTask$buildOpenEntity$1 extends BinderOpenLifecycle.Stub {
    final /* synthetic */ PreviewTask this$0;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity.AbstractC5156a
    public void onOpenFinish(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity.AbstractC5156a
    public void onClose() {
        if (this.this$0.mo140092c()) {
            this.this$0.f98369g = true;
        } else {
            this.this$0.mo140093d();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PreviewTask$buildOpenEntity$1(PreviewTask fVar) {
        this.this$0 = fVar;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity.AbstractC5156a
    public void onVisibleChange(boolean z) {
        IPreviewLifecycleCallback a = this.this$0.mo140085a();
        if (a != null) {
            a.mo140084a(z);
        }
    }
}
