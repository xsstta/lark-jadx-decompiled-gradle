package com.tt.miniapp.feedback.screenrecord;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.feedback.screenrecord.e */
public class C66169e {

    /* renamed from: com.tt.miniapp.feedback.screenrecord.e$a */
    public interface AbstractC66170a {
        /* renamed from: a */
        void mo231252a(MediaCodecInfo[] mediaCodecInfoArr);
    }

    /* renamed from: a */
    private static void m259096a() {
        SparseArray<String> sparseArray;
        Field[] fields = MediaCodecInfo.CodecProfileLevel.class.getFields();
        for (Field field : fields) {
            if ((field.getModifiers() & 24) != 0) {
                String name = field.getName();
                if (name.startsWith("AVCProfile")) {
                    sparseArray = ContextSingletonInstance.getInstance().sAVCProfiles;
                } else if (name.startsWith("AVCLevel")) {
                    sparseArray = ContextSingletonInstance.getInstance().sAVCLevels;
                } else if (name.startsWith("AACObject")) {
                    sparseArray = ContextSingletonInstance.getInstance().sAACProfiles;
                }
                try {
                    sparseArray.put(field.getInt(null), name);
                } catch (IllegalAccessException e) {
                    AppBrandLogger.stacktrace(6, "tma_ScreenRecordUtils", e.getStackTrace());
                }
            }
        }
    }

    /* renamed from: com.tt.miniapp.feedback.screenrecord.e$b */
    static final class AsyncTaskC66171b extends AsyncTask<String, Void, MediaCodecInfo[]> {

        /* renamed from: a */
        private AbstractC66170a f167029a;

        AsyncTaskC66171b(AbstractC66170a aVar) {
            this.f167029a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(MediaCodecInfo[] mediaCodecInfoArr) {
            this.f167029a.mo231252a(mediaCodecInfoArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public MediaCodecInfo[] doInBackground(String... strArr) {
            return C66169e.m259098a(strArr[0]);
        }
    }

    /* renamed from: a */
    static MediaCodecInfo[] m259098a(String str) {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        ArrayList arrayList = new ArrayList();
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                try {
                    if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                        arrayList.add(mediaCodecInfo);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return (MediaCodecInfo[]) arrayList.toArray(new MediaCodecInfo[arrayList.size()]);
    }

    /* renamed from: a */
    public static String m259095a(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        String str;
        if (ContextSingletonInstance.getInstance().sAVCProfiles.size() == 0 || ContextSingletonInstance.getInstance().sAVCLevels.size() == 0) {
            m259096a();
        }
        int indexOfKey = ContextSingletonInstance.getInstance().sAVCProfiles.indexOfKey(codecProfileLevel.profile);
        String str2 = null;
        if (indexOfKey >= 0) {
            str = ContextSingletonInstance.getInstance().sAVCProfiles.valueAt(indexOfKey);
        } else {
            str = null;
        }
        int indexOfKey2 = ContextSingletonInstance.getInstance().sAVCLevels.indexOfKey(codecProfileLevel.level);
        if (indexOfKey2 >= 0) {
            str2 = ContextSingletonInstance.getInstance().sAVCLevels.valueAt(indexOfKey2);
        }
        if (str == null) {
            str = String.valueOf(codecProfileLevel.profile);
        }
        if (str2 == null) {
            str2 = String.valueOf(codecProfileLevel.level);
        }
        return str + '-' + str2;
    }

    /* renamed from: a */
    public static void m259097a(String str, AbstractC66170a aVar) {
        new AsyncTaskC66171b(aVar).execute(str);
    }
}
