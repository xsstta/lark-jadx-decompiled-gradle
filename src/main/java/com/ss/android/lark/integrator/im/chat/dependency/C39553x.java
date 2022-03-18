package com.ss.android.lark.integrator.im.chat.dependency;

import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.dependency.AbstractC36458af;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2035m.C39715a;
import com.ss.android.lark.integrator.im.p2035m.C39718b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.x */
public class C39553x implements AbstractC36458af {
    @Override // com.ss.android.lark.dependency.AbstractC36458af
    /* renamed from: b */
    public List<IOpenMessageCellFactory> mo134429b() {
        ArrayList arrayList = new ArrayList();
        C39603g.m157159a().getOpenFeatureDependency().mo143638b(arrayList);
        arrayList.addAll(C39715a.m157675a().mo160038b());
        arrayList.add(C39718b.m157699a().mo149716b());
        arrayList.add(C39603g.m157159a().getCoreDependency().mo143380F());
        return arrayList;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36458af
    /* renamed from: c */
    public List<IOpenMessageCellFactory> mo134430c() {
        ArrayList arrayList = new ArrayList();
        C39603g.m157159a().getOpenFeatureDependency().mo143639c(arrayList);
        arrayList.addAll(C39715a.m157675a().mo160039c());
        arrayList.add(C39603g.m157159a().getCoreDependency().mo143380F());
        return arrayList;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36458af
    /* renamed from: a */
    public List<IOpenMessageCellFactory> mo134428a() {
        ArrayList arrayList = new ArrayList();
        C39603g.m157159a().getOpenFeatureDependency().mo143636a(arrayList);
        arrayList.addAll(C39715a.m157675a().mo160038b());
        arrayList.addAll(AbstractC39484a.m156004a().mo104189P());
        arrayList.add(C39718b.m157699a().mo149716b());
        arrayList.add(C39603g.m157159a().getCoreDependency().mo143380F());
        return arrayList;
    }
}
