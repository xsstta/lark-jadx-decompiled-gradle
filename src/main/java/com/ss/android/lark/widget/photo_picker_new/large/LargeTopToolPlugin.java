package com.ss.android.lark.widget.photo_picker_new.large;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent;
import com.ss.android.lark.widget.photo_picker_new.IPhotoSelectedChangedListener;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u001c\u0010\u001f\u001a\u00020\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"0!H\u0016J\u0012\u0010#\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\u0016\u0010&\u001a\u00020\u001e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/large/LargeTopToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$LargeToolContext;", "context", "Landroid/content/Context;", "pickerParams", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "selectedListener", "Lcom/ss/android/lark/widget/photo_picker_new/IPhotoSelectedChangedListener;", "(Landroid/content/Context;Lcom/ss/android/lark/widget/photo_picker/PickerParams;Lcom/ss/android/lark/widget/photo_picker_new/IPhotoSelectedChangedListener;)V", "checkBox", "Landroidx/appcompat/widget/AppCompatCheckBox;", "largeToolContext", "mBackIV", "Landroid/widget/ImageView;", "getPickerParams", "()Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "getView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBind", "", "onBindPhotoDir", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "setContext", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.b.c */
public final class LargeTopToolPlugin implements IToolPlugin<SelectablePhoto, LargeComponent.LargeToolContext<SelectablePhoto>> {

    /* renamed from: a */
    public LargeComponent.LargeToolContext<SelectablePhoto> f143684a;

    /* renamed from: b */
    public AppCompatCheckBox f143685b;

    /* renamed from: c */
    public final Context f143686c;

    /* renamed from: d */
    public final IPhotoSelectedChangedListener f143687d;

    /* renamed from: e */
    private ImageView f143688e;

    /* renamed from: f */
    private final PickerParams f143689f;

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197632a() {
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197633a(TransationData dVar) {
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197637a(Map<Integer, PhotoDir> map) {
        Intrinsics.checkParameterIsNotNull(map, "dirInfos");
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public boolean mo197638a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return false;
    }

    /* renamed from: b */
    public final PickerParams mo197695b() {
        return this.f143689f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.c$a */
    static final class View$OnClickListenerC58392a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LargeTopToolPlugin f143690a;

        View$OnClickListenerC58392a(LargeTopToolPlugin cVar) {
            this.f143690a = cVar;
        }

        public final void onClick(View view) {
            LargeComponent.LargeToolContext<SelectablePhoto> bVar = this.f143690a.f143684a;
            if (bVar != null) {
                bVar.mo199667b();
            }
        }
    }

    /* renamed from: a */
    public void mo197639b(LargeComponent.LargeToolContext<SelectablePhoto> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f143684a = bVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public View mo197631a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_new_large_top_tool, viewGroup, false);
        this.f143688e = (ImageView) inflate.findViewById(R.id.btn_back);
        this.f143685b = (AppCompatCheckBox) inflate.findViewById(R.id.cb_select_photo);
        ImageView imageView = this.f143688e;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC58392a(this));
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        return inflate;
    }

    /* renamed from: a */
    public void mo197635a(SelectablePhoto fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean k = fVar.mo197737k();
        AppCompatCheckBox appCompatCheckBox = this.f143685b;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setChecked(k);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f143685b;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.setText(fVar.mo197736j());
        }
        AppCompatCheckBox appCompatCheckBox3 = this.f143685b;
        if (appCompatCheckBox3 != null) {
            appCompatCheckBox3.setOnClickListener(new View$OnClickListenerC58393b(this, fVar, k));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.c$b */
    public static final class View$OnClickListenerC58393b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LargeTopToolPlugin f143691a;

        /* renamed from: b */
        final /* synthetic */ SelectablePhoto f143692b;

        /* renamed from: c */
        final /* synthetic */ boolean f143693c;

        View$OnClickListenerC58393b(LargeTopToolPlugin cVar, SelectablePhoto fVar, boolean z) {
            this.f143691a = cVar;
            this.f143692b = fVar;
            this.f143693c = z;
        }

        public final void onClick(View view) {
            String str;
            int i;
            int i2;
            if (this.f143692b.mo197738l()) {
                AppCompatCheckBox appCompatCheckBox = this.f143691a.f143685b;
                if (appCompatCheckBox != null) {
                    appCompatCheckBox.setChecked(false);
                }
                Context context = this.f143691a.f143686c;
                if (!this.f143692b.mo197740n() || !this.f143692b.mo199606h()) {
                    i2 = R.string.Lark_Legacy_SelectPhotosOrVideosError;
                } else {
                    i2 = R.string.Lark_Legacy_PickerJustOneVideoTip;
                }
                LKUIToast.show(context, i2);
            } else if (this.f143692b.mo197739m()) {
                AppCompatCheckBox appCompatCheckBox2 = this.f143691a.f143685b;
                if (appCompatCheckBox2 != null) {
                    appCompatCheckBox2.setChecked(false);
                }
                int i3 = R.string.Lark_Legacy_PickerOverMaxCountTips;
                if (this.f143691a.mo197695b().mo198865b() == 2 || this.f143691a.mo197695b().mo198865b() == 1) {
                    i3 = R.string.Lark_Legacy_Max9Items;
                    str = "number";
                } else {
                    str = "max_count";
                }
                Context context2 = this.f143691a.f143686c;
                if (this.f143691a.mo197695b().mo198870g()) {
                    i = this.f143691a.mo197695b().mo198867d();
                } else {
                    i = this.f143691a.mo197695b().mo198866c();
                }
                LKUIToast.show(context2, UIHelper.mustacheFormat(i3, str, String.valueOf(i)));
            } else {
                IPhotoSelectedChangedListener cVar = this.f143691a.f143687d;
                SelectablePhoto fVar = this.f143692b;
                cVar.mo197700a(fVar, true ^ this.f143693c, fVar.mo199606h());
            }
        }
    }

    public LargeTopToolPlugin(Context context, PickerParams gVar, IPhotoSelectedChangedListener cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "pickerParams");
        Intrinsics.checkParameterIsNotNull(cVar, "selectedListener");
        this.f143686c = context;
        this.f143689f = gVar;
        this.f143687d = cVar;
    }
}
