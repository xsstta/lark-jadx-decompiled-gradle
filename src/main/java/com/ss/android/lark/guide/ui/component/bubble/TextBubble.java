package com.ss.android.lark.guide.ui.component.bubble;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/TextBubble;", "Lcom/ss/android/lark/guide/ui/component/bubble/BaseBubbleComponent;", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "config", "Lcom/ss/android/lark/guide/ui/config/TextBubbleConfig;", "(Ljava/lang/ref/WeakReference;Lcom/ss/android/lark/guide/ui/config/TextBubbleConfig;)V", "focusable", "", "Ljava/lang/Boolean;", "outsideDismiss", "canFocusable", "canOutsideDismiss", "onCreateBubbleDelegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "onCreateContentView", "Landroid/view/View;", "context", "Landroid/content/Context;", "bubbleDelegate", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.a.a.e */
public final class TextBubble extends BaseBubbleComponent {

    /* renamed from: b */
    private final Boolean f99418b;

    /* renamed from: c */
    private final Boolean f99419c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/ui/component/bubble/TextBubble$onCreateBubbleDelegate$1", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "close", "", "isShow", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.e$a */
    public static final class C38683a implements GuideDelegate {

        /* renamed from: a */
        final /* synthetic */ IGuide f99420a;

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: a */
        public boolean mo141658a() {
            return this.f99420a.mo141709d();
        }

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: b */
        public void mo141659b() {
            this.f99420a.mo141708c();
        }

        C38683a(IGuide fVar) {
            this.f99420a = fVar;
        }
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: c */
    public boolean mo141650c() {
        Boolean bool = this.f99418b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: d */
    public boolean mo141651d() {
        Boolean bool = this.f99419c;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: a */
    public GuideDelegate mo141649a(IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        return new C38683a(fVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBubble(WeakReference<Activity> weakReference, TextBubbleConfig kVar) {
        super(weakReference, kVar.mo141785f(), kVar.mo141786g(), kVar.mo141784e(), kVar.mo141783d(), kVar);
        Intrinsics.checkParameterIsNotNull(weakReference, "activityRef");
        Intrinsics.checkParameterIsNotNull(kVar, "config");
        this.f99418b = kVar.mo141755a();
        this.f99419c = kVar.mo141758b();
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: a */
    public View mo141648a(Context context, GuideDelegate gVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "bubbleDelegate");
        boolean z = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.guide_ui_text_bubble, (ViewGroup) new FrameLayout(context), true);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        if (textView != null) {
            String h = mo141655h();
            if (h != null) {
                if (h.length() <= 0) {
                    z = false;
                }
                if (!z) {
                    h = null;
                }
                if (h != null) {
                    textView.setText(h);
                }
            }
            textView.setVisibility(8);
        }
        View findViewById = inflate.findViewById(R.id.detail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.detail)");
        ((TextView) findViewById).setText(mo141656i());
        Intrinsics.checkExpressionValueIsNotNull(inflate, "contentView.apply {\n    …).text = detail\n        }");
        return inflate;
    }
}
