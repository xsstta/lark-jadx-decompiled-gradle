package com.ss.android.lark.favorite.p1837c.p1838a;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.FavoritesObject;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.favorite.C37180d;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.c.a.b */
public class C37090b {
    /* renamed from: a */
    public static List<FavoriteMessageInfo> m146298a(List<String> list, C14928Entity entity) {
        String str;
        ArrayList arrayList = new ArrayList();
        Map<String, Message> a = C37180d.m146463b().mo136700a(entity);
        Map<String, Chat> a2 = C37180d.m146463b().mo136702a(entity.chats);
        Map<String, Chatter> b = C37180d.m146463b().mo136703b(entity);
        Map<String, FavoritesObject> map = entity.favorites;
        for (String str2 : list) {
            FavoritesObject favoritesObject = map.get(str2);
            FavoritesObject.FavoritesContent favoritesContent = favoritesObject.content;
            if (favoritesContent == null) {
                str = "";
            } else {
                str = favoritesContent.message_id;
            }
            FavoriteMessageInfo favoriteMessageInfo = new FavoriteMessageInfo();
            favoriteMessageInfo.setId(str2);
            favoriteMessageInfo.setCreateTime(favoritesObject.create_time.longValue() * 1000);
            favoriteMessageInfo.setType(favoritesObject.type);
            Message message = a.get(str);
            if (message == null) {
                Log.m165389i("ModelParserFavorite", "not find in entity.messages, messageId: " + str);
            } else {
                favoriteMessageInfo.setSourceMessage(message);
                favoriteMessageInfo.setSourceChat(a2.get(message.getChatId()));
                favoriteMessageInfo.setSourceChatter(b.get(message.getFromId()));
                arrayList.add(favoriteMessageInfo);
            }
        }
        return arrayList;
    }
}
