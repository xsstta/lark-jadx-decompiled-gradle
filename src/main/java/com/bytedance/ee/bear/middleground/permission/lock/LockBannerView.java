package com.bytedance.ee.bear.middleground.permission.lock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/lock/LockBannerView;", "Lcom/larksuite/component/universe_design/notice/UDNotice;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hide", "", "show", "tip", "", "canRecover", "", "clickListener", "Landroid/view/View$OnClickListener;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LockBannerView extends UDNotice {

    /* renamed from: e */
    private HashMap f26832e;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.lock.LockBannerView$a */
    public static final class View$OnClickListenerC9924a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9924a f26833a = new View$OnClickListenerC9924a();

        View$OnClickListenerC9924a() {
        }

        public final void onClick(View view) {
        }
    }

    @Override // com.larksuite.component.universe_design.notice.UDNotice
    /* renamed from: a */
    public View mo37766a(int i) {
        if (this.f26832e == null) {
            this.f26832e = new HashMap();
        }
        View view = (View) this.f26832e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26832e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo37767a() {
        setVisibility(8);
    }

    /* renamed from: b */
    public final void mo37769b() {
        setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LockBannerView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LockBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setIcon(R.drawable.ud_icon_lock_filled);
        String string = getContext().getString(R.string.CreationMobile_Wiki_Permission_Recover_Button);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…ermission_Recover_Button)");
        setTextButton(string);
        setTextButtonPosition(UDNotice.TextButtonPosition.AUTO);
    }

    /* renamed from: a */
    public final void mo37768a(String str, boolean z, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(str, "tip");
        setVisibility(0);
        setText(str);
        mo91034c(z);
        if (!z || onClickListener == null) {
            setTextButtonListener(View$OnClickListenerC9924a.f26833a);
        } else {
            setTextButtonListener(onClickListener);
        }
    }
}
