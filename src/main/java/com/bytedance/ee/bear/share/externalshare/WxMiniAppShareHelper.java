package com.bytedance.ee.bear.share.externalshare;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.core.content.ContextCompat;
import androidx.p042i.p043a.p044a.C1106i;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004J+\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0017\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/share/externalshare/WxMiniAppShareHelper;", "", "()V", "DOC_TOKEN", "", "DOC_TYPE", "ID", "PATH_TEMPLATE", "getBitmapFromVectorDrawable", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "resId", "", "getImage", "docType", "subType", "getPath", "docToken", "matchTypes", "", "curType", "types", "", "(Ljava/lang/String;[Ljava/lang/String;)Z", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.externalshare.f */
public final class WxMiniAppShareHelper {

    /* renamed from: a */
    public static final WxMiniAppShareHelper f29629a = new WxMiniAppShareHelper();

    private WxMiniAppShareHelper() {
    }

    /* renamed from: a */
    private final boolean m45870a(String str, String... strArr) {
        if (str != null) {
            for (String str2 : strArr) {
                if (StringsKt.equals(str, str2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final Bitmap m45869a(Context context, int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(drawable, "ContextCompat.getDrawabl…xt, resId) ?: return null");
        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof C1106i)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getMinimumHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public final String mo42009a(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        return StringsKt.replace$default(StringsKt.replace$default("pages/web-view/index?type=doc_type&obj_token=doc_token", "doc_type", String.valueOf(i), false, 4, (Object) null), "doc_token", str, false, 4, (Object) null);
    }

    /* renamed from: a */
    public final Bitmap mo42008a(Context context, int i, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (i == 2) {
            return m45869a(context, R.drawable.miniapp_share_doc_cover);
        }
        if (i == 3) {
            return m45869a(context, R.drawable.miniapp_share_sheet_cover);
        }
        if (i == 11) {
            return m45869a(context, R.drawable.miniapp_share_mindnote_cover);
        }
        if (i != 12) {
            return m45869a(context, R.drawable.miniapp_share_unknown_cover);
        }
        if (m45870a(str, "xls", "xlsx", "xlsm", "csv")) {
            return m45869a(context, R.drawable.miniapp_share_excel_cover);
        }
        if (m45870a(str, "jpg", "jpeg", "png", "bmp", "tif", "tiff", "svg", "raw", "gif", "heic", "heif", "webp")) {
            return m45869a(context, R.drawable.miniapp_share_image_cover);
        }
        if (m45870a(str, "pdf")) {
            return m45869a(context, R.drawable.miniapp_share_pdf_cover);
        }
        if (m45870a(str, "ppt", "pptx", "pps", "ppsx", "pot", "potx")) {
            return m45869a(context, R.drawable.miniapp_share_ppt_cover);
        }
        if (m45870a(str, "txt", "rtf")) {
            return m45869a(context, R.drawable.miniapp_share_text_cover);
        }
        if (m45870a(str, "mp4", "mov", "wmv", "m4v", "avi", "mpg", "mpeg", "rm", "rmvb", "flv", "mkv", "ogv", "ogg")) {
            return m45869a(context, R.drawable.miniapp_share_video_cover);
        }
        if (m45870a(str, "doc", "docx", "dot", "dotx")) {
            return m45869a(context, R.drawable.miniapp_share_word_cover);
        }
        if (m45870a(str, "zip", "rar", "tar", "gz", "tgz", "tarGz", "bz2", "tarBz2", "lzma", "tarLzma", "is7z")) {
            return m45869a(context, R.drawable.miniapp_share_zip_cover);
        }
        return m45869a(context, R.drawable.miniapp_share_unknown_cover);
    }
}
