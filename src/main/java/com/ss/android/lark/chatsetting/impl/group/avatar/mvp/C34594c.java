package com.ss.android.lark.chatsetting.impl.group.avatar.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.c */
public class C34594c extends BasePresenter<AbstractC34597d.AbstractC34598a, AbstractC34597d.AbstractC34600b, AbstractC34597d.AbstractC34600b.AbstractC34601a> {

    /* renamed from: a */
    private AvatarEditDelegate f89337a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34597d.AbstractC34600b.AbstractC34601a createViewDelegate() {
        return this.f89337a;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m134423b();
    }

    /* renamed from: b */
    private void m134423b() {
        ((AbstractC34597d.AbstractC34598a) getModel()).mo127760a(new IGetDataCallback<AvatarMeta>() {
            /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.C34594c.C345951 */

            /* renamed from: a */
            public void onSuccess(final AvatarMeta avatarMeta) {
                if (avatarMeta != null) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.chatsetting.impl.group.avatar.mvp.C34594c.C345951.RunnableC345961 */

                        public void run() {
                            ((AbstractC34597d.AbstractC34600b) C34594c.this.getView()).mo127794a(avatarMeta.getColor(), avatarMeta.getText(), avatarMeta.getType());
                        }
                    });
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AvatarEditPresenter", errorResult.toString());
            }
        });
    }

    /* renamed from: a */
    public void mo127819a(String str) {
        ((AbstractC34597d.AbstractC34600b) getView()).mo127796a(str);
    }

    public C34594c(AvatarEditView avatarEditView, AbstractC34590b bVar, AvatarEditDelegate aVar) {
        setView(avatarEditView);
        setModel(bVar);
        this.f89337a = aVar;
        avatarEditView.setViewDelegate(createViewDelegate());
        bVar.mo127813a(aVar);
    }
}
