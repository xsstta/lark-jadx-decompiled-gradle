package com.ss.android.lark.main.p2231a;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.main.IFeedLoadListener;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.inv.export.router.AbstractC40091a;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.NavDataSource;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.main.interfaces.AbstractC44502e;
import com.ss.android.lark.main.interfaces.AbstractC44503f;
import com.ss.android.lark.main.interfaces.AbstractC44504g;
import com.ss.android.lark.main.interfaces.AbstractC44505h;
import com.ss.android.lark.main.interfaces.AbstractC44506i;
import com.ss.android.lark.main.interfaces.IChatterPushListener;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.main.a.a */
public interface AbstractC44136a {

    /* renamed from: com.ss.android.lark.main.a.a$a */
    public interface AbstractC44137a {

        /* renamed from: com.ss.android.lark.main.a.a$a$a */
        public interface AbstractC44138a {
            /* renamed from: a */
            void mo157125a();
        }

        /* renamed from: a */
        String mo133318a();

        /* renamed from: a */
        void mo133319a(Context context, AbstractC44138a aVar);

        /* renamed from: b */
        String mo133320b();

        /* renamed from: c */
        String mo133321c();

        /* renamed from: d */
        boolean mo133322d();
    }

    /* renamed from: com.ss.android.lark.main.a.a$aa */
    public interface AbstractC44139aa {
        /* renamed from: a */
        void mo143221a(Context context, String str);

        /* renamed from: a */
        void mo143222a(Context context, String str, String str2);

        /* renamed from: a */
        boolean mo143223a(Context context, String str, String str2, String str3, String str4);

        /* renamed from: b */
        void mo143224b(Context context, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.main.a.a$ab */
    public interface AbstractC44140ab {

        /* renamed from: com.ss.android.lark.main.a.a$ab$a */
        public interface AbstractC44141a {
            /* renamed from: a */
            void mo157126a();
        }

        /* renamed from: a */
        void mo133334a(Activity activity);

        /* renamed from: a */
        void mo133335a(Activity activity, LifecycleOwner lifecycleOwner);

        /* renamed from: a */
        void mo133336a(AbstractC44141a aVar);

        /* renamed from: a */
        boolean mo133337a();

        /* renamed from: b */
        boolean mo133338b();
    }

    /* renamed from: com.ss.android.lark.main.a.a$b */
    public interface AbstractC44146b {
        /* renamed from: a */
        Boolean mo133292a();

        /* renamed from: a */
        String mo133293a(NavDataSource navDataSource);

        /* renamed from: a */
        void mo133294a(IGetDataCallback<AppConfig> iGetDataCallback);

        /* renamed from: a */
        void mo133295a(String str, NavDataSource navDataSource);

        /* renamed from: a */
        void mo133296a(boolean z);

        /* renamed from: a */
        void mo133297a(boolean z, IGetDataCallback<AppConfig> iGetDataCallback);

        /* renamed from: b */
        void mo133298b(IGetDataCallback<AppConfig> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.main.a.a$c */
    public interface AbstractC44147c {
        /* renamed from: a */
        void mo133377a(Context context, String str);

        /* renamed from: a */
        void mo133378a(String str, IGetDataCallback<Integer> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.main.a.a$d */
    public interface AbstractC44148d {
        /* renamed from: a */
        SparseArray<AbstractC29524c> mo133325a();

        /* renamed from: a */
        String mo133326a(String str, String str2);

        /* renamed from: a */
        void mo133327a(Context context, String str);

        /* renamed from: a */
        void mo133328a(Context context, String str, int i);

        /* renamed from: a */
        void mo133329a(Context context, String str, String str2);

        /* renamed from: a */
        void mo133330a(AbstractC36551c.AbstractC36552a aVar);

        /* renamed from: a */
        void mo133331a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo133332a(String str);

        /* renamed from: b */
        void mo133333b();
    }

    /* renamed from: com.ss.android.lark.main.a.a$e */
    public interface AbstractC44149e {
        void openChatSetting(Context context, String str, int i);
    }

    /* renamed from: com.ss.android.lark.main.a.a$f */
    public interface AbstractC44150f {
        /* renamed from: a */
        void mo133359a(IChatterPushListener cVar);
    }

    /* renamed from: com.ss.android.lark.main.a.a$g */
    public interface AbstractC44151g {
        /* renamed from: a */
        String mo133299a();

        /* renamed from: a */
        void mo133300a(AbstractC44552i iVar, boolean z);

        /* renamed from: b */
        void mo133301b();
    }

    /* renamed from: com.ss.android.lark.main.a.a$h */
    public interface AbstractC44152h {
        /* renamed from: a */
        boolean mo133307a();

        /* renamed from: b */
        boolean mo133308b();
    }

    /* renamed from: com.ss.android.lark.main.a.a$i */
    public interface AbstractC44153i {
        /* renamed from: a */
        boolean mo133361a(String str);
    }

    /* renamed from: com.ss.android.lark.main.a.a$j */
    public interface AbstractC44154j {
        /* renamed from: a */
        View mo133273a();

        /* renamed from: a */
        void mo133274a(IFeedLoadListener aVar);

        /* renamed from: a */
        void mo133275a(boolean z);

        /* renamed from: b */
        void mo133276b();

        /* renamed from: b */
        void mo133277b(IFeedLoadListener aVar);
    }

    /* renamed from: com.ss.android.lark.main.a.a$k */
    public interface AbstractC44155k {

        /* renamed from: com.ss.android.lark.main.a.a$k$a */
        public interface AbstractC44156a {
            /* renamed from: a */
            void mo133290a(Activity activity);

            /* renamed from: a */
            void mo133291a(Activity activity, Intent intent);
        }

        /* renamed from: a */
        AbstractC44156a mo133278a();

        /* renamed from: a */
        void mo133279a(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener);

        /* renamed from: a */
        void mo133280a(View view, View.OnClickListener onClickListener);

        /* renamed from: a */
        void mo133281a(String str, boolean z);

        /* renamed from: a */
        boolean mo133282a(Uri uri);

        /* renamed from: a */
        boolean mo133283a(String str);

        /* renamed from: b */
        void mo133284b(String str);

        /* renamed from: b */
        boolean mo133285b();

        /* renamed from: c */
        void mo133286c();

        /* renamed from: c */
        boolean mo133287c(String str);

        /* renamed from: d */
        boolean mo133288d();

        /* renamed from: e */
        boolean mo133289e();
    }

    /* renamed from: com.ss.android.lark.main.a.a$l */
    public interface AbstractC44157l {
        /* renamed from: a */
        void mo133271a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.main.a.a$m */
    public interface AbstractC44158m {
        /* renamed from: a */
        Map<String, AbstractC40091a> mo133375a();
    }

    /* renamed from: com.ss.android.lark.main.a.a$n */
    public interface AbstractC44159n {
        /* renamed from: a */
        void mo133370a(AbstractC44502e eVar);

        /* renamed from: a */
        boolean mo133371a();

        /* renamed from: b */
        void mo133372b(AbstractC44502e eVar);
    }

    /* renamed from: com.ss.android.lark.main.a.a$o */
    public interface AbstractC44160o {

        /* renamed from: com.ss.android.lark.main.a.a$o$a */
        public interface AbstractC44161a {
            /* renamed from: a */
            void mo157133a(boolean z, Drawable drawable);
        }

        /* renamed from: com.ss.android.lark.main.a.a$o$b */
        public interface AbstractC44162b {
            /* renamed from: a */
            void mo157134a();

            /* renamed from: b */
            void mo157135b();
        }

        /* renamed from: a */
        void mo133340a(Dialog dialog);

        /* renamed from: a */
        void mo133341a(Context context);

        /* renamed from: a */
        void mo133342a(Context context, int i, AbstractC44161a aVar);

        /* renamed from: a */
        void mo133343a(Context context, SigninParams signinParams);

        /* renamed from: a */
        void mo133344a(Context context, String str);

        /* renamed from: a */
        void mo133345a(Context context, String str, Bundle bundle);

        /* renamed from: a */
        void mo133346a(AbstractC44162b bVar);

        /* renamed from: a */
        void mo133347a(String str);

        /* renamed from: a */
        boolean mo133348a();

        /* renamed from: a */
        boolean mo133349a(Activity activity);

        /* renamed from: b */
        String mo133350b();

        /* renamed from: b */
        void mo133351b(Context context, String str);

        /* renamed from: b */
        void mo133352b(AbstractC44162b bVar);

        /* renamed from: c */
        boolean mo133353c();
    }

    /* renamed from: com.ss.android.lark.main.a.a$p */
    public interface AbstractC44163p {
        /* renamed from: a */
        Fragment mo133309a();

        /* renamed from: a */
        Chatter.ChatterCustomStatus mo133310a(List<Chatter.ChatterCustomStatus> list);

        /* renamed from: a */
        void mo133311a(Context context);

        /* renamed from: a */
        void mo133312a(Context context, int i);

        /* renamed from: a */
        void mo133313a(Context context, int[] iArr);

        /* renamed from: a */
        void mo133314a(Fragment fragment);

        /* renamed from: a */
        void mo133315a(Fragment fragment, AbstractC44176b bVar);

        /* renamed from: a */
        void mo133316a(Fragment fragment, boolean z);

        /* renamed from: b */
        void mo133317b(Fragment fragment);
    }

    /* renamed from: com.ss.android.lark.main.a.a$q */
    public interface AbstractC44164q {
        /* renamed from: a */
        NetworkLevel mo133379a();

        /* renamed from: a */
        void mo133381a(AbstractC44506i iVar);

        /* renamed from: b */
        void mo133382b(AbstractC44506i iVar);
    }

    /* renamed from: com.ss.android.lark.main.a.a$r */
    public interface AbstractC44165r {
        /* renamed from: a */
        void mo133362a();

        /* renamed from: a */
        void mo133363a(String str, String str2);

        /* renamed from: b */
        void mo133364b(String str, String str2);

        /* renamed from: c */
        void mo133365c(String str, String str2);

        /* renamed from: d */
        void mo133366d(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.main.a.a$s */
    public interface AbstractC44166s {
        /* renamed from: a */
        void mo133367a();
    }

    /* renamed from: com.ss.android.lark.main.a.a$t */
    public interface AbstractC44167t {
        /* renamed from: a */
        boolean mo133306a(Context context, Bundle bundle);
    }

    /* renamed from: com.ss.android.lark.main.a.a$u */
    public interface AbstractC44168u {
        /* renamed from: a */
        long mo133302a();

        /* renamed from: b */
        long mo133303b();

        /* renamed from: c */
        long mo133304c();

        /* renamed from: d */
        boolean mo133305d();
    }

    /* renamed from: com.ss.android.lark.main.a.a$v */
    public interface AbstractC44169v {
        /* renamed from: a */
        void mo133392a(AbstractC44505h hVar);

        /* renamed from: a */
        boolean mo133393a();

        /* renamed from: b */
        void mo133394b(AbstractC44505h hVar);
    }

    /* renamed from: com.ss.android.lark.main.a.a$w */
    public interface AbstractC44170w {
        /* renamed from: a */
        void mo133355a(Activity activity, View view);

        /* renamed from: a */
        void mo133356a(FragmentActivity fragmentActivity);

        /* renamed from: a */
        boolean mo133357a(Context context);

        /* renamed from: b */
        void mo133358b(Context context);
    }

    /* renamed from: com.ss.android.lark.main.a.a$x */
    public interface AbstractC44171x {

        /* renamed from: com.ss.android.lark.main.a.a$x$a */
        public interface AbstractC44172a {
            /* renamed from: a */
            void mo157136a(Map<String, Integer> map);
        }

        /* renamed from: a */
        List<TenantInfo> mo133395a();

        /* renamed from: a */
        void mo133396a(Context context, String str);

        /* renamed from: a */
        void mo133397a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo133398a(IGetDataCallback<Map<String, Integer>> iGetDataCallback);

        /* renamed from: a */
        void mo133399a(AbstractC44172a aVar);

        /* renamed from: a */
        void mo133400a(AbstractC44503f fVar);

        /* renamed from: a */
        void mo133401a(AbstractC44504g gVar);

        /* renamed from: a */
        void mo133402a(TenantInfo tenantInfo, String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133403a(AbstractC49405t tVar);

        /* renamed from: a */
        void mo133404a(String str);

        /* renamed from: a */
        void mo133405a(boolean z);

        /* renamed from: b */
        void mo133406b();

        /* renamed from: b */
        void mo133407b(AbstractC44172a aVar);

        /* renamed from: b */
        void mo133408b(AbstractC44503f fVar);

        /* renamed from: b */
        void mo133409b(AbstractC44504g gVar);

        /* renamed from: b */
        void mo133410b(AbstractC49405t tVar);

        /* renamed from: c */
        void mo133412c();

        /* renamed from: c */
        void mo133413c(boolean z);

        /* renamed from: d */
        void mo133414d();

        /* renamed from: e */
        void mo133415e();

        /* renamed from: f */
        boolean mo133416f();

        /* renamed from: h */
        boolean mo133418h();

        /* renamed from: i */
        List<TenantInfo> mo133419i();

        /* renamed from: j */
        List<TenantInfo.PendingUser> mo133420j();

        /* renamed from: k */
        boolean mo133421k();

        /* renamed from: l */
        TenantInfo mo133422l();

        /* renamed from: m */
        User mo133423m();

        /* renamed from: n */
        TenantInfo mo133424n();
    }

    /* renamed from: com.ss.android.lark.main.a.a$y */
    public interface AbstractC44173y {

        /* renamed from: com.ss.android.lark.main.a.a$y$a */
        public interface AbstractC44174a {
            /* renamed from: a */
            void mo157137a(boolean z);

            /* renamed from: b */
            void mo157138b(boolean z);
        }

        /* renamed from: a */
        void mo133428a(AbstractC44174a aVar);

        /* renamed from: a */
        boolean mo133429a();

        /* renamed from: b */
        void mo133430b(AbstractC44174a aVar);
    }

    /* renamed from: com.ss.android.lark.main.a.a$z */
    public interface AbstractC44175z {
        /* renamed from: a */
        void mo133272a();
    }

    /* renamed from: A */
    AbstractC44139aa mo133181A();

    /* renamed from: B */
    AbstractC44165r mo133182B();

    /* renamed from: C */
    AbstractC44166s mo133183C();

    /* renamed from: D */
    void mo133184D();

    /* renamed from: E */
    Map<String, C44142ac.AbstractC44143a> mo133185E();

    /* renamed from: F */
    void mo133186F();

    /* renamed from: G */
    AbstractC44159n mo133187G();

    /* renamed from: H */
    AbstractC44171x mo133188H();

    /* renamed from: I */
    AbstractC44169v mo133189I();

    /* renamed from: J */
    AbstractC44173y mo133190J();

    /* renamed from: K */
    AbstractC44164q mo133191K();

    /* renamed from: L */
    AbstractC44147c mo133192L();

    /* renamed from: M */
    AbstractC44149e mo133193M();

    /* renamed from: N */
    AbstractC44177c mo133194N();

    /* renamed from: O */
    AbstractC44158m mo133195O();

    /* renamed from: P */
    String mo133196P();

    /* renamed from: Q */
    AbstractC44175z mo133197Q();

    /* renamed from: R */
    boolean mo133198R();

    /* renamed from: S */
    boolean mo133199S();

    /* renamed from: T */
    AbstractC44155k mo133200T();

    /* renamed from: U */
    AbstractC44146b mo133201U();

    /* renamed from: V */
    AbstractC44151g mo133202V();

    /* renamed from: W */
    AbstractC44168u mo133203W();

    /* renamed from: X */
    Locale mo133204X();

    /* renamed from: Y */
    AbstractC44167t mo133205Y();

    /* renamed from: a */
    AbstractC44552i mo133206a(Context context, ITitleController iTitleController, TabAppInfo tabAppInfo);

    /* renamed from: a */
    AbstractC44552i mo133207a(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo);

    /* renamed from: a */
    String mo133208a(DomainSettings.Alias alias);

    /* renamed from: a */
    void mo133209a();

    /* renamed from: a */
    void mo133210a(Activity activity, int i);

    /* renamed from: a */
    void mo133211a(ComponentCallbacks2 componentCallbacks2);

    /* renamed from: a */
    void mo133212a(Context context);

    /* renamed from: a */
    void mo133213a(Context context, String str);

    /* renamed from: a */
    void mo133214a(Context context, String str, int i);

    /* renamed from: a */
    void mo133215a(Context context, String str, String str2, ImageView imageView, int i, int i2);

    /* renamed from: a */
    void mo133216a(Context context, String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo133217a(Context context, String str, String str2, String str3, String str4, int i, boolean z);

    /* renamed from: a */
    void mo133218a(Context context, String str, String str2, boolean z);

    /* renamed from: a */
    void mo133219a(TabAppInfo tabAppInfo);

    /* renamed from: a */
    void mo133220a(AbstractC49404s sVar);

    /* renamed from: a */
    void mo133221a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo133222a(String str, JSONObject jSONObject);

    /* renamed from: a */
    boolean mo133223a(Context context, Intent intent);

    /* renamed from: a */
    boolean mo133224a(Context context, Uri uri);

    /* renamed from: a */
    boolean mo133225a(Context context, Uri uri, boolean z);

    /* renamed from: a */
    boolean mo133226a(Context context, Bundle bundle);

    /* renamed from: a */
    boolean mo133227a(Context context, String str, String str2);

    /* renamed from: a */
    boolean mo133228a(Uri uri);

    /* renamed from: a */
    boolean mo133229a(Uri uri, Context context);

    /* renamed from: a */
    boolean mo133230a(MainActivity mainActivity);

    /* renamed from: b */
    AbstractC44157l mo133231b();

    /* renamed from: b */
    Map<String, C44142ac> mo133232b(Context context);

    /* renamed from: b */
    void mo133233b(ComponentCallbacks2 componentCallbacks2);

    /* renamed from: b */
    void mo133234b(Context context, Intent intent);

    /* renamed from: b */
    void mo133235b(Context context, String str);

    /* renamed from: b */
    void mo133236b(TabAppInfo tabAppInfo);

    /* renamed from: b */
    boolean mo133237b(Context context, Uri uri);

    /* renamed from: b */
    boolean mo133238b(Context context, Uri uri, boolean z);

    /* renamed from: b */
    boolean mo133239b(Context context, Bundle bundle);

    /* renamed from: c */
    AbstractC44154j mo133240c();

    /* renamed from: c */
    void mo133241c(Context context, Intent intent);

    /* renamed from: c */
    void mo133242c(TabAppInfo tabAppInfo);

    /* renamed from: c */
    boolean mo133243c(Context context, Uri uri);

    /* renamed from: c */
    boolean mo133244c(Context context, Bundle bundle);

    /* renamed from: c */
    boolean mo133245c(Context context, String str);

    /* renamed from: d */
    void mo133246d();

    /* renamed from: d */
    void mo133247d(Context context, String str);

    /* renamed from: e */
    AbstractC44152h mo133248e();

    /* renamed from: e */
    void mo133249e(Context context, String str);

    /* renamed from: f */
    AbstractC44163p mo133250f();

    /* renamed from: g */
    AbstractC44137a mo133251g();

    /* renamed from: h */
    AbstractC44140ab mo133252h();

    /* renamed from: i */
    Context mo133253i();

    /* renamed from: j */
    boolean mo133254j();

    /* renamed from: k */
    boolean mo133255k();

    /* renamed from: l */
    int mo133256l();

    /* renamed from: m */
    AbstractC44160o mo133257m();

    /* renamed from: n */
    boolean mo133258n();

    /* renamed from: o */
    AbstractC44170w mo133259o();

    /* renamed from: p */
    AbstractC44150f mo133260p();

    /* renamed from: q */
    AbstractC44148d mo133261q();

    /* renamed from: r */
    String mo133262r();

    /* renamed from: s */
    boolean mo133263s();

    /* renamed from: t */
    String mo133264t();

    /* renamed from: u */
    String mo133265u();

    /* renamed from: v */
    C24258a mo133266v();

    /* renamed from: w */
    String mo133267w();

    /* renamed from: x */
    String mo133268x();

    /* renamed from: y */
    void mo133269y();

    /* renamed from: z */
    AbstractC44153i mo133270z();

    /* renamed from: com.ss.android.lark.main.a.a$ac */
    public static class C44142ac {

        /* renamed from: a */
        String f112080a;

        /* renamed from: b */
        int f112081b;

        /* renamed from: c */
        boolean f112082c;

        /* renamed from: d */
        private final AbstractC44143a f112083d;

        /* renamed from: e */
        private final AbstractC44145c f112084e;

        /* renamed from: f */
        private AbstractC44144b f112085f;

        /* renamed from: com.ss.android.lark.main.a.a$ac$a */
        public interface AbstractC44143a {

            /* renamed from: a */
            public static final AbstractC44143a f112086a = $$Lambda$a$ac$a$W7zGPflEf8wY6hmZ82dmgYBQ.INSTANCE;

            /* renamed from: b */
            public static final AbstractC44143a f112087b = $$Lambda$a$ac$a$3ermLHFDZOJTAucLJQcVQxErl7c.INSTANCE;

            /* renamed from: com.ss.android.lark.main.a.a$ac$a$-CC  reason: invalid class name */
            public final /* synthetic */ class CC {
                /* renamed from: a */
                public static /* synthetic */ boolean m175119a() {
                    return false;
                }

                /* renamed from: b */
                public static /* synthetic */ boolean m175120b() {
                    return true;
                }
            }

            boolean isEnable();
        }

        /* renamed from: com.ss.android.lark.main.a.a$ac$b */
        public interface AbstractC44144b {
            /* renamed from: a */
            void mo133368a(Context context);

            /* renamed from: b */
            void mo133369b(Context context);
        }

        /* renamed from: com.ss.android.lark.main.a.a$ac$c */
        public interface AbstractC44145c {
            AbstractC44552i createTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController);
        }

        /* renamed from: a */
        public String mo157127a() {
            return this.f112080a;
        }

        /* renamed from: b */
        public boolean mo157129b() {
            return this.f112082c;
        }

        /* renamed from: c */
        public AbstractC44143a mo157130c() {
            return this.f112083d;
        }

        /* renamed from: d */
        public AbstractC44145c mo157131d() {
            return this.f112084e;
        }

        /* renamed from: e */
        public AbstractC44144b mo157132e() {
            return this.f112085f;
        }

        /* renamed from: a */
        public void mo157128a(int i) {
            this.f112081b = i;
        }

        public C44142ac(String str, int i, boolean z, AbstractC44143a aVar, AbstractC44145c cVar) {
            this.f112080a = str;
            this.f112081b = i;
            this.f112082c = z;
            this.f112083d = aVar;
            this.f112084e = cVar;
        }

        public C44142ac(String str, int i, boolean z, AbstractC44143a aVar, AbstractC44145c cVar, AbstractC44144b bVar) {
            this.f112080a = str;
            this.f112081b = i;
            this.f112082c = z;
            this.f112083d = aVar;
            this.f112084e = cVar;
            this.f112085f = bVar;
        }
    }
}
