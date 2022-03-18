package com.ss.android.lark.guide.ui.component.bubble;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.popup.Component;
import com.ss.android.lark.guide.ui.common.popup.GuidePopupBuilder;
import com.ss.android.lark.guide.ui.common.popup.HighlightHandler;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.BubbleConfig;
import com.ss.android.lark.guide.ui.config.BubbleListener;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.view.BubbleLayout;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 82\u00020\u00012\u00020\u0002:\u000278B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J \u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J \u0010'\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0004J \u0010*\u001a\u00020+2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010,\u001a\u00020\u001eH\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H&J\u0018\u00101\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00102\u001a\u00020.H&J \u00103\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010/\u001a\u000200H\u0016J\b\u00104\u001a\u00020+H\u0016J\b\u00105\u001a\u00020\u0016H\u0016J\u0006\u00106\u001a\u00020.R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u00069"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/BaseBubbleComponent;", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "Lcom/ss/android/lark/guide/ui/config/BubbleListener;", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "title", "", "detail", "maskConfig", "Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "anchorConfig", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig;", "bubbleConfig", "Lcom/ss/android/lark/guide/ui/config/BubbleConfig;", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/guide/ui/config/MaskConfig;Lcom/ss/android/lark/guide/ui/config/AnchorConfig;Lcom/ss/android/lark/guide/ui/config/BubbleConfig;)V", "bubbleLayout", "Lcom/ss/android/lark/guide/ui/view/BubbleLayout;", "getDetail", "()Ljava/lang/String;", "getTitle", "canFocusable", "", "canOutsideDismiss", "createBubbleLayout", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "getAnchorFit", "", "getAnchorGravity", "getCrossOffset", "containerView", "Landroid/widget/LinearLayout;", "containerWH", "Landroid/util/Size;", "anchorRect", "Landroid/graphics/Rect;", "getMainOffset", "makeGuidePopupBuilder", "Lcom/ss/android/lark/guide/ui/common/popup/GuidePopupBuilder;", "onAlignChanged", "", "offset", "onCreateBubbleDelegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "onCreateContentView", "bubbleDelegate", "onCreateView", "onDismiss", "start", "start2", "BubbleHighlightHandler", "Companion", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.a.a.a */
public abstract class BaseBubbleComponent implements Component, BubbleListener {

    /* renamed from: a */
    public static final Companion f99386a = new Companion(null);

    /* renamed from: b */
    private BubbleLayout f99387b;

    /* renamed from: c */
    private final WeakReference<Activity> f99388c;

    /* renamed from: d */
    private final String f99389d;

    /* renamed from: e */
    private final String f99390e;

    /* renamed from: f */
    private final MaskConfig f99391f;

    /* renamed from: g */
    private final AnchorConfig f99392g;

    /* renamed from: h */
    private final BubbleConfig f99393h;

    /* renamed from: a */
    public abstract View mo141648a(Context context, GuideDelegate gVar);

    /* renamed from: a */
    public abstract GuideDelegate mo141649a(IGuide fVar);

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141304b() {
        return 32;
    }

    /* renamed from: c */
    public abstract boolean mo141650c();

    /* renamed from: d */
    public abstract boolean mo141651d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/BaseBubbleComponent$Companion;", "", "()V", "TAG", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo141655h() {
        return this.f99389d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo141656i() {
        return this.f99390e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/ui/component/bubble/BaseBubbleComponent$start2$1", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "close", "", "isShow", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.a$c */
    public static final class C38675c implements GuideDelegate {

        /* renamed from: a */
        final /* synthetic */ WeakReference f99395a;

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: b */
        public void mo141659b() {
            IGuide fVar;
            WeakReference weakReference = this.f99395a;
            if (weakReference != null && (fVar = (IGuide) weakReference.get()) != null) {
                fVar.mo141708c();
            }
        }

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: a */
        public boolean mo141658a() {
            IGuide fVar;
            WeakReference weakReference = this.f99395a;
            if (weakReference == null || (fVar = (IGuide) weakReference.get()) == null) {
                return false;
            }
            return fVar.mo141709d();
        }

        C38675c(WeakReference weakReference) {
            this.f99395a = weakReference;
        }
    }

    public void onDismiss() {
        BubbleListener c = this.f99393h.mo141760c();
        if (c != null) {
            c.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean mo141653f() {
        IGuide fVar;
        GuidePopupBuilder e = mo141652e();
        if (e != null) {
            fVar = e.mo141723a();
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return fVar.mo141707b();
        }
        return false;
    }

    /* renamed from: g */
    public final GuideDelegate mo141654g() {
        WeakReference weakReference;
        IGuide a;
        GuidePopupBuilder e = mo141652e();
        if (e == null || (a = e.mo141723a()) == null) {
            weakReference = null;
        } else {
            a.mo141707b();
            weakReference = new WeakReference(a);
        }
        return new C38675c(weakReference);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141300a() {
        int i = C38676b.f99397b[this.f99392g.mo141747b().ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final GuidePopupBuilder mo141652e() {
        Activity activity = this.f99388c.get();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activityRef.get() ?: kot…    return null\n        }");
            View view = (View) this.f99392g.mo141746a().get();
            if (view != null) {
                boolean c = mo141650c();
                GuidePopupBuilder a = new GuidePopupBuilder().mo141716a(view).mo141718a((Component) this).mo141721a(c).mo141727c(mo141651d()).mo141717a((PopupWindow.OnDismissListener) this);
                MaskConfig maskConfig = this.f99391f;
                if (maskConfig != null) {
                    Activity activity2 = activity;
                    GuidePopupBuilder b = a.mo141722a(true, activity).mo141715a(maskConfig.mo141750a()).mo141724b(UIUtils.getColor(activity2, R.color.lkui_N1000)).mo141725b(true);
                    if (maskConfig.mo141752c() == MaskConfig.ShapeType.CIRCLE) {
                        b.mo141728d(0);
                    } else {
                        b.mo141728d(1);
                    }
                    b.mo141726c(UIUtils.dp2px(activity2, 4.0f)).mo141719a(new BubbleHighlightHandler(maskConfig));
                }
                return a;
            }
            Log.m165383e("BaseBubbleComponent", "viewRef get is null");
            return null;
        }
        Log.m165383e("BaseBubbleComponent", "activityRef get is null");
        return null;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/BaseBubbleComponent$BubbleHighlightHandler;", "Lcom/ss/android/lark/guide/ui/common/popup/HighlightHandler;", "maskConfig", "Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "(Lcom/ss/android/lark/guide/ui/config/MaskConfig;)V", "computeHighlightArea", "Landroid/graphics/Rect;", "anchorRect", "computeRectangleRect", "rect", "computeSquareRect", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.a$a */
    public static final class BubbleHighlightHandler implements HighlightHandler {

        /* renamed from: a */
        private final MaskConfig f99394a;

        public BubbleHighlightHandler(MaskConfig maskConfig) {
            Intrinsics.checkParameterIsNotNull(maskConfig, "maskConfig");
            this.f99394a = maskConfig;
        }

        @Override // com.ss.android.lark.guide.ui.common.popup.HighlightHandler
        public Rect computeHighlightArea(Rect rect) {
            Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
            Rect d = this.f99394a.mo141753d();
            if (d != null) {
                rect = d;
            }
            if (this.f99394a.mo141752c() == MaskConfig.ShapeType.CIRCLE || this.f99394a.mo141752c() == MaskConfig.ShapeType.SQUARE) {
                return m152641b(rect);
            }
            return m152640a(rect);
        }

        /* renamed from: a */
        private final Rect m152640a(Rect rect) {
            int i;
            int i2;
            int b = (int) this.f99394a.mo141751b();
            if (this.f99394a.mo141754e() != null) {
                int width = this.f99394a.mo141754e().getWidth();
                int height = this.f99394a.mo141754e().getHeight();
                int i3 = b * 2;
                if (rect.width() + i3 < width) {
                    i2 = (width - rect.width()) / 2;
                } else {
                    i2 = b;
                }
                if (rect.height() + i3 < height) {
                    b = (height - rect.height()) / 2;
                }
                i = b;
                b = i2;
            } else {
                i = b;
            }
            Rect rect2 = new Rect(rect);
            rect2.left -= b;
            rect2.right += b;
            rect2.top -= i;
            rect2.bottom += i;
            return rect2;
        }

        /* renamed from: b */
        private final Rect m152641b(Rect rect) {
            int b = (int) this.f99394a.mo141751b();
            int max = Math.max(rect.width() + b, rect.height() + b);
            if (this.f99394a.mo141754e() != null) {
                max = Math.max(max, Math.max(this.f99394a.mo141754e().getWidth(), this.f99394a.mo141754e().getHeight()));
            }
            int i = max / 2;
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            Rect rect2 = new Rect(rect);
            rect2.left = centerX - i;
            rect2.right = centerX + i;
            rect2.top = centerY - i;
            rect2.bottom = centerY + i;
            return rect2;
        }
    }

    /* renamed from: a */
    private final BubbleLayout m152624a(Context context, View view) {
        BubbleLayout bubbleLayout = new BubbleLayout(context);
        bubbleLayout.getConfigSetter().mo141811b(this.f99392g.mo141747b().getValue()).mo141807a(UIUtils.getColor(context, R.color.primary_pri_400)).mo141810b(((float) UIUtils.dp2px(context, 24.0f)) * 1.0f).mo141812c(((float) UIUtils.dp2px(context, 9.0f)) * 1.0f).mo141806a(((float) UIUtils.dp2px(context, 8.0f)) * 1.0f).mo141808a(view).mo141809a();
        return bubbleLayout;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public int mo141301a(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        int i = 0;
        if (this.f99392g.mo141747b() == AnchorConfig.AnchorGravity.TOP || this.f99392g.mo141747b() == AnchorConfig.AnchorGravity.BOTTOM) {
            i = 0 + this.f99392g.mo141748c().x;
        }
        if (this.f99392g.mo141747b() == AnchorConfig.AnchorGravity.START || this.f99392g.mo141747b() == AnchorConfig.AnchorGravity.END) {
            return i + this.f99392g.mo141748c().y;
        }
        return i;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: b */
    public int mo141305b(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        int dp2px = UIUtils.dp2px(linearLayout.getContext(), 8.0f);
        MaskConfig maskConfig = this.f99391f;
        if (maskConfig == null) {
            return dp2px;
        }
        Rect computeHighlightArea = new BubbleHighlightHandler(maskConfig).computeHighlightArea(rect);
        if (this.f99392g.mo141747b() == AnchorConfig.AnchorGravity.TOP || this.f99392g.mo141747b() == AnchorConfig.AnchorGravity.BOTTOM) {
            if (computeHighlightArea.height() > rect.height()) {
                dp2px += (computeHighlightArea.height() - rect.height()) / 2;
            }
            dp2px += this.f99392g.mo141748c().y;
        }
        if (this.f99392g.mo141747b() != AnchorConfig.AnchorGravity.START && this.f99392g.mo141747b() != AnchorConfig.AnchorGravity.END) {
            return dp2px;
        }
        if (computeHighlightArea.width() > rect.width()) {
            dp2px += (computeHighlightArea.width() - rect.width()) / 2;
        }
        return dp2px + this.f99392g.mo141748c().x;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141302a(Context context, LinearLayout linearLayout, IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        BubbleLayout a = m152624a(context, mo141648a(context, mo141649a(fVar)));
        this.f99387b = a;
        linearLayout.addView(a);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.Component
    /* renamed from: a */
    public void mo141303a(LinearLayout linearLayout, Size size, int i) {
        int i2;
        float f;
        BubbleLayout.C38698a arrowOffsetSetter;
        BubbleLayout.C38698a a;
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        int i3 = C38676b.f99396a[this.f99392g.mo141747b().ordinal()];
        if (i3 == 1 || i3 == 2) {
            i2 = size.getHeight();
        } else if (i3 == 3 || i3 == 4) {
            i2 = size.getWidth();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        float f2 = ((float) i2) * 1.0f;
        BubbleLayout bubbleLayout = this.f99387b;
        if (bubbleLayout != null) {
            f = bubbleLayout.getArrowMainLen();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        float f3 = f2 - f;
        float f4 = (float) 2;
        float f5 = (-f3) / f4;
        float f6 = f3 / f4;
        float f7 = (float) i;
        float f8 = 1.0f * f7;
        if (f7 < f5) {
            f6 = f5;
        } else if (f7 <= f6) {
            f6 = f8;
        }
        float abs = Math.abs(f5) + f6;
        BubbleLayout bubbleLayout2 = this.f99387b;
        if (bubbleLayout2 != null && (arrowOffsetSetter = bubbleLayout2.getArrowOffsetSetter()) != null && (a = arrowOffsetSetter.mo141804a(abs)) != null) {
            a.mo141805a();
        }
    }

    public BaseBubbleComponent(WeakReference<Activity> weakReference, String str, String str2, MaskConfig maskConfig, AnchorConfig anchorConfig, BubbleConfig aVar) {
        Intrinsics.checkParameterIsNotNull(weakReference, "activityRef");
        Intrinsics.checkParameterIsNotNull(str2, "detail");
        Intrinsics.checkParameterIsNotNull(anchorConfig, "anchorConfig");
        Intrinsics.checkParameterIsNotNull(aVar, "bubbleConfig");
        this.f99388c = weakReference;
        this.f99389d = str;
        this.f99390e = str2;
        this.f99391f = maskConfig;
        this.f99392g = anchorConfig;
        this.f99393h = aVar;
    }
}
