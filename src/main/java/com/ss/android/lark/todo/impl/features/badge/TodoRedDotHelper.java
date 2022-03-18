package com.ss.android.lark.todo.impl.features.badge;

import android.content.Context;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.badge.ITodoBadgeManager;
import com.ss.android.lark.widget.tab.C59204a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper;", "", "mDelegate", "Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$RedDotDelegate;", "(Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$RedDotDelegate;)V", "mBadgeCount", "", "mTodoBadgeChangeListener", "Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager$TodoBadgeChangeListener;", "init", "", "context", "Landroid/content/Context;", "mount", "unMount", "Companion", "RedDotDelegate", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.a.c */
public final class TodoRedDotHelper {

    /* renamed from: c */
    public static final Companion f139271c = new Companion(null);

    /* renamed from: a */
    public int f139272a;

    /* renamed from: b */
    public RedDotDelegate f139273b;

    /* renamed from: d */
    private final ITodoBadgeManager.TodoBadgeChangeListener f139274d = new C56271d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$RedDotDelegate;", "", "onRedDotViewPrepared", "", "redDotView", "Lcom/ss/android/lark/widget/tab/RedDotView;", "onShowRedDot", "count", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.c$b */
    public interface RedDotDelegate {
        /* renamed from: a */
        void mo191799a(int i);

        /* renamed from: a */
        void mo191800a(C59204a<?, ?> aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo191796a() {
        TodoBadgeManager.f139264a.mo191788a(this.f139274d);
    }

    /* renamed from: b */
    public final void mo191798b() {
        TodoBadgeManager.f139264a.mo191792b(this.f139274d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$mTodoBadgeChangeListener$1", "Lcom/ss/android/lark/todo/impl/features/badge/ITodoBadgeManager$TodoBadgeChangeListener;", "onTodoBadgeCountChanged", "", "badgeCount", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.c$d */
    public static final class C56271d implements ITodoBadgeManager.TodoBadgeChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoRedDotHelper f139278a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.a.c$d$a */
        static final class RunnableC56272a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C56271d f139279a;

            /* renamed from: b */
            final /* synthetic */ int f139280b;

            RunnableC56272a(C56271d dVar, int i) {
                this.f139279a = dVar;
                this.f139280b = i;
            }

            public final void run() {
                RedDotDelegate bVar = this.f139279a.f139278a.f139273b;
                if (bVar != null) {
                    bVar.mo191799a(this.f139280b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56271d(TodoRedDotHelper cVar) {
            this.f139278a = cVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.badge.ITodoBadgeManager.TodoBadgeChangeListener
        /* renamed from: a */
        public void mo191786a(int i) {
            Log.m165389i("TodoRedDotHelper", "onTodoBadgeCountChanged = " + i);
            UICallbackExecutor.execute(new RunnableC56272a(this, i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$init$redDotView$1", "Lcom/ss/android/lark/widget/tab/RedDotView;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "", "RED_DOT_IV_SIZE", "initView", "", "context", "Landroid/content/Context;", "show", "count", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.a.c$c */
    public static final class C56270c extends C59204a<LKUIBadgeView, Integer> {

        /* renamed from: a */
        final /* synthetic */ TodoRedDotHelper f139275a;

        /* renamed from: b */
        final /* synthetic */ Context f139276b;

        /* renamed from: c */
        private final int f139277c = 11;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.lark.widget.tab.C59204a
        /* renamed from: a */
        public /* synthetic */ void mo31307a(Integer num) {
            mo191801a(num.intValue());
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.tab.C59204a
        /* renamed from: a */
        public void mo31305a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            super.mo31305a(context);
            this.f147019e = new LKUIBadgeView(context);
        }

        /* renamed from: a */
        public void mo191801a(int i) {
            int i2;
            super.mo31307a(Integer.valueOf(i));
            if (i != this.f139275a.f139272a) {
                this.f139275a.f139272a = i;
                if (i <= 0) {
                    LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) mo201282b();
                    if (lKUIBadgeView != null) {
                        lKUIBadgeView.setVisibility(8);
                        return;
                    }
                    return;
                }
                String valueOf = String.valueOf(i);
                LKUIBadgeView lKUIBadgeView2 = (LKUIBadgeView) mo201282b();
                if (lKUIBadgeView2 != null) {
                    lKUIBadgeView2.setVisibility(0);
                }
                if (i < 10) {
                    i2 = R.drawable.badge_orange_single_count_bg_stroke;
                } else if (i < 999) {
                    i2 = R.drawable.badge_orange_multi_count_bg_stroke;
                } else {
                    valueOf = null;
                    i2 = R.drawable.badge_orange_bg_etc_count_stroke;
                }
                LKUIBadgeView lKUIBadgeView3 = (LKUIBadgeView) mo201282b();
                if (lKUIBadgeView3 != null) {
                    lKUIBadgeView3.mo89322b(i2).mo89316a((float) this.f139277c).mo89319a(valueOf).mo89317a(-1).mo89320a();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56270c(TodoRedDotHelper cVar, Context context, Context context2) {
            super(context2);
            this.f139275a = cVar;
            this.f139276b = context;
        }
    }

    public TodoRedDotHelper(RedDotDelegate bVar) {
        this.f139273b = bVar;
    }

    /* renamed from: a */
    public final void mo191797a(Context context) {
        if (this.f139273b != null) {
            C56270c cVar = new C56270c(this, context, context);
            RedDotDelegate bVar = this.f139273b;
            if (bVar != null) {
                bVar.mo191800a(cVar);
            }
        }
    }
}
