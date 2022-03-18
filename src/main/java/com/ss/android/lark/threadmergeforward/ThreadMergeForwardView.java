package com.ss.android.lark.threadmergeforward;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.statistics.multiselect.MultiSelectHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.AbstractC55904c;
import com.ss.android.lark.threaddetail.view.C55906d;
import com.ss.android.lark.threaddetail.view.callback.IThreadDetailCallbackHub;
import com.ss.android.lark.threaddetail.view.message.C55916a;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.threadmergeforward.AbstractC55960c;
import com.ss.android.lark.threadmergeforward.C55954a;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.C58984d;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\f\u0018\u0000 g2\u00020\u0001:\u0003ghiB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020+H\u0002J\u000e\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020+J\b\u0010A\u001a\u00020=H\u0016J\b\u0010B\u001a\u00020=H\u0016J\b\u0010C\u001a\u00020=H\u0016J\b\u0010D\u001a\u00020=H\u0016J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020#0IH\u0002J\b\u0010J\u001a\u00020=H\u0002J\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020=H\u0002J\b\u0010P\u001a\u00020=H\u0002J\b\u0010Q\u001a\u00020=H\u0002J\b\u0010R\u001a\u00020=H\u0002J\u001e\u0010S\u001a\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020#0I2\u0006\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u00020=H\u0016J\u0016\u0010Y\u001a\u00020=2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0[H\u0016J\u0010\u0010\\\u001a\u00020=2\u0006\u0010]\u001a\u000209H\u0016J\u0012\u0010^\u001a\u00020=2\b\u0010_\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010`\u001a\u00020=2\b\u0010_\u001a\u0004\u0018\u00010GJ2\u0010a\u001a\u00020=2\u0006\u0010b\u001a\u00020+2\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010[2\b\u0010e\u001a\u0004\u0018\u00010\u00172\u0006\u0010f\u001a\u00020TH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0002\b\u0003\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006j"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView;", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView;", "context", "Landroidx/fragment/app/FragmentActivity;", "viewDependency", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "mAdapter", "Lcom/ss/android/lark/threaddetail/view/IThreadDetailAdapter;", "mCallbackHub", "com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$mCallbackHub$1", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$mCallbackHub$1;", "mDetailContentRv", "Landroidx/recyclerview/widget/RecyclerView;", "getMDetailContentRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setMDetailContentRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mMenuHandler", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;", "mMultiSelectContainer", "Landroid/view/View;", "mMultiSelectForwardLayout", "mMultiSelectOneByOneFrowardLayout", "mMultiSelectSaveLayout", "mMultiSelectStub", "Landroid/view/ViewStub;", "getMMultiSelectStub", "()Landroid/view/ViewStub;", "setMMultiSelectStub", "(Landroid/view/ViewStub;)V", "mMultiSelector", "Lcom/ss/android/lark/widget/recyclerview/MultiSelector;", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "mRootView", "Landroid/view/ViewGroup;", "getMRootView", "()Landroid/view/ViewGroup;", "setMRootView", "(Landroid/view/ViewGroup;)V", "mState", "", "mThreadSubTitle", "Landroid/widget/TextView;", "mThreadTitle", "mThreadTitleIcon", "Landroid/widget/ImageView;", "mThreadTitleLayout", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "mViewDelegate", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView$Delegate;", "getViewDependency", "()Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;", "changeState", "", "state", "changeToMultiSelectMode", "position", "changeToNormalState", "create", "destroy", "finish", "getSelectedMessageIds", "Ljava/util/ArrayList;", "", "uiItemList", "", "initAdapter", "initCellClickHandler", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardClickHandler;", "chatContext", "Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailContext;", "initMultiSelectView", "initRecyclerView", "initTitleBar", "initView", "isSelectMessageValid", "", "uiItems", "validChecker", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$IMessageValidChecker;", "onDataInit", "setDataList", "snapshots", "", "setViewDelegate", "viewDelegate", "showToast", "msg", "showUnSupportMultiSelectMessageDialog", "startPhotoPreview", "currentPosition", "photoItems", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "view", "isMute", "Companion", "IMessageValidChecker", "ViewDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThreadMergeForwardView implements C55954a.AbstractC55957b {

    /* renamed from: e */
    public static final Companion f138246e = new Companion(null);

    /* renamed from: a */
    public AbstractC55904c f138247a;

    /* renamed from: b */
    public C58984d<C55905a, ?> f138248b;

    /* renamed from: c */
    public C55954a.AbstractC55957b.AbstractC55958a f138249c;

    /* renamed from: d */
    public int f138250d;

    /* renamed from: f */
    private View f138251f;

    /* renamed from: g */
    private TextView f138252g;

    /* renamed from: h */
    private TextView f138253h;

    /* renamed from: i */
    private ImageView f138254i;

    /* renamed from: j */
    private View f138255j;

    /* renamed from: k */
    private View f138256k;

    /* renamed from: l */
    private View f138257l;

    /* renamed from: m */
    private View f138258m;
    @BindView(8196)
    public RecyclerView mDetailContentRv;
    @BindView(8278)
    public ViewStub mMultiSelectStub;
    @BindView(8599)
    public ViewGroup mRootView;
    @BindView(9025)
    public CommonTitleBar mTitleBar;

    /* renamed from: n */
    private final C55952o f138259n = new C55952o(this);

    /* renamed from: o */
    private final AbstractC55897p f138260o = new C55953p(this);

    /* renamed from: p */
    private final FragmentActivity f138261p;

    /* renamed from: q */
    private final ViewDependency f138262q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J>\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J \u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H&¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;", "", "finishActivity", "", "injectView", "view", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView;", "startPhotoPreview", "currentPosition", "", "photoItems", "", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "Landroid/view/View;", "isMute", "", "chatId", "", "startSelectChatActivityFromMergeForward", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "selectedMessageIds", "Ljava/util/ArrayList;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo190702a();

        /* renamed from: a */
        void mo190703a(int i, List<? extends PhotoItem> list, View view, boolean z, String str);

        /* renamed from: a */
        void mo190704a(Chat chat, ArrayList<String> arrayList);

        /* renamed from: a */
        void mo190705a(C55954a.AbstractC55957b bVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "getThreadId"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$i */
    public static final class C55946i implements C55934b.AbstractC55936b {

        /* renamed from: a */
        public static final C55946i f138269a = new C55946i();

        C55946i() {
        }

        @Override // com.ss.android.lark.threaddetail.view.message.C55934b.AbstractC55936b
        public final String getThreadId() {
            return "";
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$Companion;", "", "()V", "STATE_MULTI_SELECT", "", "STATE_NORMAL", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final FragmentActivity mo190715d() {
        return this.f138261p;
    }

    /* renamed from: e */
    public final ViewDependency mo190716e() {
        return this.f138262q;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010 \u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010!\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\"\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010#\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010$\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0016J<\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020&H\u0016J&\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020&2\u0014\u00103\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u000305\u0018\u000104H\u0016J\u0012\u00106\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u00107\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J:\u00108\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\u00103\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u000305\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010\u001e2\u0006\u0010;\u001a\u00020\u0015H\u0016J2\u0010<\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\u00103\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u000305\u0018\u0001092\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J$\u0010?\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0015H\u0016J$\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020&H\u0016J&\u0010B\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u001e\u0010F\u001a\u00020\u00032\u0014\u0010G\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u000305\u0018\u000109H\u0016J\"\u0010H\u001a\u00020\u00032\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010K\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010L\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010N\u001a\u00020\u00032\u0006\u00102\u001a\u00020&H\u0016J\u0010\u0010O\u001a\u00020\u00032\u0006\u00102\u001a\u00020&H\u0016J\b\u0010P\u001a\u00020\u0003H\u0016J\u0012\u0010Q\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0016J(\u0010S\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\u0010T\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u000305\u0018\u000104H\u0016J\u0012\u0010U\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J0\u0010V\u001a\u00020\u00032\b\u0010W\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010D\u001a\u0004\u0018\u00010EH\u0016¨\u0006X"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$mCallbackHub$1", "Lcom/ss/android/lark/threaddetail/view/callback/IThreadDetailCallbackHub;", "getChatChatter", "", "chatId", "", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "onActionHandleAsyncStart", "msgId", "onAddReaction", "messageId", "reactionType", "onAtClick", "view", "Landroid/view/View;", "userId", "onAvatarClick", BottomDialog.f17198f, "onAvatarLongClick", "", "chatterName", "isAnonymous", "onCancelUploadClick", "messageCid", "onCardImageClick", "imageView", "cardImags", "", "Lcom/ss/android/lark/widget/richtext/Image;", "clickedImageItem", "onContinueUploadClick", "onDeleteReaction", "onDownloadFileBtnClick", "onFileClick", "onFileClicked", "topicTabType", "", "onFolderClick", "onImageClick", "itemView", "locationInfo", "Lcom/ss/android/lark/widget/photo_picker/animation/activity_transition/ActivityTransitionLauncher$LocationInfo;", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isMutePlay", "isClickTranslated", "fromType", "onMessageCheckBoxClick", "position", "item", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "onOnlineReviewFileClick", "onOpenLKPFileBtnClick", "onPostImageClick", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "image", "isTranslated", "onPostVideoClick", "mediaProperty", "Lcom/ss/android/lark/widget/richtext/RichTextElement$MediaProperty;", "onPreMediaClick", "onPrepareAudioData", "key", "onPreviewFileInDrive", "sourceId", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "onReEdit", "messageVO", "onReactionMoreClicked", "reactionInfos", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "onReactionNameClicked", "onRecallMessageClicked", "recallUserId", "onRecallMessageReEdit", "onResendMessageClicked", "onShowSysKeyBoard", "onStopDownloadFileBtnClick", "onThreadMergeForwardClick", "onTranslateBtnClick", "chatMessage", "onTranslateFeedbackClick", "onUploadToDriveSpaceBtnClick", "fileKey", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$o */
    public static final class C55952o implements IThreadDetailCallbackHub {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138278a;

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55868d
        /* renamed from: A */
        public void mo190439A() {
        }

        @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a
        /* renamed from: a */
        public /* synthetic */ void mo190444a(View view, AbsMessageVO aVar) {
            ThreadWindowPostCell2.AbstractC56194a.CC.$default$a(this, view, aVar);
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: a */
        public void mo190447a(View view, ChatMessageVO<? extends ContentVO<?>> cVar) {
        }

        @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
        /* renamed from: a */
        public void mo122830a(View view, List<Image> list, Image image) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
        /* renamed from: a */
        public void mo122761a(AbsMessageVO<? extends ContentVO<?>> aVar) {
        }

        @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
        /* renamed from: a */
        public void mo122832a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "msgId");
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: a */
        public void mo190458a(String str, String str2) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: a */
        public void mo122765a(String str, String str2, Message.SourceType sourceType) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: a */
        public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: a */
        public boolean mo190463a(String str, String str2, boolean z) {
            return false;
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: b */
        public void mo190467b(String str, String str2) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: b */
        public void mo190468b(List<ReactionInfo> list, String str) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55867c
        /* renamed from: d */
        public void mo190470d(int i) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55868d
        /* renamed from: e */
        public void mo190473e(int i) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: h */
        public void mo190476h(String str) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: i */
        public void mo190477i(String str) {
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55867c
        /* renamed from: j */
        public void mo190478j(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: k */
        public void mo122767k(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: l */
        public void mo122768l(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: m */
        public void mo122769m(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: n */
        public void mo122770n(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
        /* renamed from: p */
        public void mo122774p(String str) {
        }

        @Override // com.ss.android.lark.threadwindow.view.message.C56199a.AbstractC56205a
        /* renamed from: a */
        public void mo190459a(String str, String str2, int i) {
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
            if (aVar != null) {
                aVar.mo190736a(str, str2);
            }
        }

        @Override // com.ss.android.lark.threadwindow.view.message.C56213e.AbstractC56214a
        /* renamed from: a */
        public void mo190456a(String str, int i) {
            Chat b;
            AbstractC55904c cVar = this.f138278a.f138247a;
            if (cVar != null) {
                C55905a b2 = cVar.mo190569b(cVar.mo190567a(str));
                Intrinsics.checkExpressionValueIsNotNull(b2, "adapter.getItemByPositio…ItemIndexById(messageId))");
                MessageInfo f = b2.mo190598f();
                if (f != null) {
                    Message message = f.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                    if (message.getType() == Message.Type.FILE) {
                        Message message2 = f.getMessage();
                        Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                        AbstractC36474h b3 = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                        AbstractC36505s S = b3.mo134520S();
                        FragmentActivity d = this.f138278a.mo190715d();
                        C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
                        boolean isSecret = (aVar == null || (b = aVar.mo190738b()) == null) ? false : b.isSecret();
                        AbstractC36474h b4 = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
                        AbstractC36505s S2 = b4.mo134520S();
                        Intrinsics.checkExpressionValueIsNotNull(S2, "ChatModuleInstanceHolder…cy().fileDetailDependency");
                        long a = S2.mo134696a();
                        C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138278a.f138249c;
                        S.mo134702a(d, message2, isSecret, a, aVar2 != null ? aVar2.mo190741d() : null);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
        /* renamed from: a */
        public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
            if (aVar != null) {
                aVar.mo190735a(str, iGetDataCallback);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55952o(ThreadMergeForwardView threadMergeForwardView) {
            this.f138278a = threadMergeForwardView;
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: g */
        public void mo190475g(String str) {
            String str2;
            if (!TextUtils.isEmpty(str)) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36461ah V = b.mo134523V();
                FragmentActivity d = this.f138278a.mo190715d();
                ProfileSource.C36868a c = new ProfileSource.C36868a().mo136066c(str);
                C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
                Chat chat = null;
                if (aVar != null) {
                    str2 = aVar.mo190740c();
                } else {
                    str2 = null;
                }
                ProfileSource.C36868a a = c.mo136065b(str2).mo136064b(4).mo136060a(0);
                C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138278a.f138249c;
                if (aVar2 != null) {
                    chat = aVar2.mo190738b();
                }
                V.mo134436a(d, a.mo136062a(C34339g.m133170d(chat)).mo136063a());
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
        /* renamed from: u */
        public void mo123362u(String str) {
            String d;
            AbstractC55904c cVar;
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
            if (aVar != null && (d = aVar.mo190741d()) != null && (cVar = this.f138278a.f138247a) != null) {
                C55905a b = cVar.mo190569b(cVar.mo190567a(str));
                Intrinsics.checkExpressionValueIsNotNull(b, "adapter.getItemByPositio…ItemIndexById(messageId))");
                MessageInfo f = b.mo190598f();
                if (f != null) {
                    Message message = f.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                    if (message.getType() == Message.Type.MERGE_FORWARD) {
                        Message a = C34350p.m133211a(f);
                        Intrinsics.checkExpressionValueIsNotNull(a, "message");
                        ThreadMergeForwardLauncher.f138288a.mo190745a(this.f138278a.mo190715d(), d, a);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.threaddetail.view.p2751a.AbstractC55866b
        /* renamed from: a */
        public void mo190443a(int i, ChatMessageVO<? extends ContentVO<?>> cVar) {
            C58984d<C55905a, ?> dVar;
            if (i != -1 && (dVar = this.f138278a.f138248b) != null) {
                dVar.mo200098a(i);
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
        /* renamed from: d */
        public void mo123355d(String str, int i) {
            String str2;
            int i2;
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            AbstractC55904c cVar = this.f138278a.f138247a;
            if (cVar != null) {
                C55905a b = cVar.mo190569b(cVar.mo190567a(str));
                Intrinsics.checkExpressionValueIsNotNull(b, "adapter.getItemByPositio…ItemIndexById(messageId))");
                MessageInfo f = b.mo190598f();
                if (f != null) {
                    Message message = f.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                    if (message.getType() == Message.Type.FOLDER) {
                        Message message2 = f.getMessage();
                        Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                        String str3 = str;
                        C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
                        if (aVar != null) {
                            str2 = aVar.mo190733a();
                        } else {
                            str2 = null;
                        }
                        boolean equals = TextUtils.equals(str3, str2);
                        AbstractC36505s S = C29990c.m110930b().mo134520S();
                        FragmentActivity d = this.f138278a.mo190715d();
                        if (equals) {
                            i2 = 2;
                        } else {
                            i2 = 3;
                        }
                        S.mo134697a(d, message2, i2);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
        /* renamed from: a */
        public void mo190446a(View view, AbsMessageVO<? extends ContentVO<?>> aVar, RichTextElement.MediaProperty mediaProperty) {
            String d;
            String a;
            String b;
            C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138278a.f138249c;
            if (aVar2 != null && (d = aVar2.mo190741d()) != null && aVar != null && (a = aVar.mo121681a()) != null && (b = aVar.mo121692b()) != null) {
                MediaImageSet a2 = C57308c.m222071a(a, b, mediaProperty);
                Intrinsics.checkExpressionValueIsNotNull(a2, "mediaImageSet");
                MessageIdentity messageIdentity = a2.getMessageIdentity();
                if (messageIdentity != null) {
                    messageIdentity.setSourceId(d);
                }
                MessageIdentity messageIdentity2 = a2.getMessageIdentity();
                if (messageIdentity2 != null) {
                    messageIdentity2.setSourceType(Message.SourceType.TYPE_FROM_MERGEFORWARD);
                }
                List<PhotoItem> a3 = C58659h.m227513a(CollectionsKt.listOf(a2));
                if (!CollectionUtils.isEmpty(a3)) {
                    C29990c.m110930b().mo134541a(this.f138278a.mo190715d(), a3, 0, view, null, false, false, false, false, false, false, null, null, Scene.Thread, 4);
                }
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
        /* renamed from: a */
        public void mo122773a(View view, PhotoItem photoItem, boolean z) {
            Chat b;
            boolean z2;
            ArrayList arrayList = new ArrayList();
            if (photoItem == null) {
                Intrinsics.throwNpe();
            }
            arrayList.add(photoItem);
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
            if (aVar != null && (b = aVar.mo190738b()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "mViewDelegate?.chat ?: return");
                AbstractC36474h b2 = C29990c.m110930b();
                FragmentActivity d = this.f138278a.mo190715d();
                if (b == null || b.isSecret()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                b2.mo134541a(d, arrayList, 0, view, null, z2, false, false, z, false, false, null, null, Scene.Thread, 4);
            }
        }

        @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
        /* renamed from: a */
        public void mo190448a(View view, String str, String str2) {
            Chat chat;
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36461ah V = b.mo134523V();
            FragmentActivity d = this.f138278a.mo190715d();
            ProfileSource.C36868a a = new ProfileSource.C36868a().mo136066c(str).mo136065b(str2).mo136064b(4).mo136060a(0);
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
            if (aVar != null) {
                chat = aVar.mo190738b();
            } else {
                chat = null;
            }
            V.mo134436a(d, a.mo136062a(C34339g.m133170d(chat)).mo136063a());
        }

        @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AbstractC56183a
        /* renamed from: a */
        public void mo190445a(View view, AbsMessageVO<? extends ContentVO<?>> aVar, Image image, boolean z) {
            String str;
            String c;
            ContentVO g;
            if (image != null) {
                Chat chat = null;
                Content z2 = (aVar == null || (g = aVar.mo121699g()) == null) ? null : g.mo126168z();
                if (!(z2 instanceof PostContent)) {
                    z2 = null;
                }
                PostContent postContent = (PostContent) z2;
                if (postContent != null) {
                    if (z) {
                        ContentVO g2 = aVar.mo121699g();
                        if (g2 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
                        } else if (((PostContentVO) g2).mo121930y() != null) {
                            ContentVO g3 = aVar.mo121699g();
                            if (g3 != null) {
                                TranslatableContentVO y = ((PostContentVO) g3).mo121930y();
                                PostContent postContent2 = y != null ? (PostContent) y.mo126168z() : null;
                                if (postContent2 != null) {
                                    postContent = postContent2;
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
                            }
                        }
                    }
                    List<PhotoItem> a = C34353s.m133246a(C57305aa.m222056a(C59031e.m229179a(postContent.getRichText())), aVar.mo121681a(), z);
                    if (!(CollectionUtils.isEmpty(a) || CollectionUtils.isEmpty(C34353s.m133244a(CollectionsKt.listOf(C57305aa.m222055a(image)))))) {
                        for (PhotoItem photoItem : a) {
                            if (photoItem != null) {
                                photoItem.getPhotoState().setLoadOrigin(true);
                            }
                        }
                        List<PhotoItem> a2 = C34353s.m133246a(CollectionsKt.listOf(C57305aa.m222055a(image)), aVar.mo121681a(), z);
                        if (!CollectionUtils.isEmpty(a2)) {
                            PhotoItem photoItem2 = a2.get(0);
                            C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138278a.f138249c;
                            if (aVar2 != null) {
                                chat = aVar2.mo190738b();
                            }
                            String str2 = "";
                            if (chat != null) {
                                ChatAnnouncement chatAnnouncement = chat.getChatAnnouncement();
                                Intrinsics.checkExpressionValueIsNotNull(chatAnnouncement, "chat.chatAnnouncement");
                                str = chatAnnouncement.getAnnounceUrl();
                            } else {
                                str = str2;
                            }
                            if (aVar.ai() || !postContent.isGroupAnnouncement() || TextUtils.isEmpty(str)) {
                                int a3 = C34353s.m133238a(a, photoItem2);
                                FragmentActivity d = this.f138278a.mo190715d();
                                BaseData.AnimationType animationType = BaseData.AnimationType.TRANSLATE_ANIMATION;
                                C55954a.AbstractC55957b.AbstractC55958a aVar3 = this.f138278a.f138249c;
                                if (!(aVar3 == null || (c = aVar3.mo190740c()) == null)) {
                                    str2 = c;
                                }
                                C58630d.m227372a(d, a, a3, view, animationType, true, false, true, false, true, false, false, new DialogMenuClickListenerImpl(str2), null, "", null, Biz.Messenger, Scene.Thread, 2);
                                return;
                            }
                            AbstractC36474h b = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                            b.mo134593u().mo134330a(this.f138278a.mo190715d(), str);
                        }
                    }
                }
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
        /* renamed from: a */
        public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
            Intrinsics.checkParameterIsNotNull(photoItem, "photoItem");
            ArrayList arrayList = new ArrayList();
            arrayList.add(photoItem);
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138278a.f138249c;
            if (aVar != null) {
                aVar.mo190734a(view, photoItem, arrayList, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$initAdapter$1", "Lcom/ss/android/lark/widget/recyclerview/MultiSelector$IAdapterActionProxy;", "notifyAdapterDataSetChanged", "", "notifyAdapterItemChanged", "position", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$g */
    public static final class C55944g implements C58984d.AbstractC58985a {

        /* renamed from: a */
        final /* synthetic */ C55959b f138267a;

        @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58985a
        /* renamed from: a */
        public void mo190524a() {
            this.f138267a.notifyDataSetChanged();
        }

        C55944g(C55959b bVar) {
            this.f138267a = bVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58985a
        /* renamed from: a */
        public void mo190525a(int i) {
            this.f138267a.notifyItemChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "getChat"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$h */
    public static final class C55945h implements C55934b.AbstractC55935a {

        /* renamed from: a */
        public static final C55945h f138268a = new C55945h();

        C55945h() {
        }

        /* renamed from: a */
        public final Void mo190717a() {
            return null;
        }

        @Override // com.ss.android.lark.threaddetail.view.message.C55934b.AbstractC55935a
        public /* synthetic */ Chat getChat() {
            return (Chat) mo190717a();
        }
    }

    /* renamed from: f */
    private final void m217358f() {
        m217359g();
        m217360h();
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b
    /* renamed from: b */
    public void mo190713b() {
        this.f138262q.mo190702a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f138262q.mo190705a(this);
        m217358f();
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b
    /* renamed from: c */
    public void mo190714c() {
        Chat chat;
        String str;
        ThreadTopicHitPointNew.Companion aVar = ThreadTopicHitPointNew.f135908b;
        C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138249c;
        if (aVar2 != null) {
            chat = aVar2.mo190738b();
        } else {
            chat = null;
        }
        C55954a.AbstractC55957b.AbstractC55958a aVar3 = this.f138249c;
        if (aVar3 == null || (str = aVar3.mo190733a()) == null) {
            str = "";
        }
        aVar.mo187751a(chat, str);
    }

    /* renamed from: h */
    private final void m217360h() {
        RecyclerView recyclerView = this.mDetailContentRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailContentRv");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f138261p));
        RecyclerView recyclerView2 = this.mDetailContentRv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailContentRv");
        }
        recyclerView2.setOverScrollMode(2);
        m217361i();
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b
    /* renamed from: a */
    public void mo190706a() {
        View view = this.f138255j;
        if (view != null && view != null && view.getVisibility() == 0) {
            m217359g();
            View view2 = this.f138255j;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            m217357b(0);
            C58984d<C55905a, ?> dVar = this.f138248b;
            if (dVar != null) {
                dVar.mo200103a(false);
            }
        }
    }

    /* renamed from: i */
    private final void m217361i() {
        C55959b bVar = new C55959b();
        C55947j jVar = new C55947j(this, bVar, bVar.mo190626a());
        jVar.mo200100a((C58984d.AbstractC58985a) new C55944g(bVar));
        this.f138248b = jVar;
        bVar.mo200127a(C57852m.m224554a(this.f138261p));
        C55934b bVar2 = new C55934b(this.f138261p, bVar, C55945h.f138268a, C55946i.f138269a);
        bVar2.mo190685a(jVar);
        C55916a.m217236a(bVar2, this.f138259n, m217356a(bVar2), this.f138260o).mo190655a(bVar);
        RecyclerView recyclerView = this.mDetailContentRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailContentRv");
        }
        recyclerView.setAdapter(bVar);
        this.f138247a = bVar;
    }

    /* renamed from: j */
    private final void m217362j() {
        if (this.f138255j == null) {
            ViewGroup viewGroup = null;
            ViewStub viewStub = this.mMultiSelectStub;
            if (viewStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMultiSelectStub");
            }
            if (viewStub != null) {
                ViewStub viewStub2 = this.mMultiSelectStub;
                if (viewStub2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMultiSelectStub");
                }
                if (viewStub2 != null) {
                    viewGroup = viewStub2.inflate();
                }
            } else {
                ViewGroup viewGroup2 = this.mRootView;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                viewGroup = viewGroup2;
            }
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            this.f138255j = viewGroup.findViewById(R.id.multi_select_menu_container);
            this.f138256k = viewGroup.findViewById(R.id.multi_forward_wrapper);
            this.f138257l = viewGroup.findViewById(R.id.one_by_one_forward_wrapper);
            this.f138258m = viewGroup.findViewById(R.id.multi_save_wrapper);
        }
    }

    /* renamed from: g */
    private final void m217359g() {
        TextPaint paint;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setLeftClickListener(new View$OnClickListenerC55950m(this));
        if (this.f138251f == null) {
            View inflate = LayoutInflater.from(this.f138261p).inflate(R.layout.thread_detail_titlebar, (ViewGroup) null);
            this.f138251f = inflate;
            this.f138252g = (TextView) inflate.findViewById(R.id.tv_thread_title);
            this.f138253h = (TextView) inflate.findViewById(R.id.tv_thread_subtitle);
            this.f138254i = (ImageView) inflate.findViewById(R.id.iv_right_arrow);
            TextView textView = this.f138252g;
            if (textView != null) {
                textView.setText(UIHelper.getString(R.string.Lark_Group_FromTopicGroup));
            }
            ImageView imageView = this.f138254i;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView2 = this.f138253h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            CommonTitleBar commonTitleBar3 = this.mTitleBar;
            if (commonTitleBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            commonTitleBar3.setCustomTitleView(inflate);
            TextView textView3 = this.f138252g;
            if (!(textView3 == null || (paint = textView3.getPaint()) == null)) {
                paint.setFakeBoldText(true);
            }
        }
        CommonTitleBar commonTitleBar4 = this.mTitleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar4.setDividerVisible(true);
        CommonTitleBar commonTitleBar5 = this.mTitleBar;
        if (commonTitleBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar5.removeAllActions();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIHelper.dp2px(44.0f), UIHelper.dp2px(20.0f));
        layoutParams.gravity = 16;
        FragmentActivity fragmentActivity = this.f138261p;
        Drawable iconDrawable = UDIconUtils.getIconDrawable(fragmentActivity, R.drawable.ud_icon_forward_outlined, UIUtils.getColor(fragmentActivity, R.color.icon_n1), new UDDimension.Dp(20.0f));
        C55951n nVar = new C55951n(this, iconDrawable, iconDrawable);
        CommonTitleBar commonTitleBar6 = this.mTitleBar;
        if (commonTitleBar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar6.addAction(nVar, layoutParams);
    }

    /* renamed from: b */
    private final void m217357b(int i) {
        this.f138250d = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$changeToMultiSelectMode$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$d */
    public static final class C55941d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138264a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55941d(ThreadMergeForwardView threadMergeForwardView) {
            this.f138264a = threadMergeForwardView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Chat chat;
            Intrinsics.checkParameterIsNotNull(view, "v");
            C58984d<C55905a, ?> dVar = this.f138264a.f138248b;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            List<C55905a> a = dVar.mo200097a();
            if (CollectionUtils.isEmpty(a)) {
                this.f138264a.mo190710a(UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit));
                return;
            }
            MultiSelectHitPoint.f135851a.mo187657a(false);
            ViewDependency e = this.f138264a.mo190716e();
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138264a.f138249c;
            if (aVar != null) {
                chat = aVar.mo190738b();
            } else {
                chat = null;
            }
            ThreadMergeForwardView threadMergeForwardView = this.f138264a;
            Intrinsics.checkExpressionValueIsNotNull(a, "selectedMessages");
            e.mo190704a(chat, threadMergeForwardView.mo190712b(a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$changeToMultiSelectMode$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$e */
    public static final class C55942e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138265a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55942e(ThreadMergeForwardView threadMergeForwardView) {
            this.f138265a = threadMergeForwardView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C58984d<C55905a, ?> dVar = this.f138265a.f138248b;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            List<C55905a> a = dVar.mo200097a();
            if (CollectionUtils.isEmpty(a)) {
                this.f138265a.mo190710a(UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit));
                return;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IForwardDependency E = b.mo134506E();
            FragmentActivity d = this.f138265a.mo190715d();
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138265a.f138249c;
            Chat b2 = aVar != null ? aVar.mo190738b() : null;
            Intrinsics.checkExpressionValueIsNotNull(a, "selectedMessages");
            List<C55905a> list = a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(t.mo190608k());
            }
            ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
            C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138265a.f138249c;
            E.mo134372a(d, null, b2, arrayList2, 9, "click", "thread_details", aVar2 != null ? aVar2.mo190741d() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$changeToMultiSelectMode$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$f */
    public static final class C55943f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138266a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55943f(ThreadMergeForwardView threadMergeForwardView) {
            this.f138266a = threadMergeForwardView;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C58984d<C55905a, ?> dVar = this.f138266a.f138248b;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            List<C55905a> a = dVar.mo200097a();
            if (CollectionUtils.isEmpty(a)) {
                this.f138266a.mo190710a(UIHelper.getString(R.string.Lark_Legacy_MultiSelectCountMinLimit));
                return;
            }
            MultiSelectHitPoint.f135851a.mo187661c(false);
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138266a.f138249c;
            if (aVar != null) {
                ThreadMergeForwardView threadMergeForwardView = this.f138266a;
                Intrinsics.checkExpressionValueIsNotNull(a, "selectedMessages");
                aVar.mo190739b(threadMergeForwardView.mo190712b(a));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$initCellClickHandler$2", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardClickHandler$Dependency;", "getMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "messageId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$l */
    public static final class C55949l implements AbstractC55960c.AbstractC55962a {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138274a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55949l(ThreadMergeForwardView threadMergeForwardView) {
            this.f138274a = threadMergeForwardView;
        }

        @Override // com.ss.android.lark.threadmergeforward.AbstractC55960c.AbstractC55962a
        /* renamed from: a */
        public MessageInfo mo190720a(String str) {
            C55905a b;
            AbstractC55904c cVar = this.f138274a.f138247a;
            if (cVar == null || (b = cVar.mo190569b(cVar.mo190567a(str))) == null) {
                return null;
            }
            return b.mo190598f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0014\u0010\t\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0015\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¨\u0006\u001d"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$mMenuHandler$1", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;", "onAddFavorite", "", "messageVO", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onAddSticker", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/StickerContentVO;", "onCopy", "onEditClicked", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isClickTranslated", "", "onForward", "messageId", "", "position", "", "onMultiSelect", "onRecall", "onReply", "onTodo", "onToggleAudioTextClick", "callback", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IToggleAudioTextMenuHandler$Callback;", "onTranslate", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler$Callback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$p */
    public static final class C55953p extends AbstractC55897p {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138279a;

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b
        /* renamed from: a */
        public void mo121952a(AbsMessageVO<StickerContentVO> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m
        /* renamed from: a */
        public void mo121953a(AbstractC55890m.AbstractC55891a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n
        /* renamed from: a */
        public void mo121954a(AbstractC55893n.AbstractC55894a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
        /* renamed from: a */
        public void mo121937a(PhotoItem photoItem, boolean z) {
            Intrinsics.checkParameterIsNotNull(photoItem, "photoItem");
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55887j
        /* renamed from: a */
        public void mo121955a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55886i
        /* renamed from: b */
        public void mo190487b(ChatMessageVO<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "messageVO");
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55888k
        /* renamed from: b */
        public void mo190488b(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55953p(ThreadMergeForwardView threadMergeForwardView) {
            this.f138279a = threadMergeForwardView;
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g
        /* renamed from: a */
        public void mo121950a(int i) {
            MultiSelectHitPoint.f135851a.mo187655a();
            this.f138279a.mo190707a(i);
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a
        /* renamed from: a */
        public void mo190485a(ChatMessageVO<?> cVar) {
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138279a.f138249c;
            if (aVar != null) {
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                aVar.mo190737a(CollectionsKt.listOf(cVar.mo121681a()));
            }
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c
        /* renamed from: b */
        public void mo190486b(AbsMessageVO<?> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
            C34438a.m133576a(this.f138279a.mo190715d(), C34438a.m133573a(this.f138279a.mo190715d(), aVar.mo121699g().mo126168z()));
        }

        @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e
        /* renamed from: a */
        public void mo121951a(String str, int i) {
            C55905a b;
            MessageInfo f;
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            AbstractC55904c cVar = this.f138279a.f138247a;
            if (cVar != null && (b = cVar.mo190569b(i)) != null && (f = b.mo190598f()) != null) {
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                IForwardDependency E = b2.mo134506E();
                FragmentActivity d = this.f138279a.mo190715d();
                Message message = f.getMessage();
                C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138279a.f138249c;
                if (aVar != null) {
                    str2 = aVar.mo190741d();
                } else {
                    str2 = null;
                }
                E.mo134371a(d, message, "topic_click", "thread_details", str2);
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C55954a.AbstractC55957b.AbstractC55958a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f138249c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$changeToMultiSelectMode$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$c */
    public static final class C55940c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138263a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            this.f138263a.mo190706a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55940c(ThreadMergeForwardView threadMergeForwardView, String str) {
            super(str);
            this.f138263a = threadMergeForwardView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$m */
    public static final class View$OnClickListenerC55950m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138275a;

        View$OnClickListenerC55950m(ThreadMergeForwardView threadMergeForwardView) {
            this.f138275a = threadMergeForwardView;
        }

        public final void onClick(View view) {
            this.f138275a.mo190716e().mo190702a();
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b
    /* renamed from: a */
    public void mo190710a(String str) {
        if (str != null) {
            UDToast.show(this.f138261p, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$initAdapter$multiSelector$1", "Lcom/ss/android/lark/widget/recyclerview/MultiSelector;", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "Lcom/ss/android/lark/threaddetail/view/ThreadDetailAdapter2$AdapterProxy;", "isItemSelectable", "", "item", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$j */
    public static final class C55947j extends C58984d<C55905a, C55906d.C55908a> {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138270a;

        /* renamed from: b */
        final /* synthetic */ C55959b f138271b;

        /* renamed from: a */
        public boolean mo123399a(C55905a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "item");
            if (super.mo123399a((Object) aVar) && this.f138270a.f138250d == 1 && aVar.mo190570A()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55947j(ThreadMergeForwardView threadMergeForwardView, C55959b bVar, RecyclerView.Adapter adapter) {
            super(adapter);
            this.f138270a = threadMergeForwardView;
            this.f138271b = bVar;
        }
    }

    /* renamed from: a */
    private final AbstractC55960c m217356a(C55934b bVar) {
        RecyclerView recyclerView = this.mDetailContentRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailContentRv");
        }
        return new C55948k(this, bVar, bVar, recyclerView, this.f138260o, new C55949l(this));
    }

    /* renamed from: b */
    public final ArrayList<String> mo190712b(List<? extends C55905a> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (C55905a aVar : list) {
            arrayList.add(aVar.mo190608k());
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$initTitleBar$forwardAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$n */
    public static final class C55951n extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardView f138276a;

        /* renamed from: b */
        final /* synthetic */ Drawable f138277b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Message e;
            String str;
            Intrinsics.checkParameterIsNotNull(view, "view");
            C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138276a.f138249c;
            if (aVar != null && (e = aVar.mo190742e()) != null) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                IForwardDependency E = b.mo134506E();
                FragmentActivity d = this.f138276a.mo190715d();
                C55954a.AbstractC55957b.AbstractC55958a aVar2 = this.f138276a.f138249c;
                if (aVar2 != null) {
                    str = aVar2.mo190741d();
                } else {
                    str = null;
                }
                E.mo134371a(d, e, "topic_click", "thread_details", str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55951n(ThreadMergeForwardView threadMergeForwardView, Drawable drawable, Drawable drawable2) {
            super(drawable2);
            this.f138276a = threadMergeForwardView;
            this.f138277b = drawable;
        }
    }

    /* renamed from: a */
    public final void mo190707a(int i) {
        m217362j();
        View view = this.f138255j;
        if (view != null) {
            view.setVisibility(0);
        }
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.removeAllActions();
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.addAction(new C55940c(this, UIHelper.getString(R.string.Lark_Legacy_CancelTitle)));
        View view2 = this.f138256k;
        if (view2 != null) {
            view2.setOnClickListener(new C55941d(this));
        }
        View view3 = this.f138257l;
        if (view3 != null) {
            view3.setOnClickListener(new C55942e(this));
        }
        View view4 = this.f138258m;
        if (view4 != null) {
            view4.setOnClickListener(new C55943f(this));
        }
        m217357b(1);
        C58984d<C55905a, ?> dVar = this.f138248b;
        if (dVar != null) {
            dVar.mo200103a(true);
        }
        C58984d<C55905a, ?> dVar2 = this.f138248b;
        if (dVar2 != null) {
            dVar2.mo200098a(i);
        }
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b
    /* renamed from: a */
    public void mo190711a(List<C55905a> list) {
        Intrinsics.checkParameterIsNotNull(list, "snapshots");
        AbstractC55904c cVar = this.f138247a;
        if (cVar != null) {
            cVar.mo190568a(list, false);
        }
    }

    public ThreadMergeForwardView(FragmentActivity fragmentActivity, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f138261p = fragmentActivity;
        this.f138262q = bVar;
    }

    @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b
    /* renamed from: a */
    public void mo190708a(int i, List<PhotoItem> list, View view, boolean z) {
        String str;
        ViewDependency bVar = this.f138262q;
        C55954a.AbstractC55957b.AbstractC55958a aVar = this.f138249c;
        if (aVar != null) {
            str = aVar.mo190740c();
        } else {
            str = null;
        }
        bVar.mo190703a(i, list, view, z, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardView$initCellClickHandler$1", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardClickHandler;", "onCellClick", "", "cell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "item", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.ThreadMergeForwardView$k */
    public static final class C55948k extends AbstractC55960c {

        /* renamed from: d */
        final /* synthetic */ ThreadMergeForwardView f138272d;

        /* renamed from: e */
        final /* synthetic */ C55934b f138273e;

        /* renamed from: b */
        public void mo123401e(AbstractC59004b<?, ?> bVar, AbstractC59010e eVar, ChatMessageVO<? extends ContentVO<?>> cVar) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55948k(ThreadMergeForwardView threadMergeForwardView, C55934b bVar, C55934b bVar2, RecyclerView recyclerView, AbstractC55897p pVar, AbstractC55960c.AbstractC55962a aVar) {
            super(bVar2, recyclerView, pVar, aVar);
            this.f138272d = threadMergeForwardView;
            this.f138273e = bVar;
        }
    }
}
