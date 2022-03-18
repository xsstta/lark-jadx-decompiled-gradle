package com.ss.android.lark.ug.banner.ui.template;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.ug.banner.ui.ext.StyleHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/BaseTemplateItemView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/ug/banner/ui/template/ITemplateCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backImageIv", "Landroid/widget/ImageView;", "cardLayout", "Landroid/view/View;", "frontImageIv", "titleTv", "Landroid/widget/TextView;", "initViews", "", "onCreateView", "setBackImageUrl", "imageUrl", "", "setFrontImageUrl", "setTitle", "title", "setViewBg", "bgColor", "", "borderColor", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.ui.template.a */
public abstract class BaseTemplateItemView extends FrameLayout {

    /* renamed from: a */
    private View f141308a;

    /* renamed from: b */
    private TextView f141309b;

    /* renamed from: c */
    private ImageView f141310c;

    /* renamed from: d */
    private ImageView f141311d;

    /* renamed from: a */
    public abstract void mo194644a();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/ug/banner/ui/template/BaseTemplateItemView$setFrontImageUrl$1$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.a$a */
    public static final class RunnableC57389a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IRequestCreator f141312a;

        /* renamed from: b */
        final /* synthetic */ ImageView f141313b;

        RunnableC57389a(IRequestCreator iRequestCreator, ImageView imageView) {
            this.f141312a = iRequestCreator;
            this.f141313b = imageView;
        }

        public final void run() {
            this.f141312a.into(this.f141313b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/ug/banner/ui/template/BaseTemplateItemView$setBackImageUrl$1$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.a$b */
    public static final class RunnableC57390b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IRequestCreator f141314a;

        /* renamed from: b */
        final /* synthetic */ ImageView f141315b;

        RunnableC57390b(IRequestCreator iRequestCreator, ImageView imageView) {
            this.f141314a = iRequestCreator;
            this.f141315b = imageView;
        }

        public final void run() {
            this.f141314a.into(this.f141315b);
        }
    }

    /* renamed from: b */
    private final void m222471b() {
        mo194644a();
        this.f141308a = findViewById(R.id.card_layout);
        this.f141309b = (TextView) findViewById(R.id.title);
        this.f141310c = (ImageView) findViewById(R.id.front_pic);
        this.f141311d = (ImageView) findViewById(R.id.back_pic);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseTemplateItemView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m222471b();
    }

    public void setTitle(String str) {
        int i;
        TextView textView = this.f141309b;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f141309b;
        if (textView2 != null) {
            if (TextUtils.isEmpty(str)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
    }

    public void setBackImageUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "imageUrl");
        ImageView imageView = this.f141311d;
        if (imageView != null) {
            UICallbackExecutor.execute(new RunnableC57390b(ImageLoader.with(getContext()).load(str).asDrawable(), imageView));
        }
    }

    public void setFrontImageUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "imageUrl");
        ImageView imageView = this.f141310c;
        if (imageView != null) {
            UICallbackExecutor.execute(new RunnableC57389a(ImageLoader.with(getContext()).load(str).asDrawable(), imageView));
        }
    }

    /* renamed from: a */
    public void mo194645a(int i, int i2) {
        View view = this.f141308a;
        if (view != null) {
            StyleHelper.Companion aVar = StyleHelper.f141250a;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            view.setBackground(StyleHelper.Companion.m222427b(aVar, context, BitmapDescriptorFactory.HUE_RED, i, 0, i2, 10, null));
        }
    }
}
