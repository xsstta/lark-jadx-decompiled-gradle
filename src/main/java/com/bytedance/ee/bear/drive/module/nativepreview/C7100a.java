package com.bytedance.ee.bear.drive.module.nativepreview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.bear.drive.module.nativepreview.model.FileBlockResModel;
import com.bytedance.ee.bear.drive.module.nativepreview.p359a.C7104b;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaDurationVm;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.module.nativepreview.a */
public class C7100a implements AbstractC7108b {

    /* renamed from: a */
    public boolean f19129a = false;

    /* renamed from: b */
    private Handler f19130b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private void m28431a(String str) {
        Long c = C7104b.m28436b().mo27758c(str);
        DriveMediaDurationVm c2 = C7104b.m28436b().mo27757c();
        if (c != null) {
            c2.setExtraData(str, Long.valueOf(c.longValue()));
        }
    }

    /* renamed from: a */
    private DriveMainFragment m28428a(BaseOpenEntity baseOpenEntity) {
        DriveMainFragment bVar = new DriveMainFragment();
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(baseOpenEntity);
        bundle.putParcelableArrayList("extra_drive_sdk_open_entity", arrayList);
        bundle.putInt("extra_drive_sdk_open_index", 0);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // com.bytedance.ee.bear.drive.module.nativepreview.AbstractC7108b
    /* renamed from: a */
    public void mo27742a(String str, boolean z) {
        if (z) {
            C7104b.m28436b().mo27754a(str, false);
        }
        if (!z) {
            FileBlockResModel b = C7104b.m28436b().mo27755b(str);
            if (!(b == null || b.getNativeViewHolder() == null)) {
                b.getNativeViewHolder().release();
                C13479a.m54764b("DriveNativeRenderComponent", "onBlockRemove delete directly");
            }
            C7104b.m28436b().mo27761e(str);
            return;
        }
        C13479a.m54764b("DriveNativeRenderComponent", "onBlockRemove enter2 ");
        FileBlockResModel d = C7104b.m28436b().mo27760d(str);
        if (d != null && d.getNativeViewHolder() != null) {
            d.getNativeViewHolder().release();
        }
    }

    /* renamed from: a */
    private void m28430a(AppCompatActivity appCompatActivity, Long l, final String str) {
        DriveMediaDurationVm aVar = (DriveMediaDurationVm) new C1144ai(appCompatActivity).mo6005a(DriveMediaDurationVm.class);
        aVar.getExtraData().mo5923a(appCompatActivity, new AbstractC1178x<Map<String, Long>>() {
            /* class com.bytedance.ee.bear.drive.module.nativepreview.C7100a.C71022 */

            /* renamed from: a */
            public void onChanged(Map<String, Long> map) {
                C7104b.m28436b().mo27753a(str, map.get(str));
            }
        });
        C7104b.m28436b().mo27753a(str, l);
        C7104b.m28436b().mo27750a(aVar);
    }

    /* renamed from: a */
    private FileBlockResModel.NativeViewHolder m28429a(final ViewGroup viewGroup, AppCompatActivity appCompatActivity, BaseOpenEntity baseOpenEntity, String str) {
        FileBlockResModel.NativeViewHolder nativeViewHolder = new FileBlockResModel.NativeViewHolder();
        final DriveMainFragment a = m28428a(baseOpenEntity);
        if (!appCompatActivity.toString().equals(C7104b.m28436b().mo27747a())) {
            C7104b.m28436b().mo27762f(null);
            m28430a(appCompatActivity, C7104b.m28436b().mo27758c(str), str);
            C7104b.m28436b().mo27751a(appCompatActivity.toString());
        }
        m28431a(str);
        nativeViewHolder.setFragment(a);
        int generateViewId = View.generateViewId();
        if (viewGroup.getId() == -1) {
            viewGroup.setId(generateViewId);
        }
        viewGroup.setTag("block_place_holder");
        this.f19129a = false;
        nativeViewHolder.setContainerView(new WeakReference<>(viewGroup));
        if (viewGroup.isAttachedToWindow()) {
            C13479a.m54764b("DriveNativeRenderComponent", "createView add directly ");
            FragmentManager a2 = C7104b.m28436b().mo27746a((Fragment) a, false);
            if (a2 != null) {
                a2.beginTransaction().add(viewGroup.getId(), a).commitAllowingStateLoss();
            }
        } else {
            ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
            C13479a.m54772d("DriveNativeRenderComponent", "createView enter " + baseOpenEntity);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.bytedance.ee.bear.drive.module.nativepreview.C7100a.ViewTreeObserver$OnPreDrawListenerC71011 */

                public boolean onPreDraw() {
                    viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (!C7100a.this.f19129a) {
                        C7100a.this.f19129a = true;
                        C13479a.m54764b("DriveNativeRenderComponent", "createView onGlobalLayout ");
                        FragmentManager a = C7104b.m28436b().mo27746a(a, false);
                        if (a != null) {
                            a.beginTransaction().add(viewGroup.getId(), a).commitAllowingStateLoss();
                        }
                    }
                    return true;
                }
            });
        }
        return nativeViewHolder;
    }

    @Override // com.bytedance.ee.bear.drive.module.nativepreview.AbstractC7108b
    /* renamed from: a */
    public FileBlockResModel.NativeViewHolder mo27741a(AppCompatActivity appCompatActivity, ViewGroup viewGroup, BaseOpenEntity baseOpenEntity, boolean z, String str) {
        if (baseOpenEntity == null || appCompatActivity == null || viewGroup == null) {
            C13479a.m54758a("DriveNativeRenderComponent", "onBlockCreate something is empty " + baseOpenEntity + "," + viewGroup + ",");
            return null;
        }
        C13479a.m54764b("DriveNativeRenderComponent", "onBlockCreate enter1 " + viewGroup.toString());
        FileBlockResModel b = C7104b.m28436b().mo27755b(str);
        if (b == null) {
            C13479a.m54764b("DriveNativeRenderComponent", "onBlockCreate start create new view " + viewGroup);
            FileBlockResModel.NativeViewHolder a = m28429a(viewGroup, appCompatActivity, baseOpenEntity, str);
            FileBlockResModel fileBlockResModel = new FileBlockResModel(str, baseOpenEntity, a);
            fileBlockResModel.setNeedShow(z);
            C7104b.m28436b().mo27752a(str, fileBlockResModel);
            return a;
        }
        FileBlockResModel.NativeViewHolder nativeViewHolder = b.getNativeViewHolder();
        if (nativeViewHolder == null || nativeViewHolder.getContainerView() == null || nativeViewHolder.getContainerView().get() == null) {
            C13479a.m54764b("DriveNativeRenderComponent", "onBlockCreate not likely to happen " + viewGroup);
            FileBlockResModel.NativeViewHolder a2 = m28429a(viewGroup, appCompatActivity, baseOpenEntity, str);
            b.setNativeViewHolder(a2);
            b.setNeedShow(z);
            C7104b.m28436b().mo27752a(str, b);
            return a2;
        }
        int childCount = viewGroup.getChildCount();
        C13479a.m54764b("DriveNativeRenderComponent", "onBlockCreate already cached " + nativeViewHolder.getContainerView().get() + "," + viewGroup + "," + childCount);
        b.setNeedShow(z);
        b.setUpdateTime(System.currentTimeMillis());
        C7104b.m28436b().mo27752a(str, b);
        return nativeViewHolder;
    }
}
