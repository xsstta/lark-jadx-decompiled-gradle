package com.larksuite.component.blockit.props;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import com.larksuite.component.blockit.C24051c;
import com.larksuite.component.blockit.p1066a.C24048b;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.blockit.props.b */
public class C24132b extends ClickableSpan {

    /* renamed from: a */
    private String f59682a;

    /* renamed from: b */
    private String f59683b;

    /* renamed from: c */
    private Map<String, Object> f59684c;

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(UIHelper.getColor(R.color.lkui_B700));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }

    public void onClick(View view) {
        JSONObject jSONObject = new JSONObject(this.f59684c);
        try {
            jSONObject.put("tag_id", this.f59683b);
            jSONObject.put("from", "view");
        } catch (JSONException e) {
            Log.w("PropsClickableSpan", e);
        }
        C24048b.m87864a("pano_panel_and_view_jump", jSONObject);
        C24051c.m87870a().mo86299a(view.getContext(), this.f59682a);
    }

    public C24132b(String str, String str2, Map<String, Object> map) {
        this.f59682a = str;
        this.f59683b = str2;
        this.f59684c = map;
    }
}
