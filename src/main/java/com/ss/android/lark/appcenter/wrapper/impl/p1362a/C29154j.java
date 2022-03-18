package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.android.appcenter.business.activity.appfeedback.Photo;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27544i;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.j */
public class C29154j implements AbstractC27544i {
    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27544i
    /* renamed from: a */
    public List<Photo> mo98197a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) intent.getSerializableExtra("KEY_SELECTED_MEDIA")).iterator();
        while (it.hasNext()) {
            com.ss.android.lark.widget.photo_picker.entity.Photo photo = (com.ss.android.lark.widget.photo_picker.entity.Photo) it.next();
            arrayList.add(new Photo(photo.getId(), photo.getPath(), photo.getMimeType(), photo.getDuration(), photo.getWidth(), photo.getHeight(), photo.getSize()));
        }
        return arrayList;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27544i
    /* renamed from: a */
    public void mo98198a(Activity activity, int i, List<Photo> list) {
        ArrayList<com.ss.android.lark.widget.photo_picker.entity.Photo> arrayList = new ArrayList<>();
        for (Photo photo : list) {
            arrayList.add(new com.ss.android.lark.widget.photo_picker.entity.Photo(photo.getId(), photo.getPath(), photo.getMimeType(), photo.getDuration(), photo.getWidth(), photo.getHeight(), photo.getSize()));
        }
        C58557a.m227127a().mo198506a(i).mo198526i(false).mo198531n(false).mo198528k(false).mo198522f(2).mo198530m(true).mo198508a(arrayList).mo198534q(true).mo198510a(activity, 233);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27544i
    /* renamed from: a */
    public void mo98199a(Context context, List<String> list, int i, View view, int i2, boolean z) {
        C58630d.m227365a(context, list, i, view, BaseData.AnimationType.ALPHA_ANIMATION, false);
    }
}
