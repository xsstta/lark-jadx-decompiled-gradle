package com.ss.android.lark.mine.impl.status.mvp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.mine.dto.C45423a;
import com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a;
import com.ss.android.lark.mine.impl.status.mvp.UserStatusView;
import com.ss.android.lark.mine.impl.status.statistics.ProfileHitPoint;
import com.ss.android.lark.mine.impl.status.statistics.ProfileHitPointV3;

/* renamed from: com.ss.android.lark.mine.impl.status.mvp.c */
public class C45827c extends BasePresenter<AbstractC45819a.AbstractC45820a, AbstractC45819a.AbstractC45821b, AbstractC45819a.AbstractC45821b.AbstractC45822a> {

    /* renamed from: a */
    public int f115625a = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC45819a.AbstractC45821b.AbstractC45822a createViewDelegate() {
        return new C45829a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m181549b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mine.impl.status.mvp.c$a */
    public class C45829a implements AbstractC45819a.AbstractC45821b.AbstractC45822a {
        @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45821b.AbstractC45822a
        /* renamed from: a */
        public void mo161066a() {
            ((AbstractC45819a.AbstractC45820a) C45827c.this.getModel()).mo161062a(C45827c.this.f115625a, 10, new UIGetDataCallback(new IGetDataCallback<C45423a>() {
                /* class com.ss.android.lark.mine.impl.status.mvp.C45827c.C45829a.C458312 */

                /* renamed from: a */
                public void onSuccess(C45423a aVar) {
                    C45827c.this.f115625a += 10;
                    ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161054a(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161056a(errorResult.getDisplayMsg("load fail"));
                }
            }));
        }

        private C45829a() {
        }

        @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45821b.AbstractC45822a
        /* renamed from: a */
        public void mo161067a(ChatterDescription chatterDescription) {
            ((AbstractC45819a.AbstractC45820a) C45827c.this.getModel()).mo161064a(chatterDescription, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.mine.impl.status.mvp.C45827c.C45829a.C458323 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161056a(errorResult.getDisplayMsg("delete status fail"));
                }
            }));
        }

        @Override // com.ss.android.lark.mine.impl.status.mvp.AbstractC45819a.AbstractC45821b.AbstractC45822a
        /* renamed from: a */
        public void mo161068a(String str, ChatterDescription.Type type) {
            ProfileHitPoint.f115592b.mo161044a(type.toString());
            ProfileHitPointV3.m181508a(str.length());
            ((AbstractC45819a.AbstractC45820a) C45827c.this.getModel()).mo161065a(str, type, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.mine.impl.status.mvp.C45827c.C45829a.C458301 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161053a();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161056a(errorResult.getDisplayMsg("save fail"));
                }
            }));
        }
    }

    /* renamed from: b */
    private void m181549b() {
        ((AbstractC45819a.AbstractC45820a) getModel()).mo161062a(this.f115625a, 10, new UIGetDataCallback(new IGetDataCallback<C45423a>() {
            /* class com.ss.android.lark.mine.impl.status.mvp.C45827c.C458281 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161056a(errorResult.getDisplayMsg("get status fail"));
            }

            /* renamed from: a */
            public void onSuccess(C45423a aVar) {
                C45827c.this.f115625a += 10;
                ((AbstractC45819a.AbstractC45821b) C45827c.this.getView()).mo161054a(aVar);
                ProfileHitPointV3.m181509a(!CollectionUtils.isEmpty(aVar.mo160294b()));
            }
        }));
    }

    /* renamed from: a */
    public void mo161073a(Intent intent) {
        ((AbstractC45819a.AbstractC45820a) getModel()).mo161063a(intent);
    }

    public C45827c(UserStatusView.AbstractC45818a aVar, Activity activity, Bundle bundle) {
        UserStatusView userStatusView = new UserStatusView(aVar, activity, bundle);
        C45823b bVar = new C45823b();
        setView(userStatusView);
        setModel(bVar);
        userStatusView.setViewDelegate(createViewDelegate());
    }
}
