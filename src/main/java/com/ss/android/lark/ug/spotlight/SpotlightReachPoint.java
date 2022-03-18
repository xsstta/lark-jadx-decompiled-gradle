package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterial;
import com.ss.android.lark.ug.plugin.ReachPointFactory;
import com.ss.android.lark.ug.plugin.base.BaseReachPoint;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint;", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterial;", "reachPointId", "", "reachPointType", "(Ljava/lang/String;Ljava/lang/String;)V", "contextProvider", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$SpotlightContextProvider;", "dependency", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$SpotlightLifecycleListener;", "justHide", "", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "spotlightView", "Lcom/ss/android/lark/ug/spotlight/SpotlightView;", "close", "", "consume", "getMaterialBase", "Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "isShowing", "onCreate", "onDestroy", "onHide", "onShow", "setContextProvider", "spotlightContextProvider", "setLifecycleListener", "Companion", "SpotlightContextProvider", "SpotlightLifecycleListener", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.j */
public final class SpotlightReachPoint extends BaseReachPoint<SpotlightMaterial> {

    /* renamed from: c */
    public static final Companion f141703c = new Companion(null);

    /* renamed from: a */
    public SpotlightLifecycleListener f141704a;

    /* renamed from: b */
    public volatile boolean f141705b;

    /* renamed from: g */
    private SpotlightContextProvider f141706g;

    /* renamed from: h */
    private volatile SpotlightView f141707h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$SpotlightContextProvider;", "", "getActivity", "Landroid/app/Activity;", "getAnchorViews", "", "Landroid/view/View;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$c */
    public interface SpotlightContextProvider {
        /* renamed from: a */
        Activity mo141318a();

        /* renamed from: b */
        List<View> mo141319b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$SpotlightLifecycleListener;", "", "onClose", "", "spotlightReachPoint", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint;", "onLeftButtonClick", "curIndex", "", "total", "onRightButtonClick", "onShow", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$d */
    public interface SpotlightLifecycleListener {
        /* renamed from: a */
        void mo141320a(SpotlightReachPoint jVar);

        /* renamed from: a */
        void mo141321a(SpotlightReachPoint jVar, int i, int i2);

        /* renamed from: b */
        void mo141322b(SpotlightReachPoint jVar);

        /* renamed from: b */
        void mo141323b(SpotlightReachPoint jVar, int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$Companion;", "", "()V", "REACH_POINT_TYPE", "", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/spotlight/SpotlightReachPoint$Companion$1", "Lcom/ss/android/lark/ug/plugin/ReachPointFactory;", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint;", "createReachPoint", "reachPointId", "", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$b */
    public static final class C57513b implements ReachPointFactory<SpotlightReachPoint> {
        C57513b() {
        }

        /* renamed from: a */
        public SpotlightReachPoint mo194547b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reachPointId");
            return new SpotlightReachPoint(str, "Spotlight");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$e */
    static final class RunnableC57514e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpotlightReachPoint f141708a;

        RunnableC57514e(SpotlightReachPoint jVar) {
            this.f141708a = jVar;
        }

        public final void run() {
            this.f141708a.mo195194a();
        }
    }

    /* renamed from: a */
    public final void mo195194a() {
        SpotlightView kVar = this.f141707h;
        if (kVar != null) {
            kVar.mo195183a();
        }
    }

    @Override // com.ss.android.lark.ug.plugin.base.BaseReachPoint
    /* renamed from: b */
    public ProtoAdapter<SpotlightMaterial> mo194540b() {
        ProtoAdapter<SpotlightMaterial> protoAdapter = SpotlightMaterial.ADAPTER;
        Intrinsics.checkExpressionValueIsNotNull(protoAdapter, "SpotlightMaterial.ADAPTER");
        return protoAdapter;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: c */
    public void mo194541c() {
        Log.m165379d("ug-spotlight", "onCreate");
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: g */
    public void mo194545g() {
        Log.m165389i("ug-spotlight", "onDestroy");
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: e */
    public boolean mo194543e() {
        this.f141705b = true;
        UICallbackExecutor.execute(new RunnableC57514e(this));
        return true;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: f */
    public MaterialBase mo194544f() {
        SpotlightMaterial spotlightMaterial = (SpotlightMaterial) mo195215i();
        if (spotlightMaterial != null) {
            return spotlightMaterial.mbase;
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/ug/spotlight/SpotlightReachPoint$onShow$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$f */
    static final class RunnableC57515f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpotlightView f141709a;

        /* renamed from: b */
        final /* synthetic */ SpotlightReachPoint f141710b;

        RunnableC57515f(SpotlightView kVar, SpotlightReachPoint jVar) {
            this.f141709a = kVar;
            this.f141710b = jVar;
        }

        public final void run() {
            this.f141710b.f141705b = false;
            this.f141709a.mo195186c();
            SpotlightLifecycleListener dVar = this.f141710b.f141704a;
            if (dVar != null) {
                dVar.mo141322b(this.f141710b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/spotlight/SpotlightReachPoint$onShow$view$1", "Lcom/ss/android/lark/ug/spotlight/SpotlightBubbleListener;", "onDismiss", "", "onLeftButtonClick", "curIndex", "", "total", "onRightButtonClick", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.j$g */
    public static final class C57516g implements SpotlightBubbleListener {

        /* renamed from: a */
        final /* synthetic */ SpotlightReachPoint f141711a;

        public void onDismiss() {
            SpotlightLifecycleListener dVar = this.f141711a.f141704a;
            if (dVar != null) {
                dVar.mo141320a(this.f141711a);
            }
            if (!this.f141711a.f141705b) {
                this.f141711a.mo195197n();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57516g(SpotlightReachPoint jVar) {
            this.f141711a = jVar;
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightBubbleListener
        /* renamed from: a */
        public void mo195189a(int i, int i2) {
            SpotlightLifecycleListener dVar = this.f141711a.f141704a;
            if (dVar != null) {
                dVar.mo141321a(this.f141711a, i, i2);
            }
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightBubbleListener
        /* renamed from: b */
        public void mo195190b(int i, int i2) {
            SpotlightLifecycleListener dVar = this.f141711a.f141704a;
            if (dVar != null) {
                dVar.mo141323b(this.f141711a, i, i2);
            }
        }
    }

    static {
        BaseReachPoint.f141736f.mo195222a("Spotlight", SpotlightReachPoint.class, new C57513b());
    }

    /* renamed from: n */
    public final void mo195197n() {
        MaterialBase materialBase;
        SpotlightMaterial spotlightMaterial = (SpotlightMaterial) mo195215i();
        if (spotlightMaterial != null) {
            materialBase = spotlightMaterial.mbase;
        } else {
            materialBase = null;
        }
        mo195212a(new ReachPointEvent(mo195214h(), mo195219m(), new ReachPointEvent.Event("consume", false, 2, null), materialBase, null, 16, null));
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPoint
    /* renamed from: d */
    public boolean mo194542d() {
        Activity a;
        List<View> list;
        boolean z;
        SpotlightView kVar = this.f141707h;
        if (kVar != null) {
            kVar.mo195183a();
        }
        SpotlightContextProvider cVar = this.f141706g;
        if (cVar == null || (a = cVar.mo141318a()) == null) {
            Log.m165389i("ug-spotlight", "onShow, activity is null");
            return false;
        }
        SpotlightContextProvider cVar2 = this.f141706g;
        if (cVar2 != null) {
            list = cVar2.mo141319b();
        } else {
            list = null;
        }
        List<View> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165389i("ug-spotlight", "onShow, anchorViews is null");
            return false;
        }
        SpotlightMaterial spotlightMaterial = (SpotlightMaterial) mo195215i();
        if (spotlightMaterial != null) {
            SpotlightView a2 = SpotlightFactory.f141697a.mo195191a(a, list, spotlightMaterial, new C57516g(this));
            if (a2 == null) {
                return false;
            }
            this.f141707h = a2;
            UICallbackExecutor.execute(new RunnableC57515f(a2, this));
            return true;
        }
        Log.m165397w("ug-spotlight", "onShow, spotlightCollection is null");
        return false;
    }

    /* renamed from: a */
    public final void mo195195a(SpotlightContextProvider cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "spotlightContextProvider");
        this.f141706g = cVar;
        mo195218l();
    }

    /* renamed from: a */
    public final void mo195196a(SpotlightLifecycleListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
        this.f141704a = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpotlightReachPoint(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
    }
}
