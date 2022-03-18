package com.ss.android.lark.notification.export.entity;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class Notice implements Serializable {
    public String content;
    public long createTime;
    public Extra extra;
    public String key;
    public String messageId;
    public int position;
    public boolean shouldNotify = true;
    public int state;
    public String title;
    public int type;
    public String voipParams;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ChannelType {
    }

    public static class Extra {

        /* renamed from: a */
        public String f122002a = "";

        /* renamed from: b */
        public String f122003b = "";

        /* renamed from: c */
        public String f122004c = "";

        /* renamed from: d */
        public ChatType f122005d;

        /* renamed from: e */
        public String f122006e = "";

        /* renamed from: f */
        public List<String> f122007f = new ArrayList();

        /* renamed from: g */
        public ChatMode f122008g = null;

        /* renamed from: h */
        public String f122009h = "";

        /* renamed from: i */
        public boolean f122010i = false;

        /* renamed from: j */
        public String f122011j = "";

        /* renamed from: k */
        public int f122012k = 0;

        /* renamed from: l */
        public int f122013l;

        /* renamed from: m */
        public String f122014m;

        /* renamed from: n */
        public String f122015n;

        /* renamed from: o */
        public boolean f122016o = false;

        /* renamed from: p */
        public String f122017p;

        /* renamed from: q */
        public int f122018q;

        /* renamed from: r */
        public int f122019r;

        /* renamed from: s */
        public String f122020s = null;

        /* renamed from: t */
        public String f122021t = null;

        /* renamed from: u */
        public String f122022u = null;

        /* renamed from: v */
        public String f122023v = null;

        public enum ChatMode {
            UNKNOWN(0),
            DEFAULT(1),
            THREAD(2),
            THREAD_V2(3);
            
            private final int value;

            public int getNumber() {
                return this.value;
            }

            public static ChatMode valueOf(int i) {
                return forNumber(i);
            }

            public static ChatMode forNumber(int i) {
                if (i == 1) {
                    return DEFAULT;
                }
                if (i == 2) {
                    return THREAD;
                }
                if (i != 3) {
                    return UNKNOWN;
                }
                return THREAD_V2;
            }

            private ChatMode(int i) {
                this.value = i;
            }
        }

        public enum ChatType {
            P2P(1),
            GROUP(2);
            
            private final int value;

            public int getNumber() {
                return this.value;
            }

            public static ChatType valueOf(int i) {
                return forNumber(i);
            }

            public static ChatType forNumber(int i) {
                if (i == 1) {
                    return P2P;
                }
                if (i != 2) {
                    return null;
                }
                return GROUP;
            }

            private ChatType(int i) {
                this.value = i;
            }
        }

        public Extra() {
        }

        public Extra(Extra extra) {
            this.f122002a = extra.f122002a;
            this.f122003b = extra.f122003b;
            this.f122004c = extra.f122004c;
            this.f122005d = extra.f122005d;
            this.f122006e = extra.f122006e;
            this.f122007f = extra.f122007f;
            this.f122008g = extra.f122008g;
            this.f122009h = extra.f122009h;
            this.f122010i = extra.f122010i;
            this.f122011j = extra.f122011j;
            this.f122012k = extra.f122012k;
            this.f122013l = extra.f122013l;
            this.f122015n = extra.f122015n;
            this.f122016o = extra.f122016o;
            this.f122018q = extra.f122018q;
            this.f122019r = extra.f122019r;
            this.f122020s = extra.f122020s;
            this.f122021t = extra.f122021t;
            this.f122022u = extra.f122022u;
            this.f122017p = extra.f122017p;
            this.f122023v = extra.f122023v;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public Notice() {
    }

    public Notice(Notice notice) {
        this.messageId = notice.messageId;
        this.state = notice.state;
        this.content = notice.content;
        this.title = notice.title;
        this.type = notice.type;
        this.key = notice.key;
        this.extra = new Extra(notice.extra);
        this.createTime = notice.createTime;
        this.position = notice.position;
        this.shouldNotify = notice.shouldNotify;
        this.voipParams = notice.voipParams;
    }
}
