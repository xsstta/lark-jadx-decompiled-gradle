package com.ss.android.lark.threadmergeforward;

import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardLauncher;", "", "()V", "startThreadMergeForwardActivity", "", "context", "Landroid/content/Context;", "originMergeForwardId", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadmergeforward.d */
public final class ThreadMergeForwardLauncher {

    /* renamed from: a */
    public static final ThreadMergeForwardLauncher f138288a = new ThreadMergeForwardLauncher();

    private ThreadMergeForwardLauncher() {
    }

    /* renamed from: a */
    public final void mo190745a(Context context, String str, Message message) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "originMergeForwardId");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intent intent = new Intent(context, ThreadMergeForwardActivity.class);
        intent.putExtra("key_thread_merge_forward_origin_id", str);
        intent.putExtra("key_thread_merge_forward_message", message);
        context.startActivity(intent);
    }
}
