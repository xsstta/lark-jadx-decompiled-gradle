package com.ss.android.lark.collaboration.applydetail.mvp;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d;
import com.ss.android.lark.contact.entity.Contact;
import java.util.List;

/* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.a */
public class C35344a extends BaseModel implements AbstractC35350d.AbstractC35351a {

    /* renamed from: a */
    private List<Contact> f91379a;

    /* renamed from: b */
    private AbstractC35350d.AbstractC35351a.AbstractC35352a f91380b;

    @Override // com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d.AbstractC35351a
    /* renamed from: a */
    public void mo130084a(AbstractC35350d.AbstractC35351a.AbstractC35352a aVar) {
        this.f91380b = aVar;
    }

    public C35344a(Bundle bundle) {
        if (bundle != null) {
            this.f91379a = bundle.getParcelableArrayList("extra_key_contact_list");
        }
    }

    @Override // com.ss.android.lark.collaboration.applydetail.mvp.AbstractC35350d.AbstractC35351a
    /* renamed from: a */
    public void mo130083a(IGetDataCallback<List<Contact>> iGetDataCallback) {
        if (iGetDataCallback != null) {
            List<Contact> list = this.f91379a;
            if (list != null) {
                iGetDataCallback.onSuccess(list);
            } else {
                iGetDataCallback.onError(new ErrorResult("contact list is empty!"));
            }
        }
    }
}
