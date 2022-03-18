package com.bytedance.ee.bear.drive.core.p347a;

import android.os.Bundle;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.core.fragment.DrivePreviewFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.core.a.a */
public class C6936a extends AbstractC1045n {

    /* renamed from: a */
    private List<BaseOpenEntity> f18730a = new ArrayList();

    /* renamed from: b */
    private Bundle f18731b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f18730a.size();
    }

    @Override // androidx.fragment.app.AbstractC1045n
    /* renamed from: a */
    public Fragment mo5615a(int i) {
        DrivePreviewFragment cVar = new DrivePreviewFragment();
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f18731b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putParcelable("extra_drive_sdk_open_entity", this.f18730a.get(i));
        cVar.setArguments(bundle);
        return cVar;
    }

    public C6936a(Bundle bundle, FragmentManager fragmentManager, List<BaseOpenEntity> list) {
        super(fragmentManager);
        this.f18731b = bundle;
        if (list != null) {
            this.f18730a = list;
        }
    }
}
