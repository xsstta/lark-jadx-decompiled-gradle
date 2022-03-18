package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.util.io.NonProguard;

public enum RNFollowEventTypes implements NonProguard {
    FOLLOW_ACTION,
    FOLLOW_REPLAY,
    FOLLOW_EVENT,
    PRESENTER_STATE,
    PRESENTER_FOLLOWER_LOCATION,
    NEW_ACTIONS,
    SUITE_TITLE_CHANGE,
    FOLLOW_LOG
}
