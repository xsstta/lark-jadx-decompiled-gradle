package com.ss.android.lark.mine.dto;

import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mine.dto.a */
public class C45423a {

    /* renamed from: a */
    private List<ChatterDescription> f115002a = new ArrayList();

    /* renamed from: b */
    private boolean f115003b = false;

    /* renamed from: b */
    public List<ChatterDescription> mo160294b() {
        return this.f115002a;
    }

    /* renamed from: a */
    public boolean mo160293a() {
        return this.f115003b;
    }

    /* renamed from: a */
    public void mo160292a(boolean z) {
        this.f115003b = z;
    }

    /* renamed from: a */
    public void mo160291a(List<ChatterDescription> list) {
        this.f115002a.addAll(list);
    }
}
