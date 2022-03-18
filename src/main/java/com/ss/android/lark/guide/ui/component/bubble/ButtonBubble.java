package com.ss.android.lark.guide.ui.component.bubble;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageConfig;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001cH\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0002R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/ButtonBubble;", "Lcom/ss/android/lark/guide/ui/component/bubble/BaseBubbleComponent;", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "config", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "(Ljava/lang/ref/WeakReference;Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;)V", "focusable", "", "Ljava/lang/Boolean;", "imageConfig", "Lcom/ss/android/lark/guide/ui/config/ImageConfig;", "imageMaxWidth", "", "leftButton", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "outsideDismiss", "rightButton", "cacheContentView", "", "view", "Landroid/view/View;", "canFocusable", "canOutsideDismiss", "getCachedContentView", "isolateView", "onCreateBubbleDelegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "onCreateContentView", "context", "Landroid/content/Context;", "bubbleDelegate", "setImageCustomView", "customView", "parentView", "Landroid/view/ViewGroup;", "setImageDrawable", "image", "Landroid/graphics/drawable/Drawable;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.a.a.c */
public class ButtonBubble extends BaseBubbleComponent {

    /* renamed from: b */
    public ButtonConfig f99398b;

    /* renamed from: c */
    private ImageConfig f99399c;

    /* renamed from: d */
    private ButtonConfig f99400d;

    /* renamed from: e */
    private final Boolean f99401e;

    /* renamed from: f */
    private final Boolean f99402f;

    /* renamed from: g */
    private final float f99403g = 280.0f;

    /* renamed from: a */
    public void mo141660a(View view) {
    }

    /* renamed from: j */
    public View mo141661j() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/ui/component/bubble/ButtonBubble$onCreateBubbleDelegate$1", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "close", "", "isShow", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.c$a */
    public static final class C38677a implements GuideDelegate {

        /* renamed from: a */
        final /* synthetic */ IGuide f99404a;

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: a */
        public boolean mo141658a() {
            return this.f99404a.mo141709d();
        }

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: b */
        public void mo141659b() {
            this.f99404a.mo141708c();
        }

        C38677a(IGuide fVar) {
            this.f99404a = fVar;
        }
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: c */
    public boolean mo141650c() {
        Boolean bool = this.f99401e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: d */
    public boolean mo141651d() {
        Boolean bool = this.f99402f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.c$d */
    public static final class RunnableC38680d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f99411a;

        RunnableC38680d(ImageView imageView) {
            this.f99411a = imageView;
        }

        public final void run() {
            Drawable drawable = this.f99411a.getDrawable();
            if (drawable != null && (drawable instanceof Animatable)) {
                ((Animatable) drawable).start();
            }
        }
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: a */
    public GuideDelegate mo141649a(IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        return new C38677a(fVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/guide/ui/component/bubble/ButtonBubble$onCreateContentView$1$4$1$1", "com/ss/android/lark/guide/ui/component/bubble/ButtonBubble$$special$$inlined$let$lambda$1", "com/ss/android/lark/guide/ui/component/bubble/ButtonBubble$$special$$inlined$let$lambda$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.c$b */
    static final class View$OnClickListenerC38678b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ButtonConfig f99405a;

        /* renamed from: b */
        final /* synthetic */ TextView f99406b;

        /* renamed from: c */
        final /* synthetic */ ButtonBubble f99407c;

        /* renamed from: d */
        final /* synthetic */ GuideDelegate f99408d;

        View$OnClickListenerC38678b(ButtonConfig eVar, TextView textView, ButtonBubble cVar, GuideDelegate gVar) {
            this.f99405a = eVar;
            this.f99406b = textView;
            this.f99407c = cVar;
            this.f99408d = gVar;
        }

        public final void onClick(View view) {
            ButtonConfig.ButtonAction b = this.f99405a.mo141769b();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            b.onClick(view, this.f99408d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/guide/ui/component/bubble/ButtonBubble$onCreateContentView$1$5$1", "com/ss/android/lark/guide/ui/component/bubble/ButtonBubble$$special$$inlined$let$lambda$3"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.c$c */
    static final class View$OnClickListenerC38679c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ButtonBubble f99409a;

        /* renamed from: b */
        final /* synthetic */ GuideDelegate f99410b;

        View$OnClickListenerC38679c(ButtonBubble cVar, GuideDelegate gVar) {
            this.f99409a = cVar;
            this.f99410b = gVar;
        }

        public final void onClick(View view) {
            ButtonConfig.ButtonAction b = this.f99409a.f99398b.mo141769b();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            b.onClick(view, this.f99410b);
        }
    }

    /* renamed from: b */
    private final void m152646b(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: a */
    private final void m152645a(View view, ViewGroup viewGroup) {
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int paddingLeft = viewGroup.getPaddingLeft();
            int dp2px = (UIUtils.dp2px(viewGroup.getContext(), this.f99403g) - paddingLeft) - viewGroup.getPaddingRight();
            int i = layoutParams.width;
            int i2 = layoutParams.height;
            if (i > dp2px) {
                i2 = (int) (((((float) dp2px) * 1.0f) / ((float) i)) * ((float) i2));
            } else {
                dp2px = i;
            }
            layoutParams.width = dp2px;
            layoutParams.height = i2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonBubble(WeakReference<Activity> weakReference, ButtonBubbleConfig dVar) {
        super(weakReference, dVar.mo141763f(), dVar.mo141764g(), dVar.mo141762e(), dVar.mo141761d(), dVar);
        Intrinsics.checkParameterIsNotNull(weakReference, "activityRef");
        Intrinsics.checkParameterIsNotNull(dVar, "config");
        this.f99399c = dVar.mo141765h();
        this.f99400d = dVar.mo141766i();
        this.f99398b = dVar.mo141767j();
        this.f99401e = dVar.mo141755a();
        this.f99402f = dVar.mo141758b();
    }

    /* renamed from: a */
    private final void m152644a(Drawable drawable, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewGroup.addView(imageView, layoutParams);
        imageView.setImageDrawable(drawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            int paddingLeft = viewGroup.getPaddingLeft();
            int dp2px = (UIUtils.dp2px(viewGroup.getContext(), this.f99403g) - paddingLeft) - viewGroup.getPaddingRight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > dp2px) {
                intrinsicHeight = (int) (((((float) dp2px) * 1.0f) / ((float) intrinsicWidth)) * ((float) intrinsicHeight));
            } else {
                dp2px = intrinsicWidth;
            }
            layoutParams2.width = dp2px;
            layoutParams2.height = intrinsicHeight;
        }
        imageView.post(new RunnableC38680d(imageView));
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: a */
    public View mo141648a(Context context, GuideDelegate gVar) {
        boolean z;
        Drawable drawable;
        View view;
        View view2;
        View view3;
        Drawable drawable2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "bubbleDelegate");
        View j = mo141661j();
        boolean z2 = true;
        if (j == null) {
            j = LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.guide_ui_button_bubble, (ViewGroup) new FrameLayout(context), true);
            mo141660a(j);
        } else if (j.getParent() instanceof ViewGroup) {
            ViewParent parent = j.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(j);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if (j == null) {
            Intrinsics.throwNpe();
        }
        FrameLayout frameLayout = (FrameLayout) j.findViewById(R.id.image_container);
        String str = null;
        if (frameLayout != null) {
            ImageConfig hVar = this.f99399c;
            if (hVar != null) {
                drawable = hVar.mo141775a();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                ImageConfig hVar2 = this.f99399c;
                if (hVar2 != null) {
                    drawable2 = hVar2.mo141775a();
                } else {
                    drawable2 = null;
                }
                if (drawable2 == null) {
                    Intrinsics.throwNpe();
                }
                m152644a(drawable2, frameLayout);
            } else {
                ImageConfig hVar3 = this.f99399c;
                if (hVar3 != null) {
                    view = hVar3.mo141776b();
                } else {
                    view = null;
                }
                if (view != null) {
                    ImageConfig hVar4 = this.f99399c;
                    if (hVar4 != null) {
                        view2 = hVar4.mo141776b();
                    } else {
                        view2 = null;
                    }
                    m152646b(view2);
                    ImageConfig hVar5 = this.f99399c;
                    if (hVar5 != null) {
                        view3 = hVar5.mo141776b();
                    } else {
                        view3 = null;
                    }
                    if (view3 == null) {
                        Intrinsics.throwNpe();
                    }
                    m152645a(view3, frameLayout);
                } else {
                    frameLayout.setVisibility(8);
                }
            }
        }
        TextView textView = (TextView) j.findViewById(R.id.title);
        if (textView != null) {
            String h = mo141655h();
            if (h != null) {
                if (h.length() > 0) {
                    z = true;
                } else {
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
        TextView textView2 = (TextView) j.findViewById(R.id.detail);
        if (textView2 != null) {
            String i = mo141656i();
            if (i != null) {
                if (i.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    str = i;
                }
                if (str != null) {
                    textView2.setText(str);
                }
            }
            textView2.setVisibility(8);
        }
        View findViewById = j.findViewById(R.id.step_info);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.step_info)");
        ((TextView) findViewById).setVisibility(8);
        TextView textView3 = (TextView) j.findViewById(R.id.left_button);
        if (textView3 != null) {
            ButtonConfig eVar = this.f99400d;
            if (eVar != null) {
                textView3.setText(eVar.mo141768a());
                textView3.setOnClickListener(new View$OnClickListenerC38678b(eVar, textView3, this, gVar));
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        }
        TextView textView4 = (TextView) j.findViewById(R.id.right_button);
        if (textView4 != null) {
            textView4.setText(this.f99398b.mo141768a());
            textView4.setOnClickListener(new View$OnClickListenerC38679c(this, gVar));
        }
        return j;
    }
}
