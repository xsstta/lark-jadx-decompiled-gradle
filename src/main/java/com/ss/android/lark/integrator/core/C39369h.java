package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.core.api.main.IFeedLoadListener;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.AbstractC29618k;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
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
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.C29634z;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatQRCodeInfoResponse;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.HomeOnCallInfo;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.biz.im.api.StickerContent;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.core.dependency.AbstractC36122g;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.core.h */
class C39369h implements AbstractC36122g {

    /* renamed from: a */
    IIMApi f100690a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: b */
    private ConcurrentHashMap<IFeedLoadListener, AbstractC29618k> f100691b = new ConcurrentHashMap<>();

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public Map<? extends String, ? extends Boolean> mo132812a() {
        return this.f100690a.getChatSettingFeatureConfigMap();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132856a(String str) {
        this.f100690a.peakFeedCard(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132860a(String str, FeedCard.Type type) {
        this.f100690a.peakFeedCard(str, type);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132852a(Chat chat, String str) {
        this.f100690a.chatBoxHitPoint(chat, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132838a(IFeedLoadListener aVar) {
        $$Lambda$h$v4ze2NzfTcgtffZJOjl3hpmjya0 r0 = new AbstractC29618k() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$h$v4ze2NzfTcgtffZJOjl3hpmjya0 */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29618k
            public final void onFeedLoaded() {
                C39369h.lambda$v4ze2NzfTcgtffZJOjl3hpmjya0(IFeedLoadListener.this);
            }
        };
        this.f100691b.put(aVar, r0);
        this.f100690a.registerFeedLoadListener(r0);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132892b(IFeedLoadListener aVar) {
        AbstractC29618k kVar = this.f100691b.get(aVar);
        if (kVar != null) {
            this.f100690a.unregisterFeedLoadListener(kVar);
            this.f100691b.remove(aVar);
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132877a(boolean z) {
        this.f100690a.onTenantStateChanged(z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132855a(UIGetPluginCallback<IMoneyModule> dVar) {
        this.f100690a.getMoneyModule(dVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public boolean mo132880a(Context context, String str) {
        return this.f100690a.tryOpenLynxPage(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132835a(IGetDataCallback<?> iGetDataCallback) {
        this.f100690a.addAddressBookInfo(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public String mo132810a(String str, String str2) {
        return this.f100690a.getDepartmentInvitationUrl(str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132816a(Activity activity) {
        this.f100690a.startCreateF2FGroup(activity);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132853a(C36516a aVar, int i) {
        this.f100690a.openCreateGroupChatModuleForForward(aVar, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public String mo132808a(Chatter chatter, ChatterNameDisplayRule chatterNameDisplayRule) {
        return this.f100690a.getDisplayName(chatter, ChatterNameDisplayRule.NAME);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132858a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f100690a.getP2pChatCreatedByChatterId(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public Map<? extends String, ? extends AbstractC29186b> mo132813a(Context context) {
        return this.f100690a.getChatSettingAppLinkHandlers(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132824a(Context context, ChatSettingApplyWay chatSettingApplyWay, AbstractC29611c cVar) {
        this.f100690a.showChatChatterApplyDialog(context, chatSettingApplyWay, cVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132827a(Context context, String str, int i, boolean z, boolean z2, boolean z3) {
        this.f100690a.startGroupSetting(context, str, i, z, z2, z3);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132851a(C29634z zVar, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendMessage(zVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132839a(C29599ac acVar, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendMessage(acVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132842a(C29613e eVar) {
        this.f100690a.sendMessage(eVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132843a(C29613e eVar, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendMessage(eVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132850a(C29631w wVar, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendMessage(wVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132878a(boolean z, IGetDataCallback<Chatter> iGetDataCallback) {
        this.f100690a.getLoginChatter(true, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132849a(AbstractC29628t tVar) {
        this.f100690a.addPushTranslateLanguageSettingListener(tVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132897b(AbstractC29628t tVar) {
        this.f100690a.removePushTranslateLanguageSettingListener(tVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132848a(AbstractC29627s sVar) {
        this.f100690a.addPushMineChatterChangedListener(sVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132896b(AbstractC29627s sVar) {
        this.f100690a.removePushMineChatterChangedListener(sVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132898b(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        this.f100690a.updateMineAvatar(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132863a(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
        this.f100690a.updateAvatar(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public Map<String, Chatter> mo132814a(List<String> list) {
        return this.f100690a.syncGetChattersByIds(list);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132873a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback) {
        this.f100690a.getChattersByIds(list, uIGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132867a(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback) {
        this.f100690a.addGroupChatMember(str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132879a(boolean z, String str, ChatBundle.C29592c cVar, IGetDataCallback<Chat> iGetDataCallback) {
        this.f100690a.putP2PChat(z, str, cVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132823a(Context context, ChatBundle chatBundle) {
        this.f100690a.openChat(context, chatBundle);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132836a(IGetDataCallback<BotsResponse> iGetDataCallback, int i) {
        this.f100690a.pullBots(iGetDataCallback, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132868a(String str, List<String> list, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
        this.f100690a.putDepartmentGroupChat(str, new ArrayList(), str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132846a(AbstractC29623p pVar) {
        this.f100690a.addPushChatterListener(pVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132894b(AbstractC29623p pVar) {
        this.f100690a.removePushChatterListener(pVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public String mo132811a(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule) {
        return this.f100690a.getDisplayName(str, str2, str3, str4, str5, chatterNameDisplayRule);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132857a(String str, int i) {
        this.f100690a.openTourSpotlightChat(str, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132876a(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback) {
        this.f100690a.putOneByOneForwardMessage(list, list2, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132872a(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback) {
        this.f100690a.putP2PChats(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public String mo132809a(Message message) {
        return this.f100690a.getShareGroupChatNotifyDisplay(message);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132866a(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback) {
        this.f100690a.shareThreadTopic(str, str2, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132834a(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback) {
        this.f100690a.shareFileCopyAsMessage(shareObject, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132874a(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback) {
        this.f100690a.putForwardMessage(list, str, list2, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132902b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        this.f100690a.getChattersByIdsFromNet(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132841a(C29601ad adVar, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendMessage(adVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132840a(C29601ad adVar) {
        this.f100690a.sendMessage(adVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132870a(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendImages(str, list, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132871a(List<String> list, int i, String str, ShareAppCardLink abVar, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.sendShareAppMessages(list, i, str, abVar, str2, str3, str4, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132859a(String str, UIGetDataCallback<ChatQRCodeInfoResponse> uIGetDataCallback) {
        this.f100690a.getChatQRCodeInfo(str, uIGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public boolean mo132903b(Chat chat) {
        return this.f100690a.checkLoginUserExistedInLocalChat(chat);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132865a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.setChatterAlias(str, str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132861a(String str, AddChatChatterApply.Ways ways, List<String> list, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.createAddChatChatterApply(str, ways, list, str2, str3, str4, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132901b(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        this.f100690a.filterGroupChatter(str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public void mo132913c(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.setDisAutoTranslateLanguages(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132815a(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.setTranslateDisplayRule(i, map, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132826a(Context context, C29604ae aeVar) {
        this.f100690a.openThread(context, aeVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132847a(AbstractC29626r rVar) {
        this.f100690a.addPushMessageListener(rVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132895b(AbstractC29626r rVar) {
        this.f100690a.removePushMessageListener(rVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132875a(List<String> list, List<String> list2, Content content, boolean z, boolean z2, String str, boolean z3, String str2, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback) {
        this.f100690a.putMergeForwardMessage(list, list2, content, z, z2, str, z3, str2, list3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132864a(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i, IGetDataCallback<ImageHistoryResponse> iGetDataCallback) {
        this.f100690a.getChatImageHistory(str, str2, direction, list, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132829a(Context context, String str, String str2) {
        this.f100690a.ensureInChatAndOpenThread(context, str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132854a(AbstractC36551c.AbstractC36552a aVar) {
        this.f100690a.initFragmentManager(aVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132830a(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
        this.f100690a.joinGroupChat(context, str, list, i, aVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132832a(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar) {
        this.f100690a.joinGroupViaShare(context, str, list, str2, str3, aVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132833a(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar) {
        this.f100690a.joinGroupViaToken(context, str, list, str2, str3, z, aVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132817a(Activity activity, C36516a aVar, String str, Chat chat, boolean z, int i) {
        this.f100690a.showSelectContact(activity, aVar, str, chat, z, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132837a(BaseFragment baseFragment, String str, List<String> list, int i) {
        this.f100690a.pickGroupMemberForResult(baseFragment, str, list, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132828a(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        this.f100690a.onCheckedAuthorizationFailed(context, str, onDismissListener);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public boolean mo132882a(String str, boolean z) {
        return this.f100690a.checkImageDownloadAuthorization(str, z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132862a(String str, String str2, float f, float f2, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.getOnCallChatId(str, str2, f, f2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132899b(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.getOnCallChatId(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132821a(Application application, String str, String str2, String str3, ImageView imageView, int i, int i2) {
        this.f100690a.showOnCallAvatarInImageView(LarkContext.getApplication(), str, str2, str3, imageView, i, i2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132900b(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.getOnCallChatId(str, str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132845a(AbstractC29621n nVar) {
        this.f100690a.addLeanModeChangeListener(nVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132893b(AbstractC29621n nVar) {
        this.f100690a.removeLeanModeChangeListener(nVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132818a(Activity activity, String str) {
        this.f100690a.makeCall(activity, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132819a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.queryPhoneNumber(activity, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132820a(Activity activity, String str, String str2) {
        this.f100690a.callUserConfirm(activity, str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132825a(Context context, LKPType lKPType, IScreenshotCallBack uVar) {
        this.f100690a.requestScreenShot(context, lKPType, uVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132869a(String str, List<String> list, List<C29612d> list2, IGetDataCallback<Map<String, String>> iGetDataCallback) {
        this.f100690a.transmitFavorite(str, list, list2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132822a(Context context, ImageView imageView, StickerContent stickerContent) {
        this.f100690a.showSquareMessageStickerThumb(context, imageView, stickerContent);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132831a(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.shareStickerSet(context, str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public boolean mo132881a(FeedCard.FeedType feedType) {
        return this.f100690a.isFeedDataEmpty(feedType);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public void mo132844a(AbstractC29620m mVar) {
        this.f100690a.registerLaunchListener(mVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: A */
    public IChatParser mo132779A() {
        return this.f100690a.getChatParser();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: B */
    public IChatterParser mo132780B() {
        return this.f100690a.getChatterParser();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: C */
    public int mo132781C() {
        return this.f100690a.getFileUploadAuthorizatedDenyCode();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: D */
    public void mo132782D() {
        this.f100690a.deleteChatterWorkStatus();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: E */
    public String mo132783E() {
        return this.f100690a.getFavoritePageName();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: F */
    public AbstractC29524c mo132784F() {
        return this.f100690a.createChatFrame();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: G */
    public AbstractC29524c mo132785G() {
        return this.f100690a.createThreadFrame();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: H */
    public void mo132786H() {
        this.f100690a.unInitFragmentManager();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: I */
    public Collection<? extends String> mo132787I() {
        return this.f100690a.getIMSyncKeys();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: J */
    public int mo132788J() {
        return this.f100690a.getLoginUserAuthorityDeniedReason();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: K */
    public int mo132789K() {
        return this.f100690a.getLoginUserAuthorityDeniedCode();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: L */
    public String mo132790L() {
        return this.f100690a.getUserAuthorityControledTip();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: M */
    public int mo132791M() {
        return this.f100690a.getOtherUserAuthorityDeniedReason();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: N */
    public String mo132792N() {
        return this.f100690a.getUploadAuthorizationTip();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: O */
    public boolean mo132793O() {
        return this.f100690a.isLeanModeOn();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: P */
    public Collection<? extends AbstractNotification> mo132794P() {
        return this.f100690a.provideIMNotificationImpls();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: Q */
    public boolean mo132795Q() {
        return this.f100690a.isSmartComposeEnable();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: R */
    public boolean mo132796R() {
        return this.f100690a.isSmartReplyEnable();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: S */
    public boolean mo132797S() {
        return this.f100690a.isCorrectionFgEnable();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: T */
    public List<String> mo132798T() {
        return this.f100690a.getWholeReactionList();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public int mo132883b() {
        return this.f100690a.getPreloadChatChatterCount();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: l */
    public View mo132949l() {
        return this.f100690a.findMoreBtn();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: m */
    public String mo132951m() {
        return this.f100690a.getMoneyPluginPackageName();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: n */
    public void mo132953n() {
        this.f100690a.checkNeedReloadDingData();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: o */
    public void mo132954o() {
        this.f100690a.registerCancelDingNotificationListener();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: p */
    public void mo132955p() {
        this.f100690a.removeAddressBookInfo();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: q */
    public void mo132956q() {
        this.f100690a.statPinForwardConfirmEvent();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: r */
    public boolean mo132957r() {
        return this.f100690a.isCheckSecretPermission();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: s */
    public boolean mo132958s() {
        return this.f100690a.isSecretOpen();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: t */
    public String mo132959t() {
        return this.f100690a.getSourcePlusMenu();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: u */
    public String mo132960u() {
        return this.f100690a.getCreateGroupChatPackageName();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: v */
    public Chatter mo132961v() {
        return this.f100690a.getLoginChatter();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: w */
    public List<AbstractC28490a> mo132962w() {
        return this.f100690a.getAbTestExperiments();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: x */
    public Map<? extends String, ? extends Boolean> mo132963x() {
        return this.f100690a.getChatFeatureConfigMap();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: y */
    public IDiskCleanTask mo132964y() {
        return this.f100690a.getDiskCleanTask();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: z */
    public void mo132965z() {
        this.f100690a.resetChatCache();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public Map<? extends String, ? extends C41149a> mo132905c() {
        return this.f100690a.getFeedAppConfigMap();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public String mo132915d() {
        return this.f100690a.getTenantGuideV3Key();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public String mo132924e() {
        return this.f100690a.getTenantGuideV2Key();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: f */
    public String mo132931f() {
        return this.f100690a.getTenantGuideV1Key();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: g */
    public void mo132936g() {
        this.f100690a.resetFeedCache();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: i */
    public String mo132944i() {
        return this.f100690a.getFeedTabPageName();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: j */
    public void mo132946j() {
        this.f100690a.initFeed();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: k */
    public void mo132948k() {
        this.f100690a.onSwitchTenantUserClick();
    }

    C39369h() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: h */
    public boolean mo132942h() {
        return this.f100690a.enableFeedMuteFilter();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public AbstractC44552i mo132914d(Context context) {
        return this.f100690a.getCreateGroupChatTabPageSpec(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public Chatter mo132923e(String str) {
        return this.f100690a.getChatterById(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: f */
    public Chat mo132930f(String str) {
        return this.f100690a.getChatById(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: g */
    public Chat mo132935g(String str) {
        return this.f100690a.getP2pChatByChatterId(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: h */
    public Chat mo132939h(String str) {
        return this.f100690a.getLocalChat(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: i */
    public Chatter mo132943i(String str) {
        return this.f100690a.getLocalChatter(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: j */
    public int mo132945j(String str) {
        return this.f100690a.getChatLastPosition(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: k */
    public Chat mo132947k(String str) {
        return this.f100690a.getChatByIdFromNet(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public int mo132800a(DocType docType) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineBlueIcon(docType);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public Chatter mo132884b(boolean z) {
        return this.f100690a.getLoginChatter(true);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: h */
    public AbstractC44552i mo132940h(Context context) {
        return this.f100690a.getFavoriteTabPageSpec(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: l */
    public void mo132950l(String str) {
        this.f100690a.showNoIMPermissionDialog(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: m */
    public void mo132952m(String str) {
        this.f100690a.auditImageDownload(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public Message mo132885b(String str) {
        return this.f100690a.getLastMessage(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public Map<? extends String, ? extends AbstractC29186b> mo132906c(Context context) {
        return this.f100690a.getEduAppLinkHandlers(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public Map<String, Chat> mo132916d(List<String> list) {
        return this.f100690a.getLocalChats(list);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public Map<? extends String, ? extends AbstractC29186b> mo132925e(Context context) {
        return this.f100690a.getChatAppLinkHandlers(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: f */
    public void mo132932f(Context context) {
        this.f100690a.openFavoritePage(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: g */
    public void mo132937g(Context context) {
        this.f100690a.openCustomServiceChat(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public Map<String, Message> mo132907c(List<String> list) {
        return this.f100690a.syncGetMessageByIds(list);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public Image mo132803a(ImageContent imageContent) {
        return this.f100690a.getThumbnailShowImage(imageContent);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public Map<String, Chat> mo132887b(List<String> list) {
        return this.f100690a.syncGetChatsByIds(list);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public void mo132927e(IGetDataCallback<List<HomeOnCallInfo>> iGetDataCallback) {
        this.f100690a.getHomePageOnCall(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public Image mo132804a(MediaContent mediaContent) {
        return this.f100690a.getThumbnailShowImage(mediaContent);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public void mo132919d(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.getUpdateMineNamePermission(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132889b(Context context) {
        this.f100690a.preloadFeedUIView(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public void mo132910c(IGetDataCallback<BotsResponse> iGetDataCallback) {
        this.f100690a.pullBots(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public void mo132920d(String str) {
        this.f100690a.openChatByChatterIdFromIPC(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public RichText mo132806a(com.bytedance.lark.pb.basic.v1.RichText richText) {
        return this.f100690a.getRichText(richText);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public void mo132911c(String str) {
        this.f100690a.openChatByChatIdFromIPC(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public String mo132807a(Chat chat) {
        return this.f100690a.getOtherP2PChatterId(chat);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132891b(IGetDataCallback<Chatter> iGetDataCallback) {
        this.f100690a.getLoginChatter(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public char mo132799a(Chatter chatter, Locale locale) {
        return this.f100690a.getChatterNameLetter(chatter, locale);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public Chat mo132904c(String str, String str2) {
        return this.f100690a.syncGetP2pChatCreatedByChatterId(str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: h */
    public void mo132941h(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f100690a.getOpenChatById(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public AbstractC29619l mo132802a(FeedCard.FeedType feedType, FeedCard.Type type) {
        return this.f100690a.createDataLoader(feedType, type);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public String mo132886b(String str, String str2) {
        return this.f100690a.getDisplayName(str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public void mo132917d(Activity activity, String str) {
        this.f100690a.emergencyCall(activity, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public void mo132926e(Activity activity, String str) {
        this.f100690a.openPhoneAmountEditPage(activity, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: f */
    public void mo132933f(String str, IGetDataCallback<String> iGetDataCallback) {
        this.f100690a.setMineName(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: g */
    public void mo132938g(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.setTargetTranslateLanguage(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public void mo132908c(Activity activity, String str) {
        this.f100690a.queryPhoneNumber(activity, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public void mo132918d(Context context, String str) {
        this.f100690a.openStickerSetDetail(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: f */
    public void mo132934f(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.checkSelfInChat(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132888b(Activity activity, String str) {
        this.f100690a.showPhoneIdentifyDialog(activity, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public void mo132909c(Context context, String str) {
        this.f100690a.openCreateGroupChatModule(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public void mo132928e(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback) {
        this.f100690a.getUrlInlineFromContent(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: e */
    public void mo132929e(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f100690a.deleteMessagesByIds(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: b */
    public void mo132890b(Context context, String str) {
        this.f100690a.gotoOnCallActivity(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public void mo132921d(String str, IGetDataCallback<DocResult> iGetDataCallback) {
        this.f100690a.getDocFromUrlContent(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: c */
    public void mo132912c(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        this.f100690a.getChatterById(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: d */
    public void mo132922d(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback) {
        this.f100690a.getMessagesByIds(list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public AbstractC44552i mo132805a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return this.f100690a.createFeedTabPageSpec(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36122g
    /* renamed from: a */
    public ImageHistoryResponse mo132801a(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i) {
        return this.f100690a.getChatImageHistory(str, str2, direction, list, i);
    }
}
