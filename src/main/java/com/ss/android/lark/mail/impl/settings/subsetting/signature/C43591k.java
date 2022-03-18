package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.k */
public class C43591k extends BasePresenter<AbstractC43581g.AbstractC43582a, SelectEntSignatureView, AbstractC43581g.AbstractC43583b.AbstractC43584a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43581g.AbstractC43583b.AbstractC43584a createViewDelegate() {
        return new AbstractC43581g.AbstractC43583b.AbstractC43584a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43591k.C435921 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43581g.AbstractC43583b.AbstractC43584a
            /* renamed from: a */
            public void mo155579a(MailEntSignature mailEntSignature) {
                ((AbstractC43581g.AbstractC43582a) C43591k.this.getModel()).mo155572a(mailEntSignature);
            }
        };
    }

    /* renamed from: b */
    public EntSignatureUsage mo155598b() {
        String str;
        String e = ((AbstractC43581g.AbstractC43582a) getModel()).mo155577e();
        if (e == null) {
            return null;
        }
        String b = ((AbstractC43581g.AbstractC43582a) getModel()).mo155574b();
        if (((AbstractC43581g.AbstractC43582a) getModel()).mo155573a()) {
            str = e;
        } else {
            str = ((AbstractC43581g.AbstractC43582a) getModel()).mo155576d();
        }
        if (((AbstractC43581g.AbstractC43582a) getModel()).mo155573a()) {
            e = ((AbstractC43581g.AbstractC43582a) getModel()).mo155576d();
        }
        return new EntSignatureUsage(b, str, e);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i;
        super.create();
        ((SelectEntSignatureView) getView()).mo155536a(((AbstractC43581g.AbstractC43582a) getModel()).mo155573a());
        List<MailEntSignature> f = ((AbstractC43581g.AbstractC43582a) getModel()).mo155578f();
        if (CollectionUtils.isNotEmpty(f)) {
            String c = ((AbstractC43581g.AbstractC43582a) getModel()).mo155575c();
            Iterator<MailEntSignature> it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                MailEntSignature next = it.next();
                if (c.contentEquals(next.mo151380a())) {
                    i = f.indexOf(next);
                    break;
                }
            }
            if (i != -1) {
                ((SelectEntSignatureView) getView()).mo155535a(((AbstractC43581g.AbstractC43582a) getModel()).mo155578f(), i);
            }
        }
    }

    public C43591k(AbstractC43581g.AbstractC43582a aVar, SelectEntSignatureView selectEntSignatureView) {
        super(aVar, selectEntSignatureView);
    }
}
