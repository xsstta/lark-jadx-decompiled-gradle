package com.bytedance.ies.xbridge.ui.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.XReadableType;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowToastMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "duration", "", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", ShareHitPoint.f121869d, "getType", "setType", "provideParamList", "", "Companion", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.ui.model.b */
public final class XShowToastMethodParamModel extends XBaseParamModel {

    /* renamed from: c */
    public static final Companion f38112c = new Companion(null);

    /* renamed from: a */
    public String f38113a;

    /* renamed from: b */
    public String f38114b;

    /* renamed from: d */
    private Integer f38115d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowToastMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/ui/model/XShowToastMethodParamModel;", "param", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.ui.model.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XShowToastMethodParamModel mo53212a(XReadableMap hVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(hVar, "param");
            String a = C14434d.m58266a(hVar, "message", (String) null, 2, (Object) null);
            boolean z2 = true;
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String a2 = C14434d.m58266a(hVar, ShareHitPoint.f121869d, (String) null, 2, (Object) null);
            if (a2.length() != 0) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            int i = 3000;
            if (hVar.mo53101a("duration")) {
                if (hVar.mo53110i("duration").mo53082a() == XReadableType.Int) {
                    i = C14434d.m58259a(hVar, "duration", 3000);
                } else if (hVar.mo53110i("duration").mo53082a() == XReadableType.Number) {
                    i = (int) C14434d.m58258a(hVar, "duration", 3000.0d);
                }
            }
            XShowToastMethodParamModel bVar = new XShowToastMethodParamModel();
            bVar.mo53208a(a);
            bVar.mo53210b(a2);
            bVar.mo53207a(Integer.valueOf(i));
            return bVar;
        }
    }

    /* renamed from: c */
    public final Integer mo53211c() {
        return this.f38115d;
    }

    /* renamed from: a */
    public final String mo53206a() {
        String str = this.f38113a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("message");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo53209b() {
        String str = this.f38114b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareHitPoint.f121869d);
        }
        return str;
    }

    /* renamed from: a */
    public final void mo53207a(Integer num) {
        this.f38115d = num;
    }

    /* renamed from: a */
    public final void mo53208a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38113a = str;
    }

    /* renamed from: b */
    public final void mo53210b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38114b = str;
    }
}
