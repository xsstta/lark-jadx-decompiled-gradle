package com.ss.android.vc.meeting.module.interpretation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;

public class InterpreterSelectItem extends FrameLayout {

    /* renamed from: a */
    private LKUIRoundedImageView f155745a;

    /* renamed from: b */
    private LineHeightTextView f155746b;

    /* renamed from: c */
    private View f155747c;

    public enum Style {
        Selected,
        Empty
    }

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem$1 */
    static /* synthetic */ class C619901 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155748a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem$Style[] r0 = com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem.C619901.f155748a = r0
                com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem$Style r1 = com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem.Style.Selected     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem.C619901.f155748a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem$Style r1 = com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem.Style.Empty     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem.C619901.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m242181a() {
        LayoutInflater.from(getContext()).inflate(R.layout.interpreter_select_item, this);
        this.f155745a = (LKUIRoundedImageView) findViewById(R.id.interpreter_thumbnail);
        this.f155746b = (LineHeightTextView) findViewById(R.id.interpreter_name);
        this.f155747c = findViewById(R.id.v_arrow);
    }

    public InterpreterSelectItem(Context context) {
        super(context);
        m242181a();
    }

    public void setInterpreter(ByteviewUser byteviewUser) {
        setThumbnailImageView(byteviewUser);
        setInterpreterNameTv(byteviewUser);
    }

    /* renamed from: a */
    private VideoChatUser m242180a(ByteviewUser byteviewUser) {
        return UserInfoService.getUserInfoInCache(byteviewUser.getUserId(), byteviewUser.getParticipantType());
    }

    private void setInterpreterNameTv(ByteviewUser byteviewUser) {
        this.f155746b.setText(m242180a(byteviewUser).getName());
    }

    private void setThumbnailImageView(ByteviewUser byteviewUser) {
        VideoChatUser a = m242180a(byteviewUser);
        C60783v.m236230a(a.getAvatarKey(), a.getId(), a.getType(), this.f155745a, 20, 20);
    }

    public void setStyle(Style style) {
        int i = C619901.f155748a[style.ordinal()];
        if (i == 1) {
            this.f155745a.setVisibility(0);
            this.f155746b.setVisibility(0);
            this.f155746b.setTextColor(C60773o.m236126d(R.color.text_title));
            this.f155747c.setVisibility(0);
        } else if (i == 2) {
            this.f155745a.setVisibility(8);
            this.f155746b.setVisibility(0);
            this.f155746b.setTextColor(C60773o.m236126d(R.color.text_placeholder));
            this.f155746b.setText(UIHelper.getString(R.string.View_G_AddInterpreter));
            this.f155747c.setVisibility(0);
        }
    }

    public InterpreterSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242181a();
    }

    public InterpreterSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242181a();
    }
}
