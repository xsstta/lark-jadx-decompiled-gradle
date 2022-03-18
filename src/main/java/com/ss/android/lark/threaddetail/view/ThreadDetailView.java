package com.ss.android.lark.threaddetail.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.anonymous.plugin.C28702a;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c;
import com.ss.android.lark.chat.base.view.recycleview.C32944d;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33223m;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33224n;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.C33292b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33111af;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.chat.utils.C34331aa;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.utils.EditImageUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.keyboard.FaceKBPluginDependency;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.firsttip.ChatTipController;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.chatwindow.view.tip.C35324c;
import com.ss.android.lark.chatwindow.view.tip.NewMessageTip;
import com.ss.android.lark.chatwindow.view.tip.p1728a.C35315b;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35320b;
import com.ss.android.lark.chatwindow.view.tip.p1729b.C35323e;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.AbstractC36507u;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputExpandPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoAaKBPluginCompat;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialog;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback;
import com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener;
import com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.keyboard.widget.AutoAdjustSizeLayoutManager;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.announce_opendoc.AnnounceOpenDocHitPoint;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.statistics.doc.DocHitPoint;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.multiselect.MultiSelectHitPoint;
import com.ss.android.lark.statistics.multiselect.MultiSelectHitPointNew;
import com.ss.android.lark.statistics.p2704r.C54984a;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.AbstractC55766a;
import com.ss.android.lark.threaddetail.view.AbstractC55909e;
import com.ss.android.lark.threaddetail.view.C55906d;
import com.ss.android.lark.threaddetail.view.ThreadDetailView;
import com.ss.android.lark.threaddetail.view.callback.IThreadDetailCallbackHub;
import com.ss.android.lark.threaddetail.view.message.C55916a;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58984d;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreadDetailView implements AbstractC55766a.AbstractC55769b, IThreadDetailCallbackHub {

    /* renamed from: A */
    private final AbstractC36450aa f137855A = C29990c.m110930b().mo134515N();

    /* renamed from: B */
    private final AbstractC36503q f137856B;

    /* renamed from: C */
    private final IForwardDependency f137857C;

    /* renamed from: D */
    private final IStickerDependency f137858D;

    /* renamed from: E */
    private ChatWindowPtrLoadingHeader f137859E;

    /* renamed from: F */
    private final C25969c f137860F;

    /* renamed from: G */
    private final AbstractC35310a.AbstractC35312b f137861G = new C35315b();

    /* renamed from: H */
    private LKUILottieAnimationView f137862H;

    /* renamed from: I */
    private final AbstractC36505s f137863I;

    /* renamed from: J */
    private final ExecutorService f137864J;

    /* renamed from: K */
    private boolean f137865K = false;

    /* renamed from: L */
    private boolean f137866L;

    /* renamed from: M */
    private final boolean f137867M;

    /* renamed from: N */
    private final boolean f137868N;

    /* renamed from: O */
    private C28702a f137869O;

    /* renamed from: P */
    private C28702a f137870P;

    /* renamed from: Q */
    private RecyclerViewItemDetector<MessageInfo> f137871Q;

    /* renamed from: R */
    private final boolean f137872R = C29990c.m110930b().mo134586n().mo134685a("feature.lark.thread.new.reader");

    /* renamed from: S */
    private final AbstractC55897p f137873S = new AbstractC55897p() {
        /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558341 */

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e
        /* renamed from: a */
        public void mo121951a(String str, int i) {
            ThreadDetailView.this.mo190466b(ThreadDetailView.this.f137881g.mo190569b(i).mo190598f().getMessage());
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a
        /* renamed from: a */
        public void mo190485a(ChatMessageVO cVar) {
            ThreadDetailView.this.mo190451a(cVar);
        }

        /* renamed from: c */
        private boolean m216854c(ChatMessageVO cVar) {
            if (!C34339g.m133167a(ThreadDetailView.this.f137877c.mo190244k()) || cVar.mo121695c()) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        private void m216855d(ChatMessageVO cVar) {
            final boolean e = m216856e(cVar);
            final String a = cVar.mo121681a();
            ThreadDetailView.this.f137877c.mo190215a(a, cVar.mo121695c(), new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558341.C558362 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165396w(errorResult.getMessage());
                    ThreadDetailView.this.f137877c.mo190196a(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    ThreadDetailView.this.f137877c.mo190206a(a);
                    if (e) {
                        LKUIToast.show(ThreadDetailView.this.f137878d, (int) R.string.Lark_Legacy_ChatDocMessageRecallTip);
                        DocHitPoint.f135699a.mo187453a();
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c
        /* renamed from: b */
        public void mo190486b(AbsMessageVO aVar) {
            C34438a.m133576a(ThreadDetailView.this.f137878d, C34438a.m133573a(ThreadDetailView.this.f137878d, aVar.mo121699g().mo126168z()));
        }

        /* renamed from: e */
        private boolean m216856e(ChatMessageVO cVar) {
            if (cVar == null || cVar.mo121710r() != Message.Type.TEXT || cVar.mo121699g() == null || ((TextContentVO) cVar.mo121699g()).mo121903n() == null || ((TextContentVO) cVar.mo121699g()).mo121903n().getDoc() == null) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g
        /* renamed from: a */
        public void mo121950a(int i) {
            MultiSelectHitPointNew.f135853b.mo187667a(ThreadDetailView.this.f137877c.mo190244k());
            MultiSelectHitPoint.f135851a.mo187655a();
            ThreadDetailView.this.mo190465b(i);
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b
        /* renamed from: a */
        public void mo121952a(AbsMessageVO<StickerContentVO> aVar) {
            if (aVar != null && aVar.mo121710r() == Message.Type.STICKER) {
                StickerContent stickerContent = (StickerContent) aVar.mo121699g().mo126168z();
                if (!stickerContent.isPaid()) {
                    LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Chat_StickerPackNeedBuy);
                    return;
                }
                new ArrayList().add(stickerContent.getKey());
                ThreadDetailView.this.f137877c.mo190203a(C33223m.m128430a(stickerContent), new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558341.C558351 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        LKUIToast.show(ThreadDetailView.this.f137878d, (int) R.string.Lark_Legacy_AddStickerSuccess);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        LKUIToast.show(ThreadDetailView.this.f137878d, (int) R.string.Lark_Legacy_AddStickerFail);
                    }
                }));
            }
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m
        /* renamed from: a */
        public void mo121953a(AbstractC55890m.AbstractC55891a aVar) {
            ThreadDetailView.this.f137877c.mo190214a(((AbstractC55890m.C55892b) aVar.mo121960a()).f138066a, ((AbstractC55890m.C55892b) aVar.mo121960a()).f138067b);
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55886i
        /* renamed from: b */
        public void mo190487b(ChatMessageVO cVar) {
            ThreadTopicHitPoint.f135906a.mo187734g();
            C25639g gVar = new C25639g(ThreadDetailView.this.f137878d);
            gVar.mo89249h(17).mo89238b(true).mo89250i(R.color.text_title);
            if (cVar.mo121695c()) {
                gVar.mo89248g(R.string.Lark_Legacy_MessageRecallTip);
                gVar.mo89251j(2);
            } else {
                gVar.mo89248g(R.string.Lark_Legacy_ChatWithdrow);
                gVar.mo89256o(R.color.text_placeholder);
                gVar.mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MessageGroupRecallTip, "msg_sender", cVar.mo121657C().mo124205d()));
            }
            C25639g a = gVar.mo89245d(0.3f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, $$Lambda$ThreadDetailView$1$WizlBJiX6R_Ol9iEStFRd2sPbI.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(cVar) {
                /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$1$EKf_aGRJx7YwWKfBXlWWu1XFnvk */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ThreadDetailView.C558341.this.m216853a(this.f$1, dialogInterface, i);
                }
            });
            if (DesktopUtil.m144307b()) {
                a.mo89222a(440.0f);
            }
            a.mo89239c();
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n
        /* renamed from: a */
        public void mo121954a(AbstractC55893n.AbstractC55894a aVar) {
            AbstractC55893n.C55895b bVar = (AbstractC55893n.C55895b) aVar.mo121960a();
            ThreadDetailView.this.f137887m.mo122309a(aVar.mo121962c(), bVar.f138068a, bVar.f138069b);
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55887j
        /* renamed from: a */
        public void mo121955a(String str) {
            ThreadDetailView.this.f137877c.mo190232c(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m216852a(DialogInterface dialogInterface, int i) {
            ThreadTopicHitPoint.f135906a.mo187738i();
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55888k
        /* renamed from: b */
        public void mo190488b(String str, int i) {
            boolean z;
            MessageInfo f = ThreadDetailView.this.f137881g.mo190569b(i).mo190598f();
            ThreadDetailView threadDetailView = ThreadDetailView.this;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            threadDetailView.mo190457a(str, f, z, false);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
        /* renamed from: a */
        public void mo121937a(PhotoItem photoItem, boolean z) {
            String str;
            int a;
            if (photoItem.getMessageIdentity() != null) {
                str = photoItem.getMessageIdentity().getMessageId();
            } else {
                str = "";
            }
            List<PhotoItem> a2 = C58659h.m227513a(ThreadDetailView.this.f137877c.mo190222b(str, z));
            if (!CollectionUtils.isEmpty(a2) && (a = C34353s.m133238a(a2, photoItem)) != -1 && a < a2.size()) {
                EditImageUtils.m133181a(ThreadDetailView.this.f137878d, a2.get(a), ThreadDetailView.this.f137876b.mo190271c(), true, true);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m216853a(ChatMessageVO cVar, DialogInterface dialogInterface, int i) {
            ThreadTopicHitPoint.f135906a.mo187736h();
            if (m216854c(cVar)) {
                MessageHitPoint.f135779d.mo187532a(ThreadDetailView.this.f137877c.mo190245l(), "group_topic");
            }
            m216855d(cVar);
        }
    };

    /* renamed from: T */
    private AbstractC55909e f137874T;

    /* renamed from: a */
    public TextView f137875a;

    /* renamed from: b */
    public final AbstractC55854b f137876b;

    /* renamed from: c */
    public AbstractC55766a.AbstractC55769b.AbstractC55770a f137877c;

    /* renamed from: d */
    public final FragmentActivity f137878d;

    /* renamed from: e */
    public final AbstractC36507u f137879e;

    /* renamed from: f */
    public final AbstractC36502p f137880f = C29990c.m110930b().af();

    /* renamed from: g */
    public C55906d f137881g;

    /* renamed from: h */
    public C58984d<C55905a, ?> f137882h;

    /* renamed from: i */
    public boolean f137883i = false;

    /* renamed from: j */
    public C35324c f137884j;

    /* renamed from: k */
    public KeyBoard f137885k;

    /* renamed from: l */
    public int f137886l = 0;

    /* renamed from: m */
    public C33111af f137887m;
    @BindView(8972)
    ViewGroup mDetailContent;
    @BindView(8974)
    RecyclerView mDetailContentRv;
    @BindView(7961)
    FrameLayout mKeyBoardContainer;
    @BindView(7965)
    View mKeyboardShadow;
    @BindView(8278)
    public ViewStub mMultiSelectStub;
    @BindView(8454)
    public LKUIPtrClassicFrameLayout mPtrFrame;
    @BindView(8973)
    SysKeyBoardObserveFrameLayout mRootLayout;
    @BindView(8975)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    public boolean f137888n;
    @BindView(8298)
    NewMessageTip newMessageBottomTip;
    @BindView(8301)
    NewMessageTip newMessageTopTip;

    /* renamed from: o */
    public final boolean f137889o;

    /* renamed from: p */
    public KeyboardPluginController f137890p;

    /* renamed from: q */
    public int f137891q = -1;

    /* renamed from: r */
    public final boolean f137892r = C29990c.m110930b().mo134586n().mo134685a("messenger.message_inputbox_redesign");

    /* renamed from: s */
    private View f137893s;

    /* renamed from: t */
    private View f137894t;

    /* renamed from: u */
    private View f137895u;

    /* renamed from: v */
    private View f137896v;

    /* renamed from: w */
    private View f137897w;

    /* renamed from: x */
    private TextView f137898x;

    /* renamed from: y */
    private ImageView f137899y;

    /* renamed from: z */
    private IActionTitlebar.C57575b f137900z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.threaddetail.view.ThreadDetailView$a */
    public interface AbstractC55853a {
        boolean isMessageValid(C55905a aVar);
    }

    /* renamed from: com.ss.android.lark.threaddetail.view.ThreadDetailView$b */
    public interface AbstractC55854b {
        /* renamed from: a */
        FragmentActivity mo190262a();

        /* renamed from: a */
        void mo190263a(int i, List<PhotoItem> list, View view, boolean z, String str, int i2);

        /* renamed from: a */
        void mo190264a(Context context, String str);

        /* renamed from: a */
        void mo190265a(Chat chat, ArrayList<String> arrayList);

        /* renamed from: a */
        void mo190266a(ThreadDetailView threadDetailView);

        /* renamed from: a */
        void mo190267a(C58557a.C58559a aVar);

        /* renamed from: a */
        void mo190268a(C58633e.C58634a aVar);

        /* renamed from: a */
        void mo190269a(List<ReactionInfo> list, String str, String str2);

        /* renamed from: b */
        void mo190270b();

        /* renamed from: c */
        Fragment mo190271c();
    }

    /* renamed from: Q */
    private boolean m216716Q() {
        return false;
    }

    /* renamed from: b */
    private boolean m216740b(Chat chat) {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
    /* renamed from: a */
    public void mo122761a(AbsMessageVO aVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122832a(String str) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
    /* renamed from: p */
    public void mo122774p(String str) {
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: q */
    public void mo190183q() {
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: r */
    public void mo190184r() {
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: m */
    public Context mo190179m() {
        return this.f137878d;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: n */
    public void mo190180n() {
        m216722W();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC55766a.AbstractC55769b.AbstractC55770a aVar) {
        this.f137877c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r8.f137877c.mo190244k();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo190457a(final java.lang.String r9, com.ss.android.lark.chat.entity.message.MessageInfo r10, final boolean r11, boolean r12) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.lark.threaddetail.a$b$a r0 = r8.f137877c
            com.ss.android.lark.chat.entity.chat.Chat r3 = r0.mo190244k()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            com.ss.android.lark.chat.entity.message.Message r5 = r10.getMessage()
            r8.m216734a(r11, r12)
            com.ss.android.lark.dependency.h r10 = com.ss.android.lark.C29990c.m110930b()
            com.larksuite.component.blockit.d r10 = r10.ak()
            com.larksuite.component.blockit.entity.Domain r12 = com.larksuite.component.blockit.entity.Domain.message
            com.larksuite.component.blockit.entity.BlockTypeID r0 = com.larksuite.component.blockit.entity.BlockTypeID.MESSAGE
            com.ss.android.lark.threaddetail.view.ThreadDetailView$23 r7 = new com.ss.android.lark.threaddetail.view.ThreadDetailView$23
            r1 = r7
            r2 = r8
            r4 = r9
            r6 = r11
            r1.<init>(r3, r4, r5, r6)
            r10.mo86324b(r12, r9, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threaddetail.view.ThreadDetailView.mo190457a(java.lang.String, com.ss.android.lark.chat.entity.message.MessageInfo, boolean, boolean):void");
    }

    /* renamed from: a */
    public CharSequence mo190440a(Message message) {
        String str;
        CharSequence a = C34349o.m133202a((Context) this.f137878d, message, false, true, false);
        int i = AnonymousClass60.f137988a[message.getType().ordinal()];
        if (i == 6) {
            CardContent cardContent = (CardContent) message.getContent();
            if (cardContent.getType() == CardContent.Type.VOTE) {
                return a;
            }
            CardContent.CardHeader cardHeader = cardContent.getCardHeader();
            if (cardHeader == null || TextUtils.isEmpty(cardHeader.getTitle())) {
                str = UIHelper.getString(R.string.Lark_Legacy_MessagePoCard);
            } else {
                str = cardHeader.getTitle();
            }
            return str;
        } else if (i == 7) {
            return UIHelper.mustacheFormat((int) R.string.Calendar_CreateTaskFromEvent_TaskTitle, "title", C34349o.m133206a(message).toString());
        } else {
            if (i != 8 || ((TodoContent) message.getContent()).getCardContentData().operation_type != TodoOperationContent.Type.DAILY_REMIND) {
                return a;
            }
            if (this.f137856B.mo134685a("todo.remind.expand_scope")) {
                return UIHelper.getString(R.string.Todo_Task_RecentTodoTask);
            }
            return UIHelper.getString(R.string.Todo_BotNotification_DailyNotificationTitle);
        }
    }

    /* renamed from: a */
    public void mo190460a(String str, String str2, String str3, Message.Type type, BlockEntity blockEntity, BlockExtra blockExtra) {
        TextEntity textEntity = new TextEntity(C59029c.m229161b(str), null);
        MultiMessage multiMessage = new MultiMessage();
        multiMessage.chatId = str2;
        multiMessage.messageIds = Collections.singletonList(str3);
        blockExtra.multiMessage = multiMessage;
        blockExtra.richTextMessage = new RichTextMessage(type, new MessageContentEntity(textEntity));
        C29990c.m110930b().ak().mo86317a(this.f137878d, ActionType.Todo, blockEntity, blockExtra);
    }

    /* renamed from: a */
    public void mo190449a(RecyclerView recyclerView) {
        Log.m165389i("ThreadDetailView", "putCurrentPageMessageRead");
        List<MessageInfo> b = m216736b(recyclerView);
        if (CollectionUtils.isEmpty(b)) {
            Log.m165389i("ThreadDetailView", "intervalMessage is empty, skip");
            return;
        }
        this.f137877c.mo190217a(b);
        mo190471d(b);
        if (!this.f137865K) {
            m216703D();
        }
    }

    /* renamed from: a */
    public void mo190455a(Runnable runnable) {
        ExecutorService executorService = this.f137864J;
        if (executorService != null && !executorService.isShutdown()) {
            this.f137864J.execute(runnable);
        }
    }

    /* renamed from: a */
    public void mo190441a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mDetailContent.getLayoutParams();
        if (!(marginLayoutParams == null || marginLayoutParams.bottomMargin == i)) {
            marginLayoutParams.setMargins(0, 0, 0, i);
        }
        C35324c cVar = this.f137884j;
        if (cVar != null) {
            cVar.mo129981b(i);
        }
        ViewGroup viewGroup = this.mDetailContent;
        if (viewGroup != null) {
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public boolean mo190464a(List<C55905a> list, AbstractC55853a aVar) {
        for (C55905a aVar2 : list) {
            if (this.f137882h.mo200106b(aVar2) && !aVar.isMessageValid(aVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190152a(TranslateState translateState) {
        C33111af afVar = this.f137887m;
        if (afVar != null) {
            afVar.mo122311a(translateState);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: b */
    public void mo190163b(boolean z) {
        if (!z) {
            this.mRootLayout.setBackgroundColor(UIHelper.getColor(R.color.bg_body));
        } else {
            C29990c.m110930b().mo134535a((Context) this.f137878d, (View) this.mRootLayout);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190151a(C35221d dVar, boolean z, boolean z2) {
        String obj = this.f137885k.mo146827h().mo146904l().getText().toString();
        if (!z2 || TextUtils.isEmpty(obj)) {
            this.f137885k.mo146797a(new KeyBoard.ReplyInfo(dVar.f90970b, dVar.f90969a, dVar.f90971c, dVar.f90975g, dVar.f90977i, dVar.f90976h));
            if (!z2) {
                if (z) {
                    if (!TextUtils.isEmpty(dVar.f90977i) || !C59035h.m229210a(dVar.f90976h)) {
                        this.f137885k.mo146803a("post");
                    }
                } else if (!this.f137885k.mo146828i()) {
                    this.f137885k.mo146829j();
                }
            }
        } else {
            Log.m165389i("ThreadDetailView", "user input content before get replyInfo, abandon result");
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190150a(final Chat chat) {
        C29990c.m110930b().mo134595w().mo134355a(this.f137878d, new IChatSettingDependency.AbstractC36448a() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass19 */

            @Override // com.ss.android.lark.dependency.IChatSettingDependency.AbstractC36448a
            public void onClick(View view, String str) {
                ThreadDetailView.this.f137877c.mo190199a(chat, str);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190149a(ErrorResult errorResult) {
        if (BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
            BillingTipsDialog.m226151a(this.f137878d, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
        } else {
            new C25639g(this.f137878d).mo89237b(errorResult.getDisplayMsg()).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190153a(RichText richText, String str, RichText richText2) {
        if (this.f137892r) {
            if (richText2 != null) {
                richText = richText2;
            }
            this.f137885k.mo146802a(null, str, richText, true);
        } else {
            this.f137885k.mo146802a(richText, str, richText2, true);
        }
        if (this.f137892r || (TextUtils.isEmpty(str) && C59035h.m229210a(richText2))) {
            EditText l = this.f137885k.mo146827h().mo146904l();
            if (l != null) {
                l.requestFocus();
            }
            this.f137885k.mo146829j();
            return;
        }
        this.f137885k.mo146803a("post");
    }

    /* renamed from: a */
    public void mo190442a(final int i, int i2) {
        Log.m165389i("ThreadDetailView", "positionStart = " + i + "; itemCount = " + i2);
        if (i2 == 1) {
            this.mDetailContentRv.postDelayed(new Runnable() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass21 */

                /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
                /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r4 = this;
                        int r0 = r4
                        com.ss.android.lark.threaddetail.view.ThreadDetailView r1 = com.ss.android.lark.threaddetail.view.ThreadDetailView.this
                        com.ss.android.lark.threaddetail.view.d r1 = r1.f137881g
                        int r1 = r1.getItemCount()
                        int r1 = r1 + -2
                        java.lang.String r2 = "ThreadDetailView"
                        if (r0 != r1) goto L_0x004c
                        com.ss.android.lark.threaddetail.view.ThreadDetailView r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.this
                        androidx.recyclerview.widget.RecyclerView r0 = r0.mDetailContentRv
                        androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                        boolean r0 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
                        if (r0 == 0) goto L_0x004c
                        com.ss.android.lark.threaddetail.view.ThreadDetailView r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.this
                        androidx.recyclerview.widget.RecyclerView r0 = r0.mDetailContentRv
                        androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                        androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                        int r0 = r0.findLastVisibleItemPosition()
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r3 = "lastVisibleItemPosition = "
                        r1.append(r3)
                        r1.append(r0)
                        java.lang.String r1 = r1.toString()
                        com.ss.android.lark.log.Log.m165389i(r2, r1)
                        int r1 = r4
                        int r3 = r1 + -2
                        if (r0 == r3) goto L_0x004a
                        int r3 = r1 + -1
                        if (r0 == r3) goto L_0x004a
                        if (r0 != r1) goto L_0x004c
                    L_0x004a:
                        r0 = 1
                        goto L_0x004d
                    L_0x004c:
                        r0 = 0
                    L_0x004d:
                        if (r0 == 0) goto L_0x0059
                        java.lang.String r0 = "onItemRangeInserted:scrollContentToBottom"
                        com.ss.android.lark.log.Log.m165389i(r2, r0)
                        com.ss.android.lark.threaddetail.view.ThreadDetailView r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.this
                        r0.mo190146a()
                    L_0x0059:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass21.run():void");
                }
            }, 200);
        }
    }

    /* renamed from: a */
    public void mo190453a(MessageInfo messageInfo, String str) {
        if (messageInfo != null) {
            this.f137857C.mo134370a(this.f137878d, messageInfo.getMessage(), str, "thread_details");
        }
    }

    /* renamed from: a */
    public void mo190452a(final MessageInfo messageInfo, final Chat chat, final Chatter chatter) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass33 */

            public void run() {
                C29990c.m110930b().mo134509H().mo134431a(ThreadDetailView.this.f137878d, messageInfo, chat, chatter, null);
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190147a(int i, List<PhotoItem> list, View view, boolean z, int i2) {
        this.f137876b.mo190263a(i, list, view, z, this.f137877c.mo190245l(), i2);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190156a(List<C55905a> list, boolean z, boolean z2) {
        m216722W();
        this.f137881g.mo190568a(list, this.f137877c.mo190254u());
        C29990c.m110930b().mo134577e().mo120977h();
        if (z2) {
            this.mRootLayout.postDelayed(new Runnable() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass35 */

                public void run() {
                    IInputSupportPlugin x = ThreadDetailView.this.mo190482x();
                    if (x != null && x.mo146904l() != null) {
                        x.mo146904l().requestFocus();
                        ThreadDetailView.this.f137885k.mo146829j();
                    }
                }
            }, 200);
            if (ac()) {
                C28702a aVar = this.f137870P;
                if (aVar != null) {
                    aVar.mo102099a(m216720U());
                }
                C28702a aVar2 = this.f137869O;
                if (aVar2 != null) {
                    aVar2.mo102099a(m216720U());
                }
            }
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190158a(boolean z, boolean z2, boolean z3) {
        LKUILottieAnimationView lKUILottieAnimationView = this.f137862H;
        if (lKUILottieAnimationView != null) {
            if (z3 && z) {
                mo190450a(lKUILottieAnimationView);
            } else if (!z) {
                FragmentActivity fragmentActivity = this.f137878d;
                lKUILottieAnimationView.setImageDrawable(UDIconUtils.getIconDrawable(fragmentActivity, (int) R.drawable.ud_icon_subscribe_add_outlined, UDColorUtils.getColor(fragmentActivity, R.color.icon_n1)));
            } else if (!this.f137888n) {
                lKUILottieAnimationView.setImageDrawable(UDIconUtils.getIconDrawable(this.f137878d, R.drawable.ud_icon_resolve_colorful));
            }
            if (this.f137885k != null && !z2) {
                m216744d(z);
            }
        }
    }

    /* renamed from: a */
    public void mo190450a(LKUILottieAnimationView lKUILottieAnimationView) {
        if (lKUILottieAnimationView != null && !this.f137888n) {
            this.f137888n = true;
            lKUILottieAnimationView.setAnimation(R.raw.thread_detail_subscribe);
            lKUILottieAnimationView.playAnimation();
            lKUILottieAnimationView.postDelayed(new Runnable() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass36 */

                public void run() {
                    ThreadDetailView.this.f137888n = false;
                }
            }, 520);
            C34331aa.m133108a(this.f137878d, 30);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190154a(List<C55905a> list) {
        this.f137881g.mo190568a(list, this.f137877c.mo190254u());
        this.f137860F.mo92346a(new Runnable() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$l8ryo7qHEyVlEeEMknz7V4d9RA0 */

            public final void run() {
                ThreadDetailView.this.ae();
            }
        }, 100);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190155a(final List<C55905a> list, long j) {
        this.f137860F.mo92346a(new Runnable() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass37 */

            public void run() {
                ThreadDetailView.this.mo190154a(list);
                ThreadDetailView.this.f137877c.mo190259z();
            }
        }, j);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190146a() {
        Log.m165389i("ThreadDetailView", "scrollContentToBottom adapter size=" + this.f137881g.getItemCount());
        if (this.f137881g.getItemCount() > 0) {
            this.f137860F.mo92346a(new Runnable() {
                /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$0WkN7XeNrKJO1IWhduQ_dOXv17o */

                public final void run() {
                    ThreadDetailView.this.ad();
                }
            }, 200);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190148a(int i, boolean z, boolean z2) {
        if (z) {
            this.f137860F.mo92346a(new Runnable(i, z2) {
                /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$zaVQeFqbPgf36zTwxUi0M7ibEI */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    ThreadDetailView.this.m216737b((ThreadDetailView) this.f$1, (int) this.f$2);
                }
            }, 100);
        } else {
            m216737b(i, z2);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public void mo190157a(boolean z) {
        this.f137883i = z;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: b */
    public void mo190162b(List<MessageInfo> list) {
        if (this.f137883i) {
            if (this.mDetailContentRv == null) {
                Log.m165389i("ThreadDetailView", "refreshNoticeWindow :mDetailContentRv == null");
            } else if (this.f137884j == null) {
                Log.m165389i("ThreadDetailView", "refreshNoticeWindow :mNewMessageTipController == null");
            } else if (CollectionUtils.isNotEmpty(list)) {
                this.f137884j.mo129978a(list, !C58996h.m228982d(this.mDetailContentRv));
            }
        }
    }

    /* renamed from: a */
    public void mo190461a(List<ReactionInfo> list, String str) {
        this.f137876b.mo190269a(list, str, this.f137877c.mo190244k().getId());
    }

    /* renamed from: a */
    public void mo190451a(ChatMessageVO cVar) {
        if (cVar.mo121710r() != Message.Type.POST || !CollectionUtils.isNotEmpty(C59031e.m229183b(((PostContentVO) cVar.mo121699g()).mo121772a())) || m216723X()) {
            this.f137877c.mo190228b(Collections.singletonList(cVar.mo121681a()));
        } else {
            mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicMessageVideoFavoriteError));
        }
    }

    /* renamed from: a */
    public void mo190462a(boolean z, List<String> list) {
        Log.m165389i("ThreadDetailView", "Attempting to create RecyclerView with the files");
        new FilePreviewDialog(this.f137878d, list, new FilePreviewDialogCallback() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass54 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
            /* renamed from: a */
            public boolean mo122058a(Dialog dialog) {
                dialog.dismiss();
                return true;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
            /* renamed from: a */
            public boolean mo122059a(Dialog dialog, List<String> list) {
                String q = ThreadDetailView.this.f137885k.mo146836q();
                String r = ThreadDetailView.this.f137885k.mo146837r();
                for (String str : list) {
                    String c = C26311p.m95283c(str);
                    if (c.contains("image/") || str.endsWith(".0")) {
                        ThreadDetailView.this.f137877c.mo190219a(Collections.singletonList(str), true, q, r);
                    } else if (c.contains("video/")) {
                        File file = new File(str);
                        Photo photo = new Photo();
                        photo.setPath(file.getPath());
                        photo.setMimeType(C26311p.m95279b(file));
                        photo.setSize(C26311p.m95281c(file));
                        photo.setDuration(0);
                        photo.setCompressPath(ao.m224300a(ThreadDetailView.this.f137878d, file.getPath(), false));
                        ThreadDetailView.this.f137877c.mo190218a(Collections.singletonList(photo), q, r);
                    } else {
                        ArrayList<File> arrayList = new ArrayList<>();
                        arrayList.add(new File(str));
                        ThreadDetailView.this.f137877c.mo190216a(arrayList);
                    }
                }
                dialog.dismiss();
                return true;
            }
        }).show();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: a */
    public boolean mo190159a(int i, int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            return false;
        }
        if (i != 9) {
            return this.f137885k.mo146812a(i, i2, intent);
        }
        mo190177k();
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        this.f137877c.mo190211a(str, str2, str3, sourceType);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122765a(String str, String str2, Message.SourceType sourceType) {
        this.f137877c.mo190194a(this.f137878d, str, str2, sourceType);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
    /* renamed from: a */
    public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        this.f137877c.mo190226b(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(photoItem);
        this.f137877c.mo190195a(view, photoItem, (List<PhotoItem>) arrayList, false, i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122773a(View view, PhotoItem photoItem, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(photoItem);
        Chat k = this.f137877c.mo190244k();
        C29990c.m110930b().mo134541a(this.f137878d, arrayList, 0, view, null, k != null && !k.isSecret(), false, false, z, false, false, null, null, Scene.Thread, 4);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122830a(View view, List<Image> list, Image image) {
        new C33292b(this.f137878d, Scene.Thread).mo122757a(view, list, image);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: a */
    public void mo190458a(String str, String str2) {
        this.f137877c.mo190209a(str, str2);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: b */
    public void mo190467b(String str, String str2) {
        this.f137877c.mo190227b(str, str2);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: a */
    public boolean mo190463a(String str, String str2, boolean z) {
        if (z) {
            return true;
        }
        if (TextUtils.isEmpty(str2) || this.f137855A.mo134398a(str2)) {
            return false;
        }
        AtKBPlugin aVar = (AtKBPlugin) this.f137885k.mo146819c("at");
        if (aVar != null) {
            aVar.mo147384a(str2, str, false, z);
        }
        return true;
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: b */
    public void mo190468b(List<ReactionInfo> list, String str) {
        if (!CollectionUtils.isEmpty(list)) {
            mo190461a(list, str);
        }
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: a */
    public void mo190443a(int i, ChatMessageVO cVar) {
        if (this.f137881g.mo190569b(i).mo190598f() != null && i != -1) {
            this.f137882h.mo200098a(i);
        }
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: a */
    public void mo190447a(View view, ChatMessageVO cVar) {
        C33111af afVar = this.f137887m;
        if (afVar != null) {
            afVar.mo122309a(view, (String) null, cVar.mo121681a());
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a
    /* renamed from: a */
    public void mo190444a(View view, AbsMessageVO aVar) {
        AbstractC55766a.AbstractC55769b.AbstractC55770a aVar2 = this.f137877c;
        if (aVar2 != null) {
            aVar2.mo190198a(aVar);
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.C56199a.AbstractC56205a
    /* renamed from: a */
    public void mo190459a(String str, String str2, int i) {
        this.f137877c.mo190233c(str, str2);
    }

    @Override // com.ss.android.lark.threadwindow.view.message.C56213e.AbstractC56214a
    /* renamed from: a */
    public void mo190456a(String str, int i) {
        C55906d dVar = this.f137881g;
        MessageInfo f = dVar.mo190569b(dVar.mo190567a(str)).mo190598f();
        if (f != null && f.getMessage().getType() == Message.Type.FILE) {
            this.f137863I.mo134701a(this.f137878d, f.getMessage(), this.f137877c.mo190244k().isSecret(), this.f137863I.mo134696a());
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
    /* renamed from: a */
    public void mo190445a(View view, AbsMessageVO aVar, Image image, boolean z) {
        PostContent postContent;
        if (image != null) {
            Content z2 = aVar.mo121699g().mo126168z();
            if (z2 instanceof PostContent) {
                PostContent postContent2 = (PostContent) z2;
                if (!(!z || ((PostContentVO) aVar.mo121699g()).mo121930y() == null || (postContent = (PostContent) ((PostContentVO) aVar.mo121699g()).mo121930y().mo126168z()) == null)) {
                    postContent2 = postContent;
                }
                List<PhotoItem> a = C58659h.m227514a(C34353s.m133243a(postContent2.getRichText(), aVar.mo121695c()), aVar.mo121681a());
                if (!(CollectionUtils.isEmpty(a) || CollectionUtils.isEmpty(C34353s.m133244a(Collections.singletonList(C57305aa.m222055a(image)))))) {
                    for (PhotoItem photoItem : a) {
                        if (photoItem != null) {
                            photoItem.getPhotoState().setLoadOrigin(true);
                        }
                    }
                    List<PhotoItem> a2 = C34353s.m133246a(Collections.singletonList(C57305aa.m222055a(image)), aVar.mo121681a(), z);
                    if (!CollectionUtils.isEmpty(a2)) {
                        PhotoItem photoItem2 = a2.get(0);
                        Chat k = this.f137877c.mo190244k();
                        String announceUrl = k != null ? k.getChatAnnouncement().getAnnounceUrl() : "";
                        if (aVar.ai() || !postContent2.isGroupAnnouncement() || TextUtils.isEmpty(announceUrl)) {
                            C58630d.m227372a(this.f137878d, a, C34353s.m133238a(a, photoItem2), view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, false, true, false, true, C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable"), false, new DialogMenuClickListenerImpl(this.f137877c.mo190245l()), null, "", null, Biz.Messenger, Scene.Thread, 2);
                            return;
                        }
                        C29990c.m110930b().mo134593u().mo134330a(this.f137878d, announceUrl);
                        AnnounceOpenDocHitPoint.f135643a.mo187338a("message", k.getId());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
    /* renamed from: a */
    public void mo190448a(View view, String str, String str2) {
        C29990c.m110930b().mo134523V().mo134436a(this.f137878d, new ProfileSource.C36868a().mo136066c(str).mo136065b(str2).mo136064b(4).mo136060a(0).mo136062a(C34339g.m133170d(this.f137877c.mo190244k())).mo136063a());
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
    /* renamed from: a */
    public void mo190446a(View view, AbsMessageVO aVar, RichTextElement.MediaProperty mediaProperty) {
        List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(C57308c.m222071a(aVar.mo121681a(), aVar.mo121692b(), mediaProperty)));
        if (!CollectionUtils.isEmpty(a)) {
            C29990c.m110930b().mo134541a(this.f137878d, a, 0, view, null, false, false, false, false, false, false, null, null, Scene.Thread, 4);
        }
    }

    /* renamed from: F */
    private IKeyBoardPlugin m216705F() {
        return new AaStyleKBPlugin();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ae() {
        mo190449a(this.mDetailContentRv);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void af() {
        C35324c cVar = this.f137884j;
        if (cVar != null) {
            cVar.mo129985d();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ag() {
        mo190449a(this.mDetailContentRv);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String ah() {
        return this.f137877c.mo190250q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Chat ai() {
        return this.f137877c.mo190244k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ThreadTopic aj() {
        return this.f137877c.mo190247n();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: c */
    public void mo190164c() {
        C35324c cVar = this.f137884j;
        if (cVar != null) {
            cVar.mo129988g();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: d */
    public void mo190168d() {
        C35324c cVar = this.f137884j;
        if (cVar != null) {
            cVar.mo129989h();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: e */
    public void mo190170e() {
        KeyBoard fVar = this.f137885k;
        if (fVar != null) {
            fVar.mo146839t();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: h */
    public void mo190174h() {
        C55906d dVar = this.f137881g;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: i */
    public void mo190175i() {
        this.f137876b.mo190270b();
    }

    /* renamed from: O */
    private boolean m216714O() {
        return C29990c.m110930b().mo134519R().mo134474b();
    }

    /* renamed from: X */
    private boolean m216723X() {
        return C29990c.m110930b().mo134586n().mo134685a("group.message.video.forward.enable");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ad() {
        this.mDetailContentRv.smoothScrollToPosition(this.f137881g.getItemCount() - 1);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55868d
    /* renamed from: A */
    public void mo190439A() {
        if (!this.f137877c.mo190254u()) {
            this.f137885k.mo146829j();
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: f */
    public boolean mo190172f() {
        KeyBoard fVar = this.f137885k;
        if (fVar != null) {
            return fVar.mo146824e();
        }
        return false;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: j */
    public void mo190176j() {
        this.f137860F.mo92346a(new Runnable() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$nj_9ioMgRmzAx_nuBxTVAJbww */

            public final void run() {
                ThreadDetailView.this.ag();
            }
        }, 100);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: t */
    public void mo190186t() {
        this.f137860F.mo92345a(new Runnable() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$P7QxtDyov7zRTjYtg1h_3Z8jnFw */

            public final void run() {
                ThreadDetailView.this.af();
            }
        });
    }

    /* renamed from: D */
    private void m216703D() {
        if (this.mDetailContentRv.getChildCount() > 0) {
            this.f137865K = true;
            this.mDetailContentRv.post(new Runnable() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass62 */

                public void run() {
                    AbstractC32812c e = C29990c.m110930b().mo134577e();
                    e.mo120979j();
                    e.mo120963b(ThreadDetailView.this.f137878d);
                }
            });
        }
    }

    /* renamed from: G */
    private IKeyBoardPlugin m216706G() {
        VoiceKBPlugin dVar = new VoiceKBPlugin(false, new IRecordListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558383 */

            /* renamed from: b */
            private Message f137938b;

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123901a() {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123902a(int i) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123903a(String str) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: b */
            public void mo123908b() {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: b */
            public void mo123910b(String str, String str2, boolean z, boolean z2) {
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: c */
            public void mo123911c() {
                ThreadDetailView.this.mo190455a(new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$3$goVNmNrZAkBk3YVNBKMA7lsFKNg */

                    public final void run() {
                        ThreadDetailView.C558383.this.m216890d();
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m216890d() {
                ThreadDetailView.this.f137877c.mo190187a(this.f137938b, ((AudioContent) this.f137938b.getContent()).getLocalSequenceId(), ByteBuffer.wrap(new byte[0]), true, true, null);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: b */
            public void mo123909b(String str) {
                Log.m165379d("ThreadDetailView", "onCancelRecord");
                if (this.f137938b != null) {
                    ThreadDetailView.this.f137877c.mo190235d(this.f137938b.getcId());
                }
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123904a(String str, RichText richText) {
                ThreadDetailView.this.f137877c.mo190212a(ThreadDetailView.this.f137885k.mo146836q(), ThreadDetailView.this.f137885k.mo146837r(), str, richText);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m216887a(ByteBuffer byteBuffer, boolean z) {
                Message message = this.f137938b;
                if (message == null || byteBuffer == null) {
                    Log.m165383e("ThreadDetailView", "recordingAudioMessage or buffer is null");
                    return;
                }
                AudioContent audioContent = (AudioContent) message.getContent();
                if (TextUtils.isEmpty(audioContent.getUploadId())) {
                    Log.m165383e("ThreadDetailView", "UploadId is empty");
                } else {
                    ThreadDetailView.this.f137877c.mo190187a(this.f137938b, audioContent.getLocalSequenceId(), byteBuffer, z, false, null);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m216888a(boolean z, String str) {
                String str2;
                if (this.f137938b == null) {
                    Log.m165397w("ThreadDetailView", "onStartRecord recordingAudioMessage is null");
                    return;
                }
                if (z) {
                    str2 = UUID.randomUUID().toString();
                } else {
                    str2 = ThreadDetailView.this.f137877c.mo190189a(this.f137938b.getChatId(), "", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    AudioContent audioContent = (AudioContent) this.f137938b.getContent();
                    audioContent.setUploadId(str2);
                    audioContent.setSequenceId(0);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m216889a(boolean z, String str, String str2, int i) {
                if (this.f137938b == null) {
                    Log.m165397w("ThreadDetailView", "onSendAudioMessage recordingAudioMessage is null");
                    return;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                ThreadDetailView.this.f137877c.mo190187a(this.f137938b, ((AudioContent) this.f137938b.getContent()).getLocalSequenceId(), ByteBuffer.wrap(new byte[0]), z, true, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558383.C558391 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        countDownLatch.countDown();
                        Log.m165379d("ThreadDetailView", "onSendAudioData last onError:");
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        countDownLatch.countDown();
                        Log.m165379d("ThreadDetailView", "onSendAudioData last onSuccess:" + str);
                    }
                });
                try {
                    countDownLatch.await(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.m165379d("ThreadDetailView", "countdown:" + countDownLatch);
                ThreadDetailView.this.f137877c.mo190200a(this.f137938b, str, str2, i);
                MessageHitPoint.f135779d.mo187530a("audio_only", i, false);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123905a(String str, String str2, int i, boolean z) {
                Log.m165379d("ThreadDetailView", "onAudioRecorded:" + str + "/" + str2 + "/" + i + "/" + z);
                if (this.f137938b == null) {
                    Log.m165397w("ThreadDetailView", "onAudioRecorded recordingAudioMessage is null");
                } else {
                    ThreadDetailView.this.mo190455a(new Runnable(z, str, str2, i) {
                        /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$3$uDH6iuk_yMYpCqGkieyEj2LACjU */
                        public final /* synthetic */ boolean f$1;
                        public final /* synthetic */ String f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ int f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        public final void run() {
                            ThreadDetailView.C558383.this.m216889a((ThreadDetailView.C558383) this.f$1, (boolean) this.f$2, this.f$3, (String) this.f$4);
                        }
                    });
                }
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123906a(String str, String str2, boolean z, boolean z2) {
                String q = ThreadDetailView.this.f137885k.mo146836q();
                String r = ThreadDetailView.this.f137885k.mo146837r();
                Log.m165379d("ThreadDetailView", "onStartRecord:" + str + "/" + str2);
                this.f137938b = ThreadDetailView.this.f137877c.mo190188a(q, r, str, str2);
                ThreadDetailView.this.mo190455a(new Runnable(z, str) {
                    /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$3$IWlRXolv1CvtwW536IsVhWEm8bo */
                    public final /* synthetic */ boolean f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        ThreadDetailView.C558383.this.m216888a((ThreadDetailView.C558383) this.f$1, (boolean) this.f$2);
                    }
                });
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
            /* renamed from: a */
            public void mo123907a(ByteBuffer byteBuffer, int i, double d, boolean z) {
                ThreadDetailView.this.mo190455a(new Runnable(byteBuffer, z) {
                    /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$3$P3aSOgtFbHwD6VmVqNqcO5UWsnU */
                    public final /* synthetic */ ByteBuffer f$1;
                    public final /* synthetic */ boolean f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        ThreadDetailView.C558383.this.m216887a((ThreadDetailView.C558383) this.f$1, (ByteBuffer) this.f$2);
                    }
                });
            }
        }, new IVoiceDependency() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558404 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
            /* renamed from: c */
            public boolean mo123923c() {
                return true;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
            /* renamed from: a */
            public boolean mo123921a() {
                ThreadDetailView.this.f137880f.mo134684b();
                return false;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
            /* renamed from: b */
            public boolean mo123922b() {
                ThreadDetailView.this.f137880f.mo134684b();
                return false;
            }
        });
        dVar.mo147965a(new IKeyBoardPlugin.IPluginClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558455 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
            /* renamed from: a */
            public void mo122033a() {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "voice_msg", "im_chat_voice_msg_view");
            }
        });
        return dVar;
    }

    /* renamed from: K */
    private IInputSupportPlugin m216710K() {
        if (this.f137892r) {
            return this.f137885k.mo146821d("input_richtext_expand");
        }
        return this.f137885k.mo146821d("post");
    }

    /* renamed from: P */
    private boolean m216715P() {
        if (this.f137877c.mo190244k() == null) {
            return false;
        }
        return this.f137877c.mo190244k().isCrossWithKa();
    }

    /* renamed from: W */
    private void m216722W() {
        this.f137897w.setVisibility(0);
        this.f137875a.setText(this.f137877c.mo190241h());
        this.f137899y.setVisibility(0);
        this.f137898x.setVisibility(8);
    }

    /* renamed from: Y */
    private IKeyBoardPlugin m216724Y() {
        final String l = this.f137877c.mo190245l();
        return new AtKBPlugin(l, false, true, new IAtDependency() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass39 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
            /* renamed from: a */
            public void mo127066a() {
                ThreadDetailView.this.f137879e.mo134717b();
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
            /* renamed from: a */
            public void mo127067a(int i) {
                ThreadDetailView.this.f137879e.mo134714a(ThreadDetailView.this.f137878d, l, true, i);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
            /* renamed from: a */
            public List<IAtDependency.ChatterInfo> mo127065a(Intent intent) {
                boolean z;
                ChatterNameDisplayRule chatterNameDisplayRule;
                List<ChatChatter> list = (List) intent.getSerializableExtra("chatters_info");
                C32832c a = C32832c.m126312a();
                if (ThreadDetailView.this.f137877c.mo190244k() == null || !ThreadDetailView.this.f137877c.mo190244k().isP2PChat()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    chatterNameDisplayRule = ChatterNameDisplayRule.ALIAS_NAME;
                } else {
                    chatterNameDisplayRule = ChatterNameDisplayRule.NICKNAME_NAME;
                }
                ArrayList arrayList = new ArrayList();
                for (ChatChatter chatChatter : list) {
                    arrayList.add(new IAtDependency.ChatterInfo(chatChatter.getId(), a.mo121121a(chatChatter, chatterNameDisplayRule), chatChatter.isOutChatUser(), chatChatter.isAnonymous()));
                }
                return arrayList;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
            /* renamed from: a */
            public int mo127064a(String str, boolean z, boolean z2) {
                return ThreadDetailView.this.f137879e.mo134711a(str, z, z2);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
            /* renamed from: a */
            public void mo127068a(int i, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
                ThreadDetailView.this.f137879e.mo134712a(i, l, true, autoCompleteTextView, onActivityResultListener);
            }
        });
    }

    /* renamed from: Z */
    private IKeyBoardPlugin m216725Z() {
        ThreadPhotoKBPlugin cVar = new ThreadPhotoKBPlugin(false, true, true, new IPhotoDependency() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass40 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public boolean mo122042a() {
                return true;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: b */
            public boolean mo122044b() {
                return true;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122038a(C58557a.C58559a aVar) {
                ThreadDetailView.this.f137876b.mo190267a(aVar);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public Observable<Map<String, IPhotoDependency.FrameInfo>> mo122036a(List<IPhotoDependency.VideoInfo> list) {
                return C34278w.m132953a().mo126826a(list);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122039a(C58633e.C58634a aVar) {
                ThreadDetailView.this.f137876b.mo190268a(aVar);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122040a(ArrayList<File> arrayList) {
                ThreadDetailView.this.f137877c.mo190216a(arrayList);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: b */
            public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
                String q = ThreadDetailView.this.f137885k.mo146836q();
                String r = ThreadDetailView.this.f137885k.mo146837r();
                ArrayList arrayList = new ArrayList();
                for (IPhotoDependency.VideoInfo videoInfo : list) {
                    Photo photo = new Photo();
                    photo.setPath(videoInfo.getPath());
                    photo.setMimeType(videoInfo.getMimeType());
                    photo.setSize(videoInfo.getSize());
                    photo.setDuration(videoInfo.getDuration());
                    photo.setCompressPath(videoInfo.getCompressPath());
                    arrayList.add(photo);
                }
                ThreadDetailView.this.f137877c.mo190218a(arrayList, q, r);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public void mo122041a(ArrayList<String> arrayList, boolean z) {
                ThreadDetailView.this.f137877c.mo190219a(arrayList, z, ThreadDetailView.this.f137885k.mo146836q(), ThreadDetailView.this.f137885k.mo146837r());
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
            /* renamed from: a */
            public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
                return C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Thread).map(new Function<com.ss.android.lark.image.entity.Image, IPhotoDependency.Image>() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass40.C558411 */

                    /* renamed from: a */
                    public IPhotoDependency.Image apply(com.ss.android.lark.image.entity.Image image) throws Exception {
                        return new IPhotoDependency.Image(image.getUrls(), image.getWidth(), image.getHeight(), image.getToken());
                    }
                });
            }
        });
        cVar.mo147803a(new IKeyBoardPlugin.IPluginClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass41 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
            /* renamed from: a */
            public void mo122033a() {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "image_select", "im_chat_image_send_view");
            }
        });
        cVar.mo147808a(new PhotoAaKBPluginCompat(this.f137885k));
        return cVar;
    }

    private int ab() {
        if (this.f137892r) {
            if (this.f137885k.mo146827h() instanceof RichTextInputExpandPlugin) {
                return 1;
            }
            return 0;
        } else if (this.f137885k.mo146827h() instanceof PostInputSupportPlugin) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: g */
    public void mo190173g() {
        KeyboardUtils.hideKeyboard(this.f137876b.mo190262a());
        this.f137876b.mo190270b();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: k */
    public void mo190177k() {
        View view = this.f137893s;
        if (view != null && view.getVisibility() == 0) {
            m216712M();
            this.f137893s.setVisibility(8);
            m216748f(0);
            this.f137882h.mo200103a(false);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: l */
    public void mo190178l() {
        List<MessageInfo> b = m216736b(this.mDetailContentRv);
        if (!CollectionUtils.isEmpty(b)) {
            this.f137877c.mo190217a(b);
        }
    }

    /* renamed from: x */
    public IInputSupportPlugin mo190482x() {
        if (this.f137892r) {
            return this.f137885k.mo146821d("input_richtext_shrink");
        }
        return this.f137885k.mo146821d("text");
    }

    /* renamed from: B */
    private void m216701B() {
        if (!this.f137872R) {
            Log.m165389i("ThreadDetailView", "use old scroll listener");
            return;
        }
        Log.m165389i("ThreadDetailView", "use item detector");
        RecyclerViewItemDetector<MessageInfo> bVar = new RecyclerViewItemDetector<>(this.mDetailContentRv, this.f137881g, new RecyclerViewItemDetector.ItemDataProvider<MessageInfo>() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass34 */

            /* renamed from: a */
            public String mo123406a(MessageInfo messageInfo) {
                if (messageInfo != null) {
                    return messageInfo.getId();
                }
                return "";
            }

            /* renamed from: a */
            public MessageInfo mo123407b(int i) {
                if (i < 0 || i >= ThreadDetailView.this.f137881g.getItemCount()) {
                    return null;
                }
                return ThreadDetailView.this.f137881g.mo190569b(i).mo190598f();
            }
        });
        this.f137871Q = bVar;
        bVar.mo123935a(new RecyclerViewItemDetector.ItemDetectListener<MessageInfo>() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass45 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122146a() {
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122147a(List<? extends MessageInfo> list) {
                Log.m165389i("ThreadDetailView", "onItemDetected, size is:" + list.size());
                ArrayList arrayList = new ArrayList(list);
                ThreadDetailView.this.f137877c.mo190217a((List<MessageInfo>) new ArrayList(arrayList));
                ThreadDetailView.this.mo190471d(new ArrayList(arrayList));
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122148a(boolean z, int i, int i2) {
                if (i <= 5 && ThreadDetailView.this.f137877c.mo190239f()) {
                    ThreadDetailView.this.mPtrFrame.autoRefresh();
                }
                if (i2 >= ThreadDetailView.this.f137881g.getItemCount() - 5 && ThreadDetailView.this.f137877c.mo190236d()) {
                    ThreadDetailView.this.mPtrFrame.autoLoadMore();
                }
            }
        });
        this.f137871Q.mo123938b();
    }

    /* renamed from: C */
    private void m216702C() {
        this.f137859E = new ChatWindowPtrLoadingHeader(this.f137878d);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setHeaderView(this.f137859E);
        this.mPtrFrame.setForceBackWhenComplete(true);
        this.mPtrFrame.addPtrUIHandler(this.f137859E);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass56 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                PerfChatPerformanceMonitor.m213464a(true, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
                ThreadDetailView.this.f137877c.mo190237e();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                PerfChatPerformanceMonitor.m213464a(false, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
                ThreadDetailView.this.f137877c.mo190240g();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!ThreadDetailView.this.f137877c.mo190236d() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!ThreadDetailView.this.f137877c.mo190239f() || !super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
        if (!this.f137872R) {
            this.mDetailContentRv.addOnScrollListener(new RecyclerViewScrollDetector() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass61 */

                @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
                public void onScrollToBottom() {
                    ThreadDetailView threadDetailView = ThreadDetailView.this;
                    threadDetailView.mo190449a(threadDetailView.mDetailContentRv);
                }

                @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
                public void onScrollStop(int i, int i2) {
                    ThreadDetailView.this.f137877c.mo190217a(ThreadDetailView.this.f137881g.mo190627a(i, i2, true));
                }

                @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
                public void onScrollPassed(int i, int i2) {
                    if (i <= 5 && ThreadDetailView.this.f137877c.mo190239f()) {
                        ThreadDetailView.this.mPtrFrame.autoRefresh();
                    }
                    if (i2 >= ThreadDetailView.this.f137881g.getItemCount() - 5 && ThreadDetailView.this.f137877c.mo190236d()) {
                        ThreadDetailView.this.mPtrFrame.autoLoadMore();
                    }
                    ThreadDetailView.this.mo190471d(ThreadDetailView.this.f137881g.mo190627a(i, i2, false));
                }
            });
        }
    }

    /* renamed from: H */
    private void m216707H() {
        this.mDetailContentRv.setLayoutManager(new LinearLayoutManager(this.f137878d));
        this.mDetailContentRv.setOverScrollMode(2);
        this.mDetailContentRv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558486 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    ThreadDetailView.this.f137885k.mo146820c();
                }
            }
        });
        if (!DesktopUtil.m144307b()) {
            RecyclerView recyclerView = this.mDetailContentRv;
            recyclerView.setItemAnimator(new C55855a(recyclerView));
            ((SimpleItemAnimator) this.mDetailContentRv.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        m216708I();
    }

    /* renamed from: R */
    private boolean m216717R() {
        if (this.f137877c.mo190255v() || Objects.equals(this.f137877c.mo190247n().getOwnerId(), this.f137855A.mo134394a()) || C34339g.m133167a(this.f137877c.mo190244k()) || m216720U()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m216718S() {
        if (this.f137877c.mo190255v() || Objects.equals(this.f137877c.mo190247n().getOwnerId(), this.f137855A.mo134394a()) || C34339g.m133167a(this.f137877c.mo190244k()) || m216720U()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m216719T() {
        if (Objects.equals(this.f137877c.mo190247n().getOwnerId(), this.f137855A.mo134394a()) || !C34339g.m133167a(this.f137877c.mo190244k())) {
            return false;
        }
        return true;
    }

    private IKeyBoardPlugin aa() {
        if (DesktopUtil.m144301a((Context) this.f137878d)) {
            return new DesktopFaceKBPlugin(true, false, new FaceKBPluginDependency(new FacePluginDependency() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass42 */

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
                /* renamed from: a */
                public Fragment mo122020a() {
                    return ThreadDetailView.this.f137876b.mo190271c();
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
                /* renamed from: a */
                public void mo122021a(C40964l lVar) {
                    ThreadDetailView.this.f137877c.mo190204a(C33224n.m128431a(lVar));
                }
            }), true);
        }
        FaceKBPlugin dVar = new FaceKBPlugin(true, false, this.f137876b.mo190262a().getSupportFragmentManager(), new FaceKBPluginDependency(new FacePluginDependency() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass43 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
            /* renamed from: a */
            public Fragment mo122020a() {
                return ThreadDetailView.this.f137876b.mo190271c();
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
            /* renamed from: a */
            public void mo122021a(C40964l lVar) {
                ThreadDetailView.this.f137877c.mo190204a(C33224n.m128431a(lVar));
            }
        }));
        dVar.mo147600a(new IKeyBoardPlugin.IPluginClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass44 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
            /* renamed from: a */
            public void mo122033a() {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "input_emoji", "im_chat_input_emoji_view");
            }
        });
        return dVar;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f137860F.mo92349b();
        RecyclerViewItemDetector<MessageInfo> bVar = this.f137871Q;
        if (bVar != null) {
            bVar.mo123939c();
        }
        C35324c cVar = this.f137884j;
        if (cVar != null) {
            cVar.mo129987f();
            this.f137884j = null;
        }
        KeyBoard fVar = this.f137885k;
        if (fVar != null) {
            fVar.mo146838s();
        }
        C33111af afVar = this.f137887m;
        if (afVar != null) {
            afVar.mo122308a();
            this.f137887m = null;
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: o */
    public int mo190181o() {
        if (this.f137856B.mo134685a("group.dynamic.request.count")) {
            return (int) Math.ceil((double) ((((float) DeviceUtils.getScreenHeight(this.f137878d)) * 1.0f) / ((float) UIHelper.dp2px(75.0f))));
        }
        return 15;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: p */
    public void mo190182p() {
        TextView textView;
        if (DesktopUtil.m144301a((Context) this.f137878d) && !TextUtils.isEmpty(this.f137877c.mo190241h()) && (textView = this.f137875a) != null) {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass18 */

                public void onGlobalLayout() {
                    ThreadDetailView.this.f137875a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ThreadDetailView.this.f137875a.setText(ThreadDetailView.this.f137877c.mo190241h());
                }
            });
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: s */
    public void mo190185s() {
        m216712M();
        m216702C();
        m216707H();
        m216701B();
        m216704E();
        mo190479u();
        ThreadTopicHitPointNew.f135908b.mo187751a(this.f137877c.mo190244k(), this.f137877c.mo190250q());
    }

    /* renamed from: u */
    public void mo190479u() {
        boolean z;
        C35323e eVar = new C35323e(new AbstractC35320b() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$K3bB3p4XZpigzotxM5FFFSJ0Yo */

            @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35320b
            public final Object get() {
                return ThreadDetailView.this.aj();
            }
        });
        FragmentActivity fragmentActivity = this.f137878d;
        NewMessageTip newMessageTip = this.newMessageTopTip;
        NewMessageTip newMessageTip2 = this.newMessageBottomTip;
        if (this.f137885k != null) {
            z = true;
        } else {
            z = false;
        }
        C35324c cVar = new C35324c(fragmentActivity, eVar, newMessageTip, newMessageTip2, z);
        this.f137884j = cVar;
        cVar.mo129983c();
        this.f137884j.mo129973a(new AbstractC35310a.AbstractC35313c() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass12 */

            @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a.AbstractC35313c
            /* renamed from: a */
            public void mo122143a(Message message) {
                int a = ThreadDetailView.this.f137881g.mo190567a(message.getId());
                if (a != -1) {
                    C58996h.m228974a(ThreadDetailView.this.mDetailContentRv, a, 0);
                } else {
                    ThreadDetailView.this.f137877c.mo190192a(message.getThreadPosition(), true);
                }
            }

            @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a.AbstractC35313c
            /* renamed from: a */
            public void mo122142a(int i, boolean z) {
                if (ThreadDetailView.this.f137881g != null) {
                    if (z) {
                        ThreadDetailView.this.f137877c.mo190192a(i, false);
                    } else {
                        Log.m165382e("onNewMessageClick, toBottom is false");
                    }
                }
            }
        });
        this.f137884j.mo129974a(new C35324c.AbstractC35325a() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$sfkqB686MCuhS2xsaZGhrVIG9NQ */

            @Override // com.ss.android.lark.chatwindow.view.tip.C35324c.AbstractC35325a
            public final void onAtMessageChanged(int i) {
                ThreadDetailView.this.m216749g((ThreadDetailView) i);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.threaddetail.view.ThreadDetailView$60  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass60 {

        /* renamed from: a */
        static final /* synthetic */ int[] f137988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.chat.entity.message.Message$Type[] r0 = com.ss.android.lark.chat.entity.message.Message.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a = r0
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MEDIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.IMAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MERGE_FORWARD     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.CARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.CALENDAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.f137988a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.TODO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass60.<clinit>():void");
        }
    }

    /* renamed from: I */
    private void m216708I() {
        Log.m165389i("ThreadDetailRefactor", "view refactor");
        final C55906d dVar = new C55906d();
        C558507 r1 = new C58984d<C55905a, C55906d.C55908a>(dVar.mo190626a()) {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558507 */

            /* renamed from: a */
            public boolean mo123399a(C55905a aVar) {
                if (super.mo123399a((Object) aVar) && ThreadDetailView.this.f137886l == 1 && aVar.mo190570A()) {
                    return true;
                }
                return false;
            }
        };
        r1.mo200100a((C58984d.AbstractC58985a) new C58984d.AbstractC58985a() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558518 */

            @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58985a
            /* renamed from: a */
            public void mo190524a() {
                dVar.notifyDataSetChanged();
            }

            @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58985a
            /* renamed from: a */
            public void mo190525a(int i) {
                dVar.notifyItemChanged(i);
            }
        });
        dVar.mo200127a(C57852m.m224554a(this.f137878d));
        C55934b bVar = new C55934b(this.f137878d, dVar, new C55934b.AbstractC55935a() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$EhJcvfNKhL9Rf9ZjRM_ewmWBsyU */

            @Override // com.ss.android.lark.threaddetail.view.message.C55934b.AbstractC55935a
            public final Chat getChat() {
                return ThreadDetailView.this.ai();
            }
        }, new C55934b.AbstractC55936b() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$Ee2v3mAzMwebwPse3ygnDNzuv7Q */

            @Override // com.ss.android.lark.threaddetail.view.message.C55934b.AbstractC55936b
            public final String getThreadId() {
                return ThreadDetailView.this.ah();
            }
        });
        bVar.mo190685a(r1);
        m216733a(bVar);
        C55916a.m217236a(bVar, this, this.f137874T, this.f137873S).mo190655a(dVar);
        this.mDetailContentRv.setAdapter(dVar);
        dVar.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558529 */

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
                ThreadDetailView.this.mo190442a(i, i2);
            }
        });
        this.f137881g = dVar;
        this.f137882h = r1;
    }

    /* renamed from: J */
    private void m216709J() {
        View view;
        if (this.f137893s == null) {
            ViewStub viewStub = this.mMultiSelectStub;
            if (viewStub != null) {
                view = viewStub.inflate();
                this.mMultiSelectStub = null;
            } else {
                view = this.mRootLayout;
            }
            this.f137893s = view.findViewById(R.id.multi_select_menu_container);
            this.f137894t = view.findViewById(R.id.multi_forward_wrapper);
            this.f137895u = view.findViewById(R.id.multi_save_wrapper);
            this.f137896v = view.findViewById(R.id.multi_todo_wrapper);
            Chat k = this.f137877c.mo190244k();
            if (k == null || k.isSuper() || m216715P() || !m216714O()) {
                this.f137896v.setVisibility(8);
            } else {
                this.f137896v.setVisibility(0);
            }
        }
    }

    /* renamed from: L */
    private void m216711L() {
        if (this.f137892r) {
            IInputSupportPlugin d = this.f137885k.mo146821d("input_richtext_expand");
            if (d != null && (d instanceof BaseRichTextInputPlugin)) {
                ((BaseRichTextInputPlugin) d).mo147045b(UIHelper.getString(R.string.Lark_Chat_TopicClosedInputWindowPlaceholder));
            }
            IInputSupportPlugin d2 = this.f137885k.mo146821d("input_richtext_shrink");
            if (d2 != null && (d2 instanceof BaseRichTextInputPlugin)) {
                ((BaseRichTextInputPlugin) d).mo147045b(UIHelper.getString(R.string.Lark_Chat_TopicClosedInputWindowPlaceholder));
                return;
            }
            return;
        }
        PostInputSupportPlugin bVar = (PostInputSupportPlugin) this.f137885k.mo146821d("post");
        if (bVar != null) {
            bVar.mo147207a(UIHelper.getString(R.string.Lark_Chat_TopicClosedInputWindowPlaceholder));
        }
        TextInputSupportPlugin cVar = (TextInputSupportPlugin) this.f137885k.mo146821d("text");
        if (cVar != null) {
            cVar.mo147252a(UIHelper.getString(R.string.Lark_Chat_TopicClosedInputWindowPlaceholder), 0);
        }
    }

    /* renamed from: N */
    private boolean m216713N() {
        boolean z = false;
        if (this.f137877c.mo190253t() == null || this.f137877c.mo190253t().getMessage() == null) {
            return false;
        }
        Message message = this.f137877c.mo190253t().getMessage();
        if (this.f137877c.mo190244k() != null && this.f137877c.mo190244k().isSuper()) {
            z = true;
        }
        return C34352r.m133233a(z, message.getType(), message.isPreMessage(), message.isRecalled());
    }

    /* renamed from: U */
    private boolean m216720U() {
        if (this.f137877c.mo190253t() == null || this.f137877c.mo190247n().getAnonymousId() == null || TextUtils.isEmpty(this.f137877c.mo190247n().getAnonymousId())) {
            return false;
        }
        return TextUtils.equals(this.f137877c.mo190247n().getAnonymousId(), this.f137877c.mo190253t().getMessage().getFromId());
    }

    /* renamed from: V */
    private void m216721V() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIHelper.getString(R.string.Lark_Chat_RecallTopicConfirmationButton));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.function_danger_500)), 0, spannableStringBuilder.length(), 33);
        new C25639g(this.f137878d).mo89248g(R.string.Lark_Chat_RecallTopicConfirmationTitle).mo89238b(true).mo89254m(R.string.Lark_Chat_RecallTopicConfirmationDesc).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_TopicToolDeleteTipCancel, $$Lambda$ThreadDetailView$2tUHMNBmXw0dYjIQHOsdrvBrgM.INSTANCE).mo89225a(R.id.lkui_dialog_btn_right, spannableStringBuilder, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$tir88koazuJwRQ1gg45y1ExwWjg */

            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadDetailView.this.m216729a((ThreadDetailView) dialogInterface, (DialogInterface) i);
            }
        }).mo89239c();
    }

    private boolean ac() {
        if (this.f137877c.mo190244k() == null) {
            return false;
        }
        Log.m165389i("ThreadDetailView", "chatID : " + this.f137877c.mo190244k().getId() + " , AnonymousSetting : " + this.f137877c.mo190244k().getAnonymousSetting());
        if (!C56145l.m218887b() || this.f137877c.mo190244k().getAnonymousSetting() != Chat.AnonymousSetting.ALLOWED || !this.f137877c.mo190247n().isAnonymousEnable()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public void mo190480v() {
        String str;
        Context a = C29990c.m110930b().mo134528a();
        StringBuilder sb = new StringBuilder(UIUtils.getString(a, R.string.Lark_Legacy_Reply) + " ");
        sb.append(C34340h.m133174a(this.f137877c.mo190243j(), ChatterNameDisplayRule.ALIAS_NICKNAME_NAME) + "：");
        if (TextUtils.isEmpty(this.f137877c.mo190242i())) {
            str = this.f137877c.mo190251r();
        } else {
            str = this.f137877c.mo190242i();
        }
        sb.append(str);
        String sb2 = sb.toString();
        String q = this.f137877c.mo190250q();
        this.f137885k.mo146797a(new KeyBoard.ReplyInfo(q, q, sb2, null, null, null));
    }

    /* renamed from: w */
    public void mo190481w() {
        final List<C55905a> a = this.f137882h.mo200097a();
        if (CollectionUtils.isEmpty(a)) {
            mo190161b(UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121868c, ChatTypeStateKeeper.f135670e);
            jSONObject.put("sub_source", "topic_multi_comment");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Statistics.sendEvent("todo_create", jSONObject);
        MultiSelectHitPointNew.f135853b.mo187669b(this.f137877c.mo190244k(), a, "create_todo", "todo_create_view");
        final Chat k = this.f137877c.mo190244k();
        C29990c.m110930b().ak().mo86324b(Domain.message, this.f137877c.mo190250q(), BlockTypeID.MESSAGE, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass17 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ThreadDetailView", errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put("chat_id", (Object) k.getId());
                jSONObject.put("is_public", (Object) Boolean.valueOf(k.isPublic()));
                BlockEntity a = C29990c.m110930b().ak().mo86315a(str, BlockTypeID.CHAT, "", "", jSONObject.toJSONString(), "", "");
                BlockExtra blockExtra = new BlockExtra();
                MultiMessage multiMessage = new MultiMessage();
                multiMessage.chatId = k.getId();
                multiMessage.messageIds = ThreadDetailView.this.mo190472e(a);
                blockExtra.multiMessage = multiMessage;
                blockExtra.sceneType = BlockExtra.SceneType.THREAD_MULTI;
                blockExtra.richTextMessage = new RichTextMessage(Message.Type.UNKNOWN, new MessageContentEntity(new TextEntity(C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromTopic, "Topic", k.getName())), null)));
                C29990c.m110930b().ak().mo86317a(ThreadDetailView.this.f137878d, ActionType.Todo, a, blockExtra);
                ThreadDetailView.this.mo190177k();
            }
        });
    }

    /* renamed from: z */
    public void mo190484z() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIHelper.getString(R.string.Lark_Groups_TopicToolClose));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.function_danger_500)), 0, spannableStringBuilder.length(), 33);
        new C25639g(this.f137878d).mo89248g(R.string.Lark_Groups_TopicToolClose).mo89238b(true).mo89254m(R.string.Lark_Groups_ClosePostPopUpWindowDescription).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_TopicToolDeleteTipCancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$RhscaRbBE4SUptJ7GU70kEpg7U */

            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadDetailView.this.m216743d((ThreadDetailView) dialogInterface, (DialogInterface) i);
            }
        }).mo89225a(R.id.lkui_dialog_btn_right, spannableStringBuilder, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$UGxdlMYz0pfk4TapTjFUFuDDTNs */

            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadDetailView.this.m216742c((ThreadDetailView) dialogInterface, (DialogInterface) i);
            }
        }).mo89239c();
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: b */
    public void mo190160b() {
        this.mPtrFrame.refreshComplete();
    }

    /* renamed from: E */
    private void m216704E() {
        KeyBoard fVar = new KeyBoard(this.f137878d, this.mKeyBoardContainer, new IKeyBoardDependency() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass63 */

            @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
            /* renamed from: a */
            public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
            }

            @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
            /* renamed from: a */
            public void mo122097a(boolean z, final IKeyBoardDependency.IResetDraftCallback bVar) {
                ThreadDetailView.this.f137877c.mo190205a(new AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass63.C558491 */

                    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b.AbstractC55770a.AbstractC55771a
                    /* renamed from: a */
                    public void mo190260a(RichText richText, String str, RichText richText2) {
                        bVar.mo146859a(richText, str, richText2, null);
                    }
                });
            }

            @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
            /* renamed from: a */
            public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
                if (ThreadDetailView.this.f137892r) {
                    ThreadDetailView.this.f137877c.mo190230c();
                }
                ThreadDetailView.this.f137877c.mo190208a(str, richText, str2, richText2, z);
            }
        });
        this.f137885k = fVar;
        fVar.mo146801a(new AutoAdjustSizeLayoutManager());
        this.f137885k.mo146795a(KeyboardScene.ThreadMain);
        this.f137885k.mo146806a("face", aa());
        this.f137885k.mo146806a("at", m216724Y());
        if (!DesktopUtil.m144301a((Context) this.f137878d)) {
            this.f137885k.mo146806a("voice", m216706G());
        }
        this.f137885k.mo146806a("photo", m216725Z());
        this.f137890p = new KeyboardPluginController(this.f137885k, new ArrayList(Arrays.asList("aa_editor", "at", "face", "voice", "photo")));
        if (this.f137892r) {
            this.f137885k.mo146806a("aa_editor", m216705F());
        }
        if (this.f137892r) {
            this.f137885k.mo146804a("input_richtext_shrink", m216735b(this.f137877c.mo190248o(), this.f137877c.mo190254u()));
            this.f137885k.mo146804a("input_richtext_expand", m216741c(this.f137877c.mo190248o(), this.f137877c.mo190254u()));
        } else {
            this.f137885k.mo146804a("text", m216745e(this.f137877c.mo190248o()));
            this.f137885k.mo146804a("post", m216747f(this.f137877c.mo190248o()));
        }
        mo190480v();
        this.f137885k.mo146817b(false);
        this.f137885k.mo146796a(new IKeyBoardStatusListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.C558372 */

            @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
            /* renamed from: a */
            public void mo122008a(int i) {
                if (!ThreadDetailView.this.f137885k.mo146818b("post") && !ThreadDetailView.this.f137885k.mo146818b("input_richtext_expand")) {
                    ThreadDetailView.this.mo190441a(i);
                }
            }

            @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
            /* renamed from: a */
            public void mo122009a(boolean z, int i, String str) {
                if (!ThreadDetailView.this.f137885k.mo146818b("post") && !ThreadDetailView.this.f137885k.mo146818b("input_richtext_expand")) {
                    ThreadDetailView.this.mo190441a(i);
                    if (z) {
                        ((LinearLayoutManager) ThreadDetailView.this.mDetailContentRv.getLayoutManager()).scrollToPosition(ThreadDetailView.this.f137881g.getItemCount() - 1);
                        return;
                    }
                    C58996h.m228975a(ThreadDetailView.this.mDetailContentRv, false);
                    Log.m165389i("ThreadDetailView", "checkToUpdateRecyclerViewStack true ");
                }
            }
        });
        if (DesktopUtil.m144301a((Context) this.f137878d)) {
            this.mKeyboardShadow.getLayoutParams().height = UIHelper.dp2px(1.0f);
            this.mKeyboardShadow.setBackgroundColor(UIHelper.getColor(R.color.line_border_card));
        }
        this.f137885k.mo146842w();
    }

    /* renamed from: M */
    private void m216712M() {
        if (DesktopUtil.m144301a((Context) this.f137878d) && this.f137868N) {
            this.mTitleBar.setLeftVisible(false);
        }
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass22 */

            public void onClick(View view) {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "close", "none");
                KeyboardUtils.hideKeyboard(ThreadDetailView.this.f137876b.mo190262a());
                ThreadDetailView.this.f137876b.mo190270b();
            }
        });
        if (this.f137897w == null) {
            View inflate = LayoutInflater.from(this.f137878d).inflate(R.layout.thread_detail_titlebar, (ViewGroup) null);
            this.f137897w = inflate;
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass24 */

                public void onClick(View view) {
                    if (ThreadDetailView.this.f137886l == 0) {
                        ThreadTopicHitPoint.f135906a.mo187724c();
                        ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "from_topic_group", "im_chat_main_view");
                        ThreadDetailView.this.f137877c.mo190220a(ThreadDetailView.this.f137889o);
                    }
                }
            });
            this.f137875a = (TextView) this.f137897w.findViewById(R.id.tv_thread_title);
            this.f137898x = (TextView) this.f137897w.findViewById(R.id.tv_thread_subtitle);
            this.f137899y = (ImageView) this.f137897w.findViewById(R.id.iv_right_arrow);
            this.f137897w.setVisibility(8);
            this.mTitleBar.setCustomTitleView(this.f137897w);
            this.f137875a.getPaint().setFakeBoldText(true);
        }
        if (DesktopUtil.m144301a((Context) this.f137878d)) {
            this.f137875a.setTextSize(16.0f);
        }
        this.mTitleBar.setDividerVisible(true);
        this.mTitleBar.removeAllActions();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIHelper.dp2px(44.0f), UIHelper.dp2px(24.0f));
        layoutParams.gravity = 16;
        this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.ud_icon_forward_outlined, R.color.icon_n1) {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass25 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                boolean z;
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "forward", "im_msg_forward_select_view");
                Chat k = ThreadDetailView.this.f137877c.mo190244k();
                if (k == null || !k.isPublic()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ThreadDetailView threadDetailView = ThreadDetailView.this;
                    threadDetailView.mo190453a(threadDetailView.f137877c.mo190253t(), "quick_click");
                    return;
                }
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(ThreadDetailView.this.f137877c.mo190250q());
                C29990c.m110930b().mo134506E().mo134368a(ThreadDetailView.this.f137878d, ThreadDetailView.this.f137877c.mo190244k(), arrayList, ThreadDetailView.this.f137877c.mo190250q(), 9, "quick_click", "thread_details");
            }
        }, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(UIHelper.dp2px(44.0f), UIHelper.dp2px(24.0f));
        layoutParams2.gravity = 16;
        LKUILottieAnimationView lKUILottieAnimationView = new LKUILottieAnimationView(this.f137878d);
        this.f137862H = lKUILottieAnimationView;
        lKUILottieAnimationView.setRepeatCount(0);
        AnonymousClass26 r5 = new IActionTitlebar.C57575b(this.f137862H) {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass26 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "subscribe", "none");
                ThreadDetailView threadDetailView = ThreadDetailView.this;
                threadDetailView.mo190158a(!ThreadDetailView.this.f137877c.mo190248o(), threadDetailView.f137877c.mo190254u(), true);
                if (ThreadDetailView.this.f137877c.mo190248o()) {
                    ThreadTopicHitPoint.f135906a.mo187718a(ThreadDetailView.this.f137877c.mo190250q(), ThreadDetailView.this.f137877c.mo190245l(), ChatTypeStateKeeper.f135670e);
                    ThreadDetailView.this.f137877c.mo190190a();
                    return;
                }
                ThreadTopicHitPoint.f135906a.mo187723b(ThreadDetailView.this.f137877c.mo190250q(), ThreadDetailView.this.f137877c.mo190245l(), ChatTypeStateKeeper.f135670e);
                ThreadDetailView.this.f137877c.mo190223b();
            }
        };
        this.f137900z = r5;
        this.mTitleBar.addAction(r5, layoutParams2);
        mo190158a(this.f137877c.mo190248o(), this.f137877c.mo190254u(), false);
        m216730a(this.f137862H, this.f137877c.mo190248o());
        mo190167c(this.f137877c.mo190254u());
        if (!this.f137877c.mo190258y()) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(UIHelper.dp2px(44.0f), UIHelper.dp2px(24.0f));
            layoutParams3.gravity = 16;
            this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.ud_icon_more_outlined, R.color.icon_n1) {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass27 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "more", "im_msg_menu_more_view");
                    ThreadDetailView.this.mo190483y();
                }
            }, layoutParams3);
        }
    }

    /* renamed from: y */
    public void mo190483y() {
        int i;
        boolean z;
        int i2;
        int[] iArr = new int[2];
        this.mTitleBar.getLocationOnScreen(iArr);
        View inflate = LayoutInflater.from(this.f137878d).inflate(R.layout.layout_thread_window_operation_menu, (ViewGroup) null);
        final Dialog a = C57811b.m224342a((Context) this.f137878d, inflate, (int) R.style.customDialog, true);
        float[] fArr = {12.0f, (float) UIHelper.px2dp((float) ((iArr[1] + this.mTitleBar.getHeight()) - DeviceUtils.getStatusHeight(this.f137878d)))};
        boolean S = m216718S();
        if (this.f137877c.mo190256w() && !Objects.equals(this.f137877c.mo190247n().getOwnerId(), this.f137855A.mo134394a())) {
            m216720U();
        }
        TextView textView = (TextView) inflate.findViewById(R.id.btn_forward_topic);
        View findViewById = inflate.findViewById(R.id.forward_pin_divider);
        TextView textView2 = (TextView) inflate.findViewById(R.id.btn_delete_topic);
        View findViewById2 = inflate.findViewById(R.id.btn_pin_divider);
        View findViewById3 = inflate.findViewById(R.id.share_pin_divider);
        TextView textView3 = (TextView) inflate.findViewById(R.id.btn_share_topic);
        TextView textView4 = (TextView) inflate.findViewById(R.id.btn_pin_topic);
        TextView textView5 = (TextView) inflate.findViewById(R.id.btn_change_close_status);
        View findViewById4 = inflate.findViewById(R.id.close_delete_divider);
        View findViewById5 = inflate.findViewById(R.id.translate_divider);
        TextView textView6 = (TextView) inflate.findViewById(R.id.translate_menu);
        View findViewById6 = inflate.findViewById(R.id.translate_setting_divider);
        TextView textView7 = (TextView) inflate.findViewById(R.id.translate_setting_menu);
        View findViewById7 = inflate.findViewById(R.id.btn_delete_topic_divider);
        TextView textView8 = (TextView) inflate.findViewById(R.id.btn_todo);
        View findViewById8 = inflate.findViewById(R.id.btn_todo_divider);
        if (m216716Q()) {
            m216731a(textView, R.drawable.ud_icon_forward_outlined);
            i = 0;
            textView.setVisibility(0);
            findViewById.setVisibility(0);
        } else {
            i = 0;
            textView.setVisibility(8);
            findViewById.setVisibility(8);
        }
        if (S) {
            m216731a(textView2, R.drawable.ud_icon_recall_outlined);
            textView2.setVisibility(i);
        } else {
            textView2.setVisibility(8);
        }
        if (m216740b(this.f137877c.mo190244k())) {
            m216731a(textView3, R.drawable.ud_icon_share_outlined);
            textView3.setVisibility(i);
            findViewById3.setVisibility(i);
        } else {
            textView3.setVisibility(8);
            findViewById3.setVisibility(8);
        }
        if (!m216714O() || !m216713N() || m216715P()) {
            textView8.setVisibility(8);
            findViewById8.setVisibility(8);
        } else {
            m216731a(textView8, R.drawable.ud_icon_tab_todo_outlined);
            textView8.setVisibility(0);
            if (m216717R() || S) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById8.setVisibility(i2);
        }
        if (!this.f137877c.mo190257x() || !C29990c.m110930b().mo134595w().mo134363b(this.f137877c.mo190244k())) {
            textView4.setVisibility(8);
            findViewById2.setVisibility(8);
        } else {
            textView4.setVisibility(0);
            findViewById2.setVisibility(0);
        }
        if (this.f137877c.mo190253t() == null || this.f137877c.mo190253t().getPin() == null) {
            textView4.setText(UIHelper.getString(R.string.Lark_Pin_PinButton));
            m216731a(textView4, R.drawable.ud_icon_pin_outlined);
        } else {
            textView4.setText(UIHelper.getString(R.string.Lark_Pin_UnpinButton));
            m216731a(textView4, R.drawable.ud_icon_unpin_outlined);
        }
        if (m216717R()) {
            textView5.setVisibility(0);
            findViewById4.setVisibility(0);
            if (this.f137877c.mo190254u()) {
                textView5.setText(UIHelper.getString(R.string.Lark_Chat_TopicToolReopen));
                m216731a(textView5, R.drawable.ud_icon_yes_outlined);
            } else {
                textView5.setText(UIHelper.getString(R.string.Lark_Groups_TopicToolClose));
                m216731a(textView5, R.drawable.ud_icon_no_outlined);
            }
        } else {
            textView5.setVisibility(8);
            findViewById4.setVisibility(8);
        }
        findViewById7.setVisibility(8);
        findViewById5.setVisibility(8);
        textView6.setVisibility(8);
        m216731a(textView6, R.drawable.ud_icon_translate_outlined);
        findViewById6.setVisibility(8);
        textView7.setVisibility(8);
        m216731a(textView7, R.drawable.ud_icon_setting_outlined);
        textView2.setOnClickListener(new View.OnClickListener(a) {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$apvBq3TLYpTLpEEFIfFQQCFu9xU */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                ThreadDetailView.this.m216738b((ThreadDetailView) this.f$1, (Dialog) view);
            }
        });
        textView8.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass28 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadTopicHitPointNew.f135908b.mo187750a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190253t(), "todo", "todo_create_view");
                ThreadDetailView threadDetailView = ThreadDetailView.this;
                threadDetailView.mo190457a(threadDetailView.f137877c.mo190250q(), ThreadDetailView.this.f137877c.mo190253t(), true, true);
                a.dismiss();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener(a) {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$4XcGTlsXJbuGjCtSxNEi1nQZFw */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                ThreadDetailView.this.m216728a((ThreadDetailView) this.f$1, (Dialog) view);
            }
        });
        textView3.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass29 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadDetailView threadDetailView = ThreadDetailView.this;
                threadDetailView.mo190453a(threadDetailView.f137877c.mo190253t(), "topic_click");
                a.dismiss();
            }
        });
        textView5.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass30 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (ThreadDetailView.this.f137877c.mo190254u()) {
                    ThreadTopicHitPoint.f135906a.mo187722b(ThreadDetailView.this.f137877c.mo190245l(), ThreadDetailView.this.f137877c.mo190250q());
                    ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicToolCloseToastTip));
                    ThreadDetailView.this.f137877c.mo190229b(false);
                } else {
                    ThreadTopicHitPointNew.f135908b.mo187750a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190253t(), "close_topic", "none");
                    ThreadDetailView.this.mo190484z();
                    ThreadTopicHitPoint.f135906a.mo187716a(ThreadDetailView.this.f137877c.mo190245l(), ThreadDetailView.this.f137877c.mo190250q());
                }
                a.dismiss();
            }
        });
        textView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass31 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(ThreadDetailView.this.f137877c.mo190250q());
                C29990c.m110930b().mo134506E().mo134368a(ThreadDetailView.this.f137878d, ThreadDetailView.this.f137877c.mo190244k(), arrayList, ThreadDetailView.this.f137877c.mo190250q(), 9, "topic_click", "thread_details");
                a.dismiss();
            }
        });
        ThreadTopicHitPointNew.f135908b.mo187749a(this.f137877c.mo190244k(), this.f137877c.mo190253t());
        C57810a.m224339c(this.f137878d, a, fArr);
        if (DesktopUtil.m144307b()) {
            a.getWindow().setWindowAnimations(0);
        }
    }

    /* renamed from: f */
    private void m216748f(int i) {
        this.f137886l = i;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: l */
    public void mo122768l(String str) {
        this.f137877c.mo190225b(this.f137878d, str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: m */
    public void mo122769m(String str) {
        this.f137877c.mo190238e(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: n */
    public void mo122770n(String str) {
        this.f137877c.mo190231c(this.f137878d, str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
    /* renamed from: u */
    public void mo123362u(String str) {
        this.f137877c.mo190193a(this.f137878d, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m216749g(int i) {
        if (i != -1) {
            this.f137877c.mo190191a(i);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: c */
    public void mo190165c(String str) {
        this.f137876b.mo190264a(this.f137878d, str);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: i */
    public void mo190477i(String str) {
        C33111af afVar = this.f137887m;
        if (afVar != null) {
            afVar.mo122312a(str);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: k */
    public void mo122767k(String str) {
        this.f137877c.mo190207a(str, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass59 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C29990c.m110930b().mo134593u().mo134331a(ThreadDetailView.this.f137878d, str, 2);
            }
        });
    }

    /* renamed from: b */
    private List<MessageInfo> m216736b(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            return new ArrayList();
        }
        return this.f137881g.mo190627a(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), true);
    }

    /* renamed from: e */
    public ArrayList<String> mo190472e(List<C55905a> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (C55905a aVar : list) {
            arrayList.add(aVar.mo190608k());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: d */
    public void mo190169d(String str) {
        new C25639g(this.f137878d).mo89237b(str).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$cQzg2guHCNvyga11lICf5fJ3PLo */

            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadDetailView.this.m216746e(dialogInterface, i);
            }
        }).mo89246d(false).mo89239c().setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass20 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return true;
                }
                ThreadDetailView.this.mo190175i();
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55868d
    /* renamed from: e */
    public void mo190473e(int i) {
        MessageInfo f = this.f137881g.mo190569b(i).mo190598f();
        if (f != null) {
            this.f137877c.mo190202a(f);
        }
    }

    /* renamed from: f */
    public void mo190474f(String str) {
        WindowDialogManager.f91123a.mo129819a(new C25639g(this.f137878d).mo89242c(str).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_ShareAlertOK), (DialogInterface.OnClickListener) null).mo89239c());
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: h */
    public void mo190476h(String str) {
        if (str != null) {
            C29990c.m110930b().mo134523V().mo134436a(this.f137878d, new ProfileSource.C36868a().mo136066c(str).mo136065b(this.f137877c.mo190245l()).mo136064b(4).mo136060a(4).mo136062a(C34339g.m133170d(this.f137877c.mo190244k())).mo136063a());
        }
    }

    /* renamed from: d */
    private void m216744d(boolean z) {
        if (!ac()) {
            if (this.f137892r) {
                IInputSupportPlugin d = this.f137885k.mo146821d("input_richtext_expand");
                if (d != null && (d instanceof BaseRichTextInputPlugin)) {
                    ((BaseRichTextInputPlugin) d).mo147045b(UIHelper.getString(R.string.Lark_Chat_TopicFollowedReplyPlaceholder));
                }
                IInputSupportPlugin d2 = this.f137885k.mo146821d("input_richtext_shrink");
                if (d2 != null && (d2 instanceof BaseRichTextInputPlugin)) {
                    ((BaseRichTextInputPlugin) d).mo147045b(UIHelper.getString(R.string.Lark_Chat_TopicFollowedReplyPlaceholder));
                    return;
                }
                return;
            }
            PostInputSupportPlugin bVar = (PostInputSupportPlugin) this.f137885k.mo146821d("post");
            if (bVar != null) {
                bVar.mo147207a(UIHelper.getString(R.string.Lark_Chat_TopicFollowedReplyPlaceholder));
            }
            TextInputSupportPlugin cVar = (TextInputSupportPlugin) this.f137885k.mo146821d("text");
            if (cVar != null) {
                cVar.mo147252a(UIHelper.getString(R.string.Lark_Chat_TopicFollowedReplyPlaceholder), 0);
            }
        }
    }

    /* renamed from: f */
    private IInputSupportPlugin m216747f(boolean z) {
        String str;
        if (z) {
            str = UIHelper.getString(R.string.Lark_Chat_TopicFollowedReplyPlaceholder);
        } else {
            str = UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_ReplyBox_Hint);
        }
        PostInputSupportPlugin bVar = new PostInputSupportPlugin(str, new OnSendPostCallback() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass55 */

            @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
            /* renamed from: a */
            public void mo123219a() {
                if (ThreadDetailView.this.f137877c.mo190254u()) {
                    ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicClosedReplyErrorTips));
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ IPhotoDependency.Image m216953a(com.ss.android.lark.image.entity.Image image) throws Exception {
                return new IPhotoDependency.Image(image.getUrls(), image.getWidth(), image.getHeight(), image.getToken());
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
            /* renamed from: a */
            public Observable<IPhotoDependency.Image> mo123218a(List<String> list, boolean z, AbstractC25974h hVar) {
                return C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Thread).map($$Lambda$ThreadDetailView$55$dwU7B83SRl52HZUwMiSmrNM1_Hs.INSTANCE);
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
            /* renamed from: a */
            public void mo123220a(String str, String str2, RichText richText) {
                ThreadDetailView.this.f137877c.mo190210a(ThreadDetailView.this.f137885k.mo146836q(), ThreadDetailView.this.f137885k.mo146837r(), richText);
                ThreadDetailView.this.mo190480v();
                ThreadDetailView.this.f137885k.mo146830k();
            }
        });
        bVar.mo147206a(new PostInputSupportPlugin.ILifeCycleCallback() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass57 */

            @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.ILifeCycleCallback
            /* renamed from: b */
            public void mo123217b() {
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.ILifeCycleCallback
            /* renamed from: a */
            public void mo123216a() {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "post", "im_chat_post_view");
                ThreadDetailView.this.f137890p.mo190436a(1, ThreadDetailView.this.f137891q);
            }
        });
        if (!ac()) {
            return bVar;
        }
        if (this.f137891q == -1) {
            this.f137891q = !TextUtils.isEmpty(this.f137877c.mo190247n().getAnonymousId()) ? 1 : 0;
        }
        C28702a aVar = new C28702a(new C28702a.AbstractC28706a() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass58 */

            @Override // com.ss.android.lark.anonymous.plugin.C28702a.AbstractC28706a
            /* renamed from: a */
            public void mo102102a(int i) {
                ThreadDetailView.this.mo190469c(i);
            }

            @Override // com.ss.android.lark.anonymous.plugin.C28702a.AbstractC28706a
            /* renamed from: a */
            public void mo102103a(IGetDataCallback<Long> iGetDataCallback) {
                ThreadDetailView.this.f137877c.mo190197a(iGetDataCallback);
            }
        }, this.f137877c.mo190246m(), this.f137891q, false);
        this.f137869O = aVar;
        bVar.mo147009a("input_addition", aVar.mo102096a("input_addition"));
        bVar.mo147009a("input_pop", this.f137869O.mo102096a("input_pop"));
        return bVar;
    }

    /* renamed from: c */
    public void mo190469c(int i) {
        String str;
        this.f137891q = i;
        this.f137877c.mo190224b(i);
        C28702a aVar = this.f137869O;
        if (aVar != null) {
            aVar.mo102098a(i);
        }
        C28702a aVar2 = this.f137870P;
        if (aVar2 != null) {
            aVar2.mo102098a(i);
        }
        if (i == 0) {
            str = UIHelper.getString(R.string.Lark_Group_NewTopicRichtextTip);
        } else {
            str = UIHelper.getString(R.string.Lark_Groups_ReplyAnonymouslyPlaceholder);
        }
        if (!this.f137892r) {
            TextInputSupportPlugin cVar = (TextInputSupportPlugin) this.f137885k.mo146821d("text");
            PostInputSupportPlugin bVar = (PostInputSupportPlugin) this.f137885k.mo146821d("post");
            if (cVar != null) {
                cVar.mo147251a((CharSequence) str);
            }
            if (bVar != null) {
                bVar.mo147207a(str);
            }
        } else {
            RichTextInputShrinkPlugin dVar = (RichTextInputShrinkPlugin) this.f137885k.mo146821d("input_richtext_shrink");
            RichTextInputShrinkPlugin dVar2 = (RichTextInputShrinkPlugin) this.f137885k.mo146821d("input_richtext_expand");
            if (dVar != null) {
                dVar.mo147045b(str);
            }
            if (dVar2 != null) {
                dVar2.mo147045b(str);
            }
        }
        KeyboardPluginController keyboardPluginController = this.f137890p;
        if (keyboardPluginController != null) {
            keyboardPluginController.mo190436a(ab(), i);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: e */
    public void mo190171e(String str) {
        WindowDialogManager.f91123a.mo129819a(new C25639g(this.f137878d).mo89237b(str).mo89238b(true).mo89251j(2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89239c());
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
    /* renamed from: g */
    public void mo190475g(String str) {
        if (!TextUtils.isEmpty(str)) {
            C29990c.m110930b().mo134523V().mo134436a(this.f137878d, new ProfileSource.C36868a().mo136066c(str).mo136065b(this.f137877c.mo190245l()).mo136064b(4).mo136060a(0).mo136062a(C34339g.m133170d(this.f137877c.mo190244k())).mo136063a());
        }
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55867c
    /* renamed from: j */
    public void mo190478j(String str) {
        if (!this.f137882h.mo200107c() && !TextUtils.isEmpty(str)) {
            C29990c.m110930b().mo134523V().mo134436a(this.f137878d, new ProfileSource.C36868a().mo136066c(str).mo136065b(this.f137877c.mo190245l()).mo136064b(4).mo136060a(5).mo136062a(C34339g.m133170d(this.f137877c.mo190244k())).mo136063a());
        }
    }

    /* renamed from: e */
    private IInputSupportPlugin m216745e(boolean z) {
        String str;
        if (z) {
            str = UIHelper.getString(R.string.Lark_Chat_TopicFollowedReplyPlaceholder);
        } else {
            str = UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_ReplyBox_Hint);
        }
        TextInputSupportPlugin cVar = new TextInputSupportPlugin(false, str, UIHelper.getColor(R.color.ud_N400), new AbstractC58541b() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass50 */

            @Override // com.ss.android.lark.widget.listener.AbstractC58541b
            /* renamed from: a */
            public void mo122053a(List<String> list) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (!new File(str).isDirectory()) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ThreadDetailView.this.mo190462a(true, (List<String>) arrayList);
                }
            }
        }, new OnSendTextCallback() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass51 */

            @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
            /* renamed from: a */
            public void mo122054a() {
                if (ThreadDetailView.this.f137877c.mo190254u()) {
                    ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicClosedReplyErrorTips));
                }
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
            /* renamed from: a */
            public void mo122055a(String str, RichText richText) {
                ThreadDetailView.this.f137877c.mo190212a(ThreadDetailView.this.f137885k.mo146836q(), ThreadDetailView.this.f137885k.mo146837r(), str, richText);
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass51.RunnableC558461 */

                    public void run() {
                        ThreadDetailView.this.mo190480v();
                    }
                });
            }
        }, new IOnLifeCallback() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass52 */

            @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
            /* renamed from: a */
            public void mo122056a() {
                ThreadDetailView.this.mRootLayout.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass52.RunnableC558471 */

                    public void run() {
                        if (ThreadDetailView.this.f137884j != null && ThreadDetailView.this.f137883i) {
                            ThreadDetailView.this.f137884j.mo129991j();
                        }
                    }
                }, 200);
                ThreadDetailView.this.f137890p.mo190436a(0, ThreadDetailView.this.f137891q);
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
            /* renamed from: b */
            public void mo122057b() {
                if (ThreadDetailView.this.f137884j != null && ThreadDetailView.this.f137883i) {
                    ThreadDetailView.this.f137884j.mo129990i();
                }
            }
        }, false);
        cVar.mo147260d(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f137885k.mo146819c("at"));
        arrayList.add(this.f137885k.mo146819c("face"));
        if (!DesktopUtil.m144301a((Context) this.f137878d)) {
            arrayList.add(this.f137885k.mo146819c("voice"));
        }
        arrayList.add(this.f137885k.mo146819c("photo"));
        cVar.mo147255a(arrayList);
        if (!ac()) {
            return cVar;
        }
        this.f137891q = !TextUtils.isEmpty(this.f137877c.mo190247n().getAnonymousId()) ? 1 : 0;
        C28702a aVar = new C28702a(new C28702a.AbstractC28706a() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass53 */

            @Override // com.ss.android.lark.anonymous.plugin.C28702a.AbstractC28706a
            /* renamed from: a */
            public void mo102102a(int i) {
                ThreadDetailView.this.mo190469c(i);
            }

            @Override // com.ss.android.lark.anonymous.plugin.C28702a.AbstractC28706a
            /* renamed from: a */
            public void mo102103a(IGetDataCallback<Long> iGetDataCallback) {
                ThreadDetailView.this.f137877c.mo190197a(iGetDataCallback);
            }
        }, this.f137877c.mo190246m(), this.f137891q, false);
        this.f137870P = aVar;
        cVar.mo147009a("input_addition", aVar.mo102096a("input_addition"));
        cVar.mo147009a("input_pop", this.f137870P.mo102096a("input_pop"));
        return cVar;
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: c */
    public void mo190166c(List<MessageInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f137884j.mo129976a(list);
        }
    }

    @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55867c
    /* renamed from: d */
    public void mo190470d(int i) {
        MessageInfo f = this.f137881g.mo190569b(i).mo190598f();
        if (f == null || this.f137882h.mo200107c()) {
            return;
        }
        if (this.f137877c.mo190254u()) {
            mo190161b(UIUtils.getString(this.f137878d, R.string.Lark_Chat_TopicClosedInputWindowPlaceholder));
            return;
        }
        String q = this.f137885k.mo146836q();
        String r = this.f137885k.mo146837r();
        boolean p = this.f137885k.mo146835p();
        this.f137877c.mo190201a(f.getMessage(), p, q, r);
    }

    /* renamed from: a */
    private void m216732a(final MessageInfo messageInfo) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass32 */

            public void run() {
                Chat k = ThreadDetailView.this.f137877c.mo190244k();
                if (k == null) {
                    Log.m165383e("ThreadDetailView", "show pin dialog failed, chat is null");
                    return;
                }
                Chatter p = ThreadDetailView.this.f137877c.mo190249p();
                if (p == null) {
                    Log.m165383e("ThreadDetailView", "show pin dialog failed, chatter is null");
                } else {
                    ThreadDetailView.this.mo190452a(messageInfo, k, p);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo190465b(int i) {
        m216709J();
        this.f137893s.setVisibility(0);
        this.f137885k.mo146820c();
        this.mTitleBar.removeAllActions();
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Cancel)) {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass13 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                ThreadDetailView.this.mo190177k();
            }
        });
        this.f137894t.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass14 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ boolean m216881a(C55905a aVar) {
                if (aVar == null || !aVar.mo190624y()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                List<C55905a> a = ThreadDetailView.this.f137882h.mo200097a();
                if (CollectionUtils.isEmpty(a)) {
                    ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit));
                } else if (ThreadDetailView.this.mo190464a(a, $$Lambda$ThreadDetailView$14$_QohGGKDqLxV8xewNE5owAZF1GI.INSTANCE)) {
                    MultiSelectHitPoint.f135851a.mo187657a(false);
                    MultiSelectHitPointNew.f135853b.mo187669b(ThreadDetailView.this.f137877c.mo190244k(), a, "mergeforward", "public_multi_select_share_view");
                    ThreadDetailView.this.f137876b.mo190265a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.mo190472e(a));
                } else {
                    ThreadDetailView.this.mo190474f(UIHelper.getString(R.string.Lark_Legacy_MultiMergeForwardAlert));
                }
            }
        });
        this.f137895u.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass15 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ boolean m216882a(C55905a aVar) {
                if (aVar == null || !aVar.mo190625z()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                List<C55905a> a = ThreadDetailView.this.f137882h.mo200097a();
                if (CollectionUtils.isEmpty(a)) {
                    ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit));
                } else if (ThreadDetailView.this.mo190464a(a, $$Lambda$ThreadDetailView$15$YK7Dmd_Z_NJMnk784HbL2vpo7os.INSTANCE)) {
                    MultiSelectHitPointNew.f135853b.mo187669b(ThreadDetailView.this.f137877c.mo190244k(), a, "multiselect_favorite", "none");
                    MultiSelectHitPoint.f135851a.mo187661c(false);
                    ThreadDetailView.this.f137877c.mo190234c(ThreadDetailView.this.mo190472e(a));
                } else {
                    ThreadDetailView.this.mo190474f(UIHelper.getString(R.string.Lark_Legacy_MultiMergeSaveAlert));
                }
            }
        });
        this.f137896v.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadDetailView.this.mo190481w();
            }
        });
        m216748f(1);
        this.f137882h.mo200103a(true);
        this.f137882h.mo200098a(i);
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: c */
    public void mo190167c(boolean z) {
        if (this.f137885k != null) {
            IInputSupportPlugin x = mo190482x();
            IInputSupportPlugin K = m216710K();
            if (x != null) {
                x.mo147011b(!z);
            }
            if (K != null) {
                K.mo147011b(!z);
            }
            KeyboardPluginController keyboardPluginController = this.f137890p;
            if (keyboardPluginController != null) {
                keyboardPluginController.mo190437a(ab(), !z);
            }
            if (z) {
                m216711L();
            } else {
                m216744d(this.f137877c.mo190248o());
            }
        }
    }

    /* renamed from: a */
    private void m216733a(C55934b bVar) {
        this.f137874T = new AbstractC55909e(bVar, this.mDetailContentRv, this.f137873S, this, new AbstractC55909e.AbstractC55911a() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass10 */

            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e.AbstractC55911a
            /* renamed from: a */
            public Boolean mo190492a() {
                return Boolean.valueOf(ThreadDetailView.this.f137877c.mo190254u());
            }

            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e.AbstractC55911a
            /* renamed from: a */
            public MessageInfo mo190491a(String str) {
                return ThreadDetailView.this.f137877c.mo190221b(str);
            }

            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e.AbstractC55911a
            /* renamed from: b */
            public Boolean mo190493b(String str) {
                return Boolean.valueOf(TextUtils.equals(str, ThreadDetailView.this.f137877c.mo190250q()));
            }
        }) {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass11 */

            /* renamed from: e */
            public void mo123401e(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e
            /* renamed from: a */
            public boolean mo190495a() {
                return ThreadDetailView.this.f137877c.mo190254u();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e
            /* renamed from: b */
            public boolean mo190497b() {
                return ThreadDetailView.this.f137877c.mo190255v();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e
            /* renamed from: a */
            public boolean mo190496a(String str) {
                return TextUtils.equals(str, ThreadDetailView.this.f137877c.mo190250q());
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.threaddetail.view.AbstractC55909e
            /* renamed from: a */
            public void mo190494a(ChatMessageVO<?> cVar, String str, int i) {
                MessageHitPoint.f135779d.mo187531a(cVar.mo121681a(), Integer.valueOf(cVar.mo121710r().getNumber()), cVar.mo121692b(), str, Integer.valueOf(i), C54984a.m213523b(), null);
                ThreadDetailView.this.f137877c.mo190213a(cVar.mo121681a(), cVar.mo121658D(), str);
            }
        };
    }

    /* renamed from: b */
    public void mo190466b(Message message) {
        if (message.getType() != Message.Type.POST || !CollectionUtils.isNotEmpty(C59031e.m229183b(((PostContent) message.getContent()).getRichText())) || m216723X()) {
            C29990c.m110930b().mo134506E().mo134371a(this.f137878d, message, "topic_click", "thread_details", "");
        } else {
            mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicMessageVideoForwardError));
        }
    }

    /* renamed from: d */
    public void mo190471d(List<MessageInfo> list) {
        if (this.f137883i && this.f137884j != null && CollectionUtils.isNotEmpty(list)) {
            this.f137884j.mo129977a(list, this.f137861G);
        }
    }

    @Override // com.ss.android.lark.threaddetail.AbstractC55766a.AbstractC55769b
    /* renamed from: b */
    public void mo190161b(String str) {
        LKUIToast.show(this.f137876b.mo190262a(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m216746e(DialogInterface dialogInterface, int i) {
        mo190175i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m216729a(DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187730e();
        this.f137877c.mo190252s();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m216739b(DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187732f();
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    private void m216730a(View view, boolean z) {
        if (this.f137867M && !this.f137866L && z && view != null) {
            this.f137866L = true;
            ChatTipController.f91138a.mo129836e(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m216742c(DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187730e();
        ThreadTopicHitPoint.f135906a.mo187726c(this.f137877c.mo190245l(), this.f137877c.mo190250q());
        this.f137877c.mo190229b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m216743d(DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187729d(this.f137877c.mo190245l(), this.f137877c.mo190250q());
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m216728a(Dialog dialog, View view) {
        String str;
        if (this.f137877c.mo190253t() == null || this.f137877c.mo190253t().getPin() == null) {
            str = "pin";
        } else {
            str = "unpin";
        }
        ThreadTopicHitPointNew.f135908b.mo187750a(this.f137877c.mo190244k(), this.f137877c.mo190253t(), str, "none");
        m216732a(this.f137877c.mo190253t());
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m216738b(Dialog dialog, View view) {
        ThreadTopicHitPointNew.f135908b.mo187750a(this.f137877c.mo190244k(), this.f137877c.mo190253t(), "withdraw_topic", "none");
        ThreadTopicHitPoint.f135906a.mo187721b(ChatTypeStateKeeper.f135670e);
        if (m216719T()) {
            MessageHitPoint.f135779d.mo187545b(this.f137877c.mo190245l(), "group_topic");
        }
        m216721V();
        dialog.dismiss();
    }

    /* renamed from: c */
    private IInputSupportPlugin m216741c(boolean z, boolean z2) {
        String str;
        int i;
        if (z2) {
            i = R.string.Lark_Chat_TopicClosedInputWindowPlaceholder;
        } else if (z) {
            i = R.string.Lark_Chat_TopicFollowedReplyPlaceholder;
        } else {
            str = UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_ReplyBox_Hint);
            return new RichTextInputExpandPlugin(str, new OnSendRichTextCallBack() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass48 */

                @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
                /* renamed from: a */
                public void mo123222a() {
                    if (ThreadDetailView.this.f137877c.mo190254u()) {
                        ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicClosedReplyErrorTips));
                    }
                }

                @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
                /* renamed from: a */
                public void mo123223a(String str, String str2, RichText richText, boolean z) {
                    String q = ThreadDetailView.this.f137885k.mo146836q();
                    String r = ThreadDetailView.this.f137885k.mo146837r();
                    C54948d.m213137a(z, true, true);
                    ThreadDetailView.this.f137877c.mo190210a(q, r, richText);
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass48.RunnableC558441 */

                        public void run() {
                            ThreadDetailView.this.mo190480v();
                        }
                    });
                }
            }, new BaseRichTextInputPlugin.LifeCycleCallback() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass49 */

                @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
                /* renamed from: b */
                public void mo123225b() {
                }

                @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
                /* renamed from: a */
                public void mo123224a() {
                    ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "post", "im_chat_post_view");
                    ThreadDetailView.this.f137890p.mo190436a(1, ThreadDetailView.this.f137891q);
                }
            });
        }
        str = UIHelper.getString(i);
        return new RichTextInputExpandPlugin(str, new OnSendRichTextCallBack() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass48 */

            @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
            /* renamed from: a */
            public void mo123222a() {
                if (ThreadDetailView.this.f137877c.mo190254u()) {
                    ThreadDetailView.this.mo190161b(UIHelper.getString(R.string.Lark_Chat_TopicClosedReplyErrorTips));
                }
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
            /* renamed from: a */
            public void mo123223a(String str, String str2, RichText richText, boolean z) {
                String q = ThreadDetailView.this.f137885k.mo146836q();
                String r = ThreadDetailView.this.f137885k.mo146837r();
                C54948d.m213137a(z, true, true);
                ThreadDetailView.this.f137877c.mo190210a(q, r, richText);
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass48.RunnableC558441 */

                    public void run() {
                        ThreadDetailView.this.mo190480v();
                    }
                });
            }
        }, new BaseRichTextInputPlugin.LifeCycleCallback() {
            /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass49 */

            @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
            /* renamed from: b */
            public void mo123225b() {
            }

            @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
            /* renamed from: a */
            public void mo123224a() {
                ThreadTopicHitPointNew.f135908b.mo187752a(ThreadDetailView.this.f137877c.mo190244k(), ThreadDetailView.this.f137877c.mo190250q(), "post", "im_chat_post_view");
                ThreadDetailView.this.f137890p.mo190436a(1, ThreadDetailView.this.f137891q);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m216737b(int i, boolean z) {
        int d = this.f137881g.mo190629d(i);
        if (d == -1) {
            Log.m165383e("ThreadDetailView", "Failed to find msg, position is: " + i);
            return;
        }
        C58996h.m228974a(this.mDetailContentRv, d, 0);
        if (z) {
            new C32944d(this.mDetailContentRv, new C32944d.AbstractC32948b<ChatMessageVO>() {
                /* class com.ss.android.lark.threaddetail.view.ThreadDetailView.AnonymousClass38 */

                /* renamed from: a */
                public boolean isItemsEquals(ChatMessageVO cVar, ChatMessageVO cVar2) {
                    return TextUtils.equals(cVar.mo121681a(), cVar2.mo121681a());
                }
            }).mo121651a(new AbstractC32943c(i) {
                /* class com.ss.android.lark.threaddetail.view.$$Lambda$ThreadDetailView$68cjBL49Q5OQuREwwupsmPi9YJE */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.chat.base.view.recycleview.AbstractC32943c
                public final int getTargetItemPosition(RecyclerView.Adapter adapter) {
                    return ((C55906d) adapter).mo190629d(this.f$0);
                }
            }).mo121646a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0054  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin m216735b(boolean r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threaddetail.view.ThreadDetailView.m216735b(boolean, boolean):com.ss.android.lark.keyboard.plugin.input.f");
    }

    /* renamed from: a */
    private void m216731a(TextView textView, int i) {
        FragmentActivity fragmentActivity = this.f137878d;
        textView.setCompoundDrawables(UDIconUtils.getIconDrawable(fragmentActivity, i, UIUtils.getColor(fragmentActivity, R.color.icon_n1), new UDDimension.Dp(20)), null, null, null);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
    /* renamed from: d */
    public void mo123355d(String str, int i) {
        int i2;
        C55906d dVar = this.f137881g;
        MessageInfo f = dVar.mo190569b(dVar.mo190567a(str)).mo190598f();
        if (f != null && f.getMessage().getType() == Message.Type.FOLDER) {
            Message message = f.getMessage();
            boolean equals = TextUtils.equals(str, this.f137877c.mo190253t().getId());
            AbstractC36505s sVar = this.f137863I;
            FragmentActivity fragmentActivity = this.f137878d;
            if (equals) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            sVar.mo134697a(fragmentActivity, message, i2);
        }
    }

    /* renamed from: a */
    private void m216734a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121868c, ChatTypeStateKeeper.f135670e);
            if (z2) {
                jSONObject.put("sub_source", "topic_point");
            } else if (z) {
                jSONObject.put("sub_source", "topic_press");
            } else {
                jSONObject.put("sub_source", "topic_commend");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Statistics.sendEvent("todo_create", jSONObject);
    }

    public ThreadDetailView(AbstractC55854b bVar, boolean z, boolean z2) {
        this.f137876b = bVar;
        this.f137868N = z;
        this.f137867M = z2;
        bVar.mo190266a(this);
        this.f137879e = C29990c.m110930b().mo134521T();
        AbstractC36503q n = C29990c.m110930b().mo134586n();
        this.f137856B = n;
        this.f137857C = C29990c.m110930b().mo134506E();
        this.f137858D = C29990c.m110930b().mo134502A();
        this.f137863I = C29990c.m110930b().mo134520S();
        this.f137878d = bVar.mo190262a();
        this.f137860F = new C25969c(new Handler(Looper.getMainLooper()));
        this.f137864J = CoreThreadPool.getDefault().newSerialIODensityThreadPool("audio-send");
        this.f137887m = new C33111af(bVar.mo190262a());
        this.f137889o = n.mo134685a("group.role.obeserver");
    }
}
