package com.lynx.tasm.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import android.util.JsonReader;
import android.util.Log;
import android.widget.Toast;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import me.ele.lancet.base.annotations.Skip;

public class TraceController {

    /* renamed from: a */
    public boolean f65874a;

    /* renamed from: b */
    private Context f65875b;

    /* renamed from: c */
    private List<AbstractC26610a> f65876c;

    /* renamed from: d */
    private C26611b f65877d;

    /* renamed from: e */
    private long f65878e;

    /* renamed from: com.lynx.tasm.base.TraceController$a */
    public interface AbstractC26610a {
        /* renamed from: a */
        void mo94501a(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.base.TraceController$c */
    public static class C26612c {

        /* renamed from: a */
        public static final TraceController f65881a = new TraceController();
    }

    private native long nativeCreateTraceController();

    private native void nativeRecordClockSyncMarker(long j, String str);

    private native void nativeStartTracing(long j, String str, String str2);

    private native void nativeStopTracing(long j);

    /* renamed from: a */
    public static TraceController m96434a() {
        return C26612c.f65881a;
    }

    private TraceController() {
        this.f65876c = new ArrayList();
        this.f65874a = false;
        this.f65878e = 0;
    }

    /* renamed from: b */
    public void mo94496b() {
        File file = new File("/data/local/tmp/trace-config.json");
        if (file.exists()) {
            m96435a(file);
        }
    }

    /* renamed from: c */
    public void mo94497c() {
        long j = this.f65878e;
        if (j != 0 && this.f65874a) {
            this.f65874a = false;
            nativeStopTracing(j);
        }
    }

    /* renamed from: d */
    public String mo94498d() {
        Environment.getExternalStorageState();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        File externalFilesDir = this.f65875b.getExternalFilesDir(null);
        return new File(externalFilesDir, "lynx-profile-trace-" + simpleDateFormat.format(new Date())).getPath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.base.TraceController$b */
    public class C26611b extends BroadcastReceiver {
        C26611b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().endsWith("LYNX_TRACE_START")) {
                if (TraceController.this.f65874a) {
                    Toast.makeText(context, "Trace already started, please stop it first", 0).show();
                    return;
                }
                TraceController.this.f65874a = true;
                intent.getStringExtra("categories");
                String stringExtra = intent.getStringExtra("file");
                if (stringExtra == null) {
                    stringExtra = TraceController.this.mo94498d();
                }
                TraceController.this.mo94495a(stringExtra, "");
                String str = "Trace started at: " + stringExtra;
                Toast.makeText(context, str, 0).show();
                Log.i("Lynx startup trace", str);
            } else if (intent.getAction().endsWith("LYNX_TRACE_STOP") && TraceController.this.f65874a) {
                TraceController.this.mo94497c();
                TraceController.this.f65874a = false;
                Toast.makeText(context, "Trace stopped", 0).show();
            }
        }
    }

    public void onTracingComplete(String str) {
        for (AbstractC26610a aVar : this.f65876c) {
            aVar.mo94501a(str);
        }
        this.f65876c.clear();
    }

    /* access modifiers changed from: private */
    public static class TraceIntentFilter extends IntentFilter {
        public TraceIntentFilter(Context context) {
            addAction(context.getPackageName() + "." + "LYNX_TRACE_START");
            addAction(context.getPackageName() + "." + "LYNX_TRACE_STOP");
        }
    }

    /* renamed from: b */
    private String m96436b(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                inputStreamReader.close();
                return sb.toString().replaceAll("\\\t", "");
            }
        }
    }

    /* renamed from: a */
    public void mo94494a(Context context) {
        this.f65875b = context;
        C26611b bVar = new C26611b();
        this.f65877d = bVar;
        m96433a(this.f65875b, bVar, new TraceIntentFilter(this.f65875b));
    }

    /* renamed from: a */
    private void m96435a(File file) {
        try {
            if (!this.f65874a) {
                this.f65874a = true;
                int i = 10;
                JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file)));
                jsonReader.beginObject();
                String str = "";
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("startup_duration")) {
                        i = jsonReader.nextInt();
                    } else if (nextName.equals("result_file")) {
                        str = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                if (str == null || str == "") {
                    str = mo94498d();
                }
                Log.i("Lynx startup trace", "Starting tracing (" + i + " seconds)");
                mo94495a(str, m96436b(file));
                if (i >= 0) {
                    new Timer().schedule(new TimerTask() {
                        /* class com.lynx.tasm.base.TraceController.C266091 */

                        public void run() {
                            if (TraceController.this.f65874a) {
                                TraceController.this.mo94497c();
                                TraceController.this.f65874a = false;
                            }
                            Log.i("Lynx startup trace", "Tracing completed.");
                        }
                    }, (long) (i * 1000));
                }
            }
        } catch (Exception e) {
            Log.e("Lynx startup trace", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo94495a(String str, String str2) {
        if (this.f65878e == 0) {
            this.f65878e = nativeCreateTraceController();
        }
        nativeStartTracing(this.f65878e, str, str2);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m96433a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
