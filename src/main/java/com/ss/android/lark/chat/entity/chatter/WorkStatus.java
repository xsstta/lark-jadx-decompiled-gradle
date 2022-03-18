package com.ss.android.lark.chat.entity.chatter;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import java.io.Serializable;
import java.util.Date;

public class WorkStatus implements Serializable {
    public final String description;
    public final long endTime;
    public final boolean isCrossTenant;
    public final long startTime;
    public final Status status;

    public enum Status {
        UNKNOWN(0),
        ON_LEAVE(1),
        ON_MEETING(2);
        
        public int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        private static Status forNumber(int i) {
            if (i == 1) {
                return ON_LEAVE;
            }
            if (i == 2) {
                return ON_MEETING;
            }
            return UNKNOWN;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public WorkStatus() {
        this.status = Status.UNKNOWN;
        this.description = "";
        this.startTime = -1;
        this.endTime = -1;
    }

    public String toString() {
        return "WorkStatus{status=" + this.status + ", description='" + this.description + '\'' + ", startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
    }

    public String getDisplayTextNoDuration(Context context) {
        return getDisplayText(context, false);
    }

    public String getDisplayTextWithDuration(Context context) {
        return getDisplayText(context, true);
    }

    public static boolean isInvalid(WorkStatus workStatus) {
        if (workStatus == null) {
            return true;
        }
        if (workStatus.status == Status.UNKNOWN) {
            Log.m165397w("WorkStatus", "status is UNKNOWN ，" + workStatus.toString());
            return true;
        } else if (workStatus.isCrossTenant) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WorkStatus)) {
            return false;
        }
        WorkStatus workStatus = (WorkStatus) obj;
        if (!TextUtils.equals(this.description, workStatus.description) || this.startTime != workStatus.startTime || this.endTime != workStatus.endTime) {
            return false;
        }
        Status status2 = this.status;
        if (status2 == null || workStatus.status == null) {
            if (status2 == null && workStatus.status == null) {
                return true;
            }
            return false;
        } else if (status2.value == workStatus.status.value) {
            return true;
        } else {
            return false;
        }
    }

    private String getWorkStatusTime(Context context, long j) {
        Options aVar = new Options();
        aVar.mo191593a(LengthType.SHORT);
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        return TimeFormatUtils.m219289e(context, new Date(j), aVar);
    }

    private String getDisplayText(Context context, boolean z) {
        if (!z) {
            return this.description;
        }
        String workStatusTime = getWorkStatusTime(context, this.startTime * 1000);
        String workStatusTime2 = getWorkStatusTime(context, this.endTime * 1000);
        if (TextUtils.equals(workStatusTime, workStatusTime2)) {
            return workStatusTime + " " + this.description;
        }
        return workStatusTime + "-" + workStatusTime2 + " " + this.description;
    }

    public WorkStatus(Status status2, String str, long j, long j2, boolean z) {
        this.status = status2;
        this.description = str;
        this.startTime = j;
        this.endTime = j2;
        this.isCrossTenant = z;
    }
}
