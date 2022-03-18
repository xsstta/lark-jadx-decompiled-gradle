package com.tt.miniapp.settings.configs;

import java.util.ArrayList;
import java.util.List;

public class PreLaunchSetting {
    private List<PreLaunchApp> preLaunchApps = new ArrayList();

    public static class PreLaunchApp {
        private String appId;
        private boolean enable;
        private SmartLauncher smartLauncher;

        public static class SmartLauncher {
            private int runningCounts;
            private int runningDays;

            public int getRunningCounts() {
                return this.runningCounts;
            }

            public int getRunningDays() {
                return this.runningDays;
            }

            public void setRunningCounts(int i) {
                this.runningCounts = i;
            }

            public void setRunningDays(int i) {
                this.runningDays = i;
            }
        }

        public String getAppId() {
            return this.appId;
        }

        public SmartLauncher getSmartLauncher() {
            return this.smartLauncher;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public void setAppId(String str) {
            this.appId = str;
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setSmartLauncher(SmartLauncher smartLauncher2) {
            this.smartLauncher = smartLauncher2;
        }
    }

    public List<PreLaunchApp> getPreLaunchApps() {
        return this.preLaunchApps;
    }

    public void setPreLaunchApps(List<PreLaunchApp> list) {
        this.preLaunchApps = list;
    }
}
