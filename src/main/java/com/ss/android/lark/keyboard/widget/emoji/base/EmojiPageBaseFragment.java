package com.ss.android.lark.keyboard.widget.emoji.base;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H&J\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$J\b\u0010&\u001a\u0004\u0018\u00010\u0013J\b\u0010'\u001a\u00020(H\u0016J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0010J\u0010\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010\u0013J\u0010\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010\u0019J\b\u0010/\u001a\u00020(H&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/base/EmojiPageBaseFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "contentRv", "Landroidx/recyclerview/widget/RecyclerView;", "getContentRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "deleteView", "Landroid/widget/ImageView;", "getDeleteView", "()Landroid/widget/ImageView;", "setDeleteView", "(Landroid/widget/ImageView;)V", "mDeleteIconVisible", "", "mRefEmojiDependency", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "getMRefEmojiDependency", "()Ljava/lang/ref/WeakReference;", "setMRefEmojiDependency", "(Ljava/lang/ref/WeakReference;)V", "mRefListener", "Lcom/ss/android/lark/keyboard/widget/emoji/base/OnEmojiOperationListener;", "getMRefListener", "setMRefListener", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "createAndInitView", "context", "Landroid/content/Context;", "createRootView", "getEmojiDependency", "onDestroy", "", "setDeleteIconEnable", "enable", "setEmojiDependency", "dependency", "setOnOperationListener", "onOperationListener", "unRegisterListener", "Companion", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.a.a */
public abstract class EmojiPageBaseFragment extends BaseFragment {

    /* renamed from: c */
    public static final Companion f104806c = new Companion(null);

    /* renamed from: a */
    public WeakReference<OnEmojiOperationListener> f104807a;

    /* renamed from: b */
    public View f104808b;

    /* renamed from: d */
    private WeakReference<IEmojiDependency> f104809d;

    /* renamed from: e */
    private RecyclerView f104810e;

    /* renamed from: f */
    private ImageView f104811f;

    /* renamed from: g */
    private boolean f104812g;

    /* renamed from: h */
    private HashMap f104813h;

    /* renamed from: d */
    public abstract void mo148246d();

    /* renamed from: f */
    public void mo148248f() {
        HashMap hashMap = this.f104813h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo148248f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/base/EmojiPageBaseFragment$Companion;", "", "()V", "DELETE_ICON_HEIGHT", "", "DELETE_ICON_WIDTH", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final RecyclerView mo148244b() {
        return this.f104810e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        mo148246d();
        super.onDestroy();
    }

    /* renamed from: a */
    public final WeakReference<OnEmojiOperationListener> mo148239a() {
        WeakReference<OnEmojiOperationListener> weakReference = this.f104807a;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRefListener");
        }
        return weakReference;
    }

    /* renamed from: c */
    public final View mo148245c() {
        View view = this.f104808b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    /* renamed from: e */
    public final IEmojiDependency mo148247e() {
        WeakReference<IEmojiDependency> weakReference = this.f104809d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo148240a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "<set-?>");
        this.f104808b = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.a.a$b */
    static final class View$OnClickListenerC41103b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EmojiPageBaseFragment f104814a;

        View$OnClickListenerC41103b(EmojiPageBaseFragment aVar) {
            this.f104814a = aVar;
        }

        public final void onClick(View view) {
            OnEmojiOperationListener bVar = this.f104814a.mo148239a().get();
            if (bVar != null) {
                bVar.mo147529a();
            }
        }
    }

    /* renamed from: a */
    public final void mo148241a(OnEmojiOperationListener bVar) {
        if (bVar != null) {
            this.f104807a = new WeakReference<>(bVar);
        }
    }

    /* renamed from: a */
    public final void mo148242a(IEmojiDependency dVar) {
        if (dVar != null) {
            this.f104809d = new WeakReference<>(dVar);
        }
    }

    /* renamed from: a */
    public final void mo148243a(boolean z) {
        int i;
        this.f104812g = z;
        ImageView imageView = this.f104811f;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final View mo148238a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.container_id);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.emoji_recv);
        recyclerView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        constraintLayout.addView(recyclerView);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.delete_id);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(UIHelper.dp2px(56.0f), UIHelper.dp2px(56.0f));
        imageView.setLayoutParams(layoutParams);
        int i = 0;
        layoutParams.f2819k = 0;
        layoutParams.f2827s = 0;
        imageView.setImageResource(R.drawable.icon_delete);
        imageView.setBackgroundColor(UIHelper.getColor(R.color.lkui_transparent));
        imageView.setOnClickListener(new View$OnClickListenerC41103b(this));
        constraintLayout.addView(imageView);
        this.f104810e = recyclerView;
        ConstraintLayout constraintLayout2 = constraintLayout;
        this.f104808b = constraintLayout2;
        this.f104811f = imageView;
        if (imageView != null) {
            if (!this.f104812g) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        return constraintLayout2;
    }
}
