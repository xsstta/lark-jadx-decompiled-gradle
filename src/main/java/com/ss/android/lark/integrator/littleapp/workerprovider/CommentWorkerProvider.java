package com.ss.android.lark.integrator.littleapp.workerprovider;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.basesdk.api.AbstractC4379e;
import com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25559b;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25561d;
import com.larksuite.component.openplatform.plugins.p1144c.C25563f;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.integrator.littleapp.workerprovider.CommentWorkerProvider;
import com.ss.android.lark.integrator.plugin.EnterProfileByUserIdPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.tt.refer.common.util.C67866g;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class CommentWorkerProvider implements AbstractC25558a {

    /* renamed from: a */
    private AbstractC4379e.AbstractC4380a f101456a;

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a
    /* renamed from: c */
    public String mo88702c() {
        return "comment_for_gadget";
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a
    /* renamed from: d */
    public List<String> mo88703d() {
        return Collections.singletonList("token");
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a
    /* renamed from: e */
    public void mo88704e() {
        Log.m165389i("CommentWorkerProvider", "onWorkerDestroy");
    }

    /* access modifiers changed from: private */
    public static class CommentSDKInitConfig {
        @JSONField(name = "bizType")
        public int mBizType = 1;
        @JSONField(name = "token")
        public String mToken;
        @JSONField(name = ShareHitPoint.f121869d)
        public int mType = 2;

        private CommentSDKInitConfig() {
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a
    /* renamed from: a */
    public String mo88699a() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).apiGroups().mo17140g().mo17030a();
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a
    /* renamed from: b */
    public String mo88701b() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).apiGroups().mo17140g().mo17031b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m158108a(C25563f fVar) {
        Log.m165389i("CommentWorkerProvider", "rn ready");
        fVar.mo88712g().ready();
    }

    @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a
    /* renamed from: a */
    public void mo88700a(final C25563f fVar, Activity activity) {
        Log.m165389i("CommentWorkerProvider", "onWorkerCreated");
        JSONObject d = fVar.mo88709d();
        final AbstractC25561d c = fVar.mo88708c();
        CommentSDKInitConfig commentSDKInitConfig = (CommentSDKInitConfig) JSONObject.toJavaObject(d, CommentSDKInitConfig.class);
        Log.m165389i("CommentWorkerProvider", "config :" + d.toJSONString());
        long currentTimeMillis = System.currentTimeMillis();
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).checkAndInit();
        Log.m165389i("CommentWorkerProvider", "doc init timestamp:" + (System.currentTimeMillis() - currentTimeMillis));
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        PopupWindow b = fVar.mo88707b();
        this.f101456a = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).apiGroups().mo17140g().mo17029a(new ICommentDependency() {
            /* class com.ss.android.lark.integrator.littleapp.workerprovider.CommentWorkerProvider.C398281 */

            @Override // com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency
            /* renamed from: c */
            public AbstractC25561d mo17218c() {
                return c;
            }

            @Override // com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency
            /* renamed from: b */
            public String mo17217b() {
                return fVar.mo88711f();
            }

            @Override // com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency
            /* renamed from: d */
            public AbstractC7665c mo17219d() {
                return new AbstractC7665c() {
                    /* class com.ss.android.lark.integrator.littleapp.workerprovider.CommentWorkerProvider.C398281.C398291 */

                    @Override // com.bytedance.ee.bear.facade.common.AbstractC7665c
                    /* renamed from: a */
                    public void mo30121a(AbstractC7666d dVar) {
                        dVar.getClass();
                        $$Lambda$qLmyKa8DTwP5FFyuLfE8g7KP1jE r0 = new AbstractC25559b() {
                            /* class com.ss.android.lark.integrator.littleapp.workerprovider.$$Lambda$qLmyKa8DTwP5FFyuLfE8g7KP1jE */

                            @Override // com.larksuite.component.openplatform.plugins.p1144c.AbstractC25559b
                            public final boolean onBackPressed() {
                                return AbstractC7666d.this.onBackPressed();
                            }
                        };
                        concurrentHashMap.put(dVar, r0);
                        c.mo85944a(r0);
                    }

                    @Override // com.bytedance.ee.bear.facade.common.AbstractC7665c
                    /* renamed from: b */
                    public void mo30122b(AbstractC7666d dVar) {
                        AbstractC25559b bVar = (AbstractC25559b) concurrentHashMap.get(dVar);
                        if (bVar != null) {
                            c.mo85946b(bVar);
                        }
                    }
                };
            }

            @Override // com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency
            /* renamed from: a */
            public String mo17216a() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }
        });
        C67866g.m264027a(new Runnable(activity, b, fVar, commentSDKInitConfig) {
            /* class com.ss.android.lark.integrator.littleapp.workerprovider.$$Lambda$CommentWorkerProvider$UDJsCThq8k1VwHDxT2PIEzF36rU */
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ PopupWindow f$2;
            public final /* synthetic */ C25563f f$3;
            public final /* synthetic */ CommentWorkerProvider.CommentSDKInitConfig f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                CommentWorkerProvider.lambda$UDJsCThq8k1VwHDxT2PIEzF36rU(CommentWorkerProvider.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m158107a(Activity activity, PopupWindow popupWindow, C25563f fVar, CommentSDKInitConfig commentSDKInitConfig) {
        this.f101456a.mo17033a(activity, popupWindow, (ViewGroup) popupWindow.getContentView());
        this.f101456a.mo17035a(new Runnable() {
            /* class com.ss.android.lark.integrator.littleapp.workerprovider.$$Lambda$CommentWorkerProvider$S7AA6TqRBS3WiI78lfajZwGPNc */

            public final void run() {
                CommentWorkerProvider.m270632lambda$S7AA6TqRBS3WiI78lfajZwGPNc(C25563f.this);
            }
        });
        this.f101456a.mo17034a((FragmentActivity) activity, fVar.mo88706a(), commentSDKInitConfig.mToken, commentSDKInitConfig.mType, commentSDKInitConfig.mBizType);
        fVar.mo88710e().mo92199a(this.f101456a.mo17032a());
        fVar.mo88710e().mo92199a(new EnterProfileByUserIdPlugin());
    }
}
