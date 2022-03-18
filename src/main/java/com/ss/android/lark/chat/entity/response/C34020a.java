package com.ss.android.lark.chat.entity.response;

import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.entity.response.a */
public class C34020a {

    /* renamed from: a */
    public List<MessageInfo> f87907a;

    /* renamed from: b */
    public ThreadInfo f87908b;

    /* renamed from: c */
    public List<Integer> f87909c;

    /* renamed from: d */
    public List<Integer> f87910d;

    /* renamed from: e */
    public long f87911e;

    /* renamed from: f */
    public long f87912f;

    /* renamed from: g */
    public List<Long> f87913g;

    public C34020a() {
        this(new ArrayList(), new ArrayList(), null, new ArrayList());
    }

    public C34020a(List<MessageInfo> list, List<Integer> list2, ThreadInfo threadInfo, List<Integer> list3) {
        this.f87907a = list;
        this.f87909c = list2;
        this.f87908b = threadInfo;
        this.f87910d = list3;
    }
}
