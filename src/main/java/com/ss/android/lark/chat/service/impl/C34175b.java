package com.ss.android.lark.chat.service.impl;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.base.p1400a.C29521b;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.chat.v2.ChatWindowFragment;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.service.impl.C34186c;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.b */
public class C34175b implements AbstractC29524c {

    /* renamed from: b */
    private static boolean f88433b;

    /* renamed from: a */
    protected final AbstractC36503q f88434a = C29990c.m110930b().mo134586n();

    /* renamed from: c */
    private Runnable f88435c;

    /* renamed from: d */
    private IGetDataCallback<Bundle> f88436d;

    /* renamed from: e */
    private Bundle f88437e;

    /* renamed from: f */
    private String f88438f = "";

    /* renamed from: g */
    private C34186c.AbstractC34198e f88439g;

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: c */
    public int mo104617c() {
        return R.anim.hold;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: d */
    public int mo104618d() {
        return R.anim.hold;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: b */
    public String mo104616b() {
        return ChatWindowFragment.class.getName();
    }

    /* renamed from: e */
    private boolean m132677e() {
        return this.f88434a.mo134685a("lark.android.offline.push.sync.chat");
    }

    /* renamed from: f */
    private void m132678f() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$b$XLdrtr5HjYynyRVO1uf7H4wqDas */

            public final void run() {
                C34175b.this.m132681i();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m132680h() {
        Log.m165389i("ChatFrame", "open chat after delay time:3000");
        m132679g();
        this.f88435c = null;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public int mo104613a() {
        return C29990c.m110930b().mo134592t().mo134409a();
    }

    /* renamed from: g */
    private void m132679g() {
        Bundle bundle;
        IGetDataCallback<Bundle> iGetDataCallback = this.f88436d;
        if (iGetDataCallback == null || (bundle = this.f88437e) == null) {
            Log.m165383e("ChatFrame", "callback or bundle is null, skip open chat");
            return;
        }
        iGetDataCallback.onSuccess(bundle);
        this.f88436d = null;
        this.f88437e = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m132681i() {
        if (this.f88435c != null) {
            Log.m165389i("ChatFrame", "runnable not empty, try to open chat");
            UICallbackExecutor.removeCallbacks(this.f88435c);
            this.f88435c = null;
            m132679g();
            return;
        }
        Log.m165389i("ChatFrame", "runnable is empty, skip");
    }

    public C34175b() {
        boolean e = m132677e();
        Log.m165389i("ChatFrame", "isEnableSyncChat:" + e);
        if (e) {
            this.f88439g = new C34186c.AbstractC34198e() {
                /* class com.ss.android.lark.chat.service.impl.$$Lambda$b$x_vlmLpB42z9SjDO5hCK76Wrh8k */

                @Override // com.ss.android.lark.chat.service.impl.C34186c.AbstractC34198e
                public final void onPushPreLoadUpdateChat(List list) {
                    C34175b.this.m132674a(list);
                }
            };
            C34186c.m132703a().mo126728a(this.f88439g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m132674a(List list) {
        Log.m165389i("ChatFrame", "onPushPreLoadUpdateChat");
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(list) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$b$lJ59avHTmCUrykTXg8KEMKIAYZY */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C34175b.this.m132676b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m132676b(List list) {
        if (!TextUtils.isEmpty(this.f88438f) && CollectionUtils.isNotEmpty(list) && list.contains(this.f88438f)) {
            f88433b = true;
            m132678f();
            C34186c.m132703a().mo126734b(this.f88439g);
        }
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public C29520a mo104614a(Bundle bundle, C29521b bVar) {
        ChatWindowFragment a = ChatWindowFragment.f86129c.mo122998a(bundle);
        a.mo104598a(bVar);
        return a;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public void mo104615a(Intent intent, final IGetDataCallback<Bundle> iGetDataCallback) {
        final ChatBundle chatBundle;
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            chatBundle = ChatBundle.m109260a(extras);
        } else {
            chatBundle = null;
        }
        final C341761 r1 = new IGetDataCallback<Bundle>() {
            /* class com.ss.android.lark.chat.service.impl.C34175b.C341761 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Bundle bundle) {
                Log.m165379d("ChatFrame", "startChat callback");
                if (bundle != null) {
                    bundle.putBoolean("key_need_redirect", false);
                    bundle.putBoolean("DoAnimationWithDefault", false);
                    bundle.putString("gochatwin_from", "notification");
                }
                iGetDataCallback.onSuccess(bundle);
                if (bundle != null) {
                    PerfChatPerformanceMonitor.m213463a(chatBundle.f74042p);
                    C35228b.m137564a().mo121114a(C29990c.m110930b().mo134528a(), ChatBundle.m109260a(bundle));
                }
            }
        };
        if (chatBundle == null || TextUtils.isEmpty(chatBundle.f74027a)) {
            Log.m165383e("ChatFrame", "Failed to open chat，bundle is null!!!");
            r1.onError(new ErrorResult("Failed to open chat，bundle is null!!!"));
            return;
        }
        final String str = chatBundle.f74032f;
        int i = chatBundle.f74029c;
        Log.m165389i("ChatFrame", "showPosition is:" + i + ", messageId:" + str);
        if (i != -1 || TextUtils.isEmpty(str)) {
            mo126716a(r1, extras);
            return;
        }
        Log.m165389i("ChatFrame", "try to get messageId on frame");
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.chat.service.impl.C34175b.RunnableC341772 */

            public void run() {
                C34175b.this.mo126717a(str, extras, r1);
            }
        });
    }

    /* renamed from: a */
    public void mo126716a(IGetDataCallback<Bundle> iGetDataCallback, Bundle bundle) {
        boolean z = bundle.getBoolean("key_param_from_offline_push", false);
        boolean e = m132677e();
        Log.m165389i("ChatFrame", "isFromOfflinePush:" + z + ", isEnableSyncChat:" + e);
        UICallbackExecutor.execute(new Runnable(e, z, iGetDataCallback, bundle) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$b$zPTEGsPr3CbGXHzdjmINPOQvfo */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ IGetDataCallback f$3;
            public final /* synthetic */ Bundle f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C34175b.this.m132675a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo126717a(String str, final Bundle bundle, final IGetDataCallback<Bundle> iGetDataCallback) {
        C32848e.m126401b().mo121102a(Collections.singletonList(str), new IGetDataCallback<List<Message>>() {
            /* class com.ss.android.lark.chat.service.impl.C34175b.C341783 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C34175b.this.mo126716a(iGetDataCallback, bundle);
            }

            /* renamed from: a */
            public void onSuccess(List<Message> list) {
                if (CollectionUtils.isNotEmpty(list)) {
                    bundle.putInt("showPosition", list.get(0).getPosition());
                }
                C34175b.this.mo126716a(iGetDataCallback, bundle);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m132675a(boolean z, boolean z2, IGetDataCallback iGetDataCallback, Bundle bundle) {
        if (!z || !z2) {
            iGetDataCallback.onSuccess(bundle);
        } else if (f88433b) {
            Log.m165389i("ChatFrame", "chat has synced, open chat");
            iGetDataCallback.onSuccess(bundle);
        } else {
            this.f88438f = bundle.getString("chatID");
            this.f88436d = iGetDataCallback;
            this.f88437e = bundle;
            $$Lambda$b$aMMXrrOkVVSTMBjrwRNe6QiV0o r1 = new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.$$Lambda$b$aMMXrrOkVVSTMBjrwRNe6QiV0o */

                public final void run() {
                    C34175b.this.m132680h();
                }
            };
            this.f88435c = r1;
            UICallbackExecutor.executeDelayed(r1, 3000);
        }
    }
}
