package com.tt.miniapp.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.DebugUtil;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class TimeLogger extends AppbrandServiceManager.ServiceBase implements Handler.Callback {
    private volatile Handler mH;
    private boolean mHasErrorLog;
    private volatile HandlerThread mHt;
    private int mIndex;
    private long mIntervalTime;
    private int mLogCount;
    private LinkedList<LogRecord> mPendingLogs;
    private long mStartTime;
    private boolean mStarted;
    private boolean mStopFlush;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private long getDurationTime() {
        return System.currentTimeMillis() - this.mStartTime;
    }

    private long getInterval() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.mIntervalTime;
        this.mIntervalTime = currentTimeMillis;
        return j;
    }

    private void flushPendingLogs() {
        LinkedList<LogRecord> linkedList = this.mPendingLogs;
        if (linkedList != null && !linkedList.isEmpty()) {
            mpLog(formatLogs(this.mPendingLogs));
        }
    }

    private boolean isTimerAlive() {
        if (this.mHt == null || !this.mHt.isAlive() || this.mH == null) {
            return false;
        }
        return true;
    }

    public void stopScheduleFlush() {
        AppBrandLogger.m52828d("TimeLogger", "call stop schedule flush");
        if (isTimerAlive()) {
            this.mH.sendEmptyMessage(12);
        }
    }

    private void start() {
        if (this.mHt == null) {
            synchronized (this) {
                if (this.mHt == null) {
                    this.mHt = new_android_os_HandlerThread_by_knot("TimeLogger");
                    this.mHt.start();
                    this.mH = new Handler(this.mHt.getLooper(), this);
                    this.mStarted = true;
                }
            }
        }
        if (DebugUtil.debug()) {
            AppBrandLogger.m52828d("TimeLogger", "start tiktok");
        }
    }

    public void scheduleFlush() {
        if (!this.mStarted) {
            start();
        }
        if (!isTimerAlive()) {
            return;
        }
        if (AppbrandContext.getInst().isGame()) {
            this.mH.sendEmptyMessageDelayed(11, 8000);
            this.mH.sendEmptyMessageDelayed(11, 15000);
            return;
        }
        this.mH.sendEmptyMessageDelayed(11, 5000);
        this.mH.sendEmptyMessageDelayed(11, 10000);
    }

    private TimeLogger(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
        long currentTimeMillis = System.currentTimeMillis();
        this.mStartTime = currentTimeMillis;
        this.mIntervalTime = currentTimeMillis;
    }

    public static TimeLogger getInstance(IAppContext iAppContext) {
        return AppbrandApplicationImpl.getInst(iAppContext).getTimeLogger();
    }

    private void addPendingLog(LogRecord logRecord) {
        if (this.mPendingLogs == null) {
            this.mPendingLogs = new LinkedList<>();
        }
        this.mPendingLogs.addLast(logRecord);
    }

    public void logError(String... strArr) {
        if (!this.mStarted) {
            start();
        }
        if (isTimerAlive()) {
            postLog(true, strArr);
        }
    }

    public void logTimeDuration(String... strArr) {
        if (!this.mStarted) {
            start();
        }
        if (isTimerAlive()) {
            postLog(false, strArr);
        }
    }

    private void mpLog(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logContent", str);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("TimeLogger", "", e);
        }
        AppBrandLogger.m52828d("TimeLogger", "monitor msg : " + str);
        C67509b.m262587a("mp_launch_loggers", 0, jSONObject, this.mApp.getiAppContext());
    }

    public void logRawLogRecord(LogRecord logRecord) {
        if (!this.mStarted) {
            start();
        }
        if (logRecord != null && isTimerAlive()) {
            logRecord.duration = logRecord.logTime - this.mStartTime;
            this.mH.obtainMessage(10, logRecord).sendToTarget();
        }
    }

    private void printLog(LogRecord logRecord) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = logRecord.msgs;
        for (String str : strArr) {
            sb.append(" ");
            sb.append(str);
        }
        String format = String.format(Locale.getDefault(), "[% 4d],[% 6d] %s", Long.valueOf(logRecord.interval), Long.valueOf(logRecord.duration), sb.toString());
        if (logRecord.isErrorLog) {
            AppBrandLogger.m52829e("TimeLogger", format);
            return;
        }
        AppBrandLogger.m52830i("TimeLogger", format);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 10) {
            LogRecord logRecord = (LogRecord) message.obj;
            printLog(logRecord);
            int i = this.mLogCount;
            if (i <= 200 && !this.mStopFlush) {
                this.mLogCount = i + 1;
                addPendingLog(logRecord);
                if (logRecord.isErrorLog) {
                    this.mHasErrorLog = true;
                    flushPendingLogs();
                }
            }
            return true;
        } else if (message.what == 11) {
            AppBrandLogger.m52828d("TimeLogger", "schedule flush");
            if (!this.mStopFlush) {
                LogRecord logRecord2 = new LogRecord(false, System.currentTimeMillis(), getInterval(), getDurationTime(), new String[]{"TimeLogger_OvertimeFlush"});
                printLog(logRecord2);
                addPendingLog(logRecord2);
                flushPendingLogs();
            }
            return true;
        } else if (message.what != 12) {
            return false;
        } else {
            if (this.mHasErrorLog) {
                flushPendingLogs();
            } else {
                this.mPendingLogs.clear();
            }
            this.mH.removeMessages(11);
            this.mStopFlush = true;
            return true;
        }
    }

    private String formatLogs(LinkedList<LogRecord> linkedList) {
        String str;
        if (linkedList == null || linkedList.isEmpty()) {
            return CharacterUtils.empty();
        }
        StringBuilder sb = new StringBuilder();
        while (!linkedList.isEmpty()) {
            LogRecord pollFirst = linkedList.pollFirst();
            if (!(pollFirst == null || pollFirst.msgs == null || pollFirst.msgs.length <= 0)) {
                String str2 = pollFirst.msgs[0];
                if (pollFirst.msgs.length > 1) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i = 1; i < pollFirst.msgs.length; i++) {
                        sb2.append(",");
                        sb2.append(pollFirst.msgs[i]);
                    }
                    str = sb2.toString();
                } else {
                    str = "";
                }
                String replaceAll = str.replaceAll("\\n", "<br/>");
                String format = new SimpleDateFormat("MM-dd HH:mm:ss:SS", Locale.getDefault()).format(Long.valueOf(pollFirst.logTime));
                Locale locale = Locale.getDefault();
                int i2 = this.mIndex;
                this.mIndex = i2 + 1;
                sb.append(String.format(locale, "%s,%d,%d,%d,%d,%s%s\n", format, Integer.valueOf(i2), Integer.valueOf(pollFirst.isErrorLog ? 1 : 0), Long.valueOf(pollFirst.interval), Long.valueOf(pollFirst.duration), str2, replaceAll));
            }
        }
        return sb.toString();
    }

    private void postLog(boolean z, String[] strArr) {
        this.mH.obtainMessage(10, new LogRecord(z, System.currentTimeMillis(), getInterval(), getDurationTime(), strArr)).sendToTarget();
    }

    public static class LogRecord {
        long duration;
        long interval;
        boolean isErrorLog;
        long logTime;
        String[] msgs;

        public LogRecord(boolean z, long j, long j2, long j3, String[] strArr) {
            this.isErrorLog = z;
            this.logTime = j;
            this.interval = j2;
            this.duration = j3;
            this.msgs = strArr;
        }
    }
}
