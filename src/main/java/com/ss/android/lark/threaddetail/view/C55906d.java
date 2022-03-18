package com.ss.android.lark.threaddetail.view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.UnKnownContentVO;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33220b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.threaddetail.view.d */
public class C55906d extends AbstractView$OnClickListenerC58999a<ChatMessageVO> implements AbstractC55904c {

    /* renamed from: a */
    protected C1356d<C55905a> f138126a;

    /* renamed from: d */
    private final C1374g.AbstractC1378c f138127d;

    /* renamed from: e */
    private final C33220b f138128e = new C33220b(false);

    /* renamed from: com.ss.android.lark.threaddetail.view.d$a */
    public static class C55908a extends RecyclerView.Adapter implements AbstractC58983c<C55905a> {

        /* renamed from: a */
        private final C55906d f138130a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return null;
        }

        @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f138130a.getItemCount();
        }

        public C55908a(C55906d dVar) {
            this.f138130a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f138130a.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f138130a.unregisterAdapterDataObserver(adapterDataObserver);
        }

        /* renamed from: b */
        public C55905a mo31276a(int i) {
            return this.f138130a.f138126a.mo7374a().get(i);
        }
    }

    /* renamed from: a */
    public C55908a mo190626a() {
        return new C55908a(this);
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f138126a.mo7374a().size();
    }

    public C55906d() {
        C559071 r0 = new C1374g.AbstractC1378c<C55905a>() {
            /* class com.ss.android.lark.threaddetail.view.C55906d.C559071 */

            /* renamed from: a */
            public boolean areItemsTheSame(C55905a aVar, C55905a aVar2) {
                return C26247a.m94980a((AbstractC26248b) aVar, (AbstractC26248b) aVar2);
            }

            /* renamed from: b */
            public boolean areContentsTheSame(C55905a aVar, C55905a aVar2) {
                if (aVar.mo190584a() || aVar2.mo190584a()) {
                    return false;
                }
                return C26247a.m94983b(aVar, aVar2);
            }
        };
        this.f138127d = r0;
        this.f138126a = new C1356d<>(this, r0);
    }

    /* renamed from: b */
    private ChatMessageVO m217146b() {
        return ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) ((ChatMessageVO.Builder) new ChatMessageVO.Builder().mo124162h("")).mo124164i("")).mo124147a(Message.Type.UNKNOWN)).mo124166j("")).mo124168k("")).mo124150a(new UnKnownContentVO())).mo124291a();
    }

    @Override // com.ss.android.lark.threaddetail.view.AbstractC55904c
    /* renamed from: b */
    public C55905a mo190569b(int i) {
        return this.f138126a.mo7374a().get(i);
    }

    /* renamed from: c */
    public ChatMessageVO mo31276a(int i) {
        return m217145a(this.f138126a.mo7374a().get(i), i);
    }

    @Override // com.ss.android.lark.threaddetail.view.AbstractC55904c
    /* renamed from: a */
    public int mo190567a(String str) {
        List<C55905a> a = this.f138126a.mo7374a();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).mo190598f() != null && Objects.equals(a.get(i).mo190608k(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public int mo190629d(int i) {
        List<C55905a> a = this.f138126a.mo7374a();
        for (int i2 = 0; i2 < a.size(); i2++) {
            C55905a aVar = a.get(i2);
            if (aVar.mo190598f() != null && aVar.mo190610l().getThreadPosition() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private ChatMessageVO m217145a(C55905a aVar, int i) {
        if (aVar.mo190618s()) {
            ChatMessageVO b = m217146b();
            b.mo124276f(true);
            b.mo124275e(aVar.mo190571B());
            return b;
        } else if (aVar.mo190589b()) {
            ChatMessageVO b2 = m217146b();
            b2.mo124278h(true);
            return b2;
        } else if (aVar.mo190593c()) {
            ChatMessageVO b3 = m217146b();
            b3.mo124277g(true);
            b3.mo124268b(i - 1);
            return b3;
        } else {
            ChatMessageVO a = this.f138128e.mo122490a(aVar.mo190598f(), i);
            a.mo124268b(aVar.mo190598f().getMessage().getThreadPosition());
            a.mo124256a(aVar.mo190598f().getMessage().getRecallerIdentity());
            a.mo124275e(aVar.mo190571B());
            a.mo124273d(aVar.mo190615p());
            a.mo124279i(aVar.mo190614o());
            a.mo124257a(aVar.mo190622w());
            if (a.mo121699g() instanceof BaseTextContentVO) {
                ((BaseTextContentVO) a.mo121699g()).mo121779a(aVar.mo190612m());
                ((BaseTextContentVO) a.mo121699g()).mo121773a(aVar.mo190613n());
            }
            return a;
        }
    }

    @Override // com.ss.android.lark.threaddetail.view.AbstractC55904c
    /* renamed from: a */
    public void mo190568a(List<C55905a> list, boolean z) {
        boolean z2;
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<C55905a> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().mo190601g()) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            C55905a aVar = new C55905a();
            aVar.mo190605i(true);
            aVar.mo190611l(z);
            list.add(aVar);
        } else {
            C55905a aVar2 = new C55905a();
            aVar2.mo190588b(true);
            list.add(aVar2);
        }
        this.f138126a.mo7376a(list);
    }

    /* renamed from: a */
    public List<MessageInfo> mo190627a(int i, int i2, boolean z) {
        List<C55905a> a = this.f138126a.mo7374a();
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= 0) {
            if (z) {
                i2++;
            }
            if (i2 >= a.size()) {
                i2 = a.size();
            }
            if (i > i2) {
                return arrayList;
            }
            for (C55905a aVar : a.subList(i, i2)) {
                if (aVar.mo190598f() != null) {
                    arrayList.add(aVar.mo190598f());
                }
            }
        }
        return arrayList;
    }
}
