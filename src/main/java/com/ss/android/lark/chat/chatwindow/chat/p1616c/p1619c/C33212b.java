package com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c;

import android.text.TextUtils;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.c.b */
public class C33212b extends AbstractC33211a {

    /* renamed from: a */
    private String f85418a;

    /* renamed from: b */
    private String f85419b;

    /* renamed from: c */
    private String f85420c;

    /* renamed from: d */
    private String f85421d;

    /* renamed from: e */
    private int f85422e;

    /* renamed from: f */
    private boolean f85423f;

    /* renamed from: g */
    private ChatBundle f85424g;

    /* renamed from: b */
    public String mo122433b() {
        return this.f85419b;
    }

    /* renamed from: c */
    public String mo122434c() {
        return this.f85420c;
    }

    /* renamed from: d */
    public String mo122435d() {
        return this.f85421d;
    }

    /* renamed from: e */
    public ChatBundle mo122436e() {
        return this.f85424g;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.AbstractC33211a
    /* renamed from: a */
    public String mo122430a() {
        return "ChatDataPreLoadTask_uniqueId:" + this.f85418a;
    }

    public C33212b(ChatBundle chatBundle) {
        String str;
        this.f85424g = chatBundle;
        this.f85419b = chatBundle.f74027a;
        this.f85420c = chatBundle.f74032f;
        this.f85421d = chatBundle.f74028b;
        this.f85422e = chatBundle.f74029c;
        this.f85423f = chatBundle.f74037k;
        if (!TextUtils.isEmpty(this.f85419b)) {
            str = this.f85419b;
        } else {
            str = this.f85421d;
        }
        this.f85418a = str;
    }

    /* renamed from: a */
    public void mo122431a(int i) {
        this.f85422e = i;
        this.f85424g.mo105917a(i);
        Log.m165389i("ChatDataPreLoadTask", "setShowPosition:" + i);
    }

    /* renamed from: a */
    public void mo122432a(String str) {
        this.f85419b = str;
        this.f85424g.mo105918a(str);
        Log.m165389i("ChatDataPreLoadTask", "setChatId:" + str);
    }
}
