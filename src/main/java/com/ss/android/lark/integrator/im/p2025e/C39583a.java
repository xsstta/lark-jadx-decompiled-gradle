package com.ss.android.lark.integrator.im.p2025e;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.LifecycleCallbackManager;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1907g.C38537a;
import com.ss.android.lark.p1907g.p1908a.AbstractC38538a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.integrator.im.e.a */
public class C39583a {

    /* renamed from: com.ss.android.lark.integrator.im.e.a$a */
    public static class C39586a {

        /* renamed from: a */
        public static final AbstractC38538a f101048a = C39583a.m157072b();
    }

    /* renamed from: a */
    public static C38537a m157071a() {
        return new C38537a(C39586a.f101048a);
    }

    /* renamed from: b */
    public static AbstractC38538a m157072b() {
        return new AbstractC38538a() {
            /* class com.ss.android.lark.integrator.im.p2025e.C39583a.C395841 */

            @Override // com.ss.android.lark.p1907g.p1908a.AbstractC38538a
            /* renamed from: a */
            public String mo141222a() {
                C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
                if (v != null) {
                    return v.mo105631b();
                }
                return null;
            }

            @Override // com.ss.android.lark.p1907g.p1908a.AbstractC38538a
            /* renamed from: b */
            public boolean mo141225b() {
                C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
                if (v != null) {
                    return v.mo105642c();
                }
                return false;
            }

            @Override // com.ss.android.lark.p1907g.p1908a.AbstractC38538a
            /* renamed from: a */
            public void mo141223a(final Context context) {
                AbstractC39484a.m156004a().mo104263n().mo126551a(LifecycleCallbackManager.m94003a(context).mo92338a(new UIGetDataCallback(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.integrator.im.p2025e.C39583a.C395841.C395851 */

                    /* renamed from: a */
                    private String m157077a(ErrorResult errorResult) {
                        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GuideGettingHelpFail);
                        if (errorResult != null) {
                            mustacheFormat = errorResult.getDisplayMsg(mustacheFormat);
                        }
                        LKUIToast.show(context, mustacheFormat);
                        return mustacheFormat;
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        String a = m157077a(errorResult);
                        Log.m165382e(a + " ErrorMsg：" + errorResult.toString());
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        if (!C57782ag.m224241a(str)) {
                            AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105929a());
                            C39603g.m157159a().getCoreDependency().mo143487a("key_chatwindow", ChatBundle.SourceType.PROFILE);
                            return;
                        }
                        String a = m157077a((ErrorResult) null);
                        Log.m165382e(a + " ErrorMsg：chatId is empty!");
                    }
                })));
            }

            @Override // com.ss.android.lark.p1907g.p1908a.AbstractC38538a
            /* renamed from: a */
            public void mo141224a(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143440a(context, str, UrlParams.m108857a().mo105523a());
            }
        };
    }
}
