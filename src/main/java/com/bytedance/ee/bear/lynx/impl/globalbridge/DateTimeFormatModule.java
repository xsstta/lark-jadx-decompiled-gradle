package com.bytedance.ee.bear.lynx.impl.globalbridge;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.common.OptionsUtil;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/globalbridge/DateTimeFormatModule;", "Lcom/lynx/jsbridge/LynxModule;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "call", "", "formatMethod", "", "params", "Lcom/lynx/react/bridge/ReadableMap;", "callback", "Lcom/lynx/react/bridge/Callback;", "callbackFailure", "code", "", "msg", "callbackSuccess", "formatString", "convertParams", "Lcom/ss/android/lark/time/format/Options;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DateTimeFormatModule extends LynxModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/globalbridge/DateTimeFormatModule$Companion;", "", "()V", "NAME", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.globalbridge.DateTimeFormatModule$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateTimeFormatModule(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final Options convertParams(ReadableMap readableMap) {
        if (readableMap == null) {
            return OptionsUtil.f139149a.mo191618a((Options) null);
        }
        String string = readableMap.getString("timezone", "");
        int i = readableMap.getInt("displayPattern", DisplayPattern.ABSOLUTE.getNumber());
        int i2 = readableMap.getInt("lengthType", LengthType.LONG.getNumber());
        int i3 = readableMap.getInt("datePreciseness", DatePreciseness.DAY.getNumber());
        int i4 = readableMap.getInt("timePreciseness", TimePreciseness.MINUTE.getNumber());
        boolean z = readableMap.getBoolean("isShowTimezone", false);
        boolean z2 = readableMap.getBoolean("isTwelveHour", false);
        boolean z3 = readableMap.getBoolean("isTruncatingZeroTail", false);
        boolean z4 = readableMap.getBoolean("isTimeOptimize", false);
        Intrinsics.checkExpressionValueIsNotNull(string, "timezone");
        return new Options(string, DisplayPattern.Companion.mo191642b(i), LengthType.Companion.mo191645b(i2), DatePreciseness.Companion.mo191639b(i3), TimePreciseness.Companion.mo191648b(i4), z, z2, z3, z4);
    }

    private final void callbackSuccess(String str, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = javaOnlyMap;
        javaOnlyMap2.put("code", 1);
        javaOnlyMap2.put("message", "success");
        javaOnlyMap2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
    }

    private final void callbackFailure(int i, String str, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = javaOnlyMap;
        javaOnlyMap2.put("code", Integer.valueOf(i));
        javaOnlyMap2.put("message", str);
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
    }

    @LynxMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (TextUtils.isEmpty(str)) {
            callbackFailure(-3, "formatMethod is empty", callback);
            return;
        }
        String str5 = "";
        if (readableMap == null || (str2 = readableMap.getString("timestamp", str5)) == null) {
            str2 = str5;
        }
        if (readableMap == null || (str3 = readableMap.getString("startTimestamp", str5)) == null) {
            str3 = str5;
        }
        if (readableMap == null || (str4 = readableMap.getString("endTimestamp", str5)) == null) {
            str4 = str5;
        }
        Options convertParams = convertParams(readableMap);
        if (str != null) {
            boolean z5 = true;
            switch (str.hashCode()) {
                case -1948285527:
                    if (str.equals("formatFullDateRange")) {
                        if (str3.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            if (str4.length() != 0) {
                                z5 = false;
                            }
                            if (!z5) {
                                Context context = this.mContext;
                                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                                str5 = TimeFormatUtils.m219286c(context, new Date(Long.parseLong(str3)), new Date(Long.parseLong(str4)), convertParams);
                                break;
                            }
                        }
                    }
                    break;
                case -1683553519:
                    if (str.equals("formatWeekDay")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context2 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                            str5 = TimeFormatUtils.m219283b(context2, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case -1117838344:
                    if (str.equals("formatDateRange")) {
                        if (str3.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (str4.length() != 0) {
                                z5 = false;
                            }
                            if (!z5) {
                                Context context3 = this.mContext;
                                Intrinsics.checkExpressionValueIsNotNull(context3, "mContext");
                                str5 = TimeFormatUtils.m219284b(context3, new Date(Long.parseLong(str3)), new Date(Long.parseLong(str4)), convertParams);
                                break;
                            }
                        }
                    }
                    break;
                case -832316359:
                    if (str.equals("formatTimeRange")) {
                        if (str3.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            if (str4.length() != 0) {
                                z5 = false;
                            }
                            if (!z5) {
                                Context context4 = this.mContext;
                                Intrinsics.checkExpressionValueIsNotNull(context4, "mContext");
                                str5 = TimeFormatUtils.m219281a(context4, new Date(Long.parseLong(str3)), new Date(Long.parseLong(str4)), convertParams);
                                break;
                            }
                        }
                    }
                    break;
                case -616970015:
                    if (str.equals("formatFullDateTime")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context5 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context5, "mContext");
                            str5 = TimeFormatUtils.m219293h(context5, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case -527493293:
                    if (str.equals("formatMeridiem")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context6 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context6, "mContext");
                            str5 = TimeFormatUtils.m219280a(context6, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case 323323973:
                    if (str.equals("formatDate")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context7 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context7, "mContext");
                            str5 = TimeFormatUtils.m219289e(context7, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case 323808100:
                    if (str.equals("formatTime")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context8 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context8, "mContext");
                            str5 = TimeFormatUtils.m219287d(context8, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case 522240939:
                    if (str.equals("formatDateTimeRange")) {
                        if (str3.length() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            if (str4.length() != 0) {
                                z5 = false;
                            }
                            if (!z5) {
                                Context context9 = this.mContext;
                                Intrinsics.checkExpressionValueIsNotNull(context9, "mContext");
                                str5 = TimeFormatUtils.m219288d(context9, new Date(Long.parseLong(str3)), new Date(Long.parseLong(str4)), convertParams);
                                break;
                            }
                        }
                    }
                    break;
                case 1302928372:
                    if (str.equals("formatFullDate")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context10 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context10, "mContext");
                            str5 = TimeFormatUtils.m219291f(context10, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case 1441832137:
                    if (str.equals("formatMonth")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context11 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context11, "mContext");
                            str5 = TimeFormatUtils.m219285c(context11, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
                case 1765123250:
                    if (str.equals("formatDateTime")) {
                        if (str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            Context context12 = this.mContext;
                            Intrinsics.checkExpressionValueIsNotNull(context12, "mContext");
                            str5 = TimeFormatUtils.m219292g(context12, new Date(Long.parseLong(str2)), convertParams);
                            break;
                        }
                    }
                    break;
            }
        }
        callbackSuccess(str5, callback);
    }

    public static /* synthetic */ void call$default(DateTimeFormatModule dateTimeFormatModule, String str, ReadableMap readableMap, Callback callback, int i, Object obj) {
        if ((i & 2) != 0) {
            readableMap = null;
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        dateTimeFormatModule.call(str, readableMap, callback);
    }
}
