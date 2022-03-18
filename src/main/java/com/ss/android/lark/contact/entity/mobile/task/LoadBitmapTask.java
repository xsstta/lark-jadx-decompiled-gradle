package com.ss.android.lark.contact.entity.mobile.task;

import android.app.Application;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.utils.aj;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0014R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/task/LoadBitmapTask;", "Landroid/os/AsyncTask;", "", "Landroid/graphics/Bitmap;", "avatarTv", "Landroid/widget/TextView;", "avatarIv", "Landroid/widget/ImageView;", "bean", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "(Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;)V", "avatarIvRef", "Ljava/lang/ref/WeakReference;", "avatarTvRef", "doInBackground", "objects", "", "([Ljava/lang/Object;)Landroid/graphics/Bitmap;", "onPostExecute", "", "bitmap", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.mobile.b.a */
public final class LoadBitmapTask extends AsyncTask<Object, Object, Bitmap> {

    /* renamed from: a */
    private final WeakReference<TextView> f91484a;

    /* renamed from: b */
    private final WeakReference<ImageView> f91485b;

    /* renamed from: c */
    private final ContactMobileBean f91486c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        if (this.f91485b.get() == null) {
            return;
        }
        if (bitmap != null) {
            ImageView imageView = this.f91485b.get();
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setImageBitmap(bitmap);
                return;
            }
            return;
        }
        TextView textView = this.f91484a.get();
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(this.f91486c.getAvatarName());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap doInBackground(Object... objArr) {
        byte[] blob;
        Intrinsics.checkParameterIsNotNull(objArr, "objects");
        ByteArrayInputStream byteArrayInputStream = null;
        Application a = aj.m224263a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Utils.getApp()");
        Cursor query = a.getContentResolver().query(Uri.parse(this.f91486c.getAvatarUri()), new String[]{"data15"}, null, null, null);
        if (query == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(query, "Utils.getApp().contentRe…     null) ?: return null");
        try {
            if (query.moveToFirst() && (blob = query.getBlob(0)) != null) {
                byteArrayInputStream = new ByteArrayInputStream(blob);
            }
            query.close();
            return BitmapFactory.decodeStream(byteArrayInputStream);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public LoadBitmapTask(TextView textView, ImageView imageView, ContactMobileBean contactMobileBean) {
        Intrinsics.checkParameterIsNotNull(textView, "avatarTv");
        Intrinsics.checkParameterIsNotNull(imageView, "avatarIv");
        Intrinsics.checkParameterIsNotNull(contactMobileBean, "bean");
        this.f91486c = contactMobileBean;
        textView.setVisibility(8);
        imageView.setVisibility(8);
        this.f91484a = new WeakReference<>(textView);
        this.f91485b = new WeakReference<>(imageView);
    }
}
