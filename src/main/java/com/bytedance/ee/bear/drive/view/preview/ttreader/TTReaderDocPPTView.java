package com.bytedance.ee.bear.drive.view.preview.ttreader;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.PluginManager;
import com.bytedance.ee.plugin.common.ttreader.ITTOfficePlugin;
import com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper;
import com.larksuite.suite.R;
import java.io.File;
import org.json.JSONObject;

public class TTReaderDocPPTView extends TTReaderBaseView {

    /* renamed from: e */
    public int f20022e;

    /* renamed from: f */
    public long f20023f;

    /* renamed from: g */
    public boolean f20024g;

    /* renamed from: h */
    private TextView f20025h;

    /* renamed from: i */
    private int f20026i;

    /* renamed from: j */
    private boolean f20027j = true;

    /* renamed from: b */
    public void mo29017b() {
        this.f20024g = false;
        this.f20015b.mo29030a(new C7437a.C7439a(false, false, false));
    }

    public void setIndicatorVisible(boolean z) {
        this.f20027j = z;
    }

    public TTReaderDocPPTView(Context context) {
        super(context);
        m29744a(context);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderBaseView
    /* renamed from: d */
    public void mo29013d(String str) {
        String str2;
        Uri fromFile = Uri.fromFile(new File(this.f20016c.mo29485e()));
        if (!TextUtils.isEmpty(this.f20016c.mo29483d())) {
            str2 = this.f20016c.mo29483d();
        } else {
            str2 = this.f20016c.mo29494m();
        }
        this.f20014a.openBook(fromFile, str, str2);
        this.f20014a.turnTo(0);
    }

    public void setIndicator(int i) {
        int i2;
        this.f20026i = i;
        TextView textView = this.f20025h;
        if (!this.f20027j || this.f20022e <= 0 || i <= 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        this.f20025h.setText(String.format("%d/%d", Integer.valueOf(i), Integer.valueOf(this.f20022e)));
    }

    /* renamed from: a */
    private void m29744a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_ttreader_pdf_view, (ViewGroup) this, true);
        this.f20014a = ((ITTOfficePlugin) PluginManager.getPluginApi(ITTOfficePlugin.class)).newTTReaderViewWrapper(C6535d.m26238a().mo26099i());
        this.f20014a.setOption(3100, "false");
        ((ViewGroup) findViewById(R.id.view_content)).addView(this.f20014a.getTTReaderView(), 0, new ViewGroup.LayoutParams(-1, -1));
        this.f20025h = (TextView) findViewById(R.id.indicator_view);
        this.f20014a.setListener(new ITTReaderViewWrapper.Listener() {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderDocPPTView.C74321 */

            @Override // com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper.Listener
            public void onReport(String str, JSONObject jSONObject) {
                TTReaderDocPPTView.this.mo29010a(str, jSONObject);
            }

            @Override // com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper.Listener
            public void onError(int i, Bundle bundle) {
                String str;
                if (bundle != null) {
                    str = bundle.toString();
                } else {
                    str = "";
                }
                String format = String.format("onError what: %s, data: %s", String.valueOf(i), str);
                Throwable th = new Throwable(format);
                C13479a.m54758a("TTReaderDocPPTView", format);
                if (i != 2002) {
                    TTReaderDocPPTView.this.mo29009a("tt_pdf", th);
                }
                if (i == 2000 || i == 2001) {
                    if (TTReaderDocPPTView.this.f20017d != null) {
                        TTReaderDocPPTView.this.f20017d.getliveInnerDowngrade().mo5926a((Integer) 2);
                    }
                } else if (i == 2002) {
                    TTReaderDocPPTView.this.mo29006a();
                }
            }

            @Override // com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper.Listener
            public void onInfo(int i, Bundle bundle) {
                String str;
                if (bundle != null) {
                    str = bundle.toString();
                } else {
                    str = "";
                }
                C13479a.m54764b("TTReaderDocPPTView", "onInfo what: " + i + " msg: " + str);
                if (i == 1000) {
                    if (bundle != null) {
                        TTReaderDocPPTView.this.f20022e = bundle.getInt("pages");
                    }
                    TTReaderDocPPTView.this.mo29011b("tt_pdf");
                    TTReaderDocPPTView.this.mo29008a("tt_pdf");
                } else if (i == 1001) {
                    if (bundle != null) {
                        TTReaderDocPPTView.this.f20022e = bundle.getInt("page_count", 0);
                        TTReaderDocPPTView.this.setIndicator(bundle.getInt("page") + 1);
                    }
                } else if (i == 1004) {
                    if (bundle != null) {
                        TTReaderDocPPTView.this.mo29012c(bundle.getString("link"));
                    }
                } else if (i == 1006) {
                    TTReaderDocPPTView.this.f20023f = System.currentTimeMillis();
                    if (TTReaderDocPPTView.this.f20024g) {
                        TTReaderDocPPTView.this.f20015b.mo29028a();
                    }
                } else if (i == 1005) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (TTReaderDocPPTView.this.f20024g && currentTimeMillis - TTReaderDocPPTView.this.f20023f > 1000) {
                        TTReaderDocPPTView.this.f20015b.mo29032b();
                    }
                }
            }
        });
    }

    public TTReaderDocPPTView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29744a(context);
    }

    public TTReaderDocPPTView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29744a(context);
    }
}
