package com.ss.android.vesdk;

import android.util.Log;
import com.bef.effectsdk.C2078a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vesdk.runtime.TEConfigCenter;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VEConfigCenter {

    /* renamed from: a */
    private static volatile VEConfigCenter f161098a;

    /* renamed from: b */
    private final Map<String, C63827a> f161099b = new HashMap();

    public enum ABType {
        FOREFFECT,
        FORCAMERA
    }

    public enum ConfigType {
        CONFIG_TYPE_AB,
        CONFIG_TYPE_SETTINGS,
        CONFIG_TYPE_DEFAULT
    }

    public enum DataType {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING
    }

    /* renamed from: com.ss.android.vesdk.VEConfigCenter$a */
    public static class C63827a {

        /* renamed from: a */
        public DataType f161101a;

        /* renamed from: b */
        public Object f161102b;

        /* renamed from: c */
        public ConfigType f161103c;

        /* renamed from: d */
        public String f161104d;

        /* renamed from: e */
        public ABType f161105e;

        /* renamed from: f */
        private AtomicBoolean f161106f = new AtomicBoolean(false);

        /* renamed from: a */
        public <T> T mo220637a() {
            return (T) this.f161102b;
        }

        /* renamed from: b */
        public DataType mo220639b() {
            return this.f161101a;
        }

        /* renamed from: c */
        public ConfigType mo220640c() {
            return this.f161103c;
        }

        /* renamed from: d */
        public ABType mo220641d() {
            return this.f161105e;
        }

        public String toString() {
            Object obj = this.f161102b;
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }

        /* renamed from: a */
        public void mo220638a(ABType aBType) {
            this.f161105e = aBType;
        }

        /* renamed from: a */
        public C63827a mo220636a(Object obj) {
            if (this.f161106f.get()) {
                Log.w("VEConfigCenter", "Can not update this value " + toString() + " Desc: " + this.f161104d);
                return this;
            }
            this.f161102b = obj;
            return this;
        }

        public C63827a(DataType dataType, Object obj, ConfigType configType, String str) {
            this.f161102b = obj;
            this.f161101a = dataType;
            this.f161103c = configType;
            this.f161104d = str;
        }
    }

    private VEConfigCenter() {
        Log.i("VEConfigCenter", "Init config center");
        m250618c();
        Log.i("VEConfigCenter", "Init config center done");
    }

    /* renamed from: a */
    public static VEConfigCenter m250617a() {
        if (f161098a == null) {
            synchronized (VEConfigCenter.class) {
                if (f161098a == null) {
                    f161098a = new VEConfigCenter();
                }
            }
        }
        return f161098a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.VEConfigCenter$1 */
    public static /* synthetic */ class C638261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f161100a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vesdk.VEConfigCenter$DataType[] r0 = com.ss.android.vesdk.VEConfigCenter.DataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vesdk.VEConfigCenter.C638261.f161100a = r0
                com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vesdk.VEConfigCenter.C638261.f161100a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.INTEGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vesdk.VEConfigCenter.C638261.f161100a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vesdk.VEConfigCenter.C638261.f161100a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vesdk.VEConfigCenter.C638261.f161100a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vesdk.VEConfigCenter$DataType r1 = com.ss.android.vesdk.VEConfigCenter.DataType.STRING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEConfigCenter.C638261.<clinit>():void");
        }
    }

    /* renamed from: b */
    public int mo220633b() {
        Log.i("VEConfigCenter", "syncConfigToNative...");
        for (Map.Entry<String, C63827a> entry : this.f161099b.entrySet()) {
            if (entry.getValue().f161105e == ABType.FOREFFECT) {
                m250619c(entry.getKey(), entry.getValue());
            } else if (entry.getValue().f161105e != ABType.FORCAMERA) {
                TEConfigCenter.m251373a(entry.getKey(), entry.getValue());
            }
        }
        return 0;
    }

    /* renamed from: d */
    private void m250620d() {
        String a = C2078a.m9044a(new String[]{"ve_record", "ve_enigma", "ve_edit", "ve_mv", "ve_detector", "ve_image"}, true);
        Log.i("VEConfigCenter", "EffectABConfig.requestABInfoWithLicenseArray: " + a);
        try {
            JSONArray jSONArray = new JSONArray(a);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                C63827a aVar = null;
                if (i2 == 0) {
                    aVar = new C63827a(DataType.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean("defaultVal")), ConfigType.CONFIG_TYPE_AB, string);
                } else if (i2 == 1) {
                    aVar = new C63827a(DataType.INTEGER, Integer.valueOf(jSONObject.getInt("defaultVal")), ConfigType.CONFIG_TYPE_AB, string);
                } else if (i2 == 2) {
                    aVar = new C63827a(DataType.FLOAT, Float.valueOf((float) jSONObject.getDouble("defaultVal")), ConfigType.CONFIG_TYPE_AB, string);
                } else if (i2 == 3) {
                    aVar = new C63827a(DataType.STRING, jSONObject.getString("defaultVal"), ConfigType.CONFIG_TYPE_AB, string);
                }
                if (aVar != null) {
                    aVar.mo220638a(ABType.FOREFFECT);
                    mo220630a(jSONObject.getString("key"), aVar);
                }
            }
        } catch (JSONException e) {
            Log.e("VEConfigCenter", "Parse effect config json error!");
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m250621e() {
        try {
            JSONArray jSONArray = new JSONArray(C64044o.m251363a());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("dataType");
                String string = jSONObject.getString("description");
                C63827a aVar = null;
                if (i2 == 0) {
                    aVar = new C63827a(DataType.BOOLEAN, Boolean.valueOf(jSONObject.getBoolean("defaultVal")), ConfigType.CONFIG_TYPE_AB, string);
                } else if (i2 == 1) {
                    aVar = new C63827a(DataType.INTEGER, Integer.valueOf(jSONObject.getInt("defaultVal")), ConfigType.CONFIG_TYPE_AB, string);
                } else if (i2 == 2) {
                    aVar = new C63827a(DataType.FLOAT, Float.valueOf((float) jSONObject.getDouble("defaultVal")), ConfigType.CONFIG_TYPE_AB, string);
                } else if (i2 == 3) {
                    aVar = new C63827a(DataType.STRING, jSONObject.getString("defaultVal"), ConfigType.CONFIG_TYPE_AB, string);
                }
                if (aVar != null) {
                    aVar.mo220638a(ABType.FORCAMERA);
                    mo220630a(jSONObject.getString("key"), aVar);
                }
            }
        } catch (JSONException e) {
            Log.e("VEConfigCenter", "Parse camera config json error!");
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m250618c() {
        mo220630a("wide_camera_id", new C63827a(DataType.STRING, "-1", ConfigType.CONFIG_TYPE_AB, "wide camera device id"));
        mo220630a("mv_use_amazing_engine", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable using amazing engine for mv"));
        mo220630a("vesdk_seek_predict_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable seek opt for predict seek accelerate speed"));
        mo220630a("create_by_codec_name", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "use mediaCodec.createByCodecName"));
        mo220630a("enable_android_hdr2sdr_support", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable android hdr2sdr support"));
        mo220630a("enable_android_hdr_preview_support", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable android hdr preview support"));
        mo220630a("crossplat_glbase_fbo", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable crossplat glbase fbo"));
        mo220630a("vboost_compile", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable vboost compile"));
        mo220630a("use_open_gl_three", new C63827a(DataType.INTEGER, 1, ConfigType.CONFIG_TYPE_AB, "use GLES3.0"));
        mo220630a("vesdk_max_cache_count", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "config max cache count for input decode frame"));
        mo220630a("gpu_syncobject_type", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_DEFAULT, "GPU SyncObject type: 0-glFence; 1-eglFence; 2-glFinish"));
        mo220630a("use_byte264", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "use libbyte264"));
        mo220630a("aeabtest_v2api", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "use new audiosdk api"));
        mo220630a("color_space", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "color space"));
        mo220630a("ve_color_space_for_2020", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "ve color space for 2020"));
        mo220630a("vesdk_audiomix_replace", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "vesdk_audiomix_replace"));
        mo220630a("enable_record_mpeg4", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable record mpeg4"));
        mo220630a("ve_record_codec_type", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "record codec type"));
        mo220630a("optimize srv_um crash", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "optimize srv um crash"));
        mo220630a("vesdk_audio_hw_encoder", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "audio hw encoder"));
        DataType dataType = DataType.FLOAT;
        Float valueOf = Float.valueOf(-1.0f);
        mo220630a("ve_recorder_fps_downgrade", new C63827a(dataType, valueOf, ConfigType.CONFIG_TYPE_AB, "Downgrading recorder fps."));
        mo220630a("video_duration_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "video_duration_opt"));
        mo220630a("ve_enable_face_detection", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable_face_detection"));
        mo220630a("enable_render_lib", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "vesdk enable render lib"));
        mo220630a("vesdk_use_agfxcontext", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "vesdk enable agfx ctx"));
        mo220630a("vesdk_enable_reader_refactor", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "vesdk enable reader refactor"));
        mo220630a("ve_enable_bingo_refactor", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "dmt bingo refactor"));
        mo220630a("use_titan_recorder_engine", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "use titan recorder engine"));
        mo220630a("enable_duet_gl_finish", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable duet glFinish"));
        mo220630a("ve_enable_preload_effect_res", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable preload effect res"));
        mo220630a("ve_disable_effect_internal_setting", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "disable effect internal setting"));
        mo220630a("ve_enable_titan_auto_test_log", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable titan auto test log"));
        mo220630a("ve_opt_first_frame", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "opt first frame"));
        mo220630a("ve_opt_first_frame_bypass_effect_frame_cnt", new C63827a(DataType.INTEGER, 3, ConfigType.CONFIG_TYPE_AB, "opt first frame bypass effect frame cnt"));
        mo220630a("ve_camera_frame_update_independent_thread", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "camera frame update independent thread"));
        mo220630a("ve_set_camera_two_output", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "ve set camera two output"));
        mo220630a("ve_camera_output_and_update_strategy", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "ve camera output and update strategy"));
        mo220630a("ve_enable_three_buffer", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable 3 buffer"));
        mo220630a("ve_async_detection", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "effect async detection"));
        mo220630a("ve_retry_count", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "camera open retry"));
        mo220630a("ve_retry_start_preview_count", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "start preview retry count"));
        mo220630a("ve_enable_stop_preview_optimize", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "stop preview async optimize"));
        mo220630a("ve_enable_audio_gbu_refactor", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "Enable editor/compiler audio gbu refactor"));
        mo220630a("ve_enable_compile_buffer_hw_encode", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "Android Hw encode compile "));
        mo220630a("ve_enable_file_info_cache", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable file info cache"));
        mo220630a("ve_enable_render_encode_resolution_align4", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "render and encode resolution can be align4"));
        mo220630a("ve_small_window_double_thread_decode", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "ve small window double thread decode"));
        mo220630a("ve_camera_enable_previewing_fallback", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_SETTINGS, "camera enable previewing fallback"));
        mo220630a("ve_enable_background_strategy", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_SETTINGS, "enable background strategy"));
        mo220630a("ve_enable_pin_refactor", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "dmt take pin refactor"));
        mo220630a("ve_enable_engine_monitor_report", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable engine monitor report"));
        mo220630a("ve_enable_hwdecode_dequeue_inputbuffer_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "MediaCodec dequeue video inputBuffer opt"));
        mo220630a("ve_async_set_sensor_data", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "Send sensor data to effect asynchronously."));
        mo220630a("remux_video_res", new C63827a(DataType.INTEGER, 921600, ConfigType.CONFIG_TYPE_AB, "remux video res"));
        mo220630a("ve_compile_report", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "compile report state"));
        mo220630a("ve_enable_compile_timeout_diagnosis", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "compile timeout diagnosis"));
        mo220630a("ve_enable_refactor_audio", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable audio refactor"));
        mo220630a("privacy_error_action", new C63827a(DataType.INTEGER, 2, ConfigType.CONFIG_TYPE_AB, "privacy_error_action"));
        mo220630a("privacy_error_check_interval", new C63827a(DataType.INTEGER, 1000, ConfigType.CONFIG_TYPE_AB, "privacy_error_check_interval"));
        mo220630a("privacy_error_check_threshold", new C63827a(DataType.INTEGER, 3000, ConfigType.CONFIG_TYPE_AB, "privacy_error_check_threshold"));
        mo220630a("ve_enable_oes_texture_shot_screen", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable 2d texture shot screen"));
        mo220630a("ve_enable_hwdecode_playback_dropframe_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "hwdecode playback dropframe opt"));
        mo220630a("ve_editor_firstframe_delay", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "ve_editor_firstframe_delay"));
        mo220630a("ve_record_editor_firstframe_delay", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "ve_record_editor_firstframe_delay"));
        mo220630a("ve_enable_encode_bin_gl_context_reuse", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "enable encode bin gl context reuse"));
        mo220630a("ve_enable_editor_compile_gl_context_reuse", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable editor compile gl context reuse"));
        mo220630a("ve_enable_upload_virtual_mem_size", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable upload virtual mem size"));
        mo220630a("ve_enable_mpeg24vp89_hwdecoder2", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable mpeg24 vp89 hwdecoder"));
        mo220630a("ve_enable_glflush_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "glFlush usage opt"));
        mo220630a("vesdk_high_speed_change_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "vesdk_high_speed_change_opt"));
        mo220630a("ve_enable_p3_re_encode", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "ve_enable_p3_re_encode"));
        mo220630a("ve_enable_imageAlgorithmReuseAndOptForAmazing", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "imageAlgorithm Reuse and optForAmazing"));
        mo220630a("byteVC1_10bit_hardware_encoder_timeout", new C63827a(DataType.INTEGER, Integer.valueOf((int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT), ConfigType.CONFIG_TYPE_AB, "byteVC1 10bit hardware encoder timeout params"));
        mo220630a("ve_enable_memory_mode", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable low memory mode"));
        mo220630a("ve_low_memory_threshold", new C63827a(DataType.INTEGER, Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR), ConfigType.CONFIG_TYPE_AB, "low memory mode threshold"));
        mo220630a("ve_compile_codec_type", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "compile support bytevc1 encode"));
        mo220630a("ve_compile_hw_bytevc1_max_pixel_count", new C63827a(DataType.INTEGER, 8294400, ConfigType.CONFIG_TYPE_AB, "compile bytevc1 max pixel count"));
        mo220630a("ve_enable_parallelDecodeMatting", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable parallel decode and matting"));
        mo220630a("ve_enable_sys_karaoke", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_SETTINGS, "enable sys karaoke"));
        mo220630a("ve_enable_common_earback", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_SETTINGS, "enable common earback"));
        mo220630a("ve_enable_aaduio", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_SETTINGS, "enable aaudio"));
        mo220630a("ve_enable_pip_resolution_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable pip resolution opt"));
        mo220630a("ve_hardware_encode_fallback", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "config for hardware encode fallback to soft, DO NOT set NON-ZERO ON LINE"));
        mo220630a("ve_asf_amount", new C63827a(DataType.FLOAT, valueOf, ConfigType.CONFIG_TYPE_AB, "ve_asf_amount"));
        mo220630a("ve_asf_over_ratio", new C63827a(DataType.FLOAT, valueOf, ConfigType.CONFIG_TYPE_AB, "ve_asf_over_ratio"));
        mo220630a("ve_asf_gpu_power_level", new C63827a(DataType.INTEGER, 4, ConfigType.CONFIG_TYPE_AB, "ve_asf_gpu_power_level"));
        mo220630a("ve_asf_init_delay_frame_cnt", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "ve_asf_init_delay_frame_cnt"));
        mo220630a("ve_asf_process_delay_frame_cnt", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "ve_asf_process_delay_frame_cnt"));
        DataType dataType2 = DataType.FLOAT;
        Float valueOf2 = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        mo220630a("ve_duet_audio_delay_opt", new C63827a(dataType2, valueOf2, ConfigType.CONFIG_TYPE_AB, "Duet audio delay optimize. 0 is no opt."));
        mo220630a("ve_duet_audio_delay_mt_opt", new C63827a(DataType.FLOAT, valueOf2, ConfigType.CONFIG_TYPE_AB, "Duet audio delay mt optimize. 0 is no opt."));
        mo220630a("ve_enable_optimize_audio_delay", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "opt audio delay when stop record"));
        mo220630a("ve_enable_vboost", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "opt performance when open/close camera and stop record"));
        mo220630a("ve_vboost_timeout", new C63827a(DataType.INTEGER, Integer.valueOf((int) ParticipantRepo.f117150c), ConfigType.CONFIG_TYPE_SETTINGS, "VBoost timeout"));
        mo220630a("ve_enable_effect_render_without_glreadpixels", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable effect render without glreadpixels"));
        mo220630a("ve_smart_trans_detect", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "smart trans detect for compile"));
        mo220630a("ve_force_edit_bytevc1_swdecode", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "edit module force sw decode"));
        mo220630a("ve_enable_engine_resource_opt", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "enable engine resouce can reuse between graphs"));
        mo220630a("ve_enable_decoder_schedule_opt_hw", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "enable decoder schedule for hw"));
        mo220630a("ve_force_compile_bytevc1_swdecode", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "compile module force sw decode"));
        mo220630a("ve_hwdecode_support_rt_and_or", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "hw decode support real-time and operating-rate"));
        mo220630a("ve_camera_enable_preview_fake_frame", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "ve camera enable preview fake frame"));
        mo220630a("ve_camera_enable_preview_fake_frame_gaussian_blur", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "ve camera enable preview fake frame gaussian_blur"));
        mo220630a("ve_titan_off_screen_before_stop", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "Titan switch off screen before stop preview"));
        mo220630a("ve_mediacodec_resource_reasonable_distribute", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "mediacodec resource reasonable distribute"));
        mo220630a("ve_aec_sample_rate_opt", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "aec sample rate opt"));
        mo220630a("vesdk_ffmpeg_enable_video_timestamp_monotonic", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable ffmpeg video timestamp monotonic"));
        mo220630a("ve_titan_release_block_time", new C63827a(DataType.INTEGER, 0, ConfigType.CONFIG_TYPE_AB, "Titan release block time"));
        mo220630a("ve_shotscreen_delay_max_frame", new C63827a(DataType.INTEGER, 20, ConfigType.CONFIG_TYPE_SETTINGS, "shotscreen delay max frame"));
        mo220630a("ve_shotscreen_delay_threshold", new C63827a(DataType.INTEGER, 10, ConfigType.CONFIG_TYPE_SETTINGS, "shotscreen delay light frame num threshold"));
        mo220630a("ve_enable_audio_reader_preload_reuse", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "support audioReader preload and reuse"));
        mo220630a("ve_enable_cache_timestamp", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_SETTINGS, "enable cache timestamp"));
        mo220630a("ve_image_enable_optimize_quality", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "VEImage enable optimize quality"));
        mo220630a("ve_titan_follow_shot_independent_thread", new C63827a(DataType.BOOLEAN, true, ConfigType.CONFIG_TYPE_AB, "follow shot independent thread."));
        mo220630a("ve_enable_seek_preload_drop_frame", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "seek and preload drop frame"));
        mo220630a("ve_enable_amazing_feature_handle_cache", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "amazing feature handle cache"));
        mo220630a("ve_enable_image_preload", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "enable image preload when display"));
        mo220630a("ve_compile_hide_ve_metadata", new C63827a(DataType.BOOLEAN, false, ConfigType.CONFIG_TYPE_AB, "hide ve metadata"));
        m250620d();
        m250621e();
    }

    /* renamed from: a */
    public C63827a mo220631a(String str) {
        return this.f161099b.get(str);
    }

    /* renamed from: a */
    public int mo220630a(String str, C63827a aVar) {
        if (this.f161099b.containsKey(str)) {
            Log.w("VEConfigCenter", "ConfigCenter has already contained " + str);
            return -100;
        }
        mo220634b(str, aVar);
        return 0;
    }

    /* renamed from: b */
    public Object mo220635b(String str, Object obj) {
        C63827a aVar = this.f161099b.get(str);
        if (aVar == null) {
            Log.w("VEConfigCenter", "Doesn't contain the key: " + str);
            return null;
        }
        Object obj2 = aVar.f161102b;
        aVar.mo220636a(obj);
        return obj2;
    }

    /* renamed from: c */
    private void m250619c(String str, C63827a aVar) {
        if (aVar.mo220641d() == ABType.FOREFFECT) {
            int i = C638261.f161100a[aVar.mo220639b().ordinal()];
            if (i == 1) {
                VEEffectConfig.setABConfigValue(str, aVar.mo220637a(), 0);
            } else if (i == 2 || i == 3) {
                VEEffectConfig.setABConfigValue(str, aVar.mo220637a(), 1);
            } else if (i == 4) {
                VEEffectConfig.setABConfigValue(str, aVar.mo220637a(), 2);
            } else if (i == 5) {
                VEEffectConfig.setABConfigValue(str, aVar.mo220637a(), 3);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo220632a(String str, T t) {
        C63827a aVar = this.f161099b.get(str);
        return (aVar == null || aVar.mo220637a() == null) ? t : (T) aVar.mo220637a();
    }

    /* renamed from: b */
    public C63827a mo220634b(String str, C63827a aVar) {
        C63827a put = this.f161099b.put(str, aVar);
        if (put == null) {
            Log.d("VEConfigCenter", str + ": Previous ValuePkt is null");
        } else {
            Log.i("VEConfigCenter", str + ": " + put + " ==> " + aVar);
        }
        return put;
    }
}
