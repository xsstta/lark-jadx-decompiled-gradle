package com.bytedance.ee.bear.photopicker.photo.p520a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.photopicker.photo.C10524b;
import com.bytedance.ee.bear.photopicker.photo.ErrorResult;
import com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import com.ss.android.lark.widget.photo_picker.p2951f.C58654f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.a.a */
public class C10499a implements AbstractC10513d.AbstractC10514a {

    /* renamed from: a */
    public final List<Photo> f28236a = new ArrayList();

    /* renamed from: b */
    public final List<Photo> f28237b = new ArrayList();

    /* renamed from: c */
    private final String f28238c = "AlbumModel";

    /* renamed from: d */
    private FileSelectConfig f28239d;

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: a */
    public List<Photo> mo39861a() {
        return this.f28237b;
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: b */
    public void mo39867b() {
        this.f28237b.clear();
    }

    /* renamed from: c */
    private void m43536c() {
        int size = this.f28237b.size();
        int i = 0;
        while (i < size) {
            i++;
            this.f28237b.get(i).setNum(i);
        }
    }

    /* renamed from: a */
    private boolean m43534a(Photo photo) {
        return this.f28237b.contains(photo);
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: a */
    public List<Photo> mo39862a(List<Photo> list) {
        if (list != null) {
            this.f28237b.clear();
            this.f28237b.addAll(list);
            m43536c();
        }
        return this.f28237b;
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: a */
    public void mo39863a(Context context, AbstractC10513d.AbstractC10514a.AbstractC10516b bVar) {
        m43533a(context, false, bVar);
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: b */
    public void mo39868b(Context context, AbstractC10513d.AbstractC10514a.AbstractC10516b bVar) {
        m43533a(context, true, bVar);
    }

    /* renamed from: a */
    private boolean m43535a(List<Photo> list, FileSelectConfig fileSelectConfig) {
        String str;
        if (fileSelectConfig.mixSelect) {
            if (list.size() >= fileSelectConfig.maxSelectMediaNum) {
                return true;
            }
            return false;
        } else if (fileSelectConfig.maxSelectImageNum <= 0) {
            return true;
        } else {
            if (list.size() > 0) {
                str = list.get(0).getMimeType();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (C10524b.m43606b(str)) {
                if (list.size() >= 1) {
                    return true;
                }
                return false;
            } else if (list.size() >= fileSelectConfig.maxSelectImageNum) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: a */
    public void mo39864a(FileSelectConfig fileSelectConfig, ArrayList<Photo> arrayList) {
        this.f28237b.clear();
        if (arrayList != null) {
            this.f28237b.addAll(arrayList);
        }
        m43536c();
        this.f28239d = fileSelectConfig;
    }

    /* renamed from: a */
    public void mo39865a(List<Photo> list, List<Photo> list2) {
        Iterator<Photo> it = list2.iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                it.remove();
            }
        }
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a
    /* renamed from: a */
    public boolean mo39866a(Photo photo, AbstractC10513d.AbstractC10514a.AbstractC10515a aVar) {
        String str;
        boolean z;
        if (this.f28237b.size() > 0) {
            str = this.f28237b.get(0).getMimeType();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (C10524b.m43605a(str, photo.getMimeType()) || this.f28239d.mixSelect) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.mo39882a(new ErrorResult(ErrorResult.CheckMediaError.CANNOT_CHECK_BOTH_TYPE, ""));
                return false;
            }
        }
        boolean a = m43534a(photo);
        if (!m43535a(this.f28237b, this.f28239d) || a) {
            if (a) {
                Iterator<Photo> it = this.f28237b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getId() == photo.getId()) {
                            it.remove();
                            m43536c();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                this.f28237b.add(photo);
                photo.setNum(this.f28237b.size());
            }
            return !a;
        }
        aVar.mo39882a(new ErrorResult(ErrorResult.CheckMediaError.CANNOT_CHECK_MORE_THAN_SET, ""));
        return false;
    }

    /* renamed from: a */
    private void m43533a(Context context, final boolean z, final AbstractC10513d.AbstractC10514a.AbstractC10516b bVar) {
        boolean z2;
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_GIF", this.f28239d.showGif);
        if (this.f28239d.showVideo || this.f28239d.mixSelect) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle.putBoolean("SHOW_VIDEO", z2);
        C58654f.m227489a((FragmentActivity) context, bundle, new C58654f.AbstractC58658c() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.C10499a.C105001 */

            @Override // com.ss.android.lark.widget.photo_picker.p2951f.C58654f.AbstractC58658c
            /* renamed from: a */
            public void mo39869a(List<PhotoDirectory> list) {
                Object obj;
                C10499a.this.f28236a.clear();
                if (!list.isEmpty()) {
                    PhotoDirectory photoDirectory = list.get(0);
                    C10499a.this.f28236a.addAll(photoDirectory.getPhotos());
                    StringBuilder sb = new StringBuilder();
                    sb.append("getPhotoDirs dirs photos = ");
                    if (photoDirectory.getPhotos() == null) {
                        obj = "null";
                    } else {
                        obj = Integer.valueOf(photoDirectory.getPhotos().size());
                    }
                    sb.append(obj);
                    Log.m165389i("AlbumModel", sb.toString());
                } else {
                    Log.m165389i("AlbumModel", "getPhotoDirs dirs is Empty");
                }
                if (z) {
                    C10499a aVar = C10499a.this;
                    aVar.mo39865a(aVar.f28236a, C10499a.this.f28237b);
                }
                AbstractC10513d.AbstractC10514a.AbstractC10516b bVar = bVar;
                if (bVar != null) {
                    bVar.mo39878a(C10499a.this.f28236a, C10499a.this.f28237b);
                }
            }
        });
    }
}
