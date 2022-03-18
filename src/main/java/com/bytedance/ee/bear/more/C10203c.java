package com.bytedance.ee.bear.more;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.AbstractC4154a;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.leanmode.CCMConfig;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.more.MoreViewModel;
import com.bytedance.ee.bear.more.export.AbstractC10209c;
import com.bytedance.ee.bear.more.export.C10211e;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.PageviewResult;
import com.bytedance.ee.bear.more.itemv2.C10234b;
import com.bytedance.ee.bear.more.itemv2.CopyLinkItemV2;
import com.bytedance.ee.bear.more.itemv2.ManualCacheItemV2;
import com.bytedance.ee.bear.more.itemv2.MultiTaskMoreItem;
import com.bytedance.ee.bear.more.itemv2.StarItemV2;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.more.p501b.C10197a;
import com.bytedance.ee.bear.more.pageview2.C10240a;
import com.bytedance.ee.bear.more.view2.MoreFragmentV2;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.more.c */
public class C10203c implements AbstractC10194a {

    /* renamed from: a */
    C10197a f27538a;

    /* renamed from: b */
    C10240a f27539b;

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public boolean mo38977a(String str) {
        return C10208e.m42526a(str);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public IBaseMoreItem mo38966a(String str, String str2) {
        return new CopyLinkItemV2(str, str2);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38972a(IMoreInfo dVar, String str) {
        C10196b.m42465a(dVar, str);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38971a(IMoreInfo dVar, C1177w<IMoreInfo> wVar, Runnable runnable) {
        m42502c(dVar.mo39040g()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(wVar, runnable) {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$JmlpHgHXMyBnwLgka_jtb6klIY */
            public final /* synthetic */ C1177w f$1;
            public final /* synthetic */ Runnable f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10203c.m42500a(IMoreInfo.this, this.f$1, this.f$2, (Boolean) obj);
            }
        }, new Consumer(dVar, runnable) {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$fSNDhXbtvq2XtrUPm7WOFcrz70g */
            public final /* synthetic */ IMoreInfo f$1;
            public final /* synthetic */ Runnable f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10203c.m42498a(C1177w.this, this.f$1, this.f$2, (Throwable) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38970a(FragmentActivity fragmentActivity, int i, String str, boolean z, C10211e eVar, DialogInterface.OnDismissListener onDismissListener) {
        if (this.f27538a == null) {
            this.f27538a = new C10197a(fragmentActivity);
        } else {
            C13479a.m54764b("MoreImpl", "showPageview(): pageView already exist");
        }
        this.f27538a.mo38991a(eVar);
        this.f27538a.mo38988a(i, str, z);
        this.f27538a.mo38990a(new C10197a.AbstractC10199a(fragmentActivity) {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$FLkNFQ8x1QH_UEQXgLwMY9AHw */
            public final /* synthetic */ FragmentActivity f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.more.p501b.C10197a.AbstractC10199a
            public final void gotoProfile(String str, C10917c cVar) {
                C10203c.this.m42497a((C10203c) this.f$1, (FragmentActivity) str, (String) cVar);
            }
        });
        this.f27538a.mo38989a(new DialogInterface.OnDismissListener(onDismissListener) {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$JXD3eziolMuDzAslqVw7u7kqknA */
            public final /* synthetic */ DialogInterface.OnDismissListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C10203c.this.m42501b(this.f$1, dialogInterface);
            }
        });
        fragmentActivity.getLifecycle().addObserver(new MoreImpl$1(this, fragmentActivity));
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38969a(FragmentActivity fragmentActivity, int i, String str, DialogInterface.OnDismissListener onDismissListener) {
        ((MoreViewModel) aj.m5366a(fragmentActivity).mo6005a(MoreViewModel.class)).setIsOpenPageView(true);
        C10240a a = C10240a.m42727a(fragmentActivity, i, str);
        this.f27539b = a;
        a.mo39182a(new DialogInterface.OnDismissListener(onDismissListener) {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$24Ty2sCgR3NAoHcnH0tvz4wjs0c */
            public final /* synthetic */ DialogInterface.OnDismissListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C10203c.this.m42496a((C10203c) this.f$1, (DialogInterface.OnDismissListener) dialogInterface);
            }
        });
        this.f27539b.mo5511a(fragmentActivity.getSupportFragmentManager(), (String) null);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38967a() {
        C10240a aVar = this.f27539b;
        if (aVar != null) {
            aVar.u_();
        } else {
            C13479a.m54764b("MoreImpl", "dismissPageViewFragment(): dialogFragment is null");
        }
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38973a(C10211e eVar) {
        C10197a aVar = this.f27538a;
        if (aVar != null) {
            aVar.mo38991a(eVar);
        } else {
            C13479a.m54764b("MoreImpl", "updatePageViewUI(): pageview is null");
        }
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38974a(String str, int i, String str2, boolean z, boolean z2, boolean z3) {
        C10196b.m42467a(str, i, str2, z, z2, z3);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38975a(String str, Bundle bundle, String str2, int i, String str3, boolean z, boolean z2) {
        C10196b.m42468a(str, bundle, str2, i, str3, z, z2);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38976a(String str, Bundle bundle, String str2, int i, String str3, boolean z, boolean z2, String str4, String str5, String str6) {
        C10196b.m42469a(str, bundle, str2, i, str3, z, z2, str4, str5, str6);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: b */
    public void mo38979b() {
        C10197a aVar = this.f27538a;
        if (aVar != null) {
            aVar.mo38992b();
        } else {
            C13479a.m54764b("MoreImpl", "dismissPageView(): pageview is null");
        }
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: b */
    public void mo38980b(String str) {
        C10208e.m42527b(str);
    }

    /* renamed from: c */
    private AbstractC68307f<Boolean> m42502c(String str) {
        return new C10917c(new C10929e()).mo41508c(ak.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$MRvBbH5IcH5xNY_QTLQKaltcE */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10203c.m42495a(this.f$0, (ak) obj);
            }
        });
    }

    /* renamed from: c */
    private String m42503c(FragmentActivity fragmentActivity) {
        IMoreInfo b = ((MoreViewModel) aj.m5366a(fragmentActivity).mo6005a(MoreViewModel.class)).getMoreInfoLiveData().mo5927b();
        if (b == null) {
            return null;
        }
        return b.mo39042i();
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: b */
    public C1177w<PageviewResult> mo38978b(FragmentActivity fragmentActivity) {
        return ((MoreViewModel) aj.m5366a(fragmentActivity).mo6005a(MoreViewModel.class)).getPageviewResultLiveData();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m42499a(AbstractC10209c cVar) {
        if (cVar != null) {
            cVar.closeMore();
        } else {
            C13479a.m54775e("MoreImpl", "closeMore: failed delegate is null");
        }
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public IBaseMoreItem mo38963a(FragmentActivity fragmentActivity) {
        return (IBaseMoreItem) ((AbstractC4154a) KoinJavaComponent.m268610a(AbstractC4154a.class)).mo16329a(fragmentActivity);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public IBaseMoreItem mo38965a(IMultiTaskMoreItemHelper bVar) {
        return new MultiTaskMoreItem(bVar);
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public IBaseMoreItem mo38964a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return C10234b.m42700a(fragmentActivity, commonMoreItemId);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m42496a(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        } else {
            C13479a.m54764b("MoreImpl", "onDismiss(): listener is null");
        }
        this.f27539b = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m42501b(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        } else {
            C13479a.m54764b("MoreImpl", "onDismiss(): listener is null");
        }
        this.f27538a = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m42495a(String str, ak akVar) throws Exception {
        Uri parse;
        String queryParameter;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (queryParameter = parse.getQueryParameter("sourceType")) == null || !"feed".equalsIgnoreCase(queryParameter)) {
            return false;
        }
        String queryParameter2 = parse.getQueryParameter("docId");
        if (TextUtils.isEmpty(queryParameter2)) {
            return false;
        }
        C13479a.m54764b("MoreImpl", "isFeedCardShortcut()... mFeedId = " + queryParameter2);
        return Boolean.valueOf(akVar.isFeedCardShortcut(queryParameter2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m42497a(FragmentActivity fragmentActivity, String str, C10917c cVar) {
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, m42503c(fragmentActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m42498a(C1177w wVar, IMoreInfo dVar, Runnable runnable, Throwable th) throws Exception {
        wVar.mo5929b(dVar);
        if (runnable != null) {
            runnable.run();
        }
        C13479a.m54759a("MoreImpl", "accept(): isFeedCardShortcut ", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m42500a(IMoreInfo dVar, C1177w wVar, Runnable runnable, Boolean bool) throws Exception {
        dVar.mo39028b(bool.booleanValue());
        wVar.mo5929b(dVar);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public DialogInterface$OnCancelListenerC1021b mo38962a(FragmentActivity fragmentActivity, ArrayList<MoreItemGroup> arrayList, C1177w<IMoreInfo> wVar, C1177w<IconInfo> wVar2, AbstractC10209c cVar, Bundle bundle) {
        boolean z;
        boolean z2;
        if (!C13726a.m55676b(fragmentActivity)) {
            StringBuilder sb = new StringBuilder();
            sb.append("activity is not active, return null, activity is null = ");
            boolean z3 = true;
            if (fragmentActivity == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", is finishing = ");
            if (fragmentActivity == null || !fragmentActivity.isFinishing()) {
                z2 = false;
            } else {
                z2 = true;
            }
            sb.append(z2);
            sb.append(", is destroyed = ");
            if (fragmentActivity == null || !fragmentActivity.isDestroyed()) {
                z3 = false;
            }
            sb.append(z3);
            C13479a.m54758a("MoreImpl", sb.toString());
            return null;
        }
        MoreViewModel fVar = (MoreViewModel) aj.m5366a(fragmentActivity).mo6005a(MoreViewModel.class);
        fVar.setMoreInfoLiveData(wVar);
        fVar.setIconInfoLiveData(wVar2);
        fVar.setDelegate(new MoreViewModel.Delegate() {
            /* class com.bytedance.ee.bear.more.$$Lambda$c$jI5WW0Lvlk6BY3kWW5_pmv71Aqw */

            @Override // com.bytedance.ee.bear.more.MoreViewModel.Delegate
            public final void closeMore() {
                C10203c.m42499a(AbstractC10209c.this);
            }
        });
        if (arrayList != null) {
            CCMConfig b = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b();
            Iterator<MoreItemGroup> it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<IBaseMoreItem> it2 = it.next().mo39173c().iterator();
                while (it2.hasNext()) {
                    IBaseMoreItem next = it2.next();
                    if (((next instanceof ManualCacheItemV2) && !b.mo20780e().f14914a) || ((next instanceof StarItemV2) && !b.mo20778d().f14914a)) {
                        it2.remove();
                    }
                }
            }
            fVar.getGroupListLiveData().mo5926a(arrayList);
            if (bundle == null) {
                bundle = new Bundle();
            }
            return MoreFragmentV2.m42809a(fragmentActivity, bundle);
        }
        throw new RuntimeException("moreItemGroups must not be null");
    }

    @Override // com.bytedance.ee.bear.more.AbstractC10194a
    /* renamed from: a */
    public void mo38968a(Bundle bundle, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3) {
        C10196b.m42463a(bundle, str, i, z, str2, str3, str4, str5, str6, str7, z2, z3);
    }
}
