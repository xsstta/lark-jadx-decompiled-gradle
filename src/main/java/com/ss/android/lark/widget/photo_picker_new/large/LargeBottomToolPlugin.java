package com.ss.android.lark.widget.photo_picker_new.large;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.button.LKUICheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent;
import com.ss.android.lark.widget.photo_picker_new.IOnSendClickListener;
import com.ss.android.lark.widget.photo_picker_new.IPhotoSelectedChangedListener;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0002/0B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001c\u0010'\u001a\u00020&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0)H\u0016J\u0012\u0010+\u001a\u00020&2\b\u0010 \u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020&H\u0016J\u0016\u0010.\u001a\u00020&2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$LargeToolContext;", "context", "Landroid/content/Context;", "actionType", "", "support", "Lcom/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin$ISupport;", "selectedChangedListener", "Lcom/ss/android/lark/widget/photo_picker_new/IPhotoSelectedChangedListener;", "sendListener", "Lcom/ss/android/lark/widget/photo_picker_new/IOnSendClickListener;", "(Landroid/content/Context;ILcom/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin$ISupport;Lcom/ss/android/lark/widget/photo_picker_new/IPhotoSelectedChangedListener;Lcom/ss/android/lark/widget/photo_picker_new/IOnSendClickListener;)V", "editTV", "Landroid/widget/TextView;", "largeToolContext", "originCheckBox", "Lcom/larksuite/component/ui/button/LKUICheckBox;", "originZone", "Landroid/widget/RelativeLayout;", "sendTV", "getActionTextId", ShareHitPoint.f121869d, "getActionTextWithCount", "getView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "isShowOriginForPhoto", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onBind", "", "onBindPhotoDir", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "setContext", "Companion", "ISupport", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.b.a */
public final class LargeBottomToolPlugin implements IToolPlugin<SelectablePhoto, LargeComponent.LargeToolContext<SelectablePhoto>> {

    /* renamed from: f */
    public static final Companion f143663f = new Companion(null);

    /* renamed from: a */
    public LargeComponent.LargeToolContext<SelectablePhoto> f143664a;

    /* renamed from: b */
    public final Context f143665b;

    /* renamed from: c */
    public final ISupport f143666c;

    /* renamed from: d */
    public final IPhotoSelectedChangedListener f143667d;

    /* renamed from: e */
    public final IOnSendClickListener f143668e;

    /* renamed from: g */
    private RelativeLayout f143669g;

    /* renamed from: h */
    private LKUICheckBox f143670h;

    /* renamed from: i */
    private TextView f143671i;

    /* renamed from: j */
    private TextView f143672j;

    /* renamed from: k */
    private final int f143673k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H&J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin$ISupport;", "", "getSelectedPhoto", "", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "isOriginChecked", "", "isShowOriginCheckbox", "putEditResult", "", "id", "", "editPath", "setOriginChecked", "isChecked", "startEditActivity", "requestCode", "", "originPath", "resultPath", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.a$b */
    public interface ISupport {
        /* renamed from: a */
        List<SelectablePhoto> mo197681a();

        /* renamed from: a */
        void mo197682a(int i, String str, String str2);

        /* renamed from: a */
        void mo197683a(String str, String str2);

        /* renamed from: a */
        void mo197684a(boolean z);

        /* renamed from: b */
        boolean mo197685b();

        /* renamed from: c */
        boolean mo197686c();
    }

    /* renamed from: a */
    private final int m226345a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? R.string.Lark_Legacy_PickerConfirmWithCount : R.string.Lark_Legacy_PickerSendEnsure : R.string.Lark_Legacy_PickerUploadWithCount : R.string.Lark_Legacy_PickerSendWithCount;
    }

    /* renamed from: b */
    private final int m226346b(int i) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin$Companion;", "", "()V", "TAG", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin$getView$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.a$d */
    public static final class C58390d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LargeBottomToolPlugin f143675a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58390d(LargeBottomToolPlugin aVar) {
            this.f143675a = aVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            LargeComponent.LargeToolContext<SelectablePhoto> bVar;
            SelectablePhoto a;
            if (!(!this.f143675a.f143666c.mo197681a().isEmpty() || (bVar = this.f143675a.f143664a) == null || (a = bVar.mo199666a()) == null)) {
                this.f143675a.f143667d.mo197700a(a, true, a.mo199606h());
            }
            this.f143675a.f143668e.mo197678a();
        }
    }

    /* renamed from: a */
    public void mo197639b(LargeComponent.LargeToolContext<SelectablePhoto> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f143664a = bVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197633a(TransationData dVar) {
        LKUICheckBox lKUICheckBox = this.f143670h;
        if (lKUICheckBox != null) {
            lKUICheckBox.setChecked(this.f143666c.mo197686c());
        }
    }

    /* renamed from: b */
    private final boolean m226347b(SelectablePhoto fVar) {
        if (!C58612c.m227290a().mo102854b("messenger.send_video.original") && fVar.mo199606h()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/photo_picker_new/large/LargeBottomToolPlugin$onBind$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.a$e */
    public static final class C58391e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ LargeBottomToolPlugin f143676a;

        /* renamed from: b */
        final /* synthetic */ SelectablePhoto f143677b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String b = this.f143677b.mo199595b();
            if (b == null) {
                Log.m165383e("PP_LargeBottomToolPlugin", "path is null when edit data : " + this.f143677b);
                return;
            }
            this.f143676a.f143666c.mo197682a(2, b, C57881t.m224606E(this.f143676a.f143665b) + System.currentTimeMillis() + ".png");
        }

        C58391e(LargeBottomToolPlugin aVar, SelectablePhoto fVar) {
            this.f143676a = aVar;
            this.f143677b = fVar;
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public View mo197631a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_new_large_bottom_tool, viewGroup, false);
        this.f143669g = (RelativeLayout) inflate.findViewById(R.id.origin_zone);
        this.f143670h = (LKUICheckBox) inflate.findViewById(R.id.cb_original_photo);
        this.f143671i = (TextView) inflate.findViewById(R.id.btn_photo_send);
        this.f143672j = (TextView) inflate.findViewById(R.id.btn_photo_edit);
        LKUICheckBox lKUICheckBox = this.f143670h;
        if (lKUICheckBox != null) {
            lKUICheckBox.setOnCheckedChangeListener(new C58389c(this));
        }
        TextView textView = this.f143671i;
        if (textView != null) {
            textView.setOnClickListener(new C58390d(this));
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        return inflate;
    }

    /* renamed from: a */
    public void mo197635a(SelectablePhoto fVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        RelativeLayout relativeLayout = this.f143669g;
        int i2 = 0;
        if (relativeLayout != null) {
            if (!this.f143666c.mo197685b() || !m226347b(fVar)) {
                i = 4;
            } else {
                i = 0;
            }
            relativeLayout.setVisibility(i);
        }
        LKUICheckBox lKUICheckBox = this.f143670h;
        if (lKUICheckBox != null) {
            lKUICheckBox.setChecked(this.f143666c.mo197686c());
        }
        TextView textView = this.f143672j;
        if (textView != null) {
            if (fVar.mo199606h()) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        TextView textView2 = this.f143672j;
        if (textView2 != null) {
            textView2.setOnClickListener(new C58391e(this, fVar));
        }
        int size = this.f143666c.mo197681a().size();
        if (size > 0) {
            TextView textView3 = this.f143671i;
            if (textView3 != null) {
                textView3.setText(UIHelper.mustacheFormat(m226345a(this.f143673k), "count", String.valueOf(size)));
                return;
            }
            return;
        }
        TextView textView4 = this.f143671i;
        if (textView4 != null) {
            textView4.setText(UIHelper.mustacheFormat(m226346b(this.f143673k), "count", String.valueOf(size)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.b.a$c */
    static final class C58389c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ LargeBottomToolPlugin f143674a;

        C58389c(LargeBottomToolPlugin aVar) {
            this.f143674a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f143674a.f143666c.mo197684a(z);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public boolean mo197638a(int i, int i2, Intent intent) {
        String str;
        SelectablePhoto a;
        Integer a2;
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i != 2 || i2 != -1) {
            return false;
        }
        String stringExtra = intent.getStringExtra("key_result_path");
        ISupport bVar = this.f143666c;
        LargeComponent.LargeToolContext<SelectablePhoto> bVar2 = this.f143664a;
        if (bVar2 == null || (a = bVar2.mo199666a()) == null || (a2 = a.mo199589a()) == null || (str = String.valueOf(a2.intValue())) == null) {
            str = "";
        }
        if (stringExtra == null) {
            Intrinsics.throwNpe();
        }
        bVar.mo197683a(str, stringExtra);
        return true;
    }

    public LargeBottomToolPlugin(Context context, int i, ISupport bVar, IPhotoSelectedChangedListener cVar, IOnSendClickListener bVar2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "support");
        Intrinsics.checkParameterIsNotNull(cVar, "selectedChangedListener");
        Intrinsics.checkParameterIsNotNull(bVar2, "sendListener");
        this.f143665b = context;
        this.f143673k = i;
        this.f143666c = bVar;
        this.f143667d = cVar;
        this.f143668e = bVar2;
    }
}
