package com.ss.android.lark.chatwindow.view.tip;

import android.content.Context;
import android.view.ViewGroup;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c;
import com.ss.android.lark.utils.UIHelper;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.b */
public class C35316b<T> extends AbstractC35310a<T> {

    /* renamed from: e */
    private int f91277e;

    /* renamed from: f */
    private boolean f91278f;

    /* renamed from: g */
    private int f91279g;

    /* renamed from: h */
    private final boolean f91280h;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: e */
    public boolean mo129947e() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: b */
    public int mo129943b() {
        return this.f91266b.mo129963c();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: f */
    public boolean mo129948f() {
        if (!this.f91266b.mo129968h() || this.f91268d) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: h */
    public boolean mo129950h() {
        if (!super.mo129950h() || mo129945c() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: c */
    public int mo129945c() {
        int b = this.f91266b.mo129962b() - this.f91279g;
        int a = this.f91266b.mo129960a();
        if (b < 0) {
            return 0;
        }
        return Math.min(a, b);
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: d */
    public boolean mo129946d() {
        if (mo129948f()) {
            return true;
        }
        if (this.f91266b.mo129964d() == Chat.MessagePosition.NEWEST_UNREAD) {
            if (!this.f91278f || mo129945c() <= 0) {
                return false;
            }
            return true;
        } else if (mo129945c() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public void mo129939a(int i) {
        this.f91277e = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public ViewGroup.LayoutParams mo129937a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (this.f91280h) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f91277e + UIHelper.dp2px(8.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = UIHelper.dp2px(84.0f);
            }
        }
        return layoutParams;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public void mo129941a(List<MessageInfo> list) {
        Iterator<MessageInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getMessage().getBadgeCount() <= this.f91279g) {
                it.remove();
            }
        }
        CollectionUtils.resetToList(this.f91265a, list);
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: b */
    public void mo129944b(List<MessageInfo> list) {
        Iterator<MessageInfo> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            MessageInfo next = it.next();
            Message message = next.getMessage();
            if (message.isFromMe() || (!message.isAtAll() && !message.isOtherAtMe())) {
                z = false;
            }
            if (z) {
                this.f91265a.add(next);
            }
        }
        Iterator it2 = this.f91265a.iterator();
        while (it2.hasNext()) {
            if (((MessageInfo) it2.next()).getMessage().getBadgeCount() <= this.f91266b.mo129966f()) {
                it2.remove();
            }
        }
        this.f91278f = true;
    }

    @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a
    /* renamed from: a */
    public void mo129942a(List<T> list, AbstractC35310a.AbstractC35312b<T> bVar) {
        for (T t : list) {
            this.f91279g = Math.max(this.f91279g, bVar.mo122236a(t));
        }
        super.mo129942a(list, bVar);
    }

    public C35316b(Context context, AbstractC35321c cVar, boolean z) {
        super(context, cVar);
        this.f91280h = z;
    }
}
