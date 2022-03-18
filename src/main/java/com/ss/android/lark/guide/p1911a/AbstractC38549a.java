package com.ss.android.lark.guide.p1911a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.guide.a.a */
public interface AbstractC38549a {

    /* renamed from: com.ss.android.lark.guide.a.a$a */
    public interface AbstractC38550a {
        /* renamed from: a */
        void mo141267a(String str);
    }

    /* renamed from: com.ss.android.lark.guide.a.a$b */
    public interface AbstractC38551b {
        /* renamed from: a */
        void mo141268a(String str, int i);
    }

    /* renamed from: com.ss.android.lark.guide.a.a$c */
    public interface AbstractC38552c {
        /* renamed from: a */
        boolean mo141269a(String str);

        /* renamed from: b */
        boolean mo141270b(String str);
    }

    /* renamed from: com.ss.android.lark.guide.a.a$d */
    public interface AbstractC38553d {
        /* renamed from: a */
        boolean mo141271a(String str);

        /* renamed from: a */
        boolean mo141272a(String str, C38708a aVar);
    }

    /* renamed from: com.ss.android.lark.guide.a.a$e */
    public interface AbstractC38554e {
        /* renamed from: a */
        TenantInfo mo141273a();

        /* renamed from: a */
        AbstractC49347c mo141274a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        ISigninSdkApi mo141275b();
    }

    /* renamed from: com.ss.android.lark.guide.a.a$f */
    public interface AbstractC38555f {
        /* renamed from: a */
        void mo141276a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback);

        /* renamed from: a */
        void mo141277a(String str, Bundle bundle, boolean z);
    }

    /* renamed from: com.ss.android.lark.guide.a.a$g */
    public interface AbstractC38556g {
        /* renamed from: a */
        int mo141278a();
    }

    /* renamed from: a */
    Fragment mo141244a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    <T> T mo141245a(Class<? extends AbstractC28490a> cls, boolean z);

    /* renamed from: a */
    void mo141246a(Activity activity, String str);

    /* renamed from: a */
    void mo141247a(Context context);

    /* renamed from: a */
    void mo141248a(Context context, String str);

    /* renamed from: a */
    void mo141249a(String str, JSONObject jSONObject);

    /* renamed from: a */
    boolean mo141250a();

    /* renamed from: b */
    Context mo141251b();

    /* renamed from: b */
    void mo141252b(Context context);

    /* renamed from: c */
    boolean mo141253c();

    /* renamed from: d */
    String mo141254d();

    /* renamed from: e */
    boolean mo141255e();

    /* renamed from: f */
    boolean mo141256f();

    /* renamed from: g */
    List<String> mo141257g();

    /* renamed from: h */
    boolean mo141258h();

    /* renamed from: i */
    AbstractC38552c mo141259i();

    /* renamed from: j */
    AbstractC38554e mo141260j();

    /* renamed from: k */
    C24258a mo141261k();

    /* renamed from: l */
    AbstractC38555f mo141262l();

    /* renamed from: m */
    AbstractC38551b mo141263m();

    /* renamed from: n */
    AbstractC38553d mo141264n();

    /* renamed from: o */
    AbstractC38550a mo141265o();

    /* renamed from: p */
    AbstractC38556g mo141266p();
}
