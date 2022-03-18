package com.ss.android.lark.chatwindow.view.binder;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.chat.base.view.AbstractC32925a;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chatwindow.view.preview.NetPreviewBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/binder/NetPreviewBinderCreator;", "", "holder", "Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;", "provider", "Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "mChatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "(Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;Landroid/view/View$OnLongClickListener;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;)V", "getHolder", "()Lcom/ss/android/lark/chat/base/view/IUrlPreviewViewHolder;", "getMChatContext", "()Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "getOnLongClickListener", "()Landroid/view/View$OnLongClickListener;", "getProvider", "()Lcom/ss/android/lark/chat/base/view/IUrlPreviewModelProvider;", "create", "Lcom/ss/android/lark/chatwindow/view/preview/NetPreviewBinder;", "context", "Landroid/content/Context;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.a.d */
public final class NetPreviewBinderCreator {

    /* renamed from: a */
    private final AbstractC32939b f91047a;

    /* renamed from: b */
    private final AbstractC32925a f91048b;

    /* renamed from: c */
    private final View.OnLongClickListener f91049c;

    /* renamed from: d */
    private final AbstractC33342d f91050d;

    /* renamed from: a */
    public final NetPreviewBinder mo129754a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new NetPreviewBinder(context, this.f91049c, this.f91048b.mo121569b(), this.f91050d);
    }

    public NetPreviewBinderCreator(AbstractC32939b bVar, AbstractC32925a aVar, View.OnLongClickListener onLongClickListener, AbstractC33342d dVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        this.f91047a = bVar;
        this.f91048b = aVar;
        this.f91049c = onLongClickListener;
        this.f91050d = dVar;
    }
}
