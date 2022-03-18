package com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.templatedata.C27761d;
import com.ss.android.appcenter.business.net.workplacehome.TagChild;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.AddAppItem;
import com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.C28044a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.AbstractC28248g;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.C28277b;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28270g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.b.a */
public class C28052a implements AbstractC28248g {

    /* renamed from: a */
    public AbstractC28246e f70177a;

    public C28052a(AbstractC28246e eVar) {
        this.f70177a = eVar;
    }

    @Override // com.ss.android.appcenter.engine.AbstractC28248g
    /* renamed from: a */
    public List<C28277b.AbstractC28278a> mo99885a(final NodeParams nodeParams) {
        C28184h.m103250d("CommonAndRecommendTrans", "transform>>>" + nodeParams);
        ArrayList arrayList = new ArrayList();
        final int i = C28040e.m102502i(nodeParams);
        final int k = C28040e.m102504k(nodeParams);
        final int j = C28040e.m102503j(nodeParams);
        final int l = C28040e.m102505l(nodeParams);
        final C28270g gVar = new C28270g(1);
        gVar.mo100745e(C28209p.m103291a(24.0f));
        final C28044a aVar = new C28044a(this.f70177a.mo100596b(), gVar, this.f70177a, nodeParams);
        arrayList.add(aVar);
        final C28270g gVar2 = new C28270g(4);
        gVar2.mo100742a(false);
        gVar2.mo100746f(C28209p.m103293a(this.f70177a.mo100596b(), 12.0f));
        gVar2.mo100745e(0);
        final C28055b bVar = new C28055b(this.f70177a.mo100596b(), gVar2, "my_common_and_recommend", this.f70177a);
        arrayList.add(bVar);
        final C28270g gVar3 = new C28270g(1);
        gVar3.mo100745e(C28209p.m103291a(24.0f));
        final C28044a aVar2 = new C28044a(this.f70177a.mo100596b(), gVar3, this.f70177a, nodeParams);
        arrayList.add(aVar2);
        final C28270g gVar4 = new C28270g(1);
        gVar4.mo100756a(i, j, k, l);
        final C28080a aVar3 = new C28080a(this.f70177a.mo100596b(), gVar4, new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.C28052a.View$OnClickListenerC280531 */

            public void onClick(View view) {
                C28052a.this.f70177a.mo100598d().mo99987a(nodeParams.getKey());
            }
        });
        aVar3.mo99966b(C28209p.m103291a(12.0f));
        arrayList.add(aVar3);
        this.f70177a.mo100598d().mo99988a(nodeParams.getKey(), this.f70177a.mo100601g(), new AbstractC1178x<C28237a>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.C28052a.C280542 */

            /* renamed from: a */
            public void onChanged(C28237a aVar) {
                C28184h.m103250d("CommonAndRecommendTrans", "onChanged>>> " + aVar);
                if (aVar.mo100615b()) {
                    C27761d dVar = (C27761d) aVar.mo100619f();
                    if (dVar != null) {
                        if (dVar.f69356b == null || dVar.f69355a == null) {
                            C27700a.m101238b("CommonAndRecommend#onChanged#error");
                            return;
                        }
                        m102537a(dVar.f69355a, dVar.f69356b);
                    }
                    C28052a.this.mo99893a(i, j, k, l, aVar, gVar, gVar2, aVar2, gVar3);
                    gVar4.mo100756a(0, 0, 0, 0);
                }
                aVar3.mo99884a(aVar);
            }

            /* renamed from: a */
            private void m102537a(List<TagChild> list, Map<String, ItemInfo> map) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                boolean z = false;
                boolean z2 = false;
                for (int i = 0; i < list.size(); i++) {
                    TagChild tagChild = list.get(i);
                    String itemId = tagChild.getItemId();
                    ItemInfo itemInfo = map.get(itemId);
                    if (itemInfo == null) {
                        C28184h.m103250d("CommonAndRecommendTrans", "handleTagChildren>>> itemInfo == null, child:" + tagChild);
                    } else {
                        if (tagChild.isBlock()) {
                            itemInfo.setBlock(true);
                        }
                        if (TextUtils.equals("recommend", tagChild.getSubType()) || TextUtils.equals("platform_widget", tagChild.getSubType())) {
                            hashSet.add(itemId);
                        } else if (TextUtils.equals("common", tagChild.getSubType())) {
                            hashSet2.add(itemId);
                        }
                        if (TextUtils.equals("recommend", tagChild.getSubType())) {
                            itemInfo.bizAppScene = "recommend";
                        } else if (TextUtils.equals("common", tagChild.getSubType())) {
                            itemInfo.bizAppScene = "common";
                        } else {
                            itemInfo.bizAppScene = "other";
                        }
                        if (!z) {
                            if (!TextUtils.equals(tagChild.getType(), "block") || !TextUtils.equals(tagChild.getSubType(), "platform_widget")) {
                                z = true;
                            } else {
                                arrayList.add(itemInfo);
                            }
                        }
                        if (!z2) {
                            if (TextUtils.equals(tagChild.getType(), "icon")) {
                                arrayList2.add(itemInfo);
                            } else {
                                z2 = true;
                            }
                        }
                        if (TextUtils.equals(tagChild.getType(), "block")) {
                            arrayList3.add(itemInfo);
                        }
                    }
                }
                aVar.mo99883a(arrayList);
                aVar.f70153b = hashSet;
                arrayList2.add(new AddAppItem());
                bVar.mo99896a(arrayList2);
                bVar.f70194b = hashSet;
                bVar.f70195c = hashSet2;
                aVar2.mo99883a(arrayList3);
                aVar2.f70153b = hashSet;
                aVar2.f70154c = hashSet2;
            }
        }, new C28237a());
        return arrayList;
    }

    /* renamed from: a */
    public void mo99893a(int i, int i2, int i3, int i4, C28044a aVar, C28270g gVar, C28270g gVar2, C28044a aVar2, C28270g gVar3) {
        boolean z;
        boolean z2 = true;
        if (aVar.getItemCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (aVar2.getItemCount() <= 0) {
            z2 = false;
        }
        int a = C28209p.m103291a(24.0f);
        int a2 = C28209p.m103291a(24.0f);
        if (z) {
            gVar.mo100756a(i, i2, i3, a);
            if (z2) {
                gVar2.mo100756a(i3, 0, i3, 0);
                gVar3.mo100756a(i3, C28209p.m103291a(24.0f), i3, i4);
                return;
            }
            gVar2.mo100756a(i3, 0, i3, i4);
        } else if (z2) {
            gVar2.mo100756a(i3, i2, i3, 0);
            gVar3.mo100756a(i3, a2, i3, i4);
        } else {
            gVar2.mo100756a(i3, i2, i3, i4);
        }
    }
}
