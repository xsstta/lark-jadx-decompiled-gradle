package com.ss.android.lark.calendar.impl.features.events.detail.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareItemViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.DialogStatusBarUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.ShareActionFactory;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.ShareItemFactory;
import com.ss.android.lark.calendar.impl.features.events.detail.share.widget.ShareImageItemDecoration;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0006\u0010\u0019\u001a\u00020\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareImageDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "activity", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getActivity", "()Landroid/content/Context;", "isLarkBuild", "", "mItemData", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareItemViewData;", "mShareImage", "Landroid/graphics/Bitmap;", "shareAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter;", "getShareAdapter", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareAdapter;", "getShareItemData", "hideLoadingView", "", "initRecycleView", "initView", "initWindow", "show", "showLoadingView", "updateEventShareImage", "bitmap", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.c */
public final class EventShareImageDialog extends BaseDialog {

    /* renamed from: b */
    public static List<? extends ShareType> f79511b = CollectionsKt.listOfNotNull((Object[]) new ShareType[]{ShareType.WX, ShareType.WX_TIMELINE, ShareType.QQ, ShareType.WEIBO, ShareType.SAVE_IMAGE, ShareType.SYS});

    /* renamed from: c */
    public static List<? extends ShareType> f79512c = CollectionsKt.listOfNotNull((Object[]) new ShareType[]{ShareType.SAVE_IMAGE, ShareType.SYS});

    /* renamed from: d */
    public static final Companion f79513d = new Companion(null);

    /* renamed from: a */
    public Bitmap f79514a;

    /* renamed from: e */
    private List<ShareItemViewData> f79515e;

    /* renamed from: f */
    private final boolean f79516f;

    /* renamed from: g */
    private final EventShareAdapter f79517g = new EventShareAdapter(new C31385d(this));

    /* renamed from: h */
    private final Context f79518h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareImageDialog$Companion;", "", "()V", "FEISHU_BUILD_SHARE_ITEM_WIDTH", "", "FEISHU_SHARE_IMAGE_ITEMS", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "getFEISHU_SHARE_IMAGE_ITEMS", "()Ljava/util/List;", "setFEISHU_SHARE_IMAGE_ITEMS", "(Ljava/util/List;)V", "LARK_BUILD_SHARE_ITEM_WIDTH", "LARK_SHARE_IMAGE_ITEMS", "getLARK_SHARE_IMAGE_ITEMS", "setLARK_SHARE_IMAGE_ITEMS", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Context mo113962c() {
        return this.f79518h;
    }

    /* renamed from: g */
    private final List<ShareItemViewData> m118097g() {
        if (this.f79516f) {
            return ShareItemFactory.f79503a.mo113954a(f79512c);
        }
        return ShareItemFactory.f79503a.mo113954a(f79511b);
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        super.show();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.eventShareRv);
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    /* renamed from: d */
    private final void m118094d() {
        WindowManager.LayoutParams layoutParams;
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo113959a() {
        View findViewById = findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView");
        findViewById.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.imageContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "imageContainer");
        relativeLayout.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo113961b() {
        View findViewById = findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView");
        findViewById.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.imageContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "imageContainer");
        relativeLayout.setVisibility(0);
    }

    /* renamed from: e */
    private final void m118095e() {
        m118096f();
        Bitmap bitmap = this.f79514a;
        if (bitmap != null) {
            ((ImageView) findViewById(R.id.shareImageView)).setImageBitmap(bitmap);
        }
        ((TextView) findViewById(R.id.cancelTv)).setOnClickListener(new View$OnClickListenerC31383b(this));
        ((RelativeLayout) findViewById(R.id.imageContainer)).setOnClickListener(new View$OnClickListenerC31384c(this));
        ImageView imageView = (ImageView) findViewById(R.id.shareImageView);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "shareImageView");
        imageView.setClipToOutline(true);
    }

    /* renamed from: f */
    private final void m118096f() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.eventShareRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "eventShareRv");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.eventShareRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "eventShareRv");
        recyclerView2.setAdapter(this.f79517g);
        ((RecyclerView) findViewById(R.id.eventShareRv)).addItemDecoration(new ShareImageItemDecoration());
        List<ShareItemViewData> g = m118097g();
        this.f79515e = g;
        this.f79517g.addAll(g);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.c$b */
    public static final class View$OnClickListenerC31383b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventShareImageDialog f79519a;

        View$OnClickListenerC31383b(EventShareImageDialog cVar) {
            this.f79519a = cVar;
        }

        public final void onClick(View view) {
            this.f79519a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.c$c */
    public static final class View$OnClickListenerC31384c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventShareImageDialog f79520a;

        View$OnClickListenerC31384c(EventShareImageDialog cVar) {
            this.f79520a = cVar;
        }

        public final void onClick(View view) {
            this.f79520a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.c$d */
    static final class C31385d extends Lambda implements Function1<ShareType, Unit> {
        final /* synthetic */ EventShareImageDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31385d(EventShareImageDialog cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShareType shareType) {
            invoke(shareType);
            return Unit.INSTANCE;
        }

        public final void invoke(ShareType shareType) {
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            Bitmap bitmap = this.this$0.f79514a;
            if (bitmap != null) {
                this.this$0.dismiss();
                BaseShareHandler a = ShareActionFactory.Companion.m118087a(ShareActionFactory.f79501a, shareType, null, 2, null);
                if (a != null) {
                    a.mo113988a(this.this$0.mo113962c(), bitmap);
                }
                GeneralHitPoint.m124184a(shareType);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventShareImageDialog(Context context) {
        super(context, R.style.EventShareImageDialog);
        Intrinsics.checkParameterIsNotNull(context, "activity");
        this.f79518h = context;
        this.f79516f = C30022a.f74882a.utilsDependency().mo108198b(context);
        DialogStatusBarUtil.f79499a.mo113950a(getWindow());
        setContentView(R.layout.fragment_event_share_image_layout);
        m118094d();
        m118095e();
    }

    /* renamed from: a */
    public final void mo113960a(Bitmap bitmap) {
        if (bitmap == null) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.Builder aVar = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_SubscribeCalendar_OperationFailed).mo91655j().show();
            dismiss();
        }
        if (bitmap != null) {
            this.f79514a = bitmap;
            ((ImageView) findViewById(R.id.shareImageView)).setImageBitmap(bitmap);
        }
        mo113961b();
    }
}
