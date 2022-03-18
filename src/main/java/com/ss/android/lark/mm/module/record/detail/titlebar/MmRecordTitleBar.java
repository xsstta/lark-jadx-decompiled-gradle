package com.ss.android.lark.mm.module.record.detail.titlebar;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.MmDateUtil;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nJ\u001a\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0019¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getTitle", "", "setIsEditable", "", "isEditable", "", "setOnBackClickListener", "onBack", "Lkotlin/Function0;", "setTime", "time", "", "setTitle", "title", "setTitleEditor", "onEditorCallback", "Lkotlin/Function1;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmRecordTitleBar extends ConstraintLayout {

    /* renamed from: a */
    private HashMap f118115a;

    public MmRecordTitleBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmRecordTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo164744a(int i) {
        if (this.f118115a == null) {
            this.f118115a = new HashMap();
        }
        View view = (View) this.f118115a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118115a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getTitle() {
        TextView textView = (TextView) mo164744a(R.id.tvTopic);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTopic");
        return textView.getText().toString();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBar$a */
    public static final class C46914a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function0 $onBack;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46914a(Function0 function0) {
            super(1);
            this.$onBack = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmRecordTitleBar", "click back");
            this.$onBack.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBar$b */
    public static final class C46915b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function1 $onEditorCallback;
        final /* synthetic */ MmRecordTitleBar this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46915b(MmRecordTitleBar mmRecordTitleBar, Function1 function1) {
            super(1);
            this.this$0 = mmRecordTitleBar;
            this.$onEditorCallback = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmRecordTitleBar", "edit title");
            if (C47098d.m186535b(this.this$0.getContext())) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TextView textView = (TextView) this.this$0.mo164744a(R.id.tvTopic);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvTopic");
                objectRef.element = (T) textView.getText().toString();
                Context context = this.this$0.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                TextView textView2 = (TextView) this.this$0.mo164744a(R.id.tvTopic);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "tvTopic");
                CharSequence text = textView2.getText();
                Intrinsics.checkExpressionValueIsNotNull(text, "tvTopic.text");
                ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) new UDInputDialogBuilder(context).title(R.string.MMWeb_G_RenameRecording)).titleBold(true)).message(" ")).mo90901a(text).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_Rename, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBar.C46915b.DialogInterface$OnClickListenerC469161 */

                    /* renamed from: a */
                    final /* synthetic */ C46915b f118116a;

                    {
                        this.f118116a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f118116a.$onEditorCallback.invoke(objectRef.element);
                    }
                })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, (DialogInterface.OnClickListener) null)).mo90900a(new UDInputDialogBuilder.OnTextChangedListener() {
                    /* class com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBar.C46915b.C469172 */

                    @Override // com.larksuite.component.universe_design.dialog.UDInputDialogBuilder.OnTextChangedListener
                    /* renamed from: a */
                    public void mo89293a(CharSequence charSequence) {
                        objectRef.element = (T) String.valueOf(charSequence);
                    }
                }).show();
            }
        }
    }

    public final void setOnBackClickListener(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onBack");
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo164744a(R.id.ivBack);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivBack");
        C47110e.m186573a(appCompatImageView, new C46914a(function0));
    }

    public final void setTime(long j) {
        TextView textView = (TextView) mo164744a(R.id.recordTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "recordTimeTv");
        textView.setText(MmDateUtil.m186537a(j));
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        TextView textView = (TextView) mo164744a(R.id.tvTopic);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTopic");
        textView.setText(str);
    }

    public final void setTitleEditor(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onEditorCallback");
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo164744a(R.id.ivEdit);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivEdit");
        C47110e.m186573a(appCompatImageView, new C46915b(this, function1));
    }

    public final void setIsEditable(boolean z) {
        if (z) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo164744a(R.id.ivEdit);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivEdit");
            appCompatImageView.setVisibility(0);
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo164744a(R.id.ivEdit);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivEdit");
        appCompatImageView2.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.mm_layout_record_title_bar, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmRecordTitleBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
