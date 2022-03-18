package org.apache.commons.net.ftp;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

public class FTPFile implements Serializable {
    private static final long serialVersionUID = 9010790363003271996L;
    private Calendar _date;
    private String _group;
    private int _hardLinkCount;
    private String _link;
    private String _name;
    private final boolean[][] _permissions;
    private String _rawListing;
    private long _size;
    private int _type;
    private String _user;

    public String getGroup() {
        return this._group;
    }

    public int getHardLinkCount() {
        return this._hardLinkCount;
    }

    public String getLink() {
        return this._link;
    }

    public String getName() {
        return this._name;
    }

    public String getRawListing() {
        return this._rawListing;
    }

    public long getSize() {
        return this._size;
    }

    public Calendar getTimestamp() {
        return this._date;
    }

    public int getType() {
        return this._type;
    }

    public String getUser() {
        return this._user;
    }

    public boolean isDirectory() {
        if (this._type == 1) {
            return true;
        }
        return false;
    }

    public boolean isFile() {
        if (this._type == 0) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (this._permissions != null) {
            return true;
        }
        return false;
    }

    public String toFormattedString() {
        return toFormattedString(null);
    }

    public String toString() {
        return getRawListing();
    }

    public boolean isSymbolicLink() {
        if (this._type == 2) {
            return true;
        }
        return false;
    }

    public boolean isUnknown() {
        if (this._type == 3) {
            return true;
        }
        return false;
    }

    private char formatType() {
        int i = this._type;
        if (i == 0) {
            return '-';
        }
        if (i == 1) {
            return 'd';
        }
        if (i != 2) {
            return '?';
        }
        return 'l';
    }

    public FTPFile() {
        this._permissions = (boolean[][]) Array.newInstance(boolean.class, 3, 3);
        this._type = 3;
        this._size = -1;
        this._user = "";
        this._group = "";
    }

    public void setGroup(String str) {
        this._group = str;
    }

    public void setHardLinkCount(int i) {
        this._hardLinkCount = i;
    }

    public void setLink(String str) {
        this._link = str;
    }

    public void setName(String str) {
        this._name = str;
    }

    public void setRawListing(String str) {
        this._rawListing = str;
    }

    public void setSize(long j) {
        this._size = j;
    }

    public void setTimestamp(Calendar calendar) {
        this._date = calendar;
    }

    public void setType(int i) {
        this._type = i;
    }

    public void setUser(String str) {
        this._user = str;
    }

    FTPFile(String str) {
        this._permissions = null;
        this._rawListing = str;
        this._type = 3;
        this._size = -1;
        this._user = "";
        this._group = "";
    }

    private String permissionToString(int i) {
        StringBuilder sb = new StringBuilder();
        if (hasPermission(i, 0)) {
            sb.append('r');
        } else {
            sb.append('-');
        }
        if (hasPermission(i, 1)) {
            sb.append('w');
        } else {
            sb.append('-');
        }
        if (hasPermission(i, 2)) {
            sb.append('x');
        } else {
            sb.append('-');
        }
        return sb.toString();
    }

    public String toFormattedString(String str) {
        if (!isValid()) {
            return "[Invalid: could not parse file entry]";
        }
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        sb.append(formatType());
        sb.append(permissionToString(0));
        sb.append(permissionToString(1));
        sb.append(permissionToString(2));
        formatter.format(" %4d", Integer.valueOf(getHardLinkCount()));
        formatter.format(" %-8s %-8s", getUser(), getGroup());
        formatter.format(" %8d", Long.valueOf(getSize()));
        Calendar timestamp = getTimestamp();
        if (timestamp != null) {
            if (str != null) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                if (!timeZone.equals(timestamp.getTimeZone())) {
                    Date time = timestamp.getTime();
                    Calendar instance = Calendar.getInstance(timeZone);
                    instance.setTime(time);
                    timestamp = instance;
                }
            }
            formatter.format(" %1$tY-%1$tm-%1$td", timestamp);
            if (timestamp.isSet(11)) {
                formatter.format(" %1$tH", timestamp);
                if (timestamp.isSet(12)) {
                    formatter.format(":%1$tM", timestamp);
                    if (timestamp.isSet(13)) {
                        formatter.format(":%1$tS", timestamp);
                        if (timestamp.isSet(14)) {
                            formatter.format(".%1$tL", timestamp);
                        }
                    }
                }
                formatter.format(" %1$tZ", timestamp);
            }
        }
        sb.append(' ');
        sb.append(getName());
        formatter.close();
        return sb.toString();
    }

    public boolean hasPermission(int i, int i2) {
        boolean[][] zArr = this._permissions;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    public void setPermission(int i, int i2, boolean z) {
        this._permissions[i][i2] = z;
    }
}
