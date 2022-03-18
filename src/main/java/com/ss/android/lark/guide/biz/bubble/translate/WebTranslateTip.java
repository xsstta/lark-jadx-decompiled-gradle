package com.ss.android.lark.guide.biz.bubble.translate;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonAction;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/translate/WebTranslateTip;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.d.a */
public final class WebTranslateTip {

    /* renamed from: a */
    public static final Companion f99140a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/translate/WebTranslateTip$Companion;", "", "()V", "open", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "anchorView", "Landroid/view/View;", "closeClick", "Landroid/view/View$OnClickListener;", "openClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/biz/bubble/translate/WebTranslateTip$Companion$open$confirmButton$1", "Lcom/ss/android/lark/guide/ui/config/ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.a.d.a$a$a */
        public static final class C38586a implements ButtonAction {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f99141a;

            C38586a(View.OnClickListener onClickListener) {
                this.f99141a = onClickListener;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                gVar.mo141659b();
                View.OnClickListener onClickListener = this.f99141a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/biz/bubble/translate/WebTranslateTip$Companion$open$negativeButton$1", "Lcom/ss/android/lark/guide/ui/config/ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.a.d.a$a$b */
        public static final class C38587b implements ButtonAction {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f99142a;

            C38587b(View.OnClickListener onClickListener) {
                this.f99142a = onClickListener;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                gVar.mo141659b();
                View.OnClickListener onClickListener = this.f99142a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final GuideDelegate mo141337a(View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            if (view == null) {
                return null;
            }
            AnchorConfig anchorConfig = new AnchorConfig(new WeakReference(view), AnchorConfig.AnchorGravity.TOP);
            MaskConfig maskConfig = new MaskConfig(89, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.CIRCLE, null, new Size(UIHelper.dp2px(32.0f), UIHelper.dp2px(32.0f)));
            String string = view.getContext().getString(R.string.Lark_Chat_OpenWebAutoTranslate);
            Intrinsics.checkExpressionValueIsNotNull(string, "anchorView.context.getSt…hat_OpenWebAutoTranslate)");
            String string2 = view.getContext().getString(R.string.Lark_Chat_MissTurnOnAutoTranslation);
            Intrinsics.checkExpressionValueIsNotNull(string2, "anchorView.context.getSt…issTurnOnAutoTranslation)");
            String string3 = view.getContext().getString(R.string.Lark_Legacy_Open);
            Intrinsics.checkExpressionValueIsNotNull(string3, "anchorView.context.getSt….string.Lark_Legacy_Open)");
            ButtonBubbleConfig dVar = new ButtonBubbleConfig(anchorConfig, maskConfig, null, string, new ButtonConfig(string2, new C38587b(onClickListener)), new ButtonConfig(string3, new C38586a(onClickListener2)));
            GuideComponent.Companion aVar = GuideComponent.f99382a;
            Context context = view.getContext();
            if (context != null) {
                return aVar.mo141645b((Activity) context, dVar);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
