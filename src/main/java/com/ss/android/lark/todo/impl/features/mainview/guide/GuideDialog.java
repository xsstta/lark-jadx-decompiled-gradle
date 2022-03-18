package com.ss.android.lark.todo.impl.features.mainview.guide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/guide/GuideDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "createdTodoGuid", "", "(Landroid/content/Context;Ljava/lang/String;)V", "uiHandler", "Landroid/os/Handler;", "dismissDialog", "", "delayMillis", "", "initDialogView", "initGuideText", "initListener", "setDialogHeight", "yDp", "showGuideDialog", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.a.a */
public final class GuideDialog extends BaseDialog {

    /* renamed from: a */
    public static final Companion f140220a = new Companion(null);

    /* renamed from: b */
    private Handler f140221b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final String f140222c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/guide/GuideDialog$Companion;", "", "()V", "TOAST_HEIGHT", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.a.a$b */
    public static final class RunnableC56794b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GuideDialog f140223a;

        RunnableC56794b(GuideDialog aVar) {
            this.f140223a = aVar;
        }

        public final void run() {
            try {
                this.f140223a.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private final void m220703b() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.OperationToastWindow);
        }
        setContentView(R.layout.todo_guide_toast);
        setCanceledOnTouchOutside(true);
        m220704b(162);
    }

    /* renamed from: d */
    private final void m220706d() {
        ((LinearLayout) findViewById(R.id.llEnterTodo)).setOnClickListener(new View$OnClickListenerC56795c(this));
    }

    /* renamed from: a */
    public final void mo193098a() {
        show();
        m220702a(7000);
    }

    /* renamed from: c */
    private final void m220705c() {
        int i;
        boolean a = TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency().mo145416a();
        TextView textView = (TextView) findViewById(R.id.tvTodoGuide);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTodoGuide");
        ResUtil eVar = ResUtil.f139261a;
        if (a) {
            i = R.string.Todo_Chat_ViewTaskGuide;
        } else {
            i = R.string.Todo_Chat_ViewTaskGuideMore;
        }
        textView.setText(eVar.mo191781c(i));
    }

    /* renamed from: a */
    private final void m220702a(int i) {
        this.f140221b.postDelayed(new RunnableC56794b(this), (long) i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.a.a$c */
    public static final class View$OnClickListenerC56795c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GuideDialog f140224a;

        View$OnClickListenerC56795c(GuideDialog aVar) {
            this.f140224a = aVar;
        }

        public final void onClick(View view) {
            IMainModuleDependency mainModuleDependency = TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency();
            Context context = this.f140224a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            mainModuleDependency.mo145417b(context);
        }
    }

    /* renamed from: b */
    private final void m220704b(int i) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Intrinsics.checkExpressionValueIsNotNull(attributes, "window.attributes");
            attributes.y = UIUtils.dp2px(getContext(), (float) i);
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GuideDialog(Context context, String str) {
        super(context, R.style.TodoGuideToast);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "createdTodoGuid");
        this.f140222c = str;
        m220703b();
        m220705c();
        m220706d();
    }
}
