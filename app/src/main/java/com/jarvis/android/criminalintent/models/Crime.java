package com.jarvis.android.criminalintent.models;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Anil on 8/11/17.
 */

public class Crime {
    private String mTitle;

    private UUID mId;

    private Date mDate;
    private String mSuspect;
    private boolean mSolved;
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getFileName () {
        return "IMG" + getId().toString() + ".jpg";
    }
}
