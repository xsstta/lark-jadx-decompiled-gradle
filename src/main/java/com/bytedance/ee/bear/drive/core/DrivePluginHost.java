package com.bytedance.ee.bear.drive.core;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "Lcom/bytedance/ee/bear/document/FragmentHostAbility;", "driveFragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "driveViewModel", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "getDriveViewModel", "()Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "setDriveViewModel", "(Lcom/bytedance/ee/bear/drive/core/DriveViewModel;)V", "fileLoader", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader;", "getFileLoader", "()Lcom/bytedance/ee/bear/drive/core/load/IFileLoader;", "setFileLoader", "(Lcom/bytedance/ee/bear/drive/core/load/IFileLoader;)V", "getFragment", "getFragmentTitle", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.core.a */
public final class DrivePluginHost extends C4943e implements FragmentHostAbility {

    /* renamed from: b */
    public C6937b f18727b;

    /* renamed from: c */
    public IFileLoader f18728c;

    /* renamed from: d */
    private final Fragment f18729d;

    @Override // com.bytedance.ee.bear.document.FragmentHostAbility
    /* renamed from: b */
    public Fragment mo23794b() {
        return this.f18729d;
    }

    /* renamed from: l */
    public final C6937b mo27261l() {
        C6937b bVar = this.f18727b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("driveViewModel");
        }
        return bVar;
    }

    /* renamed from: m */
    public final IFileLoader mo27262m() {
        IFileLoader bVar = this.f18728c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileLoader");
        }
        return bVar;
    }

    @Override // com.bytedance.ee.bear.document.FragmentHostAbility
    /* renamed from: a */
    public String mo19354a() {
        C6937b bVar = this.f18727b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("driveViewModel");
        }
        String fileName = bVar.getFileName();
        if (fileName != null) {
            return fileName;
        }
        return "";
    }

    /* renamed from: a */
    public final void mo27259a(C6937b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f18727b = bVar;
    }

    public DrivePluginHost(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "driveFragment");
        this.f18729d = fragment;
    }

    /* renamed from: a */
    public final void mo27260a(IFileLoader bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f18728c = bVar;
    }
}
