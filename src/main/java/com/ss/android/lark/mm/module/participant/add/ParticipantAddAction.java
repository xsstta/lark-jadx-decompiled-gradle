package com.ss.android.lark.mm.module.participant.add;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.share.invite.BaseAction;
import com.ss.android.lark.mm.utils.ResString;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/add/ParticipantAddAction;", "Lcom/ss/android/lark/mm/module/share/invite/BaseAction;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ParticipantAddAction extends BaseAction {

    /* renamed from: a */
    private HashMap f117192a;

    @Override // com.ss.android.lark.mm.module.share.invite.BaseAction
    /* renamed from: a */
    public View mo163516a(int i) {
        if (this.f117192a == null) {
            this.f117192a = new HashMap();
        }
        View view = (View) this.f117192a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117192a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m184161a() {
        setDesc("");
        setAction(ResString.f118656a.mo165504a(R.string.MMWeb_G_Done));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ParticipantAddAction(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ParticipantAddAction(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ParticipantAddAction(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParticipantAddAction(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m184161a();
    }
}
