package com.bytedance.ee.bear.block.jira;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lcom/bytedance/ee/bear/block/jira/JiraViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/block/jira/JiraViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/block/jira/JiraViewModel$Delegate;)V", "jiraActionData", "Lcom/bytedance/ee/bear/block/jira/JiraActionData;", "getJiraActionData", "setJiraActionData", "(Landroidx/lifecycle/MutableLiveData;)V", "callback", "", "actionId", "", "setActive", "Delegate", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.jira.e */
public final class JiraViewModel extends AbstractC1142af {
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegate delegate;
    private C1177w<JiraActionData> jiraActionData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraViewModel$Delegate;", "", "onJiraCallBack", "", "blockId", "", "actionId", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.e$a */
    public interface Delegate {
        /* renamed from: a */
        void mo19261a(String str, String str2);
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<JiraActionData> getJiraActionData() {
        return this.jiraActionData;
    }

    public final void setDelegate(Delegate aVar) {
        this.delegate = aVar;
    }

    public final void setJiraActionData(C1177w<JiraActionData> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.jiraActionData = wVar;
    }

    public final void setJiraActionData(JiraActionData jiraActionData2) {
        Intrinsics.checkParameterIsNotNull(jiraActionData2, "jiraActionData");
        this.jiraActionData.mo5929b(jiraActionData2);
    }

    public final void callback(String str) {
        String blockId;
        Delegate aVar;
        Intrinsics.checkParameterIsNotNull(str, "actionId");
        JiraActionData b = this.jiraActionData.mo5927b();
        if (b != null && (blockId = b.getBlockId()) != null && (aVar = this.delegate) != null) {
            aVar.mo19261a(blockId, str);
        }
    }

    public final void setActive(boolean z) {
        if (!Intrinsics.areEqual(Boolean.valueOf(z), this.active.mo5927b())) {
            this.active.mo5929b(Boolean.valueOf(z));
        }
    }
}
