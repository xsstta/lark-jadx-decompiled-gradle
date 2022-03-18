package com.ss.android.lark.profile.func.friend_request.mvp;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.add_friend.UserAuthorityUtils;
import com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.c */
public class C52291c extends BasePresenter<AbstractC52283a.AbstractC52284a, AbstractC52283a.AbstractC52285b, AbstractC52283a.AbstractC52285b.AbstractC52286a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC52283a.AbstractC52285b.AbstractC52286a createViewDelegate() {
        return new C52297a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.c$a */
    public class C52297a implements AbstractC52283a.AbstractC52285b.AbstractC52286a {
        private C52297a() {
        }

        @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52285b.AbstractC52286a
        /* renamed from: a */
        public void mo179116a(String str, final Context context) {
            C52291c.this.mo179122a(str, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.profile.func.friend_request.mvp.C52291c.C52297a.C522981 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C52291c.this.mo179121a(str, context);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ReasonEditPresenter", "getFinalFriendRequestReason failed: " + errorResult.getDebugMsg());
                }
            });
        }
    }

    /* renamed from: a */
    private void m202906a(final IGetDataCallback<String> iGetDataCallback) {
        ((AbstractC52283a.AbstractC52284a) getModel()).mo179111a(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.C52291c.C522963 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ProfileFriendRequestReasonDefault, "reason", str));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo179120a(Bundle bundle) {
        String string = bundle.getString("contact_add_friend_token");
        String string2 = bundle.getString("contact_from_chat_id");
        ((AbstractC52283a.AbstractC52284a) getModel()).mo179115b(string);
        ((AbstractC52283a.AbstractC52284a) getModel()).mo179113a(string2);
        ((AbstractC52283a.AbstractC52284a) getModel()).mo179112a((ContactSource) bundle.getSerializable("contact_source"));
        m202906a(new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.C52291c.C522921 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                ((AbstractC52283a.AbstractC52285b) C52291c.this.getView()).mo179102a(str);
            }
        }));
    }

    public C52291c(AbstractC52283a.AbstractC52284a aVar, AbstractC52283a.AbstractC52285b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public void mo179121a(String str, final Context context) {
        ((AbstractC52283a.AbstractC52285b) getView()).mo179100a();
        ((AbstractC52283a.AbstractC52284a) getModel()).mo179114a(str, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.C52291c.C522932 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((AbstractC52283a.AbstractC52285b) C52291c.this.getView()).mo179104b();
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.profile.func.friend_request.mvp.C52291c.C522932.RunnableC522941 */

                    public void run() {
                        ((AbstractC52283a.AbstractC52285b) C52291c.this.getView()).mo179105b(UIHelper.getString(R.string.Lark_Legacy_FriendRequestSendSuccessed));
                        ((AbstractC52283a.AbstractC52285b) C52291c.this.getView()).mo179103a(true);
                    }
                }, 100);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                Log.m165383e("ReasonEditPresenter", "sendFriendRequest failed: " + errorResult.getDebugMsg());
                ((AbstractC52283a.AbstractC52285b) C52291c.this.getView()).mo179104b();
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.profile.func.friend_request.mvp.C52291c.C522932.RunnableC522952 */

                    public void run() {
                        if (errorResult.getErrorCode() == UserAuthorityUtils.f129641a.mo179073a()) {
                            UserAuthorityUtils.f129641a.mo179074a(context, errorResult);
                        } else {
                            ((AbstractC52283a.AbstractC52285b) C52291c.this.getView()).mo179107c(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_FriendRequestSendFailedRetry)));
                        }
                    }
                }, 100);
            }
        }));
    }

    /* renamed from: a */
    public void mo179122a(String str, IGetDataCallback<String> iGetDataCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.trim())) {
            m202906a(iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(str);
        }
    }
}
