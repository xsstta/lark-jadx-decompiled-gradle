package com.ss.android.lark.ug.banner.ui.template;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.banner.ui.BannerListener;
import com.ss.android.lark.ug.banner.ui.ext.StyleHelper;
import com.ss.android.lark.ug.banner.ui.p2858a.C57379a;
import com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import com.ss.android.lark.ug.banner.ui.view.CloseIcon;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004,-./B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u00020\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u00020\u00152\b\b\u0001\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u0005J\u0010\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u0005J\u0010\u0010'\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010(\u001a\u00020\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020\u0015H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView;", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "context", "Landroid/content/Context;", "style", "", "(Landroid/content/Context;I)V", "bannerListener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "closeIcon", "Lcom/ss/android/lark/ug/banner/ui/view/CloseIcon;", "containerView", "Landroid/view/View;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getStyle", "()I", "subTitleTv", "Landroid/widget/TextView;", "titleTv", "initViews", "", "setBannerListener", "listener", "setCloseIconColor", "color", "setCloseVisible", "visible", "", "setContainerBg", "bgColor", "borderColor", "setListDataSource", "dataSource", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateListDataSource;", "setSubTitle", "text", "", "setSubTitleColor", "setTitle", "setTitleColor", "setupItemAdapter", "setupItemDecoration", "setupRecyclerView", "BannerTemplateItem", "BannerTemplateListDataSource", "Builder", "LayoutStyle", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BannerTemplateView extends BaseBannerView {

    /* renamed from: a */
    public BannerListener f141286a;

    /* renamed from: b */
    private View f141287b;

    /* renamed from: c */
    private TextView f141288c;

    /* renamed from: d */
    private TextView f141289d;

    /* renamed from: e */
    private CloseIcon f141290e;

    /* renamed from: f */
    private RecyclerView f141291f;

    /* renamed from: g */
    private final int f141292g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$LayoutStyle;", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LayoutStyle {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateItem;", "()V", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$a */
    public static abstract class BannerTemplateItem implements TemplateItemAdapter.TemplateItem {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateListDataSource;", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateListDataSource;", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "()V", "style", "", "getStyle$ug_banner_ui_release", "()I", "setStyle$ug_banner_ui_release", "(I)V", "getStyle", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$b */
    public static abstract class BannerTemplateListDataSource implements TemplateItemAdapter.TemplateListDataSource<BannerTemplateItem> {

        /* renamed from: a */
        private int f141293a;

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateListDataSource
        /* renamed from: b */
        public int mo194626b() {
            return this.f141293a;
        }

        /* renamed from: c */
        public final void mo194627c(int i) {
            this.f141293a = i;
        }
    }

    public final int getStyle() {
        return this.f141292g;
    }

    /* renamed from: b */
    private final void m222454b() {
        RecyclerView recyclerView = this.f141291f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            setupItemAdapter(recyclerView);
            setupItemDecoration(recyclerView);
        }
    }

    /* renamed from: a */
    private final void m222453a() {
        this.f141287b = findViewById(R.id.banner_container);
        this.f141288c = (TextView) findViewById(R.id.banner_title);
        this.f141289d = (TextView) findViewById(R.id.banner_sub_title);
        this.f141290e = (CloseIcon) findViewById(R.id.banner_close);
        this.f141291f = (RecyclerView) findViewById(R.id.banner_list);
        m222454b();
        CloseIcon closeIcon = this.f141290e;
        if (closeIcon != null) {
            closeIcon.setOnClickListener(new View$OnClickListenerC57386d(this));
        }
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC57387e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\tJ\u0015\u0010!\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0010J\u0010\u0010(\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\tJ\u0015\u0010*\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eJ\u0010\u0010+\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\tJ\u0015\u0010,\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006-"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$Builder;", "", "()V", "bannerListener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "bgColor", "", "Ljava/lang/Integer;", "bgImage", "", "borderColor", "closeEnable", "", "Ljava/lang/Boolean;", "closeIconColor", "listDataSource", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateListDataSource;", "subTitle", "subTitleColor", "title", "titleColor", "build", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView;", "context", "Landroid/content/Context;", "style", "setBannerListener", "callback", "setBgColor", "color", "(Ljava/lang/Integer;)Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$Builder;", "setBgImage", "imageUrl", "setBorderColor", "setCloseEnable", "enable", "(Ljava/lang/Boolean;)Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$Builder;", "setCloseIconColor", "setListDataSource", "dataSource", "setSubTitle", "text", "setSubTitleColor", "setTitle", "setTitleColor", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$c */
    public static final class Builder {

        /* renamed from: a */
        private String f141294a;

        /* renamed from: b */
        private Integer f141295b;

        /* renamed from: c */
        private String f141296c;

        /* renamed from: d */
        private Integer f141297d;

        /* renamed from: e */
        private Integer f141298e;

        /* renamed from: f */
        private Integer f141299f;

        /* renamed from: g */
        private String f141300g;

        /* renamed from: h */
        private Boolean f141301h;

        /* renamed from: i */
        private Integer f141302i;

        /* renamed from: j */
        private BannerTemplateListDataSource f141303j;

        /* renamed from: k */
        private BannerListener f141304k;

        /* renamed from: a */
        public final Builder mo194628a(BannerListener aVar) {
            this.f141304k = aVar;
            return this;
        }

        /* renamed from: b */
        public final Builder mo194634b(Integer num) {
            this.f141297d = num;
            return this;
        }

        /* renamed from: c */
        public final Builder mo194636c(Integer num) {
            this.f141298e = num;
            return this;
        }

        /* renamed from: d */
        public final Builder mo194638d(Integer num) {
            this.f141299f = num;
            return this;
        }

        /* renamed from: e */
        public final Builder mo194639e(Integer num) {
            this.f141302i = num;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194629a(BannerTemplateListDataSource bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "dataSource");
            this.f141303j = bVar;
            return this;
        }

        /* renamed from: b */
        public final Builder mo194635b(String str) {
            this.f141296c = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo194637c(String str) {
            this.f141300g = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194630a(Boolean bool) {
            this.f141301h = bool;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194631a(Integer num) {
            this.f141295b = num;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194632a(String str) {
            this.f141294a = str;
            return this;
        }

        /* renamed from: a */
        public final BannerTemplateView mo194633a(Context context, @LayoutStyle int i) {
            int i2;
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            BannerTemplateView bannerTemplateView = new BannerTemplateView(context, i);
            bannerTemplateView.setTitle(this.f141294a);
            Integer num = this.f141295b;
            if (num != null) {
                bannerTemplateView.setTitleColor(num.intValue());
            }
            bannerTemplateView.setSubTitle(this.f141296c);
            Integer num2 = this.f141297d;
            if (num2 != null) {
                bannerTemplateView.setSubTitleColor(num2.intValue());
            }
            Integer num3 = this.f141299f;
            int i3 = 0;
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = 0;
            }
            Integer num4 = this.f141298e;
            if (num4 != null) {
                i3 = num4.intValue();
            }
            bannerTemplateView.mo194616a(i2, i3);
            Boolean bool = this.f141301h;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            bannerTemplateView.setCloseVisible(z);
            Integer num5 = this.f141302i;
            if (num5 != null) {
                bannerTemplateView.setCloseIconColor(num5.intValue());
            }
            if (this.f141303j == null) {
                Log.m165382e("BannerTemplateView.Builder listDatsSource is null");
            }
            bannerTemplateView.setListDataSource(this.f141303j);
            bannerTemplateView.setBannerListener(this.f141304k);
            return bannerTemplateView;
        }
    }

    public final void setBannerListener(BannerListener aVar) {
        this.f141286a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/banner/ui/template/BannerTemplateView$initViews$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$e */
    public static final class View$OnAttachStateChangeListenerC57387e implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ BannerTemplateView f141306a;

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC57387e(BannerTemplateView bannerTemplateView) {
            this.f141306a = bannerTemplateView;
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            BannerListener aVar = this.f141306a.f141286a;
            if (aVar != null) {
                aVar.mo194550a((BaseBannerView) this.f141306a);
            }
            this.f141306a.removeOnAttachStateChangeListener(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/ug/banner/ui/template/BannerTemplateView$setupItemAdapter$1$1", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "link", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$f */
    public static final class C57388f implements TemplateItemAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BannerTemplateView f141307a;

        C57388f(BannerTemplateView bannerTemplateView) {
            this.f141307a = bannerTemplateView;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo194643a(View view, int i, String str) {
            BannerListener aVar = this.f141307a.f141286a;
            if (aVar != null) {
                aVar.mo194549a(view, str);
            }
        }
    }

    public final void setCloseIconColor(int i) {
        CloseIcon closeIcon = this.f141290e;
        if (closeIcon != null) {
            closeIcon.setIconColor(i);
        }
    }

    public final void setSubTitleColor(int i) {
        TextView textView = this.f141289d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setTitleColor(int i) {
        TextView textView = this.f141288c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$d */
    public static final class View$OnClickListenerC57386d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannerTemplateView f141305a;

        View$OnClickListenerC57386d(BannerTemplateView bannerTemplateView) {
            this.f141305a = bannerTemplateView;
        }

        public final void onClick(View view) {
            BannerListener aVar = this.f141305a.f141286a;
            if (aVar != null) {
                aVar.mo194548a(view);
            }
        }
    }

    public final void setCloseVisible(boolean z) {
        int i;
        CloseIcon closeIcon = this.f141290e;
        if (closeIcon != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            closeIcon.setVisibility(i);
        }
    }

    private final void setupItemAdapter(RecyclerView recyclerView) {
        TemplateItemAdapter dVar = new TemplateItemAdapter();
        dVar.mo194652a(new C57388f(this));
        recyclerView.setAdapter(dVar);
    }

    private final void setupItemDecoration(RecyclerView recyclerView) {
        float f;
        int i = this.f141292g;
        if (i == 1) {
            f = 8.0f;
        } else if (i != 2) {
            f = 12.0f;
        } else {
            f = 20.0f;
        }
        int dp2px = UIUtils.dp2px(getContext(), f);
        int dp2px2 = UIUtils.dp2px(getContext(), 12.0f);
        recyclerView.addItemDecoration(new SpaceItemDecoration(dp2px2, dp2px, dp2px2));
    }

    public final void setListDataSource(BannerTemplateListDataSource bVar) {
        RecyclerView.Adapter adapter;
        if (bVar != null) {
            RecyclerView recyclerView = this.f141291f;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (adapter instanceof TemplateItemAdapter)) {
                bVar.mo194627c(this.f141292g);
                ((TemplateItemAdapter) adapter).mo194653a(bVar);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f141291f;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    public final void setSubTitle(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = this.f141289d;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f141289d;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f141289d;
        if (textView3 != null) {
            textView3.setText(str2);
        }
    }

    public final void setTitle(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = this.f141288c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f141288c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f141288c;
        if (textView3 != null) {
            textView3.setText(str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerTemplateView(Context context, @LayoutStyle int i) {
        super(context, null, 2, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f141292g = i;
        LayoutInflater.from(context).inflate(R.layout.ug_banner_template, (ViewGroup) this, true);
        m222453a();
    }

    /* renamed from: a */
    public final void mo194616a(int i, int i2) {
        View view = this.f141287b;
        if (view != null) {
            int dp2px = UIUtils.dp2px(getContext(), 1.0f);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            int a = C57379a.m222424a(context, i);
            StyleHelper.Companion aVar = StyleHelper.f141250a;
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            view.setBackground(StyleHelper.Companion.m222426a(aVar, context2, BitmapDescriptorFactory.HUE_RED, a, dp2px, i2, 2, null));
            setPadding(dp2px, dp2px, dp2px, dp2px);
        }
    }
}
