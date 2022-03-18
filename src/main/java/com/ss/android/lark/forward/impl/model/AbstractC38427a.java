package com.ss.android.lark.forward.impl.model;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.impl.model.packer.ForwardTargetParser;
import com.ss.android.lark.forward.impl.p1899a.AbstractC38410a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.impl.model.a */
public abstract class AbstractC38427a extends BaseModel implements AbstractC38410a.AbstractC38411a {

    /* renamed from: a */
    private Map<String, SearchBaseInfo> f98794a = new LinkedHashMap();

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: b */
    public CallbackManager mo140937b() {
        return getCallbackManager();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: a */
    public List<SearchBaseInfo> mo140933a() {
        return new ArrayList(this.f98794a.values());
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: a */
    public SearchBaseInfo mo140932a(String str) {
        Chat b;
        Chatter.ChatterType chatterType;
        if (TextUtils.isEmpty(str) || (b = C38364a.m151054a().mo140442d().mo140489b(str)) == null) {
            return null;
        }
        if (b.getType() == Chat.Type.P2P) {
            SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
            searchChatterInfo.setScene(Scene.Type.TRANSMIT_MESSAGES);
            searchChatterInfo.setTitle(b.getName());
            searchChatterInfo.setAvatarKey(b.getAvatarKey());
            searchChatterInfo.setCrossTenant(b.isCrossTenant());
            searchChatterInfo.setId(b.getP2pChatterId());
            searchChatterInfo.setRegistered(!b.getTags().contains(Tag.UNACTIVATED));
            searchChatterInfo.setP2pChatId(b.getId());
            if (b.getTags().contains(Tag.BOT)) {
                chatterType = Chatter.ChatterType.BOT;
            } else {
                chatterType = Chatter.ChatterType.USER;
            }
            searchChatterInfo.setChatterType(chatterType);
            searchChatterInfo.setChatterDescription(new ChatterDescription(b.getDescription(), ChatterDescription.Type.DEFAULT));
            searchChatterInfo.setP2pCryptoChat(b.isSecret());
            return searchChatterInfo;
        } else if (b.getType() != Chat.Type.GROUP && b.getType() != Chat.Type.TOPIC_GROUP) {
            return null;
        } else {
            SearchChatInfo searchChatInfo = new SearchChatInfo();
            searchChatInfo.setScene(Scene.Type.TRANSMIT_MESSAGES);
            searchChatInfo.setTitle(b.getName());
            searchChatInfo.setAvatarKey(b.getAvatarKey());
            searchChatInfo.setCrossTenant(b.isCrossTenant());
            searchChatInfo.setId(b.getId());
            searchChatInfo.setChatType(b.getType());
            searchChatInfo.setUserCount(b.getUserCount());
            searchChatInfo.setMemberCount(b.getMemberCount());
            searchChatInfo.setChatMode(b.getChatMode());
            searchChatInfo.setDepartment(b.is_department());
            searchChatInfo.setTenant(b.isTenant());
            searchChatInfo.setSecretChat(b.isSecret());
            searchChatInfo.setPublic(b.isPublic());
            searchChatInfo.setMember(b.isMember());
            searchChatInfo.setIsMeeting(b.isMeeting());
            searchChatInfo.setOfficialOnCall(b.isOfficialOncall());
            searchChatInfo.setCrossWithKa(b.isCrossWithKa());
            searchChatInfo.setTags(b.getTags());
            return searchChatInfo;
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: a */
    public void mo140934a(SearchBaseInfo searchBaseInfo, boolean z) {
        String id = searchBaseInfo.getId();
        if (z && !this.f98794a.containsKey(id)) {
            this.f98794a.put(id, searchBaseInfo);
        } else if (!z && this.f98794a.containsKey(id)) {
            this.f98794a.remove(id);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo140977b(List<SearchBaseInfo> list, final IGetDataCallback<List<ForwardTarget>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo instanceof SearchChatterInfo) {
                arrayList.add(searchBaseInfo.getId());
            } else if (searchBaseInfo instanceof SearchChatInfo) {
                arrayList2.add(ForwardTargetParser.m151569a(searchBaseInfo));
            } else if (searchBaseInfo instanceof SearchThreadInfo) {
                arrayList2.add(ForwardTargetParser.m151569a(searchBaseInfo));
            }
        }
        if (arrayList.isEmpty()) {
            iGetDataCallback.onSuccess(arrayList2);
            return;
        }
        C38364a.m151054a().mo140442d().mo140492b(arrayList, new IGetDataCallback<Map<String, ? extends OpenChat>>() {
            /* class com.ss.android.lark.forward.impl.model.AbstractC38427a.C384281 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, ? extends OpenChat> map) {
                for (String str : map.keySet()) {
                    arrayList2.add(ForwardTargetParser.m151568a((OpenChat) map.get(str)));
                }
                iGetDataCallback.onSuccess(arrayList2);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo140978c(List<SearchBaseInfo> list, final IGetDataCallback<List<ForwardTarget>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo instanceof SearchChatterInfo) {
                arrayList.add(searchBaseInfo.getId());
            } else {
                arrayList2.add(ForwardTargetParser.m151569a(searchBaseInfo));
            }
        }
        if (arrayList.isEmpty()) {
            iGetDataCallback.onSuccess(arrayList2);
            return;
        }
        C38364a.m151054a().mo140442d().mo140485a(arrayList, new IGetDataCallback<Map<String, Chatter>>() {
            /* class com.ss.android.lark.forward.impl.model.AbstractC38427a.C384292 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Chatter> map) {
                for (String str : map.keySet()) {
                    arrayList2.add(ForwardTargetParser.m151567a(map.get(str)));
                }
                iGetDataCallback.onSuccess(arrayList2);
            }
        });
    }
}
