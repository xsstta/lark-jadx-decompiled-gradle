package com.ss.android.lark.mm.module.record.detail.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.record.model.WaveData;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/WaveView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/WaveData;", "init", "setEnabled", "enabled", "", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WaveView extends RelativeLayout {

    /* renamed from: a */
    public static final int f118152a;

    /* renamed from: b */
    public static final int f118153b;

    /* renamed from: c */
    public static final int f118154c;

    /* renamed from: d */
    public static final int f118155d;

    /* renamed from: e */
    public static final float f118156e;

    /* renamed from: f */
    public static final Companion f118157f = new Companion(null);

    /* renamed from: g */
    private HashMap f118158g;

    /* renamed from: a */
    public View mo164786a(int i) {
        if (this.f118158g == null) {
            this.f118158g = new HashMap();
        }
        View view = (View) this.f118158g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118158g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/WaveView$Companion;", "", "()V", "HEIGHT_UNIT", "", "getHEIGHT_UNIT", "()F", "MAX_HEIGHT", "", "getMAX_HEIGHT", "()I", "MIN_HEIGHT", "getMIN_HEIGHT", "PADDING", "getPADDING", "WIDTH", "getWIDTH", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.WaveView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m185864a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_record_wave, this);
        int i = f118152a;
        setPadding(i, 0, i, 0);
    }

    static {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        f118152a = UIUtils.dp2px(contextDepend.mo144557a(), 1.0f);
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend2 = a2.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend2, "MmDepend.impl().contextDepend");
        f118153b = UIUtils.dp2px(contextDepend2.mo144557a(), 2.0f);
        IMmDepend a3 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend3 = a3.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend3, "MmDepend.impl().contextDepend");
        int dp2px = UIUtils.dp2px(contextDepend3.mo144557a(), 2.0f);
        f118154c = dp2px;
        IMmDepend a4 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend4 = a4.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend4, "MmDepend.impl().contextDepend");
        int dp2px2 = UIUtils.dp2px(contextDepend4.mo144557a(), 60.0f);
        f118155d = dp2px2;
        f118156e = ((float) (dp2px2 - dp2px)) / 100.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaveView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        View a = mo164786a(R.id.volume);
        Intrinsics.checkExpressionValueIsNotNull(a, "volume");
        a.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo164787a(WaveData waveData) {
        Intrinsics.checkParameterIsNotNull(waveData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.width = f118153b;
        layoutParams.height = (int) (((float) f118154c) + (f118156e * ((float) waveData.getVolume())));
        layoutParams.topMargin = (f118155d - layoutParams.height) / 2;
        View a = mo164786a(R.id.volume);
        Intrinsics.checkExpressionValueIsNotNull(a, "volume");
        a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaveView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m185864a();
    }
}
