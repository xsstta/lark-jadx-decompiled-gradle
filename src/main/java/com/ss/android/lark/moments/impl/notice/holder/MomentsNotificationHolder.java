package com.ss.android.lark.moments.impl.notice.holder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationVM;
import com.ss.android.lark.pb.moments_entities.Notification;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.richtext2.span.C59068a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0006\u0010\u001c\u001a\u00020\u0010J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationVM;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "drawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "getDrawListener", "()Landroid/view/ViewTreeObserver$OnDrawListener;", "drawListener$delegate", "Lkotlin/Lazy;", "mContext", "Landroid/content/Context;", "mData", "bindAvatar", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindFollowArea", "bindListener", "bindNotificationContent", "bindNotificationTitle", "bindSourceArea", "bindSourceContent", "bindSourceImage", "bindTime", "onBind", "onCellClicked", "setDrawListener", "updateUserFollowInfo", "sender", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.a.b */
public final class MomentsNotificationHolder extends AbstractC58967a<IMomentsNotificationVM, View> {

    /* renamed from: c */
    public static final int f120385c = UIHelper.dp2px(48.0f);

    /* renamed from: d */
    public static final int f120386d = UIHelper.dp2px(54.0f);

    /* renamed from: e */
    public static final Companion f120387e = new Companion(null);

    /* renamed from: a */
    public final Context f120388a;

    /* renamed from: b */
    public IMomentsNotificationVM f120389b;

    /* renamed from: f */
    private final Lazy f120390f = LazyKt.lazy(new C47792f(this));

    /* renamed from: b */
    private final ViewTreeObserver.OnDrawListener m188880b() {
        return (ViewTreeObserver.OnDrawListener) this.f120390f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder$Companion;", "", "()V", "AVATAR_SIZE", "", "getAVATAR_SIZE", "()I", "IMAGE_SIZE", "getIMAGE_SIZE", "LOG_TAG", "", "create", "Lcom/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsNotificationHolder mo167530a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_notification, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsNotificationHolder(inflate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewTreeObserver$OnDrawListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$f */
    static final class C47792f extends Lambda implements Function0<ViewTreeObserver.OnDrawListener> {
        final /* synthetic */ MomentsNotificationHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47792f(MomentsNotificationHolder bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewTreeObserver.OnDrawListener invoke() {
            return new ViewTreeObserver.OnDrawListener(this) {
                /* class com.ss.android.lark.moments.impl.notice.holder.MomentsNotificationHolder.C47792f.ViewTreeObserver$OnDrawListenerC477931 */

                /* renamed from: a */
                final /* synthetic */ C47792f f120401a;

                {
                    this.f120401a = r1;
                }

                public final void onDraw() {
                    boolean z;
                    IMomentsNotificationVM bVar;
                    MomentsAppreciableHitPoint aVar = MomentsAppreciableHitPoint.f119684a;
                    IMomentsNotificationVM bVar2 = this.f120401a.this$0.f120389b;
                    if ((bVar2 == null || bVar2.mo167585c() != Notification.Type.POST_REACTION.ordinal()) && ((bVar = this.f120401a.this$0.f120389b) == null || bVar.mo167585c() != Notification.Type.COMMENT_REACTION.ordinal())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo166752e(z);
                    MomentsAppreciableHitPoint.f119684a.mo166738W();
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder$bindFollowArea$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$c */
    public static final class C47788c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationHolder f120394a;

        /* renamed from: b */
        final /* synthetic */ IMomentsUser f120395b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$c$a */
        static final class RunnableC47789a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47788c f120396a;

            RunnableC47789a(C47788c cVar) {
                this.f120396a = cVar;
            }

            public final void run() {
                IMomentsUser cVar;
                MomentsNotificationHolder bVar = this.f120396a.f120394a;
                IMomentsNotificationVM bVar2 = this.f120396a.f120394a.f120389b;
                if (bVar2 != null) {
                    cVar = bVar2.mo167587e();
                } else {
                    cVar = null;
                }
                bVar.mo167527a(cVar);
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String str;
            IMomentsUser cVar = this.f120395b;
            if (cVar != null) {
                MomentsHitPoint.f119720a.mo166839a("notification_page", !cVar.mo166366e(), cVar.mo166364c());
                MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
                if (cVar.mo166366e()) {
                    str = "follow_cancel";
                } else {
                    str = "follow";
                }
                MomentsHitPointNew.Companion.m188108a(aVar, (String) null, str, (String) null, cVar.mo166364c(), 4, (Object) null);
            }
            IMomentsUser cVar2 = this.f120395b;
            if (cVar2 != null) {
                cVar2.mo166369h();
            }
            this.f120394a.itemView.postDelayed(new RunnableC47789a(this), 500);
        }

        C47788c(MomentsNotificationHolder bVar, IMomentsUser cVar) {
            this.f120394a = bVar;
            this.f120395b = cVar;
        }
    }

    /* renamed from: a */
    public final void mo167526a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        view.getViewTreeObserver().addOnDrawListener(m188880b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder$bindListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$d */
    public static final class C47790d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationHolder f120397a;

        /* renamed from: b */
        final /* synthetic */ IMomentsNotificationVM f120398b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120397a.mo167529b(this.f120398b);
        }

        C47790d(MomentsNotificationHolder bVar, IMomentsNotificationVM bVar2) {
            this.f120397a = bVar;
            this.f120398b = bVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder$bindListener$2", "Lcom/ss/android/lark/widget/richtext/RichTextView$RichTextListener;", "onTextClick", "", "textView", "Landroid/widget/TextView;", "onTextLongClick", "text", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$e */
    public static final class C47791e implements RichTextView.AbstractC59025c {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationHolder f120399a;

        /* renamed from: b */
        final /* synthetic */ IMomentsNotificationVM f120400b;

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
        /* renamed from: a */
        public void mo124118a(String str, TextView textView) {
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
        /* renamed from: a */
        public void mo124117a(TextView textView) {
            this.f120399a.mo167529b(this.f120400b);
        }

        C47791e(MomentsNotificationHolder bVar, IMomentsNotificationVM bVar2) {
            this.f120399a = bVar;
            this.f120400b = bVar2;
        }
    }

    /* renamed from: g */
    private final void m188885g(IMomentsNotificationVM bVar) {
        m188886h(bVar);
        m188887i(bVar);
        m188888j(bVar);
    }

    /* renamed from: f */
    private final void m188884f(IMomentsNotificationVM bVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.time_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.time_label");
        textView.setText(bVar.mo167586d());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/notice/holder/MomentsNotificationHolder$bindAvatar$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.b$b */
    public static final class C47787b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsNotificationHolder f120391a;

        /* renamed from: b */
        final /* synthetic */ IMomentsUser f120392b;

        /* renamed from: c */
        final /* synthetic */ IMomentsNotificationVM f120393c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (this.f120392b.mo166368g() == MomentUser.Type.USER) {
                MomentsHitPoint.f119720a.mo166849f("notification_page");
                MomentsHitPointNew.Companion.m188108a(MomentsHitPointNew.f119721a, this.f120393c.mo167590h(), "other_profile", "profile_main_view", (String) null, 8, (Object) null);
                MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency().mo144727a(this.f120391a.f120388a, this.f120392b.mo166364c());
            }
        }

        C47787b(MomentsNotificationHolder bVar, IMomentsUser cVar, IMomentsNotificationVM bVar2) {
            this.f120391a = bVar;
            this.f120392b = cVar;
            this.f120393c = bVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsNotificationHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f120388a = context;
    }

    /* renamed from: k */
    private final void m188889k(IMomentsNotificationVM bVar) {
        this.itemView.setOnClickListener(new C47790d(this, bVar));
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((RichTextView) view.findViewById(R.id.notification_content_tv)).setRichTextListener(new C47791e(this, bVar));
    }

    /* renamed from: a */
    public void mo165944a(IMomentsNotificationVM bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) bVar);
        this.f120389b = bVar;
        m188881c(bVar);
        m188882d(bVar);
        m188883e(bVar);
        m188884f(bVar);
        m188885g(bVar);
        m188889k(bVar);
    }

    /* renamed from: c */
    private final void m188881c(IMomentsNotificationVM bVar) {
        IMomentsUser e = bVar.mo167587e();
        if (e == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((LKUIRoundedImageView2) view.findViewById(R.id.avatar)).setImageResource(R.drawable.common_chat_window_image_item_holder);
            return;
        }
        IRequestCreator with = ImageLoader.with(this.f120388a);
        String d = e.mo166365d();
        String c = e.mo166364c();
        int i = f120385c;
        IRequestCreator override = with.load(AvatarImage.Builder.obtain(d, c, i, i).build()).placeholder(R.drawable.common_chat_window_image_item_holder).override(i, i);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(mContex…AVATAR_SIZE, AVATAR_SIZE)");
        IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, i, i, false, null, 24, null);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        a.into((LKUIRoundedImageView2) view2.findViewById(R.id.avatar));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.avatar)).setOnClickListener(new C47787b(this, e, bVar));
    }

    /* renamed from: d */
    private final void m188882d(IMomentsNotificationVM bVar) {
        MomentUser.Type type;
        CharSequence f = bVar.mo167588f();
        IMomentsUser e = bVar.mo167587e();
        String str = null;
        if (e != null) {
            type = e.mo166368g();
        } else {
            type = null;
        }
        if (type == MomentUser.Type.ANONYMOUS) {
            str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
        } else if (e != null) {
            str = e.mo166361a();
        }
        if (str == null) {
            str = "";
        }
        C59068a aVar = new C59068a(this.f120388a);
        aVar.append(str, new FakeBoldSpan(), 33);
        aVar.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.text_title)), 0, str.length(), 33);
        aVar.append(" ").append(f);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = (EllipsizedEmojiconTextView) view.findViewById(R.id.notification_title_tv);
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView, "itemView.notification_title_tv");
        ellipsizedEmojiconTextView.setText(aVar);
    }

    /* renamed from: h */
    private final void m188886h(IMomentsNotificationVM bVar) {
        if (bVar.mo167595m()) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.notification_source_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.notification_source_tv");
            textView.setVisibility(0);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.notification_source_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.notification_source_tv");
            textView2.setText(bVar.mo167592j());
            return;
        }
        CharSequence j = bVar.mo167592j();
        if (TextUtils.isEmpty(j)) {
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.notification_source_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.notification_source_tv");
            textView3.setVisibility(8);
            return;
        }
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView4 = (TextView) view4.findViewById(R.id.notification_source_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.notification_source_tv");
        textView4.setVisibility(0);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        TextView textView5 = (TextView) view5.findViewById(R.id.notification_source_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.notification_source_tv");
        textView5.setText(j);
    }

    /* renamed from: j */
    private final void m188888j(IMomentsNotificationVM bVar) {
        IMomentsUser e = bVar.mo167587e();
        if (!bVar.mo167596n() || e == null) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            MomentsFollowButton momentsFollowButton = (MomentsFollowButton) view.findViewById(R.id.follow_tv);
            Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton, "itemView.follow_tv");
            momentsFollowButton.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        MomentsFollowButton momentsFollowButton2 = (MomentsFollowButton) view2.findViewById(R.id.follow_tv);
        Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton2, "itemView.follow_tv");
        momentsFollowButton2.setVisibility(0);
        mo167527a(e);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((MomentsFollowButton) view3.findViewById(R.id.follow_tv)).setOnClickListener(new C47788c(this, e));
    }

    /* renamed from: a */
    public final void mo167527a(IMomentsUser cVar) {
        if (cVar != null) {
            Log.m165389i("moments_notification", "updateUserFollowInfo, userId:" + cVar.mo166364c() + ", isFollowed:" + cVar.mo166366e() + ", isOngoingFollow:" + cVar.mo166367f());
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((MomentsFollowButton) view.findViewById(R.id.follow_tv)).mo166233a(cVar.mo166366e(), cVar.mo166367f());
        }
    }

    /* renamed from: e */
    private final void m188883e(IMomentsNotificationVM bVar) {
        RichText g = bVar.mo167589g();
        if (C59035h.m229210a(g)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RichTextView richTextView = (RichTextView) view.findViewById(R.id.notification_content_tv);
            Intrinsics.checkExpressionValueIsNotNull(richTextView, "itemView.notification_content_tv");
            richTextView.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ((RichTextView) view2.findViewById(R.id.notification_content_tv)).setShowMomentsHashtag(true);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        RichTextView richTextView2 = (RichTextView) view3.findViewById(R.id.notification_content_tv);
        Intrinsics.checkExpressionValueIsNotNull(richTextView2, "itemView.notification_content_tv");
        richTextView2.setVisibility(0);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((RichTextView) view4.findViewById(R.id.notification_content_tv)).setTextSize((float) UIHelper.dp2px(14.0f));
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ((RichTextView) view5.findViewById(R.id.notification_content_tv)).setDefaultAtUserColor(C25653b.m91893a(C57582a.m223616d(this.f120388a, R.color.text_link_normal), 1.0f));
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((RichTextView) view6.findViewById(R.id.notification_content_tv)).setUrlTextColor(UIHelper.getColor(R.color.text_link_normal));
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        ((RichTextView) view7.findViewById(R.id.notification_content_tv)).setPhoneTextColor(UIHelper.getColor(R.color.text_link_normal));
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        ((RichTextView) view8.findViewById(R.id.notification_content_tv)).setAtSelfBgColor(R.color.primary_pri_500);
        View view9 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
        ((RichTextView) view9.findViewById(R.id.notification_content_tv)).setMaxLines(1);
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        ((RichTextView) view10.findViewById(R.id.notification_content_tv)).mo200508a(g, bVar.mo167584b());
    }

    /* renamed from: b */
    public final void mo167529b(IMomentsNotificationVM bVar) {
        String str;
        boolean z;
        MomentsHitPoint.f119720a.mo166840b(bVar.mo167585c());
        if (bVar.mo167585c() == Notification.Type.FOLLOWER.ordinal()) {
            IMomentsUser e = bVar.mo167587e();
            if (e != null) {
                MomentsHitPoint.f119720a.mo166849f("notification_page");
                MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency().mo144727a(this.f120388a, e.mo166364c());
                MomentsHitPointNew.Companion.m188108a(MomentsHitPointNew.f119721a, (String) null, "follow_msg", "profile_main_view", (String) null, 8, (Object) null);
                return;
            }
            return;
        }
        int c = bVar.mo167585c();
        if (c == Notification.Type.AT_IN_POST.ordinal()) {
            str = "post_mention";
        } else if (c == Notification.Type.AT_IN_COMMENT.ordinal()) {
            str = "comment_mention";
        } else if (c == Notification.Type.COMMENT.ordinal()) {
            str = "post_reply";
        } else if (c == Notification.Type.REPLY.ordinal()) {
            str = "comment_reply";
        } else if (c == Notification.Type.POST_REACTION.ordinal()) {
            str = "post_reaction";
        } else if (c == Notification.Type.COMMENT_REACTION.ordinal()) {
            str = "comment_reaction";
        } else {
            str = null;
        }
        if (str != null) {
            MomentsHitPointNew.Companion.m188108a(MomentsHitPointNew.f119721a, bVar.mo167590h(), str, "moments_detail_page_view", (String) null, 8, (Object) null);
        }
        String h = bVar.mo167590h();
        String i = bVar.mo167591i();
        if (i == null) {
            i = "";
        }
        boolean o = bVar.mo167597o();
        String str2 = h;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165383e("moments_notification", "Failed to open post, id is null");
        } else if (o) {
            Context context = this.f120388a;
            LKUIToast.show(context, UIUtils.getString(context, R.string.Lark_Community_ThisActivityHasBeenDeleted));
        } else {
            MomentsDetailLauncher.m187945a(MomentsDetailLauncher.f119660a, this.f120388a, h, false, i, "notification_page", false, false, 100, (Object) null);
        }
    }

    /* renamed from: i */
    private final void m188887i(IMomentsNotificationVM bVar) {
        ImageSet imageSet;
        boolean a = ImageUtils.f119250a.mo166202a(bVar.mo167593k());
        ImageUtils bVar2 = ImageUtils.f119250a;
        Media l = bVar.mo167594l();
        ImageSet imageSet2 = null;
        if (l != null) {
            imageSet = l.cover;
        } else {
            imageSet = null;
        }
        boolean a2 = bVar2.mo166202a(imageSet);
        if (bVar.mo167595m() || (!a && !a2)) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.notification_source_image_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.notification_source_image_container");
            frameLayout.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.notification_source_image_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "itemView.notification_source_image_container");
        frameLayout2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.notification_source_iv)).setBorderColor(UIHelper.getColor(R.color.ud_N900_15));
        if (a2) {
            Media l2 = bVar.mo167594l();
            if (l2 != null) {
                imageSet2 = l2.cover;
            }
        } else {
            imageSet2 = bVar.mo167593k();
        }
        ImageUtils bVar3 = ImageUtils.f119250a;
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view4.findViewById(R.id.notification_source_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.notification_source_iv");
        int i = f120386d;
        ImageUtils.m187225a(bVar3, imageSet2, lKUIRoundedImageView2, i, i, null, 16, null);
        if (a2) {
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) view5.findViewById(R.id.notification_iv_mask);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "itemView.notification_iv_mask");
            lKUIRoundedImageView22.setVisibility(0);
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView23 = (LKUIRoundedImageView2) view6.findViewById(R.id.notification_iv_mask);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView23, "itemView.notification_iv_mask");
            lKUIRoundedImageView23.setAlpha(0.4f);
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ImageView imageView = (ImageView) view7.findViewById(R.id.notification_source_video_holder);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.notification_source_video_holder");
            imageView.setVisibility(0);
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            Context context = view8.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_video_filled, UIHelper.getColor(R.color.static_white));
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((ImageView) view9.findViewById(R.id.notification_source_video_holder)).setImageDrawable(iconDrawable);
            return;
        }
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView24 = (LKUIRoundedImageView2) view10.findViewById(R.id.notification_iv_mask);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView24, "itemView.notification_iv_mask");
        lKUIRoundedImageView24.setVisibility(8);
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        ImageView imageView2 = (ImageView) view11.findViewById(R.id.notification_source_video_holder);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.notification_source_video_holder");
        imageView2.setVisibility(8);
    }
}
