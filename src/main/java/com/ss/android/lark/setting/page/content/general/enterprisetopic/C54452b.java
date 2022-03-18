package com.ss.android.lark.setting.page.content.general.enterprisetopic;

import android.util.Log;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.ai.FeatureSetting;
import com.ss.android.lark.pb.ai.FeatureType;
import com.ss.android.lark.pb.ai.PushUserASSetting;
import com.ss.android.lark.pb.ai.SceneSetting;
import com.ss.android.lark.pb.ai.UserASSetting;
import com.ss.android.lark.setting.service.usersetting.p2674b.AbstractC54661b;

/* renamed from: com.ss.android.lark.setting.page.content.general.enterprisetopic.b */
public class C54452b extends AbstractC1142af {
    public C1177w<FeatureSetting> featureSetting = new C1177w<>();
    private final AbstractC1178x<PushUserASSetting> mPushHandler = new AbstractC1178x() {
        /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.$$Lambda$b$w3Kr0IFhMLy8brIgvjmV4JTkGSg */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            C54452b.this.onPushReceived((PushUserASSetting) obj);
        }
    };
    private final AbstractC54661b mService;

    public void unInit() {
        this.mService.mo186716d(this.mPushHandler);
    }

    public void init() {
        getEntityWordSetting(false);
        this.mService.mo186714c(this.mPushHandler);
        getEntityWordSetting(true);
    }

    public void getEntityWordSetting(boolean z) {
        this.mService.mo186713b(z, new IGetDataCallback<UserASSetting>() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.C54452b.C544542 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.e("EntityWordViewModel", "getEntityWordSetting error", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(UserASSetting userASSetting) {
                Log.i("EntityWordViewModel", "getEntityWordSetting succeed");
                C54452b.this.featureSetting.mo5926a(userASSetting.mnautilus_setting);
            }
        });
    }

    public C54452b(AbstractC54661b bVar) {
        this.mService = bVar;
    }

    /* access modifiers changed from: private */
    public void onPushReceived(PushUserASSetting pushUserASSetting) {
        Log.d("EntityWordViewModel", "on push received");
        FeatureType featureType = pushUserASSetting.mfeature_type;
        if ((featureType == FeatureType.DEFAULT || featureType == FeatureType.NAUTILUS) && pushUserASSetting.msetting.mnautilus_setting != null) {
            this.featureSetting.mo5926a(pushUserASSetting.msetting.mnautilus_setting);
        }
    }

    private void prepareSetting(FeatureSetting.C49459a aVar, boolean z) {
        if (EntityWordScope.isMsgFgEnable()) {
            aVar.mo172574a(new SceneSetting(Boolean.valueOf(z)));
        }
        if (EntityWordScope.isDocFgEnable()) {
            aVar.mo172578c(new SceneSetting(Boolean.valueOf(z)));
        }
        if (EntityWordScope.isMailFgEnable()) {
            aVar.mo172577b(new SceneSetting(Boolean.valueOf(z)));
        }
    }

    public void setEntityWordSetting(int i, boolean z) {
        FeatureSetting.C49459a aVar = new FeatureSetting.C49459a();
        if (i == 1) {
            prepareSetting(aVar, z);
        } else if (i == 2) {
            aVar.mo172574a(new SceneSetting(Boolean.valueOf(z)));
        } else if (i == 3) {
            aVar.mo172578c(new SceneSetting(Boolean.valueOf(z)));
        } else if (i == 4) {
            aVar.mo172577b(new SceneSetting(Boolean.valueOf(z)));
        } else {
            return;
        }
        this.mService.mo186707a(FeatureType.NAUTILUS, new UserASSetting(aVar.build()), new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.C54452b.C544531 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.e("EntityWordViewModel", "setEntityWordSetting error", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Void r2) {
                C54452b.this.getEntityWordSetting(true);
                Log.i("EntityWordViewModel", "setEntityWordSetting success");
            }
        });
    }
}
