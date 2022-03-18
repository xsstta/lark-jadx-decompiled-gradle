package com.ss.android.lark.mm.module.share.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J<\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/share/setting/SettingSwitch;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "initAndListen", "allowLinkShare", "", "canModify", "isOpen", "isInternal", "isViewOnly", "onChange", "Lkotlin/Function0;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingSwitch extends RelativeLayout {

    /* renamed from: a */
    private HashMap f118361a;

    /* renamed from: a */
    public View mo165237a(int i) {
        if (this.f118361a == null) {
            this.f118361a = new HashMap();
        }
        View view = (View) this.f118361a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118361a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186154a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_share_setting_switch, this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.SettingSwitch$a */
    public static final class C47028a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function0 $onChange;
        final /* synthetic */ SettingSwitch this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47028a(SettingSwitch settingSwitch, Function0 function0) {
            super(1);
            this.this$0 = settingSwitch;
            this.$onChange = function0;
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
            SettingSwitch settingSwitch = this.this$0;
            settingSwitch.setSelected(!settingSwitch.isSelected());
            C45855f.m181664c("SettingSwitch", "click switch button, isSelected :" + this.this$0.isSelected());
            this.$onChange.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingSwitch(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingSwitch(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186154a();
    }

    /* renamed from: a */
    public final void mo165238a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Unit> function0) {
        String str;
        String str2;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(function0, "onChange");
        BoldTextView boldTextView = (BoldTextView) mo165237a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvDesc");
        if (!z) {
            str = ResString.f118656a.mo165504a(R.string.MMWeb_G_NoLinkSharing);
        } else {
            if (!z3) {
                str2 = ResString.f118656a.mo165504a(R.string.MMWeb_G_InvitedCanView);
            } else if (z4) {
                ResString sVar = ResString.f118656a;
                if (z5) {
                    i2 = R.string.MMWeb_G_InternalCanViewShare;
                } else {
                    i2 = R.string.MMWeb_G_InternalCanEditShare;
                }
                str2 = sVar.mo165504a(i2);
            } else {
                ResString sVar2 = ResString.f118656a;
                if (z5) {
                    i = R.string.MMWeb_G_AnyoneCanViewShare;
                } else {
                    i = R.string.MMWeb_G_AnyoneCanEditShare;
                }
                str2 = sVar2.mo165504a(i);
            }
            str = str2;
        }
        boldTextView.setText(str);
        if (!z || !z2) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo165237a(R.id.ivSwitch);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivSwitch");
            appCompatImageView.setVisibility(8);
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo165237a(R.id.ivSwitch);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivSwitch");
        appCompatImageView2.setVisibility(0);
        setSelected(z3);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo165237a(R.id.ivSwitch);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "ivSwitch");
        C47110e.m186573a(appCompatImageView3, new C47028a(this, function0));
    }
}
