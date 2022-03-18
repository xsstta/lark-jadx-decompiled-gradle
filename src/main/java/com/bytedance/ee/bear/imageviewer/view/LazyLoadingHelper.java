package com.bytedance.ee.bear.imageviewer.view;

import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/imageviewer/view/LazyLoadingHelper;", "", "loadingView", "Landroid/view/View;", "(Landroid/view/View;)V", "lazyHideLoadingTask", "Ljava/lang/Runnable;", "lazyShowLoadingTask", "hideLoading", "", "showLoading", "Companion", "image-viewer-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.imageviewer.view.a */
public final class LazyLoadingHelper {

    /* renamed from: b */
    public static final Companion f21248b = new Companion(null);

    /* renamed from: a */
    public final View f21249a;

    /* renamed from: c */
    private final Runnable f21250c = new RunnableC7869c(this);

    /* renamed from: d */
    private final Runnable f21251d = new RunnableC7868b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/imageviewer/view/LazyLoadingHelper$Companion;", "", "()V", "TAG", "", "image-viewer-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.imageviewer.view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.imageviewer.view.a$b */
    static final class RunnableC7868b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LazyLoadingHelper f21252a;

        RunnableC7868b(LazyLoadingHelper aVar) {
            this.f21252a = aVar;
        }

        public final void run() {
            this.f21252a.f21249a.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.imageviewer.view.a$c */
    static final class RunnableC7869c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LazyLoadingHelper f21253a;

        RunnableC7869c(LazyLoadingHelper aVar) {
            this.f21253a = aVar;
        }

        public final void run() {
            this.f21253a.f21249a.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo30695a() {
        C13479a.m54764b("LazyLoadingHelper", "showLoading");
        C13742g.m55710c(this.f21250c);
        C13742g.m55710c(this.f21251d);
        C13742g.m55706a(this.f21250c, 250);
    }

    /* renamed from: b */
    public final void mo30696b() {
        C13479a.m54764b("LazyLoadingHelper", "hideLoading");
        C13742g.m55710c(this.f21250c);
        C13742g.m55710c(this.f21251d);
        C13742g.m55711d(this.f21251d);
    }

    public LazyLoadingHelper(View view) {
        Intrinsics.checkParameterIsNotNull(view, "loadingView");
        this.f21249a = view;
        view.setVisibility(8);
    }
}
