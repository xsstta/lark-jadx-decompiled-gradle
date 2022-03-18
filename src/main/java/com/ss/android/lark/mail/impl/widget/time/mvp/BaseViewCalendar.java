package com.ss.android.lark.mail.impl.widget.time.mvp;

import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender.IViewAction;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender.IViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000b\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0010\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013R\u0010\u0010\u0007\u001a\u00028\u0000X.¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00028\u0001X.¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/mvp/BaseViewCalendar;", "ViewData", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;", "ViewAction", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;", "()V", "vi", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;", "vo", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "create", "", "destroy", "getVI", "()Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;", "getVO", "()Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "setDependency", "(Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;)V", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.a.d */
public class BaseViewCalendar<ViewData extends IViewCalender.IViewData, ViewAction extends IViewCalender.IViewAction> implements IViewCalender<ViewData, ViewAction> {

    /* renamed from: a */
    private ViewData f111886a;

    /* renamed from: b */
    private ViewAction f111887b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: m */
    public final ViewData mo156856m() {
        ViewData viewdata = this.f111886a;
        if (viewdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vi");
        }
        return viewdata;
    }

    /* renamed from: n */
    public final ViewAction mo156857n() {
        ViewAction viewaction = this.f111887b;
        if (viewaction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vo");
        }
        return viewaction;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender
    /* renamed from: a */
    public void mo156855a(ViewData viewdata, ViewAction viewaction) {
        Intrinsics.checkParameterIsNotNull(viewdata, "vi");
        Intrinsics.checkParameterIsNotNull(viewaction, "vo");
        this.f111886a = viewdata;
        this.f111887b = viewaction;
    }
}
