package com.ss.android.lark.mail.impl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41872d;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.c */
public interface AbstractC41849c {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.mail.impl.c$a */
    public interface AbstractC41850a {
        void forwardClick(String str);

        void saveClick();
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$b */
    public interface AbstractC41851b {
        /* renamed from: a */
        void mo150193a(AbstractC41852c cVar);

        /* renamed from: a */
        void mo150194a(AbstractC41862m mVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$c */
    public interface AbstractC41852c {
        void updateLifecycleState(boolean z);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$d */
    public interface AbstractC41853d {
        /* renamed from: a */
        MailAddress mo150184a(String str);

        /* renamed from: a */
        String mo150185a(String str, int i);

        /* renamed from: a */
        void mo150186a(Context context, String str);

        /* renamed from: a */
        void mo150187a(AbstractC41866q qVar);

        /* renamed from: b */
        void mo150188b(AbstractC41866q qVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$e */
    public interface AbstractC41854e {
        /* renamed from: a */
        int mo150165a(String[] strArr);

        /* renamed from: a */
        String mo150166a(Uri uri, String str, String str2, String str3, AbstractC43390b bVar);

        /* renamed from: a */
        String mo150167a(String str, String str2, int i, boolean z, AbstractC43389a aVar);

        /* renamed from: a */
        String mo150168a(String str, String str2, String str3, String str4, int i, String str5, AbstractC43389a aVar);

        /* renamed from: a */
        String mo150169a(String str, String str2, String str3, String str4, AbstractC43390b bVar);

        /* renamed from: a */
        void mo150170a();

        /* renamed from: b */
        int mo150171b(String[] strArr);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$f */
    public interface AbstractC41855f {
        /* renamed from: a */
        boolean mo150160a(String str);

        /* renamed from: b */
        boolean mo150161b(String str);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$g */
    public interface AbstractC41856g {
        /* renamed from: a */
        String mo150162a();

        /* renamed from: a */
        void mo150163a(Activity activity, int i, long j, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$h */
    public interface AbstractC41857h {
        /* renamed from: a */
        void mo150172a(MailAttachment mailAttachment, String str);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$i */
    public interface AbstractC41858i {
        /* renamed from: a */
        int mo150173a(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$j */
    public interface AbstractC41859j {
        /* renamed from: a */
        long mo150199a();

        /* renamed from: b */
        String mo150200b();

        /* renamed from: c */
        String mo150201c();

        /* renamed from: d */
        String mo150202d();

        /* renamed from: e */
        String mo150203e();

        /* renamed from: f */
        String mo150204f();
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$k */
    public interface AbstractC41860k {
        /* renamed from: a */
        void mo150195a(List<String> list);

        /* renamed from: a */
        boolean mo150196a(String str);

        /* renamed from: a */
        boolean mo150197a(String str, C38708a aVar);

        /* renamed from: b */
        boolean mo150198b(String str);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$l */
    public interface AbstractC41861l {
        /* renamed from: a */
        void mo150205a(Context context, String str, ImageView imageView, int i, int i2);

        /* renamed from: a */
        void mo150206a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$m */
    public interface AbstractC41862m {
        void onLanguageChangeListener(Locale locale);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$n */
    public interface AbstractC41863n {
        /* renamed from: a */
        void mo150177a();

        /* renamed from: b */
        void mo150178b();

        /* renamed from: c */
        void mo150179c();

        /* renamed from: d */
        void mo150180d();
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$o */
    public interface AbstractC41864o {
        /* renamed from: a */
        void mo150181a(String str, JSONObject jSONObject);

        /* renamed from: b */
        void mo150182b(String str, JSONObject jSONObject);

        /* renamed from: c */
        void mo150183c(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$p */
    public interface AbstractC41865p {
        /* renamed from: a */
        boolean mo150164a(String str, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$q */
    public interface AbstractC41866q {
        void onPushChatter(MailAddress mailAddress);
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$r */
    public interface AbstractC41867r {
        /* renamed from: a */
        void mo150189a(AbstractC41872d dVar);

        /* renamed from: a */
        boolean mo150190a();

        /* renamed from: b */
        void mo150191b(AbstractC41872d dVar);

        /* renamed from: b */
        boolean mo150192b();
    }

    /* renamed from: com.ss.android.lark.mail.impl.c$s */
    public interface AbstractC41868s {
        /* renamed from: a */
        NetworkChangeListener.NetworkLevel mo150174a();

        /* renamed from: a */
        void mo150175a(NetworkChangeListener networkChangeListener);

        /* renamed from: b */
        void mo150176b(NetworkChangeListener networkChangeListener);
    }

    /* renamed from: A */
    AbstractC41858i mo150111A();

    /* renamed from: B */
    AbstractC41868s mo150112B();

    /* renamed from: C */
    AbstractC41863n mo150113C();

    /* renamed from: D */
    AbstractC41864o mo150114D();

    /* renamed from: E */
    AbstractC41853d mo150115E();

    /* renamed from: F */
    AbstractC41867r mo150116F();

    /* renamed from: G */
    AbstractC41851b mo150117G();

    /* renamed from: H */
    AbstractC41860k mo150118H();

    /* renamed from: I */
    AbstractC41859j mo150119I();

    /* renamed from: a */
    int mo150120a();

    /* renamed from: a */
    List<String> mo150121a(DomainSettings.Alias alias);

    /* renamed from: a */
    void mo150122a(Context context, int i, Bundle bundle, int i2, String str);

    /* renamed from: a */
    void mo150123a(Context context, String str);

    /* renamed from: a */
    void mo150124a(Context context, String str, String str2);

    /* renamed from: a */
    void mo150125a(Context context, String str, String str2, long j);

    /* renamed from: a */
    void mo150126a(WebView webView, String str);

    /* renamed from: a */
    void mo150127a(C43853v.AbstractC43859a aVar);

    /* renamed from: a */
    boolean mo150128a(Context context);

    /* renamed from: a */
    boolean mo150129a(Bundle bundle);

    /* renamed from: a */
    boolean mo150130a(String str);

    /* renamed from: a */
    boolean mo150131a(String str, List<DriveFile> list, DriveFileOperationMask driveFileOperationMask, HashMap hashMap, AbstractC41850a aVar);

    /* renamed from: b */
    Context mo150132b();

    /* renamed from: b */
    boolean mo150133b(Context context);

    /* renamed from: b */
    boolean mo150134b(Context context, String str);

    /* renamed from: b */
    boolean mo150135b(String str);

    /* renamed from: c */
    String mo150136c();

    /* renamed from: d */
    String mo150137d();

    /* renamed from: e */
    boolean mo150138e();

    /* renamed from: f */
    String mo150139f();

    /* renamed from: g */
    String mo150140g();

    /* renamed from: h */
    String mo150141h();

    /* renamed from: i */
    boolean mo150142i();

    /* renamed from: j */
    boolean mo150143j();

    /* renamed from: k */
    boolean mo150144k();

    /* renamed from: l */
    String mo150145l();

    /* renamed from: m */
    Locale mo150146m();

    /* renamed from: n */
    int mo150147n();

    /* renamed from: o */
    boolean mo150148o();

    /* renamed from: p */
    boolean mo150149p();

    /* renamed from: q */
    String mo150150q();

    /* renamed from: r */
    String mo150151r();

    /* renamed from: s */
    TranslationSetting mo150152s();

    /* renamed from: t */
    boolean mo150153t();

    /* renamed from: u */
    AbstractC41855f mo150154u();

    /* renamed from: v */
    AbstractC41861l mo150155v();

    /* renamed from: w */
    AbstractC41856g mo150156w();

    /* renamed from: x */
    AbstractC41865p mo150157x();

    /* renamed from: y */
    AbstractC41854e mo150158y();

    /* renamed from: z */
    AbstractC41857h mo150159z();
}
