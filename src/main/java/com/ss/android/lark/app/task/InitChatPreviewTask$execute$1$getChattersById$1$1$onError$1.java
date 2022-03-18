package com.ss.android.lark.app.task;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.app.task.InitChatPreviewTask$execute$1$getChattersById$1;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
public final class InitChatPreviewTask$execute$1$getChattersById$1$1$onError$1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InitChatPreviewTask$execute$1$getChattersById$1.C289421 f72574a;

    /* renamed from: b */
    final /* synthetic */ ErrorResult f72575b;

    InitChatPreviewTask$execute$1$getChattersById$1$1$onError$1(InitChatPreviewTask$execute$1$getChattersById$1.C289421 r1, ErrorResult errorResult) {
        this.f72574a = r1;
        this.f72575b = errorResult;
    }

    public final void run() {
        this.f72574a.f72573a.f72572b.onError(this.f72575b);
    }
}
