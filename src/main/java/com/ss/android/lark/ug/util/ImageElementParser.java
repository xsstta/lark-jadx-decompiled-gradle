package com.ss.android.lark.ug.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.lark.pb.ug_reach.CdnImageElement;
import com.ss.android.lark.pb.ug_reach.ImageElement;
import com.ss.android.lark.pb.ug_reach.RawImageElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/util/ImageElementParser;", "", "()V", "decode", "", "byteArray", "secrets", "Lokio/ByteString;", "", "input", "getBitmap", "Landroid/graphics/Bitmap;", "image", "Lcom/ss/android/lark/pb/ug_reach/ImageElement;", "getUrl", "isBytesImage", "", "isUrlImage", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.j.a */
public final class ImageElementParser {

    /* renamed from: a */
    public static final ImageElementParser f141733a = new ImageElementParser();

    /* renamed from: a */
    private final String m223305a(String str, ByteString byteString) {
        return str;
    }

    /* renamed from: a */
    private final byte[] m223306a(byte[] bArr, ByteString byteString) {
        return bArr;
    }

    private ImageElementParser() {
    }

    /* renamed from: a */
    public final boolean mo195204a(ImageElement imageElement) {
        Intrinsics.checkParameterIsNotNull(imageElement, "image");
        if (imageElement.mtype == ImageElement.ImageType.RAW_CDN_URL || imageElement.mtype == ImageElement.ImageType.ENCRYPTED_CDN_URL) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo195205b(ImageElement imageElement) {
        Intrinsics.checkParameterIsNotNull(imageElement, "image");
        if (imageElement.mtype == ImageElement.ImageType.RAW_BYTES || imageElement.mtype == ImageElement.ImageType.ENCRYPTED_BYTES) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String mo195206c(ImageElement imageElement) {
        String str;
        Intrinsics.checkParameterIsNotNull(imageElement, "image");
        CdnImageElement cdnImageElement = imageElement.mcdn_image;
        if (cdnImageElement == null || (str = cdnImageElement.murl) == null) {
            return null;
        }
        if (imageElement.mtype != ImageElement.ImageType.ENCRYPTED_CDN_URL) {
            return str;
        }
        ByteString byteString = cdnImageElement.msecrets;
        if (byteString == null) {
            return null;
        }
        String str2 = cdnImageElement.murl;
        Intrinsics.checkExpressionValueIsNotNull(str2, "cdnImage.murl");
        return m223305a(str2, byteString);
    }

    /* renamed from: d */
    public final Bitmap mo195207d(ImageElement imageElement) {
        ByteString byteString;
        byte[] byteArray;
        Intrinsics.checkParameterIsNotNull(imageElement, "image");
        RawImageElement rawImageElement = imageElement.mraw_image;
        if (rawImageElement == null || (byteString = rawImageElement.mraw_data) == null || (byteArray = byteString.toByteArray()) == null) {
            return null;
        }
        if (imageElement.mtype == ImageElement.ImageType.ENCRYPTED_BYTES) {
            ByteString byteString2 = rawImageElement.msecrets;
            if (byteString2 == null) {
                return null;
            }
            byteArray = m223306a(byteArray, byteString2);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }
}
