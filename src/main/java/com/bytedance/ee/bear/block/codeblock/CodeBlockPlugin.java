package com.bytedance.ee.bear.block.codeblock;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.site.ActivityC23764o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeBlockPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "viewModel", "Lcom/bytedance/ee/bear/block/codeblock/CodeBlockViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "CodeBlockLanguageSelectHandler", "Companion", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CodeBlockPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public static final String TAG;
    public AbstractC7947h callback;
    public CodeBlockViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeBlockPlugin$Companion;", "", "()V", "SELECT_CODE_BLOCK_LANGUAGE", "", "TAG", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.CodeBlockPlugin$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = CodeBlockPlugin.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "CodeBlockPlugin::class.java.simpleName");
        TAG = simpleName;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeBlockPlugin$CodeBlockLanguageSelectHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageData;", "(Lcom/bytedance/ee/bear/block/codeblock/CodeBlockPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.CodeBlockPlugin$a */
    private final class CodeBlockLanguageSelectHandler implements AbstractC7945d<CodeLanguageData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CodeBlockLanguageSelectHandler() {
        }

        /* renamed from: a */
        public void handle(CodeLanguageData codeLanguageData, AbstractC7947h hVar) {
            CodeBlockPlugin.this.callback = hVar;
            if (codeLanguageData != null) {
                String str = CodeBlockPlugin.TAG;
                C13479a.m54772d(str, "JS dispatch data: " + codeLanguageData);
                CodeBlockPlugin.access$getViewModel$p(CodeBlockPlugin.this).isShowingCodeLanguageSelectionPanel().mo5929b((Boolean) true);
                CodeBlockPlugin.access$getViewModel$p(CodeBlockPlugin.this).getCodeLanguageData().mo5929b(codeLanguageData);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/block/codeblock/CodeBlockPlugin$onAttachToHost$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "onChange", "", ActivityC23764o.f58839a, "(Ljava/lang/Boolean;)V", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.CodeBlockPlugin$c */
    public static final class C4897c extends AbstractC13687a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CodeBlockPlugin f14401a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4897c(CodeBlockPlugin codeBlockPlugin) {
            this.f14401a = codeBlockPlugin;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(Boolean bool) {
            C10548d.m43696a(this.f14401a.getContext());
            if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                Fragment instantiateFragment = this.f14401a.instantiateFragment(CodeLanguageSelectionFragment.class);
                Intrinsics.checkExpressionValueIsNotNull(instantiateFragment, "instantiateFragment(Code…tionFragment::class.java)");
                this.f14401a.getUIContainer().mo19589a(this.f14401a, instantiateFragment);
                return;
            }
            this.f14401a.removeFragment();
        }
    }

    public static final /* synthetic */ CodeBlockViewModel access$getViewModel$p(CodeBlockPlugin codeBlockPlugin) {
        CodeBlockViewModel aVar = codeBlockPlugin.viewModel;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return aVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.util.selectCodeBlockLanguage", new CodeBlockLanguageSelectHandler());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.codeblock.CodeBlockPlugin$d */
    public static final class C4898d<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ CodeBlockPlugin f14402a;

        C4898d(CodeBlockPlugin codeBlockPlugin) {
            this.f14402a = codeBlockPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "value", (Object) str);
            AbstractC7947h hVar = this.f14402a.callback;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC1142af viewModel2 = viewModel(CodeBlockViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "viewModel(CodeBlockViewModel::class.java)");
        CodeBlockViewModel aVar = (CodeBlockViewModel) viewModel2;
        this.viewModel = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.isShowingCodeLanguageSelectionPanel().mo5923a(getLifecycleOwner(), new C4897c(this));
        CodeBlockViewModel aVar2 = this.viewModel;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar2.getOnSelectCodeLanguage().mo5923a(getLifecycleOwner(), new C4898d(this));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        CodeBlockViewModel aVar = this.viewModel;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        aVar.isShowingCodeLanguageSelectionPanel().mo5929b((Boolean) false);
    }
}
