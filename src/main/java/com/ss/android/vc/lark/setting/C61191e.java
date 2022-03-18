package com.ss.android.vc.lark.setting;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.lark.setting.AbstractC61183a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;

/* renamed from: com.ss.android.vc.lark.setting.e */
public class C61191e extends BaseModel implements AbstractC61183a.AbstractC61184a {

    /* renamed from: a */
    public AbstractC61183a.AbstractC61184a.AbstractC61185a f153254a;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: a */
    public void mo211584a(AbstractC61183a.AbstractC61184a.AbstractC61185a aVar) {
        this.f153254a = aVar;
    }

    /* renamed from: a */
    public void mo211583a(final IGetDataCallback<C61188b> iGetDataCallback) {
        VcBizService.getVideoChatUserSetting(new AbstractC63598b() {
            /* class com.ss.android.vc.lark.setting.C61191e.C611921 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[loadUserSetting2]", "error " + eVar.toString());
                C61191e.this.mo211585a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatSettingModel", "[loadUserSetting]", "success " + obj.toString());
                if (obj instanceof C61188b) {
                    iGetDataCallback.onSuccess((C61188b) obj);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo211587b(final IGetDataCallback<C60987v> iGetDataCallback) {
        VcBizSender.m249303n((String) null).mo219889a(new AbstractC63598b<C60987v>() {
            /* class com.ss.android.vc.lark.setting.C61191e.C611932 */

            /* renamed from: a */
            public void onSuccess(C60987v vVar) {
                C60700b.m235851b("VideoChatSettingModel", "[loadSuiteQuota]", "success ");
                iGetDataCallback.onSuccess(vVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[loadSuiteQuota2]", "error " + eVar.toString());
                C61191e.this.mo211585a(eVar);
            }
        });
    }

    /* renamed from: a */
    public void mo211585a(C63602e eVar) {
        if (eVar.f160600c) {
            return;
        }
        if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
            C60738ac.m236037c((int) R.string.View_G_ConnectionError);
        }
    }

    /* renamed from: c */
    public void mo211589c(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        VcBizService.modifyVideoChatUserSetting(3, z, new AbstractC63598b() {
            /* class com.ss.android.vc.lark.setting.C61191e.C611965 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[modifySubtitle2]", "error " + eVar.toString());
                C61191e.this.mo211585a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatSettingModel", "[modifySubtitle]", "success " + obj.toString());
                if (obj instanceof C61188b) {
                    C61191e.this.f153254a.mo211570a((C61188b) obj);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo211590d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        VcBizService.modifyVideoChatUserSetting(5, z, new AbstractC63598b() {
            /* class com.ss.android.vc.lark.setting.C61191e.C611976 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[modifySubtitle]", "error " + eVar.toString());
                C61191e.this.mo211585a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatSettingModel", "[modifyLanguageInterpretation]", "success " + obj.toString());
                if (obj instanceof C61188b) {
                    C61191e.this.f153254a.mo211570a((C61188b) obj);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo211588b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        VcBizService.modifyVideoChatUserSetting(2, z, new AbstractC63598b() {
            /* class com.ss.android.vc.lark.setting.C61191e.C611954 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[modifyPlayChimes2]", "error " + eVar.toString());
                C61191e.this.mo211585a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatSettingModel", "[modifyPlayChimes]", "success " + obj.toString());
                if (obj instanceof C61188b) {
                    C61191e.this.f153254a.mo211570a((C61188b) obj);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo211586a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        VcBizService.modifyVideoChatUserSetting(1, z, new AbstractC63598b() {
            /* class com.ss.android.vc.lark.setting.C61191e.C611943 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[modifyNotification2]", "error " + eVar.toString());
                C61191e.this.mo211585a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("VideoChatSettingModel", "[modifyNotification]", "success " + obj.toString());
                if (obj != null && (obj instanceof C61188b)) {
                    C61191e.this.f153254a.mo211570a((C61188b) obj);
                }
            }
        });
    }
}
