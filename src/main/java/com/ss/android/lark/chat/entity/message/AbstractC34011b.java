package com.ss.android.lark.chat.entity.message;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.AbstractC34011b.AbstractC34012a;
import com.ss.android.lark.chat.entity.message.Message;
import java.util.UUID;

/* renamed from: com.ss.android.lark.chat.entity.message.b */
public abstract class AbstractC34011b<T extends AbstractC34011b<T, B>, B extends AbstractC34012a<T, B>> {

    /* renamed from: k */
    public final String f87857k;

    /* renamed from: l */
    public final String f87858l;

    /* renamed from: m */
    public final String f87859m;

    /* renamed from: n */
    public final String f87860n;

    /* renamed from: o */
    public final Message.Type f87861o;

    /* renamed from: p */
    public final Channel.Type f87862p;

    /* renamed from: q */
    public final String f87863q;

    /* renamed from: r */
    public final String f87864r;

    /* renamed from: s */
    public int f87865s = -1;

    /* renamed from: t */
    public boolean f87866t;

    /* renamed from: u */
    public final boolean f87867u;

    /* renamed from: v */
    public final String f87868v;

    /* renamed from: a */
    public abstract Message mo106656a(String str, String str2);

    /* renamed from: com.ss.android.lark.chat.entity.message.b$a */
    public static abstract class AbstractC34012a<T extends AbstractC34011b<T, B>, B extends AbstractC34012a<T, B>> {

        /* renamed from: k */
        protected String f87869k;

        /* renamed from: l */
        protected String f87870l;

        /* renamed from: m */
        protected String f87871m;

        /* renamed from: n */
        protected String f87872n;

        /* renamed from: o */
        protected int f87873o = -1;

        /* renamed from: p */
        protected String f87874p;

        /* renamed from: q */
        protected Channel.Type f87875q = Channel.Type.CHAT;

        /* renamed from: r */
        protected Message.Type f87876r;

        /* renamed from: s */
        protected String f87877s;

        /* renamed from: t */
        protected boolean f87878t;

        /* renamed from: u */
        protected boolean f87879u;

        /* renamed from: v */
        protected String f87880v;

        protected AbstractC34012a() {
        }

        /* renamed from: a */
        public B mo125327a(Message.Type type) {
            this.f87876r = type;
            return this;
        }

        /* renamed from: c */
        public B mo125328c(int i) {
            this.f87873o = i;
            return this;
        }

        /* renamed from: g */
        public B mo106709g(String str) {
            this.f87872n = str;
            return this;
        }

        /* renamed from: h */
        public B mo125330h(String str) {
            this.f87869k = str;
            return this;
        }

        /* renamed from: i */
        public B mo125331i(String str) {
            this.f87870l = str;
            return this;
        }

        /* renamed from: j */
        public B mo125332j(String str) {
            this.f87871m = str;
            return this;
        }

        /* renamed from: k */
        public B mo125333k(String str) {
            this.f87877s = str;
            return this;
        }

        /* renamed from: l */
        public B mo125334l(String str) {
            this.f87880v = str;
            return this;
        }

        /* renamed from: c */
        public B mo125329c(boolean z) {
            this.f87879u = z;
            return this;
        }
    }

    /* renamed from: a */
    private void m131854a() {
        if (this.f87859m == null || this.f87861o == null) {
            throw new IllegalArgumentException("miss required field");
        }
    }

    protected AbstractC34011b(B b) {
        String str;
        this.f87857k = b.f87869k;
        this.f87858l = b.f87870l;
        this.f87859m = b.f87871m;
        this.f87861o = b.f87876r;
        this.f87865s = b.f87873o;
        this.f87862p = b.f87875q;
        if (b.f87875q == Channel.Type.CHAT) {
            str = b.f87871m;
        } else {
            str = b.f87874p;
        }
        this.f87863q = str;
        this.f87860n = b.f87872n;
        this.f87864r = b.f87877s;
        this.f87866t = b.f87878t;
        this.f87867u = b.f87879u;
        this.f87868v = b.f87880v;
        m131854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Message mo125326b(String str, String str2) {
        String str3;
        Message message = new Message();
        message.setChatId(this.f87859m);
        message.setRootId(this.f87857k);
        message.setParentId(this.f87858l);
        message.setType(this.f87861o);
        int i = this.f87865s;
        if (i >= 0) {
            message.setPosition(i);
        }
        if (!TextUtils.isEmpty(str)) {
            message.setcId(str);
            message.setId(str);
        } else if (TextUtils.isEmpty(this.f87860n)) {
            String uuid = UUID.randomUUID().toString();
            message.setcId(uuid);
            message.setId(uuid);
        } else {
            message.setcId(this.f87860n);
            message.setId(this.f87860n);
        }
        long b = C26279i.m95159b();
        message.setCreateTime(b);
        message.setUpdateTime(b);
        message.setSendStatus(SendStatus.SENDING);
        message.setFromType(Message.FromType.USER);
        message.setIsFromMe(true);
        message.setFromId(str2);
        Channel.Type type = this.f87862p;
        if (type == Channel.Type.CHAT) {
            str3 = this.f87859m;
        } else {
            str3 = this.f87863q;
        }
        message.setChannel(new Channel(type, str3));
        return message;
    }
}
