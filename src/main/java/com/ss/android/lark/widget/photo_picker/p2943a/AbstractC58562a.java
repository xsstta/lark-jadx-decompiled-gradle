package com.ss.android.lark.widget.photo_picker.p2943a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.a.a */
public abstract class AbstractC58562a<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: d */
    protected List<PhotoDirectory> f144569d = new ArrayList();

    /* renamed from: e */
    int f144570e;

    /* renamed from: f */
    List<Photo> f144571f = new ArrayList();

    /* renamed from: com.ss.android.lark.widget.photo_picker.a.a$a */
    public interface AbstractC58563a<T> {
        /* renamed from: a */
        boolean mo198544a(T t);
    }

    /* renamed from: c */
    public List<Photo> mo198540c() {
        return this.f144571f;
    }

    /* renamed from: d */
    public int mo198541d() {
        return this.f144570e;
    }

    /* renamed from: b */
    public int mo198538b() {
        return this.f144571f.size();
    }

    /* renamed from: a */
    public void mo198535a() {
        this.f144571f.clear();
        notifyDataSetChanged();
    }

    /* renamed from: e */
    public List<Photo> mo198542e() {
        int size = this.f144569d.size();
        int i = this.f144570e;
        if (size > i) {
            return this.f144569d.get(i).getPhotos();
        }
        return new ArrayList();
    }

    /* renamed from: f */
    public boolean mo198543f() {
        for (Photo photo : this.f144571f) {
            if (photo.isVideo()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo198536a(int i) {
        this.f144570e = i;
    }

    /* renamed from: a */
    public boolean mo198537a(Photo photo) {
        return this.f144571f.contains(photo);
    }

    /* renamed from: b */
    public void mo198539b(Photo photo) {
        if (this.f144571f.contains(photo)) {
            this.f144571f.remove(photo);
        } else if (photo != null) {
            this.f144571f.add(photo);
        }
    }

    /* renamed from: a */
    public static <T> void m227167a(List<T> list, AbstractC58563a<T> aVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (aVar != null && !aVar.mo198544a(it.next())) {
                it.remove();
            }
        }
    }
}
