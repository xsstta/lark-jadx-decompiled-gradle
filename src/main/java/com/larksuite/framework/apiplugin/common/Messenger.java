package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Messenger {

    public static class ChatBadgeChangeResponse extends C25921b {
        @JSONField(name = "badge")
        public int mBadge;
        @JSONField(name = "chatId")
        public String mChatId;
        @JSONField(name = "isRemind")
        public boolean mIsRemind;
    }

    public static class ChatBadgeRequest extends C25920a {
        @JSONField(name = "chatIds")
        @LKRequiredParam
        public List<String> mChatIds = new ArrayList();
    }

    public static class ChatBadgeResponse extends C25921b {
    }

    public static class ChatIdsToOpenChatIdsRequest extends C25920a {
        @JSONField(name = "chats")
        public List<ChatRequest> mChats = new ArrayList();
    }

    public static class ChatIdsToOpenChatIdsResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public List<ChatInfo> mChatInfos = new ArrayList();
    }

    public static class ChatInfo {
        @JSONField(name = "avatarUrls")
        public List<String> mAvatarUrls = new ArrayList();
        @JSONField(name = "chatType")
        public int mChatType;
        @JSONField(name = "i18nNames")
        public JSONObject mI18nNames;
        @JSONField(name = "id")
        public String mId;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "userType")
        public int mUserType;
    }

    public static class ChatRequest {
        @JSONField(name = "chatid")
        public String mChatId;
        @JSONField(name = "isBot")
        public boolean mIsBot;
        @JSONField(name = ShareHitPoint.f121869d)
        public String mType;
    }

    public static class DepartmentId2OpenDepartmentRequest extends C25920a {
        @JSONField(name = "departmentIds")
        public List<String> mDepartmentIds = new ArrayList();
    }

    public static class DepartmentId2OpenDepartmentResponse extends C25921b {
        @JSONField(name = "departmentIdsWithOpenDepartmentIds")
        public Map<String, String> mDepartmentIdsWithOpenDepartmentIds = new HashMap();
    }

    public static class EnterBotResponse extends C25921b {
    }

    public static class EnterChatRequest extends C25920a {
        @JSONField(name = BottomDialog.f17198f)
        public String mChatterId;
        @JSONField(name = "needBadge")
        public boolean mNeedBadge;
        @JSONField(name = "openChatId")
        public String mOpenChatId;
        @JSONField(name = "openid")
        public String mOpenId;
    }

    public static class EnterChatResponse extends C25921b {
    }

    public static class EnterProfileAsyncHandlerRequest extends C25920a {
        @JSONField(name = "openid")
        @LKRequiredParam
        public String mOpenId;
    }

    public static class EnterProfileAsyncHandlerResponse extends C25921b {
    }

    public static class EnterProfileByUserRequest extends C25920a {
        @JSONField(name = "userId")
        @LKRequiredParam
        public String mUserId;
    }

    public static class EnterProfileByUserResponse extends C25921b {
    }

    public static class GetChatInfo {
        @JSONField(name = "atCount")
        public int mAtCount;
        @JSONField(name = "avatarUrls")
        public List<String> mAvatarUrls;
        @JSONField(name = "badge")
        public int mBadge;
        @JSONField(name = "i18nNames")
        public JSONObject mI18nNames;
        @JSONField(name = "name")
        public String mName;
    }

    public static class GetChatInfoByChatIdRequest extends C25920a {
        @JSONField(name = "chatIds")
        @LKRequiredParam
        public List<String> mChatId;
    }

    public static class GetChatInfoByChatIdResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public List<HashMap<String, GetChatInfo>> chatInfos = new ArrayList();
        @JSONField(name = "failChatIds")
        public List<String> mFailChatIds = new ArrayList();
    }

    public static class GetChatInfoRequest extends C25920a {
        @JSONField(name = "chatType")
        public int mChatType = -1;
        @JSONField(name = "openChatId")
        public String mOpenChatId;
        @JSONField(name = "userType")
        public int mUserType;
    }

    public static class GetChatInfoResponse extends C25921b {
        @JSONField(name = "atCount")
        public int mAtCount;
        @JSONField(name = "avatarUrls")
        public List<String> mAvatarUrls = new ArrayList();
        @JSONField(name = "badge")
        public int mBadge;
        @JSONField(name = "i18nNames")
        public JSONObject mI18nNames;
        @JSONField(name = "name")
        public String mName;
    }

    public static class OpenChatId2ChatIdResponse extends C25921b {
        @JSONField(name = "chatId")
        public String mChatId;
    }

    public static class OpenChatIdToChatIdRequest extends C25920a {
        @JSONField(name = "openChatId")
        public String mOpenChatID;
    }

    public static class OpenChatIds2ChatIdsResponse extends C25921b {
        @JSONField(name = "chatIds")
        public List<String> mChatIds = new ArrayList();
        @JSONField(name = "failedOpenChatIds")
        public List<String> mFailedOpenChatIds = new ArrayList();
    }

    public static class OpenChatIdsToChatIdsRequest extends C25920a {
        @JSONField(name = "openChatIds")
        public List<String> mOpenChatIds = new ArrayList();
    }

    public static class OpenIdToChatIdRequest extends C25920a {
        @JSONField(name = "openId")
        public String mOpenId;
    }

    public static class OpenIdToChatIdResponse extends C25921b {
        @JSONField(name = "chatId")
        public String mChatId;
    }
}
