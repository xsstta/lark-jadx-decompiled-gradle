package com.ss.android.lark.vc.api;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.p1666f.AbstractC33989a;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.vc.dto.VCLaunchError;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IVCApi {
    void addVideoChatStatusChangedListener(AbstractC57900b bVar);

    void addVoipStatusChangedListener(AbstractC57902d dVar);

    void bindViewWithVCMsg(TextView textView, TextView textView2, ImageView imageView, Content content);

    AbstractC58992f<MessageInfo, ? extends RecyclerView.ViewHolder> createVideoMeetingCardHolderView(Context context, Chat chat);

    void dismissLoadingDialog();

    List<AbstractC28490a> getAbTestExperiments();

    Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context);

    Map<String, String> getAutoInitModuleConfigMap();

    AbstractC54125a getChatSettingComponent(Activity activity);

    AbstractC34033a getChatTitleBarRightView(Activity activity, Chat chat, Chatter chatter);

    ILaunchTask getInitVideoChatTask();

    String getMinutesPackageName();

    AbstractC44552i getMinutesTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    String getPackageName();

    void getPstnDetailInfo(String str, String str2, String str3, String str4, String str5, String str6, GetPstnSipFeatureConfigRequest.CalendarType calendarType, String str7, IGetDataCallback<PstnDetailInfoResponse2> iGetDataCallback);

    IQRCodeScanResultHandler getQRCodeScanResultHandler();

    String getRtcSdkVersion();

    Collection<? extends String> getSyncKeys();

    AbstractC44552i getTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    Object getVCDebugPlugin();

    Collection<? extends IOpenMessageCellFactory> getVCMessageCellFactories();

    AbstractC33989a getVcInfoBanner(Activity activity, Chat chat, Chatter chatter, AbstractC33989a.AbstractC33990a aVar);

    String getVeSdkVersion();

    String getVideoChatCardReplyDigest(Message message);

    IDiskCleanTask getVideoChatCleanTask();

    void getViewI18nTemplate(ErrorResult errorResult, IGetDataCallback<String> iGetDataCallback);

    void guestOpenInMeetingPage(String str, String str2);

    boolean handleSaysUrl(Context context, String str, int i);

    boolean handleVcLiveUrl(Context context, String str, int i);

    boolean hasMeetingOngoingOnCurrentProcess();

    boolean hasMeetingOngoingOnVcVoip();

    void initProcessorDoInit(String str);

    boolean isEnterprisePhoneAuthorized();

    boolean isFloatToastPlan();

    boolean isInMeeting();

    boolean isLivingInFloat();

    boolean isMMUrl(String str);

    boolean isMeetingCard(ContentVO aVar);

    boolean isMmRecording();

    boolean isMmTabEnable();

    boolean isSaysUrl(String str);

    boolean isVCUrl(String str);

    boolean isVcLiveUrl(String str);

    boolean isVideoChatSettingEnable();

    void joinCalendarGroupMeeting(Context context, String str, String str2);

    void joinInterviewGroupMeeting(Context context, String str);

    void joinInterviewGroupMeeting(Context context, String str, String str2);

    void launchVideoChat(Chatter chatter, boolean z, IGetDataCallback<VCLaunchError> iGetDataCallback);

    void logout();

    boolean needShowPlusIconCreate();

    boolean needShowPlusIconJoin();

    boolean needShowPlusIconLocalShare();

    void onChatTitleDismissAnimation();

    void onConfigurationChanged(Configuration configuration);

    void openCreateMeetingPage(Context context);

    void openEnterprisePhonePage(Chatter chatter, String str, String str2);

    void openJoinMeetingPage(Context context);

    void openJoinMeetingPage(Context context, String str);

    void openJoinMeetingPage(Context context, String str, String str2);

    void openJoinMeetingPageFromUrl(Context context, String str, String str2);

    void openLocalSharePage(Context context);

    void openMMUrl(Context context, String str, int i);

    void openMeetingCodeInputPage(Context context, String str);

    void openVCUrl(Context context, String str);

    boolean openXiaoMiVoip(Context context, String str, String str2, String str3, String str4);

    void otherOpenCamera();

    Content parseVideoChatContent(com.bytedance.lark.pb.basic.v1.Content content);

    Collection<? extends AbstractNotification> provideNotificationImpls();

    void setRtcStatsListener(AbstractC57899a aVar);

    boolean shouldShowVcInternalFeedbackDialog();

    void showPstnDetail(GetAdminSettingsResponse getAdminSettingsResponse, String str);

    void simplifyOpenInMeetingPage(String str, String str2);

    void startPreVideoChatSettingActivity(Context context, String str);

    void startVideoChatSettingActivity(Activity activity);

    void startVoIpActivityCheckPermission(Activity activity, OpenChatter openChatter, String str, AbstractC57901c cVar);

    void startVoIpActivityCheckPermission(Activity activity, String str);

    void stopLiveFloat();

    void unInit();
}
