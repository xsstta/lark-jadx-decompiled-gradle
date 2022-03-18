package com.ss.android.lark.guide.ui.component.bubble;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.common.Step;
import com.ss.android.lark.guide.ui.common.StepChain;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.guide.ui.common.popup.OnBackPressedListener;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.StepDelegate;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57832h;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/StepBubble;", "Lcom/ss/android/lark/guide/ui/component/bubble/ButtonBubble;", "Lcom/ss/android/lark/guide/ui/common/Step;", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "config", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "(Ljava/lang/ref/WeakReference;Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;)V", "guideRef", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "stepChain", "Lcom/ss/android/lark/guide/ui/common/StepChain;", "cacheContentView", "", "view", "Landroid/view/View;", "canFocusable", "", "canOutsideDismiss", "createOnBackPressedListener", "Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "getCachedContentView", "onCreateBubbleDelegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide", "onCreateContentView", "context", "Landroid/content/Context;", "bubbleDelegate", "onProcess", "chain", "start", "stop", "Companion", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.a.a.d */
public final class StepBubble extends ButtonBubble implements Step {

    /* renamed from: e */
    public static final Companion f99412e = new Companion(null);

    /* renamed from: c */
    public StepChain f99413c;

    /* renamed from: d */
    public WeakReference<IGuide> f99414d;

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent, com.ss.android.lark.guide.ui.component.bubble.ButtonBubble
    /* renamed from: c */
    public boolean mo141650c() {
        return false;
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent, com.ss.android.lark.guide.ui.component.bubble.ButtonBubble
    /* renamed from: d */
    public boolean mo141651d() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/ui/component/bubble/StepBubble$Companion;", "", "()V", "TAG", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/ui/component/bubble/StepBubble$onCreateBubbleDelegate$1", "Lcom/ss/android/lark/guide/ui/config/StepDelegate;", "close", "", "isShow", "", "next", "pre", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.d$c */
    public static final class C38682c implements StepDelegate {

        /* renamed from: a */
        final /* synthetic */ StepBubble f99416a;

        /* renamed from: b */
        final /* synthetic */ IGuide f99417b;

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: a */
        public boolean mo141658a() {
            return this.f99417b.mo141709d();
        }

        @Override // com.ss.android.lark.guide.ui.config.GuideDelegate
        /* renamed from: b */
        public void mo141659b() {
            this.f99417b.mo141708c();
        }

        @Override // com.ss.android.lark.guide.ui.config.StepDelegate
        /* renamed from: d */
        public void mo141668d() {
            StepChain bVar = this.f99416a.f99413c;
            if (bVar != null) {
                bVar.mo141674a();
                mo141659b();
            }
        }

        @Override // com.ss.android.lark.guide.ui.config.StepDelegate
        /* renamed from: c */
        public void mo141667c() {
            StepChain bVar = this.f99416a.f99413c;
            if (bVar != null && !bVar.mo141677d()) {
                bVar.mo141675b();
                mo141659b();
            }
        }

        C38682c(StepBubble dVar, IGuide fVar) {
            this.f99416a = dVar;
            this.f99417b = fVar;
        }
    }

    /* renamed from: k */
    private final OnBackPressedListener m152655k() {
        return new C38681b(this);
    }

    @Override // com.ss.android.lark.guide.ui.common.Step
    public void aD_() {
        IGuide fVar;
        WeakReference<IGuide> weakReference = this.f99414d;
        if (weakReference != null && (fVar = weakReference.get()) != null) {
            fVar.mo141708c();
        }
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.ButtonBubble
    /* renamed from: j */
    public View mo141661j() {
        Object obj;
        StepChain bVar = this.f99413c;
        if (bVar != null) {
            obj = bVar.mo141679f();
        } else {
            obj = null;
        }
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/guide/ui/component/bubble/StepBubble$createOnBackPressedListener$1", "Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "onBack", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a.a.d$b */
    public static final class C38681b implements OnBackPressedListener {

        /* renamed from: a */
        final /* synthetic */ StepBubble f99415a;

        @Override // com.ss.android.lark.guide.ui.common.popup.OnBackPressedListener
        /* renamed from: a */
        public boolean mo141336a() {
            IGuide fVar;
            StepChain bVar = this.f99415a.f99413c;
            if (bVar == null) {
                return false;
            }
            if (bVar.mo141677d()) {
                try {
                    C57832h.m224485a();
                } catch (Exception e) {
                    Log.m165398w("StepBubbleComponent", "Failed to  ClickUtils.back2HomeFriendly()", e);
                }
                return true;
            }
            bVar.mo141675b();
            WeakReference<IGuide> weakReference = this.f99415a.f99414d;
            if (!(weakReference == null || (fVar = weakReference.get()) == null)) {
                fVar.mo141708c();
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38681b(StepBubble dVar) {
            this.f99415a = dVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo141653f() {
        /*
            r2 = this;
            com.ss.android.lark.guide.ui.common.popup.d r0 = r2.mo141652e()
            if (r0 == 0) goto L_0x0014
            com.ss.android.lark.guide.ui.common.popup.h r1 = r2.m152655k()
            r0.mo141720a(r1)
            if (r0 == 0) goto L_0x0014
            com.ss.android.lark.guide.ui.common.popup.f r0 = r0.mo141723a()
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0023
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f99414d = r1
            boolean r0 = r0.mo141707b()
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.ui.component.bubble.StepBubble.mo141653f():boolean");
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.ButtonBubble
    /* renamed from: a */
    public void mo141660a(View view) {
        StepChain bVar = this.f99413c;
        if (bVar != null) {
            bVar.mo141673a(view);
        }
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent, com.ss.android.lark.guide.ui.component.bubble.ButtonBubble
    /* renamed from: a */
    public GuideDelegate mo141649a(IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        return new C38682c(this, fVar);
    }

    @Override // com.ss.android.lark.guide.ui.common.Step
    /* renamed from: a */
    public boolean mo141665a(StepChain bVar) {
        Integer num;
        Intrinsics.checkParameterIsNotNull(bVar, "chain");
        this.f99413c = bVar;
        boolean f = mo141653f();
        if (!f) {
            StringBuilder sb = new StringBuilder();
            sb.append("step start false, stepIndex=");
            StepChain bVar2 = this.f99413c;
            if (bVar2 != null) {
                num = Integer.valueOf(bVar2.mo141676c());
            } else {
                num = null;
            }
            sb.append(num);
            Log.m165389i("StepBubbleComponent", sb.toString());
        }
        return f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepBubble(WeakReference<Activity> weakReference, ButtonBubbleConfig dVar) {
        super(weakReference, dVar);
        Intrinsics.checkParameterIsNotNull(weakReference, "activityRef");
        Intrinsics.checkParameterIsNotNull(dVar, "config");
    }

    @Override // com.ss.android.lark.guide.ui.component.bubble.BaseBubbleComponent, com.ss.android.lark.guide.ui.component.bubble.ButtonBubble
    /* renamed from: a */
    public View mo141648a(Context context, GuideDelegate gVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "bubbleDelegate");
        View a = super.mo141648a(context, gVar);
        TextView textView = (TextView) a.findViewById(R.id.step_info);
        if (textView != null) {
            int i2 = 0;
            textView.setVisibility(0);
            StepChain bVar = this.f99413c;
            if (bVar != null) {
                i = bVar.mo141676c();
            } else {
                i = 0;
            }
            StepChain bVar2 = this.f99413c;
            if (bVar2 != null) {
                i2 = bVar2.mo141678e();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i + 1);
            sb.append('/');
            sb.append(i2);
            textView.setText(sb.toString());
        }
        return a;
    }
}
