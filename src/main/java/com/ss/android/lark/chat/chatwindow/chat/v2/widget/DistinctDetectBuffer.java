package com.ss.android.lark.chat.chatwindow.chat.v2.widget;

import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0017\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/DistinctDetectBuffer;", "T", "Lcom/larksuite/framework/utils/AndroidThrottle$TaskBuffer;", "mDataProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;)V", "getMDataProvider", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDataProvider;", "setMDataProvider", "mHashMap", "", "", "getMHashMap", "()Ljava/util/Map;", "setMHashMap", "(Ljava/util/Map;)V", "clear", "", "consumeAll", "", "put", "t", "(Ljava/lang/Object;)V", "size", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.widget.a */
public final class DistinctDetectBuffer<T> implements AndroidThrottle.AbstractC26232d<T> {

    /* renamed from: a */
    private Map<String, T> f87333a = new HashMap();

    /* renamed from: b */
    private RecyclerViewItemDetector.ItemDataProvider<T> f87334b;

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: b */
    public void mo93317b() {
        this.f87333a.clear();
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: c */
    public int mo93318c() {
        return this.f87333a.size();
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: d */
    public Collection<T> mo93319d() {
        ArrayList arrayList = new ArrayList(this.f87333a.values());
        this.f87333a.clear();
        return arrayList;
    }

    public DistinctDetectBuffer(RecyclerViewItemDetector.ItemDataProvider<T> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mDataProvider");
        this.f87334b = bVar;
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: a */
    public void mo93316a(T t) {
        String a;
        if (t != null && (a = this.f87334b.mo123406a(t)) != null && !this.f87333a.containsKey(a)) {
            this.f87333a.put(a, t);
        }
    }
}
