package com.ss.android.lark.app.task;

import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/app/task/InitChatPreviewTask$execute$1$getRichTextDependency$1", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IRichTextDependency;", "parseRichTextFromPb", "Lcom/ss/android/lark/widget/richtext/RichText;", "pbRichText", "Lcom/bytedance/lark/pb/basic/v1/RichText;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitChatPreviewTask$execute$1$getRichTextDependency$1 implements ChatPreviewInit.IChatPreviewModuleDependency.IRichTextDependency {
    InitChatPreviewTask$execute$1$getRichTextDependency$1() {
    }

    @Override // com.ss.android.lark.chat.preview.ChatPreviewInit.IChatPreviewModuleDependency.IRichTextDependency
    /* renamed from: a */
    public RichText mo102712a(com.bytedance.lark.pb.basic.v1.RichText richText) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getRichText(richText);
    }
}
