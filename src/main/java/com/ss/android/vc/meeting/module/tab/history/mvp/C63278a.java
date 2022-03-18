package com.ss.android.vc.meeting.module.tab.history.mvp;

import android.view.View;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab.history.mvp.VcTabListDataLoader;
import com.ss.android.vc.net.request.C63602e;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.a */
public class C63278a {

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.a$a */
    public interface AbstractC63279a extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.a$a$a */
        public interface AbstractC63280a<T> {
            /* renamed from: a */
            void mo219001a();

            /* renamed from: a */
            void mo219002a(C63602e eVar);

            /* renamed from: a */
            void mo219003a(T t);
        }

        /* renamed from: a */
        List<VCTabListItem> mo218997a();

        /* renamed from: a */
        void mo218998a(AbstractC63281b bVar);

        /* renamed from: a */
        void mo218999a(boolean z, boolean z2, AbstractC63280a<VCTabListHistoryListEntity> aVar);

        /* renamed from: b */
        boolean mo219000b();
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.a$b */
    public interface AbstractC63281b extends IView<AbstractC63282a> {

        /* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.a$b$a */
        public interface AbstractC63282a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo219004a();

        /* renamed from: a */
        void mo219005a(ITitleController iTitleController);

        /* renamed from: a */
        void mo219006a(VCTabListHistoryListEntity vCTabListHistoryListEntity);

        /* renamed from: a */
        void mo219007a(VcTabListDataLoader.LoadType loadType);

        /* renamed from: a */
        void mo219008a(AbstractC63279a aVar);

        /* renamed from: a */
        void mo219009a(List<VCTabListItem> list);

        /* renamed from: b */
        void mo219010b();

        /* renamed from: c */
        View mo219011c();

        /* renamed from: d */
        void mo219012d();
    }
}
