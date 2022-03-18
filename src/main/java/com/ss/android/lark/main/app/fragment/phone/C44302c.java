package com.ss.android.lark.main.app.fragment.phone;

import android.view.View;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.behavior.v1.TabActivatedRequest;
import com.bytedance.lark.pb.behavior.v1.TabActivatedResponse;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.main.IFeedLoadListener;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44331k;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.main.app.fragment.C44256d;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.app.fragment.phone.C44314e;
import com.ss.android.lark.main.app.fragment.phone.MainCustomStatusModel;
import com.ss.android.lark.main.interfaces.AbstractC44500b;
import com.ss.android.lark.main.interfaces.AbstractC44501d;
import com.ss.android.lark.main.interfaces.AbstractC44503f;
import com.ss.android.lark.main.interfaces.AbstractC44505h;
import com.ss.android.lark.main.interfaces.AbstractC44506i;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.fragment.phone.c */
public class C44302c implements C44274f.AbstractC44275a {

    /* renamed from: a */
    final AbstractC44136a f112359a = C44134a.m174959a();

    /* renamed from: b */
    public C44274f.AbstractC44275a.AbstractC44276a f112360b;

    /* renamed from: c */
    public C44314e f112361c = new C44314e(new C44314e.AbstractC44320a() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.AnonymousClass11 */

        @Override // com.ss.android.lark.main.app.fragment.phone.C44314e.AbstractC44320a
        /* renamed from: a */
        public void mo157420a(int i) {
            C44302c.this.f112360b.mo157286a((long) i);
        }
    });

    /* renamed from: d */
    AbstractC44136a.AbstractC44173y.AbstractC44174a f112362d = new AbstractC44136a.AbstractC44173y.AbstractC44174a() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443074 */

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y.AbstractC44174a
        /* renamed from: b */
        public void mo157138b(boolean z) {
        }

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44173y.AbstractC44174a
        /* renamed from: a */
        public void mo157137a(boolean z) {
            C44302c.this.mo157417c(z);
        }
    };

    /* renamed from: e */
    AbstractC44505h f112363e = new AbstractC44505h() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443085 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44505h
        /* renamed from: a */
        public void mo157423a(boolean z) {
            C44302c.this.mo157416b(z);
        }
    };

    /* renamed from: f */
    AbstractC44506i f112364f = new AbstractC44506i() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443096 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44506i
        /* renamed from: a */
        public void mo157424a(NetworkLevel networkLevel) {
            C44302c.this.mo157414a(networkLevel);
        }
    };

    /* renamed from: g */
    IFeedLoadListener f112365g = new IFeedLoadListener() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443107 */

        @Override // com.ss.android.lark.biz.core.api.main.IFeedLoadListener
        /* renamed from: a */
        public void mo105695a() {
            C44302c.this.f112361c.mo157428c();
        }
    };

    /* renamed from: h */
    private CallbackManager f112366h = new CallbackManager();

    /* renamed from: i */
    private AbstractC44500b f112367i = new AbstractC44500b() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443129 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44500b
        /* renamed from: a */
        public void mo157410a(Class cls) {
            C44302c.this.mo157415a(cls);
        }
    };

    /* renamed from: j */
    private AbstractC44501d f112368j = new AbstractC44501d() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.AnonymousClass10 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44501d
        /* renamed from: a */
        public void mo157419a(View view, boolean z) {
            C44302c.this.mo157413a(new C44256d(view, z));
        }
    };

    /* renamed from: k */
    private MainCustomStatusModel f112369k = new MainCustomStatusModel(new MainCustomStatusModel.ICustomStatusUpdater() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443042 */

        @Override // com.ss.android.lark.main.app.fragment.phone.MainCustomStatusModel.ICustomStatusUpdater
        /* renamed from: a */
        public void mo157409a(String str, String str2) {
            C44302c.this.f112360b.mo157289a(str, str2);
        }
    });

    /* renamed from: l */
    private AbstractC44503f f112370l = new AbstractC44503f() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.C443031 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44503f
        /* renamed from: a */
        public void mo157234a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
            if (C44302c.this.f112360b != null) {
                C44302c.this.f112360b.mo157290a(list);
            }
        }
    };

    /* renamed from: m */
    private boolean f112371m = false;

    /* renamed from: n */
    private final Runnable f112372n = new Runnable() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44302c.RunnableC443118 */

        public void run() {
            C44302c.this.mo157418c();
        }
    };

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m175791d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m175793e();
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a
    /* renamed from: b */
    public void mo157357b() {
        this.f112369k.mo157408d();
    }

    /* renamed from: c */
    public boolean mo157418c() {
        boolean z;
        if (!C44134a.m174959a().mo133200T().mo133288d() || !C44134a.m174959a().mo133200T().mo133285b()) {
            z = false;
        } else {
            z = true;
        }
        m175792d(z);
        return z;
    }

    /* renamed from: d */
    private void m175791d() {
        C44134a.m174959a().mo133194N().mo133384a(this.f112367i);
        C44134a.m174959a().mo133189I().mo133392a(this.f112363e);
        C44134a.m174959a().mo133190J().mo133428a(this.f112362d);
        C44134a.m174959a().mo133194N().mo133386a(this.f112368j);
        C44134a.m174959a().mo133188H().mo133400a(this.f112370l);
        C44134a.m174959a().mo133188H().mo133406b();
        C44134a.m174959a().mo133188H().mo133414d();
        C44134a.m174959a().mo133191K().mo133381a(this.f112364f);
        this.f112369k.mo157405a();
        mo157414a(C44134a.m174959a().mo133191K().mo133379a());
        this.f112360b.mo157290a(C44134a.m174959a().mo133188H().mo133395a());
        mo157417c(C44134a.m174959a().mo133190J().mo133429a());
        mo157416b(C44134a.m174959a().mo133189I().mo133393a());
        if (!mo157418c() && C44134a.m174959a().mo133257m().mo133353c()) {
            UICallbackExecutor.executeDelayed(this.f112372n, 3000);
        }
        this.f112361c.mo157426a();
        C44134a.m174959a().mo133240c().mo133274a(this.f112365g);
    }

    /* renamed from: e */
    private void m175793e() {
        C44134a.m174959a().mo133191K().mo133382b(this.f112364f);
        C44134a.m174959a().mo133190J().mo133430b(this.f112362d);
        C44134a.m174959a().mo133189I().mo133394b(this.f112363e);
        C44134a.m174959a().mo133188H().mo133408b(this.f112370l);
        C44134a.m174959a().mo133194N().mo133388b(this.f112367i);
        C44134a.m174959a().mo133194N().mo133390b(this.f112368j);
        C44134a.m174959a().mo133188H().mo133412c();
        C44134a.m174959a().mo133188H().mo133415e();
        UICallbackExecutor.removeCallbacks(this.f112372n);
        CallbackManager callbackManager = this.f112366h;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
        }
        C44134a.m174959a().mo133240c().mo133277b(this.f112365g);
        this.f112369k.mo157406b();
        this.f112361c.mo157427b();
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a
    /* renamed from: a */
    public boolean mo157356a() {
        return this.f112371m;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a
    /* renamed from: a */
    public void mo157353a(C44274f.AbstractC44275a.AbstractC44276a aVar) {
        this.f112360b = aVar;
    }

    /* renamed from: d */
    private void m175792d(boolean z) {
        C44274f.AbstractC44275a.AbstractC44276a aVar = this.f112360b;
        if (aVar != null) {
            aVar.mo157293c(z);
        }
    }

    /* renamed from: a */
    public void mo157413a(C44256d dVar) {
        this.f112360b.mo157287a(dVar);
    }

    /* renamed from: c */
    public void mo157417c(boolean z) {
        C44274f.AbstractC44275a.AbstractC44276a aVar = this.f112360b;
        if (aVar != null) {
            aVar.mo157291a(z);
        }
    }

    /* renamed from: a */
    public void mo157414a(NetworkLevel networkLevel) {
        C44274f.AbstractC44275a.AbstractC44276a aVar = this.f112360b;
        if (aVar != null) {
            aVar.mo157288a(networkLevel);
        }
    }

    /* renamed from: b */
    public void mo157416b(boolean z) {
        C44274f.AbstractC44275a.AbstractC44276a aVar = this.f112360b;
        if (aVar != null) {
            aVar.mo157292b(z);
        }
    }

    /* renamed from: a */
    public void mo157415a(Class<?> cls) {
        if (cls == MainActivity.class) {
            this.f112359a.mo133269y();
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a
    /* renamed from: a */
    public void mo157354a(final String str) {
        CoreThreadPool.getDefault().getScheduleThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.main.app.fragment.phone.C44302c.RunnableC443053 */

            public void run() {
                SdkSender.syncSendMayError(Command.TAB_ACTIVATED, new TabActivatedRequest.C15460a().mo56025a(C44331k.m175850a(str)), new SdkSender.IParser<Boolean>() {
                    /* class com.ss.android.lark.main.app.fragment.phone.C44302c.RunnableC443053.C443061 */

                    /* renamed from: a */
                    public Boolean parse(byte[] bArr) throws IOException {
                        boolean z;
                        if (TabActivatedResponse.ADAPTER.decode(bArr) != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44275a
    /* renamed from: a */
    public void mo157355a(boolean z) {
        this.f112371m = z;
    }
}
