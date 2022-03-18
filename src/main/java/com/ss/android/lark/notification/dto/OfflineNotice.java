package com.ss.android.lark.notification.dto;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.Notice;

public class OfflineNotice extends Notice {
    private String businessInfoStr;
    private String msgSid = "";
    private final JSONObject offlineBiz;
    private String packetStr = "";
    private long receivedTimeStamp;
    private long rid64;
    private int ruleId;
    private long sendTimeStamp;
    private final int sender;
    private String userId = "";

    public String getMsgSid() {
        return this.msgSid;
    }

    public String getPacketStr() {
        return this.packetStr;
    }

    public long getReceivedTimeStamp() {
        return this.receivedTimeStamp;
    }

    public long getRid64() {
        return this.rid64;
    }

    public int getRuleId() {
        return this.ruleId;
    }

    public long getSendTimeStamp() {
        return this.sendTimeStamp;
    }

    public int getSender() {
        return this.sender;
    }

    public String getUserId() {
        return this.userId;
    }

    private long getCurrentLocalUTC() {
        return System.currentTimeMillis() / 1000;
    }

    public JSONObject getBusinessInfo() {
        return JSONObject.parseObject(this.businessInfoStr);
    }

    public boolean isExistBusinessInfo() {
        return !TextUtils.isEmpty(this.businessInfoStr);
    }

    public boolean isNoticeByTTPush() {
        if (this.sender != -1) {
            return true;
        }
        return false;
    }

    private void parseExtraStrIfNeed() {
        String str;
        if (!TextUtils.isEmpty(this.businessInfoStr)) {
            JSONObject parseObject = JSONObject.parseObject(this.businessInfoStr);
            this.msgSid = parseObject.getString("Sid");
            this.packetStr = parseObject.getString("Packet");
            this.sendTimeStamp = parseObject.getLongValue("Time");
            if (parseObject.getString("user_id") == null) {
                str = "";
            } else {
                str = parseObject.getString("user_id");
            }
            this.userId = str;
        }
    }

    private void getBusinessInfo(JSONObject jSONObject) {
        String string = jSONObject.getString("extra_str");
        this.businessInfoStr = string;
        if (TextUtils.isEmpty(string)) {
            String string2 = jSONObject.getString("open_url");
            if (TextUtils.isEmpty(string2)) {
                Log.m165383e("OfflineNotice", "offlineBiz data error, offlineBiz = " + jSONObject);
                return;
            }
            if (string2.startsWith("http://")) {
                string2 = string2.substring(7);
            }
            this.businessInfoStr = string2;
        }
        parseExtraStrIfNeed();
    }

    public OfflineNotice(JSONObject jSONObject, int i) {
        Log.m165379d("OfflineNotice", "offlineBiz = " + jSONObject);
        this.offlineBiz = jSONObject;
        this.title = jSONObject.getString("title");
        this.content = jSONObject.getString("text");
        this.receivedTimeStamp = getCurrentLocalUTC();
        this.type = 20001;
        this.sender = i;
        if (i != -1) {
            this.ruleId = jSONObject.getIntValue("id");
            this.rid64 = jSONObject.getLongValue("rid64");
        }
        getBusinessInfo(jSONObject);
    }
}
