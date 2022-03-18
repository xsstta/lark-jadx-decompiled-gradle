package com.ss.android.lark.feed.p1871b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.feed.dto.NetworkLevel;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.interfaces.AbstractC38086aa;
import com.ss.android.lark.feed.interfaces.AbstractC38091b;
import com.ss.android.lark.feed.interfaces.AbstractC38111u;
import com.ss.android.lark.feed.interfaces.AbstractC38113w;
import com.ss.android.lark.feed.interfaces.AbstractC38115y;
import com.ss.android.lark.feed.interfaces.IDeviceNotifyListener;
import com.ss.android.lark.feed.p1872c.AbstractC38070a;
import com.ss.android.lark.feed.p1875f.p1882g.AbstractC38084a;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2732b.AbstractC55358a;
import com.ss.android.lark.team.p2732b.AbstractC55359b;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.b.a */
public interface AbstractC38037a {

    /* renamed from: com.ss.android.lark.feed.b.a$a */
    public interface AbstractC38038a {
        /* renamed from: a */
        String mo139208a();

        /* renamed from: b */
        boolean mo139209b();

        /* renamed from: c */
        boolean mo139210c();

        /* renamed from: d */
        boolean mo139211d();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$aa */
    public interface AbstractC38039aa {
        /* renamed from: a */
        void mo139212a(Activity activity);

        /* renamed from: a */
        void mo139213a(Context context);

        /* renamed from: a */
        boolean mo139214a();

        /* renamed from: b */
        void mo139215b(Context context);

        /* renamed from: b */
        boolean mo139216b();

        /* renamed from: c */
        boolean mo139217c();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$ab */
    public interface AbstractC38040ab {
        /* renamed from: a */
        NetworkLevel mo139218a();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$ac */
    public interface AbstractC38041ac {
        /* renamed from: a */
        void mo139219a(View view);

        /* renamed from: a */
        void mo139220a(boolean z);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$b */
    public interface AbstractC38042b {
        /* renamed from: a */
        long mo139221a();

        /* renamed from: a */
        <T extends C41152a> T mo139222a(String str, AbstractC41160a aVar);

        /* renamed from: a */
        void mo139223a(IGetDataCallback<HashMap<String, Boolean>> iGetDataCallback);

        /* renamed from: a */
        boolean mo139224a(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$c */
    public interface AbstractC38043c {
        /* renamed from: a */
        void mo139225a(AbstractC38091b bVar);

        /* renamed from: b */
        void mo139226b(AbstractC38091b bVar);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$d */
    public interface AbstractC38044d {
        /* renamed from: a */
        void mo139227a(int i);

        /* renamed from: a */
        void mo139228a(Context context);

        /* renamed from: b */
        void mo139229b(int i);

        /* renamed from: b */
        void mo139230b(Context context);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$e */
    public interface AbstractC38045e {
        /* renamed from: a */
        AbstractC29479b mo139231a();

        /* renamed from: a */
        void mo139232a(String str);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$f */
    public interface AbstractC38046f {
        /* renamed from: a */
        void mo139233a(Context context, String str, String str2, Map<String, String> map);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$g */
    public interface AbstractC38047g {
        /* renamed from: a */
        AbstractC32808a mo139234a();

        /* renamed from: a */
        Chat mo139235a(String str);

        /* renamed from: a */
        void mo139236a(Context context, String str, Chat.ChatMode chatMode, boolean z, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo139237a(Context context, String str, boolean z, int i);

        /* renamed from: a */
        void mo139238a(ImageView imageView, String str);

        /* renamed from: a */
        void mo139239a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo139240a(String str, String str2);

        /* renamed from: a */
        void mo139241a(String str, boolean z, IGetDataCallback<ChatSetting> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$h */
    public interface AbstractC38048h {
        /* renamed from: a */
        void mo139242a(Context context);

        /* renamed from: a */
        boolean mo139243a();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$i */
    public interface AbstractC38049i {
        /* renamed from: a */
        void mo139244a(boolean z);

        /* renamed from: a */
        boolean mo139245a();

        /* renamed from: b */
        boolean mo139246b();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$j */
    public interface AbstractC38050j {
        /* renamed from: a */
        void mo139247a();

        /* renamed from: b */
        void mo139248b();

        /* renamed from: c */
        int mo139249c();

        /* renamed from: d */
        void mo139250d();

        /* renamed from: e */
        void mo139251e();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$k */
    public interface AbstractC38051k {
        /* renamed from: a */
        String mo139252a(String str, Map<String, String> map);

        /* renamed from: a */
        void mo139253a(Activity activity);

        /* renamed from: a */
        void mo139254a(String str, IGetDataCallback<DocFeed> iGetDataCallback);

        /* renamed from: a */
        void mo139255a(List<String> list);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$l */
    public interface AbstractC38052l {
        /* renamed from: a */
        boolean mo139256a(String str);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$m */
    public interface AbstractC38053m {
        /* renamed from: a */
        void mo139257a();

        /* renamed from: a */
        void mo139258a(View view, Activity activity);

        /* renamed from: a */
        void mo139259a(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener);

        /* renamed from: a */
        boolean mo139260a(String str);

        /* renamed from: b */
        boolean mo139261b(String str);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$n */
    public interface AbstractC38054n {
        /* renamed from: a */
        void mo139262a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$o */
    public interface AbstractC38055o {
        /* renamed from: a */
        void mo139263a(Context context);

        /* renamed from: a */
        void mo139264a(Context context, String str);

        /* renamed from: a */
        void mo139265a(Context context, String str, StrongGuideInfo dVar);

        /* renamed from: a */
        void mo139266a(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback);

        /* renamed from: a */
        boolean mo139267a();

        /* renamed from: b */
        void mo139268b(Context context);

        /* renamed from: b */
        void mo139269b(Context context, String str, StrongGuideInfo dVar);

        /* renamed from: b */
        void mo139270b(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback);

        /* renamed from: b */
        boolean mo139271b();

        /* renamed from: c */
        void mo139272c(Context context);

        /* renamed from: c */
        boolean mo139273c();

        /* renamed from: d */
        boolean mo139274d();

        /* renamed from: e */
        boolean mo139275e();

        /* renamed from: f */
        void mo139276f();

        /* renamed from: g */
        String mo139277g();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$p */
    public interface AbstractC38056p {
        /* renamed from: a */
        void mo139278a(Activity activity, boolean z, boolean z2, boolean z3);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$q */
    public interface AbstractC38057q {
        /* renamed from: a */
        String mo139279a();

        /* renamed from: a */
        void mo139280a(Context context, String str, Bundle bundle);

        /* renamed from: a */
        void mo139281a(AbstractC44544a aVar);

        /* renamed from: a */
        void mo139282a(AbstractC44546c cVar);

        /* renamed from: a */
        void mo139283a(String str);

        /* renamed from: b */
        void mo139284b(AbstractC44544a aVar);

        /* renamed from: b */
        void mo139285b(String str);

        /* renamed from: c */
        void mo139286c(String str);

        /* renamed from: d */
        void mo139287d(String str);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$r */
    public interface AbstractC38058r {
        /* renamed from: a */
        AbstractC38041ac mo139288a(Fragment fragment);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$s */
    public interface AbstractC38059s {
        /* renamed from: a */
        void mo137914a(Locale locale, Locale locale2);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$t */
    public interface AbstractC38060t {
        /* renamed from: a */
        void mo139289a(Activity activity);

        /* renamed from: b */
        void mo139290b(Activity activity);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$u */
    public interface AbstractC38061u {
        /* renamed from: a */
        void mo139291a(AbstractC38113w wVar);

        /* renamed from: b */
        void mo139292b(AbstractC38113w wVar);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$v */
    public interface AbstractC38062v {
        /* renamed from: a */
        void mo139293a();

        /* renamed from: a */
        void mo139294a(IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: a */
        void mo139295a(C37030f.AbstractC37033c cVar);

        /* renamed from: a */
        void mo139296a(AbstractC38059s sVar);

        /* renamed from: a */
        boolean mo139297a(long j);

        /* renamed from: b */
        void mo139298b(AbstractC38059s sVar);

        /* renamed from: b */
        boolean mo139299b();

        /* renamed from: c */
        boolean mo139300c();

        /* renamed from: d */
        boolean mo139301d();

        /* renamed from: e */
        int mo139302e();

        /* renamed from: f */
        boolean mo139303f();

        /* renamed from: g */
        boolean mo139304g();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$w */
    public interface AbstractC38063w {
        /* renamed from: a */
        void mo139305a(Activity activity, Team team);

        /* renamed from: a */
        void mo139306a(Context context);

        /* renamed from: a */
        void mo139307a(AbstractC55358a aVar);

        /* renamed from: a */
        void mo139308a(AbstractC55359b bVar);

        /* renamed from: a */
        void mo139309a(AbstractC55360c cVar);

        /* renamed from: a */
        boolean mo139310a();

        /* renamed from: b */
        void mo139311b(AbstractC55358a aVar);

        /* renamed from: b */
        void mo139312b(AbstractC55359b bVar);

        /* renamed from: b */
        void mo139313b(AbstractC55360c cVar);
    }

    /* renamed from: com.ss.android.lark.feed.b.a$x */
    public interface AbstractC38064x {
        /* renamed from: a */
        List<TenantInfo> mo139314a();

        /* renamed from: a */
        void mo139315a(IGetDataCallback<Map<String, Integer>> iGetDataCallback);

        /* renamed from: a */
        void mo139316a(AbstractC38086aa aaVar);

        /* renamed from: a */
        void mo139317a(AbstractC38111u uVar);

        /* renamed from: a */
        void mo139318a(AbstractC38115y yVar);

        /* renamed from: a */
        void mo139319a(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback);

        /* renamed from: b */
        List<TenantInfo.PendingUser> mo139320b();

        /* renamed from: b */
        void mo139321b(AbstractC38086aa aaVar);

        /* renamed from: b */
        void mo139322b(AbstractC38111u uVar);

        /* renamed from: b */
        void mo139323b(AbstractC38115y yVar);

        /* renamed from: c */
        int mo139324c();

        /* renamed from: d */
        boolean mo139325d();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$y */
    public interface AbstractC38065y {
        /* renamed from: a */
        String mo139326a();
    }

    /* renamed from: com.ss.android.lark.feed.b.a$z */
    public interface AbstractC38066z {
        /* renamed from: a */
        boolean mo139327a();
    }

    /* renamed from: A */
    AbstractC38047g mo139154A();

    /* renamed from: B */
    AbstractC38038a mo139155B();

    /* renamed from: C */
    AbstractC38048h mo139156C();

    /* renamed from: D */
    AbstractC38063w mo139157D();

    /* renamed from: E */
    AbstractC38039aa mo139158E();

    /* renamed from: F */
    AbstractC38056p mo139159F();

    /* renamed from: G */
    AbstractC38042b mo139160G();

    /* renamed from: H */
    AbstractC38067b mo139161H();

    /* renamed from: I */
    AbstractC38060t mo139162I();

    /* renamed from: J */
    AbstractC38065y mo139163J();

    /* renamed from: K */
    AbstractC38058r mo139164K();

    /* renamed from: L */
    void mo139165L();

    /* renamed from: M */
    AbstractC38057q mo139166M();

    /* renamed from: N */
    AbstractC38045e mo139167N();

    /* renamed from: O */
    boolean mo139168O();

    /* renamed from: P */
    boolean mo139169P();

    /* renamed from: a */
    Context mo139170a();

    /* renamed from: a */
    RichText mo139171a(String str);

    /* renamed from: a */
    String mo139172a(List<Chatter.ChatterCustomStatus> list);

    /* renamed from: a */
    void mo139173a(int i);

    /* renamed from: a */
    void mo139174a(Context context, int i);

    /* renamed from: a */
    void mo139175a(Context context, String str);

    /* renamed from: a */
    void mo139176a(Context context, String str, int i);

    /* renamed from: a */
    void mo139177a(IDeviceNotifyListener iDeviceNotifyListener);

    /* renamed from: a */
    void mo139178a(String str, String str2, String str3);

    /* renamed from: a */
    void mo139179a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    boolean mo139180a(Context context);

    /* renamed from: b */
    AbstractC38053m mo139181b();

    /* renamed from: b */
    void mo139182b(Context context, int i);

    /* renamed from: b */
    void mo139183b(Context context, String str);

    /* renamed from: c */
    AbstractC38043c mo139184c();

    /* renamed from: d */
    boolean mo139185d();

    /* renamed from: e */
    AbstractC38049i mo139186e();

    /* renamed from: f */
    AbstractC38061u mo139187f();

    /* renamed from: g */
    void mo139188g();

    /* renamed from: h */
    Locale mo139189h();

    /* renamed from: i */
    void mo139190i();

    /* renamed from: j */
    void mo139191j();

    /* renamed from: k */
    void mo139192k();

    /* renamed from: l */
    void mo139193l();

    /* renamed from: m */
    void mo139194m();

    /* renamed from: n */
    AbstractC38070a mo139195n();

    /* renamed from: o */
    AbstractC38084a mo139196o();

    /* renamed from: p */
    AbstractC38040ab mo139197p();

    /* renamed from: q */
    AbstractC38052l mo139198q();

    /* renamed from: r */
    AbstractC38066z mo139199r();

    /* renamed from: s */
    AbstractC38064x mo139200s();

    /* renamed from: t */
    AbstractC38044d mo139201t();

    /* renamed from: u */
    AbstractC38046f mo139202u();

    /* renamed from: v */
    AbstractC38062v mo139203v();

    /* renamed from: w */
    AbstractC38050j mo139204w();

    /* renamed from: x */
    AbstractC38054n mo139205x();

    /* renamed from: y */
    AbstractC38055o mo139206y();

    /* renamed from: z */
    AbstractC38051k mo139207z();
}
