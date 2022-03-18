package com.bytedance.ies.xbridge.base.runtime.utils;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XKeyIterator;
import com.bytedance.ies.xbridge.XReadableMap;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J2\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJB\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001f2\u0006\u0010\u0019\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cJ,\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0010J2\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ,\u0010$\u001a\u00020\u00042\"\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001fH\u0002J\u001a\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J3\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010/JM\u00100\u001a\u00020\u00162\b\u00101\u001a\u0004\u0018\u00010\u00042\"\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001f2\b\u00103\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0002\u00104J^\u00105\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001f2\u0006\u00106\u001a\u0002072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJB\u00105\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJB\u0010;\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/utils/XBridgeAPIRequestUtils;", "", "()V", "CONTENT_TYPE", "", "CONTENT_TYPE_JSON", "ERROR_CODE_408", "", "REQUEST_ID_KEY", "REQUEST_TAG_FROM", "TAG", "kotlin.jvm.PlatformType", "X_TT_LOG_ID", "addParametersToUrl", "url", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "convertParamValueToString", "", "delete", "", "targetUrl", "headers", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/utils/IResponseCallback;", "hostNetworkDepend", "Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostNetworkDepend;", "downloadFile", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Lcom/bytedance/ies/xbridge/base/runtime/utils/IDownloadResponseCallback;", "filterHeaderEmptyValue", "header", "get", "getRequestLogId", "responseHeader", "handleConnection", "connection", "Lcom/bytedance/ies/xbridge/base/runtime/network/AbsStringConnection;", "handleError", "", "errorCode", "errorMsg", "throwable", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;Lcom/bytedance/ies/xbridge/base/runtime/utils/IResponseCallback;)Z", "handleSuccess", "body", "respHeader", "respCode", "(Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/Integer;Lcom/bytedance/ies/xbridge/base/runtime/utils/IResponseCallback;)V", "post", "file", "Ljava/io/File;", "contentType", "postData", "Lorg/json/JSONObject;", "put", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.base.runtime.a.b */
public final class XBridgeAPIRequestUtils {

    /* renamed from: a */
    public static final XBridgeAPIRequestUtils f37991a = new XBridgeAPIRequestUtils();

    /* renamed from: b */
    private static String f37992b = XBridgeAPIRequestUtils.class.getSimpleName();

    private XBridgeAPIRequestUtils() {
    }

    /* renamed from: a */
    public final LinkedHashMap<String, String> mo52935a(XReadableMap hVar) {
        boolean z;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (hVar != null) {
            XKeyIterator a = hVar.mo53100a();
            while (a.mo53089a()) {
                String b = a.mo53090b();
                String str = null;
                String a2 = C14434d.m58266a(hVar, b, (String) null, 2, (Object) null);
                if (a2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = a2;
                }
                if (str != null) {
                    linkedHashMap.put(b, a2);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public final Map<String, String> mo52936b(XReadableMap hVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hVar != null) {
            XKeyIterator a = hVar.mo53100a();
            while (a.mo53089a()) {
                String b = a.mo53090b();
                XDynamic i = hVar.mo53110i(b);
                int i2 = C14430c.f37993a[i.mo53082a().ordinal()];
                if (i2 == 1) {
                    linkedHashMap.put(b, String.valueOf(i.mo53085d()));
                } else if (i2 == 2) {
                    linkedHashMap.put(b, String.valueOf(i.mo53083b()));
                } else if (i2 == 3) {
                    linkedHashMap.put(b, String.valueOf(i.mo53084c()));
                } else if (i2 == 4) {
                    linkedHashMap.put(b, i.mo53086e());
                }
            }
        }
        return linkedHashMap;
    }
}
