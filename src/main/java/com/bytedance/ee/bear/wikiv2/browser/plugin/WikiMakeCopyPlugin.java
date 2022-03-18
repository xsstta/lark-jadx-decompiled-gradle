package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.drive.ability.FileHostAbility;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.C10582o;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.quoto.SingleFileQuotaConfig;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.DoMakeCopyEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeObserver;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.C12432c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.CopyNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiTips;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

public class WikiMakeCopyPlugin extends BasePluginV2 implements AbstractC7664b {
    private C68289a disposables = new C68289a();
    private String documentName;
    private C4878c loadingDialog;
    private WikiViewModel wikiViewModel;

    public /* synthetic */ void lambda$startMakeCopy$3$WikiMakeCopyPlugin() throws Exception {
        this.loadingDialog.mo19130b();
    }

    private Long getFileSize() {
        FileHostAbility aVar = (FileHostAbility) getHostAbilityOrNull(FileHostAbility.class);
        if (aVar != null) {
            return aVar.getFileSize();
        }
        return 0L;
    }

    private boolean isFileType() {
        if (this.wikiViewModel.getObjTypeValue() == C8275a.f22375h.mo32555b()) {
            return true;
        }
        return false;
    }

    private String wikiToken() {
        TreeNode wikiMeta = this.wikiViewModel.getWikiMeta();
        if (wikiMeta == null || !wikiMeta.isShortcut()) {
            return this.wikiViewModel.getWikiToken();
        }
        return wikiMeta.origin_wiki_token;
    }

    private String title() {
        String str;
        if (!TextUtils.isEmpty(this.documentName)) {
            str = this.documentName;
        } else {
            str = C8292f.m34178c(getContext(), this.wikiViewModel.getObjTypeValue());
        }
        String string = getContext().getString(R.string.Doc_Facade_CopyDocSuffix);
        if (isFileType()) {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf < 0) {
                lastIndexOf = str.length();
            }
            StringBuilder sb = new StringBuilder(str);
            return sb.insert(lastIndexOf, " " + string).toString();
        }
        return String.format("%s %s", str, string);
    }

    public /* synthetic */ void lambda$startMakeCopy$2$WikiMakeCopyPlugin(AbstractC70022d dVar) throws Exception {
        this.loadingDialog.mo19132c();
    }

    public /* synthetic */ void lambda$startMakeCopy$5$WikiMakeCopyPlugin(Throwable th) throws Exception {
        C13479a.m54759a("WikiMakeCopyPlugin", "wiki copy fail. ", th);
        showFailureToast(th);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        this.disposables.mo237935a();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C13479a.m54764b("WikiMakeCopyPlugin", "onAttachToHost. ");
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(eVar, WikiViewModel.class, WikiViewModel.newFactory(((FragmentHostAbility) getHostAbility(FragmentHostAbility.class)).mo23794b().getArguments()));
        C4878c cVar = new C4878c(getContext());
        this.loadingDialog = cVar;
        cVar.mo19131b(WikiTips.f33454a.mo47514a(WikiAction.MAKE_COPY));
    }

    private void startMakeCopy(String[] strArr) {
        String wikiToken = wikiToken();
        WikiReportV2.m50909a("click_make_a_copy", wikiToken, wikiToken, Integer.valueOf(this.wikiViewModel.getObjTypeValue()));
        this.disposables.mo237937a(C12455c.m51791b((NetService) KoinJavaComponent.m268610a(NetService.class)).pull(new CopyNodePuller.Params(this.wikiViewModel.getSpaceId(), wikiToken, strArr[1], strArr[2], title())).mo238013c(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiMakeCopyPlugin$B9GP7nygtoh5C_gEgJu66T4WJs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiMakeCopyPlugin.this.lambda$startMakeCopy$2$WikiMakeCopyPlugin((AbstractC70022d) obj);
            }
        }).mo237995a(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiMakeCopyPlugin$4bdoa1CGA7xtbRRsuzg7WPtNlF8 */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                WikiMakeCopyPlugin.this.lambda$startMakeCopy$3$WikiMakeCopyPlugin();
            }
        }).mo238001b(new Consumer(strArr) {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiMakeCopyPlugin$_q_v6OYxRDTM_bEQgHeLy8NWkKI */
            public final /* synthetic */ String[] f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiMakeCopyPlugin.this.lambda$startMakeCopy$4$WikiMakeCopyPlugin(this.f$1, (TreeNode) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiMakeCopyPlugin$v_59EBsnOylyKkT2Q0mfTIrKoA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiMakeCopyPlugin.this.lambda$startMakeCopy$5$WikiMakeCopyPlugin((Throwable) obj);
            }
        }));
    }

    public void makeCopy(String str) {
        boolean z;
        int i;
        this.documentName = str;
        TreeNode wikiMeta = this.wikiViewModel.getWikiMeta();
        String spaceId = this.wikiViewModel.getSpaceId();
        String wikiToken = this.wikiViewModel.getWikiToken();
        if (wikiMeta == null || !wikiMeta.isShortcut()) {
            z = false;
        } else {
            z = true;
        }
        WikiReportV2.m50913a("make_a_copy_to", "ccm_wiki_file_location_select_view", spaceId, wikiToken, Boolean.valueOf(z), this.wikiViewModel.getObjToken(), this.wikiViewModel.getObjTypeValueString());
        String wikiToken2 = this.wikiViewModel.getWikiToken();
        if (wikiMeta != null) {
            i = wikiMeta.obj_type;
        } else {
            i = C8275a.f22369b.mo32555b();
        }
        C12432c.m51713a(wikiToken2, i, 4, 1026, null);
    }

    private void showFailureToast(Throwable th) {
        FragmentActivity activity = getActivity();
        if (activity != null && C5203d.m21235a(th, 11001)) {
            ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40012a(getActivity(), FullQuotoConfig.MAKE_COPY);
        } else if (activity != null && C5203d.m21235a(th, 900011002)) {
            ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40013a(getActivity(), null, null, false);
        } else if (activity == null || !C5203d.m21235a(th, 90001043) || !isFileType() || !((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40014a()) {
            Toast.showFailureText(getHost().mo19562e(), WikiTips.f33454a.mo47515a(WikiAction.MAKE_COPY, th));
        } else {
            ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40011a(activity, SingleFileQuotaConfig.DUPLICATE, getFileSize());
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
    }

    public /* synthetic */ void lambda$onActivityResult$1$WikiMakeCopyPlugin(String[] strArr, Throwable th) throws Exception {
        C13479a.m54759a("WikiMakeCopyPlugin", "wiki checkSingleFileExceed fail. ", th);
        startMakeCopy(strArr);
    }

    public /* synthetic */ void lambda$onActivityResult$0$WikiMakeCopyPlugin(String[] strArr, C10582o oVar) throws Exception {
        if (oVar.f28368a) {
            ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40011a(getActivity(), SingleFileQuotaConfig.DUPLICATE, oVar.f28369b);
        } else {
            startMakeCopy(strArr);
        }
    }

    public /* synthetic */ void lambda$startMakeCopy$4$WikiMakeCopyPlugin(String[] strArr, TreeNode treeNode) throws Exception {
        notifyDoMakeCopy(this.wikiViewModel.getSpaceId(), strArr[2], treeNode);
        Toast.showSuccessText(getHost().mo19562e(), WikiTips.f33454a.mo47516b(WikiAction.MAKE_COPY));
    }

    private void notifyDoMakeCopy(String str, String str2, TreeNode treeNode) {
        WikiTreeObserver.f33320a.mo47311c().mo47278a(new DoMakeCopyEvent(str, str2, treeNode));
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        String[] c;
        if (i2 != -1 || i != 1026 || (c = C12432c.m51720c(intent)) == null) {
            return;
        }
        if (!isFileType()) {
            startMakeCopy(c);
        } else {
            this.disposables.mo237937a(((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40010a(getFileSize()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(c) {
                /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiMakeCopyPlugin$IjEMcvcy88kZfgBFQxbBKFEMryk */
                public final /* synthetic */ String[] f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WikiMakeCopyPlugin.this.lambda$onActivityResult$0$WikiMakeCopyPlugin(this.f$1, (C10582o) obj);
                }
            }, new Consumer(c) {
                /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiMakeCopyPlugin$NJOeQdFFrZH2WX4T02neGcS8u8 */
                public final /* synthetic */ String[] f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WikiMakeCopyPlugin.this.lambda$onActivityResult$1$WikiMakeCopyPlugin(this.f$1, (Throwable) obj);
                }
            }));
        }
    }
}
