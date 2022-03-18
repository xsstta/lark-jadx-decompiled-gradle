package com.ss.android.lark.biz.im.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chat.Chat;

public class ChatBundle {

    /* renamed from: a */
    public String f74027a;

    /* renamed from: b */
    public final String f74028b;

    /* renamed from: c */
    public int f74029c;

    /* renamed from: d */
    public final String f74030d;

    /* renamed from: e */
    public final String f74031e;

    /* renamed from: f */
    public final String f74032f;

    /* renamed from: g */
    public final int f74033g;

    /* renamed from: h */
    public final SourceType f74034h;

    /* renamed from: i */
    public final Chat.ChatMode f74035i;

    /* renamed from: j */
    public final boolean f74036j;

    /* renamed from: k */
    public final boolean f74037k;

    /* renamed from: l */
    public final boolean f74038l;

    /* renamed from: m */
    public final boolean f74039m;

    /* renamed from: n */
    public final ChatWindowPrepareData f74040n;

    /* renamed from: o */
    public final boolean f74041o;

    /* renamed from: p */
    public final boolean f74042p;

    /* renamed from: q */
    public final int f74043q;

    /* renamed from: r */
    public final boolean f74044r;

    /* renamed from: s */
    public final boolean f74045s;

    /* renamed from: t */
    public final C29592c f74046t;

    /* renamed from: u */
    public final Bundle f74047u;

    /* renamed from: v */
    public final boolean f74048v;

    /* renamed from: w */
    public final long f74049w;

    /* renamed from: x */
    public final boolean f74050x;

    /* renamed from: y */
    public final boolean f74051y;

    /* renamed from: z */
    public final boolean f74052z;

    public @interface TRANSITION {
    }

    /* renamed from: com.ss.android.lark.biz.im.api.ChatBundle$b */
    public interface AbstractC29591b {
        void inject(Bundle bundle);
    }

    public enum SourceType {
        FEED("feed", 1),
        PUSH("push", 2),
        SHORTCUT("shortcut", 3),
        SEARCH("search", 5),
        CARD("card", 7),
        PROFILE("profile", 8),
        LINK("link", 9),
        IPC("ipc", 0),
        UNKNOWN("unknown", 0),
        CHAT("chat", 0),
        THREAD("thread", 0);
        
        public int index;
        public String value;

        public String getValue() {
            return this.value;
        }

        public static SourceType fromValue(String str) {
            SourceType[] values = values();
            for (SourceType sourceType : values) {
                if (TextUtils.equals(sourceType.value, str)) {
                    return sourceType;
                }
            }
            return UNKNOWN;
        }

        private SourceType(String str, int i) {
            this.value = str;
            this.index = i;
        }
    }

    /* renamed from: a */
    public static C29590a m109259a() {
        return new C29590a();
    }

    /* renamed from: com.ss.android.lark.biz.im.api.ChatBundle$a */
    public static class C29590a {

        /* renamed from: a */
        public String f74053a;

        /* renamed from: b */
        public String f74054b;

        /* renamed from: c */
        public int f74055c = -1;

        /* renamed from: d */
        public String f74056d;

        /* renamed from: e */
        public String f74057e;

        /* renamed from: f */
        public int f74058f = -1;

        /* renamed from: g */
        public String f74059g;

        /* renamed from: h */
        public SourceType f74060h;

        /* renamed from: i */
        public ChatWindowPrepareData f74061i;

        /* renamed from: j */
        public Chat.ChatMode f74062j = Chat.ChatMode.UNKNOWN;

        /* renamed from: k */
        public boolean f74063k;

        /* renamed from: l */
        public boolean f74064l = true;

        /* renamed from: m */
        public boolean f74065m;

        /* renamed from: n */
        public boolean f74066n;

        /* renamed from: o */
        public boolean f74067o;

        /* renamed from: p */
        public boolean f74068p;

        /* renamed from: q */
        public boolean f74069q;

        /* renamed from: r */
        public boolean f74070r;

        /* renamed from: s */
        public int f74071s;

        /* renamed from: t */
        public boolean f74072t;

        /* renamed from: u */
        public C29592c f74073u;

        /* renamed from: v */
        public Bundle f74074v;

        /* renamed from: w */
        public long f74075w = 100001;

        /* renamed from: x */
        public boolean f74076x;

        /* renamed from: y */
        public boolean f74077y;

        /* renamed from: z */
        public boolean f74078z;

        /* renamed from: a */
        public ChatBundle mo105929a() {
            return new ChatBundle(this);
        }

        /* renamed from: a */
        public C29590a mo105920a(int i) {
            this.f74055c = i;
            return this;
        }

        /* renamed from: b */
        public C29590a mo105930b(int i) {
            this.f74058f = i;
            return this;
        }

        /* renamed from: c */
        public C29590a mo105933c(String str) {
            this.f74056d = str;
            return this;
        }

        /* renamed from: d */
        public C29590a mo105935d(String str) {
            this.f74057e = str;
            return this;
        }

        /* renamed from: e */
        public C29590a mo105937e(String str) {
            this.f74059g = str;
            return this;
        }

        /* renamed from: f */
        public C29590a mo105939f(boolean z) {
            this.f74067o = z;
            return this;
        }

        /* renamed from: g */
        public C29590a mo105940g(boolean z) {
            this.f74069q = z;
            return this;
        }

        /* renamed from: h */
        public C29590a mo105941h(boolean z) {
            this.f74070r = z;
            return this;
        }

        /* renamed from: i */
        public C29590a mo105942i(boolean z) {
            this.f74072t = z;
            return this;
        }

        /* renamed from: j */
        public C29590a mo105943j(boolean z) {
            this.f74076x = z;
            return this;
        }

        /* renamed from: k */
        public C29590a mo105944k(boolean z) {
            this.f74077y = z;
            return this;
        }

        /* renamed from: l */
        public C29590a mo105945l(boolean z) {
            this.f74078z = z;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105921a(long j) {
            this.f74075w = j;
            return this;
        }

        /* renamed from: b */
        public C29590a mo105931b(String str) {
            this.f74054b = str;
            return this;
        }

        /* renamed from: c */
        public C29590a mo105934c(boolean z) {
            this.f74064l = z;
            return this;
        }

        /* renamed from: d */
        public C29590a mo105936d(boolean z) {
            this.f74065m = z;
            return this;
        }

        /* renamed from: e */
        public C29590a mo105938e(boolean z) {
            this.f74066n = z;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105922a(Bundle bundle) {
            this.f74074v = bundle;
            return this;
        }

        /* renamed from: b */
        public C29590a mo105932b(boolean z) {
            this.f74068p = z;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105923a(SourceType sourceType) {
            this.f74060h = sourceType;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105924a(C29592c cVar) {
            this.f74073u = cVar;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105925a(ChatWindowPrepareData chatWindowPrepareData) {
            this.f74061i = chatWindowPrepareData;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105926a(Chat.ChatMode chatMode) {
            if (chatMode == null) {
                chatMode = Chat.ChatMode.UNKNOWN;
            }
            this.f74062j = chatMode;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105927a(String str) {
            this.f74053a = str;
            return this;
        }

        /* renamed from: a */
        public C29590a mo105928a(boolean z) {
            this.f74063k = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo105917a(int i) {
        this.f74029c = i;
    }

    public enum ChatType {
        GROUP("group", 2),
        SINGLE("single", 1),
        SINGLE_BOT("single_bot", 1),
        DOCS("docs", 0),
        MEETING("meeting", 2),
        SECRET_GROUP("secret_group", 2),
        SECRET_SINGLE("secret_single", 1),
        THREAD("thread", 5),
        THREAD_DETAIL("thread_detail", 3),
        THREAD_TAB("thread_tab", 5),
        CHAT_DETAIL("Chat_Detail", 4),
        EDU_CHAT("edu_chat", 2);
        
        public int index;
        public String value;

        public static ChatType fromValue(String str) {
            ChatType[] values = values();
            for (ChatType chatType : values) {
                if (TextUtils.equals(chatType.value, str)) {
                    return chatType;
                }
            }
            return null;
        }

        private ChatType(String str, int i) {
            this.value = str;
            this.index = i;
        }
    }

    /* renamed from: a */
    public void mo105918a(String str) {
        this.f74027a = str;
    }

    protected ChatBundle(C29590a aVar) {
        this.f74027a = aVar.f74053a;
        this.f74028b = aVar.f74054b;
        this.f74029c = aVar.f74055c;
        this.f74030d = aVar.f74056d;
        this.f74031e = aVar.f74057e;
        this.f74033g = aVar.f74058f;
        this.f74034h = aVar.f74060h;
        this.f74040n = aVar.f74061i;
        this.f74041o = aVar.f74063k;
        this.f74042p = aVar.f74068p;
        this.f74032f = aVar.f74059g;
        this.f74043q = aVar.f74071s;
        this.f74035i = aVar.f74062j;
        this.f74036j = aVar.f74064l;
        this.f74037k = aVar.f74065m;
        this.f74038l = aVar.f74066n;
        this.f74039m = aVar.f74067o;
        this.f74044r = aVar.f74069q;
        this.f74045s = aVar.f74070r;
        this.f74046t = aVar.f74073u;
        this.f74047u = aVar.f74074v;
        this.f74048v = aVar.f74072t;
        this.f74049w = aVar.f74075w;
        this.f74050x = aVar.f74076x;
        this.f74051y = aVar.f74077y;
        this.f74052z = aVar.f74078z;
    }

    /* renamed from: a */
    public static ChatBundle m109260a(Bundle bundle) {
        return m109259a().mo105927a(bundle.getString("chatID")).mo105931b(bundle.getString("chatterID")).mo105925a((ChatWindowPrepareData) bundle.getSerializable("initData")).mo105920a(bundle.getInt("showPosition")).mo105937e(bundle.getString("messageId")).mo105932b(bundle.getBoolean("need_show_position")).mo105933c(bundle.getString("gochatwin_from")).mo105926a(Chat.ChatMode.forNumber(bundle.getInt("extra_chat_mode", Chat.ChatMode.UNKNOWN.getNumber()))).mo105928a(bundle.getBoolean("extra_chat_chatwindow_hide_title")).mo105934c(bundle.getBoolean("extra_need_badge")).mo105936d(bundle.getBoolean("extra_is_secret_chat")).mo105938e(bundle.getBoolean("extra_is_cloud_apply")).mo105939f(bundle.getBoolean("extra_is_recommend_topic")).mo105940g(bundle.getBoolean("switch_to_inbox")).mo105941h(bundle.getBoolean("show_single_page")).mo105942i(bundle.getBoolean("from_tour")).mo105922a((Bundle) bundle.getParcelable("option_bundle")).mo105935d(bundle.getString("extra_key_app_id")).mo105921a(bundle.getLong("launch_tab_id")).mo105943j(bundle.getBoolean("launch_tabs_refresh")).mo105944k(bundle.getBoolean("key_param_from_offline_push")).mo105945l(bundle.getBoolean("key_is_show_group_profile")).mo105929a();
    }

    /* renamed from: a */
    public Bundle mo105916a(AbstractC29591b bVar) {
        Bundle bundle = new Bundle();
        m109261a(bundle, "chatID", this.f74027a);
        m109261a(bundle, "chatterID", this.f74028b);
        m109261a(bundle, "gochatwin_from", this.f74030d);
        m109261a(bundle, "messageId", this.f74032f);
        bundle.putBoolean("need_show_position", this.f74042p);
        bundle.putBoolean("extra_chat_chatwindow_hide_title", this.f74041o);
        ChatWindowPrepareData chatWindowPrepareData = this.f74040n;
        if (chatWindowPrepareData != null) {
            bundle.putSerializable("initData", chatWindowPrepareData);
        }
        bundle.putInt("extra_chat_mode", this.f74035i.getNumber());
        if (!TextUtils.isEmpty(this.f74031e)) {
            bundle.putString("extra_key_app_id", this.f74031e);
        }
        bundle.putInt("showPosition", this.f74029c);
        bundle.putBoolean("extra_need_badge", this.f74036j);
        bundle.putBoolean("extra_is_secret_chat", this.f74037k);
        bundle.putBoolean("extra_is_cloud_apply", this.f74038l);
        bundle.putBoolean("extra_is_recommend_topic", this.f74039m);
        bundle.putBoolean("switch_to_inbox", this.f74044r);
        bundle.putBoolean("show_single_page", this.f74045s);
        bundle.putBoolean("from_tour", this.f74048v);
        bundle.putParcelable("option_bundle", this.f74047u);
        bundle.putLong("launch_tab_id", this.f74049w);
        bundle.putBoolean("launch_tabs_refresh", this.f74050x);
        bundle.putBoolean("key_param_from_offline_push", this.f74051y);
        bundle.putBoolean("key_is_show_group_profile", this.f74052z);
        if (bVar != null) {
            bVar.inject(bundle);
        }
        return bundle;
    }

    /* renamed from: a */
    private void m109261a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: com.ss.android.lark.biz.im.api.ChatBundle$c */
    public static class C29592c {

        /* renamed from: a */
        public int f74079a;

        /* renamed from: b */
        public String f74080b;

        /* renamed from: c */
        public String f74081c;

        /* renamed from: d */
        public String f74082d;

        public C29592c(int i, String str, String str2, String str3) {
            this.f74079a = i;
            this.f74080b = str;
            this.f74081c = str2;
            this.f74082d = str3;
        }
    }
}
