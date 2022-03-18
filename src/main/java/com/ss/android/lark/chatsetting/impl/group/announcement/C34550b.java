package com.ss.android.lark.chatsetting.impl.group.announcement;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.aj;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.p1693a.C34457a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.b */
public class C34550b extends BaseModel implements AbstractC34561d.AbstractC34562a {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f89218a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    AbstractC34461c.AbstractC34466e f89219b = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: c */
    AbstractC34461c.AbstractC34476o f89220c = ChatSettingModule.m133639a().mo127277g();

    /* renamed from: d */
    AbstractC34461c.AbstractC34466e f89221d = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: e */
    public Chat f89222e;

    /* renamed from: f */
    public ChatChatter f89223f;

    /* renamed from: g */
    public ChatChatter f89224g;

    /* renamed from: h */
    private String f89225h;

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34562a
    /* renamed from: a */
    public Chat mo127706a() {
        return this.f89222e;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34562a
    /* renamed from: b */
    public ChatChatter mo127710b() {
        return this.f89224g;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34562a
    /* renamed from: a */
    public void mo127707a(final IGetDataCallback<AnnouncementViewData> iGetDataCallback) {
        m134235b(this.f89225h, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34550b.C345522 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                AnnouncementViewData announcementViewData = new AnnouncementViewData();
                ChatAnnouncement chatAnnouncement = chat.getChatAnnouncement();
                boolean z = false;
                if (chatAnnouncement == null || aj.m95021b(chatAnnouncement.getContent())) {
                    announcementViewData.isEmpty = true;
                } else {
                    announcementViewData.content = chatAnnouncement.getContent();
                    announcementViewData.updateTime = chatAnnouncement.getUpdateTime();
                    announcementViewData.lastEditorName = C34550b.this.f89221d.mo127350b(C34550b.this.f89223f);
                    announcementViewData.isEmpty = false;
                }
                announcementViewData.isInit = true;
                if (chat.getOwnerId().equals(C34550b.this.f89220c.mo127412a()) || !chat.isOnlyOwnerEditGroupInfo()) {
                    z = true;
                }
                announcementViewData.canEditAnnouncement = z;
                iGetDataCallback.onSuccess(announcementViewData);
            }
        }));
    }

    public C34550b(String str) {
        this.f89225h = str;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34562a
    /* renamed from: a */
    public void mo127708a(String str) {
        ChatAnnouncement chatAnnouncement = new ChatAnnouncement();
        chatAnnouncement.setChatId(this.f89225h);
        chatAnnouncement.setContent(str);
        C34457a.m133685a().mo127251a(chatAnnouncement);
    }

    /* renamed from: b */
    private void m134235b(final String str, final IGetDataCallback<Chat> iGetDataCallback) {
        Observable.create(new ObservableOnSubscribe<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34550b.C345566 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Chat> observableEmitter) throws Exception {
                Chat b = C34550b.this.f89218a.mo127349b(str);
                C34550b.this.f89222e = b;
                observableEmitter.onNext(b);
            }
        }).map(new Function<Chat, Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34550b.C345555 */

            /* renamed from: a */
            public Chat apply(Chat chat) throws Exception {
                String str;
                ArrayList arrayList = new ArrayList();
                String a = C34550b.this.f89220c.mo127412a();
                arrayList.add(a);
                ChatAnnouncement chatAnnouncement = chat.getChatAnnouncement();
                if (chatAnnouncement == null || TextUtils.isEmpty(chatAnnouncement.getLastEditorId())) {
                    str = null;
                } else {
                    str = chatAnnouncement.getLastEditorId();
                    arrayList.add(str);
                }
                Map<String, ChatChatter> a2 = C34550b.this.f89219b.mo127316a(str, arrayList);
                if (!TextUtils.isEmpty(str)) {
                    C34550b.this.f89223f = a2.get(str);
                }
                C34550b.this.f89224g = a2.get(a);
                return chat;
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34550b.C345533 */

            /* renamed from: a */
            public void accept(Chat chat) throws Exception {
                iGetDataCallback.onSuccess(chat);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34550b.C345544 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                Log.m165382e("prepare annoucement failed: " + th.getMessage());
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34562a
    /* renamed from: a */
    public void mo127709a(String str, final IGetDataCallback<C34549a> iGetDataCallback) {
        ChatAnnouncement chatAnnouncement = this.f89222e.getChatAnnouncement();
        String trim = str.trim();
        final boolean z = true;
        if (chatAnnouncement != null) {
            z = true ^ trim.equals(chatAnnouncement.getContent().trim());
        }
        if (z) {
            this.f89218a.mo127370d(this.f89225h, trim, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34550b.C345511 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(new C34549a(chat.getChatAnnouncement(), z));
                    }
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new C34549a(chatAnnouncement, z));
        }
    }
}
