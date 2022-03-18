package com.bytedance.ee.bear.wikiv2.wikitreev2.main;

import android.app.Dialog;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u001a\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$_ViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$_ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindListener", "", "bindView", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onViewCreated", "view", "Companion", "ViewDelegate", "_ViewModel", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a */
public final class SpaceMoreDialog extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f33347c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SpaceMoreDialog.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$_ViewModel;"))};

    /* renamed from: d */
    public static final Companion f33348d = new Companion(null);

    /* renamed from: e */
    private final Lazy f33349e = LazyKt.lazy(new C12429f(this));

    /* renamed from: f */
    private HashMap f33350f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$ViewDelegate;", "", "onDetail", "", "onFavorite", "doFavorite", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a$b */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo47357a();

        /* renamed from: a */
        void mo47358a(boolean z);
    }

    /* renamed from: i */
    private final void m51697i() {
    }

    /* renamed from: a */
    public View mo47353a(int i) {
        if (this.f33350f == null) {
            this.f33350f = new HashMap();
        }
        View view = (View) this.f33350f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33350f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public final _ViewModel mo47354f() {
        Lazy lazy = this.f33349e;
        KProperty kProperty = f33347c[0];
        return (_ViewModel) lazy.getValue();
    }

    /* renamed from: g */
    public void mo47355g() {
        HashMap hashMap = this.f33350f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47355g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$Companion;", "", "()V", "TAG", "", "show", "", "context", "Landroidx/fragment/app/FragmentActivity;", "anchorRectF", "Landroid/graphics/RectF;", "isFavorite", "", "delegate", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$ViewDelegate;", "(Landroidx/fragment/app/FragmentActivity;Landroid/graphics/RectF;Ljava/lang/Boolean;Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$ViewDelegate;)V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo47356a(FragmentActivity fragmentActivity, RectF rectF, Boolean bool, ViewDelegate bVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
            _ViewModel cVar = (_ViewModel) aj.m5366a(fragmentActivity).mo6005a(_ViewModel.class);
            cVar.setDelegate(bVar);
            cVar.setAnchorRect(rectF);
            cVar.setFavorite(bool);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, SpaceMoreDialog.class.getName());
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), SpaceMoreDialog.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$_ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "anchorRect", "Landroid/graphics/RectF;", "getAnchorRect", "()Landroid/graphics/RectF;", "setAnchorRect", "(Landroid/graphics/RectF;)V", "delegate", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$ViewDelegate;", "getDelegate", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$ViewDelegate;", "setDelegate", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$ViewDelegate;)V", "isFavorite", "", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a$c */
    public static final class _ViewModel extends AbstractC1142af {
        private RectF anchorRect;
        private ViewDelegate delegate;
        private Boolean isFavorite;

        public final RectF getAnchorRect() {
            return this.anchorRect;
        }

        public final ViewDelegate getDelegate() {
            return this.delegate;
        }

        public final Boolean isFavorite() {
            return this.isFavorite;
        }

        public final void setAnchorRect(RectF rectF) {
            this.anchorRect = rectF;
        }

        public final void setDelegate(ViewDelegate bVar) {
            this.delegate = bVar;
        }

        public final void setFavorite(Boolean bool) {
            this.isFavorite = bool;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceMoreDialog$_ViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a$f */
    static final class C12429f extends Lambda implements Function0<_ViewModel> {
        final /* synthetic */ SpaceMoreDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12429f(SpaceMoreDialog aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final _ViewModel invoke() {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                return (_ViewModel) aj.m5366a(activity).mo6005a(_ViewModel.class);
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        _ViewModel f = mo47354f();
        if (f != null) {
            f.setDelegate(null);
        }
        _ViewModel f2 = mo47354f();
        if (f2 != null) {
            f2.setAnchorRect(null);
        }
    }

    /* renamed from: h */
    private final void m51696h() {
        boolean z;
        int i;
        int i2;
        Boolean isFavorite;
        _ViewModel f = mo47354f();
        if (f == null || (isFavorite = f.isFavorite()) == null) {
            z = false;
        } else {
            z = isFavorite.booleanValue();
        }
        TextView textView = (TextView) mo47353a(R.id.favorite_text);
        if (z) {
            i = R.string.CreationMobile_Wiki_Favorites_UnFavoritedWorkspace_Tab;
        } else {
            i = R.string.CreationMobile_Wiki_Favorites_FavoriteWorkspace_Tab;
        }
        textView.setText(i);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo47353a(R.id.favorite_image);
        if (z) {
            i2 = R.drawable.ud_icon_cancel_collection_outlined;
        } else {
            i2 = R.drawable.ud_icon_collection_outlined;
        }
        appCompatImageView.setImageResource(i2);
    }

    /* renamed from: j */
    private final void m51698j() {
        ((LinearLayout) mo47353a(R.id.detail_info)).setOnClickListener(new View$OnClickListenerC12427d(this));
        ((LinearLayout) mo47353a(R.id.favorite_info)).setOnClickListener(new View$OnClickListenerC12428e(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        RectF anchorRect;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null && (window = v_.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = C13749l.m55738a((int) SmEvents.EVENT_RS);
            attributes.dimAmount = BitmapDescriptorFactory.HUE_RED;
            attributes.gravity = 8388661;
            _ViewModel f = mo47354f();
            if (!(f == null || (anchorRect = f.getAnchorRect()) == null)) {
                int i = (int) (anchorRect.bottom - anchorRect.top);
                attributes.x = ((int) (((float) C13749l.m55736a()) - anchorRect.right)) + C13749l.m55738a(16);
                attributes.y = i;
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(17170445);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a$d */
    public static final class View$OnClickListenerC12427d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceMoreDialog f33351a;

        View$OnClickListenerC12427d(SpaceMoreDialog aVar) {
            this.f33351a = aVar;
        }

        public final void onClick(View view) {
            ViewDelegate delegate;
            this.f33351a.mo5513b();
            _ViewModel f = this.f33351a.mo47354f();
            if (f != null && (delegate = f.getDelegate()) != null) {
                delegate.mo47357a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.a$e */
    public static final class View$OnClickListenerC12428e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceMoreDialog f33352a;

        View$OnClickListenerC12428e(SpaceMoreDialog aVar) {
            this.f33352a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            ViewDelegate delegate;
            Boolean isFavorite;
            this.f33352a.mo5513b();
            _ViewModel f = this.f33352a.mo47354f();
            if (f == null || (isFavorite = f.isFavorite()) == null) {
                z = false;
            } else {
                z = isFavorite.booleanValue();
            }
            _ViewModel f2 = this.f33352a.mo47354f();
            if (f2 != null && (delegate = f2.getDelegate()) != null) {
                delegate.mo47358a(!z);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m51696h();
        m51697i();
        m51698j();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_tree_more_layout, viewGroup, false);
    }
}
