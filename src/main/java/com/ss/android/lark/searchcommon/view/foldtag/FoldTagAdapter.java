package com.ss.android.lark.searchcommon.view.foldtag;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.ui.flowlayout.AbstractC26225a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagAdapter;", "T", "Lcom/larksuite/framework/ui/flowlayout/TagAdapter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/util/List;)V", "getFoldView", "Lcom/ss/android/lark/searchcommon/view/foldtag/IFoldView;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.a.b */
public abstract class FoldTagAdapter<T> extends AbstractC26225a<T> {
    /* renamed from: d */
    public abstract IFoldView mo184649d();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FoldTagAdapter(List<? extends T> list) {
        super(list);
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }
}
