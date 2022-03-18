package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.insertblock.InsertNewBlock;
import com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7640d;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import java.util.Iterator;
import java.util.List;

public abstract class AbsInsertNewBlockPlugin<T extends C4943e> extends BasePlugin<T> {
    private AbsInsertNewBlockPlugin<T>.C7627a jsHandler;
    private AbstractC1178x<InsertNewBlock> observer;
    public C7640d viewModel;

    public abstract void bindBridgeHandler(String str, AbstractC7945d<InsertNewBlock> dVar);

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.AbsInsertNewBlockPlugin$a */
    public class C7627a implements AbstractC7945d<InsertNewBlock> {

        /* renamed from: a */
        AbstractC7947h f20693a;

        public C7627a() {
        }

        /* renamed from: a */
        public void handle(InsertNewBlock insertNewBlock, AbstractC7947h hVar) {
            C13479a.m54764b("AbsInsertNewBlockPlugin", "InsertNewBlockHandler " + insertNewBlock);
            this.f20693a = hVar;
            AbsInsertNewBlockPlugin.this.viewModel.updateInsertNewBlock(insertNewBlock);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29992a(String str, String str2) {
            if (this.f20693a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) str);
                jSONObject.put("value", (Object) str2);
                this.f20693a.mo17188a(jSONObject);
                return;
            }
            C13479a.m54758a("AbsInsertNewBlockPlugin", "insertImages(): failed cause selectImgCallback is null ");
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(T t) {
        super.onAttachToHost(t);
        this.viewModel = (C7640d) C4950k.m20478a(t, C7640d.class);
    }

    private void showInsertNewBlockFragment(AbstractC4958n nVar) {
        ((InsertNewBlockFragment) instantiateFragment(InsertNewBlockFragment.class, new Bundle())).mo5511a(nVar.mo19602g(), InsertNewBlockFragment.class.getName());
    }

    /* access modifiers changed from: private */
    public void processOnItemClick(String str, String str2) {
        AbsInsertNewBlockPlugin<T>.C7627a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = this.jsHandler) != null) {
            aVar.mo29992a(str, str2);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(T t, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(t, nVar);
        this.viewModel.setDelegate(null);
        this.viewModel.clearInsertNewBlockData();
        if (this.observer != null) {
            this.viewModel.getInsertNewBlockLiveData().mo5928b(this.observer);
            this.observer = null;
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(T t, AbstractC4958n nVar) {
        super.onAttachToUIContainer(t, nVar);
        AbsInsertNewBlockPlugin<T>.C7627a aVar = new C7627a();
        this.jsHandler = aVar;
        bindBridgeHandler("biz.navigation.setInsertNewBlockPanel", aVar);
        this.viewModel.setDelegate(new C7640d.AbstractC7641a() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.insertblock.$$Lambda$AbsInsertNewBlockPlugin$alNp0zzAp3gW6PUQAaKJCdZNtg */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7640d.AbstractC7641a
            public final void onItemClick(String str, String str2) {
                AbsInsertNewBlockPlugin.this.processOnItemClick(str, str2);
            }
        });
        if (this.observer == null) {
            LiveData<InsertNewBlock> insertNewBlockLiveData = this.viewModel.getInsertNewBlockLiveData();
            LifecycleOwner h = t.mo19566h();
            $$Lambda$AbsInsertNewBlockPlugin$PvwZqnS8QikEqV4gmgWHnMYt2WM r1 = new AbstractC1178x(nVar) {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.insertblock.$$Lambda$AbsInsertNewBlockPlugin$PvwZqnS8QikEqV4gmgWHnMYt2WM */
                public final /* synthetic */ AbstractC4958n f$1;

                {
                    this.f$1 = r2;
                }

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbsInsertNewBlockPlugin.this.lambda$onAttachToUIContainer$0$AbsInsertNewBlockPlugin(this.f$1, (InsertNewBlock) obj);
                }
            };
            this.observer = r1;
            insertNewBlockLiveData.mo5923a(h, r1);
        }
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$AbsInsertNewBlockPlugin(AbstractC4958n nVar, InsertNewBlock insertNewBlock) {
        boolean z;
        C13479a.m54764b("AbsInsertNewBlockPlugin", "getInsertNewBlockLiveData >" + insertNewBlock);
        boolean z2 = true;
        boolean z3 = false;
        if (insertNewBlock == null) {
            z = true;
        } else {
            z = false;
        }
        List<Fragment> fragments = nVar.mo19602g().getFragments();
        if (fragments != null) {
            Iterator<Fragment> it = fragments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = z3;
                    break;
                }
                Fragment next = it.next();
                if (next instanceof InsertNewBlockFragment) {
                    if (z) {
                        ((InsertNewBlockFragment) next).mo5513b();
                        break;
                    }
                    z3 = true;
                }
            }
            if (!z2 && insertNewBlock != null) {
                showInsertNewBlockFragment(nVar);
            }
        }
    }
}
