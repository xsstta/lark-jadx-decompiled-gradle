package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.AbstractC58041d;
import com.ss.android.lark.voip.service.impl.p2913a.C58005a;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;

/* renamed from: com.ss.android.lark.voip.service.impl.app.n */
public class C58097n extends BasePresenter<AbstractC58041d.AbstractC58042a, AbstractC58041d.AbstractC58044b, AbstractC58041d.AbstractC58044b.AbstractC58045a> {

    /* renamed from: a */
    final AbstractC57987d.AbstractC57997h f142908a = C57977a.m224905c().getVideoChatDependency();

    /* renamed from: b */
    public Context f142909b;

    /* renamed from: c */
    private C58100b f142910c;

    /* renamed from: d */
    private C58099a f142911d;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC58041d.AbstractC58044b.AbstractC58045a createViewDelegate() {
        C58100b bVar = new C58100b();
        this.f142910c = bVar;
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m225346e();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.n$b */
    public class C58100b implements AbstractC58041d.AbstractC58044b.AbstractC58045a {
        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: a */
        public void mo196790a() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196729i();
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: b */
        public void mo196792b() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196728h();
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: c */
        public void mo196793c() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196730j();
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: d */
        public void mo196794d() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196731k();
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: e */
        public void mo196795e() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196732l();
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: g */
        public boolean mo196797g() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                return aVar.mo196734n().mo197019c();
            }
            return false;
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: h */
        public void mo196798h() {
            C58151d.m225578a("ui", "ui", "contract voip", "[VoIpCallPresenter] onContractVoIP");
            ((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196735o();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: i */
        public boolean mo196799i() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                return C58133t.m225480a(aVar.mo196726f());
            }
            return false;
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: j */
        public VoiceCall mo196800j() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                return aVar.mo196726f();
            }
            return null;
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: k */
        public boolean mo196801k() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                return aVar.mo196722b();
            }
            return false;
        }

        /* renamed from: l */
        public void mo196924l() {
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar == null) {
                C58151d.m225578a("ui", "rtc_engine", "recall failure", "[VoIpCallPresenter] reCall: model is null");
                if (C58097n.this.getView() != null) {
                    ((AbstractC58041d.AbstractC58044b) C58097n.this.getView()).mo196757g();
                    return;
                }
                return;
            }
            aVar.mo196720a(aVar.mo196718a().getId(), aVar.mo196727g(), new IGetDataCallback<VoiceCall>() {
                /* class com.ss.android.lark.voip.service.impl.app.C58097n.C58100b.C581011 */

                /* renamed from: a */
                public void onSuccess(VoiceCall voiceCall) {
                    EventBus.getDefault().trigger(new C58005a(voiceCall));
                    if (C58097n.this.getView() != null) {
                        ((AbstractC58041d.AbstractC58044b) C58097n.this.getView()).mo196757g();
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(final ErrorResult errorResult) {
                    C58151d.m225578a("ui", "ui", "invite call failure " + errorResult.getDebugMsg(), "[VoIpCallPresenter] reCall: onError errCode = " + errorResult.getErrorCode());
                    if (C58097n.this.getView() != null) {
                        ((AbstractC58041d.AbstractC58044b) C58097n.this.getView()).mo196757g();
                        ((AbstractC58041d.AbstractC58044b) C58097n.this.getView()).bs_();
                    }
                    VoipHitPoint.m225616a("", true, "failCreate", false, false, null);
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.lark.voip.service.impl.app.C58097n.C58100b.C581011.RunnableC581021 */

                        public void run() {
                            C58151d.m225578a("ui", "ui", "show error toast", "[VoIpCallPresenter] reCall: show error toast errMsg = " + errorResult.getDebugMsg());
                            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                new C25639g(C58097n.this.f142909b).mo89242c(errorResult.getDisplayMsg()).mo89225a(R.id.lkui_dialog_btn_right, C58097n.this.f142909b.getResources().getString(R.string.Lark_Legacy_ApplicationPhoneCallTimeButtonKnow), (DialogInterface.OnClickListener) null).mo89244d();
                            }
                        }
                    });
                }
            });
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: f */
        public void mo196796f() {
            C58151d.m225578a("ui", "ui", "change mute state", "[VoIpCallPresenter] changeMuteState: model = " + C58097n.this.getModel());
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196733m();
            }
            AbstractC58041d.AbstractC58044b bVar = (AbstractC58041d.AbstractC58044b) C58097n.this.getView();
            if (bVar == null) {
                C58151d.m225579b("ui", "ui", "change mute state failure", "[VoIpCallPresenter] changeMuteState: get null view");
                return;
            }
            bVar.mo196751b(aVar.mo196724d());
            bVar.mo196755c(aVar.mo196724d());
        }

        public C58100b() {
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b.AbstractC58045a
        /* renamed from: a */
        public void mo196791a(boolean z) {
            C58151d.m225578a("ui", "ui", "mute all remote audio stream", "[VoIpCallPresenter] muteAllRemote: mute = " + z);
            AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) C58097n.this.getModel();
            if (aVar != null) {
                aVar.mo196721a(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC58041d.AbstractC58042a.AbstractC58043a mo196920b() {
        C58099a aVar = new C58099a();
        this.f142911d = aVar;
        return aVar;
    }

    /* renamed from: c */
    public void mo196921c() {
        C58099a aVar = this.f142911d;
        if (aVar != null) {
            aVar.mo196789a(false, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.n$a */
    public class C58099a implements AbstractC58041d.AbstractC58042a.AbstractC58043a {
        /* renamed from: a */
        public void mo196923a() {
            C58151d.m225578a("ui", "ui", "show telephone ending toast ", "[VoIpCallPresenter] onShowTelephoneToast");
            AbstractC58041d.AbstractC58044b bVar = (AbstractC58041d.AbstractC58044b) C58097n.this.getView();
            if (bVar == null) {
                C58151d.m225579b("ui", "ui", "show telephone ending toast failure", "[VoIpCallPresenter] onShowTelephoneToast");
            } else {
                bVar.mo196756f();
            }
        }

        private C58099a() {
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a.AbstractC58043a
        /* renamed from: a */
        public void mo196786a(VoiceCall voiceCall) {
            AbstractC58041d.AbstractC58044b bVar = (AbstractC58041d.AbstractC58044b) C58097n.this.getView();
            if (bVar == null) {
                C58151d.m225579b("ui", "ui", "process changed status failure", "[VoIpCallPresenter] onCallStatusChanged: get null view");
            } else {
                C58097n.this.mo196919a(bVar, voiceCall);
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a.AbstractC58043a
        /* renamed from: a */
        public void mo196787a(String str) {
            C58151d.m225578a("ui", "ui", "update changed time count " + str, "[VoIpCallPresenter] onTimeCountChanged: timeDesc = " + str);
            AbstractC58041d.AbstractC58044b bVar = (AbstractC58041d.AbstractC58044b) C58097n.this.getView();
            if (bVar == null) {
                C58151d.m225579b("ui", "ui", "update changed time count failure", "[VoIpCallPresenter] onTimeCountChanged: get null view");
            } else {
                bVar.mo196747a(str);
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a.AbstractC58043a
        /* renamed from: a */
        public void mo196788a(boolean z) {
            if (C58097n.this.getView() != null) {
                ((AbstractC58041d.AbstractC58044b) C58097n.this.getView()).mo196757g();
            }
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58042a.AbstractC58043a
        /* renamed from: a */
        public void mo196789a(boolean z, boolean z2) {
            int i;
            VoiceCall.Status e = ((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196725e();
            C58151d.m225578a("ui", "ui", "show float icon " + e.name(), "[VoIpCallPresenter] onShowVoIPFloatIcon: status = " + e.name());
            switch (e) {
                case CALLING:
                case RINGING:
                    if (((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196722b()) {
                        if (e != VoiceCall.Status.CALLING) {
                            i = R.string.View_G_RingingFloat;
                            break;
                        } else {
                            i = R.string.View_G_CallingFloat;
                            break;
                        }
                    } else {
                        i = R.string.View_G_IsCallingFloat;
                        break;
                    }
                case OCCUPIED:
                    if (((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196722b()) {
                        i = R.string.View_G_RecipientUnavailable;
                        break;
                    }
                    i = 0;
                    break;
                case REFUSED:
                    if (((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196722b()) {
                        i = R.string.View_AM_Declined;
                        break;
                    }
                    i = 0;
                    break;
                case UNAVAILABLE:
                    if (((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196722b()) {
                        i = R.string.View_AM_NoResponse;
                        break;
                    }
                    i = 0;
                    break;
                case ACCEPTED:
                    i = R.string.View_G_ConnectingFloat;
                    break;
                case ON_THE_CALL:
                default:
                    i = 0;
                    break;
                case TERMINATED:
                    i = R.string.View_A_Ended;
                    break;
            }
            ((AbstractC58041d.AbstractC58044b) C58097n.this.getView()).mo196749a(z, z2, ((AbstractC58041d.AbstractC58042a) C58097n.this.getModel()).mo196718a(), i);
        }
    }

    /* renamed from: e */
    private void m225346e() {
        String str;
        String str2;
        AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) getModel();
        AbstractC58041d.AbstractC58044b bVar = (AbstractC58041d.AbstractC58044b) getView();
        if (aVar == null || bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpCallPresenter] init: ");
            if (aVar != null) {
                str = "model not null";
            } else {
                str = "model is null";
            }
            sb.append(str);
            sb.append(" and ");
            if (bVar != null) {
                str2 = "view not null";
            } else {
                str2 = "view is null";
            }
            sb.append(str2);
            C58151d.m225579b("ui", "ui", "init presenter failure", sb.toString());
            return;
        }
        Chatter a = aVar.mo196718a();
        if (aVar.mo196725e() == VoiceCall.Status.NONE) {
            C58151d.m225578a("ui", "ui", "resume to recall", "[VoIpCallPresenter] init: status none to reCall");
            this.f142910c.mo196924l();
        }
        mo196919a(bVar, aVar.mo196726f());
        bVar.mo196744a(a);
        bVar.mo196751b(aVar.mo196724d());
    }

    /* renamed from: d */
    public void mo196922d() {
        String str;
        String str2;
        AbstractC58041d.AbstractC58042a aVar = (AbstractC58041d.AbstractC58042a) getModel();
        AbstractC58041d.AbstractC58044b bVar = (AbstractC58041d.AbstractC58044b) getView();
        if (aVar == null || bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpCallPresenter] showTelephoneEndingToast: ");
            if (aVar != null) {
                str = "model not null";
            } else {
                str = "model is null";
            }
            sb.append(str);
            sb.append(" and ");
            if (bVar != null) {
                str2 = "view not null";
            } else {
                str2 = "view is null";
            }
            sb.append(str2);
            C58151d.m225579b("ui", "ui", "showTelephoneEndingToast presenter failure", sb.toString());
        } else if (aVar.mo196725e() == VoiceCall.Status.ON_THE_CALL) {
            if (aVar.mo196734n().mo197019c()) {
                aVar.mo196734n().mo197016a(false);
            }
            if (aVar.mo196734n().mo197021e()) {
                this.f142911d.mo196923a();
            }
        }
    }

    /* renamed from: b */
    private void m225345b(AbstractC58041d.AbstractC58044b bVar, VoiceCall voiceCall) {
        boolean z;
        if (voiceCall != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpCallPresenter] onEndCall: view = ");
            if (bVar != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" feedback:");
            sb.append(voiceCall.isNeedFeedback());
            C58151d.m225578a("ui", "ui", "end call ", sb.toString());
        }
        bVar.mo196746a(voiceCall);
    }

    /* renamed from: a */
    public void mo196919a(AbstractC58041d.AbstractC58044b bVar, VoiceCall voiceCall) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        if (bVar == null || voiceCall == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpCallPresenter] handleCallStatusChanged: null params   view = ");
            if (bVar != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" voiceCall = ");
            if (voiceCall == null) {
                z2 = false;
            }
            sb.append(z2);
            C58151d.m225579b("ui", "ui", "handleCallStatusChanged with null param", sb.toString());
            return;
        }
        VoiceCall.Status status = voiceCall.getStatus();
        C58151d.m225578a("ui", "ui", "process status " + status.name(), "[VoIpCallPresenter] handleCallStatusChanged: status = " + status.name());
        switch (C580981.f142912a[status.ordinal()]) {
            case 1:
                bVar.bs_();
                break;
            case 2:
            case 3:
                if (!((AbstractC58041d.AbstractC58042a) getModel()).mo196722b()) {
                    bVar.mo196750b();
                    i = R.string.View_E_IncomingEncryptedCall;
                    break;
                } else {
                    if (status == VoiceCall.Status.CALLING) {
                        i = R.string.View_G_CallStarting;
                    } else {
                        i = R.string.View_G_RingingEllipsis;
                    }
                    bVar.mo196742a();
                    break;
                }
            case 4:
                bVar.bs_();
                break;
            case 5:
                bVar.bs_();
                break;
            case 6:
                bVar.bs_();
                break;
            case 7:
                bVar.mo196742a();
                i = R.string.View_G_Connecting;
                break;
            case 8:
                bVar.bq_();
                VoipHitPoint.m225619a(!((AbstractC58041d.AbstractC58042a) getModel()).mo196724d(), ((AbstractC58041d.AbstractC58042a) getModel()).mo196726f().getId(), C58133t.m225480a(((AbstractC58041d.AbstractC58042a) getModel()).mo196726f()));
                this.f142908a.mo145479c();
                break;
            case 9:
                m225345b(bVar, voiceCall);
                break;
            case 10:
                bVar.br_();
                break;
            case 11:
                bVar.mo196748a(((AbstractC58041d.AbstractC58042a) getModel()).mo196723c());
                break;
        }
        bVar.mo196743a(i);
    }

    public C58097n(Context context, AbstractC58041d.AbstractC58042a aVar, AbstractC58041d.AbstractC58044b bVar) {
        super(aVar, bVar);
        this.f142909b = context;
        aVar.mo196719a(mo196920b());
    }
}
