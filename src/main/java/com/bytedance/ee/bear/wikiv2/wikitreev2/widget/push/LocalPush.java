package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.wikiv2.wikitreev2.DoFavoriteEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.DoMakeCopyEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.FocusChangeEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.TitleChangeEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeObserver;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0004\u0006\t\f\u0011\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u0010\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush;", "", "pushHandler", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$ILocalPushHandler;", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$ILocalPushHandler;)V", "doFavoriteObserver", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$doFavoriteObserver$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$doFavoriteObserver$1;", "doMakeCopyObserver", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$doMakeCopyObserver$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$doMakeCopyObserver$1;", "focusChangeObserver", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$focusChangeObserver$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$focusChangeObserver$1;", "getPushHandler", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$ILocalPushHandler;", "titleChangeObserver", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$titleChangeObserver$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$titleChangeObserver$1;", "attach", "", "detach", "Companion", "ILocalPushHandler", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a */
public final class LocalPush {

    /* renamed from: a */
    public static final Companion f33521a = new Companion(null);

    /* renamed from: b */
    private C12507e f33522b = new C12507e(this);

    /* renamed from: c */
    private C12508f f33523c = new C12508f(this);

    /* renamed from: d */
    private C12506d f33524d = new C12506d(this);

    /* renamed from: e */
    private C12505c f33525e = new C12505c(this);

    /* renamed from: f */
    private final ILocalPushHandler f33526f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$ILocalPushHandler;", "", "onDoFavorite", "", "doFavorite", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoFavoriteEvent;", "onDoMakeCopy", "doMakeCopy", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoMakeCopyEvent;", "onFocusChange", "focusChange", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/FocusChangeEvent;", "onTitleChange", "titleChange", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/TitleChangeEvent;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a$b */
    public interface ILocalPushHandler {
        void onDoFavorite(DoFavoriteEvent aVar);

        void onDoMakeCopy(DoMakeCopyEvent bVar);

        void onFocusChange(FocusChangeEvent cVar);

        void onTitleChange(TitleChangeEvent eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final ILocalPushHandler mo47646c() {
        return this.f33526f;
    }

    /* renamed from: a */
    public final void mo47644a() {
        C13479a.m54764b("Wiki_LocalPush", "LocalPush attach. ");
        WikiTreeObserver.f33320a.mo47310b().mo47277a(this.f33522b);
        WikiTreeObserver.f33320a.mo47313e().mo47277a(this.f33523c);
        WikiTreeObserver.f33320a.mo47311c().mo47277a(this.f33524d);
        WikiTreeObserver.f33320a.mo47312d().mo47277a(this.f33525e);
    }

    /* renamed from: b */
    public final void mo47645b() {
        C13479a.m54764b("Wiki_LocalPush", "LocalPush detach. ");
        WikiTreeObserver.f33320a.mo47310b().mo47279b(this.f33522b);
        WikiTreeObserver.f33320a.mo47313e().mo47279b(this.f33523c);
        WikiTreeObserver.f33320a.mo47311c().mo47279b(this.f33524d);
        WikiTreeObserver.f33320a.mo47312d().mo47279b(this.f33525e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$doFavoriteObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoFavoriteEvent;", "onChanged", "", "event", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a$c */
    public static final class C12505c implements AbstractC1178x<DoFavoriteEvent> {

        /* renamed from: a */
        final /* synthetic */ LocalPush f33527a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12505c(LocalPush aVar) {
            this.f33527a = aVar;
        }

        /* renamed from: a */
        public void onChanged(DoFavoriteEvent aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "event");
            this.f33527a.mo47646c().onDoFavorite(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$doMakeCopyObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/DoMakeCopyEvent;", "onChanged", "", "event", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a$d */
    public static final class C12506d implements AbstractC1178x<DoMakeCopyEvent> {

        /* renamed from: a */
        final /* synthetic */ LocalPush f33528a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12506d(LocalPush aVar) {
            this.f33528a = aVar;
        }

        /* renamed from: a */
        public void onChanged(DoMakeCopyEvent bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "event");
            this.f33528a.mo47646c().onDoMakeCopy(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$focusChangeObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/FocusChangeEvent;", "onChanged", "", "event", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a$e */
    public static final class C12507e implements AbstractC1178x<FocusChangeEvent> {

        /* renamed from: a */
        final /* synthetic */ LocalPush f33529a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12507e(LocalPush aVar) {
            this.f33529a = aVar;
        }

        /* renamed from: a */
        public void onChanged(FocusChangeEvent cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "event");
            this.f33529a.mo47646c().onFocusChange(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/push/LocalPush$titleChangeObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/TitleChangeEvent;", "onChanged", "", "event", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.a$f */
    public static final class C12508f implements AbstractC1178x<TitleChangeEvent> {

        /* renamed from: a */
        final /* synthetic */ LocalPush f33530a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12508f(LocalPush aVar) {
            this.f33530a = aVar;
        }

        /* renamed from: a */
        public void onChanged(TitleChangeEvent eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "event");
            this.f33530a.mo47646c().onTitleChange(eVar);
        }
    }

    public LocalPush(ILocalPushHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "pushHandler");
        this.f33526f = bVar;
    }
}
