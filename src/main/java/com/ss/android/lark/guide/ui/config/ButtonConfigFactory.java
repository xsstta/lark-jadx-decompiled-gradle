package com.ss.android.lark.guide.ui.config;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ButtonConfigFactory;", "", "()V", "ButtonCallback", "Companion", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.f */
public final class ButtonConfigFactory {

    /* renamed from: a */
    public static final Companion f99522a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ButtonConfigFactory$ButtonCallback;", "", "onClick", "", "view", "Landroid/view/View;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.config.f$a */
    public interface ButtonCallback {
        /* renamed from: a */
        void mo141770a(View view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ButtonConfigFactory$Companion;", "", "()V", "createFinishButtonConfig", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "context", "Landroid/content/Context;", "callback", "Lcom/ss/android/lark/guide/ui/config/ButtonConfigFactory$ButtonCallback;", "createNextButtonConfig", "createPrevButtonConfig", "createSkipButtonConfig", "getString", "", "stringResId", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.config.f$b */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/ui/config/ButtonConfigFactory$Companion$createFinishButtonConfig$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.config.f$b$a */
        public static final class C38694a implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ ButtonCallback f99523a;

            C38694a(ButtonCallback aVar) {
                this.f99523a = aVar;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                if (gVar instanceof StepDelegate) {
                    ((StepDelegate) gVar).mo141668d();
                }
                ButtonCallback aVar = this.f99523a;
                if (aVar != null) {
                    aVar.mo141770a(view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/ui/config/ButtonConfigFactory$Companion$createNextButtonConfig$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.config.f$b$b */
        public static final class C38695b implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ ButtonCallback f99524a;

            C38695b(ButtonCallback aVar) {
                this.f99524a = aVar;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                if (gVar instanceof StepDelegate) {
                    ((StepDelegate) gVar).mo141668d();
                }
                ButtonCallback aVar = this.f99524a;
                if (aVar != null) {
                    aVar.mo141770a(view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/ui/config/ButtonConfigFactory$Companion$createPrevButtonConfig$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.config.f$b$c */
        public static final class C38696c implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ ButtonCallback f99525a;

            C38696c(ButtonCallback aVar) {
                this.f99525a = aVar;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                if (gVar instanceof StepDelegate) {
                    ((StepDelegate) gVar).mo141667c();
                }
                ButtonCallback aVar = this.f99525a;
                if (aVar != null) {
                    aVar.mo141770a(view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/ui/config/ButtonConfigFactory$Companion$createSkipButtonConfig$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.config.f$b$d */
        public static final class C38697d implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ ButtonCallback f99526a;

            C38697d(ButtonCallback aVar) {
                this.f99526a = aVar;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                gVar.mo141659b();
                ButtonCallback aVar = this.f99526a;
                if (aVar != null) {
                    aVar.mo141770a(view);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final String m152787a(Context context, int i) {
            String string = context.getResources().getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getString(stringResId)");
            return string;
        }

        /* renamed from: a */
        public final ButtonConfig mo141771a(Context context, ButtonCallback aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new ButtonConfig(m152787a(context, R.string.Lark_Guide_VideoSkip), new C38697d(aVar));
        }

        /* renamed from: b */
        public final ButtonConfig mo141772b(Context context, ButtonCallback aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new ButtonConfig(m152787a(context, R.string.Lark_Guide_SpotlightPrevious), new C38696c(aVar));
        }

        /* renamed from: c */
        public final ButtonConfig mo141773c(Context context, ButtonCallback aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new ButtonConfig(m152787a(context, R.string.Lark_Guide_SpotlightFinish), new C38694a(aVar));
        }

        /* renamed from: d */
        public final ButtonConfig mo141774d(Context context, ButtonCallback aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new ButtonConfig(m152787a(context, R.string.Lark_Guide_SpotlightNext), new C38695b(aVar));
        }
    }
}
