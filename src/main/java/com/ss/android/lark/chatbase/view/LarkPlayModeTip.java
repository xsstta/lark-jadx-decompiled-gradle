package com.ss.android.lark.chatbase.view;

import android.content.Context;
import android.view.View;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatbase/view/LarkPlayModeTip;", "", "()V", "show", "", "alignView", "Landroid/view/View;", "showType", "", "showReceiverModeView", "showSpeakerModeView", "showVolumeErrorView", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatbase.view.b */
public final class LarkPlayModeTip {

    /* renamed from: a */
    public static final Lazy f88952a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C34448b.INSTANCE);

    /* renamed from: b */
    public static final Companion f88953b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatbase/view/LarkPlayModeTip$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/chatbase/view/LarkPlayModeTip;", "INSTANCE$annotations", "getINSTANCE", "()Lcom/ss/android/lark/chatbase/view/LarkPlayModeTip;", "INSTANCE$delegate", "Lkotlin/Lazy;", "SHOWTYPE_ERROR_TIP", "", "SHOWTYPE_RECEIVER", "SHOWTYPE_SPEAKER", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatbase.view.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final LarkPlayModeTip mo127188a() {
            Lazy lazy = LarkPlayModeTip.f88952a;
            Companion aVar = LarkPlayModeTip.f88953b;
            return (LarkPlayModeTip) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatbase/view/LarkPlayModeTip;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatbase.view.b$b */
    static final class C34448b extends Lambda implements Function0<LarkPlayModeTip> {
        public static final C34448b INSTANCE = new C34448b();

        C34448b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LarkPlayModeTip invoke() {
            return new LarkPlayModeTip();
        }
    }

    /* renamed from: a */
    public final void mo127186a(View view) {
        m133627a(view, 1);
    }

    /* renamed from: b */
    public final void mo127187b(View view) {
        m133627a(view, 2);
    }

    /* renamed from: a */
    private final void m133627a(View view, int i) {
        if (view != null && view.getWindowToken() != null) {
            if (i == 1) {
                Context context = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "alignView.context");
                UDToast.show(context, (int) R.string.Lark_Legacy_Tipspeaker, (int) R.drawable.speaker_voice);
            } else if (i == 2) {
                Context context2 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "alignView.context");
                UDToast.show(context2, (int) R.string.Lark_Legacy_Tipreceiver, (int) R.drawable.receiver_voice);
            } else if (i == 3) {
                Context context3 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "alignView.context");
                UDToast.show(context3, (int) R.string.Lark_Legacy_AudioPlayStatusLowVolume, (int) R.drawable.mute_voice);
            }
        }
    }
}
