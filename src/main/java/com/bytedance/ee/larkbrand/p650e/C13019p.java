package com.bytedance.ee.larkbrand.p650e;

import android.text.TextUtils;
import com.bytedance.ee.larkbrand.p659i.C13123a;
import com.bytedance.ee.larkbrand.p659i.C13125b;
import com.bytedance.ee.larkbrand.p659i.C13127c;
import com.bytedance.ee.larkbrand.p659i.C13129d;
import com.bytedance.ee.larkbrand.p659i.C13131e;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.RenderViewManager;
import com.tt.option.ext.AbstractC67626k;
import com.tt.option.ext.AbstractC67628l;
import com.tt.option.ext.C67618d;

/* renamed from: com.bytedance.ee.larkbrand.e.p */
public class C13019p extends C67618d {
    @Override // com.tt.option.ext.C67618d, com.tt.option.ext.AbstractC67626k
    public AbstractC67626k.AbstractC67627a createNativeView() {
        return new AbstractC67626k.AbstractC67627a() {
            /* class com.bytedance.ee.larkbrand.p650e.C13019p.C130201 */

            @Override // com.tt.option.ext.AbstractC67626k.AbstractC67627a
            /* renamed from: a */
            public AbstractC67628l mo49015a(String str, IBaseRender iBaseRender, String str2, int i) {
                if (TextUtils.equals(str, "insertCoverImage")) {
                    return new C13123a(iBaseRender, str2, i);
                }
                if (TextUtils.equals(str, "removeCoverImage")) {
                    return new C13129d(iBaseRender, str2, i);
                }
                if (TextUtils.equals(str, "insertMap")) {
                    return new C13125b(iBaseRender, str2, i);
                }
                if (TextUtils.equals(str, "updateMap")) {
                    return new C13131e((RenderViewManager.IRender) iBaseRender, str2, i);
                }
                if (TextUtils.equals(str, "operateMapContext")) {
                    return new C13127c((RenderViewManager.IRender) iBaseRender, str2, i);
                }
                return null;
            }
        };
    }
}
