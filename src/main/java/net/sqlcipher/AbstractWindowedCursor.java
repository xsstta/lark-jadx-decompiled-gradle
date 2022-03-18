package net.sqlcipher;

import android.database.CharArrayBuffer;

public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow mWindow;

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.AbstractCursor
    public CursorWindow getWindow() {
        return this.mWindow;
    }

    public boolean hasWindow() {
        if (this.mWindow != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // net.sqlcipher.AbstractCursor
    public void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new StaleDataException("Access closed cursor");
        }
    }

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.Cursor
    public int getType(int i) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i);
    }

    public void setWindow(CursorWindow cursorWindow) {
        CursorWindow cursorWindow2 = this.mWindow;
        if (cursorWindow2 != null) {
            cursorWindow2.close();
        }
        this.mWindow = cursorWindow;
    }

    @Override // net.sqlcipher.AbstractCursor
    public byte[] getBlob(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getBlob(this.mPos, i);
            }
            return (byte[]) getUpdatedField(i);
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public double getDouble(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getDouble(this.mPos, i);
            }
            return ((Number) getUpdatedField(i)).doubleValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public float getFloat(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getFloat(this.mPos, i);
            }
            return ((Number) getUpdatedField(i)).floatValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getInt(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getInt(this.mPos, i);
            }
            return ((Number) getUpdatedField(i)).intValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public long getLong(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getLong(this.mPos, i);
            }
            return ((Number) getUpdatedField(i)).longValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public short getShort(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getShort(this.mPos, i);
            }
            return ((Number) getUpdatedField(i)).shortValue();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public String getString(int i) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.getString(this.mPos, i);
            }
            return (String) getUpdatedField(i);
        }
    }

    public boolean isBlob(int i) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.isBlob(this.mPos, i);
            }
            Object updatedField = getUpdatedField(i);
            if (updatedField != null) {
                if (!(updatedField instanceof byte[])) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        }
    }

    public boolean isFloat(int i) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.isFloat(this.mPos, i);
            }
            Object updatedField = getUpdatedField(i);
            if (updatedField == null || (!(updatedField instanceof Float) && !(updatedField instanceof Double))) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }
    }

    public boolean isLong(int i) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.isLong(this.mPos, i);
            }
            Object updatedField = getUpdatedField(i);
            if (updatedField == null || (!(updatedField instanceof Integer) && !(updatedField instanceof Long))) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean isNull(int i) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.isNull(this.mPos, i);
            }
            if (getUpdatedField(i) == null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }
    }

    public boolean isString(int i) {
        boolean z;
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (!isFieldUpdated(i)) {
                return this.mWindow.isString(this.mPos, i);
            }
            Object updatedField = getUpdatedField(i);
            if (updatedField != null) {
                if (!(updatedField instanceof String)) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            if (isFieldUpdated(i)) {
                super.copyStringToBuffer(i, charArrayBuffer);
            }
        }
        this.mWindow.copyStringToBuffer(this.mPos, i, charArrayBuffer);
    }
}
