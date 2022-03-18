package com.ss.android.lark.calendar.impl.features.calendars.selector.widget;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog;", "", "context", "Landroid/content/Context;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;", "hideSubscribe", "", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;Z)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;", "setDelegate", "(Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;)V", "mUDActionPanelBuilder", "Lcom/larksuite/component/universe_design/dialog/actionpanel/UDActionPanelBuilder;", "getMUDActionPanelBuilder", "()Lcom/larksuite/component/universe_design/dialog/actionpanel/UDActionPanelBuilder;", "mUDActionPanelBuilder$delegate", "Lkotlin/Lazy;", "show", "", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a */
public final class CalendarManagerDialog {

    /* renamed from: a */
    private final Lazy f76121a;

    /* renamed from: b */
    private Delegate f76122b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;", "", "importCalendar", "", "newCalendar", "subscribeCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109751a();

        /* renamed from: b */
        void mo109752b();

        /* renamed from: c */
        void mo109753c();
    }

    /* renamed from: c */
    private final UDActionPanelBuilder m112998c() {
        return (UDActionPanelBuilder) this.f76121a.getValue();
    }

    /* renamed from: b */
    public final Delegate mo109750b() {
        return this.f76122b;
    }

    /* renamed from: a */
    public final void mo109749a() {
        m112998c().show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/dialog/actionpanel/UDActionPanelBuilder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$b */
    public static final class C30400b extends Lambda implements Function0<UDActionPanelBuilder> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $hideSubscribe;
        final /* synthetic */ CalendarManagerDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30400b(CalendarManagerDialog aVar, boolean z, Context context) {
            super(0);
            this.this$0 = aVar;
            this.$hideSubscribe = z;
            this.$context = context;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$b$a */
        public static final class C30402a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C30400b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30402a(C30400b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.mo109750b().mo109751a();
                CalendarHitPoint.m124103E();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$b$c */
        public static final class C30404c extends Lambda implements Function0<Unit> {
            final /* synthetic */ C30400b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30404c(C30400b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.mo109750b().mo109751a();
                CalendarHitPoint.m124103E();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$b$d */
        public static final class C30405d extends Lambda implements Function0<Unit> {
            final /* synthetic */ C30400b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30405d(C30400b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.mo109750b().mo109752b();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$b$b */
        public static final class C30403b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C30400b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30403b(C30400b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                GeneralHitPoint.m124279w("quick_action_sheet");
                this.this$0.this$0.mo109750b().mo109753c();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a.a$b$e */
        public static final class C30406e extends Lambda implements Function0<Unit> {
            final /* synthetic */ C30400b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30406e(C30400b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                GeneralHitPoint.m124279w("quick_action_sheet");
                this.this$0.this$0.mo109750b().mo109753c();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDActionPanelBuilder invoke() {
            String str;
            boolean z;
            List<? extends CharSequence> list;
            final List list2;
            String b = C32634ae.m125182b(R.string.Calendar_Setting_NewCalendar);
            String b2 = C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_SubscribeCalendars);
            if (C30022a.f74883b.mo112712t()) {
                str = C32634ae.m125182b(R.string.Calendar_Manage_AddAccount);
            } else if (C30022a.f74883b.mo112694b()) {
                str = C32634ae.m125182b(R.string.Calendar_Setting_ImportLocal);
            } else {
                str = C32634ae.m125182b(R.string.Calendar_GoogleCal_ImportGoogleOrLocal);
            }
            String b3 = C32634ae.m125182b(R.string.Calendar_Common_Cancel);
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            if (loginDependency.mo108270b() || this.$hideSubscribe) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = CollectionsKt.listOf((Object[]) new String[]{b, str});
            } else {
                list = CollectionsKt.listOf((Object[]) new String[]{b, b2, str});
            }
            if (z) {
                list2 = CollectionsKt.listOf((Object[]) new Function0[]{new C30402a(this), new C30403b(this)});
            } else {
                list2 = CollectionsKt.listOf((Object[]) new Function0[]{new C30404c(this), new C30405d(this), new C30406e(this)});
            }
            Intrinsics.checkExpressionValueIsNotNull(b3, "cancel");
            return (UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.$context).mo90870a(list)).mo90869a(new UDListDialogController.OnItemClickListener() {
                /* class com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.C30400b.C304011 */

                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                public void onItemClick(int i) {
                    ((Function0) list2.get(i)).invoke();
                }
            })).addActionButton(R.id.ud_dialog_btn_cancel, b3, (DialogInterface.OnClickListener) null);
        }
    }

    public CalendarManagerDialog(Context context, Delegate aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f76122b = aVar;
        this.f76121a = LazyKt.lazy(new C30400b(this, z, context));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarManagerDialog(Context context, Delegate aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, (i & 4) != 0 ? false : z);
    }
}
