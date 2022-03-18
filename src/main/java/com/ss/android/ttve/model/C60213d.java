package com.ss.android.ttve.model;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* renamed from: com.ss.android.ttve.model.d */
public class C60213d {

    /* renamed from: a */
    private String f150303a;

    /* renamed from: b */
    private float f150304b;

    /* renamed from: c */
    private float f150305c;

    /* renamed from: d */
    private Map<Integer, Float> f150306d;

    /* renamed from: a */
    public String mo205696a() {
        return this.f150303a;
    }

    /* renamed from: b */
    public float mo205700b() {
        return this.f150304b;
    }

    /* renamed from: c */
    public float mo205702c() {
        return this.f150305c;
    }

    /* renamed from: d */
    public Map<Integer, Float> mo205703d() {
        return this.f150306d;
    }

    public C60213d() {
        this("", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public void mo205697a(float f) {
        this.f150304b = f;
    }

    /* renamed from: b */
    public void mo205701b(float f) {
        this.f150305c = f;
    }

    /* renamed from: a */
    public void mo205698a(String str) {
        this.f150303a = str;
    }

    /* renamed from: a */
    public void mo205699a(Map<Integer, Float> map) {
        Map<Integer, Float> map2 = this.f150306d;
        if (map2 == null) {
            this.f150306d = map;
        } else {
            map2.putAll(map);
        }
    }

    public C60213d(String str, float f, float f2) {
        this.f150303a = str;
        this.f150304b = f;
        this.f150305c = f2;
    }
}
