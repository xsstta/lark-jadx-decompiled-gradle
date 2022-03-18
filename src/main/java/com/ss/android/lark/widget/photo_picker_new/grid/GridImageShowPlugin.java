package com.ss.android.lark.widget.photo_picker_new.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.utils.C57759a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker.adapter.PhotoPickerUIConstants;
import com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridShowPlugin;
import com.ss.android.lark.widget.photo_picker_new.IOnPhotoClickListener;
import com.ss.android.lark.widget.photo_picker_new.IPhotoSelectedChangedListener;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridImageShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridShowPlugin;", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_new/grid/GridImageShowPlugin$GridImageViewHolder;", "context", "Landroid/content/Context;", "pickParams", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "selectedChangedListener", "Lcom/ss/android/lark/widget/photo_picker_new/IPhotoSelectedChangedListener;", "photoClickListener", "Lcom/ss/android/lark/widget/photo_picker_new/IOnPhotoClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/widget/photo_picker/PickerParams;Lcom/ss/android/lark/widget/photo_picker_new/IPhotoSelectedChangedListener;Lcom/ss/android/lark/widget/photo_picker_new/IOnPhotoClickListener;)V", "imageSize", "", "onBindViewHolder", "", "holder", "photo", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "showImage", "GridImageViewHolder", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.a.c */
public final class GridImageShowPlugin extends GridShowPlugin<SelectablePhoto, GridImageViewHolder> {

    /* renamed from: a */
    public final Context f143629a;

    /* renamed from: b */
    public final PickerParams f143630b;

    /* renamed from: c */
    public final IPhotoSelectedChangedListener f143631c;

    /* renamed from: d */
    public final IOnPhotoClickListener f143632d;

    /* renamed from: e */
    private final int f143633e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridImageShowPlugin$GridImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivPhoto", "Landroid/widget/ImageView;", "getIvPhoto", "()Landroid/widget/ImageView;", "tvDuration", "Landroid/widget/TextView;", "getTvDuration", "()Landroid/widget/TextView;", "vMask", "getVMask", "()Landroid/view/View;", "vSelected", "Landroid/widget/CheckBox;", "getVSelected", "()Landroid/widget/CheckBox;", "videoInfoContainer", "getVideoInfoContainer", "setupCheckboxStyle", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.c$a */
    public static final class GridImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f143634a;

        /* renamed from: b */
        private final CheckBox f143635b;

        /* renamed from: c */
        private final View f143636c;

        /* renamed from: d */
        private final TextView f143637d;

        /* renamed from: e */
        private final View f143638e;

        /* renamed from: a */
        public final ImageView mo197653a() {
            return this.f143634a;
        }

        /* renamed from: b */
        public final CheckBox mo197654b() {
            return this.f143635b;
        }

        /* renamed from: c */
        public final View mo197655c() {
            return this.f143636c;
        }

        /* renamed from: d */
        public final TextView mo197656d() {
            return this.f143637d;
        }

        /* renamed from: e */
        public final View mo197657e() {
            return this.f143638e;
        }

        /* renamed from: f */
        private final void m226318f() {
            ViewGroup.LayoutParams layoutParams = this.f143635b.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                layoutParams2.topMargin = UIUtils.dp2px(view.getContext(), (float) PhotoPickerUIConstants.f144602a);
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                layoutParams2.rightMargin = UIUtils.dp2px(view2.getContext(), (float) PhotoPickerUIConstants.f144602a);
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                layoutParams2.width = UIUtils.dp2px(view3.getContext(), (float) PhotoPickerUIConstants.f144603b);
                View view4 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                layoutParams2.height = UIUtils.dp2px(view4.getContext(), (float) PhotoPickerUIConstants.f144603b);
                this.f143635b.setTextSize((float) PhotoPickerUIConstants.f144605d);
                this.f143635b.setBackgroundResource(PhotoPickerUIConstants.f144604c);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GridImageViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.iv_photo);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(id.iv_photo)");
            this.f143634a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.v_selected);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(id.v_selected)");
            this.f143635b = (CheckBox) findViewById2;
            View findViewById3 = view.findViewById(R.id.v_mask);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(id.v_mask)");
            this.f143636c = findViewById3;
            View findViewById4 = view.findViewById(R.id.tv_duration);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(id.tv_duration)");
            this.f143637d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.video_info_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(id.video_info_container)");
            this.f143638e = findViewById5;
            m226318f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J<\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/widget/photo_picker_new/grid/GridImageShowPlugin$showImage$1", "Lcom/ss/android/lark/image/api/RequestListener;", "", "onLoadFailed", "", "p0", "Ljava/lang/Exception;", "p1", "p2", "Lcom/ss/android/lark/image/api/Target;", "p3", "onResourceReady", "Lcom/ss/android/lark/image/api/DataSource;", "p4", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.c$d */
    public static final class C58385d implements AbstractC38817h<Object, Object> {
        C58385d() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53861a(Exception exc, Object obj, AbstractC38819j<Object> jVar, boolean z) {
            PerfGalleryLoadMonitor.f145397a.mo199288b();
            return false;
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53862a(Object obj, Object obj2, AbstractC38819j<Object> jVar, DataSource dataSource, boolean z) {
            Intrinsics.checkParameterIsNotNull(dataSource, "p3");
            PerfGalleryLoadMonitor.f145397a.mo199286a();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.c$b */
    public static final class View$OnClickListenerC58383b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridImageShowPlugin f143639a;

        /* renamed from: b */
        final /* synthetic */ SelectablePhoto f143640b;

        View$OnClickListenerC58383b(GridImageShowPlugin cVar, SelectablePhoto fVar) {
            this.f143639a = cVar;
            this.f143640b = fVar;
        }

        public final void onClick(View view) {
            this.f143639a.f143632d.mo197630a(this.f143640b);
        }
    }

    /* renamed from: b */
    public GridImageViewHolder mo197646a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.__picker_item_photo, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new GridImageViewHolder(inflate);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.c$c */
    public static final class View$OnClickListenerC58384c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridImageShowPlugin f143641a;

        /* renamed from: b */
        final /* synthetic */ SelectablePhoto f143642b;

        /* renamed from: c */
        final /* synthetic */ GridImageViewHolder f143643c;

        /* renamed from: d */
        final /* synthetic */ boolean f143644d;

        View$OnClickListenerC58384c(GridImageShowPlugin cVar, SelectablePhoto fVar, GridImageViewHolder aVar, boolean z) {
            this.f143641a = cVar;
            this.f143642b = fVar;
            this.f143643c = aVar;
            this.f143644d = z;
        }

        public final void onClick(View view) {
            String str;
            int i;
            String str2;
            if (this.f143642b.mo197738l()) {
                this.f143643c.mo197654b().setChecked(false);
                Context context = this.f143641a.f143629a;
                if (!this.f143642b.mo199606h() || !this.f143642b.mo197740n()) {
                    str2 = UIHelper.getString(R.string.Lark_Legacy_SelectPhotosOrVideosError);
                } else {
                    str2 = UIHelper.getString(R.string.Lark_Legacy_PickerJustOneVideoTip);
                }
                LKUIToast.show(context, str2);
            } else if (this.f143642b.mo197739m()) {
                this.f143643c.mo197654b().setChecked(false);
                int i2 = R.string.Lark_Legacy_PickerOverMaxCountTips;
                if (this.f143641a.f143630b.mo198865b() == 2 || this.f143641a.f143630b.mo198865b() == 1) {
                    i2 = R.string.Lark_Legacy_Max9Items;
                    str = "number";
                } else {
                    str = "max_count";
                }
                Context context2 = this.f143641a.f143629a;
                if (this.f143641a.f143630b.mo198870g()) {
                    i = this.f143641a.f143630b.mo198867d();
                } else {
                    i = this.f143641a.f143630b.mo198866c();
                }
                LKUIToast.show(context2, UIHelper.mustacheFormat(i2, str, String.valueOf(i)));
            } else {
                IPhotoSelectedChangedListener cVar = this.f143641a.f143631c;
                SelectablePhoto fVar = this.f143642b;
                cVar.mo197700a(fVar, true ^ this.f143644d, fVar.mo199606h());
            }
        }
    }

    /* renamed from: a */
    public void mo197647a(GridImageViewHolder aVar, SelectablePhoto fVar) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(fVar, "photo");
        if (fVar.mo199606h()) {
            aVar.mo197657e().setVisibility(0);
            aVar.mo197656d().setText(C26279i.m95149a(fVar.mo199605g()));
        } else {
            aVar.mo197657e().setVisibility(8);
        }
        m226313a(this.f143629a, aVar, fVar);
        boolean k = fVar.mo197737k();
        aVar.mo197653a().setSelected(k);
        if (fVar.mo197738l() || fVar.mo197739m()) {
            z = true;
        } else {
            z = false;
        }
        View c = aVar.mo197655c();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        c.setVisibility(i);
        if (this.f143630b.mo198866c() != 1 || this.f143630b.mo198869f()) {
            aVar.mo197654b().setVisibility(0);
            aVar.mo197654b().setChecked(k);
            aVar.mo197654b().setText(fVar.mo197736j());
            aVar.mo197654b().setOnClickListener(new View$OnClickListenerC58384c(this, fVar, aVar, k));
            return;
        }
        aVar.mo197654b().setVisibility(8);
        aVar.mo197653a().setOnClickListener(new View$OnClickListenerC58383b(this, fVar));
    }

    /* renamed from: a */
    private final void m226313a(Context context, GridImageViewHolder aVar, SelectablePhoto fVar) {
        if (C57759a.m224180a(aVar.mo197653a().getContext())) {
            String b = fVar.mo199595b();
            DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.ALL;
            if (fVar.mo199607i()) {
                diskCacheStrategy = DiskCacheStrategy.SOURCE;
            }
            IRequestCreator diskCacheStrategy2 = ImageLoader.with(context).placeholder(R.drawable.__picker_ic_photo_black_48dp).error(R.drawable.__picker_ic_broken_image_black_48dp).load(b).centerCrop().thumbnail(0.5f).dontAnimate(false).diskCacheStrategy(diskCacheStrategy);
            int i = this.f143633e;
            diskCacheStrategy2.override(i, i).listener(new C58385d()).into(aVar.mo197653a());
        }
    }

    public GridImageShowPlugin(Context context, PickerParams gVar, IPhotoSelectedChangedListener cVar, IOnPhotoClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "pickParams");
        Intrinsics.checkParameterIsNotNull(cVar, "selectedChangedListener");
        Intrinsics.checkParameterIsNotNull(aVar, "photoClickListener");
        this.f143629a = context;
        this.f143630b = gVar;
        this.f143631c = cVar;
        this.f143632d = aVar;
        this.f143633e = DeviceUtils.getScreenWidth(context) / 3;
    }
}
