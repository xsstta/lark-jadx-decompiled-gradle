package com.ss.android.vc.meeting.module.preview;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;

/* renamed from: com.ss.android.vc.meeting.module.preview.a */
public interface AbstractC62650a {

    /* renamed from: com.ss.android.vc.meeting.module.preview.a$a */
    public interface AbstractC62651a<MD extends AbstractC62652a> extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.preview.a$a$a */
        public interface AbstractC62652a {
            /* renamed from: a */
            void mo216513a(OpenChatter openChatter);

            /* renamed from: a */
            void mo216514a(VideoChat videoChat);

            /* renamed from: a */
            void mo216515a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, boolean z3, String str);

            /* renamed from: a */
            void mo216516a(String str);

            /* renamed from: a */
            boolean mo216517a();

            /* renamed from: b */
            boolean mo216518b();

            /* renamed from: c */
            boolean mo216519c();

            /* renamed from: d */
            boolean mo216520d();

            /* renamed from: e */
            void mo216521e();

            /* renamed from: f */
            void mo216522f();

            /* renamed from: g */
            String mo216523g();

            /* renamed from: h */
            String mo216524h();
        }

        /* renamed from: a */
        void mo216505a();

        /* renamed from: a */
        void mo216506a(VideoChat videoChat);

        /* renamed from: a */
        void mo216507a(VideoChat videoChat, C62149b bVar);

        /* renamed from: a */
        void mo216508a(MD md);

        /* renamed from: a */
        void mo216509a(boolean z);

        /* renamed from: b */
        MeetingAudioManager mo216510b();

        /* renamed from: c */
        boolean mo216511c();

        /* renamed from: d */
        boolean mo216512d();
    }

    /* renamed from: com.ss.android.vc.meeting.module.preview.a$b */
    public interface AbstractC62653b<VD extends AbstractC62654a> extends IView<VD> {

        /* renamed from: com.ss.android.vc.meeting.module.preview.a$b$a */
        public interface AbstractC62654a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo216545a();

            /* renamed from: b */
            void mo216546b();

            /* renamed from: c */
            MeetingAudioManager mo216547c();

            /* renamed from: d */
            boolean mo216548d();
        }

        /* renamed from: a */
        void mo216525a(OpenChatter openChatter);

        /* renamed from: a */
        void mo216526a(VideoChat videoChat);

        /* renamed from: a */
        void mo216527a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, boolean z3, String str);

        /* renamed from: a */
        void mo216528a(AbstractC62655c cVar);

        /* renamed from: a */
        void mo216529a(String str);

        /* renamed from: c */
        boolean mo216530c();

        /* renamed from: d */
        boolean mo216531d();

        /* renamed from: e */
        boolean mo216532e();

        /* renamed from: f */
        boolean mo216533f();

        /* renamed from: g */
        void mo216534g();

        /* renamed from: h */
        void mo216535h();

        /* renamed from: i */
        void mo216536i();

        /* renamed from: j */
        void mo216537j();

        /* renamed from: k */
        void mo216538k();

        /* renamed from: l */
        String mo216539l();

        /* renamed from: m */
        void mo216540m();

        /* renamed from: n */
        void mo216541n();

        /* renamed from: o */
        void mo216542o();

        /* renamed from: p */
        void mo216543p();

        /* renamed from: q */
        void mo216544q();
    }

    /* renamed from: com.ss.android.vc.meeting.module.preview.a$c */
    public interface AbstractC62655c {
        void onPageDismiss();
    }
}
