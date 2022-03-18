package com.ss.android.photoeditor.ve.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u000212B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020%J\u000e\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001f\u0010\u0019R\u000e\u0010 \u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ImageEditToolView;", "Lcom/ss/android/photoeditor/ve/view/AnimationRelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cropDesc", "Landroid/widget/TextView;", "cropIcon", "Landroid/widget/ImageView;", "cropLayout", "Landroid/view/View;", "finishBtn", "graffitiDesc", "graffitiIcon", "graffitiLayout", "value", "", "isCropSelected", "setCropSelected", "(Z)V", "isGraffitiSelected", "setGraffitiSelected", "isMosaicSelected", "setMosaicSelected", "isTextSelected", "setTextSelected", "layoutId", "mosaicDesc", "mosaicIcon", "mosaicLayout", "onItemClickListener", "Lcom/ss/android/photoeditor/ve/view/ImageEditToolView$OnItemClickListener;", "textDesc", "textIcon", "textLayout", "view", "initListener", "", "initView", "setOnItemClickListener", "listener", "updateSelectStatus", ShareHitPoint.f121869d, "Companion", "OnItemClickListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ImageEditToolView extends AnimationRelativeLayout {

    /* renamed from: b */
    public static final Companion f149428b = new Companion(null);

    /* renamed from: a */
    public OnItemClickListener f149429a;

    /* renamed from: c */
    private View f149430c;

    /* renamed from: d */
    private final int f149431d = R.layout.view_image_edit_tool;

    /* renamed from: e */
    private View f149432e;

    /* renamed from: f */
    private ImageView f149433f;

    /* renamed from: g */
    private TextView f149434g;

    /* renamed from: h */
    private View f149435h;

    /* renamed from: i */
    private ImageView f149436i;

    /* renamed from: j */
    private TextView f149437j;

    /* renamed from: k */
    private View f149438k;

    /* renamed from: l */
    private ImageView f149439l;

    /* renamed from: m */
    private TextView f149440m;

    /* renamed from: n */
    private View f149441n;

    /* renamed from: o */
    private ImageView f149442o;

    /* renamed from: p */
    private TextView f149443p;

    /* renamed from: q */
    private View f149444q;

    /* renamed from: r */
    private boolean f149445r;

    /* renamed from: s */
    private boolean f149446s;

    /* renamed from: t */
    private boolean f149447t;

    /* renamed from: u */
    private boolean f149448u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ImageEditToolView$OnItemClickListener;", "", "onItemClick", "", ShareHitPoint.f121869d, "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$b */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo203629a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ImageEditToolView$Companion;", "", "()V", "CROP", "", "FINISH", "GRAFFITI", "MOSAIC", "NONE", "TEXT", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final void m232664c() {
        View view = this.f149432e;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC59947c(this));
        }
        View view2 = this.f149435h;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC59948d(this));
        }
        View view3 = this.f149438k;
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC59949e(this));
        }
        View view4 = this.f149441n;
        if (view4 != null) {
            view4.setOnClickListener(new View$OnClickListenerC59950f(this));
        }
        View view5 = this.f149444q;
        if (view5 != null) {
            view5.setOnClickListener(new View$OnClickListenerC59951g(this));
        }
    }

    /* renamed from: d */
    private final void m232665d() {
        this.f149432e = this.f149430c.findViewById(R.id.ll_graffiti_menu);
        this.f149433f = (ImageView) this.f149430c.findViewById(R.id.iv_graffiti_menu);
        this.f149434g = (TextView) this.f149430c.findViewById(R.id.tv_graffiti_menu);
        this.f149435h = this.f149430c.findViewById(R.id.ll_text_menu);
        this.f149436i = (ImageView) this.f149430c.findViewById(R.id.iv_text_menu);
        this.f149437j = (TextView) this.f149430c.findViewById(R.id.tv_text_menu);
        this.f149438k = findViewById(R.id.ll_crop_menu);
        this.f149439l = (ImageView) this.f149430c.findViewById(R.id.iv_crop_menu);
        this.f149440m = (TextView) this.f149430c.findViewById(R.id.tv_crop_menu);
        this.f149441n = this.f149430c.findViewById(R.id.ll_mosaic_menu);
        this.f149442o = (ImageView) this.f149430c.findViewById(R.id.iv_mosaic_menu);
        this.f149443p = (TextView) this.f149430c.findViewById(R.id.tv_mosaic_menu);
        this.f149444q = this.f149430c.findViewById(R.id.btn_finish);
    }

    public final void setOnItemClickListener(OnItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f149429a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$c */
    public static final class View$OnClickListenerC59947c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageEditToolView f149449a;

        View$OnClickListenerC59947c(ImageEditToolView imageEditToolView) {
            this.f149449a = imageEditToolView;
        }

        public final void onClick(View view) {
            OnItemClickListener bVar = this.f149449a.f149429a;
            if (bVar != null) {
                bVar.mo203629a(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$d */
    public static final class View$OnClickListenerC59948d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageEditToolView f149450a;

        View$OnClickListenerC59948d(ImageEditToolView imageEditToolView) {
            this.f149450a = imageEditToolView;
        }

        public final void onClick(View view) {
            OnItemClickListener bVar = this.f149450a.f149429a;
            if (bVar != null) {
                bVar.mo203629a(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$e */
    public static final class View$OnClickListenerC59949e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageEditToolView f149451a;

        View$OnClickListenerC59949e(ImageEditToolView imageEditToolView) {
            this.f149451a = imageEditToolView;
        }

        public final void onClick(View view) {
            OnItemClickListener bVar = this.f149451a.f149429a;
            if (bVar != null) {
                bVar.mo203629a(3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$f */
    public static final class View$OnClickListenerC59950f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageEditToolView f149452a;

        View$OnClickListenerC59950f(ImageEditToolView imageEditToolView) {
            this.f149452a = imageEditToolView;
        }

        public final void onClick(View view) {
            OnItemClickListener bVar = this.f149452a.f149429a;
            if (bVar != null) {
                bVar.mo203629a(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ImageEditToolView$g */
    public static final class View$OnClickListenerC59951g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageEditToolView f149453a;

        View$OnClickListenerC59951g(ImageEditToolView imageEditToolView) {
            this.f149453a = imageEditToolView;
        }

        public final void onClick(View view) {
            OnItemClickListener bVar = this.f149453a.f149429a;
            if (bVar != null) {
                bVar.mo203629a(5);
            }
        }
    }

    private final void setCropSelected(boolean z) {
        this.f149447t = z;
        ImageView imageView = this.f149439l;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        TextView textView = this.f149440m;
        if (textView != null) {
            textView.setSelected(z);
        }
    }

    private final void setGraffitiSelected(boolean z) {
        this.f149445r = z;
        ImageView imageView = this.f149433f;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        TextView textView = this.f149434g;
        if (textView != null) {
            textView.setSelected(z);
        }
    }

    private final void setMosaicSelected(boolean z) {
        this.f149448u = z;
        ImageView imageView = this.f149442o;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        TextView textView = this.f149443p;
        if (textView != null) {
            textView.setSelected(z);
        }
    }

    private final void setTextSelected(boolean z) {
        this.f149446s = z;
        ImageView imageView = this.f149436i;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        TextView textView = this.f149437j;
        if (textView != null) {
            textView.setSelected(z);
        }
    }

    public ImageEditToolView(Context context) {
        super(context);
        View inflate = View.inflate(getContext(), R.layout.view_image_edit_tool, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149430c = inflate;
        m232665d();
        m232664c();
    }

    public ImageEditToolView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(getContext(), R.layout.view_image_edit_tool, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149430c = inflate;
        m232665d();
        m232664c();
    }

    public ImageEditToolView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(getContext(), R.layout.view_image_edit_tool, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149430c = inflate;
        m232665d();
        m232664c();
    }
}
