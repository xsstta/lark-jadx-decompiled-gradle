package com.ss.android.lark.threadwindow.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.ui.C26174a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33223m;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.C33292b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatbase.view.C34449c;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.chatwindow.view.tip.NewMessageTip;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.utils.KBCopyManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.announce_opendoc.AnnounceOpenDocHitPoint;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.threadtab.view.widget.FixScrollerPtrFrameLayout;
import com.ss.android.lark.threadwindow.view.AbstractC56149a;
import com.ss.android.lark.threadwindow.view.AbstractC56152b;
import com.ss.android.lark.threadwindow.view.C56167c;
import com.ss.android.lark.threadwindow.view.message.C56209b;
import com.ss.android.lark.threadwindow.view.message.C56210c;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56150a;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56151b;
import com.ss.android.lark.threadwindow.view.p2767b.p2769b.AbstractC56156a;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseTopicFragment extends AbstractC56088f implements AbstractC56151b {

    /* renamed from: A */
    private AbstractC56152b f138590A;

    /* renamed from: B */
    private final DuplicateEnterChecker f138591B;

    /* renamed from: a */
    private final IForwardDependency f138592a;

    /* renamed from: b */
    private final AbstractC36502p f138593b;

    /* renamed from: c */
    private C34449c f138594c;

    /* renamed from: d */
    protected Activity f138595d;

    /* renamed from: e */
    protected C26174a f138596e;

    /* renamed from: f */
    protected AbstractC56149a f138597f;

    /* renamed from: g */
    protected C25969c f138598g;

    /* renamed from: h */
    protected volatile long f138599h;

    /* renamed from: i */
    protected volatile boolean f138600i;

    /* renamed from: j */
    protected AbstractC36503q f138601j;

    /* renamed from: k */
    protected AbstractC36474h.AbstractC36475a f138602k;

    /* renamed from: l */
    C56210c f138603l;

    /* renamed from: m */
    public int f138604m;
    @BindView(7935)
    public ImageView mIvThreadOnboarding;
    @BindView(8196)
    public PointRecoderRecyclerView mMessageRV;
    @BindView(9128)
    public View mNewestContentTips;
    @BindView(8083)
    public LinearLayout mOnboardingLayout;
    @BindView(7862)
    public FixScrollerPtrFrameLayout mPtrFrame;
    @BindView(7333)
    public Button mSendThreadBtn;
    @BindView(8799)
    protected RecyclerView mSkeletonRv;
    @BindView(9153)
    public TextView mTvThreadOnboarding;

    /* renamed from: n */
    protected boolean f138605n;
    @BindView(8298)
    public NewMessageTip newMessageBottomTip;
    @BindView(8299)
    public NewMessageTip newMessageBottomTipReverse;
    @BindView(8301)
    public NewMessageTip newMessageTopTip;
    @BindView(8302)
    public NewMessageTip newMessageTopTipReverse;

    /* renamed from: o */
    protected C2048a f138606o;

    /* renamed from: p */
    protected boolean f138607p;

    /* renamed from: q */
    protected AbstractC36474h.AbstractC36491q f138608q;

    /* renamed from: r */
    public boolean f138609r;

    /* renamed from: t */
    private boolean f138610t;

    /* renamed from: u */
    private PopupWindow f138611u;

    /* renamed from: v */
    private String f138612v;

    /* renamed from: w */
    private boolean f138613w;

    /* renamed from: x */
    private final boolean f138614x;

    /* renamed from: y */
    private int f138615y;

    /* renamed from: z */
    private final AbstractC56156a f138616z;

    /* renamed from: d */
    private boolean m218258d(ThreadMessageVO threadMessageVO) {
        return false;
    }

    /* renamed from: e */
    private boolean m218262e(ThreadMessageVO threadMessageVO) {
        return false;
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowRecommendTopicGroupCell.AbstractC56196a
    /* renamed from: B */
    public void mo191267B() {
    }

    /* renamed from: a */
    public void mo191272a(int i) {
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a
    /* renamed from: a */
    public /* synthetic */ void mo190444a(View view, AbsMessageVO aVar) {
        ThreadWindowPostCell2.AbstractC56194a.CC.$default$a(this, view, aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
    /* renamed from: a */
    public void mo122761a(AbsMessageVO aVar) {
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122832a(String str) {
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowAtAndReplyTipCell.AbstractC56170a
    /* renamed from: c */
    public void mo191299c(boolean z) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
    /* renamed from: p */
    public void mo122774p(String str) {
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment, com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: a */
    public View mo67276a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_thread_window_topic, viewGroup, false);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: a */
    public void mo67279a(View view) {
        super.mo67279a(view);
        this.f138595d = getActivity();
        this.f138599h = System.currentTimeMillis();
        this.f138615y = this.mMessageRV.getPaddingBottom();
        Log.m165389i("BaseTopicFragment", "onViewCreated:mLastActiveTime=" + this.f138599h + ";mIsFling" + this.f138600i);
        if (this.f138693s == null) {
            Log.m165383e("BaseTopicFragment", "onViewCreated:mDelegate = null");
            return;
        }
        AbstractC36474h.AbstractC36491q a = C29990c.m110930b().av().mo134628a(this);
        this.f138608q = a;
        a.mo134644a(this.newMessageBottomTip);
        this.f138608q.mo134644a(this.newMessageBottomTipReverse);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m218248a(boolean z, ThreadMessageVO threadMessageVO, Dialog dialog, View view) {
        if (!z) {
            mo191280a(threadMessageVO, "pin", "none");
        }
        m218243a(threadMessageVO, new AbstractC36459ag.AbstractC36460a(threadMessageVO) {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$2bQ0Gt_4cHDo4QlOTfuMrNRzsus */
            public final /* synthetic */ ThreadMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.dependency.AbstractC36459ag.AbstractC36460a
            public final void onPin(boolean z) {
                BaseTopicFragment.this.m218244a((BaseTopicFragment) this.f$1, (ThreadMessageVO) z);
            }
        });
        dialog.dismiss();
    }

    /* renamed from: a */
    public void mo191280a(ThreadMessageVO threadMessageVO, String str, String str2) {
        ThreadTopicHitPointNew.f135908b.mo187755a(this.f138693s.mo190968h(), ThreadTopicHitPointNew.f135908b.mo187747a(threadMessageVO), str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r6.mo121676V();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo191283a(final java.lang.String r5, final com.ss.android.lark.chat.base.view.vo.ThreadMessageVO r6, boolean r7) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.lark.chat.entity.chat.Chat r0 = r6.mo121676V()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r1 = "todo"
            java.lang.String r2 = "todo_create_view"
            r4.mo191280a(r6, r1, r2)
            r4.mo191349e(r7)
            com.ss.android.lark.dependency.h r7 = com.ss.android.lark.C29990c.m110930b()
            com.larksuite.component.blockit.d r7 = r7.ak()
            com.larksuite.component.blockit.entity.Domain r1 = com.larksuite.component.blockit.entity.Domain.message
            com.larksuite.component.blockit.entity.BlockTypeID r2 = com.larksuite.component.blockit.entity.BlockTypeID.MESSAGE
            com.ss.android.lark.threadwindow.fragment.BaseTopicFragment$5 r3 = new com.ss.android.lark.threadwindow.fragment.BaseTopicFragment$5
            r3.<init>(r0, r6, r5)
            r7.mo86324b(r1, r5, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.mo191283a(java.lang.String, com.ss.android.lark.chat.base.view.vo.ThreadMessageVO, boolean):void");
    }

    /* renamed from: a */
    public CharSequence mo191271a(ThreadMessageVO threadMessageVO) {
        String str;
        CharSequence a = C34349o.m133202a((Context) this.f138595d, this.f138693s.mo190786c(threadMessageVO.mo121662H(), threadMessageVO.mo121673S()), false, true, false);
        Content z = threadMessageVO.mo121699g().mo126168z();
        int i = AnonymousClass11.f138620a[threadMessageVO.mo121710r().ordinal()];
        if (i != 6) {
            if (i == 7) {
                return UIHelper.mustacheFormat((int) R.string.Calendar_CreateTaskFromEvent_TaskTitle, "title", C34349o.m133206a(this.f138693s.mo190786c(threadMessageVO.mo121662H(), threadMessageVO.mo121673S())).toString());
            }
            if (i != 8 || !(z instanceof TodoContent) || ((TodoContent) z).getCardContentData().operation_type != TodoOperationContent.Type.DAILY_REMIND) {
                return a;
            }
            if (this.f138601j.mo134685a("todo.remind.expand_scope")) {
                return UIHelper.getString(R.string.Todo_Task_RecentTodoTask);
            }
            return UIHelper.getString(R.string.Todo_BotNotification_DailyNotificationTitle);
        } else if (!(z instanceof CardContent)) {
            return a;
        } else {
            CardContent cardContent = (CardContent) z;
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
        }
    }

    /* renamed from: a */
    public void mo191284a(String str, String str2, String str3, Message.Type type, BlockEntity blockEntity, BlockExtra blockExtra) {
        TextEntity textEntity = new TextEntity(C59029c.m229161b(str), null);
        MultiMessage multiMessage = new MultiMessage();
        multiMessage.chatId = str2;
        multiMessage.messageIds = Collections.singletonList(str3);
        blockExtra.multiMessage = multiMessage;
        blockExtra.richTextMessage = new RichTextMessage(type, new MessageContentEntity(textEntity));
        C29990c.m110930b().ak().mo86317a(this.f138595d, ActionType.Todo, blockEntity, blockExtra);
    }

    /* renamed from: a */
    public void mo191282a(String str, int i, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIHelper.getString(R.string.Lark_Legacy_CloseConfirm));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.function_danger_500)), 0, spannableStringBuilder.length(), 33);
        new C25639g(this.f138595d).mo89248g(R.string.Lark_Groups_TopicToolClose).mo89238b(true).mo89254m(R.string.Lark_Groups_ClosePostPopUpWindowDescription).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_TopicToolDeleteTipCancel, new DialogInterface.OnClickListener(str2, str) {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$fHf3NIyuGcx4rK6p1tKGpANTIg */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                BaseTopicFragment.m218246a(this.f$0, this.f$1, dialogInterface, i);
            }
        }).mo89225a(R.id.lkui_dialog_btn_right, spannableStringBuilder, new DialogInterface.OnClickListener(str2, str, i) {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$9n2lDyrZSOR7GRtic2cvweUKKvE */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                BaseTopicFragment.this.m218245a(this.f$1, this.f$2, this.f$3, dialogInterface, i);
            }
        }).mo89239c();
    }

    /* renamed from: a */
    private boolean m218251a(ThreadMessageVO threadMessageVO, AbstractC36503q qVar) {
        return (threadMessageVO.ad() || threadMessageVO.mo121695c() || threadMessageVO.mo121677W()) && !threadMessageVO.mo121674T();
    }

    /* renamed from: a */
    public void mo191281a(Message message) {
        this.f138592a.mo134370a(this.f138595d, message, "topic_click", "thread");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m218249a(boolean z, String str, DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187730e();
        if (z) {
            this.f138693s.mo190771a(str);
        } else {
            this.f138693s.mo190783b(str);
        }
    }

    /* renamed from: a */
    public void mo191274a(View view, ThreadMessageVO threadMessageVO, int i) {
        if (this.f138591B.mo198450a() || !threadMessageVO.mo121708p() || threadMessageVO.mo121674T()) {
            return;
        }
        if (threadMessageVO.mo121668N()) {
            mo191292b(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
            return;
        }
        if (m218263f(threadMessageVO)) {
            this.f138610t = true;
            threadMessageVO.mo121693b(true);
            this.f138597f.notifyItemChanged(i);
            this.f138693s.mo190790d(threadMessageVO.mo121662H(), threadMessageVO.mo121673S());
        }
        ThreadTopicHitPoint.f135906a.mo187725c("topic_card");
        ThreadTopicHitPoint.f135906a.mo187719a("click", threadMessageVO.mo121662H(), TextUtils.isEmpty(threadMessageVO.mo121679Y()) ? "-1" : threadMessageVO.mo121679Y(), i, threadMessageVO.af(), threadMessageVO.mo121692b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67278a() {
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setForceBackWhenComplete(true);
        this.mPtrFrame.disableWhenHorizontalMove(true);
    }

    @Override // com.ss.android.lark.threadwindow.view.message.C56213e.AbstractC56214a
    /* renamed from: a */
    public void mo190456a(String str, int i) {
        this.f138693s.mo190772a(str, i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(photoItem);
        this.f138693s.mo190768a(view, arrayList, this.f138693s.mo190968h() != null ? this.f138693s.mo190968h().getId() : "", i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122773a(View view, PhotoItem photoItem, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(photoItem);
        C29990c.m110930b().mo134541a(this.f138595d, arrayList, 0, view, null, true, false, false, z, false, false, null, null, Scene.Thread, 4);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122830a(View view, List<Image> list, Image image) {
        new C33292b(this.f138595d, Scene.Thread).mo122757a(view, list, image);
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    /* renamed from: a */
    public void mo123350a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        this.f138693s.mo190959a(str, list, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    /* renamed from: a */
    public void mo123349a(String str, List<GroupRecallEntity> list) {
        this.f138693s.mo190958a(str, list);
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: b */
    public void mo191291b(View view, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C29990c.m110930b().mo134523V().mo134436a(this.f138595d, new ProfileSource.C36868a().mo136066c(str).mo136065b(str2).mo136064b(5).mo136060a(0).mo136062a(C34339g.m133170d(this.f138693s.mo190968h())).mo136063a());
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191278a(View view, String str, boolean z, int i, String str2, String str3, int i2, String str4) {
        this.f138693s.mo190767a(view, str, z, i, str4, str2);
        if (z) {
            ThreadTopicHitPoint.f135906a.mo187723b(str, str2, "group");
            ThreadTopicHitPoint.Companion aVar = ThreadTopicHitPoint.f135906a;
            if (TextUtils.isEmpty(str3)) {
                str3 = "-1";
            }
            aVar.mo187719a("follow_topic", str, str3, i2, str4, str2);
            return;
        }
        ThreadTopicHitPoint.f135906a.mo187718a(str, str2, "group");
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191273a(View view, ThreadMessageVO threadMessageVO) {
        if (!threadMessageVO.mo121674T()) {
            if (threadMessageVO.mo121668N()) {
                mo191292b(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
                return;
            }
            boolean z = threadMessageVO.mo121715w() != 0;
            ThreadTopicHitPoint.f135906a.mo187725c("reply_area");
            this.f138693s.mo190780a(threadMessageVO.mo121662H(), z, false, threadMessageVO.mo121673S());
            ThreadTopicHitPoint.f135906a.mo187720b();
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191276a(View view, String str) {
        this.f138693s.mo190765a(view, str);
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191279a(ThreadMessageVO threadMessageVO, int i) {
        this.f138693s.mo190773a(threadMessageVO.mo121662H(), i, threadMessageVO.mo121673S());
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191277a(View view, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f138693s.mo190782b(view, str);
            if (z) {
                ThreadTopicHitPoint.f135906a.mo187733f("moments_recommend");
            } else {
                ThreadTopicHitPoint.f135906a.mo187735g("moments_recommend");
            }
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191275a(View view, final ThreadMessageVO threadMessageVO, final int i, boolean z) {
        if (!z) {
            mo191324i();
        } else if (this.f138611u == null || !TextUtils.equals(threadMessageVO.mo121681a(), this.f138612v)) {
            this.f138613w = true;
            PopupWindow popupWindow = this.f138611u;
            if (popupWindow != null && popupWindow.isShowing()) {
                this.f138611u.dismiss();
            }
            ReactionPanelFacade a = new ReactionPanelFacade.C53071a(view).mo181309a(C35234b.m137579e().mo121402b()).mo181313b(C35234b.m137579e().mo121403c()).mo181310a(false).mo181314b(false).mo181308a(new ReactionPanelFacade.AbstractC53072b() {
                /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.C560647 */

                @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                /* renamed from: a */
                public void mo22763a() {
                }

                @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                /* renamed from: b */
                public void mo22765b() {
                }

                @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                /* renamed from: a */
                public void mo22764a(String str, int i) {
                    BaseTopicFragment.this.f138693s.mo190775a(threadMessageVO.mo121662H(), str, threadMessageVO.mo121673S(), i, threadMessageVO.af(), i);
                }
            }).mo181307a(R.style.ReactionScrollableDialogAnimations).mo181311a();
            int screenHeight = DeviceUtils.getScreenHeight(view.getContext());
            int[] a2 = DesktopUtil.m144302a(view);
            int dp2px = a2[0] - UIHelper.dp2px(180.0f);
            int dp2px2 = UIHelper.dp2px(10.0f);
            if (a2[1] > UIHelper.dp2px(300.0f)) {
                this.f138611u = a.mo181299a(true, 83, dp2px, (screenHeight - a2[1]) - dp2px2);
            } else {
                this.f138611u = a.mo181299a(false, 51, dp2px, a2[1] + view.getHeight() + dp2px2);
            }
            this.f138612v = threadMessageVO.mo121681a();
            this.f138611u.setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$m0JtQIexcJr28dYqecB48LUK36Y */

                public final void onDismiss() {
                    BaseTopicFragment.this.mo191326k();
                }
            });
            a.mo181301a(new View.OnHoverListener() {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$IXj1WGuYdK8CMZJulEwYt3GvD1I */

                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return BaseTopicFragment.this.m218250a((BaseTopicFragment) view, (View) motionEvent);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m218250a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            this.f138613w = true;
            return false;
        } else if (action != 10) {
            return false;
        } else {
            mo191324i();
            return false;
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191285a(String str, String str2, boolean z) {
        this.f138693s.mo190778a(str, str2, z);
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: a */
    public void mo191286a(List<ReactionInfo> list, String str) {
        if (!CollectionUtils.isEmpty(list)) {
            C53002b a = C53002b.m205273a(C35237c.m137597a(list, false), str);
            a.mo181046a(new C53002b.AbstractC53005b() {
                /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.C560669 */

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                public void onItemClicked(String str) {
                    C29990c.m110930b().mo134523V().mo134436a(BaseTopicFragment.this.getContext(), new ProfileSource.C36868a().mo136066c(str).mo136065b(BaseTopicFragment.this.f138603l.mo122544h()).mo136064b(3).mo136060a(4).mo136063a());
                }
            });
            a.mo181044a(getChildFragmentManager());
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.C56199a.AbstractC56205a
    /* renamed from: a */
    public void mo190459a(String str, String str2, int i) {
        this.f138693s.mo190774a(str, str2, i);
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
                    List<PhotoItem> a2 = C34353s.m133245a(Collections.singletonList(C57305aa.m222055a(image)), aVar.mo121681a());
                    if (!CollectionUtils.isEmpty(a2)) {
                        PhotoItem photoItem2 = a2.get(0);
                        String g = this.f138693s.mo190796g();
                        if (aVar.ai() || !postContent2.isGroupAnnouncement() || TextUtils.isEmpty(g)) {
                            C58630d.m227372a(this.f138595d, a, C34353s.m133238a(a, photoItem2), view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, false, true, false, true, C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable"), false, new DialogMenuClickListenerImpl(this.f138693s.mo190968h() != null ? this.f138693s.mo190968h().getId() : ""), null, "", null, Biz.Messenger, Scene.Thread, 2);
                            return;
                        }
                        C29990c.m110930b().mo134593u().mo134330a(this.f138595d, g);
                        AnnounceOpenDocHitPoint.f135643a.mo187338a("message", mo191303x());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
    /* renamed from: a */
    public void mo190448a(View view, String str, String str2) {
        C29990c.m110930b().mo134523V().mo134436a(this.f138595d, new ProfileSource.C36868a().mo136066c(str).mo136065b(str2).mo136064b(5).mo136060a(1).mo136062a(C34339g.m133170d(this.f138693s.mo190968h())).mo136063a());
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
    /* renamed from: a */
    public void mo190446a(View view, AbsMessageVO aVar, RichTextElement.MediaProperty mediaProperty) {
        List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(C57308c.m222071a(aVar.mo121681a(), aVar.mo121692b(), mediaProperty)));
        if (!CollectionUtils.isEmpty(a)) {
            C29990c.m110930b().mo134541a(this.f138595d, a, 0, view, null, false, false, false, false, false, false, null, null, Scene.Thread, 4);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        this.f138693s.mo190777a(str, str2, str3, sourceType);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122765a(String str, String str2, Message.SourceType sourceType) {
        this.f138693s.mo190776a(str, str2, sourceType);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
    /* renamed from: a */
    public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        this.f138693s.mo190957a(str, iGetDataCallback);
    }

    /* renamed from: b */
    private boolean mo67285b() {
        return UIUtils.canShowSkeleton();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ void mo191326k() {
        this.f138611u = null;
        this.f138612v = "";
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o */
    private /* synthetic */ Chat mo191329o() {
        return this.f138693s.mo190968h();
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowTabOnBoardingCell.AbstractC56198a
    /* renamed from: C */
    public void mo191268C() {
        this.f138693s.mo190970j();
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: y */
    public void mo191304y() {
        AbstractC56149a aVar = this.f138597f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: h */
    private boolean mo109394h() {
        return C29990c.m110930b().mo134519R().mo134474b();
    }

    /* renamed from: i */
    private void mo191324i() {
        this.f138613w = false;
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$ItxqYfkEuwqYR2BSLbmlGRzIi9w */

            public final void run() {
                BaseTopicFragment.this.mo191325j();
            }
        }, 500);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void mo191325j() {
        PopupWindow popupWindow;
        if (!this.f138613w && (popupWindow = this.f138611u) != null) {
            popupWindow.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo191303x() {
        C56210c cVar = this.f138603l;
        if (cVar != null) {
            return cVar.mo122544h();
        }
        return null;
    }

    /* renamed from: g */
    private void mo191323g() {
        this.f138590A = new AbstractC56152b(this.f138603l, this.mMessageRV, this.f138616z, this) {
            /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass15 */

            /* renamed from: a */
            public void mo123401e(AbstractC59004b bVar, AbstractC59010e eVar, ThreadMessageVO threadMessageVO) {
                BaseTopicFragment.this.mo191274a(eVar.f146209n, threadMessageVO, eVar.mo200148l());
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.threadwindow.view.AbstractC56152b
            /* renamed from: a */
            public void mo191310a(String str, String str2, int i, int i2, String str3, int i3) {
                BaseTopicFragment.this.f138693s.mo190775a(str, str2, i, i2, str3, i3);
            }
        };
    }

    /* renamed from: A */
    public void mo191266A() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mMessageRV.getLayoutManager();
        if (this.f138597f.getItemCount() > 0) {
            linearLayoutManager.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f138597f != null && this.f138610t) {
            this.f138610t = false;
            this.mMessageRV.postDelayed(new Runnable() {
                /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.RunnableC560658 */

                public void run() {
                    BaseTopicFragment.this.f138597f.mo191469b();
                }
            }, 300);
        }
    }

    /* renamed from: z */
    public void mo191305z() {
        ((LinearLayoutManager) this.mMessageRV.getLayoutManager()).scrollToPosition(this.f138597f.getItemCount() - 1);
    }

    /* renamed from: D */
    public void mo191269D() {
        C26174a a = new C26174a.C26176a(this.f138595d).mo93147a((float) UIHelper.dp2px(10.0f)).mo93154e(R.color.imtoken_message_topic_group_bg).mo93149a();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f138595d, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        this.mSkeletonRv.setLayoutManager(linearLayoutManager);
        this.mSkeletonRv.addItemDecoration(a);
    }

    /* renamed from: E */
    public void mo191270E() {
        this.f138605n = false;
        if (this.mSkeletonRv.getVisibility() == 0) {
            this.mSkeletonRv.setVisibility(8);
            C2048a aVar = this.f138606o;
            if (aVar != null) {
                aVar.mo10130b();
            }
        }
        FixScrollerPtrFrameLayout fixScrollerPtrFrameLayout = this.mPtrFrame;
        if (fixScrollerPtrFrameLayout != null) {
            fixScrollerPtrFrameLayout.setBackgroundColor(UIUtils.getColor(this.f138595d, R.color.bg_body_overlay));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.threadwindow.fragment.BaseTopicFragment$11  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass11 {

        /* renamed from: a */
        static final /* synthetic */ int[] f138620a;

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
                com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a = r0
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MEDIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.IMAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MERGE_FORWARD     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.CARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.CALENDAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.f138620a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.TODO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass11.<clinit>():void");
        }
    }

    public BaseTopicFragment() {
        this.f138601j = C29990c.m110930b().mo134586n();
        this.f138602k = C29990c.m110930b().ab();
        this.f138592a = C29990c.m110930b().mo134506E();
        this.f138593b = C29990c.m110930b().af();
        this.f138611u = null;
        this.f138612v = "";
        this.f138613w = false;
        this.f138605n = true;
        this.f138616z = new AbstractC56156a() {
            /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.C560571 */

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m
            /* renamed from: a */
            public void mo121953a(AbstractC55890m.AbstractC55891a aVar) {
                BaseTopicFragment.this.f138693s.mo121953a(aVar);
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n
            /* renamed from: a */
            public void mo121954a(AbstractC55893n.AbstractC55894a aVar) {
                View c = aVar.mo121962c();
                AbstractC55893n.C55895b bVar = (AbstractC55893n.C55895b) aVar.mo121960a();
                BaseTopicFragment.this.f138693s.mo190766a(c, bVar.f138069b, bVar.f138068a, bVar.f138070c);
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c
            /* renamed from: b */
            public void mo190486b(AbsMessageVO aVar) {
                String a = C34438a.m133573a(BaseTopicFragment.this.f138595d, aVar.mo121699g().mo126168z());
                C34438a.m133576a(BaseTopicFragment.this.f138595d, a);
                Content z = aVar.mo121699g().mo126168z();
                if (z instanceof TextContent) {
                    KBCopyManager.f103297a.mo146860a(a, ((TextContent) z).getRichText(), false);
                } else if (z instanceof PostContent) {
                    KBCopyManager.f103297a.mo146860a(a, ((PostContent) z).getRichText(), false);
                }
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
                    BaseTopicFragment.this.f138693s.mo190769a(C33223m.m128430a(stickerContent), new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.C560571.C560581 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            LKUIToast.show(BaseTopicFragment.this.f138595d, (int) R.string.Lark_Legacy_AddStickerSuccess);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            LKUIToast.show(BaseTopicFragment.this.f138595d, (int) R.string.Lark_Legacy_AddStickerFail);
                        }
                    }));
                }
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
            /* renamed from: a */
            public void mo121937a(PhotoItem photoItem, boolean z) {
                BaseTopicFragment.this.f138693s.mo190770a(photoItem, z);
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55889l
            /* renamed from: a */
            public void mo190553a(String str, ThreadMessageVO<ContentVO<?>> threadMessageVO) {
                BaseTopicFragment.this.mo191283a(str, (ThreadMessageVO) threadMessageVO, false);
            }
        };
        this.f138609r = false;
        this.f138591B = new DuplicateEnterChecker();
        this.f138598g = new C25969c(new Handler(Looper.getMainLooper()));
        this.f138614x = this.f138601j.mo134685a("group.role.obeserver");
        this.f138605n = mo67285b();
    }

    /* renamed from: e */
    private void mo67292e() {
        Log.m165389i("BaseTopicFragment", " threadWindow refactor version");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C56167c cVar = new C56167c();
            cVar.mo200127a(C57852m.m224554a(activity));
            C56210c cVar2 = new C56210c(activity, new C56210c.AbstractC56211a() {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$GRzrvTRUxFRlnFBaPB0n_Pi2Xc4 */

                @Override // com.ss.android.lark.threadwindow.view.message.C56210c.AbstractC56211a
                public final Chat getChat() {
                    return BaseTopicFragment.this.mo191329o();
                }
            });
            this.f138603l = cVar2;
            cVar2.mo191563a(this.f138693s.mo190764a());
            mo191323g();
            C56209b.m219184a(this.f138603l, new AbstractC56150a() {
                /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass14 */

                @Override // com.ss.android.lark.threadwindow.view.p2766a.AbstractC56150a
                /* renamed from: a */
                public boolean mo191308a() {
                    return BaseTopicFragment.this.f138609r;
                }
            }, this.f138590A, this, this.f138616z).mo191561a(cVar);
            this.f138597f = cVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo67293f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f138595d, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        ((SimpleItemAnimator) this.mMessageRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mMessageRV.setLayoutManager(linearLayoutManager);
        mo67292e();
        this.mMessageRV.setAdapter((RecyclerView.Adapter) this.f138597f);
        this.f138596e = new C26174a.C26176a(this.f138595d).mo93147a((float) UIHelper.dp2px(10.0f)).mo93154e(R.color.imtoken_message_topic_group_bg).mo93149a();
        this.f138594c = new C34449c(this.f138595d);
        this.mMessageRV.setTouchViewListener(new PointRecoderRecyclerView.AbstractC58964a() {
            /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass12 */

            @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
            public void onTouchiew(float f, float f2) {
                if (BaseTopicFragment.this.f138603l != null) {
                    BaseTopicFragment.this.f138603l.mo191562a((int) f2);
                }
                BaseTopicFragment.this.f138604m = (int) f2;
                BaseTopicFragment.this.f138599h = System.currentTimeMillis();
                Log.m165389i("BaseTopicFragment", "onTouchiew:mLastActiveTime=" + BaseTopicFragment.this.f138599h + ";mIsFling" + BaseTopicFragment.this.f138600i);
            }
        });
        this.mMessageRV.setOnFlingListener(new RecyclerView.AbstractC1337f() {
            /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass13 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1337f
            public boolean onFling(int i, int i2) {
                BaseTopicFragment.this.f138600i = true;
                BaseTopicFragment.this.f138599h = System.currentTimeMillis();
                Log.m165389i("BaseTopicFragment", "onFling:mLastActiveTime=" + BaseTopicFragment.this.f138599h + ";mIsFling" + BaseTopicFragment.this.f138600i);
                return false;
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: c */
    public void mo191298c(String str) {
        this.f138693s.mo190788c(str);
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: d */
    public void mo191301d(String str) {
        this.f138693s.mo190973k(str);
    }

    @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
    public void f_(String str) {
        this.f138693s.mo190971j(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: l */
    public void mo122768l(String str) {
        this.f138693s.mo190797g(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: m */
    public void mo122769m(String str) {
        this.f138693s.mo190798h(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: n */
    public void mo122770n(String str) {
        this.f138693s.mo190799i(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
    /* renamed from: u */
    public void mo123362u(String str) {
        this.f138693s.mo190789d(str);
    }

    /* renamed from: c */
    private boolean m218256c(ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121695c() || !threadMessageVO.mo121677W()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo191292b(String str) {
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f138595d, str);
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: d */
    public void mo191300d(int i) {
        if (mo191336v()) {
            this.mMessageRV.setPadding(0, 0, 0, this.f138615y - i);
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: e */
    public void mo191302e(int i) {
        this.mSkeletonRv.postDelayed(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.AnonymousClass10 */

            public void run() {
                if (BaseTopicFragment.this.f138605n && BaseTopicFragment.this.mSkeletonRv.getVisibility() == 8) {
                    BaseTopicFragment.this.mSkeletonRv.setVisibility(0);
                    if (BaseTopicFragment.this.f138606o == null) {
                        BaseTopicFragment baseTopicFragment = BaseTopicFragment.this;
                        baseTopicFragment.f138606o = C2052c.m8960a(baseTopicFragment.mSkeletonRv).mo10139e(R.layout.item_skeleton_thread).mo10133a(true).mo10138d(20).mo10137c(R.color.imtoken_topic_skeleton_anim).mo10131a(4).mo10135b(1000).mo10136b(true).mo10134a();
                        return;
                    }
                    BaseTopicFragment.this.f138606o.mo10129a();
                }
            }
        }, (long) i);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: k */
    public void mo122767k(String str) {
        this.f138693s.mo190795f(str);
    }

    /* renamed from: f */
    private boolean m218263f(ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121710r() == Message.Type.SYSTEM || threadMessageVO.mo121710r() == Message.Type.UNKNOWN) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public List<String> mo191293c(RecyclerView recyclerView) {
        List<ThreadMessageVO> b = mo191287b(recyclerView);
        if (b == null) {
            return new ArrayList();
        }
        return mo191294c(b);
    }

    /* renamed from: b */
    private boolean m218254b(ThreadMessageVO threadMessageVO) {
        if (threadMessageVO == null || threadMessageVO.mo121676V() == null) {
            return false;
        }
        return threadMessageVO.mo121676V().isCrossWithKa();
    }

    /* renamed from: e */
    private void mo191349e(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121868c, ChatTypeStateKeeper.f135670e);
            if (z) {
                jSONObject.put("sub_source", "topic_point");
            } else {
                jSONObject.put("sub_source", "topic_press");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Statistics.sendEvent("todo_create", jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<String> mo191294c(List<ThreadMessageVO> list) {
        ArrayList arrayList = new ArrayList();
        for (ThreadMessageVO threadMessageVO : list) {
            if (threadMessageVO.mo121708p()) {
                arrayList.add(threadMessageVO.mo121662H());
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: c */
    public void mo191295c(int i) {
        int i2 = this.f138615y + i;
        this.f138615y = i2;
        this.mMessageRV.setPadding(0, 0, 0, i2);
    }

    /* renamed from: b */
    public List<ThreadMessageVO> mo191287b(RecyclerView recyclerView) {
        if (!UIUtils.isActivityRunning(this.f138595d)) {
            Log.m165383e("BaseTopicFragment", "getCurrentPageThreads failed, activity not running");
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        return this.f138597f.mo191466a(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), true);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: b */
    public void mo191288b(int i) {
        if (UIUtils.isActivityRunning(this.f138595d)) {
            if (i > 0) {
                this.mPtrFrame.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.RunnableC560636 */

                    public void run() {
                        if (UIUtils.isActivityRunning(BaseTopicFragment.this.f138595d)) {
                            BaseTopicFragment.this.mPtrFrame.refreshComplete();
                        }
                    }
                }, (long) i);
            } else {
                this.mPtrFrame.refreshComplete();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m218240a(DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187732f();
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    private void m218241a(TextView textView, int i) {
        Activity activity = this.f138595d;
        textView.setCompoundDrawables(UDIconUtils.getIconDrawable(activity, i, UIUtils.getColor(activity, R.color.icon_n1), new UDDimension.Dp(20)), null, null, null);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
    /* renamed from: d */
    public void mo123355d(String str, int i) {
        this.f138693s.mo190784b(str, i);
    }

    /* renamed from: a */
    private void m218243a(ThreadMessageVO threadMessageVO, AbstractC36459ag.AbstractC36460a aVar) {
        this.f138693s.mo190956a(threadMessageVO.mo121662H(), threadMessageVO.mo121673S(), aVar);
    }

    /* renamed from: b */
    private boolean m218255b(ThreadMessageVO threadMessageVO, AbstractC36503q qVar) {
        if ((threadMessageVO.ad() || threadMessageVO.mo121695c() || threadMessageVO.mo121677W()) && !threadMessageVO.mo121674T()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m218244a(ThreadMessageVO threadMessageVO, boolean z) {
        if (!z) {
            mo191280a(threadMessageVO, "unpin", "none");
        }
    }

    /* renamed from: d */
    private void m218257d(View view, ThreadMessageVO threadMessageVO) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View inflate = LayoutInflater.from(this.f138595d).inflate(R.layout.layout_thread_window_operation_menu, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.btn_delete_topic);
        View findViewById = inflate.findViewById(R.id.btn_pin_divider);
        View findViewById2 = inflate.findViewById(R.id.share_pin_divider);
        View findViewById3 = inflate.findViewById(R.id.btn_share_topic);
        View findViewById4 = inflate.findViewById(R.id.btn_todo_divider);
        m218241a(textView, R.drawable.ud_icon_recall_outlined);
        textView.setVisibility(0);
        findViewById.setVisibility(8);
        findViewById3.setVisibility(8);
        findViewById2.setVisibility(8);
        ((TextView) inflate.findViewById(R.id.btn_pin_topic)).setVisibility(8);
        ((TextView) inflate.findViewById(R.id.btn_todo)).setVisibility(8);
        findViewById4.setVisibility(8);
        Dialog a = C57811b.m224342a((Context) this.f138595d, inflate, (int) R.style.customDialog, true);
        int windowWidth = (UIHelper.getWindowWidth(this.f138595d) - iArr[0]) - view.getWidth();
        int height = (iArr[1] - UIUtils.getHeight(inflate)) - DeviceUtils.getStatusHeight(this.f138595d);
        if (height < this.f138693s.mo190972k()) {
            height = (iArr[1] + view.getHeight()) - DeviceUtils.getStatusHeight(this.f138595d);
        }
        float[] fArr = {(float) UIHelper.px2dp((float) windowWidth), (float) UIHelper.px2dp((float) height)};
        textView.setOnClickListener(new View.OnClickListener(threadMessageVO, a) {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$FOO6znBqR5Rk3PpsPP8dprZf8rw */
            public final /* synthetic */ ThreadMessageVO f$1;
            public final /* synthetic */ Dialog f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                BaseTopicFragment.this.m218252b((BaseTopicFragment) this.f$1, (ThreadMessageVO) this.f$2, (Dialog) view);
            }
        });
        C57810a.m224339c(this.f138595d, a, fArr);
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: c */
    public void mo191296c(View view, ThreadMessageVO threadMessageVO) {
        boolean z;
        Boolean bool = (Boolean) view.getTag(R.id.translate_show_origin_tag);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        ContentVO g = threadMessageVO.mo121699g();
        if (g instanceof TranslatableContentVO) {
            if (valueOf.booleanValue()) {
                this.f138693s.mo190766a(view, threadMessageVO.mo121662H(), ((TranslatableContentVO) g).mo121925t(), threadMessageVO.mo121673S());
            } else {
                this.f138693s.mo190793e(threadMessageVO.mo121662H());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m218260e(android.view.View r23, final com.ss.android.lark.chat.base.view.vo.ThreadMessageVO r24) {
        /*
        // Method dump skipped, instructions count: 771
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.fragment.BaseTopicFragment.m218260e(android.view.View, com.ss.android.lark.chat.base.view.vo.ThreadMessageVO):void");
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: b */
    public void mo191289b(View view, ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121668N()) {
            mo191292b(UIHelper.getString(R.string.Lark_Chat_TopicWasRecalledToast));
        } else if (threadMessageVO.mo121674T()) {
            m218257d(view, threadMessageVO);
        } else {
            m218260e(view, threadMessageVO);
        }
    }

    /* renamed from: a */
    private void m218247a(String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(UIHelper.getString(R.string.Lark_Chat_RecallTopicConfirmationButton));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.function_danger_500)), 0, spannableStringBuilder.length(), 33);
        new C25639g(this.f138595d).mo89248g(R.string.Lark_Chat_RecallTopicConfirmationTitle).mo89238b(true).mo89254m(R.string.Lark_Chat_RecallTopicConfirmationDesc).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_TopicToolDeleteTipCancel, $$Lambda$BaseTopicFragment$ujEQ6nULSQQWpceqZz_nzizQeas.INSTANCE).mo89225a(R.id.lkui_dialog_btn_right, spannableStringBuilder, new DialogInterface.OnClickListener(z, str) {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$BaseTopicFragment$dE1KQTFcyJPi2Xf1rfs5XAmF4 */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                BaseTopicFragment.this.m218249a((BaseTopicFragment) this.f$1, (boolean) this.f$2, (String) dialogInterface, (DialogInterface) i);
            }
        }).mo89239c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m218252b(ThreadMessageVO threadMessageVO, Dialog dialog, View view) {
        ThreadTopicHitPoint.f135906a.mo187721b("group");
        m218247a(threadMessageVO.mo121696d(), true);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m218242a(ThreadMessageVO threadMessageVO, Dialog dialog, View view) {
        ThreadTopicHitPoint.f135906a.mo187721b("group");
        mo191280a(threadMessageVO, "withdraw_topic", "none");
        if (m218256c(threadMessageVO)) {
            MessageHitPoint.f135779d.mo187545b(threadMessageVO.mo121692b(), "group_topic");
        }
        m218247a(threadMessageVO.mo121662H(), false);
        dialog.dismiss();
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: c */
    public void mo191297c(View view, ThreadMessageVO threadMessageVO, int i) {
        boolean z;
        String str;
        if (!threadMessageVO.mo121674T()) {
            if (threadMessageVO.mo121715w() != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean O = true ^ threadMessageVO.mo121669O();
            ThreadTopicHitPoint.f135906a.mo187725c("reply_icon");
            ThreadTopicHitPoint.Companion aVar = ThreadTopicHitPoint.f135906a;
            String H = threadMessageVO.mo121662H();
            if (TextUtils.isEmpty(threadMessageVO.mo121679Y())) {
                str = "-1";
            } else {
                str = threadMessageVO.mo121679Y();
            }
            aVar.mo187719a("reply", H, str, i, threadMessageVO.af(), threadMessageVO.mo121692b());
            this.f138693s.mo190780a(threadMessageVO.mo121662H(), z, O, threadMessageVO.mo121673S());
            ThreadTopicHitPoint.f135906a.mo187711a();
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.block.OtherAreaBlock.AbstractC56166a
    /* renamed from: b */
    public void mo191290b(View view, ThreadMessageVO threadMessageVO, int i) {
        this.f138693s.mo190775a(threadMessageVO.mo121662H(), "THUMBSUP", threadMessageVO.mo121673S(), i, threadMessageVO.af(), 4);
        ChatHitPointNew.f135660c.mo187388a(threadMessageVO.mo121692b(), "topic_reaction_click", "none", ChatHitPointNew.f135660c.mo187379a(threadMessageVO.mo121662H()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m218246a(String str, String str2, DialogInterface dialogInterface, int i) {
        ThreadTopicHitPoint.f135906a.mo187729d(str, str2);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m218245a(String str, String str2, int i, DialogInterface dialogInterface, int i2) {
        ThreadTopicHitPoint.f135906a.mo187726c(str, str2);
        this.f138693s.mo190779a(str2, true, i);
    }
}
