package com.bytedance.ies.xbridge.ui.bridge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Window;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.ui.base.AbsXConfigureStatusBarMethod;
import com.bytedance.ies.xbridge.ui.model.XConfigureStatusBarMethodParamModel;
import com.bytedance.ies.xbridge.ui.utils.StatusBarUtils;
import com.bytedance.ies.xbridge.utils.XBridgeMethodHelper;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/bridge/XConfigureStatusBarMethod;", "Lcom/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod;", "()V", "TAG", "", "handle", "", "params", "Lcom/bytedance/ies/xbridge/ui/model/XConfigureStatusBarMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod$XConfigureStatusBarCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "StatusBarStyle", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class XConfigureStatusBarMethod extends AbsXConfigureStatusBarMethod {

    /* renamed from: a */
    private final String f38105a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/bridge/XConfigureStatusBarMethod$StatusBarStyle;", "", "style", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStyle", "()Ljava/lang/String;", "DARK", "LIGHT", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum StatusBarStyle {
        DARK("dark"),
        LIGHT("light"),
        UNKNOWN(null);
        
        public static final Companion Companion = new Companion(null);
        private final String style;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/bridge/XConfigureStatusBarMethod$StatusBarStyle$Companion;", "", "()V", "getStyleByName", "Lcom/bytedance/ies/xbridge/ui/bridge/XConfigureStatusBarMethod$StatusBarStyle;", "name", "", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.xbridge.ui.bridge.XConfigureStatusBarMethod$StatusBarStyle$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final StatusBarStyle mo53197a(String str) {
                if (str == null) {
                    return StatusBarStyle.UNKNOWN;
                }
                if (str != null) {
                    try {
                        String upperCase = str.toUpperCase();
                        Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
                        return StatusBarStyle.valueOf(upperCase);
                    } catch (Throwable unused) {
                        return StatusBarStyle.UNKNOWN;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        public final String getStyle() {
            return this.style;
        }

        private StatusBarStyle(String str) {
            this.style = str;
        }
    }

    @Override // com.bytedance.ies.xbridge.ui.base.AbsXConfigureStatusBarMethod
    /* renamed from: a */
    public void mo53182a(XConfigureStatusBarMethodParamModel aVar, AbsXConfigureStatusBarMethod.XConfigureStatusBarCallback aVar2, XBridgePlatformType xBridgePlatformType) {
        Window window;
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        Context context = (Context) mo52930a(Context.class);
        boolean z2 = false;
        if (context != null) {
            Activity a = XBridgeMethodHelper.f38086a.mo53178a(context);
            if (a != null) {
                String a2 = aVar.mo53199a();
                Boolean c = aVar.mo53204c();
                try {
                    StatusBarStyle a3 = StatusBarStyle.Companion.mo53197a(a2);
                    if (a3 == StatusBarStyle.UNKNOWN) {
                        aVar2.mo53183a(-3, "StatusBar style can only be dark or light");
                        return;
                    }
                    Log.d(this.f38105a, "handle: style = " + a2);
                    if (a != null) {
                        window = a.getWindow();
                    } else {
                        window = null;
                    }
                    StatusBarUtils aVar3 = StatusBarUtils.f38104a;
                    if (a3 == StatusBarStyle.DARK) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar3.mo53194a(a, window, z);
                    if (c == null) {
                        Intrinsics.throwNpe();
                    }
                    if (c.booleanValue()) {
                        StatusBarUtils.f38104a.mo53195b(a);
                    } else {
                        StatusBarUtils.f38104a.mo53192a(a);
                    }
                    String b = aVar.mo53202b();
                    if (a != null) {
                        String str = b;
                        if (str == null || str.length() == 0) {
                            z2 = true;
                        }
                        if (!z2 && b.length() == 9) {
                            if (b != null) {
                                String substring = b.substring(7, 9);
                                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                if (substring != null) {
                                    String upperCase = substring.toUpperCase();
                                    Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(String.valueOf('#') + upperCase);
                                    String obj = b.subSequence(1, 7).toString();
                                    if (obj != null) {
                                        String upperCase2 = obj.toUpperCase();
                                        Intrinsics.checkExpressionValueIsNotNull(upperCase2, "(this as java.lang.String).toUpperCase()");
                                        sb.append(upperCase2);
                                        String sb2 = sb.toString();
                                        Log.d(this.f38105a, "handle: color = " + sb2);
                                        StatusBarUtils.f38104a.mo53193a(a, Color.parseColor(sb2));
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    AbsXConfigureStatusBarMethod.XConfigureStatusBarCallback.C14448a.m58447a(aVar2, new XDefaultResultModel(), null, 2, null);
                } catch (Exception e) {
                    Log.d(this.f38105a, "handle: " + e.getMessage());
                }
            } else {
                aVar2.mo53183a(0, "Failed to find proper activity");
            }
        } else {
            aVar2.mo53183a(0, "Context not provided in host");
        }
    }
}
