package com.ss.android.lark.member_manage.impl.add_member;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IAddGroupMemberContract {

    public interface IView extends com.larksuite.framework.mvp.IView<AbstractC44928a> {

        @Retention(RetentionPolicy.SOURCE)
        public @interface FragmentType {
        }

        /* renamed from: com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract$IView$a */
        public interface AbstractC44928a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo158995a();

            /* renamed from: a */
            void mo158996a(Activity activity);

            /* renamed from: a */
            void mo158997a(String str, SearchBaseInfo searchBaseInfo);

            /* renamed from: a */
            void mo158998a(List<String> list, List<SearchBaseInfo> list2);

            /* renamed from: a */
            void mo158999a(boolean z);

            /* renamed from: a */
            boolean mo159000a(int i);

            /* renamed from: b */
            void mo159001b();

            /* renamed from: b */
            void mo159002b(String str, SearchBaseInfo searchBaseInfo);

            /* renamed from: b */
            boolean mo159003b(int i);

            /* renamed from: c */
            void mo159004c();

            /* renamed from: d */
            void mo159005d();

            /* renamed from: e */
            boolean mo159006e();

            /* renamed from: f */
            boolean mo159007f();

            /* renamed from: g */
            boolean mo159008g();

            /* renamed from: h */
            boolean mo159009h();

            /* renamed from: i */
            boolean mo159010i();

            /* renamed from: j */
            int mo159011j();

            /* renamed from: k */
            boolean mo159012k();

            /* renamed from: l */
            boolean mo159013l();

            /* renamed from: m */
            String mo159014m();

            /* renamed from: n */
            Map<String, SearchBaseInfo> mo159015n();

            /* renamed from: o */
            boolean mo159016o();
        }

        /* renamed from: a */
        void mo158969a(String str);

        /* renamed from: a */
        void mo158970a(Map<String, SearchBaseInfo> map);

        /* renamed from: a */
        void mo158971a(boolean z, String str);

        /* renamed from: b */
        void mo158973b(String str);

        /* renamed from: b */
        void mo158974b(Map<String, SearchBaseInfo> map);

        /* renamed from: c */
        void mo158975c(String str);

        /* renamed from: j */
        void mo158983j();

        /* renamed from: k */
        int mo158984k();

        /* renamed from: l */
        String mo158985l();

        /* renamed from: m */
        Department mo158986m();

        /* renamed from: n */
        void mo158987n();
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract$a */
    public interface AbstractC44929a extends IModel {
        /* renamed from: a */
        Map<String, SearchBaseInfo> mo159017a();

        /* renamed from: a */
        void mo159018a(Context context, List<PickChatEntity> list, AbstractC44896a aVar);

        /* renamed from: a */
        void mo159019a(Context context, boolean z, boolean z2, List<SearchBaseInfo> list, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo159020a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo159021a(Chat.ChatMode chatMode, List<PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback);

        /* renamed from: a */
        void mo159022a(SearchBaseInfo searchBaseInfo);

        /* renamed from: a */
        void mo159023a(String str, Chat chat, List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo159024a(List<SearchBaseInfo> list);

        /* renamed from: a */
        boolean mo159025a(int i);

        /* renamed from: b */
        Set<SearchBaseInfo> mo159026b();

        /* renamed from: b */
        void mo159027b(SearchBaseInfo searchBaseInfo);

        /* renamed from: b */
        boolean mo159028b(int i);

        /* renamed from: c */
        Chat mo159029c();

        /* renamed from: d */
        String mo159030d();

        /* renamed from: e */
        String mo159031e();

        /* renamed from: f */
        String mo159032f();

        /* renamed from: g */
        boolean mo159033g();

        CallbackManager getCallbackManager();

        /* renamed from: h */
        String mo159035h();
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract$b */
    public interface AbstractC44930b {
        /* renamed from: a */
        void mo159036a(Context context, List<PickChatEntity> list, AbstractC44896a aVar);

        /* renamed from: a */
        boolean mo159037a();
    }
}
