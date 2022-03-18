package com.bytedance.ee.bear.sheet.reminder;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.reminder.model.EAlertTimeEvent;
import com.bytedance.ee.bear.reminder.model.ReminderUserEntity;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SheetReminderModel implements NonProguard {
    private static Map<EAlertTimeEvent, Integer> notifyStrategyMap;
    private SheetReminderData data;

    public static class SheetReminderData implements NonProguard {
        public long expireTime;
        @JSONField(name = "isSetTime")
        public boolean isSetTime;
        public int notifyStrategy = -1;
        public String notifyText;
        public List<ReminderUserEntity> notifyUsers;
        private String sheetId;

        public long getExpireTime() {
            return this.expireTime;
        }

        public int getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public String getNotifyText() {
            return this.notifyText;
        }

        public List<ReminderUserEntity> getNotifyUsers() {
            return this.notifyUsers;
        }

        public String getSheetId() {
            return this.sheetId;
        }

        public boolean isSetTime() {
            return this.isSetTime;
        }

        public String toString() {
            return "DataBean{expireTime=" + this.expireTime + ", notifyStrategy=" + this.notifyStrategy + ", notifyUsers=" + this.notifyUsers + ", notifyText='" + C13598b.m55197d(this.notifyText) + '\'' + ", isSetTime=" + this.isSetTime + ", sheetId='" + C13598b.m55197d(this.sheetId) + '\'' + '}';
        }

        public void setExpireTime(long j) {
            this.expireTime = j;
        }

        public void setNotifyStrategy(int i) {
            this.notifyStrategy = i;
        }

        public void setNotifyText(String str) {
            this.notifyText = str;
        }

        public void setNotifyUsers(List<ReminderUserEntity> list) {
            this.notifyUsers = list;
        }

        public void setSetTime(boolean z) {
            this.isSetTime = z;
        }

        public void setSheetId(String str) {
            this.sheetId = str;
        }
    }

    public SheetReminderData getData() {
        return this.data;
    }

    public String toString() {
        return "SheetReminderModel{data=" + this.data + '}';
    }

    public C11293b toSheetReminderSettings() {
        C11293b bVar = new C11293b();
        SheetReminderData sheetReminderData = this.data;
        if (sheetReminderData == null) {
            return bVar;
        }
        bVar.mo40213a(sheetReminderData.isSetTime);
        bVar.mo40209a((this.data.expireTime / 1000) * 1000);
        bVar.mo40216b(true);
        bVar.mo40217c(true);
        bVar.mo40211a(this.data.notifyText);
        bVar.mo40215b(this.data.notifyUsers);
        if (this.data.isSetTime) {
            bVar.mo40214b(getEAlertTimeEventById(this.data.notifyStrategy));
            bVar.mo40210a(bVar.mo40230q());
        } else {
            bVar.mo40210a(getEAlertTimeEventById(this.data.notifyStrategy));
            bVar.mo40214b(bVar.mo40232s());
        }
        return bVar;
    }

    static {
        HashMap hashMap = new HashMap();
        notifyStrategyMap = hashMap;
        hashMap.put(EAlertTimeEvent.noAlert, -1);
        notifyStrategyMap.put(EAlertTimeEvent.atTimeOfEvent, 0);
        notifyStrategyMap.put(EAlertTimeEvent.before5Mins, 1);
        notifyStrategyMap.put(EAlertTimeEvent.before15Mins, 2);
        notifyStrategyMap.put(EAlertTimeEvent.before30Mins, 3);
        notifyStrategyMap.put(EAlertTimeEvent.before1Hour, 4);
        notifyStrategyMap.put(EAlertTimeEvent.before2Hours, 5);
        notifyStrategyMap.put(EAlertTimeEvent.onDayOfEvent, 6);
        notifyStrategyMap.put(EAlertTimeEvent.oneDayBefore, 7);
        notifyStrategyMap.put(EAlertTimeEvent.twoDaysBefore, 8);
        notifyStrategyMap.put(EAlertTimeEvent.oneWeekBefore, 9);
        notifyStrategyMap.put(EAlertTimeEvent.before1Day, 10);
        notifyStrategyMap.put(EAlertTimeEvent.before2Days, 11);
        notifyStrategyMap.put(EAlertTimeEvent.before1Week, 12);
    }

    public void setData(SheetReminderData sheetReminderData) {
        this.data = sheetReminderData;
    }

    private static int getNotifyStrategyByEvent(EAlertTimeEvent eAlertTimeEvent) {
        Integer num = notifyStrategyMap.get(eAlertTimeEvent);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static EAlertTimeEvent getEAlertTimeEventById(int i) {
        for (Map.Entry<EAlertTimeEvent, Integer> entry : notifyStrategyMap.entrySet()) {
            if (entry.getValue().intValue() == i) {
                return entry.getKey();
            }
        }
        return EAlertTimeEvent.noAlert;
    }

    public static SheetReminderData newInstance(C11293b bVar) {
        SheetReminderData sheetReminderData = new SheetReminderData();
        sheetReminderData.setExpireTime(bVar.mo40222i());
        sheetReminderData.setSetTime(bVar.mo40221h());
        if (bVar.mo40221h()) {
            sheetReminderData.setNotifyStrategy(getNotifyStrategyByEvent(bVar.mo40228o()));
        } else {
            sheetReminderData.setNotifyStrategy(getNotifyStrategyByEvent(bVar.mo40227n()));
        }
        if (sheetReminderData.notifyStrategy == getNotifyStrategyByEvent(EAlertTimeEvent.noAlert)) {
            sheetReminderData.setNotifyUsers(null);
            sheetReminderData.setNotifyText(null);
        } else {
            sheetReminderData.setNotifyUsers(bVar.mo40226m());
            sheetReminderData.setNotifyText(bVar.mo40225l());
        }
        return sheetReminderData;
    }
}
