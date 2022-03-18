package com.ss.android.lark.search.impl.func.pick.chatterpick.mvp;

import android.os.Bundle;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.b */
public class C53676b extends BaseModel implements AbstractC53672a.AbstractC53673a {

    /* renamed from: a */
    private Map<String, PickChatterViewData> f132463a = new LinkedHashMap();

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53673a
    /* renamed from: a */
    public List<PickChatterViewData> mo183017a() {
        return new ArrayList(this.f132463a.values());
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53673a
    /* renamed from: b */
    public List<String> mo183019b() {
        return new ArrayList(this.f132463a.keySet());
    }

    public C53676b(Bundle bundle) {
        m207789a(bundle);
    }

    /* renamed from: a */
    private void m207789a(Bundle bundle) {
        List<PickChatterViewData> list = (List) bundle.get("message/filter/picked_chatter");
        if (!CollectionUtils.isEmpty(list)) {
            for (PickChatterViewData pickChatterViewData : list) {
                this.f132463a.put(pickChatterViewData.getId(), pickChatterViewData);
            }
        }
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53673a
    /* renamed from: a */
    public void mo183018a(PickChatterViewData pickChatterViewData, boolean z) {
        String id = pickChatterViewData.getId();
        if (z && !this.f132463a.containsKey(id)) {
            pickChatterViewData.setSelected(true);
            this.f132463a.put(id, pickChatterViewData);
        } else if (!z && this.f132463a.containsKey(id)) {
            this.f132463a.remove(id);
        }
    }
}
