package com.ss.android.lark.messenger.feed.dependency;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.p2041s.C39776a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2732b.AbstractC55358a;
import com.ss.android.lark.team.p2732b.AbstractC55359b;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/messenger/feed/dependency/TeamDependency;", "Lcom/ss/android/lark/feed/dependency/IFeedModuleDependency$ITeamModuleDependency;", "()V", "addPushItemsChangeListener", "", "listener", "Lcom/ss/android/lark/team/listener/IPushItemsChangeListener;", "addPushTeamItemExpiredListener", "Lcom/ss/android/lark/team/listener/IPushTeamItemExpiredListener;", "addPushTeamsChangeListener", "Lcom/ss/android/lark/team/listener/IPushTeamsChangeListener;", "isFgEnabled", "", "openCreateTeamPage", "context", "Landroid/content/Context;", "openUpgradeGroupToTeamPage", "removePushItemsChangeListener", "removePushTeamItemExpiredListener", "removePushTeamsChangeListener", "showTeamManagementDialog", "activity", "Landroid/app/Activity;", "team", "Lcom/ss/android/lark/team/entity/Team;", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.p.a.a.a */
public final class TeamDependency implements AbstractC38037a.AbstractC38063w {
    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: a */
    public boolean mo139310a() {
        C55356a a = C39776a.m157896a();
        Intrinsics.checkExpressionValueIsNotNull(a, "TeamModuleProvider.getModule()");
        return a.mo188880c();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: a */
    public void mo139306a(Context context) {
        C39776a.m157896a().mo188875a(context);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: a */
    public void mo139307a(AbstractC55358a aVar) {
        C39776a.m157896a().mo188877b().mo188931a(aVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: b */
    public void mo139311b(AbstractC55358a aVar) {
        C39776a.m157896a().mo188877b().mo188934b(aVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: b */
    public void mo139312b(AbstractC55359b bVar) {
        C39776a.m157896a().mo188877b().mo188935b(bVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: a */
    public void mo139308a(AbstractC55359b bVar) {
        C39776a.m157896a().mo188877b().mo188932a(bVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: b */
    public void mo139313b(AbstractC55360c cVar) {
        C39776a.m157896a().mo188877b().mo188936b(cVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: a */
    public void mo139309a(AbstractC55360c cVar) {
        C39776a.m157896a().mo188877b().mo188933a(cVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38063w
    /* renamed from: a */
    public void mo139305a(Activity activity, Team team) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(team, "team");
        C39776a.m157896a().mo188873a(activity, team);
    }
}
