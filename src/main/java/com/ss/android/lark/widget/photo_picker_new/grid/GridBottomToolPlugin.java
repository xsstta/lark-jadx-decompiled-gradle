package com.ss.android.lark.widget.photo_picker_new.grid;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.button.LKUICheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.base.Component;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent;
import com.ss.android.lark.widget.photo_picker_new.IOnSendClickListener;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\u00020!2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\"\u001a\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0$H\u0016J\u0012\u0010&\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020!H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridBottomToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$GridToolContext;", "actionType", "", "support", "Lcom/ss/android/lark/widget/photo_picker_new/grid/GridBottomToolPlugin$ISupport;", "sendListener", "Lcom/ss/android/lark/widget/photo_picker_new/IOnSendClickListener;", "(ILcom/ss/android/lark/widget/photo_picker_new/grid/GridBottomToolPlugin$ISupport;Lcom/ss/android/lark/widget/photo_picker_new/IOnSendClickListener;)V", "mGridToolContext", "originCheckbox", "Lcom/larksuite/component/ui/button/LKUICheckBox;", "originZone", "Landroid/view/ViewGroup;", "previewTV", "Landroid/widget/TextView;", "sendTV", "getActionTextId", ShareHitPoint.f121869d, "getActionTextWithCount", "getView", "Landroid/view/View;", "parent", "onActivityResult", "", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBind", "", "onBindPhotoDir", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "setContext", "context", "ISupport", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.a.a */
public final class GridBottomToolPlugin implements IToolPlugin<List<SelectablePhoto>, GridComponent.GridToolContext> {

    /* renamed from: a */
    public GridComponent.GridToolContext f143615a;

    /* renamed from: b */
    public final ISupport f143616b;

    /* renamed from: c */
    public final IOnSendClickListener f143617c;

    /* renamed from: d */
    private ViewGroup f143618d;

    /* renamed from: e */
    private LKUICheckBox f143619e;

    /* renamed from: f */
    private TextView f143620f;

    /* renamed from: g */
    private TextView f143621g;

    /* renamed from: h */
    private final int f143622h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridBottomToolPlugin$ISupport;", "", "getSelectedPhoto", "", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "isOriginChecked", "", "isShowOriginCheckbox", "setOriginChecked", "", "isChecked", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.a$a */
    public interface ISupport {
        /* renamed from: a */
        List<SelectablePhoto> mo197640a();

        /* renamed from: a */
        void mo197641a(boolean z);

        /* renamed from: b */
        boolean mo197642b();

        /* renamed from: c */
        boolean mo197643c();
    }

    /* renamed from: a */
    private final int m226293a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? R.string.Lark_Legacy_PickerConfirmWithCount : R.string.Lark_Legacy_PickerSendEnsure : R.string.Lark_Legacy_PickerUploadWithCount : R.string.Lark_Legacy_PickerSendWithCount;
    }

    /* renamed from: b */
    private final int m226294b(int i) {
        return i != 1 ? i != 2 ? R.string.Lark_Legacy_PickerSendEnsure : R.string.Lark_Legacy_PickerUpload : R.string.Lark_Legacy_PickerSend;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197632a() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/photo_picker_new/grid/GridBottomToolPlugin$getView$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.a$c */
    public static final class C58380c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ GridBottomToolPlugin f143624a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58380c(GridBottomToolPlugin aVar) {
            this.f143624a = aVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f143624a.f143617c.mo197678a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/photo_picker_new/grid/GridBottomToolPlugin$getView$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.a$d */
    public static final class C58381d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ GridBottomToolPlugin f143625a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58381d(GridBottomToolPlugin aVar) {
            this.f143625a = aVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            GridComponent.GridToolContext aVar = this.f143625a.f143615a;
            if (aVar != null) {
                KClass<? extends Component<?>> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LargeComponent.class);
                TransationData dVar = new TransationData();
                dVar.mo199621a("disableLoadMore", true);
                dVar.mo199621a("showData", this.f143625a.f143616b.mo197640a());
                aVar.mo199651a(orCreateKotlinClass, dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo197639b(GridComponent.GridToolContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        this.f143615a = aVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197633a(TransationData dVar) {
        LKUICheckBox lKUICheckBox = this.f143619e;
        if (lKUICheckBox != null) {
            lKUICheckBox.setChecked(this.f143616b.mo197643c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.a$e */
    public static final class View$OnClickListenerC58382e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridBottomToolPlugin f143626a;

        View$OnClickListenerC58382e(GridBottomToolPlugin aVar) {
            this.f143626a = aVar;
        }

        public final void onClick(View view) {
            GridComponent.GridToolContext aVar = this.f143626a.f143615a;
            if (aVar != null) {
                KClass<? extends Component<?>> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LargeComponent.class);
                TransationData dVar = new TransationData();
                dVar.mo199621a("showData", this.f143626a.f143616b.mo197640a());
                dVar.mo199621a("disableLoadMore", true);
                aVar.mo199651a(orCreateKotlinClass, dVar);
            }
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public View mo197631a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_new_grid_bottom_tool, viewGroup, false);
        this.f143618d = (ViewGroup) inflate.findViewById(R.id.origin_zone);
        this.f143619e = (LKUICheckBox) inflate.findViewById(R.id.cb_original_photo);
        this.f143620f = (TextView) inflate.findViewById(R.id.btn_photo_send);
        this.f143621g = (TextView) inflate.findViewById(R.id.btn_photo_preview);
        ViewGroup viewGroup2 = this.f143618d;
        if (viewGroup2 != null) {
            if (!this.f143616b.mo197642b()) {
                i = 4;
            }
            viewGroup2.setVisibility(i);
        }
        LKUICheckBox lKUICheckBox = this.f143619e;
        if (lKUICheckBox != null) {
            lKUICheckBox.setOnCheckedChangeListener(new C58379b(this));
        }
        TextView textView = this.f143620f;
        if (textView != null) {
            textView.setOnClickListener(new C58380c(this));
        }
        TextView textView2 = this.f143621g;
        if (textView2 != null) {
            textView2.setOnClickListener(new C58381d(this));
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        return inflate;
    }

    /* renamed from: a */
    public void mo197635a(List<SelectablePhoto> list) {
        int i;
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LKUICheckBox lKUICheckBox = this.f143619e;
        if (lKUICheckBox != null) {
            lKUICheckBox.setChecked(this.f143616b.mo197643c());
        }
        int size = this.f143616b.mo197640a().size();
        TextView textView = this.f143621g;
        if (textView != null) {
            if (size > 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
        if (size > 0) {
            TextView textView2 = this.f143621g;
            if (textView2 != null) {
                textView2.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Preview, "select_count", String.valueOf(size)));
            }
            TextView textView3 = this.f143621g;
            if (textView3 != null) {
                textView3.setOnClickListener(new View$OnClickListenerC58382e(this));
            }
            TextView textView4 = this.f143620f;
            if (textView4 != null) {
                textView4.setText(UIHelper.mustacheFormat(m226293a(this.f143622h), "count", String.valueOf(size)));
            }
            TextView textView5 = this.f143620f;
            if (textView5 != null) {
                textView5.setEnabled(true);
                return;
            }
            return;
        }
        TextView textView6 = this.f143620f;
        if (textView6 != null) {
            textView6.setText(UIHelper.mustacheFormat(m226294b(this.f143622h), "count", String.valueOf(size)));
        }
        TextView textView7 = this.f143620f;
        if (textView7 != null) {
            textView7.setEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.a$b */
    static final class C58379b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ GridBottomToolPlugin f143623a;

        C58379b(GridBottomToolPlugin aVar) {
            this.f143623a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f143623a.f143616b.mo197641a(z);
        }
    }

    public GridBottomToolPlugin(int i, ISupport aVar, IOnSendClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "support");
        Intrinsics.checkParameterIsNotNull(bVar, "sendListener");
        this.f143622h = i;
        this.f143616b = aVar;
        this.f143617c = bVar;
    }
}
