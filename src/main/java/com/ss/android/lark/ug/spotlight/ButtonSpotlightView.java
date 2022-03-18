package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/ButtonSpotlightView;", "Lcom/ss/android/lark/ug/spotlight/BaseSpotlightView;", "activity", "Landroid/app/Activity;", "buttonBubbleConfig", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "(Landroid/app/Activity;Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;)V", "show", "", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.b */
public final class ButtonSpotlightView extends BaseSpotlightView {

    /* renamed from: a */
    private final ButtonBubbleConfig f141692a;

    @Override // com.ss.android.lark.ug.spotlight.SpotlightView
    /* renamed from: c */
    public void mo195186c() {
        mo195184a(GuideComponent.f99382a.mo141645b(mo195185b(), this.f141692a));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonSpotlightView(Activity activity, ButtonBubbleConfig dVar) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(dVar, "buttonBubbleConfig");
        this.f141692a = dVar;
    }
}
