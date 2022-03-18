package com.bytedance.ee.bear.mindnote.setting;

import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.mindnote.setting.C10182b;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

public class MindNoteSettingPlugin extends DocumentPlugin {
    private C10178b mShowThemeCard;
    public PersistenceSharedPreference mSp;
    public C10182b mViewModel;

    private void ensureSettingFragment() {
        C13479a.m54772d("MindNoteSettingPlugin", "ensureSettingFragment");
        C10179a aVar = (C10179a) instantiateFragment(C10179a.class);
        if (getFragmentManager().findFragmentByTag("MindNoteSettingFragment") == null) {
            getFragmentManager().beginTransaction().add(aVar, "MindNoteSettingFragment").commitAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.ee.bear.mindnote.setting.MindNoteSettingPlugin$a */
    public class C10177a implements AbstractC7945d<ViewData> {
        public C10177a() {
        }

        /* renamed from: a */
        public void handle(ViewData viewData, AbstractC7947h hVar) {
            if (viewData != null) {
                C13479a.m54772d("MindNoteSettingPlugin", "SetViewHandler..." + viewData.toString());
                MindNoteSettingPlugin.this.mSp.mo34037a("mindnote_view_type", viewData.getViewType());
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.mindnote.setting.MindNoteSettingPlugin$b */
    public class C10178b implements AbstractC7945d<MindNoteSettingData> {

        /* renamed from: b */
        private AbstractC7947h f27471b;

        public C10178b() {
        }

        /* renamed from: a */
        public void handle(MindNoteSettingData mindNoteSettingData, AbstractC7947h hVar) {
            if (mindNoteSettingData != null) {
                C13479a.m54772d("MindNoteSettingPlugin", "ShowThemeCard..." + mindNoteSettingData.toString());
                this.f27471b = hVar;
                MindNoteSettingPlugin.this.mViewModel.setData(mindNoteSettingData);
            }
        }

        /* renamed from: a */
        public void mo38912a(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", (Object) str);
            jSONObject.put(ShareHitPoint.f121869d, (Object) str2);
            C13479a.m54772d("MindNoteSettingPlugin", "onSelected..." + jSONObject.toString());
            this.f27471b.mo17188a(jSONObject);
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$1$MindNoteSettingPlugin(MindNoteSettingData mindNoteSettingData) {
        if (mindNoteSettingData != null) {
            ensureSettingFragment();
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.mShowThemeCard = new C10178b();
        this.mViewModel = (C10182b) viewModel(C10182b.class);
        this.mSp = new PersistenceSharedPreference("mindnote");
        this.mViewModel.setDelegate(new C10182b.AbstractC10183a() {
            /* class com.bytedance.ee.bear.mindnote.setting.$$Lambda$MindNoteSettingPlugin$pUREe9qLtjo2LhKLqWcmRWEvdo */

            @Override // com.bytedance.ee.bear.mindnote.setting.C10182b.AbstractC10183a
            public final void processOnClick(String str, String str2) {
                MindNoteSettingPlugin.this.lambda$onAttachToHost$0$MindNoteSettingPlugin(str, str2);
            }
        });
        this.mViewModel.getData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.mindnote.setting.$$Lambda$MindNoteSettingPlugin$jFlaIzg2f7hwQShMMhZY9LH8PzM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                MindNoteSettingPlugin.this.lambda$onAttachToHost$1$MindNoteSettingPlugin((MindNoteSettingData) obj);
            }
        });
        bindBridgeHandler("biz.mindnote.showThemeCard", this.mShowThemeCard);
        bindBridgeHandler("biz.mindnote.setView", new C10177a());
    }

    public /* synthetic */ void lambda$onAttachToHost$0$MindNoteSettingPlugin(String str, String str2) {
        this.mShowThemeCard.mo38912a(str, str2);
    }
}
