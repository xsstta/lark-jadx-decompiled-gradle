package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;

public class SystemPermission {

    public static class Response extends C25921b {
        @JSONField(name = "deniedPermissions")
        public List<String> mDeniedPermissions = new ArrayList();
        @JSONField(name = "grantedPermissions")
        public List<String> mGrantedPermissions = new ArrayList();
    }

    public static class Request extends C25920a {
        @JSONField(name = "force")
        private boolean mForceUiThread = true;
        @JSONField(name = "permissions")
        public List<String> mPermissions = new ArrayList();

        public boolean isForceUiThread() {
            return this.mForceUiThread;
        }

        public void setForceUiThread(boolean z) {
            this.mForceUiThread = z;
        }
    }
}
