package com.ss.android.lark.contact.impl.department.detail;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import com.ss.android.lark.contact.impl.department.detail.frame.C35850a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;

/* renamed from: com.ss.android.lark.contact.impl.department.detail.e */
public class C35841e {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.e$a */
    public interface AbstractC35842a extends IModel {

        /* renamed from: com.ss.android.lark.contact.impl.department.detail.e$a$a */
        public interface AbstractC35843a {
            /* renamed from: a */
            void mo131841a(C35850a aVar);

            /* renamed from: b */
            void mo131842b(C35850a aVar);
        }

        /* renamed from: a */
        void mo131810a(Context context, String str, AbstractC44896a aVar);

        /* renamed from: a */
        void mo131811a(Department department, IGetDataCallback<C35850a> iGetDataCallback);

        /* renamed from: a */
        void mo131812a(AbstractC35843a aVar);

        /* renamed from: a */
        void mo131813a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo131815a(String str, String str2, int i, boolean z, IGetDataCallback<C35850a> iGetDataCallback);

        /* renamed from: b */
        boolean mo131818b();

        /* renamed from: c */
        void mo131819c();

        /* renamed from: d */
        DepartmentStructure mo131820d();

        /* renamed from: e */
        void mo131821e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.e$b */
    public interface AbstractC35844b extends IView<AbstractC35845a> {

        /* renamed from: com.ss.android.lark.contact.impl.department.detail.e$b$a */
        public interface AbstractC35845a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo131845a(Context context, DepartmentRecyclerViewItem departmentRecyclerViewItem);

            /* renamed from: a */
            void mo131846a(Department department);

            /* renamed from: a */
            void mo131847a(Department department, int i);

            /* renamed from: a */
            void mo131848a(Department department, String str, boolean z);

            /* renamed from: a */
            void mo131849a(Department department, boolean z);

            /* renamed from: a */
            void mo131850a(String str);

            /* renamed from: a */
            void mo131851a(String str, String str2, boolean z, int i);

            /* renamed from: a */
            boolean mo131852a();

            /* renamed from: b */
            void mo131853b();

            /* renamed from: b */
            void mo131854b(Department department);

            /* renamed from: b */
            void mo131855b(Department department, int i);

            /* renamed from: c */
            boolean mo131857c(Department department, int i);
        }

        /* renamed from: a */
        void mo131748a(int i);

        /* renamed from: a */
        void mo131750a(Department department);

        /* renamed from: a */
        void mo131751a(Department department, int i);

        /* renamed from: a */
        void mo131752a(Department department, String str, boolean z);

        /* renamed from: a */
        void mo131754a(C35850a aVar);

        /* renamed from: a */
        void mo131757a(String str);

        /* renamed from: b */
        void mo131764b(Department department, int i);

        /* renamed from: b */
        void mo131765b(C35850a aVar);

        /* renamed from: b */
        void mo131767b(String str);

        /* renamed from: c */
        void mo131771c(C35850a aVar);

        /* renamed from: c */
        void mo131773c(String str);

        /* renamed from: e */
        void mo131779e();

        /* renamed from: f */
        void mo131780f();
    }
}
