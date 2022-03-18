package com.ss.android.lark.todo.impl.features.detail.comment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$ViewHolder;", "section", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection;", "(Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardSection;)V", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage;", "getData", "()Ljava/util/List;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.h */
public final class CommentImageAdapterV2 extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: b */
    public static final Companion f139809b = new Companion(null);

    /* renamed from: d */
    private static final int f139810d = UIHelper.dp2px(90.0f);

    /* renamed from: a */
    public final CommentKeyboardSection f139811a;

    /* renamed from: c */
    private Context f139812c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.h$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public static final Companion f139813a = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$ViewHolder$Companion;", "", "()V", "from", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.h$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ViewHolder mo192398a(ViewGroup viewGroup) {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_post_grid_item_photo, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                return new ViewHolder(inflate, null);
            }
        }

        private ViewHolder(View view) {
            super(view);
        }

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0011H\u0002J\f\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$Companion;", "", "()V", "photoSize", "", "openPreview", "", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "photoItems", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "Lkotlin/collections/ArrayList;", "position", "toLoadModel", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentImage;", "toPhotoItem", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Object mo192397b(CommentImage commentImage) {
            int i = C56514i.f139822b[commentImage.mo192328b().ordinal()];
            if (i == 1) {
                return commentImage.mo192327a();
            }
            if (i == 2) {
                return new C38824b(commentImage.mo192327a());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: a */
        public final PhotoItem mo192395a(CommentImage commentImage) {
            int i = C56514i.f139821a[commentImage.mo192328b().ordinal()];
            if (i == 1) {
                PhotoItem paths = new PhotoItem().setType(2).setPaths(CollectionsKt.listOf(commentImage.mo192327a()));
                Intrinsics.checkExpressionValueIsNotNull(paths, "PhotoItem().setType(Phot…E).setPaths(listOf(info))");
                return paths;
            } else if (i == 2) {
                PhotoItem imageKey = new PhotoItem().setType(2).setToken(commentImage.mo192327a()).setImageKey(commentImage.mo192327a());
                Intrinsics.checkExpressionValueIsNotNull(imageKey, "PhotoItem().setType(Phot…n(info).setImageKey(info)");
                return imageKey;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: a */
        public final void mo192396a(Activity activity, View view, ArrayList<PhotoItem> arrayList, int i) {
            C58630d.C58631a a = C58630d.m227364a().mo198658a(view).mo198667a(arrayList).mo198657a(i);
            boolean z = false;
            C58630d.C58631a h = a.mo198674c(false).mo198675d(true).mo198676e(false).mo198678g(false).mo198677f(false).mo198679h(false);
            if (arrayList.size() != 1) {
                z = true;
            }
            h.mo198682k(z).mo198669a(activity);
        }
    }

    /* renamed from: a */
    public final List<CommentImage> mo192393a() {
        return this.f139811a.mo192416j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return mo192393a().size();
    }

    public CommentImageAdapterV2(CommentKeyboardSection kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "section");
        this.f139811a = kVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$onBindViewHolder$1$2$1", "com/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$$special$$inlined$run$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.h$d */
    public static final class View$OnClickListenerC56513d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentImageAdapterV2 f139818a;

        /* renamed from: b */
        final /* synthetic */ CommentImage f139819b;

        /* renamed from: c */
        final /* synthetic */ int f139820c;

        View$OnClickListenerC56513d(CommentImageAdapterV2 hVar, CommentImage commentImage, int i) {
            this.f139818a = hVar;
            this.f139819b = commentImage;
            this.f139820c = i;
        }

        public final void onClick(View view) {
            this.f139818a.mo192393a().remove(this.f139819b);
            this.f139818a.f139811a.mo192423q();
            this.f139818a.f139811a.mo192421o();
            this.f139818a.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f139812c = context;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "imageView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$onBindViewHolder$1$1$1", "com/ss/android/lark/todo/impl/features/detail/comment/CommentImageAdapterV2$$special$$inlined$run$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.h$c */
    public static final class View$OnClickListenerC56512c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LKUIRoundedImageView2 f139814a;

        /* renamed from: b */
        final /* synthetic */ CommentImageAdapterV2 f139815b;

        /* renamed from: c */
        final /* synthetic */ CommentImage f139816c;

        /* renamed from: d */
        final /* synthetic */ int f139817d;

        View$OnClickListenerC56512c(LKUIRoundedImageView2 lKUIRoundedImageView2, CommentImageAdapterV2 hVar, CommentImage commentImage, int i) {
            this.f139814a = lKUIRoundedImageView2;
            this.f139815b = hVar;
            this.f139816c = commentImage;
            this.f139817d = i;
        }

        public final void onClick(View view) {
            Companion aVar = CommentImageAdapterV2.f139809b;
            Context context = this.f139814a.getContext();
            if (context != null) {
                Activity activity = (Activity) context;
                Intrinsics.checkExpressionValueIsNotNull(view, "imageView");
                List<CommentImage> a = this.f139815b.mo192393a();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(CommentImageAdapterV2.f139809b.mo192395a(it.next()));
                }
                aVar.mo192396a(activity, view, new ArrayList<>(arrayList), this.f139817d);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return ViewHolder.f139813a.mo192398a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        CommentImage commentImage = mo192393a().get(i);
        View view = bVar.itemView;
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.ivContent);
        IRequestCreator load = ImageLoader.with(lKUIRoundedImageView2.getContext()).load(f139809b.mo192397b(commentImage));
        int i2 = f139810d;
        load.override(i2, i2).into(lKUIRoundedImageView2);
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lKUIRoundedImageView2.setBorderColor(R.color.ud_N900_15);
        lKUIRoundedImageView2.setOnClickListener(new View$OnClickListenerC56512c(lKUIRoundedImageView2, this, commentImage, i));
        ((ImageView) view.findViewById(R.id.icDelete)).setOnClickListener(new View$OnClickListenerC56513d(this, commentImage, i));
    }
}
