package com.ss.android.lark.app.task;

import com.ss.android.lark.app.task.InitChatPreviewTask$execute$1$getChattersById$1;
import java.util.List;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
public final class InitChatPreviewTask$execute$1$getChattersById$1$1$onSuccess$2 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InitChatPreviewTask$execute$1$getChattersById$1.C289421 f72576a;

    /* renamed from: b */
    final /* synthetic */ List f72577b;

    InitChatPreviewTask$execute$1$getChattersById$1$1$onSuccess$2(InitChatPreviewTask$execute$1$getChattersById$1.C289421 r1, List list) {
        this.f72576a = r1;
        this.f72577b = list;
    }

    public final void run() {
        this.f72576a.f72573a.f72572b.onSuccess(this.f72577b);
    }
}
