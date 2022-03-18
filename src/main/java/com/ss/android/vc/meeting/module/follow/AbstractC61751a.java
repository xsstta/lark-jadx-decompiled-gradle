package com.ss.android.vc.meeting.module.follow;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.follow.FollowControl;
import com.ss.android.vc.meeting.module.follow.base.AbstractC61784b;
import com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61768k;
import com.ss.android.vc.net.request.C63602e;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.follow.a */
public abstract class AbstractC61751a extends AbstractC61420b {

    /* renamed from: com.ss.android.vc.meeting.module.follow.a$a */
    public interface AbstractC61752a {
        /* renamed from: a */
        void mo213913a();

        /* renamed from: a */
        void mo213914a(C63602e eVar);
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.a$b */
    public interface AbstractC61753b {
        /* renamed from: a */
        AbstractC61768k mo213915a();
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.a$c */
    public interface AbstractC61754c {
        /* renamed from: a */
        void mo213916a(Fragment fragment);

        /* renamed from: a */
        void mo213917a(FollowControl.FollowDirection followDirection);

        /* renamed from: a */
        void mo213918a(String str);

        /* renamed from: a */
        void mo213919a(String str, String str2);

        /* renamed from: a */
        void mo213920a(boolean z);

        /* renamed from: a */
        void mo213921a(boolean z, String str);

        /* renamed from: b */
        void mo213922b(String str);

        /* renamed from: b */
        void mo213923b(boolean z);

        void bH_();

        /* renamed from: c */
        void mo213925c(boolean z);

        /* renamed from: d */
        void mo213926d();

        /* renamed from: d */
        void mo213927d(boolean z);

        /* renamed from: e */
        void mo213928e(boolean z);

        /* renamed from: i */
        void mo213929i();

        boolean isFollowPage();

        /* renamed from: j */
        void mo213931j();

        /* renamed from: k */
        void mo213932k();

        /* renamed from: l */
        void mo213933l();

        /* renamed from: m */
        void mo213934m();
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.a$d */
    public interface AbstractC61755d {
        /* renamed from: a */
        void mo213909a();

        /* renamed from: a */
        void mo213910a(boolean z);
    }

    /* renamed from: a */
    public abstract void mo213851a();

    /* renamed from: a */
    public abstract void mo213854a(FollowInfo followInfo);

    /* renamed from: a */
    public abstract void mo213856a(CreateDocEntityRequest.CreateDocType createDocType, AbstractC61752a aVar);

    /* renamed from: a */
    public abstract void mo213857a(FollowControl.PageStatus pageStatus);

    /* renamed from: a */
    public abstract void mo213858a(AbstractC61754c cVar);

    /* renamed from: a */
    public abstract void mo213860a(AbstractC61807d dVar);

    /* renamed from: a */
    public abstract void mo213861a(String str);

    /* renamed from: a */
    public abstract void mo213862a(String str, String str2);

    /* renamed from: a */
    public abstract void mo213863a(String str, String str2, FollowInfo.InitSource initSource, boolean z, int i, AbstractC61755d dVar);

    /* renamed from: a */
    public abstract void mo213864a(boolean z);

    /* renamed from: b */
    public abstract void mo213866b();

    /* renamed from: b */
    public abstract void mo213867b(FollowInfo followInfo);

    /* renamed from: b */
    public abstract void mo213868b(AbstractC61754c cVar);

    /* renamed from: b */
    public abstract void mo213869b(AbstractC61807d dVar);

    /* renamed from: b */
    public abstract boolean mo213872b(String str);

    /* renamed from: c */
    public abstract void mo213873c();

    /* renamed from: c */
    public abstract void mo213874c(FollowInfo followInfo);

    /* renamed from: d */
    public abstract AbstractC61784b mo213877d();

    /* renamed from: e */
    public abstract void mo213879e();

    /* renamed from: f */
    public abstract boolean mo213880f();

    /* renamed from: g */
    public abstract FollowInfo mo213881g();

    /* renamed from: h */
    public abstract FollowInfo mo213882h();

    /* renamed from: i */
    public abstract String mo213883i();

    /* renamed from: j */
    public abstract boolean mo213884j();

    /* renamed from: k */
    public abstract void mo213885k();

    /* renamed from: l */
    public abstract boolean mo213886l();

    /* renamed from: m */
    public abstract void mo213887m();

    /* renamed from: n */
    public abstract void mo213888n();

    /* renamed from: o */
    public abstract boolean mo213889o();

    /* renamed from: p */
    public abstract Map<String, String> mo213890p();

    /* renamed from: q */
    public abstract String mo213891q();

    /* renamed from: r */
    public abstract boolean mo213892r();

    /* renamed from: s */
    public abstract boolean mo213893s();

    /* renamed from: t */
    public abstract void mo213894t();

    /* renamed from: u */
    public abstract LiveData<Integer> mo213895u();

    /* renamed from: v */
    public abstract boolean mo213896v();

    public AbstractC61751a(C61303k kVar) {
        super(kVar);
    }
}
