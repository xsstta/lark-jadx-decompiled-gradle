package com.ss.android.lark.mail.impl.settings.subsetting.conversationmode;

import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.AbstractC43514c;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.b */
public class C43511b extends BasePresenter<AbstractC43514c.AbstractC43515a, ConversationModeView, AbstractC43514c.AbstractC43516b.AbstractC43517a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43514c.AbstractC43516b.AbstractC43517a createViewDelegate() {
        return new AbstractC43514c.AbstractC43516b.AbstractC43517a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.C43511b.C435121 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.AbstractC43514c.AbstractC43516b.AbstractC43517a
            /* renamed from: a */
            public void mo155390a(boolean z) {
                ((AbstractC43514c.AbstractC43515a) C43511b.this.getModel()).mo155387a(z);
            }
        };
    }

    /* renamed from: b */
    public void mo155389b() {
        ((ConversationModeView) getView()).mo155381a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC43514c.AbstractC43515a) getModel()).mo155386a().mo5923a(((ConversationModeView) getView()).mo155384b(), new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.C43511b.C435132 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null) {
                    ((ConversationModeView) C43511b.this.getView()).mo155383a(bool.booleanValue());
                }
            }
        });
    }

    public C43511b(AbstractC43514c.AbstractC43515a aVar, ConversationModeView conversationModeView) {
        super(aVar, conversationModeView);
    }
}
