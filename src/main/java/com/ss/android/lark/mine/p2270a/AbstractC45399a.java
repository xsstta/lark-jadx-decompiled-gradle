package com.ss.android.lark.mine.p2270a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29545ai;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.mine.dto.C45423a;
import com.ss.android.lark.mine.dto.C45424b;
import com.ss.android.lark.mine.dto.C45425c;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.SidebarInfo;
import com.ss.android.lark.mine.impl.p2273b.AbstractC45431a;
import com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45432a;
import com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45433b;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45434a;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45435b;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import java.util.List;

/* renamed from: com.ss.android.lark.mine.a.a */
public interface AbstractC45399a {

    /* renamed from: com.ss.android.lark.mine.a.a$a */
    public interface AbstractC45400a {
        /* renamed from: a */
        void mo133492a(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$b */
    public interface AbstractC45401b {
        /* renamed from: a */
        String mo133505a(Chatter chatter);

        /* renamed from: a */
        void mo133506a();

        /* renamed from: a */
        void mo133507a(Context context);

        /* renamed from: a */
        void mo133508a(Context context, String str);

        /* renamed from: a */
        void mo133509a(IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo133510a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        List<String> mo133511b();

        /* renamed from: b */
        void mo133512b(Context context);

        /* renamed from: b */
        void mo133513b(IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$c */
    public interface AbstractC45402c {
        /* renamed from: a */
        void mo133475a(Context context);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$d */
    public interface AbstractC45403d {
        /* renamed from: a */
        int mo133473a();
    }

    /* renamed from: com.ss.android.lark.mine.a.a$e */
    public interface AbstractC45404e {
        /* renamed from: a */
        boolean mo133482a();
    }

    /* renamed from: com.ss.android.lark.mine.a.a$f */
    public interface AbstractC45405f {
        /* renamed from: a */
        boolean mo133481a(String str);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$g */
    public interface AbstractC45406g {
        /* renamed from: a */
        void mo133468a(String str);

        /* renamed from: b */
        boolean mo133469b(String str);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$h */
    public interface AbstractC45407h {
    }

    /* renamed from: com.ss.android.lark.mine.a.a$i */
    public interface AbstractC45408i {
        /* renamed from: a */
        void mo133470a(AbstractC45431a aVar);

        /* renamed from: a */
        boolean mo133471a();

        /* renamed from: b */
        void mo133472b(AbstractC45431a aVar);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$j */
    public interface AbstractC45409j {
        /* renamed from: a */
        void mo133474a(String str, Context context);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$k */
    public interface AbstractC45410k {
        /* renamed from: a */
        void mo133499a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo133500a();

        /* renamed from: b */
        boolean mo133501b();

        /* renamed from: c */
        boolean mo133502c();

        /* renamed from: d */
        boolean mo133503d();

        /* renamed from: e */
        String mo133504e();
    }

    /* renamed from: com.ss.android.lark.mine.a.a$l */
    public interface AbstractC45411l {
        /* renamed from: a */
        boolean mo133476a(String str);

        /* renamed from: b */
        boolean mo133477b(String str);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$m */
    public interface AbstractC45412m {
        /* renamed from: a */
        String mo133478a();

        /* renamed from: a */
        void mo133479a(Context context);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$n */
    public interface AbstractC45413n {
        /* renamed from: a */
        void mo133523a(AbstractC45432a aVar);

        /* renamed from: a */
        void mo133524a(AbstractC45433b bVar);

        /* renamed from: b */
        void mo133525b(AbstractC45432a aVar);

        /* renamed from: b */
        void mo133526b(AbstractC45433b bVar);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$o */
    public interface AbstractC45414o {
        /* renamed from: a */
        void mo133494a(IGetDataCallback<List<C45424b>> iGetDataCallback);

        /* renamed from: a */
        void mo133495a(String str, float f, float f2, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133496a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133497a(String str, String str2, String str3, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$p */
    public interface AbstractC45415p {
        /* renamed from: a */
        Bundle mo133527a(UserCustomStatus userCustomStatus);

        /* renamed from: a */
        void mo133528a(int i, int i2, IGetDataCallback<C45423a> iGetDataCallback);

        /* renamed from: a */
        void mo133529a(Context context);

        /* renamed from: a */
        void mo133530a(Context context, String str);

        /* renamed from: a */
        void mo133531a(IGetDataCallback<C45427e> iGetDataCallback);

        /* renamed from: a */
        void mo133532a(ChatterDescription chatterDescription, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo133533b(Context context, String str);

        /* renamed from: b */
        void mo133534b(ChatterDescription chatterDescription, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$q */
    public interface AbstractC45416q {
        /* renamed from: a */
        void mo133514a(AbstractC29545ai aiVar);

        /* renamed from: a */
        void mo133515a(AbstractC45434a aVar);

        /* renamed from: a */
        void mo133516a(AbstractC45435b bVar);

        /* renamed from: b */
        void mo133517b(AbstractC29545ai aiVar);

        /* renamed from: b */
        void mo133518b(AbstractC45434a aVar);

        /* renamed from: b */
        void mo133519b(AbstractC45435b bVar);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$r */
    public interface AbstractC45417r {
        /* renamed from: a */
        void mo133485a();

        /* renamed from: a */
        void mo133486a(IGetDataCallback<List<SidebarInfo>> iGetDataCallback);

        /* renamed from: b */
        void mo133487b(IGetDataCallback<List<SidebarInfo>> iGetDataCallback);

        /* renamed from: b */
        boolean mo133488b();

        /* renamed from: c */
        Long mo133489c();

        /* renamed from: c */
        void mo133490c(IGetDataCallback<List<SidebarInfo>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$s */
    public interface AbstractC45418s {
        /* renamed from: a */
        void mo133521a(AbstractC45419t tVar);

        /* renamed from: b */
        void mo133522b(AbstractC45419t tVar);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$t */
    public interface AbstractC45419t {
        /* renamed from: a */
        void mo160262a(List<TenantInfo> list);
    }

    /* renamed from: com.ss.android.lark.mine.a.a$u */
    public interface AbstractC45420u {
        /* renamed from: a */
        boolean mo133483a();
    }

    /* renamed from: A */
    AbstractC45412m mo133433A();

    /* renamed from: a */
    void mo133435a(Activity activity, String str);

    /* renamed from: a */
    void mo133436a(Context context);

    /* renamed from: a */
    void mo133437a(Context context, String str, String str2, View view);

    /* renamed from: a */
    void mo133438a(CallbackManager callbackManager, IGetDataCallback<Devices> iGetDataCallback);

    /* renamed from: a */
    boolean mo133439a();

    /* renamed from: a */
    boolean mo133440a(IGetDataCallback<C45425c> iGetDataCallback);

    /* renamed from: b */
    void mo133441b(Context context);

    /* renamed from: b */
    boolean mo133442b();

    /* renamed from: c */
    Application mo133443c();

    /* renamed from: c */
    boolean mo133444c(Context context);

    /* renamed from: d */
    AbstractC45406g mo133445d();

    /* renamed from: e */
    boolean mo133446e();

    /* renamed from: f */
    boolean mo133447f();

    /* renamed from: g */
    boolean mo133448g();

    /* renamed from: h */
    String mo133449h();

    /* renamed from: i */
    AbstractC45403d mo133450i();

    /* renamed from: j */
    AbstractC45405f mo133451j();

    /* renamed from: k */
    AbstractC45404e mo133452k();

    /* renamed from: l */
    AbstractC45407h mo133453l();

    /* renamed from: m */
    AbstractC45420u mo133454m();

    /* renamed from: n */
    AbstractC45400a mo133455n();

    /* renamed from: o */
    AbstractC45417r mo133456o();

    /* renamed from: p */
    AbstractC45414o mo133457p();

    /* renamed from: q */
    AbstractC45410k mo133458q();

    /* renamed from: r */
    AbstractC45401b mo133459r();

    /* renamed from: s */
    AbstractC45416q mo133460s();

    /* renamed from: t */
    AbstractC45418s mo133461t();

    /* renamed from: u */
    AbstractC45413n mo133462u();

    /* renamed from: v */
    AbstractC45415p mo133463v();

    /* renamed from: w */
    AbstractC45408i mo133464w();

    /* renamed from: x */
    AbstractC45409j mo133465x();

    /* renamed from: y */
    AbstractC45402c mo133466y();

    /* renamed from: z */
    AbstractC45411l mo133467z();
}
