package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.huawei.updatesdk.p1046b.p1055f.C23891b;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.updatesdk.service.otaupdate.c */
public class C23927c {

    /* renamed from: a */
    private static String f59195a;

    /* renamed from: com.huawei.updatesdk.service.otaupdate.c$a */
    public interface AbstractC23928a {
        /* renamed from: a */
        void mo85840a(Boolean bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.service.otaupdate.c$b */
    public static class AsyncTaskC23929b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        AbstractC23928a f59196a;

        public AsyncTaskC23929b(AbstractC23928a aVar) {
            this.f59196a = aVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
            if (r1 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
            if (0 == 0) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
            com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a.m87118b("AutoUpdateUtil", "cursor Execption");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void... r12) {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.service.otaupdate.C23927c.AsyncTaskC23929b.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            AbstractC23928a aVar = this.f59196a;
            if (aVar != null) {
                aVar.mo85840a(bool);
            }
        }
    }

    /* renamed from: a */
    public void mo85859a(Context context, String str, AbstractC23928a aVar) {
        if (!C23891b.m87366e(context, str) || !C23936h.m87510g().mo85883d()) {
            aVar.mo85840a(false);
            return;
        }
        AsyncTaskC23929b bVar = new AsyncTaskC23929b(aVar);
        bVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
        try {
            f59195a = String.format(Locale.ROOT, "content://%s.commondata/item/4", str);
            bVar.get(500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            bVar.cancel(true);
            Log.e("AutoUpdateUtil", "init AutoUpdateInfo error: " + e.toString());
            aVar.mo85840a(false);
        }
    }
}
