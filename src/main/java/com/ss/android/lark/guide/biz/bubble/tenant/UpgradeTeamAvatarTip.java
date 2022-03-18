package com.ss.android.lark.guide.biz.bubble.tenant;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.popup.Component;
import com.ss.android.lark.guide.ui.common.popup.GuidePopupBuilder;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.guide.ui.common.popup.OnBackPressedListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tenant/UpgradeTeamAvatarTip;", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "anchorView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAnchorView", "Ljava/lang/ref/WeakReference;", "adjustArrow", "", "arrow", "getAnchorFit", "", "getAnchorGravity", "getCrossOffset", "containerView", "Landroid/widget/LinearLayout;", "containerWH", "Landroid/util/Size;", "anchorRect", "Landroid/graphics/Rect;", "getMainOffset", "initViews", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "onAlignChanged", "offset", "onCreateView", "context", "Landroid/content/Context;", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.c.d */
public final class UpgradeTeamAvatarTip implements Component {

    /* renamed from: a */
    public static final Companion f99138a = new Companion(null);

    /* renamed from: b */
    private final WeakReference<View> f99139b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tenant/UpgradeTeamAvatarTip$Companion;", "", "()V", "show", "", "anchorView", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.c.d$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/guide/biz/bubble/tenant/UpgradeTeamAvatarTip$Companion$show$popup$1", "Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "onBack", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.a.c.d$a$a */
        public static final class C38585a implements OnBackPressedListener {
            @Override // com.ss.android.lark.guide.ui.common.popup.OnBackPressedListener
            /* renamed from: a */
            public boolean mo141336a() {
                return false;
            }

            C38585a() {
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141335a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "anchorView");
            IGuide a = new GuidePopupBuilder().mo141718a(new UpgradeTeamAvatarTip(view)).mo141716a(view).mo141721a(true).mo141720a(new C38585a()).mo141723a();
            if (a != null) {
                a.mo141707b();
            }
        }
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141300a() {
        return 4;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141301a(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        return 0;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141303a(LinearLayout linearLayout, Size size, int i) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141304b() {
        return 48;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141305b(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        return 0;
    }

    public UpgradeTeamAvatarTip(View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        this.f99139b = new WeakReference<>(view);
    }

    /* renamed from: a */
    private final void m152162a(View view) {
        View view2 = this.f99139b.get();
        if (view2 != null) {
            view.setTranslationX(((float) ((view2.getMeasuredWidth() / 2) - (UIUtils.getWidth(view) / 2))) + ((float) UIUtils.dp2px(view.getContext(), 4.0f)));
        }
    }

    /* renamed from: a */
    private final void m152163a(LinearLayout linearLayout, IGuide fVar) {
        View findViewById = linearLayout.findViewById(R.id.arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.findViewById<View>(id.arrow)");
        m152162a(findViewById);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141302a(Context context, LinearLayout linearLayout, IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        LayoutInflater.from(context).inflate(R.layout.guide_c2b_tip, linearLayout);
        m152163a(linearLayout, fVar);
    }
}
