package pl.droidsonroids.gif;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Locale;

public enum GifError {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(LocationRequest.PRIORITY_NO_POWER, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(ActivityIdentificationData.WALKING, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(SmEvents.EVENT_NR, "Failed to allocate required memory"),
    CLOSE_FAILED(SmEvents.EVENT_NO, "Failed to close given input"),
    NOT_READABLE(SmEvents.EVENT_NT, "Given file was not opened for read"),
    IMAGE_DEFECT(SmEvents.EVENT_NE_RR, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(SmEvents.EVENT_RE, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(CommonCode.StatusCode.API_CLIENT_EXPIRED, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    
    public final String description;
    int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    /* access modifiers changed from: package-private */
    public String getFormattedDescription() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.errorCode), this.description);
    }

    static GifError fromCode(int i) {
        GifError[] values = values();
        for (GifError gifError : values) {
            if (gifError.errorCode == i) {
                return gifError;
            }
        }
        GifError gifError2 = UNKNOWN;
        gifError2.errorCode = i;
        return gifError2;
    }

    private GifError(int i, String str) {
        this.errorCode = i;
        this.description = str;
    }
}
