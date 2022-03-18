package com.ss.android.lark.threadwindow.p2760a.p2763c;

import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.a.c.a */
public class C56029a extends C33952a<ThreadInfo> {

    /* renamed from: a */
    private int f138543a;

    /* renamed from: b */
    private List<MessageInfo> f138544b = new ArrayList();

    /* renamed from: c */
    private int f138545c = 0;

    /* renamed from: a */
    public int mo191062a() {
        return this.f138543a;
    }

    /* renamed from: e */
    public List<MessageInfo> mo191066e() {
        return this.f138544b;
    }

    /* renamed from: f */
    public int mo191067f() {
        return this.f138545c;
    }

    public C56029a() {
    }

    /* renamed from: b */
    public void mo191064b(int i) {
        this.f138545c = i;
    }

    /* renamed from: d */
    public void mo191065d(List<MessageInfo> list) {
        this.f138544b = list;
    }

    /* renamed from: a */
    public void mo191063a(int i) {
        this.f138543a = i;
    }

    public C56029a(List<ThreadInfo> list, List<Integer> list2, List<Integer> list3) {
        super(list, list2, list3);
    }
}
