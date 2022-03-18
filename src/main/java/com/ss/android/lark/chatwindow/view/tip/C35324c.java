package com.ss.android.lark.chatwindow.view.tip;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35321c;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.c */
public class C35324c<T> {

    /* renamed from: a */
    private AbstractC35310a<T> f91286a;

    /* renamed from: b */
    private AbstractC35310a<T> f91287b;

    /* renamed from: c */
    private NewMessageTip f91288c;

    /* renamed from: d */
    private NewMessageTip f91289d;

    /* renamed from: e */
    private boolean f91290e;

    /* renamed from: f */
    private CallbackManager f91291f;

    /* renamed from: g */
    private AbstractC35321c f91292g;

    /* renamed from: h */
    private final Set<Integer> f91293h;

    /* renamed from: i */
    private AbstractC35325a f91294i;

    /* renamed from: j */
    private AndroidThrottle<Runnable> f91295j;

    /* renamed from: k */
    private boolean f91296k;

    /* renamed from: l */
    private boolean f91297l;

    /* renamed from: m */
    private boolean f91298m;

    /* renamed from: com.ss.android.lark.chatwindow.view.tip.c$a */
    public interface AbstractC35325a {
        void onAtMessageChanged(int i);
    }

    /* renamed from: c */
    public void mo129983c() {
        this.f91297l = true;
    }

    /* renamed from: a */
    public boolean mo129979a() {
        if (!this.f91296k) {
            Log.m165383e("NewMessageTipController", "Un-init");
        }
        return this.f91296k;
    }

    /* renamed from: a */
    public void mo129978a(List<MessageInfo> list, boolean z) {
        if (mo129979a()) {
            this.f91290e = z;
            this.f91287b.mo129944b(list);
            mo129986e();
        }
    }

    /* renamed from: b */
    public void mo129980b() {
        if (mo129979a()) {
            this.f91286a.mo129938a();
        }
    }

    /* renamed from: d */
    public void mo129985d() {
        if (mo129979a()) {
            mo129986e();
        }
    }

    /* renamed from: e */
    public void mo129986e() {
        mo129975a((Boolean) false);
    }

    /* renamed from: i */
    public void mo129990i() {
        mo129982b((Boolean) false);
    }

    /* renamed from: j */
    public void mo129991j() {
        mo129984c(false);
    }

    public C35324c() {
        this.f91290e = true;
        this.f91293h = new HashSet();
        this.f91298m = true;
        this.f91296k = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m137992l() {
        m137989a(this.f91286a, this.f91288c, true);
        m137989a(this.f91287b, this.f91289d, this.f91290e);
    }

    /* renamed from: f */
    public void mo129987f() {
        if (mo129979a()) {
            this.f91291f.cancelCallbacks();
            this.f91288c.setVisibility(8);
            this.f91289d.setVisibility(8);
            this.f91296k = false;
        }
    }

    /* renamed from: g */
    public void mo129988g() {
        if (mo129979a()) {
            this.f91288c.setLoadingState(true);
            this.f91289d.setLoadingState(true);
        }
    }

    /* renamed from: h */
    public void mo129989h() {
        if (mo129979a()) {
            this.f91288c.setLoadingState(false);
            this.f91289d.setLoadingState(false);
        }
    }

    /* renamed from: k */
    public void mo129992k() {
        if (mo129979a()) {
            NewMessageTip newMessageTip = this.f91288c;
            newMessageTip.mo129914a(this.f91286a.mo129937a(newMessageTip.getLayoutParams()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m137987a(View view) {
        this.f91286a.mo129949g();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m137990b(View view) {
        this.f91287b.mo129949g();
    }

    /* renamed from: a */
    public void mo129974a(AbstractC35325a aVar) {
        if (mo129979a()) {
            this.f91294i = aVar;
        }
    }

    /* renamed from: a */
    private void m137988a(NewMessageTip newMessageTip) {
        this.f91289d = newMessageTip;
        newMessageTip.mo129914a(this.f91287b.mo129937a(newMessageTip.getLayoutParams()));
        this.f91289d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$c$O7TuYAPJrmtY_dgeb35AnlLKzqc */

            public final void onClick(View view) {
                C35324c.this.m137990b((C35324c) view);
            }
        });
        this.f91289d.setArrowDirection(false);
    }

    /* renamed from: b */
    private void m137991b(NewMessageTip newMessageTip) {
        this.f91288c = newMessageTip;
        newMessageTip.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$c$QOxr5Tx7G55cAAQXGkHYp5TZlvQ */

            public final void onClick(View view) {
                C35324c.this.m137987a((C35324c) view);
            }
        });
        this.f91288c.mo129914a(this.f91286a.mo129937a(newMessageTip.getLayoutParams()));
        this.f91288c.setArrowDirection(true);
    }

    /* renamed from: c */
    public void mo129984c(Boolean bool) {
        if (mo129979a()) {
            this.f91287b.mo129955m();
            this.f91286a.mo129955m();
            mo129975a(bool);
        }
    }

    /* renamed from: a */
    public void mo129972a(int i) {
        if (mo129979a() && this.f91294i != null && !this.f91293h.contains(Integer.valueOf(i))) {
            this.f91293h.add(Integer.valueOf(i));
            this.f91294i.onAtMessageChanged(i);
        }
    }

    /* renamed from: b */
    public void mo129981b(int i) {
        if (mo129979a()) {
            this.f91287b.mo129939a(i);
            NewMessageTip newMessageTip = this.f91289d;
            newMessageTip.mo129914a(this.f91287b.mo129937a(newMessageTip.getLayoutParams()));
        }
    }

    /* renamed from: b */
    public void mo129982b(Boolean bool) {
        if (mo129979a()) {
            this.f91287b.mo129954l();
            this.f91286a.mo129954l();
            mo129975a(bool);
        }
    }

    /* renamed from: a */
    public void mo129973a(AbstractC35310a.AbstractC35313c cVar) {
        if (mo129979a()) {
            this.f91287b.mo129940a(cVar);
            this.f91286a.mo129940a(cVar);
        }
    }

    /* renamed from: a */
    public void mo129975a(Boolean bool) {
        if (mo129979a() && this.f91297l) {
            if (bool.booleanValue()) {
                m137992l();
            } else if (this.f91298m) {
                this.f91295j.mo93305b(new Runnable() {
                    /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$c$bbGNHm2aENKbvZmuT_GkVB9MLI */

                    public final void run() {
                        C35324c.this.m137992l();
                    }
                });
                this.f91298m = false;
            } else {
                this.f91295j.mo93303a(new Runnable() {
                    /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$c$bbGNHm2aENKbvZmuT_GkVB9MLI */

                    public final void run() {
                        C35324c.this.m137992l();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo129976a(List<MessageInfo> list) {
        ArrayList arrayList;
        if (mo129979a()) {
            if (this.f91292g.mo129964d() == Chat.MessagePosition.NEWEST_UNREAD) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(list);
            }
            this.f91286a.mo129941a(new ArrayList(list));
            this.f91287b.mo129941a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo129977a(List<T> list, AbstractC35310a.AbstractC35312b<T> bVar) {
        if (mo129979a()) {
            this.f91286a.mo129942a(list, bVar);
            this.f91287b.mo129942a(list, bVar);
            mo129986e();
        }
    }

    /* renamed from: a */
    private void m137989a(AbstractC35310a<?> aVar, NewMessageTip newMessageTip, boolean z) {
        if (mo129979a()) {
            if (!aVar.mo129946d()) {
                newMessageTip.mo129913a();
            } else if (aVar.mo129952j() && z) {
                AbstractC35310a.C35311a k = aVar.mo129953k();
                if (k != null) {
                    newMessageTip.mo129915a(k, k.f91271b);
                    mo129972a(k.f91270a);
                    return;
                }
                Log.m165382e("cannot get at content when show top tips");
            } else if (aVar.mo129950h() && z) {
                newMessageTip.mo129916a(aVar.mo129951i());
            } else if (aVar.mo129948f()) {
                newMessageTip.mo129917b();
            } else {
                newMessageTip.mo129913a();
            }
        }
    }

    public C35324c(Context context, AbstractC35321c cVar, NewMessageTip newMessageTip, NewMessageTip newMessageTip2, boolean z) {
        this.f91290e = true;
        this.f91293h = new HashSet();
        this.f91298m = true;
        this.f91286a = new C35326d(context, cVar);
        this.f91287b = new C35316b(context, cVar, z);
        this.f91292g = cVar;
        m137991b(newMessageTip);
        m137988a(newMessageTip2);
        this.f91291f = new CallbackManager();
        this.f91295j = new AndroidThrottle.C26229a().mo93309a(500L).mo93312a(new AndroidThrottle.C26230b()).mo93313a();
        this.f91296k = true;
    }
}
