package com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.viewholder;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.component.ui.button.LKUICheckBox2;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/viewholder/CommonOptionVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;)V", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "resourceFormUIData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "getRootView", "()Landroid/view/View;", "textChangedListener", "Landroid/text/TextWatcher;", "getTextChangedListener", "()Landroid/text/TextWatcher;", "bindData", "", "updateImage", "", "bindImageView", "imageUrl", "", "bindOtherData", "updateSelectState", "customizationOption", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationOption;", "formType", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData$FormType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.a */
public final class CommonOptionVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public ResourceFormUIData f81993a;

    /* renamed from: b */
    private final TextWatcher f81994b = new C32078e(this);

    /* renamed from: c */
    private final View f81995c;

    /* renamed from: d */
    private final IOptionListener f81996d;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.a$c */
    public static final class View$OnClickListenerC32076c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC32076c f82002a = new View$OnClickListenerC32076c();

        View$OnClickListenerC32076c() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    public final IOptionListener mo117046a() {
        return this.f81996d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/viewholder/CommonOptionVH$textChangedListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.a$e */
    public static final class C32078e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CommonOptionVH f82007a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32078e(CommonOptionVH aVar) {
            this.f82007a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            SchemaExtraData.CustomizationData e;
            String str2;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            ResourceFormUIData resourceFormUIData = this.f82007a.f81993a;
            if (resourceFormUIData != null && (e = resourceFormUIData.mo117126e()) != null && (str2 = e.index_key) != null) {
                ResourceFormUIData resourceFormUIData2 = this.f82007a.f81993a;
                if (resourceFormUIData2 != null) {
                    resourceFormUIData2.mo117121b(str);
                }
                this.f82007a.mo117046a().mo117075c(str2, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.a$b */
    public static final class View$OnClickListenerC32075b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f82001a;

        View$OnClickListenerC32075b(String str) {
            this.f82001a = str;
        }

        public final void onClick(View view) {
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            C58630d.m227373a(view.getContext(), CollectionsKt.listOf(this.f82001a), 0, view, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.a$a */
    public static final class View$OnClickListenerC32074a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonOptionVH f81997a;

        /* renamed from: b */
        final /* synthetic */ ResourceFormUIData f81998b;

        /* renamed from: c */
        final /* synthetic */ String f81999c;

        /* renamed from: d */
        final /* synthetic */ SchemaExtraData.CustomizationOption f82000d;

        View$OnClickListenerC32074a(CommonOptionVH aVar, ResourceFormUIData resourceFormUIData, String str, SchemaExtraData.CustomizationOption customizationOption) {
            this.f81997a = aVar;
            this.f81998b = resourceFormUIData;
            this.f81999c = str;
            this.f82000d = customizationOption;
        }

        public final void onClick(View view) {
            String str = "";
            if (this.f81998b.mo117128f() == ResourceFormUIData.FormType.SingleOption) {
                IOptionListener a = this.f81997a.mo117046a();
                String str2 = this.f81999c;
                Intrinsics.checkExpressionValueIsNotNull(str2, "customizationKey");
                String str3 = this.f82000d.option_key;
                if (str3 != null) {
                    str = str3;
                }
                a.mo117074b(str2, str);
                return;
            }
            IOptionListener a2 = this.f81997a.mo117046a();
            String str4 = this.f81999c;
            Intrinsics.checkExpressionValueIsNotNull(str4, "customizationKey");
            String str5 = this.f82000d.option_key;
            if (str5 != null) {
                str = str5;
            }
            a2.mo117073a(str4, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.a$d */
    public static final class View$OnClickListenerC32077d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonOptionVH f82003a;

        /* renamed from: b */
        final /* synthetic */ ResourceFormUIData f82004b;

        /* renamed from: c */
        final /* synthetic */ String f82005c;

        /* renamed from: d */
        final /* synthetic */ SchemaExtraData.CustomizationOption f82006d;

        View$OnClickListenerC32077d(CommonOptionVH aVar, ResourceFormUIData resourceFormUIData, String str, SchemaExtraData.CustomizationOption customizationOption) {
            this.f82003a = aVar;
            this.f82004b = resourceFormUIData;
            this.f82005c = str;
            this.f82006d = customizationOption;
        }

        public final void onClick(View view) {
            String str = "";
            if (this.f82004b.mo117128f() == ResourceFormUIData.FormType.SingleOption) {
                IOptionListener a = this.f82003a.mo117046a();
                String str2 = this.f82005c;
                Intrinsics.checkExpressionValueIsNotNull(str2, "customizationKey");
                String str3 = this.f82006d.option_key;
                if (str3 != null) {
                    str = str3;
                }
                a.mo117074b(str2, str);
                return;
            }
            IOptionListener a2 = this.f82003a.mo117046a();
            String str4 = this.f82005c;
            Intrinsics.checkExpressionValueIsNotNull(str4, "customizationKey");
            String str5 = this.f82006d.option_key;
            if (str5 != null) {
                str = str5;
            }
            a2.mo117073a(str4, str);
        }
    }

    /* renamed from: a */
    private final void m122004a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ImageView imageView = (ImageView) this.f81995c.findViewById(R.id.optionExtraIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.optionExtraIv");
            imageView.setVisibility(0);
            C30022a.f74882a.imageDependency().mo108245a(this.f81995c.getContext(), str, (ImageView) this.f81995c.findViewById(R.id.optionExtraIv), 50, 50);
            ((ImageView) this.f81995c.findViewById(R.id.optionExtraIv)).setOnClickListener(new View$OnClickListenerC32075b(str));
            return;
        }
        ImageView imageView2 = (ImageView) this.f81995c.findViewById(R.id.optionExtraIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.optionExtraIv");
        imageView2.setVisibility(8);
        ((ImageView) this.f81995c.findViewById(R.id.optionExtraIv)).setOnClickListener(View$OnClickListenerC32076c.f82002a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonOptionVH(View view, IOptionListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f81995c = view;
        this.f81996d = aVar;
    }

    /* renamed from: a */
    private final void m122002a(SchemaExtraData.CustomizationOption customizationOption, ResourceFormUIData.FormType formType) {
        int i;
        if (formType == ResourceFormUIData.FormType.MultipleOption) {
            if (Intrinsics.areEqual((Object) customizationOption.is_selected, (Object) true)) {
                i = R.drawable.calendar_svg_icon_mtroom_schedule_multiple;
            } else {
                i = R.drawable.calendar_svg_icon_schedule_multiple_empty;
            }
            ((ImageView) this.f81995c.findViewById(R.id.multipleCheckBoxBt)).setImageDrawable(C32634ae.m125184d(i));
            ImageView imageView = (ImageView) this.f81995c.findViewById(R.id.multipleCheckBoxBt);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.multipleCheckBoxBt");
            imageView.setVisibility(0);
            LKUICheckBox2 lKUICheckBox2 = (LKUICheckBox2) this.f81995c.findViewById(R.id.singleRadioBt);
            Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox2, "rootView.singleRadioBt");
            lKUICheckBox2.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) this.f81995c.findViewById(R.id.multipleCheckBoxBt);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.multipleCheckBoxBt");
        imageView2.setVisibility(8);
        LKUICheckBox2 lKUICheckBox22 = (LKUICheckBox2) this.f81995c.findViewById(R.id.singleRadioBt);
        Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox22, "rootView.singleRadioBt");
        lKUICheckBox22.setVisibility(0);
        LKUICheckBox2 lKUICheckBox23 = (LKUICheckBox2) this.f81995c.findViewById(R.id.singleRadioBt);
        Intrinsics.checkExpressionValueIsNotNull(lKUICheckBox23, "rootView.singleRadioBt");
        Boolean bool = customizationOption.is_selected;
        Intrinsics.checkExpressionValueIsNotNull(bool, "customizationOption.is_selected");
        lKUICheckBox23.setChecked(bool.booleanValue());
    }

    /* renamed from: b */
    private final void m122005b(ResourceFormUIData resourceFormUIData, boolean z) {
        this.f81993a = resourceFormUIData;
        SchemaExtraData.CustomizationOption g = resourceFormUIData.mo117129g();
        if (g != null) {
            String str = resourceFormUIData.mo117126e().index_key;
            m122002a(g, resourceFormUIData.mo117128f());
            TextView textView = (TextView) this.f81995c.findViewById(R.id.commonOptionLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.commonOptionLabel");
            textView.setText(C32634ae.m125182b(R.string.Calendar_Common_Others));
            ((EditText) this.f81995c.findViewById(R.id.otherOptionEditText)).clearFocus();
            ((EditText) this.f81995c.findViewById(R.id.otherOptionEditText)).removeTextChangedListener(this.f81994b);
            if (Intrinsics.areEqual((Object) g.is_selected, (Object) true)) {
                EditText editText = (EditText) this.f81995c.findViewById(R.id.otherOptionEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.otherOptionEditText");
                editText.setVisibility(0);
                EditText editText2 = (EditText) this.f81995c.findViewById(R.id.otherOptionEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText2, "rootView.otherOptionEditText");
                editText2.setHint(g.option_label);
                ((EditText) this.f81995c.findViewById(R.id.otherOptionEditText)).setText(resourceFormUIData.mo117120b());
                ((EditText) this.f81995c.findViewById(R.id.otherOptionEditText)).addTextChangedListener(this.f81994b);
            } else {
                EditText editText3 = (EditText) this.f81995c.findViewById(R.id.otherOptionEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText3, "rootView.otherOptionEditText");
                editText3.setVisibility(8);
            }
            if (z) {
                m122004a(g.option_image_url);
            }
            this.f81995c.setOnClickListener(new View$OnClickListenerC32077d(this, resourceFormUIData, str, g));
        }
    }

    /* renamed from: a */
    public final void mo117047a(ResourceFormUIData resourceFormUIData, boolean z) {
        Intrinsics.checkParameterIsNotNull(resourceFormUIData, "resourceFormUIData");
        SchemaExtraData.CustomizationOption g = resourceFormUIData.mo117129g();
        if (g != null) {
            String str = resourceFormUIData.mo117126e().index_key;
            if (Intrinsics.areEqual((Object) g.is_others, (Object) true)) {
                m122005b(resourceFormUIData, z);
                return;
            }
            EditText editText = (EditText) this.f81995c.findViewById(R.id.otherOptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.otherOptionEditText");
            editText.setVisibility(8);
            m122002a(g, resourceFormUIData.mo117128f());
            TextView textView = (TextView) this.f81995c.findViewById(R.id.commonOptionLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.commonOptionLabel");
            textView.setText(g.option_label);
            if (z) {
                m122004a(g.option_image_url);
            }
            this.f81995c.setOnClickListener(new View$OnClickListenerC32074a(this, resourceFormUIData, str, g));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m122003a(CommonOptionVH aVar, ResourceFormUIData resourceFormUIData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        aVar.mo117047a(resourceFormUIData, z);
    }
}
