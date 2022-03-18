package com.ss.android.lark.ai.enterpriseTopic.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.enterpriseTopic.C28551a;
import com.ss.android.lark.ai.enterpriseTopic.listpage.EntityWordsActivity;
import com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a;
import com.ss.android.lark.ai.enterpriseTopic.sections.DocItem;
import com.ss.android.lark.ai.enterpriseTopic.sections.HeaderItem;
import com.ss.android.lark.ai.enterpriseTopic.sections.LinkItem;
import com.ss.android.lark.ai.enterpriseTopic.sections.RichLinkItem;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.p1330d.p1332b.C28540a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.DocMeta;
import com.ss.android.lark.pb.ai.EntityCard;
import com.ss.android.lark.pb.ai.EntityCardElement;
import com.ss.android.lark.pb.ai.EntityCardSection;
import com.ss.android.lark.pb.ai.Link;
import com.ss.android.lark.pb.ai.RichLink;
import com.ss.android.lark.pb.ai.Span;
import com.ss.android.lark.pb.ai.UserCardActionRequest;
import com.ss.android.lark.pb.ai.UserCardActionResponse;
import com.ss.android.lark.pb.ai.WordCards;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 d2\u00020\u0001:\u0001dB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\fJ\b\u0010V\u001a\u00020TH\u0016J\u0006\u0010W\u001a\u00020TJ\u0006\u0010X\u001a\u00020'J\u0010\u0010Y\u001a\u00020T2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010Z\u001a\u00020T2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010[\u001a\u00020TH\u0016J\b\u0010\\\u001a\u00020TH\u0002J\u0010\u0010]\u001a\u00020T2\u0006\u0010^\u001a\u00020\u0017H\u0002J\u0010\u0010_\u001a\u00020T2\u0006\u0010`\u001a\u00020\u0017H\u0002J\u0016\u0010a\u001a\u00020T2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010c\u001a\u00020TH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u000e\u0010%\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u000e¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u001c\u0010D\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\u001a\u0010G\u001a\u00020<X.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010>\"\u0004\bI\u0010@R\u001c\u0010J\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\u001c\u0010M\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010>\"\u0004\bO\u0010@R\u001c\u0010P\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@¨\u0006e"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/EntityWordComponent;", "", "context", "Landroid/content/Context;", "api", "Lcom/ss/android/lark/ai/enterpriseTopic/api/IEnterpriseTopicAPI;", "hitAPI", "Lcom/ss/android/lark/ai/statistics/enterpriseTopic/EnterpriseTopicHitPoint;", "cards", "", "Lcom/ss/android/lark/pb/ai/EntityCard;", "layoutId", "", "(Landroid/content/Context;Lcom/ss/android/lark/ai/enterpriseTopic/api/IEnterpriseTopicAPI;Lcom/ss/android/lark/ai/statistics/enterpriseTopic/EnterpriseTopicHitPoint;Ljava/util/List;I)V", "getCards", "()Ljava/util/List;", "mAbbrDesc", "", "mAbbrItemSummary", "mAbbrItemTitle", "mAbbrName", "mEntityCard", "mIsDisliked", "", "mIsLiked", "mIvCpIcon", "Landroid/widget/ImageView;", "getMIvCpIcon", "()Landroid/widget/ImageView;", "setMIvCpIcon", "(Landroid/widget/ImageView;)V", "mIvThumbDown", "getMIvThumbDown", "setMIvThumbDown", "mIvThumbUp", "getMIvThumbUp", "setMIvThumbUp", "mLikeCount", "mLlLike", "Landroid/view/View;", "getMLlLike", "()Landroid/view/View;", "setMLlLike", "(Landroid/view/View;)V", "mLlMore", "getMLlMore", "setMLlMore", "mNewSections", "", "Lcom/ss/android/lark/pb/ai/EntityCardSection;", "mRcvSections", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "getMRcvSections", "()Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "setMRcvSections", "(Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;)V", "mRootView", "getMRootView", "setMRootView", "mTvAbbrDesc", "Landroid/widget/TextView;", "getMTvAbbrDesc", "()Landroid/widget/TextView;", "setMTvAbbrDesc", "(Landroid/widget/TextView;)V", "mTvAbbrName", "getMTvAbbrName", "setMTvAbbrName", "mTvAlias", "getMTvAlias", "setMTvAlias", "mTvItemSummary", "getMTvItemSummary", "setMTvItemSummary", "mTvItemTitle", "getMTvItemTitle", "setMTvItemTitle", "mTvLikeCount", "getMTvLikeCount", "setMTvLikeCount", "mTvMore", "getMTvMore", "setMTvMore", "adjustCardHeight", "", "width", "bindUI", "changeStyleForDialog", "getContentView", "initContentUI", "initSections", "initialize", "onMoreClick", "onThumbDownClick", "toDislike", "onThumbUpClick", "toLike", "prepareData", "entityCardList", "updateRatingUI", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b */
public class EntityWordComponent {

    /* renamed from: f */
    public static final Companion f71855f = new Companion(null);

    /* renamed from: A */
    private final C28540a f71856A;

    /* renamed from: B */
    private final List<EntityCard> f71857B;

    /* renamed from: C */
    private final int f71858C;

    /* renamed from: a */
    public int f71859a;

    /* renamed from: b */
    public boolean f71860b;

    /* renamed from: c */
    public boolean f71861c;

    /* renamed from: d */
    protected View f71862d;

    /* renamed from: e */
    protected TextView f71863e;

    /* renamed from: g */
    private String f71864g = "";

    /* renamed from: h */
    private String f71865h = "";

    /* renamed from: i */
    private String f71866i = "";

    /* renamed from: j */
    private String f71867j = "";

    /* renamed from: k */
    private EntityCard f71868k;

    /* renamed from: l */
    private List<EntityCardSection> f71869l = new ArrayList();

    /* renamed from: m */
    private TextView f71870m;

    /* renamed from: n */
    private TextView f71871n;

    /* renamed from: o */
    private TextView f71872o;

    /* renamed from: p */
    private TextView f71873p;

    /* renamed from: q */
    private ImageView f71874q;

    /* renamed from: r */
    private ImageView f71875r;

    /* renamed from: s */
    private ImageView f71876s;

    /* renamed from: t */
    private TextView f71877t;

    /* renamed from: u */
    private TextView f71878u;

    /* renamed from: v */
    private View f71879v;

    /* renamed from: w */
    private View f71880w;

    /* renamed from: x */
    private CommonRecyclerView f71881x;

    /* renamed from: y */
    private final Context f71882y;

    /* renamed from: z */
    private final AbstractC28552a f71883z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/EntityWordComponent$Companion;", "", "()V", "TAG", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo101711a() {
        return this.f71879v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final List<EntityCard> mo101725h() {
        return this.f71857B;
    }

    /* renamed from: d */
    public final View mo101721d() {
        View view = this.f71862d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    /* renamed from: b */
    public void mo101717b() {
        m104768a(this.f71857B);
        mo101720c();
        m104767a(this.f71882y);
        m104769b(this.f71882y);
        mo101723f();
    }

    /* renamed from: e */
    public final void mo101722e() {
        View view = this.f71862d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) view.findViewById(R.id.sv_content);
        if (maxHeightScrollView != null) {
            maxHeightScrollView.setMaxHeight(-1);
        }
        int screenHeight = (int) (((float) UIUtils.getScreenHeight(this.f71882y)) * 0.4f);
        View view2 = this.f71862d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view2.setMinimumHeight(screenHeight);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ai/enterpriseTopic/view/EntityWordComponent$onThumbDownClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/ai/UserCardActionResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$e */
    public static final class C28572e implements IGetDataCallback<UserCardActionResponse> {

        /* renamed from: a */
        final /* synthetic */ EntityWordComponent f71887a;

        /* renamed from: b */
        final /* synthetic */ boolean f71888b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$e$a */
        public static final class RunnableC28573a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28572e f71889a;

            /* renamed from: b */
            final /* synthetic */ UserCardActionResponse f71890b;

            RunnableC28573a(C28572e eVar, UserCardActionResponse userCardActionResponse) {
                this.f71889a = eVar;
                this.f71890b = userCardActionResponse;
            }

            public final void run() {
                Boolean bool = this.f71890b.msuccess;
                Intrinsics.checkExpressionValueIsNotNull(bool, "response.msuccess");
                if (bool.booleanValue() && this.f71889a.f71887a.f71861c != this.f71889a.f71888b) {
                    if (this.f71889a.f71888b && this.f71889a.f71887a.f71860b) {
                        this.f71889a.f71887a.f71860b = false;
                        EntityWordComponent bVar = this.f71889a.f71887a;
                        bVar.f71859a--;
                    }
                    this.f71889a.f71887a.f71861c = this.f71889a.f71888b;
                }
                this.f71889a.f71887a.mo101723f();
            }
        }

        /* renamed from: a */
        public void onSuccess(UserCardActionResponse userCardActionResponse) {
            Intrinsics.checkParameterIsNotNull(userCardActionResponse, "response");
            C26171w.m94675a(new RunnableC28573a(this, userCardActionResponse));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("EntityWordComponent", "rating word error", errorResult);
        }

        C28572e(EntityWordComponent bVar, boolean z) {
            this.f71887a = bVar;
            this.f71888b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/ai/enterpriseTopic/view/EntityWordComponent$onThumbUpClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/ai/UserCardActionResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$f */
    public static final class C28574f implements IGetDataCallback<UserCardActionResponse> {

        /* renamed from: a */
        final /* synthetic */ EntityWordComponent f71891a;

        /* renamed from: b */
        final /* synthetic */ boolean f71892b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$f$a */
        public static final class RunnableC28575a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28574f f71893a;

            /* renamed from: b */
            final /* synthetic */ UserCardActionResponse f71894b;

            RunnableC28575a(C28574f fVar, UserCardActionResponse userCardActionResponse) {
                this.f71893a = fVar;
                this.f71894b = userCardActionResponse;
            }

            public final void run() {
                int i;
                Boolean bool = this.f71894b.msuccess;
                Intrinsics.checkExpressionValueIsNotNull(bool, "response.msuccess");
                if (bool.booleanValue() && this.f71893a.f71891a.f71860b != this.f71893a.f71892b) {
                    EntityWordComponent bVar = this.f71893a.f71891a;
                    int i2 = bVar.f71859a;
                    if (this.f71893a.f71892b) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    bVar.f71859a = i2 + i;
                    this.f71893a.f71891a.f71860b = this.f71893a.f71892b;
                    if (this.f71893a.f71892b && this.f71893a.f71891a.f71861c) {
                        this.f71893a.f71891a.f71861c = false;
                    }
                }
                this.f71893a.f71891a.mo101723f();
            }
        }

        /* renamed from: a */
        public void onSuccess(UserCardActionResponse userCardActionResponse) {
            Intrinsics.checkParameterIsNotNull(userCardActionResponse, "response");
            C26171w.m94675a(new RunnableC28575a(this, userCardActionResponse));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("EntityWordComponent", "rating word error", errorResult);
        }

        C28574f(EntityWordComponent bVar, boolean z) {
            this.f71891a = bVar;
            this.f71892b = z;
        }
    }

    /* renamed from: c */
    public void mo101720c() {
        View inflate = LayoutInflater.from(this.f71882y).inflate(this.f71858C, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…).inflate(layoutId, null)");
        this.f71862d = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71871n = (TextView) inflate.findViewById(R.id.tv_abbr_name);
        View view = this.f71862d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71870m = (TextView) view.findViewById(R.id.tv_abbr_desc);
        View view2 = this.f71862d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71872o = (TextView) view2.findViewById(R.id.tv_item_title);
        View view3 = this.f71862d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view3.findViewById(R.id.tv_item_summary);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.tv_item_summary)");
        this.f71863e = (TextView) findViewById;
        View view4 = this.f71862d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71876s = (ImageView) view4.findViewById(R.id.iv_cp_icon);
        View view5 = this.f71862d;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71877t = (TextView) view5.findViewById(R.id.tv_abbr_alias);
        View view6 = this.f71862d;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71879v = view6.findViewById(R.id.ll_more);
        View view7 = this.f71862d;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71878u = (TextView) view7.findViewById(R.id.tv_more);
        View view8 = this.f71862d;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71873p = (TextView) view8.findViewById(R.id.tv_upCount);
        View view9 = this.f71862d;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71874q = (ImageView) view9.findViewById(R.id.iv_thumbUp);
        View view10 = this.f71862d;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71875r = (ImageView) view10.findViewById(R.id.iv_thumbDown);
        View view11 = this.f71862d;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71880w = view11.findViewById(R.id.ll_like);
        View view12 = this.f71862d;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f71881x = (CommonRecyclerView) view12.findViewById(R.id.rcv_sections);
    }

    /* renamed from: f */
    public final void mo101723f() {
        int i;
        int i2;
        int i3;
        if (this.f71860b) {
            i = ContextCompat.getColor(this.f71882y, R.color.primary_pri_500);
        } else {
            i = ContextCompat.getColor(this.f71882y, R.color.text_placeholder);
        }
        TextView textView = this.f71873p;
        if (textView != null) {
            textView.setTextColor(i);
        }
        ImageView imageView = this.f71874q;
        if (imageView != null) {
            Context context = this.f71882y;
            if (this.f71860b) {
                i3 = R.drawable.ic_thumbup_checked;
            } else {
                i3 = R.drawable.ic_thumbup_unchecked;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(context, i3));
        }
        ImageView imageView2 = this.f71875r;
        if (imageView2 != null) {
            Context context2 = this.f71882y;
            if (this.f71861c) {
                i2 = R.drawable.ic_thumbdown_checked;
            } else {
                i2 = R.drawable.ic_thumbdown_unchecked;
            }
            imageView2.setImageDrawable(ContextCompat.getDrawable(context2, i2));
        }
        if (this.f71859a > 0) {
            TextView textView2 = this.f71873p;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f71873p;
            if (textView3 != null) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                Locale locale = Locale.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                String format = String.format(locale, "%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f71859a)}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                textView3.setText(format);
                return;
            }
            return;
        }
        TextView textView4 = this.f71873p;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final void mo101724g() {
        if (this.f71857B.size() > 1) {
            WordCards wordCards = new WordCards(this.f71857B, new Span(0, Integer.valueOf(this.f71864g.length())), this.f71864g);
            ArrayList arrayList = new ArrayList();
            arrayList.add(wordCards);
            EntityWordsActivity.m104734a(this.f71882y, arrayList, this.f71864g, true);
            C28540a aVar = this.f71856A;
            EntityCard entityCard = this.f71868k;
            if (entityCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
            }
            aVar.mo101592c(entityCard.mid);
            return;
        }
        EntityCard entityCard2 = this.f71868k;
        if (entityCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
        }
        if (!TextUtils.isEmpty(entityCard2.mlink_url)) {
            AbstractC28534a a = C28522a.m104531a();
            Context context = this.f71882y;
            EntityCard entityCard3 = this.f71868k;
            if (entityCard3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
            }
            String str = entityCard3.mlink_url;
            Intrinsics.checkExpressionValueIsNotNull(a, "dependency");
            a.mo101560b(context, C28551a.m104694a(context, str, a.mo101566g()));
            C28540a aVar2 = this.f71856A;
            EntityCard entityCard4 = this.f71868k;
            if (entityCard4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
            }
            aVar2.mo101590b(entityCard4.mid);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo101718b(ImageView imageView) {
        this.f71875r = imageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$d */
    public static final class View$OnClickListenerC28571d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EntityWordComponent f71886a;

        View$OnClickListenerC28571d(EntityWordComponent bVar) {
            this.f71886a = bVar;
        }

        public final void onClick(View view) {
            this.f71886a.mo101724g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo101713a(View view) {
        this.f71880w = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$b */
    public static final class View$OnClickListenerC28569b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EntityWordComponent f71884a;

        View$OnClickListenerC28569b(EntityWordComponent bVar) {
            this.f71884a = bVar;
        }

        public final void onClick(View view) {
            EntityWordComponent bVar = this.f71884a;
            bVar.mo101719b(!bVar.f71860b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.b$c */
    public static final class View$OnClickListenerC28570c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EntityWordComponent f71885a;

        View$OnClickListenerC28570c(EntityWordComponent bVar) {
            this.f71885a = bVar;
        }

        public final void onClick(View view) {
            EntityWordComponent bVar = this.f71885a;
            bVar.mo101716a(!bVar.f71861c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo101714a(ImageView imageView) {
        this.f71874q = imageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo101715a(TextView textView) {
        this.f71873p = textView;
    }

    /* renamed from: a */
    public final void mo101716a(boolean z) {
        UserCardActionRequest.ActionType actionType;
        AbstractC28552a aVar = this.f71883z;
        EntityCard entityCard = this.f71868k;
        if (entityCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
        }
        String str = entityCard.mid;
        if (z) {
            actionType = UserCardActionRequest.ActionType.DISLIKE;
        } else {
            actionType = UserCardActionRequest.ActionType.UNDO_DISLIKE;
        }
        aVar.mo101667a(str, actionType, new C28572e(this, z));
        if (z) {
            this.f71856A.mo101591c();
        }
    }

    /* renamed from: b */
    public final void mo101719b(boolean z) {
        UserCardActionRequest.ActionType actionType;
        AbstractC28552a aVar = this.f71883z;
        EntityCard entityCard = this.f71868k;
        if (entityCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
        }
        String str = entityCard.mid;
        if (z) {
            actionType = UserCardActionRequest.ActionType.LIKE;
        } else {
            actionType = UserCardActionRequest.ActionType.UNDO_LIKE;
        }
        aVar.mo101667a(str, actionType, new C28574f(this, z));
        if (z) {
            this.f71856A.mo101589b();
        }
    }

    /* renamed from: b */
    private final void m104769b(Context context) {
        RichLink richLink;
        CommonRecyclerView commonRecyclerView = this.f71881x;
        if (commonRecyclerView != null) {
            ArrayList arrayList = new ArrayList();
            for (EntityCardSection entityCardSection : this.f71869l) {
                String str = entityCardSection.mtitle;
                Intrinsics.checkExpressionValueIsNotNull(str, "section.mtitle");
                arrayList.add(new HeaderItem(str));
                List<EntityCardElement> list = entityCardSection.melements;
                Intrinsics.checkExpressionValueIsNotNull(list, "section.melements");
                int i = 0;
                for (T t : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t2 = t;
                    boolean z = true;
                    if (i != entityCardSection.melements.size() - 1) {
                        z = false;
                    }
                    if (TextUtils.equals(entityCardSection.mname, "links")) {
                        Link link = t2.mlink;
                        if (link != null) {
                            String str2 = link.mtitle;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "link.mtitle");
                            String str3 = link.murl;
                            Intrinsics.checkExpressionValueIsNotNull(str3, "link.murl");
                            String str4 = link.mtype;
                            Intrinsics.checkExpressionValueIsNotNull(str4, "link.mtype");
                            arrayList.add(new LinkItem(str2, str3, str4, !z));
                        }
                    } else if (TextUtils.equals(entityCardSection.mname, "documentations")) {
                        DocMeta docMeta = t2.mdoc;
                        if (docMeta != null) {
                            String str5 = docMeta.mtitle;
                            Intrinsics.checkExpressionValueIsNotNull(str5, "docMeta.mtitle");
                            String str6 = docMeta.murl;
                            Intrinsics.checkExpressionValueIsNotNull(str6, "docMeta.murl");
                            arrayList.add(new DocItem(str5, str6, !z));
                        }
                    } else if (TextUtils.equals(entityCardSection.mname, "richLinks") && (richLink = t2.mrich_link) != null) {
                        arrayList.add(new RichLinkItem(richLink, !z));
                    }
                    i = i2;
                }
            }
            C58973b bVar = new C58973b();
            bVar.mo200080a(arrayList);
            commonRecyclerView.setAdapter(bVar);
            commonRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
    }

    /* renamed from: a */
    public final void mo101712a(int i) {
        int i2;
        View view = this.f71862d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
        View view2 = this.f71862d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view2.findViewById(R.id.top_layout);
        View view3 = this.f71862d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view3.findViewById(R.id.sv_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.sv_content)");
        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) findViewById2;
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "topLayout");
        int measuredHeight = findViewById.getMeasuredHeight();
        TextView textView = this.f71863e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvItemSummary");
        }
        int lineCount = textView.getLineCount();
        int a = C57582a.m223600a(68);
        if (lineCount > 6) {
            Rect rect = new Rect();
            TextView textView2 = this.f71863e;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvItemSummary");
            }
            textView2.getLineBounds(6, rect);
            i2 = rect.centerY();
            a -= C57582a.m223600a(20);
        } else {
            TextView textView3 = this.f71863e;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvItemSummary");
            }
            i2 = textView3.getMeasuredHeight();
        }
        maxHeightScrollView.setMaxHeight(measuredHeight + a + i2);
    }

    /* renamed from: a */
    private final void m104767a(Context context) {
        ImageView imageView;
        int i;
        String str;
        View view = this.f71880w;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC28569b(this));
        }
        ImageView imageView2 = this.f71875r;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View$OnClickListenerC28570c(this));
        }
        TextView textView = this.f71878u;
        if (textView != null) {
            if (this.f71857B.size() > 1) {
                str = context.getString(R.string.Lark_ASL_EntrySeeMoreDefinitions);
            } else {
                str = context.getString(R.string.Lark_ASL_EntryDetails);
            }
            textView.setText(str);
        }
        View view2 = this.f71879v;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.f71879v;
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC28571d(this));
        }
        TextView textView2 = this.f71871n;
        if (textView2 != null) {
            textView2.setText(this.f71864g);
        }
        TextView textView3 = this.f71870m;
        if (textView3 != null) {
            textView3.setText(this.f71865h);
        }
        TextView textView4 = this.f71870m;
        if (textView4 != null) {
            if (TextUtils.isEmpty(this.f71865h)) {
                i = 8;
            } else {
                i = 0;
            }
            textView4.setVisibility(i);
        }
        TextView textView5 = this.f71872o;
        if (textView5 != null) {
            textView5.setText(this.f71866i);
        }
        TextView textView6 = this.f71863e;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvItemSummary");
        }
        textView6.setText(this.f71867j);
        EntityCard entityCard = this.f71868k;
        if (entityCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
        }
        if (TextUtils.equals(entityCard.msource, "baike") && (imageView = this.f71876s) != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_toutiao_baike));
        }
        EntityCard entityCard2 = this.f71868k;
        if (entityCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
        }
        if (entityCard2.malias != null) {
            EntityCard entityCard3 = this.f71868k;
            if (entityCard3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
            }
            List<String> list = entityCard3.malias;
            Intrinsics.checkExpressionValueIsNotNull(list, "mEntityCard.malias");
            if (!list.isEmpty()) {
                TextView textView7 = this.f71877t;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
                TextView textView8 = this.f71877t;
                if (textView8 != null) {
                    EntityCard entityCard4 = this.f71868k;
                    if (entityCard4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
                    }
                    textView8.setText(C28551a.m104695a(entityCard4.malias, context));
                    return;
                }
                return;
            }
        }
        TextView textView9 = this.f71877t;
        if (textView9 != null) {
            textView9.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m104768a(List<EntityCard> list) {
        boolean z = false;
        EntityCard entityCard = list.get(0);
        this.f71868k = entityCard;
        if (entityCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
        }
        if (entityCard.msections != null) {
            EntityCard entityCard2 = this.f71868k;
            if (entityCard2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
            }
            List<EntityCardSection> list2 = entityCard2.msections;
            Intrinsics.checkExpressionValueIsNotNull(list2, "mEntityCard.msections");
            if (!list2.isEmpty()) {
                EntityCard entityCard3 = this.f71868k;
                if (entityCard3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
                }
                EntityCardSection entityCardSection = entityCard3.msections.get(0);
                String str = entityCardSection.mtitle;
                Intrinsics.checkExpressionValueIsNotNull(str, "rootSection.mtitle");
                this.f71864g = str;
                List<EntityCardElement> list3 = entityCardSection.melements;
                if (list3 != null && (!list3.isEmpty())) {
                    String str2 = list3.get(0).mplain_text;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "elements[0].mplain_text");
                    this.f71865h = str2;
                }
                for (EntityCardSection entityCardSection2 : entityCardSection.msections) {
                    List<EntityCardElement> list4 = entityCardSection2.melements;
                    Intrinsics.checkExpressionValueIsNotNull(list4, "section.melements");
                    if (!(!list4.isEmpty()) || !TextUtils.equals(entityCardSection2.mname, "description") || TextUtils.isEmpty(entityCardSection2.melements.get(0).mplain_text)) {
                        String str3 = entityCardSection2.mname;
                        if (str3 != null) {
                            int hashCode = str3.hashCode();
                            if (hashCode != -860479427) {
                                if (hashCode != 102977465) {
                                    if (hashCode == 1964930297 && str3.equals("documentations")) {
                                        List<EntityCardSection> list5 = this.f71869l;
                                        Intrinsics.checkExpressionValueIsNotNull(entityCardSection2, "section");
                                        list5.add(entityCardSection2);
                                    }
                                } else if (str3.equals("links")) {
                                    List<EntityCardSection> list6 = this.f71869l;
                                    Intrinsics.checkExpressionValueIsNotNull(entityCardSection2, "section");
                                    list6.add(entityCardSection2);
                                }
                            } else if (str3.equals("richLinks")) {
                                List<EntityCardSection> list7 = this.f71869l;
                                Intrinsics.checkExpressionValueIsNotNull(entityCardSection2, "section");
                                list7.add(entityCardSection2);
                            }
                        }
                    } else {
                        String str4 = entityCardSection2.mtitle;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "section.mtitle");
                        this.f71866i = str4;
                        String str5 = entityCardSection2.melements.get(0).mplain_text;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "section.melements[0].mplain_text");
                        this.f71867j = str5;
                    }
                }
                EntityCard entityCard4 = this.f71868k;
                if (entityCard4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
                }
                Integer num = entityCard4.mlike_count;
                Intrinsics.checkExpressionValueIsNotNull(num, "mEntityCard.mlike_count");
                this.f71859a = num.intValue();
                EntityCard entityCard5 = this.f71868k;
                if (entityCard5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
                }
                Boolean bool = entityCard5.mis_liked;
                Intrinsics.checkExpressionValueIsNotNull(bool, "mEntityCard.mis_liked");
                boolean booleanValue = bool.booleanValue();
                this.f71860b = booleanValue;
                if (!booleanValue) {
                    EntityCard entityCard6 = this.f71868k;
                    if (entityCard6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEntityCard");
                    }
                    Boolean bool2 = entityCard6.mis_disliked;
                    Intrinsics.checkExpressionValueIsNotNull(bool2, "mEntityCard.mis_disliked");
                    z = bool2.booleanValue();
                }
                this.f71861c = z;
            }
        }
    }

    public EntityWordComponent(Context context, AbstractC28552a aVar, C28540a aVar2, List<EntityCard> list, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "api");
        Intrinsics.checkParameterIsNotNull(aVar2, "hitAPI");
        Intrinsics.checkParameterIsNotNull(list, "cards");
        this.f71882y = context;
        this.f71883z = aVar;
        this.f71856A = aVar2;
        this.f71857B = list;
        this.f71858C = i;
    }
}
