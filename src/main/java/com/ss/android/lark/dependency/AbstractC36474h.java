package com.ss.android.lark.dependency;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.api.p1595b.AbstractC32811a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1662b.AbstractC33975a;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.dto.p1812a.C36864a;
import com.ss.android.lark.dto.p1814c.C36867a;
import com.ss.android.lark.keyboard.plugin.tool.preview.IScreenshotCallBack;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.p2392o.AbstractC48705o;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnLoadMoreListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.ss.android.lark.dependency.h */
public interface AbstractC36474h {

    /* renamed from: com.ss.android.lark.dependency.h$a */
    public interface AbstractC36475a {
        /* renamed from: a */
        String mo134599a();

        /* renamed from: a */
        boolean mo134600a(String str);

        /* renamed from: b */
        C36867a mo134601b();

        /* renamed from: b */
        String mo134602b(String str);

        /* renamed from: c */
        UniversalUserSetting mo134603c(String str);

        /* renamed from: c */
        String mo134604c();

        /* renamed from: d */
        String mo134605d();
    }

    /* renamed from: com.ss.android.lark.dependency.h$b */
    public interface AbstractC36476b {
        /* renamed from: a */
        boolean mo134606a();

        /* renamed from: b */
        Activity mo134607b();
    }

    /* renamed from: com.ss.android.lark.dependency.h$c */
    public interface AbstractC36477c {
        /* renamed from: a */
        int mo134608a();

        /* renamed from: a */
        void mo134609a(Notification notification, int i);

        /* renamed from: a */
        void mo134610a(Context context, int i);
    }

    /* renamed from: com.ss.android.lark.dependency.h$d */
    public interface AbstractC36478d {
        /* renamed from: a */
        boolean mo134611a();
    }

    /* renamed from: com.ss.android.lark.dependency.h$e */
    public interface AbstractC36479e {
        /* renamed from: a */
        void mo134612a(AbstractC33992b bVar);

        /* renamed from: a */
        void mo134613a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo134614a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo134615b(AbstractC33992b bVar);
    }

    /* renamed from: com.ss.android.lark.dependency.h$f */
    public interface AbstractC36480f {
        /* renamed from: a */
        void mo134616a(String str, String str2, String str3, float f, float f2, View view, String str4, AbstractC28533c cVar, String str5);
    }

    /* renamed from: com.ss.android.lark.dependency.h$g */
    public interface AbstractC36481g {
        /* renamed from: a */
        List<FavoriteMessageInfo> mo134617a(FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: a */
        void mo134618a(long j, int i, IGetDataCallback<C36864a> iGetDataCallback);

        /* renamed from: a */
        void mo134619a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo134620a(List<String> list, String str, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo134621a(List<String> list, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.dependency.h$h */
    public interface AbstractC36482h {
        /* renamed from: a */
        void mo134622a(IScreenshotCallBack eVar);
    }

    /* renamed from: com.ss.android.lark.dependency.h$i */
    public interface AbstractC36483i {
        /* renamed from: a */
        IPlusItem mo134623a(Chat chat);

        /* renamed from: a */
        void mo134624a(String str, Chat chat, JSONArray jSONArray);

        /* renamed from: a */
        boolean mo134625a();
    }

    /* renamed from: com.ss.android.lark.dependency.h$j */
    public interface AbstractC36484j {
        /* renamed from: a */
        boolean mo134626a(String str);

        /* renamed from: b */
        boolean mo134627b(String str);
    }

    /* renamed from: com.ss.android.lark.dependency.h$k */
    public interface AbstractC36485k {
        /* renamed from: a */
        AbstractC36491q mo134628a(Fragment fragment);
    }

    /* renamed from: com.ss.android.lark.dependency.h$l */
    public interface AbstractC36486l {
        /* renamed from: a */
        PendingIntent mo134629a(Message message, boolean z, boolean z2);

        /* renamed from: a */
        AbstractNotification.AbstractC48496c<Notice> mo134630a();

        /* renamed from: a */
        void mo134631a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        boolean mo134632a(int i);

        /* renamed from: b */
        void mo134633b();

        /* renamed from: b */
        boolean mo134634b(int i);

        /* renamed from: c */
        String mo134635c(int i);
    }

    /* renamed from: com.ss.android.lark.dependency.h$m */
    public interface AbstractC36487m {
        /* renamed from: a */
        void mo127097a(List<IPlusItem> list);

        /* renamed from: a */
        void mo127098a(List<IPlusItem> list, List<IPlusItem> list2);
    }

    /* renamed from: com.ss.android.lark.dependency.h$n */
    public interface AbstractC36488n {
        /* renamed from: a */
        void mo134636a(Context context, String str, List<String> list, List<Integer> list2);

        /* renamed from: a */
        void mo134637a(Chat chat);

        /* renamed from: a */
        void mo134638a(Chat chat, AbstractC33975a aVar);

        /* renamed from: a */
        boolean mo134639a();
    }

    /* renamed from: com.ss.android.lark.dependency.h$o */
    public interface AbstractC36489o {
        /* renamed from: a */
        void mo134640a(Activity activity, String str);

        /* renamed from: a */
        void mo134641a(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.dependency.h$p */
    public interface AbstractC36490p {
        /* renamed from: a */
        Dialog mo134642a(Context context, String str, String str2, String str3, String str4, String str5);

        /* renamed from: a */
        void mo134643a(String str, String str2, String[] strArr, IGetDataCallback<List<String>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.dependency.h$q */
    public interface AbstractC36491q {
        /* renamed from: a */
        void mo134644a(View view);
    }

    /* renamed from: A */
    IStickerDependency mo134502A();

    /* renamed from: B */
    AbstractC36479e mo134503B();

    /* renamed from: C */
    AbstractC36472f mo134504C();

    /* renamed from: D */
    C36492r mo134505D();

    /* renamed from: E */
    IForwardDependency mo134506E();

    /* renamed from: F */
    AbstractC36458af mo134507F();

    /* renamed from: G */
    AbstractC32811a mo134508G();

    /* renamed from: H */
    AbstractC36459ag mo134509H();

    /* renamed from: I */
    AbstractC36506t mo134510I();

    /* renamed from: J */
    AbstractC36497m mo134511J();

    /* renamed from: K */
    AbstractC36504r mo134512K();

    /* renamed from: L */
    AbstractC36498n mo134513L();

    /* renamed from: M */
    AbstractC36495k mo134514M();

    /* renamed from: N */
    AbstractC36450aa mo134515N();

    /* renamed from: O */
    ap mo134516O();

    /* renamed from: P */
    ICalendarDependency mo134517P();

    /* renamed from: Q */
    IHelpdeskDependency mo134518Q();

    /* renamed from: R */
    ao mo134519R();

    /* renamed from: S */
    AbstractC36505s mo134520S();

    /* renamed from: T */
    AbstractC36507u mo134521T();

    /* renamed from: U */
    AbstractC36481g mo134522U();

    /* renamed from: V */
    AbstractC36461ah mo134523V();

    /* renamed from: W */
    an mo134524W();

    /* renamed from: X */
    AbstractC36489o mo134525X();

    /* renamed from: Y */
    AbstractC36490p mo134526Y();

    /* renamed from: Z */
    AbstractC36480f mo134527Z();

    /* renamed from: a */
    Context mo134528a();

    /* renamed from: a */
    Chatter.ChatterCustomStatus mo134529a(List<Chatter.ChatterCustomStatus> list);

    /* renamed from: a */
    AbstractC34033a mo134530a(Activity activity, Chat chat, com.ss.android.lark.chat.entity.chatter.Chatter chatter);

    /* renamed from: a */
    String mo134531a(String str, int i, int i2);

    /* renamed from: a */
    void mo134532a(Activity activity);

    /* renamed from: a */
    void mo134533a(Activity activity, View view);

    /* renamed from: a */
    void mo134534a(Context context);

    /* renamed from: a */
    void mo134535a(Context context, View view);

    /* renamed from: a */
    void mo134536a(Context context, Fragment fragment, int i, String str, String str2, boolean z, boolean z2, String str3);

    /* renamed from: a */
    void mo134537a(Context context, Chat chat, com.ss.android.lark.chat.entity.chatter.Chatter chatter, AbstractC36487m mVar);

    /* renamed from: a */
    void mo134538a(Context context, com.ss.android.lark.chat.entity.chatter.Chatter chatter, String str, String str2);

    /* renamed from: a */
    void mo134539a(Context context, String str, Message.Type type, String str2, ArrayList<String> arrayList, boolean z);

    /* renamed from: a */
    void mo134540a(Context context, String str, String str2, String str3, LKUIRoundedImageView lKUIRoundedImageView);

    /* renamed from: a */
    void mo134541a(Context context, List<PhotoItem> list, int i, View view, ActivityTransitionLauncher.LocationInfo locationInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, Scene scene, int i2);

    /* renamed from: a */
    void mo134542a(Context context, List<PhotoItem> list, int i, View view, ActivityTransitionLauncher.LocationInfo locationInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, OnDialogMenuClickListener onDialogMenuClickListener, OnLoadMoreListener onLoadMoreListener, OnChatAlbumClickListener onChatAlbumClickListener, Scene scene, int i2);

    /* renamed from: a */
    void mo134543a(Chat chat, com.ss.android.lark.chat.entity.chatter.Chatter chatter, AbstractC36487m mVar);

    /* renamed from: a */
    void mo134544a(AbstractC48705o oVar);

    /* renamed from: a */
    void mo134545a(String str, Activity activity);

    /* renamed from: a */
    void mo134546a(String str, String str2, int i, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo134547a(Set<String> set, String str, IGetDataCallback<Map<String, String>> iGetDataCallback);

    /* renamed from: a */
    boolean mo134548a(Context context, String str);

    AbstractC36476b aa();

    AbstractC36475a ab();

    AbstractC36477c ac();

    AbstractC36486l ad();

    ak ae();

    AbstractC36502p af();

    AbstractC36482h ag();

    AbstractC36493i ah();

    AbstractC36488n ai();

    AbstractC36470d aj();

    C24062d ak();

    AbstractC36452ab al();

    AbstractC36484j am();

    ITeamDependency an();

    AbstractC36483i ao();

    IContainerDependency ap();

    IWatermarkDependency aq();

    AbstractC36496l ar();

    aj as();

    boolean at();

    boolean au();

    AbstractC36485k av();

    AbstractC36478d aw();

    boolean ax();

    /* renamed from: b */
    void mo134573b(AbstractC48705o oVar);

    /* renamed from: b */
    boolean mo134574b();

    /* renamed from: c */
    boolean mo134575c();

    /* renamed from: d */
    String mo134576d();

    /* renamed from: e */
    AbstractC32812c mo134577e();

    /* renamed from: f */
    String mo134578f();

    /* renamed from: g */
    boolean mo134579g();

    /* renamed from: h */
    boolean mo134580h();

    /* renamed from: i */
    boolean mo134581i();

    /* renamed from: j */
    AbstractC25990b mo134582j();

    /* renamed from: k */
    AbstractC36508v mo134583k();

    /* renamed from: l */
    AbstractC36462ai mo134584l();

    /* renamed from: m */
    ar mo134585m();

    /* renamed from: n */
    AbstractC36503q mo134586n();

    /* renamed from: o */
    AbstractC36510y mo134587o();

    /* renamed from: p */
    AbstractC36511z mo134588p();

    /* renamed from: q */
    AbstractC36455ad mo134589q();

    /* renamed from: r */
    AbstractC36471e mo134590r();

    /* renamed from: s */
    AbstractC36501o mo134591s();

    /* renamed from: t */
    AbstractC36454ac mo134592t();

    /* renamed from: u */
    IBrowserDependency mo134593u();

    /* renamed from: v */
    AbstractC36473g mo134594v();

    /* renamed from: w */
    IChatSettingDependency mo134595w();

    /* renamed from: x */
    al mo134596x();

    /* renamed from: y */
    AbstractC36509x mo134597y();

    /* renamed from: z */
    AbstractC36456ae mo134598z();

    /* renamed from: com.ss.android.lark.dependency.h$r */
    public static class C36492r {

        /* renamed from: a */
        public final String f94027a;

        /* renamed from: b */
        public boolean f94028b;

        public C36492r(String str, boolean z) {
            this.f94027a = str;
            this.f94028b = z;
        }
    }
}
