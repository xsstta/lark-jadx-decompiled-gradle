package com.bytedance.ee.larkbrand.p653g;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.core.p1106a.C24401b;
import com.larksuite.suite.R;
import com.tt.miniapp.p3276d.p3278b.AbstractC65979a;
import com.tt.miniapp.view.BaseLaunchLoadingView;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.refer.common.base.AppType;

/* renamed from: com.bytedance.ee.larkbrand.g.b */
public class C13063b extends AbstractC13062a implements AbstractC12888c {

    /* renamed from: c */
    public AbstractC24361a f34720c;

    /* renamed from: d */
    public C13067c f34721d;

    /* renamed from: e */
    public boolean f34722e;

    /* renamed from: f */
    private String f34723f;

    /* renamed from: g */
    private AppType f34724g;

    /* renamed from: h */
    private FrameLayout f34725h;

    /* renamed from: i */
    private long f34726i;

    /* renamed from: j */
    private int f34727j;

    /* renamed from: k */
    private boolean f34728k;

    @Override // com.bytedance.ee.larkbrand.p653g.AbstractC13062a
    /* renamed from: a */
    public void mo49111a() {
        if (this.f34720c != null) {
            onResume();
        }
    }

    @Override // com.bytedance.ee.larkbrand.p653g.AbstractC13062a
    /* renamed from: b */
    public void mo49115b() {
        if (this.f34720c != null) {
            onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f34720c.mo87108a(OPContainerLifecycleEventEnum.ON_DESTROY, new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f34722e = false;
        this.f34720c.mo87108a(OPContainerLifecycleEventEnum.ON_HIDE, new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f34720c.mo87108a(OPContainerLifecycleEventEnum.ON_STOP, new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f34722e = true;
        this.f34720c.mo87108a(OPContainerLifecycleEventEnum.ON_SHOW, new Object[0]);
    }

    /* renamed from: d */
    private void m53579d() {
        FrameLayout frameLayout = this.f34725h;
        if (frameLayout == null) {
            AppBrandLogger.m52829e("GadgetAppFragment", "fragment root is null");
            return;
        }
        frameLayout.postDelayed(new Runnable() {
            /* class com.bytedance.ee.larkbrand.p653g.$$Lambda$b$mBKvl6Z9X4q4ifwkmF8OggmqF0 */

            public final void run() {
                C13063b.m270130lambda$mBKvl6Z9X4q4ifwkmF8OggmqF0(C13063b.this);
            }
        }, 5000);
        if (this.f34717a != null) {
            AppBrandLogger.m52830i("GadgetAppFragment", "change title bar height");
            this.f34725h.setPadding(0, this.f34717a.mo99189a(), 0, 0);
        }
        this.f34720c.mo87107a(this.f34725h);
    }

    /* renamed from: c */
    public void m53580e() {
        if (this.f34718b != null && !this.f34728k) {
            AppBrandLogger.m52830i("GadgetAppFragment", "onLaunchStatusError : onFirstFrame Show & Draw");
            this.f34718b.mo149245b();
            this.f34718b.mo149244a();
            this.f34728k = true;
        }
    }

    /* renamed from: a */
    public void mo49116a(int i) {
        Bundle arguments = getArguments();
        if (i == 2) {
            if (System.currentTimeMillis() - this.f34726i > 180000) {
                this.f34726i = System.currentTimeMillis();
                m53577a(arguments, i);
                return;
            }
            AppBrandLogger.m52830i("GadgetAppFragment", "force reload too frequently");
        } else if (i == 3) {
            m53577a(arguments, i);
        } else {
            m53578b(arguments, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            AppBrandLogger.m52829e("GadgetAppFragment", "bundle is null!!");
            return;
        }
        String string = arguments.getString("appId");
        this.f34723f = string;
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52829e("GadgetAppFragment", "appId is empty, now finish activity");
            new C67500a(C67501b.f170244l, C67448a.m262353a().mo234190i()).setResultTypeFail().setErrorMessage("appId is empty").flush();
            return;
        }
        this.f34724g = (AppType) arguments.getSerializable("appType");
        mo49116a(1);
    }

    /* renamed from: a */
    public static C13063b m53576a(String str, int i) {
        C13063b bVar = new C13063b();
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putInt("scene", i);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34725h = (FrameLayout) view.findViewById(R.id.gadget_fragment_container_root);
        m53579d();
    }

    /* renamed from: a */
    private void m53577a(Bundle bundle, int i) {
        AbstractC24361a aVar = this.f34720c;
        if (aVar != null) {
            aVar.mo87108a(OPContainerLifecycleEventEnum.ON_DESTROY, new Object[0]);
            this.f34720c = null;
        }
        m53578b(bundle, i);
    }

    /* renamed from: b */
    private void m53578b(Bundle bundle, int i) {
        AppBrandLogger.m52830i("GadgetAppFragment", "initGadgetApp");
        bundle.putSerializable(C24377a.f60160e, AppType.GadgetAPP);
        bundle.putString(C24377a.f60157b, this.f34723f);
        OPContainerBundle oPContainerBundle = new OPContainerBundle(bundle, getActivity());
        oPContainerBundle.mo87147a(new AbstractC24370c() {
            /* class com.bytedance.ee.larkbrand.p653g.C13063b.C130641 */

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
            public void ai_() {
            }

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
            /* renamed from: a */
            public void mo49118a() {
                AppBrandLogger.m52830i("GadgetAppFragment", "onLaunchSuccess");
                C13063b.this.m53580e();
            }

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
            /* renamed from: a */
            public void mo49119a(String str, String str2) {
                if (TextUtils.equals(str, "gadgetPageRenderProcessGone") || TextUtils.equals(str, "render_page_frame_js_load_timeout")) {
                    C13063b.this.mo49116a(2);
                    if (C13063b.this.f34722e) {
                        C13063b.this.f34720c.mo87108a(OPContainerLifecycleEventEnum.ON_SHOW, new Object[0]);
                    }
                }
                AppBrandLogger.m52829e("GadgetAppFragment", "initGadgetApp : errCode：" + str + " & " + str2);
                C13063b.this.m53580e();
            }
        });
        oPContainerBundle.mo87144a(getChildFragmentManager());
        C24401b.m89051c().mo87131a(getContext());
        AbstractC24361a a = C24401b.m89051c().mo87130a(this.f34723f).mo87126a(oPContainerBundle);
        this.f34720c = a;
        a.mo87128a(this);
        this.f34720c.mo87109a(AbstractC65979a.class, new AbstractC65979a() {
            /* class com.bytedance.ee.larkbrand.p653g.C13063b.C130652 */

            @Override // com.tt.miniapp.p3276d.p3278b.AbstractC65979a
            /* renamed from: a */
            public BaseLaunchLoadingView mo49121a() {
                if (C13063b.this.f34721d == null) {
                    synchronized (AbstractC65979a.class) {
                        if (C13063b.this.f34721d == null) {
                            C13063b.this.f34721d = new C13067c(C13063b.this.getContext());
                            C13063b.this.f34721d.setRetryClickListener(new View.OnClickListener() {
                                /* class com.bytedance.ee.larkbrand.p653g.C13063b.C130652.View$OnClickListenerC130661 */

                                public void onClick(View view) {
                                    C13063b.this.mo49116a(3);
                                }
                            });
                        }
                    }
                }
                return C13063b.this.f34721d;
            }
        });
        this.f34720c.mo87108a(OPContainerLifecycleEventEnum.ON_CREATE, new Object[0]);
        this.f34720c.mo87113d().setGadgetInteractiveProxy(this);
        if (i != 1) {
            m53579d();
        }
        this.f34727j = 4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC24361a aVar = this.f34720c;
        if (aVar != null) {
            aVar.mo87111a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gadget_fragment_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC24361a aVar = this.f34720c;
        if (aVar != null) {
            aVar.mo87106a(i, strArr, iArr);
        }
    }
}
