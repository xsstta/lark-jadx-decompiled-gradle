package com.ss.lark.android.passport.biz.feature.join_team.p3226b;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49157ai;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49406a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinQrCodeInfo;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.a */
public class C64801a implements AbstractC49406a {

    /* renamed from: a */
    public final PassportLog f163390a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    private final JoinQrCodeInfo f163391b;

    /* renamed from: c */
    private final String f163392c;

    /* renamed from: d */
    private final UniContext f163393d;

    /* renamed from: a */
    private void m254487a(AbstractC49407b bVar) {
        Activity activity;
        Context a = bVar.mo145304a();
        if (a instanceof Activity) {
            activity = (Activity) a;
        } else {
            activity = null;
        }
        if (activity == null) {
            this.f163390a.mo171471d("n_page_scan_qrcode", "handleQrcodeActivityLifecycle return for null activity");
            return;
        }
        final C64804a aVar = new C64804a(activity, this.f163392c);
        C49032c.m193132a().mo171192a(aVar);
        bVar.mo145306a(new AbstractC49407b.AbstractC49408a() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64801a.C648032 */

            @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b.AbstractC49408a
            public void onActivityDestory(Activity activity) {
                C49032c.m193132a().mo171197b(aVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.a$a */
    public static class C64804a extends C49032c.C49035a {

        /* renamed from: b */
        private final String f163398b;

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b, com.ss.android.lark.passport.infra.base.architecture.C49032c.C49035a
        /* renamed from: b */
        public String mo171207b() {
            return "join_by_scan";
        }

        C64804a(Activity activity, String str) {
            super(activity);
            this.f163398b = str;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49406a
    /* renamed from: a */
    public View mo172450a(AbstractC49407b bVar, FrameLayout frameLayout) {
        Activity activity;
        m254487a(bVar);
        final Context a = bVar.mo145304a();
        View inflate = LayoutInflater.from(a).inflate(R.layout.signin_sdk_view_qrcode_tip, (ViewGroup) frameLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_get_team_code_tip);
        JoinQrCodeInfo joinQrCodeInfo = this.f163391b;
        if (joinQrCodeInfo != null) {
            if (a instanceof Activity) {
                activity = (Activity) a;
            } else {
                activity = null;
            }
            if (activity != null) {
                C49226y.m194062a(activity, textView, joinQrCodeInfo.subTitle, (JSONObject) null, (UniContext) null, this.f163390a, new C49226y.AbstractC49228a() {
                    /* class com.ss.lark.android.passport.biz.feature.join_team.p3226b.C64801a.C648021 */

                    @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                    /* renamed from: a */
                    public boolean mo171752a(TextPaint textPaint) {
                        textPaint.setFlags(8);
                        textPaint.setColor(C49154ag.m193840c(a, R.color.signin_sdk_white));
                        return true;
                    }

                    @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                    /* renamed from: a */
                    public boolean mo171753a(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            PassportLog passportLog = C64801a.this.f163390a;
                            passportLog.mo171465b("n_action_click_how_to_get_qrcode", "url:" + str);
                            C49157ai.m193846a(a, str);
                            return true;
                        }
                        C64801a.this.f163390a.mo171471d("n_page_scan_qrcode", "RichText can not open empty url");
                        return true;
                    }
                });
            } else {
                this.f163390a.mo171471d("n_page_scan_qrcode", "getBottomCustomView activity is null");
            }
        } else {
            this.f163390a.mo171471d("n_page_scan_qrcode", "getBottomCustomView JoinQrCodeInfo data is null");
        }
        return inflate;
    }

    public C64801a(JoinQrCodeInfo joinQrCodeInfo, String str, UniContext uniContext) {
        this.f163391b = joinQrCodeInfo;
        this.f163392c = str == null ? "" : str;
        this.f163393d = uniContext;
    }
}
