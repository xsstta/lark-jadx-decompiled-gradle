package com.ss.android.lark.calendar.impl.features.arrange.arrangetime;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangePresenter;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.util.ArrangeUtil;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerFrameLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/DrawerParams;", "()V", "arrangeModel", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel;", "getArrangeModel", "()Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel;", "arrangeModel$delegate", "Lkotlin/Lazy;", "arrangePresenter", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter;", "getArrangePresenter", "()Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter;", "arrangePresenter$delegate", "arrangeView", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView;", "getArrangeView", "()Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView;", "arrangeView$delegate", "dragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "fragmentDependency", "com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeFragment$fragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeFragment$fragmentDependency$1;", "isSourceFromChat", "", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.b */
public final class ArrangeFragment extends C36516a<DrawerParams> {

    /* renamed from: a */
    public C26213k f75368a;

    /* renamed from: b */
    public boolean f75369b;

    /* renamed from: c */
    public final C30183d f75370c = new C30183d(this);

    /* renamed from: d */
    private final Lazy f75371d = LazyKt.lazy(new C30182c(this));

    /* renamed from: e */
    private final Lazy f75372e = LazyKt.lazy(new C30180a(this));

    /* renamed from: f */
    private final Lazy f75373f = LazyKt.lazy(new C30181b(this));

    /* renamed from: g */
    private HashMap f75374g;

    /* renamed from: d */
    private final ArrangePresenter m111936d() {
        return (ArrangePresenter) this.f75373f.getValue();
    }

    /* renamed from: a */
    public View mo108922a(int i) {
        if (this.f75374g == null) {
            this.f75374g = new HashMap();
        }
        View view = (View) this.f75374g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75374g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ArrangeView mo108923a() {
        return (ArrangeView) this.f75371d.getValue();
    }

    /* renamed from: b */
    public final ArrangeModel mo108924b() {
        return (ArrangeModel) this.f75372e.getValue();
    }

    /* renamed from: c */
    public void mo108925c() {
        HashMap hashMap = this.f75374g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo108925c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0012j\b\u0012\u0004\u0012\u00020\u000e`\u00132\u0006\u0010\f\u001a\u00020\bH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeFragment$fragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter$fragmentDependency;", "finishPage", "", "getContext", "Landroid/content/Context;", "setActivityResult", "resultCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startAppendActivity", "requestId", "chatType", "", "startGroupNumberActivity", "chatId", "selectChatterIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.b$d */
    public static final class C30183d implements ArrangePresenter.fragmentDependency {

        /* renamed from: a */
        final /* synthetic */ ArrangeFragment f75375a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangePresenter.fragmentDependency
        /* renamed from: b */
        public Context mo108930b() {
            return this.f75375a.getContext();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangePresenter.fragmentDependency
        /* renamed from: a */
        public void mo108926a() {
            FragmentActivity activity = this.f75375a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30183d(ArrangeFragment bVar) {
            this.f75375a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangePresenter.fragmentDependency
        /* renamed from: a */
        public void mo108927a(int i, Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            FragmentActivity activity = this.f75375a.getActivity();
            if (activity != null) {
                activity.setResult(i, intent);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangePresenter.fragmentDependency
        /* renamed from: a */
        public void mo108928a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Context context = this.f75375a.getContext();
            if (context != null) {
                EditActivityEntrance.Companion aVar = EditActivityEntrance.f79940a;
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                aVar.mo114665a(context, this.f75375a.mo108924b().mo108853c(), this.f75375a.mo108924b().mo108854d(), ArrangeUtil.f75376a.mo108931a(this.f75375a.mo108924b().mo108842a()), this.f75375a.mo108924b().mo108867q(), this.f75375a.mo108924b().mo108864n(), i, str);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangePresenter.fragmentDependency
        /* renamed from: a */
        public void mo108929a(String str, ArrayList<String> arrayList, int i) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(arrayList, "selectChatterIds");
            C30022a.f74882a.groupMemberManageDependency().mo108240a(this.f75375a.getActivity(), str, arrayList, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.b$a */
    static final class C30180a extends Lambda implements Function0<ArrangeModel> {
        final /* synthetic */ ArrangeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30180a(ArrangeFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrangeModel invoke() {
            return new ArrangeModel(this.this$0.getArguments());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangePresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.b$b */
    static final class C30181b extends Lambda implements Function0<ArrangePresenter> {
        final /* synthetic */ ArrangeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30181b(ArrangeFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrangePresenter invoke() {
            return new ArrangePresenter(this.this$0.mo108924b(), this.this$0.mo108923a(), this.this$0.f75370c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.b$c */
    static final class C30182c extends Lambda implements Function0<ArrangeView> {
        final /* synthetic */ ArrangeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30182c(ArrangeFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrangeView invoke() {
            TouchListenerFrameLayout touchListenerFrameLayout = (TouchListenerFrameLayout) this.this$0.mo108922a(R.id.arrangeActivityRoot);
            Intrinsics.checkExpressionValueIsNotNull(touchListenerFrameLayout, "arrangeActivityRoot");
            return new ArrangeView(touchListenerFrameLayout, this.this$0.f75368a, this.this$0.f75369b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m111936d().destroy();
        C26213k kVar = this.f75368a;
        if (kVar != null) {
            kVar.mo93233a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        Window window;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            this.f75368a = new C26213k(window);
        }
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments != null) {
            i = arguments.getInt("calendar_arrange_source", 1);
        } else {
            i = 1;
        }
        if (!(i == 2 || i == 3)) {
            z = false;
        }
        this.f75369b = z;
        m111936d().create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        m111936d().mo108938a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_activity_arrange_time, viewGroup, false);
    }
}
