package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.d */
public class C43571d extends BasePresenter<AbstractC43577f.AbstractC43578a, EntSignatureView, AbstractC43577f.AbstractC43579b.AbstractC43580a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43577f.AbstractC43579b.AbstractC43580a createViewDelegate() {
        return new AbstractC43577f.AbstractC43579b.AbstractC43580a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43571d.C435721 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43579b.AbstractC43580a
            /* renamed from: a */
            public String mo155567a() {
                return ((AbstractC43577f.AbstractC43578a) C43571d.this.getModel()).mo155558a();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43579b.AbstractC43580a
            /* renamed from: b */
            public C1177w<Boolean> mo155569b() {
                return ((AbstractC43577f.AbstractC43578a) C43571d.this.getModel()).mo155560b();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43579b.AbstractC43580a
            /* renamed from: c */
            public C1177w<C42095h> mo155570c() {
                return ((AbstractC43577f.AbstractC43578a) C43571d.this.getModel()).mo155561c();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43579b.AbstractC43580a
            /* renamed from: d */
            public C1177w<EntSignatureUsage> mo155571d() {
                return ((AbstractC43577f.AbstractC43578a) C43571d.this.getModel()).mo155562d();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43577f.AbstractC43579b.AbstractC43580a
            /* renamed from: a */
            public void mo155568a(Context context, boolean z, String str, String str2, String str3, ArrayList<MailEntSignature> arrayList) {
                C42699a.m170242a(context, ((AbstractC43577f.AbstractC43578a) C43571d.this.getModel()).mo155558a(), z, str, str2, str3, arrayList);
            }
        };
    }

    /* renamed from: a */
    public void mo155566a(EntSignatureUsage entSignatureUsage) {
        ((AbstractC43577f.AbstractC43578a) getModel()).mo155559a(entSignatureUsage);
    }

    public C43571d(AbstractC43577f.AbstractC43578a aVar, EntSignatureView entSignatureView) {
        super(aVar, entSignatureView);
    }
}
