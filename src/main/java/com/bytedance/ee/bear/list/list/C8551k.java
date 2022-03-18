package com.bytedance.ee.bear.list.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.docstate.SyncStateView;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.list.k */
public class C8551k extends C20923c {

    /* renamed from: a */
    public SwipeMenuLayout f23181a;

    /* renamed from: b */
    public ConstraintLayout f23182b;

    /* renamed from: c */
    public ListTitleView f23183c;

    /* renamed from: d */
    public TextView f23184d;

    /* renamed from: e */
    public ImageView f23185e;

    /* renamed from: f */
    public ImageView f23186f;

    /* renamed from: g */
    public ImageView f23187g;

    /* renamed from: h */
    public ImageView f23188h;

    /* renamed from: i */
    public ImageView f23189i;

    /* renamed from: j */
    public SyncStateView f23190j;

    /* renamed from: k */
    public TextView f23191k;

    /* renamed from: l */
    public AppCompatImageView f23192l;

    /* renamed from: o */
    private int f23193o;

    /* renamed from: p */
    private final Runnable f23194p = new Runnable() {
        /* class com.bytedance.ee.bear.list.list.$$Lambda$k$figALEHIgXrY8We_sfZSIfrL5qQ */

        public final void run() {
            C8551k.this.m35687a();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35687a() {
        mo33389a(0);
    }

    public C8551k(View view) {
        super(view);
        this.f23181a = (SwipeMenuLayout) view.findViewById(R.id.list_item);
        this.f23182b = (ConstraintLayout) view.findViewById(R.id.item_content);
        this.f23183c = (ListTitleView) view.findViewById(R.id.item_name);
        this.f23184d = (TextView) view.findViewById(R.id.update_time);
        this.f23185e = (ImageView) view.findViewById(R.id.item_icon);
        this.f23186f = (ImageView) view.findViewById(R.id.item_shortcut);
        this.f23187g = (ImageView) view.findViewById(R.id.swipe_menu_more);
        this.f23188h = (ImageView) view.findViewById(R.id.swipe_menu_share);
        this.f23189i = (ImageView) view.findViewById(R.id.swipe_menu_delete);
        this.f23190j = (SyncStateView) view.findViewById(R.id.item_sync_state);
        this.f23191k = (TextView) view.findViewById(R.id.list_item_sync_state_desc);
        this.f23192l = (AppCompatImageView) view.findViewById(R.id.item_external_notice);
    }

    /* renamed from: a */
    public void mo33389a(int i) {
        C13479a.m54764b("ListStyleViewHolder", "setSyncState()...state = " + i + ", preState = " + this.f23193o);
        switch (i) {
            case 1:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_List_WaitingForSync);
                break;
            case 2:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_List_Syncing);
                break;
            case 3:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_Normal_FinishSynchronizing);
                this.f23191k.postDelayed(this.f23194p, 1000);
                break;
            case 4:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_List_SyncFailed);
                break;
            case 5:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_List_OfflineWaitDownload);
                break;
            case 6:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_List_OfflineDownloading);
                break;
            case 7:
                int i2 = this.f23193o;
                if (i2 != 5 && i2 != 6) {
                    this.f23184d.setVisibility(0);
                    this.f23191k.setVisibility(8);
                    break;
                } else {
                    this.f23184d.setVisibility(8);
                    this.f23191k.setVisibility(0);
                    this.f23191k.setText(R.string.Doc_List_OfflineDownloadSucceed);
                    this.f23191k.postDelayed(this.f23194p, 1000);
                    break;
                }
                break;
            case 8:
                this.f23184d.setVisibility(8);
                this.f23191k.setVisibility(0);
                this.f23191k.setText(R.string.Doc_List_OfflineDownloadFailed);
                break;
            default:
                this.f23184d.setVisibility(0);
                this.f23191k.setVisibility(8);
                this.f23191k.removeCallbacks(this.f23194p);
                break;
        }
        this.f23193o = i;
    }
}
