package com.ss.android.lark.ai.smartreply;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.C28616a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyRequest;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28619b;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28623e;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28624f;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.ai.smartreply.p1343a.C28595f;
import com.ss.android.lark.ai.smartreply.p1345c.AbstractC28605a;
import com.ss.android.lark.ai.statistics.smartreply.ISmartReplyHitpoint;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.widget.linked_emojicon.base.C58503b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.c */
public class C28601c implements AbstractC28621d {

    /* renamed from: a */
    Pair<SmartReplyRequest, C28616a> f71970a;

    /* renamed from: b */
    AbstractC28623e f71971b;

    /* renamed from: c */
    public final ISmartReplyHitpoint f71972c;

    /* renamed from: d */
    private final LinkedList<Pair<SmartReplyRequest, C28616a>> f71973d = new LinkedList<>();

    /* renamed from: e */
    private MessageInfo f71974e;

    /* renamed from: f */
    private final ISmartReplyInterface f71975f;

    /* renamed from: g */
    private final Chat f71976g;

    /* renamed from: h */
    private final AbstractC28534a f71977h;

    /* renamed from: i */
    private final AbstractC28605a f71978i;

    /* renamed from: j */
    private final AbstractC28619b f71979j;

    /* renamed from: k */
    private final C28595f f71980k;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
    /* renamed from: b */
    public void mo101542b() {
        mo101806a();
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28621d
    /* renamed from: a */
    public boolean mo101813a(int i, int i2, Intent intent) {
        return this.f71980k.mo101790a(i, i2, intent);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28621d
    /* renamed from: a */
    public void mo101812a(boolean z) {
        AbstractC28623e eVar;
        if (!z && (eVar = this.f71971b) != null && !eVar.mo101833d()) {
            return;
        }
        if ((!m104884i() && !this.f71977h.mo101558a("suite.ai.smart_reply.autoshow")) || this.f71979j.mo101784a()) {
            return;
        }
        if (z) {
            mo101818e();
        } else {
            mo101806a();
        }
    }

    /* renamed from: d */
    public ISmartReplyInterface.ReplyAction mo101817d() {
        return this.f71975f.mo101864d();
    }

    /* renamed from: h */
    private boolean m104883h() {
        return this.f71977h.mo101558a("one_click_dating_enabled");
    }

    /* renamed from: i */
    private boolean m104884i() {
        return this.f71977h.mo101558a("suite.ai.smart_reply.enabled");
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28621d
    /* renamed from: c */
    public void mo101816c() {
        this.f71979j.mo101786b(this);
        this.f71979j.mo101789d();
        this.f71971b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo101818e() {
        this.f71975f.mo101862a(new ISmartReplyInterface.AbstractC28617a() {
            /* class com.ss.android.lark.ai.smartreply.$$Lambda$c$vnkV7gsrbmK2Y_SjARPiEhDDcio */

            @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface.AbstractC28617a
            public final void onSuccess(boolean z, MessageInfo messageInfo) {
                C28601c.this.m104877a((C28601c) z, (boolean) messageInfo);
            }
        });
    }

    /* renamed from: g */
    private boolean m104882g() {
        if (this.f71975f.mo101864d() == ISmartReplyInterface.ReplyAction.THREAD_REPLY || !this.f71979j.mo101787b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo101806a() {
        this.f71970a = null;
        AbstractC28623e eVar = this.f71971b;
        if (eVar != null && eVar.mo101833d()) {
            this.f71971b.mo101829a(null, true);
            this.f71971b.mo101832c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.ai.smartreply.c$2 */
    public static /* synthetic */ class C286032 {

        /* renamed from: a */
        static final /* synthetic */ int[] f71983a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface$ReplyAction[] r0 = com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface.ReplyAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.ai.smartreply.C28601c.C286032.f71983a = r0
                com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface$ReplyAction r1 = com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface.ReplyAction.THREAD_REPLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.ai.smartreply.C28601c.C286032.f71983a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface$ReplyAction r1 = com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface.ReplyAction.CHAT_REPLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.ai.smartreply.C28601c.C286032.f71983a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface$ReplyAction r1 = com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface.ReplyAction.INPUT_DIRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ai.smartreply.C28601c.C286032.<clinit>():void");
        }
    }

    /* renamed from: f */
    private SmartReplyRequest.Scene m104881f() {
        int i = C286032.f71983a[mo101817d().ordinal()];
        if (i == 1) {
            return SmartReplyRequest.Scene.MESSENGER_THREAD;
        }
        if (i == 2) {
            return SmartReplyRequest.Scene.MESSENGER_REPLY;
        }
        if (i != 3) {
            return SmartReplyRequest.Scene.MESSENGER;
        }
        return SmartReplyRequest.Scene.MESSENGER;
    }

    /* renamed from: a */
    private void m104876a(SmartReplyRequest smartReplyRequest) {
        this.f71978i.mo101821a(smartReplyRequest, new C28604a(this, smartReplyRequest));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ai.smartreply.c$a */
    public static class C28604a extends UIGetDataCallback<C28616a> {

        /* renamed from: a */
        private final WeakReference<C28601c> f71984a;

        /* renamed from: b */
        private final SmartReplyRequest f71985b;

        /* renamed from: a */
        public void onSuccessed(C28616a aVar) {
            C28601c cVar = this.f71984a.get();
            if (cVar != null) {
                cVar.mo101808a(this.f71985b, aVar);
            }
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            C28601c cVar = this.f71984a.get();
            if (cVar != null) {
                cVar.mo101808a(this.f71985b, (C28616a) null);
            }
        }

        C28604a(C28601c cVar, SmartReplyRequest smartReplyRequest) {
            this.f71984a = new WeakReference<>(cVar);
            this.f71985b = smartReplyRequest;
        }
    }

    /* renamed from: b */
    private List<SmartReplyItem> m104878b(List<SmartReplyItem> list) {
        ArrayList arrayList = new ArrayList();
        for (SmartReplyItem smartReplyItem : list) {
            Iterator<SmartReplyItem.Type> it = this.f71980k.mo101799c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (smartReplyItem.mo101843d() == it.next()) {
                    arrayList.add(smartReplyItem);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
    /* renamed from: a */
    public void mo101540a(int i) {
        if (m104884i() || this.f71979j.mo101788c()) {
            mo101818e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104875a(SmartReplyItem smartReplyItem) {
        Message message;
        Pair<SmartReplyRequest, C28616a> pair = this.f71970a;
        if (!(pair == null || pair.first == null || this.f71970a.second == null)) {
            CharSequence a = C58503b.m226963a((CharSequence) smartReplyItem.mo101841b());
            MessageInfo a2 = ((SmartReplyRequest) this.f71970a.first).mo101850a();
            C28616a aVar = (C28616a) this.f71970a.second;
            this.f71972c.mo101598a(a2.getMessage().getChatId(), mo101817d().getValue(), a2.getMessage().getId(), a2.getMessage().getMessageLanguage(), smartReplyItem.mo101842c(), Integer.valueOf(a.length()), Integer.valueOf(aVar.mo101859b()), aVar.mo101860c());
        }
        Pair<SmartReplyRequest, C28616a> pair2 = this.f71970a;
        if (pair2 == null || pair2.first == null) {
            message = null;
        } else {
            message = ((SmartReplyRequest) this.f71970a.first).mo101850a().getMessage();
        }
        mo101807a(smartReplyItem, message);
        mo101806a();
        this.f71977h.mo101553a().mo101567a("mobile_chat_ai_suggestions", true);
    }

    /* renamed from: b */
    private void m104880b(MessageInfo messageInfo) {
        if (m104884i() && this.f71977h.mo101559b().mo101569a() && messageInfo.getMessage().getStatus() != Message.Status.DELETED && messageInfo.canShow() && messageInfo.getMessageSender() != null && !messageInfo.getMessageSender().isBot() && !messageInfo.getMessageSender().isDimission()) {
            Pair<SmartReplyRequest, C28616a> pair = this.f71970a;
            if (pair != null && pair.first != null && this.f71970a.second != null && TextUtils.equals(messageInfo.getId(), ((SmartReplyRequest) this.f71970a.first).mo101853d())) {
                return;
            }
            if (this.f71975f.mo101865e()) {
                mo101806a();
                return;
            }
            this.f71974e = messageInfo;
            SmartReplyRequest smartReplyRequest = new SmartReplyRequest(messageInfo, m104881f());
            Iterator<Pair<SmartReplyRequest, C28616a>> it = this.f71973d.iterator();
            while (it.hasNext()) {
                Pair<SmartReplyRequest, C28616a> next = it.next();
                if (next.first != null && next.second != null && ((SmartReplyRequest) next.first).equals(smartReplyRequest)) {
                    m104879b(smartReplyRequest, (C28616a) next.second);
                    return;
                }
            }
            m104876a(smartReplyRequest);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28620c
    /* renamed from: a */
    public void mo101809a(MessageInfo messageInfo) {
        if (m104884i() && !m104882g() && this.f71979j.mo101784a() && this.f71979j.mo101788c() && this.f71979j.mo101785a(false) && !messageInfo.getMessage().isFromMe()) {
            mo101810a(messageInfo, false);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28621d
    /* renamed from: a */
    public void mo101811a(List<SmartReplyItem> list) {
        this.f71971b.mo101831b();
        this.f71971b.mo101829a(list, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104877a(boolean z, MessageInfo messageInfo) {
        if (messageInfo != null) {
            mo101810a(messageInfo, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo101807a(SmartReplyItem smartReplyItem, Message message) {
        this.f71980k.mo101791a(this.f71975f, smartReplyItem, message);
    }

    /* renamed from: b */
    private void m104879b(SmartReplyRequest smartReplyRequest, C28616a aVar) {
        if (aVar != null && this.f71971b != null && this.f71974e != null && TextUtils.equals(smartReplyRequest.mo101853d(), this.f71974e.getId())) {
            List<SmartReplyItem> b = m104878b(aVar.mo101858a());
            if (!b.isEmpty()) {
                this.f71970a = new Pair<>(smartReplyRequest, aVar);
                this.f71971b.mo101831b();
                this.f71971b.mo101829a(b, true);
                this.f71972c.mo101599a(smartReplyRequest.mo101852c(), mo101817d().getValue(), smartReplyRequest.mo101853d(), smartReplyRequest.mo101850a().getMessage().getMessageLanguage(), aVar.mo101861d(), Integer.valueOf(aVar.mo101859b()), aVar.mo101860c());
                if (!m104882g()) {
                    this.f71975f.mo101863c();
                }
            } else if (!this.f71971b.mo101830a()) {
                mo101806a();
            }
        }
    }

    /* renamed from: a */
    public void mo101808a(SmartReplyRequest smartReplyRequest, C28616a aVar) {
        if (aVar != null && !aVar.mo101858a().isEmpty()) {
            this.f71973d.add(new Pair<>(smartReplyRequest, aVar));
            if (this.f71973d.size() > 20) {
                LinkedList<Pair<SmartReplyRequest, C28616a>> linkedList = this.f71973d;
                linkedList.remove(linkedList.removeLast());
            }
        }
        m104879b(smartReplyRequest, aVar);
    }

    /* renamed from: a */
    public void mo101810a(MessageInfo messageInfo, boolean z) {
        if (this.f71979j.mo101785a(z)) {
            m104880b(messageInfo);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mo101806a();
    }

    public C28601c(Chat chat, ViewGroup viewGroup, AbstractC28619b bVar, ISmartReplyInterface iSmartReplyInterface, AbstractC28534a aVar, AbstractC28605a aVar2, ISmartReplyHitpoint aVar3) {
        this.f71971b = new C28610d(viewGroup);
        this.f71979j = bVar;
        this.f71975f = iSmartReplyInterface;
        this.f71976g = chat;
        this.f71977h = aVar;
        this.f71978i = aVar2;
        this.f71972c = aVar3;
        bVar.mo101780a(this);
        C28595f fVar = new C28595f(aVar);
        this.f71980k = fVar;
        if (m104883h()) {
            fVar.mo101796a(chat);
        }
        fVar.mo101794a().mo101798b(bVar, chat).mo101795a(bVar, chat).mo101797b();
        this.f71971b.mo101827a(new AbstractC28624f() {
            /* class com.ss.android.lark.ai.smartreply.$$Lambda$c$E23Sdk8tZ18J5op1ZxXMkb6qOyE */

            @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28624f
            public final void onSuggestionClick(SmartReplyItem smartReplyItem) {
                C28601c.this.m104875a((C28601c) smartReplyItem);
            }
        });
        this.f71971b.mo101826a(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.ai.smartreply.C28601c.C286021 */

            /* renamed from: a */
            boolean f71981a;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    this.f71981a = false;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (Math.abs(i) > 10 && !this.f71981a && C28601c.this.f71970a != null && C28601c.this.f71970a.first != null && C28601c.this.f71970a.second != null) {
                    this.f71981a = true;
                    MessageInfo a = ((SmartReplyRequest) C28601c.this.f71970a.first).mo101850a();
                    C28601c.this.f71972c.mo101597a(a.getMessage().getChatId(), C28601c.this.mo101817d().getValue(), a.getMessage().getId(), a.getMessage().getMessageLanguage(), Integer.valueOf(((C28616a) C28601c.this.f71970a.second).mo101859b()), i);
                }
            }
        });
    }
}
