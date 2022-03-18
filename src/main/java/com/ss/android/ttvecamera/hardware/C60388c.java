package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.hardware.c */
public class C60388c extends C60390e {
    @Override // com.ss.android.ttvecamera.hardware.C60390e
    /* renamed from: a */
    public String mo206814a() {
        if (m234626c()) {
            return "3";
        }
        return super.mo206814a();
    }

    /* renamed from: c */
    private static boolean m234626c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    public C60388c(Context context) {
        super(context);
    }

    @Override // com.ss.android.ttvecamera.hardware.C60390e
    /* renamed from: a */
    public void mo206816a(int i, CameraManager cameraManager) {
        if (m234626c()) {
            f150946b = "3";
        } else {
            super.mo206816a(i, cameraManager);
        }
    }
}
