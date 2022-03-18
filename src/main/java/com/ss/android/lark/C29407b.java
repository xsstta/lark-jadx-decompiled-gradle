package com.ss.android.lark;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.ui.dependence.IChatterAvatarService;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.abtest.ExperimentConfig;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29626r;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.AbstractC29628t;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.biz.im.api.IThreadService;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.api.p1594a.C32809a;
import com.ss.android.lark.chat.api.service.AbstractC32819b;
import com.ss.android.lark.chat.api.service.AbstractC32901c;
import com.ss.android.lark.chat.api.service.AbstractC32902e;
import com.ss.android.lark.chat.api.service.AbstractC32903f;
import com.ss.android.lark.chat.api.service.AbstractC32904g;
import com.ss.android.lark.chat.api.service.AbstractC32905i;
import com.ss.android.lark.chat.api.service.AbstractC32906j;
import com.ss.android.lark.chat.api.service.AbstractC32907k;
import com.ss.android.lark.chat.api.service.AbstractC32908l;
import com.ss.android.lark.chat.api.service.IChatService;
import com.ss.android.lark.chat.api.service.IEmojiService;
import com.ss.android.lark.chat.api.service.IMessageService;
import com.ss.android.lark.chat.api.service.IPreviewService;
import com.ss.android.lark.chat.api.service.impl.AvatarService;
import com.ss.android.lark.chat.api.service.impl.PreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewPush;
import com.ss.android.lark.chat.api.service.impl.PreviewService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.api.service.p1600b.C32895j;
import com.ss.android.lark.chat.api.service.track.AbstractC32909d;
import com.ss.android.lark.chat.api.service.track.C32911g;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.LayoutSizeHelper;
import com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage.RedPacketMessageCellFactory;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.plugin.EnterChatPlugin;
import com.ss.android.lark.chat.plugin.GetChatInfoPlugin;
import com.ss.android.lark.chat.service.AbstractC34119b;
import com.ss.android.lark.chat.service.AbstractC34123d;
import com.ss.android.lark.chat.service.AbstractC34127i;
import com.ss.android.lark.chat.service.IChatManisService;
import com.ss.android.lark.chat.service.impl.C34146aa;
import com.ss.android.lark.chat.service.impl.C34158ac;
import com.ss.android.lark.chat.service.impl.C34172ae;
import com.ss.android.lark.chat.service.impl.C34175b;
import com.ss.android.lark.chat.service.impl.C34186c;
import com.ss.android.lark.chat.service.impl.C34203e;
import com.ss.android.lark.chat.service.impl.C34209g;
import com.ss.android.lark.chat.service.impl.C34215h;
import com.ss.android.lark.chat.service.impl.C34232o;
import com.ss.android.lark.chat.service.impl.C34235p;
import com.ss.android.lark.chat.service.impl.C34253r;
import com.ss.android.lark.chat.service.impl.EmojiService;
import com.ss.android.lark.chat.utils.C34330a;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.MsgBubbleUtil;
import com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils;
import com.ss.android.lark.chat.video.VideoPreviewActivity2;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.chatwindow.C35242f;
import com.ss.android.lark.chatwindow.ChatWindowManager;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.C36468b;
import com.ss.android.lark.dependency.ChatFGUtils;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.diskmange.MessengerCleanTask;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.favorite.C37076a;
import com.ss.android.lark.favorite.C37079b;
import com.ss.android.lark.favorite.list.FavoriteListAppLinkHandler;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.mergeforward.C45275c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.p2376a.C48399a;
import com.ss.android.lark.notification.p2380d.C48436a;
import com.ss.android.lark.notification.p2383f.C48501a;
import com.ss.android.lark.notification.reaction.C48558a;
import com.ss.android.lark.p2150m.C41706a;
import com.ss.android.lark.p2392o.AbstractC48703l;
import com.ss.android.lark.p2851u.C57303a;
import com.ss.android.lark.p2851u.C57341b;
import com.ss.android.lark.p2851u.C57342c;
import com.ss.android.lark.p2851u.C57343d;
import com.ss.android.lark.p2851u.C57344e;
import com.ss.android.lark.p2851u.p2852a.C57326l;
import com.ss.android.lark.p2993y.p2995b.p2996a.C59359a;
import com.ss.android.lark.parser.internal.ModelParserPreview;
import com.ss.android.lark.parser.internal.ModelParserPreviewHangPoint;
import com.ss.android.lark.share_group.C54821f;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.statistics.p2700n.C54961c;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.statistics.perf.PerfCreateGroupMonitor;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threaddetail.C55776b;
import com.ss.android.lark.threaddetail.C55831i;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.tour.AbstractC57291a;
import com.ss.android.lark.tour.C57292b;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.b */
public class C29407b {

    /* renamed from: a */
    private final AbstractC36474h f73516a;

    /* renamed from: b */
    private final IChatParser f73517b = new C57341b();

    /* renamed from: c */
    private final IChatterParser f73518c = new C57342c();

    /* renamed from: d */
    private final AbstractC32810b f73519d = new C57343d();

    /* renamed from: e */
    private final AbstractC32808a f73520e = new C57303a();

    /* renamed from: f */
    private final AbstractC32907k f73521f = new C57344e();

    /* renamed from: g */
    private final AbstractC32904g f73522g = new C54961c();

    /* renamed from: G */
    public String mo104180G() {
        return "favorite";
    }

    /* renamed from: N */
    public int mo104187N() {
        return 321000;
    }

    /* renamed from: A */
    public IChatterParser mo104177A() {
        return this.f73518c;
    }

    /* renamed from: B */
    public AbstractC32810b mo104178B() {
        return this.f73519d;
    }

    /* renamed from: C */
    public AbstractC32808a mo104179C() {
        return this.f73520e;
    }

    /* renamed from: I */
    public void mo104182I() {
        PerfChatPerformanceMonitor.m213465b();
    }

    /* renamed from: a */
    public AbstractC36474h mo104196a() {
        return this.f73516a;
    }

    /* renamed from: m */
    public IEmojiService mo104262m() {
        return EmojiService.f88528a;
    }

    /* renamed from: r */
    public AbstractC32907k mo104267r() {
        return this.f73521f;
    }

    /* renamed from: z */
    public IChatParser mo104275z() {
        return this.f73517b;
    }

    /* renamed from: a */
    public void mo104206a(Context context, ChatBundle chatBundle) {
        C35228b.m137564a().mo121114a(context, chatBundle);
    }

    /* renamed from: a */
    public void mo104207a(Context context, C29604ae aeVar) {
        C55831i.m216682a(context, aeVar);
    }

    /* renamed from: a */
    public void mo104209a(Context context, String str, Message message) {
        ThreadMergeForwardLauncher.f138288a.mo190745a(context, str, message);
    }

    /* renamed from: a */
    public void mo104226a(String str, String str2, SyncDataStrategy syncDataStrategy, C37030f.AbstractC37031a aVar) {
        UserStatusParseUrlPreViewUtils.f88765a.mo126951a(str, str2, syncDataStrategy, aVar);
    }

    /* renamed from: a */
    public void mo104223a(RichText richText, Map<String, PreviewHangPoint> map) {
        C57326l.m222160a(richText, map);
    }

    /* renamed from: a */
    public void mo104213a(IPreviewCache.PreviewCacheObserver aVar) {
        PreviewCache.f84447c.mo121325a().mo121322a(aVar);
        PreviewPush.f84455b.mo121331a().mo121328a(aVar);
    }

    /* renamed from: a */
    public void mo104212a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
        mo104196a().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, null, new AbstractC28533c() {
            /* class com.ss.android.lark.C29407b.C294081 */

            @Override // com.ss.android.lark.ai.AbstractC28533c
            /* renamed from: a */
            public void mo101579a(Dialog dialog) {
                WindowDialogManager.f91123a.mo129819a(dialog);
            }

            @Override // com.ss.android.lark.ai.AbstractC28533c
            /* renamed from: a */
            public void mo101580a(PopupWindow popupWindow) {
                WindowDialogManager.f91123a.mo129820a(popupWindow);
            }
        }, abbreviationInfo.messageId);
    }

    /* renamed from: a */
    public void mo104219a(Message message, boolean z) {
        C34332b.m133109a(message, z);
    }

    /* renamed from: a */
    public void mo104205a(Context context, TextView textView, Message message) {
        C54821f.m212664a(context, textView, (TextView) null, message, 3);
    }

    /* renamed from: a */
    public void mo104203a(Context context, View view, Message message) {
        C54821f.m212662a(context, view, message);
    }

    /* renamed from: a */
    public void mo104208a(Context context, Message message) {
        C34438a.m133575a(context, message);
    }

    /* renamed from: a */
    public boolean mo104232a(Chat chat) {
        return C34339g.m133169c(chat);
    }

    /* renamed from: a */
    public void mo104217a(AbstractC29628t tVar) {
        if (tVar != null) {
            C59359a.m230421a().mo201710a(tVar);
        }
    }

    /* renamed from: a */
    public void mo104215a(AbstractC29626r rVar) {
        if (rVar != null) {
            C34253r.m132890a().mo126802a(rVar);
        }
    }

    /* renamed from: a */
    public void mo104214a(AbstractC29623p pVar) {
        if (pVar != null) {
            C34209g.m132771a().mo126756a(pVar);
        }
    }

    /* renamed from: a */
    public void mo104216a(AbstractC29627s sVar) {
        if (sVar != null) {
            C34209g.m132771a().mo126757a(sVar);
        }
    }

    /* renamed from: a */
    public void mo104222a(AbstractC48703l lVar) {
        if (lVar != null) {
            C34186c.m132703a().mo126730a(lVar);
        }
    }

    /* renamed from: b */
    public void mo104244b(AbstractC48703l lVar) {
        if (lVar != null) {
            C34186c.m132703a().mo126736b(lVar);
        }
    }

    /* renamed from: a */
    public void mo104210a(Context context, String str, String str2) {
        C55831i.m216685a(context, str, str2);
    }

    /* renamed from: a */
    public void mo104224a(RichTextView richTextView, boolean z) {
        C34330a.m133107a(richTextView, z);
    }

    /* renamed from: a */
    public void mo104220a(AbstractC34127i iVar) {
        mo104181H().mo126713a(iVar);
    }

    /* renamed from: b */
    public void mo104243b(AbstractC34127i iVar) {
        mo104181H().mo126714b(iVar);
    }

    /* renamed from: a */
    public void mo104230a(boolean z, String str) {
        if (z) {
            PerfCreateGroupMonitor.m213516a(str);
        } else {
            PerfCreateGroupMonitor.m213515a();
        }
    }

    /* renamed from: a */
    public void mo104229a(boolean z) {
        if (z) {
            PerfChatPerformanceMonitor.m213455a(4);
        } else {
            PerfChatPerformanceMonitor.m213466b(4);
        }
    }

    /* renamed from: b */
    public void mo104246b(boolean z) {
        if (z) {
            PerfChatPerformanceMonitor.m213455a(7);
        } else {
            PerfChatPerformanceMonitor.m213466b(7);
        }
    }

    /* renamed from: a */
    public void mo104225a(String str, IGetDataCallback<DocResult> iGetDataCallback) {
        C32821b.m126120a().mo121146o(str, iGetDataCallback);
    }

    /* renamed from: b */
    public void mo104245b(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback) {
        C32821b.m126120a().mo121147p(str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo104211a(View view, int i, View view2, int[] iArr) {
        MsgBubbleUtil.m133102a(view, i, view2, 0, iArr);
    }

    /* renamed from: a */
    public void mo104221a(AbstractC36551c.AbstractC36552a aVar) {
        ChatWindowManager.m137600b().mo129696a(aVar);
    }

    /* renamed from: a */
    public void mo104218a(Chat chat, int i) {
        ChatHitPointNew.f135660c.mo187381a(chat, i);
    }

    /* renamed from: a */
    public void mo104227a(String str, String str2, String str3) {
        ChatHitPointNew.f135660c.mo187387a(str, str2, str3);
    }

    /* renamed from: a */
    public void mo104204a(Context context, View view, String str, String str2, String str3, String str4, int i, Image image, boolean z) {
        Intent intent = new Intent(context, VideoPreviewActivity2.class);
        intent.putExtra("preview_video_url", str);
        intent.putExtra("preview_origin_url", str3);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("preview_i_frame_url", str2);
            intent.putExtra("preview_vid", str4);
        }
        intent.putExtra("preview_cover", image);
        intent.putExtra("preview_site", i);
        intent.putExtra("previwee_source_type", z ? 1 : 0);
        if (context instanceof Activity) {
            context.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation((Activity) context, view, "show_video_share_element").toBundle());
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public void mo104228a(List<String> list, final IGetDataCallback<Boolean> iGetDataCallback) {
        C32848e.m126401b().mo121269b(list, new IGetDataCallback<Map<String, Message>>() {
            /* class com.ss.android.lark.C29407b.C294092 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Message> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo104231a(long j, long j2, String str) {
        return C32848e.m126401b().mo121261a(j, j2, str);
    }

    /* renamed from: D */
    public static Map<String, Boolean> m108181D() {
        return C36468b.m143789a();
    }

    /* renamed from: E */
    public static List<AbstractC28490a> m108182E() {
        return Collections.unmodifiableList(ExperimentConfig.f71632a);
    }

    /* renamed from: F */
    public static boolean m108183F() {
        return ExperimentConfig.f71633b.mo101363a();
    }

    /* renamed from: H */
    public C34172ae mo104181H() {
        return C34172ae.m132668a();
    }

    /* renamed from: L */
    public IDiskCleanTask mo104185L() {
        return new MessengerCleanTask();
    }

    /* renamed from: M */
    public void mo104186M() {
        ChatWindowManager.m137600b().mo129695a();
    }

    /* renamed from: O */
    public boolean mo104188O() {
        return C56145l.m218887b();
    }

    /* renamed from: R */
    public boolean mo104190R() {
        return ChatFGUtils.m143689a();
    }

    /* renamed from: S */
    public void mo104191S() {
        C54970a.m213419a(5, true);
    }

    /* renamed from: b */
    public String mo104235b() {
        return ChatTypeStateKeeper.f135671f.mo187405a();
    }

    /* renamed from: c */
    public AbstractC32902e mo104247c() {
        return C34232o.m132851a();
    }

    /* renamed from: d */
    public IChatService mo104251d() {
        return C32821b.m126120a();
    }

    /* renamed from: e */
    public IPreviewService mo104254e() {
        return PreviewService.f84464b.mo121338a();
    }

    /* renamed from: g */
    public AbstractC32901c mo104256g() {
        return C32835d.m126323c();
    }

    /* renamed from: h */
    public IChatterAvatarService mo104257h() {
        return AvatarService.m126107a();
    }

    /* renamed from: i */
    public IMessageService mo104258i() {
        return C32848e.m126401b();
    }

    /* renamed from: j */
    public AbstractC32908l mo104259j() {
        return C32895j.m126597a();
    }

    /* renamed from: k */
    public AbstractC32906j mo104260k() {
        return C34146aa.m132620b();
    }

    /* renamed from: l */
    public AbstractC32905i mo104261l() {
        return C35234b.m137579e();
    }

    /* renamed from: n */
    public AbstractC34123d mo104263n() {
        return C34215h.m132788a();
    }

    /* renamed from: o */
    public AbstractC32903f mo104264o() {
        return C34235p.m132853a();
    }

    /* renamed from: p */
    public AbstractC32819b mo104265p() {
        return C32832c.m126312a();
    }

    /* renamed from: q */
    public AbstractC34119b mo104266q() {
        return C34203e.m132761a();
    }

    /* renamed from: s */
    public List<String> mo104268s() {
        return C32809a.m125905a();
    }

    /* renamed from: t */
    public AbstractC29524c mo104269t() {
        return new C34175b();
    }

    /* renamed from: u */
    public AbstractC29524c mo104270u() {
        return new C34158ac();
    }

    /* renamed from: v */
    public void mo104271v() {
        C35242f.m137613a().mo129707b();
    }

    /* renamed from: x */
    public IThreadService mo104273x() {
        return C32881i.m126556a();
    }

    /* renamed from: y */
    public AbstractC57291a mo104274y() {
        return C57292b.m221991a();
    }

    /* renamed from: K */
    public boolean mo104184K() {
        return mo104196a().mo134586n().mo134685a("im.chat.msg.pintotop");
    }

    /* renamed from: P */
    public List<IOpenMessageCellFactory> mo104189P() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RedPacketMessageCellFactory());
        return arrayList;
    }

    /* renamed from: J */
    public boolean mo104183J() {
        if (!mo104196a().mo134586n().mo134685a("chat.enter.async.load.xml") || !ExperimentConfig.f71633b.mo101365c()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public IChatManisService mo104255f() {
        return (IChatManisService) C68183b.m264839a().mo237086a(mo104196a().mo134528a(), IChatManisService.class);
    }

    /* renamed from: w */
    public List<AbstractNotification> mo104272w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C48501a());
        arrayList.add(new C48558a());
        arrayList.add(new C48436a());
        arrayList.add(new C48399a());
        return arrayList;
    }

    /* renamed from: Q */
    public static List<LKPluginConfig> m108184Q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LKPluginConfig.C25571a().mo88741a(LKOpenApiBizDomain.MESSENGER).mo88745a(new GetChatInfoPlugin()).mo88748a(Arrays.asList("getChatInfoByChatId")).mo88744a(new LKOpenApiAccessConfig.C25569a().mo88733a(LKOpenApiBizDomain.OPEN_PLATFORM).mo88736a(false).mo88737a()).mo88749a());
        arrayList.add(new LKPluginConfig.C25571a().mo88741a(LKOpenApiBizDomain.MESSENGER).mo88745a(new EnterChatPlugin()).mo88744a(new LKOpenApiAccessConfig.C25569a().mo88733a(LKOpenApiBizDomain.OPEN_PLATFORM).mo88737a()).mo88749a());
        return arrayList;
    }

    /* renamed from: a */
    public AbstractC32909d mo104194a(String str) {
        return C32911g.m126697d(str);
    }

    /* renamed from: c */
    public void mo104248c(Context context) {
        PerfChatPerformanceMonitor.m213468c();
        C37079b.m146273a(context);
    }

    /* renamed from: d */
    public AbstractC44552i mo104252d(Context context) {
        return new C37076a(context);
    }

    /* renamed from: a */
    public UrlPreviewEntity mo104195a(com.bytedance.lark.pb.basic.v1.UrlPreviewEntity urlPreviewEntity) {
        return ModelParserPreview.m222175a(urlPreviewEntity);
    }

    /* renamed from: b */
    public ChatWindowPrepareData mo104234b(String str) {
        return C35242f.m137613a().mo129703a(str);
    }

    /* renamed from: c */
    public void mo104249c(String str) {
        C41706a.m165543a(str, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: d */
    public void mo104253d(String str) {
        ThreadTopicHitPoint.f135906a.mo187745l(str);
    }

    public C29407b(AbstractC36474h hVar) {
        this.f73516a = hVar;
    }

    /* renamed from: a */
    public Image mo104197a(ImageContent imageContent) {
        return C34336c.m133124a(imageContent);
    }

    /* renamed from: b */
    public void mo104236b(Context context) {
        mo104196a().ar().mo134661a(context);
    }

    /* renamed from: c */
    public void mo104250c(boolean z) {
        if (z) {
            PerfChatPerformanceMonitor.m213455a(8);
        } else {
            PerfChatPerformanceMonitor.m213466b(8);
        }
    }

    /* renamed from: b */
    public void mo104237b(IPreviewCache.PreviewCacheObserver aVar) {
        PreviewCache.f84447c.mo121325a().mo121324b(aVar);
        PreviewPush.f84455b.mo121331a().mo121330b(aVar);
    }

    /* renamed from: a */
    public Image mo104198a(MediaContent mediaContent) {
        return C34336c.m133125a(mediaContent);
    }

    /* renamed from: b */
    public void mo104238b(AbstractC29623p pVar) {
        if (pVar != null) {
            C34209g.m132771a().mo126760b(pVar);
        }
    }

    /* renamed from: a */
    public Map<String, AbstractC29186b> mo104199a(Context context) {
        HashMap hashMap = new HashMap();
        C55776b bVar = new C55776b();
        FavoriteListAppLinkHandler aVar = new FavoriteListAppLinkHandler();
        hashMap.put("/client/thread/open", bVar);
        hashMap.put("/client/messenger/favorite", aVar);
        return hashMap;
    }

    /* renamed from: b */
    public void mo104239b(AbstractC29626r rVar) {
        if (rVar != null) {
            C34253r.m132890a().mo126805b(rVar);
        }
    }

    /* renamed from: b */
    public void mo104240b(AbstractC29627s sVar) {
        if (sVar != null) {
            C34209g.m132771a().mo126761b(sVar);
        }
    }

    /* renamed from: a */
    public Map<String, Map<String, UrlPreviewEntity>> mo104201a(Map<String, List<String>> map) {
        return PreviewCache.f84447c.mo121325a().mo121320a(map);
    }

    /* renamed from: b */
    public void mo104241b(AbstractC29628t tVar) {
        if (tVar != null) {
            C59359a.m230421a().mo201715b(tVar);
        }
    }

    /* renamed from: b */
    public void mo104242b(Chat chat) {
        ChatHitPointNew.f135660c.mo187380a(chat);
    }

    /* renamed from: a */
    public int mo104192a(Context context, boolean z) {
        return LayoutSizeHelper.m128406a(context);
    }

    /* renamed from: b */
    public int mo104233b(Context context, boolean z) {
        if (z) {
            return LayoutSizeHelper.m128408c(context);
        }
        return LayoutSizeHelper.m128407b(context);
    }

    /* renamed from: a */
    public View mo104193a(Context context, CardContent cardContent) {
        com.ss.android.lark.chat.entity.message.content.CardContent a = mo104196a().mo134589q().mo134420a(cardContent);
        View a2 = mo104196a().mo134589q().mo134418a(context, a);
        BubbleStyle a3 = mo104196a().mo134589q().mo134422a(context, a2, a);
        MsgBubbleUtil.m133102a(a2, a3.mo126148c(), a3.mo126151e(), 0, a3.mo126150d());
        int[] b = a3.mo126147b();
        a2.setPadding(b[0], b[1], b[2], b[3]);
        return a2;
    }

    /* renamed from: a */
    public Map<String, PreviewHangPoint> mo104200a(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2) {
        return ModelParserPreviewHangPoint.m222178a(str, map, map2);
    }

    /* renamed from: a */
    public void mo104202a(Activity activity, MergeForwardContent mergeForwardContent, FavoriteMessageInfo favoriteMessageInfo, int i, int i2, String str) {
        C45275c.m179791a(activity, null, mergeForwardContent, favoriteMessageInfo, i, i2, str);
    }
}
