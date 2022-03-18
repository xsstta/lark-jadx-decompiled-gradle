package com.ss.android.lark.safetynet.inhouse;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class SafetyNetInhouseResult {

    public enum RiskLevel {
        ENVRIRONMENT_SAFE(0),
        ENVIRONMENT_ROOT(1),
        ENVIRONMENT_EMULATOR(2),
        ENVIRONMENT_HOOK(4),
        ENVIRONMENT_DEBUG(8),
        ENVIRONMENT_VAPP(16),
        ENVIRONMENT_MONKEY(32),
        ENVIRONMENT_REBUILD_PACKAGE(64),
        ENVIRONMENT_PROXY(SmActions.ACTION_ONTHECALL_EXIT);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        private RiskLevel(int i) {
            this.value = i;
        }
    }
}
