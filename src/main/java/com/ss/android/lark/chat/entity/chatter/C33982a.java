package com.ss.android.lark.chat.entity.chatter;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.entity.chatter.a */
public class C33982a {

    /* renamed from: a */
    private Map<String, Chatter> f87774a = new HashMap();

    /* renamed from: b */
    private Map<String, Map<String, ChatChatter>> f87775b = new HashMap();

    /* renamed from: a */
    public Map<String, Chatter> mo124894a() {
        return new HashMap(this.f87774a);
    }

    /* renamed from: c */
    public Map<String, ChatChatter> mo124898c() {
        Map<String, ChatChatter> b = mo124896b();
        m131791a(b);
        return b;
    }

    /* renamed from: b */
    public Map<String, ChatChatter> mo124896b() {
        HashMap hashMap = new HashMap();
        for (Map<String, ChatChatter> map : this.f87775b.values()) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: a */
    public Chatter mo124893a(String str) {
        return this.f87774a.get(str);
    }

    /* renamed from: a */
    private void m131791a(Map<String, ChatChatter> map) {
        for (Map.Entry<String, Chatter> entry : this.f87774a.entrySet()) {
            if (map.get(entry.getKey()) == null) {
                map.put(entry.getKey(), new ChatChatter(entry.getValue()));
            }
        }
    }

    /* renamed from: a */
    public void mo124895a(Chatter chatter) {
        String id = chatter.getId();
        if (chatter instanceof ChatChatter) {
            ChatChatter chatChatter = (ChatChatter) chatter;
            this.f87774a.put(id, chatChatter.chatter);
            String chatId = chatChatter.getChatId();
            if (!TextUtils.isEmpty(chatId)) {
                Map<String, ChatChatter> map = this.f87775b.get(chatId);
                if (map == null) {
                    map = new HashMap<>();
                    this.f87775b.put(chatId, map);
                }
                map.put(id, chatChatter);
                return;
            }
            return;
        }
        this.f87774a.put(id, chatter);
    }

    /* renamed from: b */
    public boolean mo124897b(String str, String str2) {
        Map<String, ChatChatter> map = this.f87775b.get(str);
        if (map == null || !map.containsKey(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public ChatChatter mo124892a(String str, String str2) {
        Map<String, ChatChatter> map = this.f87775b.get(str);
        if (map != null && map.containsKey(str2)) {
            return map.get(str2);
        }
        Chatter chatter = this.f87774a.get(str2);
        if (chatter == null) {
            return null;
        }
        ChatChatter chatChatter = new ChatChatter(chatter);
        chatChatter.setChatId(str);
        return chatChatter;
    }
}
