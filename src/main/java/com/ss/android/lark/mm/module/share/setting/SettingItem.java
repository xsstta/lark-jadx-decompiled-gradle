package com.ss.android.lark.mm.module.share.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014J\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/share/setting/SettingItem;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "initAndListen", "isFirstSelected", "", "isEnabled", "onChange", "Lkotlin/Function0;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingItem extends LinearLayout {

    /* renamed from: a */
    private HashMap f118355a;

    /* renamed from: a */
    public View mo165230a(int i) {
        if (this.f118355a == null) {
            this.f118355a = new HashMap();
        }
        View view = (View) this.f118355a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118355a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo165232a() {
        SettingChoice settingChoice = (SettingChoice) mo165230a(R.id.choice1);
        Intrinsics.checkExpressionValueIsNotNull(settingChoice, "choice1");
        return settingChoice.isSelected();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingItem(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.SettingItem$a */
    public static final class View$OnClickListenerC47023a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItem f118356a;

        /* renamed from: b */
        final /* synthetic */ Function0 f118357b;

        View$OnClickListenerC47023a(SettingItem settingItem, Function0 function0) {
            this.f118356a = settingItem;
            this.f118357b = function0;
        }

        public final void onClick(View view) {
            SettingChoice settingChoice = (SettingChoice) this.f118356a.mo165230a(R.id.choice2);
            Intrinsics.checkExpressionValueIsNotNull(settingChoice, "choice2");
            settingChoice.setSelected(false);
            SettingChoice settingChoice2 = (SettingChoice) this.f118356a.mo165230a(R.id.choice1);
            Intrinsics.checkExpressionValueIsNotNull(settingChoice2, "choice1");
            settingChoice2.setSelected(true);
            this.f118357b.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.SettingItem$b */
    public static final class View$OnClickListenerC47024b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItem f118358a;

        /* renamed from: b */
        final /* synthetic */ Function0 f118359b;

        View$OnClickListenerC47024b(SettingItem settingItem, Function0 function0) {
            this.f118358a = settingItem;
            this.f118359b = function0;
        }

        public final void onClick(View view) {
            SettingChoice settingChoice = (SettingChoice) this.f118358a.mo165230a(R.id.choice1);
            Intrinsics.checkExpressionValueIsNotNull(settingChoice, "choice1");
            settingChoice.setSelected(false);
            SettingChoice settingChoice2 = (SettingChoice) this.f118358a.mo165230a(R.id.choice2);
            Intrinsics.checkExpressionValueIsNotNull(settingChoice2, "choice2");
            settingChoice2.setSelected(true);
            this.f118359b.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingItem(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186147a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_share_setting_item, this);
        setOrientation(1);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.share_setting_choice1, R.attr.share_setting_choice2, R.attr.share_setting_title}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…tr, defStyleRes\n        )");
        String string = obtainStyledAttributes.getString(2);
        BoldTextView boldTextView = (BoldTextView) mo165230a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTitle");
        boldTextView.setText(string);
        String string2 = obtainStyledAttributes.getString(0);
        if (string2 != null) {
            Intrinsics.checkExpressionValueIsNotNull(string2, "it");
            ((SettingChoice) mo165230a(R.id.choice1)).setTitle(string2);
        }
        String string3 = obtainStyledAttributes.getString(1);
        if (string3 != null) {
            Intrinsics.checkExpressionValueIsNotNull(string3, "it");
            ((SettingChoice) mo165230a(R.id.choice2)).setTitle(string3);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo165231a(boolean z, boolean z2, Function0<Unit> function0) {
        int i;
        Intrinsics.checkParameterIsNotNull(function0, "onChange");
        TextView textView = (TextView) mo165230a(R.id.tvSubTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvSubTitle");
        if (z2) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        ((SettingChoice) mo165230a(R.id.choice1)).setOnClickListener(null);
        SettingChoice settingChoice = (SettingChoice) mo165230a(R.id.choice1);
        Intrinsics.checkExpressionValueIsNotNull(settingChoice, "choice1");
        settingChoice.setSelected(z);
        SettingChoice settingChoice2 = (SettingChoice) mo165230a(R.id.choice1);
        Intrinsics.checkExpressionValueIsNotNull(settingChoice2, "choice1");
        settingChoice2.setEnabled(z2);
        if (z2) {
            ((SettingChoice) mo165230a(R.id.choice1)).setOnClickListener(new View$OnClickListenerC47023a(this, function0));
        }
        ((SettingChoice) mo165230a(R.id.choice2)).setOnClickListener(null);
        SettingChoice settingChoice3 = (SettingChoice) mo165230a(R.id.choice2);
        Intrinsics.checkExpressionValueIsNotNull(settingChoice3, "choice2");
        settingChoice3.setSelected(!z);
        SettingChoice settingChoice4 = (SettingChoice) mo165230a(R.id.choice2);
        Intrinsics.checkExpressionValueIsNotNull(settingChoice4, "choice2");
        settingChoice4.setEnabled(z2);
        if (z2) {
            ((SettingChoice) mo165230a(R.id.choice2)).setOnClickListener(new View$OnClickListenerC47024b(this, function0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186147a(attributeSet, i, i2);
    }
}
