package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView$Type;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView$Type;)V", "mCloseBtn", "Landroid/widget/ImageView;", "mCopyBtn", "mCustomContainer", "Landroid/widget/FrameLayout;", "mTitleIconIV", "mTitleTV", "Lcom/ss/android/lark/chat/preview/components/view/TailDrawableTextView;", "getType", "()Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView$Type;", "getCloseBtn", "getCopyBtn", "getCustomContainer", "getTitleIconView", "getTitleView", "initView", "", "Companion", "Type", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewHeaderView extends RelativeLayout {

    /* renamed from: a */
    public static final int f88204a = UIHelper.dp2px(16.0f);

    /* renamed from: b */
    public static final int f88205b = UIHelper.dp2px(12.0f);

    /* renamed from: c */
    public static final int f88206c = UIHelper.dp2px(12.0f);

    /* renamed from: d */
    public static final int f88207d = UIHelper.dp2px(78.0f);

    /* renamed from: e */
    public static final int f88208e = UIHelper.dp2px(12.0f);

    /* renamed from: f */
    public static final int f88209f = UIHelper.dp2px(12.0f);

    /* renamed from: g */
    public static final int f88210g = UIHelper.dp2px(150.0f);

    /* renamed from: h */
    public static final int f88211h = UIHelper.dp2px(8.0f);

    /* renamed from: i */
    public static final int f88212i = 1;

    /* renamed from: j */
    public static final Companion f88213j = new Companion(null);

    /* renamed from: k */
    private TailDrawableTextView f88214k;

    /* renamed from: l */
    private FrameLayout f88215l;

    /* renamed from: m */
    private ImageView f88216m;

    /* renamed from: n */
    private ImageView f88217n;

    /* renamed from: o */
    private ImageView f88218o;

    /* renamed from: p */
    private final Type f88219p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView$Type;", "", "(Ljava/lang/String;I)V", "ONELINE", "NEXLINE", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        ONELINE,
        NEXLINE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/PreviewHeaderView$Companion;", "", "()V", "COPY_BTN_MARGIN_RIGHT", "", "getCOPY_BTN_MARGIN_RIGHT", "()I", "CUSTOM_CONTAINER_MARGIN_RIGHT", "getCUSTOM_CONTAINER_MARGIN_RIGHT", "DEFAULT_MAX_LINES", "getDEFAULT_MAX_LINES", "DEFAULT_PADDING_LEFT", "getDEFAULT_PADDING_LEFT", "DEFAULT_PADDING_RIGHT", "getDEFAULT_PADDING_RIGHT", "DEFAULT_TAG_SIZE", "", "DEFAULT_TEXT_SIZE", "IMAGE_SPAN_PADDING", "getIMAGE_SPAN_PADDING", "MAX_CUSTOM_CONTAINER_WIDTH", "getMAX_CUSTOM_CONTAINER_WIDTH", "ONELINE_WIDTH_THRESHOLD", "getONELINE_WIDTH_THRESHOLD", "TITLE_TEXT_MARGIN_LEFT", "getTITLE_TEXT_MARGIN_LEFT", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.PreviewHeaderView$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo126315a() {
            return PreviewHeaderView.f88204a;
        }

        /* renamed from: b */
        public final int mo126316b() {
            return PreviewHeaderView.f88205b;
        }

        /* renamed from: c */
        public final int mo126317c() {
            return PreviewHeaderView.f88206c;
        }

        /* renamed from: d */
        public final int mo126318d() {
            return PreviewHeaderView.f88207d;
        }

        /* renamed from: e */
        public final int mo126319e() {
            return PreviewHeaderView.f88208e;
        }

        /* renamed from: f */
        public final int mo126320f() {
            return PreviewHeaderView.f88209f;
        }

        /* renamed from: g */
        public final int mo126321g() {
            return PreviewHeaderView.f88210g;
        }

        /* renamed from: h */
        public final int mo126322h() {
            return PreviewHeaderView.f88211h;
        }

        /* renamed from: i */
        public final int mo126323i() {
            return PreviewHeaderView.f88212i;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Type getType() {
        return this.f88219p;
    }

    public final ImageView getCloseBtn() {
        ImageView imageView = this.f88216m;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
        }
        return imageView;
    }

    public final ImageView getCopyBtn() {
        ImageView imageView = this.f88217n;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCopyBtn");
        }
        return imageView;
    }

    public final FrameLayout getCustomContainer() {
        FrameLayout frameLayout = this.f88215l;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomContainer");
        }
        return frameLayout;
    }

    public final ImageView getTitleIconView() {
        ImageView imageView = this.f88218o;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleIconIV");
        }
        return imageView;
    }

    public final TailDrawableTextView getTitleView() {
        TailDrawableTextView tailDrawableTextView = this.f88214k;
        if (tailDrawableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleTV");
        }
        return tailDrawableTextView;
    }

    /* renamed from: a */
    private final void m132427a(Context context) {
        int i;
        if (this.f88219p == Type.ONELINE) {
            i = R.layout.component_headerview_oneline;
        } else {
            i = R.layout.component_headerview_nextline;
        }
        View.inflate(context, i, this);
        View findViewById = findViewById(R.id.tv_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.tv_title)");
        this.f88214k = (TailDrawableTextView) findViewById;
        View findViewById2 = findViewById(R.id.custom_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.custom_container)");
        this.f88215l = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.btn_close);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.btn_close)");
        this.f88216m = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.btn_copy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.btn_copy)");
        this.f88217n = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.iv_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.iv_title)");
        this.f88218o = (ImageView) findViewById5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewHeaderView(Context context, Type type) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        this.f88219p = type;
        m132427a(context);
    }
}
