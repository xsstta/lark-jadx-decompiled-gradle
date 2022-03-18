package com.ss.ttvideoengine;

import android.text.TextUtils;
import com.bytedance.vcloud.networkpredictor.AbstractC20887b;
import com.bytedance.vcloud.networkpredictor.C20901n;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultCollection;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class TTTestSpeedListener implements TestSpeedListener {
    private WeakReference<TTVideoEngine> engineWeakReference;
    private long lastSampleTimestamp;
    private AbstractC20887b mAbrPredictor;
    private AbstractC20887b mPredictor;

    private Map<String, Integer> _getCurrentPlaybackStreamId() {
        IVideoModel iVideoModel;
        List<VideoInfo> videoInfoList;
        TTVideoEngine tTVideoEngine = this.engineWeakReference.get();
        if (tTVideoEngine == null || (iVideoModel = tTVideoEngine.getIVideoModel()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (iVideoModel.hasData() && (videoInfoList = iVideoModel.getVideoInfoList()) != null && videoInfoList.size() > 0) {
            for (VideoInfo videoInfo : videoInfoList) {
                hashMap.put(videoInfo.getValueStr(15), Integer.valueOf(videoInfo.getMediatype()));
            }
        }
        return hashMap;
    }

    private String _getProtocolFromJson(String str) {
        if (str == null || str.length() <= 0) {
            return "unknown";
        }
        try {
            return new JSONObject(str).optString("protocol");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private long _getTcpInfoRtt(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            try {
                return Long.parseLong(new JSONObject(str).optJSONObject("tcpInfo").optString("tcpRtt"));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void _streamInfoMapAppendOtherInfo(Map<String, Integer> map) {
        TTVideoEngine tTVideoEngine = this.engineWeakReference.get();
        if (tTVideoEngine != null && map != null) {
            long longOption = tTVideoEngine.getLongOption(62);
            long longOption2 = tTVideoEngine.getLongOption(61);
            map.put("playerVideoBufLen", Integer.valueOf((int) longOption));
            map.put("playerAudioBufLen", Integer.valueOf((int) longOption2));
            map.put("playerVideoMaxBufLen", Integer.valueOf(tTVideoEngine.getIntOption(0) * 1000));
            map.put("playerAudioMaxBufLen", Integer.valueOf(tTVideoEngine.getIntOption(0) * 1000));
        }
    }

    private long _getIntInfoFromtcpInfoJson(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            try {
                return Long.parseLong(new JSONObject(str).optJSONObject("tcpInfo").optString(str2));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.ttvideoengine.TestSpeedListener
    public void onNotify(int i, String str) {
        long j;
        TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "speed notify, what:%d, info:%s", Integer.valueOf(i), str));
        AbstractC20887b bVar = this.mAbrPredictor;
        TTVideoEngine tTVideoEngine = this.engineWeakReference.get();
        if (bVar != null && tTVideoEngine != null && TTVideoEngine.getSpeedPredictorInputType() == 2 && i == 2) {
            Map<String, Integer> _getCurrentPlaybackStreamId = _getCurrentPlaybackStreamId();
            _streamInfoMapAppendOtherInfo(_getCurrentPlaybackStreamId);
            bVar.mo70587a(str, _getCurrentPlaybackStreamId);
            if (str != null) {
                TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[ABR]: speedRecordsJson:%s", str));
            }
            tTVideoEngine.mSpeedAverageCount++;
            Map<String, String> b = bVar.mo70590b(0);
            float a = bVar.mo70582a(0);
            Map<String, String> b2 = bVar.mo70590b(1);
            float a2 = bVar.mo70582a(1);
            StringBuffer stringBuffer = new StringBuffer(" ");
            StringBuffer stringBuffer2 = new StringBuffer(" ");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            float _getDownSpeed = _getDownSpeed(b, stringBuffer, hashMap);
            float _getDownSpeed2 = _getDownSpeed(b2, stringBuffer2, hashMap2);
            if (_getDownSpeed > BitmapDescriptorFactory.HUE_RED && tTVideoEngine.mSpeedAverageCount > 0) {
                tTVideoEngine.mAverageDownloadSpeed += (_getDownSpeed - tTVideoEngine.mAverageDownloadSpeed) / ((float) tTVideoEngine.mSpeedAverageCount);
            }
            if (a > BitmapDescriptorFactory.HUE_RED && tTVideoEngine.mSpeedAverageCount > 0) {
                tTVideoEngine.mAveragePredictSpeed += (a - tTVideoEngine.mAveragePredictSpeed) / ((float) tTVideoEngine.mSpeedAverageCount);
            }
            SpeedPredictorResultCollection f = bVar.mo70595f();
            SpeedPredictorResultCollection e = bVar.mo70594e();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.lastSampleTimestamp;
            long j3 = currentTimeMillis - j2;
            if (j2 == 0) {
                j = 0;
            } else {
                j = j3;
            }
            this.lastSampleTimestamp = currentTimeMillis;
            if (tTVideoEngine.getIntOption(525) == 0) {
                TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[SPEEDPREDICT] use sing predictor data outing", new Object[0]));
                tTVideoEngine.getLogger().updateNetworkSpeedPredictorSampleValue(stringBuffer.toString(), stringBuffer2.toString(), _getDownSpeed, _getDownSpeed2, a, a2, j, hashMap, hashMap2);
                tTVideoEngine.getLogger().setIsMultiDimensionsOut(0);
            } else if (tTVideoEngine.getIntOption(525) == 1) {
                TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[SPEEDPREDICT] use multi data outing", new Object[0]));
                if (!(e == null || e.mo70600a() == null || e.mo70600a().isEmpty())) {
                    tTVideoEngine.getLogger().updateNetworkSpeedPredictorSampleMutiValue(f, e, j);
                }
                tTVideoEngine.getLogger().setIsMultiDimensionsOut(1);
            }
            tTVideoEngine.getLogger().setIsMultiDimensionsInput(2);
            tTVideoEngine.getLogger().updateMultiNetworkSpeed(str);
        }
    }

    TTTestSpeedListener(TTVideoEngine tTVideoEngine, AbstractC20887b bVar, AbstractC20887b bVar2) {
        this.engineWeakReference = new WeakReference<>(tTVideoEngine);
        this.mPredictor = bVar;
        this.mAbrPredictor = bVar2;
    }

    @Override // com.ss.ttvideoengine.TestSpeedListener
    public void onNotifyGlobalSpeed(long j, long j2, int i) {
        TTVideoEngine tTVideoEngine = this.engineWeakReference.get();
        if (tTVideoEngine != null) {
            tTVideoEngine.getLogger().updateGlobalNetworkSpeed(j, j2, i);
        }
    }

    private float _getDownSpeed(Map<String, String> map, StringBuffer stringBuffer, Map<String, String> map2) {
        float f;
        if (!(map == null || map.size() <= 1 || map.get("download_speed") == null)) {
            try {
                f = Float.parseFloat(map.get("download_speed"));
            } catch (NumberFormatException e) {
                TTVideoEngineLog.m256503e("TTVideoEngine", String.format(Locale.US, "[SPEEDPREDICT] exception %s", e.toString()));
                f = BitmapDescriptorFactory.HUE_RED;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!entry.getKey().equals("stream_id") && !entry.getKey().equals("download_speed")) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            if (!map.get("stream_id").equals("-1")) {
                stringBuffer.delete(0, stringBuffer.capacity()).append(map.get("stream_id"));
                return f;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.ss.ttvideoengine.TestSpeedListener
    public void onNotify(int i, long j, long j2, String str, String str2, String str3) {
        int i2;
        TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "speed notify, what:%d, code:%d, para:%d, inf:%s, extraInfoJsonStr:%s", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), str, str3));
        AbstractC20887b bVar = this.mAbrPredictor;
        TTVideoEngine tTVideoEngine = this.engineWeakReference.get();
        if (tTVideoEngine != null && bVar != null && i == 2) {
            C20901n nVar = new C20901n();
            nVar.mo70616a(str);
            nVar.mo70615a(j);
            nVar.mo70618b(j2);
            long _getTcpInfoRtt = _getTcpInfoRtt(str3);
            long _getIntInfoFromtcpInfoJson = _getIntInfoFromtcpInfoJson(str3, "tcpLastRecvDate");
            nVar.mo70621d(_getTcpInfoRtt);
            nVar.mo70622e(_getIntInfoFromtcpInfoJson);
            nVar.mo70619b(_getProtocolFromJson(str3));
            if (TextUtils.isEmpty(str2) || !str2.equals("audio")) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            nVar.mo70614a(i2 ^ 1);
            nVar.mo70620c(System.currentTimeMillis());
            if (nVar.mo70617b() != 0) {
                TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[ABR]: speedRecord:%s", new DecimalFormat("#.000000000").format(((double) nVar.mo70613a()) / ((double) nVar.mo70617b()))));
            }
            Map<String, Integer> _getCurrentPlaybackStreamId = _getCurrentPlaybackStreamId();
            _streamInfoMapAppendOtherInfo(_getCurrentPlaybackStreamId);
            bVar.mo70586a(nVar, _getCurrentPlaybackStreamId);
            tTVideoEngine.mSpeedAverageCount++;
            Map<String, String> b = bVar.mo70590b(0);
            float a = bVar.mo70582a(0);
            Map<String, String> b2 = bVar.mo70590b(1);
            float a2 = bVar.mo70582a(1);
            StringBuffer stringBuffer = new StringBuffer(" ");
            StringBuffer stringBuffer2 = new StringBuffer(" ");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            float _getDownSpeed = _getDownSpeed(b, stringBuffer, hashMap);
            float _getDownSpeed2 = _getDownSpeed(b2, stringBuffer2, hashMap2);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.lastSampleTimestamp;
            long j4 = currentTimeMillis - j3;
            if (j3 == 0) {
                j4 = 0;
            }
            this.lastSampleTimestamp = currentTimeMillis;
            if (_getDownSpeed > BitmapDescriptorFactory.HUE_RED && tTVideoEngine.mSpeedAverageCount > 0) {
                tTVideoEngine.mAverageDownloadSpeed += (_getDownSpeed - tTVideoEngine.mAverageDownloadSpeed) / ((float) tTVideoEngine.mSpeedAverageCount);
            }
            if (a > BitmapDescriptorFactory.HUE_RED && tTVideoEngine.mSpeedAverageCount > 0) {
                tTVideoEngine.mAveragePredictSpeed += (a - tTVideoEngine.mAveragePredictSpeed) / ((float) tTVideoEngine.mSpeedAverageCount);
            }
            tTVideoEngine.getLogger().updateNetworkSpeedPredictorSampleValue(stringBuffer.toString(), stringBuffer2.toString(), _getDownSpeed, _getDownSpeed2, a, a2, j4, hashMap, hashMap2);
            tTVideoEngine.getLogger().setIsMultiDimensionsInput(1);
            tTVideoEngine.getLogger().setIsMultiDimensionsOut(0);
        }
    }
}
