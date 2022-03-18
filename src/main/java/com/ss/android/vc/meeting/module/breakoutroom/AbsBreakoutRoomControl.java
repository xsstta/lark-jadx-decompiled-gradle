package com.ss.android.vc.meeting.module.breakoutroom;

import androidx.lifecycle.C1177w;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import java.util.List;

public abstract class AbsBreakoutRoomControl extends AbstractC61420b {

    public enum Status {
        UNKNOWN,
        JOINING,
        LEAVING,
        JOINED,
        LEAVED
    }

    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl$a */
    public interface AbstractC61507a {
        /* renamed from: a */
        void mo213188a(boolean z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl$b */
    public interface AbstractC61508b {
        /* renamed from: a */
        void mo213189a();

        /* renamed from: a */
        void mo213190a(long j);

        /* renamed from: a */
        void mo213191a(VCManageResult.Action action);

        /* renamed from: a */
        void mo213192a(String str);

        /* renamed from: a */
        void mo213193a(String str, String str2);

        /* renamed from: a */
        void mo213194a(boolean z, boolean z2);

        /* renamed from: b */
        void mo213195b(String str);

        /* renamed from: c */
        void mo213196c();

        /* renamed from: e */
        void mo213197e(boolean z);

        /* renamed from: f */
        void mo213198f(boolean z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl$c */
    public interface AbstractC61509c {
        /* renamed from: a */
        void mo213199a();

        /* renamed from: a */
        void mo213200a(VCBreakoutRoomInfo.Status status, MeetingTimeData aVar);

        /* renamed from: b */
        void mo213201b();
    }

    /* renamed from: com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl$d */
    public interface AbstractC61510d {
        void a_(String str, String str2);

        void bE_();

        /* renamed from: d */
        void mo213204d();

        /* renamed from: d */
        void mo213205d(String str, String str2);
    }

    /* renamed from: a */
    public abstract void mo213161a();

    /* renamed from: a */
    public abstract void mo213162a(MeetingTimeData aVar);

    /* renamed from: a */
    public abstract void mo213163a(AbstractC61508b bVar);

    /* renamed from: a */
    public abstract void mo213164a(AbstractC61509c cVar);

    /* renamed from: a */
    public abstract void mo213165a(AbstractC61510d dVar);

    /* renamed from: a */
    public abstract void mo213166a(VCManageResult vCManageResult);

    /* renamed from: a */
    public abstract void mo213167a(String str);

    /* renamed from: a */
    public abstract void mo213168a(boolean z);

    /* renamed from: b */
    public abstract void mo213169b();

    /* renamed from: b */
    public abstract void mo213170b(AbstractC61508b bVar);

    /* renamed from: b */
    public abstract void mo213171b(AbstractC61510d dVar);

    /* renamed from: b */
    public abstract void mo213172b(String str);

    /* renamed from: c */
    public abstract void mo213173c(String str);

    /* renamed from: c */
    public abstract boolean mo213174c();

    /* renamed from: d */
    public abstract String mo213175d();

    /* renamed from: d */
    public abstract void mo213176d(String str);

    /* renamed from: e */
    public abstract C1177w mo213177e();

    /* renamed from: e */
    public abstract void mo213178e(String str);

    /* renamed from: f */
    public abstract MeetingTimeData mo213179f();

    /* renamed from: g */
    public abstract boolean mo213180g();

    /* renamed from: h */
    public abstract boolean mo213181h();

    /* renamed from: i */
    public abstract boolean mo213182i();

    /* renamed from: j */
    public abstract boolean mo213183j();

    /* renamed from: k */
    public abstract VCBreakoutRoomInfo mo213184k();

    /* renamed from: l */
    public abstract VCBreakoutRoomInfo.Status mo213185l();

    /* renamed from: m */
    public abstract Status mo213186m();

    /* renamed from: n */
    public abstract List<Participant> mo213187n();

    public AbsBreakoutRoomControl(C61303k kVar) {
        super(kVar);
    }
}
