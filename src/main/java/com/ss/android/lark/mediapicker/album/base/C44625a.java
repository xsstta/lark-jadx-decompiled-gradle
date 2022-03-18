package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.loader.p045a.AbstractC1181a;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44653g;
import com.ss.android.lark.mediapicker.entity.C44680a;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44615a;
import com.ss.android.lark.mediapicker.p2242b.C44668a;
import com.ss.android.lark.mediapicker.utils.C44754j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.a */
public class C44625a implements AbstractC44653g.AbstractC44654a {

    /* renamed from: a */
    public List<LocalMediaFolder> f113109a = new ArrayList();

    /* renamed from: b */
    public List<LocalMedia> f113110b = new ArrayList();

    /* renamed from: c */
    public List<LocalMedia> f113111c = new ArrayList();

    /* renamed from: d */
    private SparseArray<EditInfo> f113112d = new SparseArray<>(2);

    /* renamed from: e */
    private MediaPickerConfig f113113e;

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: a */
    public List<LocalMedia> mo158163a() {
        return this.f113111c;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: c */
    public List<LocalMedia> mo158173c() {
        return this.f113110b;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: d */
    public void mo158174d() {
        this.f113111c.clear();
    }

    /* renamed from: e */
    private void m177019e() {
        int size = this.f113111c.size();
        int i = 0;
        while (i < size) {
            i++;
            this.f113111c.get(i).setNum(i);
        }
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: b */
    public List<LocalMedia> mo158170b() {
        ArrayList arrayList = new ArrayList(this.f113112d.size());
        for (LocalMedia localMedia : this.f113110b) {
            if (this.f113112d.get(localMedia.getId()) != null) {
                arrayList.add(localMedia);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: b */
    public List<LocalMedia> mo158171b(List<LocalMedia> list) {
        this.f113111c.clear();
        this.f113111c.addAll(list);
        m177019e();
        return this.f113111c;
    }

    /* renamed from: a */
    private boolean m177017a(LocalMedia localMedia) {
        for (LocalMedia localMedia2 : this.f113111c) {
            if (localMedia2.getId() == localMedia.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: a */
    public void mo158166a(EditInfo editInfo) {
        this.f113112d.put(editInfo.f113228a, editInfo);
        Iterator<LocalMedia> it = this.f113110b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LocalMedia next = it.next();
            if (next.getId() == editInfo.f113228a) {
                next.setPath(editInfo.f113229b);
                break;
            }
        }
        for (LocalMedia localMedia : this.f113111c) {
            if (localMedia.getId() == editInfo.f113228a) {
                localMedia.setPath(editInfo.f113229b);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo158167a(List<LocalMedia> list) {
        for (LocalMedia localMedia : list) {
            EditInfo editInfo = this.f113112d.get(localMedia.getId());
            if (editInfo != null && !TextUtils.isEmpty(editInfo.f113229b)) {
                localMedia.setPath(editInfo.f113229b);
            }
        }
    }

    /* renamed from: a */
    private boolean m177018a(List<LocalMedia> list, MediaPickerConfig mediaPickerConfig) {
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

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: a */
    public void mo158165a(MediaPickerConfig mediaPickerConfig, ArrayList<LocalMedia> arrayList) {
        this.f113111c.clear();
        if (arrayList != null) {
            this.f113111c.addAll(arrayList);
        }
        m177019e();
        this.f113113e = mediaPickerConfig;
    }

    /* renamed from: a */
    public void mo158168a(List<LocalMedia> list, List<LocalMedia> list2) {
        Iterator<LocalMedia> it = list2.iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                it.remove();
            }
        }
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: a */
    public boolean mo158169a(LocalMedia localMedia, AbstractC44615a aVar) {
        String str;
        boolean z;
        if (this.f113111c.size() > 0) {
            str = this.f113111c.get(0).getMimeType();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (C44754j.m177500a(str, localMedia.getMimeType()) || this.f113113e.f113070c) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.mo158123a(new C44680a(-1, ""));
                return false;
            }
        }
        boolean a = m177017a(localMedia);
        if (!m177018a(this.f113111c, this.f113113e) || a) {
            if (a) {
                Iterator<LocalMedia> it = this.f113111c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getId() == localMedia.getId()) {
                            it.remove();
                            m177019e();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                this.f113111c.add(localMedia);
                localMedia.setNum(this.f113111c.size());
            }
            return !a;
        }
        aVar.mo158123a(new C44680a(-2, ""));
        return false;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: a */
    public void mo158164a(AbstractC1181a aVar, Context context, AbstractC44658h hVar) {
        m177016a(aVar, context, false, hVar);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44654a
    /* renamed from: b */
    public void mo158172b(AbstractC1181a aVar, Context context, AbstractC44658h hVar) {
        m177016a(aVar, context, true, hVar);
    }

    /* renamed from: a */
    private void m177016a(AbstractC1181a aVar, Context context, final boolean z, final AbstractC44658h hVar) {
        boolean z2;
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_GIF", this.f113113e.f113078k);
        if (this.f113113e.f113069b || this.f113113e.f113070c) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle.putBoolean("SHOW_VIDEO", z2);
        C44668a.m177180a(aVar, context, bundle, new C44668a.AbstractC44672c() {
            /* class com.ss.android.lark.mediapicker.album.base.C44625a.C446261 */

            @Override // com.ss.android.lark.mediapicker.p2242b.C44668a.AbstractC44672c
            /* renamed from: a */
            public void mo158175a(List<LocalMediaFolder> list) {
                C44625a.this.f113109a.clear();
                C44625a.this.f113110b.clear();
                if (!list.isEmpty()) {
                    C44625a.this.f113109a.addAll(list);
                    C44625a.this.f113110b.addAll(list.get(0).getLocalMedia());
                    C44625a aVar = C44625a.this;
                    aVar.mo158167a(aVar.f113110b);
                }
                if (z) {
                    C44625a aVar2 = C44625a.this;
                    aVar2.mo158168a(aVar2.f113110b, C44625a.this.f113111c);
                }
                AbstractC44658h hVar = hVar;
                if (hVar != null) {
                    hVar.mo158188a(C44625a.this.f113109a, C44625a.this.f113110b, C44625a.this.f113111c);
                }
            }
        });
    }
}
