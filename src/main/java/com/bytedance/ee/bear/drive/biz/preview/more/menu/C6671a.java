package com.bytedance.ee.bear.drive.biz.preview.more.menu;

import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.AbstractC7586e;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.drive.biz.external.OpenExternalItemV2;
import com.bytedance.ee.bear.drive.biz.extra_info.C6438a;
import com.bytedance.ee.bear.drive.biz.extra_info.meta.DriveMetaInfoVM;
import com.bytedance.ee.bear.drive.biz.fileinfo.DriveFileInfoHelper;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6521a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.more.download.spacefile.DownloadItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.fileInfo.FileInfoItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.find.FindItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.importfile.ImportFileItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.record.RecordItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.RenameItemV2;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.share.DriveShareMoreItemV2;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DriveActivity;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.AbstractC10209c;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.a */
public class C6671a {

    /* renamed from: a */
    public DrivePluginHost f18202a;

    /* renamed from: b */
    public FragmentActivity f18203b;

    /* renamed from: c */
    public C6937b f18204c;

    /* renamed from: d */
    protected C68289a f18205d = new C68289a();

    /* renamed from: e */
    public boolean f18206e;

    /* renamed from: f */
    public DriveMGPermissionVM f18207f;

    /* renamed from: g */
    public DriveMetaInfoVM f18208g;

    /* renamed from: h */
    private C10917c f18209h;

    /* renamed from: i */
    private DriveMoreMenuViewModel f18210i;

    /* renamed from: j */
    private C7130c f18211j;

    /* renamed from: k */
    private Disposable f18212k;

    /* renamed from: l */
    private HashMap<String, IBaseMoreItem> f18213l;

    /* renamed from: m */
    private C6438a f18214m;

    /* renamed from: n */
    private AbstractC6675a f18215n;

    /* renamed from: o */
    private DialogInterface$OnCancelListenerC1021b f18216o;

    /* renamed from: p */
    private C1177w<IMoreInfo> f18217p = new C1177w<>();

    /* renamed from: q */
    private Bundle f18218q;

    /* renamed from: r */
    private AbstractC1178x<C6522b> f18219r;

    /* renamed from: s */
    private LifecycleOwner f18220s;

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.a$a */
    public interface AbstractC6675a {
        /* renamed from: a */
        RenameItemV2.AbstractC6683a mo26284a();

        /* renamed from: a */
        void mo26285a(boolean z);

        /* renamed from: b */
        FindItemV2.AbstractC6679a mo26286b();
    }

    /* renamed from: a */
    public boolean mo26351a() {
        C6937b bVar = this.f18204c;
        if (bVar == null || bVar.getFileModel() == null) {
            C13479a.m54758a("DriveMoreRouteCompatAction", "MoreImageAction performAction mDriveState or fileModel is null");
            return true;
        }
        C6521a b = this.f18208g.getLiveMetaInfo().mo5927b();
        if (b == null) {
            this.f18208g.getLiveMetaInfo().mo5925a(new AbstractC1178x<C6521a>() {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a.C66721 */

                /* renamed from: a */
                public void onChanged(C6521a aVar) {
                    if (!C13726a.m55676b(C6671a.this.f18203b)) {
                        C6671a.this.f18208g.getLiveMetaInfo().mo5928b(this);
                        if (aVar != null) {
                            C6671a.this.mo26349a(aVar);
                        } else {
                            Toast.showFailureText(C6671a.this.f18203b, C6671a.this.f18203b.getString(R.string.Drive_Drive_GetFileInformationFail), 0);
                        }
                    }
                }
            });
            this.f18208g.fetchMetaInfo(this.f18204c.getOpenEntity().getFileId());
        } else {
            mo26349a(b);
        }
        return true;
    }

    /* renamed from: e */
    private IBaseMoreItem m26389e() {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38965a(new IMultiTaskMoreItemHelper() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a.C66743 */

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ Unit m26399f() {
                if (C6671a.this.f18203b == null) {
                    return null;
                }
                C6671a.this.f18203b.onBackPressed();
                return null;
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: b */
            public boolean mo23764b() {
                MultitaskHelper e = m26398e();
                if (e == null || !e.mo169049e()) {
                    return false;
                }
                return true;
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: c */
            public void mo23765c() {
                MultitaskHelper e = m26398e();
                if (e != null) {
                    e.mo169050f();
                }
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: d */
            public void mo23766d() {
                MultitaskHelper e = m26398e();
                if (e != null) {
                    e.mo169045a(new Function0() {
                        /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.$$Lambda$a$3$seosaJdiLx5tyDiF_yogRZn3sg */

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C6671a.C66743.this.m26399f();
                        }
                    });
                }
            }

            @Override // com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper
            /* renamed from: a */
            public boolean mo23763a() {
                if ((C6671a.this.f18203b instanceof DriveActivity) || (C6671a.this.f18203b instanceof AbstractC7586e)) {
                    return true;
                }
                return false;
            }

            /* renamed from: e */
            private MultitaskHelper m26398e() {
                if (!mo23763a()) {
                    return null;
                }
                if (C6671a.this.f18203b instanceof DriveActivity) {
                    return ((DriveActivity) C6671a.this.f18203b).mo27251a();
                }
                if (C6671a.this.f18203b instanceof AbstractC7586e) {
                    return ((AbstractC7586e) C6671a.this.f18203b).mo29850a();
                }
                return null;
            }
        });
    }

    /* renamed from: b */
    public boolean mo26352b() {
        DialogInterface$OnCancelListenerC1021b bVar = this.f18216o;
        if (bVar == null || bVar.v_() == null || !this.f18216o.v_().isShowing()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m26390f() {
        this.f18216o = ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38962a(this.f18203b, m26388d(), this.f18217p, new C1177w<>(), (AbstractC10209c) null, this.f18211j.mo27958f(this.f18204c.getFileModel()));
    }

    /* renamed from: c */
    public void mo26353c() {
        HashMap<String, IBaseMoreItem> hashMap = this.f18213l;
        if (hashMap != null) {
            for (IBaseMoreItem iBaseMoreItem : hashMap.values()) {
                if (iBaseMoreItem instanceof AbstractC6677b) {
                    ((AbstractC6677b) iBaseMoreItem).onDetach();
                }
            }
        }
        this.f18210i.onDetach();
        Disposable disposable = this.f18212k;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f18205d.mo237935a();
    }

    /* renamed from: d */
    private ArrayList<MoreItemGroup> m26388d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean isTypeWiki = this.f18204c.isTypeWiki();
        boolean z8 = true;
        MoreItemGroup a = new MoreItemGroup().mo39169a(1).mo39170a(m26378a(this.f18203b, CommonMoreItemId.SHORT_CUT)).mo39170a(new DriveShareMoreItemV2(this.f18203b, this.f18204c, this.f18207f, this.f18206e, this.f18202a)).mo39171a(m26389e(), !this.f18206e).mo39171a(m26378a(this.f18203b, CommonMoreItemId.STAR), !isTypeWiki).mo39171a(m26378a(this.f18203b, CommonMoreItemId.PIN), !isTypeWiki).mo39171a(m26378a(this.f18203b, CommonMoreItemId.MANUAL_CACHE), !isTypeWiki).mo39171a(m26378a(this.f18203b, CommonMoreItemId.ADD), !isTypeWiki).mo39171a(m26378a(this.f18203b, CommonMoreItemId.ADD_SHORT_CUT), !isTypeWiki);
        IBaseMoreItem a2 = m26378a(this.f18203b, CommonMoreItemId.DELETE);
        if (this.f18206e || isTypeWiki) {
            z = false;
        } else {
            z = true;
        }
        MoreItemGroup a3 = a.mo39171a(a2, z).mo39171a(((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21067b(this.f18202a), isTypeWiki).mo39171a(((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21061a(this.f18202a), isTypeWiki);
        HashMap<String, IBaseMoreItem> b = m26386b(this.f18217p.mo5927b());
        IBaseMoreItem iBaseMoreItem = b.get("item_file_statsV2");
        IBaseMoreItem iBaseMoreItem2 = b.get("id_drive_findV2");
        IBaseMoreItem iBaseMoreItem3 = b.get("item_renameV2");
        IBaseMoreItem iBaseMoreItem4 = b.get("item_import_fileV2");
        IBaseMoreItem iBaseMoreItem5 = b.get("item_downloadV2");
        IBaseMoreItem iBaseMoreItem6 = b.get("item_openexternalV2");
        IBaseMoreItem iBaseMoreItem7 = b.get("item_recordV2");
        MoreItemGroup a4 = new MoreItemGroup().mo39169a(3);
        if (iBaseMoreItem != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        MoreItemGroup a5 = a4.mo39171a(iBaseMoreItem, z2).mo39170a(m26378a(this.f18203b, CommonMoreItemId.PERMISSION));
        if (iBaseMoreItem2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        MoreItemGroup a6 = a5.mo39171a(iBaseMoreItem2, z3);
        if (iBaseMoreItem3 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        MoreItemGroup a7 = a6.mo39171a(iBaseMoreItem3, z4).mo39170a(m26378a(this.f18203b, CommonMoreItemId.APPLY_EDIT_PERMISSION));
        if (iBaseMoreItem4 == null || isTypeWiki) {
            z5 = false;
        } else {
            z5 = true;
        }
        MoreItemGroup a8 = a7.mo39171a(iBaseMoreItem4, z5);
        if (iBaseMoreItem5 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        MoreItemGroup a9 = a8.mo39171a(iBaseMoreItem5, z6);
        if (iBaseMoreItem6 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        MoreItemGroup a10 = a9.mo39171a(iBaseMoreItem6, z7);
        if (iBaseMoreItem7 == null) {
            z8 = false;
        }
        MoreItemGroup a11 = a10.mo39171a(iBaseMoreItem7, z8).mo39171a(m26378a(this.f18203b, CommonMoreItemId.MAKE_COPY), !isTypeWiki);
        DrivePluginHost aVar = this.f18202a;
        MoreItemGroup a12 = a11.mo39171a(((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21062a(aVar, aVar.mo27261l().getFileName()), isTypeWiki).mo39170a(m26378a(this.f18203b, CommonMoreItemId.CONTACT_SERVICE)).mo39170a(m26378a(this.f18203b, CommonMoreItemId.REPORT));
        ArrayList<MoreItemGroup> arrayList = new ArrayList<>();
        arrayList.add(a3);
        arrayList.add(a12);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.a$b */
    public static class C6676b implements Function<String, AbstractC70020b<Boolean>> {

        /* renamed from: a */
        private final IMoreInfo f18226a;

        private C6676b(IMoreInfo dVar) {
            this.f18226a = dVar;
        }

        /* renamed from: a */
        public AbstractC70020b<Boolean> apply(String str) {
            return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31524f(this.f18226a.mo39041h());
        }
    }

    /* renamed from: a */
    private void m26381a(IMoreInfo dVar) {
        Disposable disposable = this.f18212k;
        if (disposable != null && !disposable.isDisposed()) {
            this.f18212k.dispose();
        }
        this.f18212k = AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c(new C6676b(dVar)).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) false)).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(dVar) {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.$$Lambda$a$CI_aPxbMHylbUswPlVqRRf_NVg0 */
            public final /* synthetic */ IMoreInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6671a.this.m26382a((C6671a) this.f$1, (IMoreInfo) ((Boolean) obj));
            }
        }, $$Lambda$a$theLM2F0VDvcMpfNLhB3UijSRE.INSTANCE);
    }

    /* renamed from: b */
    private HashMap<String, IBaseMoreItem> m26386b(IMoreInfo dVar) {
        this.f18213l.clear();
        if (dVar == null) {
            return this.f18213l;
        }
        DownloadItemV2 downloadItemV2 = new DownloadItemV2(this.f18203b, this.f18204c, dVar);
        OpenExternalItemV2 openExternalItemV2 = new OpenExternalItemV2(this.f18203b, this.f18209h, (C7086a) this.f18204c.getFileModel(), dVar);
        m26384a(openExternalItemV2, downloadItemV2);
        C7130c a = C6920b.m27342f().mo27166a();
        RenameItemV2 renameItemV2 = new RenameItemV2(this.f18203b, this.f18209h, (C7086a) this.f18204c.getFileModel(), dVar, a);
        if (this.f18215n.mo26284a() != null) {
            renameItemV2.setRenameCallback(this.f18215n.mo26284a());
        }
        C7086a aVar = (C7086a) this.f18204c.getFileModel();
        RecordItemV2 recordItemV2 = new RecordItemV2(this.f18203b, dVar, aVar.mo27322a().mo27364g(), aVar.mo27322a().f19097p, a);
        FileInfoItemV2 fileInfoItemV2 = new FileInfoItemV2(this.f18203b, (C7086a) this.f18204c.getFileModel(), this.f18214m, a);
        FindItemV2 findItemV2 = new FindItemV2(false, false, this.f18203b.getString(R.string.Drive_Drive_OperationDeny_FileEncrypted), this.f18215n.mo26286b());
        this.f18213l.put(findItemV2.getId(), findItemV2);
        this.f18213l.put(downloadItemV2.getId(), downloadItemV2);
        this.f18213l.put(openExternalItemV2.getId(), openExternalItemV2);
        this.f18213l.put(renameItemV2.getId(), renameItemV2);
        if (!this.f18206e) {
            this.f18213l.put(recordItemV2.getId(), recordItemV2);
        }
        this.f18213l.put(fileInfoItemV2.getId(), fileInfoItemV2);
        ImportFileItemV2 importFileItemV2 = new ImportFileItemV2(this.f18203b, (C7086a) this.f18204c.getFileModel(), dVar);
        this.f18213l.put(importFileItemV2.getId(), importFileItemV2);
        this.f18215n.mo26285a(false);
        return this.f18213l;
    }

    /* renamed from: a */
    private void m26384a(AbstractC6677b... bVarArr) {
        this.f18207f.livePerm().mo5923a(this.f18220s, new AbstractC1178x(bVarArr) {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.$$Lambda$a$KFW1hJvCYWsJiUhgdG8o_obWfcs */
            public final /* synthetic */ AbstractC6677b[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C6671a.this.m26385a((C6671a) this.f$1, (AbstractC6677b[]) ((C6522b) obj));
            }
        });
    }

    /* renamed from: a */
    public void mo26349a(C6521a aVar) {
        String str;
        if (this.f18204c.getOpenEntity().getFileId() == null) {
            str = "";
        } else {
            str = this.f18204c.getOpenEntity().getFileId();
        }
        this.f18205d.mo237937a(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31488a(str, C8275a.f22375h.mo32555b()).mo238001b(new Consumer(aVar) {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.$$Lambda$a$zDmbLTQ8F1_vmSFdDIc3r2t33U */
            public final /* synthetic */ C6521a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6671a.this.m26387b(this.f$1, (DocVersion) obj);
            }
        }, new Consumer(aVar) {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.$$Lambda$a$sgiNiG3TtlzUKywpTiEFgrox8bY */
            public final /* synthetic */ C6521a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6671a.this.m26380a((C6671a) this.f$1, (C6521a) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    private IBaseMoreItem m26378a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38964a(fragmentActivity, commonMoreItemId);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26380a(C6521a aVar, Throwable th) throws Exception {
        C13479a.m54761a("DriveMoreRouteCompatAction", th);
        m26387b(aVar, new DocVersion());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26382a(IMoreInfo dVar, Boolean bool) throws Exception {
        dVar.mo39032c(bool.booleanValue());
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38971a(dVar, this.f18217p, new Runnable() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.$$Lambda$a$jTPkVLCP1XSTFiPyMg8y0qGf6o */

            public final void run() {
                C6671a.this.m26390f();
            }
        });
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38974a(dVar.mo39041h(), dVar.mo39036e(), dVar.mo39038f(), dVar.mo39035d(), false, this.f18211j.mo27977l());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26387b(final C6521a aVar, final DocVersion docVersion) {
        C6522b b = this.f18207f.livePerm().mo5927b();
        if (b != null) {
            C6937b bVar = this.f18204c;
            mo26350a(C6522b.m26158a(bVar, aVar, b, (C7086a) bVar.getFileModel(), DriveFileInfoHelper.m25956a(this.f18204c), docVersion, this.f18206e, this.f18202a), b);
            return;
        }
        this.f18219r = new AbstractC1178x<C6522b>() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.C6671a.C66732 */

            /* renamed from: a */
            public void onChanged(C6522b bVar) {
                C6671a.this.f18207f.livePerm().mo5928b(this);
                if (bVar != null) {
                    C6671a.this.mo26350a(C6522b.m26158a(C6671a.this.f18204c, aVar, bVar, (C7086a) C6671a.this.f18204c.getFileModel(), DriveFileInfoHelper.m25956a(C6671a.this.f18204c), docVersion, C6671a.this.f18206e, C6671a.this.f18202a), bVar);
                    return;
                }
                Toast.showFailureText(C6671a.this.f18203b, C6671a.this.f18203b.getString(R.string.Drive_Drive_GetFileInformationFail), 0);
            }
        };
        this.f18207f.livePerm().mo5925a(this.f18219r);
        this.f18207f.fetchPermission(this.f18204c.getFileId());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26385a(AbstractC6677b[] bVarArr, C6522b bVar) {
        if (bVar != null) {
            if (!bVar.mo26059e()) {
                for (AbstractC6677b bVar2 : bVarArr) {
                    bVar2.onDetach();
                }
            }
            if (!bVar.mo26063i()) {
                this.f18214m.mo25793a();
            }
        }
    }

    /* renamed from: a */
    public void mo26350a(IMoreInfo dVar, C6522b bVar) {
        C6937b bVar2 = this.f18204c;
        if (bVar2 == null || bVar2.getFileModel() == null) {
            C13479a.m54758a("DriveMoreRouteCompatAction", "routeToMorePage mDriveState or fileModel is null");
            return;
        }
        m26381a(dVar);
        if (!(this.f18211j == null || this.f18204c.getFileModel() == null)) {
            this.f18211j.mo27956e(this.f18204c.getFileModel().mo27322a().f18785a);
            this.f18211j.mo27911a(this.f18204c.getFileModel(), "more", "ccm_space_docs_more_menu_view", (Map<String, Object>) null);
        }
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36654a(dVar.mo39041h(), dVar.mo39036e(), dVar.mo39038f(), false, bVar.mo26057c(), bVar.mo26067m(), this.f18206e, "", "");
    }

    public C6671a(DrivePluginHost aVar, LifecycleOwner lifecycleOwner, FragmentActivity fragmentActivity, C10917c cVar, C6937b bVar, DriveMGPermissionVM aVar2, DriveMetaInfoVM aVar3, DriveMoreMenuViewModel driveMoreMenuViewModel, C7130c cVar2, C6438a aVar4, boolean z, Bundle bundle, AbstractC6675a aVar5) {
        this.f18220s = lifecycleOwner;
        this.f18203b = fragmentActivity;
        this.f18209h = cVar;
        this.f18204c = bVar;
        this.f18207f = aVar2;
        this.f18208g = aVar3;
        this.f18211j = cVar2;
        this.f18210i = driveMoreMenuViewModel;
        this.f18214m = aVar4;
        this.f18206e = z;
        this.f18215n = aVar5;
        this.f18213l = new HashMap<>();
        this.f18218q = bundle;
        this.f18202a = aVar;
    }
}
