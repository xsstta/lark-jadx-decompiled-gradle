package com.ss.android.lark.feed.service.impl;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.bytedance.lark.pb.basic.v1.TriggerSyncDataRequest;
import com.bytedance.lark.pb.feed.v1.CursorType;
import com.bytedance.lark.pb.feed.v1.DeleteFeedCardsFromBoxRequest;
import com.bytedance.lark.pb.feed.v1.FeedCursor;
import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.bytedance.lark.pb.feed.v1.GetAllBadgeRequest;
import com.bytedance.lark.pb.feed.v1.GetAllBadgeResponse;
import com.bytedance.lark.pb.feed.v1.GetDelayedCardsRequest;
import com.bytedance.lark.pb.feed.v1.GetDelayedCardsResponse;
import com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Request;
import com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Response;
import com.bytedance.lark.pb.feed.v1.GetFeedCardsV4Request;
import com.bytedance.lark.pb.feed.v1.GetFeedCardsV4Response;
import com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsRequest;
import com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsResponse;
import com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsRangeRequest;
import com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsRangeResponse;
import com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsV4Request;
import com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsV4Response;
import com.bytedance.lark.pb.feed.v1.GroupFeedCursor;
import com.bytedance.lark.pb.feed.v1.PeakFeedCardRequest;
import com.bytedance.lark.pb.feed.v1.PreloadFeedCardsDataRequest;
import com.bytedance.lark.pb.feed.v1.SetFeedCardPreviewDelayedRequest;
import com.bytedance.lark.pb.feed.v1.SetFeedCardPreviewDelayedResponse;
import com.bytedance.lark.pb.feed.v1.SetFeedCardsIntoBoxRequest;
import com.bytedance.lark.pb.feed.v1.SubscribeFeedPushSceneRequest;
import com.bytedance.lark.pb.feed.v1.SubscribeFeedPushSceneResponse;
import com.bytedance.lark.pb.feed.v1.UpdateFeedCardsRequest;
import com.bytedance.lark.pb.statistics.v1.PushHideChannelRequest;
import com.bytedance.lark.pb.tool.v1.GetFGStickyValueResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.conversationbox.ConversationBoxActivity;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.common.FeedTabUtil;
import com.ss.android.lark.feed.dto.FeedFilterTabInfo;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.interfaces.AbstractC38095f;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.p1872c.C38073d;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.entities.PlatformType;
import com.ss.android.lark.pb.flow.GetNewUserCreateTeamStrongGuideContextRequest;
import com.ss.android.lark.pb.flow.GetNewUserCreateTeamStrongGuideContextResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57858o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.impl.f */
public class C38146f implements AbstractC38095f, AbstractC38118b {

    /* renamed from: a */
    AbstractC38037a.AbstractC38047g f97813a;

    /* renamed from: b */
    AbstractC38037a.AbstractC38038a f97814b;

    /* renamed from: c */
    AbstractC32808a f97815c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.service.impl.f$a */
    public static class C38157a {

        /* renamed from: a */
        static C38146f f97852a = new C38146f(null);
    }

    /* renamed from: a */
    public static C38146f m149976a() {
        return C38157a.f97852a;
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public void mo139444a(final List<FeedCard> list, FeedCard.FeedType feedType, UIGetDataCallback<List<FeedCard>> uIGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (FeedCard feedCard : list) {
            arrayList.add(new UpdateFeedCardsRequest.Pair.C17238a().mo60615a(feedCard.getId()).mo60614a(FeedCard.EntityType.fromValue(feedCard.getType().getNumber())).build());
        }
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_FEED_CARDS, new UpdateFeedCardsRequest.C17240a().mo60620a(FeedCard.FeedType.fromValue(feedType.getNumber())).mo60621a(arrayList), uIGetDataCallback, new SdkSender.IParser<List<com.ss.android.lark.biz.im.api.FeedCard>>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass17 */

            /* renamed from: a */
            public List<com.ss.android.lark.biz.im.api.FeedCard> parse(byte[] bArr) throws IOException {
                return list;
            }
        });
    }

    /* renamed from: a */
    public void mo139502a(String str, FeedCard.Type type, IGetDataCallback<com.ss.android.lark.biz.im.api.FeedCard> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PEAK_FEED_CARD, new PeakFeedCardRequest.C17198a().mo60526a(str).mo60525a(FeedCard.EntityType.fromValue(type.getNumber())), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.biz.im.api.FeedCard>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass18 */

            /* renamed from: a */
            public com.ss.android.lark.biz.im.api.FeedCard parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public void mo139442a(String str, FeedFilter feedFilter, int i, IGetDataCallback<AbstractC38118b.C38120b> iGetDataCallback, final C38073d dVar) {
        FeedFilter.Type type;
        dVar.mo139371g();
        GetNextUnreadFeedCardsRangeRequest.C17176a aVar = new GetNextUnreadFeedCardsRangeRequest.C17176a();
        aVar.mo60478a(str);
        FeedFilter.C17128a aVar2 = new FeedFilter.C17128a();
        if (feedFilter == null) {
            type = FeedFilter.Type.INBOX;
        } else {
            type = FeedFilter.Type.fromValue(feedFilter.getValue());
        }
        aVar.mo60476a(aVar2.mo60364a(type).build());
        aVar.mo60477a(Integer.valueOf(i));
        SdkSender.asynSendRequestNonWrap(Command.GET_NEXT_UNREAD_FEED_CARDS_RANGE_V3, aVar, dVar.mo139365c(), iGetDataCallback, new SdkSender.IParser<AbstractC38118b.C38120b>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass19 */

            /* renamed from: a */
            public AbstractC38118b.C38120b parse(byte[] bArr) throws IOException {
                dVar.mo139372h();
                dVar.mo139369e();
                AbstractC38118b.C38120b bVar = new AbstractC38118b.C38120b();
                try {
                    GetNextUnreadFeedCardsRangeResponse decode = GetNextUnreadFeedCardsRangeResponse.ADAPTER.decode(bArr);
                    bVar.f97748a = C38159h.m150024a(decode.entity_previews);
                    bVar.f97751d = decode.next_channel_id;
                    bVar.f97749b = decode.next_cursor.longValue();
                    bVar.f97752e = C38159h.m150027b(decode.continuous_cursors);
                    bVar.f97753f = com.ss.android.lark.feed.app.entity.FeedFilter.Companion.forNumber(decode.feed_filter.filter_type.getValue());
                    bVar.f97754g = dVar.mo139365c();
                } catch (Exception e) {
                    bVar.f97748a = new ArrayList();
                    Log.m165383e("FeedModule_FeedService", "getNextUnreadFeedCardsRangeV3 is failed :" + e.toString());
                }
                dVar.mo139370f();
                return bVar;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public void mo139443a(String str, final FeedCursor dVar, final com.ss.android.lark.feed.app.entity.FeedFilter feedFilter, int i, IGetDataCallback<AbstractC38118b.C38120b> iGetDataCallback, final C38073d dVar2) {
        dVar2.mo139371g();
        GetNextUnreadFeedCardsV4Request.C17180a aVar = new GetNextUnreadFeedCardsV4Request.C17180a();
        if (dVar != null) {
            aVar.mo60487a(new FeedCursor(Long.valueOf(dVar.mo139466a()), Long.valueOf(dVar.mo139467b())));
        } else {
            aVar.f43948a = str;
        }
        aVar.f43950c = Integer.valueOf(i);
        if (feedFilter == null || feedFilter.getValue() >= com.ss.android.lark.feed.app.entity.FeedFilter.SHORTCUTS.getValue()) {
            aVar.f43949b = FeedFilter.Type.INBOX;
        } else {
            aVar.f43949b = FeedFilter.Type.fromValue(feedFilter.getValue());
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_NEXT_UNREAD_FEED_CARDS_V4, aVar, dVar2.mo139365c(), iGetDataCallback, new SdkSender.IParser<AbstractC38118b.C38120b>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass20 */

            /* renamed from: a */
            public AbstractC38118b.C38120b parse(byte[] bArr) throws IOException {
                dVar2.mo139372h();
                dVar2.mo139369e();
                AbstractC38118b.C38120b bVar = new AbstractC38118b.C38120b();
                try {
                    GetNextUnreadFeedCardsV4Response decode = GetNextUnreadFeedCardsV4Response.ADAPTER.decode(bArr);
                    bVar.f97748a = C38159h.m150024a(decode.previews);
                    bVar.f97751d = decode.next_id;
                    if (decode.feed_cursor != null) {
                        bVar.f97750c = C38159h.m150023a(decode.feed_cursor);
                    } else {
                        bVar.f97749b = decode.next_cursor.longValue();
                    }
                    if (dVar != null && decode.feed_cursor == null) {
                        Log.m165383e("FeedModule_FeedService", "getNextUnreadFeedCardsRangeV4 error, request feed_cursor:" + dVar + ", response feed_cursor:" + decode.feed_cursor);
                    }
                    bVar.f97753f = feedFilter;
                    bVar.f97754g = dVar2.mo139365c();
                } catch (Exception e) {
                    bVar.f97748a = new ArrayList();
                    Log.m165383e("FeedModule_FeedService", "getNextUnreadFeedCardsRangeV4 is failed :" + e.toString());
                }
                dVar2.mo139370f();
                return bVar;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public void mo139445a(final boolean z, String str, IGetDataCallback<FeedPreviewInfo> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_FEED_CARD_DELAYED, new SetFeedCardPreviewDelayedRequest.C17222a().mo60577a(str).mo60576a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<FeedPreviewInfo>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381504 */

            /* renamed from: a */
            public FeedPreviewInfo parse(byte[] bArr) throws IOException {
                try {
                    return C38159h.m150022a(SetFeedCardPreviewDelayedResponse.ADAPTER.decode(bArr).feed_entity_preview);
                } catch (Exception e) {
                    Log.m165383e("FeedModule_FeedService", "mark Feed delayed to " + z + "is fail :" + e.toString());
                    return null;
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38095f
    /* renamed from: a */
    public void mo139420a(List<String> list, IGetDataCallback<Object> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_FEED_CARDS_INTO_BOX, new SetFeedCardsIntoBoxRequest.C17226a().mo60586a(list), iGetDataCallback, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381515 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38095f
    /* renamed from: a */
    public void mo139421a(List<String> list, boolean z, IGetDataCallback<Object> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_FEED_CARDS_FROM_BOX, new DeleteFeedCardsFromBoxRequest.C17110a().mo60320a(list).mo60319a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381526 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: a */
    public void mo139435a(final String str) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.RunnableC381537 */

            public void run() {
                C38146f.this.f97813a.mo139239a(str, new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.feed.service.impl.C38146f.RunnableC381537.C381541 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        if (chat != null) {
                            C38146f.this.mo139436a(chat.getId(), FeedCard.Type.CHAT);
                            return;
                        }
                        Log.m165383e("FeedModule_FeedService", "peakFeedCard err: chat = nullchatterId = " + str);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: a */
    public void mo139436a(String str, FeedCard.Type type) {
        mo139502a(str, type, new IGetDataCallback<com.ss.android.lark.biz.im.api.FeedCard>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381558 */

            /* renamed from: a */
            public void onSuccess(com.ss.android.lark.biz.im.api.FeedCard feedCard) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("FeedModule_FeedService", "peakFeedCard err = " + errorResult.toString());
            }
        });
    }

    private C38146f() {
        this.f97813a = C37268c.m146766b().mo139154A();
        this.f97814b = C37268c.m146766b().mo139155B();
        this.f97815c = this.f97813a.mo139234a();
    }

    /* renamed from: b */
    public void mo139503b() {
        SdkSender.asynSendRequestNonWrap(Command.TRIGGER_SYNC_DATA, new TriggerSyncDataRequest.C15364a(), null, new SdkSender.IParser() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass10 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    /* renamed from: c */
    public void mo139505c() {
        SdkSender.asynSendRequestNonWrap(Command.GET_ALL_BADGE, new GetAllBadgeRequest.C17144a(), null, new SdkSender.IParser<Object>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass11 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return GetAllBadgeResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* synthetic */ C38146f(C381471 r1) {
        this();
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: b */
    public void mo139437b(IGetDataCallback<List<FeedPreviewInfo>> iGetDataCallback) {
        mo139441a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: a */
    public void mo139434a(com.ss.android.lark.feed.app.entity.FeedFilter feedFilter) {
        FeedTabUtil.m146780a(feedFilter);
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public void mo139441a(IGetDataCallback<List<FeedPreviewInfo>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_DELAYED_CARDS, new GetDelayedCardsRequest.C17148a(), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381569 */

            /* renamed from: a */
            public List<FeedPreviewInfo> parse(byte[] bArr) throws IOException {
                ArrayList arrayList = new ArrayList();
                try {
                    return C38159h.m150024a(GetDelayedCardsResponse.ADAPTER.decode(bArr).entity_previews);
                } catch (Exception e) {
                    Log.m165383e("FeedModule_FeedService", "getDelayedCards: " + e.toString());
                    return arrayList;
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: a */
    public void mo139432a(Channel channel) {
        SdkSender.asynSendRequestNonWrap(Command.HIDE_CHANNEL, new PushHideChannelRequest.C19415a().mo66104a(this.f97815c.mo120943a(channel)), null, new SdkSender.IParser() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass21 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                new JSONObject();
                return "";
            }
        });
    }

    /* renamed from: d */
    public void mo139506d(IGetDataCallback<FeedFilterTabInfo> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_FEED_FILTER_SETTING, new GetFeedFilterSettingsRequest.C17164a().mo60449a((Boolean) false), iGetDataCallback, new SdkSender.IParser<FeedFilterTabInfo>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass15 */

            /* renamed from: a */
            public FeedFilterTabInfo parse(byte[] bArr) throws IOException {
                GetFeedFilterSettingsResponse decode = GetFeedFilterSettingsResponse.ADAPTER.decode(bArr);
                return new FeedFilterTabInfo(decode.filter_enable.booleanValue(), decode.used_filters, decode.all_filters, decode.show_mute.booleanValue(), decode.show_at_all_in_at_filter.booleanValue(), decode.version.longValue());
            }
        });
    }

    /* renamed from: com.ss.android.lark.feed.service.impl.f$1 */
    class C381471 implements SdkSender.IParser<Boolean> {
        /* renamed from: a */
        public Boolean parse(byte[] bArr) throws IOException {
            boolean z;
            try {
                z = GetFGStickyValueResponse.ADAPTER.decode(bArr).enable.booleanValue();
            } catch (Exception e) {
                Log.m165383e("FeedModule_FeedService", "getFGStickyValue is failed :" + e.toString());
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: b */
    public void mo139438b(String str) {
        FeedCard.FeedType feedType;
        UIFeedCard a = C37731d.m148488a().mo138393a(str);
        if (a != null) {
            com.ss.android.lark.biz.im.api.FeedCard feedCard = new com.ss.android.lark.biz.im.api.FeedCard();
            feedCard.setId(a.getId());
            feedCard.setType(a.getType());
            feedCard.setFeedType(a.getFeedType());
            if (a.getFeedType() == FeedCard.FeedType.DONE) {
                feedType = FeedCard.FeedType.INBOX;
            } else {
                feedType = FeedCard.FeedType.DONE;
            }
            mo139444a(Collections.singletonList(feedCard), feedType, (UIGetDataCallback<List<com.ss.android.lark.biz.im.api.FeedCard>>) null);
        }
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: c */
    public void mo139447c(IGetDataCallback<StrongGuideInfo> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.GET_NEW_USER_CREATE_TEAM_STRONG_GUIDE_CONTEXT, new GetNewUserCreateTeamStrongGuideContextRequest.C49760a().mo173259a(PlatformType.PlatformAndroid), iGetDataCallback, new SdkSender.IParser<StrongGuideInfo>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass13 */

            /* renamed from: a */
            public StrongGuideInfo parse(byte[] bArr) throws IOException {
                GetNewUserCreateTeamStrongGuideContextResponse decode = GetNewUserCreateTeamStrongGuideContextResponse.ADAPTER.decode(bArr);
                return new StrongGuideInfo(decode.mshould_show_strong_guide.booleanValue(), decode.mis_simple_user.booleanValue(), decode.mis_access_experiment.booleanValue(), decode.minvitation_method.intValue(), decode.mversion_id.intValue());
            }
        });
    }

    /* renamed from: b */
    public void mo139504b(Scene scene, IGetDataCallback<Boolean> iGetDataCallback) {
        m149977a(false, scene, iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38095f
    /* renamed from: a */
    public void mo139419a(Context context, String str) {
        if (DesktopUtil.m144307b()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("switch_to_convbox", true);
            bundle.putString("parent_card_id", str);
            C37262a.m146726a().mo139166M().mo139280a(context, "conversation", bundle);
            return;
        }
        C57858o.m224559a(ConversationBoxActivity.class).mo196058a("parent_card_id", str).mo196064a(context);
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: b */
    public void mo139446b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PRELOAD_FEED_CARDS_DATA, new PreloadFeedCardsDataRequest.C17200a().mo60531a(list), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381493 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38117a
    /* renamed from: a */
    public void mo139433a(Channel channel, int i) {
        SdkSender.asynSendRequestNonWrap(Command.HIDE_CHANNEL, new PushHideChannelRequest.C19415a().mo66104a(this.f97815c.mo120943a(channel)).mo66105a(FeedCard.EntityType.fromValue(i)), null, new SdkSender.IParser() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.C381482 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                new JSONObject();
                return "";
            }
        });
    }

    /* renamed from: a */
    public void mo139501a(Scene scene, IGetDataCallback<Boolean> iGetDataCallback) {
        m149977a(true, scene, iGetDataCallback);
    }

    /* renamed from: a */
    private void m149977a(boolean z, Scene scene, IGetDataCallback<Boolean> iGetDataCallback) {
        Log.m165389i("FeedModule_FeedService", "subscribeFeedPushSceneImpl, scene=" + scene + ", isSubscribe=" + z);
        SubscribeFeedPushSceneRequest.C17230a aVar = new SubscribeFeedPushSceneRequest.C17230a();
        SubscribeFeedPushSceneRequest.Scene fromValue = SubscribeFeedPushSceneRequest.Scene.fromValue(scene.getNumber());
        if (z) {
            aVar.mo60596a(Collections.singletonList(fromValue));
        } else {
            aVar.mo60598b(Collections.singletonList(fromValue));
        }
        SdkSender.asynSendRequestNonWrap(Command.SUBSCRIBE_FEED_PUSH_SCENE, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass14 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                boolean z;
                if (SubscribeFeedPushSceneResponse.ADAPTER.decode(bArr) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public SdkSender.C53233d<AbstractC38118b.C38119a> mo139439a(long j, FeedCursor dVar, final int i, long j2, final com.ss.android.lark.feed.app.entity.FeedFilter feedFilter, final C38073d dVar2) {
        FeedFilter.Type type;
        dVar2.mo139371g();
        GetFeedCardsV4Request.C17160a a = new GetFeedCardsV4Request.C17160a().mo60439a(Integer.valueOf(i));
        if (feedFilter == null) {
            type = FeedFilter.Type.INBOX;
        } else {
            type = FeedFilter.Type.fromValue(feedFilter.getValue());
        }
        GetFeedCardsV4Request.C17160a a2 = a.mo60438a(type);
        if (dVar != null) {
            a2.mo60437a(new FeedCursor(Long.valueOf(dVar.mo139466a()), Long.valueOf(dVar.mo139467b())));
        } else if (j > 0) {
            a2.f43908a = Long.valueOf(j);
        }
        if (j2 > 0) {
            a2.f43911d = Long.valueOf(j2);
        }
        C37268c.m146766b().mo139192k();
        return SdkSender.syncSendMayError(Command.GET_FEED_CARDS_V4, a2, dVar2.mo139365c(), new SdkSender.IParser<AbstractC38118b.C38119a>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass16 */

            /* renamed from: a */
            public AbstractC38118b.C38119a parse(byte[] bArr) throws IOException {
                dVar2.mo139372h();
                dVar2.mo139369e();
                GetFeedCardsV4Response decode = GetFeedCardsV4Response.ADAPTER.decode(bArr);
                long longValue = decode.next_cursor.longValue();
                AbstractC38118b.C38119a aVar = new AbstractC38118b.C38119a();
                try {
                    com.ss.android.lark.feed.app.entity.FeedFilter feedFilter = feedFilter;
                    if (feedFilter == null) {
                        feedFilter = com.ss.android.lark.feed.app.entity.FeedFilter.INBOX;
                    }
                    aVar.f97746g = feedFilter;
                    aVar.f97745f = C38159h.m150024a(decode.previews);
                    if (!CollectionUtils.isEmpty(aVar.f97745f)) {
                        for (FeedPreviewInfo feedPreviewInfo : aVar.f97745f) {
                            if (aVar.f97744e < feedPreviewInfo.mo106092n()) {
                                aVar.f97744e = feedPreviewInfo.mo106092n();
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m165385e("FeedModule_FeedService", "getFeedCardsV4:feedFilter = " + feedFilter + " nextCursor = " + longValue + " pageCount = " + i, e, true);
                    aVar.f97745f = new ArrayList();
                }
                if (decode.feed_cursor != null) {
                    aVar.f97741b = C38159h.m150023a(decode.feed_cursor);
                } else {
                    aVar.f97740a = longValue;
                }
                aVar.f97747h = dVar2.mo139365c();
                dVar2.mo139370f();
                C37268c.m146766b().mo139193l();
                C37268c.m146766b().mo139194m();
                return aVar;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38118b
    /* renamed from: a */
    public SdkSender.C53233d<AbstractC38118b.C38119a> mo139440a(final PullType pullType, final long j, long j2, final int i, String str, final com.ss.android.lark.feed.app.entity.FeedFilter feedFilter, final C38073d dVar) {
        String str2;
        FeedFilter.Type type;
        dVar.mo139371g();
        GetFeedCardsV3Request.C17156a a = new GetFeedCardsV3Request.C17156a().mo60425a(GetFeedCardsV3Request.GetType.fromValue(pullType.getNumber())).mo60427a(Long.valueOf(j));
        if (str == null) {
            str2 = "0";
        } else {
            str2 = str;
        }
        GetFeedCardsV3Request.C17156a a2 = a.mo60428a(str2).mo60426a(Integer.valueOf(i));
        FeedFilter.C17128a aVar = new FeedFilter.C17128a();
        if (feedFilter == null) {
            type = FeedFilter.Type.INBOX;
        } else {
            type = FeedFilter.Type.fromValue(feedFilter.getValue());
        }
        GetFeedCardsV3Request.C17156a a3 = a2.mo60423a(aVar.mo60364a(type).build());
        if (pullType == PullType.BETWEEN_CURSOR) {
            a3.mo60424a(new GetFeedCardsV3Request.CursorRange.C17154a().mo60417a(Long.valueOf(j)).mo60419b(Long.valueOf(j2)).build());
        }
        C37268c.m146766b().mo139192k();
        return SdkSender.syncSendMayError(Command.GET_FEED_CARDS_V3, a3, dVar.mo139365c(), new SdkSender.IParser<AbstractC38118b.C38119a>() {
            /* class com.ss.android.lark.feed.service.impl.C38146f.AnonymousClass12 */

            /* renamed from: a */
            public AbstractC38118b.C38119a parse(byte[] bArr) throws IOException {
                dVar.mo139372h();
                dVar.mo139369e();
                GetFeedCardsV3Response decode = GetFeedCardsV3Response.ADAPTER.decode(bArr);
                if (decode.syncing_finish.booleanValue()) {
                    if (feedFilter == com.ss.android.lark.feed.app.entity.FeedFilter.INBOX) {
                        C37731d.m148488a().mo138395a(FeedCard.FeedType.INBOX);
                    } else if (feedFilter == com.ss.android.lark.feed.app.entity.FeedFilter.DONE) {
                        C37731d.m148488a().mo138395a(FeedCard.FeedType.DONE);
                    }
                }
                long longValue = decode.next_cursor.longValue();
                AbstractC38118b.C38119a aVar = new AbstractC38118b.C38119a();
                boolean z = true;
                try {
                    if (decode.filter != null) {
                        aVar.f97746g = com.ss.android.lark.feed.app.entity.FeedFilter.Companion.valueOf(decode.filter.filter_type.getValue());
                    } else {
                        aVar.f97746g = feedFilter;
                    }
                    aVar.f97745f = C38159h.m150024a(decode.entity_previews);
                    if (aVar.f97746g == com.ss.android.lark.feed.app.entity.FeedFilter.MUTE) {
                        for (GroupFeedCursor groupFeedCursor : decode.feed_continuous_cursor) {
                            if (groupFeedCursor.cursor_type == CursorType.INBOX) {
                                aVar.f97743d = C38159h.m150027b(groupFeedCursor.cursor);
                            }
                        }
                    } else {
                        aVar.f97743d = C38159h.m150027b(decode.continuous_cursors);
                    }
                    if (!CollectionUtils.isEmpty(aVar.f97745f)) {
                        for (FeedPreviewInfo feedPreviewInfo : aVar.f97745f) {
                            if (aVar.f97744e < feedPreviewInfo.mo106092n()) {
                                aVar.f97744e = feedPreviewInfo.mo106092n();
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m165385e("FeedModule_FeedService", "getFeedCardsV3:feedFilter = " + feedFilter + " getType = " + pullType + " cursorTime = " + j + " pageCount = " + i, e, true);
                    aVar.f97745f = new ArrayList();
                }
                aVar.f97740a = longValue;
                if (pullType != PullType.BETWEEN_CURSOR || !C37268c.m146766b().mo139198q().mo139256a("lark.feed.not_return_next_cursor")) {
                    z = false;
                }
                aVar.f97742c = z;
                aVar.f97747h = dVar.mo139365c();
                dVar.mo139370f();
                C37268c.m146766b().mo139193l();
                C37268c.m146766b().mo139194m();
                return aVar;
            }
        });
    }
}
