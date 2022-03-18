package com.ss.android.lark.profile.dependency;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.IPushAddFriendListener;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52240a;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52241b;
import com.ss.android.lark.profile.statistics.p2549a.AbstractC52912a;
import io.reactivex.Observable;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface IProfileModuleDependency {

    public interface IVCLaunchCallback {

        @Retention(RetentionPolicy.SOURCE)
        public @interface VCLaunchError {
        }

        /* renamed from: a */
        void mo178828a(int i);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$a */
    public interface AbstractC52244a {
        /* renamed from: a */
        int mo133635a();

        /* renamed from: a */
        void mo133636a(Context context, String str);

        /* renamed from: b */
        int mo133637b();

        /* renamed from: c */
        int mo133638c();

        /* renamed from: d */
        String mo133639d();
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$b */
    public interface AbstractC52245b {
        void openUrl(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$c */
    public interface AbstractC52246c {

        /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$c$a */
        public interface AbstractC52247a {
            /* renamed from: a */
            void mo178829a(String str);
        }

        /* renamed from: a */
        Chatter mo133599a(String str);

        /* renamed from: a */
        ProfileChatter mo133600a();

        /* renamed from: a */
        Observable<ProfileChat> mo133601a(boolean z, String str, ContactSource contactSource);

        /* renamed from: a */
        String mo133602a(Chatter chatter);

        /* renamed from: a */
        void mo133603a(Context context, String str);

        /* renamed from: a */
        void mo133604a(Context context, String str, ContactSource contactSource, String str2);

        /* renamed from: a */
        void mo133605a(IGetDataCallback<ProfileChatter> iGetDataCallback);

        /* renamed from: a */
        void mo133606a(String str, IGetDataCallback<ProfileChatter> iGetDataCallback);

        /* renamed from: a */
        void mo133607a(String str, AbstractC52247a aVar);

        /* renamed from: a */
        void mo133608a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133609a(String str, String str2, String str3, ProfileContent profileContent, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133610a(String str, String str2, String str3, String str4, AddChatChatterApply.Ways ways, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo133611a(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

        /* renamed from: b */
        String mo133612b(String str);

        /* renamed from: c */
        ProfileChat mo133613c(String str);

        /* renamed from: d */
        Chat mo133614d(String str);

        /* renamed from: e */
        void mo133615e(String str);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$d */
    public interface AbstractC52248d {

        /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$d$a */
        public interface AbstractC52249a {
            /* renamed from: a */
            void mo178830a(View view, String str);
        }

        /* renamed from: a */
        void mo133661a(Context context, AbstractC52249a aVar);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$e */
    public interface AbstractC52250e {
        /* renamed from: a */
        void mo133650a(Activity activity, C36516a aVar, String str, Chat chat, boolean z, int i);

        /* renamed from: a */
        void mo133651a(Activity activity, String str, int i);

        /* renamed from: a */
        void mo133652a(Activity activity, String str, String str2, int i);

        /* renamed from: a */
        void mo133653a(Context context, ProfileContent profileContent);

        /* renamed from: a */
        void mo133654a(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133655a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo133656a(String str, String str2, String str3, String str4, String str5, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo133657a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo133658b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo133659b(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo133660c(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$f */
    public interface AbstractC52251f {

        /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$f$a */
        public interface AbstractC52252a {
            /* renamed from: a */
            void mo178831a(File file);
        }

        /* renamed from: a */
        int mo133595a(Context context);

        /* renamed from: a */
        void mo133596a(Context context, ImageView imageView, String str, String str2, ProfileLoadParams profileLoadParams);

        /* renamed from: a */
        void mo133597a(Context context, String str, String str2, int i, int i2, boolean z, boolean z2, AbstractC52252a aVar);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$g */
    public interface AbstractC52253g {
        /* renamed from: a */
        String mo133622a();

        /* renamed from: b */
        boolean mo133623b();

        /* renamed from: c */
        String mo133624c();

        /* renamed from: d */
        String mo133625d();

        /* renamed from: e */
        String mo133626e();

        /* renamed from: f */
        String mo133627f();

        /* renamed from: g */
        boolean mo133628g();
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$h */
    public interface AbstractC52254h {
        /* renamed from: a */
        Chatter.ChatterCustomStatus mo133643a(List<Chatter.ChatterCustomStatus> list);

        /* renamed from: a */
        String mo133644a(Context context, Long l);

        /* renamed from: a */
        void mo133645a(Context context, int i);

        /* renamed from: a */
        void mo133646a(Context context, Fragment fragment, ChatterDescription chatterDescription, int i);

        /* renamed from: a */
        boolean mo133647a();
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$i */
    public interface AbstractC52255i {
        /* renamed from: a */
        Fragment mo133648a(String str);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$j */
    public interface AbstractC52256j {
        /* renamed from: a */
        String mo133640a();

        /* renamed from: b */
        List<TenantInfo> mo133641b();

        /* renamed from: c */
        String mo133642c();
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$k */
    public interface AbstractC52257k {
        /* renamed from: a */
        void mo133662a(Activity activity, String str);

        /* renamed from: a */
        void mo133663a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo133664a(Activity activity, String str, String str2);

        /* renamed from: a */
        void mo133665a(Context context, String str);

        /* renamed from: b */
        void mo133666b(Activity activity, String str);

        /* renamed from: c */
        void mo133667c(Activity activity, String str);
    }

    /* renamed from: com.ss.android.lark.profile.dependency.IProfileModuleDependency$l */
    public interface AbstractC52258l {
        /* renamed from: a */
        void mo133629a(IPushAddFriendListener afVar);

        /* renamed from: a */
        void mo133630a(AbstractC52240a aVar);

        /* renamed from: a */
        void mo133631a(AbstractC52241b bVar);

        /* renamed from: b */
        void mo133632b(IPushAddFriendListener afVar);

        /* renamed from: b */
        void mo133633b(AbstractC52240a aVar);

        /* renamed from: b */
        void mo133634b(AbstractC52241b bVar);
    }

    /* renamed from: a */
    Bitmap mo133543a(Context context, Bitmap bitmap, int i);

    /* renamed from: a */
    Bitmap mo133544a(String str, int i, int i2, int i3);

    /* renamed from: a */
    String mo133545a();

    /* renamed from: a */
    String mo133546a(String str, String str2);

    /* renamed from: a */
    void mo133547a(Activity activity, ImageView imageView, int i);

    /* renamed from: a */
    void mo133548a(Context context);

    /* renamed from: a */
    void mo133549a(Context context, Contact contact, ContactSource contactSource, String str);

    /* renamed from: a */
    void mo133550a(Context context, String str);

    /* renamed from: a */
    void mo133551a(Context context, String str, String str2, View view);

    /* renamed from: a */
    void mo133552a(Context context, String str, String str2, View view, int i);

    /* renamed from: a */
    void mo133553a(Context context, String str, String str2, View view, String str3, int i);

    /* renamed from: a */
    void mo133554a(Context context, String str, List<String> list, int i, AbstractC44896a aVar);

    /* renamed from: a */
    void mo133555a(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar);

    /* renamed from: a */
    void mo133556a(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar);

    /* renamed from: a */
    void mo133557a(Context context, String str, boolean z);

    /* renamed from: a */
    void mo133558a(IGetDataCallback<GetInvitationLinkResponse> iGetDataCallback);

    /* renamed from: a */
    void mo133559a(String str, boolean z, boolean z2, IVCLaunchCallback iVCLaunchCallback);

    /* renamed from: a */
    boolean mo133560a(long j);

    /* renamed from: a */
    boolean mo133561a(String str);

    /* renamed from: b */
    Context mo133562b();

    /* renamed from: b */
    String mo133563b(String str);

    /* renamed from: b */
    void mo133564b(Context context, String str);

    /* renamed from: c */
    AbstractC52912a mo133565c();

    /* renamed from: c */
    void mo133566c(Context context, String str);

    /* renamed from: c */
    void mo133567c(String str);

    /* renamed from: d */
    void mo133568d(Context context, String str);

    /* renamed from: d */
    boolean mo133569d();

    /* renamed from: d */
    boolean mo133570d(String str);

    /* renamed from: e */
    void mo133571e(String str);

    /* renamed from: e */
    boolean mo133572e();

    /* renamed from: f */
    Activity mo133573f();

    /* renamed from: f */
    void mo133574f(String str);

    /* renamed from: g */
    boolean mo133575g();

    /* renamed from: g */
    boolean mo133576g(String str);

    /* renamed from: h */
    Locale mo133577h();

    /* renamed from: h */
    boolean mo133578h(String str);

    /* renamed from: i */
    String mo133579i();

    /* renamed from: j */
    boolean mo133580j();

    /* renamed from: k */
    boolean mo133581k();

    /* renamed from: l */
    AbstractC52250e mo133582l();

    /* renamed from: m */
    AbstractC52248d mo133583m();

    /* renamed from: n */
    AbstractC52257k mo133584n();

    /* renamed from: o */
    AbstractC52251f mo133585o();

    /* renamed from: p */
    AbstractC52246c mo133586p();

    /* renamed from: q */
    AbstractC52253g mo133587q();

    /* renamed from: r */
    AbstractC52258l mo133588r();

    /* renamed from: s */
    AbstractC52244a mo133589s();

    /* renamed from: t */
    AbstractC52245b mo133590t();

    /* renamed from: u */
    AbstractC52256j mo133591u();

    /* renamed from: v */
    AbstractC52254h mo133592v();

    /* renamed from: w */
    AbstractC52255i mo133593w();
}
