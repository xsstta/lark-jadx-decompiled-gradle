package com.ss.android.lark.chatwindow.view.tip;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.common.utility.JsonUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.d */
public class C35326d<T> extends AbstractC35310a<T> {

    /* renamed from: e */
    private static final int f91299e = UIHelper.getDimens(R.dimen.title_height);

    /* renamed from: f */
    private int f91300f;

    /* renamed from: g */
    private int f91301g;

    /* renamed from: h */
    private int f91302h = -1;

    /* renamed from: i */
    private int f91303i;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: e */
    public boolean mo129947e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: f */
    public boolean mo129948f() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: c */
    public int mo129945c() {
        return this.f91302h - this.f91303i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: b */
    public int mo129943b() {
        if (this.f91301g > this.f91266b.mo129965e()) {
            return this.f91301g;
        }
        return this.f91266b.mo129963c();
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: d */
    public boolean mo129946d() {
        if (mo129945c() <= 0 || this.f91266b.mo129964d() != Chat.MessagePosition.NEWEST_UNREAD) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: h */
    public boolean mo129950h() {
        if (this.f91266b.mo129964d() != Chat.MessagePosition.NEWEST_UNREAD || !super.mo129950h() || mo129945c() <= 0 || !m138014n()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public void mo129938a() {
        this.f91303i = this.f91266b.mo129966f() + 1;
        this.f91301g = this.f91266b.mo129967g() + 1;
        this.f91302h = this.f91266b.mo129962b() + 1;
    }

    /* renamed from: n */
    private boolean m138014n() {
        String b;
        if (!C29990c.m110930b().ab().mo134600a("message.pull") || (b = C29990c.m110930b().ab().mo134602b("message.pull")) == null) {
            return true;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(b);
        } catch (JSONException e) {
            Log.m165397w("NewMessageTopTip", "configTraits is not JSON! " + e.getMessage());
        }
        if (jSONObject == null || JsonUtils.queryLong(jSONObject, "dataTimeLimit", -1) == -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public ViewGroup.LayoutParams mo129937a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f91300f + this.f91266b.mo129971k();
        }
        return layoutParams;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public void mo129941a(List<MessageInfo> list) {
        Iterator<MessageInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getMessage().getBadgeCount() >= this.f91302h) {
                it.remove();
            }
        }
        CollectionUtils.resetToList(this.f91265a, list);
        Collections.sort(this.f91265a);
        Collections.reverse(this.f91265a);
    }

    public C35326d(Context context, AbstractC35321c cVar) {
        super(context, cVar);
        int i = f91299e;
        this.f91300f = UIHelper.dp2px(8.0f) + i;
        if (cVar.mo129970j()) {
            this.f91300f = i + UIHelper.dp2px(8.0f) + UIHelper.dp2px(50.0f);
        } else {
            this.f91300f = i + UIHelper.dp2px(8.0f);
        }
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public void mo129942a(List<T> list, AbstractC35310a.AbstractC35312b<T> bVar) {
        for (T t : list) {
            int a = bVar.mo122236a(t);
            if (a != -1 && this.f91302h > a) {
                this.f91302h = a;
            }
        }
        super.mo129942a(list, bVar);
    }
}
