package com.ss.android.lark.chatsetting.impl.group.announcement;

import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.aj;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.c */
public class C34557c extends BasePresenter<AbstractC34561d.AbstractC34562a, AbstractC34561d.AbstractC34563b, AbstractC34561d.AbstractC34563b.AbstractC34564a> {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f89238a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    private C34560a f89239b;

    /* renamed from: c */
    private CallbackManager f89240c = new CallbackManager();

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m134246b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34561d.AbstractC34563b.AbstractC34564a createViewDelegate() {
        C34560a aVar = new C34560a();
        this.f89239b = aVar;
        return aVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f89240c.cancelCallbacks();
        this.f89240c = null;
    }

    /* renamed from: b */
    private void m134246b() {
        ((AbstractC34561d.AbstractC34562a) getModel()).mo127707a(this.f89240c.wrapAndAddGetDataCallback(new IGetDataCallback<AnnouncementViewData>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34557c.C345581 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(AnnouncementViewData announcementViewData) {
                ((AbstractC34561d.AbstractC34563b) C34557c.this.getView()).mo127688a(announcementViewData.canEditAnnouncement);
                ((AbstractC34561d.AbstractC34563b) C34557c.this.getView()).mo127685a(announcementViewData);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.c$a */
    public class C34560a implements AbstractC34561d.AbstractC34563b.AbstractC34564a {
        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34563b.AbstractC34564a
        /* renamed from: a */
        public void mo127720a() {
            Chat a = ((AbstractC34561d.AbstractC34562a) C34557c.this.getModel()).mo127706a();
            if (a != null && a.getChatAnnouncement() != null) {
                ((AbstractC34561d.AbstractC34563b) C34557c.this.getView()).mo127689b(a.getChatAnnouncement().getContent());
            }
        }

        private C34560a() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.AbstractC34561d.AbstractC34563b.AbstractC34564a
        /* renamed from: a */
        public void mo127721a(String str) {
            C34557c.this.mo127717a(str);
        }
    }

    /* renamed from: a */
    public void mo127717a(final String str) {
        ((AbstractC34561d.AbstractC34562a) getModel()).mo127709a(str, this.f89240c.wrapAndAddGetDataCallback(new IGetDataCallback<C34549a>() {
            /* class com.ss.android.lark.chatsetting.impl.group.announcement.C34557c.C345592 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC34561d.AbstractC34563b) C34557c.this.getView()).mo127687a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SendAnnouncementFailed)));
            }

            /* renamed from: a */
            public void onSuccess(C34549a aVar) {
                ChatAnnouncement chatAnnouncement = aVar.f89216a;
                boolean z = aVar.f89217b;
                if (chatAnnouncement != null) {
                    if (z && !TextUtils.isEmpty(chatAnnouncement.getContent()) && !TextUtils.isEmpty(chatAnnouncement.getContent().trim())) {
                        ((AbstractC34561d.AbstractC34562a) C34557c.this.getModel()).mo127708a(str);
                        ((AbstractC34561d.AbstractC34563b) C34557c.this.getView()).mo127687a(UIHelper.getString(R.string.Lark_Legacy_SendAnnouncementSuccess));
                    }
                    AnnouncementViewData announcementViewData = new AnnouncementViewData();
                    if (!aj.m95021b(chatAnnouncement.getContent())) {
                        announcementViewData.content = chatAnnouncement.getContent();
                        announcementViewData.updateTime = chatAnnouncement.getUpdateTime();
                        announcementViewData.lastEditorName = C34557c.this.f89238a.mo127350b(((AbstractC34561d.AbstractC34562a) C34557c.this.getModel()).mo127710b());
                        announcementViewData.isEmpty = false;
                    } else {
                        announcementViewData.isEmpty = true;
                    }
                    announcementViewData.isInit = false;
                    announcementViewData.canEditAnnouncement = true;
                    ((AbstractC34561d.AbstractC34563b) C34557c.this.getView()).mo127685a(announcementViewData);
                }
            }
        }));
    }

    public C34557c(AbstractC34561d.AbstractC34562a aVar, AbstractC34561d.AbstractC34563b bVar) {
        super(aVar, bVar);
    }
}
