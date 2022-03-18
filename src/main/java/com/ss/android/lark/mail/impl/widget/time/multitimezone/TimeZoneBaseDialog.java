package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.content.Context;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneBaseDialog;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", ShareHitPoint.f121868c, "", "timezoneId", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "mPresenter", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter;", "getMPresenter", "()Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter;", "mSelectTimeZoneChangeListener", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ISelectTimeZoneChangeListener;", "Lkotlin/collections/ArrayList;", "getMSelectTimeZoneChangeListener", "()Ljava/util/ArrayList;", "setMSelectTimeZoneChangeListener", "(Ljava/util/ArrayList;)V", "addSelectTimeZoneChangeListener", "", "changeListener", "dismiss", "hitPoint", "setShowSelectedToast", "isShow", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.h */
public class TimeZoneBaseDialog extends DragShrinkDialog {

    /* renamed from: a */
    private final TimeZoneSelectorPresenter f112035a;

    /* renamed from: b */
    private ArrayList<AbstractC44117f> f112036b = new ArrayList<>();

    /* renamed from: a */
    private final void m174871a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final TimeZoneSelectorPresenter mo157040f() {
        return this.f112035a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ArrayList<AbstractC44117f> mo157041g() {
        return this.f112036b;
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        super.dismiss();
        this.f112036b.clear();
        this.f112035a.destroy();
    }

    /* renamed from: a */
    public final void mo157039a(AbstractC44117f fVar) {
        if (fVar != null) {
            this.f112036b.add(fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneBaseDialog(Context context, int i, String str, String str2) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str2, "timezoneId");
        mo156938a(R.layout.mail_dialog_timezone_selector);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.rootView);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView");
        TimeZoneSelectorView mVar = new TimeZoneSelectorView(frameLayout);
        TimeZoneSelectorModel kVar = new TimeZoneSelectorModel(str2);
        kVar.mo157054b(str);
        TimeZoneSelectorPresenter lVar = new TimeZoneSelectorPresenter(mVar, kVar);
        this.f112035a = lVar;
        lVar.create();
        m174871a(str);
    }
}
