package com.bytedance.ee.bear.drive.module.nativepreview.p359a;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.module.nativepreview.model.FileBlockResModel;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaDurationVm;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.module.nativepreview.a.b */
public class C7104b {

    /* renamed from: a */
    private HashMap<String, FileBlockResModel> f19137a;

    /* renamed from: b */
    private HashMap<String, Long> f19138b;

    /* renamed from: c */
    private String f19139c;

    /* renamed from: d */
    private AbstractC7107c f19140d;

    /* renamed from: e */
    private DriveMediaDurationVm f19141e;

    /* renamed from: f */
    private ArrayList<FragmentManager> f19142f;

    /* renamed from: g */
    private int f19143g;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.module.nativepreview.a.b$a */
    public static class C7106a {

        /* renamed from: a */
        public static C7104b f19144a = new C7104b();
    }

    /* renamed from: b */
    public static C7104b m28436b() {
        return C7106a.f19144a;
    }

    /* renamed from: a */
    public String mo27747a() {
        return this.f19139c;
    }

    /* renamed from: c */
    public DriveMediaDurationVm mo27757c() {
        return this.f19141e;
    }

    /* renamed from: d */
    public int mo27759d() {
        return this.f19143g;
    }

    /* renamed from: e */
    private void m28437e() {
        this.f19138b.clear();
        mo27751a((String) null);
        mo27750a((DriveMediaDurationVm) null);
    }

    private C7104b() {
        this.f19137a = new HashMap<>();
        this.f19138b = new HashMap<>();
        this.f19139c = null;
        this.f19142f = new ArrayList<>();
        this.f19143g = 0;
        this.f19140d = new C7103a(this.f19137a);
    }

    /* renamed from: a */
    public void mo27748a(int i) {
        this.f19143g = i;
    }

    /* renamed from: e */
    public void mo27761e(String str) {
        this.f19137a.remove(str);
    }

    /* renamed from: a */
    public void mo27749a(FragmentManager fragmentManager) {
        this.f19142f.add(fragmentManager);
    }

    /* renamed from: b */
    public FileBlockResModel mo27755b(String str) {
        return this.f19137a.get(str);
    }

    /* renamed from: c */
    public Long mo27758c(String str) {
        return this.f19138b.get(str);
    }

    /* renamed from: a */
    public void mo27750a(DriveMediaDurationVm aVar) {
        this.f19141e = aVar;
    }

    /* renamed from: a */
    public void mo27751a(String str) {
        this.f19139c = str;
    }

    /* renamed from: b */
    public void mo27756b(FragmentManager fragmentManager) {
        if (fragmentManager != null && this.f19142f.size() > 0) {
            Iterator<FragmentManager> it = this.f19142f.iterator();
            while (it.hasNext()) {
                if (fragmentManager == it.next()) {
                    it.remove();
                }
            }
        } else if (this.f19142f.size() >= 1) {
            ArrayList<FragmentManager> arrayList = this.f19142f;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* renamed from: d */
    public FileBlockResModel mo27760d(String str) {
        String a = this.f19140d.mo27745a(this.f19137a);
        String str2 = "";
        if (!str2.equals(a)) {
            FileBlockResModel remove = this.f19137a.remove(str);
            StringBuilder sb = new StringBuilder();
            sb.append("requireDelete success ");
            sb.append(C13598b.m55197d(a));
            sb.append(",");
            BaseOpenEntity baseOpenEntity = str2;
            if (remove != null) {
                baseOpenEntity = remove.getOpenEntity();
            }
            sb.append((Object) baseOpenEntity);
            C13479a.m54772d("DriveNativeRenderComponent", sb.toString());
            return remove;
        }
        C13479a.m54772d("DriveNativeRenderComponent", "requireDelete no need " + C13598b.m55197d(str));
        return null;
    }

    /* renamed from: f */
    public void mo27762f(String str) {
        FileBlockResModel value;
        ViewGroup viewGroup;
        if (TextUtils.isEmpty(str) || str.equals(mo27747a())) {
            C13479a.m54772d("DriveNativeRenderComponent", "clearAllRes() ");
            for (Map.Entry<String, FileBlockResModel> entry : this.f19137a.entrySet()) {
                if (!(entry == null || (value = entry.getValue()) == null || value.getNativeViewHolder() == null)) {
                    FileBlockResModel.NativeViewHolder nativeViewHolder = value.getNativeViewHolder();
                    nativeViewHolder.release();
                    if (!(nativeViewHolder.getContainerView() == null || nativeViewHolder.getContainerView().get() == null || (viewGroup = (ViewGroup) nativeViewHolder.getContainerView().get()) == null || viewGroup.getParent() == null)) {
                        ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                    }
                }
            }
            m28437e();
            this.f19137a.clear();
        }
    }

    /* renamed from: a */
    public FragmentManager mo27746a(Fragment fragment, boolean z) {
        if (this.f19142f.size() <= 0) {
            return null;
        }
        Iterator<FragmentManager> it = this.f19142f.iterator();
        while (it.hasNext()) {
            FragmentManager next = it.next();
            List<Fragment> fragments = next.getFragments();
            if (!(fragments == null || fragments.size() == 0)) {
                for (Fragment fragment2 : fragments) {
                    if (fragment2 == fragment) {
                        return next;
                    }
                }
                continue;
            }
        }
        if (z) {
            C13479a.m54775e("DriveNativeRenderComponent", "getFragmentManager error");
            return null;
        }
        ArrayList<FragmentManager> arrayList = this.f19142f;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: a */
    public void mo27752a(String str, FileBlockResModel fileBlockResModel) {
        FileBlockResModel.NativeViewHolder nativeViewHolder;
        if (fileBlockResModel != null) {
            if (this.f19137a.containsKey(str) || fileBlockResModel.isNeedShow()) {
                fileBlockResModel.setUpdateTime(System.currentTimeMillis());
                C13479a.m54772d("DriveNativeRenderComponent", "putResToPoll 11 " + fileBlockResModel + "," + this.f19137a.size() + ",");
                this.f19137a.put(str, fileBlockResModel);
                return;
            }
            String a = this.f19140d.mo27745a(this.f19137a);
            C13479a.m54767c("DriveNativeRenderComponentputResToPoll 22 " + this.f19137a.size());
            if (!("".equals(a) || (nativeViewHolder = this.f19137a.remove(a).getNativeViewHolder()) == null || nativeViewHolder.getFragment() == null)) {
                nativeViewHolder.release();
            }
            fileBlockResModel.setUpdateTime(System.currentTimeMillis());
            this.f19137a.put(str, fileBlockResModel);
        }
    }

    /* renamed from: a */
    public void mo27753a(String str, Long l) {
        this.f19138b.put(str, l);
    }

    /* renamed from: a */
    public void mo27754a(String str, boolean z) {
        C13479a.m54772d("DriveNativeRenderComponent", "updateNeedShow " + mo27755b(str));
        FileBlockResModel fileBlockResModel = this.f19137a.get(str);
        if (fileBlockResModel != null) {
            fileBlockResModel.setNeedShow(z);
        }
    }
}
