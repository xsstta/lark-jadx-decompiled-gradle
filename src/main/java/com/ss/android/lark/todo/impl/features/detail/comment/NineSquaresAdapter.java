package com.ss.android.lark.todo.impl.features.detail.comment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/NineSquaresAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/comment/NineSquaresAdapter$ViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "photoItems", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.ab */
public final class NineSquaresAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: b */
    public static final int f139783b = UIHelper.dp2px(88.0f);

    /* renamed from: c */
    public static final Companion f139784c = new Companion(null);

    /* renamed from: a */
    public final List<PhotoItem> f139785a;

    /* renamed from: d */
    private Context f139786d;

    /* renamed from: e */
    private final List<ImageSet> f139787e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\f\u0010\u0010\u001a\u00020\r*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/NineSquaresAdapter$Companion;", "", "()V", "IMAGE_SIZE", "", "openPreview", "", "activity", "Landroid/app/Activity;", "itemView", "Landroid/view/View;", "photoItems", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "Lkotlin/collections/ArrayList;", "position", "toPhotoItem", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.ab$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PhotoItem mo192364a(ImageSet imageSet) {
            List<String> list;
            String str;
            int i;
            Integer num;
            Integer num2;
            if (imageSet.origin != null) {
                PhotoItem type = new PhotoItem().setType(2);
                Image image = imageSet.origin;
                String str2 = null;
                if (image != null) {
                    list = image.urls;
                } else {
                    list = null;
                }
                PhotoItem paths = type.setPaths(list);
                Image image2 = imageSet.origin;
                if (image2 != null) {
                    str = image2.key;
                } else {
                    str = null;
                }
                PhotoItem token = paths.setToken(str);
                Image image3 = imageSet.origin;
                if (image3 != null) {
                    str2 = image3.key;
                }
                PhotoItem imageKey = token.setImageKey(str2);
                Image image4 = imageSet.origin;
                int i2 = 0;
                if (image4 == null || (num2 = image4.width) == null) {
                    i = 0;
                } else {
                    i = num2.intValue();
                }
                PhotoItem width = imageKey.setWidth(i);
                Image image5 = imageSet.origin;
                if (!(image5 == null || (num = image5.height) == null)) {
                    i2 = num.intValue();
                }
                PhotoItem height = width.setHeight(i2);
                Intrinsics.checkExpressionValueIsNotNull(height, "PhotoItem().setType(Phot…ight(origin?.height ?: 0)");
                return height;
            }
            PhotoItem imageKey2 = new PhotoItem().setType(2).setToken(imageSet.key).setImageKey(imageSet.key);
            Intrinsics.checkExpressionValueIsNotNull(imageKey2, "PhotoItem().setType(Phot…ey).setImageKey(this.key)");
            return imageKey2;
        }

        /* renamed from: a */
        public final void mo192365a(Activity activity, View view, ArrayList<PhotoItem> arrayList, int i) {
            C58630d.C58631a a = C58630d.m227364a().mo198658a(view).mo198667a(new ArrayList<>(arrayList)).mo198657a(i);
            boolean z = false;
            C58630d.C58631a h = a.mo198674c(false).mo198675d(true).mo198676e(false).mo198678g(false).mo198677f(false).mo198679h(false);
            if (arrayList.size() != 1) {
                z = true;
            }
            h.mo198682k(z).mo198669a(activity);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139787e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f139786d = context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/NineSquaresAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/todo/impl/features/detail/comment/NineSquaresAdapter;Landroid/view/View;)V", "bind", "", "context", "Landroid/content/Context;", "item", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "position", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.ab$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ NineSquaresAdapter f139788a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/comment/NineSquaresAdapter$ViewHolder$bind$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.ab$b$a */
        public static final class View$OnClickListenerC56510a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f139789a;

            /* renamed from: b */
            final /* synthetic */ ImageSet f139790b;

            /* renamed from: c */
            final /* synthetic */ Context f139791c;

            /* renamed from: d */
            final /* synthetic */ int f139792d;

            View$OnClickListenerC56510a(ViewHolder bVar, ImageSet imageSet, Context context, int i) {
                this.f139789a = bVar;
                this.f139790b = imageSet;
                this.f139791c = context;
                this.f139792d = i;
            }

            public final void onClick(View view) {
                Companion aVar = NineSquaresAdapter.f139784c;
                Context context = this.f139791c;
                if (context != null) {
                    View view2 = this.f139789a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    aVar.mo192365a((Activity) context, view2, new ArrayList<>(this.f139789a.f139788a.f139785a), this.f139792d);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(NineSquaresAdapter abVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f139788a = abVar;
        }

        /* renamed from: a */
        public final void mo192366a(Context context, ImageSet imageSet, int i) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(imageSet, "item");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.commentImageIv);
            String str = imageSet.key;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lKUIRoundedImageView2.setImageDrawable(UIHelper.getDrawable(R.drawable.common_failed_chat_picture));
                return;
            }
            ImageLoader.with(context).load(new C38824b(imageSet.key)).override(NineSquaresAdapter.f139783b, NineSquaresAdapter.f139783b).dontAnimate(false).centerCrop().into(lKUIRoundedImageView2);
            lKUIRoundedImageView2.setOnClickListener(new View$OnClickListenerC56510a(this, imageSet, context, i));
        }
    }

    public NineSquaresAdapter(List<ImageSet> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f139787e = list;
        List<ImageSet> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(f139784c.mo192364a(it.next()));
        }
        this.f139785a = arrayList;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_item_nine_image, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        ImageSet imageSet = this.f139787e.get(i);
        Context context = this.f139786d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        bVar.mo192366a(context, imageSet, i);
    }
}
