package com.bytedance.ies.xbridge.ui.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XConfigureStatusBarMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "style", "getStyle", "setStyle", "visible", "", "getVisible", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "provideParamList", "", "Companion", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.ui.model.a */
public final class XConfigureStatusBarMethodParamModel extends XBaseParamModel {

    /* renamed from: a */
    public static final Companion f38108a = new Companion(null);

    /* renamed from: b */
    private String f38109b;

    /* renamed from: c */
    private String f38110c;

    /* renamed from: d */
    private Boolean f38111d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XConfigureStatusBarMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/ui/model/XConfigureStatusBarMethodParamModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.ui.model.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XConfigureStatusBarMethodParamModel mo53205a(XReadableMap hVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String a = C14434d.m58266a(hVar, "style", (String) null, 2, (Object) null);
            Boolean a2 = XBaseParamModel.f38030e.mo53119a(hVar, "visible");
            String a3 = C14434d.m58266a(hVar, "backgroundColor", (String) null, 2, (Object) null);
            if (a2 == null) {
                return null;
            }
            XConfigureStatusBarMethodParamModel aVar = new XConfigureStatusBarMethodParamModel();
            boolean z2 = true;
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar.mo53201a(a);
            }
            if (a3.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                aVar.mo53203b(a3);
            }
            aVar.mo53200a(a2);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo53199a() {
        return this.f38109b;
    }

    /* renamed from: b */
    public final String mo53202b() {
        return this.f38110c;
    }

    /* renamed from: c */
    public final Boolean mo53204c() {
        return this.f38111d;
    }

    /* renamed from: a */
    public final void mo53200a(Boolean bool) {
        this.f38111d = bool;
    }

    /* renamed from: b */
    public final void mo53203b(String str) {
        this.f38110c = str;
    }

    /* renamed from: a */
    public final void mo53201a(String str) {
        this.f38109b = str;
    }
}
