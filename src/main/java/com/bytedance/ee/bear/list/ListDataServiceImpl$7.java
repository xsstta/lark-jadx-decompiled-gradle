package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;

class ListDataServiceImpl$7 extends BinderIMakeCopyCallback.Stub {
    final /* synthetic */ C8511i this$0;
    final /* synthetic */ BinderIMakeCopyCallback val$makeCopyCallback;
    final /* synthetic */ String val$module;
    final /* synthetic */ String val$objToken;
    final /* synthetic */ String val$source;
    final /* synthetic */ int val$type;

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5109b
    public void onFailed(String str, int i) {
        String str2;
        this.val$makeCopyCallback.onFailed(str, i);
        if (i == 4007) {
            str2 = "failed_cross_unit";
        } else {
            str2 = "failed";
        }
        ListAnalysis.m32502a(C5234y.m21391b(), this.val$source, this.val$module, str2, this.val$type, this.val$objToken);
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5109b
    public void onSucceed(String str, String str2, String str3) {
        this.val$makeCopyCallback.onSucceed(str, str2, str3);
        C8674q.m36243f().mo33646a(str, str2, str3);
        ListAnalysis.m32502a(C5234y.m21391b(), this.val$source, this.val$module, "succeed", this.val$type, str);
    }

    ListDataServiceImpl$7(C8511i iVar, BinderIMakeCopyCallback binderIMakeCopyCallback, String str, String str2, int i, String str3) {
        this.this$0 = iVar;
        this.val$makeCopyCallback = binderIMakeCopyCallback;
        this.val$source = str;
        this.val$module = str2;
        this.val$type = i;
        this.val$objToken = str3;
    }
}
