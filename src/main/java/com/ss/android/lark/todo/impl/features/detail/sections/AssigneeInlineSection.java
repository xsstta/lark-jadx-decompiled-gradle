package com.ss.android.lark.todo.impl.features.detail.sections;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.common.LayerAvatarView;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeInlineSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "assigneeClick", "", "initViewAction", "initViewObserver", "updateAssigneeView", "assignees", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.c */
public class AssigneeInlineSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139948a;

    /* renamed from: j */
    private final void m220387j() {
        ((ImageView) this.f139948a.findViewById(R.id.func_attendee)).setOnClickListener(new View$OnClickListenerC56573a(this));
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        mo92103a(((ITodoDetailViewDataStore) mo92096a()).getAssignees(), new C56574b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.c$c */
    public static final class C56575c<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ AssigneeInlineSection f139950a;

        /* renamed from: b */
        final /* synthetic */ List f139951b;

        /* renamed from: c */
        final /* synthetic */ List f139952c;

        C56575c(AssigneeInlineSection cVar, List list, List list2) {
            this.f139950a = cVar;
            this.f139951b = list;
            this.f139952c = list2;
        }

        /* renamed from: a */
        public final List<Bitmap> produce() {
            return TodoDependencyHolder.f139242a.mo191730a().imageDependency().mo145391a(this.f139950a.mo92106c(), this.f139951b, this.f139952c, UIHelper.dp2px(24.0f), UIHelper.dp2px(24.0f));
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        View findViewById = this.f139948a.findViewById(R.id.layout_assignee_inline);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_assignee_inline");
        C25877a.m93658a(findViewById, mo92107d(), CommonCode.StatusCode.API_CLIENT_EXPIRED, 21);
        m220387j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/AssigneeInlineSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.c$b */
    static final class C56574b extends Lambda implements Function1<List<? extends AssigneeBean>, Unit> {
        final /* synthetic */ AssigneeInlineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56574b(AssigneeInlineSection cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AssigneeBean> list) {
            invoke((List<AssigneeBean>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<AssigneeBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.this$0.mo192549a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "bitmaps", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.c$d */
    public static final class C56576d<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ AssigneeInlineSection f139953a;

        C56576d(AssigneeInlineSection cVar) {
            this.f139953a = cVar;
        }

        /* renamed from: a */
        public final void consume(List<Bitmap> list) {
            View findViewById = this.f139953a.f139948a.findViewById(R.id.layout_assignee_inline);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_assignee_inline");
            Intrinsics.checkExpressionValueIsNotNull(list, "bitmaps");
            ((LayerAvatarView) findViewById.findViewById(R.id.avatar_list)).mo192511a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.c$a */
    public static final class View$OnClickListenerC56573a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AssigneeInlineSection f139949a;

        View$OnClickListenerC56573a(AssigneeInlineSection cVar) {
            this.f139949a = cVar;
        }

        public final void onClick(View view) {
            boolean z;
            List<AssigneeBean> b = ((ITodoDetailViewDataStore) this.f139949a.mo92096a()).getAssignees().mo5927b();
            if (b == null || b.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f139949a.mo92107d().mo92064a(22);
            } else {
                this.f139949a.mo92107d().mo92064a(21);
            }
            this.f139949a.mo92107d().mo92064a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
        }
    }

    /* renamed from: a */
    public final void mo192549a(List<AssigneeBean> list) {
        List<AssigneeBean> list2;
        int size = list.size();
        if (size > 0) {
            View findViewById = this.f139948a.findViewById(R.id.layout_assignee_inline);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "containerView.layout_assignee_inline");
            findViewById.setVisibility(0);
            View findViewById2 = this.f139948a.findViewById(R.id.layout_assignee_inline);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "containerView.layout_assignee_inline");
            ((LayerAvatarView) findViewById2.findViewById(R.id.avatar_list)).setMPaddingRect(new Rect(0, 0, 0, 0));
            if (list.size() > 3) {
                list2 = list.subList(0, 3);
            } else {
                list2 = list;
            }
            List<AssigneeBean> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo192759c());
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().mo192757a());
            }
            C57865c.m224574a(new C56575c(this, arrayList2, arrayList3), new C56576d(this));
            if (size == 1) {
                View findViewById3 = this.f139948a.findViewById(R.id.layout_assignee_inline);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "containerView.layout_assignee_inline");
                TextView textView = (TextView) findViewById3.findViewById(R.id.avatar_text);
                Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.layout_assignee_inline.avatar_text");
                textView.setText(list.get(0).mo192758b());
                return;
            }
            View findViewById4 = this.f139948a.findViewById(R.id.layout_assignee_inline);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "containerView.layout_assignee_inline");
            TextView textView2 = (TextView) findViewById4.findViewById(R.id.avatar_text);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "containerView.layout_assignee_inline.avatar_text");
            textView2.setText(UIHelper.getQuantityString(R.plurals.Todo_Task_NumAssignees, size));
            return;
        }
        View findViewById5 = this.f139948a.findViewById(R.id.layout_assignee_inline);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "containerView.layout_assignee_inline");
        findViewById5.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssigneeInlineSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139948a = view;
    }
}
