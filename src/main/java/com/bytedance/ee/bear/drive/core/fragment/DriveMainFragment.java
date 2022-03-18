package com.bytedance.ee.bear.drive.core.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6729c;
import com.bytedance.ee.bear.drive.core.p347a.C6936a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.DrivePreviewViewPager;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/fragment/DriveMainFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/facade/common/ActivityResultHandler;", "()V", "mTitleBar", "Lcom/bytedance/ee/bear/browser/plugin/TitleBar;", "mViewPager", "Lcom/bytedance/ee/bear/drive/view/preview/imageviewer/DrivePreviewViewPager;", "initView", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.core.b.b */
public final class DriveMainFragment extends C7667e implements AbstractC7664b {

    /* renamed from: b */
    public static String f18745b = "DriveMainFragment";

    /* renamed from: c */
    public static final Companion f18746c = new Companion(null);

    /* renamed from: a */
    public DrivePreviewViewPager f18747a;

    /* renamed from: d */
    private HashMap f18748d;

    @JvmStatic
    /* renamed from: a */
    public static final DriveMainFragment m27489a(BaseOpenEntity baseOpenEntity, C6729c cVar) {
        return Companion.m27493a(f18746c, baseOpenEntity, cVar, null, 4, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final DriveMainFragment m27490a(BaseOpenEntity baseOpenEntity, C6729c cVar, Bundle bundle) {
        return f18746c.mo27293a(baseOpenEntity, cVar, bundle);
    }

    /* renamed from: a */
    public void mo27292a() {
        HashMap hashMap = this.f18748d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/fragment/DriveMainFragment$Companion;", "", "()V", "tagName", "", "getTagName", "()Ljava/lang/String;", "setTagName", "(Ljava/lang/String;)V", "newInstance", "Lcom/bytedance/ee/bear/drive/core/fragment/DriveMainFragment;", "openEntity", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseOpenEntity;", "info", "Lcom/bytedance/ee/bear/drive/biz/preview/vc/FragmentExtraInfo;", "args", "Landroid/os/Bundle;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo27294a() {
            return DriveMainFragment.f18745b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DriveMainFragment mo27293a(BaseOpenEntity baseOpenEntity, C6729c cVar, Bundle bundle) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(baseOpenEntity, "openEntity");
            DriveMainFragment bVar = new DriveMainFragment();
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (cVar != null) {
                bundle2.putBoolean("vc_follow_mode", cVar.mo26481b());
                bundle2.putString("vc_follow_meeting_id", cVar.mo26477a());
                bundle2.putBinder("drive_uistate_callback", cVar.mo26482c());
                bundle2.putBoolean("vc_follow_refresh", cVar.mo26483d());
                if (cVar.mo26484e() || baseOpenEntity.isInVc()) {
                    z = true;
                } else {
                    z = false;
                }
                bundle2.putBoolean("vc_follow_attachment", z);
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.add(baseOpenEntity);
            bundle2.putParcelableArrayList("extra_drive_sdk_open_entity", arrayList);
            bVar.setArguments(bundle2);
            return bVar;
        }

        /* renamed from: a */
        public static /* synthetic */ DriveMainFragment m27493a(Companion aVar, BaseOpenEntity baseOpenEntity, C6729c cVar, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            return aVar.mo27293a(baseOpenEntity, cVar, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        mo27292a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/core/fragment/DriveMainFragment$initView$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", "position", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.core.b.b$b */
    public static final class C6941b extends ViewPager.C1581f {

        /* renamed from: a */
        final /* synthetic */ DriveMainFragment f18749a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f18750b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
        public void onPageSelected(int i) {
            DrivePreviewViewPager drivePreviewViewPager = this.f18749a.f18747a;
            if (drivePreviewViewPager != null) {
                boolean z = true;
                if (this.f18750b.size() <= 1) {
                    z = false;
                }
                drivePreviewViewPager.setEnableSwipe(z);
            }
        }

        C6941b(DriveMainFragment bVar, ArrayList arrayList) {
            this.f18749a = bVar;
            this.f18750b = arrayList;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(bundle);
        DrivePreviewViewPager drivePreviewViewPager = this.f18747a;
        if (drivePreviewViewPager != null) {
            if (drivePreviewViewPager == null) {
                Intrinsics.throwNpe();
            }
            bundle.putInt("view_pager_last_item_index", drivePreviewViewPager.getCurrentItem());
        }
    }

    /* renamed from: a */
    private final void m27491a(Bundle bundle) {
        if (getArguments() == null) {
            C13479a.m54758a("DriveSdk", "initView() getArguments is null...");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            Intrinsics.throwNpe();
        }
        ArrayList parcelableArrayList = arguments.getParcelableArrayList("extra_drive_sdk_open_entity");
        if (parcelableArrayList == null) {
            C13479a.m54758a("DriveSdk", "initView() getArguments onlineOpenEntities is null");
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            Intrinsics.throwNpe();
        }
        int i = arguments2.getInt("extra_drive_sdk_open_index", 0);
        if (bundle != null) {
            i = bundle.getInt("view_pager_last_item_index", i);
            C13479a.m54764b("DriveSdk", "initView() savedInstanceState index = " + i);
        }
        if (i < 0) {
            i = 0;
        } else if (i >= parcelableArrayList.size()) {
            i = parcelableArrayList.size() - 1;
        }
        C6936a aVar = new C6936a(getArguments(), getChildFragmentManager(), parcelableArrayList);
        DrivePreviewViewPager drivePreviewViewPager = this.f18747a;
        if (drivePreviewViewPager != null) {
            drivePreviewViewPager.setAdapter(aVar);
        }
        DrivePreviewViewPager drivePreviewViewPager2 = this.f18747a;
        if (drivePreviewViewPager2 != null) {
            drivePreviewViewPager2.setCurrentItem(i, false);
        }
        if (parcelableArrayList.size() <= 1) {
            DrivePreviewViewPager drivePreviewViewPager3 = this.f18747a;
            if (drivePreviewViewPager3 == null) {
                Intrinsics.throwNpe();
            }
            drivePreviewViewPager3.setEnableSwipe(false);
        }
        DrivePreviewViewPager drivePreviewViewPager4 = this.f18747a;
        if (drivePreviewViewPager4 != null) {
            drivePreviewViewPager4.addOnPageChangeListener(new C6941b(this, parcelableArrayList));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f18747a = (DrivePreviewViewPager) view.findViewById(R.id.drive_sdk_preview_viewpager);
        m27491a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.drive_main_fragment, viewGroup, false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        PagerAdapter pagerAdapter;
        PagerAdapter adapter;
        super.onActivityResult(i, i2, intent);
        DrivePreviewViewPager drivePreviewViewPager = this.f18747a;
        if (drivePreviewViewPager != null) {
            Object obj = null;
            if (drivePreviewViewPager != null) {
                pagerAdapter = drivePreviewViewPager.getAdapter();
            } else {
                pagerAdapter = null;
            }
            if (pagerAdapter != null) {
                DrivePreviewViewPager drivePreviewViewPager2 = this.f18747a;
                if (!(drivePreviewViewPager2 == null || (adapter = drivePreviewViewPager2.getAdapter()) == null)) {
                    DrivePreviewViewPager drivePreviewViewPager3 = this.f18747a;
                    if (drivePreviewViewPager3 == null) {
                        Intrinsics.throwNpe();
                    }
                    DrivePreviewViewPager drivePreviewViewPager4 = drivePreviewViewPager3;
                    DrivePreviewViewPager drivePreviewViewPager5 = this.f18747a;
                    if (drivePreviewViewPager5 == null) {
                        Intrinsics.throwNpe();
                    }
                    obj = adapter.instantiateItem((ViewGroup) drivePreviewViewPager4, drivePreviewViewPager5.getCurrentItem());
                }
                if (obj != null) {
                    ((DrivePreviewFragment) obj).onActivityResult(i, i2, intent);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.drive.core.fragment.DrivePreviewFragment");
            }
        }
    }
}
