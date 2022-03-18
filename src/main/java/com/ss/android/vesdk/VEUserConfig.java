package com.ss.android.vesdk;

import java.util.Collection;
import java.util.Map;

public class VEUserConfig {

    /* renamed from: a */
    private Map<ConfigID, C63909a<?>> f161395a;

    public enum ConfigID {
        ConfigID_UseImageAllocator("UseImageAllocator"),
        ConfigID_UseMultiEffectOpt("UseMultiEffectOpt"),
        ConfigID_PreLoadNextClip("PreLoadNextClip"),
        ConfigID_EnableHighSpeedChange("vesdk_high_speed_change_opt"),
        ConfigID_EnableEditorFpsLog("EnableEditorFpsLog"),
        ConfigID_EnableVideoOutputCallback("EnableVideoOutputCallback"),
        ConfigID_MaxAudioReaderCount("MaxAudioReaderCount"),
        ConfigID_MaxSoftwareVideoReaderCount("MaxSoftwareVideoReaderCount"),
        ConfigID_MaxSoftwareFreeReaderCount("MaxSoftwareFreeReaderCount"),
        ConfigID_MaxPreloadReaderCount("veabtest_crossplat_maxPreloadReaderCnt"),
        ConfigID_MaxHwReaderCount("MaxHwReaderCount"),
        ConfigID_MaxImageTextureBufferCount("MaxImageTextureBufferCount"),
        ConfigID_SetDropFramePara("SetDropFramePara"),
        ConfigID_DelayTimeThreshold("DelayTimeThreshold"),
        ConfigID_MaxDropFrameCount("MaxDropFrameCount"),
        ConfigID_MaxTexturePoolCount("MaxTexturePoolCount"),
        ConfigID_TexturePoolCleanCount("TexturePoolCleanCount"),
        ConfigID_UseMultiThreadPool("UseMultiThreadPool"),
        ConfigID_EnableFirstFrameOpt("EnableFirstFrameOpt"),
        ConfigID_MaxImageTextureBufferWidth("MaxImageTextureBufferWidth"),
        ConfigID_MaxImageTextureBufferHeight("MaxImageTextureBufferHeight"),
        ConfigID_MaxCacheFrameCount("vesdk_max_cache_count"),
        ConfigID_UseEffectTransiton("UseEffectTransiton"),
        ConfigID_UseRefaCanvasWrap("UseRefaCanvasWrap"),
        ConfigID_CacheGLContext("CacheGlContext"),
        ConfigID_EnbaleInfoStickerTrans("EnbaleInfoStickerTrans"),
        ConfigID_OpenSeekTimeOpt("OpenSeekTimeOpt"),
        ConfigID_UseGaussianOpt("UseGaussianOpt"),
        ConfigID_UseNewEngineEffectOpt("UseNewEngineEffectOpt"),
        ConfigID_CacheGlProgram("CacheGlProgram"),
        ConfigID_OutResolutionBase4("ve_enable_render_encode_resolution_align4"),
        ConfigID_EffectUseAmazingMV("EffectUseAmazingMV"),
        ConfigID_ForceDropFrameWithoutAudio("ForceDropFrameWithoutAudio"),
        ConfigID_UseAudioSDKApiV2("aeabtest_v2api"),
        ConfigID_SeekPredictOpt("vesdk_seek_predict_opt"),
        ConfigID_LowPhoneOpt("LowPhoneOpt"),
        ConfigID_CrossplatGLBaseFBO("crossplat_glbase_fbo"),
        ConfigID_EnableRenderlib("enable_render_lib"),
        ConfigID_EnableAGFXContext("EnableAGFXContext"),
        ConfigID_EnableAGFXMetal("vesdk_use_agfxmetal"),
        ConfigID_LoadImageOptimize("LoadImageOptimize"),
        ConfigID_GraphRefactor("s_bGraphRefactor"),
        ConfigID_EnableByte264("use_byte264"),
        ConfigID_ColorSpaceRepair("color_space"),
        ConfigID_ColorSpaceRepairFor2020("ve_color_space_for_2020"),
        ConfigID_NewAudioMixer("vesdk_audiomix_replace"),
        ConfigID_OptimizeSRVUM("optimize srv_um crash"),
        ConfigID_AudioHwEncoder("vesdk_audio_hw_encoder"),
        ConfigID_SetStickerResolutionWithHeight("SetStickerResolutionWithHeight"),
        ConfigID_EnableMultiThreadDecode("EnableMultiThreadDecode"),
        ConfigID_EnableAudioGBURefactor("ve_enable_audio_gbu_refactor"),
        ConfigID_EnableHWPlaybackDropFrame("ve_enable_hwdecode_playback_dropframe_opt"),
        ConfigID_EnableSeekAndPreloadOpt("EnableSeekAndPreloadOpt"),
        ConfigID_EnableHdrVsOptimization("veabtest_hdr_vs_optimization"),
        ConfigID_EnableApplHdrSupport("vesdk_enable_apple_hdr_support"),
        ConfigID_EnableFileInfoCache("ve_enable_file_info_cache"),
        ConfigID_PinRefactor("ve_enable_pin_refactor"),
        ConfigID_EnablePBO("EnablePBO"),
        ConfigID_EnableHdrToneMapping("EnableHdrToneMapping"),
        ConfigID_CreateDecoderByName("create_by_codec_name"),
        ConfigID_EnableDisplayP3ReEncode("ve_enable_p3_re_encode"),
        ConfigID_EnableDisplayP3Render("EnableDisplayP3Render"),
        ConfigID_EnableAudioDisplayCallBack("EnableAudioDisplayCallBack"),
        ConfigID_EnableTransitionKeyframe("EnableTransitionKeyframe"),
        ConfigID_EnableCrossplatInputCompile("EnableCrossplatInputCompile"),
        ConfigID_CompileReport("ve_compile_report"),
        ConfigID_EnableiOSEditFirstFrameOpt("veabtest_crossplatEditFirstFrameOptimize"),
        ConfigID_EnableSkipUnitPassthrough("EnableSkipUnitPassthrough"),
        ConfigID_EnableReEncodeOpt("EnableReEncodeOpt"),
        ConfigID_ForceDetectFace("ve_enable_face_detection"),
        ConfigID_EnableStickerAmazing("EnableStickerAmazing"),
        ConfigID_EnableGlobalEffect("EnableGlobalEffect"),
        ConfigID_EnableImportParallelCompile("veEnableImportParallelCompile"),
        ConfigID_StickerPinPreviewMode("StickerPinPreviewMode");
        
        private String value;

        public String value() {
            return this.value;
        }

        private ConfigID(String str) {
            this.value = str;
        }
    }

    public enum DataType {
        BOOLEAN(0),
        INTEGER(1);
        
        private int value;

        public int value() {
            return this.value;
        }

        private DataType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUserConfig$a */
    public static class C63909a<T> {

        /* renamed from: a */
        public ConfigID f161396a;

        /* renamed from: b */
        private DataType f161397b;

        /* renamed from: c */
        private T f161398c;

        /* renamed from: a */
        public T mo220988a() {
            return this.f161398c;
        }

        /* renamed from: b */
        public DataType mo220989b() {
            return this.f161397b;
        }

        public String toString() {
            return "VEUserConfigItem{dataType=" + this.f161397b + ", value=" + ((Object) this.f161398c) + ", id=" + this.f161396a + '}';
        }
    }

    /* renamed from: a */
    public C63909a<?>[] mo220985a() {
        Collection<C63909a<?>> values = this.f161395a.values();
        C63909a<?>[] aVarArr = new C63909a[values.size()];
        values.toArray(aVarArr);
        return aVarArr;
    }
}
