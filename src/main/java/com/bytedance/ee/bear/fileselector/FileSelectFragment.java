package com.bytedance.ee.bear.fileselector;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.android.file.picker.lib.dto.FilePickerLaunchParams;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.FileType;
import com.bytedance.ee.bear.fileselector.api.IFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.fileselector.exception.ImageOverSizeException;
import com.bytedance.ee.bear.fileselector.exception.VideoOverSizeException;
import com.bytedance.ee.bear.fileselector.listener.IBackToPickerViewListener;
import com.bytedance.ee.bear.fileselector.listener.IDialogLifecycle;
import com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener;
import com.bytedance.ee.bear.fileselector.listener.IGetContentViewListener;
import com.bytedance.ee.bear.fileselector.listener.OnDismissListener;
import com.bytedance.ee.bear.fileselector.model.FileSelectConfigModel;
import com.bytedance.ee.bear.fileselector.view.FilePanelDragView;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.photopicker.photo.MediaPickerView;
import com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13599c;
import com.bytedance.ee.util.p710m.AbstractC13706a;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001UB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002J\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001e\u0010*\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u001a\u001a\u00020\fH\u0003J \u0010.\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\"\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\fH\u0016J\u0012\u00107\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u00108\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00109\u001a\u00020\u001eH\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\b\u0010;\u001a\u00020\u001eH\u0016J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020=H\u0016J\"\u0010>\u001a\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u0010H\u0016J\b\u0010C\u001a\u00020\u001eH\u0016J\b\u0010D\u001a\u00020\u001eH\u0016J\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020)H\u0016J\b\u0010G\u001a\u00020\u001eH\u0016J\b\u0010H\u001a\u00020\u001eH\u0016J\b\u0010I\u001a\u00020%H\u0002J\b\u0010J\u001a\u00020\u001eH\u0002J\b\u0010K\u001a\u00020\u001eH\u0002J\b\u0010L\u001a\u00020\u001eH\u0002J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020-H\u0002J\u000e\u0010P\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u0010J\u000e\u0010R\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0010J\u0012\u0010S\u001a\u00020\u001e2\b\b\u0001\u0010T\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/FileSelectFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "mDragView", "Lcom/bytedance/ee/bear/fileselector/view/FilePanelDragView;", "mFileSelectConfig", "Lcom/bytedance/ee/bear/fileselector/api/FileSelectConfig;", "mFileSelectConfigModel", "Lcom/bytedance/ee/bear/fileselector/model/FileSelectConfigModel;", "mIsDenyDialogShow", "", "mLuban", "Lcom/bytedance/ee/util/algorithm/Luban;", "adjustHeight", "", "buildPickerView", "Lcom/bytedance/ee/bear/photopicker/photo/MediaPickerView;", "checkFileSize", "filePointer", "", "isFileUseUri", "compressAndCopyImage", "Ljava/io/File;", "srcFile", "isOrigin", "copyFile", "destFile", "createDialogWithDragView", "", "dialog", "Landroid/app/Dialog;", "height", "dismissDialog", "getLuban", "handleHeaderView", "Landroid/widget/FrameLayout;", "pickerView", "handleInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "handlePhoto", "selectedPhoto", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "initDialog", "contentView", "Landroid/view/View;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "onCreateDialog", "onDestroy", "onDestroyView", "onDetach", "onDismiss", "Landroid/content/DialogInterface;", "onKeyboardHeightChanged", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "orientation", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "openCcmAlbum", "openFilePicker", "openFullScreenAlbum", "openLarkCamara", "photo2FileBean", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "photo", "removeSelfFromFragmentManager", "animExit", "resetDialogHeight", "setFileSelectConfig", "config", "Companion", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.fileselector.a */
public final class FileSelectFragment extends DialogInterface$OnCancelListenerC1021b implements AbstractC7666d, AbstractC10549e {

    /* renamed from: e */
    public static final Companion f21057e = new Companion(null);

    /* renamed from: c */
    public FileSelectConfig f21058c;

    /* renamed from: d */
    public boolean f21059d;

    /* renamed from: f */
    private C13599c f21060f;

    /* renamed from: g */
    private FilePanelDragView f21061g;

    /* renamed from: h */
    private FileSelectConfigModel f21062h;

    /* renamed from: i */
    private HashMap f21063i;

    /* renamed from: g */
    public void mo30426g() {
        HashMap hashMap = this.f21063i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/fileselector/FileSelectFragment$Companion;", "", "()V", "FILE_UPLOAD_FILE_DESCRIPTOR", "", "REQUEST_CODE_OPEN_FILE_PICKER", "", "REQUEST_CODE_OPEN_FULL_SCREEN_ALBUM", "REQUEST_CODE_OPEN_LARK_CAMARA", "TAG", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo30424a(List<Photo> list, boolean z) {
        if (list.size() == 0) {
            FileSelectConfig fileSelectConfig = this.f21058c;
            if (fileSelectConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            IFileSelectListener aVar = fileSelectConfig.fileSelectListener;
            if (aVar != null) {
                aVar.mo18018a();
                return;
            }
            return;
        }
        AbstractC68307f.m265081a((Iterable) list).mo238020d(new C7773c(this, z)).mo237977a(CallableC7774d.f21068a, C7775e.f21069a).subscribeOn(C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new C7776f(this), new C7777g(this));
    }

    /* renamed from: a */
    public final void mo30422a(int i) {
        FragmentActivity activity = getActivity();
        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fm.beginTransaction()");
            if (i != 0) {
                beginTransaction.setCustomAnimations(0, i);
            }
            beginTransaction.remove(this).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "call"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$d */
    public static final class CallableC7774d<V> implements Callable<U> {

        /* renamed from: a */
        public static final CallableC7774d f21068a = new CallableC7774d();

        CallableC7774d() {
        }

        /* renamed from: a */
        public final List<FileBean> call() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackToPickerView"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$i */
    public static final class C7779i implements MediaPickerView.AbstractC10490b {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21073a;

        C7779i(FileSelectFragment aVar) {
            this.f21073a = aVar;
        }

        @Override // com.bytedance.ee.bear.photopicker.photo.MediaPickerView.AbstractC10490b
        /* renamed from: a */
        public final void mo30435a() {
            IBackToPickerViewListener aVar = FileSelectFragment.m31138a(this.f21073a).backToPickerViewListener;
            if (aVar != null) {
                aVar.onBackToPickerView();
            }
        }
    }

    /* renamed from: j */
    private final void m31146j() {
        Context context = getContext();
        if (context != null) {
            C58557a.m227128a(PickerParams.f144865a.mo198927a(new C7784l(this))).mo198512a(context, this, 1);
        }
    }

    /* renamed from: l */
    private final FrameLayout m31148l() {
        MediaPickerView m = m31149m();
        m.setMediaPickerListener(new C7778h(this));
        m.setBackToPickerViewCallBack(new C7779i(this));
        return m;
    }

    /* renamed from: m */
    private final MediaPickerView m31149m() {
        MediaPickerView mediaPickerView = new MediaPickerView(requireContext());
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        mediaPickerView.mo39805a(fileSelectConfig);
        return mediaPickerView;
    }

    /* renamed from: f */
    public final void mo30425f() {
        if (v_() != null) {
            Dialog v_ = v_();
            if (v_ == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(v_, "dialog!!");
            if (v_.isShowing()) {
                mo5513b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo30422a(R.anim.file_selector_panel_exit);
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        return fileSelectConfig.isConsumeBackPress;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FilePanelDragView filePanelDragView;
        super.onDestroyView();
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (fileSelectConfig.canDragView && (filePanelDragView = this.f21061g) != null) {
            filePanelDragView.mo45442c(true);
        }
        mo30426g();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDetach() {
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        IDialogLifecycle bVar = fileSelectConfig.dialogLifecycle;
        if (bVar != null) {
            bVar.mo30444e();
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        IDialogLifecycle bVar = fileSelectConfig.dialogLifecycle;
        if (bVar != null) {
            bVar.mo30442c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        IDialogLifecycle bVar = fileSelectConfig.dialogLifecycle;
        if (bVar != null) {
            bVar.mo30441b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        IDialogLifecycle bVar = fileSelectConfig.dialogLifecycle;
        if (bVar != null) {
            bVar.mo30439a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        IDialogLifecycle bVar = fileSelectConfig.dialogLifecycle;
        if (bVar != null) {
            bVar.mo30443d();
        }
    }

    /* renamed from: h */
    private final int m31144h() {
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (fileSelectConfig.adjustHeightByKeyboard) {
            return AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39936j();
        }
        FileSelectConfig fileSelectConfig2 = this.f21058c;
        if (fileSelectConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        int i = fileSelectConfig2.ccmPickViewHeight;
        FileSelectConfig fileSelectConfig3 = this.f21058c;
        if (fileSelectConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        return Math.max(i, fileSelectConfig3.minCcmPickViewHeight);
    }

    /* renamed from: i */
    private final void m31145i() {
        TakePhotoActivity.C10495a aVar = new TakePhotoActivity.C10495a();
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        TakePhotoActivity.C10495a a = aVar.mo39850a(fileSelectConfig.showTakePhoto);
        FileSelectConfig fileSelectConfig2 = this.f21058c;
        if (fileSelectConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        a.mo39852b(fileSelectConfig2.showTakeVideo).mo39851a(getActivity(), this, 2);
    }

    /* renamed from: k */
    private final void m31147k() {
        HashMap hashMap = new HashMap(1);
        String string = getString(R.string.Doc_Facade_PermissionStorage);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(\n             …Facade_PermissionStorage)");
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", string);
        Handler handler = new Handler(Looper.getMainLooper());
        C13708c.m55600a(getContext(), hashMap, new C7780j(this, handler), new C7782k(this, handler));
    }

    /* renamed from: n */
    private final C13599c m31150n() {
        if (this.f21060f == null) {
            C13599c a = C13599c.m55201a(getContext());
            FileSelectConfig fileSelectConfig = this.f21058c;
            if (fileSelectConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            C13599c b = a.mo50536b(fileSelectConfig.maxImageCompressSize);
            FileSelectConfig fileSelectConfig2 = this.f21058c;
            if (fileSelectConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            this.f21060f = b.mo50534a(fileSelectConfig2.imageCompressType);
        }
        return this.f21060f;
    }

    /* renamed from: o */
    private final boolean m31151o() {
        boolean z = C57744a.m224104a().getBoolean("android_file_upload_file_descriptor_config", true);
        C13479a.m54764b("FileSelectorFragment", "Fd ability is enable, " + z);
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.path_to_uri_enabled", false);
        if (!z || !a) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C13479a.m54772d("FileSelectorFragment", "onDestroy");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it.supportFragmentManager");
            if (!supportFragmentManager.isDestroyed()) {
                FileSelectConfig fileSelectConfig = this.f21058c;
                if (fileSelectConfig == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
                }
                if (fileSelectConfig.adjustHeightByKeyboard) {
                    AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this);
                }
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", C14002h.f36692e, "", "onHeightChange", "com/bytedance/ee/bear/fileselector/FileSelectFragment$createDialogWithDragView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$b */
    public static final class C7772b implements FilePanelDragView.AbstractC7795b {

        /* renamed from: a */
        final /* synthetic */ FilePanelDragView f21064a;

        /* renamed from: b */
        final /* synthetic */ FileSelectFragment f21065b;

        C7772b(FilePanelDragView filePanelDragView, FileSelectFragment aVar) {
            this.f21064a = filePanelDragView;
            this.f21065b = aVar;
        }

        @Override // com.bytedance.ee.bear.fileselector.view.FilePanelDragView.AbstractC7795b
        /* renamed from: a */
        public final void mo30427a(int i) {
            if (i == 0) {
                this.f21065b.mo30425f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "invoke", "com/bytedance/ee/bear/fileselector/FileSelectFragment$openFullScreenAlbum$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$l */
    public static final class C7784l extends Lambda implements Function1<PickerParams.Builder, Unit> {
        final /* synthetic */ FileSelectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7784l(FileSelectFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PickerParams.Builder aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(PickerParams.Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo198899e(!FileSelectFragment.m31138a(this.this$0).showGif);
            aVar.mo198884a(FileSelectFragment.m31138a(this.this$0).sourceType);
            aVar.mo198902f(FileSelectFragment.m31138a(this.this$0).showOrigin);
            aVar.mo198890b(FileSelectFragment.m31138a(this.this$0).mediaType);
            aVar.mo198893c(FileSelectFragment.m31138a(this.this$0).maxSelectImageNum);
            aVar.mo198897d(FileSelectFragment.m31138a(this.this$0).useLarkCamera);
            aVar.mo198908h(FileSelectFragment.m31138a(this.this$0).larkAlbumActionType);
        }
    }

    /* renamed from: a */
    public void mo30423a(FileSelectConfig fileSelectConfig) {
        Intrinsics.checkParameterIsNotNull(fileSelectConfig, "config");
        this.f21058c = fileSelectConfig;
    }

    /* renamed from: a */
    public static final /* synthetic */ FileSelectConfig m31138a(FileSelectFragment aVar) {
        FileSelectConfig fileSelectConfig = aVar.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        return fileSelectConfig;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShow", "", "onDialogStateChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$k */
    public static final class C7782k implements AbstractC13706a {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21077a;

        /* renamed from: b */
        final /* synthetic */ Handler f21078b;

        C7782k(FileSelectFragment aVar, Handler handler) {
            this.f21077a = aVar;
            this.f21078b = handler;
        }

        @Override // com.bytedance.ee.util.p710m.AbstractC13706a
        public final void onDialogStateChange(boolean z) {
            if (z) {
                this.f21077a.f21059d = true;
            } else {
                this.f21078b.postDelayed(new Runnable(this) {
                    /* class com.bytedance.ee.bear.fileselector.FileSelectFragment.C7782k.RunnableC77831 */

                    /* renamed from: a */
                    final /* synthetic */ C7782k f21079a;

                    {
                        this.f21079a = r1;
                    }

                    public final void run() {
                        this.f21079a.f21077a.mo30425f();
                    }
                }, 100);
            }
        }
    }

    /* renamed from: b */
    private final void m31143b(Bundle bundle) {
        if (bundle != null) {
            FileSelectConfigModel aVar = this.f21062h;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfigModel");
            }
            FileSelectConfig fileSelectConfig = aVar.getFileSelectConfig();
            if (fileSelectConfig != null) {
                this.f21058c = fileSelectConfig;
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        OnDismissListener fVar = fileSelectConfig.onDismissListener;
        if (fVar != null) {
            fVar.onDismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(bundle);
        FileSelectConfigModel aVar = this.f21062h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfigModel");
        }
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        aVar.setFileSelectConfig(fileSelectConfig);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "fileBeanList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$f */
    public static final class C7776f<T> implements Consumer<List<FileBean>> {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21070a;

        C7776f(FileSelectFragment aVar) {
            this.f21070a = aVar;
        }

        /* renamed from: a */
        public final void accept(List<FileBean> list) {
            IFileSelectListener aVar = FileSelectFragment.m31138a(this.f21070a).fileSelectListener;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(list, "fileBeanList");
                aVar.mo18019a(list);
            }
            if (FileSelectFragment.m31138a(this.f21070a).autoDismiss) {
                this.f21070a.mo30425f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$g */
    public static final class C7777g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21071a;

        C7777g(FileSelectFragment aVar) {
            this.f21071a = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            IFileSizeCheckListener cVar;
            if (th instanceof ImageOverSizeException) {
                IFileSizeCheckListener cVar2 = FileSelectFragment.m31138a(this.f21071a).fileCheckListener;
                if (cVar2 != null) {
                    cVar2.onFileOverSize(FileType.IMAGE);
                }
            } else if ((th instanceof VideoOverSizeException) && (cVar = FileSelectFragment.m31138a(this.f21071a).fileCheckListener) != null) {
                cVar.onFileOverSize(FileType.VIDEO);
            }
            if (FileSelectFragment.m31138a(this.f21071a).autoDismiss) {
                this.f21071a.mo30425f();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = new C1144ai(requireActivity()).mo6005a(FileSelectConfigModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(requir…tConfigModel::class.java)");
        this.f21062h = (FileSelectConfigModel) a;
        m31143b(bundle);
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (fileSelectConfig.adjustHeightByKeyboard) {
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGrant", "", "onCheckResult"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$j */
    public static final class C7780j implements AbstractC13707b {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21074a;

        /* renamed from: b */
        final /* synthetic */ Handler f21075b;

        C7780j(FileSelectFragment aVar, Handler handler) {
            this.f21074a = aVar;
            this.f21075b = handler;
        }

        @Override // com.bytedance.ee.util.p710m.AbstractC13707b
        public final void onCheckResult(boolean z) {
            C13479a.m54764b("FileSelectorFragment", "onCheckResult: isGrant=" + z);
            if (z) {
                FilePickerLaunchParams aVar = new FilePickerLaunchParams(this.f21074a, 3, 0, 4, (DefaultConstructorMarker) null);
                aVar.mo15824a(FileSelectFragment.m31138a(this.f21074a).showFilterMenu);
                aVar.mo15832d(FileSelectFragment.m31138a(this.f21074a).customSendBtnTips);
                SafeFilePicker.f21055a.mo30419a(aVar);
                return;
            }
            this.f21075b.postDelayed(new Runnable(this) {
                /* class com.bytedance.ee.bear.fileselector.FileSelectFragment.C7780j.RunnableC77811 */

                /* renamed from: a */
                final /* synthetic */ C7780j f21076a;

                {
                    this.f21076a = r1;
                }

                public final void run() {
                    if (!this.f21076a.f21074a.f21059d) {
                        this.f21076a.f21074a.mo30425f();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: a */
    private final FrameLayout m31137a(FrameLayout frameLayout) {
        Context context = getContext();
        if (context == null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (fileSelectConfig.headerViewRes != -1) {
            LayoutInflater from = LayoutInflater.from(getContext());
            FileSelectConfig fileSelectConfig2 = this.f21058c;
            if (fileSelectConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            linearLayout.addView(from.inflate(fileSelectConfig2.headerViewRes, (ViewGroup) null));
        } else {
            FileSelectConfig fileSelectConfig3 = this.f21058c;
            if (fileSelectConfig3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            if (fileSelectConfig3.headView != null) {
                FileSelectConfig fileSelectConfig4 = this.f21058c;
                if (fileSelectConfig4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
                }
                linearLayout.addView(fileSelectConfig4.headView);
            }
        }
        linearLayout.addView(frameLayout);
        return frameLayout2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$c */
    public static final class C7773c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21066a;

        /* renamed from: b */
        final /* synthetic */ boolean f21067b;

        C7773c(FileSelectFragment aVar, boolean z) {
            this.f21066a = aVar;
            this.f21067b = z;
        }

        /* renamed from: a */
        public final FileBean apply(Photo photo) {
            Intrinsics.checkParameterIsNotNull(photo, "photo");
            File file = new File(photo.getPath());
            if (photo.isVideo()) {
                if (FileSelectFragment.m31138a(this.f21066a).maxVideoSize > 0 && file.length() > FileSelectFragment.m31138a(this.f21066a).maxVideoSize) {
                    throw new VideoOverSizeException("Video over size. Max video size is " + FileSelectFragment.m31138a(this.f21066a).maxVideoSize + " and the video size is " + file.length());
                }
            } else if (!this.f21067b || FileSelectFragment.m31138a(this.f21066a).maxImageSize <= 0 || file.length() <= ((long) FileSelectFragment.m31138a(this.f21066a).maxImageSize)) {
                photo.setPath(this.f21066a.mo30421a(file, this.f21067b).getPath());
            } else {
                throw new ImageOverSizeException("Image over size. Max image size is " + FileSelectFragment.m31138a(this.f21066a).maxImageSize + " and the image size is " + file.length());
            }
            return this.f21066a.mo30420a(photo);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        Intrinsics.checkExpressionValueIsNotNull(a, "super.onCreateDialog(savedInstanceState)");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FileSelectConfig fileSelectConfig = this.f21058c;
            if (fileSelectConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            int i = fileSelectConfig.selectType;
            if (i == 0) {
                C13479a.m54775e("FileSelectorFragment", "Unknown Operate Type!");
            } else if (i == 1) {
                m31140a(a, new View(activity), 10);
                m31145i();
            } else if (i == 2) {
                int h = m31144h();
                FileSelectConfig fileSelectConfig2 = this.f21058c;
                if (fileSelectConfig2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
                }
                if (!fileSelectConfig2.canDragView) {
                    FrameLayout a2 = m31137a(m31148l());
                    m31140a(a, a2, h);
                    FileSelectConfig fileSelectConfig3 = this.f21058c;
                    if (fileSelectConfig3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
                    }
                    IGetContentViewListener dVar = fileSelectConfig3.getContentViewListener;
                    if (dVar != null) {
                        dVar.mo18105a(a2);
                    }
                } else {
                    m31142b(a, h);
                }
            } else if (i == 3) {
                m31140a(a, new View(activity), 10);
                m31146j();
            } else if (i == 4) {
                m31140a(a, new View(activity), 10);
                m31147k();
            }
        }
        FileSelectConfig fileSelectConfig4 = this.f21058c;
        if (fileSelectConfig4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        IDialogLifecycle bVar = fileSelectConfig4.dialogLifecycle;
        if (bVar != null) {
            bVar.mo30440a(a);
        }
        return a;
    }

    /* renamed from: a */
    public final FileBean mo30420a(Photo photo) {
        FileBean fileBean = new FileBean();
        fileBean.setId(photo.getId());
        fileBean.setPath(photo.getPath());
        fileBean.setMimeType(photo.getMimeType());
        fileBean.setDuration(photo.getDuration());
        fileBean.setChecked(photo.isChecked());
        fileBean.position = photo.position;
        fileBean.setNum(photo.getNum());
        fileBean.setPictureType(photo.getPictureType());
        fileBean.setWidth(photo.getWidth());
        fileBean.setHeight(photo.getHeight());
        fileBean.setSize(photo.getSize());
        fileBean.setCompressPath(photo.getCompressPath());
        return fileBean;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "collection", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "kotlin.jvm.PlatformType", "fileBean", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$e */
    public static final class C7775e<T1, T2> implements AbstractC68310b<U, T> {

        /* renamed from: a */
        public static final C7775e f21069a = new C7775e();

        C7775e() {
        }

        /* renamed from: a */
        public final void accept(List<FileBean> list, FileBean fileBean) {
            if (list != null) {
                Intrinsics.checkExpressionValueIsNotNull(fileBean, "fileBean");
                list.add(fileBean);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "selectedPhoto", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isOrigin", "", "sendPhoto"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.fileselector.a$h */
    public static final class C7778h implements MediaPickerView.AbstractC10489a {

        /* renamed from: a */
        final /* synthetic */ FileSelectFragment f21072a;

        C7778h(FileSelectFragment aVar) {
            this.f21072a = aVar;
        }

        @Override // com.bytedance.ee.bear.photopicker.photo.MediaPickerView.AbstractC10489a
        /* renamed from: a */
        public final void mo30434a(List<Photo> list, boolean z) {
            Intrinsics.checkParameterIsNotNull(list, "selectedPhoto");
            this.f21072a.mo30424a(list, z);
        }
    }

    /* renamed from: a */
    private final boolean m31141a(String str, boolean z) {
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (fileSelectConfig.maxFileSize <= 0) {
            return true;
        }
        FileSelectConfig fileSelectConfig2 = this.f21058c;
        if (fileSelectConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (fileSelectConfig2.maxFileSize < C13675f.m55519c(z, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m31142b(Dialog dialog, int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.file_panel_dialog_fragment, (ViewGroup) null, false);
        FilePanelDragView filePanelDragView = (FilePanelDragView) inflate.findViewById(R.id.file_dragview);
        this.f21061g = filePanelDragView;
        if (filePanelDragView != null) {
            FileSelectConfig fileSelectConfig = this.f21058c;
            if (fileSelectConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            if (!fileSelectConfig.canDragView) {
                filePanelDragView.getDragHandler().setVisibility(8);
                filePanelDragView.getTopBar().setVisibility(8);
                ViewGroup.LayoutParams layoutParams = filePanelDragView.getTopBar().getLayoutParams();
                if (layoutParams != null) {
                    UDShadowLayout.LayoutParams layoutParams2 = (UDShadowLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = 0;
                    filePanelDragView.getTopBar().setLayoutParams(layoutParams2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.shadow.UDShadowLayout.LayoutParams");
                }
            }
            filePanelDragView.mo45442c(false);
            filePanelDragView.mo17963a();
            filePanelDragView.addView(m31148l());
            filePanelDragView.setOnHeightChangeListener(new C7772b(filePanelDragView, this));
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        m31140a(dialog, inflate, i);
    }

    /* renamed from: a */
    private final File m31139a(File file, File file2) {
        if (!Intrinsics.areEqual(file.getPath(), file2.getPath())) {
            return file2;
        }
        C13479a.m54764b("FileSelectorFragment", "Copy file manually.");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "srcName");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null);
        if (name != null) {
            String substring = name.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            File file3 = new File(C13599c.m55203b(getContext()), "Luban_" + System.currentTimeMillis() + UUID.randomUUID() + substring);
            C13675f.m55514b(file, file3);
            return file3;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final File mo30421a(File file, boolean z) {
        FileSelectConfig fileSelectConfig = this.f21058c;
        if (fileSelectConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
        }
        if (!fileSelectConfig.enableImageCompress) {
            return file;
        }
        C13479a.m54772d("FileSelectorFragment", "compressImage, isOrigin = " + z);
        File file2 = null;
        if (z) {
            C13599c n = m31150n();
            if (n != null) {
                file2 = n.mo50535a(file);
            }
        } else {
            C13599c n2 = m31150n();
            if (n2 != null) {
                file2 = n2.mo50537b(file);
            }
        }
        if (file2 != null) {
            return m31139a(file, file2);
        }
        C13479a.m54775e("FileSelectorFragment", "compress image failed");
        return file;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        Dialog v_;
        Window window;
        if (i > 0 && (v_ = v_()) != null && v_.isShowing() && (window = v_.getWindow()) != null) {
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = i;
            window.getWindowManager().updateViewLayout(decorView, attributes);
        }
    }

    /* renamed from: a */
    private final void m31140a(Dialog dialog, View view, int i) {
        dialog.requestWindowFeature(1);
        if (getContext() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            dialog.setContentView(view);
        }
        if (dialog.getWindow() != null) {
            Window window = dialog.getWindow();
            if (window == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(window, "dialog.window!!");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = 1000;
            attributes.width = -1;
            attributes.height = i;
            attributes.softInputMode = 1;
            attributes.flags |= 264;
            attributes.flags &= -3;
            attributes.gravity = 80;
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setBackgroundDrawableResource(R.color.space_kit_trans);
            }
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        C13479a.m54764b("FileSelectorFragment", "onActivityResult()... requestCode = " + i + ", resultCode = " + i2);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("KEY_FOR_SEND", false)) {
                    boolean booleanExtra = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
                    Serializable serializableExtra = intent.getSerializableExtra("KEY_SELECTED_MEDIA");
                    if (serializableExtra != null) {
                        mo30424a(C69121n.m265989f(serializableExtra), booleanExtra);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.lark.widget.photo_picker.entity.Photo>");
                    }
                } else {
                    FileSelectConfig fileSelectConfig = this.f21058c;
                    if (fileSelectConfig == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
                    }
                    fileSelectConfig.fileSelectListener.mo18018a();
                }
            }
        } else if (i == 2 && i2 == -1) {
            if (intent != null) {
                Serializable serializableExtra2 = intent.getSerializableExtra("KEY_SELECTED_MEDIA");
                if (serializableExtra2 != null) {
                    mo30424a(C69121n.m265989f(serializableExtra2), intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.lark.widget.photo_picker.entity.Photo>");
                }
            }
        } else if (i != 3 || i2 != -1) {
            FileSelectConfig fileSelectConfig2 = this.f21058c;
            if (fileSelectConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            IFileSelectListener aVar = fileSelectConfig2.fileSelectListener;
            if (aVar != null) {
                aVar.mo18018a();
            }
        } else if (intent != null) {
            ArrayList arrayList = new ArrayList();
            ClipData clipData = intent.getClipData();
            boolean o = m31151o();
            if (clipData == null) {
                C13479a.m54764b("FileSelectorFragment", "onActivityResult REQUEST_CODE_OPEN_FILE_PICKER no ClipData");
            } else {
                int itemCount = clipData.getItemCount();
                for (int i3 = 0; i3 < itemCount; i3++) {
                    ClipData.Item itemAt = clipData.getItemAt(i3);
                    Intrinsics.checkExpressionValueIsNotNull(itemAt, "clipData.getItemAt(i)");
                    Uri uri = itemAt.getUri();
                    if (uri != null) {
                        if (o) {
                            str = uri.toString();
                            Intrinsics.checkExpressionValueIsNotNull(str, "uri.toString()");
                        } else {
                            String a = C57788ai.m224257a(getContext(), uri);
                            Intrinsics.checkExpressionValueIsNotNull(a, "UriUtils.getUriPath(context, uri)");
                            if (TextUtils.isEmpty(a)) {
                                C13479a.m54775e("FileSelectorFragment", "The file uri path is null and the uri is " + uri);
                            } else {
                                str = a;
                            }
                        }
                        if (m31141a(str, o)) {
                            arrayList.add(str);
                        } else {
                            FileSelectConfig fileSelectConfig3 = this.f21058c;
                            if (fileSelectConfig3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
                            }
                            IFileSizeCheckListener cVar = fileSelectConfig3.fileCheckListener;
                            if (cVar != null) {
                                cVar.onFileOverSize(FileType.FILE);
                            }
                        }
                    }
                }
            }
            FileSelectConfig fileSelectConfig4 = this.f21058c;
            if (fileSelectConfig4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFileSelectConfig");
            }
            IFileSelectListener aVar2 = fileSelectConfig4.fileSelectListener;
            if (aVar2 != null) {
                aVar2.mo25164a(arrayList, o);
            }
        }
        mo30425f();
    }
}
