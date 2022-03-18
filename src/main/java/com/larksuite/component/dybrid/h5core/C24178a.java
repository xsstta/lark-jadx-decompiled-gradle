package com.larksuite.component.dybrid.h5core;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a;
import com.larksuite.component.dybrid.h5core.AbstractC24186b;
import com.larksuite.component.dybrid.offlineresource.AbstractC24257e;
import com.larksuite.component.dybrid.offlineresource.C24254c;
import com.larksuite.component.dybrid.offlineresource.C24256d;
import com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24251a;
import com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24252b;
import com.larksuite.component.dybrid.router.C24258a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;

/* renamed from: com.larksuite.component.dybrid.h5core.a */
public class C24178a {

    /* renamed from: a */
    public static volatile AbstractC24186b.AbstractC24188b f59777a;

    /* renamed from: b */
    public static volatile AbstractC24186b.AbstractC24187a f59778b;

    /* renamed from: c */
    public C24256d mo86773c() {
        return C24256d.m88585a();
    }

    /* renamed from: d */
    public C24258a mo86774d() {
        return C24258a.m88594a();
    }

    /* renamed from: b */
    public AbstractC24152a mo86772b() {
        AbstractC24152a aVar = (AbstractC24152a) ApiUtils.getApi(AbstractC24152a.class);
        if (aVar == null) {
            Log.m165383e("com.larksuite.component.dybrid.h5core.DybridModule", "addPluginConfig -> h5Service is null");
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo86771a() {
        if (f59778b != null) {
            AbstractC24152a aVar = (AbstractC24152a) ApiUtils.getApi(AbstractC24152a.class);
            aVar.init(f59778b.mo86784a(), new AbstractC24166i() {
                /* class com.larksuite.component.dybrid.h5core.C24178a.C241791 */

                @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24166i
                /* renamed from: a */
                public boolean mo86745a() {
                    return C24178a.f59778b.mo86789b();
                }

                @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24166i
                /* renamed from: a */
                public boolean mo86746a(String str) {
                    return C24178a.f59778b.mo86787a(str);
                }
            });
            aVar.setOpenBrowserListener(new AbstractC24153a() {
                /* class com.larksuite.component.dybrid.h5core.C24178a.C241802 */

                @Override // com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a
                /* renamed from: a */
                public void mo86697a(Context context, Bundle bundle) {
                    C24178a.f59778b.mo86786a(context, bundle);
                }

                @Override // com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a
                /* renamed from: b */
                public Fragment mo86698b(Context context, Bundle bundle) {
                    return C24178a.f59778b.mo86788b(context, bundle);
                }
            });
            f59778b.mo86785a(f59778b.mo86784a());
        }
        if (f59777a != null) {
            C24256d.m88585a().mo86886a(new AbstractC24257e() {
                /* class com.larksuite.component.dybrid.h5core.C24178a.C241813 */

                @Override // com.larksuite.component.dybrid.offlineresource.AbstractC24257e
                /* renamed from: a */
                public boolean mo86775a() {
                    return C24178a.f59777a.mo86793a();
                }
            });
            C24254c.m88579a().mo86881a(new AbstractC24251a() {
                /* class com.larksuite.component.dybrid.h5core.C24178a.C241824 */

                @Override // com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24251a
                /* renamed from: a */
                public boolean mo86779a(String str) {
                    if (C24178a.f59777a != null) {
                        return C24178a.f59777a.mo86794a(str);
                    }
                    return false;
                }

                @Override // com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24251a
                /* renamed from: a */
                public String mo86776a(String str, String str2) {
                    if (C24178a.f59777a != null) {
                        return C24178a.f59777a.mo86790a(str, str2);
                    }
                    return null;
                }

                @Override // com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24251a
                /* renamed from: a */
                public void mo86777a(String str, List<String> list) {
                    if (C24178a.f59777a != null) {
                        C24178a.f59777a.mo86791a(str, list);
                    }
                }

                @Override // com.larksuite.component.dybrid.offlineresource.p1083a.AbstractC24251a
                /* renamed from: a */
                public void mo86778a(String str, List<String> list, AbstractC24252b bVar) {
                    if (C24178a.f59777a != null) {
                        C24178a.f59777a.mo86792a(str, list, bVar);
                    }
                }
            });
        }
    }

    public C24178a(AbstractC24186b.AbstractC24188b bVar, AbstractC24186b.AbstractC24187a aVar) {
        f59777a = bVar;
        f59778b = aVar;
    }
}
