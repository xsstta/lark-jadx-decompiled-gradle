package com.tt.refer.p3400a.p3408f;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.refer.a.f.a */
public interface AbstractC67724a extends IBaseService {

    /* renamed from: com.tt.refer.a.f.a$a */
    public interface AbstractC67725a {
        /* renamed from: a */
        void mo235097a(int i);

        /* renamed from: a */
        void mo235098a(String str);
    }

    /* renamed from: com.tt.refer.a.f.a$b */
    public interface AbstractC67726b {
        /* renamed from: a */
        void mo88296a(Location location, String str, int i);

        /* renamed from: a */
        void mo88297a(String str, int i);

        /* renamed from: a */
        void mo88298a(ArrayList<Location> arrayList, Location location, String str, int i);
    }

    /* renamed from: a */
    int mo50435a();

    /* renamed from: a */
    CrossProcessDataEntity mo50436a(String str, CrossProcessDataEntity crossProcessDataEntity);

    /* renamed from: a */
    Observable<String> mo50437a(String str, Map<String, String> map, JSONObject jSONObject, IAppContext iAppContext, boolean z);

    /* renamed from: a */
    String mo50438a(IAppContext iAppContext);

    /* renamed from: a */
    void mo50439a(Activity activity, int i, int i2, String str, String str2);

    /* renamed from: a */
    void mo50440a(Activity activity, String str, String str2);

    /* renamed from: a */
    void mo50441a(Activity activity, String[] strArr, AbstractC67709b.AbstractC67711b bVar);

    /* renamed from: a */
    void mo50442a(Context context, String str);

    /* renamed from: a */
    void mo50443a(Context context, String str, float f, long j, String str2, long j2, AbstractC67726b bVar);

    /* renamed from: a */
    void mo50444a(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar);

    /* renamed from: a */
    void mo50445a(AbstractC67854b bVar);

    /* renamed from: a */
    void mo50446a(String str, CrossProcessDataEntity crossProcessDataEntity, AbstractC67727a aVar);

    /* renamed from: a */
    void mo50447a(String str, AbstractC67725a aVar);

    /* renamed from: a */
    void mo50448a(String str, String str2);

    /* renamed from: a */
    boolean mo50449a(Activity activity, String str, String str2, String str3, boolean z);

    /* renamed from: a */
    boolean mo50450a(String str);

    /* renamed from: b */
    MessageTriggerInfo mo50451b(String str, String str2);

    /* renamed from: b */
    C67856a mo50452b();

    /* renamed from: b */
    void mo50453b(Activity activity, int i, int i2, String str, String str2);

    /* renamed from: b */
    void mo50454b(AbstractC67854b bVar);

    /* renamed from: b */
    boolean mo50455b(IAppContext iAppContext);

    /* renamed from: b */
    boolean mo50456b(String str);

    /* renamed from: c */
    int mo50457c();

    /* renamed from: c */
    String mo50458c(String str);

    /* renamed from: d */
    String mo50459d();

    /* renamed from: d */
    List<C66578b.C66579a> mo50460d(String str);

    /* renamed from: e */
    boolean mo50461e();

    /* renamed from: e */
    boolean mo50462e(String str);

    /* renamed from: f */
    int mo50463f();

    /* renamed from: f */
    boolean mo50464f(String str);

    /* renamed from: g */
    boolean mo50465g();

    /* renamed from: g */
    boolean mo50466g(String str);

    /* renamed from: h */
    boolean mo50467h();

    /* renamed from: i */
    String mo50468i();

    /* renamed from: j */
    String mo50469j();

    /* renamed from: k */
    String mo50470k();

    /* renamed from: l */
    String mo50471l();

    /* renamed from: m */
    long mo50472m();

    /* renamed from: n */
    boolean mo50473n();

    /* renamed from: o */
    boolean mo50474o();

    /* renamed from: p */
    String mo50475p();
}
