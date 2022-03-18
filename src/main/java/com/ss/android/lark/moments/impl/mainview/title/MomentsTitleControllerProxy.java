package com.ss.android.lark.moments.impl.mainview.title;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.moments.impl.mainview.OnPopupWindowListener;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0010H\u0001J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\t\u0010\u001b\u001a\u00020\u0010H\u0001J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/title/MomentsTitleControllerProxy;", "Lcom/ss/android/lark/moments/impl/mainview/title/IMomentsTitleControllerProxy;", "Lcom/ss/android/lark/moments/impl/mainview/title/INotificationIconDelegate;", "context", "Landroid/content/Context;", "mTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;)V", "funcBtnList", "", "Lcom/ss/android/lark/maincore/IFunctionButton;", "mOnPopupWindowListener", "Lcom/ss/android/lark/moments/impl/mainview/OnPopupWindowListener;", "mTitleInfo", "Lcom/ss/android/lark/moments/impl/mainview/title/MomentsTitleInfo;", "destroy", "", "destroyNotificationIcon", "getNotificationIcon", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "getTitleBarView", "getTitleInfo", "isShowNewStyle", "", "onMomentsTabSelect", "runNotificationIconAnim", "setPopWindowShowListener", "listener", "setTitleVisible", "visible", "updateTitle", "title", "", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.a.b */
public final class MomentsTitleControllerProxy implements IMomentsTitleControllerProxy {

    /* renamed from: c */
    public static final Companion f120224c = new Companion(null);

    /* renamed from: a */
    public OnPopupWindowListener f120225a;

    /* renamed from: b */
    public Context f120226b;

    /* renamed from: d */
    private final List<AbstractC44545b> f120227d = CollectionsKt.listOf((Object[]) new AbstractC44545b[]{new C47705b(this), new C47707c(this)});

    /* renamed from: e */
    private final MomentsTitleInfo f120228e = new MomentsTitleInfo();

    /* renamed from: f */
    private ITitleController f120229f;

    /* renamed from: g */
    private final /* synthetic */ NotificationIconDelegate f120230g;

    /* renamed from: a */
    public View mo167348a(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        return this.f120230g.mo167361a(onClickListener);
    }

    /* renamed from: d */
    public void mo167352d() {
        this.f120230g.mo167365b();
    }

    /* renamed from: e */
    public void mo167353e() {
        this.f120230g.mo167362a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/title/MomentsTitleControllerProxy$Companion;", "", "()V", "TAG", "", "parseTitleController", "Lcom/ss/android/lark/moments/impl/mainview/title/MomentsTitleControllerProxy;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final MomentsTitleControllerProxy mo167354a(Context context, ITitleController iTitleController) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new MomentsTitleControllerProxy(context, iTitleController);
        }
    }

    /* renamed from: a */
    public void mo167349a() {
        mo167352d();
    }

    /* renamed from: c */
    public void mo167351c() {
        mo167353e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "getContentView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.b$c */
    static final class C47707c implements AbstractC44545b {

        /* renamed from: a */
        final /* synthetic */ MomentsTitleControllerProxy f120233a;

        C47707c(MomentsTitleControllerProxy bVar) {
            this.f120233a = bVar;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44545b
        public final View getContentView() {
            return this.f120233a.mo167348a(new View.OnClickListener(this) {
                /* class com.ss.android.lark.moments.impl.mainview.title.MomentsTitleControllerProxy.C47707c.View$OnClickListenerC477081 */

                /* renamed from: a */
                final /* synthetic */ C47707c f120234a;

                {
                    this.f120234a = r1;
                }

                public final void onClick(View view) {
                    OnPopupWindowListener gVar = this.f120234a.f120233a.f120225a;
                    if (gVar != null) {
                        gVar.mo167422a();
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private final boolean m188652f() {
        ITitleController.Style style;
        ITitleController.Style style2 = ITitleController.Style.New;
        ITitleController iTitleController = this.f120229f;
        if (iTitleController != null) {
            style = iTitleController.mo99193b();
        } else {
            style = null;
        }
        if (style2 == style) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "getContentView"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.b$b */
    static final class C47705b implements AbstractC44545b {

        /* renamed from: a */
        final /* synthetic */ MomentsTitleControllerProxy f120231a;

        C47705b(MomentsTitleControllerProxy bVar) {
            this.f120231a = bVar;
        }

        /* renamed from: a */
        public final ImageView getContentView() {
            ImageView imageView = new ImageView(this.f120231a.f120226b);
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_member_outlined, UIHelper.getColor(R.color.icon_n1)));
            imageView.setOnClickListener(new View$OnClickListenerC47706a(this));
            return imageView;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/moments/impl/mainview/title/MomentsTitleControllerProxy$funcBtnList$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.mainview.a.b$b$a */
        public static final class View$OnClickListenerC47706a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47705b f120232a;

            View$OnClickListenerC47706a(C47705b bVar) {
                this.f120232a = bVar;
            }

            public final void onClick(View view) {
                OnPopupWindowListener gVar = this.f120232a.f120231a.f120225a;
                if (gVar != null) {
                    gVar.mo167423b();
                }
            }
        }
    }

    /* renamed from: b */
    public final MomentsTitleInfo mo167350b() {
        boolean f = m188652f();
        Log.m165389i("MomentsTitleControllerProxy", "getTitleInfo isShow = " + f);
        if (!f) {
            return null;
        }
        this.f120228e.mo167359a(this.f120227d);
        return this.f120228e;
    }

    @Override // com.ss.android.lark.moments.impl.mainview.title.IMomentsTitleControllerProxy
    /* renamed from: a */
    public void mo167346a(OnPopupWindowListener gVar) {
        this.f120225a = gVar;
    }

    @Override // com.ss.android.lark.moments.impl.mainview.title.IMomentsTitleControllerProxy
    /* renamed from: a */
    public void mo167347a(String str) {
        ITitleController iTitleController;
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f120228e.mo167358a(str);
        if (m188652f() && (iTitleController = this.f120229f) != null) {
            iTitleController.mo99191a(this.f120228e);
        }
    }

    public MomentsTitleControllerProxy(Context context, ITitleController iTitleController) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f120230g = new NotificationIconDelegate(context);
        this.f120226b = context;
        this.f120229f = iTitleController;
        if (this.f120229f == null) {
            Log.m165383e("MomentsTitleControllerProxy", "mTitleController is null");
        }
    }
}
