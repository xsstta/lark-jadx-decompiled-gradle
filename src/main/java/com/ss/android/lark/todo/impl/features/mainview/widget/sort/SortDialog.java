package com.ss.android.lark.todo.impl.features.mainview.widget.sort;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog;", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", "currentSortType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "(Landroid/content/Context;ILcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;)V", "mSortTypeChangeListener", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/ISortTypeChangeListener;", "addSortTypeChangeListener", "", "sortTypeChangeListener", "initClickListener", "initList", "SortType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SortDialog extends DragShrinkDialog {

    /* renamed from: a */
    public ISortTypeChangeListener f140520a;

    /* renamed from: b */
    public final SortType f140521b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "", "(Ljava/lang/String;I)V", "DUE_TIME", "CREATE_TIME", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SortType {
        DUE_TIME,
        CREATE_TIME
    }

    /* renamed from: c */
    private final void m221025c() {
        ((RelativeLayout) findViewById(R.id.dueTimeSortRl)).setOnClickListener(new View$OnClickListenerC56937a(this));
        ((RelativeLayout) findViewById(R.id.createTimeSortRl)).setOnClickListener(new View$OnClickListenerC56938b(this));
    }

    /* renamed from: d */
    private final void m221026d() {
        if (this.f140521b == SortType.DUE_TIME) {
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
    public final void mo193452a(ISortTypeChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "sortTypeChangeListener");
        this.f140520a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog$a */
    public static final class View$OnClickListenerC56937a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SortDialog f140522a;

        View$OnClickListenerC56937a(SortDialog sortDialog) {
            this.f140522a = sortDialog;
        }

        public final void onClick(View view) {
            ISortTypeChangeListener bVar;
            if (!(this.f140522a.f140521b == SortType.DUE_TIME || (bVar = this.f140522a.f140520a) == null)) {
                bVar.mo193257a(SortType.DUE_TIME);
            }
            this.f140522a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog$b */
    public static final class View$OnClickListenerC56938b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SortDialog f140523a;

        View$OnClickListenerC56938b(SortDialog sortDialog) {
            this.f140523a = sortDialog;
        }

        public final void onClick(View view) {
            ISortTypeChangeListener bVar;
            if (!(this.f140523a.f140521b == SortType.CREATE_TIME || (bVar = this.f140523a.f140520a) == null)) {
                bVar.mo193257a(SortType.CREATE_TIME);
            }
            this.f140523a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SortDialog(Context context, int i, SortType sortType) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(sortType, "currentSortType");
        this.f140521b = sortType;
        mo193470a(R.layout.todo_dialog_sort);
        m221026d();
        m221025c();
    }
}
