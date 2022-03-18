package com.ss.android.lark.ai.statistics.correction;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ai/statistics/correction/CorrectionHitPoint;", "Lcom/ss/android/lark/ai/statistics/correction/ICorrectionHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "sendCorrectionApply", "", "sendCorrectionClick", "sendCorrectionIgnore", "sendCorrectionShow", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.d.a.a */
public final class CorrectionHitPoint extends BaseHitPoint implements ICorrectionHitPoint {
    @Override // com.ss.android.lark.ai.statistics.correction.ICorrectionHitPoint
    /* renamed from: a */
    public void mo101581a() {
        Statistics.sendEvent("suite_ai_correction_complete", new JSONObject().put("action", "correction_show"));
    }

    @Override // com.ss.android.lark.ai.statistics.correction.ICorrectionHitPoint
    /* renamed from: b */
    public void mo101582b() {
        Statistics.sendEvent("suite_ai_correction_complete", new JSONObject().put("action", "correction_click"));
    }

    @Override // com.ss.android.lark.ai.statistics.correction.ICorrectionHitPoint
    /* renamed from: c */
    public void mo101583c() {
        Statistics.sendEvent("suite_ai_correction_complete", new JSONObject().put("action", "correction_apply"));
    }

    @Override // com.ss.android.lark.ai.statistics.correction.ICorrectionHitPoint
    /* renamed from: d */
    public void mo101584d() {
        Statistics.sendEvent("suite_ai_correction_complete", new JSONObject().put("action", "disable"));
    }
}
