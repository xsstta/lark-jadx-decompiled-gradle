package com.ss.android.lark.mm.module.detail.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.banner.C45981a;
import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47090a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JB\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u001d\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001dR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/banner/MmReviewBanner;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "banner", "Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "getBanner", "()Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "banner$delegate", "Lkotlin/Lazy;", "parent", "Landroid/view/ViewGroup;", "attachParent", "", "detach", "onReviewAppealResultCallback", "isSuccess", "", "setReviewStatus", "reviewStatus", "Lcom/ss/android/lark/mm/module/detail/baseinfo/ReviewStatus;", "appName", "", "sendReviewAppealCallback", "Lkotlin/Function1;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmReviewBanner extends FrameLayout {

    /* renamed from: a */
    public ViewGroup f115864a;

    /* renamed from: b */
    private final Lazy f115865b;

    public MmReviewBanner(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmReviewBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C45981a getBanner() {
        return (C45981a) this.f115865b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.banner.MmReviewBanner$a */
    static final class C45975a extends Lambda implements Function0<C45981a> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45975a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C45981a invoke() {
            Context context = this.$context;
            return new C45981a.C45984a(context, context.getString(R.string.MMWeb_G_ViolationInfoShort)).mo161466a(false).mo161465a(UDNotice.Type.WARNING).mo161467a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.banner.MmReviewBanner$b */
    public static final class RunnableC45976b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmReviewBanner f115866a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f115867b;

        /* renamed from: c */
        final /* synthetic */ ReviewStatus f115868c;

        /* renamed from: d */
        final /* synthetic */ Function1 f115869d;

        /* renamed from: e */
        final /* synthetic */ String f115870e;

        RunnableC45976b(MmReviewBanner mmReviewBanner, ViewGroup viewGroup, ReviewStatus reviewStatus, Function1 function1, String str) {
            this.f115866a = mmReviewBanner;
            this.f115867b = viewGroup;
            this.f115868c = reviewStatus;
            this.f115869d = function1;
            this.f115870e = str;
        }

        public final void run() {
            this.f115866a.f115864a = this.f115867b;
            int i = C45985b.f115883a[this.f115868c.ordinal()];
            if (i == 1) {
                this.f115866a.mo161450a(this.f115867b);
                this.f115866a.getBanner().mo161458a().mo91033c();
                C47090a.m186499a(this.f115866a.getContext(), this.f115866a.getBanner().mo161458a(), UIHelper.mustacheFormat((int) R.string.MMWeb_G_AppealFailedInfoMobile), new C47090a.AbstractC47093a(this) {
                    /* class com.ss.android.lark.mm.module.detail.banner.MmReviewBanner.RunnableC45976b.C459771 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC45976b f115871a;

                    {
                        this.f115871a = r1;
                    }

                    @Override // com.ss.android.lark.mm.utils.C47090a.AbstractC47093a
                    /* renamed from: a */
                    public final void mo142600a(int i) {
                        Function1 function1 = this.f115871a.f115869d;
                        if (function1 != null) {
                            Unit unit = (Unit) function1.invoke(new Function1<Boolean, Unit>(this) {
                                /* class com.ss.android.lark.mm.module.detail.banner.MmReviewBanner.RunnableC45976b.C459771.C459781 */
                                final /* synthetic */ C459771 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    this.this$0.f115871a.f115866a.mo161452a(z);
                                }
                            });
                        }
                    }
                });
                this.f115866a.getBanner().mo161460a(UDNotice.Type.WARNING);
            } else if (i == 2) {
                this.f115866a.mo161450a(this.f115867b);
                this.f115866a.getBanner().mo161458a().mo91033c();
                C47090a.m186499a(this.f115866a.getContext(), this.f115866a.getBanner().mo161458a(), UIHelper.mustacheFormat((int) R.string.MMWeb_G_ViolationInfo, "appName", this.f115870e), new C47090a.AbstractC47093a(this) {
                    /* class com.ss.android.lark.mm.module.detail.banner.MmReviewBanner.RunnableC45976b.C459792 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC45976b f115872a;

                    {
                        this.f115872a = r1;
                    }

                    @Override // com.ss.android.lark.mm.utils.C47090a.AbstractC47093a
                    /* renamed from: a */
                    public final void mo142600a(int i) {
                        Function1 function1 = this.f115872a.f115869d;
                        if (function1 != null) {
                            Unit unit = (Unit) function1.invoke(new Function1<Boolean, Unit>(this) {
                                /* class com.ss.android.lark.mm.module.detail.banner.MmReviewBanner.RunnableC45976b.C459792.C459801 */
                                final /* synthetic */ C459792 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    this.this$0.f115872a.f115866a.mo161452a(z);
                                }
                            });
                        }
                    }
                });
                this.f115866a.getBanner().mo161460a(UDNotice.Type.WARNING);
            } else if (i == 3) {
                this.f115866a.mo161450a(this.f115867b);
                this.f115866a.getBanner().mo161458a().mo91033c();
                this.f115866a.getBanner().mo161461a(this.f115866a.getContext().getString(R.string.MMWeb_G_ProcessingAppeal));
                this.f115866a.getBanner().mo161460a(UDNotice.Type.INFO);
            } else if (i == 4) {
                this.f115866a.mo161453b(this.f115867b);
            }
        }
    }

    /* renamed from: a */
    public final void mo161450a(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        setVisibility(0);
        getBanner().mo161459a(this);
        viewGroup.addView(this);
    }

    /* renamed from: b */
    public final void mo161453b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        viewGroup.setVisibility(8);
        getBanner().mo161462b();
        viewGroup.removeView(this);
        setVisibility(8);
    }

    /* renamed from: a */
    public final void mo161452a(boolean z) {
        C47083e.m186423a(getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("complaint_submit").mo165421c());
        C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("complaint_submit").mo165423e("none").mo165421c());
        if (z) {
            C45858j.m181677a((int) R.string.MMWeb_G_AppealSubmitted);
            ViewGroup viewGroup = this.f115864a;
            if (viewGroup != null) {
                mo161453b(viewGroup);
                ReviewStatus reviewStatus = ReviewStatus.ToAppeal;
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
                Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
                String g = hostDepend.mo144639g();
                Intrinsics.checkExpressionValueIsNotNull(g, "MmDepend.impl().hostDepend.appName");
                m182177a(this, viewGroup, reviewStatus, g, null, 8, null);
                return;
            }
            return;
        }
        C45858j.m181677a((int) R.string.MMWeb_G_AppealSubmitFailed);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmReviewBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f115865b = LazyKt.lazy(new C45975a(context));
    }

    /* renamed from: a */
    public final void mo161451a(ViewGroup viewGroup, ReviewStatus reviewStatus, String str, Function1<? super Function1<? super Boolean, Unit>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(reviewStatus, "reviewStatus");
        Intrinsics.checkParameterIsNotNull(str, "appName");
        C45859k.m181685a(new RunnableC45976b(this, viewGroup, reviewStatus, function1, str));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmReviewBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.detail.banner.MmReviewBanner */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m182177a(MmReviewBanner mmReviewBanner, ViewGroup viewGroup, ReviewStatus reviewStatus, String str, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        mmReviewBanner.mo161451a(viewGroup, reviewStatus, str, function1);
    }
}
