package com.ss.android.lark.chatsetting.impl.group.setting;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.AbstractC34499f;
import com.ss.android.lark.chatsetting.dto.AbstractC34500g;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.dto.Shortcut;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.setting.C34947f;
import com.ss.android.lark.chatsetting.impl.group.setting.C34965i;
import com.ss.android.lark.chatsetting.impl.statistics.chat.ChatHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.chatbox.ChatBoxHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.p1693a.C34457a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GroupSettingModel extends BaseModel implements C34965i.AbstractC34966a {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f90105a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    AbstractC34461c.AbstractC34476o f90106b = ChatSettingModule.m133639a().mo127277g();

    /* renamed from: c */
    AbstractC34461c.AbstractC34471j f90107c;

    /* renamed from: d */
    AbstractC34461c.AbstractC34471j f90108d;

    /* renamed from: e */
    public Chat f90109e;

    /* renamed from: f */
    public Item f90110f;

    /* renamed from: g */
    public C34965i.AbstractC34966a.AbstractC34967a f90111g;

    /* renamed from: h */
    private final ArrayList<ChatChatter> f90112h = new ArrayList<>();

    /* renamed from: i */
    private Team f90113i;

    /* renamed from: j */
    private ChatSetting f90114j;

    /* renamed from: k */
    private boolean f90115k;

    /* renamed from: l */
    private int f90116l;

    /* renamed from: m */
    private TopicGroup f90117m;

    /* renamed from: n */
    private ChatChatter f90118n;

    /* renamed from: o */
    private final PushChatRelationListener f90119o = new PushChatRelationListener() {
        /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel.C349131 */

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127537a(Chat chat) {
            GroupSettingModel.this.mo128765c(chat);
        }

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: b */
        public void mo127540b(Chat chat, Map<String, ? extends Chatter> map) {
            GroupSettingModel.this.mo128761b(chat);
        }

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127538a(Chat chat, Map<String, ? extends Chatter> map) {
            GroupSettingModel.this.mo128750a(chat, map);
        }
    };

    /* renamed from: p */
    private final AbstractC34500g f90120p = new AbstractC34500g() {
        /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel.C349142 */

        @Override // com.ss.android.lark.chatsetting.dto.AbstractC34500g
        /* renamed from: a */
        public void mo127530a(TopicGroup topicGroup) {
            GroupSettingModel.this.mo128752a(topicGroup);
        }
    };

    /* renamed from: q */
    private final AbstractC34499f f90121q = new AbstractC34499f() {
        /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel.C349153 */

        @Override // com.ss.android.lark.chatsetting.dto.AbstractC34499f
        /* renamed from: a */
        public void mo127529a(List<Shortcut> list) {
            GroupSettingModel.this.mo128762b(list);
        }
    };

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: g */
    public boolean mo128773g() {
        return true;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public Chat mo128744a() {
        return this.f90109e;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: b */
    public Team mo128759b() {
        return this.f90113i;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: d */
    public int mo128768d() {
        return this.f90116l;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: h */
    public ChatChatter mo128774h() {
        return this.f90118n;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128756a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback) {
        this.f90105a.mo127337a(this.f90109e.getId(), Collections.singleton(ChatSettingModule.m133639a().mo127277g().mo127412a()), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128758a(boolean z, IGetDataCallback<Shortcut> iGetDataCallback) {
        Shortcut shortcut = new Shortcut(Channel.Type.CHAT, this.f90109e.getId());
        if (z) {
            this.f90107c.mo127391a(shortcut, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        } else {
            this.f90107c.mo127396b(shortcut, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128753a(C34947f.C34949a aVar) {
        this.f90109e = aVar.f90232b;
        this.f90118n = aVar.f90231a;
        this.f90114j = aVar.f90234d;
        this.f90115k = aVar.f90235e;
        this.f90116l = aVar.f90237g;
        this.f90117m = aVar.f90238h;
        ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f90109e.getId(), this.f90119o);
        if (this.f90117m != null && ChatSettingModule.m133639a().mo127268a("group.subscribe.enable")) {
            ChatSettingModule.m133639a().mo127275e().mo127430a(this.f90120p);
        }
        mo128776j();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128757a(List<ChatChatter> list) {
        this.f90112h.clear();
        this.f90112h.addAll(list.subList(0, Math.min(30, list.size())));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128755a(String str, IGetDataCallback<C34947f.C34949a> iGetDataCallback, IGetDataCallback<C34947f.C34949a> iGetDataCallback2) {
        C34947f.m136045a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback2));
    }

    /* renamed from: k */
    private String m135847k() {
        if (this.f90109e.isMeeting()) {
            return "meeting";
        }
        return "group";
    }

    /* renamed from: l */
    private String m135848l() {
        Chat chat = this.f90109e;
        if (chat == null) {
            return "";
        }
        return chat.getId();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: e */
    public boolean mo128771e() {
        return !ChatSettingModule.m133639a().mo127260E();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: f */
    public boolean mo128772f() {
        if (!this.f90109e.isOnlyOwnerEditGroupInfo() || this.f90109e.getOwnerId().equals(this.f90106b.mo127412a())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: i */
    public boolean mo128775i() {
        TopicGroup topicGroup = this.f90117m;
        if (topicGroup == null || topicGroup.getUserSetting() == null || !this.f90117m.getUserSetting().isFavorite()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo128776j() {
        Chat chat = this.f90109e;
        if (chat != null && chat.getChatAnnouncement() != null) {
            String docUrl = this.f90109e.getChatAnnouncement().getDocUrl();
            if (!TextUtils.isEmpty(docUrl)) {
                m135843c(Collections.singletonList(docUrl));
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC34461c.AbstractC34481t e = ChatSettingModule.m133639a().mo127275e();
        if (this.f90109e != null) {
            e.mo127431a(String.valueOf(hashCode()), this.f90109e.getId(), this.f90119o);
        }
        ChatSettingModule.m133639a().mo127278h().mo127392a(this.f90121q);
        EventBus.getDefault().register(this);
        this.f90105a = ChatSettingModule.m133639a().mo127274d();
        this.f90107c = ChatSettingModule.m133639a().mo127278h();
        this.f90108d = ChatSettingModule.m133639a().mo127278h();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        AbstractC34461c.AbstractC34481t e = ChatSettingModule.m133639a().mo127275e();
        ChatSettingModule.m133639a().mo127278h().mo127397b(this.f90121q);
        if (this.f90109e != null) {
            e.mo127433b(String.valueOf(hashCode()), this.f90109e.getId(), this.f90119o);
        }
        if (this.f90117m != null && ChatSettingModule.m133639a().mo127268a("group.subscribe.enable")) {
            ChatSettingModule.m133639a().mo127275e().mo127432b(this.f90120p);
        }
        EventBus.getDefault().unregister(this);
        super.destroy();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: c */
    public boolean mo128767c() {
        if (this.f90109e == null || this.f90110f == null || !C34501a.m133933a() || !this.f90109e.isTeam()) {
            return false;
        }
        return this.f90110f.isHidden();
    }

    /* renamed from: c */
    private void m135843c(List<String> list) {
        C57865c.m224576a(new Runnable(list) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingModel$0qrHuRTUkUuaNtsOgTDRy9e3GnY */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                GroupSettingModel.lambda$0qrHuRTUkUuaNtsOgTDRy9e3GnY(this.f$0);
            }
        });
    }

    /* renamed from: d */
    public static /* synthetic */ void m135845d(List list) {
        ChatSettingModule.m133639a().mo127258C().mo127386a(list);
    }

    /* renamed from: a */
    public void mo128754a(C34965i.AbstractC34966a.AbstractC34967a aVar) {
        this.f90111g = aVar;
    }

    /* renamed from: b */
    private void m135841b(String str) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$GroupSettingModel$f6XGoLEvMtUr93q5pJ_Vo5f8OU */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                GroupSettingModel.m270444lambda$f6XGoLEvMtUr93q5pJ_Vo5f8OU(GroupSettingModel.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128746a(IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f90109e.getId());
        this.f90105a.mo127346a(arrayList, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    public void onGroupAllowAnonymityUpdated(C34941c cVar) {
        if (TextUtils.equals(cVar.mo128861b(), m135848l())) {
            this.f90109e.setAnonymousSetting(cVar.mo128860a());
        }
    }

    public void onOnlyOwnerAddMemberPermissionUpdated(C34971k kVar) {
        if (TextUtils.equals(kVar.mo128926b(), m135848l())) {
            this.f90109e.setAddMemberPermission(kVar.mo128925a());
        }
    }

    public void onOnlyOwnerAtAllPermissionUpdated(C34972l lVar) {
        if (TextUtils.equals(lVar.mo128928b(), m135848l())) {
            this.f90109e.setAtAllPermission(lVar.mo128927a());
        }
    }

    public void onOnlyOwnerEditGroupInfoStateUpdated(C34973m mVar) {
        if (TextUtils.equals(mVar.mo128930b(), m135848l())) {
            this.f90109e.setOnlyOwnerEditGroupInfo(mVar.mo128929a());
        }
    }

    public void onShareCardPermissionUpdated(C34970j jVar) {
        if (TextUtils.equals(jVar.mo128924b(), m135848l())) {
            this.f90109e.setShareCardPermission(jVar.mo128923a());
        }
    }

    /* renamed from: d */
    private void m135844d(final Chat chat) {
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Map<String, Item>>() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel.C349186 */

            /* renamed from: a */
            public void onSuccess(Map<String, Item> map) {
                for (Item item : map.values()) {
                    if (TextUtils.equals(item.getEntityId(), chat.getId())) {
                        GroupSettingModel.this.f90110f = item;
                        GroupSettingModel.this.f90111g.mo128913a(GroupSettingModel.this.f90109e);
                    }
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult.getDebugMsg() != null) {
                    Log.m165383e("GroupSettingModel", "fetch chat item failed: " + errorResult.getDebugMsg());
                    return;
                }
                Log.m165383e("GroupSettingModel", "fetch chat item failed");
            }
        });
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(chat.getId());
        ChatSettingModule.m133639a().mo127294x().mo127446a(arrayList, Item.Type.CHAT, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: b */
    public void mo128760b(IGetDataCallback<Object> iGetDataCallback) {
        TopicGroup topicGroup = this.f90117m;
        if (topicGroup != null && !TextUtils.isEmpty(topicGroup.getId())) {
            this.f90105a.mo127379h(this.f90117m.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: c */
    public void mo128764c(IGetDataCallback<Object> iGetDataCallback) {
        TopicGroup topicGroup = this.f90117m;
        if (topicGroup != null && !TextUtils.isEmpty(topicGroup.getId())) {
            this.f90105a.mo127380i(this.f90117m.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m135842c(String str) {
        List<ChatChatter> a = this.f90105a.mo127315a(this.f90109e.getId(), C34945e.m136037c());
        if (!CollectionUtils.isNotEmpty(a) || this.f90111g == null) {
            Log.m165389i("GroupSettingModel", "cannot fetch chatchatters, chatId: " + str);
            return;
        }
        this.f90112h.clear();
        this.f90112h.addAll(a);
        this.f90111g.mo128916a(a);
    }

    /* renamed from: e */
    private void m135846e(Chat chat) {
        Log.m165389i("GroupSettingModel", "push chat user count = " + chat.getUserCount());
        if (chat.getUserCount() != this.f90109e.getUserCount()) {
            this.f90109e.setUserCount(chat.getUserCount());
        }
        String id = chat.getId();
        if (id.equals(this.f90109e.getId())) {
            m135841b(id);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public C34947f.C34949a mo128745a(String str) {
        Chat b = this.f90105a.mo127349b(str);
        if (b == null) {
            return null;
        }
        C34947f.C34949a aVar = new C34947f.C34949a();
        aVar.f90232b = b;
        ChatChatter a = this.f90105a.mo127313a(str, this.f90106b.mo127412a());
        if (a != null) {
            aVar.f90236f = a.getNickName();
        }
        aVar.f90231a = a;
        ChatSetting chatSetting = new ChatSetting();
        chatSetting.setRemind(b.isRemind());
        chatSetting.setChatId(b.getId());
        aVar.f90234d = chatSetting;
        aVar.f90235e = b.isShotCut();
        if (b.getChatMode() == Chat.ChatMode.THREAD_V2) {
            aVar.f90238h = this.f90105a.mo127363c(str);
        }
        return aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: d */
    public void mo128769d(final IGetDataCallback<Chat> iGetDataCallback) {
        C34457a.m133685a().mo127253a(this.f90109e.getId(), true);
        this.f90105a.mo127375f(this.f90109e.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel.C349164 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C34457a.m133685a().mo127253a(GroupSettingModel.this.f90109e.getId(), false);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (iGetDataCallback != null) {
                    Log.m165388i("disband chat success:" + chat.getId());
                    iGetDataCallback.onSuccess(chat);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128748a(final Chat chat) {
        if (chat == null || !C34501a.m133933a() || !chat.isTeam()) {
            mo128749a(chat, (Team) null);
            return;
        }
        m135844d(chat);
        ChatSettingModule.m133639a().mo127294x().mo127442a(chat.getTeamId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Team>() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel.C349175 */

            /* renamed from: a */
            public void onSuccess(Team team) {
                GroupSettingModel.this.mo128749a(chat, team);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                GroupSettingModel.this.mo128749a(chat, (Team) null);
                Log.m165389i("GroupSettingModel", errorResult.getDisplayMsg());
            }
        }));
    }

    /* renamed from: b */
    public void mo128761b(Chat chat) {
        Chat chat2;
        if (chat != null && (chat2 = this.f90109e) != null && chat2.getId().equals(chat.getId())) {
            m135846e(chat);
        }
    }

    /* renamed from: c */
    public void mo128765c(Chat chat) {
        if (chat != null && this.f90109e != null && chat.getId().equals(this.f90109e.getId())) {
            if (this.f90109e.getTeamId() != chat.getTeamId()) {
                mo128748a(chat);
            }
            this.f90111g.mo128914a(chat, this.f90109e, this.f90112h);
            this.f90109e = chat;
        }
    }

    /* renamed from: b */
    public void mo128762b(List<Shortcut> list) {
        Chat chat;
        if (!CollectionUtils.isEmpty(list) && (chat = this.f90109e) != null) {
            boolean z = false;
            String id = chat.getId();
            Iterator<Shortcut> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(it.next().getChannel().getId(), id)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f90111g.mo128917a(z);
        }
    }

    /* renamed from: a */
    public void mo128752a(TopicGroup topicGroup) {
        if (topicGroup == null) {
            Log.m165382e("push topic group == null");
        } else if (this.f90117m == null) {
            Log.m165382e("push mTopicGroup ==n ull");
        } else if (Objects.equals(topicGroup.getId(), this.f90117m.getId())) {
            this.f90117m = topicGroup;
            this.f90111g.mo128918b(mo128775i());
        }
    }

    /* renamed from: a */
    public void mo128749a(Chat chat, Team team) {
        this.f90113i = team;
        this.f90111g.mo128915a(chat, team);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: d */
    public void mo128770d(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        this.f90105a.mo127343a(this.f90109e.getId(), z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128747a(Chat.MessagePosition messagePosition, IGetDataCallback<Chat> iGetDataCallback) {
        this.f90105a.mo127332a(this.f90109e.getId(), messagePosition, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* renamed from: b */
    private void m135840b(Chat chat, Map<String, Chatter> map) {
        if (map.containsKey(ChatSettingModule.m133639a().mo127277g().mo127412a())) {
            this.f90111g.mo128912a();
            return;
        }
        Iterator<ChatChatter> it = this.f90112h.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next().getId())) {
                it.remove();
            }
        }
        if (this.f90112h.size() >= 8 || this.f90109e.getMemberCount() < 8) {
            this.f90109e.setUserCount(chat.getUserCount());
            this.f90111g.mo128916a(this.f90112h);
            return;
        }
        m135846e(this.f90109e);
    }

    /* renamed from: a */
    public void mo128750a(Chat chat, Map<String, ? extends Chatter> map) {
        Chat chat2;
        if (chat != null && (chat2 = this.f90109e) != null && chat2.getId().equals(chat.getId()) && CollectionUtils.isNotEmpty(map)) {
            m135840b(chat, (Map<String, Chatter>) map);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: c */
    public void mo128766c(boolean z, IGetDataCallback<Object> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f90109e.getId());
        String k = m135847k();
        if (z) {
            this.f90108d.mo127393a(arrayList, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
            ChatBoxHitPoint.f90518a.mo129202a(k, "chat_setting", this.f90109e.getId(), !this.f90109e.isRemind());
            return;
        }
        this.f90108d.mo127394a(arrayList, this.f90109e.isRemind(), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        ChatBoxHitPoint.f90518a.mo129201a(k, "chat_setting", this.f90109e.getId());
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: a */
    public void mo128751a(Chatter chatter, IGetDataCallback<Chat> iGetDataCallback) {
        this.f90105a.mo127373e(this.f90109e.getId(), chatter.getId(), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a
    /* renamed from: b */
    public void mo128763b(boolean z, IGetDataCallback iGetDataCallback) {
        String str;
        this.f90105a.mo127374e(this.f90109e.getId(), z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        if (this.f90109e.isMeeting()) {
            str = "meeting";
        } else {
            str = "group";
        }
        if (z) {
            ChatHitPoint.f90516a.mo129188b(str, this.f90109e.getId());
        } else {
            ChatHitPoint.f90516a.mo129187a(str, this.f90109e.getId());
        }
    }
}
