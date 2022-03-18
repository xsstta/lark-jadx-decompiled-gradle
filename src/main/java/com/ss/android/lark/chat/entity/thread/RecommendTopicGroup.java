package com.ss.android.lark.chat.entity.thread;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class RecommendTopicGroup implements AbstractC26248b<RecommendTopicGroup>, Serializable {
    private static final long serialVersionUID = 1;
    private String avatarKey;
    private JoinState joinState;
    private String name;
    private List<RelatedUser> relatedUsers;
    private String topicGroupId;
    private int userCount;

    public enum JoinState {
        UNKNOWN(0),
        NOT_JOINED(1),
        APPLIED(2),
        JOINED(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static JoinState valueOf(int i) {
            return forNumber(i);
        }

        public static JoinState forNumber(int i) {
            if (i == 1) {
                return NOT_JOINED;
            }
            if (i == 2) {
                return APPLIED;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return JOINED;
        }

        private JoinState(int i) {
            this.value = i;
        }
    }

    public static class RelatedUser implements AbstractC26248b<RelatedUser>, Serializable {
        private String avatarKey;
        private String userId;

        public String getAvatarKey() {
            return this.avatarKey;
        }

        public String getUserId() {
            return this.userId;
        }

        public void setAvatarKey(String str) {
            this.avatarKey = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public boolean isItemSame(RelatedUser relatedUser) {
            if (this == relatedUser) {
                return true;
            }
            return Objects.equals(this.userId, relatedUser.userId);
        }

        public boolean isContentSame(RelatedUser relatedUser) {
            if (Objects.equals(this.userId, relatedUser.userId) && Objects.equals(this.avatarKey, relatedUser.avatarKey)) {
                return true;
            }
            return false;
        }

        public RelatedUser(String str, String str2) {
            this.userId = str;
            this.avatarKey = str2;
        }
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public JoinState getJoinState() {
        return this.joinState;
    }

    public String getName() {
        return this.name;
    }

    public List<RelatedUser> getRelatedUsers() {
        return this.relatedUsers;
    }

    public String getTopicGroupId() {
        return this.topicGroupId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setJoinState(JoinState joinState2) {
        this.joinState = joinState2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRelatedUsers(List<RelatedUser> list) {
        this.relatedUsers = list;
    }

    public void setTopicGroupId(String str) {
        this.topicGroupId = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public boolean isItemSame(RecommendTopicGroup recommendTopicGroup) {
        if (this == recommendTopicGroup) {
            return true;
        }
        return Objects.equals(this.topicGroupId, recommendTopicGroup.topicGroupId);
    }

    public boolean isContentSame(RecommendTopicGroup recommendTopicGroup) {
        if (Objects.equals(this.topicGroupId, recommendTopicGroup.topicGroupId) && Objects.equals(this.avatarKey, recommendTopicGroup.avatarKey) && Objects.equals(this.name, recommendTopicGroup.name) && Objects.equals(this.joinState, recommendTopicGroup.joinState) && Objects.equals(Integer.valueOf(this.userCount), Integer.valueOf(recommendTopicGroup.userCount)) && C26247a.m94982a((List) this.relatedUsers, (List) recommendTopicGroup.relatedUsers)) {
            return true;
        }
        return false;
    }

    public static RecommendTopicGroup create(RecommendTopicGroup recommendTopicGroup, JoinState joinState2) {
        RecommendTopicGroup recommendTopicGroup2 = new RecommendTopicGroup();
        recommendTopicGroup2.setUserCount(recommendTopicGroup.getUserCount());
        recommendTopicGroup2.setTopicGroupId(recommendTopicGroup.getTopicGroupId());
        recommendTopicGroup2.setName(recommendTopicGroup.getName());
        recommendTopicGroup2.setAvatarKey(recommendTopicGroup.getAvatarKey());
        recommendTopicGroup2.setJoinState(joinState2);
        recommendTopicGroup2.setRelatedUsers(recommendTopicGroup.getRelatedUsers());
        return recommendTopicGroup2;
    }
}
