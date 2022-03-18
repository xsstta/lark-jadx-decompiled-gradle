package com.ss.android.lark.mm.depend;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.share.model.C47008a;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.widget.onboarding.MmNewGuideConfig;
import io.reactivex.Scheduler;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public interface IMmDepend {

    public interface ILoginDepend {

        public interface IMmAccountInterceptor {

            @Retention(RetentionPolicy.SOURCE)
            public @interface Step {
            }

            /* renamed from: a */
            boolean mo161146a();

            /* renamed from: b */
            C45868b mo161147b();

            /* renamed from: c */
            int mo161148c();

            /* renamed from: d */
            int mo161149d();
        }

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$ILoginDepend$a */
        public interface AbstractC45867a {
            void onAccountChange(String str);
        }

        /* renamed from: a */
        String mo144647a();

        /* renamed from: a */
        void mo144648a(IMmAccountInterceptor iMmAccountInterceptor);

        /* renamed from: a */
        void mo144649a(AbstractC45867a aVar);

        /* renamed from: b */
        String mo144650b();

        /* renamed from: c */
        String mo144651c();

        /* renamed from: d */
        String mo144652d();

        /* renamed from: e */
        boolean mo144653e();

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$ILoginDepend$b */
        public static class C45868b {

            /* renamed from: a */
            private String f115707a;

            /* renamed from: b */
            private String f115708b;

            /* renamed from: c */
            private String f115709c;

            /* renamed from: d */
            private String f115710d;

            /* renamed from: a */
            public String mo161207a() {
                return this.f115707a;
            }

            /* renamed from: b */
            public String mo161208b() {
                return this.f115708b;
            }

            /* renamed from: c */
            public String mo161209c() {
                return this.f115709c;
            }

            /* renamed from: d */
            public String mo161210d() {
                return this.f115710d;
            }

            public C45868b(String str, String str2, String str3, String str4) {
                this.f115707a = str;
                this.f115708b = str2;
                this.f115709c = str3;
                this.f115710d = str4;
            }
        }
    }

    public interface IWschannelDependency {

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$IWschannelDependency$a */
        public interface AbstractC45869a {
            /* renamed from: a */
            void mo161212a(MmNetworkLevel mmNetworkLevel);
        }

        /* renamed from: a */
        MmNetworkLevel mo144566a();

        /* renamed from: a */
        void mo144568a(AbstractC45869a aVar);

        /* renamed from: b */
        void mo144569b(AbstractC45869a aVar);

        public enum MmNetworkLevel {
            EXCELLENT(1),
            EVALUATING(2),
            WEAK(3),
            NET_UNAVAILABLE(4),
            SERVICE_UNAVAILABLE(5);
            
            private int status;

            public int getValue() {
                return this.status;
            }

            public static MmNetworkLevel forNumber(int i) {
                if (i == 1) {
                    return EXCELLENT;
                }
                if (i == 2) {
                    return EVALUATING;
                }
                if (i == 3) {
                    return WEAK;
                }
                if (i == 4) {
                    return NET_UNAVAILABLE;
                }
                if (i != 5) {
                    return EXCELLENT;
                }
                return SERVICE_UNAVAILABLE;
            }

            private MmNetworkLevel(int i) {
                this.status = i;
            }
        }
    }

    public enum MmAppEnv {
        RELEASE,
        STAGING,
        PRE_RELEASE
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$a */
    public interface AbstractC45870a {
        /* renamed from: a */
        void mo144660a(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$c */
    public interface AbstractC45875c {
        /* renamed from: a */
        String mo144616a();

        /* renamed from: b */
        String mo144617b();

        /* renamed from: c */
        String mo144618c();

        /* renamed from: d */
        String mo144619d();

        /* renamed from: e */
        String mo144620e();

        /* renamed from: f */
        String mo144621f();

        /* renamed from: g */
        String mo144622g();

        /* renamed from: h */
        String mo144623h();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$d */
    public interface AbstractC45876d {
        /* renamed from: a */
        boolean mo144661a(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$e */
    public interface AbstractC45877e {
        void gotoShareForwardSelectPage(Context context, String str, String str2, String str3);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$f */
    public interface AbstractC45878f {
        /* renamed from: a */
        void mo144603a(C47084f fVar, String str);

        /* renamed from: a */
        void mo144604a(C47084f fVar, String str, JSONObject jSONObject);

        /* renamed from: a */
        void mo144605a(String str);

        /* renamed from: a */
        void mo144606a(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$g */
    public interface AbstractC45879g {
        /* renamed from: a */
        DialogInterface$OnCancelListenerC1021b mo144629a(FragmentActivity fragmentActivity, C47008a aVar);

        /* renamed from: a */
        String mo144630a();

        /* renamed from: a */
        String mo144631a(String str);

        /* renamed from: a */
        void mo144632a(Context context, Bundle bundle);

        /* renamed from: a */
        void mo144633a(Context context, String str, BaseUserType baseUserType);

        /* renamed from: b */
        String mo144634b();

        /* renamed from: c */
        String mo144635c();

        /* renamed from: d */
        MmAppEnv mo144636d();

        /* renamed from: e */
        String mo144637e();

        /* renamed from: f */
        String mo144638f();

        /* renamed from: g */
        String mo144639g();

        /* renamed from: h */
        String mo144640h();

        /* renamed from: i */
        List<String> mo144641i();

        /* renamed from: j */
        long mo144642j();

        /* renamed from: k */
        boolean mo144643k();

        /* renamed from: l */
        boolean mo144644l();

        /* renamed from: m */
        String mo144645m();

        /* renamed from: n */
        String mo144646n();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$h */
    public interface AbstractC45880h {
        /* renamed from: a */
        void mo144624a(String str, HttpHeaders httpHeaders, Map<String, String> map, Map<String, Pair<String, File>> map2, AbstractC47070c cVar);

        /* renamed from: a */
        void mo144625a(String str, String str2, Map<String, String> map, HttpHeaders httpHeaders, AbstractC47070c cVar);

        /* renamed from: a */
        void mo144626a(String str, String str2, Map<String, String> map, HttpHeaders httpHeaders, AbstractC47070c cVar, IHttpLocalErrorHandler aVar);

        /* renamed from: a */
        void mo144627a(String str, String str2, Map<String, String> map, Map<String, String> map2, HttpHeaders httpHeaders, AbstractC47070c cVar);

        /* renamed from: a */
        void mo144628a(String str, String str2, Map<String, String> map, Map<String, String> map2, HttpHeaders httpHeaders, AbstractC47070c cVar, IHttpLocalErrorHandler aVar);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$i */
    public interface AbstractC45881i {
        /* renamed from: a */
        void mo144608a(Context context, String str, int i, int i2, C45853e.AbstractC45854a aVar);

        /* renamed from: a */
        void mo144609a(ImageView imageView, String str);

        /* renamed from: a */
        void mo144610a(ImageView imageView, String str, int i);

        /* renamed from: a */
        void mo144611a(ImageView imageView, String str, String str2, int i, int i2, int i3, int i4);

        /* renamed from: b */
        void mo144612b(ImageView imageView, String str);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$j */
    public interface AbstractC45882j {
        /* renamed from: a */
        Locale mo144665a();

        /* renamed from: b */
        Locale mo144666b();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$k */
    public interface AbstractC45883k {
        /* renamed from: a */
        void mo144572a(String str, String str2);

        /* renamed from: b */
        void mo144573b(String str, String str2);

        /* renamed from: c */
        void mo144574c(String str, String str2);

        /* renamed from: d */
        void mo144575d(String str, String str2);

        /* renamed from: e */
        void mo144576e(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$l */
    public interface AbstractC45884l {

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$l$a */
        public interface AbstractC45885a {
            /* renamed from: a */
            void mo161220a(String str);

            /* renamed from: b */
            void mo161221b(String str);

            /* renamed from: c */
            void mo161222c(String str);
        }

        /* renamed from: a */
        void mo144593a(MmNewGuideConfig mmNewGuideConfig, AbstractC45885a aVar);

        /* renamed from: a */
        boolean mo144594a(String str);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$m */
    public interface AbstractC45886m {
        /* renamed from: a */
        void mo144591a(String str);

        /* renamed from: a */
        void mo144592a(String str, Context context, Map<String, String> map);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$n */
    public interface AbstractC45887n {
        /* renamed from: a */
        String mo144662a(String str);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$o */
    public interface AbstractC45888o {

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$o$a */
        public interface AbstractC45889a {
            /* renamed from: a */
            void mo161223a(int i);
        }
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$p */
    public interface AbstractC45890p {
        /* renamed from: a */
        void mo144586a(View view);

        /* renamed from: a */
        boolean mo144587a();

        /* renamed from: b */
        void mo144588b(View view);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$q */
    public interface AbstractC45891q {
        /* renamed from: a */
        void mo144667a();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$r */
    public interface AbstractC45892r {
        /* renamed from: a */
        void mo144663a(String str, String str2, String str3, boolean z);

        /* renamed from: a */
        boolean mo144664a();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$s */
    public interface AbstractC45893s {
        /* renamed from: a */
        Scheduler mo144598a();

        /* renamed from: a */
        void mo144599a(Runnable runnable);

        /* renamed from: b */
        Scheduler mo144600b();

        /* renamed from: b */
        void mo144601b(Runnable runnable);

        /* renamed from: c */
        ScheduledExecutorService mo144602c();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$t */
    public interface AbstractC45894t {
        /* renamed from: a */
        void mo144658a(Context context, String str);

        /* renamed from: a */
        void mo144659a(Context context, String str, int i);
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$u */
    public interface AbstractC45895u {
        /* renamed from: a */
        boolean mo144668a();
    }

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$v */
    public interface AbstractC45896v {
        /* renamed from: a */
        boolean mo144589a();

        /* renamed from: b */
        boolean mo144590b();
    }

    AbstractC45870a getBrowserDepend();

    AbstractC45871b getContextDepend();

    AbstractC45875c getDomainDepend();

    AbstractC45876d getFeatureGatingDepend();

    AbstractC45877e getForwardDependency();

    AbstractC45884l getGuideDependency();

    AbstractC45878f getHitPointDepend();

    AbstractC45879g getHostDepend();

    AbstractC25990b getHttpClient();

    AbstractC45880h getHttpExecutorDepend();

    AbstractC45881i getImageLoaderDepend();

    AbstractC45882j getLanguageDependency();

    AbstractC45897a getLifecycleDependency();

    AbstractC45883k getLogDepend();

    ILoginDepend getLoginDepend();

    AbstractC45886m getMagicDependency();

    AbstractC45890p getMultiTaskDependency();

    AbstractC45891q getPushDependency();

    AbstractC45887n getSettingDepend();

    AbstractC45892r getShareDepend();

    AbstractC45898b getSpDependency();

    AbstractC45893s getThreadDepend();

    AbstractC45894t getUiDepend();

    AbstractC45895u getUserSettingDependency();

    AbstractC45896v getVideoChatDependency();

    IWschannelDependency getWschannelDependency();

    /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$b */
    public interface AbstractC45871b {

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$b$b */
        public interface AbstractC45873b {
            /* renamed from: a */
            void mo161213a(Activity activity);

            /* renamed from: a */
            void mo161214a(Activity activity, Bundle bundle);

            /* renamed from: b */
            void mo161215b(Activity activity);

            /* renamed from: b */
            void mo161216b(Activity activity, Bundle bundle);

            /* renamed from: c */
            void mo161217c(Activity activity);

            /* renamed from: d */
            void mo161218d(Activity activity);

            /* renamed from: e */
            void mo161219e(Activity activity);
        }

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$b$c */
        public interface AbstractC45874c {
            /* renamed from: a */
            void mo149331a(C45872a aVar, C45872a aVar2);
        }

        /* renamed from: a */
        Context mo144557a();

        /* renamed from: a */
        void mo144559a(AbstractC45873b bVar);

        /* renamed from: a */
        void mo144560a(AbstractC45874c cVar);

        /* renamed from: a */
        void mo144561a(String str);

        /* renamed from: b */
        Context mo144562b();

        /* renamed from: b */
        void mo144563b(AbstractC45873b bVar);

        /* renamed from: b */
        void mo144564b(AbstractC45874c cVar);

        /* renamed from: b */
        boolean mo144565b(String str);

        /* renamed from: com.ss.android.lark.mm.depend.IMmDepend$b$a */
        public static class C45872a {

            /* renamed from: a */
            public String f115711a = "";

            /* renamed from: b */
            public String f115712b = "";

            /* renamed from: c */
            public boolean f115713c;

            /* renamed from: d */
            public boolean f115714d;

            public C45872a(String str, String str2, boolean z, boolean z2) {
                this.f115711a = str;
                this.f115712b = str2;
                this.f115713c = z;
                this.f115714d = z2;
            }
        }
    }
}
