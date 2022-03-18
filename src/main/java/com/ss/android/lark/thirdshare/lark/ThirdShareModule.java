package com.ss.android.lark.thirdshare.lark;

import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.ShareRemoteConfig;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b;
import com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;

@ClaymoreImpl(AbstractC55759a.class)
public class ThirdShareModule implements AbstractC55759a {
    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a
    public void registerH5SharePlugin() {
    }

    public static AbstractC55760b getDependency() {
        return getModule().getDep();
    }

    public static AbstractC55759a getModule() {
        return (AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class);
    }

    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a
    public AbstractC55760b getDep() {
        return (AbstractC55760b) ApiUtils.getApi(AbstractC55760b.class);
    }

    public ThirdShareModule() {
        C55761a.m215988a();
        ((AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class)).init(new AbstractC55700b() {
            /* class com.ss.android.lark.thirdshare.lark.ThirdShareModule.C557581 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m215984a(Boolean bool) {
            }

            @Override // com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b
            /* renamed from: a */
            public AbstractC55700b.AbstractC55701a mo189814a() {
                return null;
            }

            @Override // com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b
            /* renamed from: b */
            public Map<String, ShareRemoteConfig> mo189816b() {
                return ThirdShareModule.this.getDep().getShareRemoteConfig();
            }

            @Override // com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b
            /* renamed from: a */
            public void mo189815a(Context context, ShareEntity shareEntity) {
                if (shareEntity.isTextShare()) {
                    C55680a.m215713a(shareEntity.getContent());
                } else if (shareEntity.isImageShare()) {
                    C55680a.m215711a(shareEntity.getImageFile(), $$Lambda$ThirdShareModule$1$pN8vCiQPh4z3Q7GeJ7jsiD0oBqs.INSTANCE);
                }
            }
        });
    }

    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a
    public void share(Context context, ShareEntity shareEntity) {
        ((AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class)).share(context, shareEntity);
    }
}
