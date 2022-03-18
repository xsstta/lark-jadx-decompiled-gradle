package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.larksuite.suite.R;

public class UndoBarView extends ConstraintLayout {

    /* renamed from: a */
    private TextView f111596a;

    /* renamed from: b */
    private TextView f111597b;

    /* renamed from: c */
    private Group f111598c;

    /* renamed from: d */
    private Group f111599d;

    /* renamed from: e */
    private int f111600e = 1;

    /* renamed from: a */
    public void mo156506a() {
        Group group = this.f111598c;
        if (group != null) {
            group.setVisibility(0);
        }
        Group group2 = this.f111599d;
        if (group2 != null) {
            group2.setVisibility(8);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f111603a = this.f111596a.getText().toString();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f111596a = (TextView) findViewById(R.id.mail_undo_message);
        this.f111597b = (TextView) findViewById(R.id.mail_undo_button);
        this.f111598c = (Group) findViewById(R.id.mail_undo_progress_layout);
        this.f111599d = (Group) findViewById(R.id.mail_undo_normal_layout);
        this.f111598c.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.lark.mail.impl.view.undo.UndoBarView.SavedState.C439741 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        String f111603a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f111603a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f111603a);
        }
    }

    public UndoBarView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void setOnUndoClickListener(View.OnClickListener onClickListener) {
        this.f111597b.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setUndoColor(int i) {
        this.f111597b.setTextColor(i);
    }

    /* renamed from: a */
    private void m174177a(final TextView textView) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.mail.impl.view.undo.UndoBarView.ViewTreeObserver$OnGlobalLayoutListenerC439731 */

            public void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
                UndoBarView.this.mo156507a(textView.getLineCount());
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void setButtonLabel(CharSequence charSequence) {
        this.f111597b.setText(charSequence);
        m174177a(this.f111597b);
    }

    /* access modifiers changed from: package-private */
    public void setMessage(CharSequence charSequence) {
        this.f111596a.setText(charSequence);
        m174177a(this.f111596a);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setMessage(savedState.f111603a);
    }

    /* renamed from: a */
    public void mo156507a(int i) {
        int max = Math.max(this.f111600e, i);
        this.f111600e = max;
        if (max == 1) {
            setBackgroundResource(R.drawable.mail_undo_background);
        } else {
            setBackgroundResource(R.drawable.mail_undo_lines_background);
        }
    }

    public UndoBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UndoBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
