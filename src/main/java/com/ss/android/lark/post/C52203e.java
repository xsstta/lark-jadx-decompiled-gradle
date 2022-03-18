package com.ss.android.lark.post;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.C29596a;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.biz.im.api.IThreadService;
import com.ss.android.lark.biz.im.api.TopicGroupsResponse;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.post.AbstractC52159a;
import com.ss.android.lark.post.C52207f;
import java.util.List;

/* renamed from: com.ss.android.lark.post.e */
public class C52203e extends BaseModel implements AbstractC52159a.AbstractC52160a {

    /* renamed from: a */
    public final C52219g f129518a;

    /* renamed from: b */
    public String f129519b = null;

    /* renamed from: c */
    private C52207f.C52213a f129520c;

    /* renamed from: d */
    private final IThreadService f129521d = C32881i.m126556a();

    /* renamed from: e */
    private ChatChatter f129522e;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: a */
    public Boolean mo178670a() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.f129519b));
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: b */
    public ChatChatter mo178674b() {
        if (this.f129518a.mo178782b() == null) {
            return null;
        }
        ChatChatter chatChatter = this.f129522e;
        if (chatChatter != null && TextUtils.equals(chatChatter.getChatId(), this.f129518a.mo178782b().getId())) {
            return this.f129522e;
        }
        ChatChatter a = C32835d.m126323c().m126324c(this.f129518a.mo178782b().getId(), C29990c.m110930b().mo134515N().mo134394a());
        this.f129522e = a;
        return a;
    }

    /* renamed from: a */
    public void mo178755a(C52207f.C52213a aVar) {
        this.f129520c = aVar;
    }

    C52203e(C52219g gVar) {
        this.f129518a = gVar;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: a */
    public void mo178671a(IGetDataCallback<Chat> iGetDataCallback) {
        C32821b.m126120a().mo120994a(this.f129518a.mo178790g(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: c */
    public void mo178676c(IGetDataCallback<Long> iGetDataCallback) {
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        this.f129521d.mo106484a(new IGetDataCallback<C29596a>() {
            /* class com.ss.android.lark.post.C52203e.C522063 */

            /* renamed from: a */
            public void onSuccess(C29596a aVar) {
                long a = aVar.mo106642a();
                IGetDataCallback iGetDataCallback = wrapAndAddGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Long.valueOf(a));
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = wrapAndAddGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(0L);
                    Log.m165383e("PostMessageModel", "getAnonymousLeftQuota error : " + errorResult.getDisplayMsg());
                }
            }
        });
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: b */
    public void mo178675b(final IGetDataCallback<Boolean> iGetDataCallback) {
        if (mo178670a().booleanValue()) {
            this.f129521d.mo106483a(20, this.f129519b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<TopicGroupsResponse>() {
                /* class com.ss.android.lark.post.C52203e.C522052 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(TopicGroupsResponse agVar) {
                    C52203e.this.f129519b = agVar.mo106688b();
                    Boolean valueOf = Boolean.valueOf(CollectionUtils.isNotEmpty(agVar.mo106685a()));
                    if (C52203e.this.f129518a.mo178791h() == null || !CollectionUtils.isNotEmpty(agVar.mo106685a())) {
                        iGetDataCallback.onSuccess(valueOf);
                        return;
                    }
                    C52203e.this.f129518a.mo178791h().addAll(agVar.mo106685a());
                    iGetDataCallback.onSuccess(valueOf);
                }
            }));
        }
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: a */
    public boolean mo178673a(Chat chat) {
        if (chat != null && chat.isAllowPost() && chat.getRole() == Chat.Role.MEMBER) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52160a
    /* renamed from: a */
    public void mo178672a(final IGetDataCallback<List<C29607af>> iGetDataCallback, final boolean z) {
        this.f129521d.mo106483a(20, null, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<TopicGroupsResponse>() {
            /* class com.ss.android.lark.post.C52203e.C522041 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(TopicGroupsResponse agVar) {
                if (!CollectionUtils.isEmpty(agVar.mo106685a())) {
                    if (z || !CollectionUtils.isNotEmpty(C52203e.this.f129518a.mo178791h())) {
                        C52203e.this.f129519b = agVar.mo106688b();
                        C52203e.this.f129518a.mo178781a(agVar.mo106685a());
                        iGetDataCallback.onSuccess(agVar.mo106685a());
                    }
                }
            }
        }));
    }
}
