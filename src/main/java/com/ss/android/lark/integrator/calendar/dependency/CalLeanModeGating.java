package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.ILeanModeGatingDependency;
import com.ss.android.lark.calendar.impl.features.common.featureswitch.CalendarLeanModeGating;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalLeanModeGating;", "Lcom/ss/android/lark/calendar/dependency/idependency/ILeanModeGatingDependency;", "()V", "isEnable", "", "key", "", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.p */
public final class CalLeanModeGating implements ILeanModeGatingDependency {

    /* renamed from: a */
    public static final Companion f100517a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, Boolean> m154667a() {
        return f100517a.mo143042a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalLeanModeGating$Companion;", "", "()V", "getLeanModeGatingMap", "", "", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.p$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Boolean> mo143042a() {
            return CalendarLeanModeGating.f78608b.mo112725a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.ILeanModeGatingDependency
    /* renamed from: a */
    public boolean mo108266a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isOn(str);
    }
}
