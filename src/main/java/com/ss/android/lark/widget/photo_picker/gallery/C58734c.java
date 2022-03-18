package com.ss.android.lark.widget.photo_picker.gallery;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.C57759a;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.C58732b;
import com.ss.android.lark.widget.photo_picker.gallery.C58742d;
import com.ss.android.lark.widget.photo_picker.gallery.LargeImageView;
import com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a;
import com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.c */
public class C58734c extends BaseFragment implements AbstractC58617a {

    /* renamed from: a */
    public PhotoItem f145166a;

    /* renamed from: b */
    public IRequestCreator f145167b;

    /* renamed from: c */
    public View f145168c;

    /* renamed from: d */
    public C58732b.AbstractC58733a f145169d;

    /* renamed from: e */
    public LargeImageView f145170e;

    /* renamed from: f */
    public ImageView f145171f;

    /* renamed from: g */
    public View f145172g;

    /* renamed from: h */
    public TextView f145173h;

    /* renamed from: i */
    public boolean f145174i;

    /* renamed from: j */
    private boolean f145175j = true;

    /* renamed from: k */
    private C58742d f145176k;

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198633a() {
    }

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198634a(float f) {
    }

    /* renamed from: b */
    private void m227865b() {
        this.f145176k = new C58742d(new C58742d.AbstractC58745a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.C587417 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.C58742d.AbstractC58745a
            /* renamed from: a */
            public LifecycleOwner mo199153a() {
                return C58734c.this.getViewLifecycleOwner();
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.C58742d.AbstractC58745a
            /* renamed from: b */
            public IRequestCreator mo199154b() {
                return C58734c.this.f145167b;
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.C58742d.AbstractC58745a
            /* renamed from: c */
            public LargeImageView mo199155c() {
                return C58734c.this.f145170e;
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.C58742d.AbstractC58745a
            /* renamed from: d */
            public Boolean mo199156d() {
                return Boolean.valueOf(C58734c.this.f145174i);
            }
        });
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C58742d dVar = this.f145176k;
        if (dVar != null) {
            dVar.mo199157a();
            this.f145176k = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PerfPhotoViewMonitor.f145408a.mo199295b(1);
    }

    /* renamed from: b */
    public void mo199146b(boolean z) {
        this.f145175j = z;
    }

    /* renamed from: c */
    public void mo199147c(PhotoItem photoItem) {
        this.f145166a = photoItem;
    }

    /* renamed from: a */
    public void mo199141a(int i) {
        this.f145170e.mo199007a(i);
    }

    /* renamed from: a */
    private void m227864a(final Context context) {
        PerfPhotoViewMonitor.f145408a.mo199292a(2);
        PerfPhotoViewMonitor.f145408a.mo199292a(3);
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.RunnableC587384 */

            public void run() {
                int[] iArr;
                if (C57759a.m224180a(context)) {
                    if (DesktopUtil.m144301a(context)) {
                        iArr = new int[]{C58734c.this.f145172g.getWidth(), C58734c.this.f145172g.getHeight()};
                    } else {
                        iArr = new int[]{context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels};
                    }
                    C58734c.this.f145170e.setMaxAvailableSize(iArr);
                    if (C58734c.this.f145166a == null) {
                        Log.m165383e("ImageGalleryFragment", "photoItem is null");
                        C58734c.this.mo199145b(new PhotoItem());
                        return;
                    }
                    C58734c cVar = C58734c.this;
                    cVar.mo199145b(cVar.f145166a);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo199145b(final PhotoItem photoItem) {
        View view = this.f145168c;
        if (view != null) {
            view.setVisibility(8);
            this.f145168c.postDelayed(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.RunnableC587395 */

                public void run() {
                    if (C58734c.this.f145168c != null) {
                        C58734c.this.f145168c.setVisibility(0);
                    }
                }
            }, 500);
        }
        this.f145170e.setVisibility(0);
        this.f145171f.setVisibility(8);
        this.f145170e.setLoadPreviewListener(new LargeImageView.AbstractC58686c() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.C587406 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.AbstractC58686c
            /* renamed from: a */
            public void mo199036a() {
                m227876c();
                PerfPhotoViewMonitor.f145408a.mo199295b(3);
                PerfPhotoViewMonitor.f145408a.mo199293a((ErrorResult) null);
            }

            /* renamed from: c */
            private void m227876c() {
                if (C58734c.this.f145168c != null) {
                    C58734c.this.f145168c.setVisibility(8);
                    C58734c.this.f145168c = null;
                }
                C48211b.m190251a().mo168692d();
            }

            @Override // com.ss.android.lark.widget.photo_picker.gallery.LargeImageView.AbstractC58686c
            /* renamed from: b */
            public void mo199037b() {
                m227876c();
                C58734c.this.f145170e.setVisibility(4);
                C58734c.this.f145171f.setVisibility(0);
                String currentUrl = photoItem.getCurrentUrl();
                if (!TextUtils.isEmpty(currentUrl) && new File(currentUrl).exists()) {
                    C58734c.this.f145173h.setVisibility(0);
                    C58734c.this.f145173h.setText(currentUrl);
                }
                PerfPhotoViewMonitor.f145408a.mo199293a(new ErrorResult(3));
            }
        });
        C58742d dVar = this.f145176k;
        if (dVar != null && photoItem != null) {
            dVar.mo199158a(photoItem);
        }
    }

    /* renamed from: a */
    public void mo199142a(IRequestCreator iRequestCreator) {
        this.f145167b = iRequestCreator;
    }

    @Override // com.ss.android.lark.widget.photo_picker.p2948c.AbstractC58617a
    /* renamed from: a */
    public void mo198635a(PhotoItem photoItem) {
        this.f145166a = photoItem;
        m227864a(getContext());
    }

    /* renamed from: a */
    public void mo199143a(C58732b.AbstractC58733a aVar) {
        this.f145169d = aVar;
    }

    /* renamed from: a */
    public void mo199144a(boolean z) {
        this.f145174i = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m227864a(this.mContext);
        C48211b.m190251a().mo168691c("Gallery#onCreate");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C48211b.m190251a().mo168689b("Gallery#onCreate");
        final Context context = viewGroup.getContext();
        View inflate = layoutInflater.inflate(R.layout.image_gallery_layout, viewGroup, false);
        this.f145172g = inflate;
        this.f145170e = (LargeImageView) inflate.findViewById(R.id.scale_image_view);
        this.f145171f = (ImageView) this.f145172g.findViewById(R.id.error_image);
        this.f145168c = this.f145172g.findViewById(R.id.loading);
        TextView textView = (TextView) this.f145172g.findViewById(R.id.failed_path_tv);
        this.f145173h = textView;
        textView.setVisibility(8);
        View$OnClickListenerC587351 r3 = new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.View$OnClickListenerC587351 */

            public void onClick(View view) {
                Context context = context;
                if ((context instanceof Activity) && !((Activity) context).isFinishing() && !DesktopUtil.m144301a((Context) C58734c.this.getActivity())) {
                    ((Activity) context).onBackPressed();
                }
            }
        };
        View$OnLongClickListenerC587362 r4 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.View$OnLongClickListenerC587362 */

            public boolean onLongClick(View view) {
                if (C58734c.this.f145169d == null) {
                    return true;
                }
                C58734c.this.f145169d.mo197714a(C58734c.this.f145166a);
                return true;
            }
        };
        View$OnGenericMotionListenerC587373 r5 = new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.C58734c.View$OnGenericMotionListenerC587373 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() == 2 && C58734c.this.f145169d != null) {
                    return C58734c.this.f145169d.mo197715a(C58734c.this.f145166a, motionEvent.getRawX(), motionEvent.getRawY());
                }
                return false;
            }
        };
        this.f145170e.setOnClickListener(r3);
        if (this.f145175j) {
            this.f145170e.setOnLongClickListener(r4);
        }
        this.f145170e.setOnGenericMotionListener(r5);
        m227865b();
        return this.f145172g;
    }

    /* renamed from: a */
    public static C58734c m227863a(IRequestCreator iRequestCreator, PhotoItem photoItem, boolean z, boolean z2, C58732b.AbstractC58733a aVar) {
        C58734c cVar = new C58734c();
        cVar.mo199144a(z);
        cVar.mo199146b(z2);
        cVar.setArguments(new Bundle());
        cVar.mo199142a(iRequestCreator);
        cVar.mo199147c(photoItem);
        cVar.mo199143a(aVar);
        return cVar;
    }
}
