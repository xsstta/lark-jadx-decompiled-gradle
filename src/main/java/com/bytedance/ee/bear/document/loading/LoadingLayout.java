package com.bytedance.ee.bear.document.loading;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.NetworkType;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;

public class LoadingLayout extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public AbstractC5864a f16424a;

    /* renamed from: com.bytedance.ee.bear.document.loading.LoadingLayout$a */
    public interface AbstractC5864a {
        void onFailedRetry(int i);
    }

    /* renamed from: b */
    private boolean m23590b(int i) {
        return i == -2 || i == -600 || i == -50;
    }

    /* renamed from: c */
    private boolean m23591c(int i) {
        return i == 920004002;
    }

    /* renamed from: d */
    private boolean m23592d(int i) {
        return i == -100001;
    }

    /* renamed from: e */
    private boolean m23593e(int i) {
        return i == -55;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b */
    public void mo23569b() {
        setVisibility(0);
    }

    /* renamed from: c */
    public void mo23570c() {
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo23567a() {
        findViewById(R.id.ll_loading).setVisibility(0);
        findViewById(R.id.facade_no_data_empty_state).setVisibility(8);
        setOnClickListener(null);
    }

    public LoadingLayout(Context context) {
        super(context);
    }

    public void setOnRetryListener(AbstractC5864a aVar) {
        this.f16424a = aVar;
    }

    /* renamed from: a */
    private boolean m23589a(int i) {
        if (i == -1 || C4974b.m20620a(getContext()) == NetworkType.NETWORK_NO) {
            return true;
        }
        return false;
    }

    public LoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23588a(context, attributeSet);
    }

    /* renamed from: a */
    private void m23588a(Context context, AttributeSet attributeSet) {
        inflate(getContext(), R.layout.doc_empty_layout, this);
        mo23567a();
    }

    /* renamed from: a */
    public void mo23568a(final int i, String str) {
        String str2;
        findViewById(R.id.ll_loading).setVisibility(8);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) findViewById(R.id.facade_no_data_empty_state);
        spaceEmptyState.setVisibility(0);
        getResources().getString(R.string.Doc_Facade_LoadFailed);
        boolean a = m23589a(i);
        int i2 = R.drawable.illustration_empty_negative_load_failed;
        if (a) {
            i2 = R.drawable.illustration_empty_negative_no_wifi;
            str2 = getResources().getString(R.string.Doc_Facade_NetworkInterrutedRetry);
        } else if (m23590b(i)) {
            str2 = getResources().getString(R.string.Doc_Facade_LoadOverTime);
        } else if (m23592d(i)) {
            i2 = R.drawable.illustration_ccm_empty_neutral_400_403;
            str2 = getResources().getString(R.string.CreationMobile_ECM_SiteUnavailableDesc);
        } else if (m23591c(i)) {
            str2 = getResources().getString(R.string.CreationMobile_Wiki_PageDeleted_Toast);
        } else if (m23593e(i)) {
            i2 = R.drawable.illustration_vc_empty_neutral_recycle_bin;
            str2 = getResources().getString(R.string.CreationMobile_ECM_DocsDeletedDesc);
        } else {
            str2 = String.format("%s(%s)", getResources().getString(R.string.Doc_Facade_LoadFailed), Integer.valueOf(i));
        }
        spaceEmptyState.setImageRes(Integer.valueOf(i2));
        spaceEmptyState.setDesc(String.format("%s", str2));
        setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.document.loading.LoadingLayout.View$OnClickListenerC58631 */

            public void onClick(View view) {
                if (LoadingLayout.this.f16424a != null) {
                    LoadingLayout.this.f16424a.onFailedRetry(i);
                    LoadingLayout.this.setOnClickListener(null);
                }
            }
        });
    }

    public LoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23588a(context, attributeSet);
    }
}
