package com.ss.android.lark.widget.photo_picker_impl.view.large;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.photo_picker_impl.base.IAnimInfoProvider;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.base.PPLog;
import com.ss.android.lark.widget.photo_picker_impl.bean.AnimInfo;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.base.Component;
import com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowVPagerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u0000 U*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002UVB_\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0018\u00010\n\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0018\u00010\n¢\u0006\u0002\u0010\rJ\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u00020%H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00103\u001a\u00020%H\u0002J\b\u00105\u001a\u000201H\u0016J\b\u00106\u001a\u000201H\u0016J \u00107\u001a\u0002012\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u001dH\u0016J\u0010\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@H\u0016J\u0015\u0010A\u001a\u0002012\u0006\u0010;\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010BJ\u0012\u0010C\u001a\u0002012\b\u0010;\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u000201H\u0016J\u0018\u0010F\u001a\u0002012\u0006\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020IH\u0002J\u0018\u0010J\u001a\u0002012\u0006\u0010G\u001a\u00020%2\u0006\u0010K\u001a\u00020IH\u0002J(\u0010L\u001a\u0002012\u0006\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u0002092\u0006\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020\u0017H\u0002J&\u0010Q\u001a\u0002012\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010S\u001a\u0002092\u0006\u0010T\u001a\u00020\u001dH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006W"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "fm", "Landroidx/fragment/app/FragmentManager;", "mFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin;", "mTopToolPlugin", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$LargeToolContext;", "mBottomToolPlugin", "(Landroidx/fragment/app/FragmentManager;Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;)V", "TAG", "", "mAdapter", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter;", "getMAdapter", "()Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter;", "setMAdapter", "(Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter;)V", "mAnimDurationTime", "", "getMAnimDurationTime", "()J", "setMAnimDurationTime", "(J)V", "mDisableLoadMore", "", "getMDisableLoadMore", "()Z", "setMDisableLoadMore", "(Z)V", "mIAnimInfoProvider", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IAnimInfoProvider;", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "getMViewPager", "()Landroidx/viewpager/widget/ViewPager;", "setMViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "finishWithAnim", "", "initToolViews", "root", "initViewPager", "loadMore", "loadPre", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreateView", "parent", "Landroid/view/ViewGroup;", "onPageSelected", "(Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;)V", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "showEnterTranslateScaleAnim", "targetView", "beginInfo", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/AnimInfo;", "showExitTranslateScaleAnim", "endInfo", "startBackgroundColorAnim", "view", "startColor", "endColor", "duration", "updateData", "", "append", "updateAll", "Companion", "LargeToolContext", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a */
public class LargeComponent<DATA extends Photo> extends Component<DATA> {

    /* renamed from: a */
    public static final Companion f145790a = new Companion(null);

    /* renamed from: b */
    private final String f145791b = "PP_LargeComponent";

    /* renamed from: c */
    private View f145792c;

    /* renamed from: d */
    private LargeShowVPagerAdapter<DATA> f145793d;

    /* renamed from: e */
    private ViewPager f145794e;

    /* renamed from: f */
    private long f145795f = 300;

    /* renamed from: g */
    private boolean f145796g;

    /* renamed from: h */
    private IAnimInfoProvider f145797h;

    /* renamed from: i */
    private final FragmentManager f145798i;

    /* renamed from: j */
    private final IShowPluginFactory<DATA, LargeShowPlugin<DATA>> f145799j;

    /* renamed from: k */
    private final IToolPlugin<DATA, LargeToolContext<DATA>> f145800k;

    /* renamed from: l */
    private final IToolPlugin<DATA, LargeToolContext<DATA>> f145801l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$LargeToolContext;", "DATA", "", "finish", "", "getCurrItem", "()Ljava/lang/Object;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$b */
    public interface LargeToolContext<DATA> {
        /* renamed from: a */
        DATA mo199666a();

        /* renamed from: b */
        void mo199667b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$Companion;", "", "()V", "PARAM_ANIM_INFO", "", "PARAM_DISABLE_LOAD_MORE", "PARAM_INFO_PROVIDER", "PARAM_SHOW_DATA", "PARAM_SHOW_POS", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final LargeShowVPagerAdapter<DATA> mo199662f() {
        return this.f145793d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ViewPager mo199663g() {
        return this.f145794e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo199664h() {
        return this.f145795f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$initToolViews$largeToolContext$1", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$LargeToolContext;", "finish", "", "getCurrItem", "()Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$c */
    public static final class C58898c implements LargeToolContext<DATA> {

        /* renamed from: a */
        final /* synthetic */ LargeComponent f145802a;

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent.LargeToolContext
        /* renamed from: b */
        public void mo199667b() {
            this.f145802a.mo199665i();
        }

        /* renamed from: c */
        public DATA mo199666a() {
            ArrayList<DATA> c;
            int i;
            LargeShowVPagerAdapter<DATA> f = this.f145802a.mo199662f();
            if (f == null || (c = f.mo199682c()) == null) {
                return null;
            }
            ArrayList<DATA> arrayList = c;
            ViewPager g = this.f145802a.mo199663g();
            if (g != null) {
                i = g.getCurrentItem();
            } else {
                i = 0;
            }
            return (DATA) ((Photo) CollectionsKt.getOrNull(arrayList, i));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58898c(LargeComponent aVar) {
            this.f145802a = aVar;
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: c */
    public boolean mo197708c() {
        mo199665i();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$initViewPager$2", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter$IFuncSupport;", "getCurrentItem", "", "setCurrentItem", "", "position", "smoothScroll", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$e */
    public static final class C58900e implements LargeShowVPagerAdapter.IFuncSupport {

        /* renamed from: a */
        final /* synthetic */ ViewPager f145804a;

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowVPagerAdapter.IFuncSupport
        /* renamed from: a */
        public int mo199669a() {
            ViewPager viewPager = this.f145804a;
            Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewPager");
            return viewPager.getCurrentItem();
        }

        C58900e(ViewPager viewPager) {
            this.f145804a = viewPager;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowVPagerAdapter.IFuncSupport
        /* renamed from: a */
        public void mo199670a(int i, boolean z) {
            this.f145804a.setCurrentItem(i, z);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: d */
    public void mo199648d() {
        if (!this.f145796g) {
            super.mo199648d();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: e */
    public void mo199649e() {
        if (!this.f145796g) {
            super.mo199649e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$g */
    static final class RunnableC58902g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LargeComponent f145806a;

        /* renamed from: b */
        final /* synthetic */ ViewPager f145807b;

        /* renamed from: c */
        final /* synthetic */ AnimInfo f145808c;

        /* renamed from: d */
        final /* synthetic */ View f145809d;

        RunnableC58902g(LargeComponent aVar, ViewPager viewPager, AnimInfo aVar2, View view) {
            this.f145806a = aVar;
            this.f145807b = viewPager;
            this.f145808c = aVar2;
            this.f145809d = view;
        }

        public final void run() {
            this.f145806a.mo199660a(this.f145807b, this.f145808c);
            LargeComponent aVar = this.f145806a;
            aVar.mo199659a(this.f145809d, 0, -16777216, aVar.mo199664h());
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: b */
    public void mo199647b() {
        View view = this.f145792c;
        if (view != null) {
            view.setVisibility(8);
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar = this.f145800k;
        if (fVar != null) {
            fVar.mo197632a();
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar2 = this.f145801l;
        if (fVar2 != null) {
            fVar2.mo197632a();
        }
    }

    /* renamed from: i */
    public final void mo199665i() {
        AnimInfo aVar;
        int i;
        ArrayList<DATA> c;
        int i2;
        Integer a;
        ViewPager viewPager = this.f145794e;
        View view = this.f145792c;
        IAnimInfoProvider aVar2 = this.f145797h;
        if (aVar2 != null) {
            LargeShowVPagerAdapter<DATA> cVar = this.f145793d;
            if (!(cVar == null || (c = cVar.mo199682c()) == null)) {
                ArrayList<DATA> arrayList = c;
                ViewPager viewPager2 = this.f145794e;
                if (viewPager2 != null) {
                    i2 = viewPager2.getCurrentItem();
                } else {
                    i2 = 0;
                }
                Photo bVar = (Photo) CollectionsKt.getOrNull(arrayList, i2);
                if (!(bVar == null || (a = bVar.mo199589a()) == null)) {
                    i = a.intValue();
                    aVar = aVar2.mo199563a(i);
                }
            }
            i = -1;
            aVar = aVar2.mo199563a(i);
        } else {
            aVar = null;
        }
        if (aVar == null || !aVar.mo199588e() || viewPager == null || view == null) {
            mo199639a().mo199634a(this);
            return;
        }
        m228565b(viewPager, aVar);
        mo199659a(view, -16777216, 0, this.f145795f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$initViewPager$1", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin$ILargeShowPluginContext;", "finish", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$d */
    public static final class C58899d implements LargeShowPlugin.ILargeShowPluginContext {

        /* renamed from: a */
        final /* synthetic */ LargeComponent f145803a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58899d(LargeComponent aVar) {
            this.f145803a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$initViewPager$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$f */
    public static final class C58901f implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ LargeComponent f145805a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58901f(LargeComponent aVar) {
            this.f145805a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LargeShowVPagerAdapter<DATA> f = this.f145805a.mo199662f();
            if (f != null) {
                LargeComponent aVar = this.f145805a;
                DATA data = f.mo199682c().get(i);
                Intrinsics.checkExpressionValueIsNotNull(data, "it.getData()[position]");
                aVar.mo199661a(data);
            }
            LargeShowVPagerAdapter<DATA> f2 = this.f145805a.mo199662f();
            if (f2 != null) {
                int b = f2.mo199681b() / 3;
                if (i < b) {
                    this.f145805a.mo199649e();
                }
                if (i > b * 2) {
                    this.f145805a.mo199648d();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$showEnterTranslateScaleAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$h */
    public static final class C58903h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f145810a;

        public void onAnimationEnd(Animator animator) {
        }

        C58903h(View view) {
            this.f145810a = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f145810a.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            this.f145810a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f145810a.setScaleX(1.0f);
            this.f145810a.setScaleY(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$showExitTranslateScaleAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$i */
    public static final class C58904i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LargeComponent f145811a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58904i(LargeComponent aVar) {
            this.f145811a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f145811a.mo199639a().mo199634a(this.f145811a);
        }

        public void onAnimationEnd(Animator animator) {
            this.f145811a.mo199639a().mo199634a(this.f145811a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$startBackgroundColorAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.a$j */
    public static final class C58905j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f145812a;

        /* renamed from: b */
        final /* synthetic */ int f145813b;

        public void onAnimationCancel(Animator animator) {
            this.f145812a.setBackgroundColor(this.f145813b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f145812a.setBackgroundColor(this.f145813b);
        }

        C58905j(View view, int i) {
            this.f145812a = view;
            this.f145813b = i;
        }
    }

    /* renamed from: b */
    private final void m228564b(View view) {
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.photo_picker_viewpager);
        this.f145793d = new LargeShowVPagerAdapter<>(this.f145798i, this.f145799j, new C58899d(this), new C58900e(viewPager));
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewPager");
        viewPager.setAdapter(this.f145793d);
        viewPager.addOnPageChangeListener(new C58901f(this));
        this.f145794e = viewPager;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public View mo199638a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pp_large_component_view, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        m228564b(inflate);
        m228563a(inflate);
        inflate.setVisibility(8);
        this.f145792c = inflate;
        return inflate;
    }

    /* renamed from: a */
    private final void m228563a(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.fl_top_container);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.fl_bottom_container);
        C58898c cVar = new C58898c(this);
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar = this.f145800k;
        if (fVar != null) {
            fVar.mo197639b(cVar);
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar2 = this.f145801l;
        if (fVar2 != null) {
            fVar2.mo197639b(cVar);
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar3 = this.f145800k;
        if (fVar3 != null) {
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "topContainer");
            View a = fVar3.mo197631a(viewGroup);
            if (a != null) {
                viewGroup.addView(a);
            }
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar4 = this.f145801l;
        if (fVar4 != null) {
            Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "bottomContainer");
            View a2 = fVar4.mo197631a(viewGroup2);
            if (a2 != null) {
                viewGroup2.addView(a2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199661a(DATA data) {
        Intrinsics.checkParameterIsNotNull(data, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        PPLog.Companion aVar = PPLog.f145728b;
        String str = this.f145791b;
        aVar.mo199572a(str, "onPageSelected , data = " + data);
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar = this.f145800k;
        if (fVar != null) {
            fVar.mo197635a(data);
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar2 = this.f145801l;
        if (fVar2 != null) {
            fVar2.mo197635a(data);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.ss.android.lark.widget.photo_picker_impl.d.c.a<DATA extends com.ss.android.lark.widget.photo_picker_impl.b.b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199641a(TransationData dVar) {
        int i;
        IAnimInfoProvider aVar;
        AnimInfo aVar2;
        boolean z;
        Boolean bool;
        Integer num;
        View view = this.f145792c;
        if (view != null) {
            view.setVisibility(0);
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar = this.f145800k;
        if (fVar != null) {
            fVar.mo197633a(dVar);
        }
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar2 = this.f145801l;
        if (fVar2 != null) {
            fVar2.mo197633a(dVar);
        }
        if (dVar == null || (num = (Integer) dVar.mo199620a("showPosition")) == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        List list = null;
        if (dVar != null) {
            aVar = (IAnimInfoProvider) dVar.mo199620a("infoProvider");
        } else {
            aVar = null;
        }
        if (dVar != null) {
            aVar2 = (AnimInfo) dVar.mo199620a("animInfo");
        } else {
            aVar2 = null;
        }
        if (dVar != null) {
            list = (List) dVar.mo199620a("showData");
        }
        if (dVar == null || (bool = (Boolean) dVar.mo199620a("disableLoadMore")) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f145796g = z;
        if (list != null) {
            mo199644a(CollectionsKt.toMutableList((Collection) list), 0, false);
            if (i >= list.size()) {
                i = CollectionsKt.getLastIndex(list);
            }
            if (i >= 0) {
                mo199661a((Photo) list.get(i));
            }
        }
        this.f145797h = aVar;
        ViewPager viewPager = this.f145794e;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, false);
        }
        ViewPager viewPager2 = this.f145794e;
        View view2 = this.f145792c;
        if (aVar2 == null || !aVar2.mo199588e() || viewPager2 == null || view2 == null) {
            View view3 = this.f145792c;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            mo199659a(view2, 0, -16777216, this.f145795f);
            if (viewPager2 != null) {
                viewPager2.setScaleX(1.0f);
            }
            if (viewPager2 != null) {
                viewPager2.setScaleY(1.0f);
            }
            if (viewPager2 != null) {
                viewPager2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            }
            if (viewPager2 != null) {
                viewPager2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            return;
        }
        viewPager2.post(new RunnableC58902g(this, viewPager2, aVar2, view2));
    }

    /* renamed from: b */
    private final void m228565b(View view, AnimInfo aVar) {
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        float[] a = mo199639a().mo199637a(view);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        view.setPivotX(BitmapDescriptorFactory.HUE_RED);
        ViewPropertyAnimator listener = view.animate().setListener(new C58904i(this));
        Integer c = aVar.mo199586c();
        if (c == null) {
            Intrinsics.throwNpe();
        }
        ViewPropertyAnimator scaleX = listener.scaleX(((float) c.intValue()) / ((float) view.getMeasuredWidth()));
        Integer d = aVar.mo199587d();
        if (d == null) {
            Intrinsics.throwNpe();
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(((float) d.intValue()) / ((float) view.getMeasuredHeight()));
        Float a2 = aVar.mo199580a();
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        ViewPropertyAnimator translationX = scaleY.translationX(a2.floatValue() - a[0]);
        Float b = aVar.mo199583b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        translationX.translationY(b.floatValue() - a[1]).setDuration(this.f145795f).setInterpolator(new DecelerateInterpolator()).start();
    }

    /* renamed from: a */
    public final void mo199660a(View view, AnimInfo aVar) {
        View view2 = this.f145792c;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        view.setPivotX(BitmapDescriptorFactory.HUE_RED);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        if (((float) view.getMeasuredWidth()) == BitmapDescriptorFactory.HUE_RED || ((float) view.getMeasuredHeight()) == BitmapDescriptorFactory.HUE_RED) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else {
            Integer c = aVar.mo199586c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            view.setScaleX(((float) c.intValue()) / ((float) view.getMeasuredWidth()));
            Integer d = aVar.mo199587d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            view.setScaleY(((float) d.intValue()) / ((float) view.getMeasuredHeight()));
        }
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        Float a = aVar.mo199580a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        view.setTranslationX(a.floatValue() - view.getX());
        Float b = aVar.mo199583b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        view.setTranslationY(b.floatValue() - view.getY());
        view.animate().setListener(new C58903h(view)).translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).scaleX(1.0f).scaleY(1.0f).setDuration(this.f145795f).start();
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199640a(int i, int i2, Intent intent) {
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar;
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IToolPlugin<DATA, LargeToolContext<DATA>> fVar2 = this.f145800k;
        if ((fVar2 == null || !fVar2.mo197638a(i, i2, intent)) && (fVar = this.f145801l) != null && fVar.mo197638a(i, i2, intent)) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.widget.photo_picker_impl.d.c.a<DATA extends com.ss.android.lark.widget.photo_picker_impl.b.b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199644a(List<DATA> list, int i, boolean z) {
        ArrayList<DATA> c;
        ArrayList<DATA> c2;
        int i2;
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!list.isEmpty()) {
            boolean z2 = false;
            String b = list.get(0).mo199595b();
            if (b == null || b.length() == 0) {
                z2 = true;
            }
            if (z2) {
                list = CollectionsKt.takeLast(list, list.size() - 1);
            }
        }
        if (z) {
            LargeShowVPagerAdapter<DATA> cVar = this.f145793d;
            if (cVar != null) {
                cVar.mo199679a();
            }
            ViewPager viewPager = this.f145794e;
            if (viewPager != null) {
                i2 = viewPager.getCurrentItem();
            } else {
                i2 = -1;
            }
            Photo bVar = (Photo) CollectionsKt.getOrNull(list, i2);
            if (bVar != null) {
                mo199661a(bVar);
            }
        } else if (i == 0) {
            LargeShowVPagerAdapter<DATA> cVar2 = this.f145793d;
            if (!(cVar2 == null || (c2 = cVar2.mo199682c()) == null)) {
                c2.clear();
            }
            LargeShowVPagerAdapter<DATA> cVar3 = this.f145793d;
            if (!(cVar3 == null || (c = cVar3.mo199682c()) == null)) {
                c.addAll(list);
            }
            LargeShowVPagerAdapter<DATA> cVar4 = this.f145793d;
            if (cVar4 != null) {
                cVar4.notifyDataSetChanged();
            }
            ViewPager viewPager2 = this.f145794e;
            if (viewPager2 != null) {
                viewPager2.setAdapter(null);
            }
            ViewPager viewPager3 = this.f145794e;
            if (viewPager3 != null) {
                viewPager3.setAdapter(this.f145793d);
            }
        } else {
            LargeShowVPagerAdapter<DATA> cVar5 = this.f145793d;
            if (cVar5 != null) {
                cVar5.mo199680a(list, i);
            }
        }
    }

    public LargeComponent(FragmentManager fragmentManager, IShowPluginFactory<DATA, LargeShowPlugin<DATA>> bVar, IToolPlugin<DATA, LargeToolContext<DATA>> fVar, IToolPlugin<DATA, LargeToolContext<DATA>> fVar2) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(bVar, "mFactory");
        this.f145798i = fragmentManager;
        this.f145799j = bVar;
        this.f145800k = fVar;
        this.f145801l = fVar2;
    }

    /* renamed from: a */
    public final void mo199659a(View view, int i, int i2, long j) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", i, i2);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "ObjectAnimator.ofInt(vie…or,\n            endColor)");
        ObjectAnimator objectAnimator = ofInt;
        objectAnimator.setDuration(j);
        objectAnimator.setEvaluator(new ArgbEvaluator());
        objectAnimator.addListener(new C58905j(view, i2));
        objectAnimator.start();
    }
}
