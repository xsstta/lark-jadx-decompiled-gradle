package com.bytedance.ee.bear.document.profile;

import android.text.TextUtils;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class ShowProfilePlugin extends DocumentPluginV2 {

    /* renamed from: com.bytedance.ee.bear.document.profile.ShowProfilePlugin$a */
    private class C6071a implements AbstractC7945d<ProfileModel> {
        private C6071a() {
        }

        /* renamed from: a */
        public void handle(ProfileModel profileModel, AbstractC7947h hVar) {
            C13479a.m54772d("ShowProfilePlugin", "handle()... data = " + profileModel);
            if (profileModel != null && !TextUtils.isEmpty(profileModel.getUserId())) {
                ShowProfilePlugin.this.showProfile(profileModel.getUserId());
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showProfile", new C6071a());
    }

    public void showProfile(String str) {
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, getEditorAbility().mo24602q().getDocName().mo5927b());
    }
}
