package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.ChatQRCodeTokenResponse;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.impl.group.GroupShareUtil;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.a */
public class C34663a extends BaseModel implements AbstractC34675c.AbstractC34676a {

    /* renamed from: a */
    public final Map<Integer, ChatQRCodeTokenResponse> f89471a = new ConcurrentHashMap();

    /* renamed from: b */
    public int f89472b = 0;

    /* renamed from: c */
    private Bitmap f89473c;

    /* renamed from: d */
    private Chat f89474d;

    /* renamed from: e */
    private AbstractC34675c.AbstractC34676a.AbstractC34677a f89475e;

    /* renamed from: f */
    private int f89476f = 0;

    /* renamed from: g */
    private final PushChatRelationListener f89477g = new PushChatRelationListener() {
        /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34663a.C346641 */

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127537a(Chat chat) {
            C34663a.this.mo128006b(chat);
        }
    };

    /* renamed from: h */
    private final AbstractC34461c.AbstractC34466e f89478h = ChatSettingModule.m133639a().mo127274d();

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public Bitmap mo127996a() {
        return this.f89473c;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: b */
    public Chat mo128004b() {
        return this.f89474d;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: e */
    public int mo128009e() {
        return this.f89472b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: f */
    public int mo128010f() {
        return this.f89476f;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: c */
    public boolean mo128007c() {
        if (this.f89471a.get(Integer.valueOf(this.f89472b)) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: d */
    public void mo128008d() {
        int a = ChatSettingService.f88988a.mo127453a(this.f89474d.getId(), "qrcode");
        this.f89476f = a;
        this.f89472b = a;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f89474d != null) {
            ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f89474d.getId(), this.f89477g);
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (this.f89474d != null) {
            ChatSettingModule.m133639a().mo127275e().mo127433b(String.valueOf(hashCode()), this.f89474d.getId(), this.f89477g);
        }
        this.f89475e = null;
    }

    /* renamed from: c */
    private void m134682c(Chat chat) {
        AbstractC34675c.AbstractC34676a.AbstractC34677a aVar = this.f89475e;
        if (aVar != null) {
            aVar.mo128023a(chat);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public void mo127999a(Bitmap bitmap) {
        this.f89473c = bitmap;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public void mo128002a(AbstractC34675c.AbstractC34676a.AbstractC34677a aVar) {
        this.f89475e = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public void mo128000a(final IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback) {
        ChatQRCodeTokenResponse chatQRCodeTokenResponse = this.f89471a.get(Integer.valueOf(this.f89472b));
        if (chatQRCodeTokenResponse == null || iGetDataCallback == null) {
            m134681c(new IGetDataCallback<ChatQRCodeTokenResponse>() {
                /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34663a.C346652 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(ChatQRCodeTokenResponse chatQRCodeTokenResponse) {
                    if (iGetDataCallback != null) {
                        C34663a.this.f89471a.put(Integer.valueOf(C34663a.this.f89472b), chatQRCodeTokenResponse);
                        iGetDataCallback.onSuccess(chatQRCodeTokenResponse);
                    }
                }
            });
        } else {
            iGetDataCallback.onSuccess(chatQRCodeTokenResponse);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: b */
    public void mo128005b(IGetDataCallback<String> iGetDataCallback) {
        this.f89478h.mo127357b(this.f89474d.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    /* renamed from: c */
    private void m134681c(IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback) {
        boolean z;
        IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
        if (GroupShareUtil.m134454a()) {
            AbstractC34461c.AbstractC34466e eVar = this.f89478h;
            String id = this.f89474d.getId();
            int a = GroupShareUtil.m134452a(this.f89472b);
            if (this.f89472b == 2) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo127325a(id, a, z, iGetDataCallback2);
            return;
        }
        this.f89478h.mo127324a(this.f89474d.getId(), 7, iGetDataCallback2);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public String mo127997a(Context context) {
        return C57881t.m224606E(context) + System.currentTimeMillis() + "_" + "group_qrcode_share" + ".jpg";
    }

    /* renamed from: b */
    public void mo128006b(Chat chat) {
        if (chat != null) {
            if (chat.getId().equals(this.f89474d.getId())) {
                String name = this.f89474d.getName();
                String description = this.f89474d.getDescription();
                String avatarKey = this.f89474d.getAvatarKey();
                if (!TextUtils.equals(chat.getName(), name) || !TextUtils.equals(chat.getDescription(), description) || !TextUtils.equals(chat.getAvatarKey(), avatarKey)) {
                    m134682c(chat);
                }
                this.f89474d = chat;
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public void mo128001a(Chat chat) {
        this.f89474d = chat;
        ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f89474d.getId(), this.f89477g);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public boolean mo128003a(int i) {
        if (this.f89472b == i) {
            return false;
        }
        this.f89472b = i;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m134680b(Context context, IGetDataCallback iGetDataCallback) {
        String a = C26311p.m95265a(this.f89473c, C57881t.m224651w(context) + System.currentTimeMillis() + ".jpg");
        if (iGetDataCallback == null) {
            return;
        }
        if (!TextUtils.isEmpty(a)) {
            iGetDataCallback.onSuccess(a);
        } else {
            iGetDataCallback.onError(new ErrorResult("the image absolute path is empty"));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a
    /* renamed from: a */
    public void mo127998a(Context context, IGetDataCallback<String> iGetDataCallback) {
        IGetDataCallback iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
        if (this.f89473c != null) {
            C57865c.m224576a(new Runnable(context, iGetDataCallback2) {
                /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$a$c9UWQETskDzeIbFj7x1pTHf93PM */
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ IGetDataCallback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C34663a.this.m134680b(this.f$1, this.f$2);
                }
            });
        } else if (iGetDataCallback2 != null) {
            iGetDataCallback2.onError(new ErrorResult("this current qrcode bitmap is null"));
        }
    }
}
