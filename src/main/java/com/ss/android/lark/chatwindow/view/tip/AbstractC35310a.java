package com.ss.android.lark.chatwindow.view.tip;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.a */
public abstract class AbstractC35310a<T> {

    /* renamed from: a */
    protected List<MessageInfo> f91265a = new ArrayList();

    /* renamed from: b */
    protected AbstractC35321c f91266b;

    /* renamed from: c */
    protected Context f91267c;

    /* renamed from: d */
    protected boolean f91268d;

    /* renamed from: e */
    private AbstractC35313c f91269e;

    /* renamed from: com.ss.android.lark.chatwindow.view.tip.a$a */
    public static class C35311a {

        /* renamed from: a */
        public int f91270a;

        /* renamed from: b */
        public String f91271b;

        /* renamed from: c */
        public String f91272c = "";

        /* renamed from: d */
        public String f91273d;

        /* renamed from: e */
        public String f91274e;

        /* renamed from: f */
        public int f91275f;

        /* renamed from: g */
        public int f91276g;
    }

    /* renamed from: com.ss.android.lark.chatwindow.view.tip.a$b */
    public interface AbstractC35312b<T> {
        /* renamed from: a */
        int mo122236a(T t);

        /* renamed from: a */
        boolean mo122238a(String str, T t);
    }

    /* renamed from: com.ss.android.lark.chatwindow.view.tip.a$c */
    public interface AbstractC35313c {
        /* renamed from: a */
        void mo122142a(int i, boolean z);

        /* renamed from: a */
        void mo122143a(Message message);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ViewGroup.LayoutParams mo129937a(ViewGroup.LayoutParams layoutParams);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo129938a() {
    }

    /* renamed from: a */
    public void mo129939a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo129941a(List<MessageInfo> list);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo129943b();

    /* renamed from: b */
    public void mo129944b(List<MessageInfo> list) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo129945c();

    /* renamed from: d */
    public abstract boolean mo129946d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo129947e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo129948f();

    /* renamed from: l */
    public void mo129954l() {
        this.f91268d = true;
    }

    /* renamed from: m */
    public void mo129955m() {
        this.f91268d = false;
    }

    /* renamed from: h */
    public boolean mo129950h() {
        return !this.f91268d;
    }

    /* renamed from: j */
    public boolean mo129952j() {
        if (this.f91268d || this.f91265a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private MessageInfo m137894n() {
        if (!this.f91265a.isEmpty()) {
            return this.f91265a.get(0);
        }
        return null;
    }

    /* renamed from: i */
    public String mo129951i() {
        int c = mo129945c();
        Map<String, Integer> i = this.f91266b.mo129969i();
        if (c == 1) {
            return UIHelper.mustacheFormat(i.get("singular").intValue(), "count", Integer.toString(c));
        }
        return UIHelper.mustacheFormat(i.get("plural").intValue(), "count", Integer.toString(c));
    }

    /* renamed from: g */
    public void mo129949g() {
        if (!this.f91265a.isEmpty()) {
            Message message = this.f91265a.get(0).getMessage();
            this.f91269e.mo122143a(message);
            ChatHitPoint.f135648a.mo187348a(mo129945c(), mo129947e(), message.isAtAll(), message.isSecret());
        } else if (mo129945c() > 0) {
            this.f91269e.mo122142a(mo129943b(), true ^ mo129947e());
            ChatHitPoint.f135648a.mo187347a(mo129945c(), mo129947e());
        } else if (mo129948f()) {
            this.f91269e.mo122142a(mo129943b(), true);
            ChatHitPoint.f135648a.mo187346a(mo129945c());
        } else {
            Log.m165382e("BaseNewMessageTiphandleOnTipClick, unReadAtMessage is 0, newMessageCount is 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C35311a mo129953k() {
        String str;
        MessageInfo n = m137894n();
        if (n == null || n.getMessageSender() == null || n.getMessage().isFromMe()) {
            this.f91265a.remove(n);
            return null;
        }
        ChatChatter messageSender = n.getMessageSender();
        String a = C34340h.m133174a(messageSender, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
        Message message = n.getMessage();
        if (message.isAtAll()) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AtAllUser, "chatter_name", a);
        } else if (message.isOtherAtMe()) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AtWindowTip, "chatter_name", a);
        } else {
            Log.m165383e("chatwindow", "show at tip, but message is not at me or at all. message: " + message);
            this.f91265a.remove(n);
            return null;
        }
        C35311a aVar = new C35311a();
        aVar.f91270a = this.f91266b.mo129961a(message);
        aVar.f91271b = str;
        if (!TextUtils.isEmpty(str)) {
            aVar.f91272c = str.replace(a, "");
        }
        aVar.f91273d = messageSender.getAvatarKey();
        aVar.f91274e = messageSender.getId();
        aVar.f91275f = 24;
        aVar.f91276g = 24;
        return aVar;
    }

    /* renamed from: a */
    public void mo129940a(AbstractC35313c cVar) {
        this.f91269e = cVar;
    }

    AbstractC35310a(Context context, AbstractC35321c cVar) {
        this.f91267c = context;
        this.f91266b = cVar;
    }

    /* renamed from: a */
    public void mo129942a(List<T> list, AbstractC35312b<T> bVar) {
        for (T t : list) {
            Iterator<MessageInfo> it = this.f91265a.iterator();
            while (it.hasNext()) {
                if (bVar.mo122238a(it.next().getMessage().getId(), t)) {
                    it.remove();
                }
            }
        }
    }
}
