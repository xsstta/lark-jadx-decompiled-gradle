package com.ss.android.lark.mm.module.detail.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.banner.C45981a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/banner/MmDetailBannerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "banner", "Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "getBanner", "()Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "banner$delegate", "Lkotlin/Lazy;", "attachParent", "", "parent", "Landroid/view/ViewGroup;", "detachParent", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmDetailBannerLayout extends FrameLayout {

    /* renamed from: a */
    private final Lazy f115863a;

    public MmDetailBannerLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmDetailBannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C45981a getBanner() {
        return (C45981a) this.f115863a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.banner.MmDetailBannerLayout$a */
    static final class C45974a extends Lambda implements Function0<C45981a> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45974a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C45981a invoke() {
            Context context = this.$context;
            return new C45981a.C45984a(context, context.getString(R.string.MMWeb_G_ProcessingAudioNothingToPlay)).mo161466a(false).mo161465a(UDNotice.Type.WARNING).mo161467a();
        }
    }

    /* renamed from: a */
    public final void mo161448a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        viewGroup.setVisibility(0);
        getBanner().mo161459a(this);
        viewGroup.addView(this, -1, -1);
    }

    /* renamed from: b */
    public final void mo161449b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        getBanner().mo161462b();
        viewGroup.removeView(this);
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailBannerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f115863a = LazyKt.lazy(new C45974a(context));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmDetailBannerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
