package com.bytedance.ee.webapp.v2;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/webapp/v2/ContainerDelegateDataHelper;", "", "delegateDataCallBack", "Lcom/bytedance/ee/webapp/v2/IDelegateDataCallBack;", "(Lcom/bytedance/ee/webapp/v2/IDelegateDataCallBack;)V", "TAG", "", "delegateDataMap", "Ljava/util/LinkedHashMap;", "Lcom/bytedance/ee/webapp/v2/ContainerDelegateData;", "Lkotlin/collections/LinkedHashMap;", "clear", "", "getWebAppContextList", "Ljava/util/ArrayList;", "Lcom/tt/miniapphost/appcontainer/impl/WebAppContext;", "Lkotlin/collections/ArrayList;", "onPageStarted", "url", "webAppContext", "tryCreateWebAppContext", "updateDelegateData", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.v2.b */
public final class ContainerDelegateDataHelper {

    /* renamed from: a */
    private final String f36171a = "ContainerDelegateDataHelper";

    /* renamed from: b */
    private final LinkedHashMap<String, ContainerDelegateData> f36172b = new LinkedHashMap<>();

    /* renamed from: c */
    private final IDelegateDataCallBack f36173c;

    /* renamed from: a */
    public final void mo51051a() {
        this.f36172b.clear();
    }

    /* renamed from: b */
    public final ArrayList<C67462h> mo51053b() {
        ArrayList<C67462h> arrayList = new ArrayList<>();
        for (Map.Entry<String, ContainerDelegateData> entry : this.f36172b.entrySet()) {
            arrayList.add(entry.getValue().mo51050b());
        }
        return arrayList;
    }

    public ContainerDelegateDataHelper(IDelegateDataCallBack cVar) {
        this.f36173c = cVar;
    }

    /* renamed from: a */
    private final void m56092a(String str) {
        C67462h hVar;
        ContainerDelegateData aVar = new ContainerDelegateData();
        IDelegateDataCallBack cVar = this.f36173c;
        if (cVar != null) {
            boolean z = true;
            if (this.f36172b.size() < 1) {
                z = false;
            }
            hVar = cVar.mo51023a(str, z);
        } else {
            hVar = null;
        }
        aVar.mo51048a(hVar);
        aVar.mo51049a(str);
        this.f36172b.put(str, aVar);
        IDelegateDataCallBack cVar2 = this.f36173c;
        if (cVar2 != null) {
            cVar2.mo51024a(aVar);
        }
        C13479a.m54764b(this.f36171a, "onNewPageOpened called");
    }

    /* renamed from: a */
    public final void mo51052a(String str, C67462h hVar) {
        IDelegateDataCallBack cVar;
        Intrinsics.checkParameterIsNotNull(str, "url");
        C13479a.m54764b(this.f36171a, "onPageStarted is run!!");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b(this.f36171a, "url is empty!!");
        } else if (this.f36172b.isEmpty()) {
            C13479a.m54764b(this.f36171a, "add first");
            LinkedHashMap<String, ContainerDelegateData> linkedHashMap = this.f36172b;
            ContainerDelegateData aVar = new ContainerDelegateData();
            aVar.mo51049a(str);
            aVar.mo51048a(hVar);
            linkedHashMap.put(str, aVar);
        } else if (!this.f36172b.containsKey(str)) {
            m56092a(str);
        } else {
            ContainerDelegateData aVar2 = this.f36172b.get(str);
            if (aVar2 != null && (cVar = this.f36173c) != null) {
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "it");
                cVar.mo51024a(aVar2);
            }
        }
    }

    /* renamed from: b */
    public final void mo51054b(String str, C67462h hVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a(this.f36171a, "updateDelegateData url is empty!!");
            return;
        }
        ContainerDelegateData aVar = this.f36172b.get(str);
        if (aVar != null) {
            aVar.mo51048a(hVar);
        }
    }
}
