package com.ss.android.lark.calendar.impl.features.events.detail.share;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/SharePastePanelDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "title", "", "content", "cbtText", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "cbtClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;Landroid/view/View$OnClickListener;)V", "getCbtText", "()Ljava/lang/String;", "setCbtText", "(Ljava/lang/String;)V", "getContent", "setContent", "getTitle", "setTitle", "initListener", "", "initView", "initWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.e */
public final class SharePastePanelDialog extends BaseDialog {

    /* renamed from: b */
    public static final Companion f79530b = new Companion(null);

    /* renamed from: a */
    public final View.OnClickListener f79531a;

    /* renamed from: c */
    private String f79532c;

    /* renamed from: d */
    private String f79533d;

    /* renamed from: e */
    private String f79534e;

    /* renamed from: f */
    private final ShareType f79535f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/SharePastePanelDialog$Companion;", "", "()V", "showSharePasteDialog", "", "context", "Landroid/content/Context;", "title", "", "content", "cbtText", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "cbtClickListener", "Landroid/view/View$OnClickListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo113974a(Context context, String str, String str2, String str3, ShareType shareType, View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str3, "cbtText");
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            Intrinsics.checkParameterIsNotNull(onClickListener, "cbtClickListener");
            new SharePastePanelDialog(context, str, str2, str3, shareType, onClickListener).show();
        }
    }

    /* renamed from: b */
    private final void m118109b() {
        ((LinearLayout) findViewById(R.id.copyContainer)).setOnClickListener(new View$OnClickListenerC31390b(this));
        ((TextView) findViewById(R.id.sppCancelTv)).setOnClickListener(new View$OnClickListenerC31391c(this));
    }

    /* renamed from: c */
    private final void m118110c() {
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
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
    }

    /* renamed from: a */
    private final void m118108a() {
        boolean z;
        TextView textView = (TextView) findViewById(R.id.sppTitleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "sppTitleTv");
        textView.setText(this.f79532c);
        TextView textView2 = (TextView) findViewById(R.id.sppCtaTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "sppCtaTv");
        textView2.setText(this.f79534e);
        String str = this.f79533d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView3 = (TextView) findViewById(R.id.sppContentTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "sppContentTv");
            textView3.setVisibility(8);
        } else {
            TextView textView4 = (TextView) findViewById(R.id.sppContentTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "sppContentTv");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) findViewById(R.id.sppContentTv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "sppContentTv");
            textView5.setText(this.f79533d);
        }
        int i = C31392f.f79542a[this.f79535f.ordinal()];
        if (i == 1) {
            ImageView imageView = (ImageView) findViewById(R.id.copyTargetIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "copyTargetIv");
            imageView.setVisibility(0);
            ((ImageView) findViewById(R.id.copyTargetIv)).setImageDrawable(UIHelper.getDrawable(R.drawable.ud_icon_wechat_friend_filled));
        } else if (i != 2) {
            ImageView imageView2 = (ImageView) findViewById(R.id.copyTargetIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "copyTargetIv");
            imageView2.setVisibility(8);
        } else {
            ImageView imageView3 = (ImageView) findViewById(R.id.copyTargetIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "copyTargetIv");
            imageView3.setVisibility(0);
            ((ImageView) findViewById(R.id.copyTargetIv)).setImageDrawable(UIHelper.getDrawable(R.drawable.ud_icon_wechat_filled));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.e$c */
    public static final class View$OnClickListenerC31391c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharePastePanelDialog f79537a;

        View$OnClickListenerC31391c(SharePastePanelDialog eVar) {
            this.f79537a = eVar;
        }

        public final void onClick(View view) {
            this.f79537a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.e$b */
    public static final class View$OnClickListenerC31390b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharePastePanelDialog f79536a;

        View$OnClickListenerC31390b(SharePastePanelDialog eVar) {
            this.f79536a = eVar;
        }

        public final void onClick(View view) {
            this.f79536a.f79531a.onClick(view);
            this.f79536a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setContentView(R.layout.event_share_paste_panel);
        m118110c();
        m118108a();
        m118109b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePastePanelDialog(Context context, String str, String str2, String str3, ShareType shareType, View.OnClickListener onClickListener) {
        super(context, 2131886505);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str3, "cbtText");
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        Intrinsics.checkParameterIsNotNull(onClickListener, "cbtClickListener");
        this.f79532c = str;
        this.f79533d = str2;
        this.f79534e = str3;
        this.f79535f = shareType;
        this.f79531a = onClickListener;
    }
}
