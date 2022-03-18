package com.bytedance.ee.bear.drive.biz.upload.filepicker.p334a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.common.p336a.AbstractC6779c;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.common.p336a.C6777a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.StorageVolumeWrapper;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.a.c */
public class C6767c extends AbstractC6903b<C6771e> implements AbstractC6770d {

    /* renamed from: a */
    private RecyclerView f18416a;

    /* renamed from: b */
    private C6765b f18417b;

    /* renamed from: c */
    private ArrayList<StorageVolumeWrapper> f18418c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public int mo25870a() {
        return R.layout.drivefilepicker_fragment_storage_list;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo25878b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f18418c = arguments.getParcelableArrayList("extra_storage_list");
        }
        if (this.f18418c == null) {
            mo27143e();
        } else {
            C6777a.m26713a(getActivity(), new C6769a());
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.a.c$a */
    private class C6769a implements AbstractC6779c {
        private C6769a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6771e mo25877b(Context context) {
        return new C6771e(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25873a(View view) {
        this.f18417b.mo26604a(this.f18418c);
        this.f18417b.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26688a(StorageVolumeWrapper storageVolumeWrapper, View view) {
        C6777a.m26712a(getActivity()).mo26615a(storageVolumeWrapper);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25874a(View view, Bundle bundle) {
        this.f18416a = (RecyclerView) view;
        ((C6771e) mo27144f()).mo27147a(this);
        C6765b bVar = new C6765b(view.getContext());
        this.f18417b = bVar;
        bVar.mo26603a(new AbstractC6764a() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.p334a.$$Lambda$c$YebxDvusqN_D_8nFYuvxH11YKDY */

            @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.p334a.AbstractC6764a
            public final void onClicked(StorageVolumeWrapper storageVolumeWrapper, View view) {
                C6767c.lambda$YebxDvusqN_D_8nFYuvxH11YKDY(C6767c.this, storageVolumeWrapper, view);
            }
        });
        this.f18416a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f18416a.setAdapter(this.f18417b);
    }
}
