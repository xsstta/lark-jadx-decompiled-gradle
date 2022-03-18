package com.ss.android.lark.integrator.im.chat.dependency;

import com.ss.android.lark.dependency.ITeamDependency;
import com.ss.android.lark.integrator.im.p2041s.C39776a;
import com.ss.android.lark.team.C55356a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/im/chat/dependency/TeamDependency;", "Lcom/ss/android/lark/dependency/ITeamDependency;", "()V", "isTeamEnable", "", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.ae */
public final class TeamDependency implements ITeamDependency {
    @Override // com.ss.android.lark.dependency.ITeamDependency
    /* renamed from: a */
    public boolean mo134467a() {
        C55356a a = C39776a.m157896a();
        Intrinsics.checkExpressionValueIsNotNull(a, "TeamModuleProvider.getModule()");
        return a.mo188880c();
    }
}
