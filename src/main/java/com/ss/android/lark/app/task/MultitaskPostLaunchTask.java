package com.ss.android.lark.app.task;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.floating.PermissionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.C48282c;
import com.ss.android.lark.multitask.C48338l;
import com.ss.android.lark.multitask.MultitaskFG;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

public class MultitaskPostLaunchTask extends AsyncLaunchTask {

    /* renamed from: a */
    public final AbstractC49379a f72638a = new AbstractC49379a() {
        /* class com.ss.android.lark.app.task.MultitaskPostLaunchTask.C289741 */

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102549a(C49380b bVar) {
            Log.m165389i("MULTITASK-MultitaskPostLaunchTask", "onBeginChange");
            MultitaskPostLaunchTask.this.mo102753h();
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102550a(C49381c cVar) {
            Log.m165389i("MULTITASK-MultitaskPostLaunchTask", "onEndChange");
            MultitaskPostLaunchTask.this.mo102752g();
            MultitaskPostLaunchTask.this.mo102754i();
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public void onUserSwitchSuccess(C49382d dVar) {
            Log.m165389i("MULTITASK-MultitaskPostLaunchTask", "onEndChange");
            MultitaskPostLaunchTask.this.mo102752g();
            MultitaskPostLaunchTask.this.mo102754i();
        }
    };

    /* renamed from: g */
    public void mo102752g() {
        m106295a(new Runnable() {
            /* class com.ss.android.lark.app.task.MultitaskPostLaunchTask.RunnableC289763 */

            public void run() {
                Application application = LarkContext.getApplication();
                if (application != null) {
                    C48338l.m190660a(application);
                    C48282c.m190475a().mo169064b(application);
                }
            }
        });
    }

    /* renamed from: h */
    public void mo102753h() {
        if (MultitaskFG.f121595b.mo168905b()) {
            m106295a(new Runnable() {
                /* class com.ss.android.lark.app.task.MultitaskPostLaunchTask.RunnableC289774 */

                public void run() {
                    if (MultitaskFG.f121595b.mo168904a()) {
                        GlobalTaskContainerImpl.m190807f();
                    }
                    GlobalTaskContainerImpl.m190808g();
                }
            });
        }
    }

    /* renamed from: i */
    public void mo102754i() {
        if (PermissionUtils.m150948a(LarkContext.getApplication())) {
            m106295a(new Runnable() {
                /* class com.ss.android.lark.app.task.MultitaskPostLaunchTask.RunnableC289785 */

                public void run() {
                    if (MultitaskFG.f121595b.mo168905b() && MultitaskFG.f121595b.mo168904a()) {
                        GlobalTaskContainerImpl.m190809h();
                    }
                }
            });
        }
    }

    /* renamed from: j */
    public void mo102755j() {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unregisterUserSwitchListener(this.f72638a);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(this.f72638a);
    }

    /* renamed from: a */
    private void m106295a(Runnable runnable) {
        CoreThreadPool.getDefault().getUIExecutor().execute(runnable);
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        Log.m165389i("MULTITASK-MultitaskPostLaunchTask", "execute");
        mo102755j();
        C28513a.m104512a(new C28513a.AbstractC28514a() {
            /* class com.ss.android.lark.app.task.MultitaskPostLaunchTask.C289752 */

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
            public void onLoginStatusChanged(int i) {
                Log.m165389i("MULTITASK-MultitaskPostLaunchTask", "onLoginStatusChanged, loginType = " + i);
                if (i == 0) {
                    ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unregisterUserSwitchListener(MultitaskPostLaunchTask.this.f72638a);
                    MultitaskPostLaunchTask.this.mo102753h();
                }
                if (i == 1) {
                    MultitaskPostLaunchTask.this.mo102755j();
                    MultitaskPostLaunchTask.this.mo102754i();
                }
            }
        });
        mo102754i();
    }
}
