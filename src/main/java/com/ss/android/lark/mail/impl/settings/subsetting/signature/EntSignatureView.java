package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.app.Activity;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b;
import com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureAdapter;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43605d;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43713a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class EntSignatureView implements C43199a.AbstractC43200a, AbstractC43577f.AbstractC43579b, AbstractC43719c {

    /* renamed from: a */
    C43589i f110550a;

    /* renamed from: b */
    public final Context f110551b;

    /* renamed from: c */
    private final C43713a f110552c;

    /* renamed from: d */
    private AbstractC43556a f110553d;

    /* renamed from: e */
    private AbstractC43577f.AbstractC43579b.AbstractC43580a f110554e;

    /* renamed from: f */
    private EntSignatureAdapter f110555f;

    /* renamed from: g */
    private LKUIStatus f110556g;
    @BindView(8759)
    ConstraintLayout mContentLayout;
    @BindView(8760)
    UDEmptyState mEmptyState;
    @BindView(8778)
    FrameLayout mLoadingLayout;
    @BindView(8863)
    UDNotice mNotice;
    @BindView(8758)
    ScrollView mPCContentBg;
    @BindView(8785)
    CommonRecyclerView mSignatureSettingRv;
    @BindView(8786)
    UDTabLayout mTabLayout;
    @BindView(8787)
    CommonTitleBar mTitleBar;
    @BindView(9590)
    LinearLayout mWebContainer;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView$a */
    public interface AbstractC43556a {
        /* renamed from: a */
        void mo155498a(EntSignatureView entSignatureView);
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public Context getContext() {
        return this.f110551b;
    }

    /* renamed from: a */
    private LifecycleOwner m172905a() {
        return (ComponentActivity) this.f110551b;
    }

    /* renamed from: b */
    private void m172910b() {
        m172911c();
        C41988g.m166973d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110554e = null;
        this.f110553d = null;
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: o */
    public void mo150630o() {
        this.f110552c.mo155831b();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: p */
    public int mo150631p() {
        return this.f110552c.mo155832c();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        this.f110552c.mo155830a();
    }

    /* renamed from: c */
    private void m172911c() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.RunnableC435554 */

            public void run() {
                if (EntSignatureView.this.f110551b instanceof Activity) {
                    Log.m165389i("EntSignatureView", "onRenderProcessGone finish Activity");
                    ((Activity) EntSignatureView.this.f110551b).finish();
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public String getContainerName() {
        return ((BaseMailFragmentActivity) this.f110551b).mo150444a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110553d.mo155498a(this);
        LKUIStatus a = new LKUIStatus.C25680a(this.mLoadingLayout).mo89857a(R.color.transparent).mo89855a(0.44d).mo89859a();
        this.f110556g = a;
        a.mo89837a();
        this.mTabLayout.addOnTabSelectedListener(new UDTabLayout.OnTabSelectedListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.C435521 */

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: a */
            public void mo53906a(UDTab bVar) {
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: b */
            public void mo53907b(UDTab bVar) {
                EntSignatureView.this.mo155516b(bVar.mo91343d());
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: c */
            public void mo53908c(UDTab bVar) {
                int d = bVar.mo91343d();
                if (d == 0) {
                    EntSignatureView.this.mTitleBar.setTitle(C43819s.m173684a((int) R.string.Mail_BusinessSignature_EmailSignature));
                } else {
                    EntSignatureView.this.mTitleBar.setTitle(bVar.mo91339b());
                }
                EntSignatureView.this.mo155511a(d);
            }
        });
        EntSignatureAdapter entSignatureAdapter = new EntSignatureAdapter();
        this.f110555f = entSignatureAdapter;
        entSignatureAdapter.mo155503a(new EntSignatureAdapter.AbstractC43551a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureView$Dc2UBMqJyLbU6Yi0Y3xPcMyPp4k */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureAdapter.AbstractC43551a
            public final void onSelectSignature(boolean z, boolean z2, String str, String str2, String str3) {
                EntSignatureView.this.m172909a(z, z2, str, str2, str3);
            }
        });
        this.mSignatureSettingRv.setLayoutManager(new LinearLayoutManager(this.f110551b, 1, false));
        this.mSignatureSettingRv.setAdapter(this.f110555f);
        this.f110554e.mo155569b().mo5923a(m172905a(), new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureView$q8Zu56vAHe1Y19sXGv5rVL6R74Q */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                EntSignatureView.this.m172908a((EntSignatureView) ((Boolean) obj).booleanValue());
            }
        });
        this.f110554e.mo155570c().mo5923a(m172905a(), new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureView$GuduAfMVX3_8X0Pd2TyMfUqgg2M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                EntSignatureView.this.m172907a((EntSignatureView) ((C42095h) obj));
            }
        });
        this.f110554e.mo155571d().mo5923a(m172905a(), new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureView$cv2etLBJAOC1Zy6m3u5xte8Czg4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                EntSignatureView.this.m172906a((EntSignatureView) ((EntSignatureUsage) obj));
            }
        });
        this.f110550a = new C43589i(this.f110551b);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        this.f110550a.mo155586a(this, (AbstractC43201b) null);
        C43589i iVar = this.f110550a;
        iVar.getSettings().setUseWideViewPort(false);
        iVar.setMinimumHeight(UIHelper.dp2px(20.0f));
        this.mWebContainer.addView(iVar, layoutParams);
        this.f110550a.setWebJsPromptListener(this);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f110550a, true);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43577f.AbstractC43579b.AbstractC43580a aVar) {
        this.f110554e = aVar;
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: a */
    public void mo150561a(WebView webView) {
        Log.m165389i("EntSignatureView", "SignatureView onRenderProcessGone 22");
        m172910b();
    }

    /* renamed from: a */
    public void mo155511a(int i) {
        if (i == 0) {
            this.mPCContentBg.setVisibility(0);
        } else if (i == 1) {
            this.mSignatureSettingRv.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m172908a(boolean z) {
        if (!z) {
            this.f110556g.mo89847d();
            this.mEmptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
            this.mEmptyState.setDesc(C43819s.m173684a((int) R.string.Mail_Settings_NetworkErrorRetry));
            this.mEmptyState.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo155516b(int i) {
        if (i == 0) {
            this.mPCContentBg.setVisibility(8);
        } else if (i == 1) {
            this.mSignatureSettingRv.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m172906a(EntSignatureUsage entSignatureUsage) {
        EntSignatureAdapter entSignatureAdapter = this.f110555f;
        if (entSignatureAdapter != null && CollectionUtils.isNotEmpty(entSignatureAdapter.getItems())) {
            int i = 0;
            while (true) {
                if (i < this.f110555f.getItemCount()) {
                    EntSignatureUsage entSignatureUsage2 = (EntSignatureUsage) this.f110555f.getItem(i);
                    if (entSignatureUsage2 != null && entSignatureUsage.getAddress().equals(entSignatureUsage2.getAddress())) {
                        entSignatureUsage2.setNewMailSignatureId(entSignatureUsage.getNewMailSignatureId());
                        entSignatureUsage2.setReplyMailSignatureId(entSignatureUsage.getReplyMailSignatureId());
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            this.f110555f.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0172  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m172907a(com.ss.android.lark.mail.impl.entity.C42095h r20) {
        /*
        // Method dump skipped, instructions count: 433
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.m172907a(com.ss.android.lark.mail.impl.entity.h):void");
    }

    public EntSignatureView(Context context, AbstractC43556a aVar) {
        this.f110551b = context;
        this.f110553d = aVar;
        this.f110552c = new C43713a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo155515b(List<MailEntSignature> list, boolean z) {
        try {
            return new C43605d().mo155612a(list, z);
        } catch (Throwable th) {
            Log.m165387e("TemplateParseError", th, true);
            return "";
        }
    }

    /* renamed from: c */
    private void m172912c(final List<MailEntSignature> list, final boolean z) {
        if (list == null || list.isEmpty()) {
            this.f110550a.setVisibility(8);
            this.mPCContentBg.setVisibility(8);
            this.f110556g.mo89847d();
            this.mEmptyState.setVisibility(0);
            return;
        }
        C43608e.m173074a().mo155618a(new C43608e.AbstractC43611a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.C435532 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e.AbstractC43611a
            /* renamed from: b */
            public void mo155518b() {
                Log.m165389i("EntSignatureView", "loadH5Page onFailed");
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e.AbstractC43611a
            /* renamed from: a */
            public void mo155517a() {
                Log.m165389i("EntSignatureView", "loadH5Page onComplete");
                EntSignatureView.this.mo155514a(list, z);
            }
        });
        this.f110550a.setVisibility(0);
        this.mPCContentBg.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6 A[SYNTHETIC] */
    @Override // com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a.AbstractC43200a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153803a(java.lang.String r6, org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.mo153803a(java.lang.String, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public void mo155513a(List<MailEntSignature> list, String str) {
        this.f110550a.setSignatureItem(list);
        String b = C43608e.m173074a().mo155619b();
        Log.m165389i("EntSignatureView", "testAsynRender loadData loadDataWithBaseURL ");
        this.f110550a.loadDataWithBaseURL(b, str, "text/html; charset=UTF-8", null, null);
        this.f110556g.mo89847d();
    }

    /* renamed from: a */
    public void mo155514a(final List<MailEntSignature> list, boolean z) {
        final String b = mo155515b(list, z);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.RunnableC435543 */

            public void run() {
                EntSignatureView.this.mo155513a(list, b);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172909a(boolean z, boolean z2, String str, String str2, String str3) {
        if ((this.f110551b instanceof EntSignatureActivity) && this.f110555f.mo155501a() != null) {
            ArrayList<MailEntSignature> arrayList = new ArrayList<>(this.f110555f.mo155501a());
            if (!z) {
                arrayList.add(0, new MailEntSignature("0", C43819s.m173684a((int) R.string.Mail_BusinessSignature_NoUse)));
            }
            this.f110554e.mo155568a(this.f110551b, z2, str, str2, str3, arrayList);
        }
    }
}
