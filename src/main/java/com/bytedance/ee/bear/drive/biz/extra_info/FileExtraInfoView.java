package com.bytedance.ee.bear.drive.biz.extra_info;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class FileExtraInfoView extends FrameLayout {

    /* renamed from: a */
    public int f17777a;

    /* renamed from: b */
    public AbstractC6435a f17778b;

    /* renamed from: c */
    private TextView f17779c;

    /* renamed from: d */
    private CommentInfoView f17780d;

    /* renamed from: e */
    private LikeInfoView f17781e;

    /* renamed from: f */
    private LikeCircleImageView f17782f;

    /* renamed from: g */
    private C7130c f17783g;

    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView$a */
    public interface AbstractC6435a {
        /* renamed from: a */
        void mo25515a();

        /* renamed from: a */
        void mo25516a(int i);
    }

    /* renamed from: a */
    public void mo25772a() {
    }

    public LikeCircleImageView getLikeCircleImageView() {
        return this.f17782f;
    }

    public LikeInfoView getLikeInfoView() {
        return this.f17781e;
    }

    /* renamed from: c */
    private void m25827c() {
        this.f17779c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView.View$OnClickListenerC64331 */

            public void onClick(View view) {
                C13479a.m54764b("DriveComponent", "FileExtraInfoView#initListener click " + FileExtraInfoView.this.f17778b);
                if (FileExtraInfoView.this.f17778b != null) {
                    FileExtraInfoView.this.f17778b.mo25515a();
                }
            }
        });
        this.f17780d.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.FileExtraInfoView.View$OnClickListenerC64342 */

            public void onClick(View view) {
                C13479a.m54764b("DriveComponent", "FileExtraInfoView#mCommentInfoView click " + FileExtraInfoView.this.f17778b);
                if (FileExtraInfoView.this.f17778b != null) {
                    FileExtraInfoView.this.f17778b.mo25516a(FileExtraInfoView.this.f17777a);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo25776b() {
        if (this.f17780d != null && this.f17779c != null) {
            setCommentInfoEnable(false);
            this.f17779c.setEnabled(false);
            this.f17779c.setVisibility(4);
        }
    }

    /* renamed from: d */
    private void m25828d() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_extra_info_entry_view, this);
        this.f17779c = (TextView) findViewById(R.id.tv_comment_enter);
        this.f17780d = (CommentInfoView) findViewById(R.id.comment_card_layout);
        this.f17781e = (LikeInfoView) findViewById(R.id.drive_like_item);
        this.f17782f = (LikeCircleImageView) findViewById(R.id.drive_like_circle_image);
        setClickable(true);
    }

    public void setOnCommentListener(AbstractC6435a aVar) {
        this.f17778b = aVar;
    }

    public FileExtraInfoView(Context context) {
        super(context);
        m25828d();
    }

    /* renamed from: a */
    public void mo25773a(int i) {
        this.f17777a = i;
        this.f17780d.setTvCommentCardText(i);
    }

    private void setCommentInfoEnable(boolean z) {
        if (z) {
            this.f17780d.setContentAlpha(255);
            this.f17780d.setEnabled(true);
            return;
        }
        this.f17780d.setContentAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
        this.f17780d.setEnabled(false);
    }

    public void setCommentEnterState(boolean z) {
        if (z) {
            this.f17779c.setVisibility(0);
            this.f17779c.setEnabled(true);
            return;
        }
        this.f17779c.setVisibility(4);
        this.f17779c.setEnabled(false);
    }

    public FileExtraInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25828d();
    }

    /* renamed from: a */
    public void mo25775a(boolean z, boolean z2) {
        if (!z) {
            setCommentInfoEnable(false);
        } else if (this.f17777a > 0) {
            setCommentInfoEnable(true);
        } else {
            setCommentInfoEnable(z2);
        }
    }

    /* renamed from: a */
    public void mo25774a(C6937b bVar, boolean z) {
        int i;
        if (bVar == null) {
            C13479a.m54758a("DRIVE_FileExtraInfoView", "init: illegal parameter");
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        mo25772a();
        this.f17780d.setTvCommentCardText(0);
        this.f17783g = C6920b.m27342f().mo27166a();
        mo25776b();
        m25827c();
    }

    public FileExtraInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25828d();
    }
}
