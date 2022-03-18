package com.bytedance.ee.bear.document.pageview;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.C10211e;
import com.bytedance.ee.bear.more.export.PageviewResult;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.text.DecimalFormat;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class PageviewPlugin extends DocumentPlugin implements AbstractC6054a {
    private AbstractC1178x<PageviewResult> mPageviewResultObserver;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    private void notifyFrontedToCompute() {
        execJS("javascript:lark.biz.content.requestFileInfo", new JSONObject());
    }

    public static boolean isEnableDetailNew() {
        boolean a = C4211a.m17514a().mo16536a("ccm.suite.doc_detail_new", false);
        C13479a.m54764b("PageviewPlugin", "isEnableDetailNew:" + a);
        return a;
    }

    /* access modifiers changed from: package-private */
    public void showPageview() {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
        }
        String documentType = getDocViewModel().getDocumentType();
        int documentTypeValue = getDocViewModel().getDocumentTypeValue();
        String token = getDocViewModel().getToken();
        if (TextUtils.isEmpty(documentType) || TextUtils.isEmpty(token)) {
            C13479a.m54758a("PageviewPlugin", "objType or token is null");
        } else if (C8275a.f22371d.mo32553a().equals(documentType) && isEnableDetailNew()) {
            showPageViewFragment(documentTypeValue, token);
        } else if (C8275a.f22378k.mo32553a().equals(documentType) || C8275a.f22371d.mo32553a().equals(documentType)) {
            showPageview(documentTypeValue, token);
        } else if (C8275a.f22372e.mo32553a().equals(documentType)) {
            showSheetPageview(documentTypeValue, token, unspecifiedOrientationPlugin);
        } else if (C8275a.f22373f.mo32553a().equals(documentType)) {
            showBitablePageview(documentTypeValue, token, unspecifiedOrientationPlugin);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.pageview.PageviewPlugin$a */
    private class C6062a implements AbstractC7945d<PageviewResult> {
        private C6062a() {
        }

        /* renamed from: a */
        public void handle(PageviewResult pageviewResult, AbstractC7947h hVar) {
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38978b(PageviewPlugin.this.getActivity()).mo5929b(pageviewResult);
        }
    }

    private String format(int i) {
        return new DecimalFormat("###,###").format((long) i);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.content.setFileInfo", new C6062a());
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$PageviewPlugin(PageviewResult pageviewResult) {
        if (pageviewResult != null) {
            if (!C8275a.f22371d.mo32553a().equals(getDocViewModel().getDocumentType()) || !isEnableDetailNew()) {
                ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38973a(new C10211e.C10212a().mo39085e(format(pageviewResult.getWordCount())).mo39086f(format(pageviewResult.getCharacterCount())).mo39080a(true).mo39081a());
            }
        }
    }

    public /* synthetic */ void lambda$showBitablePageview$2$PageviewPlugin(UnspecifiedOrientationPlugin unspecifiedOrientationPlugin, DialogInterface dialogInterface) {
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }

    public /* synthetic */ void lambda$showSheetPageview$1$PageviewPlugin(UnspecifiedOrientationPlugin unspecifiedOrientationPlugin, DialogInterface dialogInterface) {
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }

    private void showPageViewFragment(int i, String str) {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38969a(getActivity(), i, str, null);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        if (this.mPageviewResultObserver == null) {
            this.mPageviewResultObserver = new AbstractC1178x() {
                /* class com.bytedance.ee.bear.document.pageview.$$Lambda$PageviewPlugin$aE9qE1LN9yRzqtTl3cOAlj3lqY */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    PageviewPlugin.this.lambda$onAttachToUIContainer$0$PageviewPlugin((PageviewResult) obj);
                }
            };
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38978b(getActivity()).mo5923a(getLifecycleOwner(), this.mPageviewResultObserver);
        }
    }

    private void showPageview(int i, String str) {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38970a(getActivity(), i, str, false, new C10211e.C10212a().mo39079a(getString(R.string.Doc_Doc_DocumentDetails)).mo39082b(getString(R.string.Doc_Doc_WordStatistics)).mo39083c(getString(R.string.Doc_Doc_WordsCount)).mo39084d(getString(R.string.Doc_Doc_CharacterCount)).mo39080a(true).mo39081a(), (DialogInterface.OnDismissListener) null);
        notifyFrontedToCompute();
    }

    private void showBitablePageview(int i, String str, UnspecifiedOrientationPlugin unspecifiedOrientationPlugin) {
        String str2;
        CharSequence b = getDocViewModel().getTitle().mo5927b();
        if (b != null) {
            str2 = b.toString();
        } else {
            str2 = "";
        }
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38970a(getActivity(), i, str, true, new C10211e.C10212a().mo39079a(getString(R.string.Doc_Doc_BitableDetails)).mo39087g(getString(R.string.Doc_Doc_BitableTitle)).mo39088h(str2).mo39089i(getString(R.string.Doc_Doc_BitableOwner)).mo39090j(getString(R.string.Doc_Doc_BitableCreationTime)).mo39081a(), (DialogInterface.OnDismissListener) new DialogInterface.OnDismissListener(unspecifiedOrientationPlugin) {
            /* class com.bytedance.ee.bear.document.pageview.$$Lambda$PageviewPlugin$afQ8Qx0iu9465vLRXlomNn0pSfQ */
            public final /* synthetic */ UnspecifiedOrientationPlugin f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                PageviewPlugin.this.lambda$showBitablePageview$2$PageviewPlugin(this.f$1, dialogInterface);
            }
        });
    }

    private void showSheetPageview(int i, String str, UnspecifiedOrientationPlugin unspecifiedOrientationPlugin) {
        String str2;
        CharSequence b = getDocViewModel().getTitle().mo5927b();
        if (b != null) {
            str2 = b.toString();
        } else {
            str2 = "";
        }
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38970a(getActivity(), i, str, true, new C10211e.C10212a().mo39079a(getString(R.string.Doc_Doc_SheetDetails)).mo39087g(getString(R.string.Doc_Doc_SheetTitle)).mo39088h(str2).mo39089i(getString(R.string.Doc_Doc_SheetOwner)).mo39090j(getString(R.string.Doc_Doc_SheetCreationTime)).mo39081a(), (DialogInterface.OnDismissListener) new DialogInterface.OnDismissListener(unspecifiedOrientationPlugin) {
            /* class com.bytedance.ee.bear.document.pageview.$$Lambda$PageviewPlugin$K53PcFWEO8vv_2QjJspYGIB1sU */
            public final /* synthetic */ UnspecifiedOrientationPlugin f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                PageviewPlugin.this.lambda$showSheetPageview$1$PageviewPlugin(this.f$1, dialogInterface);
            }
        });
    }
}
