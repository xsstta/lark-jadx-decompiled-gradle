package com.ss.android.lark.leanmode.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PatchLeanModeStatusRequest;
import com.bytedance.lark.pb.im.v1.PatchLeanModeStatusResponse;
import com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityRequest;
import com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityResponse;
import com.larksuite.component.ui.dialog.C25636d;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.leanmode.AbstractC41239a;
import com.ss.android.lark.leanmode.AbstractC41242b;
import com.ss.android.lark.leanmode.AbstractC41248c;
import com.ss.android.lark.leanmode.AbstractC41261d;
import com.ss.android.lark.leanmode.AbstractC41263e;
import com.ss.android.lark.leanmode.AbstractC41264f;
import com.ss.android.lark.leanmode.C41265g;
import com.ss.android.lark.leanmode.C41267h;
import com.ss.android.lark.leanmode.C41268i;
import com.ss.android.lark.leanmode.C41283j;
import com.ss.android.lark.leanmode.dto.C41262a;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.leanmode.dto.SyncDataStrategy;
import com.ss.android.lark.leanmode.p2119a.C41241b;
import com.ss.android.lark.leanmode.p2120b.AbstractC41243a;
import com.ss.android.lark.leanmode.p2121c.C41252b;
import com.ss.android.lark.leanmode.p2121c.C41255c;
import com.ss.android.lark.leanmode.p2121c.C41258d;
import com.ss.android.lark.leanmode.statistics.LeanModeHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.vesdk.C64034n;
import java.io.IOException;
import java.util.Observable;

/* renamed from: com.ss.android.lark.leanmode.impl.a */
public class C41271a extends Observable implements AbstractC41263e {

    /* renamed from: a */
    public LeanMode f105042a;

    /* renamed from: b */
    public boolean f105043b;

    /* renamed from: c */
    public LeanModeDialogManager f105044c;

    /* renamed from: d */
    private AbstractC41239a f105045d;

    /* renamed from: e */
    private AbstractC41261d f105046e;

    /* renamed from: f */
    private AbstractC41242b f105047f;

    /* renamed from: g */
    private AbstractC41243a.AbstractC41244a.AbstractC41245a f105048g;

    /* renamed from: h */
    private AbstractC41248c f105049h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.leanmode.impl.a$a */
    public static class C41282a {

        /* renamed from: a */
        public static C41271a f105066a = new C41271a();
    }

    /* renamed from: j */
    public static C41271a m163643j() {
        return C41282a.f105066a;
    }

    @Override // com.ss.android.lark.leanmode.AbstractC41263e
    /* renamed from: a */
    public void mo148650a() {
        C41267h.m163598a().mo143870a(this.f105045d);
        C41283j.m163674a().mo148701a(this.f105046e);
        C41265g.m163589a().mo148653a(this.f105047f);
        C41267h.m163598a().mo143882h().mo143884a(this.f105048g);
        C41268i.m163607a().mo148663a(this.f105049h);
        this.f105042a = C41258d.m163569a().mo148616c();
        mo148683a(SyncDataStrategy.TRY_LOCAL, (IGetDataCallback<LeanMode>) null);
    }

    /* renamed from: a */
    public void mo148683a(SyncDataStrategy syncDataStrategy, final IGetDataCallback<LeanMode> iGetDataCallback) {
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "fetchStatusAndAuthority called. fg is false.");
            mo148686e();
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(ErrorResult.TIMEOUT_ERROR);
                return;
            }
            return;
        }
        com.bytedance.lark.pb.basic.v1.SyncDataStrategy fromValue = com.bytedance.lark.pb.basic.v1.SyncDataStrategy.fromValue(syncDataStrategy.getValue());
        Activity b = C41267h.m163598a().mo143875b();
        if (b != null && !NetworkUtils.m153070c(b.getApplicationContext())) {
            fromValue = com.bytedance.lark.pb.basic.v1.SyncDataStrategy.TRY_LOCAL;
        }
        SdkSender.asynSendRequestNonWrap(Command.PULL_LEAN_MODE_STATUS_AND_AUTHORITY, new PullLeanModeStatusAndAuthorityRequest.C17861a().mo62237a(fromValue), new IGetDataCallback<LeanMode>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412732 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LeanModeService", "failed to pull lean mode status and authority. e:" + errorResult);
                C41271a.this.mo148686e();
                C41258d.m163569a().mo148615b(null);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(LeanMode leanMode) {
                Object obj;
                StringBuilder sb = new StringBuilder();
                sb.append("successful to pull lean mode status and authority. leanMode:");
                Object obj2 = "null";
                if (leanMode != null) {
                    obj = leanMode;
                } else {
                    obj = obj2;
                }
                sb.append(obj);
                sb.append("， mem leanMode:");
                if (C41271a.this.f105042a != null) {
                    obj2 = C41271a.this.f105042a;
                }
                sb.append(obj2);
                Log.m165389i("LeanModeService", sb.toString());
                if (C41271a.this.f105042a != null) {
                    C41271a aVar = C41271a.this;
                    aVar.f105042a = aVar.f105042a.getUpdatedLeanMode(leanMode);
                } else {
                    C41271a.this.f105042a = leanMode;
                }
                C41258d.m163569a().mo148613a(C41271a.this.f105042a);
                C41258d.m163569a().mo148615b(C41271a.this.f105042a);
                C41271a aVar2 = C41271a.this;
                aVar2.mo148682a(aVar2.f105042a);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C41271a.this.f105042a);
                }
            }
        }, $$Lambda$a$F70dg4h9mCnneYzhsoTqdTJbjk.INSTANCE);
    }

    /* renamed from: a */
    private void m163630a(boolean z, boolean z2, final IGetDataCallback<LeanMode> iGetDataCallback) {
        this.f105043b = true;
        SdkSender.asynSendRequestNonWrap(Command.PATCH_LEAN_MODE_STATUS, new PatchLeanModeStatusRequest.C17831a().mo62152a(Boolean.valueOf(z)).mo62154b(Boolean.valueOf(z2)), new IGetDataCallback<LeanMode>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412743 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LeanModeService", "failed to patch lean mode status. e:" + errorResult);
                C41271a.this.f105043b = false;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(LeanMode leanMode) {
                Object obj;
                StringBuilder sb = new StringBuilder();
                sb.append("successful to patch lean mode status. leanMode:");
                if (leanMode != null) {
                    obj = leanMode;
                } else {
                    obj = "null";
                }
                sb.append(obj);
                Log.m165389i("LeanModeService", sb.toString());
                if (C41271a.this.f105042a != null) {
                    C41271a aVar = C41271a.this;
                    aVar.f105042a = aVar.f105042a.getUpdatedLeanMode(leanMode);
                } else {
                    C41271a.this.f105042a = leanMode;
                }
                C41258d.m163569a().mo148613a(C41271a.this.f105042a);
                C41258d.m163569a().mo148615b(C41271a.this.f105042a);
                C41271a.this.f105043b = false;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C41271a.this.f105042a);
                }
            }
        }, $$Lambda$a$yfRlQJsorVQBFg7yLMe1TwIaYtE.INSTANCE);
    }

    /* renamed from: a */
    private void m163629a(boolean z, SyncDataStrategy syncDataStrategy) {
        if (z) {
            Log.m165389i("LeanModeService", "onAccountChange called, last tenant is in leanMode. so restart app.");
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$a_yYTB0ofDOQh3hG8uO7f_czw4 */

                public final void run() {
                    C41271a.this.m163648o();
                }
            });
            return;
        }
        mo148683a(syncDataStrategy, new UIGetDataCallback<LeanMode>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412754 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccessed(LeanMode leanMode) {
                C41271a.this.f105042a = leanMode;
                if (leanMode != null && leanMode.isDeviceInLeanMode()) {
                    Log.m165389i("LeanModeService", "onAccountChange called, current tenant is in leanMode. so restart app.");
                    C41271a.this.m163648o();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m163627a(String str, Activity activity, boolean z) {
        C41255c.m163565a().mo148611a(str);
        if (z) {
            if (this.f105042a.isOtherCloseableDevicesInLeanMode()) {
                new C25639g(activity).mo89248g(R.string.Lark_Security_LeanModeTurnOffOtherDeviceTitle).mo89254m(R.string.Lark_Security_LeanModeTurnOffOtherDeviceContent).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Security_LeanModeTurnOffOtherDeviceButtonJustThis, new DialogInterface.OnClickListener(activity) {
                    /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$tpd5jahj2JYgg0LGmuQE16SKk */
                    public final /* synthetic */ Activity f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C41271a.this.m163632b(this.f$1, dialogInterface, i);
                    }
                }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModeTurnOffOtherDeviceButtonForAll, new DialogInterface.OnClickListener(activity) {
                    /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$MqxauQZN1P4BO9r9GoJoLdSg7_I */
                    public final /* synthetic */ Activity f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C41271a.this.m163619a((C41271a) this.f$1, (Activity) dialogInterface, (DialogInterface) i);
                    }
                }).mo89239c();
            } else {
                m163621a(activity, false, false);
            }
        }
    }

    /* renamed from: a */
    public void mo148681a(final IGetDataCallback<Boolean> iGetDataCallback) {
        C41267h.m163598a().mo143873a(false, new UIGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412819 */

            /* renamed from: a */
            public void onSuccessed(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m163628a(boolean z) {
        UserSP.getInstance().putBoolean("Lark_AlreadySetSecurityVerifySuccess", z);
        if (z) {
            Log.m165389i("LeanModeService", "fetchVerifyStatus called. already set security verify.");
            return;
        }
        Activity b = C41267h.m163598a().mo143875b();
        if (b == null) {
            Log.m165389i("LeanModeService", "activelyCloseLeanMode called. topActivity is null");
        } else {
            new C25639g(b).mo89248g(R.string.Lark_Security_LeanModePleaseSetSecurityVerificationCodePopUpTitle).mo89254m(R.string.Lark_Security_LeanModePleaseSetSecurityVerificationCodePopUpContentMobile).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Security_LeanModePleaseSetSecurityVerificationCodePopUpButtonRemindLater, $$Lambda$a$z1HDxfNSkwzcPUguVrlY_RaqcAY.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePleaseSetSecurityVerificationCodePopUpButtonSetNow, $$Lambda$a$Rf8kKFyp2XBNXWBGvoZxgXjihk.INSTANCE).mo89239c();
        }
    }

    /* renamed from: a */
    public void mo148680a(Activity activity) {
        if (!UIUtils.isActivityRunning(activity)) {
            Log.m165389i("LeanModeService", "showLKPLeanAlertDialog called. topActivity is null");
            mo148690i();
            return;
        }
        this.f105044c.mo148678a(new C25639g(activity).mo89248g(R.string.Lark_Security_LeanModePopUpGeneralTitle).mo89254m(R.string.Lark_Security_LeanModeOnOpenNotSupportedContent).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePopUpGeneralAckButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$KOcZBe53gUcmbXGqT4ehymzTOao */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41271a.this.m163622a((C41271a) dialogInterface, (DialogInterface) i);
            }
        }).mo89233b(), 0);
    }

    /* renamed from: a */
    public void mo148682a(LeanMode leanMode) {
        setChanged();
        notifyObservers(leanMode);
        StringBuilder sb = new StringBuilder();
        sb.append("onStateChange called. notifyObservers. leanMode:");
        Object obj = leanMode;
        if (leanMode == null) {
            obj = "null";
        }
        sb.append(obj);
        Log.m165389i("LeanModeService", sb.toString());
    }

    /* renamed from: l */
    private void m163645l() {
        Log.m165389i("LeanModeService", "passivelyOpenLeanMode called.");
        mo148681a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412765 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C41271a.this.mo148690i();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C41271a.this.mo148690i();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m163649p() {
        Log.m165389i("LeanModeService", "successful to receive lean mode patch failed push.");
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "successful to receive leanmode patch failed push. fg is false.");
        } else {
            m163647n();
        }
    }

    /* renamed from: c */
    public LeanMode mo148684c() {
        LeanMode leanMode = this.f105042a;
        if (leanMode == null) {
            return null;
        }
        return leanMode.clone();
    }

    /* renamed from: e */
    public void mo148686e() {
        this.f105042a = new LeanMode();
        C41258d.m163569a().mo148613a(null);
        mo148682a((LeanMode) null);
    }

    private C41271a() {
        this.f105045d = new AbstractC41239a() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$1KhR68_AyqWs6gsDLgady8iPMsY */

            @Override // com.ss.android.lark.leanmode.AbstractC41239a
            public final void onAccountChange() {
                C41271a.this.m163650q();
            }
        };
        this.f105046e = new AbstractC41261d() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$ieF2pE3vexOimIepZ66o_HUVow */

            @Override // com.ss.android.lark.leanmode.AbstractC41261d
            public final void onUpdate(LeanMode leanMode) {
                C41271a.this.m163634b((C41271a) leanMode);
            }
        };
        this.f105047f = $$Lambda$a$muVOpA2OQTteQN5RL9QBxyyRvsg.INSTANCE;
        this.f105048g = new AbstractC41243a.AbstractC41244a.AbstractC41245a() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$MyqQutKX1cc9zTR7sgDwcB7Pw2g */

            @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a.AbstractC41244a.AbstractC41245a
            public final void onAppStateChange(boolean z) {
                C41271a.this.m163635b((C41271a) z);
            }
        };
        this.f105049h = new AbstractC41248c() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$Ki5MmJqDISFVglRqIGCI3gkltc */

            @Override // com.ss.android.lark.leanmode.AbstractC41248c
            public final void onUpdate() {
                C41271a.this.m163649p();
            }
        };
        this.f105044c = new LeanModeDialogManager();
    }

    @Override // com.ss.android.lark.leanmode.AbstractC41263e
    /* renamed from: b */
    public void mo148651b() {
        this.f105042a = null;
        this.f105043b = false;
        C41267h.m163598a().mo143876b(this.f105045d);
        C41283j.m163674a().mo148702b(this.f105046e);
        C41265g.m163589a().mo148654b(this.f105047f);
        C41267h.m163598a().mo143882h().mo143885b(this.f105048g);
        C41268i.m163607a().mo148664b(this.f105049h);
    }

    /* renamed from: d */
    public void mo148685d() {
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "gotoLeanMode called. fg is false.");
            mo148686e();
            return;
        }
        mo148683a(SyncDataStrategy.TRY_LOCAL, new UIGetDataCallback<LeanMode>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412721 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165383e("LeanModeService", "failed to fetchStatusAndAuthority. e:" + errorResult);
            }

            /* renamed from: a */
            public void onSuccessed(LeanMode leanMode) {
                Object obj;
                StringBuilder sb = new StringBuilder();
                sb.append("successful to fetchStatusAndAuthority. leanMode:");
                if (leanMode == null) {
                    obj = "null";
                } else {
                    obj = leanMode;
                }
                sb.append(obj);
                Log.m165389i("LeanModeService", sb.toString());
                if (leanMode != null) {
                    if (leanMode.isDeviceInLeanMode()) {
                        C41271a.this.mo148689h();
                    } else {
                        C41271a.this.mo148688g();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m163650q() {
        Object obj;
        boolean z;
        LeanMode d = C41258d.m163569a().mo148617d();
        StringBuilder sb = new StringBuilder();
        sb.append("onAccountChange called, last tenant leanMode:");
        if (d == null) {
            obj = "null";
        } else {
            obj = d;
        }
        sb.append(obj);
        Log.m165389i("LeanModeService", sb.toString());
        if (d == null || !d.isDeviceInLeanMode()) {
            z = false;
        } else {
            z = true;
        }
        C41258d.m163569a().mo148615b(null);
        this.f105042a = new LeanMode();
        C41258d.m163569a().mo148614b();
        UserSP.getInstance().remove("Lark_LeanModeSetSecurityVerify");
        UserSP.getInstance().remove("Lark_LeanModeSetSecurityVerify_flag");
        UserSP.getInstance().remove("Lark_AlreadySetSecurityVerifySuccess");
        m163629a(z, SyncDataStrategy.TRY_LOCAL);
    }

    /* renamed from: m */
    private void m163646m() {
        Activity activity;
        Log.m165389i("LeanModeService", "passivelyCloseLeanMode called.");
        if (!DesktopUtil.m144301a(C41267h.m163598a().mo143867a())) {
            activity = C41267h.m163598a().mo143875b();
        } else {
            activity = C36519d.m144080a().mo134826h();
        }
        if (activity == null) {
            Log.m165389i("LeanModeService", "passivelyCloseLeanMode called. topActivity is null");
            mo148681a(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.leanmode.impl.C41271a.C412776 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C41271a.this.mo148690i();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C41271a.this.mo148690i();
                }
            });
            return;
        }
        this.f105044c.mo148678a(new C25639g(activity).mo89248g(R.string.Lark_Security_LeanModePopUpGeneralTitle).mo89254m(R.string.Lark_Security_LeanModeConfirmForcedOffPopUpContent).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModeConfirmForcedOffPopUpButtonConfirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$evpOlAmqHJ8Eqi8EULEhEtbwjJg */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41271a.this.m163640e(dialogInterface, i);
            }
        }).mo89233b(), 1);
    }

    /* renamed from: n */
    private void m163647n() {
        Activity b = C41267h.m163598a().mo143875b();
        if (b == null) {
            Log.m165389i("LeanModeService", "showPatchFailedTipDialog called. topActivity is null");
        } else {
            new C25639g(b).mo89248g(R.string.Lark_Security_LeanModePopUpGeneralTitle).mo89254m(R.string.Lark_Security_LeanModeAccessRemovedPopUpContent).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePopUpGeneralAckButton, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$1dMhArTPBNzk4WeXZiexLr9PCFg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41271a.this.m163633b(dialogInterface, i);
                }
            }).mo89239c();
        }
    }

    /* renamed from: f */
    public void m163648o() {
        Activity b = C41267h.m163598a().mo143875b();
        if (b == null) {
            Log.m165389i("LeanModeService", "showTenantChangeLeanModeDialog called. topActivity is null");
            mo148690i();
            return;
        }
        new C25639g(b).mo89254m(R.string.Lark_Security_LeanModeSwitchTenantIdentityRestartPopUpContent).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModeSwitchTenantIdentityRestartPopUpButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$ACvhMQR0eFySJ07JUysDYk5r6CE */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41271a.this.m163642g(dialogInterface, i);
            }
        }).mo89239c();
    }

    /* renamed from: i */
    public void mo148690i() {
        Context a = C41267h.m163598a().mo143867a();
        if (a == null) {
            Log.m165389i("LeanModeService", "killAppProcess called. Context is null");
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: g */
    public void mo148688g() {
        LeanModeHitPoint.f105030a.mo148619a();
        if (!this.f105042a.hasAuthority()) {
            Log.m165389i("LeanModeService", "activelyOpenLeanMode called. hasn't Authority, so return.");
            return;
        }
        Activity b = C41267h.m163598a().mo143875b();
        if (b == null) {
            Log.m165389i("LeanModeService", "activelyOpenLeanMode called. topActivity is null");
        } else if (C41267h.m163598a().mo143874a("lark.leanmode.turn_on_all_device_switch")) {
            C25636d dVar = new C25636d(b);
            dVar.mo89248g(R.string.Lark_Security_LeanModeConfirmTurnOnPopUpTitle);
            ((C25636d) ((C25636d) dVar.mo89214a(UIUtils.getString(b, R.string.Lark_Security_LeanModeConfirmTurnOnPopUpChoice)).mo89215a(true).mo89247e(false)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Security_LeanModePopUpGeneralButtonCancel, (DialogInterface.OnClickListener) null)).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePopUpGeneralButtonConfirm, new DialogInterface.OnClickListener(dVar, b) {
                /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$3KB9AGtJmPByuwSspIp7qVzScqA */
                public final /* synthetic */ C25636d f$1;
                public final /* synthetic */ Activity f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41271a.this.m163623a(this.f$1, this.f$2, dialogInterface, i);
                }
            });
            dVar.mo89239c();
        } else {
            new C25639g(b).mo89248g(R.string.Lark_Security_LeanModeConfirmTurnOnPopUpTitle).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Security_LeanModePopUpGeneralButtonCancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePopUpGeneralButtonConfirm, new DialogInterface.OnClickListener(b) {
                /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$yVT74cUdsXBENAdqv9vOuLnEIqo */
                public final /* synthetic */ Activity f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41271a.this.m163638d(this.f$1, dialogInterface, i);
                }
            }).mo89239c();
        }
    }

    /* renamed from: h */
    public void mo148689h() {
        LeanModeHitPoint.f105030a.mo148621b();
        Activity b = C41267h.m163598a().mo143875b();
        if (b == null) {
            Log.m165389i("LeanModeService", "activelyCloseLeanMode called. topActivity is null");
        } else if (!this.f105042a.hasAuthority()) {
            new C25639g(b).mo89248g(R.string.Lark_Security_LeanModePopUpGeneralTitle).mo89254m(R.string.Lark_Security_LeanModeTurnOffNoAccessContent).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePopUpGeneralAckButton, $$Lambda$a$DEX2S0zWSPOSUSsTxiw1jbJjt0.INSTANCE).mo89239c();
        } else {
            new C25639g(b).mo89254m(R.string.Lark_Security_LeanModeConfirmTurnOffPopUpTitle).mo89257p(17).mo89247e(false).mo89234b(-2.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Security_LeanModePopUpGeneralButtonCancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Security_LeanModePopUpGeneralButtonConfirm, new DialogInterface.OnClickListener(b) {
                /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$sXtkfJuWa_17oSjeYVqEI79kdnE */
                public final /* synthetic */ Activity f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41271a.this.m163636c(this.f$1, dialogInterface, i);
                }
            }).mo89239c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ LeanMode m163618a(byte[] bArr) throws IOException {
        return C41241b.m163537a(PatchLeanModeStatusResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ LeanMode m163631b(byte[] bArr) throws IOException {
        Log.m165389i("LeanModeService", "successful to pull lean mode status and authority.");
        return C41241b.m163538a(PullLeanModeStatusAndAuthorityResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163634b(LeanMode leanMode) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("successful to receive lean mode status and authority push. leanMode:");
        if (leanMode != null) {
            obj = leanMode;
        } else {
            obj = "null";
        }
        sb.append(obj);
        Log.m165389i("LeanModeService", sb.toString());
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "successful to receive lean mode status and authority push. fg is false.");
            mo148686e();
            return;
        }
        String f = C41267h.m163598a().mo143880f();
        mo148682a(leanMode);
        C41258d.m163569a().mo148613a(leanMode);
        C41258d.m163569a().mo148615b(leanMode);
        if (leanMode != null) {
            if (!leanMode.greaterThan(this.f105042a)) {
                Log.m165389i("LeanModeService", "successful to receive lean mode status and authority push. memory leanMode is greater than push leanMode.");
            } else if (this.f105043b) {
                Log.m165389i("LeanModeService", "patch leanMode executing.");
                this.f105042a = leanMode;
            } else if (leanMode.isSameMode(this.f105042a)) {
                Log.m165389i("LeanModeService", "pull leanMode status equals push leanMode status.");
                this.f105042a = leanMode;
                m163626a(f);
            } else {
                m163624a(leanMode, f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163635b(boolean z) {
        LeanMode leanMode;
        if (!z || (leanMode = this.f105042a) == null || !leanMode.hasAuthority()) {
            return;
        }
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "successful to receive app state change. fg is false.");
            return;
        }
        boolean z2 = UserSP.getInstance().getBoolean("Lark_LeanModeSetSecurityVerify_flag", false);
        long j = UserSP.getInstance().getLong("Lark_LeanModeSetSecurityVerify");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z2 && elapsedRealtime - j >= 3600000) {
            m163626a(C41267h.m163598a().mo143880f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m163625a(C41262a aVar) {
        Log.m165389i("LeanModeService", "successful to receive lean mode clean data push.");
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "successful to receive leanmode clean data push. fg is false.");
        } else if (aVar == null) {
            Log.m165383e("LeanModeService", "successful to receive storage clean push. but cleanData is null.");
        } else {
            C41252b.m163563a().mo148609a(aVar);
        }
    }

    /* renamed from: a */
    private void m163626a(String str) {
        LeanMode leanMode;
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "guideToSetSecurityVerify called. fg is false.");
        } else if (!TextUtils.equals(str, C41267h.m163598a().mo143880f())) {
            Log.m165389i("LeanModeService", "guideToSetSecurityVerify called. last userId not equals current userId.");
        } else if (!UserSP.getInstance().getBoolean("Lark_AlreadySetSecurityVerifySuccess") && (leanMode = this.f105042a) != null && leanMode.hasAuthority()) {
            C41267h.m163598a().mo143871a($$Lambda$a$7Op8OygKKxfc3SdThlHmPOnxVo0.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163633b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo148690i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m163642g(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo148690i();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m163640e(final DialogInterface dialogInterface, int i) {
        mo148681a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412787 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C41271a.this.f105044c.mo148679a(dialogInterface);
                C41271a.this.mo148690i();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C41271a.this.f105044c.mo148679a(dialogInterface);
                C41271a.this.mo148690i();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m163639d(DialogInterface dialogInterface, int i) {
        UserSP.getInstance().putLong("Lark_LeanModeSetSecurityVerify", SystemClock.elapsedRealtime());
        UserSP.getInstance().putBoolean("Lark_LeanModeSetSecurityVerify_flag", true);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m163637c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        UserSP.getInstance().putLong("Lark_LeanModeSetSecurityVerify", SystemClock.elapsedRealtime());
        UserSP.getInstance().putBoolean("Lark_LeanModeSetSecurityVerify_flag", false);
        C41267h.m163598a().mo143877c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m163622a(DialogInterface dialogInterface, int i) {
        this.f105044c.mo148679a(dialogInterface);
        mo148690i();
    }

    /* renamed from: a */
    private void m163624a(LeanMode leanMode, String str) {
        if (!C41267h.m163598a().mo143874a("lark.leanmode.switch")) {
            Log.m165379d("LeanModeService", "onPushResult called. fg is false.");
        } else if (!TextUtils.equals(str, C41267h.m163598a().mo143880f())) {
            Log.m165389i("LeanModeService", "onPushResult called. receive push userId not equals current userId.");
        } else {
            this.f105042a = leanMode;
            if (leanMode.isDeviceInLeanMode()) {
                m163645l();
            } else {
                m163646m();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163632b(Activity activity, DialogInterface dialogInterface, int i) {
        LeanModeHitPoint.f105030a.mo148624e();
        m163621a(activity, false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m163636c(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m163620a(activity, "lean_mode_app_id", "lean_mode_callback_id");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m163638d(Activity activity, DialogInterface dialogInterface, int i) {
        LeanModeHitPoint.f105030a.mo148620a(C64034n.f161683a);
        m163621a(activity, true, false);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m163619a(Activity activity, DialogInterface dialogInterface, int i) {
        LeanModeHitPoint.f105030a.mo148623d();
        m163621a(activity, false, true);
    }

    /* renamed from: a */
    private void m163620a(Activity activity, String str, String str2) {
        LeanModeHitPoint.f105030a.mo148622c();
        C41255c.m163565a().mo148610a(activity, str, str2, new AbstractC41264f(str2, activity) {
            /* class com.ss.android.lark.leanmode.impl.$$Lambda$a$_U3jn5GoUUjkdeEKMgfHADMSMRA */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Activity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.leanmode.AbstractC41264f
            public final void handleResult(boolean z) {
                C41271a.this.m163627a((C41271a) this.f$1, (String) this.f$2, (Activity) z);
            }
        });
    }

    /* renamed from: a */
    private void m163621a(final Activity activity, boolean z, boolean z2) {
        final LKUIStatus a = new LKUIStatus.C25680a((ViewGroup) activity.getWindow().getDecorView()).mo89859a();
        a.mo89839a(UIUtils.getString(activity, R.string.Lark_Security_LeanModeSwitchModePrepareLoading));
        m163630a(z, z2, new UIGetDataCallback<LeanMode>() {
            /* class com.ss.android.lark.leanmode.impl.C41271a.C412798 */

            /* renamed from: a */
            public void onSuccessed(LeanMode leanMode) {
                C41271a.this.mo148681a(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.leanmode.impl.C41271a.C412798.C412801 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        if (a != null) {
                            a.mo89849f();
                        }
                        C41271a.this.mo148690i();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (a != null) {
                            a.mo89849f();
                        }
                        C41271a.this.mo148690i();
                    }
                });
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                if (activity != null) {
                    a.mo89849f();
                    LKUIToast.show(activity.getApplicationContext(), (int) R.string.Lark_Security_LeanModeSomethingWentWrongGeneralToast);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m163623a(C25636d dVar, Activity activity, DialogInterface dialogInterface, int i) {
        String str;
        boolean a = dVar.mo89216a();
        Log.m165389i("LeanModeService", "activelyOpenLeanMode called. checked:" + a);
        LeanModeHitPoint.Companion aVar = LeanModeHitPoint.f105030a;
        if (a) {
            str = "y";
        } else {
            str = C64034n.f161683a;
        }
        aVar.mo148620a(str);
        m163621a(activity, true, a);
        dialogInterface.dismiss();
    }
}
