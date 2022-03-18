package com.bytedance.ee.bear.document.more;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.AbstractC7586e;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.doc.p290a.AbstractC5319a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocActivity;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.bitable.BitableProMoreItem;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.document.export.more.ExportMoreItemV2;
import com.bytedance.ee.bear.document.icon.IconMoreItemV2;
import com.bytedance.ee.bear.document.more.C5881a;
import com.bytedance.ee.bear.document.pageview.PageviewMoreItemV2;
import com.bytedance.ee.bear.document.search.SearchMoreItemV2;
import com.bytedance.ee.bear.document.share.ShareMoreItemV2;
import com.bytedance.ee.bear.document.template.TemplateMoreItemV2;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.AbstractC10209c;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.multitask.MultitaskHelper;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.document.more.a */
public class C5881a {

    /* renamed from: a */
    public FragmentActivity f16459a;

    /* renamed from: b */
    private C6095s f16460b;

    /* renamed from: c */
    private AbstractC5884a f16461c;

    /* renamed from: d */
    private Disposable f16462d;

    /* renamed from: e */
    private boolean f16463e;

    /* renamed from: f */
    private DialogInterface$OnCancelListenerC1021b f16464f;

    /* renamed from: g */
    private C1177w<IMoreInfo> f16465g = new C1177w<>();

    /* renamed from: h */
    private C1177w<IconInfo> f16466h = new C1177w<>();

    /* renamed from: i */
    private AbstractC1178x<IconInfo> f16467i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.more.a$a */
    public interface AbstractC5884a {
        /* renamed from: a */
        void mo23755a();

        /* renamed from: b */
        void mo23756b();

        /* renamed from: c */
        void mo23757c();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m23653g() {
        this.f16461c.mo23756b();
    }

    /* renamed from: f */
    private void m23652f() {
        Disposable disposable = this.f16462d;
        if (disposable != null && !disposable.isDisposed()) {
            this.f16462d.dispose();
        }
    }

    /* renamed from: c */
    private void m23649c() {
        DocViewModel m = this.f16460b.mo24598m();
        this.f16467i = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.more.$$Lambda$a$CJSoQde0dVssqjEyKEiOQpo6Xo */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5881a.this.m23643a((C5881a) ((IconInfo) obj));
            }
        };
        m.getIconInfoData().mo5923a(this.f16460b.mo19566h(), this.f16467i);
    }

    /* renamed from: e */
    private IBaseMoreItem m23651e() {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38965a(new IMultiTaskMoreItemHelper() {
            /* class com.bytedance.ee.bear.document.more.C5881a.C58832 */

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ Unit m23660f() {
                if (C5881a.this.f16459a == null) {
                    return null;
                }
                C5881a.this.f16459a.onBackPressed();
                return null;
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: b */
            public boolean mo23764b() {
                MultitaskHelper e = m23659e();
                if (e == null || !e.mo169049e()) {
                    return false;
                }
                return true;
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: c */
            public void mo23765c() {
                MultitaskHelper e = m23659e();
                if (e != null) {
                    e.mo169050f();
                }
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: d */
            public void mo23766d() {
                MultitaskHelper e = m23659e();
                if (e != null) {
                    e.mo169045a(new Function0() {
                        /* class com.bytedance.ee.bear.document.more.$$Lambda$a$2$IDkXC3TnFJMMp34O06waFuVvhtk */

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5881a.C58832.this.m23660f();
                        }
                    });
                }
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: a */
            public boolean mo23763a() {
                if ((C5881a.this.f16459a instanceof DocActivity) || (C5881a.this.f16459a instanceof AbstractC7586e)) {
                    return true;
                }
                return false;
            }

            /* renamed from: e */
            private MultitaskHelper m23659e() {
                if (!mo23763a()) {
                    return null;
                }
                if (C5881a.this.f16459a instanceof DocActivity) {
                    return ((DocActivity) C5881a.this.f16459a).mo22316c();
                }
                if (C5881a.this.f16459a instanceof AbstractC7586e) {
                    return ((AbstractC7586e) C5881a.this.f16459a).mo29850a();
                }
                return null;
            }
        });
    }

    /* renamed from: b */
    public boolean mo23761b() {
        DialogInterface$OnCancelListenerC1021b bVar = this.f16464f;
        if (bVar == null || bVar.v_() == null || !this.f16464f.v_().isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private ArrayList<MoreItemGroup> m23650d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean isType = this.f16460b.mo24598m().isType(C8275a.f22377j);
        boolean c = ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21071c(this.f16460b);
        MoreItemGroup a = new MoreItemGroup().mo39169a(1).mo39170a(m23640a(this.f16459a, CommonMoreItemId.SHORT_CUT)).mo39170a(new ShareMoreItemV2(this.f16460b)).mo39171a(m23651e(), !this.f16463e);
        IBaseMoreItem a2 = m23640a(this.f16459a, CommonMoreItemId.STAR);
        if (!isType || !c) {
            z = true;
        } else {
            z = false;
        }
        MoreItemGroup a3 = a.mo39171a(a2, z);
        IBaseMoreItem a4 = m23640a(this.f16459a, CommonMoreItemId.PIN);
        if (!isType || !c) {
            z2 = true;
        } else {
            z2 = false;
        }
        MoreItemGroup a5 = a3.mo39171a(a4, z2).mo39171a(m23640a(this.f16459a, CommonMoreItemId.MANUAL_CACHE), !isType).mo39171a(m23640a(this.f16459a, CommonMoreItemId.ADD), !isType).mo39171a(m23640a(this.f16459a, CommonMoreItemId.ADD_SHORT_CUT), !isType);
        IBaseMoreItem a6 = m23640a(this.f16459a, CommonMoreItemId.DELETE);
        if (this.f16463e || isType) {
            z3 = false;
        } else {
            z3 = true;
        }
        MoreItemGroup a7 = a5.mo39171a(a6, z3);
        BaseMoreItem b = ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21067b(this.f16460b);
        if (!isType || !c) {
            z4 = false;
        } else {
            z4 = true;
        }
        MoreItemGroup a8 = a7.mo39171a(b, z4);
        BaseMoreItem a9 = ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21061a(this.f16460b);
        if (!isType || !c) {
            z5 = false;
        } else {
            z5 = true;
        }
        MoreItemGroup a10 = a8.mo39171a(a9, z5).mo39168a();
        MoreItemGroup a11 = new MoreItemGroup().mo39169a(3).mo39170a(new IconMoreItemV2(this.f16460b)).mo39170a(new PageviewMoreItemV2(this.f16460b)).mo39170a(m23640a(this.f16459a, CommonMoreItemId.SUBSCRIBE)).mo39170a(new BitableProMoreItem()).mo39170a(m23640a(this.f16459a, CommonMoreItemId.PERMISSION)).mo39171a(((AbstractC5319a) KoinJavaComponent.m268610a(AbstractC5319a.class)).mo21343b(this.f16460b), !this.f16463e).mo39170a(new SearchMoreItemV2(this.f16460b)).mo39170a(m23640a(this.f16459a, CommonMoreItemId.APPLY_EDIT_PERMISSION)).mo39170a(m23640a(this.f16459a, CommonMoreItemId.RENAME)).mo39171a(((AbstractC5319a) KoinJavaComponent.m268610a(AbstractC5319a.class)).mo21341a(this.f16460b), !this.f16463e).mo39170a(((AbstractC5319a) KoinJavaComponent.m268610a(AbstractC5319a.class)).mo21344c(this.f16460b)).mo39171a(m23640a(this.f16459a, CommonMoreItemId.MAKE_COPY), !isType);
        C6095s sVar = this.f16460b;
        BaseMoreItem a12 = ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21062a(sVar, sVar.mo24598m().getDocTitle());
        if (!isType || !c) {
            z6 = false;
        } else {
            z6 = true;
        }
        MoreItemGroup a13 = a11.mo39171a(a12, z6).mo39171a(new TemplateMoreItemV2(this.f16459a, this.f16460b), !isType).mo39170a(new ExportMoreItemV2(this.f16459a, this.f16460b, false)).mo39170a(m23640a(this.f16459a, CommonMoreItemId.CONTACT_SERVICE)).mo39170a(m23640a(this.f16459a, CommonMoreItemId.REPORT)).mo39168a();
        ArrayList<MoreItemGroup> arrayList = new ArrayList<>();
        arrayList.add(a10);
        arrayList.add(a13);
        return arrayList;
    }

    /* renamed from: a */
    public void mo23758a() {
        if (this.f16467i != null) {
            this.f16460b.mo24598m().getIconInfoData().mo5928b(this.f16467i);
        }
        this.f16459a = null;
        this.f16460b = null;
        this.f16464f = null;
    }

    /* renamed from: a */
    public void mo23760a(MoreModel moreModel) {
        m23648b(moreModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23643a(IconInfo iconInfo) {
        this.f16466h.mo5929b(iconInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m23642a(String str) throws Exception {
        return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31524f(this.f16460b.mo24598m().getToken());
    }

    /* renamed from: b */
    private void m23648b(final MoreModel moreModel) {
        final DocViewModel m = this.f16460b.mo24598m();
        DocumentInfo documentInfoData = m.getDocumentInfoData();
        final $$Lambda$a$UlhYV0NSqG1gsMs2CDFZwM5tVCE r2 = new Runnable(m) {
            /* class com.bytedance.ee.bear.document.more.$$Lambda$a$UlhYV0NSqG1gsMs2CDFZwM5tVCE */
            public final /* synthetic */ DocViewModel f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C5881a.this.m23644a((C5881a) this.f$1);
            }
        };
        if (documentInfoData == null) {
            m.requestDocumentInfo(m.getUrl());
            m.liveDocumentInfoData().mo5923a(this.f16460b.mo19566h(), new AbstractC1178x<DocumentInfo>() {
                /* class com.bytedance.ee.bear.document.more.C5881a.C58821 */

                /* renamed from: a */
                public void onChanged(DocumentInfo documentInfo) {
                    m.liveDocumentInfoData().mo5928b(this);
                    C5881a.this.mo23759a(documentInfo, r2, moreModel);
                }
            });
        } else {
            mo23759a(documentInfoData, r2, moreModel);
        }
        m23649c();
        m23645a(documentInfoData);
    }

    /* renamed from: a */
    private void m23645a(DocumentInfo documentInfo) {
        if (documentInfo != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", C13598b.m55197d(documentInfo.getObjToken()));
            hashMap.put("file_type", C8275a.m34050a(documentInfo.getType()));
            C5234y.m21391b().mo21079a("click_innerpage_more", hashMap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23644a(DocViewModel docViewModel) {
        C6095s sVar = this.f16460b;
        if (sVar == null) {
            C13479a.m54775e("DocMoreRouteCompatAction", "Plugin host has been destroy");
        } else if (sVar.mo19569k() || mo23761b()) {
            C13479a.m54775e("DocMoreRouteCompatAction", "plugin is destroy = " + this.f16460b.mo19569k() + ", isShowing:" + mo23761b());
        } else {
            this.f16464f = ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38962a(this.f16459a, m23650d(), this.f16465g, this.f16466h, new AbstractC10209c() {
                /* class com.bytedance.ee.bear.document.more.$$Lambda$a$FTjMk2CuwYQiwjGJ1jvtMt9eI */

                @Override // com.bytedance.ee.bear.more.export.AbstractC10209c
                public final void closeMore() {
                    C5881a.this.m23653g();
                }
            }, new Bundle());
            DocumentInfo documentInfoData = docViewModel.getDocumentInfoData();
            if (documentInfoData != null) {
                ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38974a(documentInfoData.getObjToken(), documentInfoData.getType(), documentInfoData.getSubType(), documentInfoData.isSubscribe(), docViewModel.isType(C8275a.f22377j), this.f16463e);
            }
            this.f16461c.mo23755a();
            this.f16461c.mo23757c();
        }
    }

    /* renamed from: a */
    private IBaseMoreItem m23640a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38964a(fragmentActivity, commonMoreItemId);
    }

    C5881a(C6095s sVar, AbstractC5884a aVar) {
        boolean z;
        this.f16460b = sVar;
        this.f16459a = sVar.mo19564f();
        this.f16461c = aVar;
        if (sVar.mo24598m().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        this.f16463e = z;
    }

    /* renamed from: a */
    private String m23641a(DocViewModel docViewModel, String str) {
        if (TextUtils.isEmpty(docViewModel.getDocFeedId())) {
            return str;
        }
        return str + "&docId=" + docViewModel.getDocFeedId() + "&sourceType=" + docViewModel.getSourceType();
    }

    /* renamed from: a */
    public void mo23759a(DocumentInfo documentInfo, Runnable runnable, MoreModel moreModel) {
        if (documentInfo == null) {
            C13479a.m54764b("DocMoreRouteCompatAction", "documentInfo == null!!!");
            return;
        }
        m23652f();
        this.f16462d = AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.more.$$Lambda$a$uiY8mzmeUHbM0OLKKx0GLIy_aE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5881a.this.m23642a((String) obj);
            }
        }).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) false)).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(documentInfo, moreModel, runnable) {
            /* class com.bytedance.ee.bear.document.more.$$Lambda$a$zTnS8s8Bk4lEwQv0Cv2qYAr6tAQ */
            public final /* synthetic */ DocumentInfo f$1;
            public final /* synthetic */ MoreModel f$2;
            public final /* synthetic */ Runnable f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5881a.this.m23646a(this.f$1, this.f$2, this.f$3, (Boolean) obj);
            }
        }, $$Lambda$a$Wm3ioC17oPoNropTBFggG9jIv0c.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23646a(DocumentInfo documentInfo, MoreModel moreModel, Runnable runnable, Boolean bool) throws Exception {
        DocMoreInfo aVar;
        String str;
        DocViewModel m = this.f16460b.mo24598m();
        if (!m.isType(C8275a.f22377j) || (str = C6313i.m25327a().mo25399g(m.getOriginUrl()).f17447b) == null) {
            aVar = new DocMoreInfo(documentInfo.getType(), documentInfo.getUrl(), documentInfo.getObjToken(), "", false, bool.booleanValue(), documentInfo.getDocMetaInfo(), documentInfo.getDocObjInfo(), documentInfo.getDocPermission(), documentInfo.getVersion(), this.f16463e, false);
            DocMoreInfo aVar2 = aVar;
            aVar2.mo39025a(moreModel.getDisables());
            aVar2.mo39029b(moreModel.getInvisibles());
            aVar2.mo39033c(moreModel.getBadges());
        } else {
            aVar = new WikiMoreInfo(documentInfo.getType(), m23641a(m, documentInfo.getUrl()), documentInfo.getObjToken(), "", false, bool.booleanValue(), documentInfo.getDocMetaInfo(), documentInfo.getDocObjInfo(), documentInfo.getDocPermission(), documentInfo.getVersion(), str, this.f16463e, ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21071c(this.f16460b));
        }
        DocMoreInfo aVar3 = aVar;
        aVar3.mo39039f(moreModel.getBitable().isPro());
        aVar3.mo39023a(moreModel.getBitable().getTables());
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38971a(aVar, this.f16465g, runnable);
    }
}
