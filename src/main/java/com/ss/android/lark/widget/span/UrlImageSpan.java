package com.ss.android.lark.widget.span;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rJ\f\u0010\u001c\u001a\u00020\u001a*\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/widget/span/UrlImageSpan;", "Landroid/text/style/ImageSpan;", "context", "Landroid/content/Context;", "localPath", "", "editText", "Landroid/widget/EditText;", "onImageReadyListener", "Lcom/ss/android/lark/widget/span/UrlImageSpan$OnImageReadyListener;", "(Landroid/content/Context;Ljava/lang/String;Landroid/widget/EditText;Lcom/ss/android/lark/widget/span/UrlImageSpan$OnImageReadyListener;)V", "TAG", "fixSize", "", "hasImageShown", "", "maxHeight", "maxWidth", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getImageSizeFromLocalPath", "Lkotlin/Pair;", "setImageFixSize", "", "size", "insertToEditText", "Landroid/graphics/drawable/BitmapDrawable;", "Companion", "OnImageReadyListener", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.span.r */
public final class UrlImageSpan extends ImageSpan {

    /* renamed from: e */
    public static final Companion f146881e = new Companion(null);

    /* renamed from: a */
    public Resources f146882a;

    /* renamed from: b */
    public final String f146883b;

    /* renamed from: c */
    public final EditText f146884c;

    /* renamed from: d */
    public final OnImageReadyListener f146885d;

    /* renamed from: f */
    private int f146886f;

    /* renamed from: g */
    private int f146887g;

    /* renamed from: h */
    private boolean f146888h;

    /* renamed from: i */
    private int f146889i;

    /* renamed from: j */
    private final Context f146890j;

    /* renamed from: k */
    private final String f146891k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/span/UrlImageSpan$OnImageReadyListener;", "", "onImageReady", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.span.r$b */
    public interface OnImageReadyListener {
        /* renamed from: a */
        void mo201135a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/span/UrlImageSpan$Companion;", "", "()V", "MIN_HEIGHT", "", "MIN_WIDTH", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.span.r$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.span.r$d */
    public static final class RunnableC59183d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UrlImageSpan f146893a;

        /* renamed from: b */
        final /* synthetic */ int f146894b;

        RunnableC59183d(UrlImageSpan rVar, int i) {
            this.f146893a = rVar;
            this.f146894b = i;
        }

        public final void run() {
            try {
                this.f146893a.f146884c.setText(this.f146893a.f146884c.getText());
                this.f146893a.f146884c.setSelection(this.f146894b);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

    public Drawable getDrawable() {
        if (!this.f146888h) {
            Context context = this.f146890j;
            if (!(context instanceof Activity) || UIUtils.isActivityRunning((Activity) context)) {
                Pair<Integer, Integer> a = m229868a(this.f146891k);
                int[] a2 = ImageUtils.m224135a(a.component1().intValue(), a.component2().intValue(), this.f146886f, this.f146887g, 80, 80);
                int i = a2[0];
                int i2 = a2[1];
                IRequestCreator asBitmap = ImageLoader.with(this.f146890j).load(this.f146891k).asBitmap();
                C59182c cVar = new C59182c(this);
                int i3 = this.f146889i;
                if (1 <= i3 && i2 > i3) {
                    asBitmap.override(i3, i3).centerCrop().into(cVar);
                } else {
                    asBitmap.override(i, i2).into(cVar);
                }
                Drawable drawable = super.getDrawable();
                Intrinsics.checkExpressionValueIsNotNull(drawable, "super.getDrawable()");
                return drawable;
            }
        }
        Drawable drawable2 = super.getDrawable();
        Intrinsics.checkExpressionValueIsNotNull(drawable2, "super.getDrawable()");
        return drawable2;
    }

    /* renamed from: a */
    public final void mo201132a(int i) {
        this.f146889i = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/span/UrlImageSpan$getDrawable$target$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", "bitmap", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.span.r$c */
    public static final class C59182c extends C38818i<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ UrlImageSpan f146892a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59182c(UrlImageSpan rVar) {
            this.f146892a = rVar;
        }

        /* renamed from: a */
        public void mo49248a(Bitmap bitmap) {
            Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
            OnImageReadyListener bVar = this.f146892a.f146885d;
            if (bVar != null) {
                bVar.mo201135a();
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f146892a.f146882a, bitmap);
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
            try {
                this.f146892a.mo201133a(bitmapDrawable);
            } catch (Exception e) {
                Log.m165386e(this.f146892a.f146883b, e);
            }
        }
    }

    /* renamed from: a */
    private final Pair<Integer, Integer> m229868a(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(new File(str).getPath(), options);
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    /* renamed from: a */
    public final void mo201133a(BitmapDrawable bitmapDrawable) {
        Field declaredField = ImageSpan.class.getDeclaredField("mDrawable");
        declaredField.setAccessible(true);
        declaredField.set(this, bitmapDrawable);
        Field declaredField2 = DynamicDrawableSpan.class.getDeclaredField("mDrawableRef");
        declaredField2.setAccessible(true);
        declaredField2.set(this, null);
        this.f146888h = true;
        this.f146884c.post(new RunnableC59183d(this, this.f146884c.getSelectionEnd()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UrlImageSpan(Context context, String str, EditText editText, OnImageReadyListener bVar) {
        super(context, (int) R.drawable.chat_window_image_item_holder);
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "localPath");
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        this.f146890j = context;
        this.f146891k = str;
        this.f146884c = editText;
        this.f146885d = bVar;
        Context context2 = editText.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "editText.context");
        this.f146882a = context2.getResources();
        if (DesktopUtil.m144301a(context)) {
            i = UIHelper.getWindowWidth(context);
        } else {
            Resources resources = this.f146882a;
            Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
            i = (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.4d);
        }
        this.f146886f = i;
        Resources resources2 = this.f146882a;
        Intrinsics.checkExpressionValueIsNotNull(resources2, "resources");
        this.f146887g = (int) (((double) resources2.getDisplayMetrics().heightPixels) * 0.4d);
        this.f146889i = -1;
        this.f146883b = "UrlImageSpan";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlImageSpan(Context context, String str, EditText editText, OnImageReadyListener bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, editText, (i & 8) != 0 ? null : bVar);
    }
}
