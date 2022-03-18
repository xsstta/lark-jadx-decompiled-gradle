package com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.viewholder;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.listener.IOptionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/viewholder/InputCustomizationVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;)V", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/listener/IOptionListener;", "resourceFormUIData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "getResourceFormUIData", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "setResourceFormUIData", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;)V", "textChangedListener", "Landroid/text/TextWatcher;", "getTextChangedListener", "()Landroid/text/TextWatcher;", "getView", "()Landroid/view/View;", "bindData", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.b */
public final class InputCustomizationVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private ResourceFormUIData f82008a;

    /* renamed from: b */
    private final TextWatcher f82009b;

    /* renamed from: c */
    private final View f82010c;

    /* renamed from: d */
    private final IOptionListener f82011d;

    /* renamed from: a */
    public final ResourceFormUIData mo117055a() {
        return this.f82008a;
    }

    /* renamed from: b */
    public final IOptionListener mo117057b() {
        return this.f82011d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/viewholder/InputCustomizationVH$textChangedListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.b$a */
    public static final class C32079a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ InputCustomizationVH f82012a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32079a(InputCustomizationVH bVar) {
            this.f82012a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            SchemaExtraData.CustomizationData e;
            String str2;
            boolean z;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            ResourceFormUIData a = this.f82012a.mo117055a();
            if (a != null && (e = a.mo117126e()) != null && (str2 = e.index_key) != null) {
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str2 = null;
                }
                if (str2 != null) {
                    ResourceFormUIData a2 = this.f82012a.mo117055a();
                    if (a2 != null) {
                        a2.mo117118a(str);
                    }
                    this.f82012a.mo117057b().mo117076d(str2, str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo117056a(ResourceFormUIData resourceFormUIData) {
        Intrinsics.checkParameterIsNotNull(resourceFormUIData, "resourceFormUIData");
        this.f82008a = resourceFormUIData;
        SchemaExtraData.CustomizationData e = resourceFormUIData.mo117126e();
        ((EditText) this.f82010c.findViewById(R.id.inputEditText)).clearFocus();
        TextView textView = (TextView) this.f82010c.findViewById(R.id.inputTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.inputTv");
        textView.setText(MeetingRoomFormHelper.f82028a.mo117084a(e.label, e.is_required));
        EditText editText = (EditText) this.f82010c.findViewById(R.id.inputEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "view.inputEditText");
        editText.setHint(e.place_holder);
        ((EditText) this.f82010c.findViewById(R.id.inputEditText)).setText(resourceFormUIData.mo117117a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputCustomizationVH(View view, IOptionListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f82010c = view;
        this.f82011d = aVar;
        C32079a aVar2 = new C32079a(this);
        this.f82009b = aVar2;
        ((EditText) view.findViewById(R.id.inputEditText)).addTextChangedListener(aVar2);
    }
}
