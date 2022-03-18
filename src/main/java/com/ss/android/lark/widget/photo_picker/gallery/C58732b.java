package com.ss.android.lark.widget.photo_picker.gallery;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.AbstractC58687a;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58694b;
import com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.b */
public class C58732b extends AbstractC58687a<PhotoItem> {

    /* renamed from: a */
    private final IRequestCreator f145151a;

    /* renamed from: b */
    private final List<PhotoItem> f145152b;

    /* renamed from: c */
    private int f145153c;

    /* renamed from: d */
    private boolean f145154d;

    /* renamed from: e */
    private boolean f145155e = true;

    /* renamed from: f */
    private AbstractC58733a f145156f;

    /* renamed from: g */
    private OnDialogMenuClickListener f145157g;

    /* renamed from: h */
    private OnChatAlbumClickListener f145158h;

    /* renamed from: i */
    private final SparseArray<AbstractC58617a> f145159i = new SparseArray<>();

    /* renamed from: j */
    private boolean f145160j = false;

    /* renamed from: k */
    private boolean f145161k = false;

    /* renamed from: l */
    private boolean f145162l = false;

    /* renamed from: m */
    private boolean f145163m = false;

    /* renamed from: n */
    private boolean f145164n = true;

    /* renamed from: o */
    private boolean f145165o = false;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.b$a */
    public interface AbstractC58733a {
        /* renamed from: a */
        void mo197714a(PhotoItem photoItem);

        /* renamed from: a */
        boolean mo197715a(PhotoItem photoItem, float f, float f2);
    }

    /* renamed from: a */
    public void mo199121a() {
        this.f145160j = true;
    }

    /* renamed from: a */
    public void mo199129a(boolean z) {
        this.f145161k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo199040a(PhotoItem photoItem, PhotoItem photoItem2) {
        return photoItem.equals(photoItem2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f145152b.size();
    }

    /* renamed from: b */
    public void mo199133b(boolean z) {
        this.f145163m = z;
    }

    /* renamed from: c */
    public void mo199134c(boolean z) {
        this.f145164n = z;
    }

    /* renamed from: d */
    public void mo199136d(boolean z) {
        this.f145154d = z;
    }

    /* renamed from: e */
    public void mo199138e(boolean z) {
        this.f145155e = z;
    }

    /* renamed from: f */
    public void mo199139f(int i) {
        this.f145153c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo199038a(PhotoItem photoItem) {
        return this.f145152b.indexOf(photoItem);
    }

    /* renamed from: f */
    public void mo199140f(boolean z) {
        this.f145165o = z;
    }

    /* renamed from: d */
    public void mo199135d(int i) {
        AbstractC58617a aVar = this.f145159i.get(i);
        if (aVar != null) {
            aVar.mo198633a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public PhotoItem mo199042c(int i) {
        return this.f145152b.get(i);
    }

    /* renamed from: b */
    public void mo199132b(List<PhotoItem> list) {
        this.f145152b.clear();
        this.f145152b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.lark.widget.photo_picker.gallery.AbstractC58687a
    public int getItemPosition(Object obj) {
        if (((obj instanceof C58734c) || this.f145163m) && this.f145160j) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.AbstractC58687a
    /* renamed from: a */
    public Fragment mo199039a(int i) {
        boolean z;
        boolean z2;
        PhotoItem photoItem = this.f145152b.get(i);
        if (!photoItem.isVideo()) {
            return C58734c.m227863a(this.f145151a, photoItem, this.f145161k, this.f145164n, this.f145156f);
        }
        if (photoItem.getPhoto() != null) {
            return C58746e.m227922a(this.f145151a, photoItem);
        }
        boolean z3 = this.f145155e;
        if (!C58612c.m227290a().mo102866i()) {
            z = false;
        } else {
            z = z3;
        }
        if (this.f145153c == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        return C58694b.m227757a(photoItem, z2, this.f145154d, z, this.f145164n, this.f145157g, this.f145165o, this.f145158h);
    }

    /* renamed from: a */
    public void mo199125a(AbstractC58733a aVar) {
        this.f145156f = aVar;
    }

    /* renamed from: a */
    public void mo199126a(OnChatAlbumClickListener onChatAlbumClickListener) {
        this.f145158h = onChatAlbumClickListener;
    }

    /* renamed from: a */
    public void mo199127a(OnDialogMenuClickListener onDialogMenuClickListener) {
        this.f145157g = onDialogMenuClickListener;
    }

    /* renamed from: a */
    public void mo199128a(List<PhotoItem> list) {
        this.f145152b.clear();
        this.f145152b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo199131b(int i, PhotoItem photoItem) {
        this.f145152b.set(i, photoItem);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo199122a(int i, float f) {
        AbstractC58617a aVar = this.f145159i.get(i);
        if (aVar != null) {
            aVar.mo198634a(f);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.lark.widget.photo_picker.gallery.AbstractC58687a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem instanceof AbstractC58687a.C58688a) {
            Fragment fragment = ((AbstractC58687a.C58688a) instantiateItem).f145033a;
            if (fragment instanceof AbstractC58617a) {
                this.f145159i.put(i, (AbstractC58617a) fragment);
            }
        }
        return instantiateItem;
    }

    /* renamed from: a */
    public void mo199123a(int i, PhotoItem photoItem) {
        AbstractC58617a aVar = this.f145159i.get(i);
        if (aVar != null) {
            aVar.mo198635a(photoItem);
        }
    }

    /* renamed from: a */
    public void mo199124a(int i, List<PhotoItem> list) {
        this.f145152b.addAll(i, list);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.lark.widget.photo_picker.gallery.AbstractC58687a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f145159i.remove(i);
        super.destroyItem(viewGroup, i, obj);
    }

    public C58732b(FragmentManager fragmentManager, IRequestCreator iRequestCreator, List<PhotoItem> list, int i) {
        super(fragmentManager);
        this.f145152b = new ArrayList(list);
        this.f145151a = iRequestCreator;
        this.f145153c = i;
    }
}
