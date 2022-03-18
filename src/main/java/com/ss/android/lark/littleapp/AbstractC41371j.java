package com.ss.android.lark.littleapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.littleapp.entity.ChatModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.j */
public interface AbstractC41371j extends AbstractC41298a, AbstractC41370i {

    /* renamed from: com.ss.android.lark.littleapp.j$a */
    public interface AbstractC41372a {
        /* renamed from: a */
        void mo149050a(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$b */
    public interface AbstractC41373b {
        /* renamed from: a */
        void mo149051a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$c */
    public interface AbstractC41374c {
        /* renamed from: a */
        void mo149052a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$d */
    public interface AbstractC41375d {
        void onCheckState(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$e */
    public interface AbstractC41376e {
        /* renamed from: a */
        void mo49150a(String str);

        /* renamed from: b */
        void mo49151b(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$f */
    public interface AbstractC41377f {
        /* renamed from: a */
        void mo49152a(String str);

        /* renamed from: b */
        void mo49153b(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$g */
    public interface AbstractC41378g {
        /* renamed from: a */
        void mo149053a();

        /* renamed from: a */
        void mo149054a(String str);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$h */
    public interface AbstractC41379h {
        /* renamed from: a */
        void mo149055a(String str);

        /* renamed from: a */
        void mo149056a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.littleapp.j$i */
    public interface AbstractC41380i {
        /* renamed from: a */
        void mo142998a();

        /* renamed from: a */
        void mo142999a(Location location, String str, int i);

        /* renamed from: a */
        void mo143000a(String str, int i);

        /* renamed from: a */
        void mo143001a(ArrayList<Location> arrayList, Location location, String str, int i);
    }

    /* renamed from: a */
    String mo148977a();

    /* renamed from: a */
    String mo148978a(DomainSettings.Alias alias);

    /* renamed from: a */
    List<AbstractC13322k.C13325c> mo148979a(List<String> list, String str);

    /* renamed from: a */
    void mo148980a(Activity activity, String str, String str2, double d, double d2, int i, String str3);

    /* renamed from: a */
    void mo148981a(Context context, Intent intent, int i, int i2, String str);

    /* renamed from: a */
    void mo148982a(Context context, String str, String str2);

    /* renamed from: a */
    void mo148983a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar);

    /* renamed from: a */
    void mo148984a(Context context, String str, String str2, String str3);

    /* renamed from: a */
    void mo148985a(Context context, String str, String str2, String str3, Map<String, String> map, int i, int i2);

    /* renamed from: a */
    void mo148986a(Context context, String str, String[] strArr, DialogInterface.OnClickListener onClickListener);

    /* renamed from: a */
    void mo148987a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar);

    /* renamed from: a */
    void mo148988a(WebView webView);

    /* renamed from: a */
    void mo148989a(AbstractC41376e eVar);

    /* renamed from: a */
    void mo148990a(AbstractC41377f fVar);

    /* renamed from: a */
    void mo148991a(String str, float f, long j, String str2, long j2, AbstractC41380i iVar);

    /* renamed from: a */
    void mo148992a(String str, int i, String str2);

    /* renamed from: a */
    void mo148993a(String str, AbstractC41372a aVar);

    /* renamed from: a */
    void mo148994a(String str, AbstractC41373b bVar);

    /* renamed from: a */
    void mo148995a(String str, AbstractC41378g gVar);

    /* renamed from: a */
    void mo148996a(String str, String str2);

    /* renamed from: a */
    void mo148997a(String str, String str2, AbstractC41374c cVar);

    /* renamed from: a */
    void mo148998a(String str, String str2, String str3);

    /* renamed from: a */
    void mo148999a(String str, String str2, String str3, int i, int i2, AbstractC41379h hVar);

    /* renamed from: a */
    void mo149000a(String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo149001a(String str, boolean z, AbstractC41375d dVar);

    /* renamed from: a */
    void mo149002a(String str, boolean z, String str2, String str3);

    /* renamed from: a */
    void mo149003a(List<String> list, AbstractC13322k.AbstractC13323a aVar);

    /* renamed from: a */
    void mo149004a(boolean z);

    /* renamed from: a */
    boolean mo149005a(Context context, Intent intent);

    /* renamed from: a */
    boolean mo149006a(Context context, String str);

    /* renamed from: a */
    boolean mo149007a(String str, String str2, boolean z);

    /* renamed from: b */
    String mo149008b();

    /* renamed from: b */
    String mo149009b(DomainSettings.Alias alias);

    /* renamed from: b */
    void mo149010b(String str, String str2);

    /* renamed from: b */
    boolean mo149011b(String str, String str2, boolean z);

    /* renamed from: b */
    boolean mo149012b(String str, boolean z);

    /* renamed from: c */
    String mo149013c();

    /* renamed from: c */
    void mo149014c(String str, String str2);

    /* renamed from: d */
    String mo149015d();

    /* renamed from: d */
    void mo149016d(String str, String str2);

    /* renamed from: e */
    String mo149017e();

    /* renamed from: e */
    void mo149018e(String str, String str2);

    /* renamed from: f */
    Locale mo149019f();

    /* renamed from: f */
    void mo149020f(String str, String str2);

    /* renamed from: f */
    boolean mo149021f(String str);

    /* renamed from: g */
    EnvInfo mo149022g();

    /* renamed from: g */
    String mo149023g(String str);

    /* renamed from: h */
    boolean mo149024h();

    /* renamed from: h */
    boolean mo149025h(String str);

    /* renamed from: i */
    String mo149026i(String str);

    /* renamed from: i */
    void mo149027i();

    /* renamed from: j */
    int mo149028j();

    /* renamed from: j */
    void mo149029j(String str);

    /* renamed from: k */
    void mo149030k(String str);

    /* renamed from: k */
    boolean mo149031k();

    /* renamed from: l */
    String mo149032l();

    /* renamed from: l */
    String mo149033l(String str);

    /* renamed from: m */
    ChatModel mo149034m(String str);

    /* renamed from: m */
    String mo149035m();

    /* renamed from: n */
    void mo149036n(String str);

    /* renamed from: n */
    boolean mo149037n();

    /* renamed from: o */
    double mo149038o(String str);

    /* renamed from: o */
    Long mo149039o();

    /* renamed from: p */
    AbstractC13304a mo149040p();

    /* renamed from: p */
    void mo149041p(String str);

    /* renamed from: q */
    long mo149042q();

    /* renamed from: q */
    boolean mo149043q(String str);

    /* renamed from: r */
    String mo149044r();

    /* renamed from: r */
    void mo149045r(String str);

    /* renamed from: s */
    String mo149046s();

    /* renamed from: t */
    void mo149047t();

    /* renamed from: u */
    C29187c mo149048u();

    /* renamed from: v */
    void mo149049v();
}
