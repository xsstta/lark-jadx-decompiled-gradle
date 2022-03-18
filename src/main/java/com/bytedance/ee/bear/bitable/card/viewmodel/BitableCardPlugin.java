package com.bytedance.ee.bear.bitable.card.viewmodel;

import android.content.res.Configuration;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardsAction;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.CardActionModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.performance.EditRecordPerformanceTracker;
import com.bytedance.ee.bear.bitable.card.performance.OpenCardPerformanceTracker;
import com.bytedance.ee.bear.bitable.card.performance.STDataParseFailTracker;
import com.bytedance.ee.bear.bitable.card.view.C4561b;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.AttachmentFollowData;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager;
import com.bytedance.ee.bear.bitable.card.view.cell.link.BitableLinkRecordsFetchManager;
import com.bytedance.ee.bear.bitable.card.view.form.View$OnLayoutChangeListenerC4715a;
import com.bytedance.ee.bear.bitable.card.viewmodel.fetch.BitableCardFetcher;
import com.bytedance.ee.bear.bitable.card.viewmodel.fetch.ICardFetcher;
import com.bytedance.ee.bear.bitable.card.viewmodel.p267a.C4755b;
import com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b;
import com.bytedance.ee.bear.bitable.card.viewmodel.p268b.C4773a;
import com.bytedance.ee.bear.bitable.card.viewmodel.upload.GetPendingEditHandler;
import com.bytedance.ee.bear.bitable.card.viewmodel.upload.StartUploadHandler;
import com.bytedance.ee.bear.bitable.common.BitableAnalytic;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.drive.OpenAttachFileAbility;
import com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.C6055b;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BitableCardPlugin extends DocumentPlugin implements AbstractC6054a {
    private boolean enableVCFollow = false;
    private BitableAttachmentUploadManager.OrientationControlListener mAttachmentOrientationControlListener;
    public BitableAttachmentUploadManager mAttachmentUploadManager;
    private BitableAnalytic mBitableAnalytic;
    private ICardFetcher mBitableCardFetcher;
    public C4771b mBitableCardViewModel;
    public BaseFollowImpl mBitableFollow;
    public AbstractC4774b mBitableOperationUpdater;
    public C6215b mEditPanelsManager;
    private final GetPendingEditHandler mGetPendingEditHandler = new GetPendingEditHandler();
    public BitableLinkRecordsFetchManager mLinkRecordsFetchManager;
    private C6055b mOrientationViewModel;
    public ParserConfig mParserConfig;
    private final StartUploadHandler mStartUploadHandler = new StartUploadHandler();
    public IStatusBar mStatusBar;
    private DocBridgeWebViewV2 mWebView;
    private final List<String> supportedViewTypeList = Arrays.asList("grid", "kanban", "gantt", "gallery");

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    public void ensureFragment() {
        C4535b showingTable;
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19586a((AbstractC4941c) this) == null && (showingTable = this.mBitableCardViewModel.getShowingTable()) != null && showingTable.mo17775e() != null) {
            if (EViewType.FORM.equals(showingTable.mo17775e().mo17794c())) {
                C13479a.m54764b("BitableCardPlugin_table", "show BitableFormFragment");
                uIContainer.mo19589a(this, instantiateFragment(View$OnLayoutChangeListenerC4715a.class));
                return;
            }
            C13479a.m54764b("BitableCardPlugin_table", "show BitableCardFragment");
            uIContainer.mo19589a(this, instantiateFragment(C4561b.class));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin$4 */
    public static /* synthetic */ class C47524 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14011a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin.C47524.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin$a */
    class C4753a implements AbstractC7945d<String> {
        C4753a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            BitableCardPlugin.this.mBitableOperationUpdater.mo18614a(hVar);
            CardActionModel cardActionModel = (CardActionModel) JSON.parseObject(str, CardActionModel.class, BitableCardPlugin.this.mParserConfig, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
            C13479a.m54764b("BitableCardPlugin_table", "handle, cardActionModel: " + cardActionModel);
            if (cardActionModel != null) {
                ECardsAction eCardsAction = cardActionModel.action;
                CardActionModel.DataBean dataBean = cardActionModel.data;
                if (dataBean != null) {
                    STDataParseFailTracker.f13283a.mo17450a().mo17449a(BitableCardPlugin.this.getDocViewModel().getBearUrl(), dataBean.tableId, dataBean.viewId);
                }
                long currentTimeMillis = System.currentTimeMillis();
                switch (C47524.f14011a[eCardsAction.ordinal()]) {
                    case 1:
                        OpenCardPerformanceTracker.f13271a.mo17446a().mo17440a(BitableCardPlugin.this.getDocViewModel().getDocumentType(), dataBean.tableId, dataBean.viewId, dataBean.recordId, cardActionModel.transactionId, cardActionModel.timestamp);
                        OpenCardPerformanceTracker.f13271a.mo17446a().mo17436a(currentTimeMillis);
                        BitableCardPlugin.this.mBitableCardViewModel.notifyTableShowing(dataBean.baseId, dataBean.tableId, dataBean.viewId, dataBean.recordId, dataBean.focusFieldId, dataBean.highLightType, false, BitableCardPlugin.this.mBitableFollow);
                        return;
                    case 2:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyRecordsUpdate(dataBean.recordId);
                        EditRecordPerformanceTracker.f13261a.mo17434a().mo17428a(cardActionModel.transactionId, cardActionModel.timestamp);
                        EditRecordPerformanceTracker.f13261a.mo17434a().mo17426a(currentTimeMillis);
                        return;
                    case 3:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyFieldsUpdate();
                        return;
                    case 4:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyTableClose();
                        return;
                    case 5:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyCurrentRecordFiltered();
                        return;
                    case 6:
                        if (!BitableCardPlugin.this.mLinkRecordsFetchManager.shouldInterceptLinkTableDataLoadedAction(dataBean.baseId, dataBean.tableId)) {
                            BitableCardPlugin.this.mBitableCardViewModel.notifyTableRecordsDataLoaded(dataBean.baseId, dataBean.tableId);
                            return;
                        }
                        return;
                    case 7:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyLinkTableChanged(dataBean.baseId, dataBean.tableId);
                        BitableCardPlugin.this.mLinkRecordsFetchManager.notifyLinkTableChanged(dataBean.baseId, dataBean.tableId);
                        return;
                    case 8:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyFormFieldValidate(dataBean.validateFields);
                        return;
                    case 9:
                        BitableCardPlugin.this.mBitableCardViewModel.notifyTableShowing(dataBean.baseId, dataBean.tableId, dataBean.viewId, dataBean.recordId, dataBean.focusFieldId, dataBean.highLightType, true, BitableCardPlugin.this.mBitableFollow);
                        return;
                    case 10:
                        BitableCardPlugin.this.mBitableCardViewModel.switchCard(dataBean.recordId);
                    case 11:
                        BitableCardPlugin.this.mBitableCardViewModel.scrollCard(dataBean.topFieldId);
                        break;
                }
                C13479a.m54775e("BitableCardPlugin", "cardActionMode: recognized action = " + eCardsAction);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        reportOrientationChange(z);
    }

    private JSONObject generateNativeStates(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("topFieldId", (Object) str);
        jSONObject.put("module", (Object) "bitableCard");
        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) jSONObject2);
        return jSONObject;
    }

    private void reportOrientationChange(boolean z) {
        getWeb().mo19429a("window.lark.biz.bitable.getViewType", new JSONObject(), new ValueCallback(z) {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$BitableCardPlugin$aSQ5bU7FxvY91jan0tZygDirzg */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                BitableCardPlugin.this.lambda$reportOrientationChange$2$BitableCardPlugin(this.f$1, (String) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.bitable.performCardsAction", new C4753a());
        map.put("biz.bitable.getPendingEdit", this.mGetPendingEditHandler);
        map.put("biz.bitable.startUploadAttachments", this.mStartUploadHandler);
    }

    public /* synthetic */ void lambda$onAttachToHost$0$BitableCardPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            Toast.showText(getContext(), (int) R.string.Doc_Block_LoadingRecords);
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$1$BitableCardPlugin(boolean z) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            if (z) {
                unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
            } else {
                unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
            }
        }
    }

    public void openAttachFile(AttachmentFollowData attachmentFollowData) {
        ((OpenAttachFileAbility) ((C6095s) getHost()).mo19551b(OpenAttachFileAbility.class)).openAttachFile(attachmentFollowData.getThirdEntity());
        notifyOpenAttachFileToWeb(attachmentFollowData);
    }

    public void sendNativeStateToWeb(String str) {
        BaseFollowImpl baseFollowImpl = this.mBitableFollow;
        if (baseFollowImpl != null && baseFollowImpl.isPresenter()) {
            C11755a.m48726a(this.mWebView, "javascript:lark.biz.bitable.sendVCFollowState", generateNativeStates(str), (ValueCallback<String>) null);
        }
    }

    private void notifyOpenAttachFileToWeb(AttachmentFollowData attachmentFollowData) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("file_token", (Object) attachmentFollowData.getThirdEntity().getFileId());
        jSONObject.put("mount_point", (Object) attachmentFollowData.getThirdEntity().getMountPoint());
        jSONObject.put("bussinessId", (Object) attachmentFollowData.getThirdEntity().getBusinessId());
        jSONObject.put("mount_node_open", (Object) attachmentFollowData.getThirdEntity().getMountNodeToken());
        jSONObject.put("extra", (Object) attachmentFollowData.getThirdEntity().getExtras());
        jSONObject.put("fieldId", (Object) attachmentFollowData.getFieldId());
        jSONObject.put("index", (Object) Integer.valueOf(attachmentFollowData.getIndex()));
        jSONObject.put("recordId", (Object) attachmentFollowData.getRecordId());
        C11755a.m48726a(this.mWebView, "javascript:lark.biz.util.notifyAttachFileOpen", jSONObject, (ValueCallback<String>) null);
    }

    public void onAttachToHost(C6095s sVar) {
        boolean z;
        super.onAttachToHost((C4943e) sVar);
        this.mStatusBar = StatusBarManager.m55628a(getActivity());
        ParserConfig parserConfig = new ParserConfig();
        this.mParserConfig = parserConfig;
        parserConfig.putDeserializer(ECardsAction.class, new C4755b());
        this.mBitableAnalytic = new BitableAnalytic(C5234y.m21391b(), getDocViewModel().getBearUrl());
        this.mOrientationViewModel = (C6055b) viewModel(C6055b.class);
        this.mEditPanelsManager = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
        this.mBitableCardViewModel = (C4771b) viewModel(C4771b.class);
        if (getDocViewModel().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        this.enableVCFollow = z;
        this.mBitableCardViewModel.getEnableFollow().mo5929b(Boolean.valueOf(this.enableVCFollow));
        C4771b bVar = this.mBitableCardViewModel;
        BitableCardFetcher bitableCardFetcher = new BitableCardFetcher(getWeb(), C5234y.m21391b());
        this.mBitableCardFetcher = bitableCardFetcher;
        bVar.setCardFetcher(bitableCardFetcher);
        C4771b bVar2 = this.mBitableCardViewModel;
        C4773a aVar = new C4773a(getWeb());
        this.mBitableOperationUpdater = aVar;
        bVar2.setOperationUpdater(aVar);
        this.mBitableCardViewModel.getActive().mo5923a(getLifecycleOwner(), new AbstractC13687a<Boolean>() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin.C47491 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo18510a(Boolean bool) {
                if (Boolean.TRUE.equals(bool)) {
                    BitableCardPlugin.this.ensureFragment();
                    BitableCardPlugin.this.mStatusBar.mo50687a();
                } else {
                    C13479a.m54764b("BitableCardPlugin_table", "on table close");
                    BitableCardPlugin.this.removeFragment();
                    BitableCardPlugin.this.mStatusBar.mo50689b();
                    BitableCardPlugin.this.mAttachmentUploadManager.shouldDisableLandscape(false, false);
                }
                BitableCardPlugin.this.mEditPanelsManager.setScrollWebViewWhenKeyboardHeightChange(!Boolean.TRUE.equals(bool));
            }
        });
        this.mBitableCardViewModel.getShowOpenErrorToast().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$BitableCardPlugin$rfxcMtcsM3rdKYSktQaE_JTJP2M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BitableCardPlugin.this.lambda$onAttachToHost$0$BitableCardPlugin((Boolean) obj);
            }
        });
        this.mBitableCardViewModel.getTopFieldId().mo5923a(getLifecycleOwner(), new AbstractC13687a<String>() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin.C47502 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo18510a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    BitableCardPlugin.this.sendNativeStateToWeb(str);
                }
            }
        });
        this.mBitableCardViewModel.getAttachmentEntity().mo5923a(getLifecycleOwner(), new AbstractC13687a<AttachmentFollowData>() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin.C47513 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo18510a(AttachmentFollowData attachmentFollowData) {
                if (attachmentFollowData != null) {
                    BitableCardPlugin.this.openAttachFile(attachmentFollowData);
                }
            }
        });
        BitableAttachmentUploadManager aVar2 = (BitableAttachmentUploadManager) viewModel(BitableAttachmentUploadManager.class);
        this.mAttachmentUploadManager = aVar2;
        aVar2.setOperationUpdater(this.mBitableOperationUpdater);
        this.mGetPendingEditHandler.mo18656a(this.mAttachmentUploadManager);
        this.mStartUploadHandler.mo18659a(getContext());
        this.mStartUploadHandler.mo18662a(this.mBitableCardViewModel);
        this.mStartUploadHandler.mo18661a(this.mAttachmentUploadManager);
        this.mStartUploadHandler.mo18664a(this.mBitableAnalytic);
        BitableAttachmentUploadManager aVar3 = this.mAttachmentUploadManager;
        $$Lambda$BitableCardPlugin$TkYZva2iuHHoUUHNXdHOVPUeqdw r0 = new BitableAttachmentUploadManager.OrientationControlListener() {
            /* class com.bytedance.ee.bear.bitable.card.viewmodel.$$Lambda$BitableCardPlugin$TkYZva2iuHHoUUHNXdHOVPUeqdw */

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager.OrientationControlListener
            public final void shouldDisableLandscape(boolean z) {
                BitableCardPlugin.this.lambda$onAttachToHost$1$BitableCardPlugin(z);
            }
        };
        this.mAttachmentOrientationControlListener = r0;
        aVar3.registerOrientationControlListener(r0);
        BitableLinkRecordsFetchManager aVar4 = (BitableLinkRecordsFetchManager) viewModel(BitableLinkRecordsFetchManager.class);
        this.mLinkRecordsFetchManager = aVar4;
        aVar4.setCardFetcher(this.mBitableCardFetcher);
        this.mLinkRecordsFetchManager.setOperationUpdater(this.mBitableOperationUpdater);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        if (this.enableVCFollow) {
            this.mBitableFollow = ((FollowPlugin) findPlugin(FollowPlugin.class)).getDocumentFollow();
        }
        this.mWebView = (DocBridgeWebViewV2) sVar.mo19448b().mo19435b();
        this.mBitableCardViewModel.fetchCommonDataIfNecessary();
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.mBitableCardViewModel.closeBitable();
        this.mAttachmentUploadManager.clearAllUploadTasks();
        BitableAttachmentUploadManager.OrientationControlListener cVar = this.mAttachmentOrientationControlListener;
        if (cVar != null) {
            this.mAttachmentUploadManager.unregisterOrientationControlListener(cVar);
        }
        this.mStartUploadHandler.mo18667b();
        this.mWebView = null;
        this.mBitableFollow = null;
    }

    public /* synthetic */ void lambda$reportOrientationChange$2$BitableCardPlugin(boolean z, String str) {
        String str2 = (String) JSON.parse(str);
        if (this.supportedViewTypeList.contains(str2)) {
            boolean equals = Boolean.TRUE.equals(this.mBitableCardViewModel.getActive().mo5927b());
            if (z) {
                this.mBitableAnalytic.mo18679a(this.mOrientationViewModel.getSource(), this.mOrientationViewModel.isLock(), str2, equals);
            } else {
                this.mBitableAnalytic.mo18684b(this.mOrientationViewModel.getSource(), this.mOrientationViewModel.isLock(), str2, equals);
            }
        }
    }
}
