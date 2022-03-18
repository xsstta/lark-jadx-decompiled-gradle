package com.ss.android.lark.widget.photo_picker.p2951f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26310o;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.c */
public class C58652c {

    /* renamed from: a */
    private String f144837a;

    /* renamed from: b */
    private Context f144838b;

    /* renamed from: a */
    public void mo198851a() {
        this.f144837a = null;
    }

    /* renamed from: c */
    public String mo198854c() {
        return this.f144837a;
    }

    /* renamed from: d */
    private File m227472d() throws IOException {
        String str = "JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date()) + ".jpg";
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdir()) {
            File file = new File(externalStoragePublicDirectory, str);
            this.f144837a = file.getAbsolutePath();
            return file;
        }
        Log.m165383e("SCREEN_TAG", "Throwing Errors....");
        throw new IOException();
    }

    /* renamed from: e */
    private File m227473e() throws IOException {
        String str = "MP4_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date()) + ".mp4";
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdir()) {
            File file = new File(externalStoragePublicDirectory, str);
            this.f144837a = file.getAbsolutePath();
            return file;
        }
        Log.m165383e("SCREEN_TAG", "Throwing Errors....");
        throw new IOException();
    }

    /* renamed from: b */
    public void mo198853b() {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        if (!TextUtils.isEmpty(this.f144837a)) {
            intent.setData(Uri.fromFile(new File(this.f144837a)));
            this.f144838b.sendBroadcast(intent);
        }
    }

    public C58652c(Context context) {
        this.f144838b = context;
    }

    /* renamed from: a */
    public Intent mo198850a(boolean z) throws IOException {
        Uri a;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (!(intent.resolveActivity(this.f144838b.getPackageManager()) == null || (a = C26310o.m95259a(this.f144838b, m227472d())) == null)) {
            m227471a(intent, z);
            intent.putExtra("output", a);
        }
        return intent;
    }

    /* renamed from: b */
    public Intent mo198852b(boolean z) throws IOException {
        Uri a;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (!(intent.resolveActivity(this.f144838b.getPackageManager()) == null || (a = C26310o.m95259a(this.f144838b, m227473e())) == null)) {
            m227471a(intent, z);
            intent.putExtra("output", a);
            intent.putExtra("android.intent.extra.videoQuality", 1);
        }
        return intent;
    }

    /* renamed from: a */
    private void m227471a(Intent intent, boolean z) {
        if (z) {
            intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }
}
