package com.ss.android.lark.ug.apm;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.ug.apm.UGAppreciable;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/ug/apm/OnBoardingAppreciable;", "Lcom/ss/android/lark/ug/apm/UGAppreciable;", "()V", "flowAbnormalExit", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "", "suiteId", "stepId", "stepName", "getBiz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getScene", "Lcom/ss/android/lark/appreciablelib/Scene;", "newFlowEventPoint", "Lcom/ss/android/lark/ug/apm/UGAppreciable$NetPoint;", "newReportFlowPoint", "newSourceEventPoint", "unmatchedDataError", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.a.a */
public final class OnBoardingAppreciable extends UGAppreciable {

    /* renamed from: a */
    public static final OnBoardingAppreciable f141195a = new OnBoardingAppreciable();

    private OnBoardingAppreciable() {
    }

    @Override // com.ss.android.lark.ug.apm.UGAppreciable
    /* renamed from: a */
    public Biz mo194461a() {
        return Biz.UserGrowth;
    }

    @Override // com.ss.android.lark.ug.apm.UGAppreciable
    /* renamed from: b */
    public Scene mo194464b() {
        return Scene.OnBoarding;
    }

    /* renamed from: c */
    public final UGAppreciable.NetPoint mo194465c() {
        return new UGAppreciable.NetPoint(Event.ug_get_source_event, this);
    }

    /* renamed from: d */
    public final UGAppreciable.NetPoint mo194466d() {
        return new UGAppreciable.NetPoint(Event.ug_dynamic_flow_event, this);
    }

    /* renamed from: e */
    public final UGAppreciable.NetPoint mo194467e() {
        return new UGAppreciable.NetPoint(Event.ug_dynamic_report_flow, this);
    }

    /* renamed from: a */
    public final void mo194462a(int i, String str) {
        UGAppreciable.m222295a(this, Event.ug_dynamic_flow_unmatched_data, i, str, null, null, null, 56, null);
    }

    /* renamed from: a */
    public final void mo194463a(int i, String str, String str2, String str3, String str4) {
        UGAppreciable.m222295a(this, Event.ug_dynamic_flow_abnormal_exit, i, str, null, null, MapsKt.mapOf(TuplesKt.to("suite_id", String.valueOf(str2)), TuplesKt.to("step_id", String.valueOf(str3)), TuplesKt.to("step_name", String.valueOf(str4))), 24, null);
    }
}
