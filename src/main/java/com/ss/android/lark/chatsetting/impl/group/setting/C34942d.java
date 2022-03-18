package com.ss.android.lark.chatsetting.impl.group.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.widget.listener.C58546g;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.d */
public class C34942d extends BaseAdapter {

    /* renamed from: c */
    private static final int f90207c;

    /* renamed from: d */
    private static final int f90208d;

    /* renamed from: e */
    private static int f90209e;

    /* renamed from: a */
    List<C34945e> f90210a = new ArrayList();

    /* renamed from: b */
    public AbstractC34944a f90211b;

    /* renamed from: f */
    private Context f90212f;

    /* renamed from: g */
    private Chat f90213g;

    /* renamed from: h */
    private boolean f90214h = true;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.d$a */
    public interface AbstractC34944a {
        /* renamed from: a */
        void mo128070a(C34945e eVar, View view);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f90210a.size();
    }

    static {
        int c = C34945e.m136037c();
        f90207c = c;
        f90208d = c - 1;
    }

    /* renamed from: a */
    private void m136023a() {
        f90209e = f90208d;
        if (C34501a.m133936b(this.f90213g) && this.f90213g.getUserCount() > 1) {
            f90209e--;
        }
        if (f90209e <= 0) {
            f90209e = 1;
        }
    }

    /* renamed from: c */
    private void m136032c() {
        if (!CollectionUtils.isEmpty(this.f90210a)) {
            Iterator<C34945e> it = this.f90210a.iterator();
            while (it.hasNext()) {
                C34945e next = it.next();
                if (next.mo128870a() == 2) {
                    it.remove();
                } else if (next.mo128870a() == 3) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    private void m136028b() {
        if (this.f90214h) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Chat chat = this.f90213g;
            if (chat == null || !chat.isSecret() || !a.mo127296z() || a.mo127256A()) {
                C34945e eVar = new C34945e(this.f90212f);
                eVar.mo128872a(2);
                this.f90210a.add(eVar);
                if (C34501a.m133936b(this.f90213g) && this.f90213g.getUserCount() > 1) {
                    C34945e eVar2 = new C34945e(this.f90212f);
                    eVar2.mo128872a(3);
                    this.f90210a.add(eVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo128863a(AbstractC34944a aVar) {
        this.f90211b = aVar;
    }

    public int getItemViewType(int i) {
        C34945e eVar = (C34945e) getItem(i);
        if (eVar != null) {
            return eVar.mo128870a();
        }
        return -1;
    }

    public Object getItem(int i) {
        if (i < 0 || i > this.f90210a.size()) {
            return null;
        }
        return this.f90210a.get(i);
    }

    /* renamed from: a */
    private void m136024a(int i) {
        m136023a();
        m136032c();
        this.f90210a = m136031c(this.f90210a, i);
        for (int i2 = 0; i2 < this.f90210a.size(); i2++) {
            m136025a(this.f90210a.get(i2), i2, i);
        }
        m136028b();
    }

    /* renamed from: a */
    private boolean m136027a(List<ChatChatter> list) {
        boolean z;
        Iterator<C34945e> it = this.f90210a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C34945e next = it.next();
            if (next.mo128875b() != null) {
                Iterator<ChatChatter> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (next.mo128875b().getId().equals(it2.next().getId())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    it.remove();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: b */
    private boolean m136030b(List<ChatChatter> list) {
        boolean z;
        boolean z2 = false;
        for (ChatChatter chatChatter : list) {
            Iterator<C34945e> it = this.f90210a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C34945e next = it.next();
                if (next.mo128875b() != null && next.mo128875b().getId().equals(chatChatter.getId())) {
                    z = true;
                    break;
                }
            }
            if (this.f90210a.size() > f90207c) {
                return true;
            }
            if (!z) {
                C34945e eVar = new C34945e(this.f90212f);
                eVar.mo128873a(chatChatter);
                eVar.mo128872a(1);
                this.f90210a.add(eVar);
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    private void m136026a(List<ChatChatter> list, int i) {
        m136023a();
        m136029b(m136031c(list, i), i);
    }

    /* renamed from: c */
    private <T> List<T> m136031c(List<T> list, int i) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        }
        return list.subList(0, Math.min(f90209e, list.size()));
    }

    /* renamed from: a */
    public void mo128862a(Chat chat, List<ChatChatter> list) {
        if (list != null) {
            boolean a = m136027a(list);
            if (m136030b(list)) {
                a = true;
            }
            if (a) {
                this.f90213g = chat;
                m136024a(list.size());
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    private void m136029b(List<ChatChatter> list, int i) {
        this.f90210a.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C34945e eVar = new C34945e(this.f90212f);
            eVar.mo128873a(list.get(i2));
            m136025a(eVar, i2, i);
            this.f90210a.add(eVar);
        }
        m136028b();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo128864a(List<ChatChatter> list, Chat chat) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f90210a.clear();
            this.f90213g = chat;
            m136026a(list, chat.getUserCount());
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m136025a(C34945e eVar, int i, int i2) {
        eVar.mo128872a(1);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        final C34945e eVar = (C34945e) getItem(i);
        if (eVar == null) {
            return new View(this.f90212f);
        }
        View a = eVar.mo128871a(view, viewGroup);
        a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34942d.C349431 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C58546g.m227072a().mo198455a(view);
                if (C34942d.this.f90211b != null) {
                    C34942d.this.f90211b.mo128070a(eVar, view);
                }
            }
        });
        return a;
    }

    public C34942d(Context context, List<ChatChatter> list, Chat chat, boolean z) {
        int i;
        this.f90212f = context;
        this.f90213g = chat;
        this.f90214h = z;
        if (chat == null) {
            i = 0;
        } else {
            i = chat.getUserCount();
        }
        m136026a(list, i);
    }
}
