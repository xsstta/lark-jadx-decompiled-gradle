package com.ss.android.lark.integrator.im.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.lynxlib.bullet.BulletHolder;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Message;
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
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.p1304b.C28320c;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.ai.p1327a.C28523a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.AbstractC29616i;
import com.ss.android.lark.biz.im.api.AbstractC29617j;
import com.ss.android.lark.biz.im.api.AbstractC29618k;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
import com.ss.android.lark.biz.im.api.AbstractC29622o;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29626r;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.biz.im.api.BotsResponse;
import com.ss.android.lark.biz.im.api.C29599ac;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.C29612d;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29629v;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.C29634z;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatQRCodeInfoResponse;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.HomeOnCallInfo;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.biz.im.api.MessageApi;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.biz.im.api.ShortcutInfoLoadResult;
import com.ss.android.lark.biz.im.api.StickerContent;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.biz.im.api.param.AbstractC29624a;
import com.ss.android.lark.biz.im.api.param.Params;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.biz.im.extension.ImExtension;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.api.service.IPreviewService;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
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
import com.ss.android.lark.chat.service.IChatManisService;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.model.p1863c.C37710a;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.container.ExtensionManager;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import com.ss.android.lark.integrator.im.groupmember.C39633a;
import com.ss.android.lark.integrator.im.money.BulletModuleProvider;
import com.ss.android.lark.integrator.im.money.MoneyModuleProvider;
import com.ss.android.lark.integrator.im.oncall.OnCallModuleProvider;
import com.ss.android.lark.integrator.im.p2021a.C39425a;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import com.ss.android.lark.integrator.im.p2025e.C39583a;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import com.ss.android.lark.integrator.im.p2027g.C39604a;
import com.ss.android.lark.integrator.im.p2028h.AbstractC39636b;
import com.ss.android.lark.integrator.im.p2029i.C39640a;
import com.ss.android.lark.integrator.im.p2032k.C39705a;
import com.ss.android.lark.integrator.im.p2033l.p2034a.C39712a;
import com.ss.android.lark.integrator.im.p2035m.C39715a;
import com.ss.android.lark.integrator.im.p2035m.C39718b;
import com.ss.android.lark.integrator.im.p2037o.C39742a;
import com.ss.android.lark.integrator.im.p2038p.C39748a;
import com.ss.android.lark.integrator.im.p2040r.C39766a;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.p2567s.p2568a.p2572d.C53201a;
import com.ss.android.lark.p2567s.p2568a.p2572d.C53202b;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ClaymoreImpl(IIMApi.class)
public class IMApiImpl implements IIMApi {
    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53201a.f131533a;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53201a.f131534b;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53201a.f131535c;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isEnableJatoBoost() {
        return C37713d.f96682l;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isEnableJatoBoostRenderThread() {
        return C37713d.f96683m;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public MessageApi messageApi() {
        return MessageApiImpl.f101242a;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public <T extends AbstractC34011b> void sendMessage(T t) {
        AbstractC39484a.m156004a().mo104258i().mo121089a(t);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public <T extends AbstractC34011b> void sendMessage(T t, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(t, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29634z zVar, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(zVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addShareGroupQRCodeHitPoint() {
        C39452a.m155775a().mo127240b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public List<AbstractC28490a> getAbTestExperiments() {
        return C29407b.m108182E();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<? extends String, ? extends Boolean> getChatFeatureConfigMap() {
        return C29407b.m108181D();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<? extends String, ? extends Boolean> getChatSettingFeatureConfigMap() {
        return ChatSettingModule.m133641c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<? extends String, ? extends C41149a> getFeedAppConfigMap() {
        return C37262a.m146728q();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getMoneyPluginPackageName() {
        return MoneyModuleProvider.m157726a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public ILaunchTask getPreloadXmlTask() {
        return new PreloadXMLTask();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void gotoLeanMode() {
        C39705a.m157599a().mo148661c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initCardStyle() {
        C39715a.m157675a();
        C45294c.m179872e();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initFeed() {
        C39640a.m157299a().mo136977b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initScreenShotReceiver() {
        C39712a.m157640a().mo149466b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isAndInflaterEnabled() {
        AbstractC39484a.m156004a();
        return C29407b.m108183F();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void onSwitchTenantUserClick() {
        C39640a.m157299a().mo136992r();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void registerCancelDingNotificationListener() {
        C39587a.m157080a().mo135092f();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void resetChatCache() {
        AbstractC39484a.m156004a().mo104271v();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void startMessageCardPreload() {
        C39715a.m157675a().mo160040d();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void statPinForwardConfirmEvent() {
        C39748a.m157770a().mo177246a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unInitFeedModule() {
        C39640a.m157299a().mo136979c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unInitFragmentManager() {
        AbstractC39484a.m156004a().mo104186M();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unInitScreenShotReceiver() {
        C39712a.m157640a().mo149467c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void checkNeedReloadDingData() {
        C39587a.m157080a().mo135089c().mo135277e();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC29524c createChatFrame() {
        return AbstractC39484a.m156004a().mo104269t();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC29524c createThreadFrame() {
        return AbstractC39484a.m156004a().mo104270u();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void deleteChatterWorkStatus() {
        AbstractC39484a.m156004a().mo104256g().mo121206b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void dismissEnterpriseTopicCard() {
        C28523a.m104540a().mo101549d().mo101680a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean enableFeedMuteFilter() {
        return C39640a.m157299a().mo136983g().mo137458g();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void fetchEmojis() {
        AbstractC39484a.m156004a().mo104262m().mo121386a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public View findMoreBtn() {
        return C39640a.m157299a().mo136991p();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public List<String> getAllRecentReactionList() {
        return AbstractC39484a.m156004a().mo104261l().mo121404d();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getCallMenuVoiceCallIcon() {
        if (DesktopUtil.m144307b()) {
            return R.drawable.ic_svg_call_menu_voice_call_desktop;
        }
        return R.drawable.ud_icon_call_outlined;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC32808a getChannelParser() {
        return AbstractC39484a.m156004a().mo104179C();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public IChatParser getChatParser() {
        return AbstractC39484a.m156004a().mo104275z();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public IChatterAvatarService getChatterAvatarService() {
        return AbstractC39484a.m156004a().mo104257h();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public IChatterParser getChatterParser() {
        return AbstractC39484a.m156004a().mo104177A();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getCreateGroupChatPackageName() {
        return CreateGroupChatModuleProvider.m157168a().getPackageName();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public IDiskCleanTask getDiskCleanTask() {
        return AbstractC39484a.m156004a().mo104185L();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getFavoritePageName() {
        return AbstractC39484a.m156004a().mo104180G();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getFeedTabPageName() {
        return C39640a.m157299a().mo136983g().mo137459h();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getFileUploadAuthorizatedDenyCode() {
        return AbstractC39484a.m156004a().mo104187N();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getFirstTenantChatId() {
        return C39640a.m157299a().mo136983g().mo137463l();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getGroupKeyChatIds() {
        return C39633a.m157280a().mo158802b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, String> getIMFAutoInitModuleConfigMap() {
        return C39603g.m157159a().getIMFAutoInitModuleConfigMap();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, String> getIMFThirdPartyModuleConfigMap() {
        return C39603g.m157159a().getIMFThirdPartyModuleConfigMap();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, String> getIMFThirdPartyPrefixModuleConfigMap() {
        return C39603g.m157159a().getIMFThirdPartyPrefixModuleConfigMap();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public ShortcutInfoLoadResult getLocalShortcuts() {
        return C39640a.m157299a().mo136982f().mo139424a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chatter getLoginChatter() {
        return AbstractC39484a.m156004a().mo104256g().mo121186a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getLoginUserAuthorityDeniedCode() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104075c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getLoginUserAuthorityDeniedReason() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104079e();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getOtherUserAuthorityDeniedCode() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104077d();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getOtherUserAuthorityDeniedReason() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104080f();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getPreloadChatChatterCount() {
        return C39452a.m155775a().mo127245d();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public List<String> getRecentReactionList() {
        return AbstractC39484a.m156004a().mo104261l().mo121402b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getSourcePlusMenu() {
        return CreateGroupChatModuleProvider.m157168a().getSourcePlusMenu();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getTenantGuideNewUserKey() {
        return C39640a.m157299a().mo136990n();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getTenantGuideV1Key() {
        return C39640a.m157299a().mo136988l();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getTenantGuideV2Key() {
        return C39640a.m157299a().mo136987k();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getTenantGuideV3Key() {
        return C39640a.m157299a().mo136989m();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getUploadAuthorizationTip() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104067a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getUserAuthorityControledTip() {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104073b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public List<String> getWholeReactionList() {
        return AbstractC39484a.m156004a().mo104261l().mo121403c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initAuditModule() {
        AuditModuleProvider.f100784c.mo143320a().mo104054b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initAuditSdk() {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104128a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initLeanModule() {
        C39705a.m157599a().mo148659b().mo148650a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isCheckSecretPermission() {
        return CreateGroupChatModuleProvider.m157168a().isCheckSecretPermission();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isCorrectionFgEnable() {
        return C28523a.m104540a().mo101552g();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isLeanModeOn() {
        return C39705a.m157599a().mo148662d();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isPreloadEnabled() {
        return AbstractC39484a.m156004a().mo104183J();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isSecretOpen() {
        return CreateGroupChatModuleProvider.m157168a().isSecretOpen();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isSmartComposeEnable() {
        return C28523a.m104540a().mo101551f();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isSmartReplyEnable() {
        return C28523a.m104540a().mo101550e();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void onBOESpecialConifig() {
        C28320c.m103910a("http://");
        C28320c.m103912b("rc-boe.snssdk.com");
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removeAddressBookInfo() {
        C39587a.m157080a().mo135090d().mo135268a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void resetFeedCache() {
        C39640a.m157299a().mo136983g().mo137457f();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendOnClickPhone() {
        C39742a.m157747a().mo176936b().mo176948b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendOnClickVoice() {
        C39742a.m157747a().mo176936b().mo176949c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendOnClickVoip() {
        C39742a.m157747a().mo176936b().mo176950d();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendPhoneOnClickCall() {
        C39742a.m157747a().mo176936b().mo176947a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendPhoneOnClickCancel() {
        C39742a.m157747a().mo176936b().mo176952f();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendPhoneOnClickVideo() {
        C39742a.m157747a().mo176936b().mo176951e();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendVoiceBlock() {
        C39742a.m157747a().mo176936b().mo176953g();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void syncReactionOrder() {
        AbstractC39484a.m156004a().mo104261l().mo121399a();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unInitAuditModule() {
        AuditModuleProvider.f100784c.mo143320a().mo104055c();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unInitLeanModule() {
        C39705a.m157599a().mo148659b().mo148651b();
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public List<LKPluginConfig> getAllPluginConfigs() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(C37262a.m146729s());
        linkedList.addAll(C29407b.m108184Q());
        return linkedList;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Collection<? extends AbstractNotification> provideIMNotificationImpls() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AbstractC39484a.m156004a().mo104272w());
        arrayList.addAll(C39587a.m157080a().mo135091e());
        return arrayList;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Collection<? extends String> getIMSyncKeys() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(AbstractC39484a.m156004a().mo104268s());
        hashSet.addAll(C28523a.m104540a().mo101547b());
        hashSet.addAll(C39640a.m157299a().mo136986j());
        hashSet.addAll(CreateGroupChatModuleProvider.m157168a().getSyncKeys());
        return hashSet;
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getMoneyModule(UIGetPluginCallback<IMoneyModule> dVar) {
        MoneyModuleProvider.m157727a(dVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initProcessorDoInit(String str) {
        C53202b.m205841a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addExtension(ImExtension gVar) {
        ExtensionManager.f101030a.mo143622a(gVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addLeanModeChangeListener(AbstractC29621n nVar) {
        C39705a.m157599a().mo148656a(nVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addPreviewCacheObserver(IPreviewCache.PreviewCacheObserver aVar) {
        AbstractC39484a.m156004a().mo104213a(aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addPushChatterListener(AbstractC29623p pVar) {
        AbstractC39484a.m156004a().mo104214a(pVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addPushMessageListener(AbstractC29626r rVar) {
        AbstractC39484a.m156004a().mo104215a(rVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addPushMineChatterChangedListener(AbstractC29627s sVar) {
        AbstractC39484a.m156004a().mo104216a(sVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addPushTranslateLanguageSettingListener(AbstractC29628t tVar) {
        AbstractC39484a.m156004a().mo104217a(tVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void fetchLeanModeStatusAndAuthority(boolean z) {
        C39705a.m157599a().mo148657a(z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getTriggerCode(Function1<? super String, Unit> function1) {
        C39715a.m157675a().mo160037a(function1);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void imfInitProcessorDoInit(String str) {
        C39603g.m157159a().imfInitProcessorDoInit(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void initFragmentManager(AbstractC36551c.AbstractC36552a aVar) {
        AbstractC39484a.m156004a().mo104221a(aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void onTenantStateChanged(boolean z) {
        C39640a.m157299a().mo136976a(z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openCustomServiceChat(Context context) {
        AbstractC39484a.m156004a().mo104236b(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openFavoritePage(Context context) {
        AbstractC39484a.m156004a().mo104248c(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void registerLaunchListener(AbstractC29620m mVar) {
        C39640a.m157299a().mo136973a(mVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removeLeanModeChangeListener(AbstractC29621n nVar) {
        C39705a.m157599a().mo148660b(nVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removePreviewCacheObserver(IPreviewCache.PreviewCacheObserver aVar) {
        AbstractC39484a.m156004a().mo104237b(aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removePushChatterListener(AbstractC29623p pVar) {
        AbstractC39484a.m156004a().mo104238b(pVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removePushMessageListener(AbstractC29626r rVar) {
        AbstractC39484a.m156004a().mo104239b(rVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removePushMineChatterChangedListener(AbstractC29627s sVar) {
        AbstractC39484a.m156004a().mo104240b(sVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removePushTranslateLanguageSettingListener(AbstractC29628t tVar) {
        AbstractC39484a.m156004a().mo104241b(tVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendChatCallSelectView(Chat chat) {
        AbstractC39484a.m156004a().mo104242b(chat);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showAppRatingDialogIfNeed(Activity activity) {
        C39425a.m155694a().mo108066a(activity);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showNoIMPermissionDialog(String str) {
        AbstractC39484a.m156004a().mo104249c(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void startCreateF2FGroup(Activity activity) {
        CreateGroupChatModuleProvider.m157168a().startCreateF2FGroup(activity);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addAddressBookInfo(IGetDataCallback<?> iGetDataCallback) {
        C39587a.m157080a().mo135090d().mo135269a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addFeedFirstLoadListener(AbstractC29617j jVar) {
        C39640a.m157299a().mo136983g().mo137445a(jVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void auditImageDownload(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104130b(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void auditLinkEvent(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104129a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void auditMediaDownload(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104131c(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void auditOpenMiniAppEvent(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104134f(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void auditScreenRecordingEvent(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104136h(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void auditScreenShotEvent(String str) {
        AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104135g(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean checkLoginUserExistedInLocalChat(Chat chat) {
        return AbstractC39484a.m156004a().mo104251d().mo121044b(chat);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String checkUrl(String str) {
        return C39583a.m157071a().mo141221b().mo141226a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, OpenChatter> fromPbChatterMap(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
        return AbstractC39484a.m156004a().mo104177A().mo126082a(map);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public C29597a generateMergeForwardInfo(MergeForwardContent mergeForwardContent) {
        return AbstractC39484a.m156004a().mo104247c().mo121388a(mergeForwardContent);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getAliasDisplayName(Chatter chatter) {
        return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.ALIAS_NAME);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getAuditDisplayMsg(int i) {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104068a(i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<? extends String, ? extends AbstractC29186b> getChatAppLinkHandlers(Context context) {
        return AbstractC39484a.m156004a().mo104199a(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chat getChatById(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chat getChatByIdFromNet(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo121032b(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getChatLastPosition(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo121052d(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public ChatWindowPrepareData getChatLauncherInfo(String str) {
        return AbstractC39484a.m156004a().mo104234b(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<? extends String, ? extends AbstractC29186b> getChatSettingAppLinkHandlers(Context context) {
        return C39452a.m155775a().mo127225a(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chatter getChatter(com.bytedance.lark.pb.basic.v1.Chatter chatter) {
        return AbstractC39484a.m156004a().mo104177A().getChatter(chatter);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chatter getChatterById(String str) {
        return AbstractC39484a.m156004a().mo104256g().mo121203b(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Chatter> getChatterMap(Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map) {
        return AbstractC39484a.m156004a().mo104177A().getChatterMap(map);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Chatter> getChatterMapFromEntity(C14928Entity entity) {
        return AbstractC39484a.m156004a().mo104177A().getChatterMapFromEntity(entity);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC44552i getCreateGroupChatTabPageSpec(Context context) {
        return CreateGroupChatModuleProvider.m157168a().getTabPageSpec(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getDelayedFeed(IGetDataCallback<List<FeedPreviewInfo>> iGetDataCallback) {
        C39640a.m157299a().mo136981e().mo139437b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getDocInlineBlueIcon(DocType docType) {
        return C29990c.m110930b().mo134513L().mo134667a(docType);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<? extends String, ? extends AbstractC29186b> getEduAppLinkHandlers(Context context) {
        return C39604a.m157161a().mo136303a(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC44552i getFavoriteTabPageSpec(Context context) {
        return AbstractC39484a.m156004a().mo104252d(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getHomePageOnCall(IGetDataCallback<List<HomeOnCallInfo>> iGetDataCallback) {
        OnCallModuleProvider.f101287a.mo143990a().mo169917a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Message getLastMessage(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo121068h(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chat getLocalChat(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo121056e(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public ChatSetting getLocalChatSetting(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo121060f(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Chat> getLocalChats(List<String> list) {
        return AbstractC39484a.m156004a().mo104251d().mo120991a(list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chatter getLocalChatter(String str) {
        return AbstractC39484a.m156004a().mo104256g().mo121211c(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Chatter> getLocalChatters(List<String> list) {
        return AbstractC39484a.m156004a().mo104256g().mo121213c(list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Message getLocalMessage(String str) {
        return AbstractC39484a.m156004a().mo104258i().mo121080a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public OpenChat getOpenChatById(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getOtherP2PChatterId(Chat chat) {
        return AbstractC39484a.m156004a().mo104251d().mo120990a(chat);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chat getP2pChatByChatterId(String str) {
        return AbstractC39484a.m156004a().mo104251d().mo121064g(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public RichText getRichText(com.bytedance.lark.pb.basic.v1.RichText richText) {
        return AbstractC39484a.m156004a().mo104267r().mo121411a(richText);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getShareGroupChatNotifyDisplay(Message message) {
        return AbstractC39484a.m156004a().mo104264o().mo121392a(message);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Image getThumbnailShowImage(ImageContent imageContent) {
        return AbstractC39484a.m156004a().mo104197a(imageContent);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getTranslateLanguages(IGetDataCallback<TranslateLanguageSetting> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104259j().mo121377a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getUpdateMineNamePermission(IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121214c(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Map<String, UrlPreviewEntity>> getUrlPreviewsFromCache(Map<String, List<String>> map) {
        return AbstractC39484a.m156004a().mo104201a(map);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void ipcOpenChatByChatterId(String str) {
        AbstractC39484a.m156004a().mo104255f().openChatByChatterId(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isAllowCreateVC(OpenChat openChat) {
        return C39452a.m155775a().mo127239a(openChat);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isFeedDataEmpty(FeedCard.FeedType feedType) {
        return C39640a.m157299a().mo136983g().mo137449a(feedType);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isFeedPage(Fragment fragment) {
        return C39640a.m157299a().mo136983g().mo137448a(fragment);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean isShortcut(String str) {
        return C39640a.m157299a().mo136982f().mo139431b(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openChatByChatIdFromIPC(String str) {
        IChatManisService f = AbstractC39484a.m156004a().mo104255f();
        if (f != null) {
            f.openChatByChatId(str);
        }
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openChatByChatterIdFromIPC(String str) {
        IChatManisService f = AbstractC39484a.m156004a().mo104255f();
        if (f != null) {
            f.openChatByChatterId(str);
        }
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public com.bytedance.lark.pb.basic.v1.RichText parsePbFromRichText(RichText richText) {
        return AbstractC39484a.m156004a().mo104267r().mo121410a(richText);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public UrlPreviewEntity parseUrlPreviewEntityFromPb(com.bytedance.lark.pb.basic.v1.UrlPreviewEntity urlPreviewEntity) {
        return AbstractC39484a.m156004a().mo104195a(urlPreviewEntity);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void peakFeedCard(String str) {
        C39640a.m157299a().mo136981e().mo139435a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void preloadFeedUIView(Context context) {
        C39640a.m157299a().mo136983g().mo137444a(context);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void pullBots(IGetDataCallback<BotsResponse> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121207b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void registerFeedLoadListener(AbstractC29618k kVar) {
        C39640a.m157299a().mo136983g().mo137446a(kVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void removeFeedFirstLoadListener(AbstractC29617j jVar) {
        C39640a.m157299a().mo136983g().mo137451b(jVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setLoginUser(Chatter chatter) {
        AbstractC39484a.m156004a().mo104256g().mo121194a(chatter);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setLoginUserId(String str) {
        AbstractC39484a.m156004a().mo104256g().mo121195a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showDingAddressBookGuideTipsIfNeed(Activity activity) {
        C39587a.m157080a().mo135090d().mo135270a(activity);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Chat> syncGetChatsByIds(List<String> list) {
        return AbstractC39484a.m156004a().mo104251d().mo121033b(list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Chatter> syncGetChattersByIds(List<String> list) {
        return AbstractC39484a.m156004a().mo104256g().mo121189a(list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, Message> syncGetMessageByIds(List<String> list) {
        return AbstractC39484a.m156004a().mo104258i().mo121083a(list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unregisterFeedLoadListener(AbstractC29618k kVar) {
        C39640a.m157299a().mo136983g().mo137452b(kVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void updateReactionOrder(String str) {
        AbstractC39484a.m156004a().mo104261l().mo121401a(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void updateTimeZone(String str) {
        AbstractC39484a.m156004a().mo104256g().mo121218d(str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chatter getLoginChatter(boolean z) {
        return AbstractC39484a.m156004a().mo104256g().mo121187a(z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Image getThumbnailShowImage(MediaContent mediaContent) {
        return AbstractC39484a.m156004a().mo104198a(mediaContent);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29601ad adVar) {
        AbstractC39484a.m156004a().mo104258i().mo121089a(adVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void syncReactionOrder(IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104261l().mo121400a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getLoginChatter(IGetDataCallback<Chatter> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121190a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29613e eVar) {
        AbstractC39484a.m156004a().mo104258i().mo121089a(eVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29629v vVar) {
        AbstractC39484a.m156004a().mo104258i().mo121089a(vVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29631w wVar) {
        AbstractC39484a.m156004a().mo104258i().mo121089a(wVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void cacheDrawable(String str, Drawable drawable) {
        C37710a.m148264a(str, drawable);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void deleteMessagesByIds(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104228a(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void emergencyCall(Activity activity, String str) {
        C39742a.m157747a().mo176940d(activity, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getDocFromUrlContent(String str, IGetDataCallback<DocResult> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104225a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getUrlInlineFromContent(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104245b(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void makeCall(Activity activity, String str) {
        C39742a.m157747a().mo176930a(activity, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openBulletSchema(Context context, String str) {
        BulletModuleProvider.m157725a();
        BulletHolder.m59044a(context, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openChat(Context context, ChatBundle chatBundle) {
        AbstractC39484a.m156004a().mo104206a(context, chatBundle);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openCreateGroupChatModule(Context context, String str) {
        CreateGroupChatModuleProvider.m157168a().openCreateGroupChatModule(context, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openCreateGroupChatModuleForForward(C36516a aVar, int i) {
        CreateGroupChatModuleProvider.m157168a().openCreateGroupChatModuleForForward(aVar, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openLocationStandAlone(Activity activity, LocationInfo locationInfo) {
        C39718b.m157699a().mo149717b(activity, locationInfo);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openPhoneAmountEditPage(Activity activity, String str) {
        C39742a.m157747a().mo176933a((Context) activity, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openStickerSetDetail(Context context, String str) {
        C39766a.m157868a().mo187806a(context, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openThread(Context context, C29604ae aeVar) {
        AbstractC39484a.m156004a().mo104207a(context, aeVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void queryPhoneNumber(Activity activity, String str) {
        C39742a.m157747a().mo176939c(activity, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendCallSelectClick(Chat chat, int i) {
        AbstractC39484a.m156004a().mo104218a(chat, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showNavigateDialog(Activity activity, LocationInfo locationInfo) {
        C39718b.m157699a().mo149711a(activity, locationInfo);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showPhoneIdentifyDialog(Activity activity, String str) {
        C39742a.m157747a().mo176937b(activity, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void transformRichTextByPreview(RichText richText, Map<String, PreviewHangPoint> map) {
        AbstractC39484a.m156004a().mo104223a(richText, map);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean tryOpenLynxPage(Context context, String str) {
        return MoneyModuleProvider.m157728a(context, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void cardAction(String str, int i) {
        C28523a.m104540a().mo101549d().mo101689a(str, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void chatBoxHitPoint(Chat chat, String str) {
        C39640a.m157299a().mo136984h().mo137352a(chat, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean checkImageDownloadAuthorization(String str, boolean z) {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104072a(str, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void checkSelfInChat(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121051c(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public boolean checkVideoDownloadAuthorization(String str, boolean z) {
        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104074b(str, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC29619l createDataLoader(FeedCard.FeedType feedType, FeedCard.Type type) {
        return C39640a.m157299a().mo136983g().mo137442a(feedType, type);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getAbsChatterById(String str, IGetDataCallback<OpenChatter> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121196a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public View getCardViewFromContent(Context context, CardContent cardContent) {
        return AbstractC39484a.m156004a().mo104193a(context, cardContent);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChatQRCodeInfo(String str, UIGetDataCallback<ChatQRCodeInfoResponse> uIGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121057e(str, uIGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getChatThreadOrThreadItemWidth(Context context, boolean z) {
        return AbstractC39484a.m156004a().mo104233b(context, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public char getChatterNameLetter(Chatter chatter, Locale locale) {
        return AbstractC39484a.m156004a().mo104265p().mo121120a(chatter, locale);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChattersByIds(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121200a(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChattersByIdsFromNet(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121210b(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getDepartmentInvitationUrl(String str, String str2) {
        return C39604a.m157161a().mo136302a(str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getDingMessageById(String str, IGetDataCallback<MessageInfo> iGetDataCallback) {
        C39587a.m157080a().mo135086b().mo135282a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getDisplayName(Chatter chatter, ChatterNameDisplayRule chatterNameDisplayRule) {
        return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NAME);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public int getMaxMessageWidth(Context context, boolean z) {
        return AbstractC39484a.m156004a().mo104192a(context, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Message getMessage(C14928Entity entity, String str) {
        return AbstractC39484a.m156004a().mo104178B().mo120945a(entity, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getMessagesByIds(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121102a(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getP2pChatCreatedByChatterId(String str, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121048c(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getUrlWithTriggerCode(String str, String str2) {
        return C39715a.m157675a().mo160035a(str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void gotoOnCallActivity(Context context, String str) {
        OnCallModuleProvider.f101287a.mo143990a().mo169915a(context, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void joinGroupViaLink(String str, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121065g(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void loadSystemMessageTemplates(String str, boolean z) {
        AbstractC39484a.m156004a().mo104258i().mo121095a(str, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void onCheckedAuthorizationFailedToast(Context context, int i) {
        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104069a(context, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openMoneyH5Page(final Context context, final String str) {
        MoneyModuleProvider.m157727a(new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.integrator.im.impl.IMApiImpl.C396973 */

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                iMoneyModule.openH5(context, str);
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openTourSpotlightChat(String str, int i) {
        AbstractC39484a.m156004a().mo104274y().mo194386a(str, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void preloadChatData(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104274y().mo194387a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putP2PChats(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121027a(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putReactionPassThrough(String str, IGetDataCallback<Integer> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104260k().mo121408a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void registerBadgeChangeListener(String str, AbstractC29616i iVar) {
        C39640a.m157299a().mo136985i().mo138102a(str, iVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29599ac acVar, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(acVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setDisAutoTranslateLanguages(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104259j().mo121379a(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setGlobalAutoTranslateScope(int i, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104259j().mo121375a(i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setMineName(String str, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121219d(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setTargetTranslateLanguage(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104259j().mo121378a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void startConversationBoxActivity(Context context, String str) {
        C39640a.m157299a().mo136980d().mo139419a(context, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Chat syncGetP2pChatCreatedByChatterId(String str, String str2) {
        return AbstractC39484a.m156004a().mo104251d().mo120986a(str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, ChatChatter> syncPullChatChattersByIds(String str, List<String> list) {
        return AbstractC39484a.m156004a().mo104256g().mo121188a(str, list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void syncPullUrlPreviewChattersList(String str, IGetDataCallback<ArrayList<String>> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104254e().mo121336a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void unRegisterBadgeChangeListener(String str, AbstractC29616i iVar) {
        C39640a.m157299a().mo136985i().mo138104b(str, iVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void updateMineAvatar(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121215c(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Boolean checkFileSavedToDriveAuthorization(String str, Boolean bool) {
        return Boolean.valueOf(AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104076c(str, bool.booleanValue()));
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void fetchEmojis(int i, List<String> list) {
        AbstractC39484a.m156004a().mo104262m().mo121387a(i, list);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChatById(String str, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo120994a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChatterById(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121208b(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public char getChatterNameLetter(OpenChatter openChatter, Locale locale) {
        return AbstractC39484a.m156004a().mo104265p().mo121120a(openChatter, locale);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChattersByIds(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121200a(list, uIGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getDisplayName(OpenChatter openChatter, ChatterNameDisplayRule chatterNameDisplayRule) {
        return AbstractC39484a.m156004a().mo104265p().mo121121a(openChatter, chatterNameDisplayRule);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getOpenChatById(String str, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo120994a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void peakFeedCard(String str, FeedCard.Type type) {
        C39640a.m157299a().mo136981e().mo139436a(str, type);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void pullBots(IGetDataCallback<BotsResponse> iGetDataCallback, int i) {
        AbstractC39484a.m156004a().mo104256g().mo121191a(iGetDataCallback, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putReviewAction(Parameters parameters, String str) {
        if (parameters != null) {
            AbstractC39484a.m156004a().mo104254e().mo121335a(new IPreviewService.UrlPreviewActionRequest(parameters.getSourceId(), parameters.getPreviewId(), str, null), (IGetDataCallback<Boolean>) null);
        }
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendChatDocsClicked(String str, DocResult docResult) {
        ChatHitPointNew.Companion aVar = ChatHitPointNew.f135660c;
        if (str == null) {
            str = "";
        }
        aVar.mo187388a(str, "docs", ChatHitPointNew.f135660c.mo187391b("docs"), new HashMap<String, String>(docResult) {
            /* class com.ss.android.lark.integrator.im.impl.IMApiImpl.C396941 */
            final /* synthetic */ DocResult val$docResult;

            {
                this.val$docResult = r3;
                put("msg_id", r3.getDocCard().getMessageId());
                put("msg_type", Message.Type.TEXT.toString().toLowerCase(Locale.ROOT));
                put("file_id", C57859q.m224567c(r3.getDoc().getId()));
                put("file_type", ChatHitPointNew.f135660c.mo187376a(r3.getDoc().getDocType()));
            }
        });
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getDisplayName(String str, String str2) {
        return AbstractC39484a.m156004a().mo104265p().mo121122a(str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29601ad adVar, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(adVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showLKPLeanModeAlertDialog(final Activity activity, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (activity != null && DesktopUtil.m144301a((Context) activity)) {
            C39705a.m157599a().mo148658a(false, new IGetDataCallback<LeanMode>() {
                /* class com.ss.android.lark.integrator.im.impl.IMApiImpl.C396952 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(LeanMode leanMode) {
                    if (!leanMode.isDeviceInLeanMode()) {
                        Log.m165389i("IMApiImpl", "LKP lean Mode is off");
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(false);
                            return;
                        }
                        return;
                    }
                    Log.m165389i("IMApiImpl", "LKP lean Mode is on");
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.integrator.im.impl.IMApiImpl.C396952.RunnableC396961 */

                        public void run() {
                            C39705a.m157599a().mo148655a(activity);
                        }
                    });
                    IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                    if (iGetDataCallback2 != null) {
                        iGetDataCallback2.onSuccess(true);
                    }
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("host activity is not running "));
        }
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getLoginChatter(boolean z, IGetDataCallback<Chatter> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121201a(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29613e eVar, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(eVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29629v vVar, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(vVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendMessage(C29631w wVar, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121090a(wVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void callUserConfirm(Activity activity, String str, String str2) {
        C39742a.m157747a().mo176938b(activity, str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void ensureInChatAndOpenThread(Context context, String str, String str2) {
        AbstractC39484a.m156004a().mo104210a(context, str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void makeUserCall(Activity activity, String str, String str2) {
        C39742a.m157747a().mo176932a(activity, str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void requestScreenShot(Context context, LKPType lKPType, IScreenshotCallBack uVar) {
        C39712a.m157640a().mo149465a(context, lKPType, uVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendUrlClick(String str, String str2, String str3) {
        AbstractC39484a.m156004a().mo104227a(str, str2, str3);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showChatChatterApplyDialog(Context context, ChatSettingApplyWay chatSettingApplyWay, AbstractC29611c cVar) {
        C39452a.m155775a().mo127230a(context, chatSettingApplyWay, cVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showMemberWithoutAdd(Activity activity, List<String> list, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
        C39633a.m157280a().mo158803b(activity, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showPhoneCallDialog(Activity activity, String str, String str2) {
        C39742a.m157747a().mo176938b(activity, str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showResourceDeletedByAdminDialog(Context context, Boolean bool, DialogInterface.OnDismissListener onDismissListener) {
        C39603g.m157159a().showResourceDeletedByAdminDialog(context, bool, onDismissListener);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void addGroupChatMember(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121007a(str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void checkAvatar(String str, String str2, AvatarType avatarType) {
        AbstractC39484a.m156004a().mo104257h().mo89177a(str, str2, avatarType);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public AbstractC44552i createFeedTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return C39640a.m157299a().mo136983g().mo137443a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void deleteShortcuts(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback, int i) {
        C39640a.m157299a().mo136982f().mo139430b(shortcut, iGetDataCallback, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void filterGroupChatter(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121040b(str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void launchCustomerService(Context context, Params params, AbstractC29624a aVar) {
        C39583a.m157071a().mo141221b().mo141227a(context, params, aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void onCheckedAuthorizationFailed(Context context, int i, DialogInterface.OnDismissListener onDismissListener) {
        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104070a(context, i, onDismissListener);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public Map<String, PreviewHangPoint> parseUrlPreviewHangPointFromPb(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2) {
        return AbstractC39484a.m156004a().mo104200a(str, map, map2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putShortcuts(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback, int i) {
        C39640a.m157299a().mo136982f().mo139428a(shortcut, iGetDataCallback, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void queryPhoneNumber(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
        C39742a.m157747a().mo176931a(activity, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void saveImage2Stickers(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        C39766a.m157868a().mo187810b().mo187849a(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void seeMoreDefinitions(Context context, String str, String str2) {
        C28523a.m104540a().mo101549d().mo101684a(context, str, str2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setTranslateDisplayRule(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104259j().mo121376a(i, map, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void shareFileCopyAsMessage(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121085a(shareObject, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showSquareMessageStickerThumb(Context context, ImageView imageView, StickerContent stickerContent) {
        C39766a.m157868a().mo187816d().mo187828a(context, imageView, stickerContent);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void updateAvatar(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121066g(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getOnCallChatId(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
        OnCallModuleProvider.f101287a.mo143990a().mo169919a(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void onCheckedAuthorizationFailed(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, onDismissListener);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getRecogniseSpansResult(String str, String str2, SyncDataStrategy syncDataStrategy, C37030f.AbstractC37031a aVar) {
        AbstractC39484a.m156004a().mo104226a(str, str2, syncDataStrategy, aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void pickGroupMemberForResult(BaseFragment baseFragment, String str, List<String> list, int i) {
        C39633a.m157280a().mo158799a(baseFragment, str, list, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void selectFreeBusyMember(Activity activity, String str, ArrayList<String> arrayList, int i) {
        C39633a.m157280a().mo158789a(activity, str, arrayList, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void selectFreeBusyMemberFragment(C36516a<DrawerParams> aVar, String str, ArrayList<String> arrayList, int i) {
        C39633a.m157280a().mo158801a(aVar, str, arrayList, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setMessageCardBackground(View view, int i, View view2, int[] iArr) {
        AbstractC39484a.m156004a().mo104211a(view, i, view2, iArr);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void joinGroupViaQRCode(String str, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121017a(str, str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putOneByOneForwardMessage(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121104a(list, list2, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putP2PChat(boolean z, String str, ChatBundle.C29592c cVar, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121031a(z, str, cVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendImages(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121094a(str, list, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void setChatterAlias(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104256g().mo121198a(str, str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void shareStickerSet(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        C39766a.m157868a().mo187815c().mo187870a(context, str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void shareThreadTopic(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121092a(str, str2, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void transmitFavorite(String str, List<String> list, List<C29612d> list2, IGetDataCallback<Map<String, String>> iGetDataCallback) {
        AbstractC39636b.m157290a().mo136709b().mo136712a(str, list, list2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getOnCallChatId(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
        OnCallModuleProvider.f101287a.mo143990a().mo169920a(str, str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void fetchMapLocation(Activity activity, Integer num, POIConfig pOIConfig, AbstractC29622o oVar, boolean z) {
        C39718b.m157699a().mo149713a(activity, num, pOIConfig, oVar, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getOnCallChatId(String str, String str2, float f, float f2, IGetDataCallback<String> iGetDataCallback) {
        OnCallModuleProvider.f101287a.mo143990a().mo169918a(str, str2, f, f2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void joinGroupChat(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
        C39633a.m157280a().mo158795a(context, str, list, i, aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public ImageHistoryResponse getChatImageHistory(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i) {
        return AbstractC39484a.m156004a().mo104251d().mo120984a(str, str2, direction, list, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putDepartmentGroupChat(String str, List<String> list, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121022a(str, new ArrayList(), str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putForwardMessage(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121103a(list, str, list2, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showLocationDialog(Activity activity, String str, double d, double d2, int i) {
        C39718b.m157699a().mo149711a(activity, new LocationInfo.C29595a(String.valueOf(d), String.valueOf(d2)).mo106512a(new com.ss.android.lark.chat.entity.message.Message()).mo106514a(true).mo106513a(str).mo106511a(i).mo106517b(false).mo106518c(false).mo106515a());
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getOnCallChatId(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
        OnCallModuleProvider.f101287a.mo143990a().mo169921a(str, str2, str3, str4, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void joinGroupViaShare(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar) {
        C39633a.m157280a().mo158796a(context, str, list, str2, str3, aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openLocationStandAlone(Activity activity, String str, String str2, double d, double d2, int i) {
        C39718b.m157699a().mo149714a(activity, str, str2, d, d2, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openMergeForward(Activity activity, MergeForwardContent mergeForwardContent, FavoriteMessageInfo favoriteMessageInfo, int i, int i2, String str) {
        AbstractC39484a.m156004a().mo104202a(activity, mergeForwardContent, favoriteMessageInfo, i, i2, str);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showSelectContact(Activity activity, C36516a aVar, String str, Chat chat, boolean z, int i) {
        C39633a.m157280a().mo158784a(activity, aVar, str, chat, z, i);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void startGroupSetting(Context context, String str, int i, boolean z, boolean z2, boolean z3) {
        C39452a.m155775a().mo127234a(context, str, i, z, z2, z3);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void getChatImageHistory(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i, IGetDataCallback<ImageHistoryResponse> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo121013a(str, str2, direction, list, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public String getDisplayName(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule) {
        return AbstractC39484a.m156004a().mo104265p().mo121123a(str, str2, str3, str4, str5, chatterNameDisplayRule);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void joinGroupViaToken(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar) {
        C39633a.m157280a().mo158797a(context, str, list, str2, str3, z, aVar);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void createAddChatChatterApply(String str, AddChatChatterApply.Ways ways, List<String> list, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104251d().mo120995a(str, ways, list, str2, str3, str4, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showOnCallAvatarInImageView(Application application, String str, String str2, String str3, ImageView imageView, int i, int i2) {
        OnCallModuleProvider.f101287a.mo143990a().mo169916a(LarkContext.getApplication(), str, str2, str3, imageView, i, i2);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void sendShareAppMessages(List<String> list, int i, String str, ShareAppCardLink abVar, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121099a(list, i, str, abVar, str2, str3, str4, iGetDataCallback);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void openUrlToPlayVideo(Context context, View view, String str, String str2, String str3, String str4, int i, Image image, boolean z) {
        AbstractC39484a.m156004a().mo104204a(context, view, str, str2, str3, str4, i, image, z);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void showEnterpriseTopic(String str, String str2, String str3, RectF rectF, View view, String str4, GetEnterpriseTopicRequest.Scene scene, String str5, IGetDataCallback<String> iGetDataCallback) {
        C28523a.m104540a().mo101549d().mo101690a(str, str2, str3, rectF, view, str4, GetEnterpriseTopicRequest.Scene.DOCS, (IGetDataCallback<Object>) null, str5, iGetDataCallback, (String) null);
    }

    @Override // com.ss.android.lark.biz.im.api.IIMApi
    public void putMergeForwardMessage(List<String> list, List<String> list2, Content content, boolean z, boolean z2, String str, boolean z3, String str2, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback) {
        AbstractC39484a.m156004a().mo104258i().mo121105a(list, list2, AbstractC39484a.m156004a().mo104247c().mo121388a((MergeForwardContent) content).f74159a, z, z2, str, z3, str2, list3, iGetDataCallback);
    }
}
