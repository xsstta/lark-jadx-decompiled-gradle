package com.ss.android.lark.app.task;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.preview.Parameters;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016J$\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/app/task/InitChatPreviewTask$execute$1$getActionDependency$1", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IActionDependency;", "openUrl", "", "", "putReviewAction", "parameters", "Lcom/ss/android/lark/chat/entity/preview/Parameters;", "actionId", "sendHitPoint", "url", "priViewId", "clickParam", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitChatPreviewTask$execute$1$getActionDependency$1 implements ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency {

    /* renamed from: a */
    final /* synthetic */ InitChatPreviewTask$execute$1 f72570a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    InitChatPreviewTask$execute$1$getActionDependency$1(InitChatPreviewTask$execute$1 initChatPreviewTask$execute$1) {
        this.f72570a = initChatPreviewTask$execute$1;
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency
    /* renamed from: a */
    public void mo102704a(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(this.f72570a.f72569a, str);
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency
    /* renamed from: a */
    public void mo102703a(Parameters parameters, String str) {
        Intrinsics.checkParameterIsNotNull(str, "actionId");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).putReviewAction(parameters, str);
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency
    /* renamed from: a */
    public void mo102705a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "clickParam");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).sendUrlClick(str, str2, str3);
    }
}
