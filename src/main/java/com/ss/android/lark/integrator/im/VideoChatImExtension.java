package com.ss.android.lark.integrator.im;

import com.ss.android.lark.biz.im.extension.ImContext;
import com.ss.android.lark.biz.im.extension.ImExtension;
import com.ss.android.lark.biz.im.extension.ImPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ImPlugin
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/im/VideoChatImExtension;", "Lcom/ss/android/lark/biz/im/extension/ImExtension;", "()V", "onInstall", "", "context", "Lcom/ss/android/lark/biz/im/extension/ImContext;", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.o */
public final class VideoChatImExtension implements ImExtension {
    @Override // com.ss.android.lark.biz.im.extension.ImExtension
    /* renamed from: a */
    public void mo106817a(ImContext fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "context");
        fVar.mo106816a(new VideoChatMessageActionFactory());
    }
}
