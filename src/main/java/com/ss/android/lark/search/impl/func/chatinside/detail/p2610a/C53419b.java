package com.ss.android.lark.search.impl.func.chatinside.detail.p2610a;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.entity.message.content.FileContent;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a.b */
public class C53419b implements AbstractC53425g {

    /* renamed from: a */
    private C53420c f132033a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m206873b(FileContent fileContent) {
        this.f132033a.mo182468a(fileContent);
    }

    /* renamed from: a */
    public void mo182466a(FileContent fileContent) {
        UICallbackExecutor.execute(new Runnable(fileContent) {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.$$Lambda$b$HBQvIVLWsd4gEuMva1AGQWBxQ */
            public final /* synthetic */ FileContent f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C53419b.m270944lambda$HBQvIVLWsd4gEuMva1AGQWBxQ(C53419b.this, this.f$1);
            }
        });
    }

    public C53419b(C53417a aVar, C53420c cVar) {
        this.f132033a = cVar;
    }
}
