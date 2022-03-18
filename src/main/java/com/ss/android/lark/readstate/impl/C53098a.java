package com.ss.android.lark.readstate.impl;

import android.os.Bundle;
import com.ss.android.lark.chat.entity.message.Message;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.readstate.impl.a */
public class C53098a {

    /* renamed from: a */
    public boolean f131300a;

    /* renamed from: b */
    public Message.Type f131301b;

    /* renamed from: c */
    public String f131302c;

    /* renamed from: d */
    public ArrayList<String> f131303d;

    /* renamed from: e */
    public String f131304e;

    /* renamed from: a */
    public static C53100a m205527a() {
        return new C53100a();
    }

    /* renamed from: com.ss.android.lark.readstate.impl.a$a */
    public static class C53100a {

        /* renamed from: a */
        public boolean f131305a;

        /* renamed from: b */
        public Message.Type f131306b;

        /* renamed from: c */
        public String f131307c;

        /* renamed from: d */
        public ArrayList<String> f131308d;

        /* renamed from: e */
        public String f131309e;

        /* renamed from: a */
        public C53098a mo181373a() {
            return new C53098a(this);
        }

        /* renamed from: a */
        public C53100a mo181369a(Message.Type type) {
            this.f131306b = type;
            return this;
        }

        /* renamed from: b */
        public C53100a mo181374b(String str) {
            this.f131309e = str;
            return this;
        }

        /* renamed from: a */
        public C53100a mo181370a(String str) {
            this.f131307c = str;
            return this;
        }

        /* renamed from: a */
        public C53100a mo181371a(ArrayList<String> arrayList) {
            this.f131308d = arrayList;
            return this;
        }

        /* renamed from: a */
        public C53100a mo181372a(boolean z) {
            this.f131305a = z;
            return this;
        }
    }

    /* renamed from: b */
    public Bundle mo181368b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra.is.ding", this.f131300a);
        bundle.putSerializable("params_message_type", this.f131301b);
        bundle.putString("params_chats", this.f131302c);
        bundle.putStringArrayList("params_all_at_chatterids", this.f131303d);
        bundle.putString("params_message", this.f131304e);
        return bundle;
    }

    private C53098a(C53100a aVar) {
        this.f131300a = aVar.f131305a;
        this.f131301b = aVar.f131306b;
        this.f131302c = aVar.f131307c;
        this.f131303d = aVar.f131308d;
        this.f131304e = aVar.f131309e;
    }
}
