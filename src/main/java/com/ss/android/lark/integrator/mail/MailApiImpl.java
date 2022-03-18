package com.ss.android.lark.integrator.mail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.mulprocess.C43215d;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.AbstractC43226a;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.C43227b;
import com.ss.android.lark.mail.impl.p2167f.C42106a;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43380g;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.p2567s.p2568a.p2574f.C53205a;
import com.ss.android.lark.p2567s.p2568a.p2574f.C53206b;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.C68183b;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

@ClaymoreImpl(IMailApi.class)
public class MailApiImpl implements IMailApi {
    @Override // com.ss.android.lark.mail_api.IMailApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53205a.f131539a;
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53205a.f131540b;
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53205a.f131541c;
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public IDiskCleanTask getDiskCleanTask() {
        return new C42106a();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public AbstractC52220a getMailIdlePreloadActions() {
        return new C39846a();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean isGroupMailEnable() {
        MailModuleProvider.m158123a();
        return C41724a.m165683j();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean isMailSettingEnable() {
        return C41724a.m165682h();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean isMailTabEnable() {
        return C41724a.m165680f();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public String getAutoTranslationFGKey() {
        return MailModuleProvider.m158123a().mo150109m();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public String getExternalMailtoKey() {
        return MailModuleProvider.m158123a().mo150105e();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public String getOpenMailFromNoticeKey() {
        return MailModuleProvider.m158123a().mo150102c();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public String getPackageName() {
        return MailModuleProvider.m158123a().mo150099b();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean isMailPushOptimizeFGOpen() {
        return MailModuleProvider.m158123a().mo150104d();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean isSupportMailTo() {
        return MailModuleProvider.m158123a().mo150106i();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public Collection<? extends AbstractNotification> provideNotificationImpls() {
        return MailModuleProvider.m158123a().mo150107k();
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void beforeAppOnCreate(Context context) {
        C43227b.f109991a = context;
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void initProcessorDoInit(String str) {
        C53206b.m205843a(str);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public AbstractC54125a getSettingComponent(Activity activity) {
        return new C39847b(activity);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void initMailModule(boolean z) {
        MailModuleProvider.m158123a().mo150097a(z);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void preloadMainPageData(Context context) {
        MailModuleProvider.m158123a().mo150094a(context);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void preloadMainPageUIView(Context context) {
        MailModuleProvider.m158123a().mo150100b(context);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void startEmailSettingPage(Activity activity) {
        MailModuleProvider.m158123a().mo150093a(activity);
    }

    private void initHostDependency(Context context) {
        final AbstractC41740a b = MailModuleProvider.m158124b();
        C41816b.m166117a(new AbstractC43226a() {
            /* class com.ss.android.lark.integrator.mail.MailApiImpl.C398301 */

            @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.AbstractC43226a
            /* renamed from: a */
            public void mo144385a(Activity activity, int i, long j, String str, String str2) {
                b.getFilePickerDependency().mo144473a(activity, i, j, str, str2);
            }

            @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.AbstractC43226a
            /* renamed from: a */
            public boolean mo144386a(String str, List<DriveFile> list, DriveFileOperationMask driveFileOperationMask, HashMap hashMap, AbstractC41849c.AbstractC41850a aVar) {
                return b.viewByDrive(str, list, driveFileOperationMask, hashMap, aVar);
            }
        });
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean canOpen(String str) {
        return MailModuleProvider.m158123a().mo150101b(str);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context) {
        return MailModuleProvider.m158123a().mo150108l().mo150207a(context);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void afterAppOnCreate(Context context) {
        C41988g.m166970a();
        C43380g.m172308a().mo155142a(C43227b.f109991a);
        ((IWebProcessLifecycle) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IWebProcessLifecycle.class)).onProcessCreated();
        initHostDependency(context);
        C43215d.m171785a(context);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void openEml(Context context, String str) {
        MailModuleProvider.m158123a().mo150096a(context, str);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean openMailFromNotify(Context context, Intent intent) {
        return C42699a.m170269b(context, intent);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void openMailToIntent(Context context, Intent intent) {
        MailModuleProvider.m158123a().mo150095a(context, intent);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public Intent getLaunchMailTransPageIntent(Intent intent, String str) {
        Log.m165388i("handleMailOfflinePushNotice bizExtra:" + str);
        if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(ShareHitPoint.f121869d);
            Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice mailPushType:" + string);
            if ("PUSH_MAIL_NEW_MESSAGE".equals(string) || "PUSH_MAIL_SHARE_THREAD".equals(string) || "PUSH_MAIL_SHARE_INCOMING".equals(string)) {
                JSONObject jSONObject = parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String string2 = jSONObject.getString("t_id");
                String string3 = jSONObject.getString("m_id");
                String string4 = jSONObject.getString("ma_id");
                String str2 = null;
                try {
                    str2 = jSONObject.getString("f_id");
                } catch (Exception unused) {
                }
                Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice threadId:" + string2 + " messageId:" + string3 + " accountId:" + string4 + " folderId:" + str2);
                Bundle bundle = new Bundle();
                bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150222c(), string3);
                bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150223d(), string2);
                bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150225f(), C41724a.m165678a().getExternalUseConstant().mo150226g());
                String a = C41724a.m165678a().getExternalUseConstant().mo150220a();
                if (TextUtils.isEmpty(str2)) {
                    str2 = a;
                }
                if ("PUSH_MAIL_SHARE_THREAD".equals(string) || "PUSH_MAIL_SHARE_INCOMING".equals(string)) {
                    str2 = C41724a.m165678a().getExternalUseConstant().mo150221b();
                }
                bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150224e(), str2);
                bundle.putBoolean(MailModuleProvider.m158123a().mo150102c(), true);
                bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150228i(), string4);
                intent.putExtras(bundle);
            }
        }
        return intent;
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public void handleMailOfflinePushNotice(final Intent intent, final String str) {
        Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice obj:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                String optString = jSONObject.optString("user_id");
                Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice jsonObject:" + jSONObject);
                if (!TextUtils.isEmpty(str)) {
                    String optString2 = jSONObject.optString("extra_str");
                    Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice extraJsonObjectNextStr:" + optString2);
                    if (!TextUtils.isEmpty(optString2)) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                        String string = jSONObject2.getString(ShareHitPoint.f121869d);
                        Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice mailPushType:" + string);
                        if ("PUSH_MAIL_NEW_MESSAGE".equals(string) || "PUSH_MAIL_SHARE_THREAD".equals(string) || "PUSH_MAIL_SHARE_INCOMING".equals(string)) {
                            org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            String string2 = jSONObject3.getString("t_id");
                            String string3 = jSONObject3.getString("m_id");
                            String string4 = jSONObject3.getString("ma_id");
                            String str2 = null;
                            try {
                                str2 = jSONObject3.getString("f_id");
                            } catch (Exception unused) {
                            }
                            Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice threadId:" + string2 + " messageId:" + string3 + " accountId" + string4 + " folderId:" + str2);
                            Bundle bundle = new Bundle();
                            bundle.putString("user_id", optString);
                            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150222c(), string3);
                            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150223d(), string2);
                            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150225f(), C41724a.m165678a().getExternalUseConstant().mo150226g());
                            String a = C41724a.m165678a().getExternalUseConstant().mo150220a();
                            if (TextUtils.isEmpty(str2)) {
                                str2 = a;
                            }
                            if ("PUSH_MAIL_SHARE_THREAD".equals(string) || "PUSH_MAIL_SHARE_INCOMING".equals(string)) {
                                str2 = C41724a.m165678a().getExternalUseConstant().mo150221b();
                            }
                            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150224e(), str2);
                            bundle.putBoolean(MailModuleProvider.m158123a().mo150102c(), true);
                            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150228i(), string4);
                            intent.putExtras(bundle);
                        }
                    }
                }
            } catch (JSONException e) {
                Log.m165389i("handleMailOfflinePushNotice", "handleMailOfflinePushNotice JSONException:" + e.getMessage());
            }
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.integrator.mail.MailApiImpl.RunnableC398312 */

            public void run() {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).handleSwitchTenant(LarkContext.getApplication(), intent, str);
            }
        });
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return MailModuleProvider.m158123a().mo150092a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.mail_api.IMailApi
    public boolean open(Context context, String str, Map<String, String> map) {
        return MailModuleProvider.m158123a().mo150098a(context, str, map);
    }
}
