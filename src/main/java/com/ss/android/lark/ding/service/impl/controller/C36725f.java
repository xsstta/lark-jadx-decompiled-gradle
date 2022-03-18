package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.ding.service.AbstractC36677d;
import com.ss.android.lark.ding.service.impl.C36690c;
import com.ss.android.lark.ding.service.impl.controller.C36752j;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.Statistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.f */
public class C36725f extends BaseModel implements C36752j.AbstractC36753a {

    /* renamed from: a */
    public List<Chatter> f94405a = new ArrayList();

    /* renamed from: b */
    public C36752j.AbstractC36753a.AbstractC36754a f94406b;

    /* renamed from: c */
    public IDingModuleDependency.AbstractC36624b f94407c = C36618a.m144492a().mo135112q();

    /* renamed from: d */
    public WeakReference<Context> f94408d;

    /* renamed from: e */
    private List<String> f94409e;

    /* renamed from: f */
    private Message f94410f;

    /* renamed from: g */
    private boolean f94411g;

    /* renamed from: h */
    private AbstractC36677d f94412h = C36690c.m144778a();

    /* renamed from: i */
    private IDingModuleDependency.AbstractC36625c f94413i = C36618a.m144492a().mo135104i();

    /* renamed from: j */
    private IDingModuleDependency.ISettingDependency f94414j = C36618a.m144492a().mo135101f();

    /* renamed from: a */
    public List<String> mo135384a() {
        return this.f94409e;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: c */
    public Message mo135396c() {
        return this.f94410f;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: d */
    public List<Chatter> mo135398d() {
        return this.f94405a;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: e */
    public boolean mo135399e() {
        return this.f94411g;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: b */
    public String mo135393b() {
        List<String> a = mo135384a();
        if (CollectionUtils.isEmpty(mo135384a()) || a.size() > 1) {
            return null;
        }
        return a.get(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ding.service.impl.controller.f$a */
    public class C36728a implements IGetDataCallback<DingStatus> {
        private C36728a() {
        }

        /* renamed from: a */
        public void onSuccess(DingStatus dingStatus) {
            C36725f.this.f94406b.mo135410a(dingStatus);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            if (C36725f.this.f94406b != null) {
                String displayMsg = errorResult.getDisplayMsg();
                if (TextUtils.isEmpty(displayMsg)) {
                    displayMsg = UIUtils.getString(C36618a.m144492a().mo135096a(), R.string.Lark_Legacy_ChatViewSenddingFailed);
                }
                if (errorResult.getErrorCode() == 6001) {
                    C36725f.this.mo135397c(new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.ding.service.impl.controller.C36725f.C36728a.C367291 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            C36725f.this.f94406b.mo135412a(bool.booleanValue());
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            C53241h.m205894a("DingModel", "check admin failed, err:" + errorResult);
                            C36725f.this.f94406b.mo135412a(false);
                        }
                    });
                } else if (errorResult.getErrorCode() == 4044) {
                    C36725f.this.f94406b.mo135414b(displayMsg);
                } else if (errorResult.getErrorCode() == 4043) {
                    C36725f.this.f94406b.mo135411a(displayMsg);
                } else if (errorResult.getErrorCode() == 6004 || errorResult.getErrorCode() == 6003) {
                    C36725f.this.f94406b.mo135411a(displayMsg);
                } else if (errorResult.getErrorCode() == 4053) {
                    C36725f.this.f94406b.mo135416c(displayMsg);
                } else if (errorResult.getErrorCode() == 260000) {
                    C36725f.this.f94406b.mo135415b(false);
                } else if (errorResult.getErrorCode() == 260001) {
                    C36725f.this.f94406b.mo135409a();
                } else if (errorResult.getErrorCode() == 260003) {
                    C36725f.this.f94406b.mo135415b(true);
                } else if (C36725f.this.mo135391a(errorResult)) {
                    String c = C36725f.this.f94407c.mo135123c();
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        c = errorResult.getDisplayMsg();
                    }
                    C36725f.this.f94407c.mo135121a(C36725f.this.f94408d.get(), c, new DialogInterface.OnDismissListener() {
                        /* class com.ss.android.lark.ding.service.impl.controller.C36725f.C36728a.DialogInterface$OnDismissListenerC367302 */

                        public void onDismiss(DialogInterface dialogInterface) {
                            C36725f.this.f94406b.mo135413b();
                        }
                    });
                } else {
                    C36725f.this.f94406b.mo135417d(displayMsg);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo135389a(C36752j.AbstractC36753a.AbstractC36754a aVar) {
        this.f94406b = aVar;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: b */
    public String mo135394b(Chatter chatter) {
        return this.f94413i.mo135131a(chatter);
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: a */
    public boolean mo135392a(Chatter chatter) {
        return this.f94414j.mo135117a(chatter.getZenModeEndTime());
    }

    /* renamed from: c */
    public void mo135397c(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f94412h.mo135281a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* renamed from: a */
    public List<String> mo135385a(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter : list) {
            arrayList.add(chatter.getId());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: b */
    public void mo135395b(IGetDataCallback iGetDataCallback) {
        C36618a.m144492a().mo135107l().mo135158a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: a */
    public void mo135388a(final IGetDataCallback<Void> iGetDataCallback) {
        C36618a.m144492a().mo135104i().mo135136a(this.f94409e, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<Chatter>>() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36725f.C367261 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<Chatter> list) {
                if (CollectionUtils.isEmpty(list)) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("empty chatters"));
                        return;
                    }
                    return;
                }
                C36725f.this.f94405a = list;
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(null);
                }
            }
        }));
    }

    /* renamed from: a */
    public boolean mo135391a(ErrorResult errorResult) {
        if (errorResult == null) {
            return false;
        }
        if (errorResult.getErrorCode() == this.f94407c.mo135120a() || errorResult.getErrorCode() == this.f94407c.mo135122b()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: a */
    public void mo135387a(int i, boolean z) {
        this.f94412h.mo135283a(this.f94410f.getId(), mo135384a(), i, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C36728a()));
        Statistics.sendEvent("buzz_sent");
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: a */
    public void mo135390a(String str, final IGetDataCallback iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.f94413i.mo135135a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36725f.C367272 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    if (chatter == null) {
                        C53241h.m205894a("DingModel", "chatter is null!");
                        return;
                    }
                    C36725f.this.f94405a.set(0, chatter);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(chatter);
                    }
                }
            }));
        }
    }

    public C36725f(Context context, List<String> list, Message message, boolean z) {
        this.f94409e = list;
        this.f94410f = message;
        this.f94411g = z;
        this.f94408d = new WeakReference<>(context);
    }

    @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a
    /* renamed from: a */
    public void mo135386a(int i, List<Chatter> list, List<Chatter> list2, boolean z) {
        C36728a aVar = new C36728a();
        if (i == 1) {
            this.f94412h.mo135283a(this.f94410f.getId(), mo135384a(), i, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(aVar));
        } else {
            this.f94412h.mo135284a(this.f94410f.getId(), mo135385a(list), mo135385a(list2), i, z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(aVar));
        }
        Statistics.sendEvent("buzz_sent");
    }
}
