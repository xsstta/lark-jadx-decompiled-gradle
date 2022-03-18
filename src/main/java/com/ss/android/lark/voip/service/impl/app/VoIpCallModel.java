package com.ss.android.lark.voip.service.impl.app;

import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.AbstractC58041d;
import com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.CalleeToCallTimeClockEvent;
import com.ss.android.lark.voip.service.impl.statistics.OnCallToStreamEvent;
import com.ss.android.lark.voip.service.impl.statistics.VoipFinishType;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.C61022a;
import java.util.UUID;

public class VoIpCallModel extends BaseModel implements AbstractC58041d.AbstractC58042a {

    /* renamed from: a */
    public VoiceCall f142727a;

    /* renamed from: b */
    public AbstractC58041d.AbstractC58042a.AbstractC58043a f142728b;

    /* renamed from: c */
    private Chatter f142729c;

    /* renamed from: d */
    private boolean f142730d;

    /* renamed from: e */
    private boolean f142731e;

    /* renamed from: f */
    private CallbackManager f142732f;

    /* renamed from: g */
    private C58136v f142733g;

    /* renamed from: h */
    private AbstractC58046e f142734h;

    /* renamed from: i */
    private String f142735i;

    /* renamed from: j */
    private String f142736j;

    /* renamed from: k */
    private AbstractC61058j f142737k = new C61022a() {
        /* class com.ss.android.lark.voip.service.impl.app.VoIpCallModel.C580221 */

        @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
        /* renamed from: a */
        public void mo196738a(int i) {
            super.mo196738a(i);
            for (int i2 : AbstractC58146c.f143038a) {
                if (i == i2) {
                    C58103o.m225371a().mo196927a(i);
                    return;
                }
            }
        }
    };

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: a */
    public Chatter mo196718a() {
        return this.f142729c;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: b */
    public boolean mo196722b() {
        return this.f142730d;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: c */
    public boolean mo196723c() {
        return this.f142731e;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: f */
    public VoiceCall mo196726f() {
        return this.f142727a;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: g */
    public String mo196727g() {
        return this.f142735i;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: n */
    public C58136v mo196734n() {
        return this.f142733g;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: d */
    public boolean mo196724d() {
        return this.f142734h.mo196810b();
    }

    /* renamed from: p */
    private void m225047p() {
        C58136v vVar = this.f142733g;
        if (vVar != null) {
            vVar.mo197017b();
            this.f142733g = null;
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: e */
    public VoiceCall.Status mo196725e() {
        VoiceCall voiceCall = this.f142727a;
        if (voiceCall == null) {
            return VoiceCall.Status.NONE;
        }
        return voiceCall.getStatus();
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: k */
    public void mo196731k() {
        VoipHitPoint.m225609a(this.f142727a.getId(), C58133t.m225480a(this.f142727a));
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: m */
    public void mo196733m() {
        if (this.f142733g.mo197019c()) {
            this.f142734h.mo196807a(true);
            return;
        }
        AbstractC58046e eVar = this.f142734h;
        eVar.mo196807a(true ^ eVar.mo196810b());
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        EventBus.getDefault().register(this);
        C58103o.m225371a().mo196933a(this.f142737k);
        C58136v f = C58136v.m225487f();
        this.f142733g = f;
        f.mo197014a(this);
        this.f142733g.mo197013a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        CallbackManager callbackManager = this.f142732f;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
        }
        if (this.f142733g != null && !VoIPFloatIcon.m225001a().mo196672b()) {
            this.f142733g.mo197017b();
            this.f142733g.mo197022g();
            this.f142733g = null;
        }
        C58103o.m225371a().mo196941b(this.f142737k);
        EventBus.getDefault().unregister(this);
        super.destroy();
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: o */
    public void mo196735o() {
        C58151d.m225578a("ui", "ui", "contract " + "", "[VoIpCallModel] contractVoIP: showDialogHint = " + false);
        this.f142728b.mo196789a(false, true);
        this.f142734h.mo196811c();
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: h */
    public void mo196728h() {
        if (this.f142727a == null) {
            C58151d.m225578a("ui", "rust", "cancel call failure", "[VoIpCallModel] cancelCall: callInfo is null");
            AbstractC58041d.AbstractC58042a.AbstractC58043a aVar = this.f142728b;
            if (aVar != null) {
                aVar.mo196788a(false);
            }
            m225047p();
            this.f142734h.mo196804a(this.f142736j);
            return;
        }
        C58151d.m225578a("ui", "rust", "cancel call status = " + this.f142727a.getStatus(), "[VoIpCallModel] cancelCall: status = " + this.f142727a.getStatus());
        this.f142734h.mo196803a(this.f142727a, VoiceCall.Status.CANCELLED, (IGetDataCallback<String>) new IGetDataCallback<String>() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallModel.C580243 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C58151d.m225578a("ui", "rust", "cancel call success", "[VoIpCallModel] cancelCall: onSuccess");
                if (VoIpCallModel.this.f142728b != null) {
                    VoIpCallModel.this.f142728b.mo196788a(true);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C58151d.m225578a("ui", "rust", "cancel call failure", "[VoIpCallModel] cancelCall: onError");
                if (VoIpCallModel.this.f142728b != null) {
                    VoIpCallModel.this.f142728b.mo196788a(false);
                }
            }
        }, true);
        C57744a.m224104a().remove(this.f142727a.getId());
        m225047p();
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: i */
    public void mo196729i() {
        if (this.f142727a == null) {
            C58151d.m225578a("ui", "rust", "refuse call failure", "[VoIpCallModel] refuseCall: callInfo is null");
            AbstractC58041d.AbstractC58042a.AbstractC58043a aVar = this.f142728b;
            if (aVar != null) {
                aVar.mo196788a(false);
                return;
            }
            return;
        }
        C58151d.m225578a("ui", "rust", "refuse call status = " + this.f142727a.getStatus(), "[VoIpCallModel] refuseCall: status = " + this.f142727a.getStatus());
        this.f142734h.mo196803a(this.f142727a, VoiceCall.Status.REFUSED, (IGetDataCallback<String>) new IGetDataCallback<String>() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallModel.C580254 */

            /* renamed from: a */
            public void onSuccess(String str) {
                if (VoIpCallModel.this.f142728b != null) {
                    VoIpCallModel.this.f142728b.mo196788a(true);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (VoIpCallModel.this.f142728b != null) {
                    VoIpCallModel.this.f142728b.mo196788a(false);
                }
            }
        }, true);
        C57744a.m224104a().remove(this.f142727a.getId());
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: l */
    public void mo196732l() {
        if (this.f142727a == null) {
            C58151d.m225578a("ui", "rust", "terminate call failure", "[VoIpCallModel] terminateCall: callInfo is null");
            return;
        }
        C58151d.m225578a("ui", "rust", "terminate call status = " + this.f142727a.getStatus(), "[VoIpCallModel] terminateCall: status = " + this.f142727a.getStatus());
        this.f142734h.mo196803a(this.f142727a, VoiceCall.Status.TERMINATED, (IGetDataCallback<String>) null, true);
        if (!NetworkUtils.m153070c(C57977a.m224905c().getContext())) {
            VoipFinishType.m225597a(this.f142727a.getId(), 3);
        } else {
            VoipFinishType.m225597a(this.f142727a.getId(), 1);
        }
        C57744a.m224104a().remove(this.f142727a.getId());
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: j */
    public void mo196730j() {
        VoiceCall voiceCall = this.f142727a;
        if (voiceCall == null) {
            C58151d.m225578a("ui", "rust", "answer call failure", "[VoIpCallModel] answerCall: callInfo is null");
            AbstractC58041d.AbstractC58042a.AbstractC58043a aVar = this.f142728b;
            if (aVar != null) {
                aVar.mo196788a(false);
            }
        } else if (C58095m.m225342b(voiceCall.getId())) {
            C58151d.m225578a("ui", "rust", "answer call duplicate " + this.f142727a.getId(), "[VoIpCallModel] answerCall: duplicate " + this.f142727a.getId());
        } else {
            VoipHitPoint.m225621b(this.f142727a.getId());
            OnCallToStreamEvent.m225588a();
            C58151d.m225578a("ui", "rust", "answer call status = " + this.f142727a.getStatus(), "[VoIpCallModel] answerCall: status = " + this.f142727a.getStatus());
            VoiceCall.Status status = VoiceCall.Status.ACCEPTED;
            AbstractC57987d.AbstractC57996g settingDependency = C57977a.m224905c().getSettingDependency();
            if (settingDependency != null) {
                CalleeToCallTimeClockEvent.m225582a(this.f142727a.getId(), settingDependency.mo145507a());
            }
            C58095m.m225341a(this.f142727a.getId(), true);
            this.f142734h.mo196803a(this.f142727a, status, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                /* class com.ss.android.lark.voip.service.impl.app.VoIpCallModel.C580232 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C58151d.m225578a("rust", "ui", "answer call success", "[VoIpCallModel] onSuccess: " + str);
                    if (VoIpCallModel.this.f142728b != null) {
                        VoIpCallModel.this.f142728b.mo196788a(true);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C58151d.m225578a("rust", "ui", "answer call failure err = " + errorResult.getDebugMsg(), "[VoIpCallModel] onError: errCode = " + errorResult.getErrorCode());
                    VoipHitPoint.m225616a(VoIpCallModel.this.f142727a.getId(), C58133t.m225480a(VoIpCallModel.this.f142727a), "failAccept", false, VoIpCallModel.this.f142727a.isUseByteDanceChannel(), null);
                    if (VoIpCallModel.this.f142728b != null) {
                        VoIpCallModel.this.f142728b.mo196788a(false);
                    }
                }
            }, false);
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: a */
    public void mo196719a(AbstractC58041d.AbstractC58042a.AbstractC58043a aVar) {
        this.f142728b = aVar;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: a */
    public void mo196721a(boolean z) {
        this.f142734h.mo196809b(z);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onVoiceCallStatusChanged(C58130r rVar) {
        if (rVar == null) {
            C58151d.m225578a("rtc_engine", "ui", "status changed failure with null event", "[VoIpCallModel] onVoiceCallStatusChanged: VoIpTimeChangedEvent event is null");
        } else if (!C58133t.m225481b(this.f142727a) || TextUtils.equals(rVar.f142999b, this.f142727a.getId())) {
            C58151d.m225578a("rtc_engine", "ui", "timeout changed timeDesc = " + rVar.f143000c, "[VoIpCallModel] onVoiceCallStatusChanged: VoIpTimeChangedEvent onTimeCountChanged timeDesc = " + rVar.f143000c);
            this.f142728b.mo196787a(rVar.f143000c);
        } else {
            C58151d.m225578a("rtc_engine", "ui", "status changed failure with not same call id", "[VoIpCallModel] onVoiceCallStatusChanged: VoIpTimeChangedEvent event callId not equals callInfo id");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onVoiceCallStatusChanged(C58039b bVar) {
        if (bVar != null && bVar.mo196784a() != null) {
            C58151d.m225578a("rust", "ui", "status changed id = " + bVar.mo196784a().getId() + ", status = " + bVar.mo196784a().getStatus(), "[VoIpCallModel] onVoiceCallStatusChanged: CallStatusChangedEvent id = " + bVar.mo196784a().getId() + ", status = " + bVar.mo196784a().getStatus());
            if (!C58133t.m225481b(this.f142727a) || TextUtils.equals(bVar.mo196784a().getId(), this.f142727a.getId())) {
                VoiceCall a = bVar.mo196784a();
                this.f142727a = a;
                this.f142731e = a.isSelfClientInValid();
                this.f142728b.mo196786a(bVar.mo196784a());
            }
        } else if (bVar == null) {
            C58151d.m225578a("rust", "ui", "status changed failure with null event", "[VoIpCallModel] onVoiceCallStatusChanged: CallStatusChangedEvent event is null");
        } else if (bVar.mo196784a() == null) {
            C58151d.m225578a("rust", "ui", "status changed failure with null voice call", "[VoIpCallModel] onVoiceCallStatusChanged: CallStatusChangedEvent event voice call is null");
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a
    /* renamed from: a */
    public void mo196720a(String str, String str2, IGetDataCallback<VoiceCall> iGetDataCallback) {
        C58151d.m225578a("ui", "rust", "invite call userId = " + str, "[VoIpCallModel] inviteCall: userId = " + str);
        String uuid = UUID.randomUUID().toString();
        this.f142736j = uuid;
        this.f142734h.mo196806a(str, str2, uuid, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    public VoIpCallModel(Chatter chatter, String str, VoiceCall voiceCall, boolean z, AbstractC58046e eVar) {
        this.f142729c = chatter;
        this.f142735i = str;
        this.f142727a = voiceCall;
        this.f142730d = z;
        this.f142732f = new CallbackManager();
        this.f142734h = eVar;
    }
}
