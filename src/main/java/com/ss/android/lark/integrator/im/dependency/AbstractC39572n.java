package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.im.v1.ContentType;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.AbstractC29543ag;
import com.ss.android.lark.biz.core.api.AbstractC29544ah;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.biz.core.api.FileState;
import com.ss.android.lark.biz.core.api.IPushAddFriendListener;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.an;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.biz.core.api.as;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29581c;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.utils.rxjava.C57865c;
import io.reactivex.Observable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.integrator.im.dependency.n */
public interface AbstractC39572n {
    /* renamed from: A */
    String mo143375A();

    /* renamed from: B */
    boolean mo143376B();

    /* renamed from: C */
    AbstractC29582d mo143377C();

    /* renamed from: D */
    void mo143378D();

    /* renamed from: E */
    AbstractC29542ad mo143379E();

    /* renamed from: F */
    IOpenMessageCellFactory mo143380F();

    /* renamed from: G */
    String mo143381G();

    /* renamed from: H */
    String mo143382H();

    /* renamed from: I */
    Profile mo143383I();

    /* renamed from: J */
    long mo143384J();

    /* renamed from: K */
    long mo143385K();

    /* renamed from: L */
    AbstractC29555b mo143386L();

    /* renamed from: M */
    String mo143387M();

    /* renamed from: N */
    AbstractC41561d mo143388N();

    /* renamed from: O */
    AbstractC41569h mo143389O();

    /* renamed from: P */
    AbstractC41562e mo143390P();

    /* renamed from: Q */
    int mo143391Q();

    /* renamed from: R */
    boolean mo143392R();

    /* renamed from: S */
    String mo143393S();

    /* renamed from: T */
    boolean mo143394T();

    /* renamed from: U */
    NetworkLevelListener.NetworkLevel mo143395U();

    /* renamed from: V */
    void mo143396V();

    /* renamed from: W */
    boolean mo143397W();

    /* renamed from: X */
    void mo143398X();

    /* renamed from: Y */
    AbstractNotification.AbstractC48496c<Notice> mo143399Y();

    /* renamed from: Z */
    void mo143400Z();

    /* renamed from: a */
    PendingIntent mo143401a(Message message, boolean z, boolean z2);

    /* renamed from: a */
    Bitmap mo143402a(String str, int i, int i2, int i3);

    /* renamed from: a */
    Fragment mo143403a(Context context, Bundle bundle, Chat chat);

    /* renamed from: a */
    Chatter.ChatterCustomStatus mo143404a(List<Chatter.ChatterCustomStatus> list);

    /* renamed from: a */
    as mo143405a(Fragment fragment);

    /* renamed from: a */
    IPlusItem mo143406a(Chat chat);

    /* renamed from: a */
    Image mo143407a(com.bytedance.lark.pb.basic.v1.Image image);

    /* renamed from: a */
    Image mo143408a(ImageSet imageSet);

    /* renamed from: a */
    <T extends C41152a> T mo143409a(String str, AbstractC41160a aVar);

    /* renamed from: a */
    Observable<EncryptImageData> mo143410a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, Scene scene);

    /* renamed from: a */
    String mo143411a(RichTextElement.ImageProperty imageProperty);

    /* renamed from: a */
    String mo143412a(String str, int i, int i2);

    /* renamed from: a */
    void mo143413a();

    /* renamed from: a */
    void mo143414a(int i);

    /* renamed from: a */
    void mo143415a(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback);

    /* renamed from: a */
    void mo143416a(Activity activity);

    /* renamed from: a */
    void mo143417a(Activity activity, String str);

    /* renamed from: a */
    void mo143418a(Activity activity, List<SelectedData> list, int i);

    /* renamed from: a */
    void mo143419a(Dialog dialog);

    /* renamed from: a */
    void mo143420a(Notification notification, int i);

    /* renamed from: a */
    void mo143421a(ComponentCallbacks2 componentCallbacks2);

    /* renamed from: a */
    void mo143422a(Context context);

    /* renamed from: a */
    void mo143423a(Context context, int i);

    /* renamed from: a */
    void mo143424a(Context context, ImageView imageView, String str, LoadParams loadParams);

    /* renamed from: a */
    void mo143425a(Context context, ImageView imageView, String str, String str2, LoadParams loadParams);

    /* renamed from: a */
    void mo143426a(Context context, FavoriteForwardData favoriteForwardData, int i, String str, int i2);

    /* renamed from: a */
    void mo143427a(Context context, IInitBuilder<IInitBuilder.IApplyCollabDialogBuilder> aVar);

    /* renamed from: a */
    void mo143428a(Context context, FilePickerLaunchParams fVar, C36516a aVar, boolean z);

    /* renamed from: a */
    void mo143429a(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3);

    /* renamed from: a */
    void mo143430a(Context context, Message message, int i, String str, String str2, String str3);

    /* renamed from: a */
    void mo143431a(Context context, Message message, String str, String str2);

    /* renamed from: a */
    void mo143432a(Context context, Message message, String str, String str2, String str3);

    /* renamed from: a */
    void mo143433a(Context context, ProfileContent profileContent);

    /* renamed from: a */
    void mo143434a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3);

    /* renamed from: a */
    void mo143435a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3);

    /* renamed from: a */
    void mo143436a(Context context, File file, boolean z, IGetDataCallback<C29548at> iGetDataCallback, Biz biz, Scene scene);

    /* renamed from: a */
    void mo143437a(Context context, String str);

    /* renamed from: a */
    void mo143438a(Context context, String str, int i);

    /* renamed from: a */
    void mo143439a(Context context, String str, Bundle bundle);

    /* renamed from: a */
    void mo143440a(Context context, String str, UrlParams urlParams);

    /* renamed from: a */
    void mo143441a(Context context, String str, UrlParams urlParams, Map<String, String> map);

    /* renamed from: a */
    void mo143442a(Context context, String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2);

    /* renamed from: a */
    void mo143443a(Context context, String str, Object obj, int i, int i2, IGetDataCallback<File> iGetDataCallback);

    /* renamed from: a */
    void mo143444a(Context context, String str, String str2);

    /* renamed from: a */
    void mo143445a(Context context, String str, String str2, int i);

    /* renamed from: a */
    void mo143446a(Context context, String str, String str2, ImageView imageView);

    /* renamed from: a */
    void mo143447a(Context context, String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo143448a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: a */
    void mo143449a(Context context, String str, String str2, String str3, View view);

    /* renamed from: a */
    void mo143450a(Context context, String str, boolean z);

    /* renamed from: a */
    void mo143451a(Context context, String str, boolean z, boolean z2);

    /* renamed from: a */
    void mo143452a(Context context, String str, boolean z, boolean z2, int i);

    /* renamed from: a */
    void mo143453a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, IGetDataCallback<EncryptImageData> iGetDataCallback);

    /* renamed from: a */
    void mo143454a(Context context, boolean z);

    /* renamed from: a */
    void mo143455a(View view);

    /* renamed from: a */
    void mo143456a(View view, int i);

    /* renamed from: a */
    void mo143457a(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo143458a(WebView webView, String str);

    /* renamed from: a */
    void mo143459a(Fragment fragment, Activity activity, ImageView imageView, int i, String str);

    /* renamed from: a */
    void mo143460a(Fragment fragment, List<SelectedData> list, int i);

    /* renamed from: a */
    void mo143461a(Lifecycle lifecycle, View view);

    /* renamed from: a */
    void mo143462a(IGetDataCallback<TimeFormatSetting> iGetDataCallback);

    /* renamed from: a */
    void mo143463a(NetworkLevelListener networkLevelListener);

    /* renamed from: a */
    void mo143464a(WSConnState.AbstractC29537a aVar);

    /* renamed from: a */
    void mo143465a(AbstractC29540ab abVar);

    /* renamed from: a */
    void mo143466a(IPushAddFriendListener afVar);

    /* renamed from: a */
    void mo143467a(AbstractC29543ag agVar);

    /* renamed from: a */
    void mo143468a(AbstractC29544ah ahVar);

    /* renamed from: a */
    void mo143469a(an anVar);

    /* renamed from: a */
    void mo143470a(ao aoVar);

    /* renamed from: a */
    void mo143471a(ar arVar);

    /* renamed from: a */
    void mo143472a(az azVar);

    /* renamed from: a */
    void mo143473a(AbstractC29561h hVar);

    /* renamed from: a */
    void mo143474a(AbstractC29562i iVar);

    /* renamed from: a */
    void mo143475a(AbstractC29572q.AbstractC29573a aVar);

    /* renamed from: a */
    void mo143476a(AbstractC29579a aVar);

    /* renamed from: a */
    void mo143477a(AbstractC29580b bVar);

    /* renamed from: a */
    void mo143478a(AbstractC29581c cVar);

    /* renamed from: a */
    void mo143479a(AbstractC29586u uVar);

    /* renamed from: a */
    void mo143480a(AbstractC29589z zVar);

    /* renamed from: a */
    void mo143481a(AbstractC44544a aVar);

    /* renamed from: a */
    void mo143482a(AbstractC44546c cVar);

    /* renamed from: a */
    void mo143483a(C57865c.AbstractC57871b<Boolean> bVar);

    /* renamed from: a */
    void mo143484a(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: a */
    void mo143485a(String str, Activity activity);

    /* renamed from: a */
    void mo143486a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo143487a(String str, ChatBundle.SourceType sourceType);

    /* renamed from: a */
    void mo143488a(String str, com.ss.android.lark.searchcommon.dto.Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo143489a(String str, String str2);

    /* renamed from: a */
    void mo143490a(String str, String str2, int i);

    /* renamed from: a */
    void mo143491a(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback);

    /* renamed from: a */
    void mo143492a(String str, String str2, long j, String str3, int i, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: a */
    void mo143493a(String str, String str2, long j, String str3, String str4);

    /* renamed from: a */
    void mo143494a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo143495a(String str, String str2, String[] strArr, ContentType contentType, IGetDataCallback<List<String>> iGetDataCallback);

    /* renamed from: a */
    void mo143496a(String str, Map<String, String> map, MagicViewContainer awVar, AbstractC29588w wVar);

    /* renamed from: a */
    void mo143497a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo143498a(boolean z, IGetDataCallback<AppConfig> iGetDataCallback);

    /* renamed from: a */
    boolean mo143499a(long j);

    /* renamed from: a */
    boolean mo143500a(Context context, AbstractC41567g.AbstractC41568a aVar);

    /* renamed from: a */
    boolean mo143501a(String str);

    /* renamed from: a */
    boolean mo143502a(String str, C38708a aVar);

    /* renamed from: a */
    boolean mo143503a(boolean z);

    /* renamed from: a */
    double[] mo143504a(double d, double d2);

    boolean aa();

    boolean ab();

    boolean ac();

    boolean ad();

    String ae();

    int af();

    String ag();

    AbstractC25990b ah();

    void ai();

    AbstractC32812c aj();

    ISearchLifecycleObserver ak();

    boolean al();

    boolean am();

    /* renamed from: b */
    Image mo143518b(ImageSet imageSet);

    /* renamed from: b */
    String mo143519b(RichTextElement.ImageProperty imageProperty);

    /* renamed from: b */
    void mo143520b(long j);

    /* renamed from: b */
    void mo143521b(Activity activity);

    /* renamed from: b */
    void mo143522b(Activity activity, String str);

    /* renamed from: b */
    void mo143523b(Context context, int i);

    /* renamed from: b */
    void mo143524b(Context context, ImageView imageView, String str, LoadParams loadParams);

    /* renamed from: b */
    void mo143525b(Context context, IInitBuilder<IInitBuilder.IBlockTipBuilder> aVar);

    /* renamed from: b */
    void mo143526b(Context context, String str);

    /* renamed from: b */
    void mo143527b(Context context, String str, Bundle bundle);

    /* renamed from: b */
    void mo143528b(Context context, String str, String str2, int i);

    /* renamed from: b */
    void mo143529b(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: b */
    void mo143530b(Context context, String str, boolean z);

    /* renamed from: b */
    void mo143531b(View view);

    /* renamed from: b */
    void mo143532b(IGetDataCallback<List<String>> iGetDataCallback);

    /* renamed from: b */
    void mo143533b(NetworkLevelListener networkLevelListener);

    /* renamed from: b */
    void mo143534b(WSConnState.AbstractC29537a aVar);

    /* renamed from: b */
    void mo143535b(AbstractC29540ab abVar);

    /* renamed from: b */
    void mo143536b(IPushAddFriendListener afVar);

    /* renamed from: b */
    void mo143537b(AbstractC29543ag agVar);

    /* renamed from: b */
    void mo143538b(AbstractC29544ah ahVar);

    /* renamed from: b */
    void mo143539b(an anVar);

    /* renamed from: b */
    void mo143540b(ao aoVar);

    /* renamed from: b */
    void mo143541b(ar arVar);

    /* renamed from: b */
    void mo143542b(az azVar);

    /* renamed from: b */
    void mo143543b(AbstractC29561h hVar);

    /* renamed from: b */
    void mo143544b(AbstractC29562i iVar);

    /* renamed from: b */
    void mo143545b(AbstractC29572q.AbstractC29573a aVar);

    /* renamed from: b */
    void mo143546b(AbstractC29581c cVar);

    /* renamed from: b */
    void mo143547b(AbstractC29586u uVar);

    /* renamed from: b */
    void mo143548b(AbstractC29589z zVar);

    /* renamed from: b */
    void mo143549b(AbstractC44544a aVar);

    /* renamed from: b */
    void mo143550b(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback);

    /* renamed from: b */
    void mo143551b(String str, String str2);

    /* renamed from: b */
    void mo143552b(String str, String str2, long j, String str3, String str4);

    /* renamed from: b */
    void mo143553b(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo143554b(boolean z);

    /* renamed from: b */
    boolean mo143555b();

    /* renamed from: b */
    boolean mo143556b(double d, double d2);

    /* renamed from: b */
    boolean mo143557b(Context context);

    /* renamed from: b */
    boolean mo143558b(Context context, String str, int i);

    /* renamed from: b */
    boolean mo143559b(String str);

    /* renamed from: c */
    ByteString mo143560c(ImageSet imageSet);

    /* renamed from: c */
    void mo143561c(long j);

    /* renamed from: c */
    void mo143562c(Activity activity);

    /* renamed from: c */
    void mo143563c(Context context, int i);

    /* renamed from: c */
    void mo143564c(Context context, String str);

    /* renamed from: c */
    void mo143565c(Context context, String str, int i);

    /* renamed from: c */
    void mo143566c(IGetDataCallback<AppConfig> iGetDataCallback);

    /* renamed from: c */
    void mo143567c(String str, IGetDataCallback<ProfileResponse> iGetDataCallback);

    /* renamed from: c */
    void mo143568c(String str, String str2);

    /* renamed from: c */
    boolean mo143569c();

    /* renamed from: c */
    boolean mo143570c(Context context);

    /* renamed from: c */
    boolean mo143571c(String str);

    /* renamed from: d */
    void mo143572d(long j);

    /* renamed from: d */
    void mo143573d(Activity activity);

    /* renamed from: d */
    void mo143574d(Context context);

    /* renamed from: d */
    void mo143575d(IGetDataCallback<String> iGetDataCallback);

    /* renamed from: d */
    void mo143576d(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: d */
    boolean mo143577d();

    /* renamed from: d */
    boolean mo143578d(String str);

    /* renamed from: e */
    TimeFormatSetting mo143579e();

    /* renamed from: e */
    String mo143580e(String str);

    /* renamed from: e */
    void mo143581e(long j);

    /* renamed from: e */
    void mo143582e(Activity activity);

    /* renamed from: e */
    void mo143583e(IGetDataCallback iGetDataCallback);

    /* renamed from: f */
    void mo143584f(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback);

    /* renamed from: f */
    boolean mo143585f();

    /* renamed from: f */
    boolean mo143586f(String str);

    /* renamed from: g */
    AppConfig.FeatureConfig mo143587g(String str);

    /* renamed from: g */
    void mo143588g(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback);

    /* renamed from: g */
    boolean mo143589g();

    /* renamed from: h */
    long mo143590h();

    /* renamed from: h */
    UniversalUserSetting mo143591h(String str);

    /* renamed from: i */
    UserRelationResponse mo143592i(String str);

    /* renamed from: i */
    boolean mo143593i();

    /* renamed from: j */
    void mo143594j();

    /* renamed from: j */
    void mo143595j(String str);

    /* renamed from: k */
    BadgeStyle mo143596k();

    /* renamed from: k */
    void mo143597k(String str);

    /* renamed from: l */
    void mo143598l(String str);

    /* renamed from: l */
    boolean mo143599l();

    /* renamed from: m */
    void mo143600m(String str);

    /* renamed from: m */
    boolean mo143601m();

    /* renamed from: n */
    void mo143602n(String str);

    /* renamed from: n */
    boolean mo143603n();

    /* renamed from: o */
    void mo143604o(String str);

    /* renamed from: o */
    boolean mo143605o();

    /* renamed from: p */
    void mo143606p(String str);

    /* renamed from: p */
    boolean mo143607p();

    /* renamed from: q */
    AbstractC29479b mo143608q(String str);

    /* renamed from: q */
    Locale mo143609q();

    /* renamed from: r */
    Locale mo143610r();

    /* renamed from: r */
    boolean mo143611r(String str);

    /* renamed from: s */
    String mo143612s();

    /* renamed from: s */
    void mo143613s(String str);

    /* renamed from: t */
    AbstractC29551a mo143614t();

    /* renamed from: u */
    Locale mo143615u();

    /* renamed from: v */
    C29550b mo143616v();

    /* renamed from: w */
    int mo143617w();

    /* renamed from: x */
    boolean mo143618x();

    /* renamed from: y */
    String mo143619y();

    /* renamed from: z */
    String mo143620z();
}
