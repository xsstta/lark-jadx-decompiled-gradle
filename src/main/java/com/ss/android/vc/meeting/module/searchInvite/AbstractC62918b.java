package com.ss.android.vc.meeting.module.searchInvite;

import android.text.Editable;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.dto.SearchParticipantInfo;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.searchInvite.b */
public interface AbstractC62918b {

    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.b$a */
    public interface AbstractC62919a extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.searchInvite.b$a$a */
        public interface AbstractC62920a<T> {
            /* renamed from: a */
            void mo217423a(ErrorResult errorResult);

            /* renamed from: a */
            void mo217424a(T t);

            /* renamed from: a */
            void mo217425a(String str);
        }

        /* renamed from: a */
        String mo217419a();

        /* renamed from: a */
        void mo217420a(String str, AbstractC62920a<List<SearchParticipantInfo>> aVar);

        /* renamed from: b */
        void mo217421b();

        /* renamed from: b */
        void mo217422b(String str, AbstractC62920a<List<SearchParticipantInfo>> aVar);
    }

    /* renamed from: com.ss.android.vc.meeting.module.searchInvite.b$b */
    public interface AbstractC62921b extends IView<AbstractC62922a> {

        /* renamed from: com.ss.android.vc.meeting.module.searchInvite.b$b$a */
        public interface AbstractC62922a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo217430a();

            /* renamed from: a */
            void mo217431a(Editable editable);
        }

        /* renamed from: a */
        void mo217426a(ErrorResult errorResult);

        /* renamed from: a */
        void mo217427a(String str);

        /* renamed from: a */
        void mo217428a(String str, List<SearchParticipantInfo> list);

        /* renamed from: e */
        void mo217429e();
    }
}
