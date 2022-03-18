package com.ss.android.vc.meeting.module.livestream.activity;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.net.request.AbstractC63598b;

/* renamed from: com.ss.android.vc.meeting.module.livestream.activity.a */
public class C62026a {

    /* renamed from: com.ss.android.vc.meeting.module.livestream.activity.a$a */
    public interface AbstractC62027a extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.livestream.activity.a$a$a */
        public interface AbstractC62028a {
            /* renamed from: a */
            void mo214746a(MsgWithUrlInfo bVar);
        }

        /* renamed from: a */
        MsgWithUrlInfo mo214741a();

        /* renamed from: a */
        void mo214742a(String str, String str2, AbstractC63598b bVar);

        /* renamed from: b */
        boolean mo214743b();

        /* renamed from: c */
        String mo214744c();

        /* renamed from: d */
        VideoChat mo214745d();
    }

    /* renamed from: com.ss.android.vc.meeting.module.livestream.activity.a$b */
    public interface AbstractC62029b extends IView<AbstractC62030a> {

        /* renamed from: com.ss.android.vc.meeting.module.livestream.activity.a$b$a */
        public interface AbstractC62030a extends IView.IViewDelegate {
            /* renamed from: a */
            MsgWithUrlInfo mo214748a();

            /* renamed from: a */
            void mo214749a(String str, String str2, AbstractC63598b bVar);

            /* renamed from: b */
            boolean mo214750b();

            /* renamed from: c */
            String mo214751c();

            /* renamed from: d */
            VideoChat mo214752d();
        }

        /* renamed from: a */
        void mo214747a(MsgWithUrlInfo bVar);
    }
}
