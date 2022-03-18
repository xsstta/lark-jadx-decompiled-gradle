package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.f */
public interface AbstractC43577f {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.f$a */
    public interface AbstractC43578a extends IModel {
        /* renamed from: a */
        String mo155558a();

        /* renamed from: a */
        void mo155559a(EntSignatureUsage entSignatureUsage);

        /* renamed from: b */
        C1177w<Boolean> mo155560b();

        /* renamed from: c */
        C1177w<C42095h> mo155561c();

        /* renamed from: d */
        C1177w<EntSignatureUsage> mo155562d();
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.f$b */
    public interface AbstractC43579b extends IView<AbstractC43580a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.f$b$a */
        public interface AbstractC43580a extends IView.IViewDelegate {
            /* renamed from: a */
            String mo155567a();

            /* renamed from: a */
            void mo155568a(Context context, boolean z, String str, String str2, String str3, ArrayList<MailEntSignature> arrayList);

            /* renamed from: b */
            C1177w<Boolean> mo155569b();

            /* renamed from: c */
            C1177w<C42095h> mo155570c();

            /* renamed from: d */
            C1177w<EntSignatureUsage> mo155571d();
        }
    }
}
