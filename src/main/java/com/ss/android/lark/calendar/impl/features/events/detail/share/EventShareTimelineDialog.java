package com.ss.android.lark.calendar.impl.features.events.detail.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.DialogStatusBarUtil;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareTimelineDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "activity", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getActivity", "()Landroid/content/Context;", "setActivity", "shareBitmap", "Landroid/graphics/Bitmap;", "hideLoadingView", "", "initView", "initWindow", "shareImage2WxTimeLine", "bitmap", "showLoadingView", "updateEventShareImage", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.d */
public final class EventShareTimelineDialog extends BaseDialog {

    /* renamed from: a */
    public Bitmap f79523a;

    /* renamed from: b */
    private Context f79524b;

    /* renamed from: c */
    private final void m118102c() {
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
    public final void mo113966a() {
        View findViewById = findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView");
        findViewById.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.imageContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "imageContainer");
        relativeLayout.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo113968b() {
        View findViewById = findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView");
        findViewById.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.imageContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "imageContainer");
        relativeLayout.setVisibility(0);
    }

    /* renamed from: d */
    private final void m118103d() {
        Bitmap bitmap = this.f79523a;
        if (bitmap != null) {
            ((ImageView) findViewById(R.id.shareImageView)).setImageBitmap(bitmap);
        }
        ((TextView) findViewById(R.id.cancelTv)).setOnClickListener(new View$OnClickListenerC31386a(this));
        ((RelativeLayout) findViewById(R.id.imageContainer)).setOnClickListener(new View$OnClickListenerC31387b(this));
        ((LinearLayout) findViewById(R.id.share2TimeLineContainer)).setOnClickListener(new View$OnClickListenerC31388c(this));
        ImageView imageView = (ImageView) findViewById(R.id.shareImageView);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "shareImageView");
        imageView.setClipToOutline(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.d$a */
    public static final class View$OnClickListenerC31386a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventShareTimelineDialog f79525a;

        View$OnClickListenerC31386a(EventShareTimelineDialog dVar) {
            this.f79525a = dVar;
        }

        public final void onClick(View view) {
            this.f79525a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.d$b */
    public static final class View$OnClickListenerC31387b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventShareTimelineDialog f79526a;

        View$OnClickListenerC31387b(EventShareTimelineDialog dVar) {
            this.f79526a = dVar;
        }

        public final void onClick(View view) {
            this.f79526a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/share/EventShareTimelineDialog$shareImage2WxTimeLine$1", "Lcom/ss/android/lark/thirdshare/base/ThirdShareBaseUtils$SaveImage2AlbumCallback;", "noNoPermission", "", "onSaveFailed", "msg", "", "onSaveSuccess", "file", "Ljava/io/File;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.d$d */
    public static final class C31389d implements C55680a.AbstractC55692a {

        /* renamed from: a */
        final /* synthetic */ EventShareTimelineDialog f79528a;

        /* renamed from: b */
        final /* synthetic */ ShareActionType f79529b;

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
        public void noNoPermission() {
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveSuccess(File file) {
            C55680a.m215717c(this.f79529b.getPkgName());
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveFailed(String str) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            Context context = this.f79528a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.Builder aVar = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_SavedFailed).mo91655j().show();
        }

        C31389d(EventShareTimelineDialog dVar, ShareActionType shareActionType) {
            this.f79528a = dVar;
            this.f79529b = shareActionType;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.d$c */
    public static final class View$OnClickListenerC31388c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventShareTimelineDialog f79527a;

        View$OnClickListenerC31388c(EventShareTimelineDialog dVar) {
            this.f79527a = dVar;
        }

        public final void onClick(View view) {
            this.f79527a.dismiss();
            Bitmap bitmap = this.f79527a.f79523a;
            if (bitmap != null) {
                this.f79527a.mo113967a(bitmap);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventShareTimelineDialog(Context context) {
        super(context, R.style.EventShareImageDialog);
        Intrinsics.checkParameterIsNotNull(context, "activity");
        this.f79524b = context;
        DialogStatusBarUtil.f79499a.mo113950a(getWindow());
        setContentView(R.layout.dialog_event_share_timeline);
        m118102c();
        m118103d();
    }

    /* renamed from: a */
    public final void mo113967a(Bitmap bitmap) {
        ShareActionType value2ShareActionType = ShareType.WX_TIMELINE.value2ShareActionType();
        if (!C55680a.m215714a(value2ShareActionType)) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.Builder aVar = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_AppNotInstalled).mo91655j().show();
            return;
        }
        C55680a.m215698a(this.f79524b, bitmap, new C31389d(this, value2ShareActionType));
    }

    /* renamed from: b */
    public final void mo113969b(Bitmap bitmap) {
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
            this.f79523a = bitmap;
            ((ImageView) findViewById(R.id.shareImageView)).setImageBitmap(bitmap);
        }
        mo113968b();
    }
}
