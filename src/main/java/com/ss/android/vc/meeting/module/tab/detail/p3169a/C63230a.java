package com.ss.android.vc.meeting.module.tab.detail.p3169a;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabStatisticsInfo;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.net.request.C63602e;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.a */
public class C63230a {

    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.a$a */
    public interface AbstractC63231a extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.a$a$a */
        public interface AbstractC63232a<T> {
            /* renamed from: a */
            void mo218857a();

            /* renamed from: a */
            void mo218858a(C63602e eVar);

            /* renamed from: a */
            void mo218859a(T t);
        }

        /* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.a$a$b */
        public interface AbstractC63233b<T> {
            /* renamed from: a */
            void mo218860a(C63602e eVar);

            /* renamed from: a */
            void mo218861a(T t);
        }

        /* renamed from: a */
        String mo218853a();

        /* renamed from: a */
        void mo218854a(AbstractC63232a<VcTabDetailInfo> aVar);

        /* renamed from: a */
        void mo218855a(AbstractC63233b<Object> bVar);

        /* renamed from: a */
        void mo218856a(AbstractC63234b bVar);
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.a$b */
    public interface AbstractC63234b extends IView<AbstractC63235a> {

        /* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.a$b$a */
        public interface AbstractC63235a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo218885a();

            /* renamed from: a */
            void mo218886a(Context context, String str);

            /* renamed from: b */
            RecyclerView mo218887b();

            /* renamed from: c */
            RecyclerView mo218888c();

            /* renamed from: d */
            MeetingStatus mo218889d();

            /* renamed from: e */
            String mo218890e();

            /* renamed from: f */
            String mo218891f();

            /* renamed from: g */
            ByteviewUser mo218892g();

            /* renamed from: h */
            boolean mo218893h();

            /* renamed from: i */
            String mo218894i();

            /* renamed from: j */
            void mo218895j();
        }

        /* renamed from: a */
        void mo218862a();

        /* renamed from: a */
        void mo218863a(HistoryInfo historyInfo);

        /* renamed from: a */
        void mo218864a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity);

        /* renamed from: a */
        void mo218865a(VCTabRecordInfo vCTabRecordInfo);

        /* renamed from: a */
        void mo218866a(VcTabDetailInfo vcTabDetailInfo);

        /* renamed from: a */
        void mo218867a(VCTabHistoryCommonInfo cVar);

        /* renamed from: a */
        void mo218868a(VCTabStatisticsInfo eVar);

        /* renamed from: a */
        void mo218869a(AbstractC63231a aVar);

        /* renamed from: a */
        void mo218870a(C63602e eVar);

        /* renamed from: a */
        void mo218871a(List<VCParticipantAbbrInfo> list);

        /* renamed from: b */
        void mo218872b();

        /* renamed from: b */
        void mo218873b(C63602e eVar);

        /* renamed from: b */
        void mo218874b(List<HistoryInfo> list);

        /* renamed from: c */
        MeetingStatus mo218875c();

        /* renamed from: c */
        void mo218876c(C63602e eVar);

        /* renamed from: c */
        void mo218877c(List<FollowAbbrInfo> list);

        /* renamed from: d */
        String mo218878d();

        /* renamed from: e */
        String mo218879e();

        /* renamed from: f */
        RecyclerView mo218880f();

        /* renamed from: g */
        RecyclerView mo218881g();

        /* renamed from: h */
        ByteviewUser mo218882h();

        /* renamed from: i */
        boolean mo218883i();

        /* renamed from: j */
        void mo218884j();
    }
}
