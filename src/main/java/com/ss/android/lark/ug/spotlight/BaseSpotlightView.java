package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/BaseSpotlightView;", "Lcom/ss/android/lark/ug/spotlight/SpotlightView;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "guideDelegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "getGuideDelegate", "()Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "setGuideDelegate", "(Lcom/ss/android/lark/guide/ui/config/GuideDelegate;)V", "close", "", "isShowing", "", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.a */
public abstract class BaseSpotlightView implements SpotlightView {

    /* renamed from: a */
    private GuideDelegate f141690a;

    /* renamed from: b */
    private final Activity f141691b;

    /* renamed from: b */
    public final Activity mo195185b() {
        return this.f141691b;
    }

    @Override // com.ss.android.lark.ug.spotlight.SpotlightView
    /* renamed from: a */
    public void mo195183a() {
        GuideDelegate gVar = this.f141690a;
        if (gVar != null) {
            gVar.mo141659b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo195184a(GuideDelegate gVar) {
        this.f141690a = gVar;
    }

    public BaseSpotlightView(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f141691b = activity;
    }
}
