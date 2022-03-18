package com.ss.android.lark.team.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.team.listener.ITeamPushService;
import com.ss.android.lark.team.p2732b.AbstractC55358a;
import com.ss.android.lark.team.p2732b.AbstractC55359b;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u0001H\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016J3\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u0001H\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/team/service/TeamPushService;", "Lcom/ss/android/lark/team/listener/ITeamPushService;", "()V", "pushItemsChangeListeners", "", "Lcom/ss/android/lark/team/listener/IPushItemsChangeListener;", "pushTeamItemExpiredListeners", "Lcom/ss/android/lark/team/listener/IPushTeamItemExpiredListener;", "pushTeamsChangeListeners", "Lcom/ss/android/lark/team/listener/IPushTeamsChangeListener;", "addListeners", "", "T", "listenerList", "", "listener", "handler", "Lcom/ss/android/lark/sdk/PushDispatchUtils$IHandler;", "(Ljava/util/List;Ljava/lang/Object;Lcom/ss/android/lark/sdk/PushDispatchUtils$IHandler;)V", "addPushItemsChangeListener", "addPushTeamItemExpiredListener", "addPushTeamsChangeListener", "removeListeners", "removePushItemsChangeListener", "removePushTeamItemExpiredListener", "removePushTeamsChangeListener", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.d.a */
public final class TeamPushService implements ITeamPushService {

    /* renamed from: a */
    public static final TeamPushService f136810a = new TeamPushService();

    /* renamed from: b */
    private static final List<AbstractC55359b> f136811b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private static final List<AbstractC55360c> f136812c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private static final List<AbstractC55358a> f136813d = new CopyOnWriteArrayList();

    private TeamPushService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.a$a */
    static final class C55403a implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C55403a f136814a = new C55403a();

        C55403a() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_ITEMS, C554041.f136815a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.a$b */
    static final class C55406b implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C55406b f136817a = new C55406b();

        C55406b() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_ITEM_EXPIRED, C554071.f136818a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.a$c */
    static final class C55409c implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C55409c f136820a = new C55409c();

        C55409c() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_TEAMS, C554101.f136821a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.a$d */
    static final class C55412d implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C55412d f136823a = new C55412d();

        C55412d() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.PUSH_ITEMS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.a$e */
    static final class C55413e implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C55413e f136824a = new C55413e();

        C55413e() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.PUSH_ITEM_EXPIRED);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.a$f */
    static final class C55414f implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C55414f f136825a = new C55414f();

        C55414f() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.PUSH_TEAMS);
        }
    }

    @Override // com.ss.android.lark.team.listener.ITeamPushService
    /* renamed from: a */
    public void mo188931a(AbstractC55358a aVar) {
        m215007a(f136813d, aVar, C55403a.f136814a);
    }

    @Override // com.ss.android.lark.team.listener.ITeamPushService
    /* renamed from: b */
    public void mo188934b(AbstractC55358a aVar) {
        m215009b(f136813d, aVar, C55412d.f136823a);
    }

    @Override // com.ss.android.lark.team.listener.ITeamPushService
    /* renamed from: a */
    public void mo188932a(AbstractC55359b bVar) {
        m215007a(f136811b, bVar, C55406b.f136817a);
    }

    @Override // com.ss.android.lark.team.listener.ITeamPushService
    /* renamed from: b */
    public void mo188935b(AbstractC55359b bVar) {
        m215009b(f136811b, bVar, C55413e.f136824a);
    }

    @Override // com.ss.android.lark.team.listener.ITeamPushService
    /* renamed from: a */
    public void mo188933a(AbstractC55360c cVar) {
        m215007a(f136812c, cVar, C55409c.f136820a);
    }

    @Override // com.ss.android.lark.team.listener.ITeamPushService
    /* renamed from: b */
    public void mo188936b(AbstractC55360c cVar) {
        m215009b(f136812c, cVar, C55414f.f136825a);
    }

    /* renamed from: a */
    private final <T> void m215007a(List<? extends T> list, T t, C53246j.AbstractC53247a aVar) {
        if (t != null) {
            C53246j.m205910a(list, t, aVar);
        }
    }

    /* renamed from: b */
    private final <T> void m215009b(List<? extends T> list, T t, C53246j.AbstractC53247a aVar) {
        if (t != null) {
            C53246j.m205911b(list, t, aVar);
        }
    }
}
