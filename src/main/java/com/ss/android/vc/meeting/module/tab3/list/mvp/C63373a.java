package com.ss.android.vc.meeting.module.tab3.list.mvp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VCNetworkLevel;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ConnectionRepo;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListRepo;
import com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.a */
public class C63373a {

    /* renamed from: a */
    public ListRepo f159999a = new ListRepo();

    /* renamed from: b */
    private ConnectionRepo f160000b = new ConnectionRepo();

    /* renamed from: c */
    private C63375b f160001c;

    /* renamed from: a */
    public C63375b mo219295a() {
        return this.f160001c;
    }

    /* renamed from: b */
    public View mo219296b() {
        return this.f160001c.mo219315f();
    }

    /* renamed from: c */
    public ITitleInfo mo219297c() {
        return this.f160001c.mo219316g();
    }

    /* renamed from: e */
    public void mo219299e() {
        ListRepo listRepo = this.f159999a;
        if (listRepo != null) {
            listRepo.mo219333a(false);
        }
    }

    /* renamed from: f */
    public void mo219300f() {
        this.f160000b.mo219351a();
        this.f159999a.mo219335c();
    }

    /* renamed from: d */
    public void mo219298d() {
        C63389b.m248367b().mo219359a();
        this.f159999a.mo219334b();
        this.f160001c.mo219312c();
    }

    /* renamed from: g */
    private void m248304g() {
        this.f159999a.mo219331a(ListRepo.DataSource.ListError, new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$dcdE1Rz1OtVqhAkJ5C_GxjMXT5U */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.lambda$dcdE1Rz1OtVqhAkJ5C_GxjMXT5U(C63373a.this, obj);
            }
        });
        this.f159999a.mo219331a(ListRepo.DataSource.MeetingList, new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$i8A04OyxP7vK8WVQ7d2fxzdjDms */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.lambda$i8A04OyxP7vK8WVQ7d2fxzdjDms(C63373a.this, (List) obj);
            }
        });
        this.f159999a.mo219331a(ListRepo.DataSource.HistoryList, new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$1_W2je0uWRYfgFFVuwLTsNZDj7A */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.lambda$1_W2je0uWRYfgFFVuwLTsNZDj7A(C63373a.this, (List) obj);
            }
        });
        this.f159999a.mo219331a(ListRepo.DataSource.UpcomingList, new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$5eiXYmL8AJDnKM1Mr0SJCqFz6p0 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.lambda$5eiXYmL8AJDnKM1Mr0SJCqFz6p0(C63373a.this, (List) obj);
            }
        });
        this.f159999a.mo219331a(ListRepo.DataSource.HistoryListError, new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$O8oKWObEu4qT9ySBBWbC5038k2E */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.lambda$O8oKWObEu4qT9ySBBWbC5038k2E(C63373a.this, (List) obj);
            }
        });
        this.f160000b.mo219352a(new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$0NSIUqK8j4mzQvjF_FjNqjshc */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.m271458lambda$0NSIUqK8j4mzQvjF_FjNqjshc(C63373a.this, (Boolean) obj);
            }
        });
        this.f160000b.mo219353b(new Function1() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$45LAgAM0uK4gAiQ7mkqjffrPb0 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C63373a.m271459lambda$45LAgAM0uK4gAiQ7mkqjffrPb0(C63373a.this, (VCNetworkLevel) obj);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m248296a(Object obj) {
        this.f160001c.mo219313d();
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m248297a(List list) {
        this.f160001c.mo219314e();
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m248300b(VCNetworkLevel vCNetworkLevel) {
        boolean z;
        C63375b bVar = this.f160001c;
        if (vCNetworkLevel != VCNetworkLevel.NET_UNAVAILABLE) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo219309a(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m248295a(Boolean bool) {
        C60700b.m235851b("VideoChatTab_VCTabListPresenter@", "[onConnStateChanged]", "isConnected = $isConnected");
        C60735ab.m236001a(new Runnable(bool) {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$pvWU7E1nZfXVBvrAnIbtUcOGRTM */
            public final /* synthetic */ Boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63373a.lambda$pvWU7E1nZfXVBvrAnIbtUcOGRTM(C63373a.this, this.f$1);
            }
        });
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ Unit m248299b(List list) {
        this.f160001c.mo219311b(list, this.f159999a.mo219330a().mo219377a());
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ Unit m248302c(List list) {
        this.f160001c.mo219307a(list, this.f159999a.mo219330a().mo219378b());
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m248294a(VCNetworkLevel vCNetworkLevel) {
        C60700b.m235851b("VideoChatTab_VCTabListPresenter@", "[onNetworkLevel]", "VCNetworkLevel: " + vCNetworkLevel);
        C60735ab.m236001a(new Runnable(vCNetworkLevel) {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.$$Lambda$a$lj26o6XKht7TX5ZdXkJh8xAPTY */
            public final /* synthetic */ VCNetworkLevel f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63373a.m271460lambda$lj26o6XKht7TX5ZdXkJh8xAPTY(C63373a.this, this.f$1);
            }
        });
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m248301b(Boolean bool) {
        this.f160001c.mo219309a(bool.booleanValue());
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ Unit m248303d(List list) {
        this.f160001c.mo219308a(list, this.f159999a.mo219330a().mo219377a(), this.f159999a.mo219330a().mo219378b(), this.f159999a.mo219330a().mo219380d());
        return null;
    }

    /* renamed from: a */
    private void m248298a(ITitleController iTitleController) {
        this.f160001c.mo219306a(iTitleController, new MeetingListView.AbstractC63402a() {
            /* class com.ss.android.vc.meeting.module.tab3.list.mvp.C63373a.C633741 */

            @Override // com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView.AbstractC63402a
            /* renamed from: a */
            public void mo219301a() {
                C63373a.this.f159999a.mo219336d();
            }

            @Override // com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView.AbstractC63402a
            /* renamed from: b */
            public void mo219302b() {
                C63373a.this.f159999a.mo219337e();
            }

            @Override // com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView.AbstractC63402a
            /* renamed from: c */
            public void mo219303c() {
                C63373a.this.mo219299e();
            }
        });
    }

    public C63373a(LayoutInflater layoutInflater, ViewGroup viewGroup, ITitleController iTitleController) {
        this.f160001c = new C63375b(layoutInflater, viewGroup);
        m248304g();
        m248298a(iTitleController);
    }
}
