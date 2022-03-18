package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaNode;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.message.card.view.richtext.h */
public class C45375h {

    /* renamed from: a */
    public static Map<RichText, Integer> f114928a = new HashMap();

    /* renamed from: b */
    public static Map<RichText, List<NodeParams>> f114929b = new HashMap();

    /* renamed from: c */
    private static final int f114930c = C45294c.m179871a().mo143905f();

    /* renamed from: e */
    private static Map<RichText, List<NodeParams>> f114931e = new HashMap();

    /* renamed from: d */
    private int f114932d;

    public C45375h(int i) {
        this.f114932d = i;
    }

    /* renamed from: a */
    public static boolean m180206a(int i) {
        if (i <= 1 || LKUIDisplayManager.m91870a() == ZoomLevel.NORMAL) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int mo160208a(Context context, int i) {
        if (!m180206a(this.f114932d)) {
            return UIUtils.dp2px(context, (float) i);
        }
        return LKUIDisplayManager.m91883d(context, i);
    }

    /* renamed from: a */
    public static void m180201a(NodeParams nodeParams, int i) {
        if (m180206a(i)) {
            if (nodeParams == null) {
                Log.m165383e("ZoomRule", "zoomNodeParamsTextSize->nodeParams is null!");
                return;
            }
            nodeParams.mDefaultTextSize = nodeParams.mTextSize;
            if (nodeParams.mTextSize > BitmapDescriptorFactory.HUE_RED) {
                NodeParams nodeParams2 = nodeParams.mParents;
                if (nodeParams2 == null || nodeParams2.mRichTextTag != RichTextElement.RichTextTag.BUTTON) {
                    nodeParams.mTextSize = LKUIDisplayManager.m91862a((int) nodeParams.mTextSize);
                } else {
                    nodeParams.mTextSize = LKUIDisplayManager.m91874b((int) nodeParams.mTextSize);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x01f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m180202a(com.ss.android.lark.widget.richtext.RichText r20, int r21) {
        /*
        // Method dump skipped, instructions count: 612
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.view.richtext.C45375h.m180202a(com.ss.android.lark.widget.richtext.RichText, int):void");
    }

    /* renamed from: a */
    public static synchronized void m180203a(RichText richText, int i, NodeParams nodeParams) {
        synchronized (C45375h.class) {
            if (m180206a(i)) {
                if (nodeParams.mRichTextTag == RichTextElement.RichTextTag.PARAGRAPH) {
                    List<NodeParams> list = f114929b.get(richText);
                    if (list == null) {
                        list = new ArrayList<>();
                        f114929b.put(richText, list);
                    }
                    list.add(nodeParams);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m180204a(String str, RichText richText, int i) {
        float f;
        if (m180206a(i)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("textsize_set", str);
                if (f114928a.get(richText) != null) {
                    f = (float) f114928a.get(richText).intValue();
                } else {
                    f = 14.0f;
                }
                jSONObject.put("textsize_show", f + "");
            } catch (Exception unused) {
                Log.m165383e("ZoomRule", "send button show event failed!");
            }
            Statistics.sendEvent("op_card_button_show", jSONObject);
            return;
        }
        Log.m165389i("ZoomRule", "sendEvent->don't need send!!");
    }

    /* renamed from: a */
    public void mo160209a(Context context, YogaNode yogaNode, NodeParams nodeParams) {
        if (m180206a(this.f114932d) && nodeParams.mYogaProperty.height > BitmapDescriptorFactory.HUE_RED) {
            Log.m165389i("ZoomRule", "origin height:" + nodeParams.mYogaProperty.height);
            yogaNode.setHeightAuto();
            if (nodeParams.mYogaProperty.paddingTop == BitmapDescriptorFactory.HUE_RED || nodeParams.mYogaProperty.paddingBottom == BitmapDescriptorFactory.HUE_RED) {
                yogaNode.setPadding(YogaEdge.TOP, (float) UIUtils.dp2px(context, 10.0f));
                yogaNode.setPadding(YogaEdge.BOTTOM, (float) UIUtils.dp2px(context, 10.0f));
            }
        }
    }

    /* renamed from: a */
    public static void m180205a(String str, String str2, String str3, String str4, RichText richText, int i) {
        float f;
        if (m180206a(i)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message_id", str);
                jSONObject.put("actionType", str2);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("url", str3);
                }
                jSONObject.put("textsize_set", str4);
                if (f114928a.get(richText) != null) {
                    f = (float) f114928a.get(richText).intValue();
                } else {
                    f = 14.0f;
                }
                jSONObject.put("textsize_show", f + "");
            } catch (Exception unused) {
                Log.m165383e("ZoomRule", "send button click event failed!");
            }
            Statistics.sendEvent("op_card_button_click", jSONObject);
            return;
        }
        Log.m165389i("ZoomRule", "sendEvent->don't need send!!");
    }
}
