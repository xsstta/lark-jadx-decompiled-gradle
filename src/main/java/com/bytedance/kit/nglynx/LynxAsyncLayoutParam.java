package com.bytedance.kit.nglynx;

import com.lynx.tasm.ThreadStrategyForRendering;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/kit/nglynx/LynxAsyncLayoutParam;", "", "()V", "lynxWidth", "", "getLynxWidth", "()Ljava/lang/Integer;", "setLynxWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "presetSafePoint", "", "getPresetSafePoint", "()Ljava/lang/Boolean;", "setPresetSafePoint", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "threadStrategy", "getThreadStrategy", "setThreadStrategy", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.b */
public final class LynxAsyncLayoutParam {

    /* renamed from: a */
    private Integer f38539a = 0;

    /* renamed from: b */
    private Boolean f38540b = false;

    /* renamed from: c */
    private Integer f38541c = Integer.valueOf(ThreadStrategyForRendering.ALL_ON_UI.id());

    /* renamed from: a */
    public final Integer mo53714a() {
        return this.f38539a;
    }

    /* renamed from: b */
    public final Boolean mo53715b() {
        return this.f38540b;
    }

    /* renamed from: c */
    public final Integer mo53716c() {
        return this.f38541c;
    }
}
