package com.ss.android.lark.mm.module.podcast.titlebar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/titlebar/MmPodcastTitleBarViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/podcast/titlebar/IMmPodcastTitleBarListener;", "Lcom/ss/android/lark/mm/module/podcast/titlebar/IMmPodcastTitleBarDependency;", "Lcom/ss/android/lark/mm/module/podcast/titlebar/IMmPodcastTitleBarInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "backIv", "Landroid/widget/ImageView;", "titleTv", "Landroid/widget/TextView;", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "onBeginSwitchPodcast", "", "onCreate", "onSwitchPodcastSucceed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.b.e */
public final class MmPodcastTitleBarViewControl extends MmBaseViewControl<IMmPodcastTitleBarListener, IMmPodcastTitleBarDependency> implements IMmPodcastTitleBarInquirer, IMmPodcastTitleBarListener {

    /* renamed from: a */
    public final IMmViewControlContext f117696a;

    /* renamed from: b */
    private final ImageView f117697b;

    /* renamed from: c */
    private final TextView f117698c;

    /* renamed from: d */
    private final MmBaseViewControlAdapter<IMmPodcastTitleBarListener, IMmPodcastTitleBarDependency> f117699d;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: f */
    public IMmPodcastTitleBarListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.podcast.titlebar.IMmPodcastTitleBarListener
    /* renamed from: a */
    public void mo164354a() {
        String str;
        TextView textView = this.f117698c;
        MmBaseInfo a = ((IMmPodcastTitleBarDependency) mo161247w()).mo161229a();
        if (a == null || (str = a.getTopic()) == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // com.ss.android.lark.mm.module.podcast.titlebar.IMmPodcastTitleBarListener
    /* renamed from: b */
    public void mo164355b() {
        this.f117698c.setText(((IMmPodcastTitleBarDependency) mo161247w()).mo164353b());
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        C47110e.m186573a(this.f117697b, new C46774a(this));
        this.f117698c.setText(((IMmPodcastTitleBarDependency) mo161247w()).mo164353b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.b.e$a */
    public static final class C46774a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmPodcastTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46774a(MmPodcastTitleBarViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmPodcastTitleBarViewControl", "back");
            C47083e.m186425a(this.this$0.f117696a.mo161231e(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("back").mo165421c());
            C47083e.m186425a(this.this$0.f117696a.mo161231e(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("back").mo165423e("none").mo165421c());
            C45855f.m181664c("MmPodcastTitleBarViewControl", "click back icon");
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            if (!a.mo161151b().mo164281l()) {
                FragmentActivity a2 = C47107a.m186565a(this.this$0.f117696a.mo161232n());
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            C45852d a3 = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "MmControl.of()");
            a3.mo161151b().mo164269a(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastTitleBarViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmPodcastTitleBarListener, IMmPodcastTitleBarDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f117696a = gVar;
        this.f117699d = jVar;
        View findViewById = gVar.mo161233o().findViewById(R.id.backIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().findViewById(R.id.backIv)");
        this.f117697b = (ImageView) findViewById;
        View findViewById2 = gVar.mo161233o().findViewById(R.id.titleTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "vcContext.getRootView().findViewById(R.id.titleTv)");
        this.f117698c = (TextView) findViewById2;
    }
}
