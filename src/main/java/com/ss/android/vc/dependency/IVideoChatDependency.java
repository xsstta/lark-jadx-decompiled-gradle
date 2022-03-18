package com.ss.android.vc.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.dto.C60916a;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vcxp.annotation.XClass;
import java.util.List;

@XClass
public interface IVideoChatDependency {
    IVideoChatDependency get();

    AbstractC60886c getAppConfigurationDependency();

    AbstractC60888d getAppEnvDependency();

    int getAppId();

    AbstractC60889e getAppUpgradeDependency();

    AbstractC60890f getBrowserDependency();

    AbstractC60891g getCalendarDependency();

    AbstractC60892h getChatDependency();

    AbstractC60893i getChatterNameDependency();

    AbstractC60895k getContactDependency();

    AbstractC60896l getCustomerServiceDependency();

    AbstractC60897m getDeviceChangeDependency();

    String getDeviceId();

    AbstractC60899n getDocsDependency();

    AbstractC60900o getDynamicDomainDependency();

    AbstractC60901p getFeatureGatingDependency();

    List<C60916a> getFeedFromCacheForChatInbox();

    AbstractC60902q getGuideDependency();

    AbstractC25990b getHttpClient();

    AbstractC60904r getHttpDependency();

    AbstractC60905s getImageDependency();

    AbstractC60906t getLanguageDependency();

    AbstractC60907u getLarkAppDependency();

    AbstractC60908v getLifecycleDependency();

    AbstractC60911w getLittleAppDependency();

    AbstractC60912x getLoginChangeDependency();

    AbstractC60914y getLoginDependency();

    AbstractC60915z getMailDependency();

    AbstractC60875aa getMainDependency();

    boolean getMeetingFeatureSwitch();

    AbstractC60876ab getMinutesDependency();

    AbstractC60877ac getMultiTaskDependency();

    AbstractC60879ad getNotificationDependency();

    String getPhotoPickerKeySelectedPhotos();

    int getPhotoPickerReqCode();

    AbstractC60881af getPreloadXMLDependency();

    AbstractC60882ag getProfileDependency();

    IReactionDependency getReactionDependency();

    IRichTextDependency getRichTextDependency();

    aj getSettingDependency();

    String getTenantId();

    ak getUGDependency();

    String getUserId();

    am getVideoChatConfigDependency();

    Intent getVideoEventInfoIntent(Context context, String str, long j);

    an getVoIpDependency();

    ao getWatermarkDependency();

    ap getWschannelDependency();

    void goShareVideoMeeting(Context context, String str, String str2);

    boolean isBigBUser();

    boolean isNotificationUndisturbed();

    boolean isPhotoPickActivity(Activity activity);

    void onRtcStats(long j, long j2);

    void openPhotoPickerPage(Activity activity);

    void showVoIpCallDialog(Context context, OpenChatter openChatter);

    void startContactsProfileActivity(Context context, String str, String str2, String str3, ByteviewUser byteviewUser);

    void startContactsProfileActivityByChatterId(Context context, String str, String str2);
}
