package com.ss.android.lark.utils;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
public class EasyIntent extends Intent {
    public Bundle getExtras() {
        return super.getExtras();
    }

    private EasyIntent(Intent intent) {
        super(intent);
    }

    /* renamed from: a */
    public static Intent m224126a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (intent instanceof EasyIntent) {
            return intent;
        }
        return new EasyIntent(intent);
    }

    public boolean getBooleanExtra(String str, boolean z) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return z;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Boolean", Boolean.valueOf(z), e);
                return z;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        }
    }

    public byte getByteExtra(String str, byte b) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return b;
        }
        if (obj instanceof String) {
            try {
                return Byte.parseByte((String) obj);
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Byte", Byte.valueOf(b), e);
                return b;
            }
        } else {
            try {
                return ((Byte) obj).byteValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Byte", Byte.valueOf(b), e2);
                return b;
            }
        }
    }

    public double getDoubleExtra(String str, double d) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return d;
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Double", Double.valueOf(d), e);
                return d;
            }
        } else {
            try {
                return ((Double) obj).doubleValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Double", Double.valueOf(d), e2);
                return d;
            }
        }
    }

    public float getFloatExtra(String str, float f) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return f;
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Float", Float.valueOf(f), e);
                return f;
            }
        } else {
            try {
                return ((Float) obj).floatValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Float", Float.valueOf(f), e2);
                return f;
            }
        }
    }

    public int getIntExtra(String str, int i) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Integer", Integer.valueOf(i), e);
                return i;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Integer", Integer.valueOf(i), e2);
                return i;
            }
        }
    }

    public long getLongExtra(String str, long j) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return j;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Long", Long.valueOf(j), e);
                return j;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Long", Long.valueOf(j), e2);
                return j;
            }
        }
    }

    public char getCharExtra(String str, char c) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return c;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            m224127a(str, obj, "Char", Character.valueOf(c), null);
            return c;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e) {
            m224127a(str, obj, "Char", Character.valueOf(c), e);
            return c;
        }
    }

    public short getShortExtra(String str, short s) {
        Object obj;
        Bundle extras = super.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return s;
        }
        if (obj instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) obj)).shortValue();
            } catch (NumberFormatException e) {
                m224127a(str, obj, "Short", Short.valueOf(s), e);
                return s;
            }
        } else {
            try {
                return ((Short) obj).shortValue();
            } catch (ClassCastException e2) {
                m224127a(str, obj, "Short", Short.valueOf(s), e2);
                return s;
            }
        }
    }

    /* renamed from: a */
    private void m224127a(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        Log.m165397w("EasyIntent", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        if (runtimeException != null) {
            Log.m165398w("EasyIntent", "Attempt to cast generated internal exception:", runtimeException);
        }
    }
}
