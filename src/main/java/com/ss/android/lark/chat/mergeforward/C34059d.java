package com.ss.android.lark.chat.mergeforward;

import android.text.TextUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.core.model.ObservableMappedArrayList;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.mergeforward.C34051a;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chat.service.impl.C34232o;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.chat.service.lkp.IConvertOfficeToSpaceService;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2993y.p2995b.p2996a.C59359a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.mergeforward.d */
public class C34059d extends BaseModel implements C34051a.AbstractC34052a {

    /* renamed from: a */
    public final MergeForwardContent f88043a;

    /* renamed from: b */
    public final MergeForwardContent f88044b;

    /* renamed from: c */
    public C33103ae f88045c;

    /* renamed from: d */
    public ObservableMappedArrayList<String, MessageInfo> f88046d;

    /* renamed from: e */
    IConvertOfficeToSpaceService f88047e = ConvertOfficeToSpaceService.f88310h.mo126548a();

    /* renamed from: f */
    private final AbstractC34297l f88048f = C32835d.m126323c();

    /* renamed from: g */
    private C34051a.AbstractC34052a.AbstractC34053a f88049g;

    /* renamed from: h */
    private List<MessageInfo> f88050h;

    /* renamed from: i */
    private final String f88051i;

    /* renamed from: j */
    private final FavoriteMessageInfo f88052j;

    /* renamed from: k */
    private final C33958d f88053k;

    /* renamed from: l */
    private final C59359a.AbstractC59363c f88054l = new C59359a.AbstractC59363c() {
        /* class com.ss.android.lark.chat.mergeforward.C34059d.C340601 */

        @Override // com.ss.android.lark.p2993y.p2995b.p2996a.C59359a.AbstractC59363c
        /* renamed from: a */
        public void mo123115a(C36874a aVar) {
            if (C34059d.this.f88043a != null && C34059d.this.f88043a.isTranslated() && C34059d.this.f88045c != null && aVar != null) {
                C34059d.this.f88045c.handlePushTranslateState(aVar, null);
            }
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.mergeforward.d$a */
    public static class C34065a implements ObservableMappedArrayList.AbstractC33947b<String, MessageInfo> {
        private C34065a() {
        }

        /* renamed from: a */
        public String mo124044a(MessageInfo messageInfo) {
            return messageInfo.getMessage().getId();
        }
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: b */
    public FavoriteMessageInfo mo126206b() {
        return this.f88052j;
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: d */
    public String mo126210d() {
        return this.f88051i;
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public void mo126204a(String str, final String str2) {
        final MessageInfo b = mo126207b(str2);
        if (b != null) {
            C34332b.m133110a(b.getMessage(), false, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chat.mergeforward.C34059d.C340645 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m132196a() {
                    UDToast.show(UIHelper.getContext(), UIHelper.getString(R.string.Lark_Video_CantDownloadTryAgain));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UICallbackExecutor.execute($$Lambda$d$5$IJBFZlhQ7LwWrn0whpr5185UyIU.INSTANCE);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    AudioContent audioContent = (AudioContent) b.getMessage().getContent();
                    if (TextUtils.isEmpty(str)) {
                        audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
                    } else {
                        audioContent.setProgress(100);
                        audioContent.setFileState(AudioContent.AudioState.DONE);
                        audioContent.setLocalFilePath(str);
                        C34332b.m133114b(audioContent);
                    }
                    C34059d.this.mo126229a(str2, b);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public void mo126205a(List<String> list) {
        C33103ae aeVar = this.f88045c;
    }

    /* renamed from: a */
    public void mo126230a(Map<String, MessageInfo> map) {
        this.f88053k.execute(new Runnable(map) {
            /* class com.ss.android.lark.chat.mergeforward.$$Lambda$d$j6Rvkyb9UlPrFPo4QmbrHk51jgg */
            public final /* synthetic */ Map f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C34059d.this.m132173b((C34059d) this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public String mo126199a() {
        return this.f88052j.getId();
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: c */
    public String mo126209c() {
        return this.f88043a.getMessageId();
    }

    /* renamed from: e */
    private void m132174e() {
        this.f88045c = new C33103ae(this.f88051i, new AbstractC33134w.AbstractC33135a() {
            /* class com.ss.android.lark.chat.mergeforward.C34059d.C340634 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: b */
            public void mo122324b(Collection<AbstractC34006a> collection) {
                mo122323a(collection);
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public void mo122323a(Collection<AbstractC34006a> collection) {
                MessageInfo itemByKey;
                HashMap hashMap = new HashMap();
                if (collection.size() != 0) {
                    AbstractC34006a next = collection.iterator().next();
                    if (collection.size() != 1 || next == null || next.getMessage().getType() != Message.Type.MERGE_FORWARD || next.getTranslateInfo() == null) {
                        for (AbstractC34006a aVar : collection) {
                            hashMap.put(aVar.getId(), (MessageInfo) aVar);
                        }
                    } else {
                        MergeForwardContent mergeForwardContent = (MergeForwardContent) next.getMessage().getContent();
                        HashMap hashMap2 = new HashMap();
                        for (Message message : ((MergeForwardContent) next.getTranslateInfo().getTranslateContent()).getMessages()) {
                            hashMap2.put(message.getId(), message);
                        }
                        for (Message message2 : mergeForwardContent.getMessages()) {
                            String id = message2.getId();
                            Message message3 = (Message) hashMap2.get(id);
                            if (!(message3 == null || message3.getTranslateDisplayRule() == 1 || (itemByKey = C34059d.this.f88046d.getItemByKey(id)) == null)) {
                                itemByKey.setIsTranslating(false);
                                itemByKey.setTranslateInfo(new TranslateInfo(id, message3.getTranslateLanguage(), message3.getContent()));
                                itemByKey.getMessage().setTranslateLanguage(message3.getTranslateLanguage());
                                itemByKey.getMessage().setTranslateDisplayRule(message3.getTranslateDisplayRule());
                                itemByKey.getMessage().setTranslatedManually(message3.isTranslatedManually());
                                hashMap.put(id, itemByKey);
                            }
                        }
                    }
                    C34059d.this.mo126230a(hashMap);
                }
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
            /* renamed from: a */
            public List<AbstractC34006a> mo122322a(Collection<String> collection, int i) {
                if (C34059d.this.f88046d != null) {
                    return new ArrayList(C34059d.this.f88046d.getItemsByKey(collection));
                }
                return Collections.emptyList();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f88049g = null;
        this.f88053k.mo124077c();
        C59359a.m230421a().mo201717b(this.f88054l);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f88050h = new ArrayList();
        this.f88049g.mo126211a(C34232o.m132851a().mo121388a(this.f88043a).f74159a);
        C59359a.m230421a().mo201713a(this.f88054l);
        m132174e();
    }

    /* renamed from: a */
    public void mo126228a(C34051a.AbstractC34052a.AbstractC34053a aVar) {
        this.f88049g = aVar;
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: b */
    public void mo126208b(final IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.chat.mergeforward.C34059d.RunnableC340623 */

            public void run() {
                C34059d dVar = C34059d.this;
                dVar.mo126227a(dVar.f88043a, C34059d.this.f88044b, (IGetDataCallback) C34059d.this.getCallbackManager().wrapAndAddCallback(iGetDataCallback));
            }
        });
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public void mo126202a(String str) {
        MessageInfo itemByKey;
        ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = this.f88046d;
        if (observableMappedArrayList != null && (itemByKey = observableMappedArrayList.getItemByKey(str)) != null) {
            mo126229a(str, itemByKey);
        }
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: b */
    public MessageInfo mo126207b(String str) {
        ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = this.f88046d;
        if (observableMappedArrayList == null) {
            return null;
        }
        return observableMappedArrayList.getItemByKey(str);
    }

    /* renamed from: a */
    private Chatter m132170a(ChatterInfo chatterInfo) {
        Chatter chatter = new Chatter();
        chatter.setId(chatterInfo.getId());
        chatter.setName(chatterInfo.getName());
        chatter.setType(chatterInfo.getType());
        chatter.setAvatarKey(chatterInfo.getAvatarKey());
        chatter.setAnonymous(chatterInfo.isAnonymous());
        chatter.setProfileEnable(true);
        return chatter;
    }

    /* access modifiers changed from: private */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.lark.chat.core.model.ObservableMappedArrayList<java.lang.String, com.ss.android.lark.chat.entity.message.MessageInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m132173b(Map map) {
        this.f88046d.beginUpdate();
        for (Map.Entry entry : map.entrySet()) {
            int itemPosByKey = this.f88046d.getItemPosByKey((String) entry.getKey());
            if (itemPosByKey != -1) {
                this.f88046d.set(itemPosByKey, entry.getValue());
            }
        }
        this.f88046d.finishUpdate();
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public void mo126201a(final IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        C29990c.m110930b().mo134522U().mo134619a(Collections.singletonList(this.f88052j.getId()), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
            /* class com.ss.android.lark.chat.mergeforward.C34059d.C340612 */

            /* renamed from: a */
            public void onSuccess(List<FavoriteMessageInfo> list) {
                iGetDataCallback.onSuccess(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public List<PhotoItem> mo126200a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        C34352r.m133227a(str, z, this.f88050h, arrayList);
        return C58659h.m227513a(arrayList);
    }

    /* renamed from: b */
    private void m132172b(MessageInfo messageInfo, Map<String, MessageInfo> map) {
        Message message = messageInfo.getMessage();
        String parentId = message.getParentId();
        if (!TextUtils.isEmpty(parentId) && map.containsKey(parentId)) {
            messageInfo.setParentMessageInfo(map.get(parentId));
        }
        String rootId = message.getRootId();
        if (!TextUtils.isEmpty(rootId) && map.containsKey(rootId)) {
            messageInfo.setRootMessageInfo(map.get(rootId));
        }
    }

    /* renamed from: a */
    private void m132171a(MessageInfo messageInfo, Map<String, Message> map) {
        Message message = map.get(messageInfo.getId());
        if (message != null) {
            messageInfo.setTranslateInfo(new TranslateInfo(message.getId(), message.getTranslateLanguage(), message.getContent()));
            messageInfo.getMessage().setTranslateLanguage(message.getTranslateLanguage());
            messageInfo.getMessage().setTranslateDisplayRule(message.getTranslateDisplayRule());
            messageInfo.getMessage().setTranslatedManually(message.isTranslatedManually());
            messageInfo.getMessage().setIsUnTranslatable(message.isUntranslatable());
        }
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34052a
    /* renamed from: a */
    public void mo126203a(String str, IGetDataCallback<String> iGetDataCallback) {
        this.f88047e.mo126547a(str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo126229a(String str, MessageInfo messageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, messageInfo);
        mo126230a(hashMap);
    }

    /* renamed from: a */
    public void mo126227a(MergeForwardContent mergeForwardContent, MergeForwardContent mergeForwardContent2, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        List<Message> messages = mergeForwardContent.getMessages();
        Map<String, ChatterInfo> chatters = mergeForwardContent.getChatters();
        if (CollectionUtils.isEmpty(messages) || CollectionUtils.isEmpty(chatters)) {
            iGetDataCallback.onError(new ErrorResult("Message or chatterInfo is empty"));
            return;
        }
        HashMap hashMap = new HashMap();
        if (!(mergeForwardContent2 == null || mergeForwardContent2.getMessages() == null)) {
            for (Message message : mergeForwardContent2.getMessages()) {
                if (C34350p.m133219b(message)) {
                    hashMap.put(message.getId(), message);
                }
            }
        }
        this.f88050h = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < messages.size(); i++) {
            Message message2 = messages.get(i);
            ChatterInfo chatterInfo = chatters.get(message2.getFromId());
            if (chatterInfo != null) {
                MessageInfo messageInfo = new MessageInfo(message2, new ChatChatter(m132170a(chatterInfo)));
                this.f88050h.add(messageInfo);
                hashMap2.put(message2.getId(), messageInfo);
                m132171a(messageInfo, hashMap);
                m132172b(messageInfo, hashMap2);
            } else {
                Log.m165382e("Failed to find chatterInfo, message id is:" + message2.getId());
            }
        }
        MessagePreviewAttachHelper.m132219a(messages);
        ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = new ObservableMappedArrayList<>(new C34065a(), true, true);
        this.f88046d = observableMappedArrayList;
        observableMappedArrayList.addAll(this.f88050h);
        iGetDataCallback.onSuccess(this.f88046d);
    }

    public C34059d(MergeForwardContent mergeForwardContent, MergeForwardContent mergeForwardContent2, String str, FavoriteMessageInfo favoriteMessageInfo) {
        this.f88043a = mergeForwardContent;
        this.f88044b = mergeForwardContent2;
        this.f88052j = favoriteMessageInfo;
        this.f88051i = str;
        this.f88053k = C33958d.m131429a("lk-merge-forward");
    }
}
