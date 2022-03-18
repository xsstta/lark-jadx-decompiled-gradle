package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.common.StepControlDelegate;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/StepSpotlightView;", "Lcom/ss/android/lark/ug/spotlight/BaseSpotlightView;", "activity", "Landroid/app/Activity;", "steps", "", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "(Landroid/app/Activity;Ljava/util/List;)V", "isShowing", "", "stepControlDelegate", "Lcom/ss/android/lark/guide/ui/common/StepControlDelegate;", "close", "", "show", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.l */
public final class StepSpotlightView extends BaseSpotlightView {

    /* renamed from: a */
    public boolean f141712a;

    /* renamed from: b */
    private StepControlDelegate f141713b;

    /* renamed from: c */
    private final List<ButtonBubbleConfig> f141714c;

    @Override // com.ss.android.lark.ug.spotlight.BaseSpotlightView, com.ss.android.lark.ug.spotlight.SpotlightView
    /* renamed from: a */
    public void mo195183a() {
        StepControlDelegate dVar = this.f141713b;
        if (dVar != null) {
            dVar.mo141687e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.l$a */
    static final class C57517a extends Lambda implements Function0<Unit> {
        final /* synthetic */ StepSpotlightView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57517a(StepSpotlightView lVar) {
            super(0);
            this.this$0 = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f141712a = false;
        }
    }

    @Override // com.ss.android.lark.ug.spotlight.SpotlightView
    /* renamed from: c */
    public void mo195186c() {
        this.f141713b = GuideComponent.f99382a.mo141640a(mo195185b(), this.f141714c, null, new C57517a(this));
        this.f141712a = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepSpotlightView(Activity activity, List<ButtonBubbleConfig> list) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(list, "steps");
        this.f141714c = list;
    }
}
