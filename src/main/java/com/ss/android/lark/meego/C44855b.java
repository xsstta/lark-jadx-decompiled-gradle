package com.ss.android.lark.meego;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ss.android.lark.meego.b */
public final class C44855b {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m177787a(AbsMessageVO aVar, Chat chat) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            m177790a("float_menu", chat, C44856c.m177792a(arrayList));
        } catch (Exception e) {
            Log.m165384e("MeegoUtils", "handleSingleMsgToMeego error", e);
        }
    }

    /* renamed from: a */
    public static void m177788a(Chat chat, AbsMessageVO<?> aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable(chat) {
            /* class com.ss.android.lark.meego.$$Lambda$b$I_2FSWdLyZpCIzWvbkmDE7ukr0 */
            public final /* synthetic */ Chat f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C44855b.m177787a(AbsMessageVO.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m177789a(Chat chat, List<ChatMessageVO<?>> list) {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable(list, chat) {
            /* class com.ss.android.lark.meego.$$Lambda$b$qMNiW3VsgkmHGsKZaxw50Pr0BVw */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ Chat f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C44855b.m177791a(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m177791a(List list, Chat chat) {
        try {
            m177790a("multi_select", chat, C44856c.m177792a(list));
        } catch (Exception e) {
            Log.m165384e("MeegoUtils", "handleMultiMsgToMeego error", e);
        }
    }

    /* renamed from: a */
    private static void m177790a(String str, Chat chat, JSONArray jSONArray) {
        C29990c.m110930b().ao().mo134624a(str, chat, jSONArray);
    }
}
