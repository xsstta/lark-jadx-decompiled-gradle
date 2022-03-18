package com.ss.android.lark.keyboard.plugin.tool.preview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewAdapter$ViewHolder;", "filePaths", "", "", "(Ljava/util/List;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "()Ljava/util/List;", "rvContext", "Landroid/content/Context;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.a */
public final class FilePreviewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private Context f103916a;

    /* renamed from: b */
    private final List<String> f103917b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "fileImage", "Landroid/widget/ImageView;", "fileName", "Landroid/widget/TextView;", "getFileName", "()Landroid/widget/TextView;", "fileSize", "bind", "", "rvContext", "Landroid/content/Context;", "item", "", "position", "", "fileCount", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.a$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: b */
        public static final Companion f103918b = new Companion(null);

        /* renamed from: a */
        public final ImageView f103919a;

        /* renamed from: c */
        private final TextView f103920c;

        /* renamed from: d */
        private final TextView f103921d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewAdapter$ViewHolder$Companion;", "", "()V", "MIMETYPE_IMAGE_PREFIX", "", "MIMETYPE_VIDEO_PREFIX", "from", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.a$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ViewHolder mo147483a(ViewGroup viewGroup) {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_dialog_list_rv, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                return new ViewHolder(inflate, null);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.a$a$b */
        public static final class RunnableC40888b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f103922a;

            /* renamed from: b */
            final /* synthetic */ Context f103923b;

            /* renamed from: c */
            final /* synthetic */ File f103924c;

            RunnableC40888b(ViewHolder aVar, Context context, File file) {
                this.f103922a = aVar;
                this.f103923b = context;
                this.f103924c = file;
            }

            public final void run() {
                ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f103923b).mo10411a(this.f103924c).mo11145c(true)).mo11129a(AbstractC2354j.f7812b)).mo10399a(this.f103922a.f103919a);
            }
        }

        private ViewHolder(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tv_file_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_file_name)");
            this.f103920c = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_file_size);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_file_size)");
            this.f103921d = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_file_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_file_image)");
            this.f103919a = (ImageView) findViewById3;
        }

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* renamed from: a */
        public final void mo147482a(Context context, String str, int i, int i2) {
            int i3;
            Intrinsics.checkParameterIsNotNull(context, "rvContext");
            Intrinsics.checkParameterIsNotNull(str, "item");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.divider_line);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider_line");
            boolean z = true;
            if (i == i2 - 1) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            findViewById.setVisibility(i3);
            File file = new File(str);
            String c = C26311p.m95283c(str);
            Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
            String str2 = c;
            if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "video/", false, 2, (Object) null)) {
                z = false;
            }
            this.f103920c.setText(file.getName());
            this.f103921d.setText(C26311p.m95266a(file));
            if (z) {
                this.f103919a.post(new RunnableC40888b(this, context, file));
            } else {
                this.f103919a.setImageResource(C57881t.m224626c(c, file.getName()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f103917b.size();
    }

    public FilePreviewAdapter(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "filePaths");
        this.f103917b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f103916a = context;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return ViewHolder.f103918b.mo147483a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        String str = this.f103917b.get(i);
        Context context = this.f103916a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvContext");
        }
        aVar.mo147482a(context, str, i, this.f103917b.size());
    }
}
