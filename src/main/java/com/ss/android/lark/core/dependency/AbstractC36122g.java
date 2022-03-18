package com.ss.android.lark.core.dependency;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.core.api.main.IFeedLoadListener;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29626r;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.biz.im.api.BotsResponse;
import com.ss.android.lark.biz.im.api.C29599ac;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.C29612d;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.C29634z;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatQRCodeInfoResponse;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.HomeOnCallInfo;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.biz.im.api.StickerContent;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.core.dependency.g */
public interface AbstractC36122g {
    /* renamed from: A */
    IChatParser mo132779A();

    /* renamed from: B */
    IChatterParser mo132780B();

    /* renamed from: C */
    int mo132781C();

    /* renamed from: D */
    void mo132782D();

    /* renamed from: E */
    String mo132783E();

    /* renamed from: F */
    AbstractC29524c mo132784F();

    /* renamed from: G */
    AbstractC29524c mo132785G();

    /* renamed from: H */
    void mo132786H();

    /* renamed from: I */
    Collection<? extends String> mo132787I();

    /* renamed from: J */
    int mo132788J();

    /* renamed from: K */
    int mo132789K();

    /* renamed from: L */
    String mo132790L();

    /* renamed from: M */
    int mo132791M();

    /* renamed from: N */
    String mo132792N();

    /* renamed from: O */
    boolean mo132793O();

    /* renamed from: P */
    Collection<? extends AbstractNotification> mo132794P();

    /* renamed from: Q */
    boolean mo132795Q();

    /* renamed from: R */
    boolean mo132796R();

    /* renamed from: S */
    boolean mo132797S();

    /* renamed from: T */
    List<String> mo132798T();

    /* renamed from: a */
    char mo132799a(Chatter chatter, Locale locale);

    /* renamed from: a */
    int mo132800a(DocType docType);

    /* renamed from: a */
    ImageHistoryResponse mo132801a(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i);

    /* renamed from: a */
    AbstractC29619l mo132802a(FeedCard.FeedType feedType, FeedCard.Type type);

    /* renamed from: a */
    Image mo132803a(ImageContent imageContent);

    /* renamed from: a */
    Image mo132804a(MediaContent mediaContent);

    /* renamed from: a */
    AbstractC44552i mo132805a(Context context, AbstractC44548e eVar, ITitleController iTitleController);

    /* renamed from: a */
    RichText mo132806a(com.bytedance.lark.pb.basic.v1.RichText richText);

    /* renamed from: a */
    String mo132807a(Chat chat);

    /* renamed from: a */
    String mo132808a(Chatter chatter, ChatterNameDisplayRule chatterNameDisplayRule);

    /* renamed from: a */
    String mo132809a(Message message);

    /* renamed from: a */
    String mo132810a(String str, String str2);

    /* renamed from: a */
    String mo132811a(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule);

    /* renamed from: a */
    Map<? extends String, ? extends Boolean> mo132812a();

    /* renamed from: a */
    Map<? extends String, ? extends AbstractC29186b> mo132813a(Context context);

    /* renamed from: a */
    Map<String, Chatter> mo132814a(List<String> list);

    /* renamed from: a */
    void mo132815a(int i, Map<String, Integer> map, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo132816a(Activity activity);

    /* renamed from: a */
    void mo132817a(Activity activity, C36516a aVar, String str, Chat chat, boolean z, int i);

    /* renamed from: a */
    void mo132818a(Activity activity, String str);

    /* renamed from: a */
    void mo132819a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132820a(Activity activity, String str, String str2);

    /* renamed from: a */
    void mo132821a(Application application, String str, String str2, String str3, ImageView imageView, int i, int i2);

    /* renamed from: a */
    void mo132822a(Context context, ImageView imageView, StickerContent stickerContent);

    /* renamed from: a */
    void mo132823a(Context context, ChatBundle chatBundle);

    /* renamed from: a */
    void mo132824a(Context context, ChatSettingApplyWay chatSettingApplyWay, AbstractC29611c cVar);

    /* renamed from: a */
    void mo132825a(Context context, LKPType lKPType, IScreenshotCallBack uVar);

    /* renamed from: a */
    void mo132826a(Context context, C29604ae aeVar);

    /* renamed from: a */
    void mo132827a(Context context, String str, int i, boolean z, boolean z2, boolean z3);

    /* renamed from: a */
    void mo132828a(Context context, String str, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: a */
    void mo132829a(Context context, String str, String str2);

    /* renamed from: a */
    void mo132830a(Context context, String str, List<String> list, int i, AbstractC44896a aVar);

    /* renamed from: a */
    void mo132831a(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo132832a(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar);

    /* renamed from: a */
    void mo132833a(Context context, String str, List<String> list, String str2, String str3, boolean z, AbstractC44896a aVar);

    /* renamed from: a */
    void mo132834a(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132835a(IGetDataCallback<?> iGetDataCallback);

    /* renamed from: a */
    void mo132836a(IGetDataCallback<BotsResponse> iGetDataCallback, int i);

    /* renamed from: a */
    void mo132837a(BaseFragment baseFragment, String str, List<String> list, int i);

    /* renamed from: a */
    void mo132838a(IFeedLoadListener aVar);

    /* renamed from: a */
    void mo132839a(C29599ac acVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132840a(C29601ad adVar);

    /* renamed from: a */
    void mo132841a(C29601ad adVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132842a(C29613e eVar);

    /* renamed from: a */
    void mo132843a(C29613e eVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132844a(AbstractC29620m mVar);

    /* renamed from: a */
    void mo132845a(AbstractC29621n nVar);

    /* renamed from: a */
    void mo132846a(AbstractC29623p pVar);

    /* renamed from: a */
    void mo132847a(AbstractC29626r rVar);

    /* renamed from: a */
    void mo132848a(AbstractC29627s sVar);

    /* renamed from: a */
    void mo132849a(AbstractC29628t tVar);

    /* renamed from: a */
    void mo132850a(C29631w wVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132851a(C29634z zVar, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132852a(Chat chat, String str);

    /* renamed from: a */
    void mo132853a(C36516a aVar, int i);

    /* renamed from: a */
    void mo132854a(AbstractC36551c.AbstractC36552a aVar);

    /* renamed from: a */
    void mo132855a(UIGetPluginCallback<IMoneyModule> dVar);

    /* renamed from: a */
    void mo132856a(String str);

    /* renamed from: a */
    void mo132857a(String str, int i);

    /* renamed from: a */
    void mo132858a(String str, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo132859a(String str, UIGetDataCallback<ChatQRCodeInfoResponse> uIGetDataCallback);

    /* renamed from: a */
    void mo132860a(String str, FeedCard.Type type);

    /* renamed from: a */
    void mo132861a(String str, AddChatChatterApply.Ways ways, List<String> list, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo132862a(String str, String str2, float f, float f2, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132863a(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo132864a(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i, IGetDataCallback<ImageHistoryResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132865a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132866a(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo132867a(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo132868a(String str, List<String> list, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo132869a(String str, List<String> list, List<C29612d> list2, IGetDataCallback<Map<String, String>> iGetDataCallback);

    /* renamed from: a */
    void mo132870a(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132871a(List<String> list, int i, String str, ShareAppCardLink abVar, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132872a(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback);

    /* renamed from: a */
    void mo132873a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback);

    /* renamed from: a */
    void mo132874a(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132875a(List<String> list, List<String> list2, Content content, boolean z, boolean z2, String str, boolean z3, String str2, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132876a(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132877a(boolean z);

    /* renamed from: a */
    void mo132878a(boolean z, IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: a */
    void mo132879a(boolean z, String str, ChatBundle.C29592c cVar, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    boolean mo132880a(Context context, String str);

    /* renamed from: a */
    boolean mo132881a(FeedCard.FeedType feedType);

    /* renamed from: a */
    boolean mo132882a(String str, boolean z);

    /* renamed from: b */
    int mo132883b();

    /* renamed from: b */
    Chatter mo132884b(boolean z);

    /* renamed from: b */
    Message mo132885b(String str);

    /* renamed from: b */
    String mo132886b(String str, String str2);

    /* renamed from: b */
    Map<String, Chat> mo132887b(List<String> list);

    /* renamed from: b */
    void mo132888b(Activity activity, String str);

    /* renamed from: b */
    void mo132889b(Context context);

    /* renamed from: b */
    void mo132890b(Context context, String str);

    /* renamed from: b */
    void mo132891b(IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: b */
    void mo132892b(IFeedLoadListener aVar);

    /* renamed from: b */
    void mo132893b(AbstractC29621n nVar);

    /* renamed from: b */
    void mo132894b(AbstractC29623p pVar);

    /* renamed from: b */
    void mo132895b(AbstractC29626r rVar);

    /* renamed from: b */
    void mo132896b(AbstractC29627s sVar);

    /* renamed from: b */
    void mo132897b(AbstractC29628t tVar);

    /* renamed from: b */
    void mo132898b(String str, IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: b */
    void mo132899b(String str, String str2, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo132900b(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo132901b(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

    /* renamed from: b */
    void mo132902b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

    /* renamed from: b */
    boolean mo132903b(Chat chat);

    /* renamed from: c */
    Chat mo132904c(String str, String str2);

    /* renamed from: c */
    Map<? extends String, ? extends C41149a> mo132905c();

    /* renamed from: c */
    Map<? extends String, ? extends AbstractC29186b> mo132906c(Context context);

    /* renamed from: c */
    Map<String, Message> mo132907c(List<String> list);

    /* renamed from: c */
    void mo132908c(Activity activity, String str);

    /* renamed from: c */
    void mo132909c(Context context, String str);

    /* renamed from: c */
    void mo132910c(IGetDataCallback<BotsResponse> iGetDataCallback);

    /* renamed from: c */
    void mo132911c(String str);

    /* renamed from: c */
    void mo132912c(String str, IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: c */
    void mo132913c(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    AbstractC44552i mo132914d(Context context);

    /* renamed from: d */
    String mo132915d();

    /* renamed from: d */
    Map<String, Chat> mo132916d(List<String> list);

    /* renamed from: d */
    void mo132917d(Activity activity, String str);

    /* renamed from: d */
    void mo132918d(Context context, String str);

    /* renamed from: d */
    void mo132919d(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    void mo132920d(String str);

    /* renamed from: d */
    void mo132921d(String str, IGetDataCallback<DocResult> iGetDataCallback);

    /* renamed from: d */
    void mo132922d(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback);

    /* renamed from: e */
    Chatter mo132923e(String str);

    /* renamed from: e */
    String mo132924e();

    /* renamed from: e */
    Map<? extends String, ? extends AbstractC29186b> mo132925e(Context context);

    /* renamed from: e */
    void mo132926e(Activity activity, String str);

    /* renamed from: e */
    void mo132927e(IGetDataCallback<List<HomeOnCallInfo>> iGetDataCallback);

    /* renamed from: e */
    void mo132928e(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback);

    /* renamed from: e */
    void mo132929e(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: f */
    Chat mo132930f(String str);

    /* renamed from: f */
    String mo132931f();

    /* renamed from: f */
    void mo132932f(Context context);

    /* renamed from: f */
    void mo132933f(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: f */
    void mo132934f(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: g */
    Chat mo132935g(String str);

    /* renamed from: g */
    void mo132936g();

    /* renamed from: g */
    void mo132937g(Context context);

    /* renamed from: g */
    void mo132938g(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: h */
    Chat mo132939h(String str);

    /* renamed from: h */
    AbstractC44552i mo132940h(Context context);

    /* renamed from: h */
    void mo132941h(String str, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: h */
    boolean mo132942h();

    /* renamed from: i */
    Chatter mo132943i(String str);

    /* renamed from: i */
    String mo132944i();

    /* renamed from: j */
    int mo132945j(String str);

    /* renamed from: j */
    void mo132946j();

    /* renamed from: k */
    Chat mo132947k(String str);

    /* renamed from: k */
    void mo132948k();

    /* renamed from: l */
    View mo132949l();

    /* renamed from: l */
    void mo132950l(String str);

    /* renamed from: m */
    String mo132951m();

    /* renamed from: m */
    void mo132952m(String str);

    /* renamed from: n */
    void mo132953n();

    /* renamed from: o */
    void mo132954o();

    /* renamed from: p */
    void mo132955p();

    /* renamed from: q */
    void mo132956q();

    /* renamed from: r */
    boolean mo132957r();

    /* renamed from: s */
    boolean mo132958s();

    /* renamed from: t */
    String mo132959t();

    /* renamed from: u */
    String mo132960u();

    /* renamed from: v */
    Chatter mo132961v();

    /* renamed from: w */
    List<AbstractC28490a> mo132962w();

    /* renamed from: x */
    Map<? extends String, ? extends Boolean> mo132963x();

    /* renamed from: y */
    IDiskCleanTask mo132964y();

    /* renamed from: z */
    void mo132965z();
}
