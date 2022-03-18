package com.ss.android.lark.inv.export.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.inv.export.util.d */
public class C40102d {
    /* renamed from: a */
    public static Bitmap m159001a(View view) {
        Bitmap bitmap;
        if (view == null) {
            return null;
        }
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            boolean willNotCacheDrawing = view.willNotCacheDrawing();
            view.setDrawingCacheEnabled(true);
            view.setWillNotCacheDrawing(false);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                if (!drawingCache.isRecycled()) {
                    bitmap = Bitmap.createBitmap(drawingCache);
                    view.setWillNotCacheDrawing(willNotCacheDrawing);
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    return bitmap;
                }
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 != null) {
                if (!drawingCache2.isRecycled()) {
                    bitmap = Bitmap.createBitmap(drawingCache2);
                    view.setWillNotCacheDrawing(willNotCacheDrawing);
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    return bitmap;
                }
            }
            bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmap));
            view.setWillNotCacheDrawing(willNotCacheDrawing);
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            return bitmap;
        } catch (Exception e) {
            Log.m165386e("InvitationModule", e);
            return null;
        }
    }

    /* renamed from: a */
    public static File m159003a(Bitmap bitmap, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file = new File(str, System.currentTimeMillis() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m159002a(String str, int i, int i2) {
        try {
            return ImageLoader.with(aj.m224263a()).load(str).asBitmap().getBitmap(i, i2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
