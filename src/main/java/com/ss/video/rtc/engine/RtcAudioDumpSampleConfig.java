package com.ss.video.rtc.engine;

public class RtcAudioDumpSampleConfig {
    public boolean aec_far_in_enable;
    public boolean aec_far_in_ref_enable;
    public boolean aec_near_in_enable;
    public boolean aec_out_enable;
    public boolean agc_out_enable;
    public boolean ainr_out_enable;
    public boolean audio_share_in_enable;
    public boolean audio_share_out_enable;
    public boolean audio_share_win_ref_enable;
    public boolean decoder_out_enable;
    public boolean external_audio_in_enable;
    public boolean mix_out_enable;
    public boolean ns_out_enable;
    public boolean pitchfilter_out_enable;
    public boolean send2encoder_enable;

    public boolean getAecFarIn() {
        return this.aec_far_in_enable;
    }

    public boolean getAecFarInRef() {
        return this.aec_far_in_ref_enable;
    }

    public boolean getAecNearIn() {
        return this.aec_near_in_enable;
    }

    public boolean getAecOut() {
        return this.aec_out_enable;
    }

    public boolean getAgcOut() {
        return this.agc_out_enable;
    }

    public boolean getAinrOut() {
        return this.ainr_out_enable;
    }

    public boolean getAudioShareIn() {
        return this.audio_share_in_enable;
    }

    public boolean getAudioShareOut() {
        return this.audio_share_out_enable;
    }

    public boolean getAudioShareWinRef() {
        return this.audio_share_win_ref_enable;
    }

    public boolean getDecodeOut() {
        return this.decoder_out_enable;
    }

    public boolean getExternalAudioIn() {
        return this.external_audio_in_enable;
    }

    public boolean getMixOut() {
        return this.mix_out_enable;
    }

    public boolean getNsOut() {
        return this.ns_out_enable;
    }

    public boolean getPitchFilterOut() {
        return this.pitchfilter_out_enable;
    }

    public boolean getSend2encoder() {
        return this.send2encoder_enable;
    }

    public RtcAudioDumpSampleConfig() {
        reset();
    }

    public void NormalMode() {
        reset();
        this.aec_near_in_enable = true;
        this.aec_far_in_ref_enable = true;
        this.mix_out_enable = true;
    }

    private void reset() {
        this.aec_near_in_enable = false;
        this.aec_far_in_enable = false;
        this.aec_far_in_ref_enable = false;
        this.aec_out_enable = false;
        this.agc_out_enable = false;
        this.ns_out_enable = false;
        this.ainr_out_enable = false;
        this.mix_out_enable = false;
        this.send2encoder_enable = false;
        this.audio_share_in_enable = false;
        this.audio_share_win_ref_enable = false;
        this.audio_share_out_enable = false;
        this.external_audio_in_enable = false;
        this.pitchfilter_out_enable = false;
        this.decoder_out_enable = false;
    }

    public void AllMode() {
        this.aec_near_in_enable = true;
        this.aec_far_in_enable = true;
        this.aec_far_in_ref_enable = true;
        this.aec_out_enable = true;
        this.agc_out_enable = true;
        this.ns_out_enable = true;
        this.ainr_out_enable = true;
        this.mix_out_enable = true;
        this.send2encoder_enable = true;
        this.audio_share_in_enable = true;
        this.audio_share_win_ref_enable = true;
        this.audio_share_out_enable = true;
        this.external_audio_in_enable = true;
        this.pitchfilter_out_enable = true;
        this.decoder_out_enable = true;
    }
}
