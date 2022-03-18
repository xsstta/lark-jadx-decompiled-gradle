package com.ss.android.lark.mail.impl.widget.picker;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.widget.picker.C44062c;

/* renamed from: com.ss.android.lark.mail.impl.widget.picker.b */
public class C44059b extends BasePresenter<C44062c.AbstractC44063a, ContactPickerDetailView, C44062c.AbstractC44064b.AbstractC44065a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44062c.AbstractC44064b.AbstractC44065a createViewDelegate() {
        return new C44062c.AbstractC44064b.AbstractC44065a() {
            /* class com.ss.android.lark.mail.impl.widget.picker.C44059b.C440612 */

            @Override // com.ss.android.lark.mail.impl.widget.picker.C44062c.AbstractC44064b.AbstractC44065a
            /* renamed from: a */
            public C1177w<Integer> mo156737a() {
                return ((C44062c.AbstractC44063a) C44059b.this.getModel()).mo156734a();
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C44062c.AbstractC44063a) getModel()).mo156734a().mo5923a(((ContactPickerDetailView) getView()).mo156726b(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.widget.picker.C44059b.C440601 */

            /* renamed from: a */
            public void onChanged(Integer num) {
            }
        });
    }

    public C44059b(C44062c.AbstractC44063a aVar, ContactPickerDetailView contactPickerDetailView) {
        super(aVar, contactPickerDetailView);
    }
}
