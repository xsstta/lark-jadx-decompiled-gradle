package com.ss.android.lark.readstate.p2565b;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.readstate.b.b */
public class C53097b {

    /* renamed from: a */
    List<ChatChatter> f131297a;

    /* renamed from: b */
    List<ChatChatter> f131298b;

    /* renamed from: c */
    private String f131299c;

    /* renamed from: a */
    public String mo181365a() {
        return this.f131299c;
    }

    /* renamed from: b */
    public List<ChatChatter> mo181366b() {
        return this.f131297a;
    }

    /* renamed from: c */
    public List<ChatChatter> mo181367c() {
        return this.f131298b;
    }

    public C53097b(String str, List<ChatChatter> list, List<ChatChatter> list2) {
        this.f131299c = str;
        this.f131297a = list;
        this.f131298b = list2;
        if (list == null) {
            this.f131297a = new ArrayList();
        }
        if (this.f131298b == null) {
            this.f131298b = new ArrayList();
        }
    }
}
