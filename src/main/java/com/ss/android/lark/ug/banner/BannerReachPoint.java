package com.ss.android.lark.ug.banner;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.BannerMaterial;
import com.ss.android.lark.pb.ug_reach.BannerMaterialCollection;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import com.ss.android.lark.ug.banner.ui.BannerListener;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import com.ss.android.lark.ug.plugin.ContainerServiceProvider;
import com.ss.android.lark.ug.plugin.ReachPointFactory;
import com.ss.android.lark.ug.plugin.base.BaseReachPoint;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003789B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0016\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0014J\b\u0010,\u001a\u00020\u001bH\u0002J\u001a\u0010,\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\u0004J\u0010\u00100\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.J\u000e\u00101\u001a\u00020\u001b2\u0006\u0010-\u001a\u000202J\u0010\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u000205H\u0007J\u000e\u00106\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bX\u000e¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006:"}, d2 = {"Lcom/ss/android/lark/ug/banner/BannerReachPoint;", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterialCollection;", "reachPointId", "", "reachPointType", "(Ljava/lang/String;Ljava/lang/String;)V", "_delegate", "Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDelegate;", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "value", "delegate", "getDelegate", "()Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDelegate;", "setDelegate", "(Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDelegate;)V", "handlerRegistry", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/ug/banner/BannerHandler;", "Lcom/ss/android/lark/ug/banner/BannerHandlerRegistry;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "consume", "", "getMaterialBase", "Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "logE", "methodName", "msg", "logI", "onCreate", "onDestroy", "onHide", "", "onShow", "onUpdateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "registerHandler", "bannerName", "handler", "reportClick", "view", "Landroid/view/View;", "link", "reportClosed", "reportShow", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "setDependency", "dependency", "Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDependency;", "unregisterHandler", "BannerReachPointDelegate", "BannerReachPointDependency", "Companion", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.f */
public final class BannerReachPoint extends BaseReachPoint<BannerMaterialCollection> {

    /* renamed from: c */
    public static final Companion f141229c = new Companion(null);

    /* renamed from: a */
    public final ConcurrentHashMap<String, BannerHandler> f141230a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public BannerMaterial f141231b;

    /* renamed from: g */
    private BannerReachPointDelegate f141232g;

    /* renamed from: h */
    private final ProtoAdapter<BannerMaterialCollection> f141233h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\u0005H&J\u001e\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDelegate;", "", "getContext", "Landroid/content/Context;", "onHide", "", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "manual", "onShow", "bannerView", "Landroid/view/View;", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$a */
    public interface BannerReachPointDelegate {
        /* renamed from: a */
        Context mo16938a();

        /* renamed from: a */
        boolean mo16939a(View view, BannerMaterial bannerMaterial);

        /* renamed from: a */
        boolean mo16940a(BannerMaterial bannerMaterial, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDependency;", "Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDelegate;", "onClick", "", "link", "", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Deprecated(message = "This class is renamed", replaceWith = @ReplaceWith(expression = "BannerReachPointDelegate", imports = {}))
    /* renamed from: com.ss.android.lark.ug.banner.f$b */
    public interface BannerReachPointDependency extends BannerReachPointDelegate {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/banner/BannerReachPoint$Companion;", "", "()V", "REACH_POINT_TYPE", "", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/banner/BannerReachPoint$Companion$1", "Lcom/ss/android/lark/ug/plugin/ReachPointFactory;", "Lcom/ss/android/lark/ug/banner/BannerReachPoint;", "createReachPoint", "reachPointId", "", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$d */
    public static final class C57367d implements ReachPointFactory<BannerReachPoint> {
        C57367d() {
        }

        /* renamed from: a */
        public BannerReachPoint mo194547b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reachPointId");
            return new BannerReachPoint(str, "Banner");
        }
    }

    /* renamed from: a */
    public final BannerReachPointDelegate mo194530a() {
        return this.f141232g;
    }

    @Override // com.ss.android.lark.ug.plugin.base.BaseReachPoint
    /* renamed from: b */
    public ProtoAdapter<BannerMaterialCollection> mo194540b() {
        return this.f141233h;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: c */
    public void mo194541c() {
        Log.m165389i("ug-banner", "onCreate");
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: g */
    public void mo194545g() {
        Log.m165389i("ug-banner", "onDestroy");
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: e */
    public boolean mo194543e() {
        BannerReachPointDelegate a = mo194530a();
        if (a != null) {
            return a.mo16940a(this.f141231b, false);
        }
        return false;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: f */
    public MaterialBase mo194544f() {
        BannerMaterial bannerMaterial = this.f141231b;
        if (bannerMaterial != null) {
            return bannerMaterial.mbase;
        }
        return null;
    }

    static {
        BaseReachPoint.f141736f.mo195222a("Banner", BannerReachPoint.class, new C57367d());
    }

    /* renamed from: n */
    private final void m222373n() {
        MaterialBase materialBase;
        String h = mo195214h();
        String m = mo195219m();
        ReachPointEvent.Event aVar = new ReachPointEvent.Event("consume", false, 2, null);
        BannerMaterial bannerMaterial = this.f141231b;
        if (bannerMaterial != null) {
            materialBase = bannerMaterial.mbase;
        } else {
            materialBase = null;
        }
        mo195212a(new ReachPointEvent(h, m, aVar, materialBase, null, 16, null));
    }

    /* renamed from: o */
    private final void m222374o() {
        MaterialBase materialBase;
        String h = mo195214h();
        String m = mo195219m();
        ReachPointEvent.Event aVar = new ReachPointEvent.Event("onClick", false, 2, null);
        BannerMaterial bannerMaterial = this.f141231b;
        if (bannerMaterial != null) {
            materialBase = bannerMaterial.mbase;
        } else {
            materialBase = null;
        }
        mo195212a(new ReachPointEvent(h, m, aVar, materialBase, null, 16, null));
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: d */
    public boolean mo194542d() {
        Context a;
        boolean z;
        BannerMaterial bannerMaterial;
        BannerReachPointDelegate a2 = mo194530a();
        if (a2 == null || (a = a2.mo16938a()) == null) {
            m222372b("onShow", "context is null");
            return false;
        }
        BannerMaterialCollection bannerMaterialCollection = (BannerMaterialCollection) mo195215i();
        if (bannerMaterialCollection != null) {
            List<BannerMaterial> list = bannerMaterialCollection.mbanners;
            Integer num = null;
            if (list != null) {
                if (list.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    list = null;
                }
                if (!(list == null || (bannerMaterial = list.get(0)) == null)) {
                    BaseBannerView a3 = BannerFactory.f141225a.mo194529a(a, bannerMaterial, new C57368e(this));
                    if (a3 != null) {
                        BannerReachPointDelegate a4 = mo194530a();
                        if (a4 != null) {
                            this.f141231b = bannerMaterial;
                            boolean a5 = a4.mo16939a(a3, bannerMaterial);
                            mo194539a("onShow", "result=" + a5);
                            return a5;
                        }
                        m222372b("onShow", "dependency not set yet");
                        return false;
                    }
                    m222372b("onShow", "BannerFactory.createBannerView view is null");
                    return false;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("bannerCollection.mbanners size: ");
            List<BannerMaterial> list2 = bannerMaterialCollection.mbanners;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            }
            sb.append(num);
            m222372b("onShow", sb.toString());
            return false;
        }
        m222372b("onShow", "bannerCollection is null");
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/ug/banner/BannerReachPoint$onShow$view$1", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "onClose", "", "view", "Landroid/view/View;", "onOpen", "link", "", "onShow", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$e */
    public static final class C57368e implements BannerListener {

        /* renamed from: a */
        final /* synthetic */ BannerReachPoint f141234a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57368e(BannerReachPoint fVar) {
            this.f141234a = fVar;
        }

        @Override // com.ss.android.lark.ug.banner.ui.BannerListener
        /* renamed from: a */
        public void mo194550a(BaseBannerView baseBannerView) {
            Intrinsics.checkParameterIsNotNull(baseBannerView, "view");
            this.f141234a.mo194537a(baseBannerView);
        }

        @Override // com.ss.android.lark.ug.banner.ui.BannerListener
        /* renamed from: a */
        public void mo194548a(View view) {
            String str;
            boolean z;
            BannerHandler dVar;
            this.f141234a.mo194531a(view);
            BannerMaterial bannerMaterial = this.f141234a.f141231b;
            if (bannerMaterial != null) {
                str = bannerMaterial.mbanner_name;
            } else {
                str = null;
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (dVar = this.f141234a.f141230a.get(str)) == null || !dVar.mo16910a(view)) {
                BannerReachPointDelegate a = this.f141234a.mo194530a();
                if (a != null) {
                    a.mo16940a(this.f141234a.f141231b, true);
                    return;
                }
                return;
            }
            this.f141234a.mo194539a("onClose", "handle consume");
        }

        @Override // com.ss.android.lark.ug.banner.ui.BannerListener
        /* renamed from: a */
        public void mo194549a(View view, String str) {
            String str2;
            boolean z;
            ContainerServiceProvider bVar;
            BannerHandler dVar;
            this.f141234a.mo194532a(view, str);
            BannerMaterial bannerMaterial = this.f141234a.f141231b;
            if (bannerMaterial != null) {
                str2 = bannerMaterial.mbanner_name;
            } else {
                str2 = null;
            }
            String str3 = str2;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (dVar = this.f141234a.f141230a.get(str2)) == null || !dVar.mo16911a(view, str)) {
                WeakReference<ContainerServiceProvider> j = this.f141234a.mo195216j();
                if (j != null && (bVar = j.get()) != null) {
                    bVar.mo195235a(str);
                    return;
                }
                return;
            }
            this.f141234a.mo194539a("onOpen", "handle consume");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$f */
    public static final class C57369f extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ String $link;
        final /* synthetic */ BannerReachPoint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57369f(BannerReachPoint fVar, String str) {
            super(1);
            this.this$0 = fVar;
            this.$link = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Object obj;
            MaterialBase materialBase;
            Intrinsics.checkParameterIsNotNull(jSONObject, "$receiver");
            BannerMaterial bannerMaterial = this.this$0.f141231b;
            String str = "";
            if (bannerMaterial == null || (materialBase = bannerMaterial.mbase) == null || (obj = materialBase.mtask_id) == null) {
                obj = str;
            }
            jSONObject.put("task_id", obj);
            jSONObject.put("click", "open");
            String str2 = this.$link;
            if (str2 != null) {
                str = str2;
            }
            jSONObject.put("target", str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$g */
    public static final class C57370g extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ BannerReachPoint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57370g(BannerReachPoint fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Long l;
            MaterialBase materialBase;
            Intrinsics.checkParameterIsNotNull(jSONObject, "$receiver");
            BannerMaterial bannerMaterial = this.this$0.f141231b;
            if (bannerMaterial == null || (materialBase = bannerMaterial.mbase) == null || (l = materialBase.mtask_id) == null) {
                l = "";
            }
            jSONObject.put("task_id", l);
            jSONObject.put("click", "close");
            jSONObject.put("target", "");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.f$h */
    public static final class C57371h extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ BannerReachPoint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57371h(BannerReachPoint fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Object obj;
            MaterialBase materialBase;
            Intrinsics.checkParameterIsNotNull(jSONObject, "$receiver");
            BannerMaterial bannerMaterial = this.this$0.f141231b;
            if (bannerMaterial == null || (materialBase = bannerMaterial.mbase) == null || (obj = materialBase.mtask_id) == null) {
                obj = "";
            }
            jSONObject.put("task_id", obj);
        }
    }

    /* renamed from: a */
    public void mo194533a(BannerMaterialCollection bannerMaterialCollection) {
        Intrinsics.checkParameterIsNotNull(bannerMaterialCollection, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo194533a((Message) bannerMaterialCollection);
    }

    /* renamed from: a */
    public final void mo194531a(View view) {
        m222373n();
        mo194539a("onClose", "user click to close");
        C57372h.m222400a("growth_banner_click", new C57370g(this));
    }

    /* renamed from: a */
    public final void mo194535a(BannerReachPointDelegate aVar) {
        if (aVar != null) {
            this.f141232g = aVar;
            mo195218l();
            mo194539a("setDependency", "onReady");
        }
    }

    @Deprecated(message = "This function is no longer get called", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    /* renamed from: a */
    public final void mo194536a(BannerReachPointDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        mo194535a((BannerReachPointDelegate) bVar);
    }

    /* renamed from: a */
    public final void mo194537a(BaseBannerView baseBannerView) {
        Intrinsics.checkParameterIsNotNull(baseBannerView, "view");
        mo194539a("onShow", "banner view show");
        C57372h.m222400a("growth_banner_view", new C57371h(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerReachPoint(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
        ProtoAdapter<BannerMaterialCollection> protoAdapter = BannerMaterialCollection.ADAPTER;
        Intrinsics.checkExpressionValueIsNotNull(protoAdapter, "BannerMaterialCollection.ADAPTER");
        this.f141233h = protoAdapter;
    }

    /* renamed from: b */
    private final void m222372b(String str, String str2) {
        Log.m165383e("ug-banner", str + ", " + str2 + ", rpid=" + mo195214h() + ", rpType=" + mo195219m());
    }

    /* renamed from: a */
    public final void mo194532a(View view, String str) {
        m222374o();
        mo194539a("onOpen", "url=" + str);
        C57372h.m222400a("growth_banner_click", new C57369f(this, str));
    }

    /* renamed from: a */
    public final void mo194538a(String str, BannerHandler dVar) {
        Intrinsics.checkParameterIsNotNull(str, "bannerName");
        Intrinsics.checkParameterIsNotNull(dVar, "handler");
        this.f141230a.put(str, dVar);
    }

    /* renamed from: a */
    public final void mo194539a(String str, String str2) {
        Log.m165389i("ug-banner", str + ", " + str2 + ", rpid=" + mo195214h() + ", rpType=" + mo195219m());
    }
}
