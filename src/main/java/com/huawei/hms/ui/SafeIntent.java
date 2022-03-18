package com.huawei.hms.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import java.io.Serializable;
import java.util.ArrayList;

public class SafeIntent extends Intent {
    public String getAction() {
        try {
            return super.getAction();
        } catch (Exception unused) {
            return "";
        }
    }

    public Bundle getExtras() {
        try {
            return super.getExtras();
        } catch (Exception unused) {
            return new Bundle();
        }
    }

    public CharSequence getCharSequenceExtra(String str) {
        try {
            return super.getCharSequenceExtra(str);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String str) {
        try {
            return super.getParcelableArrayListExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public <T extends Parcelable> T getParcelableExtra(String str) {
        try {
            return (T) super.getParcelableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public Serializable getSerializableExtra(String str) {
        try {
            return super.getSerializableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getStringExtra(String str) {
        try {
            return super.getStringExtra(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public boolean hasExtra(String str) {
        try {
            return super.hasExtra(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeIntent(Intent intent) {
        super(intent == null ? new Intent() : intent);
    }

    public boolean[] getBooleanArrayExtra(String str) {
        try {
            return super.getBooleanArrayExtra(str);
        } catch (Exception unused) {
            return new boolean[0];
        }
    }

    public Bundle getBundleExtra(String str) {
        try {
            return INVOKESPECIAL_com_huawei_hms_ui_SafeIntent_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra(this, str);
        } catch (Exception unused) {
            return new Bundle();
        }
    }

    public byte[] getByteArrayExtra(String str) {
        try {
            return super.getByteArrayExtra(str);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public char[] getCharArrayExtra(String str) {
        try {
            return super.getCharArrayExtra(str);
        } catch (Exception unused) {
            return new char[0];
        }
    }

    public CharSequence[] getCharSequenceArrayExtra(String str) {
        try {
            return super.getCharSequenceArrayExtra(str);
        } catch (Exception unused) {
            return new CharSequence[0];
        }
    }

    @Override // android.content.Intent
    public ArrayList<CharSequence> getCharSequenceArrayListExtra(String str) {
        try {
            return super.getCharSequenceArrayListExtra(str);
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    public double[] getDoubleArrayExtra(String str) {
        try {
            return super.getDoubleArrayExtra(str);
        } catch (Exception unused) {
            return new double[0];
        }
    }

    public float[] getFloatArrayExtra(String str) {
        try {
            return super.getFloatArrayExtra(str);
        } catch (Exception unused) {
            return new float[0];
        }
    }

    public int[] getIntArrayExtra(String str) {
        try {
            return super.getIntArrayExtra(str);
        } catch (Exception unused) {
            return new int[0];
        }
    }

    @Override // android.content.Intent
    public ArrayList<Integer> getIntegerArrayListExtra(String str) {
        try {
            return super.getIntegerArrayListExtra(str);
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    public long[] getLongArrayExtra(String str) {
        try {
            return super.getLongArrayExtra(str);
        } catch (Exception unused) {
            return new long[0];
        }
    }

    public Parcelable[] getParcelableArrayExtra(String str) {
        try {
            return super.getParcelableArrayExtra(str);
        } catch (Exception unused) {
            return new Parcelable[0];
        }
    }

    public short[] getShortArrayExtra(String str) {
        try {
            return super.getShortArrayExtra(str);
        } catch (Exception unused) {
            return new short[0];
        }
    }

    public String[] getStringArrayExtra(String str) {
        try {
            return super.getStringArrayExtra(str);
        } catch (Exception unused) {
            return new String[0];
        }
    }

    @Override // android.content.Intent
    public ArrayList<String> getStringArrayListExtra(String str) {
        try {
            return super.getStringArrayListExtra(str);
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    public boolean getBooleanExtra(String str, boolean z) {
        try {
            return super.getBooleanExtra(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public byte getByteExtra(String str, byte b) {
        try {
            return super.getByteExtra(str, b);
        } catch (Exception unused) {
            return b;
        }
    }

    public char getCharExtra(String str, char c) {
        try {
            return super.getCharExtra(str, c);
        } catch (Exception unused) {
            return c;
        }
    }

    public double getDoubleExtra(String str, double d) {
        try {
            return super.getDoubleExtra(str, d);
        } catch (Exception unused) {
            return d;
        }
    }

    public float getFloatExtra(String str, float f) {
        try {
            return super.getFloatExtra(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    public int getIntExtra(String str, int i) {
        try {
            return super.getIntExtra(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public long getLongExtra(String str, long j) {
        try {
            return super.getLongExtra(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public short getShortExtra(String str, short s) {
        try {
            return super.getShortExtra(str, s);
        } catch (Exception unused) {
            return s;
        }
    }

    public static Bundle INVOKESPECIAL_com_huawei_hms_ui_SafeIntent_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra(Intent intent, String str) {
        Bundle bundleExtra = super.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}
