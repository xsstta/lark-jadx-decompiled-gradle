package com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.sort;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.DragShrinkDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/sort/SortDialog;", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", "currentSortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "(Landroid/content/Context;ILcom/bytedance/lark/pb/todo/v1/TodoSortType;)V", "sortTypeChangeListener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/sort/ISortTypeChangeListener;", "addSortTypeChangeListener", "", "initClickListener", "initList", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.a.b */
public class SortDialog extends DragShrinkDialog {

    /* renamed from: a */
    public ISortTypeChangeListener f140869a;

    /* renamed from: b */
    public final TodoSortType f140870b;

    /* renamed from: c */
    private final void m221405c() {
        ((RelativeLayout) findViewById(R.id.dueTimeSortRl)).setOnClickListener(new View$OnClickListenerC57129a(this));
        ((RelativeLayout) findViewById(R.id.createTimeSortRl)).setOnClickListener(new View$OnClickListenerC57130b(this));
    }

    /* renamed from: d */
    private final void m221406d() {
        if (this.f140870b == TodoSortType.DUE_TIME) {
            ImageView imageView = (ImageView) findViewById(R.id.dueTimeSelectIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "dueTimeSelectIv");
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) findViewById(R.id.createTimeSelectIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "createTimeSelectIv");
            imageView2.setVisibility(8);
            return;
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.dueTimeSelectIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "dueTimeSelectIv");
        imageView3.setVisibility(8);
        ImageView imageView4 = (ImageView) findViewById(R.id.createTimeSelectIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "createTimeSelectIv");
        imageView4.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo193910a(ISortTypeChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "sortTypeChangeListener");
        this.f140869a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.a.b$a */
    public static final class View$OnClickListenerC57129a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SortDialog f140871a;

        View$OnClickListenerC57129a(SortDialog bVar) {
            this.f140871a = bVar;
        }

        public final void onClick(View view) {
            ISortTypeChangeListener aVar;
            if (!(this.f140871a.f140870b == TodoSortType.DUE_TIME || (aVar = this.f140871a.f140869a) == null)) {
                aVar.mo193907a(TodoSortType.DUE_TIME);
            }
            this.f140871a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.a.b$b */
    public static final class View$OnClickListenerC57130b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SortDialog f140872a;

        View$OnClickListenerC57130b(SortDialog bVar) {
            this.f140872a = bVar;
        }

        public final void onClick(View view) {
            ISortTypeChangeListener aVar;
            if (!(this.f140872a.f140870b == TodoSortType.CREATE_TIME || (aVar = this.f140872a.f140869a) == null)) {
                aVar.mo193907a(TodoSortType.CREATE_TIME);
            }
            this.f140872a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SortDialog(Context context, int i, TodoSortType todoSortType) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(todoSortType, "currentSortType");
        this.f140870b = todoSortType;
        mo193470a(R.layout.todo_dialog_sort);
        m221406d();
        m221405c();
    }
}
