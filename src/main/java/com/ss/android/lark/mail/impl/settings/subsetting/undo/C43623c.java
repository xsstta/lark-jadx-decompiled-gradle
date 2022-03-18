package com.ss.android.lark.mail.impl.settings.subsetting.undo;

import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.settings.subsetting.undo.AbstractC43618a;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.c */
public class C43623c extends BasePresenter<AbstractC43618a.AbstractC43619a, SendUndoView, AbstractC43618a.AbstractC43620b.AbstractC43621a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC43618a.AbstractC43620b.AbstractC43621a createViewDelegate() {
        return new AbstractC43618a.AbstractC43620b.AbstractC43621a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.undo.C43623c.C436241 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.undo.AbstractC43618a.AbstractC43620b.AbstractC43621a
            /* renamed from: a */
            public void mo155645a(C42101o oVar) {
                if (oVar != null) {
                    ((AbstractC43618a.AbstractC43619a) C43623c.this.getModel()).mo155644a(oVar);
                }
            }
        };
    }

    /* renamed from: b */
    public void mo155647b() {
        ((SendUndoView) getView()).mo155631a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC43618a.AbstractC43619a) getModel()).mo155643a().mo5923a(((SendUndoView) getView()).mo155634b(), new AbstractC1178x<C42101o>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.undo.C43623c.C436252 */

            /* renamed from: a */
            public void onChanged(C42101o oVar) {
                if (oVar != null) {
                    ((SendUndoView) C43623c.this.getView()).mo155632a(oVar);
                }
            }
        });
    }

    public C43623c(AbstractC43618a.AbstractC43619a aVar, SendUndoView sendUndoView) {
        super(aVar, sendUndoView);
    }
}
