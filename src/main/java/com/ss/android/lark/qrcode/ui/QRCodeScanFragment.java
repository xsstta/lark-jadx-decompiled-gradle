package com.ss.android.lark.qrcode.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.p2553a.AbstractC52938a;
import com.ss.android.lark.qrcode.ui.QRCodeScanView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 H2\u00020\u0001:\u0004HIJKB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0012\u00102\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\"\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;H\u0016J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010B\u001a\u00020/H\u0016J\b\u0010C\u001a\u00020/H\u0016J\b\u0010D\u001a\u00020/H\u0016J\b\u0010E\u001a\u00020/H\u0016J\b\u0010F\u001a\u00020/H\u0016J\b\u0010G\u001a\u00020/H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006L"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "customViewInjector", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanCustomViewInjector;", "getCustomViewInjector", "()Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanCustomViewInjector;", "setCustomViewInjector", "(Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanCustomViewInjector;)V", "mActivityDestroyListeners", "", "Lcom/ss/android/lark/biz/core/api/IQRCodeContext$IActivityDestoryListener;", "mCreateTime", "", "mPresenter", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanPresenter;", "getMPresenter", "()Lcom/ss/android/lark/qrcode/ui/QRCodeScanPresenter;", "setMPresenter", "(Lcom/ss/android/lark/qrcode/ui/QRCodeScanPresenter;)V", "mVideoChatService", "Lcom/ss/android/lark/qrcode/dependency/IQRCodeModuleDependency;", "getMVideoChatService", "()Lcom/ss/android/lark/qrcode/dependency/IQRCodeModuleDependency;", "setMVideoChatService", "(Lcom/ss/android/lark/qrcode/dependency/IQRCodeModuleDependency;)V", "mViewClickListeners", "Lcom/ss/android/lark/biz/core/api/IQRCodeContext$IViewClickListener;", "mViewDependency", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanView$ViewDependency;", "getMViewDependency", "()Lcom/ss/android/lark/qrcode/ui/QRCodeScanView$ViewDependency;", "setMViewDependency", "(Lcom/ss/android/lark/qrcode/ui/QRCodeScanView$ViewDependency;)V", "scanListener", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanListener;", "getScanListener", "()Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanListener;", "setScanListener", "(Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanListener;)V", "windowRotationArbiter", "Lcom/ss/android/lark/qrcode/ui/WindowRotationArbiter;", "getWindowRotationArbiter", "()Lcom/ss/android/lark/qrcode/ui/WindowRotationArbiter;", "setWindowRotationArbiter", "(Lcom/ss/android/lark/qrcode/ui/WindowRotationArbiter;)V", "handleSelectedPhoto", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "rebindNewInstance", "Companion", "IQRCodeScanCustomViewInjector", "IQRCodeScanListener", "ScanResult", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.ui.c */
public final class QRCodeScanFragment extends BaseFragment {

    /* renamed from: e */
    public static final Companion f130811e = new Companion(null);

    /* renamed from: a */
    public C52962f f130812a;

    /* renamed from: b */
    public final List<aj.AbstractC29546a> f130813b = new ArrayList();

    /* renamed from: c */
    public final List<aj.AbstractC29547b> f130814c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public WindowRotationArbiter f130815d;

    /* renamed from: f */
    private IQRCodeScanListener f130816f;

    /* renamed from: g */
    private IQRCodeScanCustomViewInjector f130817g;

    /* renamed from: h */
    private final long f130818h = System.currentTimeMillis();

    /* renamed from: i */
    private QRCodeScanView.AbstractC52944a f130819i = new C52949e(this);

    /* renamed from: j */
    private AbstractC52938a f130820j = QRCodeModule.f130791c.mo180847b();

    /* renamed from: k */
    private HashMap f130821k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanCustomViewInjector;", "", "onCreateCustomView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$b */
    public interface IQRCodeScanCustomViewInjector {
        /* renamed from: a */
        View mo180913a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$IQRCodeScanListener;", "", "onScanResult", "", "result", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$ScanResult;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$c */
    public interface IQRCodeScanListener {
        /* renamed from: a */
        boolean mo180914a(ScanResult dVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m205050a(FragmentActivity fragmentActivity) {
        f130811e.mo180912a(fragmentActivity);
    }

    /* renamed from: c */
    public void mo180911c() {
        HashMap hashMap = this.f130821k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo180911c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$Companion;", "", "()V", "bindNewInstanceToActivity", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo180912a(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(16908290, new QRCodeScanFragment()).commit();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/qrcode/ui/QRCodeScanFragment$onActivityCreated$1", "Lcom/ss/android/lark/biz/core/api/IQRCodeContext;", "getContext", "Landroid/content/Context;", "registerActivityDestoryListener", "", "listener", "Lcom/ss/android/lark/biz/core/api/IQRCodeContext$IActivityDestoryListener;", "registerViewClickListener", "Lcom/ss/android/lark/biz/core/api/IQRCodeContext$IViewClickListener;", "startSpot", "unregisterActivityDestoryListener", "unregisterViewClickListener", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$f */
    public static final class C52950f implements aj {

        /* renamed from: a */
        final /* synthetic */ QRCodeScanFragment f130824a;

        @Override // com.ss.android.lark.biz.core.api.aj
        /* renamed from: a */
        public Context mo105591a() {
            Context requireContext = this.f130824a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            return requireContext;
        }

        @Override // com.ss.android.lark.biz.core.api.aj
        /* renamed from: b */
        public void mo105594b() {
            this.f130824a.mo180909a().mo180945b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52950f(QRCodeScanFragment cVar) {
            this.f130824a = cVar;
        }

        @Override // com.ss.android.lark.biz.core.api.aj
        /* renamed from: a */
        public void mo105592a(aj.AbstractC29546a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            this.f130824a.f130813b.add(aVar);
        }

        @Override // com.ss.android.lark.biz.core.api.aj
        /* renamed from: a */
        public void mo105593a(aj.AbstractC29547b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            this.f130824a.f130814c.add(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$h */
    static final class RunnableC52952h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ QRCodeScanFragment f130825a;

        RunnableC52952h(QRCodeScanFragment cVar) {
            this.f130825a = cVar;
        }

        public final void run() {
            this.f130825a.mo180909a().mo180946c();
        }
    }

    /* renamed from: a */
    public final C52962f mo180909a() {
        C52962f fVar = this.f130812a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        return fVar;
    }

    /* renamed from: b */
    public final void mo180910b() {
        getParentFragmentManager().beginTransaction().replace(16908290, new QRCodeScanFragment()).commit();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AbstractC52938a aVar = this.f130820j;
        if (aVar != null) {
            aVar.mo178100a();
        }
        C52962f fVar = this.f130812a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar.mo180947d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!TextUtils.isEmpty(QRCodeScanActivity.f130794a)) {
            HashMap hashMap = new HashMap();
            hashMap.put("first_render", Long.valueOf(System.currentTimeMillis() - this.f130818h));
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            String str = QRCodeScanActivity.f130794a;
            Intrinsics.checkExpressionValueIsNotNull(str, "QRCodeScanActivity.sAppreciableKey");
            a.mo103522b(str, hashMap, null, null, null);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        AbstractC52938a aVar = this.f130820j;
        if (aVar != null) {
            aVar.mo178100a();
        }
        AbstractC52938a b = QRCodeModule.f130791c.mo180847b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        if (b.mo178110d()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC52952h(this), 500);
            return;
        }
        C52962f fVar = this.f130812a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar.mo180946c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int size = this.f130813b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aj.AbstractC29546a aVar = this.f130813b.get(size);
            if (aVar != null) {
                aVar.mo105595a(requireActivity());
            }
        }
        C52962f fVar = this.f130812a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar.mo180948e();
        super.onDestroy();
        C52953d.m205064a().mo180936e();
        C52953d.m205064a().mo180929b();
        C52953d.m205064a().mo180932c();
        this.f130813b.clear();
        this.f130814c.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/QRCodeScanFragment$ScanResult;", "", "()V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$d */
    public static final class ScanResult {

        /* renamed from: a */
        private String f130822a;

        /* renamed from: a */
        public final void mo180915a(String str) {
            this.f130822a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/qrcode/ui/QRCodeScanFragment$mViewDependency$1", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanView$ViewDependency;", "injectView", "", "qrCodeScanView", "Lcom/ss/android/lark/qrcode/ui/QRCodeScanView;", "selectFromGallery", "v", "Landroid/view/View;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$e */
    public static final class C52949e implements QRCodeScanView.AbstractC52944a {

        /* renamed from: a */
        final /* synthetic */ QRCodeScanFragment f130823a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52949e(QRCodeScanFragment cVar) {
            this.f130823a = cVar;
        }

        @Override // com.ss.android.lark.qrcode.ui.QRCodeScanView.AbstractC52944a
        /* renamed from: a */
        public void mo180891a(QRCodeScanView qRCodeScanView) {
            Intrinsics.checkParameterIsNotNull(qRCodeScanView, "qrCodeScanView");
            ButterKnife.bind(qRCodeScanView, this.f130823a.requireActivity());
        }

        @Override // com.ss.android.lark.qrcode.ui.QRCodeScanView.AbstractC52944a
        /* renamed from: a */
        public void mo180890a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            for (aj.AbstractC29547b bVar : this.f130823a.f130814c) {
                if (bVar != null) {
                    bVar.mo105596a(view);
                }
            }
            QRCodeScanActivity.m204983a(this.f130823a.requireContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        WindowRotationArbiter iVar = this.f130815d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowRotationArbiter");
        }
        iVar.mo180965a(configuration);
    }

    /* renamed from: a */
    private final void m205049a(Intent intent) {
        ArrayList<String> arrayList;
        String str = null;
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra("SELECTED_PHOTOS");
        } else {
            arrayList = null;
        }
        if (CollectionUtils.isEmpty(arrayList)) {
            Log.m165389i(this.TAG, "onActivityResult photos is empty");
            return;
        }
        if (arrayList != null) {
            str = arrayList.get(0);
        }
        if (!TextUtils.isEmpty(str)) {
            C52962f fVar = this.f130812a;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            fVar.mo180943a(str);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C52953d.m205064a().mo180925a(new C52950f(this));
        FragmentActivity requireActivity = requireActivity();
        QRCodeScanView.AbstractC52944a aVar = this.f130819i;
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "requireActivity()");
        this.f130812a = new C52962f(requireActivity, aVar, requireActivity2.getIntent());
        View findViewById = requireView().findViewById(R.id.qrcode_root_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "requireView().findViewBy…t>(R.id.qrcode_root_view)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        C52962f fVar = this.f130812a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        View a = fVar.mo180940a(constraintLayout);
        Intrinsics.checkExpressionValueIsNotNull(a, "mPresenter.createQRCodeScanView(qrCodeRootView)");
        constraintLayout.addView(a, 0);
        C52962f fVar2 = this.f130812a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar2.create();
        C52962f fVar3 = this.f130812a;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        fVar3.mo180942a(this.f130816f);
        if (!TextUtils.isEmpty(QRCodeScanActivity.f130794a)) {
            HashMap hashMap = new HashMap();
            hashMap.put("init_view_cost", Long.valueOf(System.currentTimeMillis() - this.f130818h));
            AppreciableKit a2 = AppreciableKit.f73094h.mo103524a();
            String str = QRCodeScanActivity.f130794a;
            Intrinsics.checkExpressionValueIsNotNull(str, "QRCodeScanActivity.sAppreciableKey");
            a2.mo103522b(str, hashMap, null, null, null);
        }
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity3, "requireActivity()");
        this.f130815d = new WindowRotationArbiter(requireActivity3, new C52951g(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.c$g */
    static final class C52951g extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ QRCodeScanFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52951g(QRCodeScanFragment cVar) {
            super(2);
            this.this$0 = cVar;
        }

        public final void invoke(int i, int i2) {
            this.this$0.mo180910b();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1 && i == 233) {
            m205049a(intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_qrcode_scan, viewGroup, false);
        IQRCodeScanCustomViewInjector bVar = this.f130817g;
        if (bVar != null) {
            view = bVar.mo180913a(layoutInflater, viewGroup, bundle);
        } else {
            view = null;
        }
        if (view != null) {
            if (inflate != null) {
                ((ViewGroup) inflate).addView(view);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        return inflate;
    }
}
