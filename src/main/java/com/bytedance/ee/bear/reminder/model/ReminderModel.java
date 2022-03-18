package com.bytedance.ee.bear.reminder.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import java.util.List;

public class ReminderModel implements NonProguard {
    private DataBean data;
    private boolean showWholeDaySwitch;

    public static class DataBean implements NonProguard {
        private long expireTime;
        @JSONField(name = "isWholeDay")
        public boolean isWholeDay;
        public List<String> mentions;
        private boolean notCheckboxEntry;
        public String notifyTime;
        private String reminderBlockId;

        public long getExpireTime() {
            return this.expireTime;
        }

        public List<String> getMentions() {
            return this.mentions;
        }

        public String getNotifyTime() {
            return this.notifyTime;
        }

        public String getReminderBlockId() {
            return this.reminderBlockId;
        }

        public boolean isNotCheckboxEntry() {
            return this.notCheckboxEntry;
        }

        public boolean isWholeDay() {
            return this.isWholeDay;
        }

        public String toString() {
            return "DataBean{reminderBlockId='" + this.reminderBlockId + '\'' + ", isWholeDay=" + this.isWholeDay + ", expireTime=" + this.expireTime + ", notCheckboxEntry=" + this.notCheckboxEntry + ", notifyTime='" + this.notifyTime + '\'' + ", mentions='" + this.mentions + '\'' + '}';
        }

        public void setExpireTime(long j) {
            this.expireTime = j;
        }

        public void setMentions(List<String> list) {
            this.mentions = list;
        }

        public void setNotCheckboxEntry(boolean z) {
            this.notCheckboxEntry = z;
        }

        public void setNotifyTime(String str) {
            this.notifyTime = str;
        }

        public void setReminderBlockId(String str) {
            this.reminderBlockId = str;
        }

        public void setWholeDay(boolean z) {
            this.isWholeDay = z;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public boolean isShowWholeDaySwitch() {
        return this.showWholeDaySwitch;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) this.data);
        jSONObject.put("showWholeDaySwitch", (Object) Boolean.valueOf(this.showWholeDaySwitch));
        return jSONObject;
    }

    public String toString() {
        return "ReminderModel{data=" + this.data + ", showWholeDaySwitch=" + this.showWholeDaySwitch + '}';
    }

    public C10621b toReminderSettings() {
        C10621b bVar = new C10621b();
        bVar.mo40217c(isShowWholeDaySwitch());
        DataBean dataBean = this.data;
        if (dataBean == null) {
            return bVar;
        }
        bVar.mo40213a(!dataBean.isWholeDay());
        bVar.mo40209a(this.data.getExpireTime() * 1000);
        bVar.mo40216b(!this.data.isNotCheckboxEntry());
        bVar.mo40212a(this.data.mentions);
        if (this.data.isWholeDay) {
            bVar.mo40210a(EAlertTimeEvent.valueOf(this.data.notifyTime));
            bVar.mo40214b(bVar.mo40232s());
        } else {
            bVar.mo40214b(EAlertTimeEvent.valueOf(this.data.notifyTime));
            bVar.mo40210a(bVar.mo40230q());
        }
        return bVar;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setShowWholeDaySwitch(boolean z) {
        this.showWholeDaySwitch = z;
    }

    public static ReminderModel newInstance(C10621b bVar) {
        ReminderModel reminderModel = new ReminderModel();
        DataBean dataBean = new DataBean();
        dataBean.setExpireTime(bVar.mo40222i() / 1000);
        dataBean.setWholeDay(!bVar.mo40221h());
        dataBean.setNotCheckboxEntry(!bVar.mo40223j());
        if (bVar.mo40221h()) {
            dataBean.setNotifyTime(bVar.mo40228o().name());
        } else {
            dataBean.setNotifyTime(bVar.mo40227n().name());
        }
        reminderModel.setData(dataBean);
        return reminderModel;
    }
}
