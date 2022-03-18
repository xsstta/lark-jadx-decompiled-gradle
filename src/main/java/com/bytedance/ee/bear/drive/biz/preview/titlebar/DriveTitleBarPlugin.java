package com.bytedance.ee.bear.drive.biz.preview.titlebar;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.DrivePreviewViewPager;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/titlebar/DriveTitleBarPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mListener", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "mObserver", "Landroidx/lifecycle/Observer;", "", "mViewPager", "Lcom/bytedance/ee/bear/drive/view/preview/imageviewer/DrivePreviewViewPager;", "titleBarDarkModeConfigurationChangedCallbacks", "Landroid/content/ComponentCallbacks;", "handleDrivePageTitleBarStateIfNeed", "", "initScrollListener", "onAttachPreview", "onAttachToUIContainer", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromHost", "onDetachFromUIContainer", "onDetachPreview", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveTitleBarPlugin extends AbsDrivePlugin {
    public static final Companion Companion = new Companion(null);
    private ViewPager.OnPageChangeListener mListener;
    private AbstractC1178x<String> mObserver;
    private DrivePreviewViewPager mViewPager;
    private final ComponentCallbacks titleBarDarkModeConfigurationChangedCallbacks = new ComponentCallbacksC6715d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/titlebar/DriveTitleBarPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
        AbstractC1178x<String> xVar = this.mObserver;
        if (xVar != null) {
            ((DrivePluginHost) getHost()).mo27261l().liveFileName().mo5928b(xVar);
        }
    }

    private final void initScrollListener() {
        int i;
        PagerAdapter adapter;
        if (this.mViewPager == null) {
            DrivePreviewViewPager drivePreviewViewPager = (DrivePreviewViewPager) findViewById(R.id.drive_sdk_preview_viewpager);
            this.mViewPager = drivePreviewViewPager;
            if (drivePreviewViewPager == null || (adapter = drivePreviewViewPager.getAdapter()) == null) {
                i = 0;
            } else {
                i = adapter.getCount();
            }
            DrivePreviewViewPager drivePreviewViewPager2 = this.mViewPager;
            if (drivePreviewViewPager2 != null) {
                C6713b bVar = new C6713b(this, i);
                this.mListener = bVar;
                drivePreviewViewPager2.addOnPageChangeListener(bVar);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        LiveData<String> liveFileName = ((DrivePluginHost) getHost()).mo27261l().liveFileName();
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        LifecycleOwner h = aVar.mo19566h();
        C6714c cVar = new C6714c(this);
        this.mObserver = cVar;
        liveFileName.mo5923a(h, cVar);
    }

    private final void handleDrivePageTitleBarStateIfNeed() {
        Bundle bundle;
        Bundle arguments = ((DrivePluginHost) getHost()).mo23794b().getArguments();
        if (arguments != null) {
            bundle = arguments.getBundle("doc_page_config");
        } else {
            bundle = null;
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("hideTitleBar", false);
            if (z) {
                TitleBar titleBar = getTitleBar();
                Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
                BaseTitleBar a = titleBar.mo19508a();
                Intrinsics.checkExpressionValueIsNotNull(a, "titleBar.titleBarLayout");
                a.setVisibility(8);
            }
            boolean z2 = bundle.getBoolean("hideTitle", false);
            if (z2) {
                getTitleBar().mo19515a(false);
                getTitleBar().mo19526f(false);
            }
            boolean z3 = bundle.getBoolean("hideBackIcon", false);
            if (z3) {
                getTitleBar().mo19525e(false);
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = bundle.getBoolean("hideMessageIcon", false);
            boolean z5 = bundle.getBoolean("hideShareIcon", false);
            boolean z6 = bundle.getBoolean("hideMoreIcon", false);
            if (z4) {
                arrayList.add(new MenuItem("ccm_drive_feed_menu", null));
            }
            if (z5) {
                arrayList.add(new MenuItem("ccm_drive_share_menu", null));
            }
            if (z6) {
                arrayList.add(new MenuItem("ccm_drive_more_menu", null));
            }
            getTitleBar().mo19513a(arrayList);
            C13479a.m54772d("DriveTitleBarPlugin", "hideTitleBar=" + z + ", hideTitle=" + z2 + ", hideBackIcon=" + z3 + ", hiddenMenuItems=" + arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/titlebar/DriveTitleBarPlugin$titleBarDarkModeConfigurationChangedCallbacks$1", "Landroid/content/ComponentCallbacks;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin$d */
    public static final class ComponentCallbacksC6715d implements ComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ DriveTitleBarPlugin f18298a;

        public void onLowMemory() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ComponentCallbacksC6715d(DriveTitleBarPlugin driveTitleBarPlugin) {
            this.f18298a = driveTitleBarPlugin;
        }

        public void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
            this.f18298a.getTitleBar().mo19523d();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        DrivePreviewViewPager drivePreviewViewPager;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onDetachFromHost(aVar);
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null && (drivePreviewViewPager = this.mViewPager) != null) {
            drivePreviewViewPager.removeOnPageChangeListener(onPageChangeListener);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/titlebar/DriveTitleBarPlugin$initScrollListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", "position", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin$b */
    public static final class C6713b extends ViewPager.C1581f {

        /* renamed from: a */
        final /* synthetic */ DriveTitleBarPlugin f18295a;

        /* renamed from: b */
        final /* synthetic */ int f18296b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
        public void onPageSelected(int i) {
            String str;
            TitleBar titleBar = this.f18295a.getTitleBar();
            if (this.f18296b > 1) {
                str = String.valueOf(i + 1) + "/" + this.f18296b;
            } else {
                str = "";
            }
            titleBar.mo19518b(str);
        }

        C6713b(DriveTitleBarPlugin driveTitleBarPlugin, int i) {
            this.f18295a = driveTitleBarPlugin;
            this.f18296b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "name", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin$c */
    static final class C6714c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveTitleBarPlugin f18297a;

        C6714c(DriveTitleBarPlugin driveTitleBarPlugin) {
            this.f18297a = driveTitleBarPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            C13479a.m54764b("DriveTitleBarPlugin", "liveFileName-onChanged()");
            AbstractC4958n uIContainer = this.f18297a.getUIContainer();
            Intrinsics.checkExpressionValueIsNotNull(uIContainer, "uiContainer");
            TitleBar e = uIContainer.mo19600e();
            Intrinsics.checkExpressionValueIsNotNull(e, "uiContainer.titleBar");
            e.mo19512a((CharSequence) str);
        }
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        activity.getApplicationContext().unregisterComponentCallbacks(this.titleBarDarkModeConfigurationChangedCallbacks);
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        int i;
        String str;
        PagerAdapter adapter;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        initScrollListener();
        getTitleBar().mo19510a(TitleBar.TitleGravity.Left);
        DrivePreviewViewPager drivePreviewViewPager = this.mViewPager;
        int i2 = 0;
        if (drivePreviewViewPager == null || (adapter = drivePreviewViewPager.getAdapter()) == null) {
            i = 0;
        } else {
            i = adapter.getCount();
        }
        TitleBar titleBar = getTitleBar();
        if (i > 1) {
            StringBuilder sb = new StringBuilder();
            DrivePreviewViewPager drivePreviewViewPager2 = this.mViewPager;
            if (drivePreviewViewPager2 != null) {
                i2 = drivePreviewViewPager2.getCurrentItem();
            }
            sb.append(String.valueOf(i2 + 1));
            sb.append("/");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "";
        }
        titleBar.mo19518b(str);
        handleDrivePageTitleBarStateIfNeed();
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        activity.getApplicationContext().registerComponentCallbacks(this.titleBarDarkModeConfigurationChangedCallbacks);
    }
}
