package com.ss.android.lark.main.app.fragment;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.fragment.f */
public class C44274f {

    /* renamed from: com.ss.android.lark.main.app.fragment.f$a */
    public interface AbstractC44275a extends IModel {

        /* renamed from: com.ss.android.lark.main.app.fragment.f$a$a */
        public interface AbstractC44276a {
            /* renamed from: a */
            void mo157286a(long j);

            /* renamed from: a */
            void mo157287a(C44256d dVar);

            /* renamed from: a */
            void mo157288a(NetworkLevel networkLevel);

            /* renamed from: a */
            void mo157289a(String str, String str2);

            /* renamed from: a */
            void mo157290a(List<TenantInfo> list);

            /* renamed from: a */
            void mo157291a(boolean z);

            /* renamed from: b */
            void mo157292b(boolean z);

            /* renamed from: c */
            void mo157293c(boolean z);
        }

        /* renamed from: a */
        void mo157353a(AbstractC44276a aVar);

        /* renamed from: a */
        void mo157354a(String str);

        /* renamed from: a */
        void mo157355a(boolean z);

        /* renamed from: a */
        boolean mo157356a();

        /* renamed from: b */
        void mo157357b();
    }

    /* renamed from: com.ss.android.lark.main.app.fragment.f$b */
    public interface AbstractC44277b extends IView<AbstractC44278a> {

        /* renamed from: com.ss.android.lark.main.app.fragment.f$b$a */
        public interface AbstractC44278a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo157301a(String str);

            /* renamed from: a */
            void mo157302a(boolean z);

            /* renamed from: a */
            boolean mo157303a();

            /* renamed from: b */
            void mo157304b();
        }

        /* renamed from: a */
        Fragment mo157305a();

        /* renamed from: a */
        void mo157306a(long j);

        /* renamed from: a */
        void mo157307a(Bundle bundle);

        /* renamed from: a */
        void mo157308a(View view);

        /* renamed from: a */
        void mo157310a(NetworkLevel networkLevel);

        /* renamed from: a */
        void mo157311a(String str, Bundle bundle);

        /* renamed from: a */
        void mo157312a(String str, String str2);

        /* renamed from: a */
        void mo157313a(List<TenantInfo> list);

        /* renamed from: a */
        void mo157314a(boolean z);

        /* renamed from: a */
        boolean mo157315a(KeyEvent keyEvent);

        /* renamed from: b */
        AbstractC44552i mo157316b();

        /* renamed from: b */
        void mo157317b(View view);

        /* renamed from: b */
        void mo157318b(boolean z);

        /* renamed from: c */
        void mo157319c();

        /* renamed from: c */
        void mo157320c(boolean z);

        /* renamed from: d */
        void mo157321d(boolean z);

        /* renamed from: e */
        void mo157322e(boolean z);
    }
}
