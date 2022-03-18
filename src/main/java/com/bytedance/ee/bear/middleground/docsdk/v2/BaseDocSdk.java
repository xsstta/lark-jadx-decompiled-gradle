package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.browser.plugin.C4951l;
import com.bytedance.ee.bear.jsbridge.AbstractC7943b;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.util.keyboard.SharePopupWindowKeyboardHeightProvider;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.Bridge;
import com.bytedance.ee.larkwebview.bridge.BridgeExetension;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.larkwebview.bridge.ResponseJsData;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p707j.C13684a;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
public abstract class BaseDocSdk implements LifecycleObserver, DocSdkV2 {

    /* renamed from: a */
    public LifecycleOwner f25058a;

    /* renamed from: b */
    public AbstractC4270e f25059b;

    /* renamed from: c */
    public C13684a.AbstractC13685a f25060c;

    /* renamed from: d */
    private WebView f25061d;

    /* renamed from: e */
    private C7939a f25062e;

    /* renamed from: f */
    private Bridge f25063f;

    /* renamed from: g */
    private AbstractC4958n f25064g;

    /* renamed from: h */
    private C9327a f25065h;

    /* renamed from: i */
    private boolean f25066i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract FragmentActivity mo35569a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract FragmentManager mo35570b();

    BaseDocSdk() {
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk$a */
    private class C9327a implements C4943e.AbstractC4944a {
        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: a */
        public LifecycleOwner mo19324a() {
            return BaseDocSdk.this.f25058a;
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        public FragmentActivity getActivity() {
            return BaseDocSdk.this.mo35569a();
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: b */
        public AbstractC4948i mo19326b() {
            return new C9341b(BaseDocSdk.this.f25059b, BaseDocSdk.this.f25060c);
        }

        private C9327a() {
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: a */
        public <T> T mo19325a(Class<T> cls) {
            if (!C13616d.m55262a(getActivity())) {
                return null;
            }
            throw new IllegalStateException("EditorSdk not support getService()");
        }
    }

    /* renamed from: d */
    private void m38518d() {
        this.f25063f.mo49767a(new BridgeExetension() {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk.C93264 */

            @Override // com.bytedance.ee.larkwebview.bridge.BridgeExetension
            /* renamed from: a */
            public ResponseJsData mo35579a(Status status, String str, Object obj, String str2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bizDomain", (Object) "ccm");
                ResponseJsData iVar = new ResponseJsData();
                iVar.mo49793a(str);
                iVar.mo49795b(jSONObject.toString());
                iVar.mo49791a(status);
                iVar.mo49792a(obj);
                return iVar;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ C4943e m38519e() {
        return new C9344a(new C9343c(this.f25061d, this.f25062e)) {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk.C93253 */
        };
    }

    /* renamed from: c */
    public void mo35575c() {
        C4949j.m20465a().mo19582b(this.f25065h, this.f25064g);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C4943e.AbstractC4945b bVar;
        C13479a.m54764b("DocSdkV2", "onCreate");
        this.f25061d.addJavascriptInterface(this.f25062e, "_DocsBridge");
        this.f25065h = new C9327a();
        if (this.f25066i) {
            C9338a aVar = new C9338a(this.f25061d, this.f25063f);
            m38518d();
            bVar = new C4943e.AbstractC4945b(aVar) {
                /* class com.bytedance.ee.bear.middleground.docsdk.v2.$$Lambda$BaseDocSdk$JUiYzJzCse0gGYjv9t31SE2peNE */
                public final /* synthetic */ C9338a f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
                public final C4943e createPluginHost() {
                    return BaseDocSdk.this.m38516a(this.f$1);
                }
            };
        } else {
            bVar = new C4943e.AbstractC4945b() {
                /* class com.bytedance.ee.bear.middleground.docsdk.v2.$$Lambda$BaseDocSdk$s5EhlThih2ETpvBBOGcgNXaMGE */

                @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
                public final C4943e createPluginHost() {
                    return BaseDocSdk.this.m38519e();
                }
            };
        }
        C4949j.m20465a().mo19576a(bVar, this.f25065h);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C13479a.m54764b("DocSdkV2", "onDestroy");
        this.f25058a.getLifecycle().removeObserver(this);
        C4949j.m20465a().mo19577a(this.f25065h);
        AbstractC10550f.AbstractC10551a.m43718c(mo35569a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C4943e m38516a(C9338a aVar) {
        return new C9344a(aVar) {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk.C93242 */
        };
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2
    public void unregisterCustomJSHandler(String str) {
        this.f25062e.mo30831a(str);
    }

    /* renamed from: a */
    public void mo35573a(ViewGroup viewGroup) {
        if (viewGroup.getId() != R.id.pluginUIContainer) {
            FrameLayout frameLayout = new FrameLayout(mo35569a());
            frameLayout.setId(R.id.pluginUIContainer);
            viewGroup.addView(frameLayout, -1, -1);
        }
        this.f25064g = new C4951l(mo35569a(), viewGroup, mo35570b());
        C4949j.m20465a().mo19579a(this.f25065h, this.f25064g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35574a(DocSdkV2.C9328a aVar) {
        C7939a aVar2;
        this.f25058a = aVar.f25076c;
        this.f25061d = aVar.f25074a;
        boolean z = aVar.f25077d;
        this.f25066i = z;
        if (z) {
            this.f25063f = ((LarkWebView) this.f25061d).getBridge();
        } else {
            if (aVar.f25075b != null) {
                aVar2 = aVar.f25075b;
            } else {
                aVar2 = new C7939a(new C9345d(this.f25061d));
            }
            this.f25062e = aVar2;
        }
        this.f25059b = aVar.f25080g;
        this.f25060c = aVar.f25081h;
        if (aVar.f25078e != null) {
            m38517a(aVar.f25078e, aVar.f25079f);
        }
        this.f25058a.getLifecycle().addObserver(this);
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2
    public void registerCustomJSHandler(String str, AbstractC7943b bVar) {
        this.f25062e.mo30832a(str, bVar);
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2
    public void registerCustomJSHandler(String str, BridgeHandler cVar) {
        Bridge aVar = this.f25063f;
        if (aVar != null) {
            aVar.mo49770a(str, cVar);
        }
    }

    /* renamed from: a */
    private void m38517a(final PopupWindow popupWindow, final ViewGroup viewGroup) {
        AbstractC10550f.AbstractC10551a.m43716a(mo35569a(), new AbstractC10550f.AbstractC10551a() {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk.C93231 */

            @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10550f.AbstractC10551a
            /* renamed from: a */
            public AbstractC10550f mo17215a(Activity activity) {
                return new SharePopupWindowKeyboardHeightProvider(activity, popupWindow, viewGroup);
            }
        });
        AbstractC10550f.AbstractC10551a.m43717b(mo35569a());
    }
}
