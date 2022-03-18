package com.ss.android.lark.mm.statistics.hitpoint;

import android.content.Context;
import com.google.gson.Gson;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "", "eventName", "", "context", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;)V", "getEventName", "()Ljava/lang/String;", "post", "", "withContext", "Landroid/content/Context;", "withContextProvider", "provider", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "withHitPointContext", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.o */
public class UIEvent {

    /* renamed from: a */
    private final transient String f118583a;

    /* renamed from: b */
    private transient C47084f f118584b;

    /* renamed from: a */
    public final void mo165437a() {
        String json = new Gson().toJson(this);
        C45855f.m181663b("UIEvent", this.f118583a + ": " + json);
        C47083e.m186425a(this.f118584b, this.f118583a, new JSONObject(json));
    }

    /* renamed from: a */
    public final UIEvent mo165435a(C47084f fVar) {
        this.f118584b = fVar;
        return this;
    }

    /* renamed from: a */
    public final UIEvent mo165436a(MmHitPointContextProvider gVar) {
        C47084f fVar;
        if (gVar != null) {
            fVar = gVar.mo161231e();
        } else {
            fVar = null;
        }
        this.f118584b = fVar;
        return this;
    }

    /* renamed from: a */
    public final UIEvent mo165434a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!(context instanceof MmHitPointContextProvider)) {
            context = null;
        }
        MmHitPointContextProvider gVar = (MmHitPointContextProvider) context;
        if (gVar != null) {
            this.f118584b = gVar.mo161231e();
        }
        return this;
    }

    public UIEvent(String str, C47084f fVar) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        this.f118583a = str;
        this.f118584b = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UIEvent(String str, C47084f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : fVar);
    }
}
