package com.ss.android.lark.mediapicker.preview.base;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.e */
public class C44732e extends AbstractC1045n {

    /* renamed from: a */
    private final List<LocalMedia> f113320a;

    /* renamed from: a */
    public List<LocalMedia> mo158448a() {
        return this.f113320a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f113320a.size();
    }

    @Override // androidx.fragment.app.AbstractC1045n
    /* renamed from: a */
    public Fragment mo5615a(int i) {
        LocalMedia localMedia = this.f113320a.get(i);
        if (localMedia.isVideo()) {
            return C44740j.m177470a(localMedia, i);
        }
        return C44731d.m177423a(localMedia, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        AbstractC44730c cVar;
        int a;
        if (!(obj instanceof AbstractC44730c) || (a = (cVar = (AbstractC44730c) obj).mo158446a()) < 0) {
            return -2;
        }
        cVar.mo158447a(this.f113320a.get(a));
        return -1;
    }

    /* renamed from: a */
    public void mo158449a(EditInfo editInfo) {
        Iterator<LocalMedia> it = this.f113320a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LocalMedia next = it.next();
            if (editInfo.f113228a == next.getId()) {
                next.setPath(editInfo.f113229b);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public C44732e(List<LocalMedia> list, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f113320a = new ArrayList(list);
    }

    @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
    }
}
