package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.ChatQRCodeTokenResponse;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.GroupShareUtil;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.b */
public class C34666b extends BasePresenter<AbstractC34675c.AbstractC34676a, AbstractC34675c.AbstractC34678b, AbstractC34675c.AbstractC34678b.AbstractC34679a> {

    /* renamed from: a */
    public static final int f89482a = UIHelper.dp2px(245.0f);

    /* renamed from: b */
    public static final int f89483b = UIHelper.dp2px(245.0f);

    /* renamed from: c */
    public static final int f89484c = UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);

    /* renamed from: d */
    public AbstractC34671b f89485d;

    /* renamed from: e */
    public final Context f89486e;

    /* renamed from: f */
    public String f89487f;

    /* renamed from: g */
    public final AbstractC34461c.AbstractC34483v f89488g = ChatSettingModule.m133639a().mo127285o();

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.b$b */
    public interface AbstractC34671b {
        void checkStoragePermission(AbstractC51324c cVar);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.b$c */
    public class C34672c implements AbstractC34675c.AbstractC34678b.AbstractC34679a {
        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b.AbstractC34679a
        /* renamed from: b */
        public void mo128027b() {
            C34666b.this.mo128018a(true);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b.AbstractC34679a
        /* renamed from: d */
        public int mo128029d() {
            return ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128009e();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b.AbstractC34679a
        /* renamed from: c */
        public void mo128028c() {
            ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127983a(((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b().getId());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b.AbstractC34679a
        /* renamed from: a */
        public void mo128024a() {
            Chat b = ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b();
            if (b.isEdu()) {
                GroupHitPoint.f90519a.mo129207a(2, 1);
            }
            GroupHitPoint.f90519a.mo129209a(b, ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128010f(), ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128009e(), true);
            C34666b.this.f89485d.checkStoragePermission(new AbstractC51324c() {
                /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b.C34672c.C346731 */

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: b */
                public void mo49824b() {
                }

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: a */
                public void mo49823a() {
                    C34666b.this.mo128017a((IGetDataCallback<String>) null);
                }
            });
        }

        private C34672c() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b.AbstractC34679a
        /* renamed from: a */
        public void mo128025a(Bitmap bitmap) {
            ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo127999a(bitmap);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34678b.AbstractC34679a
        /* renamed from: a */
        public void mo128026a(boolean z) {
            Chat b = ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b();
            if (b.isEdu()) {
                GroupHitPoint.f90519a.mo129207a(2, 2);
            }
            GroupHitPoint.f90519a.mo129209a(b, ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128010f(), ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128009e(), false);
            Bitmap a = ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo127996a();
            if (a == null) {
                ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127979a(R.string.Lark_Legacy_QrCodeShareFailed);
            } else if (TextUtils.isEmpty(C26311p.m95265a(a, ((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo127997a(C34666b.this.f89486e)))) {
                ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127979a(R.string.Lark_Legacy_QrCodeShareFailed);
            } else {
                GroupHitPoint.f90519a.mo129236e(GroupHitPoint.f90519a.mo129217b(((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b()));
                C34666b.this.f89488g.mo127439a(C34666b.this.f89486e, a, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b.C34672c.C346742 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (errorResult.getErrorCode() == 101) {
                            LKUIToast.show(C34666b.this.f89486e, (int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        GroupHitPoint.f90519a.mo129233d(str, GroupHitPoint.f90519a.mo129217b(((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b()));
                        GroupHitPoint.f90519a.mo129222b(GroupHitPoint.f90519a.mo129217b(((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b()), C34666b.this.f89487f);
                        if (((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b().isEdu()) {
                            GroupHitPoint.f90519a.mo129216a(true, C34666b.this.f89487f);
                        }
                        if ("wechat_session".equals(str)) {
                            GroupHitPoint.f90519a.mo129243g(GroupHitPoint.f90519a.mo129217b(((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b()));
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34675c.AbstractC34678b.AbstractC34679a createViewDelegate() {
        return new C34672c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f89485d = null;
    }

    /* renamed from: b */
    public void mo128019b() {
        ((AbstractC34675c.AbstractC34676a) getModel()).mo128008d();
    }

    /* renamed from: c */
    private void m134700c() {
        Chat b = ((AbstractC34675c.AbstractC34676a) getModel()).mo128004b();
        if (b != null && b.isEdu()) {
            ((AbstractC34675c.AbstractC34676a) getModel()).mo128005b(new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b.C346682 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165386e("GroupQRCodePresenter", errorResult);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127989c(str);
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.b$a */
    public class C34670a implements AbstractC34675c.AbstractC34676a.AbstractC34677a {
        private C34670a() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.qrcode.AbstractC34675c.AbstractC34676a.AbstractC34677a
        /* renamed from: a */
        public void mo128023a(Chat chat) {
            UICallbackExecutor.post(new Runnable(chat) {
                /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$b$a$3XAuW5oA_XYISf4vqBOpOG5TXxY */
                public final /* synthetic */ Chat f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C34666b.C34670a.this.m134714b(this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m134714b(Chat chat) {
            ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127986b(C34666b.this.mo128012a(chat));
        }
    }

    /* renamed from: a */
    public void mo128015a(int i) {
        if (((AbstractC34675c.AbstractC34676a) getModel()).mo128003a(i)) {
            mo128018a(true);
        }
    }

    /* renamed from: a */
    public GroupQRCodeView.C34660a mo128012a(Chat chat) {
        String str;
        GroupQRCodeView.C34660a aVar = new GroupQRCodeView.C34660a();
        aVar.f89460a = chat.getId();
        aVar.f89461b = chat.getAvatarKey();
        aVar.f89462c = chat.getName();
        if (!TextUtils.isEmpty(chat.getTeamName())) {
            str = chat.getTeamName();
        } else if (chat.isCrossTenant()) {
            str = "";
        } else {
            str = ChatSettingModule.m133639a().mo127277g().mo127414b();
        }
        aVar.f89463d = str;
        aVar.f89464e = chat.isThread();
        aVar.f89466g = chat.isCrossTenant();
        aVar.f89465f = chat.isEdu();
        return aVar;
    }

    /* renamed from: a */
    public void mo128016a(Bundle bundle) {
        Chat chat;
        if (bundle != null && (chat = (Chat) bundle.getSerializable("extra_key_chat")) != null) {
            int i = bundle.getInt("extra_key_contact_mode", 1);
            boolean z = bundle.getBoolean("extra_key_show_title_bar", true);
            boolean z2 = bundle.getBoolean("extra_key_delay_init_fragment", false);
            this.f89487f = GroupHitPoint.f90519a.mo129203a(Integer.valueOf(i), Boolean.valueOf(z));
            ((AbstractC34675c.AbstractC34676a) getModel()).mo128001a(chat);
            ((AbstractC34675c.AbstractC34678b) getView()).mo127984a(z);
            ((AbstractC34675c.AbstractC34678b) getView()).mo127980a(mo128012a(chat));
            if (!z2) {
                mo128019b();
                mo128018a(true);
            }
            Log.m165379d("GroupQRCodePresenter", "initData source: " + this.f89487f);
        }
    }

    /* renamed from: a */
    public void mo128017a(final IGetDataCallback<String> iGetDataCallback) {
        ((AbstractC34675c.AbstractC34676a) getModel()).mo127998a(this.f89486e, new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b.C346693 */

            /* renamed from: a */
            public void onSuccess(String str) {
                ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127987b(str);
                ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127979a(R.string.Lark_Legacy_QrCodeSaveAlbum);
                GroupHitPoint.f90519a.mo129213a(GroupHitPoint.f90519a.mo129217b(((AbstractC34675c.AbstractC34676a) C34666b.this.getModel()).mo128004b()), C34666b.this.f89487f);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("save group qrcode image failed: " + errorResult.toString());
                ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127979a(R.string.Lark_Legacy_SaveFail);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo128018a(boolean z) {
        if (z || !((AbstractC34675c.AbstractC34676a) getModel()).mo128007c()) {
            ((AbstractC34675c.AbstractC34678b) getView()).mo127985b();
            ((AbstractC34675c.AbstractC34676a) getModel()).mo128000a(new IGetDataCallback<ChatQRCodeTokenResponse>() {
                /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.C34666b.C346671 */

                public static /* synthetic */ void lambda$YfejXSiAesq_RwB5tY3MJ4sw0Jc(C346671 r0, Bitmap bitmap, long j, boolean z) {
                    r0.m134710a(bitmap, j, z);
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m134709a() {
                    ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127988c();
                    ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127978a();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("get group qrcode token failed: " + errorResult.toString());
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$b$1$lM1nIOF1znZMPzMBVai_r8dADM */

                        public final void run() {
                            C34666b.C346671.this.m134709a();
                        }
                    });
                }

                /* renamed from: a */
                public void onSuccess(ChatQRCodeTokenResponse chatQRCodeTokenResponse) {
                    String url = chatQRCodeTokenResponse.getUrl();
                    UICallbackExecutor.execute(new Runnable(ChatSettingModule.m133639a().mo127263a(url, C34666b.f89482a, C34666b.f89483b, C34666b.f89484c), chatQRCodeTokenResponse.getExpireTime(), chatQRCodeTokenResponse.isUnLimited()) {
                        /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.$$Lambda$b$1$YfejXSiAesq_RwB5tY3MJ4sw0Jc */
                        public final /* synthetic */ Bitmap f$1;
                        public final /* synthetic */ long f$2;
                        public final /* synthetic */ boolean f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r5;
                        }

                        public final void run() {
                            C34666b.C346671.lambda$YfejXSiAesq_RwB5tY3MJ4sw0Jc(C34666b.C346671.this, this.f$1, this.f$2, this.f$3);
                        }
                    });
                }

                /* renamed from: a */
                private /* synthetic */ void m134710a(Bitmap bitmap, long j, boolean z) {
                    ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127988c();
                    ((AbstractC34675c.AbstractC34678b) C34666b.this.getView()).mo127981a(C34666b.this.mo128013a(bitmap, j, z));
                }
            });
            m134700c();
        }
    }

    /* renamed from: a */
    public GroupQRCodeView.C34661b mo128013a(Bitmap bitmap, long j, boolean z) {
        GroupQRCodeView.C34661b bVar = new GroupQRCodeView.C34661b();
        bVar.f89467a = bitmap;
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Group_QRcodeValidity, "option", GroupShareUtil.m134455b(((AbstractC34675c.AbstractC34676a) getModel()).mo128009e()));
        if (!GroupShareUtil.m134454a()) {
            mustacheFormat = C34501a.m133929a(UIHelper.getString(R.string.Lark_Legacy_QrCodeValidDesc), "time", j);
        }
        bVar.f89468b = mustacheFormat;
        return bVar;
    }

    public C34666b(Context context, AbstractC34675c.AbstractC34676a aVar, AbstractC34675c.AbstractC34678b bVar, AbstractC34671b bVar2) {
        super(aVar, bVar);
        this.f89486e = context;
        this.f89485d = bVar2;
        ((AbstractC34675c.AbstractC34676a) getModel()).mo128002a(new C34670a());
    }
}
