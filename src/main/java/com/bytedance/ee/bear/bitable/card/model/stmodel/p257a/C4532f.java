package com.bytedance.ee.bear.bitable.card.model.stmodel.p257a;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.TableMetaModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a.f */
public class C4532f extends C4533g {

    /* renamed from: a */
    private String f13322a;

    /* renamed from: b */
    private String f13323b;

    /* renamed from: c */
    private TableMetaModel.FieldBean f13324c;

    /* renamed from: d */
    private List<TableMetaModel.ColorsMap> f13325d;

    /* renamed from: e */
    private EFieldType f13326e;

    /* renamed from: f */
    private C4535b f13327f;

    /* renamed from: a */
    public TableMetaModel.FieldBean mo17740a() {
        return this.f13324c;
    }

    /* renamed from: b */
    public EFieldType mo17744b() {
        return this.f13326e;
    }

    /* renamed from: c */
    public C4535b mo17745c() {
        return this.f13327f;
    }

    /* renamed from: a */
    public void mo17742a(EFieldType eFieldType) {
        this.f13326e = eFieldType;
    }

    /* renamed from: a */
    public void mo17743a(C4535b bVar) {
        this.f13327f = bVar;
    }

    /* renamed from: a */
    public List<C4530e.C4531a> mo17741a(List<String> list) {
        TableMetaModel.FieldBean fieldBean;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty() && (fieldBean = this.f13324c) != null && fieldBean.property != null && this.f13324c.property.options != null && !this.f13324c.property.options.isEmpty()) {
            ArrayList<C4530e.C4531a> arrayList2 = new ArrayList();
            for (TableMetaModel.FieldBean.PropertyBean.OptionInfo optionInfo : this.f13324c.property.options) {
                int size = optionInfo.index % this.f13325d.size();
                arrayList2.add(new C4530e.C4531a(optionInfo.id, optionInfo.name, size, this.f13325d.get(size).color, this.f13325d.get(size).textColor));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            arrayList = new ArrayList();
            for (String str : list) {
                if (TextUtils.isEmpty(str)) {
                    break;
                }
                for (C4530e.C4531a aVar : arrayList2) {
                    if (str.equals(aVar.mo17731a())) {
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public C4532f(C4535b bVar, EFieldType eFieldType, String str, String str2, String str3, String str4, TableMetaModel.FieldBean fieldBean, List<TableMetaModel.ColorsMap> list, boolean z) {
        super(bVar, eFieldType, str, str2, z);
        this.f13322a = str3;
        this.f13323b = str4;
        this.f13324c = fieldBean;
        this.f13325d = list;
    }
}
