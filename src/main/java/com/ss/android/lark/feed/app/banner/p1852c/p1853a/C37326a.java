package com.ss.android.lark.feed.app.banner.p1852c.p1853a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: com.ss.android.lark.feed.app.banner.c.a.a */
public class C37326a extends AbstractC29491f<AbstractC29485a> {

    /* renamed from: d */
    C37329a f95831d = new C37329a();

    /* renamed from: e */
    C37331b f95832e = new C37331b(this);

    /* renamed from: f */
    InvitationServiceApi.InviteActivityBannerResult f95833f;

    @Override // com.ss.android.lark.banner.export.AbstractC29491f
    /* renamed from: b */
    public AbstractC29485a mo104370b(C29489b bVar) {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.a$a */
    public static class C37329a {
        private C37329a() {
        }

        /* renamed from: a */
        private void m147008a() {
            UserSP.getInstance().putString("key_param_activity_banner_url", "");
        }

        /* renamed from: a */
        public void mo137178a(final IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback) {
            m147008a();
            C37262a.m146726a().mo139206y().mo139270b(new IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult>() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37326a.C37329a.C373301 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(InvitationServiceApi.InviteActivityBannerResult inviteActivityBannerResult) {
                    C37329a.this.mo137179a(inviteActivityBannerResult);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(inviteActivityBannerResult);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo137179a(InvitationServiceApi.InviteActivityBannerResult inviteActivityBannerResult) {
            if (inviteActivityBannerResult != null && inviteActivityBannerResult.summary && !TextUtils.isEmpty(inviteActivityBannerResult.summardUrl)) {
                UserSP.getInstance().putString("key_param_activity_banner_url", inviteActivityBannerResult.summardUrl);
            }
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.a$b */
    private static class C37331b {

        /* renamed from: a */
        private C37326a f95839a;

        /* renamed from: a */
        public void mo137182a() {
            UserSP.getInstance().putBoolean("key_param_activity_banner_hide", true);
            this.f95839a.mo104448e();
        }

        public C37331b(C37326a aVar) {
            this.f95839a = aVar;
        }

        /* renamed from: b */
        public void mo137183b(Context context, InvitationServiceApi.InviteActivityBannerResult inviteActivityBannerResult) {
            C37817a.m148835a();
            if (inviteActivityBannerResult != null) {
                C37262a.m146726a().mo139183b(context, inviteActivityBannerResult.summardUrl);
            }
        }

        /* renamed from: a */
        public View mo137181a(Context context, final InvitationServiceApi.InviteActivityBannerResult inviteActivityBannerResult) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.feed_inviter_activity_banner, (ViewGroup) new FrameLayout(context), false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.inviterBannerClose);
            if (DesktopUtil.m144301a(context)) {
                int dp2px = UIUtils.dp2px(context, 3.0f);
                imageView.setPadding(dp2px, dp2px, dp2px, dp2px);
            }
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37326a.C37331b.View$OnClickListenerC373321 */

                public void onClick(View view) {
                    C37331b.this.mo137182a();
                }
            });
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37326a.C37331b.View$OnClickListenerC373332 */

                public void onClick(View view) {
                    C37331b.this.mo137183b(view.getContext(), inviteActivityBannerResult);
                }
            });
            return inflate;
        }
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public Observable<Boolean> mo104366a() {
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37326a.C373271 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
                C37326a.this.mo137176a(observableEmitter);
            }
        });
    }

    /* renamed from: b */
    private boolean m147002b() {
        AbstractC38037a.AbstractC38052l q = C37268c.m146766b().mo139198q();
        if (q.mo139256a("activity.award.enable") || q.mo139256a("invite.member.award.enable") || q.mo139256a("invite.external.award.enable")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public View mo104364a(Context context) {
        return this.f95832e.mo137181a(context, this.f95833f);
    }

    /* renamed from: a */
    public void mo137176a(final Emitter<Boolean> emitter) {
        if (emitter != null) {
            if (UserSP.getInstance().getBoolean("key_param_activity_banner_hide", false) || !m147002b()) {
                emitter.onNext(false);
                emitter.onComplete();
                return;
            }
            this.f95831d.mo137178a(new IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult>() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37326a.C373282 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165381d("InviteActivityBanner", errorResult);
                    emitter.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(InvitationServiceApi.InviteActivityBannerResult inviteActivityBannerResult) {
                    boolean z;
                    C37326a.this.f95833f = inviteActivityBannerResult;
                    if (C37326a.this.f95833f == null || TextUtils.isEmpty(C37326a.this.f95833f.summardUrl)) {
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
