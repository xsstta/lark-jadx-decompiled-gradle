package com.ss.android.lark.chat.entity.response;

import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.entity.response.b */
public class C34021b {

    /* renamed from: a */
    public final List<ThreadInfo> f87914a;

    /* renamed from: b */
    public final List<Integer> f87915b;

    /* renamed from: c */
    public final List<Integer> f87916c;

    /* renamed from: d */
    public long f87917d;

    /* renamed from: e */
    public long f87918e;

    /* renamed from: f */
    public List<Long> f87919f;

    /* renamed from: g */
    public int f87920g;

    /* renamed from: h */
    public List<MessageInfo> f87921h;

    /* renamed from: i */
    public int f87922i;

    public C34021b() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), 0, new ArrayList(), 0);
    }

    public C34021b(List<ThreadInfo> list, List<Integer> list2, List<Integer> list3, int i, List<MessageInfo> list4, int i2) {
        this.f87914a = list;
        this.f87915b = list2;
        this.f87916c = list3;
        this.f87920g = i;
        this.f87921h = list4;
        this.f87922i = i2;
    }
}
