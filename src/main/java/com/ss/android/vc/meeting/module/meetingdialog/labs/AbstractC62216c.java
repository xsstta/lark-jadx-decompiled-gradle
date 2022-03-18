package com.ss.android.vc.meeting.module.meetingdialog.labs;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.meeting.module.meetingdialog.labs.page.AbstractC62283d;
import com.ss.android.vc.net.request.AbstractC63598b;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.c */
public interface AbstractC62216c {

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.c$a */
    public interface AbstractC62217a extends IModel {
        /* renamed from: a */
        void mo215241a(VirtualBackgroundInfo virtualBackgroundInfo);

        /* renamed from: a */
        void mo215242a(EffectModel effectModel);

        /* renamed from: a */
        void mo215243a(boolean z);

        /* renamed from: a */
        void mo215244a(boolean z, AbstractC63598b<C62260i> bVar);

        /* renamed from: b */
        void mo215245b(EffectModel effectModel);
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.c$b */
    public interface AbstractC62218b extends IView<AbstractC62220b> {

        /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.c$b$a */
        public interface AbstractC62219a {
            void bN_();
        }

        /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.c$b$b */
        public interface AbstractC62220b extends IView.IViewDelegate {
            /* renamed from: a */
            void mo215247a();

            /* renamed from: a */
            void mo215248a(VirtualBackgroundInfo virtualBackgroundInfo);

            /* renamed from: a */
            void mo215249a(VirtualBackgroundInfo virtualBackgroundInfo, C62239f.AbstractC62249d dVar);

            /* renamed from: a */
            void mo215250a(AbstractC62283d dVar);

            /* renamed from: b */
            void mo215251b();
        }

        /* renamed from: a */
        void mo215199a();

        /* renamed from: a */
        void mo215200a(VirtualBackgroundInfo virtualBackgroundInfo, C62239f.AbstractC62249d dVar);

        /* renamed from: b */
        void mo215208b();

        /* renamed from: c */
        void mo215209c();

        String getEnvId();
    }
}
