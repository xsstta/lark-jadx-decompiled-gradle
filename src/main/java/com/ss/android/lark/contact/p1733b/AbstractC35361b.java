package com.ss.android.lark.contact.p1733b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.dto.C35394e;
import com.ss.android.lark.contact.dto.ChatBotsResponse;
import com.ss.android.lark.contact.p1734c.AbstractC35383a;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.ss.android.lark.contact.b.b */
public interface AbstractC35361b {

    /* renamed from: com.ss.android.lark.contact.b.b$a */
    public interface AbstractC35362a {
        /* renamed from: a */
        UniversalUserSetting mo130182a(String str);

        /* renamed from: a */
        void mo130183a(String str, Boolean bool, IGetDataCallback<UniversalUserSetting> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$b */
    public interface AbstractC35363b {
        /* renamed from: a */
        boolean mo130184a();
    }

    /* renamed from: com.ss.android.lark.contact.b.b$c */
    public interface AbstractC35364c {
        /* renamed from: a */
        int mo130185a();

        /* renamed from: a */
        void mo130186a(Context context, String str);

        /* renamed from: b */
        int mo130187b();

        /* renamed from: c */
        String mo130188c();

        /* renamed from: d */
        int mo130189d();
    }

    /* renamed from: com.ss.android.lark.contact.b.b$d */
    public interface AbstractC35365d {
        /* renamed from: a */
        AbstractC29479b mo130190a();

        /* renamed from: a */
        void mo130191a(String str);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$e */
    public interface AbstractC35366e {
        /* renamed from: a */
        void mo130192a(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$f */
    public interface AbstractC35367f {
        /* renamed from: a */
        char mo130193a(Chatter chatter, Locale locale);

        /* renamed from: a */
        IChatParser mo130194a();

        /* renamed from: a */
        String mo130195a(Chatter chatter);

        /* renamed from: a */
        String mo130196a(String str, String str2);

        /* renamed from: a */
        void mo130197a(IGetDataCallback<ChatBotsResponse> iGetDataCallback);

        /* renamed from: a */
        void mo130198a(IGetDataCallback<ChatBotsResponse> iGetDataCallback, int i);

        /* renamed from: a */
        void mo130199a(String str);

        /* renamed from: a */
        void mo130200a(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo130201a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback);

        /* renamed from: b */
        IChatterParser mo130202b();

        /* renamed from: b */
        Chat mo130203b(String str);

        /* renamed from: b */
        void mo130204b(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo130205b(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$g */
    public interface AbstractC35368g {
        /* renamed from: a */
        void mo130206a(Context context);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$h */
    public interface AbstractC35369h {
        /* renamed from: a */
        boolean mo130207a();
    }

    /* renamed from: com.ss.android.lark.contact.b.b$i */
    public interface AbstractC35370i {
        /* renamed from: a */
        boolean mo130208a(String str);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$j */
    public interface AbstractC35371j {
        /* renamed from: a */
        void mo130209a(Context context, String str, List<String> list, AbstractC44896a aVar);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$k */
    public interface AbstractC35372k {
        /* renamed from: a */
        void mo130210a(Activity activity, View view, View.OnClickListener onClickListener);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$l */
    public interface AbstractC35373l {
        /* renamed from: a */
        void mo130211a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$m */
    public interface AbstractC35374m {
        /* renamed from: a */
        void mo130212a(Activity activity, String str);

        /* renamed from: a */
        void mo130213a(Context context);

        /* renamed from: a */
        void mo130214a(Context context, String str);

        /* renamed from: a */
        void mo130215a(C57865c.AbstractC57871b<Boolean> bVar);

        /* renamed from: a */
        boolean mo130216a();

        /* renamed from: b */
        void mo130217b(Context context);

        /* renamed from: b */
        void mo130218b(Context context, String str);

        /* renamed from: b */
        boolean mo130219b();

        /* renamed from: c */
        String mo130220c();

        /* renamed from: c */
        void mo130221c(Context context);

        /* renamed from: d */
        void mo130222d(Context context);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$n */
    public interface AbstractC35375n {
        /* renamed from: a */
        Locale mo130223a();

        /* renamed from: b */
        Boolean mo130224b();

        /* renamed from: c */
        Boolean mo130225c();
    }

    /* renamed from: com.ss.android.lark.contact.b.b$o */
    public interface AbstractC35376o {
        /* renamed from: a */
        void mo130226a(Context context, int i);

        /* renamed from: a */
        void mo130227a(Context context, int i, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo130228a(Context context, JSONObject jSONObject);

        /* renamed from: a */
        boolean mo130229a();

        /* renamed from: b */
        boolean mo130230b();

        /* renamed from: c */
        String mo130231c();

        /* renamed from: d */
        String mo130232d();

        /* renamed from: e */
        boolean mo130233e();

        /* renamed from: f */
        boolean mo130234f();

        /* renamed from: g */
        boolean mo130235g();
    }

    /* renamed from: com.ss.android.lark.contact.b.b$p */
    public interface AbstractC35377p {
        /* renamed from: a */
        AbstractNotification.AbstractC48496c<Notice> mo130236a();

        /* renamed from: a */
        boolean mo130237a(int i);

        /* renamed from: b */
        boolean mo130238b(int i);

        /* renamed from: c */
        String mo130239c(int i);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$q */
    public interface AbstractC35378q {
        /* renamed from: a */
        String mo130240a(BaseField baseField);

        /* renamed from: a */
        List<BaseField> mo130241a(List<GetUserProfileResponse.Field> list);

        /* renamed from: a */
        void mo130242a(Context context, String str);

        /* renamed from: a */
        void mo130243a(Context context, String str, int i, ContactSource contactSource);

        /* renamed from: a */
        void mo130244a(Context context, String str, C36516a<?> aVar, int i);

        /* renamed from: a */
        void mo130245a(Context context, String str, String str2, C36516a aVar, String str3, int i);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$r */
    public interface AbstractC35379r {
        /* renamed from: a */
        void mo130246a(C35394e.AbstractC35395a aVar);

        /* renamed from: a */
        void mo130247a(C35394e.AbstractC35396b bVar);

        /* renamed from: b */
        void mo130248b(C35394e.AbstractC35395a aVar);

        /* renamed from: b */
        void mo130249b(C35394e.AbstractC35396b bVar);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$s */
    public interface AbstractC35380s {
        /* renamed from: a */
        int mo130250a();

        /* renamed from: a */
        void mo130251a(Context context, String str, int i);

        /* renamed from: a */
        void mo130252a(String str, Chat chat, List<String> list, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: b */
        void mo130253b(Context context, String str, int i);
    }

    /* renamed from: com.ss.android.lark.contact.b.b$t */
    public interface AbstractC35381t {
        /* renamed from: a */
        boolean mo130254a();

        /* renamed from: b */
        String mo130255b();
    }

    /* renamed from: com.ss.android.lark.contact.b.b$u */
    public interface AbstractC35382u {
        /* renamed from: a */
        Observable mo130256a();

        /* renamed from: a */
        void mo130257a(List<String> list, boolean z, IGetDataCallback<Map<String, String>> iGetDataCallback);

        /* renamed from: b */
        String mo130258b();

        /* renamed from: c */
        String mo130259c();
    }

    /* renamed from: a */
    Context mo130143a();

    /* renamed from: a */
    void mo130144a(Context context, Chatter chatter);

    /* renamed from: a */
    void mo130145a(Context context, String str);

    /* renamed from: a */
    void mo130146a(Context context, String str, String str2);

    /* renamed from: a */
    void mo130147a(ImageView imageView);

    /* renamed from: a */
    void mo130148a(AbstractC35383a aVar);

    /* renamed from: a */
    void mo130149a(String str);

    /* renamed from: b */
    AbstractC35370i mo130150b();

    /* renamed from: b */
    void mo130151b(Context context, Chatter chatter);

    /* renamed from: b */
    void mo130152b(String str);

    /* renamed from: c */
    AbstractC35375n mo130153c();

    /* renamed from: c */
    void mo130154c(Context context, Chatter chatter);

    /* renamed from: c */
    void mo130155c(String str);

    /* renamed from: d */
    AbstractC35382u mo130156d();

    /* renamed from: d */
    boolean mo130157d(String str);

    /* renamed from: e */
    AbstractC35374m mo130158e();

    /* renamed from: e */
    void mo130159e(String str);

    /* renamed from: f */
    AbstractC35366e mo130160f();

    /* renamed from: f */
    void mo130161f(String str);

    /* renamed from: g */
    AbstractC35381t mo130162g();

    /* renamed from: h */
    AbstractC35376o mo130163h();

    /* renamed from: i */
    AbstractC35373l mo130164i();

    /* renamed from: j */
    AbstractC35367f mo130165j();

    /* renamed from: k */
    AbstractC35380s mo130166k();

    /* renamed from: l */
    AbstractC35379r mo130167l();

    /* renamed from: m */
    AbstractC35378q mo130168m();

    /* renamed from: n */
    AbstractC35363b mo130169n();

    /* renamed from: o */
    AbstractC35377p mo130170o();

    /* renamed from: p */
    AbstractC35371j mo130171p();

    /* renamed from: q */
    AbstractC35365d mo130172q();

    /* renamed from: r */
    AbstractC35372k mo130173r();

    /* renamed from: s */
    AbstractC35364c mo130174s();

    /* renamed from: t */
    AbstractC35368g mo130175t();

    /* renamed from: u */
    AbstractC35369h mo130176u();

    /* renamed from: v */
    AbstractC35362a mo130177v();

    /* renamed from: w */
    int mo130178w();

    /* renamed from: x */
    String mo130179x();

    /* renamed from: y */
    boolean mo130180y();

    /* renamed from: z */
    boolean mo130181z();
}
