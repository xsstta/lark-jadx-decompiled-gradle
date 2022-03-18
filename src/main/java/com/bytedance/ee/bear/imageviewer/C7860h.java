package com.bytedance.ee.bear.imageviewer;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.imageviewer.h */
public class C7860h implements AbstractC5180b {

    /* renamed from: a */
    private Map<String, C4957m> f21229a = new HashMap();

    /* renamed from: b */
    private Map<String, WeakReference<Fragment>> f21230b = new HashMap();

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b
    /* renamed from: b */
    public void mo20685b(FragmentManager fragmentManager, String str) {
        WeakReference<Fragment> remove;
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (findFragmentByTag == null && (remove = this.f21230b.remove(str)) != null) {
            findFragmentByTag = remove.get();
        }
        if ((findFragmentByTag instanceof C7858f) && findFragmentByTag.isAdded()) {
            ((C7858f) findFragmentByTag).mo5513b();
        }
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b
    /* renamed from: a */
    public void mo20684a(FragmentManager fragmentManager, String str) {
        C4957m remove = this.f21229a.remove(str);
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        WeakReference<Fragment> remove2 = this.f21230b.remove(str);
        if (findFragmentByTag == null && remove2 != null) {
            findFragmentByTag = remove2.get();
        }
        if (findFragmentByTag != null && fragmentManager == findFragmentByTag.getFragmentManager()) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (remove != null) {
                beginTransaction.setCustomAnimations(remove.f14542a, remove.f14543b, remove.f14544c, remove.f14545d);
            }
            beginTransaction.remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b
    /* renamed from: a */
    public AbstractC5179a mo20683a(Context context, FragmentManager fragmentManager, C4957m mVar, ImageData imageData, String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_image", imageData);
        bundle.putString("extra_token", str2);
        bundle.putInt("extra_type", i);
        C7858f fVar = (C7858f) Fragment.instantiate(context, C7858f.class.getName(), bundle);
        this.f21230b.put(str, new WeakReference<>(fVar));
        fVar.mo5511a(fragmentManager, str);
        return fVar;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b
    /* renamed from: a */
    public AbstractC5179a mo20682a(Context context, FragmentManager fragmentManager, C4957m mVar, ViewGroup viewGroup, ImageData imageData, String str, String str2, int i) {
        Bundle bundle = new Bundle();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (mVar != null) {
            if (imageData == null || !imageData.hasValidEnterAnimator()) {
                beginTransaction.setCustomAnimations(mVar.f14542a, mVar.f14543b, mVar.f14544c, mVar.f14545d);
            } else {
                beginTransaction.setCustomAnimations(0, mVar.f14543b, 0, mVar.f14545d);
                bundle.putString("extra_enter_anim_uuid", imageData.getImage().getUuid());
                bundle.putParcelable("extra_enter_anim_pos", imageData.getImage().getPosition());
            }
        }
        this.f21229a.put(str, mVar);
        bundle.putSerializable("extra_image", imageData);
        bundle.putString("extra_token", str2);
        bundle.putInt("extra_type", i);
        C7859g gVar = (C7859g) Fragment.instantiate(context, C7859g.class.getName(), bundle);
        this.f21230b.put(str, new WeakReference<>(gVar));
        beginTransaction.add(viewGroup.getId(), gVar, str);
        beginTransaction.commitAllowingStateLoss();
        return gVar;
    }
}
