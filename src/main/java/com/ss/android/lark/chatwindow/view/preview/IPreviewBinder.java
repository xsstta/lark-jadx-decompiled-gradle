package com.ss.android.lark.chatwindow.view.preview;

import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.base.view.vo.message.preview.BasePreviewVO;
import com.ss.android.lark.chatwindow.view.preview.IPreviewBinder.PreviewViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0001\u0014J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H&J\u0017\u0010\u0011\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder;", "T", "Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "S", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;", "", "bindPreviewView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "provider", "(Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;)V", "createPreviewView", "parent", "Landroid/view/ViewGroup;", "(Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;Landroid/view/ViewGroup;)Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "getPreviewType", "", "showPreview", "", "(Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;)Z", "PreviewViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.b.c */
public interface IPreviewBinder<T extends PreviewViewHolder, S extends BasePreviewVO> {
    /* renamed from: a */
    int mo129762a();

    /* renamed from: a */
    T mo129764a(S s, ViewGroup viewGroup);

    /* renamed from: a */
    void mo129765a(S s, T t);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/preview/IPreviewBinder$PreviewViewHolder;", "", "containerView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getRootView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.b.c$a */
    public static class PreviewViewHolder {

        /* renamed from: a */
        private final ViewGroup f91061a;

        /* renamed from: b */
        public final ViewGroup mo129770b() {
            return this.f91061a;
        }

        public PreviewViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "containerView");
            this.f91061a = viewGroup;
        }
    }
}
