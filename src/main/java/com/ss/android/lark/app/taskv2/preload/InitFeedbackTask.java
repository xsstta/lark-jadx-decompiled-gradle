package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.bytedance.feedbackerlib.Feedbacker;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;

/* access modifiers changed from: package-private */
public class InitFeedbackTask extends AsyncLaunchTask {

    /* renamed from: a */
    public Context f72781a;

    /* renamed from: b */
    public String f72782b;

    /* renamed from: c */
    private Feedbacker.IFeedbackCommonInfo f72783c;

    /* renamed from: g */
    private Feedbacker.AbstractC13885a f72784g;

    InitFeedbackTask() {
    }

    /* renamed from: j */
    private void m106801j() {
        this.f72783c = new Feedbacker.IFeedbackCommonInfo() {
            /* class com.ss.android.lark.app.taskv2.preload.InitFeedbackTask.C290442 */

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getALogFilesDir() {
                return null;
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public int getAid() {
                return 0;
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getAppId() {
                return "";
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getCode() {
                return InitFeedbackTask.this.f72782b;
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public Feedbacker.AbstractC13886b getOnFeedbackClickListener() {
                return new Feedbacker.AbstractC13886b() {
                    /* class com.ss.android.lark.app.taskv2.preload.InitFeedbackTask.C290442.C290451 */
                };
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public Feedbacker.AbstractC13887c getOnMediasUploadFailedListener() {
                return new Feedbacker.AbstractC13887c() {
                    /* class com.ss.android.lark.app.taskv2.preload.InitFeedbackTask.C290442.C290462 */
                };
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getChannel() {
                return PackageChannelManager.getBuildPackageChannel(LarkContext.getApplication());
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getDid() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getUpdateVersionCode() {
                return String.valueOf(C26246a.m94979c(InitFeedbackTask.this.f72781a));
            }

            @Override // com.bytedance.feedbackerlib.Feedbacker.IFeedbackCommonInfo
            public String getUserId() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }
        };
    }

    /* renamed from: k */
    private void m106802k() {
        this.f72784g = new Feedbacker.AbstractC13885a() {
            /* class com.ss.android.lark.app.taskv2.preload.InitFeedbackTask.C290473 */
        };
    }

    /* renamed from: i */
    private void m106800i() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.app.taskv2.preload.InitFeedbackTask.RunnableC290421 */

            public void run() {
                ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).userSdkOAuth("", InitFeedbackTask.this.f72781a.getPackageName(), "", String.format("%s://oauth", ""), "", new UIGetDataCallback(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.app.taskv2.preload.InitFeedbackTask.RunnableC290421.C290431 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        Log.m165389i("InitFeedbackTask", "userSdkOAuth onSuccess called.");
                        InitFeedbackTask.this.f72782b = str;
                        InitFeedbackTask.this.mo103079h();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("InitFeedbackTask", "userSdkOAuth onError called. err:" + errorResult);
                        InitFeedbackTask.this.mo103078g();
                    }
                }));
            }
        });
    }

    /* renamed from: g */
    public void mo103078g() {
        Feedbacker.AbstractC13885a aVar = this.f72784g;
        if (aVar != null) {
            Feedbacker.unregisterLarkSSOCallback(aVar);
        }
        Feedbacker.hideFeedbackFloatWindow();
        Feedbacker.clearSSOCache();
        this.f72782b = "";
    }

    /* renamed from: h */
    public void mo103079h() {
        Feedbacker.init(LarkContext.getApplication(), false);
        if (this.f72784g == null) {
            m106802k();
        }
        Feedbacker.registerLarkSSOCallback(this.f72784g);
        if (this.f72783c == null) {
            m106801j();
        }
        Feedbacker.setIFeedbackCommonInfo(this.f72783c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m106799a(C49382d dVar) {
        Log.m165389i("InitFeedbackTask", "onAccountChange called.");
        m106800i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m106798a(int i) {
        Log.m165389i("InitFeedbackTask", "onLoginStatusChanged called. loginType:" + i);
        if (i != 0) {
            m106800i();
        } else {
            mo103078g();
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        this.f72781a = context;
        super.mo43817a(context);
        Log.m165389i("InitFeedbackTask", "execute called.");
        if (!C26252ad.m94993b(this.f72781a)) {
            Log.m165389i("InitFeedbackTask", "current process isn't main process, so stop init feedback task.");
            return;
        }
        C28513a.m104512a(new C28513a.AbstractC28514a() {
            /* class com.ss.android.lark.app.taskv2.preload.$$Lambda$InitFeedbackTask$yESqICIOjrxLzo2FzahJ_K7TwB4 */

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
            public final void onLoginStatusChanged(int i) {
                InitFeedbackTask.lambda$yESqICIOjrxLzo2FzahJ_K7TwB4(InitFeedbackTask.this, i);
            }
        });
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(new AbstractC49379a() {
            /* class com.ss.android.lark.app.taskv2.preload.$$Lambda$InitFeedbackTask$qqy7zniH6v93EjJ4CrUpHWU4aA */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102549a(C49380b bVar) {
                AbstractC49379a.CC.$default$a(this, bVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102550a(C49381c cVar) {
                AbstractC49379a.CC.$default$a(this, cVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public final void onUserSwitchSuccess(C49382d dVar) {
                InitFeedbackTask.m270264lambda$qqy7zniH6v93EjJ4CrUpHWU4aA(InitFeedbackTask.this, dVar);
            }
        });
        m106800i();
    }
}
