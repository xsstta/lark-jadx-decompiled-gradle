package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016Jh\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalGuideModuleDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IGuideModuleDependency;", "()V", "checkAndShowGuide", "", "guideKey", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "textHint", "anchorGravity", "", "arrowOffset", "leftText", "leftAction", "Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuideButtonAction;", "rightText", "rightAction", "checkShowAppendEventGuide", "listener", "Landroid/view/View$OnClickListener;", "checkToShow", "", "key", "completeGuide", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.m */
public final class CalGuideModuleDependency implements AbstractC30050n {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n
    /* renamed from: a */
    public void mo108242a(String str) {
        if (str != null) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).completeGuide(str);
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n
    /* renamed from: b */
    public boolean mo108244b(String str) {
        if (str != null) {
            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkToShow(str);
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n
    /* renamed from: a */
    public void mo108241a(Activity activity, View view, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showCreateNewCalendarTipIfNeed(activity, view, onClickListener);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30050n
    /* renamed from: a */
    public void mo108243a(String str, Activity activity, View view, String str2, int i, int i2) {
        AnchorConfig.AnchorGravity anchorGravity;
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(str2, "textHint");
        if (i != 3) {
            if (i != 5) {
                if (i == 48) {
                    anchorGravity = AnchorConfig.AnchorGravity.TOP;
                } else if (i != 8388611) {
                    if (i != 8388613) {
                        anchorGravity = AnchorConfig.AnchorGravity.BOTTOM;
                    }
                }
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startGuide(str, new C38708a(activity, (AbstractC38707a) null, new TextBubbleConfig(new AnchorConfig(view, anchorGravity, null, 4, null), new MaskConfig(0, (float) i2, null, null, null, 29, null), null, str2)));
            }
            anchorGravity = AnchorConfig.AnchorGravity.END;
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startGuide(str, new C38708a(activity, (AbstractC38707a) null, new TextBubbleConfig(new AnchorConfig(view, anchorGravity, null, 4, null), new MaskConfig(0, (float) i2, null, null, null, 29, null), null, str2)));
        }
        anchorGravity = AnchorConfig.AnchorGravity.START;
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startGuide(str, new C38708a(activity, (AbstractC38707a) null, new TextBubbleConfig(new AnchorConfig(view, anchorGravity, null, 4, null), new MaskConfig(0, (float) i2, null, null, null, 29, null), null, str2)));
    }
}
