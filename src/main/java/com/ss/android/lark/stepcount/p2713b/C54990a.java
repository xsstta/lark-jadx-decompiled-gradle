package com.ss.android.lark.stepcount.p2713b;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26280j;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.stepcount.dto.DayStepInfo;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.stepcount.b.a */
public class C54990a {

    /* renamed from: a */
    public Sensor f135917a;

    /* renamed from: b */
    public SensorManager f135918b;

    /* renamed from: c */
    public long f135919c;

    /* renamed from: d */
    public int f135920d;

    /* renamed from: e */
    public long f135921e;

    /* renamed from: f */
    public int f135922f;

    /* renamed from: g */
    public SensorEventListener f135923g = new SensorEventListener() {
        /* class com.ss.android.lark.stepcount.p2713b.C54990a.C549911 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            if (fArr != null && sensorEvent.sensor.getType() == 19) {
                int i = (int) fArr[0];
                long a = C54990a.this.mo187774a(sensorEvent.timestamp);
                Log.m165389i("StepCountSensor", "onSensorChanged " + i + " time:" + sensorEvent.timestamp + " real:" + a);
                if (C54990a.this.f135919c == 0) {
                    DayStepInfo dayStepInfo = (DayStepInfo) C57744a.m224104a().getJSONObject("key_step_count_day", DayStepInfo.class);
                    Log.m165389i("StepCountSensor", " first time " + C54990a.this.f135919c + " first count " + C54990a.this.f135920d);
                    if (dayStepInfo == null) {
                        Log.m165389i("StepCountSensor", " first step info create");
                        C54990a.this.f135920d = i;
                        C54990a.this.f135919c = a;
                        DayStepInfo dayStepInfo2 = new DayStepInfo();
                        dayStepInfo2.setFirstDayCount(C54990a.this.f135920d);
                        dayStepInfo2.setFirstDayTime(C54990a.this.f135919c);
                        dayStepInfo2.setCurrentTime(C54990a.this.f135919c);
                        dayStepInfo2.setStepCount(0);
                        dayStepInfo2.setErrCount(0);
                        C57744a.m224104a().putJSONObject("key_step_count_day", dayStepInfo2);
                    } else {
                        Log.m165389i("StepCountSensor", " cur time " + dayStepInfo.getCurrentTime() + " cur count " + dayStepInfo.getStepCount() + " first time " + dayStepInfo.getFirstDayTime() + " is today " + C26280j.m95173a(dayStepInfo.getFirstDayTime()));
                        if (!C26280j.m95173a(dayStepInfo.getFirstDayTime())) {
                            C54990a.this.f135919c = a;
                            C54990a.this.f135920d = i;
                            dayStepInfo.setFirstDayCount(C54990a.this.f135920d);
                            dayStepInfo.setFirstDayTime(C54990a.this.f135919c);
                            dayStepInfo.setCurrentTime(C54990a.this.f135919c);
                            dayStepInfo.setStepCount(0);
                            dayStepInfo.setErrCount(0);
                            C57744a.m224104a().putJSONObject("key_step_count_day", dayStepInfo);
                        } else {
                            C54990a.this.f135919c = dayStepInfo.getFirstDayTime();
                            C54990a.this.f135920d = dayStepInfo.getFirstDayCount();
                            if (dayStepInfo.getLastSensorCount() > i) {
                                dayStepInfo.setFirstDayCount(i);
                                dayStepInfo.setFirstDayTime(a);
                                dayStepInfo.setErrCount(dayStepInfo.getStepCount() + dayStepInfo.getErrCount());
                                dayStepInfo.setStepCount(0);
                                dayStepInfo.setCurrentTime(a);
                                C57744a.m224104a().putJSONObject("key_step_count_day", dayStepInfo);
                            }
                        }
                    }
                }
                if (i >= 0) {
                    C54990a.this.f135922f = i;
                    C54990a.this.f135921e = a;
                }
            }
        }
    };

    /* renamed from: a */
    public int mo187773a() {
        int i;
        DayStepInfo dayStepInfo = (DayStepInfo) C57744a.m224104a().getJSONObject("key_step_count_day", DayStepInfo.class);
        if (dayStepInfo == null) {
            Log.m165383e("StepCountSensor", "get step info null ");
            return 0;
        }
        long currentTime = dayStepInfo.getCurrentTime();
        Log.m165389i("StepCountSensor", " firstt " + this.f135919c + " firstcount " + this.f135920d + "  cur time " + dayStepInfo.getCurrentTime() + " cur coun " + dayStepInfo.getStepCount() + " is day " + C26280j.m95173a(currentTime) + " lastchangecount " + this.f135922f + " firstdaycount " + dayStepInfo.getFirstDayCount());
        if (C26280j.m95173a(dayStepInfo.getFirstDayTime())) {
            if (dayStepInfo.getErrCount() > 0) {
                i = dayStepInfo.getErrCount() + this.f135922f;
            } else {
                i = this.f135922f - dayStepInfo.getFirstDayCount();
            }
            Log.m165389i("StepCountSensor", " get step count " + i);
            return i;
        }
        Log.m165389i("StepCountSensor", "get step count not today " + System.currentTimeMillis());
        dayStepInfo.setFirstDayTime(this.f135921e);
        dayStepInfo.setFirstDayCount(this.f135922f);
        dayStepInfo.setStepCount(0);
        dayStepInfo.setErrCount(0);
        dayStepInfo.setCurrentTime(System.currentTimeMillis());
        C57744a.m224104a().putJSONObject("key_step_count_day", dayStepInfo);
        return 0;
    }

    /* renamed from: b */
    public void mo187775b() {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.stepcount.p2713b.C54990a.RunnableC549933 */

            public void run() {
                if (C54990a.this.f135918b != null && C54990a.this.f135917a != null) {
                    C54990a.this.f135918b.unregisterListener(C54990a.this.f135923g, C54990a.this.f135917a);
                    C54990a.this.f135918b = null;
                    C54990a.this.f135917a = null;
                }
            }
        });
        Log.m165389i("StepCountSensor", " unregister step ");
        DayStepInfo dayStepInfo = (DayStepInfo) C57744a.m224104a().getJSONObject("key_step_count_day", DayStepInfo.class);
        if (dayStepInfo != null) {
            Log.m165389i("StepCountSensor", " firstt " + this.f135919c + " firstcount " + this.f135920d + "  cur time " + dayStepInfo.getCurrentTime() + " cur coun " + dayStepInfo.getStepCount() + " lastchangecount " + this.f135922f + " firstdaycount " + dayStepInfo.getFirstDayCount());
            if (C26280j.m95173a(dayStepInfo.getFirstDayTime())) {
                Log.m165389i("StepCountSensor", "unregister step  today ,err count " + dayStepInfo.getErrCount());
                if (dayStepInfo.getErrCount() > 0) {
                    dayStepInfo.setStepCount(this.f135922f);
                } else {
                    dayStepInfo.setStepCount(this.f135922f - dayStepInfo.getFirstDayCount());
                }
            } else {
                Log.m165389i("StepCountSensor", "unregister step not today " + System.currentTimeMillis());
                dayStepInfo.setFirstDayTime(this.f135921e);
                dayStepInfo.setFirstDayCount(this.f135922f);
                dayStepInfo.setStepCount(0);
                dayStepInfo.setErrCount(0);
            }
            dayStepInfo.setLastSensorCount(this.f135922f);
            dayStepInfo.setCurrentTime(System.currentTimeMillis());
            C57744a.m224104a().putJSONObject("key_step_count_day", dayStepInfo);
        }
    }

    /* renamed from: a */
    public long mo187774a(long j) {
        return (j / 1000000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    public C54990a(Context context) {
        if (context != null) {
            this.f135918b = (SensorManager) context.getSystemService("sensor");
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.stepcount.p2713b.C54990a.RunnableC549922 */

                public void run() {
                    if (C54990a.this.f135918b != null && C54990a.this.f135917a == null) {
                        C54990a aVar = C54990a.this;
                        aVar.f135917a = aVar.f135918b.getDefaultSensor(19);
                        if (C54990a.this.f135917a != null) {
                            try {
                                C54990a.this.f135918b.registerListener(C54990a.this.f135923g, C54990a.this.f135917a, 3);
                            } catch (IllegalStateException e) {
                                Log.m165384e("StepCountSensor", " register listener fail,", e);
                            }
                        }
                    }
                }
            });
        }
    }
}
