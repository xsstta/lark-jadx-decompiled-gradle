package com.ss.android.lark.app.task;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u0010H\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2 \u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u001f0\u0010H\u0016JV\u0010 \u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\tH\u0016¨\u0006+"}, d2 = {"com/ss/android/lark/app/task/InitChatPreviewTask$execute$1", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "getActionDependency", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IActionDependency;", "getChatThreadOrThreadItemWidth", "", "context", "Landroid/content/Context;", "isChatThread", "", "getChattersById", "", "chatterIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "getGroupMemberManageDependency", "activity", "Landroid/app/Activity;", "chatterIdList", "getMaxChatMessageWidth", "getNtpTime", "", "interval", "getRichTextDependency", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IRichTextDependency;", "getUrlPreviewChatterList", "previewId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "openUrlToPlayVideo", "videoPreview", "Landroid/view/View;", "srcUrl", "iFrameUrl", "originUrl", "vid", "site", "coverImage", "Lcom/ss/android/lark/image/entity/Image;", "isGroup", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitChatPreviewTask$execute$1 implements ChatPreviewInit.IChatPreviewModuleDependency {

    /* renamed from: a */
    final /* synthetic */ Context f72569a;

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public ChatPreviewInit.IChatPreviewModuleDependency.IRichTextDependency mo102697a() {
        return new InitChatPreviewTask$execute$1$getRichTextDependency$1();
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: b */
    public ChatPreviewInit.IChatPreviewModuleDependency.IActionDependency mo102702b() {
        return new InitChatPreviewTask$execute$1$getActionDependency$1(this);
    }

    InitChatPreviewTask$execute$1(Context context) {
        this.f72569a = context;
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public long mo102696a(long j) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getNtpTime(j);
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public int mo102694a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getMaxMessageWidth(context, false);
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public int mo102695a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChatThreadOrThreadItemWidth(context, z);
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public void mo102698a(Activity activity, List<String> list) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(list, "chatterIdList");
        if (!list.isEmpty()) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new InitChatPreviewTask$execute$1$getGroupMemberManageDependency$1(activity, list));
        }
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public void mo102700a(String str, IGetDataCallback<ArrayList<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).syncPullUrlPreviewChattersList(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public void mo102701a(List<String> list, IGetDataCallback<List<ChattersPreviewProperty.ChatterInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "chatterIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new InitChatPreviewTask$execute$1$getChattersById$1(list, iGetDataCallback));
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency
    /* renamed from: a */
    public void mo102699a(Context context, View view, String str, String str2, String str3, String str4, int i, Image image, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "srcUrl");
        Intrinsics.checkParameterIsNotNull(str2, "iFrameUrl");
        Intrinsics.checkParameterIsNotNull(str4, "vid");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).openUrlToPlayVideo(context, view, str, str2, str3, str4, i, image, z);
    }
}
