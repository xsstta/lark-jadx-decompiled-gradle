package com.ss.android.lark.mail.impl.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;

public class MessageTitleBarView extends ConstraintLayout implements View.OnClickListener {

    /* renamed from: a */
    ImageView f109017a;

    /* renamed from: b */
    ImageView f109018b;

    /* renamed from: c */
    ImageView f109019c;

    /* renamed from: d */
    AbstractC42826a f109020d;

    /* renamed from: com.ss.android.lark.mail.impl.message.MessageTitleBarView$a */
    public interface AbstractC42826a {
        /* renamed from: a */
        void mo153729a();

        /* renamed from: b */
        void mo153730b();

        /* renamed from: c */
        void mo153731c();
    }

    /* renamed from: a */
    private void m170648a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mail_message_title_bar_layout, this);
        this.f109017a = (ImageView) findViewById(R.id.titleBackIv);
        this.f109018b = (ImageView) findViewById(R.id.titleDeleteIv);
        this.f109019c = (ImageView) findViewById(R.id.titleOpenDraftIv);
        this.f109017a.setOnClickListener(this);
        this.f109018b.setOnClickListener(this);
        this.f109019c.setOnClickListener(this);
    }

    public void setOnTitleBarClickListener(AbstractC42826a aVar) {
        this.f109020d = aVar;
    }

    public MessageTitleBarView(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        AbstractC42826a aVar = this.f109020d;
        if (aVar != null) {
            if (view == this.f109018b) {
                aVar.mo153730b();
            } else if (view == this.f109019c) {
                aVar.mo153731c();
            } else if (view == this.f109017a) {
                aVar.mo153729a();
            }
        }
    }

    public void setDeleteButtonVisible(boolean z) {
        if (z) {
            this.f109018b.setVisibility(0);
        } else {
            this.f109018b.setVisibility(8);
        }
    }

    public void setOpenDraftButtonVisible(boolean z) {
        if (z) {
            this.f109019c.setVisibility(0);
        } else {
            this.f109019c.setVisibility(8);
        }
    }

    public MessageTitleBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageTitleBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m170648a();
    }
}
