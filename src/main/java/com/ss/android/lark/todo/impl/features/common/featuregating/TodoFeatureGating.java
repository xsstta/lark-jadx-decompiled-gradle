package com.ss.android.lark.todo.impl.features.common.featuregating;

import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56255j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/featuregating/TodoFeatureGating;", "", "()V", "fgDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IFeatureGatingDependency;", "isMultiAssigneeEnabled", "", "isTodHelpCenterEnabled", "isTodoBadgeIncludeAllOAPI", "isTodoCardCanOpenCenter", "isTodoCenterSearchEnabled", "isTodoCustomComplete", "isTodoDailyRemindEnabled", "isTodoDetailCreateInfo", "isTodoDocFilterEnabled", "isTodoListRefactorEnabled", "isTodoReminderExpandScope", "isTodoReminderWeekBefore", "isTodoReportEnable", "isTodoUrlPreviewEnable", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.a.a */
public final class TodoFeatureGating {

    /* renamed from: a */
    public static final Companion f139369a = new Companion(null);

    /* renamed from: b */
    private final AbstractC56255j f139370b = TodoDependencyHolder.f139242a.mo191730a().featureGatingDependency();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/featuregating/TodoFeatureGating$Companion;", "", "()V", "FEATURE_KEY_A_WEEK_BEFORE", "", "FEATURE_KEY_DAILY_REMIND", "FEATURE_KEY_LARK_TODO_REPORT", "FEATURE_KEY_TODO_BADGE_INCLUDE_ALL_OAPI", "FEATURE_KEY_TODO_CENTER_SEARCH", "FEATURE_KEY_TODO_COMMENT_CREATE_INFO", "FEATURE_KEY_TODO_CUSTOM_COMPLETE", "FEATURE_KEY_TODO_DOC_FILTER", "FEATURE_KEY_TODO_HELP_CENTER", "FEATURE_KEY_TODO_LIST_REFACTOR", "FEATURE_KEY_TODO_MULTI_ASSIGNEE", "FEATURE_KEY_TODO_OPEN_CENTER", "FEATURE_KEY_TODO_REMIND_EXPAND_SCOPE", "FEATURE_KEY_TODO_URL_PREVIEW", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo191928a() {
        return this.f139370b.mo145386a("todo.enable.daily_remind", false);
    }

    /* renamed from: b */
    public final boolean mo191929b() {
        return this.f139370b.mo145386a("lark.todo.doc_filter", false);
    }

    /* renamed from: c */
    public final boolean mo191930c() {
        return this.f139370b.mo145386a("todo.center.search", false);
    }

    /* renamed from: d */
    public final boolean mo191931d() {
        return this.f139370b.mo145386a("lark.todo.report", false);
    }

    /* renamed from: e */
    public final boolean mo191932e() {
        return this.f139370b.mo145386a("todo.android.list.refactor", false);
    }

    /* renamed from: f */
    public final boolean mo191933f() {
        return this.f139370b.mo145386a("todo.urlpreview.on", false);
    }

    /* renamed from: g */
    public final boolean mo191934g() {
        return this.f139370b.mo145386a("todo.multi.assignee", false);
    }

    /* renamed from: h */
    public final boolean mo191935h() {
        return this.f139370b.mo145386a("todo.remind.expand_scope", false);
    }

    /* renamed from: i */
    public final boolean mo191936i() {
        return this.f139370b.mo145386a("todo.badge.include_all_oapi", false);
    }

    /* renamed from: j */
    public final boolean mo191937j() {
        return this.f139370b.mo145386a("todo.custom.complete", false);
    }

    /* renamed from: k */
    public final boolean mo191938k() {
        return this.f139370b.mo145386a("todo.card.open_center", false);
    }

    /* renamed from: l */
    public final boolean mo191939l() {
        return this.f139370b.mo145386a("todo.help.center", false);
    }

    /* renamed from: m */
    public final boolean mo191940m() {
        return this.f139370b.mo145386a("lark.todo.comment_create_info", false);
    }

    /* renamed from: n */
    public final boolean mo191941n() {
        return this.f139370b.mo145386a("todo.reminder.a_week_before", false);
    }
}
