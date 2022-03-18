package com.ss.android.lark.widget.photo_picker.p2948c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57759a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.widget.photo_picker.C58596b;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import com.ss.android.lark.widget.photo_picker.p2943a.C58564b;
import com.ss.android.lark.widget.photo_picker.p2943a.C58572d;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58609a;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58611c;
import com.ss.android.lark.widget.photo_picker.p2951f.C58654f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.c.b */
public class C58618b extends Fragment {

    /* renamed from: a */
    public static int f144748a = 3;

    /* renamed from: b */
    int f144749b;

    /* renamed from: c */
    public C58564b f144750c;

    /* renamed from: d */
    public C58572d f144751d;

    /* renamed from: e */
    public List<PhotoDirectory> f144752e;

    /* renamed from: f */
    public int f144753f = 30;

    /* renamed from: g */
    public ListPopupWindow f144754g;

    /* renamed from: h */
    public IRequestCreator f144755h;

    /* renamed from: i */
    public int f144756i;

    /* renamed from: j */
    public Fragment f144757j;

    /* renamed from: k */
    private ArrayList<Photo> f144758k;

    /* renamed from: l */
    private Button f144759l;

    /* renamed from: m */
    private boolean f144760m = true;

    /* renamed from: n */
    private AbstractC58609a f144761n;

    /* renamed from: e */
    public C58564b mo198648e() {
        return this.f144750c;
    }

    /* renamed from: d */
    public void mo198647d() {
        Fragment fragment = this.f144757j;
        if (fragment != null && (fragment instanceof C58596b)) {
            ((C58596b) fragment).mo198603a();
        }
    }

    /* renamed from: g */
    public void mo198650g() {
        if (C57759a.m224181a(this)) {
            this.f144755h.resumeRequests();
        }
    }

    /* renamed from: b */
    public void mo198645b() {
        if (this.f144754g.isShowing()) {
            ViewGroup viewGroup = (ViewGroup) this.f144754g.getListView().getRootView();
            viewGroup.getChildAt(0).setElevation(BitmapDescriptorFactory.HUE_RED);
            viewGroup.setBackground(getResources().getDrawable(R.drawable.__picker_bg_bottom_shadow));
        }
    }

    /* renamed from: f */
    public void mo198649f() {
        if (this.f144751d != null && getContext() != null) {
            int count = this.f144751d.getCount();
            int i = f144748a;
            if (count >= i) {
                count = i;
            }
            ListPopupWindow listPopupWindow = this.f144754g;
            if (listPopupWindow != null) {
                listPopupWindow.setHeight(count * getResources().getDimensionPixelOffset(R.dimen.__picker_item_directory_height));
            }
        }
    }

    /* renamed from: h */
    private void m227345h() {
        if (this.f144759l != null && getActivity() != null) {
            this.f144759l.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.View$OnClickListenerC586256 */

                public void onClick(View view) {
                    if (!C58618b.this.isAdded()) {
                        Log.m165389i("PhotoPickerFragment", "fragment not attached to context upon switch button click");
                    } else if (C58618b.this.f144754g.isShowing()) {
                        C58618b.this.f144754g.dismiss();
                    } else if (!C58618b.this.getActivity().isFinishing()) {
                        C58618b.this.mo198649f();
                        C58618b.this.mo198646c();
                        C58618b.this.f144754g.show();
                        C58618b.this.mo198645b();
                    }
                }
            });
            ListPopupWindow listPopupWindow = new ListPopupWindow(getActivity());
            this.f144754g = listPopupWindow;
            listPopupWindow.setAnchorView(this.f144759l);
            this.f144754g.setAdapter(this.f144751d);
            this.f144754g.setModal(true);
            this.f144754g.setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.C586267 */

                public void onDismiss() {
                    C58618b bVar = C58618b.this;
                    bVar.mo198636a(bVar.f144756i);
                }
            });
            this.f144754g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.C586278 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C58618b.this.f144756i = i;
                    C58618b.this.f144754g.dismiss();
                }
            });
        }
    }

    /* renamed from: c */
    public void mo198646c() {
        if (!DesktopUtil.m144301a(getContext())) {
            this.f144754g.setWidth(-1);
            this.f144754g.setHorizontalOffset(-DeviceUtils.getScreenWidth(getActivity()));
            this.f144754g.setDropDownGravity(8388661);
            return;
        }
        int width = this.f144757j.getView().getWidth();
        Log.m165379d("PhotoPickerFragment", "popup window width:" + width);
        this.f144754g.setWidth(width);
        this.f144754g.setHorizontalOffset((int) this.f144757j.getView().getX());
        this.f144754g.setDropDownGravity(8388661);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        List<PhotoDirectory> list = this.f144752e;
        if (list != null) {
            for (PhotoDirectory photoDirectory : list) {
                photoDirectory.getPhotoPaths().clear();
                photoDirectory.getPhotos().clear();
                photoDirectory.setPhotos(null);
            }
            int size = this.f144752e.size();
            this.f144752e.clear();
            this.f144752e = null;
            C58564b bVar = this.f144750c;
            if (bVar != null) {
                bVar.notifyItemRangeChanged(0, size);
            }
            super.onDestroy();
        }
    }

    /* renamed from: a */
    public boolean mo198642a() {
        Fragment fragment = this.f144757j;
        if (fragment instanceof C58596b) {
            return ((C58596b) fragment).mo198618f();
        }
        return false;
    }

    /* renamed from: a */
    public void mo198639a(Fragment fragment) {
        this.f144757j = fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    /* renamed from: a */
    public void mo198638a(Button button) {
        this.f144759l = button;
        m227345h();
    }

    /* renamed from: a */
    public void mo198640a(AbstractC58609a aVar) {
        this.f144761n = aVar;
    }

    /* renamed from: b */
    public int mo198644b(Photo photo) {
        if (!mo198643a(photo)) {
            return -1;
        }
        return this.f144750c.mo198540c().indexOf(photo);
    }

    /* renamed from: a */
    public void mo198636a(int i) {
        if (i < this.f144752e.size()) {
            this.f144759l.setText(this.f144752e.get(i).getName());
            this.f144750c.mo198536a(i);
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.RunnableC586289 */

                public void run() {
                    C58618b.this.f144750c.notifyDataSetChanged();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f144755h = ImageLoader.with(this);
        this.f144752e = new ArrayList();
        this.f144758k = (ArrayList) getArguments().getSerializable("origin");
        this.f144760m = getArguments().getBoolean("ensureSelection");
        this.f144749b = getArguments().getInt("column", 4);
        boolean z = getArguments().getBoolean("camera", true);
        boolean z2 = getArguments().getBoolean("PREVIEW_ENABLED", true);
        C58564b bVar = new C58564b(getContext().getApplicationContext(), this.f144755h, this.f144752e, this.f144758k, this.f144749b, this.f144760m);
        this.f144750c = bVar;
        bVar.setHasStableIds(false);
        AbstractC58609a aVar = this.f144761n;
        if (aVar != null) {
            this.f144750c.mo198551a(aVar);
        }
        this.f144750c.mo198548a(new C58564b.AbstractC58570a() {
            /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.C586191 */

            @Override // com.ss.android.lark.widget.photo_picker.p2943a.C58564b.AbstractC58570a
            /* renamed from: a */
            public boolean mo198564a(Photo photo) {
                if (C58618b.this.mo198642a()) {
                    return true;
                }
                if (!photo.isVideo()) {
                    return C58618b.this.f144750c.mo198543f();
                }
                if (C58618b.this.f144750c.mo198538b() > 0) {
                    return true;
                }
                return false;
            }
        });
        this.f144750c.mo198555a(z);
        this.f144750c.mo198556b(z2);
        Bundle bundle2 = new Bundle();
        boolean z3 = getArguments().getBoolean("gif");
        boolean z4 = getArguments().getBoolean("video");
        bundle2.putBoolean("SHOW_GIF", z3);
        bundle2.putBoolean("SHOW_VIDEO", z4);
        C58654f.m227489a(getActivity(), bundle2, new C58654f.AbstractC58658c() {
            /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.C586202 */

            @Override // com.ss.android.lark.widget.photo_picker.p2951f.C58654f.AbstractC58658c
            /* renamed from: a */
            public void mo39869a(List<PhotoDirectory> list) {
                if (C58618b.this.f144752e != null) {
                    int size = C58618b.this.f144752e.size();
                    C58618b.this.f144752e.clear();
                    C58618b.this.f144750c.notifyItemRangeChanged(0, size);
                    C58618b.this.f144752e.addAll(list);
                    C58618b.this.f144750c.notifyItemRangeChanged(0, list.size());
                    C58618b.this.f144751d.notifyDataSetChanged();
                    C58618b.this.mo198649f();
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo198643a(Photo photo) {
        return this.f144750c.mo198540c().contains(photo);
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.c.b$a */
    private static class C58629a extends StaggeredGridLayoutManager {
        public C58629a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                Log.m165383e("PhotoPickerFragment", "onLayoutChildren   " + e.toString());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                return super.scrollVerticallyBy(i, recycler, state);
            } catch (IndexOutOfBoundsException e) {
                Log.m165383e("PhotoPickerFragment", "scrollVerticallyBy  " + e.toString());
                return 0;
            }
        }
    }

    /* renamed from: a */
    public void mo198637a(int i, Photo photo) {
        this.f144750c.mo198546a(i, photo);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length > 0 && iArr[0] == 0) {
            if ((i == 1 || i == 3) && C51327f.m199082a(this) && C51327f.m199085b(this)) {
                mo198647d();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.__picker_fragment_photo_picker, viewGroup, false);
        this.f144751d = new C58572d(this.f144755h, this.f144752e);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_photos);
        C58629a aVar = new C58629a(this.f144749b, 1);
        aVar.mo7261c(2);
        recyclerView.setLayoutManager(aVar);
        recyclerView.setAdapter(this.f144750c);
        recyclerView.setItemAnimator(new C1363f());
        m227345h();
        this.f144750c.mo198553a(new AbstractC58611c() {
            /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.C586213 */

            @Override // com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58611c
            /* renamed from: a */
            public void mo147710a(View view, int i, boolean z) {
                if (z) {
                    i--;
                }
                C58618b.this.mo198641a(C58618b.this.f144750c.mo198542e(), i, view);
                if (C58618b.this.f144757j != null && (C58618b.this.f144757j instanceof C58596b)) {
                    ((C58596b) C58618b.this.f144757j).mo198605a(C58618b.this.f144750c.mo198538b(), true);
                }
            }
        });
        this.f144750c.mo198547a(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.View$OnClickListenerC586224 */

            public void onClick(View view) {
                C57805b.m224331b(C58618b.this.getActivity(), new C57805b.AbstractC57809a() {
                    /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.View$OnClickListenerC586224.C586231 */

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public void permissionGranted(boolean z) {
                        if (z) {
                            C58618b.this.mo198647d();
                        }
                    }
                });
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.widget.photo_picker.p2948c.C58618b.C586245 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    C58618b.this.mo198650g();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (Math.abs(i2) > C58618b.this.f144753f) {
                    C58618b.this.f144755h.pauseRequests();
                } else {
                    C58618b.this.mo198650g();
                }
            }
        });
        if (!DesktopUtil.m144301a(getContext())) {
            StatusBarUtil.setTranslucentForImageViewInFragment(getActivity(), 178, recyclerView);
        } else {
            inflate.setBackgroundColor(getContext().getResources().getColor(R.color.lkui_N00));
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo198641a(List<Photo> list, int i, View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f = (float) measuredWidth;
        float f2 = (float) measuredHeight;
        int[] iArr2 = {DeviceUtils.getScreenWidth(getContext()), DeviceUtils.getScreenHeight(getContext()) - UIUtils.dp2px(getContext(), 64.0f)};
        float f3 = ((float) iArr2[0]) / ((float) iArr2[1]);
        int[] iArr3 = new int[2];
        if (f / f2 > f3) {
            int i2 = (int) (f / f3);
            iArr3[0] = iArr[0];
            iArr3[1] = (iArr[1] + (measuredHeight / 2)) - (i2 / 2);
            measuredHeight = i2;
        } else {
            int i3 = (int) (f2 * f3);
            iArr3[1] = iArr[1];
            iArr3[0] = (iArr[0] + (measuredWidth / 2)) - (i3 / 2);
            measuredWidth = i3;
        }
        ImagePagerFragment a = ImagePagerFragment.m227609a(list, i, iArr3, measuredWidth, measuredHeight);
        a.mo198941a(this.f144757j);
        Fragment fragment = this.f144757j;
        if (fragment != null && (fragment instanceof C58596b)) {
            ((C58596b) fragment).mo198608a(a);
        }
    }

    /* renamed from: a */
    public static C58618b m227344a(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, boolean z5, ArrayList<Photo> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("camera", z);
        bundle.putBoolean("gif", z2);
        bundle.putBoolean("video", z3);
        bundle.putBoolean("ensureSelection", z5);
        bundle.putBoolean("PREVIEW_ENABLED", z4);
        bundle.putInt("column", i);
        bundle.putInt("typeCount", i2);
        bundle.putInt("typeTotalCount", i3);
        bundle.putSerializable("origin", arrayList);
        C58618b bVar = new C58618b();
        bVar.setArguments(bundle);
        return bVar;
    }
}
