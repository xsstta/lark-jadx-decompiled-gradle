package com.ss.android.lark.biz.im.api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.dependence.IChatterAvatarService;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.biz.im.api.param.AbstractC29624a;
import com.ss.android.lark.biz.im.api.param.Params;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.biz.im.extension.ImExtension;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.preview.Parameters;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.entity.translate.TranslateLanguageSetting;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public interface IIMApi {
    void addAddressBookInfo(IGetDataCallback<?> iGetDataCallback);

    void addExtension(ImExtension gVar);

    void addFeedFirstLoadListener(AbstractC29617j jVar);

    void addGroupChatMember(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback);

    void addLeanModeChangeListener(AbstractC29621n nVar);

    void addPreviewCacheObserver(IPreviewCache.PreviewCacheObserver aVar);

    void addPushChatterListener(AbstractC29623p pVar);

    void addPushMessageListener(AbstractC29626r rVar);

    void addPushMineChatterChangedListener(AbstractC29627s sVar);

    void addPushTranslateLanguageSettingListener(AbstractC29628t tVar);

    void addShareGroupQRCodeHitPoint();

    void auditImageDownload(String str);

    void auditLinkEvent(String str);

    void auditMediaDownload(String str);

    void auditOpenMiniAppEvent(String str);

    void auditScreenRecordingEvent(String str);

    void auditScreenShotEvent(String str);

    void cacheDrawable(String str, Drawable drawable);

    void callUserConfirm(Activity activity, String str, String str2);

    void cardAction(String str, int i);

    void chatBoxHitPoint(Chat chat, String str);

    void checkAvatar(String str, String str2, AvatarType avatarType);

    Boolean checkFileSavedToDriveAuthorization(String str, Boolean bool);

    boolean checkImageDownloadAuthorization(String str, boolean z);

    boolean checkLoginUserExistedInLocalChat(Chat chat);

    void checkNeedReloadDingData();

    void checkSelfInChat(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    String checkUrl(String str);

    boolean checkVideoDownloadAuthorization(String str, boolean z);

    void createAddChatChatterApply(String str, AddChatChatterApply.Ways ways, List<String> list, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback);

    AbstractC29524c createChatFrame();

    AbstractC29619l createDataLoader(FeedCard.FeedType feedType, FeedCard.Type type);

    AbstractC44552i createFeedTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    AbstractC29524c createThreadFrame();

    void deleteChatterWorkStatus();

    void deleteMessagesByIds(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    void deleteShortcuts(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback, int i);

    void dismissEnterpriseTopicCard();

    void emergencyCall(Activity activity, String str);

    boolean enableFeedMuteFilter();

    void ensureInChatAndOpenThread(Context context, String str, String str2);

    void fetchEmojis();

    void fetchEmojis(int i, List<String> list);

    void fetchLeanModeStatusAndAuthority(boolean z);

    void fetchMapLocation(Activity activity, Integer num, POIConfig pOIConfig, AbstractC29622o oVar, boolean z);

    void filterGroupChatter(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

    View findMoreBtn();

    Map<String, OpenChatter> fromPbChatterMap(Map<String, Chatter> map);

    C29597a generateMergeForwardInfo(MergeForwardContent mergeForwardContent);

    List<AbstractC28490a> getAbTestExperiments();

    void getAbsChatterById(String str, IGetDataCallback<OpenChatter> iGetDataCallback);

    String getAliasDisplayName(com.ss.android.lark.chat.entity.chatter.Chatter chatter);

    List<LKPluginConfig> getAllPluginConfigs();

    List<String> getAllRecentReactionList();

    String getAuditDisplayMsg(int i);

    Map<String, String> getAutoInitModuleConfigMap();

    int getCallMenuVoiceCallIcon();

    View getCardViewFromContent(Context context, CardContent cardContent);

    AbstractC32808a getChannelParser();

    Map<? extends String, ? extends AbstractC29186b> getChatAppLinkHandlers(Context context);

    Chat getChatById(String str);

    void getChatById(String str, IGetDataCallback<Chat> iGetDataCallback);

    Chat getChatByIdFromNet(String str);

    Map<? extends String, ? extends Boolean> getChatFeatureConfigMap();

    ImageHistoryResponse getChatImageHistory(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i);

    void getChatImageHistory(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i, IGetDataCallback<ImageHistoryResponse> iGetDataCallback);

    int getChatLastPosition(String str);

    ChatWindowPrepareData getChatLauncherInfo(String str);

    IChatParser getChatParser();

    void getChatQRCodeInfo(String str, UIGetDataCallback<ChatQRCodeInfoResponse> uIGetDataCallback);

    Map<? extends String, ? extends AbstractC29186b> getChatSettingAppLinkHandlers(Context context);

    Map<? extends String, ? extends Boolean> getChatSettingFeatureConfigMap();

    int getChatThreadOrThreadItemWidth(Context context, boolean z);

    com.ss.android.lark.chat.entity.chatter.Chatter getChatter(Chatter chatter);

    IChatterAvatarService getChatterAvatarService();

    com.ss.android.lark.chat.entity.chatter.Chatter getChatterById(String str);

    void getChatterById(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chatter.Chatter> iGetDataCallback);

    Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> getChatterMap(Map<String, Chatter> map);

    Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> getChatterMapFromEntity(C14928Entity entity);

    char getChatterNameLetter(com.ss.android.lark.chat.entity.chatter.Chatter chatter, Locale locale);

    char getChatterNameLetter(OpenChatter openChatter, Locale locale);

    IChatterParser getChatterParser();

    void getChattersByIds(List<String> list, IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.chatter.Chatter>> iGetDataCallback);

    void getChattersByIds(List<String> list, UIGetDataCallback<Map<String, com.ss.android.lark.chat.entity.chatter.Chatter>> uIGetDataCallback);

    void getChattersByIdsFromNet(List<String> list, IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.chatter.Chatter>> iGetDataCallback);

    String getCreateGroupChatPackageName();

    AbstractC44552i getCreateGroupChatTabPageSpec(Context context);

    void getDelayedFeed(IGetDataCallback<List<FeedPreviewInfo>> iGetDataCallback);

    String getDepartmentInvitationUrl(String str, String str2);

    void getDingMessageById(String str, IGetDataCallback<MessageInfo> iGetDataCallback);

    IDiskCleanTask getDiskCleanTask();

    String getDisplayName(com.ss.android.lark.chat.entity.chatter.Chatter chatter, ChatterNameDisplayRule chatterNameDisplayRule);

    String getDisplayName(OpenChatter openChatter, ChatterNameDisplayRule chatterNameDisplayRule);

    String getDisplayName(String str, String str2);

    String getDisplayName(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule);

    void getDocFromUrlContent(String str, IGetDataCallback<DocResult> iGetDataCallback);

    int getDocInlineBlueIcon(DocType docType);

    Map<? extends String, ? extends AbstractC29186b> getEduAppLinkHandlers(Context context);

    String getFavoritePageName();

    AbstractC44552i getFavoriteTabPageSpec(Context context);

    Map<? extends String, ? extends C41149a> getFeedAppConfigMap();

    String getFeedTabPageName();

    int getFileUploadAuthorizatedDenyCode();

    String getFirstTenantChatId();

    String getGroupKeyChatIds();

    void getHomePageOnCall(IGetDataCallback<List<HomeOnCallInfo>> iGetDataCallback);

    Map<String, String> getIMFAutoInitModuleConfigMap();

    Map<String, String> getIMFThirdPartyModuleConfigMap();

    Map<String, String> getIMFThirdPartyPrefixModuleConfigMap();

    Collection<? extends String> getIMSyncKeys();

    Message getLastMessage(String str);

    Chat getLocalChat(String str);

    ChatSetting getLocalChatSetting(String str);

    Map<String, Chat> getLocalChats(List<String> list);

    com.ss.android.lark.chat.entity.chatter.Chatter getLocalChatter(String str);

    Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> getLocalChatters(List<String> list);

    Message getLocalMessage(String str);

    ShortcutInfoLoadResult getLocalShortcuts();

    com.ss.android.lark.chat.entity.chatter.Chatter getLoginChatter();

    com.ss.android.lark.chat.entity.chatter.Chatter getLoginChatter(boolean z);

    void getLoginChatter(IGetDataCallback<com.ss.android.lark.chat.entity.chatter.Chatter> iGetDataCallback);

    void getLoginChatter(boolean z, IGetDataCallback<com.ss.android.lark.chat.entity.chatter.Chatter> iGetDataCallback);

    int getLoginUserAuthorityDeniedCode();

    int getLoginUserAuthorityDeniedReason();

    int getMaxMessageWidth(Context context, boolean z);

    Message getMessage(C14928Entity entity, String str);

    void getMessagesByIds(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback);

    void getMoneyModule(UIGetPluginCallback<IMoneyModule> dVar);

    String getMoneyPluginPackageName();

    void getOnCallChatId(String str, String str2, float f, float f2, IGetDataCallback<String> iGetDataCallback);

    void getOnCallChatId(String str, String str2, IGetDataCallback<String> iGetDataCallback);

    void getOnCallChatId(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

    void getOnCallChatId(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    OpenChat getOpenChatById(String str);

    void getOpenChatById(String str, IGetDataCallback<Chat> iGetDataCallback);

    String getOtherP2PChatterId(Chat chat);

    int getOtherUserAuthorityDeniedCode();

    int getOtherUserAuthorityDeniedReason();

    Chat getP2pChatByChatterId(String str);

    void getP2pChatCreatedByChatterId(String str, IGetDataCallback<Chat> iGetDataCallback);

    int getPreloadChatChatterCount();

    ILaunchTask getPreloadXmlTask();

    List<String> getRecentReactionList();

    void getRecogniseSpansResult(String str, String str2, SyncDataStrategy syncDataStrategy, C37030f.AbstractC37031a aVar);

    RichText getRichText(com.bytedance.lark.pb.basic.v1.RichText richText);

    String getShareGroupChatNotifyDisplay(Message message);

    String getSourcePlusMenu();

    String getTenantGuideNewUserKey();

    String getTenantGuideV1Key();

    String getTenantGuideV2Key();

    String getTenantGuideV3Key();

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    Image getThumbnailShowImage(ImageContent imageContent);

    Image getThumbnailShowImage(MediaContent mediaContent);

    void getTranslateLanguages(IGetDataCallback<TranslateLanguageSetting> iGetDataCallback);

    void getTriggerCode(Function1<? super String, Unit> function1);

    void getUpdateMineNamePermission(IGetDataCallback<Boolean> iGetDataCallback);

    String getUploadAuthorizationTip();

    void getUrlInlineFromContent(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback);

    Map<String, Map<String, UrlPreviewEntity>> getUrlPreviewsFromCache(Map<String, List<String>> map);

    String getUrlWithTriggerCode(String str, String str2);

    String getUserAuthorityControledTip();

    List<String> getWholeReactionList();

    void gotoLeanMode();

    void gotoOnCallActivity(Context context, String str);

    void imfInitProcessorDoInit(String str);

    void initAuditModule();

    void initAuditSdk();

    void initCardStyle();

    void initFeed();

    void initFragmentManager(AbstractC36551c.AbstractC36552a aVar);

    void initLeanModule();

    void initProcessorDoInit(String str);

    void initScreenShotReceiver();

    void ipcOpenChatByChatterId(String str);

    boolean isAllowCreateVC(OpenChat openChat);

    boolean isAndInflaterEnabled();

    boolean isCheckSecretPermission();

    boolean isCorrectionFgEnable();

    boolean isEnableJatoBoost();

    boolean isEnableJatoBoostRenderThread();

    boolean isFeedDataEmpty(FeedCard.FeedType feedType);

    boolean isFeedPage(Fragment fragment);

    boolean isLeanModeOn();

    boolean isPreloadEnabled();

    boolean isSecretOpen();

    boolean isShortcut(String str);

    boolean isSmartComposeEnable();

    boolean isSmartReplyEnable();

    void joinGroupChat(Context context, String str, List<String> list, int i, AbstractC44896a aVar);

    void joinGroupViaLink(String str, IGetDataCallback<Chat> iGetDataCallback);

    void joinGroupViaQRCode(String str, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

    void joinGroupViaShare(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar);

    void joinGroupViaToken(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar);

    void launchCustomerService(Context context, Params params, AbstractC29624a aVar);

    void loadSystemMessageTemplates(String str, boolean z);

    void makeCall(Activity activity, String str);

    void makeUserCall(Activity activity, String str, String str2);

    MessageApi messageApi();

    void onBOESpecialConifig();

    void onCheckedAuthorizationFailed(Context context, int i, DialogInterface.OnDismissListener onDismissListener);

    void onCheckedAuthorizationFailed(Context context, String str, DialogInterface.OnDismissListener onDismissListener);

    void onCheckedAuthorizationFailedToast(Context context, int i);

    void onSwitchTenantUserClick();

    void onTenantStateChanged(boolean z);

    void openBulletSchema(Context context, String str);

    void openChat(Context context, ChatBundle chatBundle);

    void openChatByChatIdFromIPC(String str);

    void openChatByChatterIdFromIPC(String str);

    void openCreateGroupChatModule(Context context, String str);

    void openCreateGroupChatModuleForForward(C36516a aVar, int i);

    void openCustomServiceChat(Context context);

    void openFavoritePage(Context context);

    void openLocationStandAlone(Activity activity, LocationInfo locationInfo);

    void openLocationStandAlone(Activity activity, String str, String str2, double d, double d2, int i);

    void openMergeForward(Activity activity, MergeForwardContent mergeForwardContent, FavoriteMessageInfo favoriteMessageInfo, int i, int i2, String str);

    void openMoneyH5Page(Context context, String str);

    void openPhoneAmountEditPage(Activity activity, String str);

    void openStickerSetDetail(Context context, String str);

    void openThread(Context context, C29604ae aeVar);

    void openTourSpotlightChat(String str, int i);

    void openUrlToPlayVideo(Context context, View view, String str, String str2, String str3, String str4, int i, Image image, boolean z);

    com.bytedance.lark.pb.basic.v1.RichText parsePbFromRichText(RichText richText);

    UrlPreviewEntity parseUrlPreviewEntityFromPb(com.bytedance.lark.pb.basic.v1.UrlPreviewEntity urlPreviewEntity);

    Map<String, PreviewHangPoint> parseUrlPreviewHangPointFromPb(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2);

    void peakFeedCard(String str);

    void peakFeedCard(String str, FeedCard.Type type);

    void pickGroupMemberForResult(BaseFragment baseFragment, String str, List<String> list, int i);

    void preloadChatData(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void preloadFeedUIView(Context context);

    Collection<? extends AbstractNotification> provideIMNotificationImpls();

    void pullBots(IGetDataCallback<BotsResponse> iGetDataCallback);

    void pullBots(IGetDataCallback<BotsResponse> iGetDataCallback, int i);

    void putDepartmentGroupChat(String str, List<String> list, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

    void putForwardMessage(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback);

    void putMergeForwardMessage(List<String> list, List<String> list2, Content content, boolean z, boolean z2, String str, boolean z3, String str2, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback);

    void putOneByOneForwardMessage(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback);

    void putP2PChat(boolean z, String str, ChatBundle.C29592c cVar, IGetDataCallback<Chat> iGetDataCallback);

    void putP2PChats(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback);

    void putReactionPassThrough(String str, IGetDataCallback<Integer> iGetDataCallback);

    void putReviewAction(Parameters parameters, String str);

    void putShortcuts(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback, int i);

    void queryPhoneNumber(Activity activity, String str);

    void queryPhoneNumber(Activity activity, String str, IGetDataCallback<String> iGetDataCallback);

    void registerBadgeChangeListener(String str, AbstractC29616i iVar);

    void registerCancelDingNotificationListener();

    void registerFeedLoadListener(AbstractC29618k kVar);

    void registerLaunchListener(AbstractC29620m mVar);

    void removeAddressBookInfo();

    void removeFeedFirstLoadListener(AbstractC29617j jVar);

    void removeLeanModeChangeListener(AbstractC29621n nVar);

    void removePreviewCacheObserver(IPreviewCache.PreviewCacheObserver aVar);

    void removePushChatterListener(AbstractC29623p pVar);

    void removePushMessageListener(AbstractC29626r rVar);

    void removePushMineChatterChangedListener(AbstractC29627s sVar);

    void removePushTranslateLanguageSettingListener(AbstractC29628t tVar);

    void requestScreenShot(Context context, LKPType lKPType, IScreenshotCallBack uVar);

    void resetChatCache();

    void resetFeedCache();

    void saveImage2Stickers(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    void seeMoreDefinitions(Context context, String str, String str2);

    void selectFreeBusyMember(Activity activity, String str, ArrayList<String> arrayList, int i);

    void selectFreeBusyMemberFragment(C36516a<DrawerParams> aVar, String str, ArrayList<String> arrayList, int i);

    void sendCallSelectClick(Chat chat, int i);

    void sendChatCallSelectView(Chat chat);

    void sendChatDocsClicked(String str, DocResult docResult);

    void sendImages(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback);

    void sendMessage(C29599ac acVar, IGetDataCallback<String> iGetDataCallback);

    void sendMessage(C29601ad adVar);

    void sendMessage(C29601ad adVar, IGetDataCallback<String> iGetDataCallback);

    void sendMessage(C29613e eVar);

    void sendMessage(C29613e eVar, IGetDataCallback<String> iGetDataCallback);

    void sendMessage(C29629v vVar);

    void sendMessage(C29629v vVar, IGetDataCallback<String> iGetDataCallback);

    void sendMessage(C29631w wVar);

    void sendMessage(C29631w wVar, IGetDataCallback<String> iGetDataCallback);

    void sendMessage(C29634z zVar, IGetDataCallback<String> iGetDataCallback);

    <T extends AbstractC34011b> void sendMessage(T t);

    <T extends AbstractC34011b> void sendMessage(T t, IGetDataCallback<String> iGetDataCallback);

    void sendOnClickPhone();

    void sendOnClickVoice();

    void sendOnClickVoip();

    void sendPhoneOnClickCall();

    void sendPhoneOnClickCancel();

    void sendPhoneOnClickVideo();

    void sendShareAppMessages(List<String> list, int i, String str, ShareAppCardLink abVar, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    void sendUrlClick(String str, String str2, String str3);

    void sendVoiceBlock();

    void setChatterAlias(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

    void setDisAutoTranslateLanguages(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    void setGlobalAutoTranslateScope(int i, IGetDataCallback<Boolean> iGetDataCallback);

    void setLoginUser(com.ss.android.lark.chat.entity.chatter.Chatter chatter);

    void setLoginUserId(String str);

    void setMessageCardBackground(View view, int i, View view2, int[] iArr);

    void setMineName(String str, IGetDataCallback<String> iGetDataCallback);

    void setTargetTranslateLanguage(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void setTranslateDisplayRule(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback);

    void shareFileCopyAsMessage(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback);

    void shareStickerSet(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    void shareThreadTopic(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback);

    void showAppRatingDialogIfNeed(Activity activity);

    void showChatChatterApplyDialog(Context context, ChatSettingApplyWay chatSettingApplyWay, AbstractC29611c cVar);

    void showDingAddressBookGuideTipsIfNeed(Activity activity);

    void showEnterpriseTopic(String str, String str2, String str3, RectF rectF, View view, String str4, GetEnterpriseTopicRequest.Scene scene, String str5, IGetDataCallback<String> iGetDataCallback);

    void showLKPLeanModeAlertDialog(Activity activity, IGetDataCallback<Boolean> iGetDataCallback);

    void showLocationDialog(Activity activity, String str, double d, double d2, int i);

    void showMemberWithoutAdd(Activity activity, List<String> list, IGetDataCallback<List<ChatChatter>> iGetDataCallback);

    void showNavigateDialog(Activity activity, LocationInfo locationInfo);

    void showNoIMPermissionDialog(String str);

    void showOnCallAvatarInImageView(Application application, String str, String str2, String str3, ImageView imageView, int i, int i2);

    void showPhoneCallDialog(Activity activity, String str, String str2);

    void showPhoneIdentifyDialog(Activity activity, String str);

    void showResourceDeletedByAdminDialog(Context context, Boolean bool, DialogInterface.OnDismissListener onDismissListener);

    void showSelectContact(Activity activity, C36516a aVar, String str, Chat chat, boolean z, int i);

    void showSquareMessageStickerThumb(Context context, ImageView imageView, StickerContent stickerContent);

    void startConversationBoxActivity(Context context, String str);

    void startCreateF2FGroup(Activity activity);

    void startGroupSetting(Context context, String str, int i, boolean z, boolean z2, boolean z3);

    void startMessageCardPreload();

    void statPinForwardConfirmEvent();

    Map<String, Chat> syncGetChatsByIds(List<String> list);

    Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> syncGetChattersByIds(List<String> list);

    Map<String, Message> syncGetMessageByIds(List<String> list);

    Chat syncGetP2pChatCreatedByChatterId(String str, String str2);

    Map<String, ChatChatter> syncPullChatChattersByIds(String str, List<String> list);

    void syncPullUrlPreviewChattersList(String str, IGetDataCallback<ArrayList<String>> iGetDataCallback);

    void syncReactionOrder();

    void syncReactionOrder(IGetDataCallback<Boolean> iGetDataCallback);

    void transformRichTextByPreview(RichText richText, Map<String, PreviewHangPoint> map);

    void transmitFavorite(String str, List<String> list, List<C29612d> list2, IGetDataCallback<Map<String, String>> iGetDataCallback);

    boolean tryOpenLynxPage(Context context, String str);

    void unInitAuditModule();

    void unInitFeedModule();

    void unInitFragmentManager();

    void unInitLeanModule();

    void unInitScreenShotReceiver();

    void unRegisterBadgeChangeListener(String str, AbstractC29616i iVar);

    void unregisterFeedLoadListener(AbstractC29618k kVar);

    void updateAvatar(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    void updateMineAvatar(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chatter.Chatter> iGetDataCallback);

    void updateReactionOrder(String str);

    void updateTimeZone(String str);
}
