package com.ss.android.lark.contact.impl.selected_confirm;

import android.os.Bundle;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.selected_confirm.c */
public class C35964c extends BaseModel implements AbstractC35958a.AbstractC35959a {

    /* renamed from: a */
    private List<SelectedData> f92988a = new ArrayList();

    /* renamed from: b */
    private List<String> f92989b = new ArrayList();

    /* renamed from: c */
    private List<String> f92990c = new ArrayList();

    /* renamed from: d */
    private List<String> f92991d = new ArrayList();

    @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a.AbstractC35959a
    /* renamed from: a */
    public List<SelectedData> mo132301a() {
        return this.f92988a;
    }

    @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a.AbstractC35959a
    /* renamed from: a */
    public List<SelectedData> mo132302a(int i) {
        if (i >= 0 && i < this.f92988a.size()) {
            this.f92988a.remove(i);
        }
        return this.f92988a;
    }

    public C35964c(Bundle bundle) {
        m140974a(bundle);
    }

    /* renamed from: a */
    private void m140974a(Bundle bundle) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(C35358a.f91400a);
        this.f92988a = arrayList;
        if (!CollectionUtils.isEmpty(arrayList)) {
            for (SelectedData selectedData : this.f92988a) {
                if (selectedData.dataType == SelectedData.DataType.CHAT) {
                    this.f92989b.add(selectedData.id);
                } else if (selectedData.dataType == SelectedData.DataType.CHATTER) {
                    this.f92990c.add(selectedData.id);
                } else if (selectedData.dataType == SelectedData.DataType.DEPARTAMENT) {
                    this.f92991d.add(selectedData.id);
                }
            }
        }
    }
}
