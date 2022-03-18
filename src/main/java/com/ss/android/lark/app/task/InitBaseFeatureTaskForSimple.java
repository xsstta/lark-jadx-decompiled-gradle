package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.p1999b.C39125b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/app/task/InitBaseFeatureTaskForSimple;", "Lcom/larksuite/framework/launch/task/AbstractLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "initLKPFeature", "initLKUI", "Companion", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public class InitBaseFeatureTaskForSimple extends AbstractLaunchTask<Object> {

    /* renamed from: a */
    public static final Companion f72567a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/app/task/InitBaseFeatureTaskForSimple$Companion;", "", "()V", "TOAST_MARGIN_BOTTOM_LKP", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m106128b(Context context) {
        DesktopUtil.m144297a(C37239a.m146648b().mo136951a("lark.desktop.mode.enable"));
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C39125b.m154428a(context);
        m106128b(context);
        m106129c(context);
    }

    /* renamed from: c */
    private final void m106129c(Context context) {
        DialogC25637f.m91762a(DesktopUtil.m144301a(context));
        if (DesktopUtil.m144301a(context)) {
            LKUIToast.setBottomMargin(UIHelper.dp2px((float) SmEvents.EVENT_NE_RR));
        }
    }
}
