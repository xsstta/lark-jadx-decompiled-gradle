package com.ss.android.lark.chat.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushChatChattersResponse;
import com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats;
import com.bytedance.lark.pb.im.v1.PushPinReadStatusResponse;
import com.bytedance.lark.pb.im.v1.PushPreloadUpdatedChats;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.timetip.PushChatTimeTipNotify;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48699f;
import com.ss.android.lark.p2392o.AbstractC48703l;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.p2851u.p2852a.C57334w;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.c */
public class C34186c {

    /* renamed from: a */
    public List<AbstractC34196c> f88463a;

    /* renamed from: b */
    public List<AbstractC34197d> f88464b;

    /* renamed from: c */
    public List<AbstractC34195b> f88465c;

    /* renamed from: d */
    public List<AbstractC48703l> f88466d;

    /* renamed from: e */
    public List<AbstractC48699f> f88467e;

    /* renamed from: f */
    public List<AbstractC34198e> f88468f;

    /* renamed from: g */
    private List<AbstractC34196c> f88469g;

    /* renamed from: h */
    private List<Object> f88470h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.c$a */
    public static class C34194a {

        /* renamed from: a */
        public static final C34186c f88487a = new C34186c();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.c$b */
    public interface AbstractC34195b {
        /* renamed from: a */
        void mo126746a(Chat chat, Map<String, ChatChatter> map);
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.c$c */
    public interface AbstractC34196c {
        /* renamed from: a */
        void mo126747a(ThreadTopic threadTopic);

        /* renamed from: a */
        void mo126748a(Chat chat);
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.c$d */
    public interface AbstractC34197d {
        /* renamed from: a */
        void mo126749a(Chat chat, Map<String, ChatChatter> map);
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.c$e */
    public interface AbstractC34198e {
        void onPushPreLoadUpdateChat(List<String> list);
    }

    /* renamed from: a */
    public static C34186c m132703a() {
        return C34194a.f88487a;
    }

    /* renamed from: a */
    public void mo126730a(AbstractC48703l lVar) {
        C53246j.m205910a(this.f88466d, lVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$iW_39BTqniLGv_rX8n4lTxyK2A */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34186c.this.m132721i();
            }
        });
    }

    /* renamed from: a */
    public void mo126729a(AbstractC48699f fVar) {
        C53246j.m205910a(this.f88467e, fVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$SwS1fp_HtyoHcrM0TO9pvbzl0SQ */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34186c.this.m132715e();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132708b() {
        C53248k.m205912a().mo181696a(Command.PUSH_PRELOAD_UPDATED_CHATS);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132711c() {
        C53248k.m205912a().mo181697a(Command.PUSH_PRELOAD_UPDATED_CHATS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$_vPpoP3P0EVdPKk8OBNqRfGUo4 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34186c.this.m132707a(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m132713d() {
        C53248k.m205912a().mo181696a(Command.PUSH_CHAT_TIME_TIP_NOTICE);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m132715e() {
        C53248k.m205912a().mo181697a(Command.PUSH_CHAT_TIME_TIP_NOTICE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$xjOfMHNHo8bqavdskyuHPOEzS8g */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34186c.this.m132710b(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m132717f() {
        C53248k.m205912a().mo181696a(Command.PUSH_CHAT_CHATTERS);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m132719g() {
        C53248k.m205912a().mo181697a(Command.PUSH_CHAT_CHATTERS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$WKbqWIsxDmC9X0yJetej9KvxtZ0 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34186c.this.m132716e(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m132720h() {
        C53248k.m205912a().mo181696a(Command.PUSH_PIN_READ_STATUS);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m132721i() {
        C53248k.m205912a().mo181697a(Command.PUSH_PIN_READ_STATUS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$6KiU2JRqCrPXzBldTq1GQZ25Y4M */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34186c.this.m132718f(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m132722j() {
        C53248k a = C53248k.m205912a();
        Command command = Command.UNKNOWN_COMMAND;
        a.mo181696a(Command.PUSH_OFFLINE_UPDATED_CHATS);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m132723k() {
        C53248k.m205912a().mo181697a(Command.PUSH_OFFLINE_UPDATED_CHATS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$DjvZqZXM9CaoSg1oxsAU8aXXXHs */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34186c.this.m132714d(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m132724l() {
        C53248k.m205912a().mo181696a(Command.PUSH_CHATS);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m132725m() {
        C53248k.m205912a().mo181697a(Command.PUSH_CHATS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$mz3Yu9QeY91icNSxUzbJC7_zP2E */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34186c.this.m132712c(bArr, str, z, z2);
            }
        });
    }

    private C34186c() {
        this.f88463a = new CopyOnWriteArrayList();
        this.f88469g = new CopyOnWriteArrayList();
        this.f88464b = new CopyOnWriteArrayList();
        this.f88465c = new CopyOnWriteArrayList();
        this.f88466d = new CopyOnWriteArrayList();
        this.f88470h = new CopyOnWriteArrayList();
        this.f88467e = new CopyOnWriteArrayList();
        this.f88468f = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    private void m132709b(Object obj) {
        C53246j.m205911b(this.f88470h, obj, $$Lambda$c$Sa_pUTaYi2uDcpjYXHCu4SwQWYI.INSTANCE);
    }

    /* renamed from: d */
    public void mo126738d(AbstractC34196c cVar) {
        C53246j.m205911b(this.f88469g, cVar, $$Lambda$c$FfrlO9EynqNqP7sP6vEiBULLBcc.INSTANCE);
    }

    /* renamed from: a */
    private void m132704a(Object obj) {
        C53246j.m205910a(this.f88470h, obj, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$06Cr8dLMCpUJv9utCyVZks7Etc */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34186c.this.m132719g();
            }
        });
    }

    /* renamed from: a */
    private void m132706a(final Map<String, Chat> map) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.chat.service.impl.C34186c.RunnableC341926 */

            public void run() {
                for (String str : map.keySet()) {
                    for (AbstractC34196c cVar : C34186c.this.f88463a) {
                        cVar.mo126748a((Chat) map.get(str));
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo126731b(AbstractC34195b bVar) {
        this.f88465c.remove(bVar);
        m132709b((Object) bVar);
    }

    /* renamed from: c */
    public void mo126737c(AbstractC34196c cVar) {
        C53246j.m205910a(this.f88469g, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$IP3iX97IhOq8DUyLWYkxhV8lPk0 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34186c.this.m132723k();
            }
        });
    }

    /* renamed from: b */
    public void mo126732b(AbstractC34196c cVar) {
        C53246j.m205911b(this.f88463a, cVar, $$Lambda$c$aRM1qxsnRwj7Ou3zMXkgr70h6k.INSTANCE);
    }

    /* renamed from: a */
    public void mo126725a(AbstractC34195b bVar) {
        this.f88465c.add(bVar);
        m132704a((Object) bVar);
    }

    /* renamed from: b */
    public void mo126733b(AbstractC34197d dVar) {
        this.f88464b.remove(dVar);
        m132709b((Object) dVar);
    }

    /* renamed from: a */
    public void mo126726a(AbstractC34196c cVar) {
        C53246j.m205910a(this.f88463a, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$dYVkMDfSWUyAGjxK144Ggx6PDLc */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34186c.this.m132725m();
            }
        });
    }

    /* renamed from: b */
    public void mo126734b(AbstractC34198e eVar) {
        C53246j.m205911b(this.f88468f, eVar, $$Lambda$c$za2UTDDhvSUxz42a78C6sWYBqg.INSTANCE);
    }

    /* renamed from: a */
    public void mo126727a(AbstractC34197d dVar) {
        this.f88464b.add(dVar);
        m132704a((Object) dVar);
    }

    /* renamed from: b */
    public void mo126735b(AbstractC48699f fVar) {
        C53246j.m205911b(this.f88467e, fVar, $$Lambda$c$Ftxq8akeaquW42OO6LfTwxmJzY.INSTANCE);
    }

    /* renamed from: a */
    public void mo126728a(AbstractC34198e eVar) {
        C53246j.m205910a(this.f88468f, eVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$c$6sCJuzW0L0zDGgZYFxLu0g4pI0Q */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34186c.this.m132711c();
            }
        });
    }

    /* renamed from: b */
    public void mo126736b(AbstractC48703l lVar) {
        C53246j.m205911b(this.f88466d, lVar, $$Lambda$c$2hPpshFxkSzn0S9ddboORZ360o.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r0 = com.ss.android.lark.p2851u.p2852a.C57332v.m222229a(r5.get(r0.item_id));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m132705a(java.util.List<com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats.UpdatedItem> r4, java.util.Map<java.lang.String, com.bytedance.lark.pb.basic.v1.Thread> r5) {
        /*
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L_0x0004:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r4.next()
            com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$UpdatedItem r0 = (com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats.UpdatedItem) r0
            if (r0 == 0) goto L_0x0004
            java.lang.String r1 = r0.item_id
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0004
            com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$UpdatedItem$Type r1 = r0.item_type
            com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats$UpdatedItem$Type r2 = com.bytedance.lark.pb.im.v1.PushOfflineUpdatedChats.UpdatedItem.Type.THREAD
            if (r1 != r2) goto L_0x0004
            java.lang.String r0 = r0.item_id
            java.lang.Object r0 = r5.get(r0)
            com.bytedance.lark.pb.basic.v1.Thread r0 = (com.bytedance.lark.pb.basic.v1.Thread) r0
            com.ss.android.lark.biz.im.api.ThreadTopic r0 = com.ss.android.lark.p2851u.p2852a.C57332v.m222229a(r0)
            if (r0 == 0) goto L_0x0004
            com.larksuite.framework.thread.CoreThreadPool r1 = com.larksuite.framework.thread.CoreThreadPool.getDefault()
            java.util.concurrent.Executor r1 = r1.getUIExecutor()
            com.ss.android.lark.chat.service.impl.c$3 r2 = new com.ss.android.lark.chat.service.impl.c$3
            r2.<init>(r0)
            r1.execute(r2)
            goto L_0x0004
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.C34186c.m132705a(java.util.List, java.util.Map):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m132710b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final PushChatTimeTipNotify a = C57334w.m222233a(com.bytedance.lark.pb.im.v1.PushChatTimeTipNotify.ADAPTER.decode(bArr));
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34186c.RunnableC341882 */

                public void run() {
                    for (AbstractC48699f fVar : C34186c.this.f88467e) {
                        fVar.mo123110a(a);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165387e("ChatPush", (Throwable) e, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m132718f(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final PushPinReadStatusResponse decode = PushPinReadStatusResponse.ADAPTER.decode(bArr);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34186c.RunnableC341937 */

                public void run() {
                    for (AbstractC48703l lVar : C34186c.this.f88466d) {
                        lVar.mo143335a(decode.chat_id, decode.is_read.booleanValue());
                    }
                }
            });
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m132707a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            Log.m165389i("ChatPush", "onPushPreUpdateChat");
            List<PushPreloadUpdatedChats.UpdatedItem> list = PushPreloadUpdatedChats.ADAPTER.decode(bArr).updated_items;
            final ArrayList arrayList = new ArrayList();
            if (CollectionUtils.isNotEmpty(list)) {
                for (int i = 0; i < list.size(); i++) {
                    PushPreloadUpdatedChats.UpdatedItem updatedItem = list.get(i);
                    if (updatedItem != null) {
                        arrayList.add(updatedItem.item_id);
                    }
                }
            }
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34186c.RunnableC341871 */

                public void run() {
                    for (AbstractC34198e eVar : C34186c.this.f88468f) {
                        eVar.onPushPreLoadUpdateChat(arrayList);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e("ChatPush", (Throwable) e, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m132712c(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            C14928Entity decode = C14928Entity.ADAPTER.decode(bArr);
            Map<String, Chat> a = C57310e.m222090a(decode.chats, null, decode.mail_setting);
            m132706a(a);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Chat> entry : a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(", ");
            }
            Log.m165388i("PushChats success:  size = " + a.size() + " ids: " + ((Object) sb));
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m132716e(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushChatChattersResponse decode = PushChatChattersResponse.ADAPTER.decode(bArr);
            final Chat a = C57310e.m222078a(decode.chat);
            final Map<String, ChatChatter> c = C57314g.m222106b(decode.entity).mo124898c();
            Map<String, Message> b = C57322k.m222132b(decode.entity);
            PushChatChattersResponse.Type type = decode.type;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chat", (Object) a);
            jSONObject.put("params_messages", (Object) b);
            jSONObject.put("params_chatters", (Object) c);
            jSONObject.put("params_push_chat_users_type", (Object) Integer.valueOf(type.getValue()));
            if (type.getValue() == 2) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.chat.service.impl.C34186c.RunnableC341904 */

                    public void run() {
                        for (AbstractC34197d dVar : C34186c.this.f88464b) {
                            dVar.mo126749a(a, c);
                        }
                    }
                });
            } else {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.chat.service.impl.C34186c.RunnableC341915 */

                    public void run() {
                        for (AbstractC34195b bVar : C34186c.this.f88465c) {
                            bVar.mo126746a(a, c);
                        }
                    }
                });
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m132714d(byte[] bArr, String str, boolean z, boolean z2) {
        C14928Entity entity;
        try {
            PushOfflineUpdatedChats decode = PushOfflineUpdatedChats.ADAPTER.decode(bArr);
            if (!(decode == null || (entity = decode.entity) == null)) {
                Map<String, Chat> a = C57310e.m222090a(entity.chats, null, entity.mail_setting);
                m132706a(a);
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, Chat> entry : a.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(", ");
                }
                Log.m165388i("PushOfflineChats success:  size = " + a.size() + " ids: " + ((Object) sb));
                List<PushOfflineUpdatedChats.UpdatedItem> list = decode.updated_items;
                if (!CollectionUtils.isEmpty(list) && !CollectionUtils.isEmpty(entity.threads)) {
                    m132705a(list, entity.threads);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
