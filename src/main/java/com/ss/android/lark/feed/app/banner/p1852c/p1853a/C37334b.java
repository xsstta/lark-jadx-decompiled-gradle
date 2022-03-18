package com.ss.android.lark.feed.app.banner.p1852c.p1853a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.banner.export.AbstractC29491f;
import com.ss.android.lark.banner.export.entity.AbstractC29485a;
import com.ss.android.lark.banner.export.entity.C29489b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.statistics.p1866a.C37817a;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: com.ss.android.lark.feed.app.banner.c.a.b */
public class C37334b extends AbstractC29491f<AbstractC29485a> {

    /* renamed from: d */
    C37337a f95843d = new C37337a();

    /* renamed from: e */
    C37339b f95844e = new C37339b(this);

    /* renamed from: f */
    InvitationServiceApi.InvitePermissionResult f95845f;

    @Override // com.ss.android.lark.banner.export.AbstractC29491f
    /* renamed from: b */
    public AbstractC29485a mo104370b(C29489b bVar) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.b$a */
    public static class C37337a {
        private C37337a() {
        }

        /* renamed from: a */
        public void mo137188a(final IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback) {
            Log.m165379d("InviteBanner", "InviterBannerLoader net request");
            C37262a.m146726a().mo139206y().mo139266a(new IGetDataCallback<InvitationServiceApi.InvitePermissionResult>() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b.C37337a.C373381 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
                    C37337a.this.mo137189a(invitePermissionResult);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(invitePermissionResult);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo137189a(InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
            if (invitePermissionResult != null && invitePermissionResult.enableShow && invitePermissionResult.isDirectHide) {
                UserSP.getInstance().putBoolean("spIsDirectHide", true);
            }
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.b$b */
    private static class C37339b {

        /* renamed from: a */
        private C37334b f95851a;

        /* renamed from: a */
        public void mo137192a() {
            UserSP.getInstance().putBoolean("spIsClickInviterBannerClose", true);
            this.f95851a.mo104448e();
        }

        public C37339b(C37334b bVar) {
            this.f95851a = bVar;
        }

        /* renamed from: b */
        public void mo137193b(Context context, InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
            C37817a.m148838b(invitePermissionResult.isShowClose);
            C37268c.m146766b().mo139206y().mo139263a(context);
        }

        /* renamed from: a */
        public View mo137191a(final Context context, final InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
            if (invitePermissionResult == null) {
                return null;
            }
            int i = 0;
            final View inflate = LayoutInflater.from(context).inflate(R.layout.feed_inviter_banner, (ViewGroup) new FrameLayout(context), false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.inviterBannerClose);
            if (!invitePermissionResult.isShowClose) {
                i = 8;
            }
            imageView.setVisibility(i);
            if (DesktopUtil.m144301a(context)) {
                int dp2px = UIUtils.dp2px(context, 3.0f);
                imageView.setPadding(dp2px, dp2px, dp2px, dp2px);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(UIUtils.dp2px(context, 20.0f), UIUtils.dp2px(context, 20.0f));
                layoutParams.addRule(21);
                imageView.setLayoutParams(layoutParams);
            }
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b.C37339b.View$OnClickListenerC373401 */

                public void onClick(View view) {
                    C37339b.this.mo137192a();
                }
            });
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b.C37339b.View$OnClickListenerC373412 */

                public void onClick(View view) {
                    C37339b.this.mo137193b(context, invitePermissionResult);
                }
            });
            inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b.C37339b.View$OnAttachStateChangeListenerC373423 */

                public void onViewDetachedFromWindow(View view) {
                }

                public void onViewAttachedToWindow(View view) {
                    inflate.removeOnAttachStateChangeListener(this);
                    C37817a.m148836a(invitePermissionResult.isShowClose);
                }
            });
            return inflate;
        }
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public Observable<Boolean> mo104366a() {
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b.C373351 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
                C37334b.this.mo137186a(observableEmitter);
            }
        });
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public View mo104364a(Context context) {
        return this.f95844e.mo137191a(context, this.f95845f);
    }

    /* renamed from: a */
    public void mo137186a(final Emitter<Boolean> emitter) {
        if (emitter != null) {
            if (UserSP.getInstance().getBoolean("spIsClickInviterBannerClose") || UserSP.getInstance().getBoolean("spIsDirectHide")) {
                emitter.onNext(false);
                emitter.onComplete();
                return;
            }
            this.f95843d.mo137188a(new IGetDataCallback<InvitationServiceApi.InvitePermissionResult>() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37334b.C373362 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165381d("InviteBanner", errorResult);
                    emitter.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
                    boolean z;
                    C37334b.this.f95845f = invitePermissionResult;
                    if (invitePermissionResult == null || !invitePermissionResult.enableShow || invitePermissionResult.isDirectHide) {
                        z = false;
                    } else {
                        z = true;
                    }
                    emitter.onNext(Boolean.valueOf(z));
                    emitter.onComplete();
                }
            });
        }
    }
}
