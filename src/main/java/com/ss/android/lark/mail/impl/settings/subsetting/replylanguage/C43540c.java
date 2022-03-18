package com.ss.android.lark.mail.impl.settings.subsetting.replylanguage;

import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.entity.ReplyLanguage;
import com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.AbstractC43535a;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.c */
public class C43540c extends BasePresenter<AbstractC43535a.AbstractC43536a, ReplyLanguageView, AbstractC43535a.AbstractC43537b.AbstractC43538a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43535a.AbstractC43537b.AbstractC43538a createViewDelegate() {
        return new AbstractC43535a.AbstractC43537b.AbstractC43538a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.C43540c.C435411 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.AbstractC43535a.AbstractC43537b.AbstractC43538a
            /* renamed from: a */
            public void mo155437a(ReplyLanguage replyLanguage) {
                if (replyLanguage != null) {
                    ((AbstractC43535a.AbstractC43536a) C43540c.this.getModel()).mo155436a(replyLanguage);
                }
            }
        };
    }

    /* renamed from: b */
    public void mo155439b() {
        ((ReplyLanguageView) getView()).mo155430a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC43535a.AbstractC43536a) getModel()).mo155435a().mo5923a(((ReplyLanguageView) getView()).mo155433b(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.C43540c.C435422 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num != null) {
                    ((ReplyLanguageView) C43540c.this.getView()).mo155431a(ReplyLanguage.fromValue(num.intValue()));
                }
            }
        });
    }

    public C43540c(AbstractC43535a.AbstractC43536a aVar, ReplyLanguageView replyLanguageView) {
        super(aVar, replyLanguageView);
    }
}
