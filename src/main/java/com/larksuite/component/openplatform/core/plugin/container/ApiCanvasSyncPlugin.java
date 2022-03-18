package com.larksuite.component.openplatform.core.plugin.container;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import java.util.List;

public class ApiCanvasSyncPlugin extends OPPlugin {
    private Paint mPaint;

    private static class ApiCanvasSyncRequest extends C25920a {
        @JSONField(name = "fontSize")
        public int mFontSize;
        @JSONField(name = "font")
        public List<String> mFonts;
        @JSONField(name = "text")
        public String mText;

        private ApiCanvasSyncRequest() {
        }
    }

    private static class ApiCanvasSyncResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public Font mData;

        private ApiCanvasSyncResponse() {
        }
    }

    private static class Font {
        @JSONField(name = "width")
        public float mWidth;

        private Font() {
        }
    }

    private Paint getPaint() {
        if (this.mPaint == null) {
            this.mPaint = new Paint();
        }
        return this.mPaint;
    }

    @LKPluginFunction(eventName = {"measureText"})
    public ApiCanvasSyncResponse apiCanvasSyncAsync(AbstractC25895f fVar, ApiCanvasSyncRequest apiCanvasSyncRequest) {
        ApiCanvasSyncResponse apiCanvasSyncResponse = new ApiCanvasSyncResponse();
        int i = apiCanvasSyncRequest.mFontSize;
        List<String> list = apiCanvasSyncRequest.mFonts;
        String[] strArr = new String[0];
        if (list != null && list.size() > 0) {
            strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = list.get(i2);
            }
        }
        float measureWidthWithNative = measureWidthWithNative(apiCanvasSyncRequest.mText, (float) i, strArr);
        fVar.mo92190b().mo92224i("ApiCanvasSyncPlugin", "width:", Float.valueOf(measureWidthWithNative));
        Font font = new Font();
        font.mWidth = measureWidthWithNative;
        apiCanvasSyncResponse.mData = font;
        return apiCanvasSyncResponse;
    }

    private float measureWidthWithNativeSingleLine(String str, float f, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return measureWidth(str, f, strArr, BitmapDescriptorFactory.HUE_RED);
    }

    private float measureWidthWithNative(String str, float f, String[] strArr) {
        boolean isEmpty = TextUtils.isEmpty(str);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (isEmpty) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        for (String str2 : str.split("\n")) {
            float measureWidthWithNativeSingleLine = measureWidthWithNativeSingleLine(str2, f, strArr);
            if (measureWidthWithNativeSingleLine > f2) {
                f2 = measureWidthWithNativeSingleLine;
            }
        }
        return f2;
    }

    private float measureWidth(String str, float f, String[] strArr, float f2) {
        Paint paint = getPaint();
        paint.setTextSize(f);
        paint.setLinearText(true);
        paint.setTypeface(Typeface.DEFAULT);
        for (String str2 : strArr) {
            String lowerCase = str2.toLowerCase();
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1536685117:
                    if (lowerCase.equals("sans-serif")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1431958525:
                    if (lowerCase.equals("monospace")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109326717:
                    if (lowerCase.equals("serif")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    paint.setTypeface(Typeface.SANS_SERIF);
                    break;
                case 1:
                    paint.setTypeface(Typeface.MONOSPACE);
                    break;
                case 2:
                    paint.setTypeface(Typeface.SERIF);
                    break;
            }
        }
        paint.getTextBounds(str, 0, str.length(), new Rect());
        int length = str.length();
        float[] fArr = new float[length];
        this.mPaint.getTextWidths(str, fArr);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f3 += fArr[i];
        }
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            return f3;
        }
        return f3 * f2;
    }
}
