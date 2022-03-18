package com.ss.android.lark.contact.impl.contacts_banner.ug_banner;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.C35526b;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.View$OnAttachStateChangeListenerC35527c;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.BannerMaterial;
import com.ss.android.lark.ug.banner.BannerHandler;
import com.ss.android.lark.ug.banner.BannerReachPoint;
import com.ss.android.lark.ug.facade.UgReachSdk;
import com.ss.android.lark.ug.facade.bean.BizContextProvider;
import com.ss.android.lark.utils.PackageChannelManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u0016\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoader2;", "Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/IContactBannerLoader;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "containerRef", "Ljava/lang/ref/WeakReference;", "lastUserId", "", "permissionHandler", "Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/permission/ContactPermissionBannerHandler;", "reachPoint", "Lcom/ss/android/lark/ug/banner/BannerReachPoint;", "bindListener", "", "view", "Landroid/view/View;", "closeBanner", "getContainer", "initHandler", "bannerReachPoint", "initReachPointBanner", "context", "Landroid/content/Context;", "loadBanner", "tryExpose", "unInit", "updateBanner", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b */
public final class ContactBannerLoader2 implements IContactBannerLoader {

    /* renamed from: d */
    public static final Companion f91812d = new Companion(null);

    /* renamed from: a */
    public final WeakReference<ViewGroup> f91813a;

    /* renamed from: b */
    public BannerMaterial f91814b;

    /* renamed from: c */
    public final C35526b f91815c = new C35526b();

    /* renamed from: f */
    private BannerReachPoint f91816f;

    /* renamed from: g */
    private String f91817g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoader2$Companion;", "", "()V", "BIZ_CONTEXT_KEY_ADDRESS_BOOK_AUTH", "", "REACH_POINT_ID", "SCENARIO_ID", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u001e\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoader2$initReachPointBanner$2", "Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDependency;", "getContext", "Landroid/content/Context;", "onClick", "", "link", "", "onHide", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "manual", "onShow", "bannerView", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$f */
    public static final class C35522f implements BannerReachPoint.BannerReachPointDependency {

        /* renamed from: a */
        final /* synthetic */ ContactBannerLoader2 f91822a;

        /* renamed from: b */
        final /* synthetic */ Context f91823b;

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public Context mo16938a() {
            return this.f91823b;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$f$a */
        static final class C35523a extends Lambda implements Function0<Boolean> {
            final /* synthetic */ BannerMaterial $bannerInfo;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35523a(BannerMaterial bannerMaterial) {
                super(0);
                this.$bannerInfo = bannerMaterial;
            }

            /* Return type fixed from 'boolean' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                String str;
                BannerMaterial bannerMaterial = this.$bannerInfo;
                if (bannerMaterial != null) {
                    str = bannerMaterial.mbanner_name;
                } else {
                    str = null;
                }
                return TextUtils.equals(r0, str);
            }
        }

        C35522f(ContactBannerLoader2 bVar, Context context) {
            this.f91822a = bVar;
            this.f91823b = context;
        }

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public boolean mo16940a(BannerMaterial bannerMaterial, boolean z) {
            this.f91822a.mo130961b((View) null);
            return true;
        }

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public boolean mo16939a(View view, BannerMaterial bannerMaterial) {
            Intrinsics.checkParameterIsNotNull(bannerMaterial, "bannerInfo");
            boolean isKABuildPackage = PackageChannelManager.isKABuildPackage(this.f91823b);
            if (!((Boolean) new C35523a(bannerMaterial).invoke()).booleanValue() || !isKABuildPackage) {
                this.f91822a.f91814b = bannerMaterial;
                this.f91822a.mo130960a(view);
                this.f91822a.mo130961b(view);
                return true;
            }
            this.f91822a.mo130961b((View) null);
            return true;
        }
    }

    /* renamed from: c */
    public final void mo130962c() {
        BannerReachPoint fVar = this.f91816f;
        if (fVar != null) {
            fVar.mo195217k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, d2 = {"com/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoader2$bindListener$1", "Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/permission/DetectContactPermissionHelper;", "onGranted", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$b */
    public static final class C35518b extends View$OnAttachStateChangeListenerC35527c {

        /* renamed from: a */
        final /* synthetic */ ContactBannerLoader2 f91818a;

        /* renamed from: b */
        final /* synthetic */ Function0 f91819b;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.View$OnAttachStateChangeListenerC35527c
        /* renamed from: a */
        public void mo130963a() {
            if (((Boolean) this.f91819b.invoke()).booleanValue()) {
                this.f91818a.mo130962c();
            }
        }

        C35518b(ContactBannerLoader2 bVar, Function0 function0) {
            this.f91818a = bVar;
            this.f91819b = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$c */
    public static final class C35519c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ContactBannerLoader2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35519c(ContactBannerLoader2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String str;
            BannerMaterial bannerMaterial = this.this$0.f91814b;
            if (bannerMaterial != null) {
                str = bannerMaterial.mbanner_name;
            } else {
                str = null;
            }
            return TextUtils.equals(r0, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoader2$initReachPointBanner$1", "Lcom/ss/android/lark/ug/facade/bean/BizContextProvider;", "getBizContext", "", "", "getScenarioId", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$e */
    public static final class C35521e implements BizContextProvider {

        /* renamed from: a */
        final /* synthetic */ ContactBannerLoader2 f91821a;

        @Override // com.ss.android.lark.ug.facade.bean.BizContextProvider
        /* renamed from: b */
        public String mo130965b() {
            return "SCENE_CONTACT";
        }

        @Override // com.ss.android.lark.ug.facade.bean.BizContextProvider
        /* renamed from: a */
        public Map<String, String> mo130964a() {
            return MapsKt.mapOf(TuplesKt.to("addressbookAuth", String.valueOf(!this.f91821a.f91815c.mo16928a())));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35521e(ContactBannerLoader2 bVar) {
            this.f91821a = bVar;
        }
    }

    /* renamed from: d */
    private final void m138920d() {
        Log.m165389i("IContactBannerLoader", "tryExpose");
        UgReachSdk.tryExpose$default(UgReachSdk.INSTANCE, "SCENE_CONTACT", (BizContextProvider) null, 2, (Object) null);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: a */
    public ViewGroup mo130946a() {
        return this.f91813a.get();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: b */
    public void mo130950b() {
        BannerReachPoint fVar = this.f91816f;
        if (fVar != null) {
            UgReachSdk.INSTANCE.recycleReachPoint(fVar);
        }
        this.f91816f = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$g */
    public static final class RunnableC35524g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ContactBannerLoader2 f91824a;

        /* renamed from: b */
        final /* synthetic */ View f91825b;

        RunnableC35524g(ContactBannerLoader2 bVar, View view) {
            this.f91824a = bVar;
            this.f91825b = view;
        }

        public final void run() {
            ViewGroup viewGroup = this.f91824a.f91813a.get();
            if (viewGroup == null) {
                this.f91824a.mo130950b();
                return;
            }
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            View view = this.f91825b;
            if (view != null) {
                viewGroup.addView(view);
                Log.m165389i("IContactBannerLoader", "BannerReachPoint banner show");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoader2$initHandler$1", "Lcom/ss/android/lark/ug/banner/BannerHandler;", "onBannerClick", "", "view", "Landroid/view/View;", "url", "", "onBannerClose", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.b$d */
    public static final class C35520d implements BannerHandler {

        /* renamed from: a */
        final /* synthetic */ ContactBannerLoader2 f91820a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35520d(ContactBannerLoader2 bVar) {
            this.f91820a = bVar;
        }

        @Override // com.ss.android.lark.ug.banner.BannerHandler
        /* renamed from: a */
        public boolean mo16910a(View view) {
            this.f91820a.f91815c.mo16929a(view);
            return false;
        }

        @Override // com.ss.android.lark.ug.banner.BannerHandler
        /* renamed from: a */
        public boolean mo16911a(View view, String str) {
            return this.f91820a.f91815c.mo16930a(view, str);
        }
    }

    /* renamed from: a */
    private final void m138918a(BannerReachPoint fVar) {
        fVar.mo194538a("ContactsPermission", new C35520d(this));
    }

    /* renamed from: b */
    public final void mo130961b(View view) {
        UICallbackExecutor.execute(new RunnableC35524g(this, view));
    }

    public ContactBannerLoader2(ViewGroup viewGroup) {
        this.f91813a = new WeakReference<>(viewGroup);
    }

    /* renamed from: b */
    private final void m138919b(Context context) {
        if (this.f91816f == null) {
            BannerReachPoint fVar = (BannerReachPoint) UgReachSdk.INSTANCE.obtainReachPointById("RP_CONTACT_TOP", BannerReachPoint.class, new C35521e(this));
            this.f91816f = fVar;
            if (fVar != null) {
                m138918a(fVar);
                fVar.mo194536a((BannerReachPoint.BannerReachPointDependency) new C35522f(this, context));
                return;
            }
            Log.m165383e("IContactBannerLoader", "ReachPoint.obtain return null");
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: a */
    public void mo130947a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        AbstractC35361b.AbstractC35376o h = a.mo130163h();
        Intrinsics.checkExpressionValueIsNotNull(h, "ContactModule.getDependency().loginDependency");
        String c = h.mo130231c();
        if (!TextUtils.equals(c, this.f91817g)) {
            mo130950b();
        }
        this.f91817g = c;
        m138919b(context);
        m138920d();
    }

    /* renamed from: a */
    public final void mo130960a(View view) {
        if (view != null) {
            C35519c cVar = new C35519c(this);
            if (((Boolean) cVar.invoke()).booleanValue()) {
                new C35518b(this, cVar).mo130968a(view);
            }
        }
    }
}
