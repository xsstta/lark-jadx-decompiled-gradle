package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.feedback.entrance.FAQActivity;
import com.tt.miniapp.feedback.entrance.vo.FeedbackParam;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.p3392m.C67657c;

/* renamed from: com.tt.miniapp.titlemenu.item.d */
public class C66935d extends C66937e {

    /* renamed from: a */
    private C66899a f168831a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "feedback_and_helper";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168831a;
    }

    public C66935d(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168831a = aVar;
        aVar.setIcon(activity.getDrawable(2131234580));
        this.f168831a.setLabel(activity.getString(R.string.microapp_m_feedback_faq_list_title));
        this.f168831a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66935d.View$OnClickListenerC669361 */

            public void onClick(View view) {
                DialogC66908d.m260930a(iAppContext).dismiss();
                C66020b.m258530a("mp_feedback_click", iAppContext).mo231092a();
                Intent a = C66935d.this.mo232960a(activity, -1);
                if (a != null) {
                    activity.startActivity(a);
                }
            }
        });
    }

    /* renamed from: a */
    public Intent mo232960a(Context context, long j) {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        AppInfoEntity appInfo = C67432a.m262319a(this.f168835d).getAppInfo();
        if (initParams == null || appInfo == null) {
            return null;
        }
        FeedbackParam feedbackParam = new FeedbackParam();
        if (appInfo.isGame()) {
            feedbackParam.mo231409a(2);
            feedbackParam.mo231429j("1234567891");
            feedbackParam.mo231433l("microgame-android");
            feedbackParam.mo231431k("microgame");
        } else {
            feedbackParam.mo231409a(1);
            feedbackParam.mo231431k("microapp");
            feedbackParam.mo231429j("1234567890");
            feedbackParam.mo231433l("microapp-android");
        }
        feedbackParam.mo231427i(appInfo.versionType);
        feedbackParam.mo231416d(appInfo.appId);
        feedbackParam.mo231410a(appInfo.appName);
        feedbackParam.mo231419e(C67657c.m263252b());
        feedbackParam.mo231412b(initParams.mo234502b());
        feedbackParam.mo231414c(C67657c.m263250a());
        feedbackParam.mo231423g(initParams.mo234510j());
        feedbackParam.mo231425h(initParams.mo234505e());
        feedbackParam.mo231421f(initParams.mo234507g());
        feedbackParam.mo231435m(initParams.mo234500a());
        feedbackParam.mo231437n(initParams.mo234508h());
        return FAQActivity.m258883a(context, feedbackParam, appInfo, j, this.f168835d.getAppType());
    }
}
