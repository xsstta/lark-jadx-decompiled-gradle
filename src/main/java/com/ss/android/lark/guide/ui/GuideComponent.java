package com.ss.android.lark.guide.ui;

import android.app.Activity;
import com.ss.android.lark.guide.ui.common.Step;
import com.ss.android.lark.guide.ui.common.StepControl;
import com.ss.android.lark.guide.ui.common.StepControlDelegate;
import com.ss.android.lark.guide.ui.component.bubble.ButtonBubble;
import com.ss.android.lark.guide.ui.component.bubble.StepBubble;
import com.ss.android.lark.guide.ui.component.bubble.TextBubble;
import com.ss.android.lark.guide.ui.component.dialog.ImageDialog;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageDialogConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/ui/GuideComponent;", "", "()V", "Companion", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.a */
public final class GuideComponent {

    /* renamed from: a */
    public static final Companion f99382a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final GuideDelegate m152612a(Activity activity, ButtonBubbleConfig dVar) {
        return f99382a.mo141645b(activity, dVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final GuideDelegate m152613a(Activity activity, TextBubbleConfig kVar) {
        return f99382a.mo141642a(activity, kVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014H\u0007Jh\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u001228\u0010\u0017\u001a4\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014H\u0007¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/guide/ui/GuideComponent$Companion;", "", "()V", "startBubble", "", "activity", "Landroid/app/Activity;", "config", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "Lcom/ss/android/lark/guide/ui/config/TextBubbleConfig;", "startBubble2", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "startDialog", "Lcom/ss/android/lark/guide/ui/config/ImageDialogConfig;", "startDialog2", "startStepBubble", "", "configList", "", "onStepDone", "Lkotlin/Function0;", "startStepBubble2", "Lcom/ss/android/lark/guide/ui/common/StepControlDelegate;", "onStepProgress", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "total", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.a$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/guide/ui/GuideComponent$Companion$startStepBubble$stepControl$1", "Lcom/ss/android/lark/guide/ui/common/StepControl$ControllerListener;", "onDone", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.a$a$a */
        public static final class C38673a implements StepControl.ControllerListener {

            /* renamed from: a */
            final /* synthetic */ Function0 f99383a;

            @Override // com.ss.android.lark.guide.ui.common.StepControl.ControllerListener
            /* renamed from: a */
            public void mo141646a() {
                Function0 function0 = this.f99383a;
                if (function0 != null) {
                    Unit unit = (Unit) function0.invoke();
                }
            }

            C38673a(Function0 function0) {
                this.f99383a = function0;
            }

            @Override // com.ss.android.lark.guide.ui.common.StepControl.ControllerListener
            /* renamed from: a */
            public void mo141647a(int i, int i2) {
                StepControl.ControllerListener.C38688a.m152704a(this, i, i2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/ui/GuideComponent$Companion$startStepBubble2$stepControl$1", "Lcom/ss/android/lark/guide/ui/common/StepControl$ControllerListener;", "onDone", "", "onStep", "index", "", "total", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.a$a$b */
        public static final class C38674b implements StepControl.ControllerListener {

            /* renamed from: a */
            final /* synthetic */ Function0 f99384a;

            /* renamed from: b */
            final /* synthetic */ Function2 f99385b;

            @Override // com.ss.android.lark.guide.ui.common.StepControl.ControllerListener
            /* renamed from: a */
            public void mo141646a() {
                Function0 function0 = this.f99384a;
                if (function0 != null) {
                    Unit unit = (Unit) function0.invoke();
                }
            }

            C38674b(Function0 function0, Function2 kVar) {
                this.f99384a = function0;
                this.f99385b = kVar;
            }

            @Override // com.ss.android.lark.guide.ui.common.StepControl.ControllerListener
            /* renamed from: a */
            public void mo141647a(int i, int i2) {
                Function2 kVar = this.f99385b;
                if (kVar != null) {
                    Unit unit = (Unit) kVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final GuideDelegate mo141641a(Activity activity, ImageDialogConfig iVar) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(iVar, "config");
            return new ImageDialog(activity, iVar).mo141670b();
        }

        @JvmStatic
        /* renamed from: b */
        public final GuideDelegate mo141645b(Activity activity, ButtonBubbleConfig dVar) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(dVar, "config");
            return new ButtonBubble(new WeakReference(activity), dVar).mo141654g();
        }

        @JvmStatic
        /* renamed from: a */
        public final GuideDelegate mo141642a(Activity activity, TextBubbleConfig kVar) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(kVar, "config");
            return new TextBubble(new WeakReference(activity), kVar).mo141654g();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo141643a(Activity activity, ButtonBubbleConfig dVar) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(dVar, "config");
            new ButtonBubble(new WeakReference(activity), dVar).mo141653f();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo141644a(Activity activity, List<ButtonBubbleConfig> list, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(list, "configList");
            StepControl cVar = new StepControl(new C38673a(function0));
            for (ButtonBubbleConfig dVar : list) {
                cVar.mo141680a((Step) new StepBubble(new WeakReference(activity), dVar));
            }
            return cVar.mo141683a();
        }

        @JvmStatic
        /* renamed from: a */
        public final StepControlDelegate mo141640a(Activity activity, List<ButtonBubbleConfig> list, Function2<? super Integer, ? super Integer, Unit> kVar, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(list, "configList");
            StepControl cVar = new StepControl(new C38674b(function0, kVar));
            for (ButtonBubbleConfig dVar : list) {
                cVar.mo141680a((Step) new StepBubble(new WeakReference(activity), dVar));
            }
            return cVar.mo141684b();
        }
    }
}
