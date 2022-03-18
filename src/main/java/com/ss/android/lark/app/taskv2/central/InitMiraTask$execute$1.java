package com.ss.android.lark.app.taskv2.central;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/app/taskv2/central/InitMiraTask$execute$1", "Lcom/ss/android/lark/maincore/IBootMileStoneListener;", "onFirstContentDraw", "", "tabName", "", "onFirstDataLoaded", "onFirstFrameDraw", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitMiraTask$execute$1 implements AbstractC44544a {
    @Override // com.ss.android.lark.maincore.AbstractC44544a
    /* renamed from: a */
    public void mo102546a() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44544a
    /* renamed from: b */
    public void mo102548b() {
    }

    InitMiraTask$execute$1() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44544a
    /* renamed from: a */
    public void mo102547a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabName");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterBootMileStoneListener(this);
        if (!C37239a.m146648b().mo136952a("lark.mira.hook.classloader.by.need", false)) {
            MiraModule.f130883a.mo180983e("first_content_draw");
        }
    }
}
