package com.ss.android.lark.search.impl.func.chatinside.detail.image.listener;

import android.content.Context;
import com.ss.android.lark.search.impl.func.chatinside.C53406a;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/listener/ChatAlbumClickListenerImpl;", "Lcom/ss/android/lark/widget/photo_picker/gallery/callback/OnChatAlbumClickListener;", "chatId", "", "isThread", "", "(Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "()Z", "onChatAlbumClicked", "", "context", "Landroid/content/Context;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatAlbumClickListenerImpl implements OnChatAlbumClickListener {
    private final String chatId;
    private final boolean isThread;

    public final String getChatId() {
        return this.chatId;
    }

    public final boolean isThread() {
        return this.isThread;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener
    public void onChatAlbumClicked(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C53406a.m206802a(context, this.chatId, this.isThread);
    }

    public ChatAlbumClickListenerImpl(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.chatId = str;
        this.isThread = z;
    }
}
