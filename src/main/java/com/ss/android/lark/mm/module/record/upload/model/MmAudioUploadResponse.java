package com.ss.android.lark.mm.module.record.upload.model;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.io.Serializable;

public class MmAudioUploadResponse implements Serializable {
    private int code;
    private String msg;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String toString() {
        return "MmAudioUploadResponse{code=" + this.code + ", msg='" + this.msg + '\'' + '}';
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public enum AudioUploadCodeEnum {
        INTERRUPTED(409),
        REACH_MAX_LIMIT(4061),
        COMPLETED(406),
        SUCCESS(LocationRequest.PRIORITY_HD_ACCURACY),
        NO_AUTH(401),
        SERVER_ERROR(ParticipantRepo.f117150c),
        UNKNOWN(-1);
        
        public int code;

        public static AudioUploadCodeEnum fromCode(int i) {
            if (i == 406) {
                return COMPLETED;
            }
            if (i == 409) {
                return INTERRUPTED;
            }
            if (i != 4061) {
                return UNKNOWN;
            }
            return REACH_MAX_LIMIT;
        }

        private AudioUploadCodeEnum(int i) {
            this.code = i;
        }
    }
}
