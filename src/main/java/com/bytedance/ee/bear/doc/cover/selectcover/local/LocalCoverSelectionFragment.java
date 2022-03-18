package com.bytedance.ee.bear.doc.cover.selectcover.local;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.cover.CoverViewModel;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.FileType;
import com.bytedance.ee.bear.fileselector.api.IFileSelectListener;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener;
import com.larksuite.suite.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "fileSizeCheckListener", "Lcom/bytedance/ee/bear/fileselector/listener/IFileSizeCheckListener;", "mCoverViewModel", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel;", "file2ImageItem", "Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "file", "Ljava/io/File;", "imageType", "", "getAlbumFileSelectListener", "Lcom/bytedance/ee/bear/fileselector/api/IFileSelectListener;", "getCameraFileSelectListener", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openAlbumInner", "openCameraInner", "Companion", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a */
public final class LocalCoverSelectionFragment extends C7667e {

    /* renamed from: b */
    public static final Companion f15405b = new Companion(null);

    /* renamed from: a */
    public CoverViewModel f15406a;

    /* renamed from: c */
    private IFileSizeCheckListener f15407c;

    /* renamed from: d */
    private HashMap f15408d;

    /* renamed from: c */
    public void mo21574c() {
        HashMap hashMap = this.f15408d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo21574c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment$Companion;", "", "()V", "MAX_IMAGE_SIZE_MB", "", "TAG", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final IFileSelectListener m21943d() {
        return new C5397b(this);
    }

    /* renamed from: e */
    private final IFileSelectListener m21944e() {
        return new C5398c(this);
    }

    /* renamed from: a */
    public final void mo21572a() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FileSelectorManager.Companion aVar = FileSelectorManager.f21081a;
            Intrinsics.checkExpressionValueIsNotNull(activity, "this");
            FragmentActivity fragmentActivity = activity;
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "this.supportFragmentManager");
            FileSelectConfig.C7791f fVar = (FileSelectConfig.C7791f) FileSelectConfig.fullScreenAlbumBuilder().mo30459a(m21943d());
            IFileSizeCheckListener cVar = this.f15407c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileSizeCheckListener");
            }
            FileSelectConfig a = ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) ((FileSelectConfig.C7791f) fVar.mo30456a(cVar)).mo30448b(20971520)).mo30463g(true)).mo30462f(20971520)).mo30453d(true)).mo30449b(false)).mo30455a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FileSelectConfig.fullScr…                 .build()");
            aVar.mo30481a(fragmentActivity, supportFragmentManager, a, "DocCover_LocalCoverSelectionFragment");
        }
    }

    /* renamed from: b */
    public final void mo21573b() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FileSelectorManager.Companion aVar = FileSelectorManager.f21081a;
            Intrinsics.checkExpressionValueIsNotNull(activity, "this");
            FragmentActivity fragmentActivity = activity;
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "this.supportFragmentManager");
            FileSelectConfig.C7792g gVar = (FileSelectConfig.C7792g) ((FileSelectConfig.C7792g) ((FileSelectConfig.C7792g) FileSelectConfig.larkCamaraBuilder().mo30463g(true)).mo30462f(20971520)).mo30459a(m21944e());
            IFileSizeCheckListener cVar = this.f15407c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileSizeCheckListener");
            }
            FileSelectConfig a = ((FileSelectConfig.C7792g) gVar.mo30456a(cVar)).mo30455a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FileSelectConfig.larkCam…                 .build()");
            aVar.mo30481a(fragmentActivity, supportFragmentManager, a, "DocCover_LocalCoverSelectionFragment");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment$getAlbumFileSelectListener$1", "Lcom/bytedance/ee/bear/fileselector/api/SimpleFileSelectListener;", "onSelectFileBeanList", "", "fileList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a$b */
    public static final class C5397b extends SimpleFileSelectListener {

        /* renamed from: a */
        final /* synthetic */ LocalCoverSelectionFragment f15409a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5397b(LocalCoverSelectionFragment aVar) {
            this.f15409a = aVar;
        }

        @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
        /* renamed from: a */
        public void mo18019a(List<? extends FileBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "fileList");
            if (!list.isEmpty()) {
                FileBean fileBean = (FileBean) list.get(0);
                File file = new File(fileBean.getPath());
                CoverViewModel a = LocalCoverSelectionFragment.m21942a(this.f15409a);
                LocalCoverSelectionFragment aVar = this.f15409a;
                String mimeType = fileBean.getMimeType();
                Intrinsics.checkExpressionValueIsNotNull(mimeType, "image.mimeType");
                a.selectLocalImage("album", aVar.mo21571a(file, mimeType));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment$getCameraFileSelectListener$1", "Lcom/bytedance/ee/bear/fileselector/api/SimpleFileSelectListener;", "onSelectFileBeanList", "", "fileList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a$c */
    public static final class C5398c extends SimpleFileSelectListener {

        /* renamed from: a */
        final /* synthetic */ LocalCoverSelectionFragment f15410a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5398c(LocalCoverSelectionFragment aVar) {
            this.f15410a = aVar;
        }

        @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
        /* renamed from: a */
        public void mo18019a(List<? extends FileBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "fileList");
            if (!list.isEmpty()) {
                FileBean fileBean = (FileBean) list.get(0);
                File file = new File(fileBean.getPath());
                CoverViewModel a = LocalCoverSelectionFragment.m21942a(this.f15410a);
                LocalCoverSelectionFragment aVar = this.f15410a;
                String mimeType = fileBean.getMimeType();
                Intrinsics.checkExpressionValueIsNotNull(mimeType, "image.mimeType");
                a.selectLocalImage("take_photo", aVar.mo21571a(file, mimeType));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment$onCreate$1", "Lcom/bytedance/ee/bear/fileselector/listener/IFileSizeCheckListener;", "onFileOverSize", "", "fileType", "Lcom/bytedance/ee/bear/fileselector/api/FileType;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a$d */
    public static final class C5399d implements IFileSizeCheckListener {

        /* renamed from: a */
        final /* synthetic */ LocalCoverSelectionFragment f15411a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5399d(LocalCoverSelectionFragment aVar) {
            this.f15411a = aVar;
        }

        @Override // com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener
        public void onFileOverSize(FileType fileType) {
            Intrinsics.checkParameterIsNotNull(fileType, "fileType");
            if (Intrinsics.areEqual(FileType.IMAGE.name(), fileType.name())) {
                Toast.showFailureText(this.f15411a.getContext(), (int) R.string.CreationMobile_Docs_DocCover_ExceedFileSize_Toast);
            } else {
                Toast.showFailureText(this.f15411a.getContext(), (int) R.string.CreationMobile_Docs_Operation_Failed_Tips);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment$onViewCreated$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a$e */
    static final class View$OnClickListenerC5400e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalCoverSelectionFragment f15412a;

        /* renamed from: b */
        final /* synthetic */ boolean f15413b;

        View$OnClickListenerC5400e(LocalCoverSelectionFragment aVar, boolean z) {
            this.f15412a = aVar;
            this.f15413b = z;
        }

        public final void onClick(View view) {
            this.f15412a.mo21572a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/doc/cover/selectcover/local/LocalCoverSelectionFragment$onViewCreated$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.local.a$f */
    static final class View$OnClickListenerC5401f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalCoverSelectionFragment f15414a;

        /* renamed from: b */
        final /* synthetic */ boolean f15415b;

        View$OnClickListenerC5401f(LocalCoverSelectionFragment aVar, boolean z) {
            this.f15414a = aVar;
            this.f15415b = z;
        }

        public final void onClick(View view) {
            this.f15414a.mo21573b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CoverViewModel m21942a(LocalCoverSelectionFragment aVar) {
        CoverViewModel aVar2 = aVar.f15406a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        return aVar2;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, CoverViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…verViewModel::class.java)");
        this.f15406a = (CoverViewModel) a;
        this.f15407c = new C5399d(this);
    }

    /* renamed from: a */
    public final LocalImageItem mo21571a(File file, String str) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        int[] a = C5627ab.m22837a(file);
        int i = a[0];
        int i2 = a[1];
        String path = file.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "file.path");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
        return new LocalImageItem(str, uuid, path, name, file.length(), i, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        CoverViewModel aVar = this.f15406a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        boolean isVCFollowMode = aVar.isVCFollowMode();
        View findViewById = view.findViewById(R.id.album);
        findViewById.setEnabled(!isVCFollowMode);
        findViewById.setOnClickListener(new View$OnClickListenerC5400e(this, isVCFollowMode));
        View findViewById2 = view.findViewById(R.id.take_photo);
        findViewById2.setEnabled(!isVCFollowMode);
        findViewById2.setOnClickListener(new View$OnClickListenerC5401f(this, isVCFollowMode));
        TextView textView = (TextView) view.findViewById(R.id.album_tv);
        Resources resources = getResources();
        int i2 = R.color.text_disable;
        if (isVCFollowMode) {
            i = R.color.text_disable;
        } else {
            i = R.color.text_title;
        }
        textView.setTextColor(resources.getColor(i));
        TextView textView2 = (TextView) view.findViewById(R.id.take_photo_tv);
        Resources resources2 = getResources();
        if (!isVCFollowMode) {
            i2 = R.color.text_title;
        }
        textView2.setTextColor(resources2.getColor(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.doc_cover_local_selection_fragment, viewGroup, false);
    }
}
