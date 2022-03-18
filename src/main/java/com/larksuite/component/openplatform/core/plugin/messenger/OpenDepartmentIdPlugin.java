package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.sendmsg.SendMsgCardHandler;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapp.errorcode.ApiCode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

public class OpenDepartmentIdPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin$a */
    public interface AbstractC25087a {
        /* renamed from: a */
        void mo88195a(int i, String str);

        /* renamed from: a */
        void mo88196a(String str);

        /* renamed from: a */
        void mo88197a(Map<String, String> map);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"departmentIdToOpenDepartmentId"})
    public void departmentId2OpenDepartmentId(final AbstractC25897h<Messenger.DepartmentId2OpenDepartmentResponse> hVar, Messenger.DepartmentId2OpenDepartmentRequest departmentId2OpenDepartmentRequest, LKEvent lKEvent, AbstractC25895f fVar) {
        final Messenger.DepartmentId2OpenDepartmentResponse departmentId2OpenDepartmentResponse = new Messenger.DepartmentId2OpenDepartmentResponse();
        List<String> list = departmentId2OpenDepartmentRequest.mDepartmentIds;
        if (list.size() == 0) {
            AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "departmentIds is empty!");
            departmentId2OpenDepartmentResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            departmentId2OpenDepartmentResponse.mErrorMessage = "invalid params";
            hVar.callback(departmentId2OpenDepartmentResponse);
            return;
        }
        OPTrace a = fVar.mo92188a();
        if (a != null) {
            a.setRequestId(C12805d.m52897b(getEventContext(lKEvent)));
        }
        departmentIds2OpenDepartmentIds(list, new AbstractC25087a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin.C250841 */

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin.AbstractC25087a
            /* renamed from: a */
            public void mo88196a(String str) {
                AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "onError:" + str);
                departmentId2OpenDepartmentResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                departmentId2OpenDepartmentResponse.mErrorMessage = str;
                hVar.callback(departmentId2OpenDepartmentResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin.AbstractC25087a
            /* renamed from: a */
            public void mo88197a(Map<String, String> map) {
                if (map == null) {
                    departmentId2OpenDepartmentResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    departmentId2OpenDepartmentResponse.mErrorMessage = "invalid params";
                    hVar.callback(departmentId2OpenDepartmentResponse);
                    return;
                }
                departmentId2OpenDepartmentResponse.mDepartmentIdsWithOpenDepartmentIds = map;
                hVar.callback(departmentId2OpenDepartmentResponse);
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin.AbstractC25087a
            /* renamed from: a */
            public void mo88195a(int i, String str) {
                departmentId2OpenDepartmentResponse.mErrorCode = i;
                departmentId2OpenDepartmentResponse.mErrorMessage = str;
                hVar.callback(departmentId2OpenDepartmentResponse);
            }
        }, getEventContext(lKEvent), a, lKEvent.mo92146m());
    }

    private void departmentIds2OpenDepartmentIds(final List<String> list, final AbstractC25087a aVar, IAppContext iAppContext, OPTrace oPTrace, String str) {
        if (aVar == null) {
            AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "callback is null");
        } else if (list == null || list.isEmpty()) {
            AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "departmentIds is null");
            aVar.mo88197a((Map<String, String>) null);
        } else {
            IdTransformer.f35273a.mo49673b(list, iAppContext, oPTrace, str, new Function1<String, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin.C250852 */

                /* renamed from: a */
                public Unit invoke(String str) {
                    try {
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("openDepIDs");
                        if (optJSONObject == null) {
                            AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "jsonObject is null: " + str);
                            aVar.mo88196a("request service error, openDepIds is empty.");
                            return Unit.INSTANCE;
                        }
                        HashMap hashMap = new HashMap();
                        for (String str2 : list) {
                            String string = optJSONObject.getString(str2);
                            if (TextUtils.isEmpty(string)) {
                                AppBrandLogger.m52829e("OpenDepartmentIdPlugin", str2, "convert to openDepartmentId is empty!!!");
                                hashMap.put(str2, "");
                            } else {
                                hashMap.put(str2, string);
                            }
                        }
                        aVar.mo88197a(hashMap);
                        return Unit.INSTANCE;
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "JSONException", e);
                        aVar.mo88195a(SendMsgCardHandler.Error.SOME_IDS_INVALID.getCode(), SendMsgCardHandler.Error.SOME_IDS_INVALID.getMsg());
                    }
                }
            }, new Function1<Throwable, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.OpenDepartmentIdPlugin.C250863 */

                /* renamed from: a */
                public Unit invoke(Throwable th) {
                    AppBrandLogger.m52829e("OpenDepartmentIdPlugin", "request error", th);
                    aVar.mo88196a("server error");
                    return null;
                }
            });
        }
    }
}
