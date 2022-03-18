package com.bytedance.ee.bear.drive.biz.versions.history;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/versions/history/DriveHistoryModePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mDialogManager", "Lcom/bytedance/ee/bear/drive/view/dialog/DriveDialogManager;", "mVersionChangeDialog", "Landroid/app/Dialog;", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onDetachPreview", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveHistoryModePlugin extends AbsDrivePlugin {
    public final C7207a mDialogManager;
    public Dialog mVersionChangeDialog;

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachPreview() {
        super.onDetachPreview();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin$b */
    static final class C6844b<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveHistoryModePlugin f18612a;

        /* renamed from: b */
        final /* synthetic */ DriveHistoryVM f18613b;

        C6844b(DriveHistoryModePlugin driveHistoryModePlugin, DriveHistoryVM aVar) {
            this.f18612a = driveHistoryModePlugin;
            this.f18613b = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/drive/biz/versions/history/DriveHistoryModePlugin$onAttachPreview$2$confirmDialog$1", "Lcom/bytedance/ee/bear/drive/view/dialog/DriveDialogManager$IUserClickListener;", "cancel", "", "confirm", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin$b$a */
        public static final class C6845a implements C7207a.AbstractC7208a {

            /* renamed from: a */
            final /* synthetic */ C6844b f18614a;

            @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
            /* renamed from: a */
            public void mo25758a() {
            }

            @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
            /* renamed from: b */
            public void mo25759b() {
                DrivePluginHost aVar = (DrivePluginHost) this.f18614a.f18612a.getHost();
                Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
                C6891a.m27235c(aVar);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C6845a(C6844b bVar) {
                this.f18614a = bVar;
            }
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (TextUtils.equals(str, this.f18613b.getCurrentDataVersion())) {
                Dialog dialog = this.f18612a.mVersionChangeDialog;
                if (dialog == null || !dialog.isShowing()) {
                    Dialog b = this.f18612a.mDialogManager.mo28224b(this.f18612a.getActivity(), this.f18612a.getResources().getString(R.string.Drive_Drive_VersionHistoryDeletedTitle), this.f18612a.getResources().getString(R.string.Drive_Drive_VersionHistoryDeletedMessage), new C6845a(this));
                    Intrinsics.checkExpressionValueIsNotNull(b, "mDialogManager.getSimple…     }\n                })");
                    b.show();
                    this.f18612a.mVersionChangeDialog = b;
                }
            }
        }
    }

    public DriveHistoryModePlugin() {
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        C7207a g = f.mo27178g();
        Intrinsics.checkExpressionValueIsNotNull(g, "DriveConfigServiceImpl.getInstance().dialogManager");
        this.mDialogManager = g;
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        DriveHistoryVM aVar = (DriveHistoryVM) viewModel(DriveHistoryVM.class);
        aVar.getLiveHasNewVersion().mo5923a(getLifecycleOwner(), new C6842a(this, aVar));
        aVar.getLiveVersionDeleted().mo5923a(getLifecycleOwner(), new C6844b(this, aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/versions/history/DriveHistoryModePlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin$c */
    public static final class C6846c extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveHistoryModePlugin f18615a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6846c(DriveHistoryModePlugin driveHistoryModePlugin) {
            this.f18615a = driveHistoryModePlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.FileInfoSuccess && (t instanceof C7086a)) {
                ((DriveHistoryVM) this.f18615a.viewModel(DriveHistoryVM.class)).setCurrentDataVersion(t.mo27322a().f19097p);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin$a */
    static final class C6842a<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveHistoryModePlugin f18609a;

        /* renamed from: b */
        final /* synthetic */ DriveHistoryVM f18610b;

        C6842a(DriveHistoryModePlugin driveHistoryModePlugin, DriveHistoryVM aVar) {
            this.f18609a = driveHistoryModePlugin;
            this.f18610b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (!TextUtils.equals(str, this.f18610b.getCurrentDataVersion())) {
                Dialog dialog = this.f18609a.mVersionChangeDialog;
                if (dialog == null || !dialog.isShowing()) {
                    DriveHistoryModePlugin driveHistoryModePlugin = this.f18609a;
                    driveHistoryModePlugin.mVersionChangeDialog = driveHistoryModePlugin.mDialogManager.mo28219a(this.f18609a.getActivity(), new C7207a.AbstractC7208a(this) {
                        /* class com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin.C6842a.C68431 */

                        /* renamed from: a */
                        final /* synthetic */ C6842a f18611a;

                        @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                        /* renamed from: a */
                        public void mo25758a() {
                            Dialog dialog = this.f18611a.f18609a.mVersionChangeDialog;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            ((DrivePluginHost) this.f18611a.f18609a.getHost()).mo27261l().enterHistoryMode();
                        }

                        @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                        /* renamed from: b */
                        public void mo25759b() {
                            Dialog dialog = this.f18611a.f18609a.mVersionChangeDialog;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            CacheUtils.Companion.m25412a(CacheUtils.f17530a, ((DrivePluginHost) this.f18611a.f18609a.getHost()).mo27261l(), null, 2, null);
                            C13479a.m54764b("DriveComponent", "version update user confirm, start load");
                            ((DrivePluginHost) this.f18611a.f18609a.getHost()).mo27262m().mo27298b();
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f18611a = r1;
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin$d */
    public static final class C6847d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveHistoryModePlugin f18616a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18617b;

        C6847d(DriveHistoryModePlugin driveHistoryModePlugin, DrivePluginHost aVar) {
            this.f18616a = driveHistoryModePlugin;
            this.f18617b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                BaseOpenEntity openEntity = this.f18617b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                Bundle extras = openEntity.getExtras();
                if (extras != null) {
                    String string = extras.getString("extra_history_date");
                    if (!TextUtils.isEmpty(string)) {
                        this.f18616a.getTitleBar().mo19518b(string);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6846c(this));
        aVar.mo27261l().liveHistoryMode().mo5923a(getLifecycleOwner(), new C6847d(this, aVar));
    }
}
