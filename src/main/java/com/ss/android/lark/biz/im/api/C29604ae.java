package com.ss.android.lark.biz.im.api;

import android.os.Bundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;

/* renamed from: com.ss.android.lark.biz.im.api.ae */
public class C29604ae {

    /* renamed from: a */
    public String f74174a;

    /* renamed from: b */
    public int f74175b;

    /* renamed from: c */
    public boolean f74176c;

    /* renamed from: d */
    public String f74177d;

    /* renamed from: e */
    public boolean f74178e;

    /* renamed from: f */
    public boolean f74179f;

    /* renamed from: g */
    public boolean f74180g;

    /* renamed from: h */
    public boolean f74181h;

    /* renamed from: i */
    public boolean f74182i;

    /* renamed from: j */
    public ThreadTopic f74183j;

    /* renamed from: k */
    public Chat f74184k;

    /* renamed from: l */
    public TopicGroup f74185l;

    /* renamed from: m */
    public String f74186m;

    /* renamed from: n */
    public boolean f74187n;

    /* renamed from: o */
    private int f74188o;

    /* renamed from: p */
    private String f74189p;

    /* renamed from: q */
    private boolean f74190q;

    /* renamed from: com.ss.android.lark.biz.im.api.ae$a */
    public static class C29606a {

        /* renamed from: a */
        public String f74191a;

        /* renamed from: b */
        public boolean f74192b;

        /* renamed from: c */
        public boolean f74193c;

        /* renamed from: d */
        public Chat f74194d;

        /* renamed from: e */
        public boolean f74195e;

        /* renamed from: f */
        public boolean f74196f = true;

        /* renamed from: g */
        public String f74197g;

        /* renamed from: h */
        public int f74198h = -100;

        /* renamed from: i */
        public boolean f74199i = true;

        /* renamed from: j */
        public ThreadTopic f74200j;

        /* renamed from: k */
        public boolean f74201k;

        /* renamed from: l */
        public TopicGroup f74202l;

        /* renamed from: m */
        public boolean f74203m;

        /* renamed from: n */
        public String f74204n = "";

        /* renamed from: o */
        public int f74205o = -1;

        /* renamed from: p */
        public String f74206p;

        /* renamed from: q */
        public boolean f74207q;

        /* renamed from: a */
        public C29604ae mo106668a() {
            return new C29604ae(this);
        }

        /* renamed from: a */
        public C29606a mo106662a(int i) {
            this.f74198h = i;
            return this;
        }

        /* renamed from: b */
        public C29606a mo106669b(int i) {
            this.f74205o = i;
            return this;
        }

        /* renamed from: c */
        public C29606a mo106672c(String str) {
            this.f74191a = str;
            return this;
        }

        /* renamed from: d */
        public C29606a mo106674d(String str) {
            this.f74204n = str;
            return this;
        }

        /* renamed from: e */
        public C29606a mo106676e(boolean z) {
            this.f74195e = z;
            return this;
        }

        /* renamed from: f */
        public C29606a mo106677f(boolean z) {
            this.f74196f = z;
            return this;
        }

        /* renamed from: g */
        public C29606a mo106678g(boolean z) {
            this.f74201k = z;
            return this;
        }

        /* renamed from: h */
        public C29606a mo106679h(boolean z) {
            this.f74203m = z;
            return this;
        }

        /* renamed from: a */
        public C29606a mo106663a(ThreadTopic threadTopic) {
            this.f74200j = threadTopic;
            return this;
        }

        /* renamed from: b */
        public C29606a mo106670b(String str) {
            this.f74197g = str;
            return this;
        }

        /* renamed from: c */
        public C29606a mo106673c(boolean z) {
            this.f74192b = z;
            return this;
        }

        /* renamed from: d */
        public C29606a mo106675d(boolean z) {
            this.f74193c = z;
            return this;
        }

        /* renamed from: a */
        public C29606a mo106664a(Chat chat) {
            this.f74194d = chat;
            return this;
        }

        /* renamed from: b */
        public C29606a mo106671b(boolean z) {
            this.f74199i = z;
            return this;
        }

        /* renamed from: a */
        public C29606a mo106665a(TopicGroup topicGroup) {
            this.f74202l = topicGroup;
            return this;
        }

        /* renamed from: a */
        public C29606a mo106666a(String str) {
            this.f74206p = str;
            return this;
        }

        /* renamed from: a */
        public C29606a mo106667a(boolean z) {
            this.f74207q = z;
            return this;
        }
    }

    /* renamed from: a */
    public Bundle mo106661a() {
        Bundle bundle = new Bundle();
        m109469a(bundle, "key_params_thread_id", this.f74174a);
        m109469a(bundle, "key_params_thread_source", this.f74177d);
        bundle.putInt("key_params_jump_position", this.f74175b);
        bundle.putBoolean("key_params_need_show_bubble", this.f74176c);
        bundle.putBoolean("key_params_show_reply", this.f74178e);
        bundle.putBoolean("key_params_show_keyboard", this.f74179f);
        bundle.putBoolean("key_params_load_from_start", this.f74180g);
        bundle.putBoolean("key_params_open_thread_window", this.f74181h);
        bundle.putBoolean("key_params_is_from_tab", this.f74182i);
        bundle.putSerializable("key_params_topic_group", this.f74185l);
        bundle.putBoolean("key_params_is_open_in_right_window", this.f74187n);
        bundle.putInt("key_params_feed_card_type", this.f74188o);
        bundle.putString("key_params_from", this.f74189p);
        bundle.putString("key_params_chat_id", this.f74186m);
        bundle.putBoolean("key_params_is_from_card", this.f74190q);
        ThreadTopic threadTopic = this.f74183j;
        if (threadTopic != null) {
            bundle.putSerializable("key_params_thread", threadTopic);
        }
        Chat chat = this.f74184k;
        if (chat != null) {
            bundle.putSerializable("key_params_thread_chat", chat);
        }
        return bundle;
    }

    private C29604ae(C29606a aVar) {
        this.f74188o = -1;
        this.f74189p = "";
        this.f74174a = aVar.f74197g;
        this.f74186m = aVar.f74206p;
        this.f74175b = aVar.f74198h;
        this.f74176c = aVar.f74199i;
        this.f74183j = aVar.f74200j;
        this.f74177d = aVar.f74191a;
        this.f74178e = aVar.f74192b;
        this.f74179f = aVar.f74193c;
        this.f74184k = aVar.f74194d;
        this.f74180g = aVar.f74195e;
        this.f74181h = aVar.f74196f;
        this.f74182i = aVar.f74201k;
        this.f74185l = aVar.f74202l;
        this.f74187n = aVar.f74203m;
        this.f74188o = aVar.f74205o;
        this.f74189p = aVar.f74204n;
        this.f74190q = aVar.f74207q;
    }

    /* renamed from: a */
    public static C29604ae m109468a(Bundle bundle) {
        C29606a aVar = new C29606a();
        aVar.mo106670b(bundle.getString("key_params_thread_id")).mo106663a((ThreadTopic) bundle.getSerializable("key_params_thread")).mo106664a((Chat) bundle.getSerializable("key_params_thread_chat")).mo106672c(bundle.getString("key_params_thread_source")).mo106665a((TopicGroup) bundle.getSerializable("key_params_topic_group")).mo106662a(bundle.getInt("key_params_jump_position")).mo106666a(bundle.getString("key_params_chat_id")).mo106667a(bundle.getBoolean("key_params_is_from_card", false)).mo106674d(bundle.getString("key_params_from"));
        return aVar.mo106668a();
    }

    /* renamed from: a */
    private void m109469a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }
}
