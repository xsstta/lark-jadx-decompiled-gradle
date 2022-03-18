package com.ss.android.lark.chat.preview.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.ColorUtils;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.property.ImageProperty;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.tangram.base.action.Action;
import com.ss.android.lark.tangram.base.component.RenderComponent;
import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.File;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001!B/\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ss/android/lark/chat/preview/components/ImageViewComponent;", "Lcom/ss/android/lark/tangram/base/component/RenderComponent;", "Lcom/ss/android/lark/chat/preview/entity/component/property/ImageProperty;", "Landroid/widget/ImageView;", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "props", "style", "Lcom/ss/android/lark/chat/entity/preview/Style;", "dependency", "action", "Lcom/ss/android/lark/tangram/base/action/Action;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/ImageProperty;Lcom/ss/android/lark/chat/entity/preview/Style;Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/action/Action;)V", "value", "", "isSelfSizing", "()Z", "setSelfSizing", "(Z)V", "", "viewTypeIdentity", "getViewTypeIdentity", "()Ljava/lang/String;", "setViewTypeIdentity", "(Ljava/lang/String;)V", "createView", "Landroid/view/View;", "size", "Landroid/graphics/RectF;", "loadEncrypted", "", "view", "loadUnencrypted", "update", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.e */
public final class ImageViewComponent extends RenderComponent<ImageProperty, ImageView, Dependency> {

    /* renamed from: a */
    public static final Companion f88153a = new Companion(null);

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent
    /* renamed from: a */
    public boolean mo126265a() {
        return false;
    }

    @Override // com.ss.android.lark.tangram.base.component.ComponentWithDependency
    /* renamed from: b */
    public String mo126266b() {
        return "android.widget.ImageView";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/ImageViewComponent$Companion;", "", "()V", "IMAGE_WIDTH_HEIGHT_MIN_VALUE", "", "SDK_IMAGE_WIDTH_OR_HEIGHT_MIN", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.RenderComponent, com.ss.android.lark.tangram.base.node.IVirtualNode
    /* renamed from: a */
    public View mo126262a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "size");
        Dependency f = mo188730f();
        if (f != null) {
            return new ImageView(f.mo188743a());
        }
        return super.mo126262a(rectF);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/preview/components/ImageViewComponent$loadEncrypted$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "", "resource", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.e$b */
    public static final class C34096b extends C38818i<Drawable> {

        /* renamed from: a */
        final /* synthetic */ ImageViewComponent f88154a;

        /* renamed from: b */
        final /* synthetic */ ImageView f88155b;

        /* renamed from: f_ */
        public void mo49248a(Drawable drawable) {
            ThemeColor textColorV2;
            super.mo49248a((Object) drawable);
            if (drawable != null) {
                TCStyle h = this.f88154a.mo188733h();
                if (!(h instanceof Style)) {
                    h = null;
                }
                Style style = (Style) h;
                if (!(style == null || (textColorV2 = style.getTextColorV2()) == null)) {
                    drawable.mutate();
                    ColorUtils aVar = ColorUtils.f87906a;
                    Context context = this.f88155b.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    drawable.setTint(aVar.mo125874a(textColorV2, context));
                }
                this.f88155b.setImageDrawable(drawable);
            }
        }

        C34096b(ImageViewComponent eVar, ImageView imageView) {
            this.f88154a = eVar;
            this.f88155b = imageView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/preview/components/ImageViewComponent$loadUnencrypted$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Ljava/io/File;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.e$c */
    public static final class C34097c extends C38818i<File> {

        /* renamed from: a */
        final /* synthetic */ ImageViewComponent f88156a;

        /* renamed from: b */
        final /* synthetic */ ImageView f88157b;

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            super.mo49247a(drawable);
            ImageView imageView = this.f88157b;
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            Context context2 = this.f88157b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_image_fail_outlined, context2.getResources().getColor(R.color.icon_disable)));
        }

        /* renamed from: a */
        public void mo49248a(File file) {
            int i;
            int i2;
            int i3;
            ThemeColor textColorV2;
            Value maxHeight;
            Float value;
            Value maxWidth;
            Float value2;
            super.mo49248a((Object) file);
            Context context = this.f88157b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            Context context2 = this.f88157b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_image_fail_outlined, context2.getResources().getColor(R.color.icon_disable));
            if (file == null) {
                this.f88157b.setImageDrawable(iconDrawable);
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getPath(), options);
            if (DesktopUtil.m144301a(this.f88157b.getContext())) {
                i = UIHelper.getWindowWidth(this.f88157b.getContext());
            } else {
                Resources resources = this.f88157b.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "view.resources");
                i = (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.8d);
            }
            Resources resources2 = this.f88157b.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources2, "view.resources");
            int i4 = (int) (((double) resources2.getDisplayMetrics().heightPixels) * 0.8d);
            int i5 = options.outWidth;
            int i6 = options.outHeight;
            TCStyle h = this.f88156a.mo188733h();
            if (h == null || (maxWidth = h.getMaxWidth()) == null || (value2 = maxWidth.getValue()) == null) {
                i2 = SmEvents.EVENT_NW;
            } else {
                i2 = (int) value2.floatValue();
            }
            TCStyle h2 = this.f88156a.mo188733h();
            if (h2 == null || (maxHeight = h2.getMaxHeight()) == null || (value = maxHeight.getValue()) == null) {
                i3 = SmEvents.EVENT_NW;
            } else {
                i3 = (int) value.floatValue();
            }
            int[] a = ImageUtils.m224135a(i5, i6, i, i4, i2, i3);
            ImageLoader.with(this.f88157b.getContext()).load(file.getAbsolutePath()).error(iconDrawable).override(a[0], a[1]).into(this.f88157b);
            TCStyle h3 = this.f88156a.mo188733h();
            if (!(h3 instanceof Style)) {
                h3 = null;
            }
            Style style = (Style) h3;
            if (!(style == null || (textColorV2 = style.getTextColorV2()) == null)) {
                this.f88157b.getDrawable().mutate();
                Drawable drawable = this.f88157b.getDrawable();
                ColorUtils aVar = ColorUtils.f87906a;
                Context context3 = this.f88157b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
                drawable.setTint(aVar.mo125874a(textColorV2, context3));
            }
            this.f88157b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }

        C34097c(ImageViewComponent eVar, ImageView imageView) {
            this.f88156a = eVar;
            this.f88157b = imageView;
        }
    }

    /* renamed from: b */
    private final void m132338b(ImageView imageView) {
        ImageLoader.with(imageView.getContext()).load(((ImageProperty) mo188739i()).getAlt()).asFile().into(new C34097c(this, imageView));
    }

    /* renamed from: a */
    public void mo126263a(ImageView imageView) {
        String str;
        Image thumbnail;
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Context context = imageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_chat_loading_outlined, (int) R.color.icon_disable));
        ImageSet image = ((ImageProperty) mo188739i()).getImage();
        if (image == null || (thumbnail = image.getThumbnail()) == null) {
            str = null;
        } else {
            str = thumbnail.getKey();
        }
        if (TextUtils.isEmpty(str)) {
            m132338b(imageView);
        } else {
            m132339c(imageView);
        }
        if (mo188733h() instanceof Style) {
            TCStyle h = mo188733h();
            if (h != null) {
                ((Style) h).applyToBackground(imageView);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Style");
        }
        imageView.setBackground(null);
    }

    /* renamed from: c */
    private final void m132339c(ImageView imageView) {
        Image thumbnail;
        ImageSet image = ((ImageProperty) mo188739i()).getImage();
        if (image != null && (thumbnail = image.getThumbnail()) != null) {
            IRequestCreator load = ImageLoader.with(imageView.getContext()).load(new C38824b(thumbnail.getKey()));
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            Context context2 = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            IRequestCreator override = load.override((int) UDDimenUtils.m93308a(context, thumbnail.getWidth()), (int) UDDimenUtils.m93308a(context2, thumbnail.getHeight()));
            Context context3 = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
            if (UDDimenUtils.m93310b(context3, imageView.getLayoutParams().width) >= 56) {
                Context context4 = imageView.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "view.context");
                if (UDDimenUtils.m93310b(context4, imageView.getLayoutParams().height) >= 56) {
                    Context context5 = imageView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context5, "view.context");
                    Context context6 = imageView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context6, "view.context");
                    override.error(UDIconUtils.getIconDrawable(context5, (int) R.drawable.ud_icon_image_fail_outlined, context6.getResources().getColor(R.color.icon_disable)));
                }
            }
            override.into(new C34096b(this, imageView));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageViewComponent(ImageProperty imageProperty, Style style, Dependency aVar, Action<ImageView> aVar2) {
        super(imageProperty, style, aVar, aVar2);
        Intrinsics.checkParameterIsNotNull(imageProperty, "props");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }
}
