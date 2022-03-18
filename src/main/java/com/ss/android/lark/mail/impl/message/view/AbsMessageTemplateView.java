package com.ss.android.lark.mail.impl.message.view;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendResponse;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.action.CustomLabelThreadListMailAction;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.SendState;
import com.ss.android.lark.mail.impl.home.C42434b;
import com.ss.android.lark.mail.impl.message.C42827a;
import com.ss.android.lark.mail.impl.message.C42839c;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42924a;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.AbstractC42929a;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h;
import com.ss.android.lark.mail.impl.message.p2204d.C42851b;
import com.ss.android.lark.mail.impl.message.p2204d.C42868g;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.message.p2205e.C42886a;
import com.ss.android.lark.mail.impl.message.p2206f.C42904f;
import com.ss.android.lark.mail.impl.message.p2206f.C42913g;
import com.ss.android.lark.mail.impl.message.p2207g.C42936a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a;
import com.ss.android.lark.mail.impl.message.plugin.C42956b;
import com.ss.android.lark.mail.impl.message.plugin.C42959c;
import com.ss.android.lark.mail.impl.message.plugin.C42960d;
import com.ss.android.lark.mail.impl.message.plugin.translation.C42972c;
import com.ss.android.lark.mail.impl.message.recall.sender.C42984a;
import com.ss.android.lark.mail.impl.message.template.C43081v;
import com.ss.android.lark.mail.impl.message.template.C43086x;
import com.ss.android.lark.mail.impl.message.template.C43089z;
import com.ss.android.lark.mail.impl.message.view.p2210a.AbstractC43186e;
import com.ss.android.lark.mail.impl.message.view.p2210a.C43177b;
import com.ss.android.lark.mail.impl.message.view.p2211b.C43191a;
import com.ss.android.lark.mail.impl.message.view.p2211b.C43192b;
import com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;
import com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.settings.appconfig.MailMessageListConfig;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.uiframework.view.actionbar.ActionBar;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43720d;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43713a;
import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.mail.impl.utils.C43764g;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43977b;
import com.ss.android.lark.mail.impl.view.undo.UndoBar;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.tt.frontendapiinterface.ApiHandler;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3454b.AbstractC68272b;
import io.reactivex.p3456d.C68279a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.compress.p3493a.C69755i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbsMessageTemplateView extends RelativeLayout implements C43199a.AbstractC43200a, AbstractC43719c {

    /* renamed from: W */
    private static final Pattern f109670W = Pattern.compile("<[^>]*style\\s*=\\s*\"[^>]*white-space\\s*:\\s*(pre|nowrap)(\\s*[\";])");

    /* renamed from: A */
    protected C43192b f109671A;

    /* renamed from: B */
    public volatile boolean f109672B;

    /* renamed from: C */
    protected volatile boolean f109673C;

    /* renamed from: D */
    protected IGetDataCallback<C42099l> f109674D;

    /* renamed from: E */
    protected boolean f109675E;

    /* renamed from: F */
    protected boolean f109676F;

    /* renamed from: G */
    protected OperationTitleBar f109677G;

    /* renamed from: H */
    public C42839c f109678H;

    /* renamed from: I */
    protected C42886a f109679I;

    /* renamed from: J */
    protected AbstractC42924a f109680J;

    /* renamed from: K */
    protected MsgListScrollContainer f109681K;

    /* renamed from: L */
    protected LinearLayout f109682L;

    /* renamed from: M */
    protected TextView f109683M;

    /* renamed from: N */
    protected ImageView f109684N;

    /* renamed from: O */
    protected View f109685O;

    /* renamed from: P */
    protected int f109686P;

    /* renamed from: Q */
    protected int f109687Q;

    /* renamed from: R */
    public View f109688R;

    /* renamed from: S */
    protected boolean f109689S;

    /* renamed from: T */
    public boolean f109690T;

    /* renamed from: U */
    public String f109691U;

    /* renamed from: V */
    private final String f109692V = "AbsMessageTemplateActivity";

    /* renamed from: a */
    public List<C42097j> f109693a = new ArrayList();
    private final int aa = 40;
    private final int ab = UIHelper.getDimens(R.dimen.mail_message_list_bottom_bar_height);
    private LKUIStatus ac;
    private FrameLayout ad;
    private Disposable ae;
    private WeakReference<Activity> af;
    private boolean ag;
    private boolean ah;

    /* renamed from: ai  reason: collision with root package name */
    private boolean f175448ai;
    private final C42960d aj = new C42960d();
    private C43713a ak;
    private final Map<String, Object> al = new HashMap();
    private C43192b.AbstractC43193a am;
    private volatile String an;
    private ObjectAnimator ao;
    private boolean ap;
    private int aq;
    private AbstractC43116b ar;
    private final String as = "domReady";

    /* renamed from: b */
    public C42104p f109694b;

    /* renamed from: c */
    protected ThreadActionManager f109695c;

    /* renamed from: d */
    AbstractC43115a f109696d;

    /* renamed from: e */
    protected C43194a f109697e;

    /* renamed from: f */
    protected C42827a f109698f;

    /* renamed from: g */
    public String f109699g;

    /* renamed from: h */
    protected String f109700h = "";

    /* renamed from: i */
    protected boolean f109701i;

    /* renamed from: j */
    protected boolean f109702j;

    /* renamed from: k */
    protected ArrayList<String> f109703k = new ArrayList<>();

    /* renamed from: l */
    public long f109704l;

    /* renamed from: m */
    public C42844a f109705m;

    /* renamed from: n */
    protected Activity f109706n;

    /* renamed from: o */
    public ViewGroup f109707o;

    /* renamed from: p */
    public boolean f109708p = true;

    /* renamed from: q */
    protected AbstractC42929a f109709q;

    /* renamed from: r */
    protected boolean f109710r;

    /* renamed from: s */
    protected C42913g f109711s;

    /* renamed from: t */
    protected boolean f109712t;

    /* renamed from: u */
    protected AbstractC42954a.AbstractC42955a f109713u;

    /* renamed from: v */
    public C42956b f109714v;

    /* renamed from: w */
    public C42959c f109715w;

    /* renamed from: x */
    protected C42972c f109716x;

    /* renamed from: y */
    protected int f109717y = 0;

    /* renamed from: z */
    protected AbstractC43186e f109718z;

    /* renamed from: com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView$a */
    public interface AbstractC43115a extends C43307b.AbstractC43311a {
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView$b */
    public interface AbstractC43116b {
        /* renamed from: a */
        void mo154031a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo154291B() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo154293D() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo154294E() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo154296G() {
        return true;
    }

    /* renamed from: L */
    public void mo154301L() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154314a(AbsChangeMailAction absChangeMailAction) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154316a(MailDraft mailDraft, String str, String str2) {
    }

    /* renamed from: a */
    public void mo154318a(MailMessage mailMessage, String str, String str2) {
    }

    /* renamed from: a */
    public void mo154319a(C42099l lVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154320a(C42099l lVar, boolean z, boolean z2) {
    }

    /* renamed from: a */
    public void mo154324a(String str, MailMessage mailMessage) {
    }

    /* renamed from: b */
    public void mo154335b(MailMessage mailMessage, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo154337b(C42099l lVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo154340b(String str, JSONObject jSONObject);

    /* renamed from: c */
    public void mo154345c(MailMessage mailMessage, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo154346c(C42099l lVar) {
    }

    /* renamed from: f */
    public void mo154355f(String str) {
    }

    /* access modifiers changed from: package-private */
    public abstract String getCurrentThreadId();

    /* access modifiers changed from: package-private */
    public abstract void getData();

    /* access modifiers changed from: package-private */
    public abstract int getTemplateLayout();

    public int getThreadType() {
        return 1;
    }

    /* renamed from: h */
    public void mo154366h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo154378u() {
    }

    /* renamed from: w */
    public void mo154380w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo154381x() {
    }

    /* renamed from: N */
    public boolean mo154303N() {
        return this.f109702j;
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public String getContainerName() {
        return C42187a.C42190b.f107399b;
    }

    public String getLabelId() {
        return this.f109700h;
    }

    public List<C42097j> getMessageItemList() {
        return this.f109693a;
    }

    public ThreadActionManager getThreadActionManager() {
        return this.f109695c;
    }

    /* renamed from: a */
    public void mo154321a(C42844a aVar, boolean z, AbstractC42924a aVar2, int i) {
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender init bindViewData " + this);
        this.f109687Q = i;
        this.f109680J = aVar2;
        this.f109671A = new C43192b();
        this.f109699g = aVar.mo153785b().mo154050c();
        String f = aVar.mo153785b().mo154055f();
        if (!TextUtils.isEmpty(f)) {
            this.f109703k.add(f);
        }
        this.f109700h = aVar.mo153785b().mo154052d();
        this.f109675E = aVar.mo153785b().mo154057h();
        if (this.f109708p || aVar.mo153786c() == null || this.f109705m == null || !aVar.mo153785b().mo154050c().equals(this.f109705m.mo153785b().mo154050c())) {
            this.f109708p = false;
            Log.m165389i("testWebview", "MessageListTabAdapter testWebviewaa null need reinit :" + aVar.mo153787d());
            this.f109705m = aVar;
            this.f109706n = (Activity) getContext();
            this.af = new WeakReference<>(this.f109706n);
            if (!z) {
                Log.m165389i("AbsMessageTemplateActivity", "testAsynRender init 44444444 " + this);
                mo154350d();
            }
        } else {
            this.f109708p = false;
            Log.m165389i("testWebview", "MessageListTabAdapter testWebviewaa same messageListItem:" + aVar.mo153787d());
            this.f109705m = aVar;
        }
        Log.m165389i("AbsMessageTemplateActivity", "RenderTimeoutManager config:" + ((MailMessageListConfig) SettingManager.getInstance().get(MailMessageListConfig.class)));
        mo154307R();
    }

    /* renamed from: a */
    public void mo154329a(boolean z) {
        C42913g gVar = this.f109711s;
        if (gVar != null) {
            gVar.mo153973b(z);
        }
    }

    /* renamed from: a */
    public void mo154325a(String str, C42099l lVar, int i) {
        if (str == null || lVar == null) {
            Log.m165388i("FirstMessageData onReturnMailHtmlData htmlData null:");
            if (this.aq >= 1 || getThreadType() != 1 || mo154367i()) {
                mo154380w();
                ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
                return;
            }
            this.aq++;
            mo154378u();
            return;
        }
        List<MailDraft> b = lVar.mo151979b();
        if (!CollectionUtils.isEmpty(lVar.mo151973a()) || CollectionUtils.isEmpty(b)) {
            mo154307R();
            Log.m165388i("FirstMessageData onReturnMailHtmlData loadData htmlData:");
            mo154320a(lVar, i == 1, true);
            mo150846a(str);
            mo154346c(lVar);
            return;
        }
        ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a("success", this.f109704l);
        mo154337b(lVar);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a.AbstractC43200a
    /* renamed from: a */
    public void mo153803a(String str, JSONObject jSONObject) {
        char c;
        String str2;
        boolean z;
        String str3;
        boolean z2;
        int lastIndexOf;
        Log.m165379d("AbsMessageTemplateActivity", "handleJsPrompt method:" + str);
        if ("log".equals(str)) {
            Log.m165389i("AbsMessageTemplateActivity", "handleJsPrompt log:" + jSONObject.optString("content"));
        } else if (mo154469i(str) || !C43764g.m173481a(str)) {
            str.hashCode();
            switch (str.hashCode()) {
                case -1946760999:
                    if (str.equals("receiverClick")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1945522772:
                    if (str.equals("imageLoadingOnScreen")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1880932050:
                    if (str.equals("searchResults")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1838149335:
                    if (str.equals("turnOffTranslationClick")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1815249380:
                    if (str.equals("viewTranslationClick")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1312177727:
                    if (str.equals("messageClick")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1194260849:
                    if (str.equals("trustMessage")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1041502318:
                    if (str.equals("viewOriginalClick")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1037400870:
                    if (str.equals("translateClick")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -866788885:
                    if (str.equals("readmore")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -797431629:
                    if (str.equals("clickImage")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -677145915:
                    if (str.equals("forward")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -429650345:
                    if (str.equals("replyAll")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -402165208:
                    if (str.equals("scrollTo")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -330919363:
                    if (str.equals("needContentLocateSearch")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -265965954:
                    if (str.equals("popoverDidClose")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -223600006:
                    if (str.equals("contextMenuClick")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -207778587:
                    if (str.equals("checkUserids")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 12755707:
                    if (str.equals("selectTranslationLanguageClick")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 66764851:
                    if (str.equals("reportMessage")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 108401386:
                    if (str.equals("reply")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 110621003:
                    if (str.equals("track")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 136002662:
                    if (str.equals("exitSearch")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 238195188:
                    if (str.equals("addressClick")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 291280559:
                    if (str.equals("cancelScheduleSendClick")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 371196847:
                    if (str.equals("avatarClick")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 398622220:
                    if (str.equals("checkUrls")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 597546184:
                    if (str.equals("expandMessagesFirstVisible")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 612335630:
                    if (str.equals("sendStatusClick")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 674800310:
                    if (str.equals("closeSafetyBanner")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 978211280:
                    if (str.equals("needContents")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115446657:
                    if (str.equals("domReady")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1302431501:
                    if (str.equals("openAttachment")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 1569900877:
                    if (str.equals("imageStartLoad")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 2054169760:
                    if (str.equals("imageOnLoad")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 2069056625:
                    if (str.equals("showContextMenu")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Float f = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            switch (c) {
                case 0:
                    if (jSONObject != null) {
                        try {
                            if (jSONObject.optBoolean("expand")) {
                                C42187a.m168554m();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            Log.m165384e("AbsMessageTemplateActivity", "handleJsPrompt RECEIVER_CLICK", e);
                            return;
                        }
                    } else {
                        return;
                    }
                case 1:
                    if (this.f109705m.mo153785b().mo154056g()) {
                        String optString = jSONObject.optString("src");
                        if (!TextUtils.isEmpty(optString)) {
                            ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString)).mo152425m();
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    try {
                        final String string = jSONObject.getString("key");
                        final int i = jSONObject.getInt("searchType");
                        final int i2 = !jSONObject.isNull("idx") ? jSONObject.getInt("idx") : -1;
                        final JSONArray jSONArray = jSONObject.getJSONArray("resultInfo");
                        Log.m165389i("AbsMessageTemplateActivity", "testSearchABC SEARCHRESULTS searchKey:" + string + " searchType:" + i);
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.RunnableC431138 */

                            public void run() {
                                AbsMessageTemplateView.this.f109711s.mo153966a(string, i, i2, jSONArray);
                            }
                        });
                        return;
                    } catch (JSONException e2) {
                        Log.m165389i("AbsMessageTemplateActivity", "JSONException e:" + e2.getMessage());
                        return;
                    }
                case 3:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback TURN_OFF_TRANSLATION");
                    C42972c cVar = this.f109716x;
                    if (jSONObject != null) {
                        str4 = jSONObject.optString("messageID");
                    }
                    cVar.mo154112a(str4);
                    return;
                case 4:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback VIEW_TRANSLATION");
                    if (jSONObject != null) {
                        str10 = jSONObject.optString("messageID");
                    }
                    C42097j d = mo154349d(str10);
                    if (d == null || d.mo151964g() == null) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback VIEW_TRANSLATION invalid message");
                        return;
                    } else {
                        mo154339b(this.f109699g, d.mo151964g());
                        return;
                    }
                case 5:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback MESSAGE_CLICK");
                    if (jSONObject == null) {
                        str2 = "";
                    } else {
                        try {
                            str2 = jSONObject.optString("messageid");
                        } catch (Exception e3) {
                            Log.m165384e("AbsMessageTemplateActivity", "MESSAGE_CLICK", e3);
                            return;
                        }
                    }
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback MESSAGE_CLICK: " + str2);
                    if (jSONObject == null) {
                        z = false;
                    } else {
                        z = jSONObject.optBoolean("needContent");
                    }
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback MESSAGE_CLICK: " + str2 + " needContent:" + z);
                    if (z) {
                        mo154462c(mo154349d(str2));
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("threadid", this.f109699g);
                    jSONObject2.put("message", str2);
                    jSONObject2.put("fromlabel", this.f109700h);
                    C41816b.m166115a().mo150114D().mo150182b("mail_message_click", jSONObject2);
                    if (jSONObject != null) {
                        C42187a.m168508b(jSONObject.optBoolean("expand"));
                        return;
                    }
                    return;
                case 6:
                    C42097j d2 = mo154349d(jSONObject.optString("messageID"));
                    if (d2 != null) {
                        this.f109679I.mo153895b(this.f109699g, d2.mo151964g().mo151581b(), this.f109700h, this.f109693a.size(), this.f109697e);
                        return;
                    }
                    return;
                case 7:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback VIEW_ORIGINAL");
                    if (jSONObject != null) {
                        str9 = jSONObject.optString("messageID");
                    }
                    C42097j d3 = mo154349d(str9);
                    if (d3 == null || d3.mo151964g() == null) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback VIEW_ORIGINAL invalid message");
                        return;
                    } else {
                        this.f109716x.mo154116a(str9, d3.mo151964g().mo151606h(), d3.mo151964g().mo151604g(), d3.mo151964g().mo151608i());
                        return;
                    }
                case '\b':
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback TRANSLATE");
                    if (jSONObject != null) {
                        str8 = jSONObject.optString("messageID");
                    }
                    C42097j d4 = mo154349d(str8);
                    if (d4 == null || d4.mo151964g() == null) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback TRANSLATE invalid message");
                        return;
                    }
                    mo154339b(this.f109699g, d4.mo151964g());
                    C42187a.m168514c(this.f109699g, str8);
                    C42330c.m169064b(C42330c.C42333b.f107644H);
                    return;
                case '\t':
                    mo154353e(jSONObject.optString("messageId"));
                    return;
                case '\n':
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback click image");
                    if (jSONObject == null) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback click image, empty data");
                        return;
                    } else if (!m171314d(jSONObject)) {
                        MailImage e4 = m171315e(jSONObject);
                        ArrayList<MailImage> f2 = m171316f(jSONObject);
                        if (f2 == null || f2.size() <= 0) {
                            Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback click image, empty image list");
                            return;
                        }
                        if (e4 == null) {
                            e4 = f2.get(0);
                        }
                        m171311a(e4);
                        DriveFileOperationMask driveFileOperationMask = new DriveFileOperationMask();
                        driveFileOperationMask.mo151104b();
                        C42699a.m170257a(e4, f2, driveFileOperationMask, new AbstractC41849c.AbstractC41850a() {
                            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.C431127 */

                            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
                            public void saveClick() {
                                C42330c.m169074d();
                            }

                            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
                            public void forwardClick(String str) {
                                Log.m165389i("AbsMessageTemplateActivity", "handleJsPrompt CLICK_IMAGE forwardClick");
                                AbsMessageTemplateView.this.mo154357g(str);
                            }
                        });
                        return;
                    } else {
                        return;
                    }
                case 11:
                    boolean optBoolean = jSONObject.optBoolean("isFromFootBtn");
                    C42097j c2 = mo154343c(jSONObject);
                    mo154345c(c2.mo151964g(), c2.mo151959c(), optBoolean ? "message_quick_action_forward" : "message_action_forward");
                    C42187a.m168515c(this.f109699g, c2.mo151964g().mo151581b(), c2.mo151959c());
                    C42330c.m169064b(C42330c.C42333b.f107639C);
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    boolean optBoolean2 = jSONObject.optBoolean("isFromFootBtn");
                    C42097j c3 = mo154343c(jSONObject);
                    mo154335b(c3.mo151964g(), c3.mo151959c(), optBoolean2 ? "message_quick_action_reply_all" : "message_action_reply_all");
                    C42187a.m168505b(this.f109699g, c3.mo151964g().mo151581b(), c3.mo151959c());
                    C42330c.m169064b(C42330c.C42333b.f107638B);
                    return;
                case '\r':
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback SCROLL_TO: " + jSONObject);
                    if (jSONObject != null) {
                        f = Float.valueOf(((float) jSONObject.optDouble("offsetY")) * DeviceUtils.getScreenDensity(getContext()));
                    }
                    if (f != null) {
                        ObjectAnimator objectAnimator = this.ao;
                        if (objectAnimator != null && objectAnimator.isRunning()) {
                            this.ao.end();
                        }
                        C43194a aVar = this.f109697e;
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(aVar, "scrollY", aVar.getScrollY(), Math.round(f.floatValue()));
                        this.ao = ofInt;
                        ofInt.setDuration(300L).start();
                        return;
                    }
                    return;
                case 14:
                    try {
                        String string2 = jSONObject.getString("messageID");
                        int i3 = jSONObject.getInt("idx");
                        Log.m165389i("AbsMessageTemplateActivity", "testSearchABC NEED_CONTENT_LOCATE_SEARCH messageIDTemp:" + string2 + " idx:" + i3);
                        this.f109711s.mo153965a(string2, i3);
                        return;
                    } catch (JSONException e5) {
                        Log.m165389i("AbsMessageTemplateActivity", "JSONException e:" + e5.getMessage());
                        return;
                    }
                case 15:
                    if (C42871i.m170779b()) {
                        mo154305P();
                        return;
                    }
                    return;
                case 16:
                    final C43191a aVar2 = new C43191a();
                    aVar2.mo154588b(jSONObject.optString("threadId"));
                    aVar2.mo154585a(jSONObject.optString("messageId"));
                    aVar2.mo154586a(jSONObject.optBoolean("isTranslated"));
                    if (!jSONObject.isNull("avatar")) {
                        try {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("avatar");
                            aVar2.mo154591c(jSONObject3.optString("initial"));
                            JSONArray optJSONArray = jSONObject3.optJSONArray("rgb");
                            if (optJSONArray != null && optJSONArray.length() == 3) {
                                int[] iArr = new int[3];
                                boolean z3 = false;
                                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                    try {
                                        iArr[i4] = optJSONArray.getInt(i4);
                                    } catch (JSONException unused) {
                                        z3 = true;
                                    }
                                }
                                if (!z3) {
                                    aVar2.mo154587a(iArr);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.RunnableC431116 */

                        public void run() {
                            AbsMessageTemplateView.this.f109671A.mo154594a(AbsMessageTemplateView.this.getContext(), aVar2, AbsMessageTemplateView.this.mo154306Q());
                        }
                    });
                    return;
                case 17:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback CHECK_USER_IDS");
                    mo154300K();
                    return;
                case 18:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback SELECT_TRANSLATION_LANGUAGE");
                    if (jSONObject != null) {
                        str7 = jSONObject.optString("messageID");
                    }
                    C42097j d5 = mo154349d(str7);
                    if (d5 == null || d5.mo151964g() == null) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback SELECT_TRANSLATION_LANGUAGE invalid message");
                        return;
                    } else {
                        mo154317a(d5.mo151964g());
                        return;
                    }
                case 19:
                    C42097j d6 = mo154349d(jSONObject.optString("messageID"));
                    if (d6 != null) {
                        this.f109679I.mo153893a(this.f109699g, d6.mo151964g().mo151581b(), this.f109700h, this.f109693a.size(), this.f109697e);
                        return;
                    }
                    return;
                case 20:
                    boolean optBoolean3 = jSONObject.optBoolean("isFromFootBtn");
                    C42097j c4 = mo154343c(jSONObject);
                    mo154318a(c4.mo151964g(), c4.mo151959c(), optBoolean3 ? "message_quick_action_reply" : "message_action_reply");
                    C42187a.m168485a(this.f109699g, c4.mo151964g().mo151581b(), c4.mo151959c());
                    C42330c.m169064b(C42330c.C42333b.f107672y);
                    return;
                case 21:
                    if (jSONObject != null) {
                        String optString2 = jSONObject.optString("event");
                        if (!"email_mail_recall_result_banner_view".equals(optString2)) {
                            C42187a.m168507b(optString2, jSONObject.optJSONObject("params"));
                            return;
                        }
                        return;
                    }
                    return;
                case 22:
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.RunnableC431149 */

                        public void run() {
                            AbsMessageTemplateView.this.f109711s.mo153973b(false);
                        }
                    });
                    return;
                case 23:
                    mo154327a(jSONObject.optString("tenantId"), jSONObject.optString("userid"), jSONObject.optString("address"), jSONObject.optString("name"), jSONObject.optString("userType"), false);
                    return;
                case 24:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback CANCEL_SCHEDULE_SEND_CLICK");
                    if (jSONObject != null) {
                        str6 = jSONObject.optString("messageID");
                    }
                    if (TextUtils.isEmpty(str6)) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback CANCEL_SCHEDULE_SEND_CLICK invalid message");
                        return;
                    }
                    mo154328a("scheduled_banner", str6, new ArrayList<>());
                    C42330c.m169064b(C42330c.C42333b.f107640D);
                    return;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    mo154327a(jSONObject.optString("tenantId"), jSONObject.optString("userid"), jSONObject.optString("address"), jSONObject.optString("name"), jSONObject.optString("userType"), true);
                    return;
                case 26:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback check urls");
                    mo154341b(jSONObject);
                    return;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback EXPAND_MESSAGES_FIRST_VISIBLE");
                    final List<String> a = this.f109698f.mo153737a(jSONObject);
                    if (CollectionUtils.isEmpty(a)) {
                        Log.m165383e("AbsMessageTemplateActivity", "EXPAND_MESSAGES_FIRST_VISIBLE empty message id list");
                    } else {
                        this.f109716x.mo154118a(this.f109699g, mo154331b(a));
                    }
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass10 */

                        public void run() {
                            List<MailMessage> a = C43853v.m173838a(AbsMessageTemplateView.this.mo154331b(a));
                            if (CollectionUtils.isEmpty(a)) {
                                Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback EXPAND_MESSAGES_FIRST_VISIBLE no recommend");
                                return;
                            }
                            String b = C43853v.m173842b(a);
                            if (TextUtils.isEmpty(b)) {
                                Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback EXPAND_MESSAGES_FIRST_VISIBLE invalid args");
                                return;
                            }
                            AbsMessageTemplateView.this.f109697e.evaluateJavascript("javascript:showTranslateRecommend(`" + b + "`)", null);
                        }
                    });
                    return;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    C42097j c5 = mo154343c(jSONObject);
                    if (c5 == null || c5.mo151964g() == null) {
                        Log.m165383e("AbsMessageTemplateActivity", "onHandleJsCallback SEND_STATUS_CLICK invalid message");
                        return;
                    } else {
                        mo154334b(c5.mo151964g());
                        return;
                    }
                case 29:
                    C42097j d7 = mo154349d(jSONObject.optString("messageID"));
                    if (d7 != null) {
                        this.f109679I.mo153892a(this.f109699g, d7.mo151964g().mo151581b(), this.f109700h);
                        return;
                    }
                    return;
                case 30:
                    int optInt = jSONObject.optInt(ShareHitPoint.f121869d);
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("msgIDs");
                    if (optInt != 0) {
                        if (optInt == 1 && optJSONArray2 != null) {
                            ArrayList<String> arrayList = new ArrayList<>();
                            Log.m165389i("AbsMessageTemplateActivity", "testSearchABC NEEDCONTENTS msgIDJSONArray:" + optJSONArray2.length());
                            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                                try {
                                    arrayList.add(optJSONArray2.getString(i5));
                                } catch (JSONException e6) {
                                    Log.m165389i("AbsMessageTemplateActivity", "JSONException e:" + e6.getMessage());
                                }
                            }
                            C42844a aVar3 = this.f109705m;
                            this.f109711s.mo153967a(this.f109693a, arrayList, (aVar3 == null || aVar3.mo153785b() == null) ? "" : this.f109705m.mo153785b().mo154059j());
                            return;
                        }
                        return;
                    } else if (optJSONArray2 != null) {
                        for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                            try {
                                str3 = optJSONArray2.getString(i6);
                            } catch (JSONException e7) {
                                Log.m165389i("AbsMessageTemplateActivity", "JSONException e:" + e7.getMessage());
                                str3 = null;
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                mo154462c(mo154349d(str3));
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    if (this.f109673C) {
                        C42879j.m170799a().mo153883g(this.f109699g);
                    }
                    mo154299J();
                    return;
                case ' ':
                    if (!mo154330a(jSONObject)) {
                        String optString3 = jSONObject.optString("file_token");
                        Pair<C42097j, MailAttachment> a2 = this.f109698f.mo153732a(this.f109693a, optString3);
                        if (a2 == null) {
                            Log.m165383e("AbsMessageTemplateActivity", "handleJsPrompt OPEN_ATTACHMENT not found");
                            return;
                        }
                        C42097j jVar = (C42097j) a2.first;
                        MailAttachment mailAttachment = (MailAttachment) a2.second;
                        if (jVar == null || mailAttachment == null) {
                            Log.m165383e("AbsMessageTemplateActivity", "handleJsPrompt OPEN_ATTACHMENT invalid clicking info");
                            return;
                        }
                        if (!TextUtils.isEmpty(mailAttachment.mo151229f()) && (lastIndexOf = mailAttachment.mo151229f().lastIndexOf(".")) >= 0) {
                            String substring = mailAttachment.mo151229f().substring(lastIndexOf);
                            if (!TextUtils.isEmpty(substring) && ".eml".equals(substring.toLowerCase())) {
                                mo154347c(mailAttachment.mo151229f(), optString3);
                                C42187a.m168559o();
                                return;
                            }
                        }
                        m171311a(mailAttachment);
                        Log.m165389i("AbsMessageTemplateActivity", "OPEN_ATTACHMENT via drive");
                        if (mailAttachment.mo151236l() == 0 || System.currentTimeMillis() <= mailAttachment.mo151236l()) {
                            String c6 = C26311p.m95283c(mailAttachment.mo151229f());
                            C431105 r4 = new AbstractC41849c.AbstractC41850a() {
                                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.C431105 */

                                @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
                                public void saveClick() {
                                    C42330c.m169074d();
                                }

                                @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41850a
                                public void forwardClick(String str) {
                                    Log.m165389i("AbsMessageTemplateActivity", "handleJsPrompt OPEN_ATTACHMENT forwardClick");
                                    AbsMessageTemplateView.this.mo154357g(str);
                                }
                            };
                            DriveFileOperationMask driveFileOperationMask2 = new DriveFileOperationMask();
                            if (!mailAttachment.mo151239o()) {
                                driveFileOperationMask2.mo151104b();
                            } else if (mailAttachment.mo151236l() == 0) {
                                driveFileOperationMask2.mo151102a(true);
                            }
                            if (C26311p.m95292l(c6)) {
                                Log.m165389i("AbsMessageTemplateActivity", "OPEN_ATTACHMENT multi image");
                                z2 = C42699a.m170257a(this.f109698f.mo153733a(mailAttachment), this.f109698f.mo153735a(jVar), driveFileOperationMask2, r4);
                            } else {
                                Log.m165389i("AbsMessageTemplateActivity", "OPEN_ATTACHMENT single file");
                                z2 = C42699a.m170259a(optString3, mailAttachment.mo151229f(), driveFileOperationMask2, r4);
                            }
                            if (!z2) {
                                Log.m165389i("AbsMessageTemplateActivity", "OPEN_ATTACHMENT via local app");
                                C42699a.m170250a(mailAttachment, (String) null);
                            }
                            C42187a.m168559o();
                            C42330c.m169056a("attachment_preview", mailAttachment.mo151239o());
                            return;
                        }
                        MailToast.m173700a(C43819s.m173686a(R.string.Mail_Attachment_CantViewDesc, "ExpireDate", C43760c.m173467a(mailAttachment.mo151236l(), false)));
                        return;
                    }
                    return;
                case '!':
                    String optString4 = jSONObject.optString("src");
                    if (!TextUtils.isEmpty(optString4)) {
                        boolean g = this.f109705m.mo153785b().mo154056g();
                        long optLong = jSONObject.optLong("timestamp", 0);
                        ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString4)).mo152380b("cache");
                        ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString4)).mo152422a(optLong, optString4.startsWith("cid"), g, this.f109701i ? 1 : 0, this.f109705m.mo153788e());
                        if (optString4.startsWith("http")) {
                            ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString4)).mo152368a();
                            return;
                        }
                        return;
                    }
                    return;
                case '\"':
                    String optString5 = jSONObject.optString("src");
                    if (!TextUtils.isEmpty(optString5)) {
                        ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString5)).mo152421a(jSONObject.optLong("timestamp", 0));
                        ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString5)).mo152424j("success");
                        return;
                    }
                    return;
                case '#':
                    Log.m165389i("AbsMessageTemplateActivity", "onHandleJsCallback CONTEXT_MENU_SHOWN");
                    if (jSONObject != null) {
                        str5 = jSONObject.optString("messageID");
                    }
                    if (C43853v.m173845c()) {
                        C42187a.m168520d(this.f109699g, str5);
                    }
                    if (C42936a.m170980a()) {
                        C42187a.m168526e(this.f109699g, str5);
                        return;
                    }
                    return;
                default:
                    mo154340b(str, jSONObject);
                    return;
            }
        } else {
            Log.m165379d("AbsMessageTemplateActivity", "handleJsPrompt debug click return:");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo154330a(JSONObject jSONObject) {
        String optString = jSONObject.optString("file_url");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        if (optString.startsWith("file:///")) {
            optString = optString.substring(8);
        }
        String substring = optString.substring(optString.lastIndexOf("."));
        if (TextUtils.isEmpty(substring) || !".eml".equals(substring.toLowerCase())) {
            C41816b.m166115a().mo150123a(getContext(), Uri.decode(optString));
            C42187a.m168559o();
            return true;
        }
        C42699a.m170277c(getContext(), optString, false);
        C42187a.m168559o();
        return true;
    }

    /* renamed from: a */
    public void mo154322a(String str, int i) {
        if (C42871i.m170779b() && this.f109694b != null && mo154348c() && this.f109705m.mo153786c() != null) {
            if (C42868g.m170772a(this, this.f109700h, this.f109694b.mo152010a(), this.f109694b.mo152021c(), (this.f109691U == null || !C42871i.m170779b()) ? this.f109705m.mo153786c().mo151993j() : this.f109691U, this.f109705m.mo153786c().mo151989f(), this.f109705m.mo153786c().mo151986d(), getContext(), this.f109683M, false, str, i, this.f109694b.mo152025g())) {
                this.f109697e.scrollTo(0, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154327a(final String str, final String str2, final String str3, final String str4, String str5, boolean z) {
        if (this.f109687Q != 8 || !z) {
            final AddressType fromValue = TextUtils.isEmpty(str5) ? null : AddressType.fromValue(Integer.parseInt(str5));
            if (C41816b.m166115a().mo150154u().mo150160a("contact.contactcards.email")) {
                if (fromValue == AddressType.ENTERPRISE_MAIL_GROUP || fromValue == AddressType.GROUP || fromValue == AddressType.SHARED_MAILBOX || this.f109687Q == 8) {
                    mo154326a(str, str3, str2, str4, fromValue);
                } else {
                    C43785p.m173543a(true, fromValue, str, str2, str3, str4);
                }
            } else if (TextUtils.isEmpty(str2) || this.f109687Q == 8) {
                mo154326a(str, str3, str2, str4, fromValue);
            } else {
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass11 */

                    public void run() {
                        final boolean z;
                        MailAddress a = C41816b.m166115a().mo150115E().mo150184a(str2);
                        MailAddress a2 = C41816b.m166115a().mo150115E().mo150184a(C41816b.m166115a().mo150139f());
                        if (a == null || a2 == null || a.mo151196q() == null || a2.mo151196q() == null || !a.mo151196q().equals(a2.mo151196q())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass11.RunnableC430951 */

                            public void run() {
                                if (z) {
                                    C43785p.m173543a(false, null, str, str2, str3, str4);
                                } else {
                                    AbsMessageTemplateView.this.mo154326a(str, str3, str2, str4, fromValue);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo154326a(final String str, final String str2, final String str3, final String str4, final AddressType addressType) {
        if (!TextUtils.isEmpty(str2)) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass17 */

                public void run() {
                    ArrayList a = C69755i.m267727a();
                    a.add(AbsMessageTemplateView.this.getResources().getString(R.string.Mail_Message_CopyAddress));
                    a.add(AbsMessageTemplateView.this.getResources().getString(R.string.Mail_Message_SendMail));
                    if (AbsMessageTemplateView.this.f109706n != null) {
                        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(AbsMessageTemplateView.this.f109706n).title(str2)).titleColor(R.color.text_placeholder)).titleSize(14)).mo90870a(a)).mo90867a(17)).mo90876c(R.color.text_title)).mo90872b(48)).mo90869a(new UDListDialogController.OnItemClickListener() {
                            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass17.C430981 */

                            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                            public void onItemClick(int i) {
                                if (i == 0) {
                                    ClipboardManager clipboardManager = (ClipboardManager) AbsMessageTemplateView.this.f109706n.getSystemService("clipboard");
                                    if (clipboardManager != null) {
                                        clipboardManager.setText(str2);
                                        MailToast.m173698a((int) R.string.Mail_Message_CopyAddressSuccess, MailToast.Type.UNSPECIFIC);
                                    } else {
                                        Log.m165383e("AbsMessageTemplateActivity", "Copy failed: the ClipboardManager is null");
                                    }
                                    C42187a.m168557n();
                                } else if (i == 1) {
                                    MailAddress.C42062a aVar = new MailAddress.C42062a();
                                    aVar.mo151209a(str4);
                                    aVar.mo151212b(str2);
                                    aVar.mo151213c(str3);
                                    aVar.mo151216f(str);
                                    aVar.mo151207a(addressType);
                                    C42699a.m170220a(AbsMessageTemplateView.this.f109706n, aVar.mo151210a(), "mail_address_right_menu");
                                }
                            }
                        })).addActionButton(R.id.ud_dialog_btn_cancel, AbsMessageTemplateView.this.getResources().getString(R.string.Mail_Alert_Cancel), (DialogInterface.OnClickListener) null)).show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo154323a(String str, com.alibaba.fastjson.JSONObject jSONObject, ValueCallback<String> valueCallback) {
        C43194a aVar = this.f109697e;
        if (aVar == null) {
            C13606d.m55245a("SafeJSExecutor", new IllegalStateException("callJSFunction no webView !"));
        } else {
            C11755a.m48726a(aVar.getWebView(), str, jSONObject, valueCallback);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154315a(MailAddress mailAddress) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", mailAddress.mo151189j());
            jSONObject.putOpt("avatarurl", mailAddress.mo151192m());
            if (!TextUtils.isEmpty(mailAddress.mo151192m())) {
                C42107a.m168074a().mo152032a(mailAddress.mo151182e(), mailAddress);
            }
            mo154313a((ValueCallback<String>) null, "updateUserid", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo154328a(String str, final String str2, List<String> list) {
        C42187a.m168488a(str, false, 0);
        C42176e.m168344a().mo152224a(list, str2, new AbstractC41870b<MailCancelScheduleSendResponse>() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass26 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                MailToast.m173697a((int) R.string.Mail_SendLater_CancelFailure);
                C42209j.m168612a("schedule_send_cancel_fail", "toast");
            }

            /* renamed from: a */
            public void mo150435a(MailCancelScheduleSendResponse mailCancelScheduleSendResponse) {
                MailToast.m173697a((int) R.string.Mail_SendLater_Cancelsucceed);
                if (!TextUtils.isEmpty(str2) && AbsMessageTemplateView.this.f109703k != null && AbsMessageTemplateView.this.f109703k.size() == 1 && AbsMessageTemplateView.this.f109703k.contains(str2)) {
                    AbsMessageTemplateView.this.mo154302M();
                }
                C42330c.m169076e();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154317a(MailMessage mailMessage) {
        Log.m165389i("AbsMessageTemplateActivity", "showTranslatingLanguageSelectionDialog");
        this.f109716x.mo154126b(this.f109699g, mailMessage);
    }

    /* renamed from: W */
    private void mo154438W() {
        this.f109710r = false;
        this.ah = true;
    }

    private void ab() {
        this.f109696d = new AbstractC43115a() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass18 */

            @Override // com.ss.android.lark.mail.impl.service.C43307b.AbstractC43311a
            public void onActionChange(AbsChangeMailAction absChangeMailAction) {
                AbsMessageTemplateView.this.mo154314a(absChangeMailAction);
            }
        };
    }

    private void ac() {
        this.f109713u = new AbstractC42954a.AbstractC42955a() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass28 */

            @Override // com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a.AbstractC42955a
            /* renamed from: a */
            public void mo154070a() {
                AbsMessageTemplateView.this.f109691U = null;
                AbsMessageTemplateView.this.f109683M.setOnClickListener(null);
                AbsMessageTemplateView.this.mo154305P();
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass28.RunnableC431033 */

                    public void run() {
                        AbsMessageTemplateView.this.mo154370l();
                    }
                });
            }

            @Override // com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a.AbstractC42955a
            /* renamed from: a */
            public void mo154071a(String str, ValueCallback<String> valueCallback) {
                AbsMessageTemplateView.this.f109697e.evaluateJavascript(str, valueCallback);
            }

            @Override // com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a.AbstractC42955a
            /* renamed from: a */
            public void mo154072a(String str, String str2) {
                AbsMessageTemplateView.this.mo154313a((ValueCallback<String>) null, str, str2);
            }

            @Override // com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a.AbstractC42955a
            /* renamed from: a */
            public void mo154074a(String str, String... strArr) {
                AbsMessageTemplateView.this.mo154313a((ValueCallback<String>) null, str, strArr);
            }

            @Override // com.ss.android.lark.mail.impl.message.plugin.AbstractC42954a.AbstractC42955a
            /* renamed from: a */
            public void mo154073a(final String str, boolean z, boolean z2) {
                String str2;
                String str3;
                AbsMessageTemplateView.this.f109691U = str;
                if (z2 || !z) {
                    str2 = str;
                } else {
                    AbsMessageTemplateView.this.f109683M.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass28.View$OnClickListenerC431011 */

                        public void onClick(View view) {
                            if (!AbsMessageTemplateView.this.f109716x.mo154123a()) {
                                C42868g.m170773a(AbsMessageTemplateView.this, AbsMessageTemplateView.this.f109700h, AbsMessageTemplateView.this.f109694b.mo152010a(), AbsMessageTemplateView.this.f109694b.mo152021c(), str, AbsMessageTemplateView.this.f109705m.mo153786c().mo151989f(), AbsMessageTemplateView.this.f109705m.mo153786c().mo151986d(), AbsMessageTemplateView.this.getContext(), AbsMessageTemplateView.this.f109683M, false, null, -1, AbsMessageTemplateView.this.f109694b.mo152025g(), null, true);
                                AbsMessageTemplateView.this.mo154304O();
                                return;
                            }
                            AbsMessageTemplateView.this.mo154305P();
                        }
                    });
                    str2 = null;
                }
                if (!z) {
                    AbsMessageTemplateView.this.f109683M.setOnClickListener(null);
                    str3 = null;
                } else {
                    str3 = str2;
                }
                AbsMessageTemplateView absMessageTemplateView = AbsMessageTemplateView.this;
                C42868g.m170773a(absMessageTemplateView, absMessageTemplateView.f109700h, AbsMessageTemplateView.this.f109694b.mo152010a(), AbsMessageTemplateView.this.f109694b.mo152021c(), str, AbsMessageTemplateView.this.f109705m.mo153786c().mo151989f(), AbsMessageTemplateView.this.f109705m.mo153786c().mo151986d(), AbsMessageTemplateView.this.getContext(), AbsMessageTemplateView.this.f109683M, false, null, -1, AbsMessageTemplateView.this.f109694b.mo152025g(), str3, false);
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass28.RunnableC431022 */

                    public void run() {
                        AbsMessageTemplateView.this.mo154370l();
                    }
                });
            }
        };
    }

    private AbstractC43201b ad() {
        return new AbstractC43201b() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass29 */

            @Override // com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b
            /* renamed from: a */
            public boolean mo154406a() {
                if (AbsMessageTemplateView.this.f109687Q == 8) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b
            /* renamed from: a */
            public boolean mo154407a(String str) {
                if (!AbsMessageTemplateView.this.f109714v.mo154076a(str) && !AbsMessageTemplateView.this.f109715w.mo154079a(str)) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: p */
    public int mo150631p() {
        return this.ak.mo155832c();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        this.ak.mo155830a();
    }

    /* renamed from: z */
    public void mo154382z() {
        mo150846a(this.an);
    }

    /* renamed from: T */
    private void mo154435T() {
        C43307b.m172030a().mo154979a(this.f109696d);
    }

    /* renamed from: V */
    private void mo154437V() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.RunnableC431043 */

            public void run() {
                AbsMessageTemplateView.this.f109690T = false;
                AbsMessageTemplateView.this.mo154297H();
            }
        });
    }

    /* renamed from: t */
    private void mo152896t() {
        C43383h.m172311a().mo155145a("message", new C43383h.AbstractC43386b() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass23 */

            @Override // com.ss.android.lark.mail.impl.service.C43383h.AbstractC43386b
            /* renamed from: a */
            public void mo152948a(AbstractC43977b bVar) {
                if (AbsMessageTemplateView.this.f109706n != null && bVar != null && bVar.mo156431b()) {
                    bVar.mo156523a(new UndoBar.C43971a(AbsMessageTemplateView.this.f109706n.getWindow(), AbsMessageTemplateView.this.getContext()));
                }
            }
        });
    }

    /* renamed from: Q */
    public C43192b.AbstractC43193a mo154306Q() {
        C43192b.AbstractC43193a aVar = this.am;
        if (aVar != null) {
            return aVar;
        }
        AnonymousClass30 r0 = new C43192b.AbstractC43193a() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass30 */

            /* renamed from: b */
            private AbstractC43930b f109767b;

            @Override // com.ss.android.lark.mail.impl.message.view.p2211b.C43192b.AbstractC43193a
            /* renamed from: a */
            public C42104p mo154409a() {
                return AbsMessageTemplateView.this.f109694b;
            }

            @Override // com.ss.android.lark.mail.impl.message.view.p2211b.C43192b.AbstractC43193a
            /* renamed from: b */
            public List<C42097j> mo154410b() {
                return AbsMessageTemplateView.this.getMessageItemList();
            }

            @Override // com.ss.android.lark.mail.impl.message.view.p2211b.C43192b.AbstractC43193a
            /* renamed from: d */
            public int mo154412d() {
                return AbsMessageTemplateView.this.getThreadType();
            }

            @Override // com.ss.android.lark.mail.impl.message.view.p2211b.C43192b.AbstractC43193a
            /* renamed from: e */
            public boolean mo154413e() {
                return AbsMessageTemplateView.this.f109702j;
            }

            @Override // com.ss.android.lark.mail.impl.message.view.p2211b.C43192b.AbstractC43193a
            /* renamed from: c */
            public AbstractC43930b mo154411c() {
                AbstractC43930b bVar = this.f109767b;
                if (bVar != null) {
                    return bVar;
                }
                C431051 r0 = new AbstractC43930b() {
                    /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass30.C431051 */

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: a */
                    public void mo154414a(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onReplyClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        Object extra2 = actionItem.getExtra("draft_id");
                        if ((extra instanceof MailMessage) && (extra2 instanceof String)) {
                            MailMessage mailMessage = (MailMessage) extra;
                            String str = (String) extra2;
                            AbsMessageTemplateView.this.mo154318a(mailMessage, str, "message_action_reply");
                            C42187a.m168485a(AbsMessageTemplateView.this.f109699g, mailMessage.mo151581b(), str);
                            C42330c.m169064b(C42330c.C42333b.f107672y);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: b */
                    public void mo154415b(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onReplyAllClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        Object extra2 = actionItem.getExtra("draft_id");
                        if ((extra instanceof MailMessage) && (extra2 instanceof String)) {
                            MailMessage mailMessage = (MailMessage) extra;
                            String str = (String) extra2;
                            AbsMessageTemplateView.this.mo154335b(mailMessage, str, "message_action_reply");
                            C42187a.m168505b(AbsMessageTemplateView.this.f109699g, mailMessage.mo151581b(), str);
                            C42330c.m169064b(C42330c.C42333b.f107638B);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: c */
                    public void mo154416c(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onForwardClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        Object extra2 = actionItem.getExtra("draft_id");
                        if ((extra instanceof MailMessage) && (extra2 instanceof String)) {
                            MailMessage mailMessage = (MailMessage) extra;
                            String str = (String) extra2;
                            AbsMessageTemplateView.this.mo154345c(mailMessage, str, "message_action_reply");
                            C42187a.m168515c(AbsMessageTemplateView.this.f109699g, mailMessage.mo151581b(), str);
                            C42330c.m169064b(C42330c.C42333b.f107639C);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: d */
                    public void mo154417d(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onReEditClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        if (extra instanceof MailMessage) {
                            AbsMessageTemplateView.this.mo154351d(AbsMessageTemplateView.this.f109699g, ((MailMessage) extra).mo151581b());
                            C42330c.m169064b(C42330c.C42333b.f107642F);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: e */
                    public void mo154418e(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onTranslateClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        if (extra instanceof MailMessage) {
                            MailMessage mailMessage = (MailMessage) extra;
                            AbsMessageTemplateView.this.mo154339b(AbsMessageTemplateView.this.f109699g, mailMessage);
                            C42187a.m168514c(AbsMessageTemplateView.this.f109699g, mailMessage.mo151581b());
                            C42330c.m169064b(C42330c.C42333b.f107651d);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: f */
                    public void mo154419f(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        if (extra instanceof MailMessage) {
                            AbsMessageTemplateView.this.mo154328a("message_action", ((MailMessage) extra).mo151581b(), new ArrayList());
                            C42330c.m169064b(C42330c.C42333b.f107640D);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: g */
                    public void mo154420g(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onTurnOffTranslationClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        if (extra instanceof MailMessage) {
                            AbsMessageTemplateView.this.f109716x.mo154112a(((MailMessage) extra).mo151581b());
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: j */
                    public void mo154423j(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onUnsubscribeClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        if (extra instanceof MailMessage) {
                            MailMessage mailMessage = (MailMessage) extra;
                            C42187a.m168531f(AbsMessageTemplateView.this.f109699g, mailMessage.mo151581b());
                            C42936a.m170979a(AbsMessageTemplateView.this.getContext(), mailMessage);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: h */
                    public void mo154421h(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onSendToChatClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        if ((extra instanceof MailMessage) && !C42434b.m169442a(AbsMessageTemplateView.this.getContext())) {
                            ArrayList arrayList = new ArrayList();
                            MailMessage mailMessage = (MailMessage) extra;
                            arrayList.add(mailMessage.mo151581b());
                            C42699a.m170238a(AbsMessageTemplateView.this.getContext(), AbsMessageTemplateView.this.f109694b.mo152010a(), arrayList, mailMessage.mo151604g());
                            C42187a.m168549k(C42187a.C42191c.f107437N);
                            C42330c.m169064b(C42330c.C42333b.f107668u);
                        }
                    }

                    @Override // com.ss.android.lark.mail.impl.view.dialog.action.AbstractC43930b
                    /* renamed from: i */
                    public void mo154422i(View view, ActionDialog actionDialog, ActionDialog.ActionItem actionItem) {
                        Log.m165389i("AbsMessageTemplateActivity", "onRecallClick");
                        actionDialog.dismiss();
                        Object extra = actionItem.getExtra("message");
                        final Object extra2 = actionItem.getExtra("message_item");
                        if ((extra instanceof MailMessage) && (extra2 instanceof C42097j)) {
                            if (System.currentTimeMillis() - ((MailMessage) extra).mo151615o() > 86400000) {
                                MailToast.m173698a((int) R.string.Mail_Recall_FailTimeout, MailToast.Type.FAIL);
                                C42209j.m168612a("recall_mail_fail_timeout", "toast");
                                return;
                            }
                            C43771m.m173502a(AbsMessageTemplateView.this.getContext(), (int) R.string.Mail_Recall_ConfirmRecallAction, (int) R.string.Mail_Recall_ConfirmTitle, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, (int) R.string.Mail_Alert_OK, (int) R.color.primary_pri_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
                                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass30.C431051.DialogInterface$OnClickListenerC431061 */

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    if (!C42434b.m169442a(AbsMessageTemplateView.this.getContext())) {
                                        C42984a.m171086a().mo154137a(AbsMessageTemplateView.this.getContext(), (C42097j) extra2);
                                    }
                                }
                            }).mo89239c();
                            C42330c.m169064b(C42330c.C42333b.f107673z);
                        }
                    }
                };
                this.f109767b = r0;
                return r0;
            }
        };
        this.am = r0;
        return r0;
    }

    /* renamed from: b */
    public void mo154332b() {
        if (this.ah) {
            this.ah = false;
            mo154297H();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo154352e() {
        if (this.f109674D == null) {
            this.f109674D = new IGetDataCallback<C42099l>() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass12 */

                /* renamed from: a */
                public void onSuccess(C42099l lVar) {
                    Log.m165389i("AbsMessageTemplateActivity", "AbsMessageTemplateActivity onSuccess ");
                    AbsMessageTemplateView.this.mo154354f();
                    AbsMessageTemplateView.this.mo154379v();
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass12.RunnableC430961 */

                        public void run() {
                            AbsMessageTemplateView.this.mo154356g();
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("AbsMessageTemplateActivity", "AbsMessageTemplateActivity onError ");
                    AbsMessageTemplateView.this.mo154380w();
                    if (errorResult != null) {
                        ((C42306q) C42344d.m169092a(C42306q.class, AbsMessageTemplateView.this.getContext(), AbsMessageTemplateView.this.f109699g)).mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    }
                    ((C42306q) C42344d.m169092a(C42306q.class, AbsMessageTemplateView.this.getContext(), AbsMessageTemplateView.this.f109699g)).mo152372a("rust_fail", 0);
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo154367i() {
        if (!C42871i.m170783d() || !this.f109675E) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void mo154371m() {
        this.f109718z.mo154569c();
        this.f109688R.setVisibility(0);
    }

    /* renamed from: n */
    public void mo154372n() {
        this.f109718z.mo154570d();
        this.f109688R.setVisibility(4);
    }

    /* renamed from: S */
    private void mo154434S() {
        if (this.f109678H == null) {
            this.f109678H = new C42839c();
        }
        this.f109678H.mo153766a();
        this.f109697e.setWebViewTouchListener(new AbstractC43720d() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass34 */

            @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43720d
            /* renamed from: a */
            public void mo154429a(MotionEvent motionEvent) {
                AbsMessageTemplateView.this.f109678H.mo153768a(motionEvent, AbsMessageTemplateView.this.f109677G);
            }

            @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43720d
            /* renamed from: a */
            public void mo154428a(int i, int i2, int i3, int i4) {
                AbsMessageTemplateView.this.f109678H.mo153767a(i, i2, i3, i4, AbsMessageTemplateView.this.f109677G);
            }
        });
    }

    /* renamed from: K */
    public void mo154300K() {
        Disposable disposable = this.ae;
        if (disposable == null || disposable.isDisposed()) {
            List<MailAddress> fromList = getFromList();
            if (!fromList.isEmpty()) {
                this.ae = mo154308a(fromList);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo154356g() {
        ThreadActionManager.initSync();
        ThreadActionManager threadActionManager = new ThreadActionManager(null);
        this.f109695c = threadActionManager;
        C42104p pVar = this.f109694b;
        pVar.mo152019b(threadActionManager.getSingleThreadActionConfig(pVar, this.f109693a, this.f109700h).getAllActionList());
        C43853v.m173839a();
    }

    /* renamed from: U */
    private void mo154436U() {
        Log.m165388i("testReload onRenderProcessGone mIsForceKilled:" + this.f109690T);
        if (this.f109690T) {
            mo154437V();
        } else if (C43345c.m172076m().mo154996b()) {
            mo154437V();
        } else {
            mo154438W();
        }
        AbstractC43116b bVar = this.ar;
        if (bVar != null) {
            bVar.mo154031a();
        }
    }

    /* renamed from: Y */
    private void mo154440Y() {
        C43194a aVar = new C43194a(getContext());
        this.f109697e = aVar;
        aVar.setWebJsPromptListener(this);
        if (C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            this.f109697e.getWebView().setContentDescription("MailMessageWebView");
        }
        this.f109697e.mo154599a(this, ad());
        mo154441Z();
    }

    /* renamed from: Z */
    private void mo154441Z() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        if (!(getThreadType() == 4 || this.f109687Q == 8)) {
            layoutParams.bottomMargin = this.ab;
        }
        this.f109697e.mo154596a(this.f109681K);
        this.f109697e.getWebView().setOverScrollMode(2);
        this.f109682L.addView(this.f109697e.getWebView(), layoutParams);
    }

    /* renamed from: A */
    public void mo154290A() {
        Log.m165389i("AbsMessageTemplateActivity", "parseMessagesAndLoadHtml");
        this.an = mo154292C();
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152434b(this.f109717y);
            qVar.mo152391h("key_parse_html_finish");
        }
        this.f109672B = true;
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.RunnableC430992 */

            public void run() {
                if (!AbsMessageTemplateView.this.f109672B) {
                    return;
                }
                if (AbsMessageTemplateView.this.f109697e == null) {
                    Log.m165389i("AbsMessageTemplateActivity", "webView null");
                    return;
                }
                Log.m165389i("AbsMessageTemplateActivity", "load html after parse");
                AbsMessageTemplateView.this.f109672B = false;
                AbsMessageTemplateView.this.mo154382z();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public String mo154292C() {
        String str;
        C43081v vVar = new C43081v();
        String str2 = "";
        try {
            this.f109705m.mo153783a(this.f109676F);
            str2 = vVar.mo154263a(getMessageItemList(), mo154296G(), this.f109694b, this.f109700h, this.f109705m, this.f109686P);
            str = mo154470j(str2);
        } catch (Throwable th) {
            Log.m165387e("TemplateParseError", th, true);
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f109717y = str.length() / 1024;
        }
        return str;
    }

    /* renamed from: F */
    public void mo154295F() {
        if (this.f109693a == null) {
            this.f109704l = 0;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f109693a.size(); i2++) {
            String h = this.f109693a.get(i2).mo151964g().mo151606h();
            if (h != null) {
                i += h.length();
            }
        }
        this.f109704l = (long) i;
    }

    /* renamed from: I */
    public void mo154298I() {
        Log.m165389i("AbsMessageTemplateActivity", "onDestroy");
        C43383h.m172311a().mo155144a("message");
        this.ap = true;
        aa();
        Disposable disposable = this.ae;
        if (disposable != null && !disposable.isDisposed()) {
            this.ae.dispose();
        }
        C43307b.m172030a().mo154982b(this.f109696d);
    }

    /* renamed from: O */
    public void mo154304O() {
        this.f109716x.mo154120a(true);
        mo154313a((ValueCallback<String>) null, "togglePopover", "1", this.f109705m.mo153786c().mo151993j());
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: o */
    public void mo150630o() {
        if (this.f109705m != null) {
            Log.m165388i("testReload onForceKillBefore getIsCurrentItem index:" + this.f109705m.mo153787d());
        }
        this.f109690T = true;
        this.ak.mo155831b();
    }

    /* renamed from: s */
    public void mo154374s() {
        this.f109689S = true;
        LKUIStatus lKUIStatus = this.ac;
        if (lKUIStatus != null) {
            lKUIStatus.mo89847d();
        }
        if (this.ad == null) {
            this.ad = (FrameLayout) findViewById(R.id.msglist_loading);
        }
        this.ad.setVisibility(8);
        Log.m165388i("showLoading testWebviewaa mLoadingLayout GONE:" + toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo154379v() {
        if (!this.f109673C) {
            C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
            if (qVar != null) {
                qVar.mo152436b(this.f109701i);
                qVar.mo152391h("key_parse_html_start");
            }
            C43089z.m171291a().mo154273a(new C43089z.AbstractC43092a() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass36 */

                @Override // com.ss.android.lark.mail.impl.message.template.C43089z.AbstractC43092a
                /* renamed from: a */
                public void mo153830a() {
                    Log.m165389i("AbsMessageTemplateActivity", "loadH5Page onComplete");
                    AbsMessageTemplateView.this.mo154290A();
                }

                @Override // com.ss.android.lark.mail.impl.message.template.C43089z.AbstractC43092a
                /* renamed from: b */
                public void mo153831b() {
                    Log.m165389i("AbsMessageTemplateActivity", "loadH5Page onFailed");
                    AbsMessageTemplateView.this.f109706n.runOnUiThread(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass36.RunnableC431081 */

                        public void run() {
                            AbsMessageTemplateView.this.mo154374s();
                        }
                    });
                }
            });
        }
    }

    private void aa() {
        C43194a aVar = this.f109697e;
        if (aVar != null) {
            aVar.mo155850j();
            this.f109697e.mo154606d();
            this.f109697e.mo154604c();
            Context context = this.f109697e.getContext();
            if ((context == null || !(context instanceof MutableContextWrapper)) && !this.f109697e.mo19616a()) {
                this.f109697e.getWebView().destroy();
                return;
            }
            this.f109697e.mo22336b();
            this.f109697e.mo153475f();
            this.f109697e.onPause();
            if (context != null && (context instanceof MutableContextWrapper)) {
                ((MutableContextWrapper) context).setBaseContext(C41816b.m166115a().mo150132b());
            }
        }
    }

    private List<MailAddress> getFromList() {
        MailAddress b;
        MailAddress c;
        ArrayList arrayList = new ArrayList();
        List<C42097j> list = this.f109693a;
        if (list != null && !list.isEmpty()) {
            for (C42097j jVar : this.f109693a) {
                if (!(jVar.mo151964g() == null || (c = jVar.mo151964g().mo151586c()) == null || c.mo151188i())) {
                    arrayList.add(c);
                }
                if (!(jVar.mo151960d() == null || (b = jVar.mo151960d().mo151331b()) == null || b.mo151188i())) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: H */
    public void mo154297H() {
        if (this.f109705m != null) {
            Log.m165389i("testWebview", "testWebview testReload AbsMessageTemplateView reload bindViewData index:" + this.f109705m.mo153787d());
        }
        this.ag = false;
        if (this.f109697e != null) {
            Log.m165389i("testWebview", "testWebview reload reset webview:");
            this.f109697e.mo22336b();
            this.f109697e.getWebView().stopLoading();
            this.f109697e.getWebView().clearCache(true);
            this.f109697e.getWebView().clearHistory();
            this.f109697e.getWebView().destroy();
            this.f109682L.removeView(this.f109697e.getWebView());
            this.f109697e = null;
        }
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender init 55555 " + this);
        mo154350d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo154299J() {
        this.f109710r = true;
        Log.m165389i("AbsMessageTemplateActivity", "onPageFinished");
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender onHandleJsCallback DOM_READY");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass13 */

            public void run() {
                if (C42871i.m170779b()) {
                    if (!(AbsMessageTemplateView.this.f109705m == null || AbsMessageTemplateView.this.f109705m.mo153786c() == null || AbsMessageTemplateView.this.f109686P != 0)) {
                        AbsMessageTemplateView absMessageTemplateView = AbsMessageTemplateView.this;
                        C42868g.m170770a(absMessageTemplateView, absMessageTemplateView.f109700h, AbsMessageTemplateView.this.f109694b.mo152010a(), AbsMessageTemplateView.this.f109694b.mo152021c(), AbsMessageTemplateView.this.f109705m.mo153786c().mo151993j(), AbsMessageTemplateView.this.f109705m.mo153786c().mo151989f(), AbsMessageTemplateView.this.f109705m.mo153786c().mo151986d(), AbsMessageTemplateView.this.getContext(), AbsMessageTemplateView.this.f109683M, false, AbsMessageTemplateView.this.f109694b.mo152025g());
                    }
                    if (AbsMessageTemplateView.this.f109684N == null) {
                        C42871i.f109175g = true;
                    } else {
                        if (AbsMessageTemplateView.this.f109705m == null || AbsMessageTemplateView.this.f109705m.mo153786c() == null || !AbsMessageTemplateView.this.f109705m.mo153786c().mo151991h()) {
                            AbsMessageTemplateView.this.f109684N.setImageResource(R.drawable.ud_icon_flag_outlined);
                            AbsMessageTemplateView.this.f109684N.setColorFilter(AbsMessageTemplateView.this.getContext().getResources().getColor(R.color.lkui_N600));
                        } else {
                            AbsMessageTemplateView.this.f109684N.setImageResource(R.drawable.ud_icon_flag_filled);
                            AbsMessageTemplateView.this.f109684N.setColorFilter(AbsMessageTemplateView.this.getContext().getResources().getColor(R.color.lkui_Y500));
                        }
                        AbsMessageTemplateView.this.f109684N.setOnClickListener(new View.OnClickListener() {
                            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass13.View$OnClickListenerC430971 */

                            public void onClick(View view) {
                                if (!C42871i.m170779b() || !AbsMessageTemplateView.this.f109716x.mo154123a()) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    if (AbsMessageTemplateView.this.f109694b.mo152023e()) {
                                        arrayList2.add("FLAGGED");
                                        AbsMessageTemplateView.this.f109694b.mo152016a(false);
                                        AbsMessageTemplateView.this.f109684N.setImageResource(R.drawable.ud_icon_flag_outlined);
                                        AbsMessageTemplateView.this.f109684N.setColorFilter(AbsMessageTemplateView.this.getContext().getResources().getColor(R.color.lkui_N600));
                                        C42330c.m169071c(C42330c.C42333b.f107660m);
                                    } else {
                                        arrayList.add("FLAGGED");
                                        AbsMessageTemplateView.this.f109694b.mo152016a(true);
                                        AbsMessageTemplateView.this.f109684N.setImageResource(R.drawable.ud_icon_flag_filled);
                                        AbsMessageTemplateView.this.f109684N.setColorFilter(AbsMessageTemplateView.this.getContext().getResources().getColor(R.color.lkui_Y500));
                                        C42187a.m168535g(C42187a.C42191c.f107434K);
                                        C42330c.m169071c(C42330c.C42333b.f107659l);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(AbsMessageTemplateView.this.f109699g);
                                    Log.m165389i("AbsMessageTemplateActivity", "CLICK_FLAG curLabelID:" + AbsMessageTemplateView.this.f109700h);
                                    C43307b.m172030a().mo154977a(new CustomLabelThreadListMailAction(arrayList3, AbsMessageTemplateView.this.f109700h, arrayList, arrayList2));
                                    return;
                                }
                                AbsMessageTemplateView.this.mo154305P();
                            }
                        });
                    }
                }
                if (AbsMessageTemplateView.this.f109709q != null) {
                    AbsMessageTemplateView.this.f109709q.mo153995a(AbsMessageTemplateView.this.f109705m.mo153787d());
                }
                AbsMessageTemplateView.this.mo154374s();
            }
        });
        mo154294E();
        if (this.f109718z == null) {
            mo154354f();
        }
        this.f109697e.getMailWebClient().mo155863e();
        ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a("success", this.f109704l);
        if (C42871i.m170779b()) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass14 */

                public void run() {
                    if ((AbsMessageTemplateView.this.getThreadType() != 1 || AbsMessageTemplateView.this.mo154367i()) && AbsMessageTemplateView.this.getThreadType() != 6) {
                        AbsMessageTemplateView.this.mo154368j();
                        AbsMessageTemplateView.this.f109681K.mo154536a(AbsMessageTemplateView.this.f109686P);
                    }
                    Log.m165389i("AbsMessageTemplateActivity", " updateHeaderTop mMeasureSubjectH:" + AbsMessageTemplateView.this.f109686P);
                    int i = AbsMessageTemplateView.this.f109686P;
                    if (i <= 0) {
                        i = C42871i.m170775a().mo153856f() + UIHelper.dp2px(8.0f);
                    }
                    String str = (((float) i) / C41816b.m166115a().mo150132b().getResources().getDisplayMetrics().density) + "";
                    Log.m165389i("AbsMessageTemplateActivity", " updateHeaderTop paddingTop:" + str);
                    AbsMessageTemplateView.this.mo154313a((ValueCallback<String>) null, "updateHeaderTop", str);
                    AbsMessageTemplateView.this.f109697e.getWebView().setBackgroundColor(AbsMessageTemplateView.this.getContext().getResources().getColor(R.color.lkui_N100));
                    if (AbsMessageTemplateView.this.getThreadType() == 1 && !AbsMessageTemplateView.this.mo154367i()) {
                        C42871i.m170775a().mo153852a(true);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo154302M() {
        if (!C42871i.m170779b() || getThreadType() != 1 || "come_from_notification".equals(this.f109705m.mo153788e()) || "come_from_eml_local".equals(this.f109705m.mo153788e()) || "come_from_eml_other".equals(this.f109705m.mo153788e())) {
            this.f109706n.finish();
        } else if (C43849u.m173830c()) {
            C42871i.m170775a().mo153853a((AbstractC42870h) null, getContext());
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass27 */

                public void run() {
                    C42871i.m170775a().mo153853a((AbstractC42870h) null, AbsMessageTemplateView.this.getContext());
                }
            });
        }
        C42871i.f109174f = false;
    }

    /* renamed from: P */
    public void mo154305P() {
        this.f109716x.mo154120a(false);
        String str = this.f109691U;
        if (str == null) {
            str = this.f109705m.mo153786c().mo151993j();
        }
        C42868g.m170773a(this, this.f109700h, this.f109694b.mo152010a(), this.f109694b.mo152021c(), str, this.f109705m.mo153786c().mo151989f(), this.f109705m.mo153786c().mo151986d(), getContext(), this.f109683M, false, null, -1, this.f109694b.mo152025g(), null, false);
        mo154313a((ValueCallback<String>) null, "togglePopover", "0", this.f109705m.mo153786c().mo151993j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo154354f() {
        if (C43849u.m173830c()) {
            ActionBar actionBar = (ActionBar) findViewById(R.id.mail_messagelist_bottombar);
            this.f109688R = findViewById(R.id.mail_messagelist_bottombar_line);
            if (this.f109718z == null) {
                AbstractC43186e a = C43177b.m171625a(actionBar);
                this.f109718z = a;
                a.mo154566a(this, this.f109705m.mo153785b().mo154054e());
                return;
            }
            return;
        }
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass31 */

            public void run() {
                ActionBar actionBar = (ActionBar) AbsMessageTemplateView.this.findViewById(R.id.mail_messagelist_bottombar);
                AbsMessageTemplateView absMessageTemplateView = AbsMessageTemplateView.this;
                absMessageTemplateView.f109688R = absMessageTemplateView.findViewById(R.id.mail_messagelist_bottombar_line);
                if (AbsMessageTemplateView.this.f109718z == null) {
                    AbsMessageTemplateView.this.f109718z = C43177b.m171625a(actionBar);
                    AbstractC43186e eVar = AbsMessageTemplateView.this.f109718z;
                    AbsMessageTemplateView absMessageTemplateView2 = AbsMessageTemplateView.this;
                    eVar.mo154566a(absMessageTemplateView2, absMessageTemplateView2.f109705m.mo153785b().mo154054e());
                }
            }
        });
    }

    public String getDraftPlainText() {
        List<C42097j> list = this.f109693a;
        if (list == null || list.isEmpty()) {
            return "";
        }
        long j = Long.MIN_VALUE;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.f109693a.size(); i3++) {
            C42097j jVar = this.f109693a.get(i3);
            if (jVar.mo151965h()) {
                List<MailDraft> a = jVar.mo151950a();
                for (int i4 = 0; i4 < a.size(); i4++) {
                    MailDraft mailDraft = a.get(i4);
                    if (mailDraft.mo151357j() > j) {
                        j = mailDraft.mo151357j();
                        i = i3;
                        i2 = i4;
                    }
                }
            }
        }
        if (i == -1) {
            return "";
        }
        return this.f109693a.get(i).mo151950a().get(i2).mo151359l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo154373r() {
        LKUIStatus lKUIStatus = this.ac;
        if ((lKUIStatus == null || !lKUIStatus.mo89851h()) && !this.f109689S) {
            if (this.ad == null) {
                this.ad = (FrameLayout) findViewById(R.id.msglist_loading);
            }
            this.ad.setVisibility(0);
            Log.m165388i("showLoading testWebviewaa mLoadingLayout VISIBLE:" + toString());
            if (this.ac == null) {
                this.ac = new LKUIStatus.C25680a(this.ad).mo89855a(0.4d).mo89859a();
            }
            this.ac.mo89837a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo154307R() {
        if (!C43277a.m171921a().mo154951o()) {
            Log.m165389i("AbsMessageTemplateActivity", "processShareData not primary account, share banned");
            this.f109702j = false;
        } else if (TextUtils.isEmpty(this.f109700h)) {
            Log.m165397w("AbsMessageTemplateActivity", "processShareData no label ID");
            this.f109702j = false;
        } else {
            String str = this.f109700h;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1669082995:
                    if (str.equals("SCHEDULED")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2551625:
                    if (str.equals("SPAM")) {
                        c = 1;
                        break;
                    }
                    break;
                case 78862271:
                    if (str.equals("SHARE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 80083736:
                    if (str.equals("TRASH")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    this.f109702j = false;
                    return;
                default:
                    this.f109702j = true;
                    return;
            }
        }
    }

    /* renamed from: d */
    public void mo154350d() {
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender MessageListTabAdapter updateHeaderTop testWebviewaa init mIsRenderProcessGone:" + this.ah + " mInitDone:" + this.ag + " index:" + this.f109705m.mo153787d() + " mIsInflateDone:" + this.f175448ai);
        if (this.ah) {
            this.ah = false;
            mo154297H();
        } else if (!this.ag) {
            this.ag = true;
            ViewGroup viewGroup = null;
            if (!this.f175448ai) {
                viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(getTemplateLayout(), (ViewGroup) this, true);
                this.f175448ai = true;
            }
            ac();
            this.f109714v = new C42956b(this.f109706n, this.f109713u);
            this.f109716x = new C42972c(this.f109706n, this.f109713u);
            this.f109715w = new C42959c(this.f109706n, this.f109713u);
            this.f109698f = new C42827a();
            mo154312a(viewGroup);
            C43849u.m173827a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.RunnableC430941 */

                public void run() {
                    if (!AbsMessageTemplateView.this.f109689S) {
                        AbsMessageTemplateView.this.mo154373r();
                    }
                }
            }, 800);
            mo154352e();
            if (!this.f109712t) {
                getData();
            }
            mo152901y();
            if (this.f109672B) {
                Log.m165389i("AbsMessageTemplateActivity", "load html after initView");
                this.f109672B = false;
                mo154382z();
            }
            mo152896t();
            if (this.ap) {
                aa();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo154369k() {
        mo154368j();
        Log.m165389i("AbsMessageTemplateActivity", "updateHeaderTopByChange subjectContainer updateLabels countSubjectHeight mMeasureSubjectH:" + this.f109686P);
        int i = this.f109686P;
        if (i <= 0) {
            i = C42871i.m170775a().mo153856f() + UIHelper.dp2px(8.0f);
        }
        Log.m165389i("AbsMessageTemplateActivity", "updateHeaderTopByChange subjectContainer updateLabels countSubjectHeight subjectH:" + i);
        this.f109681K.mo154536a(this.f109686P);
        String str = (((float) i) / C41816b.m166115a().mo150132b().getResources().getDisplayMetrics().density) + "";
        Log.m165389i("AbsMessageTemplateActivity", " updateHeaderTopByChange updateLabels paddingTop:" + str);
        mo154313a((ValueCallback<String>) null, "updateHeaderTop", str);
    }

    /* renamed from: X */
    private void mo154439X() {
        if (this.f109697e != null) {
            return;
        }
        if (!C42879j.m170799a().mo153874b()) {
            mo154440Y();
            return;
        }
        C43194a a = C42879j.m170799a().mo153863a(getContext());
        if (a == null || !C42879j.m170799a().mo153882f()) {
            Log.m165389i("AbsMessageTemplateActivity", "testAsynRender mailMessageWebView == null:");
            mo154440Y();
            return;
        }
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender mailMessageWebView != null:" + a + " h:" + a.getHeight());
        this.f109697e = a;
        a.onResume();
        if (this.f109697e.getParent() != null) {
            Log.m165389i("AbsMessageTemplateActivity", "testAsynRender mWebView.getParent() != null:");
            ((LinearLayout) this.f109697e.getParent()).removeView(this.f109697e.getWebView());
        }
        if (C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            this.f109697e.getWebView().setContentDescription("MailMessageWebView");
        }
        C42099l c = C42879j.m170799a().mo153875c(this.f109699g);
        this.f109697e.mo154599a(this, ad());
        if (c != null) {
            this.f109697e.mo154601a(c.mo151973a(), this.f109699g);
        }
        this.an = C42879j.m170799a().mo153872b(this.f109699g);
        if (this.an == null || c == null) {
            Log.m165389i("AbsMessageTemplateActivity", "testAsynRender onReturnMailHtmlData htmlData null:");
            mo154380w();
            ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
        } else {
            List<MailDraft> b = c.mo151979b();
            if (!CollectionUtils.isEmpty(c.mo151973a()) || CollectionUtils.isEmpty(b)) {
                Log.m165389i("AbsMessageTemplateActivity", "testAsynRender onReturnMailHtmlData loadData htmlData:");
                mo154320a(c, C42879j.m170799a().mo153886i(this.f109699g), true);
                mo154435T();
                mo154381x();
                mo154307R();
                mo154346c(c);
            } else {
                mo154337b(c);
                return;
            }
        }
        mo154441Z();
        if (C42879j.m170799a().mo153884g()) {
            this.f109697e.setWebJsPromptListener(this);
            mo154299J();
            mo154341b(C42879j.m170799a().mo153880e());
            C42879j.m170799a().mo153868a(this.f109699g);
            mo154300K();
            return;
        }
        C42879j.m170799a().mo153866a(new AbstractC42849a.AbstractC42850a() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.C431094 */

            @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a.AbstractC42850a
            /* renamed from: a */
            public void mo153808a() {
                AbsMessageTemplateView.this.f109697e.setWebJsPromptListener(AbsMessageTemplateView.this);
                AbsMessageTemplateView.this.mo154299J();
                AbsMessageTemplateView.this.mo154341b(C42879j.m170799a().mo153880e());
                C42879j.m170799a().mo153868a(AbsMessageTemplateView.this.f109699g);
                AbsMessageTemplateView.this.mo154300K();
            }
        });
    }

    /* renamed from: y */
    private void mo152901y() {
        long currentTimeMillis = System.currentTimeMillis();
        C42904f fVar = new C42904f(this);
        C42913g gVar = new C42913g(fVar, this);
        this.f109711s = gVar;
        fVar.mo153944a(gVar);
        this.f109682L = (LinearLayout) findViewById(R.id.mail_web_container);
        if (C42871i.m170779b()) {
            this.f109681K = (MsgListScrollContainer) findViewById(R.id.mail_msglist_scrollcontainer);
            this.f109683M = (TextView) findViewById(R.id.message_list_mail_title_bar_text);
            ImageView imageView = (ImageView) findViewById(R.id.message_list_mail_title_bar_flag);
            this.f109684N = imageView;
            if (imageView == null) {
                C42871i.f109175g = true;
            } else if (getThreadType() == 5 || getThreadType() == 3 || getThreadType() == 4 || "EML".equals(this.f109700h) || "TRASH".equals(this.f109700h) || "SPAM".equals(this.f109700h) || "SHARE".equals(this.f109700h)) {
                this.f109684N.setVisibility(4);
            }
            View findViewById = findViewById(R.id.mail_message_list_mailtitle_subject);
            this.f109685O = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass32 */

                    public void onClick(View view) {
                        if (C42871i.m170779b() && AbsMessageTemplateView.this.f109716x != null && AbsMessageTemplateView.this.f109716x.mo154123a()) {
                            AbsMessageTemplateView.this.mo154305P();
                        }
                    }
                });
            } else {
                C42871i.f109175g = true;
            }
            SubjectContainer subjectContainer = (SubjectContainer) findViewById(R.id.mail_msglist_subjectcontainer);
            if (subjectContainer != null) {
                if (getThreadType() != 1 || mo154367i()) {
                    subjectContainer.setPadding(0, UIHelper.getDimens(R.dimen.mail_operation_title_bar_height), 0, 0);
                } else {
                    subjectContainer.setPadding(0, UIHelper.getDimens(R.dimen.mail_operation_title_bar_height) + StatusBarUtil.getStatusBarHeight(getContext()), 0, 0);
                    this.f109682L.setPadding(0, StatusBarUtil.getStatusBarHeight(getContext()), 0, 0);
                }
            }
        }
        mo154439X();
        mo154434S();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f109697e.getWebView(), true);
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152429a(System.currentTimeMillis() - currentTimeMillis);
        }
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender initView mIsFirstLoad:" + this.f109712t);
        if (this.f109712t) {
            this.f109712t = false;
            C42879j.m170799a().mo153867a(new C42851b.AbstractC42857a() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass33 */

                @Override // com.ss.android.lark.mail.impl.message.p2204d.C42851b.AbstractC42857a
                /* renamed from: a */
                public void mo153834a(final String str, final C42099l lVar, final int i) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender onReturnMailHtmlData 11:");
                        AbsMessageTemplateView.this.mo154325a(str, lVar, i);
                        return;
                    }
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass33.RunnableC431071 */

                        public void run() {
                            Log.m165389i("AbsMessageTemplateActivity", "testAsynRender onReturnMailHtmlData 22:");
                            AbsMessageTemplateView.this.mo154325a(str, lVar, i);
                        }
                    });
                }
            }, this.f109699g);
        }
    }

    /* renamed from: c */
    public boolean mo154348c() {
        return this.f109710r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo154368j() {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.mo154368j():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo154370l() {
        this.f109683M.measure(View.MeasureSpec.makeMeasureSpec((DeviceUtils.getScreenWidth(getContext()) - getContext().getResources().getDimensionPixelSize(R.dimen.mail_msglist_title_left_padding)) - getContext().getResources().getDimensionPixelSize(R.dimen.mail_msglist_title_right_padding), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.mail_msglist_title_top_padding) + getContext().getResources().getDimensionPixelSize(R.dimen.mail_msglist_title_bottom_padding);
        Log.m165389i("AbsMessageTemplateActivity", ((Object) this.f109683M.getText()) + " onlyUpdateHeaderTop countSubjectHeight mTitleView:" + this.f109683M.getMeasuredHeight() + " mSubjectLayout:" + (this.f109683M.getMeasuredHeight() + dimensionPixelSize));
        this.f109686P = this.f109683M.getMeasuredHeight() + dimensionPixelSize + UIHelper.getDimens(R.dimen.mail_operation_title_bar_height);
        Log.m165389i("AbsMessageTemplateActivity", ((Object) this.f109683M.getText()) + " onlyUpdateHeaderTop countSubjectHeight mMeasureSubjectH:" + this.f109686P + " size:" + this.f109683M.getTextSize());
        StringBuilder sb = new StringBuilder();
        sb.append("onlyUpdateHeaderTop subjectContainer updateLabels countSubjectHeight mMeasureSubjectH:");
        sb.append(this.f109686P);
        Log.m165389i("AbsMessageTemplateActivity", sb.toString());
        int i = this.f109686P;
        if (i <= 0) {
            i = C42871i.m170775a().mo153856f() + UIHelper.dp2px(8.0f);
        }
        Log.m165389i("AbsMessageTemplateActivity", "onlyUpdateHeaderTop subjectContainer updateLabels countSubjectHeight subjectH:" + i);
        this.f109681K.mo154536a(this.f109686P);
        String str = (((float) i) / C41816b.m166115a().mo150132b().getResources().getDisplayMetrics().density) + "";
        Log.m165389i("AbsMessageTemplateActivity", " onlyUpdateHeaderTop updateLabels paddingTop:" + str);
        mo154313a((ValueCallback<String>) null, "updateHeaderTop", str);
    }

    /* renamed from: a */
    public void mo154310a() {
        this.f109708p = true;
        this.ag = false;
        this.f109672B = false;
        this.an = "";
        this.f109689S = false;
        this.f109674D = null;
        if (this.f109697e != null) {
            Log.m165389i("testWebview", "testWebviewaa unbindViewData reset webview:");
            this.f109697e.mo154606d();
            this.f109697e.mo154604c();
            this.f109697e.getWebView().stopLoading();
            this.f109697e.getWebView().clearCache(true);
            this.f109697e.getWebView().clearHistory();
            this.f109697e.mo22336b();
        }
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: a */
    public void mo150561a(WebView webView) {
        mo154436U();
    }

    public void setFirstLoad(boolean z) {
        this.f109712t = z;
    }

    public void setITabPageLoadCallback(AbstractC42929a aVar) {
        this.f109709q = aVar;
    }

    public void setRenderProcessCallback(AbstractC43116b bVar) {
        this.ar = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public MailImage mo154342c(String str) {
        return this.f109697e.mo22331a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C42097j mo154343c(JSONObject jSONObject) {
        return mo154349d(jSONObject.optString("messageId"));
    }

    /* renamed from: a */
    private void m171310a(Context context) {
        this.f109679I = new C42886a();
        this.ak = new C43713a(context);
        ab();
    }

    /* renamed from: e */
    private MailImage m171315e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("currentImage");
        if (optJSONObject == null) {
            return null;
        }
        String optString = optJSONObject.optString("src");
        if (!TextUtils.isEmpty(optString)) {
            return mo154342c(optString);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo154336b(C42097j jVar) {
        this.f109697e.mo154598a(jVar);
    }

    /* renamed from: a */
    private void m171311a(Object obj) {
        String str;
        if (obj instanceof MailAttachment) {
            str = ((MailAttachment) obj).mo151234j();
        } else if (obj instanceof MailImage) {
            str = ((MailImage) obj).mo151480f();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("AbsMessageTemplateActivity", "recordPreviewFile invalid token");
        } else {
            this.al.put(str, obj);
        }
    }

    /* renamed from: d */
    private boolean m171314d(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("currentImage");
            if (optJSONObject == null) {
                return false;
            }
            String optString = optJSONObject.optString("localPath");
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            if (optString.startsWith("file:///")) {
                optString = optString.substring(8);
            }
            C41816b.m166115a().mo150123a(getContext(), Uri.decode(optString));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private ArrayList<MailImage> m171316f(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList<MailImage> arrayList = new ArrayList<>();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                MailImage c = mo154342c(optJSONArray.getJSONObject(i).optString("src"));
                if (c != null) {
                    arrayList.add(c);
                }
            } catch (Exception e) {
                Log.m165384e("AbsMessageTemplateActivity", "getViewingImageList", e);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private void mo154468h(String str) {
        mo154293D();
        C42306q qVar = (C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g);
        if (qVar != null) {
            qVar.mo152391h("key_render_page_start");
        }
        String b = C43089z.m171291a().mo154274b();
        Log.m165389i("AbsMessageTemplateActivity", "testAsynRender loadData loadDataWithBaseURL ");
        this.f109697e.loadDataWithBaseURL(b, str, "text/html; charset=UTF-8", null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo154353e(String str) {
        C42699a.m170231a(getContext(), new MessageListIntenInfo(this.f109700h, this.f109699g, str, 1, this.f109705m.mo153785b().mo154059j()), 6);
    }

    public AbsMessageTemplateView(Context context) {
        super(context);
        m171310a(context);
    }

    /* renamed from: a */
    private void mo150846a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165388i("FirstMessageData doLoadHtml htmlData empty:");
            mo154380w();
            ((C42306q) C42344d.m169092a(C42306q.class, getContext(), this.f109699g)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, 0);
            return;
        }
        this.f109697e.mo154601a(getMessageItemList(), this.f109699g);
        this.f109697e.mo155849c(this.f109717y, mo154291B());
        mo154468h(str);
        mo154435T();
        mo154381x();
    }

    /* renamed from: c */
    private void mo154462c(C42097j jVar) {
        Log.m165389i("AbsMessageTemplateActivity", "addItemContent");
        if (jVar.mo151964g() == null) {
            Log.m165389i("AbsMessageTemplateActivity", "addItemContent mailMessageItem  null return");
            return;
        }
        String a = mo154309a(jVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(jVar.mo151964g().mo151581b(), a);
        } catch (JSONException e) {
            Log.m165389i("AbsMessageTemplateActivity", "JSONException e:" + e.getMessage());
        }
        mo154344c((ValueCallback<String>) null, "addItemContent", jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<MailMessage> mo154331b(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("AbsMessageTemplateActivity", "findMessageListByID empty input");
            return null;
        } else if (CollectionUtils.isEmpty(this.f109693a)) {
            Log.m165383e("AbsMessageTemplateActivity", "findMessageListByID empty message list");
            return null;
        } else {
            HashMap hashMap = new HashMap();
            for (C42097j jVar : this.f109693a) {
                if (!(jVar == null || jVar.mo151964g() == null || TextUtils.isEmpty(jVar.mo151964g().mo151581b()))) {
                    hashMap.put(jVar.mo151964g().mo151581b(), jVar.mo151964g());
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                MailMessage mailMessage = (MailMessage) hashMap.get(str);
                if (mailMessage != null) {
                    arrayList.add(mailMessage);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C42097j mo154349d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("AbsMessageTemplateActivity", "findMessageItemNtByMessage invalid message id");
            return null;
        } else if (CollectionUtils.isEmpty(this.f109693a)) {
            Log.m165383e("AbsMessageTemplateActivity", "findMessageItemNtByMessage empty message list");
            return null;
        } else {
            for (C42097j jVar : this.f109693a) {
                if (str.equals(jVar.mo151964g().mo151581b())) {
                    return jVar;
                }
            }
            return null;
        }
    }

    /* renamed from: j */
    private String mo154470j(String str) {
        String str2;
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mobile.process.over.stretch")) {
            return str;
        }
        Log.m165389i("AbsMessageTemplateActivity", "processOverStretch");
        Matcher matcher = f109670W.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.groupCount() != 2) {
                Log.m165397w("AbsMessageTemplateActivity", "processOverStretch error group count");
            } else {
                String group = matcher.group();
                if (TextUtils.isEmpty(group)) {
                    Log.m165397w("AbsMessageTemplateActivity", "processOverStretch invalid original string");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(group.substring(0, matcher.start(1) - matcher.start()));
                    if ("pre".equals(matcher.group(1))) {
                        str2 = "pre-wrap";
                    } else {
                        str2 = "normal";
                    }
                    sb.append(str2);
                    sb.append(matcher.group(2));
                    matcher.appendReplacement(stringBuffer, sb.toString());
                }
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public Disposable mo154308a(List<MailAddress> list) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Observable.fromIterable(list).groupBy(new Function<MailAddress, Integer>() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass24 */

            /* renamed from: a */
            public Integer apply(MailAddress mailAddress) throws Exception {
                return Integer.valueOf(atomicInteger.getAndIncrement() % 5);
            }
        }).flatMap(new Function<AbstractC68272b<Integer, MailAddress>, ObservableSource<MailAddress>>() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass22 */

            /* renamed from: a */
            public ObservableSource<MailAddress> apply(AbstractC68272b<Integer, MailAddress> bVar) throws Exception {
                return bVar.observeOn(C68279a.m265023b()).map(new Function<MailAddress, MailAddress>() {
                    /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass22.C431001 */

                    /* renamed from: a */
                    public MailAddress apply(MailAddress mailAddress) throws Exception {
                        return mailAddress.mo151199t().mo151215e(C41816b.m166115a().mo150115E().mo150185a(mailAddress.mo151189j(), 40)).mo151210a();
                    }
                }).timeout(30000, TimeUnit.MILLISECONDS);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass19 */

            /* renamed from: a */
            public void accept(MailAddress mailAddress) throws Exception {
                AbsMessageTemplateView.this.mo154315a(mailAddress);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass20 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
            }
        }, new AbstractC68309a() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass21 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo154334b(MailMessage mailMessage) {
        if (mailMessage.mo151561N() == null || mailMessage.mo151561N() == SendState.UNKNOWN_SEND_STATE) {
            MailToast.m173697a((int) R.string.Mail_Send_NoDetailsFound);
        } else if (System.currentTimeMillis() - mailMessage.mo151615o() >= 2592000000L) {
            MailToast.m173697a((int) R.string.Mail_Send_OverDaysCantViewDetails);
        } else {
            C42699a.m170296o(getContext(), mailMessage.mo151581b());
            C42330c.m169047a(mailMessage.mo151561N());
        }
    }

    /* renamed from: g */
    public void mo154357g(String str) {
        long j;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("AbsMessageTemplateActivity", "shareDriveFile empty token");
            return;
        }
        WeakReference<Activity> weakReference = this.af;
        if (weakReference == null) {
            Log.m165383e("AbsMessageTemplateActivity", "shareDriveFile null activity ref");
            return;
        }
        Activity activity = weakReference.get();
        if (activity == null) {
            Log.m165383e("AbsMessageTemplateActivity", "shareDriveFile null activity");
            return;
        }
        Object obj = this.al.get(str);
        if (obj == null) {
            Log.m165397w("AbsMessageTemplateActivity", "shareDriveFile trigger traverseToFindDriveFile");
            obj = this.f109698f.mo153740b(this.f109693a, str);
        }
        if (obj == null) {
            Log.m165383e("AbsMessageTemplateActivity", "shareDriveFile missing drive file");
            return;
        }
        Bundle bundle = new Bundle();
        if (obj instanceof MailAttachment) {
            MailAttachment mailAttachment = (MailAttachment) obj;
            str2 = mailAttachment.mo151229f();
            j = mailAttachment.mo151231h();
            bundle.putParcelable("bundle_key_share_drive_file", mailAttachment);
        } else if (obj instanceof MailImage) {
            MailImage mailImage = (MailImage) obj;
            str2 = mailImage.mo151477e();
            j = mailImage.mo151482h();
            bundle.putParcelable("bundle_key_share_drive_file", mailImage);
        } else {
            Log.m165383e("AbsMessageTemplateActivity", "shareDriveFile unsupported file");
            return;
        }
        if (j > 26214400) {
            Log.m165389i("AbsMessageTemplateActivity", "onActivityResult share drive file over size");
            C42699a.m170212a(activity);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        C42699a.m170214a(activity, bundle, str2, C41816b.m166115a().mo150111A().mo150173a(C26311p.m95283c(str2), str2));
        C42187a.m168470a(j);
    }

    /* renamed from: i */
    private boolean mo154469i(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1965476588:
                if (str.equals("clickFlag")) {
                    c = 0;
                    break;
                }
                break;
            case -1945522772:
                if (str.equals("imageLoadingOnScreen")) {
                    c = 1;
                    break;
                }
                break;
            case -1880932050:
                if (str.equals("searchResults")) {
                    c = 2;
                    break;
                }
                break;
            case -1312177727:
                if (str.equals("messageClick")) {
                    c = 3;
                    break;
                }
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    c = 4;
                    break;
                }
                break;
            case -330919363:
                if (str.equals("needContentLocateSearch")) {
                    c = 5;
                    break;
                }
                break;
            case -207778587:
                if (str.equals("checkUserids")) {
                    c = 6;
                    break;
                }
                break;
            case 110621003:
                if (str.equals("track")) {
                    c = 7;
                    break;
                }
                break;
            case 398622220:
                if (str.equals("checkUrls")) {
                    c = '\b';
                    break;
                }
                break;
            case 597546184:
                if (str.equals("expandMessagesFirstVisible")) {
                    c = '\t';
                    break;
                }
                break;
            case 978211280:
                if (str.equals("needContents")) {
                    c = '\n';
                    break;
                }
                break;
            case 1115446657:
                if (str.equals("domReady")) {
                    c = 11;
                    break;
                }
                break;
            case 1569900877:
                if (str.equals("imageStartLoad")) {
                    c = '\f';
                    break;
                }
                break;
            case 2054169760:
                if (str.equals("imageOnLoad")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case '\r':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public String mo154309a(C42097j jVar) {
        String replace = mo154470j(new C43086x(this.f109700h).mo154270a(jVar.mo151964g())).replace("<table", "<div class='mTableArea'><table").replace("/table>", "/table></div>");
        return replace.replaceAll("(<img.*?src=\")cid:(.*?)\"", "$1file:///android_asset/mail_template/images/blank.png?cid=$2_msgId" + jVar.mo151964g().mo151581b() + "\"");
    }

    /* renamed from: b */
    public void mo154338b(final String str) {
        Log.m165389i("AbsMessageTemplateActivity", "onDocLinkDataProcessDone");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("AbsMessageTemplateActivity", "CHECK_URLS onDocLinkDataProcessDone empty data");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass16 */

                public void run() {
                    if (!AbsMessageTemplateView.this.f109706n.isFinishing() && !AbsMessageTemplateView.this.f109706n.isDestroyed()) {
                        AbsMessageTemplateView.this.mo154313a((ValueCallback<String>) null, "updateDocsItem", str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154312a(ViewGroup viewGroup) {
        if (C42871i.m170779b() && viewGroup != null) {
            this.f109683M = (TextView) viewGroup.findViewById(R.id.message_list_mail_title_bar_text);
            mo154368j();
        }
    }

    /* renamed from: b */
    public void mo154341b(JSONObject jSONObject) {
        Log.m165389i("AbsMessageTemplateActivity", "reqDocLink");
        this.f109698f.mo153739a(jSONObject, new C42827a.AbstractC42829a() {
            /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass15 */

            @Override // com.ss.android.lark.mail.impl.message.C42827a.AbstractC42829a
            /* renamed from: a */
            public void mo153743a(String str) {
                AbsMessageTemplateView.this.mo154338b(str);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo154351d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C42176e.m168344a().mo152248d(str, str2, new AbstractC41870b<MailDraft>() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass25 */

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                /* renamed from: a */
                public void mo150434a(ErrorResult errorResult) {
                    Log.m165390i("AbsMessageTemplateActivity", "onMainError: ", errorResult);
                }

                /* renamed from: a */
                public void mo150435a(MailDraft mailDraft) {
                    if (mailDraft != null) {
                        AbsMessageTemplateView.this.mo154316a(mailDraft, "message_item", "edit_again");
                    }
                }
            });
        }
    }

    public AbsMessageTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m171310a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo154347c(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo("EML", str + "_eml", "", 3, str);
        messageListIntenInfo.mo154048a(false);
        arrayList.add(messageListIntenInfo);
        C42699a.m170278c(getContext(), arrayList, str2);
    }

    /* renamed from: b */
    public void mo154339b(String str, MailMessage mailMessage) {
        this.f109716x.mo154113a(str, mailMessage);
    }

    /* renamed from: a */
    public void mo154313a(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109697e.mo154597a(valueCallback, str, strArr);
    }

    /* renamed from: b */
    public void mo154333b(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109697e.mo154603b(valueCallback, str, strArr);
    }

    /* renamed from: c */
    public void mo154344c(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109697e.mo154605c(valueCallback, str, strArr);
    }

    /* renamed from: a */
    public void mo154311a(int i, int i2, Intent intent) {
        Log.m165389i("AbsMessageTemplateActivity", "onActivityResult");
        if (i != 2890) {
            Log.m165397w("AbsMessageTemplateActivity", "onActivityResult switch to default");
        } else if (intent == null || intent.getExtras() == null) {
            Log.m165383e("AbsMessageTemplateActivity", "onActivityResult REQUEST_CODE_SEND_TO_CHAT_TARGET_PICKER invalid data");
        } else {
            Bundle extras = intent.getExtras();
            this.aj.mo154080a(extras.getStringArrayList("forwardToChatChatIDList"), extras.getString("thread_id"), extras.getStringArrayList("intent_key_message_id_list"), extras.getString(C41816b.m166115a().mo150150q()), new C42960d.AbstractC42962a() {
                /* class com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AnonymousClass35 */

                @Override // com.ss.android.lark.mail.impl.message.plugin.C42960d.AbstractC42962a
                /* renamed from: a */
                public void mo153858a(boolean z) {
                    Log.m165389i("AbsMessageTemplateActivity", "onSendToChatFinished:" + z);
                    if (z) {
                        MailToast.m173697a((int) R.string.Mail_Share_SharedSuccessfully);
                    } else {
                        MailToast.m173697a((int) R.string.Mail_Share_FailedToShare);
                    }
                }
            });
        }
    }
}
