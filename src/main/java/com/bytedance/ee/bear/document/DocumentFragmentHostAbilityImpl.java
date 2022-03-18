package com.bytedance.ee.bear.document;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/DocumentFragmentHostAbilityImpl;", "Lcom/bytedance/ee/bear/document/FragmentHostAbility;", "pluginHost", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "(Lcom/bytedance/ee/bear/document/DocumentPluginHost;)V", "getPluginHost", "()Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "getFragment", "Landroidx/fragment/app/Fragment;", "getFragmentTitle", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.n */
public final class DocumentFragmentHostAbilityImpl implements FragmentHostAbility {

    /* renamed from: a */
    private final C6095s f16481a;

    @Override // com.bytedance.ee.bear.document.FragmentHostAbility
    /* renamed from: b */
    public Fragment mo23794b() {
        aj l = this.f16481a.mo24597l();
        Intrinsics.checkExpressionValueIsNotNull(l, "pluginHost.webViewFragment");
        return l;
    }

    @Override // com.bytedance.ee.bear.document.FragmentHostAbility
    /* renamed from: a */
    public String mo23793a() {
        LiveData<String> docName = this.f16481a.mo24598m().getDocName();
        Intrinsics.checkExpressionValueIsNotNull(docName, "pluginHost.docViewModel.docName");
        String b = docName.mo5927b();
        if (b == null) {
            LiveData<CharSequence> title = this.f16481a.mo24598m().getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title, "pluginHost.docViewModel.title");
            CharSequence b2 = title.mo5927b();
            if (b2 != null) {
                b = b2.toString();
            } else {
                b = null;
            }
        }
        if (b != null) {
            return b;
        }
        return "";
    }

    public DocumentFragmentHostAbilityImpl(C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "pluginHost");
        this.f16481a = sVar;
    }
}
