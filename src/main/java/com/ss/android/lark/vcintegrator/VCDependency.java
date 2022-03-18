package com.ss.android.lark.vcintegrator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.minutes.C39876a;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vcintegrator.SubDependencies;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.PhotoPickerActivity;
import com.ss.android.vc.dependency.AbstractC60875aa;
import com.ss.android.vc.dependency.AbstractC60876ab;
import com.ss.android.vc.dependency.AbstractC60877ac;
import com.ss.android.vc.dependency.AbstractC60879ad;
import com.ss.android.vc.dependency.AbstractC60881af;
import com.ss.android.vc.dependency.AbstractC60882ag;
import com.ss.android.vc.dependency.AbstractC60886c;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.AbstractC60889e;
import com.ss.android.vc.dependency.AbstractC60890f;
import com.ss.android.vc.dependency.AbstractC60891g;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.AbstractC60893i;
import com.ss.android.vc.dependency.AbstractC60895k;
import com.ss.android.vc.dependency.AbstractC60896l;
import com.ss.android.vc.dependency.AbstractC60897m;
import com.ss.android.vc.dependency.AbstractC60899n;
import com.ss.android.vc.dependency.AbstractC60900o;
import com.ss.android.vc.dependency.AbstractC60901p;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.AbstractC60904r;
import com.ss.android.vc.dependency.AbstractC60905s;
import com.ss.android.vc.dependency.AbstractC60906t;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.dependency.AbstractC60911w;
import com.ss.android.vc.dependency.AbstractC60912x;
import com.ss.android.vc.dependency.AbstractC60914y;
import com.ss.android.vc.dependency.AbstractC60915z;
import com.ss.android.vc.dependency.IReactionDependency;
import com.ss.android.vc.dependency.IRichTextDependency;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.dependency.ak;
import com.ss.android.vc.dependency.am;
import com.ss.android.vc.dependency.an;
import com.ss.android.vc.dependency.ao;
import com.ss.android.vc.dependency.ap;
import com.ss.android.vc.dto.C60916a;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.ArrayList;
import java.util.List;

@ClaymoreImpl(IVideoChatDependency.class)
@XClass(isSingleton = true)
public class VCDependency implements IVideoChatDependency {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.vcintegrator.VCDependency$a */
    public static class C57969a {

        /* renamed from: a */
        public static VCDependency f142653a = new VCDependency();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public String getPhotoPickerKeySelectedPhotos() {
        return "SELECTED_PHOTOS";
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public int getPhotoPickerReqCode() {
        return 233;
    }

    @XSingleton
    public static VCDependency getInstance() {
        return C57969a.f142653a;
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public IVideoChatDependency get() {
        return getInstance();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60886c getAppConfigurationDependency() {
        return SubDependencies.C57954a.m224843a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60888d getAppEnvDependency() {
        return SubDependencies.AppEnvDependency.m224721a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60889e getAppUpgradeDependency() {
        return SubDependencies.AppUpgradeDependency.m224725a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60890f getBrowserDependency() {
        return SubDependencies.BrowserDependency.m224726a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60891g getCalendarDependency() {
        return SubDependencies.CalendarDependency.m224727a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60892h getChatDependency() {
        return SubDependencies.ChatDependency.m224728a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60893i getChatterNameDependency() {
        return SubDependencies.ChatterNameDependency.m224737a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60895k getContactDependency() {
        return SubDependencies.ContactDependency.m224739a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60896l getCustomerServiceDependency() {
        return SubDependencies.CustomerServiceDependency.m224740a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60897m getDeviceChangeDependency() {
        return SubDependencies.DeviceChangeDependency.m224741a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60899n getDocsDependency() {
        return SubDependencies.DocsDependency.m224743a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60900o getDynamicDomainDependency() {
        return SubDependencies.DynamicDomainDependency.m224754a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60901p getFeatureGatingDependency() {
        return SubDependencies.FeatureGatingDependency.m224758a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60902q getGuideDependency() {
        return SubDependencies.GuideDependency.m224762a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60904r getHttpDependency() {
        return SubDependencies.C57957b.m224846a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60905s getImageDependency() {
        return SubDependencies.ImageDependency.m224769a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60906t getLanguageDependency() {
        return SubDependencies.LanguageDependency.m224774a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60907u getLarkAppDependency() {
        return SubDependencies.LarkAppDependency.m224775a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60908v getLifecycleDependency() {
        return SubDependencies.LifeCycleDependency.m224777a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60911w getLittleAppDependency() {
        return SubDependencies.LittleAppDependency.m224783a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60912x getLoginChangeDependency() {
        return SubDependencies.LoginChangeDependency.m224784a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60914y getLoginDependency() {
        return SubDependencies.LoginDependency.m224786a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60915z getMailDependency() {
        return SubDependencies.MailDependency.m224794a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60875aa getMainDependency() {
        return SubDependencies.MainDependency.m224796a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60876ab getMinutesDependency() {
        return SubDependencies.MinutesDependency.m224798a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60877ac getMultiTaskDependency() {
        return SubDependencies.MultiTaskDependency.m224806a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public AbstractC60879ad getNotificationDependency() {
        return SubDependencies.NotificationDependency.m224815a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60881af getPreloadXMLDependency() {
        return SubDependencies.PreloadXMLDependency.m224816a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC60882ag getProfileDependency() {
        return SubDependencies.C57959c.m224848a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public IReactionDependency getReactionDependency() {
        return SubDependencies.ReactionDependency.m224819a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public IRichTextDependency getRichTextDependency() {
        return SubDependencies.RichTextDependency.m224820a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public aj getSettingDependency() {
        return SubDependencies.SettingDependency.m224821a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public ak getUGDependency() {
        return SubDependencies.UGDependency.m224824a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public am getVideoChatConfigDependency() {
        return SubDependencies.VideoChatConfigDependency.m224826a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public an getVoIpDependency() {
        return SubDependencies.VoIpDependency.m224827a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public ao getWatermarkDependency() {
        return SubDependencies.WatermarkDependency.m224828a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public ap getWschannelDependency() {
        return SubDependencies.WschannelDependency.m224830a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public int getAppId() {
        return C29410a.m108287a().mo104277a();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public String getDeviceId() {
        return SubDependencies.XDataCache.m224833a().mo196489d();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public AbstractC25990b getHttpClient() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLarkHttpClient();
    }

    @XMethod
    public String getLoginUserId() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public boolean getMeetingFeatureSwitch() {
        return C37239a.m146648b().mo136951a("suite_vc");
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public String getTenantId() {
        return SubDependencies.XDataCache.m224833a().mo196500i();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public String getUserId() {
        return SubDependencies.XDataCache.m224833a().mo196488c();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public boolean isNotificationUndisturbed() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isNotificationUndisturbed();
    }

    public boolean isTracerEnabled() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSystemTracerEnable();
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public List<C60916a> getFeedFromCacheForChatInbox() {
        return getFeedPreviewInfoList(((IIMApi) ApiUtils.getApi(IIMApi.class)).createDataLoader(FeedCard.FeedType.INBOX, FeedCard.Type.CHAT).mo106727a(FeedCard.FeedType.INBOX));
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public boolean isBigBUser() {
        boolean g = SubDependencies.XDataCache.m224833a().mo196492g();
        int h = SubDependencies.XDataCache.m224833a().mo196499h();
        if (g || h != 0) {
            return false;
        }
        return true;
    }

    public boolean isUsingTTNet() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isTTNetOn(LarkContext.getApplication());
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public boolean isPhotoPickActivity(Activity activity) {
        return activity instanceof PhotoPickerActivity;
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public void openPhotoPickerPage(Activity activity) {
        C58557a.m227127a().mo198526i(false).mo198524g(true).mo198525h(false).mo198529l(false).mo198531n(false).mo198506a(1).mo198528k(false).mo198517c(true).mo198522f(2).mo198534q(true).mo198510a(activity, 233);
    }

    private static List<C60916a> getFeedPreviewInfoList(List<FeedPreviewInfo> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (FeedPreviewInfo feedPreviewInfo : list) {
                if (feedPreviewInfo != null) {
                    C60916a aVar = new C60916a();
                    aVar.mo208846b(feedPreviewInfo.mo106098p());
                    aVar.mo208849c(feedPreviewInfo.mo106104r());
                    aVar.mo208841a(feedPreviewInfo.mo106074h());
                    aVar.mo208847b(feedPreviewInfo.mo106073g());
                    if (feedPreviewInfo.mo106051c() == Chat.Type.GROUP) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo208843a(z);
                    aVar.mo208852d(feedPreviewInfo.mo106105s());
                    aVar.mo208854e(feedPreviewInfo.mo105997U());
                    aVar.mo208853d(feedPreviewInfo.mo105984H());
                    aVar.mo208850c(feedPreviewInfo.mo106108v());
                    aVar.mo208842a(feedPreviewInfo.aq());
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public void onRtcStats(long j, long j2) {
        VideoChatModuleProvider.m224872a().mo208134a(j, j2);
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public void showVoIpCallDialog(Context context, OpenChatter openChatter) {
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = SubDependencies.LifeCycleDependency.m224777a().mo196414b();
        }
        VoIpModuleProvider.m158862a().mo196597a(activity, openChatter, null);
    }

    @XMethod
    public void openMinutePage(Context context, String str, int i) {
        C39876a.m158359b().mo161084a(context, str, i);
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public Intent getVideoEventInfoIntent(Context context, String str, long j) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getVideoEventIntent(context, str, j);
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    public void goShareVideoMeeting(Context context, String str, String str2) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goShareVideoMeeting(context, str, str2);
    }

    @XMethod
    public void showVideoEventInfo(Context context, String str, long j) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).showVideoEventInfo(context, str, j);
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public void startContactsProfileActivityByChatterId(Context context, String str, String str2) {
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(5);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str, str2, contactSource);
    }

    @Override // com.ss.android.vc.dependency.IVideoChatDependency
    @XMethod
    public void startContactsProfileActivity(Context context, String str, String str2, String str3, ByteviewUser byteviewUser) {
        ContactSource contactSource = new ContactSource();
        if (!C57782ag.m224241a(str2)) {
            contactSource.setSourceType(5);
            contactSource.setSourceName(str2);
            contactSource.setSourceId(str3);
        } else if (byteviewUser != null) {
            VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(byteviewUser.getUserId(), byteviewUser.getParticipantType());
            if (userInfoInCache != null) {
                contactSource.setSourceType(5);
                contactSource.setSender(userInfoInCache.getName());
                contactSource.setSenderId(userInfoInCache.getId());
                Log.m165379d("VideoChatModuleProvider", "[startContactsProfileActivity] sender = " + userInfoInCache.getName() + " senderId =" + userInfoInCache.getId());
            }
        } else {
            contactSource.setSourceType(0);
        }
        Log.m165379d("VideoChatModuleProvider", "[startContactsProfileActivity] topic = " + str2 + " meetingId =" + str3);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str, null, contactSource);
    }
}
