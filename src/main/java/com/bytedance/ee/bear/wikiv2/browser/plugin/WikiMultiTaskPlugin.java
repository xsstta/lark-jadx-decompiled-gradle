package com.bytedance.ee.bear.wikiv2.browser.plugin;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper;
import com.bytedance.ee.bear.wikiv2.extension.C12250d;
import com.bytedance.ee.bear.wikiv2.extension.C12251e;
import com.bytedance.ee.bear.wikiv2.extension.ExtensionFindAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiMultiTaskPlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePluginV2;", "()V", "wikiViewModel", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "Companion", "MultiTaskInfoCallbackImpl", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiMultiTaskPlugin extends BasePluginV2 {
    public static final Companion Companion = new Companion(null);
    public WikiViewModel wikiViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiMultiTaskPlugin$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.WikiMultiTaskPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiMultiTaskPlugin$MultiTaskInfoCallbackImpl;", "Lcom/bytedance/ee/bear/wikiv2/extension/ActivityMultiTaskWrapper$IMultiTaskInfoCallback;", "(Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiMultiTaskPlugin;)V", "docName", "", "getDocName", "()Ljava/lang/String;", "objType", "", "getObjType", "()Ljava/lang/Integer;", "url", "getUrl", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.WikiMultiTaskPlugin$b */
    public final class MultiTaskInfoCallbackImpl implements ActivityMultiTaskWrapper.IMultiTaskInfoCallback {
        @Override // com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper.IMultiTaskInfoCallback
        /* renamed from: a */
        public String mo46696a() {
            BearUrl bearUrl;
            WikiViewModel hVar = WikiMultiTaskPlugin.this.wikiViewModel;
            if (hVar == null || (bearUrl = hVar.getBearUrl()) == null) {
                return null;
            }
            return bearUrl.f17450e;
        }

        @Override // com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper.IMultiTaskInfoCallback
        /* renamed from: b */
        public String mo46697b() {
            FragmentHostAbility xVar = (FragmentHostAbility) WikiMultiTaskPlugin.this.getHostAbilityOrNull(FragmentHostAbility.class);
            if (xVar != null) {
                return xVar.mo23793a();
            }
            return null;
        }

        @Override // com.bytedance.ee.bear.wikiv2.extension.ActivityMultiTaskWrapper.IMultiTaskInfoCallback
        /* renamed from: c */
        public Integer mo46698c() {
            C1177w<WikiInfo> wikiInfo;
            WikiInfo b;
            WikiViewModel hVar = WikiMultiTaskPlugin.this.wikiViewModel;
            if (hVar == null || (wikiInfo = hVar.getWikiInfo()) == null || (b = wikiInfo.mo5927b()) == null) {
                return null;
            }
            return Integer.valueOf(b.getObjType());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MultiTaskInfoCallbackImpl() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/browser/plugin/WikiMultiTaskPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/wikiv2/extension/ExtensionFindAction;", "Lcom/bytedance/ee/bear/wikiv2/extension/MultiTaskExtension;", "onExtensionFound", "", "extension", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.WikiMultiTaskPlugin$c */
    public static final class C12206c implements ExtensionFindAction<C12251e> {

        /* renamed from: a */
        final /* synthetic */ WikiMultiTaskPlugin f32847a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12206c(WikiMultiTaskPlugin wikiMultiTaskPlugin) {
            this.f32847a = wikiMultiTaskPlugin;
        }

        /* renamed from: a */
        public void mo46699a(C12251e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "extension");
            eVar.mo46809a(new MultiTaskInfoCallbackImpl());
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "host");
        super.onAttachToHost(eVar);
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(getHost(), WikiViewModel.class, WikiViewModel.Companion.mo46753a(((FragmentHostAbility) getHostAbility(FragmentHostAbility.class)).mo23794b().getArguments()));
        C12250d.m50991a(this, C12251e.class, new C12206c(this));
    }
}
