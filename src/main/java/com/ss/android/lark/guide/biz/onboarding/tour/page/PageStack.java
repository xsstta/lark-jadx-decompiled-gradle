package com.ss.android.lark.guide.biz.onboarding.tour.page;

import android.app.Activity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack;", "", "()V", "backStack", "Ljava/util/LinkedList;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack$ActivityRef;", "addToBackStack", "", "name", "", "activity", "Landroid/app/Activity;", "backToPage", "", "clearBackStack", "pop", "num", "", "ActivityRef", "Companion", "Pages", "StackNames", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PageStack {

    /* renamed from: a */
    public static final HashMap<String, PageStack> f99184a = new HashMap<>();

    /* renamed from: b */
    public static final Companion f99185b = new Companion(null);

    /* renamed from: c */
    private final LinkedList<ActivityRef> f99186c = new LinkedList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack$Pages;", "", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Pages {
        public static final Companion Companion = Companion.f99187a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack$Pages$Companion;", "", "()V", "PAGE_ADD_MEMBER", "", "PAGE_TEAM_NAME", "PAGE_TEAM_USE", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.PageStack$Pages$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f99187a = new Companion();

            private Companion() {
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack$ActivityRef;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "name", "", "activity", "(Ljava/lang/String;Landroid/app/Activity;)V", "getName", "()Ljava/lang/String;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.PageStack$a */
    public static final class ActivityRef extends WeakReference<Activity> {

        /* renamed from: a */
        private final String f99188a;

        /* renamed from: a */
        public final String mo141387a() {
            return this.f99188a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityRef(String str, Activity activity) {
            super(activity);
            Intrinsics.checkParameterIsNotNull(str, "name");
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            this.f99188a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack$Companion;", "", "()V", "MAX_SIZE", "", "stackMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/PageStack;", "Lkotlin/collections/HashMap;", "getPageStack", "stackName", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.PageStack$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PageStack mo141388a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "stackName");
            PageStack pageStack = PageStack.f99184a.get(str);
            if (pageStack != null) {
                return pageStack;
            }
            PageStack pageStack2 = new PageStack();
            PageStack.f99184a.put(str, pageStack2);
            return pageStack2;
        }
    }

    /* renamed from: b */
    private final void m152267b() {
        Activity activity;
        ActivityRef poll = this.f99186c.poll();
        if (poll != null && (activity = (Activity) poll.get()) != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo141385a() {
        int size = this.f99186c.size();
        if (size >= 0) {
            int i = 0;
            while (true) {
                m152267b();
                if (i != size) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo141386a(@Pages String str, Activity activity) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        int size = this.f99186c.size();
        for (int i = 0; i < size; i++) {
            ActivityRef aVar = this.f99186c.get(i);
            String a = aVar.mo141387a();
            String str2 = str;
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (a.contentEquals(str2)) {
                if (Intrinsics.areEqual((Activity) aVar.get(), activity)) {
                    return false;
                } else {
                    this.f99186c.set(i, new ActivityRef(str, activity));
                    return true;
                }
            }
        }
        if (size >= 5) {
            try {
                this.f99186c.removeFirst();
            } catch (Exception unused) {
            }
        }
        return this.f99186c.offer(new ActivityRef(str, activity));
    }
}
