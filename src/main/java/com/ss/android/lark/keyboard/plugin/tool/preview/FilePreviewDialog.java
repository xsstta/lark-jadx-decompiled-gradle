package com.ss.android.lark.keyboard.plugin.tool.preview;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0016\u0010 \u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "ctx", "Landroid/content/Context;", "filePaths", "", "", "mCallBack", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;", "(Landroid/content/Context;Ljava/util/List;Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;)V", "cstSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "getFilePaths", "()Ljava/util/List;", "isSingleImageView", "", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "hideImagePreviewAndShowListPreview", "", "hideListPreviewAndShowImagePreview", "initButtons", "initSendFileText", "isCopiedImage", "fileName", "loadImagePreview", "filePath", "loadListPreview", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setPreviewType", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.b */
public final class FilePreviewDialog extends BaseDialog {

    /* renamed from: b */
    public static final Companion f103925b = new Companion(null);

    /* renamed from: a */
    public final FilePreviewDialogCallback f103926a;

    /* renamed from: c */
    private C0689b f103927c;

    /* renamed from: d */
    private boolean f103928d;

    /* renamed from: e */
    private final List<String> f103929e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialog$Companion;", "", "()V", "BTN_MARGIN_TOP", "", "IMAGE_MIME_TYPE_PREFIX", "", "ITEM_HEIGHT", "", "ITEM_LIST_MAX_HEIGHT", "VIDEO_MIME_TYPE_PREFIX", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<String> mo147485a() {
        return this.f103929e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.b$e */
    public static final class RunnableC40892e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FilePreviewDialog f103933a;

        /* renamed from: b */
        final /* synthetic */ File f103934b;

        /* renamed from: c */
        final /* synthetic */ ImageView f103935c;

        RunnableC40892e(FilePreviewDialog bVar, File file, ImageView imageView) {
            this.f103933a = bVar;
            this.f103934b = file;
            this.f103935c = imageView;
        }

        public final void run() {
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f103933a.getContext()).mo10411a(this.f103934b).mo11145c(true)).mo11129a(AbstractC2354j.f7812b)).mo10399a(this.f103935c);
        }
    }

    /* renamed from: f */
    private final void m161919f() {
        ((ImageView) findViewById(R.id.iv_cancel)).setOnClickListener(new View$OnClickListenerC40889b(this));
        ((TextView) findViewById(R.id.btn_send)).setOnClickListener(new View$OnClickListenerC40890c(this));
        ((TextView) findViewById(R.id.btn_cancel)).setOnClickListener(new View$OnClickListenerC40891d(this));
    }

    /* renamed from: b */
    private final void m161914b() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_dragged_files);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_dragged_files");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rv_dragged_files);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_dragged_files");
        recyclerView2.setAdapter(new FilePreviewAdapter(this.f103929e));
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rv_dragged_files);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rv_dragged_files");
        ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
        layoutParams.height = UIHelper.dp2px(Math.min((((float) this.f103929e.size()) * 60.0f) + 2.0f, 343.0f));
        RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rv_dragged_files);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "rv_dragged_files");
        recyclerView4.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private final void m161916c() {
        C0689b bVar = new C0689b();
        this.f103927c = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cstSet");
        }
        bVar.mo3901b((ConstraintLayout) findViewById(R.id.dialog_preview));
        bVar.mo3883a(R.id.btn_send, 3, R.id.rv_dragged_files, 4, 30);
        bVar.mo3883a(R.id.btn_cancel, 3, R.id.rv_dragged_files, 4, 30);
        bVar.mo3905c((ConstraintLayout) findViewById(R.id.dialog_preview));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_dragged_files);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_dragged_files");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.cl_image_preview);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "cl_image_preview");
        constraintLayout.setVisibility(8);
        recyclerView.setVisibility(0);
    }

    /* renamed from: d */
    private final void m161917d() {
        C0689b bVar = new C0689b();
        this.f103927c = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cstSet");
        }
        bVar.mo3901b((ConstraintLayout) findViewById(R.id.dialog_preview));
        bVar.mo3883a(R.id.btn_send, 3, R.id.cl_image_preview, 4, 30);
        bVar.mo3883a(R.id.btn_cancel, 3, R.id.cl_image_preview, 4, 30);
        bVar.mo3905c((ConstraintLayout) findViewById(R.id.dialog_preview));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.cl_image_preview);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "cl_image_preview");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_dragged_files);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_dragged_files");
        recyclerView.setVisibility(8);
        constraintLayout.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m161918e() {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialog.m161918e():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.b$b */
    public static final class View$OnClickListenerC40889b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilePreviewDialog f103930a;

        View$OnClickListenerC40889b(FilePreviewDialog bVar) {
            this.f103930a = bVar;
        }

        public final void onClick(View view) {
            this.f103930a.f103926a.mo122058a(this.f103930a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.b$d */
    public static final class View$OnClickListenerC40891d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilePreviewDialog f103932a;

        View$OnClickListenerC40891d(FilePreviewDialog bVar) {
            this.f103932a = bVar;
        }

        public final void onClick(View view) {
            this.f103932a.f103926a.mo122058a(this.f103932a);
        }
    }

    /* renamed from: b */
    private final boolean m161915b(String str) {
        return StringsKt.endsWith$default(str, ".0", false, 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.e.b$c */
    public static final class View$OnClickListenerC40890c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilePreviewDialog f103931a;

        View$OnClickListenerC40890c(FilePreviewDialog bVar) {
            this.f103931a = bVar;
        }

        public final void onClick(View view) {
            FilePreviewDialogCallback cVar = this.f103931a.f103926a;
            FilePreviewDialog bVar = this.f103931a;
            cVar.mo122059a(bVar, bVar.mo147485a());
        }
    }

    /* renamed from: a */
    private final boolean m161913a(List<String> list) {
        String str = list.get(0);
        String c = C26311p.m95283c(str);
        if (list.size() != 1) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
        String str2 = c;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "video/", false, 2, (Object) null) || m161915b(str)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 66) {
            return ((TextView) findViewById(R.id.btn_send)).performClick();
        }
        if (keyCode != 111) {
            return false;
        }
        return ((TextView) findViewById(R.id.btn_cancel)).performClick();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.f103929e.isEmpty()) {
            requestWindowFeature(1);
            setContentView(R.layout.dialog_list_rv);
            m161918e();
            m161919f();
            if (this.f103928d) {
                m161917d();
                m161912a((String) CollectionsKt.single((List) this.f103929e));
                return;
            }
            m161916c();
            m161914b();
        }
    }

    /* renamed from: a */
    private final void m161912a(String str) {
        String str2;
        File file = new File(str);
        if (!file.exists()) {
            dismiss();
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.iv_image_preview);
        if (imageView != null) {
            TextView textView = (TextView) findViewById(R.id.tv_screen_shot_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_screen_shot_name");
            if (m161915b(str)) {
                str2 = getContext().getString(R.string.Lark_Legacy_PastedImagepng);
            } else {
                str2 = file.getName();
            }
            textView.setText(str2);
            TextView textView2 = (TextView) findViewById(R.id.tv_screen_shot_size);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_screen_shot_size");
            textView2.setText(C26311p.m95266a(file));
            ((ImageView) findViewById(R.id.iv_image_preview)).post(new RunnableC40892e(this, file, imageView));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilePreviewDialog(Context context, List<String> list, FilePreviewDialogCallback cVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(list, "filePaths");
        Intrinsics.checkParameterIsNotNull(cVar, "mCallBack");
        this.f103929e = list;
        this.f103926a = cVar;
        this.f103928d = m161913a(list);
    }
}
