package com.ss.android.lark.favorite.p1837c.p1838a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.FavoritesType;
import com.bytedance.lark.pb.favorite.v1.CreateFavoritesRequest;
import com.bytedance.lark.pb.favorite.v1.DeleteFavoriteRequest;
import com.bytedance.lark.pb.favorite.v1.GetFavoritesRequest;
import com.bytedance.lark.pb.favorite.v1.GetFavoritesResponse;
import com.bytedance.lark.pb.favorite.v1.MergeFavoriteRequest;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitRequest;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.C29612d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.favorite.C37180d;
import com.ss.android.lark.favorite.p1836b.C37080a;
import com.ss.android.lark.favorite.p1837c.AbstractC37082a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.c.a.a */
public class C37083a implements AbstractC37082a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.favorite.c.a.a$a */
    public static class C37089a {

        /* renamed from: a */
        static C37083a f95316a = new C37083a();
    }

    private C37083a() {
    }

    /* renamed from: a */
    public static C37083a m146285a() {
        return C37089a.f95316a;
    }

    @Override // com.ss.android.lark.favorite.p1837c.AbstractC37082a
    /* renamed from: a */
    public List<FavoriteMessageInfo> mo136710a(FavoriteMessageInfo favoriteMessageInfo) {
        FavoriteMessageInfo favoriteMessageInfo2 = new FavoriteMessageInfo();
        favoriteMessageInfo2.setId(favoriteMessageInfo.getId());
        favoriteMessageInfo2.setCreateTime(favoriteMessageInfo.getCreateTime());
        favoriteMessageInfo2.setSourceMessage(favoriteMessageInfo.getSourceMessage());
        favoriteMessageInfo2.setSourceChat(favoriteMessageInfo.getSourceChat());
        favoriteMessageInfo2.setSourceChatter(favoriteMessageInfo.getSourceChatter());
        favoriteMessageInfo2.setType(favoriteMessageInfo.getType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(favoriteMessageInfo2);
        arrayList.add(favoriteMessageInfo);
        return arrayList;
    }

    /* renamed from: a */
    public List<FavoriteMessageInfo> mo136716a(List<FavoriteMessageInfo> list) {
        Chat chat;
        Chatter chatter;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FavoriteMessageInfo favoriteMessageInfo : list) {
            Message sourceMessage = favoriteMessageInfo.getSourceMessage();
            if (sourceMessage == null) {
                Log.m165383e("FavoriteService", "completeChattersAndChats() message is null, oriInfo = [" + favoriteMessageInfo + "]");
            } else {
                if (favoriteMessageInfo.getSourceChat() == null) {
                    arrayList2.add(sourceMessage.getChatId());
                }
                if (favoriteMessageInfo.getSourceChatter() == null) {
                    arrayList.add(sourceMessage.getFromId());
                }
            }
        }
        if (CollectionUtils.isEmpty(arrayList2) && CollectionUtils.isEmpty(arrayList)) {
            return list;
        }
        Map<String, Chatter> a = C37180d.m146463b().mo136701a(arrayList);
        if (a != null) {
            hashMap.putAll(a);
        }
        Map<String, Chat> b = C37180d.m146463b().mo136704b(arrayList2);
        if (b != null) {
            hashMap2.putAll(b);
        }
        for (FavoriteMessageInfo favoriteMessageInfo2 : list) {
            Message sourceMessage2 = favoriteMessageInfo2.getSourceMessage();
            if (sourceMessage2 != null) {
                if (favoriteMessageInfo2.getSourceChatter() == null && (chatter = (Chatter) hashMap.get(sourceMessage2.getFromId())) != null) {
                    favoriteMessageInfo2.setSourceChatter(chatter);
                }
                if (favoriteMessageInfo2.getSourceChat() == null && (chat = (Chat) hashMap2.get(sourceMessage2.getChatId())) != null) {
                    favoriteMessageInfo2.setSourceChat(chat);
                }
            }
        }
        return list;
    }

    @Override // com.ss.android.lark.favorite.p1837c.AbstractC37082a
    /* renamed from: a */
    public void mo136713a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        DeleteFavoriteRequest.C17082a aVar = new DeleteFavoriteRequest.C17082a();
        aVar.mo60256a(list);
        SdkSender.asynSendRequestNonWrap(Command.DELETE_FAVORITES, aVar, iGetDataCallback, new SdkSender.IParser<List<FavoriteMessageInfo>>() {
            /* class com.ss.android.lark.favorite.p1837c.p1838a.C37083a.C370863 */

            /* renamed from: a */
            public List<FavoriteMessageInfo> parse(byte[] bArr) throws IOException {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.lark.favorite.p1837c.AbstractC37082a
    /* renamed from: a */
    public void mo136711a(long j, int i, IGetDataCallback<C37080a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_FAVORITES, new GetFavoritesRequest.C17084a().mo60261a(Integer.valueOf(i)).mo60262a(Long.valueOf(j)), iGetDataCallback, new SdkSender.IParser<C37080a>() {
            /* class com.ss.android.lark.favorite.p1837c.p1838a.C37083a.C370874 */

            /* renamed from: a */
            public C37080a parse(byte[] bArr) throws IOException {
                GetFavoritesResponse decode = GetFavoritesResponse.ADAPTER.decode(bArr);
                return new C37080a(C37083a.this.mo136716a(C37090b.m146298a(decode.favorites_ids, decode.entity)), decode.has_more.booleanValue(), decode.min_time.longValue());
            }
        });
    }

    @Override // com.ss.android.lark.favorite.p1837c.AbstractC37082a
    /* renamed from: a */
    public void mo136714a(List<String> list, String str, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        CreateFavoritesRequest.C17080a aVar = new CreateFavoritesRequest.C17080a();
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            CreateFavoritesRequest.FavoritesTarget.C17078a a = new CreateFavoritesRequest.FavoritesTarget.C17078a().mo60245a(str2).mo60244a(FavoritesType.FAVORITES_MESSAGE);
            if (!TextUtils.isEmpty(str)) {
                a.mo60247b(str);
            }
            arrayList.add(a.build());
        }
        aVar.mo60251a(arrayList);
        Log.m165379d("FavoriteService", "CREATE_FAVORITES, originMergeForwardId:" + str);
        SdkSender.asynSendRequestNonWrap(Command.CREATE_FAVORITES, aVar, iGetDataCallback, new SdkSender.IParser<List<FavoriteMessageInfo>>() {
            /* class com.ss.android.lark.favorite.p1837c.p1838a.C37083a.C370852 */

            /* renamed from: a */
            public List<FavoriteMessageInfo> parse(byte[] bArr) throws IOException {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.lark.favorite.p1837c.AbstractC37082a
    /* renamed from: a */
    public void mo136712a(String str, List<String> list, List<C29612d> list2, IGetDataCallback<Map<String, String>> iGetDataCallback) {
        TransmitRequest.C18115a aVar = new TransmitRequest.C18115a();
        aVar.mo62837a(list);
        aVar.mo62836a(str);
        aVar.mo62835a(TransmitRequest.Type.FAVORITE);
        ArrayList arrayList = new ArrayList();
        for (C29612d dVar : list2) {
            arrayList.add(new Transmit2ThreadTarget.C18113a().mo62831b(dVar.f74223b).mo62829a(dVar.f74222a).build());
        }
        aVar.mo62840b(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.TRANSMIT, aVar, iGetDataCallback, new SdkSender.IParser<Map<String, String>>() {
            /* class com.ss.android.lark.favorite.p1837c.p1838a.C37083a.C370841 */

            /* renamed from: a */
            public Map<String, String> parse(byte[] bArr) throws IOException {
                TransmitResponse decode = TransmitResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    return decode.message_ids;
                }
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.favorite.p1837c.AbstractC37082a
    /* renamed from: a */
    public void mo136715a(List<String> list, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        MergeFavoriteRequest.C17088a a = new MergeFavoriteRequest.C17088a().mo60272a(list).mo60271a(str);
        if (!TextUtils.isEmpty(str2)) {
            a.mo60274b(str2);
        }
        Log.m165379d("FavoriteService", "MERGE_FAVORITE, originMergeForwardId:" + str2);
        SdkSender.asynSendRequestNonWrap(Command.MERGE_FAVORITE, a, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.favorite.p1837c.p1838a.C37083a.C370885 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }
}
