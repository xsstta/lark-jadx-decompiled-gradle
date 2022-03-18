package com.ss.android.lark.mail.impl.compose;

import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.compose.C41974f;
import com.ss.android.lark.mail.impl.compose.attachment.C41936a;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.compose.image.AbstractC42000a;
import com.ss.android.lark.mail.impl.compose.image.UploadImage;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.ShareMailAddress;
import com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b;
import com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41869a;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.compose.h */
public interface AbstractC41994h {

    /* renamed from: com.ss.android.lark.mail.impl.compose.h$a */
    public interface AbstractC41995a extends IModel {

        /* renamed from: com.ss.android.lark.mail.impl.compose.h$a$a */
        public interface AbstractC41996a {
        }

        /* renamed from: a */
        int mo150797a(MailDraft mailDraft, long j);

        /* renamed from: a */
        int mo150798a(String str);

        /* renamed from: a */
        MailDraft mo150799a();

        /* renamed from: a */
        void mo150800a(PermissionCode permissionCode);

        /* renamed from: a */
        void mo150801a(MailDraft mailDraft);

        /* renamed from: a */
        void mo150802a(MailDraft mailDraft, AbstractC41869a<MailSendDraftResponse> aVar);

        /* renamed from: a */
        void mo150803a(MailDraft mailDraft, boolean z, long j, IGetDataCallback<MailDraft> iGetDataCallback);

        /* renamed from: a */
        void mo150804a(MailImage mailImage);

        /* renamed from: a */
        void mo150805a(String str, DocsPermissionConfig.Action action);

        /* renamed from: a */
        void mo150806a(String str, ComposeMailAction composeMailAction, String str2);

        /* renamed from: a */
        void mo150807a(String str, C41936a aVar);

        /* renamed from: a */
        void mo150808a(String str, AbstractC42000a<UploadImage> aVar);

        /* renamed from: a */
        void mo150809a(String str, List<ShareMailAddress> list);

        /* renamed from: a */
        void mo150810a(String str, boolean z, LocalAttachment localAttachment);

        /* renamed from: a */
        void mo150811a(String str, boolean z, MailImage mailImage);

        /* renamed from: a */
        void mo150812a(ArrayList<LocalAttachment> arrayList);

        /* renamed from: a */
        void mo150813a(List<MailDocsPermissionConfig> list);

        /* renamed from: a */
        boolean mo150814a(String str, String str2);

        /* renamed from: b */
        LocalAttachment mo150815b(String str);

        /* renamed from: b */
        List<MailImage> mo150816b();

        /* renamed from: b */
        void mo150817b(MailDraft mailDraft);

        /* renamed from: b */
        void mo150818b(List<MailImage> list);

        /* renamed from: c */
        C41936a mo150819c(String str);

        /* renamed from: c */
        String mo150820c();

        /* renamed from: c */
        void mo150821c(List<MailImage> list);

        /* renamed from: d */
        long mo150822d();

        /* renamed from: d */
        DocsPermissionConfig.Action mo150823d(String str);

        /* renamed from: e */
        long mo150824e();

        /* renamed from: e */
        boolean mo150825e(String str);

        /* renamed from: f */
        ArrayList<LocalAttachment> mo150826f();

        /* renamed from: f */
        boolean mo150827f(String str);

        /* renamed from: g */
        AbstractC42000a<UploadImage> mo150828g(String str);

        /* renamed from: g */
        List<C41936a> mo150829g();

        /* renamed from: h */
        UploadImage mo150830h(String str);

        /* renamed from: h */
        List<C41936a> mo150831h();

        /* renamed from: i */
        boolean mo150832i();

        /* renamed from: j */
        boolean mo150833j();

        /* renamed from: k */
        PermissionCode mo150834k();

        /* renamed from: l */
        boolean mo150835l();

        /* renamed from: m */
        boolean mo150836m();

        /* renamed from: n */
        String[] mo150837n();

        /* renamed from: o */
        void mo150838o();
    }

    /* renamed from: com.ss.android.lark.mail.impl.compose.h$b */
    public interface AbstractC41997b extends IView<AbstractC41998a> {

        /* renamed from: com.ss.android.lark.mail.impl.compose.h$b$a */
        public interface AbstractC41998a extends AbstractC42759b {
            /* renamed from: a */
            int mo150886a(MailDraft mailDraft, long j);

            /* renamed from: a */
            long mo150887a();

            /* renamed from: a */
            MailAddress mo150888a(MailAddress mailAddress);

            /* renamed from: a */
            void mo150889a(EmailAliasList emailAliasList);

            /* renamed from: a */
            void mo150890a(MailDraft mailDraft);

            /* renamed from: a */
            void mo150891a(MailDraft mailDraft, boolean z);

            /* renamed from: a */
            void mo150892a(MailDraft mailDraft, boolean z, String str, long j, IGetDataCallback iGetDataCallback);

            /* renamed from: a */
            void mo150895a(String str);

            /* renamed from: a */
            void mo150897a(String str, MailAddress mailAddress);

            /* renamed from: a */
            void mo150901a(List<MailDocsPermissionConfig> list, MailDraft mailDraft, C41974f.AbstractC41986b bVar);

            /* renamed from: a */
            void mo150902a(boolean z);

            /* renamed from: b */
            long mo150903b();

            /* renamed from: b */
            void mo150904b(MailDraft mailDraft);

            /* renamed from: b */
            void mo150906b(String str);

            /* renamed from: b */
            void mo150907b(String str, MailAddress mailAddress);

            /* renamed from: b */
            void mo150910b(boolean z);

            /* renamed from: c */
            void mo150911c();

            /* renamed from: c */
            void mo150912c(String str);

            /* renamed from: c */
            void mo150913c(List<MailImage> list);

            /* renamed from: d */
            void mo150914d();

            /* renamed from: d */
            void mo150916d(List<String> list);

            /* renamed from: e */
            void mo150917e();

            /* renamed from: e */
            void mo150919e(List<Uri> list);

            /* renamed from: f */
            void mo150920f();

            /* renamed from: f */
            void mo150921f(String str);

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.AbstractC42759b
            /* renamed from: g */
            List<MailImage> mo150922g();

            /* renamed from: h */
            void mo150925h(String str);

            /* renamed from: i */
            boolean mo150926i();

            /* renamed from: j */
            boolean mo150927j();

            /* renamed from: k */
            boolean mo150928k();

            /* renamed from: l */
            String[] mo150929l();

            /* renamed from: m */
            void mo150930m();

            /* renamed from: n */
            void mo150931n();

            /* renamed from: o */
            void mo150932o();

            /* renamed from: p */
            void mo150933p();

            /* renamed from: q */
            void mo150934q();

            /* renamed from: r */
            void mo150935r();

            /* renamed from: s */
            void mo150936s();

            /* renamed from: u */
            String mo150938u();

            /* renamed from: v */
            void mo150939v();

            /* renamed from: x */
            void mo150941x();

            /* renamed from: y */
            void mo150942y();
        }

        /* renamed from: a */
        void mo150557a(int i);

        /* renamed from: a */
        void mo150559a(DialogInterface.OnClickListener onClickListener);

        /* renamed from: a */
        void mo150560a(View view);

        /* renamed from: a */
        void mo150563a(PermissionCode permissionCode);

        /* renamed from: a */
        void mo150565a(C41923a.EnumC41933a aVar);

        /* renamed from: a */
        void mo150566a(LocalAttachment localAttachment);

        /* renamed from: a */
        void mo150568a(EmailAliasList emailAliasList);

        /* renamed from: a */
        void mo150569a(MailAddress mailAddress, EmailAliasList emailAliasList, boolean z, boolean z2);

        /* renamed from: a */
        void mo150572a(MailImage mailImage);

        /* renamed from: a */
        void mo150573a(ComposeWebView.C42751a aVar);

        /* renamed from: a */
        void mo150576a(String str);

        /* renamed from: a */
        void mo150577a(String str, int i);

        /* renamed from: a */
        void mo150578a(String str, int i, int i2);

        /* renamed from: a */
        void mo150579a(String str, int i, int i2, long j);

        /* renamed from: a */
        void mo150580a(String str, PermissionCode permissionCode);

        /* renamed from: a */
        void mo150581a(String str, ShareMailAddress shareMailAddress);

        /* renamed from: a */
        void mo150582a(String str, String str2);

        /* renamed from: a */
        void mo150583a(String str, List<ShareMailAddress> list);

        /* renamed from: a */
        void mo150584a(String str, boolean z, String str2, long j, String str3);

        /* renamed from: a */
        void mo150585a(ArrayList<LocalAttachment> arrayList, boolean z);

        /* renamed from: a */
        void mo150588a(boolean z);

        /* renamed from: a */
        void mo150589a(boolean z, ArrayList<LocalAttachment> arrayList, boolean z2);

        /* renamed from: a */
        void mo150590a(boolean z, boolean z2, List<MailAddress> list, List<MailAddress> list2, List<MailAddress> list3);

        /* renamed from: a */
        void mo150591a(String[] strArr);

        /* renamed from: a */
        boolean mo150592a(SearchAddress searchAddress);

        /* renamed from: a */
        boolean mo150593a(boolean z, IGetDataCallback iGetDataCallback, LifecycleOwner lifecycleOwner);

        /* renamed from: b */
        void mo150594b();

        /* renamed from: b */
        void mo150596b(DialogInterface.OnClickListener onClickListener);

        /* renamed from: b */
        void mo150598b(SearchAddress searchAddress);

        /* renamed from: b */
        void mo150600b(String str, ShareMailAddress shareMailAddress);

        /* renamed from: b */
        void mo150601b(boolean z);

        /* renamed from: c */
        View mo150602c();

        /* renamed from: c */
        void mo150605c(String str);

        /* renamed from: c */
        void mo150606c(boolean z);

        /* renamed from: d */
        void mo150607d();

        /* renamed from: e */
        void mo150613e(boolean z);

        /* renamed from: e */
        boolean mo150614e();

        /* renamed from: f */
        void mo150617f(boolean z);

        /* renamed from: h */
        void mo150622h();

        /* renamed from: i */
        void mo150624i();

        /* renamed from: j */
        void mo150625j();
    }
}
