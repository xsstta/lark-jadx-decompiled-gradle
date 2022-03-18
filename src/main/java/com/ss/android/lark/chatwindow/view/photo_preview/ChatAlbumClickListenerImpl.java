package com.ss.android.lark.chatwindow.view.photo_preview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.album.ChatAlbumActivity;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/photo_preview/ChatAlbumClickListenerImpl;", "Lcom/ss/android/lark/widget/photo_picker/gallery/callback/OnChatAlbumClickListener;", "chatId", "", "isThread", "", "(Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "()Z", "onChatAlbumClicked", "", "context", "Landroid/content/Context;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
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
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (b.mo134586n().mo134685a("lark.messenger.chat.album.new")) {
            Bundle bundle = new Bundle();
            bundle.putString("chat_id", this.chatId);
            bundle.putBoolean("is_thread", this.isThread);
            Intent intent = new Intent(context, ChatAlbumActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
            return;
        }
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        b2.ae().mo134461a(context, this.chatId, this.isThread);
    }

    public ChatAlbumClickListenerImpl(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.chatId = str;
        this.isThread = z;
    }
}
