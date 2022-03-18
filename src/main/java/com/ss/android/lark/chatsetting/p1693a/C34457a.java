package com.ss.android.lark.chatsetting.p1693a;

import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.lark.chatsetting.a.a */
public class C34457a {

    /* renamed from: a */
    private LinkedBlockingQueue<ChatSettingModule.AbstractC34454a> f88984a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.a.a$a */
    public static final class C34459a {

        /* renamed from: a */
        public static final C34457a f88985a = new C34457a();
    }

    /* renamed from: a */
    public static C34457a m133685a() {
        return C34459a.f88985a;
    }

    private C34457a() {
        this.f88984a = new LinkedBlockingQueue<>();
    }

    /* renamed from: b */
    public void mo127254b(ChatSettingModule.AbstractC34454a aVar) {
        if (aVar != null) {
            this.f88984a.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo127252a(ChatSettingModule.AbstractC34454a aVar) {
        if (aVar != null && !this.f88984a.contains(aVar)) {
            this.f88984a.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo127251a(ChatAnnouncement chatAnnouncement) {
        Iterator<ChatSettingModule.AbstractC34454a> it = this.f88984a.iterator();
        while (it.hasNext()) {
            it.next().mo127247a(chatAnnouncement);
        }
    }

    /* renamed from: b */
    public void mo127255b(String str, boolean z) {
        Iterator<ChatSettingModule.AbstractC34454a> it = this.f88984a.iterator();
        while (it.hasNext()) {
            it.next().mo127249b(str, z);
        }
    }

    /* renamed from: a */
    public void mo127253a(String str, boolean z) {
        Iterator<ChatSettingModule.AbstractC34454a> it = this.f88984a.iterator();
        while (it.hasNext()) {
            it.next().mo127248a(str, z);
        }
    }
}
