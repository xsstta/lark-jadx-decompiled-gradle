package com.larksuite.component.blockit;

import android.view.ViewGroup;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;

/* renamed from: com.larksuite.component.blockit.a */
public class C24046a {
    /* renamed from: a */
    private static void m87860a() {
        C24062d.m87896a().mo86323b();
    }

    /* renamed from: a */
    public static void m87861a(ViewGroup viewGroup, BlockEntity blockEntity, OPContainerBundle oPContainerBundle, AbstractC24073e eVar) {
        m87860a();
        C24062d.m87896a().mo86318a(viewGroup, blockEntity, oPContainerBundle, eVar);
    }

    /* renamed from: a */
    public static void m87862a(ViewGroup viewGroup, String str, String str2, OPContainerBundle oPContainerBundle, AbstractC24073e eVar) {
        m87860a();
        BlockEntity blockEntity = new BlockEntity(str2);
        blockEntity.setAppID(str);
        C24062d.m87896a().mo86318a(viewGroup, blockEntity, oPContainerBundle, eVar);
    }
}
