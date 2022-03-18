package com.ss.android.lark.pin.impl.v3;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.impl.entity.PinCacheEntity;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.entity.PinSubscribeSetting;
import com.ss.android.lark.pin.impl.service.PinService;
import com.ss.android.lark.pin.impl.statistics.ChatPinHitPoint;
import com.ss.android.lark.pin.impl.statistics.PinAppreciableHitPoint;
import com.ss.android.lark.pin.impl.v3.AbstractC51629c;
import com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.impl.v3.a */
public class C51522a extends BaseModel implements AbstractC51629c.AbstractC51630a {

    /* renamed from: a */
    public final AbstractC51629c.AbstractC51630a.AbstractC51631a f128247a;

    /* renamed from: b */
    public PinMessageInfoLoadDataHandler f128248b;

    /* renamed from: c */
    public PinMessageInfoSearchDataHandler f128249c;

    /* renamed from: d */
    public boolean f128250d;

    /* renamed from: e */
    public final int f128251e;

    /* renamed from: f */
    public final String f128252f;

    /* renamed from: g */
    public volatile PinSubscribeSetting f128253g = new PinSubscribeSetting();

    /* renamed from: h */
    private PinMessageInfoBaseDataHandler.OnDataChangedCallback f128254h;

    /* renamed from: i */
    private PinMessageInfoBaseDataHandler.OnDataChangedCallback f128255i;

    /* renamed from: j */
    private PinMessageInfoBaseDataHandler f128256j;

    /* renamed from: k */
    private volatile Chatter f128257k;

    /* renamed from: l */
    private Chat f128258l;

    /* renamed from: m */
    private final String f128259m;

    /* renamed from: n */
    private final boolean f128260n;

    /* renamed from: o */
    private final AbstractC51472a.AbstractC51474b f128261o;

    /* renamed from: p */
    private final AbstractC51472a f128262p;

    /* renamed from: q */
    private final AbstractC51472a.AbstractC51482i.AbstractC51483a f128263q = new AbstractC51472a.AbstractC51482i.AbstractC51483a() {
        /* class com.ss.android.lark.pin.impl.v3.$$Lambda$K4PJZZHYA1hGXNjKOMYKfkbYdjo */

        @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51482i.AbstractC51483a
        public final void onPushMessage(MessageInfo messageInfo) {
            C51522a.this.mo177472a(messageInfo);
        }
    };

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: b */
    public Chatter mo177477b() {
        return this.f128257k;
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: c */
    public Chat mo177480c() {
        return this.f128258l;
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: d */
    public String mo177481d() {
        return this.f128252f;
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: e */
    public String mo177482e() {
        return this.f128259m;
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: a */
    public boolean mo177476a(Message message) {
        return message != null && !TextUtils.isEmpty(message.getThreadId());
    }

    /* access modifiers changed from: public */
    /* renamed from: q */
    private /* synthetic */ void m199937q() {
        this.f128258l = this.f128261o.mo144079b(this.f128252f);
    }

    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m199938r() {
        this.f128257k = this.f128261o.mo144058a(this.f128262p.mo144031e());
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: g */
    public boolean mo177484g() {
        if (this.f128251e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m199931k() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$a$nsilkIHsaUn_nIkVYOYYg2JneaQ */

            public final void run() {
                C51522a.lambda$nsilkIHsaUn_nIkVYOYYg2JneaQ(C51522a.this);
            }
        });
    }

    /* renamed from: l */
    private void m199932l() {
        if (TextUtils.isEmpty(this.f128252f)) {
            this.f128258l = null;
        } else {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.pin.impl.v3.$$Lambda$a$pWaCl2ZeA3wcpBmOKRl43i9yyrw */

                public final void run() {
                    C51522a.lambda$pWaCl2ZeA3wcpBmOKRl43i9yyrw(C51522a.this);
                }
            });
        }
    }

    /* renamed from: n */
    private void m199934n() {
        PinSearchCache.m200339a(this.f128252f, new PinCacheEntity(this.f128249c.mo177656k(), this.f128247a.mo177507c(), this.f128249c.mo177638f()));
    }

    /* renamed from: o */
    private void m199935o() {
        this.f128262p.mo144028c().mo144043a(String.valueOf(hashCode()), this.f128252f, this.f128263q);
    }

    /* renamed from: p */
    private void m199936p() {
        this.f128262p.mo144028c().mo144044b(String.valueOf(hashCode()), this.f128252f, this.f128263q);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m199935o();
        m199931k();
        m199932l();
        if (!m199933m()) {
            PinAppreciableHitPoint.f128210a.mo177425b();
            mo177474a(true);
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f128249c.mo177630b(this.f128254h);
        this.f128248b.mo177630b(this.f128255i);
        m199936p();
        C36894a.m145605a().mo136207d();
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: h */
    public void mo177485h() {
        if (!TextUtils.isEmpty(this.f128249c.mo177656k())) {
            m199934n();
        }
    }

    /* renamed from: i */
    private void m199929i() {
        this.f128248b = new PinMessageInfoLoadDataHandler(this.f128252f, getCallbackManager(), new PinMessageInfoBaseDataHandler.IDataHandleCallback() {
            /* class com.ss.android.lark.pin.impl.v3.C51522a.C515231 */

            @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler.IDataHandleCallback
            /* renamed from: a */
            public void mo177486a(ErrorResult errorResult, boolean z) {
                boolean z2;
                int i;
                Log.m165383e("ChatPinModel2", "load pin error : " + errorResult);
                boolean a = C51522a.this.f128248b.mo177627a();
                if (!a || !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && !a) {
                    if (C51522a.this.f128251e == 1) {
                        i = 2;
                    } else if (C51522a.this.f128251e == 2) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                    PinAppreciableHitPoint.f128210a.mo177424a(i, C51522a.this.f128252f, 0, true, errorResult.getDebugMsg());
                }
                C51522a.this.f128247a.mo177502a((Boolean) false);
                if (z2) {
                    C51522a.this.mo177474a(false);
                } else {
                    C51522a.this.f128248b.mo177649d(true);
                }
            }

            @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler.IDataHandleCallback
            /* renamed from: a */
            public boolean mo177487a(ChatPinMessageEntity aVar, boolean z) {
                boolean z2;
                Log.m165389i("ChatPinModel2", "load Pin success");
                if (!C51522a.this.f128248b.mo177627a() || !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z) {
                    PinAppreciableHitPoint.f128210a.mo177426c();
                }
                if (!TextUtils.isEmpty(C51522a.this.f128249c.mo177656k())) {
                    return false;
                }
                C51522a.this.f128247a.mo177502a((Boolean) false);
                if (z2) {
                    C51522a.this.mo177474a(false);
                } else {
                    C51522a.this.f128248b.mo177648d(Math.max(C51522a.this.f128248b.mo177652m(), aVar.mo177264f()));
                    C51522a.this.f128248b.mo177646b(aVar.mo177258a());
                    C51522a.this.f128247a.mo177505a(aVar.mo177263e());
                    C51522a.this.mo177470a(aVar.mo177260b());
                    C51522a.this.f128248b.mo177649d(true);
                    if (z) {
                        C51522a.this.f128247a.mo177500a();
                    }
                }
                PinSearchCache.m200340b(C51522a.this.f128252f);
                return true;
            }
        });
        $$Lambda$a$Abl1ISXmPgfYW_5gDwOAegIHL34 r0 = new PinMessageInfoBaseDataHandler.OnDataChangedCallback() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$a$Abl1ISXmPgfYW_5gDwOAegIHL34 */

            @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler.OnDataChangedCallback
            public final void onDataChanged(List list, boolean z) {
                C51522a.lambda$Abl1ISXmPgfYW_5gDwOAegIHL34(C51522a.this, list, z);
            }
        };
        this.f128254h = r0;
        this.f128248b.mo177623a(r0);
        this.f128248b.mo177649d(false);
    }

    /* renamed from: j */
    private void m199930j() {
        this.f128249c = new PinMessageInfoSearchDataHandler(this.f128252f, getCallbackManager(), new PinMessageInfoBaseDataHandler.IDataHandleCallback() {
            /* class com.ss.android.lark.pin.impl.v3.C51522a.C515242 */

            @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler.IDataHandleCallback
            /* renamed from: a */
            public void mo177486a(ErrorResult errorResult, boolean z) {
                Log.m165383e("ChatPinModel2", "search pin error : " + errorResult);
                C51522a.this.f128247a.mo177502a((Boolean) false);
            }

            @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler.IDataHandleCallback
            /* renamed from: a */
            public boolean mo177487a(ChatPinMessageEntity aVar, boolean z) {
                boolean z2 = C51522a.this.f128250d;
                C51522a.this.f128250d = false;
                if (!TextUtils.equals(aVar.mo177261c(), C51522a.this.f128249c.mo177656k())) {
                    return false;
                }
                C51522a.this.f128247a.mo177502a((Boolean) false);
                C51522a.this.f128247a.mo177505a(aVar.mo177263e());
                if (!z || z2) {
                    return true;
                }
                C51522a.this.f128247a.mo177506b();
                return true;
            }
        });
        $$Lambda$a$YjHOvFF_ic9VPjNx6aOShKzFN8 r0 = new PinMessageInfoBaseDataHandler.OnDataChangedCallback() {
            /* class com.ss.android.lark.pin.impl.v3.$$Lambda$a$YjHOvFF_ic9VPjNx6aOShKzFN8 */

            @Override // com.ss.android.lark.pin.impl.v3.PinMessageInfoBaseDataHandler.OnDataChangedCallback
            public final void onDataChanged(List list, boolean z) {
                C51522a.m270888lambda$YjHOvFF_ic9VPjNx6aOShKzFN8(C51522a.this, list, z);
            }
        };
        this.f128255i = r0;
        this.f128249c.mo177623a(r0);
        if (!TextUtils.isEmpty(this.f128252f)) {
            this.f128249c.mo177655b(Collections.singletonList(this.f128252f));
        }
    }

    /* renamed from: m */
    private boolean m199933m() {
        PinCacheEntity a = PinSearchCache.m200338a(this.f128252f);
        if (a == null) {
            return false;
        }
        PinMessageInfoSearchDataHandler fVar = this.f128249c;
        this.f128256j = fVar;
        fVar.mo177653a(a.mo177385b());
        this.f128249c.mo177625a((List<? extends PinInfo>) a.mo177387d(), false);
        this.f128250d = true;
        this.f128247a.mo177503a(a.mo177385b());
        this.f128247a.mo177501a(a.mo177386c());
        return true;
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: f */
    public long mo177483f() {
        Log.m165389i("ChatPinModel2", "getLastPinReadTimeStamp:" + this.f128248b.mo177652m());
        if (this.f128248b.mo177650k()) {
            return this.f128248b.mo177652m();
        }
        return -1;
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: a */
    public boolean mo177475a() {
        return TextUtils.equals(this.f128262p.mo144031e(), this.f128259m);
    }

    /* renamed from: a */
    private boolean m199927a(Pin pin) {
        if (pin.getTimeStamp() > this.f128248b.mo177651l()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo177478b(String str) {
        PinService.f128155a.mo177338a(str, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.pin.impl.v3.C51522a.C515264 */

            /* renamed from: a */
            public void onSuccess(Void r2) {
                Log.m165389i("ChatPinModel2", "updatePinReadStatus succeeded");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("ChatPinModel2", "updatePinReadStatus failed");
            }
        });
    }

    /* renamed from: a */
    public void mo177470a(long j) {
        PinMessageInfoLoadDataHandler eVar = this.f128248b;
        eVar.mo177647c(Math.max(eVar.mo177651l(), j));
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: b */
    public void mo177479b(boolean z) {
        if (this.f128256j.mo177636d() && !this.f128256j.mo177635c()) {
            this.f128256j.mo177626a(z);
            this.f128256j.mo177629b(30);
        }
    }

    /* renamed from: a */
    public void mo177472a(MessageInfo messageInfo) {
        Pin pin;
        if (this.f128248b.mo177650k()) {
            Message message = messageInfo.getMessage();
            if (TextUtils.equals(message.getChatId(), this.f128252f)) {
                com.ss.android.lark.chat.entity.message.Pin pin2 = messageInfo.getPin();
                if (pin2 != null) {
                    pin = new Pin(pin2.getId(), pin2.getOperatorId(), pin2.getOperatorDisplayName(), pin2.getTimeStamp());
                } else {
                    pin = null;
                }
                Log.m165389i("ChatPinModel2", " push pin, curr Chat Id = " + this.f128252f + ", pin = " + messageInfo.getPin() + " ， msgId = " + message.getId());
                String a = this.f128261o.mo144063a(messageInfo.getMessageSender());
                String avatarKey = messageInfo.getMessageSender().getAvatarKey();
                String id = messageInfo.getMessageSender().getId();
                if (pin == null || message.isMessageDisable()) {
                    this.f128248b.mo177624a(Collections.singletonList(new PinInfo(message, pin, a, avatarKey, id)));
                } else if (m199927a(pin)) {
                    mo177470a(messageInfo.getPin().getTimeStamp());
                    PinInfo bVar = new PinInfo(message, pin, a, avatarKey, id);
                    bVar.mo177389a(PinModule.m199585b().mo144035i().mo144079b(message.getChatId()).getName());
                    this.f128248b.mo177631b(Collections.singletonList(bVar), false);
                }
                mo177478b(this.f128252f);
            }
        }
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: a */
    public void mo177473a(String str) {
        this.f128256j = this.f128249c;
        if (!this.f128250d) {
            this.f128247a.mo177502a((Boolean) true);
        }
        this.f128249c.mo177626a(false);
        this.f128249c.mo177653a(str);
        this.f128249c.mo177633c(30);
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: a */
    public void mo177474a(boolean z) {
        if (!this.f128248b.mo177635c()) {
            this.f128249c.mo177653a("");
            PinMessageInfoLoadDataHandler eVar = this.f128248b;
            this.f128256j = eVar;
            eVar.mo177626a(z);
            this.f128248b.mo177646b(0L);
            this.f128248b.mo177633c(30);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m199926a(List list, boolean z) {
        AbstractC51629c.AbstractC51630a.AbstractC51631a aVar = this.f128247a;
        if (aVar != null) {
            aVar.mo177504a(list, z, true);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m199928b(List list, boolean z) {
        AbstractC51629c.AbstractC51630a.AbstractC51631a aVar = this.f128247a;
        if (aVar != null) {
            aVar.mo177504a(list, z, false);
        }
    }

    @Override // com.ss.android.lark.pin.impl.v3.AbstractC51629c.AbstractC51630a
    /* renamed from: a */
    public void mo177471a(final Message message, final IGetDataCallback<Void> iGetDataCallback) {
        final String id = message.getId();
        final boolean equals = TextUtils.equals(this.f128259m, this.f128257k.getId());
        final String valueOf = String.valueOf(message.getType().getNumber());
        PinService.f128155a.mo177339a(id, false, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.pin.impl.v3.C51522a.C515253 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                ChatPinHitPoint.f128202a.mo177404a(C51522a.this.f128252f, valueOf, id, "-1", equals, "2");
            }

            /* renamed from: a */
            public void onSuccess(Void r9) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(r9);
                }
                C51522a.this.f128248b.mo177624a(Collections.singletonList(new PinInfo(message, null, "")));
                ChatPinHitPoint.f128202a.mo177404a(C51522a.this.f128252f, valueOf, id, "0", equals, "2");
            }
        }));
    }

    public C51522a(AbstractC51629c.AbstractC51630a.AbstractC51631a aVar, String str, int i, String str2, int i2, boolean z) {
        AbstractC51472a b = PinModule.m199585b();
        this.f128262p = b;
        this.f128261o = b.mo144035i();
        this.f128252f = str;
        this.f128259m = str2;
        this.f128260n = z;
        this.f128247a = aVar;
        this.f128251e = i;
        m199929i();
        m199930j();
    }
}
