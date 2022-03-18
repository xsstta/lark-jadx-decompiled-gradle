package com.ss.android.vc.meeting.module.tab3.detail.p3172a;

import android.content.Context;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabStatisticsInfo;
import com.ss.android.vc.entity.tab.VcTabDetailBasicInfo;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.net.request.C63602e;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.a */
public class C63328a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.a$a */
    public interface AbstractC63329a extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.a$a$a */
        public interface AbstractC63330a<T> {
            /* renamed from: a */
            void mo219174a();

            /* renamed from: a */
            void mo219175a(C63602e eVar);

            /* renamed from: a */
            void mo219176a(T t, VcTabDetailBasicInfo fVar);
        }

        /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.a$a$b */
        public interface AbstractC63331b<T> {
            /* renamed from: a */
            void mo219177a(C63602e eVar);

            /* renamed from: a */
            void mo219178a(T t);
        }

        /* renamed from: a */
        String mo219167a();

        /* renamed from: a */
        void mo219168a(AbstractC63330a<VcTabDetailInfo> aVar);

        /* renamed from: a */
        void mo219169a(AbstractC63331b<Object> bVar);

        /* renamed from: a */
        void mo219170a(AbstractC63332b bVar);

        /* renamed from: b */
        String mo219171b();

        /* renamed from: c */
        VCTabListItem.PhoneType mo219172c();

        /* renamed from: d */
        String mo219173d();
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.a$b */
    public interface AbstractC63332b extends IView<AbstractC63333a> {

        /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.a$b$a */
        public interface AbstractC63333a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo219197a();

            /* renamed from: a */
            void mo219198a(Context context, String str);

            /* renamed from: a */
            void mo219199a(String str);

            /* renamed from: b */
            MeetingStatus mo219200b();

            /* renamed from: c */
            String mo219201c();

            /* renamed from: d */
            String mo219202d();

            /* renamed from: e */
            VCTabListItem.PhoneType mo219203e();

            /* renamed from: f */
            String mo219204f();

            /* renamed from: g */
            void mo219205g();
        }

        /* renamed from: a */
        void mo219179a();

        /* renamed from: a */
        void mo219180a(HistoryInfo historyInfo);

        /* renamed from: a */
        void mo219181a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity);

        /* renamed from: a */
        void mo219182a(VCTabRecordInfo vCTabRecordInfo);

        /* renamed from: a */
        void mo219183a(VcTabDetailInfo vcTabDetailInfo, VcTabDetailBasicInfo fVar);

        /* renamed from: a */
        void mo219184a(VCTabHistoryCommonInfo cVar);

        /* renamed from: a */
        void mo219185a(VCTabStatisticsInfo eVar);

        /* renamed from: a */
        void mo219186a(AbstractC63329a aVar);

        /* renamed from: a */
        void mo219187a(C63602e eVar);

        /* renamed from: a */
        void mo219188a(String str);

        /* renamed from: a */
        void mo219189a(List<VCParticipantAbbrInfo> list);

        /* renamed from: b */
        void mo219190b();

        /* renamed from: b */
        void mo219191b(C63602e eVar);

        /* renamed from: b */
        void mo219192b(List<HistoryInfo> list);

        /* renamed from: c */
        MeetingStatus mo219193c();

        /* renamed from: c */
        void mo219194c(C63602e eVar);

        /* renamed from: c */
        void mo219195c(List<FollowAbbrInfo> list);

        /* renamed from: d */
        void mo219196d();
    }
}
