package com.ss.android.lark.mm.module.detail.contentdetail;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26401f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.ss.android.lark.mm.base.p2289a.AbstractC45860a;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.participant.ParticipantActivity;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.C47148c;
import com.ss.android.lark.mm.widget.pullrefresh.MmRefreshHeadView;
import com.ss.android.lark.utils.C57851l;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004:\u00016B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001fH\u0016J\b\u0010+\u001a\u00020\u001dH\u0002J\u0018\u0010,\u001a\u00020\u001d2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0002J \u00100\u001a\u00020\u001d2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u001dH\u0002J \u00105\u001a\u00020\u001d2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X.¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailListener;", "Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailDependency;", "Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "avatarListAdapter", "Lcom/ss/android/lark/mm/widget/MmCrescentUDAvatarListAdapter;", "callback", "Lcom/ss/android/lark/mm/base/repo/IMmDataCallback;", "", "fileAdapter", "Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailFileAdapter;", "ownerId", "renameCallback", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "viewHolder", "Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControl$MmContentDetailViewHolder;", "getLocalTimeToShow", "time", "", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "initData", "", "isRefresh", "", "initFileRecyclerView", "initRefreshLayout", "onBaseInfoChange", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "onCreate", "onDestroy", "onRefresh", "onStopScroll", "onVideoPlayerCompletelyVisibleChange", "isCompletelyVisible", "refreshParticipantAvatarList", "setAddParticipantIcon", "participants", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "setAvatarListAdapter", "total", "", "subscribe", "unsubscribe", "updateAvatarListAdapter", "MmContentDetailViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.a.g */
public final class MmContentDetailViewControl extends MmBaseViewControl<IMmContentDetailListener, IMmContentDetailDependency> implements IMmContentDetailInquirer, IMmContentDetailListener {

    /* renamed from: a */
    public MmContentDetailViewHolder f115799a;

    /* renamed from: b */
    public MmContentDetailFileAdapter f115800b;

    /* renamed from: c */
    public String f115801c;

    /* renamed from: d */
    public final IMmViewControlContext f115802d;

    /* renamed from: e */
    public final MmBaseViewControlAdapter<IMmContentDetailListener, IMmContentDetailDependency> f115803e;

    /* renamed from: f */
    private C47148c f115804f;

    /* renamed from: g */
    private final AbstractC45860a<String> f115805g = new C45931b(this);

    /* renamed from: h */
    private final AbstractC45860a<MinutesSummaryData> f115806h = new C45943h(this);

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: g */
    public IMmContentDetailListener mo161243c() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControl$MmContentDetailViewHolder;", "", "rootView", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControl;Landroid/view/View;)V", "addParticipants", "Landroid/widget/TextView;", "getAddParticipants", "()Landroid/widget/TextView;", "mmAvatar", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "getMmAvatar", "()Lcom/larksuite/component/universe_design/image/UDAvatar;", "mmCrescentAvatarListView", "Lcom/larksuite/component/universe_design/image/UDAvatarList;", "getMmCrescentAvatarListView", "()Lcom/larksuite/component/universe_design/image/UDAvatarList;", "mmName", "getMmName", "mmTime", "getMmTime", "mmTitle", "getMmTitle", "recycleView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycleView", "()Landroidx/recyclerview/widget/RecyclerView;", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "getRefreshLayout", "()Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "Landroidx/core/widget/NestedScrollView;", "getRootView", "()Landroidx/core/widget/NestedScrollView;", "urlTitle", "getUrlTitle", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$a */
    public final class MmContentDetailViewHolder {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailViewControl f115807a;

        /* renamed from: b */
        private final UDAvatarList f115808b;

        /* renamed from: c */
        private final RecyclerView f115809c;

        /* renamed from: d */
        private final TextView f115810d;

        /* renamed from: e */
        private final UDAvatar f115811e;

        /* renamed from: f */
        private final TextView f115812f;

        /* renamed from: g */
        private final TextView f115813g;

        /* renamed from: h */
        private final TwinklingRefreshLayout f115814h;

        /* renamed from: i */
        private final NestedScrollView f115815i;

        /* renamed from: j */
        private final TextView f115816j;

        /* renamed from: k */
        private final TextView f115817k;

        /* renamed from: a */
        public final UDAvatarList mo161373a() {
            return this.f115808b;
        }

        /* renamed from: b */
        public final RecyclerView mo161374b() {
            return this.f115809c;
        }

        /* renamed from: c */
        public final TextView mo161375c() {
            return this.f115810d;
        }

        /* renamed from: d */
        public final UDAvatar mo161376d() {
            return this.f115811e;
        }

        /* renamed from: e */
        public final TextView mo161377e() {
            return this.f115812f;
        }

        /* renamed from: f */
        public final TextView mo161378f() {
            return this.f115813g;
        }

        /* renamed from: g */
        public final TwinklingRefreshLayout mo161379g() {
            return this.f115814h;
        }

        /* renamed from: h */
        public final NestedScrollView mo161380h() {
            return this.f115815i;
        }

        /* renamed from: i */
        public final TextView mo161381i() {
            return this.f115816j;
        }

        /* renamed from: j */
        public final TextView mo161382j() {
            return this.f115817k;
        }

        public MmContentDetailViewHolder(MmContentDetailViewControl gVar, View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f115807a = gVar;
            View findViewById = view.findViewById(R.id.video_meeting_card_crescent_avatar_list);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(\n …ent_avatar_list\n        )");
            this.f115808b = (UDAvatarList) findViewById;
            View findViewById2 = view.findViewById(R.id.fileRecyclerView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.fileRecyclerView)");
            this.f115809c = (RecyclerView) findViewById2;
            View findViewById3 = view.findViewById(R.id.baseinfo);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.baseinfo)");
            this.f115810d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.avatarIv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.avatarIv)");
            this.f115811e = (UDAvatar) findViewById4;
            View findViewById5 = view.findViewById(R.id.useName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.useName)");
            this.f115812f = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.createtime);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.createtime)");
            this.f115813g = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.swipeRefreshLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.swipeRefreshLayout)");
            this.f115814h = (TwinklingRefreshLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.rootView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.rootView)");
            this.f115815i = (NestedScrollView) findViewById8;
            View findViewById9 = view.findViewById(R.id.urlTitle);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.urlTitle)");
            this.f115816j = (TextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.addParticipants);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.addParticipants)");
            this.f115817k = (TextView) findViewById10;
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailListener
    /* renamed from: b */
    public void mo161352b() {
        mo161370b(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControl$initRefreshLayout$1", "Lcom/lcodecore/tkrefreshlayout/RefreshListenerAdapter;", "onPullingDown", "", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "fraction", "", "onRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$f */
    public static final class C45939f extends AbstractC26401f {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailViewControl f115821a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.a.g$f$a */
        static final class RunnableC45940a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45939f f115822a;

            RunnableC45940a(C45939f fVar) {
                this.f115822a = fVar;
            }

            public final void run() {
                MmContentDetailViewControl.m182057a(this.f115822a.f115821a).mo161379g().mo93527f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45939f(MmContentDetailViewControl gVar) {
            this.f115821a = gVar;
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: a */
        public void mo93516a(TwinklingRefreshLayout twinklingRefreshLayout) {
            super.mo93516a(twinklingRefreshLayout);
            this.f115821a.mo161370b(true);
            MmContentDetailViewControl.m182057a(this.f115821a).mo161379g().invalidate();
            new Handler().postDelayed(new RunnableC45940a(this), 1000);
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: a */
        public void mo93517a(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo93517a(twinklingRefreshLayout, f);
            ((IMmContentDetailDependency) this.f115821a.mo161247w()).mo161347c();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        C45855f.m181664c("MmContentDetailViewControl", "onDestroy");
        super.mo161245h();
        m182060j();
    }

    /* renamed from: j */
    private final void m182060j() {
        C45855f.m181664c("MmContentDetailViewControl", "unsubscribe");
        C45861b.m181700a().f115690a.mo161178b(this.f115805g);
        C45861b.m181700a().f115693d.mo161178b(this.f115806h);
    }

    @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailListener
    /* renamed from: a */
    public void mo161349a() {
        MmContentDetailViewHolder aVar = this.f115799a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161380h().stopNestedScroll(1);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        this.f115799a = new MmContentDetailViewHolder(this, this.f115802d.mo161233o());
        m182062l();
        m182061k();
        mo161370b(false);
        m182059i();
    }

    /* renamed from: f */
    public final void mo161371f() {
        this.f115803e.mo161230c().mo161343a(0, 9, new C45941g(this));
    }

    /* renamed from: i */
    private final void m182059i() {
        C45855f.m181664c("MmContentDetailViewControl", "subscribe");
        C45861b.m181700a().f115690a.mo161175a((AbstractC45860a) this.f115805g, ((IMmContentDetailDependency) mo161247w()).mo161346b());
        C45861b.m181700a().f115693d.mo161174a((AbstractC45860a) this.f115806h);
    }

    /* renamed from: l */
    private final void m182062l() {
        MmContentDetailViewHolder aVar = this.f115799a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161374b().setLayoutManager(new LinearLayoutManager(this.f115802d.mo161232n()));
        MmContentDetailViewHolder aVar2 = this.f115799a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo161374b().setItemAnimator(null);
        this.f115800b = new MmContentDetailFileAdapter();
        MmContentDetailViewHolder aVar3 = this.f115799a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        RecyclerView b = aVar3.mo161374b();
        MmContentDetailFileAdapter eVar = this.f115800b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileAdapter");
        }
        b.setAdapter(eVar);
    }

    /* renamed from: k */
    private final void m182061k() {
        MmContentDetailViewHolder aVar = this.f115799a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161379g().setOnRefreshListener(new C45939f(this));
        MmContentDetailViewHolder aVar2 = this.f115799a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo161379g().setNestedScrollingEnabled(false);
        MmRefreshHeadView mmRefreshHeadView = new MmRefreshHeadView(this.f115802d.mo161232n());
        mmRefreshHeadView.setProgressBackgroundColorSchemeResource(R.color.bg_body);
        MmContentDetailViewHolder aVar3 = this.f115799a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar3.mo161379g().setHeaderView(mmRefreshHeadView);
        MmContentDetailViewHolder aVar4 = this.f115799a;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar4.mo161379g().setHeaderHeight(48.0f);
        MmContentDetailViewHolder aVar5 = this.f115799a;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar5.mo161379g().setOverScrollHeight(10.0f);
        MmContentDetailViewHolder aVar6 = this.f115799a;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar6.mo161379g().setEnableRefresh(true);
        MmContentDetailViewHolder aVar7 = this.f115799a;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar7.mo161379g().setEnableLoadmore(false);
        MmContentDetailViewHolder aVar8 = this.f115799a;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar8.mo161379g().setEnableOverScroll(false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$c */
    public static final class C45932c extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ MmContentDetailViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45932c(MmContentDetailViewControl gVar, boolean z) {
            super(1);
            this.this$0 = gVar;
            this.$isRefresh = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
            invoke(mmBaseInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(final MmBaseInfo mmBaseInfo) {
            if (mmBaseInfo != null) {
                if (this.$isRefresh) {
                    ((IMmContentDetailDependency) this.this$0.mo161247w()).mo161348d();
                }
                MmContentDetailViewControl.m182057a(this.this$0).mo161375c().setText(mmBaseInfo.getTopic());
                MmContentDetailViewControl.m182057a(this.this$0).mo161378f().setText(this.this$0.mo161366a(mmBaseInfo.getStartTime()));
                TextView e = MmContentDetailViewControl.m182057a(this.this$0).mo161377e();
                MmBaseInfo.OwnerInfo ownerInfo = mmBaseInfo.getOwnerInfo();
                Intrinsics.checkExpressionValueIsNotNull(ownerInfo, "data.ownerInfo");
                e.setText(ownerInfo.getUserName());
                if (!Intrinsics.areEqual(this.this$0.f115801c, mmBaseInfo.getOwnerId())) {
                    MmBaseInfo.OwnerInfo ownerInfo2 = mmBaseInfo.getOwnerInfo();
                    Intrinsics.checkExpressionValueIsNotNull(ownerInfo2, "data.ownerInfo");
                    C45853e.m181657a(MmContentDetailViewControl.m182057a(this.this$0).mo161376d(), ownerInfo2.getAvatarUrl());
                    this.this$0.f115801c = mmBaseInfo.getOwnerId();
                }
                C47110e.m186573a(MmContentDetailViewControl.m182057a(this.this$0).mo161376d(), new Function1<View, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailViewControl.C45932c.C459331 */
                    final /* synthetic */ C45932c this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke(view);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(View view) {
                        Intrinsics.checkParameterIsNotNull(view, "it");
                        C45855f.m181664c("MmContentDetailViewControl", "click avatar, jump to profile");
                        C47083e.m186423a(this.this$0.this$0.f115802d.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("profile_picture").mo165413a("page_name", "detail_page").mo165413a("from_source", "owner_picture").mo165421c());
                        C47083e.m186423a(this.this$0.this$0.f115802d.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("profile").mo165423e("none").mo165424f("owner_picture").mo165421c());
                        IMmDepend a = C45899c.m181859a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                        a.getHostDepend().mo144633a(MmContentDetailViewControl.m182057a(this.this$0.this$0).mo161376d().getContext(), mmBaseInfo.getOwnerId(), BaseUserType.USER);
                    }
                });
                final String a = this.this$0.f115803e.mo161230c().mo161342a();
                Context n = this.this$0.f115802d.mo161232n();
                final C47084f fVar = null;
                if (!(n instanceof MmHitPointContextProvider)) {
                    n = null;
                }
                MmHitPointContextProvider gVar = (MmHitPointContextProvider) n;
                if (gVar != null) {
                    fVar = gVar.mo161231e();
                }
                C47110e.m186573a(MmContentDetailViewControl.m182057a(this.this$0).mo161373a(), new Function1<View, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailViewControl.C45932c.C459342 */
                    final /* synthetic */ C45932c this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke(view);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(View view) {
                        Intrinsics.checkParameterIsNotNull(view, "it");
                        C45855f.m181664c("MmContentDetailViewControl", "click mmCrescentAvatarListView, open participant list");
                        C47083e.m186423a(this.this$0.this$0.f115802d.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("participant_profile").mo165421c());
                        C47083e.m186423a(this.this$0.this$0.f115802d.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("participant_profile").mo165423e("none").mo165421c());
                        ParticipantActivity.Companion aVar = ParticipantActivity.f117145b;
                        Context n = this.this$0.this$0.f115802d.mo161232n();
                        String str = a;
                        String objectToken = mmBaseInfo.getObjectToken();
                        Intrinsics.checkExpressionValueIsNotNull(objectToken, "data.objectToken");
                        String json = new Gson().toJson(fVar);
                        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(trackContext)");
                        ParticipantActivity.Companion.m184099a(aVar, n, str, objectToken, json, mmBaseInfo, null, 32, null);
                    }
                });
                C47110e.m186573a(MmContentDetailViewControl.m182057a(this.this$0).mo161382j(), new Function1<View, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailViewControl.C45932c.C459353 */
                    final /* synthetic */ C45932c this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke(view);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(View view) {
                        Intrinsics.checkParameterIsNotNull(view, "it");
                        C45855f.m181664c("MmContentDetailViewControl", "start add participants");
                        ParticipantActivity.Companion aVar = ParticipantActivity.f117145b;
                        Context n = this.this$0.this$0.f115802d.mo161232n();
                        String str = a;
                        String objectToken = mmBaseInfo.getObjectToken();
                        Intrinsics.checkExpressionValueIsNotNull(objectToken, "data.objectToken");
                        String json = new Gson().toJson(fVar);
                        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(trackContext)");
                        aVar.mo163472a(n, str, objectToken, json, mmBaseInfo, FragmentType.AddParticipant);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$d */
    public static final class C45936d extends Lambda implements Function1<MmBaseInfo.File, Unit> {
        final /* synthetic */ MmContentDetailViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45936d(MmContentDetailViewControl gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo.File file) {
            invoke(file);
            return Unit.INSTANCE;
        }

        public final void invoke(MmBaseInfo.File file) {
            Intrinsics.checkParameterIsNotNull(file, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (file.getList() == null || file.getList().isEmpty()) {
                MmContentDetailViewControl.m182057a(this.this$0).mo161381i().setVisibility(4);
                return;
            }
            MmContentDetailViewControl.m182057a(this.this$0).mo161381i().setVisibility(0);
            MmContentDetailFileAdapter b = MmContentDetailViewControl.m182058b(this.this$0);
            List<MmBaseInfo.File.FileInfo> list = file.getList();
            Intrinsics.checkExpressionValueIsNotNull(list, "data.list");
            b.mo161361a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$e */
    public static final class C45937e extends Lambda implements Function1<MmParticipants, Unit> {
        final /* synthetic */ MmContentDetailViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45937e(MmContentDetailViewControl gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmParticipants mmParticipants) {
            invoke(mmParticipants);
            return Unit.INSTANCE;
        }

        public final void invoke(final MmParticipants mmParticipants) {
            Intrinsics.checkParameterIsNotNull(mmParticipants, "it");
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailViewControl.C45937e.RunnableC459381 */

                /* renamed from: a */
                final /* synthetic */ C45937e f115819a;

                {
                    this.f115819a = r1;
                }

                public final void run() {
                    this.f115819a.this$0.mo161368a(mmParticipants.getList(), mmParticipants.getTotal());
                    this.f115819a.this$0.mo161367a(mmParticipants.getList());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$g */
    public static final class C45941g extends Lambda implements Function1<MmParticipants, Unit> {
        final /* synthetic */ MmContentDetailViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45941g(MmContentDetailViewControl gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmParticipants mmParticipants) {
            invoke(mmParticipants);
            return Unit.INSTANCE;
        }

        public final void invoke(final MmParticipants mmParticipants) {
            Intrinsics.checkParameterIsNotNull(mmParticipants, "it");
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailViewControl.C45941g.RunnableC459421 */

                /* renamed from: a */
                final /* synthetic */ C45941g f115823a;

                {
                    this.f115823a = r1;
                }

                public final void run() {
                    this.f115823a.this$0.mo161369b(mmParticipants.getList(), mmParticipants.getTotal());
                    this.f115823a.this$0.mo161367a(mmParticipants.getList());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$i */
    public static final class C45945i extends Lambda implements Function1<MmBaseInfo, Unit> {
        final /* synthetic */ MmContentDetailViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45945i(MmContentDetailViewControl gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
            invoke(mmBaseInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(MmBaseInfo mmBaseInfo) {
            if (mmBaseInfo == null || !mmBaseInfo.isCanModify()) {
                MmContentDetailViewControl.m182057a(this.this$0).mo161382j().setVisibility(8);
            } else {
                MmContentDetailViewControl.m182057a(this.this$0).mo161382j().setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$b */
    static final class C45931b<T> implements AbstractC45860a<String> {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailViewControl f115818a;

        C45931b(MmContentDetailViewControl gVar) {
            this.f115818a = gVar;
        }

        /* renamed from: a */
        public final void mo161173a(String str) {
            this.f115818a.mo161371f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.g$h */
    static final class C45943h<T> implements AbstractC45860a<MinutesSummaryData> {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailViewControl f115825a;

        C45943h(MmContentDetailViewControl gVar) {
            this.f115825a = gVar;
        }

        /* renamed from: a */
        public final void mo161173a(final MinutesSummaryData minutesSummaryData) {
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.detail.contentdetail.MmContentDetailViewControl.C45943h.RunnableC459441 */

                /* renamed from: a */
                final /* synthetic */ C45943h f115826a;

                {
                    this.f115826a = r1;
                }

                public final void run() {
                    MmContentDetailViewControl.m182057a(this.f115826a.f115825a).mo161375c().setText(minutesSummaryData.getTopic());
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MmContentDetailViewHolder m182057a(MmContentDetailViewControl gVar) {
        MmContentDetailViewHolder aVar = gVar.f115799a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ MmContentDetailFileAdapter m182058b(MmContentDetailViewControl gVar) {
        MmContentDetailFileAdapter eVar = gVar.f115800b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileAdapter");
        }
        return eVar;
    }

    @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailListener
    /* renamed from: a */
    public void mo161350a(MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "it");
        mo161370b(false);
    }

    /* renamed from: a */
    public final void mo161367a(List<? extends MmParticipants.MmParticipantInfo> list) {
        if (!C45865a.m181722e()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            MmContentDetailViewHolder aVar = this.f115799a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
            }
            aVar.mo161373a().setVisibility(8);
            ((IMmContentDetailDependency) mo161247w()).mo161345a(false, new C45945i(this));
            return;
        }
        MmContentDetailViewHolder aVar2 = this.f115799a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar2.mo161373a().setVisibility(0);
        MmContentDetailViewHolder aVar3 = this.f115799a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar3.mo161382j().setVisibility(8);
    }

    /* renamed from: b */
    public final void mo161370b(boolean z) {
        if (this.f115799a != null) {
            this.f115803e.mo161230c().mo161345a(z, new C45932c(this, z));
            this.f115803e.mo161230c().mo161344a(new C45936d(this));
            this.f115803e.mo161230c().mo161343a(0, 9, new C45937e(this));
        }
    }

    /* renamed from: a */
    public final String mo161366a(long j) {
        String c = C57851l.m224550c(C45851c.m181646a());
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
        Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
        String c2 = hostDepend.mo144635c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "MmDepend.impl().hostDepend.locale");
        if (c2 != null) {
            String lowerCase = c2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            int hashCode = lowerCase.hashCode();
            if (hashCode == 100877646 ? !lowerCase.equals("ja_jp") : hashCode != 115862300 || !lowerCase.equals("zh_cn")) {
                String format = new SimpleDateFormat(c + ", hh:mm a", Locale.getDefault()).format(Long.valueOf(j));
                Intrinsics.checkExpressionValueIsNotNull(format, "SimpleDateFormat(\"$dateF…etDefault()).format(time)");
                return format;
            }
            String format2 = new SimpleDateFormat(c + " a hh:mm", Locale.getDefault()).format(Long.valueOf(j));
            Intrinsics.checkExpressionValueIsNotNull(format2, "SimpleDateFormat(\"$dateF…etDefault()).format(time)");
            return format2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailListener
    /* renamed from: a */
    public void mo161351a(boolean z) {
        MmContentDetailViewHolder aVar = this.f115799a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        aVar.mo161379g().setEnableRefresh(z);
    }

    /* renamed from: b */
    public final void mo161369b(List<? extends MmParticipants.MmParticipantInfo> list, int i) {
        C47148c cVar = this.f115804f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarListAdapter");
        }
        cVar.mo91014c(list);
        C47148c cVar2 = this.f115804f;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarListAdapter");
        }
        cVar2.mo165765b(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmContentDetailViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmContentDetailListener, IMmContentDetailDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f115802d = gVar;
        this.f115803e = jVar;
    }

    /* renamed from: a */
    public final void mo161368a(List<? extends MmParticipants.MmParticipantInfo> list, int i) {
        C47148c cVar = new C47148c(-3, list);
        this.f115804f = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarListAdapter");
        }
        cVar.mo165765b(i);
        MmContentDetailViewHolder aVar = this.f115799a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        }
        UDAvatarList a = aVar.mo161373a();
        C47148c cVar2 = this.f115804f;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarListAdapter");
        }
        a.setAdapter(cVar2);
    }
}
