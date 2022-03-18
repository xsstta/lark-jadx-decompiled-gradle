package com.ss.android.lark.setting.page.content.internal.mvp;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.c */
public class C54546c extends BaseModel implements AbstractC54538a.AbstractC54539a {

    /* renamed from: a */
    public AbstractC54538a.AbstractC54539a.AbstractC54540a f134842a;

    /* renamed from: b */
    public ISettingDependency.IAppConfigDependency f134843b = C54115c.m210080a().mo178305q();

    /* renamed from: c */
    public boolean f134844c = false;

    /* renamed from: d */
    private ISettingDependency.IFeatureGatingDependency f134845d = C54115c.m210080a().mo178291e();

    @Override // com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a.AbstractC54539a
    /* renamed from: a */
    public void mo186376a() {
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<GetSettingsResponse>() {
            /* class com.ss.android.lark.setting.page.content.internal.mvp.C54546c.C545471 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (C54546c.this.f134842a != null) {
                    C54546c.this.f134842a.mo186378a(false);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetSettingsResponse getSettingsResponse) {
                if (C54546c.this.f134844c) {
                    C54546c.this.f134843b.mo178318a(true, new UIGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.setting.page.content.internal.mvp.C54546c.C545471.C545481 */

                        /* renamed from: a */
                        public void onSuccessed(Boolean bool) {
                            if (C54546c.this.f134842a != null) {
                                C54546c.this.f134842a.mo186378a(true);
                            }
                        }

                        @Override // com.larksuite.framework.callback.UIGetDataCallback
                        public void onErrored(ErrorResult errorResult) {
                            if (C54546c.this.f134842a != null) {
                                C54546c.this.f134842a.mo186378a(false);
                            }
                        }
                    });
                } else if (C54546c.this.f134842a != null) {
                    C54546c.this.f134842a.mo186378a(true);
                }
            }
        });
        this.f134844c = this.f134845d.mo178337a("lark.leanmode.switch");
        GetSettingsRequest.C19155a aVar = new GetSettingsRequest.C19155a();
        ArrayList arrayList = new ArrayList();
        arrayList.add("lark_fetures");
        aVar.mo65459a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.GET_SETTINGS, aVar, wrapAndAddGetDataCallback, $$Lambda$c$HRoLZ27hDZErqVv5Oz13AHPa7fg.INSTANCE);
    }

    @Override // com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a.AbstractC54539a
    /* renamed from: a */
    public void mo186377a(AbstractC54538a.AbstractC54539a.AbstractC54540a aVar) {
        this.f134842a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ GetSettingsResponse m211605a(byte[] bArr) throws IOException {
        return GetSettingsResponse.ADAPTER.decode(bArr);
    }
}
