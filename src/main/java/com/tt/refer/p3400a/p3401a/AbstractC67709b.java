package com.tt.refer.p3400a.p3401a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67439g;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.refer.common.base.AbstractC67744b;
import com.tt.refer.common.base.AbstractC67745c;
import com.tt.refer.impl.business.file.AbstractC67918a;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import io.reactivex.Observable;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.tt.refer.a.a.b */
public interface AbstractC67709b extends IBaseService, AbstractC67439g, AbstractC67745c<AbstractC67710a> {

    /* renamed from: com.tt.refer.a.a.b$a */
    public interface AbstractC67710a extends AbstractC67744b {
        /* renamed from: a */
        AbstractC67712c mo235014a();

        /* renamed from: a */
        AbstractC67918a.C67921a mo235015a(String str);

        /* renamed from: a */
        Observable<String> mo235016a(String str, Map<String, String> map, JSONObject jSONObject, boolean z);

        /* renamed from: a */
        String mo235017a(String str, String str2, StringBuilder sb);

        /* renamed from: a */
        void mo235018a(Activity activity);

        /* renamed from: a */
        void mo235019a(Activity activity, int i, int i2, String str, String str2);

        /* renamed from: a */
        void mo235020a(Activity activity, int i, boolean z, boolean z2, boolean z3);

        /* renamed from: a */
        void mo235021a(Activity activity, String str, C66578b.C66579a aVar, AbstractC67711b bVar);

        /* renamed from: a */
        void mo235022a(Activity activity, String str, Set<String> set, AbstractC67711b bVar);

        /* renamed from: a */
        void mo235023a(Context context, String str);

        /* renamed from: a */
        void mo235024a(Context context, String str, String str2, long j, String str3);

        /* renamed from: a */
        void mo235025a(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, boolean z2, AbstractC67550j.AbstractC67551a<Integer> aVar);

        /* renamed from: a */
        void mo235026a(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar);

        /* renamed from: a */
        void mo235027a(IAppContext iAppContext, int i, boolean z, boolean z2, String str);

        /* renamed from: a */
        void mo235028a(C67706e eVar);

        /* renamed from: a */
        void mo235029a(Object obj);

        /* renamed from: a */
        boolean mo235030a(int i);

        /* renamed from: a */
        boolean mo235031a(long j);

        /* renamed from: a */
        boolean mo235032a(Activity activity, String str, String str2, String str3, boolean z);

        /* renamed from: a */
        boolean mo235033a(Activity activity, String str, List<String> list, int i);

        /* renamed from: a */
        boolean mo235034a(Activity activity, List<ImageRequest> list, int i, AbstractC67668a aVar);

        /* renamed from: a */
        boolean mo235035a(File file);

        /* renamed from: a */
        boolean mo235036a(String str, int i);

        /* renamed from: a */
        boolean mo235037a(String str, String str2);

        /* renamed from: b */
        File mo235038b(String str);

        /* renamed from: b */
        String mo235039b();

        /* renamed from: b */
        void mo235040b(Activity activity, int i, int i2, String str, String str2);

        /* renamed from: b */
        void mo235041b(String str, String str2);

        /* renamed from: b */
        boolean mo235042b(File file);

        /* renamed from: b */
        boolean mo235043b(String str, int i);

        /* renamed from: c */
        String mo235044c(String str);

        /* renamed from: c */
        List<AbstractC67918a.C67921a> mo235045c();

        /* renamed from: c */
        boolean mo235046c(File file);

        /* renamed from: d */
        File mo235047d();

        /* renamed from: d */
        String mo235048d(String str);

        /* renamed from: e */
        File mo235049e();

        /* renamed from: e */
        boolean mo235050e(String str);

        /* renamed from: f */
        Activity mo235051f();

        /* renamed from: f */
        boolean mo235052f(String str);

        /* renamed from: g */
        String mo235053g();

        /* renamed from: g */
        String mo235054g(String str);

        /* renamed from: h */
        void mo235055h(String str);

        /* renamed from: h */
        boolean mo235056h();

        /* renamed from: i */
        List<C66578b.C66579a> mo235057i(String str);

        /* renamed from: i */
        boolean mo235058i();

        /* renamed from: j */
        void mo235059j();

        /* renamed from: k */
        boolean mo235060k();

        /* renamed from: l */
        boolean mo235061l();

        /* renamed from: m */
        void mo235062m();
    }

    /* renamed from: com.tt.refer.a.a.b$b */
    public interface AbstractC67711b {
        /* renamed from: a */
        void mo87574a();

        /* renamed from: a */
        void mo87575a(String str);
    }

    /* renamed from: a */
    AbstractC67439g mo235010a(String str);

    /* renamed from: a */
    C67700a mo235011a(C67701b bVar);

    /* renamed from: a */
    void mo235012a(C67706e eVar);

    /* renamed from: a */
    void mo235013a(String str, AbstractC67439g gVar);
}
