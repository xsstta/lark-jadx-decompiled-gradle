package com.ss.android.lark.mediapicker.preview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.dependency.LoadOption;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.preview.base.AbstractC44726b;
import com.ss.android.lark.mediapicker.preview.base.C44738i;
import com.ss.android.lark.mediapicker.utils.C44743b;
import com.ss.android.lark.mediapicker.utils.C44749f;
import com.ss.android.lark.mediapicker.utils.C44753h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mediapicker/preview/EditorPreviewView;", "Lcom/ss/android/lark/mediapicker/preview/DefaultPreviewView;", "()V", "editBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "activity", "Landroidx/fragment/app/FragmentActivity;", "holder", "Lcom/ss/android/lark/mediapicker/preview/base/PreviewViewHolder;", "media", "Lcom/ss/android/lark/mediapicker/entity/LocalMedia;", "loadEditor", "onInitViews", "Companion", "mediapicker_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.mediapicker.preview.b */
public final class EditorPreviewView extends C44717a {

    /* renamed from: a */
    public static final Companion f113298a = new Companion(null);

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onSuccess"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.mediapicker.preview.b$b */
    public static final class C44718b<T> implements C44675a.AbstractC44676a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ EditorPreviewView f113299a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f113300b;

        /* renamed from: c */
        final /* synthetic */ C44738i f113301c;

        /* renamed from: d */
        final /* synthetic */ LocalMedia f113302d;

        C44718b(EditorPreviewView bVar, FragmentActivity fragmentActivity, C44738i iVar, LocalMedia localMedia) {
            this.f113299a = bVar;
            this.f113300b = fragmentActivity;
            this.f113301c = iVar;
            this.f113302d = localMedia;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mediapicker/preview/EditorPreviewView$Companion;", "", "()V", "TAG", "", "mediapicker_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.mediapicker.preview.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.mediapicker.preview.b$c */
    static final class View$OnClickListenerC44719c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditorPreviewView f113303a;

        /* renamed from: b */
        final /* synthetic */ C44738i f113304b;

        View$OnClickListenerC44719c(EditorPreviewView bVar, C44738i iVar) {
            this.f113303a = bVar;
            this.f113304b = iVar;
        }

        public final void onClick(View view) {
            AbstractC44726b.AbstractC44728b.AbstractC44729a aVar = this.f113303a.f113308c;
            ViewPager viewPager = this.f113304b.f113338c;
            Intrinsics.checkExpressionValueIsNotNull(viewPager, "holder.viewPager");
            LocalMedia d = aVar.mo158444d(viewPager.getCurrentItem());
            if (d != null) {
                EditorPreviewView bVar = this.f113303a;
                FragmentActivity fragmentActivity = bVar.f113307b;
                Intrinsics.checkExpressionValueIsNotNull(fragmentActivity, "activity");
                bVar.mo158405a(fragmentActivity, this.f113304b, d);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.preview.C44717a, com.ss.android.lark.mediapicker.preview.base.AbstractC44720a
    /* renamed from: a */
    public void mo158403a(C44738i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "holder");
        super.mo158403a(iVar);
        FrameLayout frameLayout = iVar.f113344i;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "holder.editContainer");
        frameLayout.setVisibility(8);
        FragmentActivity fragmentActivity = this.f113307b;
        Intrinsics.checkExpressionValueIsNotNull(fragmentActivity, "activity");
        int c = C44749f.m177491c(fragmentActivity.getApplicationContext());
        iVar.f113344i.setBackgroundColor(-16777216);
        iVar.f113344i.setPadding(0, c, 0, 0);
        iVar.f113339d.setOnClickListener(new View$OnClickListenerC44719c(this, iVar));
    }

    /* renamed from: a */
    public final void mo158405a(FragmentActivity fragmentActivity, C44738i iVar, LocalMedia localMedia) {
        LoadOption.C44674a a = new LoadOption.C44674a().mo158282c(true).mo158276a(LoadOption.MediaDiskCacheStrategy.ALL);
        long a2 = C44753h.m177493a(new File(localMedia.getPath()));
        C44677b.m177240c("EditorPreviewView->" + "loadEditor fileSize: " + a2);
        int[] iArr = this.f113311f.f113324d.f113067F;
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            a.mo158275a(C44749f.m177489a(fragmentActivity2)).mo158279b(C44749f.m177490b(fragmentActivity2));
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(localMedia.getPath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            C44677b.m177240c("loadEditor origin width: " + i + " height:" + i2);
            int[] a3 = C44743b.m177484a(iVar.f113344i, i, i2, iArr[0], iArr[1]);
            if (a3 == null || a3[0] <= 0 || a3[1] <= 0) {
                C44677b.m177236a("EditorPreviewView->error previewBounds is not valid");
                fragmentActivity.finish();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("EditorPreviewView->previewBounds: previewBounds[0] = ");
            if (a3 == null) {
                Intrinsics.throwNpe();
            }
            sb.append(a3[0]);
            sb.append(" previewBounds[1] = ");
            sb.append(a3[1]);
            C44677b.m177240c(sb.toString());
            a.mo158275a(a3[0]).mo158279b(a3[1]);
        }
        C44675a.m177226a(fragmentActivity, localMedia.getPath(), iVar.f113344i, a.mo158278a(), new C44718b(this, fragmentActivity, iVar, localMedia));
    }
}
