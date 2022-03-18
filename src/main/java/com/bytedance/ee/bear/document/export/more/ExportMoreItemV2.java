package com.bytedance.ee.bear.document.export.more;

import android.text.TextUtils;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.ExportPlugin;
import com.bytedance.ee.bear.document.export.net.AbstractC5772b;
import com.bytedance.ee.bear.document.export.p306a.C5755a;
import com.bytedance.ee.bear.document.export.p307b.View$OnClickListenerC5760b;
import com.bytedance.ee.bear.document.export.p307b.View$OnClickListenerC5761c;
import com.bytedance.ee.bear.document.export.p308c.C5764b;
import com.bytedance.ee.bear.document.export.p308c.C5766c;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import org.koin.java.KoinJavaComponent;

public class ExportMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    private boolean adminCanExport;
    private boolean isFromList;
    private final FragmentActivity mActivity;
    public AbstractC5772b mExportExecutor;
    public C5755a mExportReporter;
    public final C4943e mPluginHost;
    private boolean ownerCanExport;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_export_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "export";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Document_Export);
    }

    private void reportExportView() {
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38975a("ccm_space_export_as_view", getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39038f(), aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
    }

    public void doAudit() {
        String str;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            C13479a.m54758a("ExportMoreItemV2", "[doAudit] get more info null!");
            return;
        }
        boolean z = moreInfo instanceof WikiMoreInfo;
        IAuditApi cVar = (IAuditApi) KoinJavaComponent.m268610a(IAuditApi.class);
        C8275a b = C8275a.m34052b(moreInfo.mo39057x());
        String h = moreInfo.mo39041h();
        if (z) {
            str = ((WikiMoreInfo) moreInfo).mo39091O();
        } else {
            str = "";
        }
        cVar.mo37703a(b, 12, h, 0, z ? 1 : 0, str);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        if (!this.adminCanExport) {
            return this.mActivity.getString(R.string.CreationMobile_ECM_AdminDisableToast);
        }
        if (!this.ownerCanExport) {
            return this.mActivity.getString(R.string.Doc_Document_ExportNoPermission);
        }
        return this.mActivity.getString(R.string.Doc_Export_CantExport_Empty);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        boolean z;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return false;
        }
        boolean a = C4211a.m17514a().mo16536a("docx_export_enabled", false);
        if (this.mPluginHost == null) {
            z = true;
        } else {
            z = false;
        }
        if (moreInfo.mo39036e() == 2 || moreInfo.mo39036e() == 3 || ((a && moreInfo.mo39036e() == 22) || (moreInfo.mo39036e() == 16 && !z))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        C4943e eVar;
        ExportPlugin exportPlugin;
        boolean shouldShowBadgeByJSMsg = shouldShowBadgeByJSMsg();
        if (!(!shouldShowBadgeByJSMsg || (eVar = this.mPluginHost) == null || (exportPlugin = (ExportPlugin) eVar.mo19540a(ExportPlugin.class)) == null)) {
            exportPlugin.onShowExportBadges("more_panel", "export");
        }
        if (((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38977a("export") || shouldShowBadgeByJSMsg) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        boolean z;
        boolean z2;
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
        if (aVar.mo39010F() && aVar.mo39006B()) {
            return false;
        }
        this.adminCanExport = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36544c(aVar.mo39057x(), aVar.mo39041h());
        boolean r = aVar.mo39051r();
        this.ownerCanExport = r;
        if (!this.adminCanExport || !r) {
            z = false;
        } else {
            z = true;
        }
        C13479a.m54764b("ExportMoreItemV2", "adminCanExport:" + this.adminCanExport + ", ownerCanExport:" + this.ownerCanExport);
        if (aVar.mo39057x() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || this.isFromList) {
            return z;
        }
        boolean isItemDisabledByJSMsg = isItemDisabledByJSMsg();
        C13479a.m54764b("ExportMoreItemV2", "is sheet, isExportDisabled :" + isItemDisabledByJSMsg);
        if (!z || isItemDisabledByJSMsg) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        String str;
        ExportPlugin exportPlugin;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            getHost().mo39166c();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38980b("export");
            C4943e eVar = this.mPluginHost;
            if (!(eVar == null || (exportPlugin = (ExportPlugin) eVar.mo19540a(ExportPlugin.class)) == null)) {
                exportPlugin.onClickExport();
            }
            if (C36808a.m145211c() == 1) {
                FragmentActivity fragmentActivity = this.mActivity;
                Toast.showText(fragmentActivity, fragmentActivity.getString(R.string.CreationMobile_ECM_SecuritySettingKAToast), 1, true);
                return;
            }
            if (moreInfo instanceof DocMoreInfo) {
                DocMoreInfo aVar = (DocMoreInfo) moreInfo;
                ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39009E(), moreInfo.mo39038f(), "export_as", "ccm_space_export_as_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
            }
            FragmentActivity fragmentActivity2 = this.mActivity;
            if (TextUtils.isEmpty(moreInfo.mo39042i())) {
                str = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31517c(this.mActivity, moreInfo.mo39036e());
            } else {
                str = moreInfo.mo39042i();
            }
            this.mExportExecutor = AbstractC5772b.CC.m23308a(fragmentActivity2, str);
            if (moreInfo.mo39036e() == 2 || moreInfo.mo39057x() == 2 || moreInfo.mo39036e() == 22) {
                initDocExportViewModel(moreInfo);
                ((DialogInterface$OnCancelListenerC1021b) View$OnClickListenerC5760b.instantiate(this.mActivity, View$OnClickListenerC5760b.class.getName())).mo5511a(this.mActivity.getSupportFragmentManager(), View$OnClickListenerC5760b.class.getName());
                reportExportView();
            } else if (moreInfo.mo39036e() == 3 || moreInfo.mo39057x() == 3) {
                initSheetExportViewModel(moreInfo);
                ((DialogInterface$OnCancelListenerC1021b) View$OnClickListenerC5761c.instantiate(this.mActivity, View$OnClickListenerC5761c.class.getName())).mo5511a(this.mActivity.getSupportFragmentManager(), View$OnClickListenerC5761c.class.getName());
                reportExportView();
            }
        } else {
            C13479a.m54758a("ExportMoreItemV2", "onItemClick fail, moreInfo is null");
        }
    }

    public ExportMoreItemV2(FragmentActivity fragmentActivity) {
        this(fragmentActivity, true);
    }

    private void initDocExportViewModel(final IMoreInfo dVar) {
        final C5764b bVar = (C5764b) aj.m5366a(this.mActivity).mo6005a(C5764b.class);
        bVar.setDelegate(new C5764b.AbstractC5765a() {
            /* class com.bytedance.ee.bear.document.export.more.ExportMoreItemV2.C57681 */

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: c */
            public void mo23200c() {
                ExportMoreItemV2.this.mExportExecutor.mo23222a();
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.C5764b.AbstractC5765a
            /* renamed from: a */
            public boolean mo23205a() {
                if (ExportMoreItemV2.this.mPluginHost != null) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.C5764b.AbstractC5765a
            /* renamed from: b */
            public void mo23206b() {
                ExportMoreItemV2.this.doAudit();
                bVar.startDocShot(new AbstractC5089af.AbstractC5092c() {
                    /* class com.bytedance.ee.bear.document.export.more.ExportMoreItemV2.C57681.C57691 */

                    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5092c
                    /* renamed from: a */
                    public void mo20204a() {
                        C57681.this.mo23198a("jpg_long");
                    }

                    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5092c
                    /* renamed from: b */
                    public void mo20205b() {
                        C57681.this.mo23199b("jpg_long");
                    }
                });
                ExportMoreItemV2.this.reportMoreSubMenuClick("image");
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: a */
            public void mo23198a(String str) {
                boolean z;
                C5755a aVar = ExportMoreItemV2.this.mExportReporter;
                IMoreInfo dVar = dVar;
                if (ExportMoreItemV2.this.mPluginHost == null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo23176a(dVar, z, str);
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: c */
            public void mo23201c(String str) {
                boolean z;
                C5755a aVar = ExportMoreItemV2.this.mExportReporter;
                IMoreInfo dVar = dVar;
                if (ExportMoreItemV2.this.mPluginHost == null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo23178c(dVar, z, str);
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: b */
            public void mo23199b(String str) {
                boolean z;
                C5755a aVar = ExportMoreItemV2.this.mExportReporter;
                IMoreInfo dVar = dVar;
                if (ExportMoreItemV2.this.mPluginHost == null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo23177b(dVar, z, str);
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: a */
            public void mo23197a(ExportFormatEnum exportFormatEnum, AbstractC5168a aVar) {
                ExportMoreItemV2.this.mExportExecutor.mo23221a(exportFormatEnum, C8275a.m34052b(dVar.mo39036e()).mo32553a(), dVar.mo39041h(), aVar);
                ExportMoreItemV2.this.reportMoreSubMenuClick(exportFormatEnum.getSuffix());
            }
        });
    }

    private void initSheetExportViewModel(final IMoreInfo dVar) {
        ((C5766c) aj.m5366a(this.mActivity).mo6005a(C5766c.class)).setDelegate(new C5766c.AbstractC5767a() {
            /* class com.bytedance.ee.bear.document.export.more.ExportMoreItemV2.C57702 */

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: c */
            public void mo23200c() {
                ExportMoreItemV2.this.mExportExecutor.mo23222a();
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.C5766c.AbstractC5767a
            /* renamed from: a */
            public boolean mo23212a() {
                if (ExportMoreItemV2.this.mPluginHost != null) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.C5766c.AbstractC5767a
            /* renamed from: b */
            public void mo23213b() {
                if (ExportMoreItemV2.this.mPluginHost != null) {
                    ExportMoreItemV2.this.mPluginHost.mo19549a(ExportPlugin.class, $$Lambda$7BpdcvNd3XSNXWr6jYC492U1JU.INSTANCE);
                    ExportMoreItemV2.this.mExportReporter.mo23176a(dVar, false, "image");
                }
                ExportMoreItemV2.this.reportMoreSubMenuClick("image");
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.C5766c.AbstractC5767a
            /* renamed from: a */
            public void mo23211a(AbstractC6054a aVar) {
                if (ExportMoreItemV2.this.mPluginHost != null) {
                    ExportMoreItemV2.this.mPluginHost.mo19549a(UnspecifiedOrientationPlugin.class, new AbstractC4942d() {
                        /* class com.bytedance.ee.bear.document.export.more.$$Lambda$ExportMoreItemV2$2$59y_wPTFOU9B7qBcrHfYxjLw91U */

                        @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
                        public final void onPluginFound(AbstractC4941c cVar) {
                            ((UnspecifiedOrientationPlugin) cVar).onOrientationSupportPanelShowing(AbstractC6054a.this);
                        }
                    });
                }
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.C5766c.AbstractC5767a
            /* renamed from: b */
            public void mo23214b(AbstractC6054a aVar) {
                if (ExportMoreItemV2.this.mPluginHost != null) {
                    ExportMoreItemV2.this.mPluginHost.mo19549a(UnspecifiedOrientationPlugin.class, new AbstractC4942d() {
                        /* class com.bytedance.ee.bear.document.export.more.$$Lambda$ExportMoreItemV2$2$NON_7s0751DmOr3uuOS7sllzwig */

                        @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
                        public final void onPluginFound(AbstractC4941c cVar) {
                            ((UnspecifiedOrientationPlugin) cVar).onOrientationSupportPanelDismiss(AbstractC6054a.this);
                        }
                    });
                }
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: c */
            public void mo23201c(String str) {
                boolean z;
                C5755a aVar = ExportMoreItemV2.this.mExportReporter;
                IMoreInfo dVar = dVar;
                if (ExportMoreItemV2.this.mPluginHost == null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo23178c(dVar, z, str);
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: a */
            public void mo23198a(String str) {
                boolean z;
                C5755a aVar = ExportMoreItemV2.this.mExportReporter;
                IMoreInfo dVar = dVar;
                if (ExportMoreItemV2.this.mPluginHost == null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo23176a(dVar, z, str);
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: b */
            public void mo23199b(String str) {
                boolean z;
                C5755a aVar = ExportMoreItemV2.this.mExportReporter;
                IMoreInfo dVar = dVar;
                if (ExportMoreItemV2.this.mPluginHost == null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo23177b(dVar, z, str);
            }

            @Override // com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a
            /* renamed from: a */
            public void mo23197a(ExportFormatEnum exportFormatEnum, AbstractC5168a aVar) {
                ExportMoreItemV2.this.mExportExecutor.mo23221a(exportFormatEnum, C8275a.m34052b(dVar.mo39036e()).mo32553a(), dVar.mo39041h(), aVar);
                ExportMoreItemV2.this.reportMoreSubMenuClick(exportFormatEnum.getSuffix());
            }
        });
    }

    public void reportMoreSubMenuClick(String str) {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo instanceof DocMoreInfo) {
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38976a("ccm_space_export_as_click", getHost().mo39165b().getArguments(), moreInfo.mo39041h(), moreInfo.mo39036e(), moreInfo.mo39038f(), moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D(), str, "none", "");
        }
    }

    public ExportMoreItemV2(FragmentActivity fragmentActivity, boolean z) {
        this(fragmentActivity, null, z);
    }

    public ExportMoreItemV2(FragmentActivity fragmentActivity, C4943e eVar, boolean z) {
        this.adminCanExport = true;
        this.ownerCanExport = true;
        this.mActivity = fragmentActivity;
        this.mPluginHost = eVar;
        this.mExportReporter = new C5755a(ar.m20936a());
        this.isFromList = z;
    }
}
