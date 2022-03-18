package com.ss.android.vc.meeting.module.topbar.data;

import com.ss.android.vc.meeting.module.topbar.viewstub.TopBarPromptStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/meeting/module/topbar/data/PromptData;", "", "mode", "Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;", "text", "", "(Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;Ljava/lang/String;)V", "getMode", "()Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;", "setMode", "(Lcom/ss/android/vc/meeting/module/topbar/viewstub/TopBarPromptStub$Mode;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.topbar.a.a */
public final class PromptData {

    /* renamed from: a */
    private TopBarPromptStub.Mode f160212a;

    /* renamed from: b */
    private String f160213b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptData)) {
            return false;
        }
        PromptData aVar = (PromptData) obj;
        return Intrinsics.areEqual(this.f160212a, aVar.f160212a) && Intrinsics.areEqual(this.f160213b, aVar.f160213b);
    }

    public int hashCode() {
        TopBarPromptStub.Mode mode = this.f160212a;
        int i = 0;
        int hashCode = (mode != null ? mode.hashCode() : 0) * 31;
        String str = this.f160213b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PromptData(mode=" + this.f160212a + ", text=" + this.f160213b + ")";
    }

    /* renamed from: a */
    public final TopBarPromptStub.Mode mo219504a() {
        return this.f160212a;
    }

    /* renamed from: b */
    public final String mo219505b() {
        return this.f160213b;
    }

    public PromptData(TopBarPromptStub.Mode mode, String str) {
        Intrinsics.checkParameterIsNotNull(mode, "mode");
        this.f160212a = mode;
        this.f160213b = str;
    }
}
