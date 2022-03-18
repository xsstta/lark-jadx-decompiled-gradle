package com.ss.android.lark.mediapicker.preview.base;

import android.text.TextUtils;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.entity.C44680a;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44615a;
import com.ss.android.lark.mediapicker.preview.base.AbstractC44726b;
import com.ss.android.lark.mediapicker.utils.C44754j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.g */
public class C44734g implements AbstractC44726b.AbstractC44727a {

    /* renamed from: a */
    private List<LocalMedia> f113326a = new ArrayList();

    /* renamed from: b */
    private List<LocalMedia> f113327b = new ArrayList();

    /* renamed from: c */
    private List<LocalMedia> f113328c = new ArrayList();

    /* renamed from: d */
    private MediaPickerConfig f113329d;

    /* renamed from: e */
    private int f113330e;

    /* renamed from: f */
    private boolean f113331f;

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: a */
    public List<LocalMedia> mo158428a() {
        return this.f113327b;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: c */
    public List<LocalMedia> mo158435c() {
        return this.f113328c;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: b */
    public C44733f mo158433b() {
        return new C44733f(this.f113326a, this.f113327b, this.f113330e, this.f113329d, this.f113331f);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: a */
    public void mo158429a(EditInfo editInfo) {
        LocalMedia a = m177431a(editInfo, this.f113326a);
        m177431a(editInfo, this.f113327b);
        m177432a(a);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: e */
    public int mo158438e(int i) {
        return this.f113327b.indexOf(mo158437d(i));
    }

    /* renamed from: b */
    private boolean m177434b(LocalMedia localMedia) {
        for (LocalMedia localMedia2 : this.f113327b) {
            if (localMedia2.getId() == localMedia.getId()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m177432a(LocalMedia localMedia) {
        for (LocalMedia localMedia2 : this.f113328c) {
            if (localMedia2.getId() == localMedia.getId()) {
                localMedia2.setPath(localMedia.getPath());
                return;
            }
        }
        this.f113328c.add(localMedia);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: c */
    public boolean mo158436c(int i) {
        if (this.f113326a.size() <= i || i < 0) {
            return false;
        }
        LocalMedia localMedia = this.f113326a.get(i);
        boolean c = C44754j.m177502c(localMedia.getMimeType());
        boolean b = C44754j.m177501b(localMedia.getMimeType());
        if (c || b) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: d */
    public LocalMedia mo158437d(int i) {
        if (i >= 0 && i < this.f113326a.size()) {
            return this.f113326a.get(i);
        }
        C44677b.m177236a("Index Out Of Bounds, current: " + i + "  size: " + this.f113326a.size());
        return null;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: b */
    public boolean mo158434b(int i) {
        if (this.f113326a.size() <= i || i < 0 || C44754j.m177502c(this.f113326a.get(i).getMimeType()) || !this.f113329d.f113084q) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: a */
    public void mo158430a(C44733f fVar) {
        this.f113326a.clear();
        this.f113326a.addAll(fVar.f113321a);
        this.f113327b.clear();
        this.f113327b.addAll(fVar.f113322b);
        this.f113329d = fVar.f113324d;
        this.f113330e = fVar.f113323c;
        this.f113331f = fVar.f113325e;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: a */
    public boolean mo158431a(int i) {
        if (this.f113326a.size() <= i || i < 0) {
            return false;
        }
        return m177434b(this.f113326a.get(i));
    }

    /* renamed from: a */
    private LocalMedia m177431a(EditInfo editInfo, List<LocalMedia> list) {
        for (LocalMedia localMedia : list) {
            if (localMedia.getId() == editInfo.f113228a) {
                localMedia.setPath(editInfo.f113229b);
                return localMedia;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m177433a(List<LocalMedia> list, MediaPickerConfig mediaPickerConfig) {
        String str;
        if (!mediaPickerConfig.f113070c) {
            if (list.size() > 0) {
                str = list.get(0).getMimeType();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (C44754j.m177502c(str)) {
                if (list.size() >= mediaPickerConfig.f113072e) {
                    return true;
                }
                return false;
            } else if (list.size() >= mediaPickerConfig.f113071d) {
                return true;
            } else {
                return false;
            }
        } else if (list.size() >= mediaPickerConfig.f113073f) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44727a
    /* renamed from: a */
    public boolean mo158432a(int i, AbstractC44615a aVar) {
        String str;
        boolean z;
        LocalMedia localMedia = this.f113326a.get(i);
        if (this.f113327b.size() > 0) {
            str = this.f113327b.get(0).getMimeType();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (C44754j.m177500a(str, localMedia.getMimeType()) || this.f113329d.f113070c) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.mo158123a(new C44680a(-1, ""));
                return false;
            }
        }
        boolean b = m177434b(localMedia);
        if (!m177433a(this.f113327b, this.f113329d) || b) {
            if (b) {
                Iterator<LocalMedia> it = this.f113327b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getId() == localMedia.getId()) {
                            this.f113327b.remove(localMedia);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                this.f113327b.add(localMedia);
                localMedia.setNum(this.f113327b.size());
            }
            return !b;
        }
        aVar.mo158123a(new C44680a(-2, ""));
        return false;
    }
}
