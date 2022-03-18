package com.ss.android.lark.feed.app.banner.p1852c.p1853a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.banner.export.AbstractC29482c;
import com.ss.android.lark.banner.export.AbstractC29491f;
import com.ss.android.lark.banner.export.entity.AbstractC29485a;
import com.ss.android.lark.banner.export.entity.C29489b;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.apm.BannerAPM;
import com.ss.android.lark.feed.app.banner.p1852c.p1856d.AbstractC37363a;
import com.ss.android.lark.feed.app.banner.statistics.BannerHitPoint;
import com.ss.android.lark.feed.app.banner.ug_banner.helper.MainTitleFinder;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.PackageChannelManager;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: com.ss.android.lark.feed.app.banner.c.a.c */
public class C37343c extends AbstractC29491f<AbstractC29485a> {

    /* renamed from: d */
    C37347c f95859d = new C37347c(this);

    /* renamed from: e */
    C37346b f95860e = new C37346b();

    /* renamed from: f */
    C37345a f95861f = new C37345a(this);

    /* renamed from: g */
    private Context f95862g;

    @Override // com.ss.android.lark.banner.export.AbstractC29491f
    /* renamed from: b */
    public AbstractC29485a mo104370b(C29489b bVar) {
        return null;
    }

    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.c$a */
    private static class C37345a extends AbstractC37363a {

        /* renamed from: a */
        private C37343c f95864a;

        @Override // com.ss.android.lark.feed.app.banner.p1852c.p1856d.AbstractC37363a
        /* renamed from: a */
        public void mo137199a() {
            C37343c cVar = this.f95864a;
            if (cVar != null) {
                cVar.mo104448e();
            }
        }

        public C37345a(C37343c cVar) {
            this.f95864a = cVar;
        }
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public Observable<Boolean> mo104366a() {
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37343c.C373441 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
                C37343c.this.mo137198a(observableEmitter);
            }
        });
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a, com.ss.android.lark.banner.export.AbstractC29491f
    /* renamed from: c */
    public void mo104441c() {
        super.mo104441c();
        this.f95861f.mo137216c();
    }

    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.c$c */
    private static class C37347c {

        /* renamed from: a */
        private C37343c f95865a;

        public C37347c(C37343c cVar) {
            this.f95865a = cVar;
        }

        /* renamed from: b */
        public void mo137203b(Context context) {
            Log.m165389i("UpgradeTeamBanner", "user click banner");
            C37262a.m146726a().mo139175a(context, "banner");
            BannerHitPoint.f95814a.mo137163d();
        }

        /* renamed from: a */
        public View mo137201a(final Context context) {
            final View inflate = LayoutInflater.from(context).inflate(R.layout.banner_ug_upgrade_team, (ViewGroup) new FrameLayout(context), true);
            ((ImageView) inflate.findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37343c.C37347c.View$OnClickListenerC373481 */

                public void onClick(View view) {
                    C37347c.this.mo137202a(inflate);
                }
            });
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37343c.C37347c.View$OnClickListenerC373492 */

                public void onClick(View view) {
                    C37347c.this.mo137203b(context);
                }
            });
            inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.lark.feed.app.banner.p1852c.p1853a.C37343c.C37347c.View$OnAttachStateChangeListenerC373503 */

                public void onViewDetachedFromWindow(View view) {
                }

                public void onViewAttachedToWindow(View view) {
                    BannerHitPoint.f95814a.mo137162c();
                    inflate.removeOnAttachStateChangeListener(this);
                }
            });
            return inflate;
        }

        /* renamed from: a */
        public void mo137202a(View view) {
            Activity activity;
            Log.m165389i("UpgradeTeamBanner", "user close banner");
            this.f95865a.mo104448e();
            UserSP.getInstance().putBoolean("ug_close_c2b_banner", true);
            View a = new MainTitleFinder().mo137213a(view);
            if (a == null || !(a.getContext() instanceof Activity)) {
                activity = null;
            } else {
                activity = (Activity) a.getContext();
            }
            if (activity != null) {
                C37262a.m146726a().mo139181b().mo139258a(a, activity);
                BannerHitPoint.f95814a.mo137165f();
            } else {
                BannerAPM.f95813a.mo137154a();
                Log.m165389i("UpgradeTeamBanner", "user avatar find failed");
            }
            BannerHitPoint.f95814a.mo137164e();
        }
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public View mo104364a(Context context) {
        return this.f95859d.mo137201a(context);
    }

    public C37343c(Context context) {
        this.f95862g = context;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a, com.ss.android.lark.banner.export.AbstractC29491f
    /* renamed from: a */
    public void mo104440a(AbstractC29482c cVar) {
        super.mo104440a(cVar);
        this.f95861f.mo137215b();
    }

    /* renamed from: a */
    public void mo137198a(Emitter<Boolean> emitter) {
        if (emitter != null) {
            emitter.onNext(Boolean.valueOf(this.f95860e.mo137200a(this.f95862g)));
            emitter.onComplete();
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.banner.c.a.c$b */
    public static class C37346b {
        /* renamed from: a */
        public boolean mo137200a(Context context) {
            if ((PackageChannelManager.isKABuildPackage(context) && PackageChannelManager.getDeployMode(context) != 1) || C37262a.m146726a().mo139155B().mo139211d()) {
                Log.m165389i("UpgradeTeamBanner", "is Ka or Idp");
                return false;
            } else if (!UserSP.getInstance().getBoolean("ug_close_c2b_banner", false)) {
                return C37262a.m146726a().mo139155B().mo139210c();
            } else {
                Log.m165389i("UpgradeTeamBanner", "banner closed");
                C37262a.m146726a().mo139167N().mo139232a("VCUpgradetoTeam");
                return false;
            }
        }
    }
}
