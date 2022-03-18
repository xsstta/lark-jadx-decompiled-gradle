package com.ss.android.lark.search.impl.func.pick.chatpick;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.pick.chatpick.p2624a.C53643a;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53631a;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53634b;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.searchcommon.dto.C53893b;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.a */
public class C53642a {

    /* renamed from: a */
    private final int f132406a;

    /* renamed from: b */
    private final C53634b f132407b = new C53634b();

    /* renamed from: c */
    private Chat.ChatMode f132408c;

    /* renamed from: a */
    public void mo182964a(IGetDataCallback<List<BasePickViewData>> iGetDataCallback) {
        C57865c.m224576a(new Runnable(iGetDataCallback) {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.$$Lambda$a$TP0CJu5J5Ox8Lb0yIx3CupAHVE */
            public final /* synthetic */ IGetDataCallback f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C53642a.m270954lambda$TP0CJu5J5Ox8Lb0yIx3CupAHVE(C53642a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m207660a(int i) {
        if (i == 0) {
            this.f132408c = Chat.ChatMode.UNKNOWN;
        } else if (i == 1) {
            this.f132408c = Chat.ChatMode.DEFAULT;
        } else if (i == 2) {
            this.f132408c = Chat.ChatMode.THREAD_V2;
        }
    }

    /* renamed from: a */
    private List<BasePickViewData> m207659a(C53643a aVar) {
        BasePickViewData a;
        ArrayList arrayList = new ArrayList();
        for (C53893b bVar : aVar.f132411c) {
            Chat chat = aVar.f132409a.get(bVar.mo183899c());
            if (chat != null) {
                Chatter chatter = null;
                if ((chat.getType() != Chat.Type.P2P || (chatter = aVar.f132410b.get(chat.getP2pChatterId())) == null || !chatter.isDimission()) && ((this.f132408c == Chat.ChatMode.UNKNOWN || bVar.mo183891a() == this.f132408c) && !bVar.mo183898b() && (a = this.f132407b.mo182941a(bVar, chat, chatter)) != null)) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m207661b(IGetDataCallback iGetDataCallback) {
        List<C53893b> a = C53258a.m205939a().mo181760i().mo181811a();
        Log.m165389i("LarkSearch.Search.FeedDataLoader", "loadFeedData, chatFeedCards size: " + a.size());
        C53643a a2 = C53631a.m207621a().mo182940a(a);
        Log.m165389i("LarkSearch.Search.FeedDataLoader", "loadFeedData, feeds in pageData size: " + a2.f132411c.size());
        List<BasePickViewData> a3 = m207659a(a2);
        int size = a3.size();
        int i = this.f132406a;
        if (size > i) {
            a3 = a3.subList(0, i);
        }
        Log.m165389i("LarkSearch.Search.FeedDataLoader", "loadFeedData, result size: " + a3.size());
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(a3);
        }
    }

    public C53642a(int i, int i2) {
        this.f132406a = i;
        m207660a(i2);
    }
}
