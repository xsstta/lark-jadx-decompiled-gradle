package com.larksuite.component.openplatform.plugins.device.usercapture;

import android.app.Activity;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.SystemPermission;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;

public class UserCaptureScreenPlugin extends AbstractC25889a {
    private OnUserCaptureScreenManager mOnUserCaptureScreenManager;

    public static class UserCaptureScreenRequest extends C25920a {
    }

    public static class UserCaptureScreenResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        OnUserCaptureScreenManager onUserCaptureScreenManager = this.mOnUserCaptureScreenManager;
        if (onUserCaptureScreenManager != null) {
            onUserCaptureScreenManager.mo88814a();
        }
        this.mOnUserCaptureScreenManager = null;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        checkApplicationForeGround(lKEvent);
        return super.handleEvent(lKEvent);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a("onBackGround");
        gVar.mo92192a("onForeGround");
        super.addEvents(gVar);
    }

    public OnUserCaptureScreenManager getOnUserCaptureScreenManager(AbstractC25905b bVar) {
        OnUserCaptureScreenManager onUserCaptureScreenManager = this.mOnUserCaptureScreenManager;
        if (onUserCaptureScreenManager != null) {
            return onUserCaptureScreenManager;
        }
        OnUserCaptureScreenManager onUserCaptureScreenManager2 = new OnUserCaptureScreenManager(bVar);
        this.mOnUserCaptureScreenManager = onUserCaptureScreenManager2;
        return onUserCaptureScreenManager2;
    }

    private void checkApplicationForeGround(LKEvent lKEvent) {
        OnUserCaptureScreenManager onUserCaptureScreenManager;
        String m = lKEvent.mo92146m();
        m.hashCode();
        if (m.equals("onForeGround")) {
            OnUserCaptureScreenManager onUserCaptureScreenManager2 = this.mOnUserCaptureScreenManager;
            if (onUserCaptureScreenManager2 != null) {
                onUserCaptureScreenManager2.mo88816a(false);
            }
        } else if (m.equals("onBackGround") && (onUserCaptureScreenManager = this.mOnUserCaptureScreenManager) != null) {
            onUserCaptureScreenManager.mo88816a(true);
        }
    }

    @LKPluginFunction(async = true, eventName = {"offUserCaptureScreen"})
    public void offUserCaptureScreen(AbstractC25897h<UserCaptureScreenResponse> hVar, AbstractC25905b bVar) {
        UserCaptureScreenResponse userCaptureScreenResponse = new UserCaptureScreenResponse();
        if (!(bVar.mo92207a() instanceof Activity)) {
            Log.m165383e("UserCaptureScreenPlugin", "context is null");
            fillFailedResponse(userCaptureScreenResponse, C25906a.f64080j, "context is null");
            hVar.callback(userCaptureScreenResponse);
            return;
        }
        try {
            getOnUserCaptureScreenManager(bVar).mo88818c();
            hVar.callback(null);
        } catch (Exception e) {
            fillFailedResponse(userCaptureScreenResponse, C25906a.f64080j, C25611a.m91379a(e));
            hVar.callback(userCaptureScreenResponse);
        }
    }

    @LKPluginFunction(async = true, eventName = {"onUserCaptureScreen"})
    public void onUserCaptureScreen(final UserCaptureScreenRequest userCaptureScreenRequest, final AbstractC25897h<UserCaptureScreenResponse> hVar, final AbstractC25905b bVar) {
        final UserCaptureScreenResponse userCaptureScreenResponse = new UserCaptureScreenResponse();
        if (!(bVar.mo92207a() instanceof Activity)) {
            Log.m165383e("UserCaptureScreenPlugin", "context is null");
            fillFailedResponse(userCaptureScreenResponse, C25906a.f64080j, "context is null");
            hVar.callback(userCaptureScreenResponse);
            return;
        }
        SystemPermission.Request request = new SystemPermission.Request();
        request.mPermissions.add("android.permission.READ_EXTERNAL_STORAGE");
        bVar.mo92209a("requestSystemPermission", request, new AbstractC25897h<SystemPermission.Response>() {
            /* class com.larksuite.component.openplatform.plugins.device.usercapture.UserCaptureScreenPlugin.C256031 */

            /* renamed from: a */
            public void callback(SystemPermission.Response response) {
                if (!response.mGrantedPermissions.contains("android.permission.READ_EXTERNAL_STORAGE")) {
                    Log.m165389i("UserCaptureScreenPlugin", "onUserCaptureScreen, system auth deny");
                    UserCaptureScreenPlugin.this.fillFailedResponse(userCaptureScreenResponse, C25906a.f64075e, C25906a.f64075e.f64117J);
                    hVar.callback(userCaptureScreenResponse);
                    return;
                }
                try {
                    OnUserCaptureScreenManager onUserCaptureScreenManager = UserCaptureScreenPlugin.this.getOnUserCaptureScreenManager(bVar);
                    onUserCaptureScreenManager.mo88816a(userCaptureScreenRequest.mIsBackground);
                    onUserCaptureScreenManager.mo88817b();
                    hVar.callback(null);
                } catch (Exception e) {
                    UserCaptureScreenPlugin.this.fillFailedResponse(userCaptureScreenResponse, C25906a.f64080j, C25611a.m91379a(e));
                    hVar.callback(userCaptureScreenResponse);
                }
            }
        }, SystemPermission.Response.class);
    }
}
