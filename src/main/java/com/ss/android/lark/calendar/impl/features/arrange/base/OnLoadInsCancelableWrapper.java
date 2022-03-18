package com.ss.android.lark.calendar.impl.features.arrange.base;

import com.larksuite.framework.callback.AbstractC25968b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016JB\u0010\t\u001a\u00020\u000628\u0010\n\u001a4\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bj\u001e\u0012\u0004\u0012\u00020\f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u0010`\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadInsCancelableWrapper;", "Lcom/larksuite/framework/callback/CancelableCallback;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "loadEventInstances", "(Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;)V", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "eventInstances", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.d */
public final class OnLoadInsCancelableWrapper extends AbstractC25968b<OnLoadEventInstances> implements OnLoadEventInstances {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnLoadInsCancelableWrapper(OnLoadEventInstances cVar) {
        super(cVar);
        Intrinsics.checkParameterIsNotNull(cVar, "loadEventInstances");
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances
    /* renamed from: a */
    public void mo108498a(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        if (!isCanceled()) {
            if (this.callback != null && (this.callback instanceof OnLoadEventInstances)) {
                ((OnLoadEventInstances) this.callback).mo108498a(errorResult);
            }
            cancel();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances
    /* renamed from: a */
    public void mo108499a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "eventInstances");
        if (!isCanceled()) {
            if (this.callback != null && (this.callback instanceof OnLoadEventInstances)) {
                ((OnLoadEventInstances) this.callback).mo108499a(hashMap);
            }
            cancel();
        }
    }
}
