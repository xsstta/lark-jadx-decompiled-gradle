package com.ss.android.lark.widget.photo_picker.gallery.function;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.entity.PhotoState;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u000289B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\u0006\u0010'\u001a\u00020\u001fJ*\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\b\u00102\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\u000e\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\fJ\f\u00106\u001a\u000207*\u000207H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/gallery/function/LookOriginController;", "Lcom/ss/android/lark/widget/photo_picker/PhotoPickerModuleDependency$IPushResourceDownloadProgressListener;", "dependency", "Lcom/ss/android/lark/widget/photo_picker/gallery/function/LookOriginController$IDependency;", "(Lcom/ss/android/lark/widget/photo_picker/gallery/function/LookOriginController$IDependency;)V", "actionMenu", "Landroid/view/View;", "getActionMenu", "()Landroid/view/View;", "actionMenu$delegate", "Lkotlin/Lazy;", "allowShowOrigin", "", "getDependency", "()Lcom/ss/android/lark/widget/photo_picker/gallery/function/LookOriginController$IDependency;", "handler", "Landroid/os/Handler;", "hideActionMenuRunnable", "Ljava/lang/Runnable;", "lookOriginView", "Landroid/widget/TextView;", "getLookOriginView", "()Landroid/widget/TextView;", "lookOriginView$delegate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "getOwner", "()Landroidx/lifecycle/LifecycleOwner;", "owner$delegate", "showLookOriginViewRunnable", "delayShowLookOriginView", "", "getCurrentDownloadProgressData", "Landroidx/lifecycle/MutableLiveData;", "", "hideLookUI", "initLookOriginView", "loadOriginSuccessUI", "loadingOriginUI", "onDestroy", "onResourceDownloadProgress", "key", "", "progress", "totalSize", "", "transferredSize", "resetDownloadProgressObserver", "resetUIStateObserver", "showActionMenu", "showLookOriginView", "showLookUI", "updateVisibility", "isRefreshData", "appendClickParams", "Lorg/json/JSONObject;", "Companion", "IDependency", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c */
public final class LookOriginController implements C58612c.AbstractC58616d {

    /* renamed from: b */
    public static final Companion f145359b = new Companion(null);

    /* renamed from: a */
    public boolean f145360a;

    /* renamed from: c */
    private final Lazy f145361c = LazyKt.lazy(new C58817h(this));

    /* renamed from: d */
    private final Lazy f145362d = LazyKt.lazy(new C58812c(this));

    /* renamed from: e */
    private final Handler f145363e = new Handler();

    /* renamed from: f */
    private final Lazy f145364f = LazyKt.lazy(new C58816g(this));

    /* renamed from: g */
    private final Runnable f145365g = new RunnableC58813d(this);

    /* renamed from: h */
    private final Runnable f145366h = new RunnableC58820k(this);

    /* renamed from: i */
    private final IDependency f145367i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/gallery/function/LookOriginController$IDependency;", "", "getActionMenu", "Landroid/view/View;", "getCurrentPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getPaths", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$b */
    public interface IDependency {
        /* renamed from: a */
        LifecycleOwner mo199000a();

        /* renamed from: b */
        View mo199001b();

        /* renamed from: c */
        PhotoItem mo199002c();

        /* renamed from: d */
        List<PhotoItem> mo199003d();
    }

    /* renamed from: l */
    private final LifecycleOwner m228063l() {
        return (LifecycleOwner) this.f145361c.getValue();
    }

    /* renamed from: a */
    public final View mo199245a() {
        return (View) this.f145362d.getValue();
    }

    /* renamed from: b */
    public final TextView mo199248b() {
        return (TextView) this.f145364f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/gallery/function/LookOriginController$Companion;", "", "()V", "DELAY_DURATION_1000", "", "DELAY_DURATION_500", "DELAY_DURATION_5000", "TAG", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k */
    public final IDependency mo199257k() {
        return this.f145367i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$c */
    static final class C58812c extends Lambda implements Function0<View> {
        final /* synthetic */ LookOriginController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58812c(LookOriginController cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.mo199257k().mo199001b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleOwner;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$h */
    static final class C58817h extends Lambda implements Function0<LifecycleOwner> {
        final /* synthetic */ LookOriginController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58817h(LookOriginController cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleOwner invoke() {
            return this.this$0.mo199257k().mo199000a();
        }
    }

    /* renamed from: d */
    public final void mo199250d() {
        Log.m165389i("LookOriginController", "hideLookUI");
        mo199248b().setVisibility(4);
    }

    /* renamed from: h */
    public final void mo199254h() {
        if (this.f145360a) {
            mo199248b().setVisibility(0);
        }
    }

    /* renamed from: i */
    public final C1177w<Integer> mo199255i() {
        return this.f145367i.mo199002c().getPhotoState().getDownloadOriginProgress();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$f */
    public static final class RunnableC58815f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LookOriginController f145370a;

        RunnableC58815f(LookOriginController cVar) {
            this.f145370a = cVar;
        }

        public final void run() {
            this.f145370a.mo199257k().mo199002c().getPhotoState().getUIState().mo5929b(PhotoState.UIState.HIDE_LOOK);
            this.f145370a.mo199249c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$g */
    static final class C58816g extends Lambda implements Function0<TextView> {
        final /* synthetic */ LookOriginController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58816g(LookOriginController cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            View findViewById = this.this$0.mo199245a().findViewById(R.id.look_origin_icon);
            if (findViewById != null) {
                return (TextView) findViewById;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* renamed from: m */
    private final void m228064m() {
        mo199248b().setOnClickListener(new View$OnClickListenerC58814e(this));
        C58612c.m227290a().mo102845a(this);
    }

    /* renamed from: n */
    private final void m228065n() {
        this.f145363e.removeCallbacks(this.f145366h);
        this.f145363e.postDelayed(this.f145366h, 500);
    }

    /* renamed from: c */
    public final void mo199249c() {
        mo199245a().setVisibility(0);
        this.f145363e.removeCallbacks(this.f145365g);
        this.f145363e.postDelayed(this.f145365g, 5000);
    }

    /* renamed from: j */
    public final void mo199256j() {
        C58612c.m227290a().mo102853b(this);
        this.f145363e.removeCallbacksAndMessages(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$d */
    static final class RunnableC58813d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LookOriginController f145368a;

        RunnableC58813d(LookOriginController cVar) {
            this.f145368a = cVar;
        }

        public final void run() {
            Integer b = this.f145368a.mo199255i().mo5927b();
            if (b == null || b.intValue() == 100) {
                this.f145368a.mo199245a().setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$k */
    static final class RunnableC58820k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LookOriginController f145373a;

        RunnableC58820k(LookOriginController cVar) {
            this.f145373a = cVar;
        }

        public final void run() {
            PhotoState.UIState b = this.f145373a.mo199257k().mo199002c().getPhotoState().getUIState().mo5927b();
            if (b == PhotoState.UIState.SHOW_LOOK || b == PhotoState.UIState.LOADING) {
                this.f145373a.f145360a = C58612c.m227290a().mo102854b("messenger.mobile_view_pic.original");
                this.f145373a.mo199254h();
                Log.m165389i("LookOriginController", "delay 500ms show look origin view");
            }
        }
    }

    /* renamed from: g */
    public final void mo199253g() {
        Log.m165389i("LookOriginController", "loadOriginSuccessUI");
        mo199255i().mo5929b((Integer) 100);
        mo199254h();
        mo199248b().setClickable(false);
        this.f145363e.postDelayed(new RunnableC58815f(this), 1000);
    }

    /* renamed from: o */
    private final void m228066o() {
        List<PhotoItem> filterNotNull;
        List<PhotoItem> d = this.f145367i.mo199003d();
        if (!(d == null || (filterNotNull = CollectionsKt.filterNotNull(d)) == null)) {
            for (PhotoItem photoItem : filterNotNull) {
                photoItem.getPhotoState().getUIState().mo5922a(m228063l());
            }
        }
        C1177w<PhotoState.UIState> uIState = this.f145367i.mo199002c().getPhotoState().getUIState();
        if (uIState.mo5927b() == PhotoState.UIState.DONE) {
            uIState.mo5929b(PhotoState.UIState.HIDE_LOOK);
        }
        uIState.mo5923a(m228063l(), new C58819j(this));
    }

    /* renamed from: p */
    private final void m228067p() {
        List<PhotoItem> filterNotNull;
        List<PhotoItem> d = this.f145367i.mo199003d();
        if (!(d == null || (filterNotNull = CollectionsKt.filterNotNull(d)) == null)) {
            for (PhotoItem photoItem : filterNotNull) {
                photoItem.getPhotoState().getDownloadOriginProgress().mo5922a(m228063l());
            }
        }
        mo199255i().mo5923a(m228063l(), new C58818i(this));
    }

    /* renamed from: e */
    public final void mo199251e() {
        Log.m165389i("LookOriginController", "showLookUI");
        mo199254h();
        mo199248b().setClickable(true);
        PhotoItem c = this.f145367i.mo199002c();
        String string = UIHelper.getString(R.string.Lark_Legacy_FullImage);
        if (c.getOriginSize() > 0) {
            string = string + "(" + C26311p.m95277b(c.getOriginSize()) + ")";
        }
        mo199248b().setText(string);
    }

    /* renamed from: f */
    public final void mo199252f() {
        Log.m165389i("LookOriginController", "loadingOriginUI");
        mo199254h();
        mo199248b().setClickable(false);
        C1177w<Integer> i = mo199255i();
        if (i.mo5927b() == null) {
            i.mo5929b((Integer) 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i.mo5927b());
        sb.append('%');
        mo199248b().setText(sb.toString());
    }

    /* renamed from: a */
    public final JSONObject mo199246a(JSONObject jSONObject) {
        JSONObject put = jSONObject.put("click", "original_image").put("target", "public_pic_edit_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "put(\"click\", \"original_i…, \"public_pic_edit_view\")");
        return put;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$e */
    public static final class View$OnClickListenerC58814e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LookOriginController f145369a;

        View$OnClickListenerC58814e(LookOriginController cVar) {
            this.f145369a = cVar;
        }

        public final void onClick(View view) {
            Statistics.sendEvent("public_picbrowser_click", this.f145369a.mo199246a(new JSONObject()));
            this.f145369a.mo199257k().mo199002c().getPhotoState().getClickLookOrigin().mo5929b((Boolean) true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "progress", "", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$i */
    public static final class C58818i<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ LookOriginController f145371a;

        C58818i(LookOriginController cVar) {
            this.f145371a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num != null) {
                num.intValue();
                if (num.intValue() == 100) {
                    this.f145371a.mo199248b().setText(UIHelper.getString(R.string.Lark_Legacy_Loaded));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(num);
                sb.append('%');
                this.f145371a.mo199248b().setText(sb.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoState$UIState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.c$j */
    public static final class C58819j<T> implements AbstractC1178x<PhotoState.UIState> {

        /* renamed from: a */
        final /* synthetic */ LookOriginController f145372a;

        C58819j(LookOriginController cVar) {
            this.f145372a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(PhotoState.UIState uIState) {
            Intrinsics.checkParameterIsNotNull(uIState, "state");
            int i = C58821d.f145374a[uIState.ordinal()];
            if (i == 1) {
                this.f145372a.mo199250d();
            } else if (i == 2) {
                this.f145372a.mo199251e();
            } else if (i == 3) {
                this.f145372a.mo199252f();
            } else if (i == 4) {
                this.f145372a.mo199253g();
            }
        }
    }

    /* renamed from: a */
    public final void mo199247a(boolean z) {
        if (z) {
            m228065n();
        }
        mo199249c();
        m228066o();
        m228067p();
    }

    public LookOriginController(IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f145367i = bVar;
        m228064m();
    }

    @Override // com.ss.android.lark.widget.photo_picker.C58612c.AbstractC58616d
    /* renamed from: a */
    public void mo198632a(String str, int i, long j, long j2) {
        String c = C58659h.m227519c(this.f145367i.mo199002c());
        Intrinsics.checkExpressionValueIsNotNull(c, "PhotoUtils.getOriginKey(photoItem)");
        if (Intrinsics.areEqual(c, str)) {
            Log.m165389i("LookOriginController", "download origin key: " + c + ", progress: " + i);
            mo199255i().mo5929b(Integer.valueOf(Math.min(Math.max(i, 0), 100)));
        }
    }
}
